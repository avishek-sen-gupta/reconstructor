package org.poc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Reconstructor
 */
public class Reconstructor {
    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String unexpandedFileName = "/Users/asgupta/Downloads/mbrdi-poc/V7523438.txt.original";
//        String expandedFileName = "/Users/asgupta/Downloads/mbrdi-poc/V7523438_compile-listing.txt.original";
        String expandedFileName = "/Users/asgupta/Downloads/mbrdi-poc/V7523438-compiled";
        CharStream codePointCharStream = CharStreams.fromFileName(unexpandedFileName);
        org.poc.IdmsCopyLexer antlrLexer = new org.poc.IdmsCopyLexer(codePointCharStream);
        antlrLexer.removeErrorListeners();
        CommonTokenStream tokens = new CommonTokenStream(antlrLexer);
        ANTLRErrorListener listener = new CustomErrorListener();
        antlrLexer.addErrorListener(listener);
        org.poc.IdmsCopyParser antlrParser = new org.poc.IdmsCopyParser(tokens);
        ArrayList<org.poc.IdmsCopyParser.CopyIdmsStatementContext> copyStatements = new ArrayList<>();
        org.poc.IdmsCopyParser.StartRuleContext tree = antlrParser.startRule();
        ParseTreeWalker x = new ParseTreeWalker();
        x.walk(new PocParseTreeListener(copyStatements), tree);
        copyStatements.forEach(copyStatement -> {
            System.out.println(copyStatement.copyIdmsOptions().copyIdmsSource().copySource().getText() + " -> " + copyStatement.getText());
        });

        List<String> unexpandedProgramLines = Files.readAllLines(Paths.get(unexpandedFileName));
        List<CopyStatementLineBoundaryPattern> copyBookInlineBoundaries = copyStatements.stream().map(copyStatement -> new CopyStatementLineBoundaryPattern(copyStatement, unexpandedProgramLines)).toList();
        List<String> expandedProgramLines = Files.readAllLines(Paths.get(expandedFileName), StandardCharsets.ISO_8859_1);
        for (int i = 0; i <= copyBookInlineBoundaries.size() - 1; i++) {
            int currentLine = 0;
            for (int j = 0; j <= expandedProgramLines.size() - 1; j++) {
                copyBookInlineBoundaries.get(i).match(expandedProgramLines.get(j), j);
                currentLine ++;
            }
        }

        copyBookInlineBoundaries.forEach(b -> b.collect(expandedProgramLines));
        System.out.println("COMPLETE!");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String boundaryStructure = gson.toJson(copyBookInlineBoundaries);
        String boundaryOutputPath = "/Users/asgupta/Downloads/mbrdi-poc/extracted-copybooks-map.json";
        PrintWriter out = new PrintWriter(boundaryOutputPath);
        out.println(boundaryStructure);
        out.close();
    }
}
