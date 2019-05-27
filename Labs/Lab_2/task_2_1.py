import argparse
from antlr4 import *
from testLexer import testLexer
from testListener import testListener
from testParser import testParser
from antlr4.tree.Trees import Trees

def get_token_type(token):
    if token.type == testLexer.IMMEDIATE:
        return "IMMEDIATE"
    elif token.type == testLexer.REG:
        return "REG"
    elif token.type == testLexer.COMMAND:
        return "COMMAND"
    elif token.type == testLexer.MEMORY:
        return "MEMORY"
    else:
        return "ERROR UNKNOWN TOKEN"

def main():
    #with open('task_2_1_result.txt','w+')
    with open(args.file, "r") as file:
        lines = file.read()
    input_stream = InputStream(lines)
    lexer = testLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = testParser(token_stream)

    token = lexer.nextToken()

    while not token.type == Token.EOF:
        token_type =get_token_type(token)
        token = token.text;
        print(token_type, token)
        token = lexer.nextToken()


if __name__ == '__main__':
    parser = argparse.ArgumentParser(add_help=True, description='Sample Commandline')

    parser.add_argument('--file', action="store", help="path of file to take as input", nargs="?", metavar="file")

    args = parser.parse_args()

    print(args.file)

    main()
