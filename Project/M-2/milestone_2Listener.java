// Generated from milestone_2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link milestone_2Parser}.
 */
public interface milestone_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(milestone_2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(milestone_2Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(milestone_2Parser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(milestone_2Parser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(milestone_2Parser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(milestone_2Parser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#semicolon}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(milestone_2Parser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#semicolon}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(milestone_2Parser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#colon}.
	 * @param ctx the parse tree
	 */
	void enterColon(milestone_2Parser.ColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#colon}.
	 * @param ctx the parse tree
	 */
	void exitColon(milestone_2Parser.ColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#colcom}.
	 * @param ctx the parse tree
	 */
	void enterColcom(milestone_2Parser.ColcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#colcom}.
	 * @param ctx the parse tree
	 */
	void exitColcom(milestone_2Parser.ColcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(milestone_2Parser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(milestone_2Parser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(milestone_2Parser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(milestone_2Parser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#optInd}.
	 * @param ctx the parse tree
	 */
	void enterOptInd(milestone_2Parser.OptIndContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#optInd}.
	 * @param ctx the parse tree
	 */
	void exitOptInd(milestone_2Parser.OptIndContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#optPar}.
	 * @param ctx the parse tree
	 */
	void enterOptPar(milestone_2Parser.OptParContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#optPar}.
	 * @param ctx the parse tree
	 */
	void exitOptPar(milestone_2Parser.OptParContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(milestone_2Parser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(milestone_2Parser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#arrowExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrowExpr(milestone_2Parser.ArrowExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#arrowExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrowExpr(milestone_2Parser.ArrowExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(milestone_2Parser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(milestone_2Parser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(milestone_2Parser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(milestone_2Parser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(milestone_2Parser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(milestone_2Parser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#cmpExpr}.
	 * @param ctx the parse tree
	 */
	void enterCmpExpr(milestone_2Parser.CmpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#cmpExpr}.
	 * @param ctx the parse tree
	 */
	void exitCmpExpr(milestone_2Parser.CmpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void enterSliceExpr(milestone_2Parser.SliceExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#sliceExpr}.
	 * @param ctx the parse tree
	 */
	void exitSliceExpr(milestone_2Parser.SliceExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#ampExpr}.
	 * @param ctx the parse tree
	 */
	void enterAmpExpr(milestone_2Parser.AmpExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#ampExpr}.
	 * @param ctx the parse tree
	 */
	void exitAmpExpr(milestone_2Parser.AmpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(milestone_2Parser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#plusExpr}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(milestone_2Parser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(milestone_2Parser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(milestone_2Parser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#dollarExpr}.
	 * @param ctx the parse tree
	 */
	void enterDollarExpr(milestone_2Parser.DollarExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#dollarExpr}.
	 * @param ctx the parse tree
	 */
	void exitDollarExpr(milestone_2Parser.DollarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(milestone_2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(milestone_2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(milestone_2Parser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(milestone_2Parser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#exprColonEqExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprColonEqExpr(milestone_2Parser.ExprColonEqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#exprColonEqExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprColonEqExpr(milestone_2Parser.ExprColonEqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(milestone_2Parser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(milestone_2Parser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#exprColonEqExprList}.
	 * @param ctx the parse tree
	 */
	void enterExprColonEqExprList(milestone_2Parser.ExprColonEqExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#exprColonEqExprList}.
	 * @param ctx the parse tree
	 */
	void exitExprColonEqExprList(milestone_2Parser.ExprColonEqExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#dotExpr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(milestone_2Parser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#dotExpr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(milestone_2Parser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#explicitGenericInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInstantiation(milestone_2Parser.ExplicitGenericInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#explicitGenericInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInstantiation(milestone_2Parser.ExplicitGenericInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(milestone_2Parser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(milestone_2Parser.QualifiedIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#setOrTableConstr}.
	 * @param ctx the parse tree
	 */
	void enterSetOrTableConstr(milestone_2Parser.SetOrTableConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#setOrTableConstr}.
	 * @param ctx the parse tree
	 */
	void exitSetOrTableConstr(milestone_2Parser.SetOrTableConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#castExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(milestone_2Parser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#castExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(milestone_2Parser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#parKeyw}.
	 * @param ctx the parse tree
	 */
	void enterParKeyw(milestone_2Parser.ParKeywContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#parKeyw}.
	 * @param ctx the parse tree
	 */
	void exitParKeyw(milestone_2Parser.ParKeywContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#par}.
	 * @param ctx the parse tree
	 */
	void enterPar(milestone_2Parser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#par}.
	 * @param ctx the parse tree
	 */
	void exitPar(milestone_2Parser.ParContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#generalizedLit}.
	 * @param ctx the parse tree
	 */
	void enterGeneralizedLit(milestone_2Parser.GeneralizedLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#generalizedLit}.
	 * @param ctx the parse tree
	 */
	void exitGeneralizedLit(milestone_2Parser.GeneralizedLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identOrLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIdentOrLiteral(milestone_2Parser.IdentOrLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identOrLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIdentOrLiteral(milestone_2Parser.IdentOrLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#tupleConstr}.
	 * @param ctx the parse tree
	 */
	void enterTupleConstr(milestone_2Parser.TupleConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#tupleConstr}.
	 * @param ctx the parse tree
	 */
	void exitTupleConstr(milestone_2Parser.TupleConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#arrayConstr}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstr(milestone_2Parser.ArrayConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#arrayConstr}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstr(milestone_2Parser.ArrayConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySuffix(milestone_2Parser.PrimarySuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#primarySuffix}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySuffix(milestone_2Parser.PrimarySuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(milestone_2Parser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(milestone_2Parser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(milestone_2Parser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(milestone_2Parser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#whenExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhenExpr(milestone_2Parser.WhenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#whenExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhenExpr(milestone_2Parser.WhenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(milestone_2Parser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(milestone_2Parser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identVis}.
	 * @param ctx the parse tree
	 */
	void enterIdentVis(milestone_2Parser.IdentVisContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identVis}.
	 * @param ctx the parse tree
	 */
	void exitIdentVis(milestone_2Parser.IdentVisContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identVisDot}.
	 * @param ctx the parse tree
	 */
	void enterIdentVisDot(milestone_2Parser.IdentVisDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identVisDot}.
	 * @param ctx the parse tree
	 */
	void exitIdentVisDot(milestone_2Parser.IdentVisDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identWithPragma}.
	 * @param ctx the parse tree
	 */
	void enterIdentWithPragma(milestone_2Parser.IdentWithPragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identWithPragma}.
	 * @param ctx the parse tree
	 */
	void exitIdentWithPragma(milestone_2Parser.IdentWithPragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identWithPragmaDot}.
	 * @param ctx the parse tree
	 */
	void enterIdentWithPragmaDot(milestone_2Parser.IdentWithPragmaDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identWithPragmaDot}.
	 * @param ctx the parse tree
	 */
	void exitIdentWithPragmaDot(milestone_2Parser.IdentWithPragmaDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#declColonEquals}.
	 * @param ctx the parse tree
	 */
	void enterDeclColonEquals(milestone_2Parser.DeclColonEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#declColonEquals}.
	 * @param ctx the parse tree
	 */
	void exitDeclColonEquals(milestone_2Parser.DeclColonEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#identColonEquals}.
	 * @param ctx the parse tree
	 */
	void enterIdentColonEquals(milestone_2Parser.IdentColonEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#identColonEquals}.
	 * @param ctx the parse tree
	 */
	void exitIdentColonEquals(milestone_2Parser.IdentColonEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#inlTupleDecl}.
	 * @param ctx the parse tree
	 */
	void enterInlTupleDecl(milestone_2Parser.InlTupleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#inlTupleDecl}.
	 * @param ctx the parse tree
	 */
	void exitInlTupleDecl(milestone_2Parser.InlTupleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#extTupleDecl}.
	 * @param ctx the parse tree
	 */
	void enterExtTupleDecl(milestone_2Parser.ExtTupleDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#extTupleDecl}.
	 * @param ctx the parse tree
	 */
	void exitExtTupleDecl(milestone_2Parser.ExtTupleDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#tupleClass}.
	 * @param ctx the parse tree
	 */
	void enterTupleClass(milestone_2Parser.TupleClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#tupleClass}.
	 * @param ctx the parse tree
	 */
	void exitTupleClass(milestone_2Parser.TupleClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(milestone_2Parser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(milestone_2Parser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#paramListArrow}.
	 * @param ctx the parse tree
	 */
	void enterParamListArrow(milestone_2Parser.ParamListArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#paramListArrow}.
	 * @param ctx the parse tree
	 */
	void exitParamListArrow(milestone_2Parser.ParamListArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#paramListColon}.
	 * @param ctx the parse tree
	 */
	void enterParamListColon(milestone_2Parser.ParamListColonContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#paramListColon}.
	 * @param ctx the parse tree
	 */
	void exitParamListColon(milestone_2Parser.ParamListColonContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#doBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoBlock(milestone_2Parser.DoBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#doBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoBlock(milestone_2Parser.DoBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#procExpr}.
	 * @param ctx the parse tree
	 */
	void enterProcExpr(milestone_2Parser.ProcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#procExpr}.
	 * @param ctx the parse tree
	 */
	void exitProcExpr(milestone_2Parser.ProcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(milestone_2Parser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(milestone_2Parser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(milestone_2Parser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(milestone_2Parser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#forExpr}.
	 * @param ctx the parse tree
	 */
	void enterForExpr(milestone_2Parser.ForExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#forExpr}.
	 * @param ctx the parse tree
	 */
	void exitForExpr(milestone_2Parser.ForExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(milestone_2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(milestone_2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#typeKeyw}.
	 * @param ctx the parse tree
	 */
	void enterTypeKeyw(milestone_2Parser.TypeKeywContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#typeKeyw}.
	 * @param ctx the parse tree
	 */
	void exitTypeKeyw(milestone_2Parser.TypeKeywContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(milestone_2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(milestone_2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#typeDesc}.
	 * @param ctx the parse tree
	 */
	void enterTypeDesc(milestone_2Parser.TypeDescContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#typeDesc}.
	 * @param ctx the parse tree
	 */
	void exitTypeDesc(milestone_2Parser.TypeDescContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#typeDefAux}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefAux(milestone_2Parser.TypeDefAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#typeDefAux}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefAux(milestone_2Parser.TypeDefAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#postExprBlocks}.
	 * @param ctx the parse tree
	 */
	void enterPostExprBlocks(milestone_2Parser.PostExprBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#postExprBlocks}.
	 * @param ctx the parse tree
	 */
	void exitPostExprBlocks(milestone_2Parser.PostExprBlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(milestone_2Parser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(milestone_2Parser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(milestone_2Parser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(milestone_2Parser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#includeStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStmt(milestone_2Parser.IncludeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#includeStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStmt(milestone_2Parser.IncludeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#fromStmt}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(milestone_2Parser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#fromStmt}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(milestone_2Parser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(milestone_2Parser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(milestone_2Parser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmt(milestone_2Parser.RaiseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmt(milestone_2Parser.RaiseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(milestone_2Parser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(milestone_2Parser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void enterDiscardStmt(milestone_2Parser.DiscardStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#discardStmt}.
	 * @param ctx the parse tree
	 */
	void exitDiscardStmt(milestone_2Parser.DiscardStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(milestone_2Parser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(milestone_2Parser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(milestone_2Parser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(milestone_2Parser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#condStmt}.
	 * @param ctx the parse tree
	 */
	void enterCondStmt(milestone_2Parser.CondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#condStmt}.
	 * @param ctx the parse tree
	 */
	void exitCondStmt(milestone_2Parser.CondStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(milestone_2Parser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(milestone_2Parser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#whenStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhenStmt(milestone_2Parser.WhenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#whenStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhenStmt(milestone_2Parser.WhenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(milestone_2Parser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(milestone_2Parser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#ofBranch}.
	 * @param ctx the parse tree
	 */
	void enterOfBranch(milestone_2Parser.OfBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#ofBranch}.
	 * @param ctx the parse tree
	 */
	void exitOfBranch(milestone_2Parser.OfBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#ofBranches}.
	 * @param ctx the parse tree
	 */
	void enterOfBranches(milestone_2Parser.OfBranchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#ofBranches}.
	 * @param ctx the parse tree
	 */
	void exitOfBranches(milestone_2Parser.OfBranchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmt(milestone_2Parser.CaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmt(milestone_2Parser.CaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(milestone_2Parser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(milestone_2Parser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTryExpr(milestone_2Parser.TryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTryExpr(milestone_2Parser.TryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#exceptBlock}.
	 * @param ctx the parse tree
	 */
	void enterExceptBlock(milestone_2Parser.ExceptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#exceptBlock}.
	 * @param ctx the parse tree
	 */
	void exitExceptBlock(milestone_2Parser.ExceptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(milestone_2Parser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(milestone_2Parser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void enterBlockExpr(milestone_2Parser.BlockExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#blockExpr}.
	 * @param ctx the parse tree
	 */
	void exitBlockExpr(milestone_2Parser.BlockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#staticStmt}.
	 * @param ctx the parse tree
	 */
	void enterStaticStmt(milestone_2Parser.StaticStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#staticStmt}.
	 * @param ctx the parse tree
	 */
	void exitStaticStmt(milestone_2Parser.StaticStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeferStmt(milestone_2Parser.DeferStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#deferStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeferStmt(milestone_2Parser.DeferStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#asmStmt}.
	 * @param ctx the parse tree
	 */
	void enterAsmStmt(milestone_2Parser.AsmStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#asmStmt}.
	 * @param ctx the parse tree
	 */
	void exitAsmStmt(milestone_2Parser.AsmStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#genericParam}.
	 * @param ctx the parse tree
	 */
	void enterGenericParam(milestone_2Parser.GenericParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#genericParam}.
	 * @param ctx the parse tree
	 */
	void exitGenericParam(milestone_2Parser.GenericParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#genericParamList}.
	 * @param ctx the parse tree
	 */
	void enterGenericParamList(milestone_2Parser.GenericParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#genericParamList}.
	 * @param ctx the parse tree
	 */
	void exitGenericParamList(milestone_2Parser.GenericParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(milestone_2Parser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(milestone_2Parser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#indAndComment}.
	 * @param ctx the parse tree
	 */
	void enterIndAndComment(milestone_2Parser.IndAndCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#indAndComment}.
	 * @param ctx the parse tree
	 */
	void exitIndAndComment(milestone_2Parser.IndAndCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#routine}.
	 * @param ctx the parse tree
	 */
	void enterRoutine(milestone_2Parser.RoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#routine}.
	 * @param ctx the parse tree
	 */
	void exitRoutine(milestone_2Parser.RoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void enterCommentStmt(milestone_2Parser.CommentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#commentStmt}.
	 * @param ctx the parse tree
	 */
	void exitCommentStmt(milestone_2Parser.CommentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#section_typeDef}.
	 * @param ctx the parse tree
	 */
	void enterSection_typeDef(milestone_2Parser.Section_typeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#section_typeDef}.
	 * @param ctx the parse tree
	 */
	void exitSection_typeDef(milestone_2Parser.Section_typeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#section_constant}.
	 * @param ctx the parse tree
	 */
	void enterSection_constant(milestone_2Parser.Section_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#section_constant}.
	 * @param ctx the parse tree
	 */
	void exitSection_constant(milestone_2Parser.Section_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#section_variable}.
	 * @param ctx the parse tree
	 */
	void enterSection_variable(milestone_2Parser.Section_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#section_variable}.
	 * @param ctx the parse tree
	 */
	void exitSection_variable(milestone_2Parser.Section_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(milestone_2Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(milestone_2Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#enum_grammer}.
	 * @param ctx the parse tree
	 */
	void enterEnum_grammer(milestone_2Parser.Enum_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#enum_grammer}.
	 * @param ctx the parse tree
	 */
	void exitEnum_grammer(milestone_2Parser.Enum_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#objectWhen}.
	 * @param ctx the parse tree
	 */
	void enterObjectWhen(milestone_2Parser.ObjectWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#objectWhen}.
	 * @param ctx the parse tree
	 */
	void exitObjectWhen(milestone_2Parser.ObjectWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#objectBranch}.
	 * @param ctx the parse tree
	 */
	void enterObjectBranch(milestone_2Parser.ObjectBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#objectBranch}.
	 * @param ctx the parse tree
	 */
	void exitObjectBranch(milestone_2Parser.ObjectBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#objectBranches}.
	 * @param ctx the parse tree
	 */
	void enterObjectBranches(milestone_2Parser.ObjectBranchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#objectBranches}.
	 * @param ctx the parse tree
	 */
	void exitObjectBranches(milestone_2Parser.ObjectBranchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#objectCase}.
	 * @param ctx the parse tree
	 */
	void enterObjectCase(milestone_2Parser.ObjectCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#objectCase}.
	 * @param ctx the parse tree
	 */
	void exitObjectCase(milestone_2Parser.ObjectCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#objectPart}.
	 * @param ctx the parse tree
	 */
	void enterObjectPart(milestone_2Parser.ObjectPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#objectPart}.
	 * @param ctx the parse tree
	 */
	void exitObjectPart(milestone_2Parser.ObjectPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#object_g}.
	 * @param ctx the parse tree
	 */
	void enterObject_g(milestone_2Parser.Object_gContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#object_g}.
	 * @param ctx the parse tree
	 */
	void exitObject_g(milestone_2Parser.Object_gContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#typeClassParam}.
	 * @param ctx the parse tree
	 */
	void enterTypeClassParam(milestone_2Parser.TypeClassParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#typeClassParam}.
	 * @param ctx the parse tree
	 */
	void exitTypeClassParam(milestone_2Parser.TypeClassParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#typeClass}.
	 * @param ctx the parse tree
	 */
	void enterTypeClass(milestone_2Parser.TypeClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#typeClass}.
	 * @param ctx the parse tree
	 */
	void exitTypeClass(milestone_2Parser.TypeClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(milestone_2Parser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(milestone_2Parser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#varTuple}.
	 * @param ctx the parse tree
	 */
	void enterVarTuple(milestone_2Parser.VarTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#varTuple}.
	 * @param ctx the parse tree
	 */
	void exitVarTuple(milestone_2Parser.VarTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#colonBody}.
	 * @param ctx the parse tree
	 */
	void enterColonBody(milestone_2Parser.ColonBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#colonBody}.
	 * @param ctx the parse tree
	 */
	void exitColonBody(milestone_2Parser.ColonBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(milestone_2Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(milestone_2Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#bindStmt}.
	 * @param ctx the parse tree
	 */
	void enterBindStmt(milestone_2Parser.BindStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#bindStmt}.
	 * @param ctx the parse tree
	 */
	void exitBindStmt(milestone_2Parser.BindStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#mixinStmt}.
	 * @param ctx the parse tree
	 */
	void enterMixinStmt(milestone_2Parser.MixinStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#mixinStmt}.
	 * @param ctx the parse tree
	 */
	void exitMixinStmt(milestone_2Parser.MixinStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#pragmaStmt}.
	 * @param ctx the parse tree
	 */
	void enterPragmaStmt(milestone_2Parser.PragmaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#pragmaStmt}.
	 * @param ctx the parse tree
	 */
	void exitPragmaStmt(milestone_2Parser.PragmaStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(milestone_2Parser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(milestone_2Parser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#complexOrSimpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterComplexOrSimpleStmt(milestone_2Parser.ComplexOrSimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#complexOrSimpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitComplexOrSimpleStmt(milestone_2Parser.ComplexOrSimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(milestone_2Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(milestone_2Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link milestone_2Parser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(milestone_2Parser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link milestone_2Parser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(milestone_2Parser.OprContext ctx);
}