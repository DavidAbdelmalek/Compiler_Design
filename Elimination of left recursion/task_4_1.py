import argparse


def eliminate_immidiate(rule, rules):
    alpha = []
    beta = []
    rule_alpha = ' ' + rule + '\''
    new_edition = {}
    for gram in rules[rule]:
        gram_splitted = gram.split(" ")
        if(gram_splitted[0] == rule):
            del gram_splitted[0]
            con = ' '.join(gram_splitted)
            alpha.append(con)
        else:
            beta.append(gram)

    if(len(alpha) > 0):
        beta = [s + rule_alpha for s in beta]
        alpha = [s + rule_alpha for s in alpha]
        alpha.append('epsilon')
        new_edition[rule] = beta
        new_edition[rule_alpha.strip()] = alpha
    else:
        new_edition[rule] = rules[rule]
    return new_edition


def subsitiute(curr_def, track_rule, track_def):
    curr_def = (curr_def.replace(track_rule, '', 1)).strip()
    out_def = []
    for token in track_def:
        out_def.append(token + ' ' + curr_def)

    return (out_def)


def eliminate_indirct(grammer, n):
    
    keys = list(grammer.keys())
    out_rules = grammer.copy()
    i = 0
    for i in range(0, n):
        curr_rule = keys[i]
        for j in range(0, i):
            track_rule = keys[j]
            track_def = list(out_rules[track_rule])
            k = 0
            while (k < len(out_rules[curr_rule])):
                curr_def = list(out_rules[curr_rule])
                tokens = list(out_rules[curr_rule])[k]
                tokens_splitted = tokens.split(" ")
                token = tokens_splitted[0]
                if(token == track_rule):
                    subs_result = (subsitiute(
                        curr_def[k], track_rule, track_def))
                    del out_rules[curr_rule][k]
                    out_rules[curr_rule][k:k] = subs_result
                else:
                    out_rules[curr_rule][k] = tokens
                    k += 1
        new_edition = eliminate_immidiate(curr_rule, out_rules)
        out_rules = {**out_rules, **new_edition}

    return out_rules


if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        add_help=True, description='Sample Commandline')

    parser.add_argument('--file', action="store",
                        help="path of file to take as input", nargs="?", metavar="file")

    args = parser.parse_args()

    input_file = open(args.file, 'r')
    lines = input_file.read()
    input_file.close()
    tokens = lines.strip().split("\n")

    grammer = {}

    # Split the input files into key and value where each determine a rule.
    for token in tokens:
        token_splitted = token.split(" : ")
        items = token_splitted[1].split(" | ")
        grammer[token_splitted[0]] = items
    n = len(grammer.keys())

    final_grammer = eliminate_indirct(grammer, n)
    final_text = ""

    original_rules = grammer.copy()
    for rule in original_rules:
        dash = 0
        while(True):
            out_rule = rule + ("\'"*dash)
            if(not(out_rule in final_grammer)):
                break
            gram = final_grammer[out_rule]
            final_text = final_text + out_rule + \
                " : " + ' | '.join(gram) + "\n"
            dash += 1

    # print(final_text[:-1])
    output = open('task_4_1_result.txt', 'w')
    output.write(final_text[:-1])
    output.close()
