import argparse
from antlr4 import *
from task_2_1Lexer import task_2_1Lexer
from task_2_1Listener import task_2_1Listener
from task_2_1Parser import task_2_1Parser
from antlr4.tree.Trees import Trees

def get_token_type(token):
    if token.type == task_2_1Lexer.IMMEDIATE:
        return "IMMEDIATE"
    elif token.type == task_2_1Lexer.REG:
        return "REG"
    elif token.type == task_2_1Lexer.COMMAND:
        return "COMMAND"
    elif token.type == task_2_1Lexer.MEMORY:
        return "MEMORY"
    else:
        return "ERROR UNKNOWN TOKEN"

def main():

    with open(args.file, "r") as file:
        lines = file.read()
    input_stream = InputStream(lines)
    lexer = task_2_1Lexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = task_2_1Parser(token_stream)

    token = lexer.nextToken()
    f = open("task_2_1_result.txt","w")
    while not token.type == Token.EOF:
        token_type =get_token_type(token)
        token = token.text
        f.write(token_type+" "+ token)
        token = lexer.nextToken()


if __name__ == '__main__':
    parser = argparse.ArgumentParser(add_help=True, description='Sample Commandline')

    parser.add_argument('--file', action="store", help="path of file to take as input", nargs="?", metavar="file")

    args = parser.parse_args()

    print(args.file)

    main()