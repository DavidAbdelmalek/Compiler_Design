import argparse
import re


class Trans:
    """
        Creating a transition class to keep track of transitions
        in NFA and defined as tuple of 3 items to depict transitions (state
        from, symbol of tranistion path, state to)
    """

    def __init__ (self, state_from, state_to, symbol):
        self.state_from = state_from
        self.symbol = symbol
        self.state_to = state_to


def initiate_state_trans(states):
    states_trans = {}

    for state in states:
        states_trans[state] = []

    return states_trans


def get_end_states(states, end_state_nfa):
    end_state_out = []
    for state in states:
        for state_in in state:
            if(state_in in end_state_nfa):
                end_state_out.append(chr(states.index(state) + 65))

    return end_state_out


def print_trans(state, states_trans):
    # print(state)
    transitions_in_states = states_trans[state]
    for trans in transitions_in_states:
        if(trans.symbol == ' '):
            symbol = "SPACE"
        else:
            symbol = trans.symbol
        print(trans.state_to, symbol)


def e_closure(all_states, state, char):
    out = []
    transitions = all_states[state]

    for trans in transitions:
        if(trans.symbol == char and not(trans.state_to in out)):
            out.append(trans.state_to)

    char = epsilon
    for state in out:
        transitions = all_states[state]
        for trans in transitions:
            if(trans.symbol == char and not(trans.state_to in out)):
                out.append(trans.state_to)

    return out


if __name__ == '__main__' :
    parser = argparse.ArgumentParser(add_help=True, description='Sample Commandline')

    parser.add_argument('--file', action="store", help="path of file to take as input", nargs="?",
                        metavar="file")

    args = parser.parse_args()
    input_file = open(args.file, 'r')
    lines = input_file.read()
    input_file.close()

    epsilon = ' '

    # Take input.
    states = (lines.split("\n")[0]).split(",")
    alphabet = (lines.split("\n")[1]).split(",")
    start_state = lines.split("\n")[2]
    end_state = lines.split("\n")[3].split(",")
    transitions = lines.split("\n")[4]

    # Initiate states in dictonery with empty set of transitions
    states_trans = initiate_state_trans(states)

    # Loop over transitions to extract them and put in states_trans
    for match in re.finditer('\((.*?)\)', transitions):
        s = match.group(0)
        state_from = ""
        state_to = ""
        symbol = ""
        state_from = s[1:3]
        if(len(s) == 10):
            symbol = s[4]
            state_to = s[7:9]
        else:
            symbol = s[5]
            state_to = s[8:10]

        list_trans = states_trans[state_from]
        list_trans.append(Trans(state_from, state_to, symbol))
        states_trans[state_from] = list_trans

# We apply the fact that any state has an epsilon closure on it self
    for state in states:
        list_trans = states_trans[state]
        list_trans.append(Trans(state, state, epsilon))
        states_trans[state] = list_trans

    states_out = []
    states_alpha = []
    start = e_closure(states_trans, start_state, epsilon)
    states_out.append(start)

    out_transitions = []
    for state_from in states_out:
        for char in alphabet:
            state_to = []
            for state in state_from:
                if(char == epsilon):
                    break
                state_to.extend(e_closure(states_trans, state, char))
            if(not(char == epsilon)):
                out_transitions.append(Trans(state_from, state_to, char))
                if(not(state_to in states_out)):
                    states_out.append(state_to)

    count = 0
    for i in range(len(states_out)):
        if(len(states_out[i]) == 0):
            states_alpha.append("DEAD")
        else:
            states_alpha.append(chr(count + 65))
            count += 1

########################### DISPLAYING ########################################
    res = open("task_2_2_result.txt", "w+")

    # printing states
    res.write(('%s' % ', '.join(map(str, states_alpha))) + "\n")

    # printing alphabet
    alpha_out = []
    for char in alphabet:
        if(not(char == epsilon)):
            alpha_out.append(char)

    res.write('%s' % ','.join(map(str, alpha_out)) + "\n")

    # Printing start states.
    res.write(states_alpha[0] + "\n")

    # End states in list
    end_states_final = get_end_states(states_out, end_state)
    res.write(('%s' % ', '.join(map(str, end_states_final))) + "\n")

    # print transitions out
    trans_string = ""
    for x in out_transitions:
        stat_in = states_alpha[states_out.index(x.state_from)]
        stat_in2 = states_alpha[states_out.index(x.state_to)]
        f = (stat_in, x.symbol, stat_in2)
        trans_string = trans_string + ("(" + ('%s' % ', '.join(map(str, f))) + "), ")

    res.write((trans_string[:-2] + "\n"))
