package org.poc;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
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
        String fileName = "/Users/asgupta/Downloads/mbrdi-poc/V7523438.txt.original";
        CharStream codePointCharStream = CharStreams.fromFileName(fileName);
        org.poc.IdmsCopyLexer antlrLexer = new org.poc.IdmsCopyLexer(codePointCharStream);
        antlrLexer.removeErrorListeners();
        CommonTokenStream tokens = new CommonTokenStream(antlrLexer);
        ANTLRErrorListener listener = new CustomErrorListener();
        antlrLexer.addErrorListener(listener);
        org.poc.IdmsCopyParser antlrParser = new org.poc.IdmsCopyParser(tokens);
//        antlrParser.setErrorHandler(new SkippingErrorStrategy());
        ArrayList<org.poc.IdmsCopyParser.CopyIdmsStatementContext> copyStatements = new ArrayList<>();
        org.poc.IdmsCopyParser.StartRuleContext tree = antlrParser.startRule();
        ParseTreeWalker x = new ParseTreeWalker();
        x.walk(new PocParseTreeListener(copyStatements), tree);
        copyStatements.forEach(copyStatement -> {
            System.out.println(copyStatement.copyIdmsOptions().copyIdmsSource().copySource().getText() + " -> " + copyStatement.getText());
        });

        List<String> unexpandedProgramLines = Files.readAllLines(Paths.get(fileName));
        List<CopyStatementLineBoundary> copyBookInlineBoundaries = copyStatements.stream().map(copyStatement -> new CopyStatementLineBoundary(copyStatement, unexpandedProgramLines)).toList();

//        List<ParseTree> nodes = tree.children.stream().filter(child -> !(child instanceof ErrorNode)).collect(Collectors.toList());

//        Matcher m = Pattern.compile("COPY IDMS (V[A-Z0-9]*).").matcher("");
//        Path ruleFile = Paths.get(fileName);
//        try (Stream<String> lines = Files.lines(ruleFile)) {
//            lines.flatMap(line -> m.reset(line).results().limit(1))
//                    .forEach(mr -> {
//                        System.out.println(mr.group(1));
//                    });
//        }
//        System.out.println("Now searching for COPY IDMS RECORD ...");
//        Matcher m2 = Pattern.compile("COPY IDMS RECORD ([A-Z0-9]+).").matcher("");
//        try (Stream<String> lines = Files.lines(ruleFile)) {
//            lines.flatMap(line -> m2.reset(line).results().limit(1))
//                    .forEach(mr -> {
//                        System.out.println(mr.group(1));
//                    });
//        }
        System.out.println("COMPLETE!");
    }
}
