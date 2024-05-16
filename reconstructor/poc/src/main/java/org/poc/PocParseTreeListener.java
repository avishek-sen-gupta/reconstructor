package org.poc;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class PocParseTreeListener implements ParseTreeListener {
    private List<org.poc.IdmsCopyParser.CopyIdmsStatementContext> copyStatements;

    public PocParseTreeListener(List<org.poc.IdmsCopyParser.CopyIdmsStatementContext> copyStatements) {
        this.copyStatements = copyStatements;
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        if (parserRuleContext instanceof org.poc.IdmsCopyParser.CopyIdmsStatementContext) {
            System.out.println("FOUND ONE");
            copyStatements.add((org.poc.IdmsCopyParser.CopyIdmsStatementContext) parserRuleContext);
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
