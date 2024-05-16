package org.poc;

import java.util.List;

public class CopyStatementLineBoundary {

    private final String startTextBoundary;
    private final String endTextboundary;

    public CopyStatementLineBoundary(org.poc.IdmsCopyParser.CopyIdmsStatementContext copyStatement, List<String> unexpandedProgramLines) {
        int startLine = copyStatement.getStart().getLine() - 1;
        int endPlusOneLine = startLine + 1;
        startTextBoundary = unexpandedProgramLines.get(startLine);
        endTextboundary = unexpandedProgramLines.get(endPlusOneLine);
    }
}
