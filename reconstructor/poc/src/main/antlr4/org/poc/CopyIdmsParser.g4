parser grammar CopyIdmsParser;
options {tokenVocab = CopyIdmsLexer;}

startRule : compilationUnit EOF;

compilationUnit
   : (genericIdmsCopyStatement)+
   ;

genericIdmsCopyStatement : (copyIdmsStatement | copyIdmsRecordStatement);
copyIdmsStatement : COPY IDMS COPY_BOOK_IDENTIFIER DOT_FS;
copyIdmsRecordStatement : COPY IDMS RECORD COPY_BOOK_IDENTIFIER DOT_FS;
ignored : . ;
