import argparse
import re


class Stack:

    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def peek(self):
        return self.items[len(self.items) - 1]

    def size(self):
        return len(self.items)


def initiate_state(states, alphabet):
    neural = {}
    states_trans = {}
    for state in states:
        neural = {}
        for c in alphabet:
            neural[c] = None
        states_trans[state] = neural
    return states_trans


def fallback(input_string, R, L):
    states_stack = Stack()
    states_stack.push(start_state)

    # Parse inputs to stack
    for index in range(R, L):
        c = input_string[index]
        curr_state = states_stack.peek()
        f = states_trans[curr_state][c]
        states_stack.push(f)

    return states_stack


def print_state_action(state, string_out):
    exp = state_expression_dict[state]
    act = expressions_dict[exp]
    s = string_out + ", " + act + "\n"
    return s


if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        add_help=True, description='Sample Commandline')

    parser.add_argument('--dfa-file', action="store",
                        help="path of file to take as input to construct DFA", nargs="?", metavar="dfa_file")
    parser.add_argument('--input-file', action="store",
                        help="path of file to take as input to test strings in on DFA", nargs="?", metavar="input_file")

    args = parser.parse_args()

    dfa_file = open(args.dfa_file, 'r')
    lines = dfa_file.read()
    dfa_file.close()

    ########################## Parse DFA ##########################################
    states = (lines.split("\n")[0]).split(", ")
    alphabet = (lines.split("\n")[1]).split(", ")
    start_state = lines.split("\n")[2]
    end_states = lines.split("\n")[3].split(", ")
    transitions = lines.split("\n")[4]
    state_expression = lines.split("\n")[5]
    expressions = lines.split("\n")[6]

    # states to expression dictonary.
    state_expression_dict = {}
    for match in re.finditer('\((.*?)\)', state_expression):
        s = match.group(0)
        s = s[1:-1]
        splitted = s.split(", ")
        state = splitted[0]
        exp = splitted[1][1:-1]
        state_expression_dict[state] = exp

    # expression to action dictonary.
    expressions_dict = {}
    for match in re.finditer('\((.*?)\)', expressions):
        s = match.group(0)
        s = s[1:-1]
        splitted = s.split(", ")
        exp = splitted[0][1:-1]
        action = splitted[1]
        expressions_dict[exp] = action

    # Initiate states in dictonery with empty set of transitions
    states_trans = initiate_state(states, alphabet)

    # Loop over transitions to extract them and put in states_trans
    for match in re.finditer('\((.*?)\)', transitions):
        s = match.group(0)

        s = s[1:-1]
        splitted = s.split(", ")

        state_from = splitted[0]
        symbol = splitted[1]
        state_to = splitted[2]

        # Add transition to state's from list
        states_trans[state_from][symbol] = state_to

    ########################## Parse Input ##########################################

    input_file = open(args.input_file, 'r')
    lines = input_file.read()
    input_file.close()

    splitted_input = list(lines)
    len_input = len(splitted_input)

    ########################## Code #################################################
    R = 0
    L = len(splitted_input)
    states_stack = fallback(splitted_input, R, L)
    result = ""
    if(states_stack.peek() in end_states):
        peek = states_stack.peek()
        result += print_state_action(peek, lines[R:L])
    else:
        L = len_input
        while states_stack.size() > 0:
            curr = states_stack.pop()
            L -= 1
            if(curr in end_states):
                result += print_state_action(curr, lines[R:L + 1])
                R = L + 1
                L = len_input

                states_stack = fallback(splitted_input, R, L)

        if(len(result) == 0):
            result += lines + ", " + expressions_dict["DEFAULT"] + "\n"

    print(result[:-1])
    out_file = open("task_3_1_result.txt", "w+")
    out_file.write(result)
    out_file.close()
