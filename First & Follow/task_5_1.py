import argparse


def check_first_epsilon(count, last, first, partions):
    for token in partions:
        if(not ('epsilon'in first[token])):
            return False, token
        count += 1
        if(count >= last):
            return True, token


def compute_first(alphabet, grammer, V):
    first = {}
    for alpha in alphabet:
        first[alpha] = set()
        first[alpha].add(alpha)

    for key in V:
        first[key] = set()

    change = True
    while(change):
        change = False
        for key in V:
            partions = grammer[key]
            contains = True
            if(change):
                break
            for partion in partions:
                tokens = partion.split(" ")
                contains, at = check_first_epsilon(
                    0, len(tokens), first, tokens)
                if(contains == True):
                    if(not 'epsilon' in first[key]):
                        first[key].add('epsilon')
                        change = True
                        break

                k = len(tokens)
                for i in range(k):
                    out, t = check_first_epsilon(
                        count=0, last=i, first=first, partions=tokens)
                    if(i == 0 or (out)):
                        token = tokens[i]
                        temp = first[token] - {'epsilon'}
                        if(not (temp <= first[key])):
                            first[key].update(temp)
                            change = True

    return first


def get_index(partion, key):
    index = 0
    for part in partion:
        if(part == key):
            return index
        index += 1
    return -1


def compute_follow(start_state, alphabet, V, first, grammer):
    follow = {}
    for A in V:
        follow[A] = set()
    follow[start_state].update('$')
    change = True
    while(change):
        change = False
        for B in V:
            for A in grammer.keys():
                partions = grammer[A]
                for partion in partions:
                    tokens = partion.split(" ")
                    n = len(tokens)
                    if(B in tokens):
                        index = tokens.index(B)
                    else:
                        continue
                    while(index <= n-1):
                        if(index < n-1):
                            index += 1
                            Beta = tokens[index]
                            contains_epsilon = 'epsilon' in first[Beta]

                            if(not((first[Beta] - {'epsilon'}) <= follow[B])):
                                follow[B].update(first[Beta] - {'epsilon'})
                                change = True
                            if(not(contains_epsilon)):
                                break

                        if(index == n-1 and(not(follow[A] <= follow[B]))):
                            follow[B].update(follow[A])
                            change = True
                        if(index == n-1):
                            break

    return follow


if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        add_help=True, description='Sample Commandline')

    parser.add_argument('--file', action="store",
                        help="path of file to take as input", nargs="?", metavar="file")

    args = parser.parse_args()

    input_file = open(args.file, 'r')
    lines = input_file.read()
    input_file.close()
    tokens = lines.strip()
    tokens = tokens.split("\n")

    start_state = tokens[0][0]

    grammer = {}
    alphabet = set()
    V = []
    for token in tokens:
        token_splitted = token.split(" : ")

        V.append(token_splitted[0])

        items = token_splitted[1].split(" | ")
        grammer[token_splitted[0]] = items
    for vin in V:
        items = grammer[vin]
        for item in items:
            item_splitted = item.split(" ")
            for part in item_splitted:
                if(not (part in V)):
                    alphabet.add(part)

    n = len(grammer.keys())

    first = compute_first(alphabet, grammer, V)
    follow = compute_follow(start_state, alphabet, V, first, grammer)

    out_str = ""

    for key in first.keys():
        if(not key in alphabet):
            out_str += str(key) + " : " + \
                ' '.join(first[key]) + " : " + ' '.join(follow[key]) + "\n"

    output_file = 'task_5_1_result.txt'
    ouptut_file = open("./" + output_file, "w+")
    ouptut_file.write((out_str[:-1]))
