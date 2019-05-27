import argparse


def left_factoring2(rules, n):
    counter = 0
    max_alpha = {}
    for key in rules:
        max_alpha[key] = 1

    while(True):
        if(counter == n):
            break
        keys = list(rules)
        rule = keys[counter]
        rule_without_stricks = rule.split('\'')[0]
        gram = rules[rule]
        rec = {}
        not_rec = {}
        not_rec[rule] = []
        len_grammeer = len(gram)

        visited = [False] * len_grammeer
        alpha = max_alpha[rule_without_stricks]
        for i in range(len_grammeer):
            if(visited[i]):
                continue
            visited[i] = True
            comp1 = gram[i].split(" ")

            flag = False
            for j in range(i + 1, len(gram)):
                comp2 = gram[j].split(" ")
                if(comp1[0] == comp2[0]):
                    if(not(flag)):
                        n_rule = rule_without_stricks + "\'" * alpha
                        alpha += 1
                        rec[n_rule] = []
                        if(len(comp1[1:]) > 0):
                            rec[n_rule].append(' '.join(comp1[1:]))
                        else:
                            rec[n_rule].append(' '.join(['epsilon']))
                        not_rec[rule].append(comp1[0] + " " + n_rule)
                    visited[j] = True
                    flag = True
                    if(len(comp2[1:]) == 0):
                        rec[n_rule].append(' '.join(["epsilon"]))
                    else:
                        rec[n_rule].append(' '.join(comp2[1:]))
            if(not(flag)):
                not_rec[rule].append(gram[i])

        rules = {**rules, **not_rec, **rec}
        n = len(rules)

        max_alpha[rule_without_stricks] = alpha

        counter += 1
    return rules


if __name__ == '__main__':
    parser = argparse.ArgumentParser(
        add_help=True, description='Sample Commandline')

    parser.add_argument('--file', action="store",
                        help="path of file to take as input", nargs="?", metavar="file")

    args = parser.parse_args()

    input_file = open(args.file, 'r')
    lines = input_file.read()
    input_file.close()
    tokens = (lines.strip()).split("\n")

    rules = {}

    # Split the input files into key and value where each determine a rule.
    for token in tokens:
        token_splitted = token.split(" : ")
        items = token_splitted[1].split(" | ")
        rules[token_splitted[0]] = items

    n = len(rules.keys())

    original_rules = rules.copy()
    rules_factored = left_factoring2(rules, n)

    final_text = ""
    for rule in original_rules:
        dash = 0
        while(True):
            out_rule = rule + ("\'"*dash)
            if(not(out_rule in rules_factored)):
                break
            gram = rules_factored[out_rule]
            final_text = final_text + out_rule + \
                " : " + ' | '.join(gram) + "\n"
            dash += 1

    output = open('task_4_2_result.txt', 'w')
    output.write(final_text[:-1])
    output.close()
