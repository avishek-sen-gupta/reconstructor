package org.poc;

import java.util.List;

public class CopyStatementLineBoundaryPattern {

    private final String startTextBoundary;
    private final String endTextboundary;
    private boolean startMatched = false;
    private boolean endMatched = false;
    private int startLine;
    private int endLine;
    private List<String> copyBookLines;

    public CopyStatementLineBoundaryPattern(org.poc.IdmsCopyParser.CopyIdmsStatementContext copyStatement, List<String> unexpandedProgramLines) {
        int startLine = copyStatement.getStart().getLine() - 1;
        int endPlusOneLine = startLine + 1;
        while (unexpandedProgramLines.get(endPlusOneLine).trim().length() < 8) {
            endPlusOneLine ++;
        }
        startTextBoundary = unexpandedProgramLines.get(startLine);
        endTextboundary = unexpandedProgramLines.get(endPlusOneLine);
    }

    String fromCopyKeyword(String text) {
        int copyKeywordIndex = text.indexOf("COPY");
        return copyKeywordIndex == -1 ? text : text.substring(copyKeywordIndex);
    }
    public void match(String line, int currentLine) {
        if (line.contains(fromCopyKeyword(startTextBoundary.trim())) && !startMatched) {
            startMatched = true;
            startLine = currentLine;
            return;
        }
        if (startMatched && !endMatched && line.contains(fromCopyKeyword(endTextboundary.trim()))) {
            endMatched = true;
            endLine = currentLine - 1;
            return;
        }
    }

    public void collect(List<String> expandedProgramLines) {
        if (!startMatched || !endMatched) return;
        copyBookLines = expandedProgramLines.subList(startLine, endLine + 1);
    }
}
