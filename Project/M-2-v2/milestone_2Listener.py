# Generated from milestone_2.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .milestone_2Parser import milestone_2Parser
else:
    from milestone_2Parser import milestone_2Parser

# This class defines a complete listener for a parse tree produced by milestone_2Parser.
class milestone_2Listener(ParseTreeListener):

    # Enter a parse tree produced by milestone_2Parser#start.
    def enterStart(self, ctx:milestone_2Parser.StartContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#start.
    def exitStart(self, ctx:milestone_2Parser.StartContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#comments.
    def enterComments(self, ctx:milestone_2Parser.CommentsContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#comments.
    def exitComments(self, ctx:milestone_2Parser.CommentsContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#comma.
    def enterComma(self, ctx:milestone_2Parser.CommaContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#comma.
    def exitComma(self, ctx:milestone_2Parser.CommaContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#semicolon.
    def enterSemicolon(self, ctx:milestone_2Parser.SemicolonContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#semicolon.
    def exitSemicolon(self, ctx:milestone_2Parser.SemicolonContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#colcom.
    def enterColcom(self, ctx:milestone_2Parser.ColcomContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#colcom.
    def exitColcom(self, ctx:milestone_2Parser.ColcomContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#post_operators.
    def enterPost_operators(self, ctx:milestone_2Parser.Post_operatorsContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#post_operators.
    def exitPost_operators(self, ctx:milestone_2Parser.Post_operatorsContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#two_operator.
    def enterTwo_operator(self, ctx:milestone_2Parser.Two_operatorContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#two_operator.
    def exitTwo_operator(self, ctx:milestone_2Parser.Two_operatorContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#cond_operator.
    def enterCond_operator(self, ctx:milestone_2Parser.Cond_operatorContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#cond_operator.
    def exitCond_operator(self, ctx:milestone_2Parser.Cond_operatorContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#assign_operator.
    def enterAssign_operator(self, ctx:milestone_2Parser.Assign_operatorContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#assign_operator.
    def exitAssign_operator(self, ctx:milestone_2Parser.Assign_operatorContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#operands.
    def enterOperands(self, ctx:milestone_2Parser.OperandsContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#operands.
    def exitOperands(self, ctx:milestone_2Parser.OperandsContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#priotize_operand.
    def enterPriotize_operand(self, ctx:milestone_2Parser.Priotize_operandContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#priotize_operand.
    def exitPriotize_operand(self, ctx:milestone_2Parser.Priotize_operandContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#operand.
    def enterOperand(self, ctx:milestone_2Parser.OperandContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#operand.
    def exitOperand(self, ctx:milestone_2Parser.OperandContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#predifined_method.
    def enterPredifined_method(self, ctx:milestone_2Parser.Predifined_methodContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#predifined_method.
    def exitPredifined_method(self, ctx:milestone_2Parser.Predifined_methodContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#number.
    def enterNumber(self, ctx:milestone_2Parser.NumberContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#number.
    def exitNumber(self, ctx:milestone_2Parser.NumberContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#var_type.
    def enterVar_type(self, ctx:milestone_2Parser.Var_typeContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#var_type.
    def exitVar_type(self, ctx:milestone_2Parser.Var_typeContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#arr_item.
    def enterArr_item(self, ctx:milestone_2Parser.Arr_itemContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#arr_item.
    def exitArr_item(self, ctx:milestone_2Parser.Arr_itemContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#arrayStmt.
    def enterArrayStmt(self, ctx:milestone_2Parser.ArrayStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#arrayStmt.
    def exitArrayStmt(self, ctx:milestone_2Parser.ArrayStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#pointer_assign.
    def enterPointer_assign(self, ctx:milestone_2Parser.Pointer_assignContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#pointer_assign.
    def exitPointer_assign(self, ctx:milestone_2Parser.Pointer_assignContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#assign_var_value.
    def enterAssign_var_value(self, ctx:milestone_2Parser.Assign_var_valueContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#assign_var_value.
    def exitAssign_var_value(self, ctx:milestone_2Parser.Assign_var_valueContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#var_ident.
    def enterVar_ident(self, ctx:milestone_2Parser.Var_identContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#var_ident.
    def exitVar_ident(self, ctx:milestone_2Parser.Var_identContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#section_variable.
    def enterSection_variable(self, ctx:milestone_2Parser.Section_variableContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#section_variable.
    def exitSection_variable(self, ctx:milestone_2Parser.Section_variableContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#assertStmt.
    def enterAssertStmt(self, ctx:milestone_2Parser.AssertStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#assertStmt.
    def exitAssertStmt(self, ctx:milestone_2Parser.AssertStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#compare_two_operands.
    def enterCompare_two_operands(self, ctx:milestone_2Parser.Compare_two_operandsContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#compare_two_operands.
    def exitCompare_two_operands(self, ctx:milestone_2Parser.Compare_two_operandsContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#post_operand_func.
    def enterPost_operand_func(self, ctx:milestone_2Parser.Post_operand_funcContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#post_operand_func.
    def exitPost_operand_func(self, ctx:milestone_2Parser.Post_operand_funcContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#method.
    def enterMethod(self, ctx:milestone_2Parser.MethodContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#method.
    def exitMethod(self, ctx:milestone_2Parser.MethodContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#prac_body.
    def enterPrac_body(self, ctx:milestone_2Parser.Prac_bodyContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#prac_body.
    def exitPrac_body(self, ctx:milestone_2Parser.Prac_bodyContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#call_func.
    def enterCall_func(self, ctx:milestone_2Parser.Call_funcContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#call_func.
    def exitCall_func(self, ctx:milestone_2Parser.Call_funcContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#condition.
    def enterCondition(self, ctx:milestone_2Parser.ConditionContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#condition.
    def exitCondition(self, ctx:milestone_2Parser.ConditionContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#action_for.
    def enterAction_for(self, ctx:milestone_2Parser.Action_forContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#action_for.
    def exitAction_for(self, ctx:milestone_2Parser.Action_forContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#action.
    def enterAction(self, ctx:milestone_2Parser.ActionContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#action.
    def exitAction(self, ctx:milestone_2Parser.ActionContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#breakStmt.
    def enterBreakStmt(self, ctx:milestone_2Parser.BreakStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#breakStmt.
    def exitBreakStmt(self, ctx:milestone_2Parser.BreakStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#return_body.
    def enterReturn_body(self, ctx:milestone_2Parser.Return_bodyContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#return_body.
    def exitReturn_body(self, ctx:milestone_2Parser.Return_bodyContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#returnStmt.
    def enterReturnStmt(self, ctx:milestone_2Parser.ReturnStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#returnStmt.
    def exitReturnStmt(self, ctx:milestone_2Parser.ReturnStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#ofStmt.
    def enterOfStmt(self, ctx:milestone_2Parser.OfStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#ofStmt.
    def exitOfStmt(self, ctx:milestone_2Parser.OfStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#comparStmt.
    def enterComparStmt(self, ctx:milestone_2Parser.ComparStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#comparStmt.
    def exitComparStmt(self, ctx:milestone_2Parser.ComparStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#comparStmt_proc.
    def enterComparStmt_proc(self, ctx:milestone_2Parser.ComparStmt_procContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#comparStmt_proc.
    def exitComparStmt_proc(self, ctx:milestone_2Parser.ComparStmt_procContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#elifStmt.
    def enterElifStmt(self, ctx:milestone_2Parser.ElifStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#elifStmt.
    def exitElifStmt(self, ctx:milestone_2Parser.ElifStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#elseStmt.
    def enterElseStmt(self, ctx:milestone_2Parser.ElseStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#elseStmt.
    def exitElseStmt(self, ctx:milestone_2Parser.ElseStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#array_index.
    def enterArray_index(self, ctx:milestone_2Parser.Array_indexContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#array_index.
    def exitArray_index(self, ctx:milestone_2Parser.Array_indexContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#procHelperStmt.
    def enterProcHelperStmt(self, ctx:milestone_2Parser.ProcHelperStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#procHelperStmt.
    def exitProcHelperStmt(self, ctx:milestone_2Parser.ProcHelperStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#blockStmts.
    def enterBlockStmts(self, ctx:milestone_2Parser.BlockStmtsContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#blockStmts.
    def exitBlockStmts(self, ctx:milestone_2Parser.BlockStmtsContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#caseStmt.
    def enterCaseStmt(self, ctx:milestone_2Parser.CaseStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#caseStmt.
    def exitCaseStmt(self, ctx:milestone_2Parser.CaseStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#boolStmt.
    def enterBoolStmt(self, ctx:milestone_2Parser.BoolStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#boolStmt.
    def exitBoolStmt(self, ctx:milestone_2Parser.BoolStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#ifStmt.
    def enterIfStmt(self, ctx:milestone_2Parser.IfStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#ifStmt.
    def exitIfStmt(self, ctx:milestone_2Parser.IfStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#forStmt.
    def enterForStmt(self, ctx:milestone_2Parser.ForStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#forStmt.
    def exitForStmt(self, ctx:milestone_2Parser.ForStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#whileStmt.
    def enterWhileStmt(self, ctx:milestone_2Parser.WhileStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#whileStmt.
    def exitWhileStmt(self, ctx:milestone_2Parser.WhileStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#whenStmt.
    def enterWhenStmt(self, ctx:milestone_2Parser.WhenStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#whenStmt.
    def exitWhenStmt(self, ctx:milestone_2Parser.WhenStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#procStmt.
    def enterProcStmt(self, ctx:milestone_2Parser.ProcStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#procStmt.
    def exitProcStmt(self, ctx:milestone_2Parser.ProcStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#blockStmt.
    def enterBlockStmt(self, ctx:milestone_2Parser.BlockStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#blockStmt.
    def exitBlockStmt(self, ctx:milestone_2Parser.BlockStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#objectStmt.
    def enterObjectStmt(self, ctx:milestone_2Parser.ObjectStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#objectStmt.
    def exitObjectStmt(self, ctx:milestone_2Parser.ObjectStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#macroStmt.
    def enterMacroStmt(self, ctx:milestone_2Parser.MacroStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#macroStmt.
    def exitMacroStmt(self, ctx:milestone_2Parser.MacroStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#templateStmt.
    def enterTemplateStmt(self, ctx:milestone_2Parser.TemplateStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#templateStmt.
    def exitTemplateStmt(self, ctx:milestone_2Parser.TemplateStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#string_type.
    def enterString_type(self, ctx:milestone_2Parser.String_typeContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#string_type.
    def exitString_type(self, ctx:milestone_2Parser.String_typeContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#var_print.
    def enterVar_print(self, ctx:milestone_2Parser.Var_printContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#var_print.
    def exitVar_print(self, ctx:milestone_2Parser.Var_printContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#string.
    def enterString(self, ctx:milestone_2Parser.StringContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#string.
    def exitString(self, ctx:milestone_2Parser.StringContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#print_with_condition.
    def enterPrint_with_condition(self, ctx:milestone_2Parser.Print_with_conditionContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#print_with_condition.
    def exitPrint_with_condition(self, ctx:milestone_2Parser.Print_with_conditionContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#print_statement.
    def enterPrint_statement(self, ctx:milestone_2Parser.Print_statementContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#print_statement.
    def exitPrint_statement(self, ctx:milestone_2Parser.Print_statementContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#echoStmt.
    def enterEchoStmt(self, ctx:milestone_2Parser.EchoStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#echoStmt.
    def exitEchoStmt(self, ctx:milestone_2Parser.EchoStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#importStmt.
    def enterImportStmt(self, ctx:milestone_2Parser.ImportStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#importStmt.
    def exitImportStmt(self, ctx:milestone_2Parser.ImportStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#fromStmt.
    def enterFromStmt(self, ctx:milestone_2Parser.FromStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#fromStmt.
    def exitFromStmt(self, ctx:milestone_2Parser.FromStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#vars_types.
    def enterVars_types(self, ctx:milestone_2Parser.Vars_typesContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#vars_types.
    def exitVars_types(self, ctx:milestone_2Parser.Vars_typesContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#complexOrSimpleStmt.
    def enterComplexOrSimpleStmt(self, ctx:milestone_2Parser.ComplexOrSimpleStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#complexOrSimpleStmt.
    def exitComplexOrSimpleStmt(self, ctx:milestone_2Parser.ComplexOrSimpleStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#simpleStmt.
    def enterSimpleStmt(self, ctx:milestone_2Parser.SimpleStmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#simpleStmt.
    def exitSimpleStmt(self, ctx:milestone_2Parser.SimpleStmtContext):
        pass


    # Enter a parse tree produced by milestone_2Parser#stmt.
    def enterStmt(self, ctx:milestone_2Parser.StmtContext):
        pass

    # Exit a parse tree produced by milestone_2Parser#stmt.
    def exitStmt(self, ctx:milestone_2Parser.StmtContext):
        pass


