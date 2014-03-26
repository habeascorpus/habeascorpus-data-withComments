/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
mixup	TokenNameIdentifier	 mixup
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
FancyLoader	TokenNameIdentifier	 Fancy Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Span	TokenNameIdentifier	 Span
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
;	TokenNameSEMICOLON	
/** Modify a textlabeling using a series of mixup expressions. <pre> BNF: STATEMENT -> declareSpanType TYPE STATEMENT -> provide ID STATEMENT -> require ID [,FILE] STATEMENT -> annotateWith FILE STATEMENT -> defDict [+case] NAME = ID, ... , ID STATEMENT -> defTokenProp PROP:VALUE = GEN STATEMENT -> defSpanProp PROP:VALUE = GEN STATEMENT -> defSpanType TYPE2 = GEN STATEMENT -> defLevel NAME = LEVELDEF STATEMENT -> onLevel NAME STATEMENT -> offLevel NAME STATEMENT -> importFromLevel NAME TYPE = TYPE LEVELDEF -> filter TYPE LEVELDEF -> pseudotoken TYPE LEVELDEF -> split TOKEN LEVELDEF -> re 'REGEX' GEN -> [TYPE]: MIXUP-EXPR GEN -> [TYPE]- MIXUP-EXPR GEN -> [TYPE]~ re 'REGEX',NUMBER GEN -> [TYPE]~ trie phrase1, phrase2, ... ; statements are semicolon-separated // and comments look like this (C++ style) SEMANTICS: execute each command in order, saving spans/tokens as types, and asserting properties '=:' can be replaced with '=TYPE:', in which case the expr will be applied to each span of the given type, rather than all top-level spans defDict FOO = bar,baz,bat stores a lowercase version of each word the dictionary defDict +case FOO = blah,Bar,baZ stores each word the dictionary, preserving case in dictionaries and tries, a double-quoted word "foo.txt" means to find foo.txt on the classpath and store all lines from the file as words (after trimming them). TYPE: MIXUP-EXPR finds all spans inside a span of type TYPE that match the expression TYPE- MIXUP-EXPR finds all spans inside a span of type TYPE that do not contain anything matching MIXUP-EXPR </pre> <p> Mixup is matching language for modifying TextLabels. It can label spans with a given TYPE (the new label for that token span) and assign properties to spans (much like labels, but 'invisible'). There is more documentation for Mixup programs in the <a href="package-summary.html">package-level documents for Mixup.</a> <p> Briefly, a Mixup program will look something like this: <pre> require "req1"; //requires that "abc" type spans have already been labeled. If not, the default annoator //for "abc" will be used. require "req2", "req2.mixup"; //file 'def.mixup' will be run to provide "def" labels if they are not already there //if "def" labels were already generated by a different annotator, they will be used and //and 'def.mixup' won't be called. provide "xyz"; //this program will annotate the text with "xyz" labels defDict titleWord = mr, ms, mrs, dr; //defines a dictionary (with scope of this program execution called 'titleWord' //containing the values "mr", "ms", "mrs", "dr" defDict myDictionary = "dictionary.txt"; //defines a dictionary called 'myDictionary' with values taken from the file "dictionary.txt" defTokenProp title:true =: ... [ai(titleWord)] ... ; //finds all spans matching a work in the dictionary titleWord //those spans are given the property "Name" with value "true" (a string, not boolean) //if the span previously had "Name" property with a different value, that is replaced // the "..." before and after indicate that it doesn't matter what comes before or after the token //to be labeled. if I said "=: [ai(titleWord)];" the document would need to be JUST a titleword. defTokenProp titlePunc:1 =: ... title:true [','] ... || ... title:true ['.'] ... ; //spans "." or "," preceeded by a title are given the property titlePunc with value "1" //note that the entire '... title:true [','] ...' is an expression; or operators ("||") must be //<em> between</em> expressions, not within them defSpanType fullTitle =: ...[title:true titlePunc:1?R] ...; //label a span as "fullTitle" if there is a title span optionally followed b a titlePunc span //but not more than one (from the R) defSpanType the =: ... [eqi('the')] ...; //labels occurances of "the" ignoring case (eq = equals, adding i ignores case) defTokenProp aProp:t =: ...[<title:true, req1>] ...; /tokens which have the title=true property AND are labeled as req1 //are given the property aProp=t defTokenProp address:x =: ... [@fullTitle any] !a(myDictionary) ...; //label spans of one 'fullTitle' (the @ is needed //before types) and the following token, whatever it is, // which are followed by something other than a myDictionary word defTokenProp capProp:on =req2: ... [re('^[A-Z]$')] ...; //on spans of type req2, match tokens fitting the given regular expression defSpanType listSet =: ... [address+R] ...; //label as header spans of 1 or more address tokens, going all the way to //right most possible token - example: blah address1 address2 address3 blah // - will return three spans: "address3", "address2 address3", and "address1 address2 address3" defSpanType adList =: ... [L address+ R] ...; //as above but only returns the longest span defSpanType header =: [L address* R] ...; //label longest span of 0 or more address tokens at the beginning of the document defSpanType shortList =: ... [address{2,3}] ...; //label spans of 2 or 3 address tokens defSpanType xyz =header: ...[capProp] ...; //providing the promised xyz labeling //creates a new level where each document is a span with spanType defLevel newLevel = filter spanType; //creates a new level where tokens of spanType are combined into a single token defLevel newLevel = pseudotoken spanType; //creates a new level where the textBase is retokenized by splitting a a certain token defLevel newLevel = split '.'; //create a new level where the textBase is retokenized using a regular expression defLevel newLevel = re '([^\n]+)'; //switches current textBase and Labels to Level onLevel levelName; //returns to root (or original) level - levelName is the name of the child level which you are switching off offLevel childLevelName; //Imports spans of Type in the child level to spans of newType in the parent level importFromLevel childLevelName newType = type; </pre> * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Modify a textlabeling using a series of mixup expressions. <pre> BNF: STATEMENT -> declareSpanType TYPE STATEMENT -> provide ID STATEMENT -> require ID [,FILE] STATEMENT -> annotateWith FILE STATEMENT -> defDict [+case] NAME = ID, ... , ID STATEMENT -> defTokenProp PROP:VALUE = GEN STATEMENT -> defSpanProp PROP:VALUE = GEN STATEMENT -> defSpanType TYPE2 = GEN STATEMENT -> defLevel NAME = LEVELDEF STATEMENT -> onLevel NAME STATEMENT -> offLevel NAME STATEMENT -> importFromLevel NAME TYPE = TYPE LEVELDEF -> filter TYPE LEVELDEF -> pseudotoken TYPE LEVELDEF -> split TOKEN LEVELDEF -> re 'REGEX' GEN -> [TYPE]: MIXUP-EXPR GEN -> [TYPE]- MIXUP-EXPR GEN -> [TYPE]~ re 'REGEX',NUMBER GEN -> [TYPE]~ trie phrase1, phrase2, ... ; statements are semicolon-separated // and comments look like this (C++ style) SEMANTICS: execute each command in order, saving spans/tokens as types, and asserting properties '=:' can be replaced with '=TYPE:', in which case the expr will be applied to each span of the given type, rather than all top-level spans defDict FOO = bar,baz,bat stores a lowercase version of each word the dictionary defDict +case FOO = blah,Bar,baZ stores each word the dictionary, preserving case in dictionaries and tries, a double-quoted word "foo.txt" means to find foo.txt on the classpath and store all lines from the file as words (after trimming them). TYPE: MIXUP-EXPR finds all spans inside a span of type TYPE that match the expression TYPE- MIXUP-EXPR finds all spans inside a span of type TYPE that do not contain anything matching MIXUP-EXPR </pre> <p> Mixup is matching language for modifying TextLabels. It can label spans with a given TYPE (the new label for that token span) and assign properties to spans (much like labels, but 'invisible'). There is more documentation for Mixup programs in the <a href="package-summary.html">package-level documents for Mixup.</a> <p> Briefly, a Mixup program will look something like this: <pre> require "req1"; //requires that "abc" type spans have already been labeled. If not, the default annoator //for "abc" will be used. require "req2", "req2.mixup"; //file 'def.mixup' will be run to provide "def" labels if they are not already there //if "def" labels were already generated by a different annotator, they will be used and //and 'def.mixup' won't be called. provide "xyz"; //this program will annotate the text with "xyz" labels defDict titleWord = mr, ms, mrs, dr; //defines a dictionary (with scope of this program execution called 'titleWord' //containing the values "mr", "ms", "mrs", "dr" defDict myDictionary = "dictionary.txt"; //defines a dictionary called 'myDictionary' with values taken from the file "dictionary.txt" defTokenProp title:true =: ... [ai(titleWord)] ... ; //finds all spans matching a work in the dictionary titleWord //those spans are given the property "Name" with value "true" (a string, not boolean) //if the span previously had "Name" property with a different value, that is replaced // the "..." before and after indicate that it doesn't matter what comes before or after the token //to be labeled. if I said "=: [ai(titleWord)];" the document would need to be JUST a titleword. defTokenProp titlePunc:1 =: ... title:true [','] ... || ... title:true ['.'] ... ; //spans "." or "," preceeded by a title are given the property titlePunc with value "1" //note that the entire '... title:true [','] ...' is an expression; or operators ("||") must be //<em> between</em> expressions, not within them defSpanType fullTitle =: ...[title:true titlePunc:1?R] ...; //label a span as "fullTitle" if there is a title span optionally followed b a titlePunc span //but not more than one (from the R) defSpanType the =: ... [eqi('the')] ...; //labels occurances of "the" ignoring case (eq = equals, adding i ignores case) defTokenProp aProp:t =: ...[<title:true, req1>] ...; /tokens which have the title=true property AND are labeled as req1 //are given the property aProp=t defTokenProp address:x =: ... [@fullTitle any] !a(myDictionary) ...; //label spans of one 'fullTitle' (the @ is needed //before types) and the following token, whatever it is, // which are followed by something other than a myDictionary word defTokenProp capProp:on =req2: ... [re('^[A-Z]$')] ...; //on spans of type req2, match tokens fitting the given regular expression defSpanType listSet =: ... [address+R] ...; //label as header spans of 1 or more address tokens, going all the way to //right most possible token - example: blah address1 address2 address3 blah // - will return three spans: "address3", "address2 address3", and "address1 address2 address3" defSpanType adList =: ... [L address+ R] ...; //as above but only returns the longest span defSpanType header =: [L address* R] ...; //label longest span of 0 or more address tokens at the beginning of the document defSpanType shortList =: ... [address{2,3}] ...; //label spans of 2 or 3 address tokens defSpanType xyz =header: ...[capProp] ...; //providing the promised xyz labeling //creates a new level where each document is a span with spanType defLevel newLevel = filter spanType; //creates a new level where tokens of spanType are combined into a single token defLevel newLevel = pseudotoken spanType; //creates a new level where the textBase is retokenized by splitting a a certain token defLevel newLevel = split '.'; //create a new level where the textBase is retokenized using a regular expression defLevel newLevel = re '([^\n]+)'; //switches current textBase and Labels to Level onLevel levelName; //returns to root (or original) level - levelName is the name of the child level which you are switching off offLevel childLevelName; //Imports spans of Type in the child level to spans of newType in the parent level importFromLevel childLevelName newType = type; </pre> * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
MixupProgram	TokenNameIdentifier	 Mixup Program
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080303L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// private static Logger log=Logger.getLogger(MixupProgram.class); 	TokenNameCOMMENT_LINE	private static Logger log=Logger.getLogger(MixupProgram.class); 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Statement	TokenNameIdentifier	 Statement
>	TokenNameGREATER	
statementList	TokenNameIdentifier	 statement List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Statement	TokenNameIdentifier	 Statement
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// maps dictionary names to the sets they correspond to 	TokenNameCOMMENT_LINE	maps dictionary names to the sets they correspond to 
// private Map<String,Set<String>> dictionaryMap=new HashMap<String,Set<String>>(); 	TokenNameCOMMENT_LINE	private Map<String,Set<String>> dictionaryMap=new HashMap<String,Set<String>>(); 
// private static TextBase textBase=null; 	TokenNameCOMMENT_LINE	private static TextBase textBase=null; 
// private static MonotonicTextLabels labels=null; 	TokenNameCOMMENT_LINE	private static MonotonicTextLabels labels=null; 
// private static HashMap textBases=new HashMap(); //List of TextBases with different tokenizations 	TokenNameCOMMENT_LINE	private static HashMap textBases=new HashMap(); //List of TextBases with different tokenizations 
// private static HashMap textLabels=new HashMap(); //List of TextLabels with for textBases with different tokenizations 	TokenNameCOMMENT_LINE	private static HashMap textLabels=new HashMap(); //List of TextLabels with for textBases with different tokenizations 
public	TokenNamepublic	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
legalKeywords	TokenNameIdentifier	 legal Keywords
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"defTokenProp"	TokenNameStringLiteral	defTokenProp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"defSpanProp"	TokenNameStringLiteral	defSpanProp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"defSpanType"	TokenNameStringLiteral	defSpanType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"defDict"	TokenNameStringLiteral	defDict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"declareSpanType"	TokenNameStringLiteral	declareSpanType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"provide"	TokenNameStringLiteral	provide
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"require"	TokenNameStringLiteral	require
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"annotateWith"	TokenNameStringLiteral	annotateWith
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"defLevel"	TokenNameStringLiteral	defLevel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"onLevel"	TokenNameStringLiteral	onLevel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"offLevel"	TokenNameStringLiteral	offLevel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"importFromLevel"	TokenNameStringLiteral	importFromLevel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"//"	TokenNameStringLiteral	//
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
legalKeywords	TokenNameIdentifier	 legal Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MixupProgram	TokenNameIdentifier	 Mixup Program
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a MixupProgram from an array of statements */	TokenNameCOMMENT_JAVADOC	 Create a MixupProgram from an array of statements 
public	TokenNamepublic	
MixupProgram	TokenNameIdentifier	 Mixup Program
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
statements	TokenNameIdentifier	 statements
)	TokenNameRPAREN	
throws	TokenNamethrows	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
program	TokenNameIdentifier	 program
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
statements	TokenNameIdentifier	 statements
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
program	TokenNameIdentifier	 program
=	TokenNameEQUAL	
program	TokenNameIdentifier	 program
+	TokenNamePLUS	
statements	TokenNameIdentifier	 statements
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"; "	TokenNameStringLiteral	; 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startProgram	TokenNameIdentifier	 start Program
(	TokenNameLPAREN	
program	TokenNameIdentifier	 program
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a MixupProgram from single string with a bunch of semicolon-separated statements. */	TokenNameCOMMENT_JAVADOC	 Create a MixupProgram from single string with a bunch of semicolon-separated statements. 
public	TokenNamepublic	
MixupProgram	TokenNameIdentifier	 Mixup Program
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
program	TokenNameIdentifier	 program
)	TokenNameRPAREN	
throws	TokenNamethrows	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
program	TokenNameIdentifier	 program
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
lines	TokenNameIdentifier	 lines
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startComment	TokenNameIdentifier	 start Comment
=	TokenNameEQUAL	
lines	TokenNameIdentifier	 lines
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"//"	TokenNameStringLiteral	//
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startComment	TokenNameIdentifier	 start Comment
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
lines	TokenNameIdentifier	 lines
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
startComment	TokenNameIdentifier	 start Comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
lines	TokenNameIdentifier	 lines
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
program	TokenNameIdentifier	 program
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startProgram	TokenNameIdentifier	 start Program
(	TokenNameLPAREN	
program	TokenNameIdentifier	 program
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a MixupProgram from the contents of a file. */	TokenNameCOMMENT_JAVADOC	 Create a MixupProgram from the contents of a file. 
public	TokenNamepublic	
MixupProgram	TokenNameIdentifier	 Mixup Program
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//LineNumberReader in = new LineNumberReader(new FileReader(file)); 	TokenNameCOMMENT_LINE	LineNumberReader in = new LineNumberReader(new FileReader(file)); 
LineNumberReader	TokenNameIdentifier	 Line Number Reader
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
mixupReader	TokenNameIdentifier	 mixup Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
:	TokenNameCOLON	
mixupReader	TokenNameIdentifier	 mixup Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startComment	TokenNameIdentifier	 start Comment
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"//"	TokenNameStringLiteral	//
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startComment	TokenNameIdentifier	 start Comment
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
startComment	TokenNameIdentifier	 start Comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
program	TokenNameIdentifier	 program
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startProgram	TokenNameIdentifier	 start Program
(	TokenNameLPAREN	
program	TokenNameIdentifier	 program
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
startProgram	TokenNameIdentifier	 start Program
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
program	TokenNameIdentifier	 program
)	TokenNameRPAREN	
throws	TokenNamethrows	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
program	TokenNameIdentifier	 program
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
(	TokenNameLPAREN	
program	TokenNameIdentifier	 program
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
keyword	TokenNameIdentifier	 keyword
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
legalKeywords	TokenNameIdentifier	 legal Keywords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
keyword	TokenNameIdentifier	 keyword
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addStatement	TokenNameIdentifier	 add Statement
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
keyword	TokenNameIdentifier	 keyword
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
legalKeywords	TokenNameIdentifier	 legal Keywords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * @deprecated Use MixupInterpreter to evaluate mixup programs 	TokenNameCOMMENT_LINE	* @deprecated Use MixupInterpreter to evaluate mixup programs 
// */ 	TokenNameCOMMENT_LINE	*/ 
// // Deprecated on 2/20/2007 	TokenNameCOMMENT_LINE	// Deprecated on 2/20/2007 
// public MonotonicTextLabels eval(MonotonicTextLabels labels,TextBase tb){ 	TokenNameCOMMENT_LINE	public MonotonicTextLabels eval(MonotonicTextLabels labels,TextBase tb){ 
// MixupInterpreter interpreter=new MixupInterpreter(this); 	TokenNameCOMMENT_LINE	MixupInterpreter interpreter=new MixupInterpreter(this); 
// interpreter.eval(labels); 	TokenNameCOMMENT_LINE	interpreter.eval(labels); 
// return interpreter.getCurrentLabels(); 	TokenNameCOMMENT_LINE	return interpreter.getCurrentLabels(); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * @deprecated Use MixupInterpreter to evaluate mixup programs 	TokenNameCOMMENT_LINE	* @deprecated Use MixupInterpreter to evaluate mixup programs 
// */ 	TokenNameCOMMENT_LINE	*/ 
// // Deprecated on 2/20/2007 	TokenNameCOMMENT_LINE	// Deprecated on 2/20/2007 
// public void eval(MonotonicTextLabels labels){ 	TokenNameCOMMENT_LINE	public void eval(MonotonicTextLabels labels){ 
// MixupInterpreter interpreter=new MixupInterpreter(this); 	TokenNameCOMMENT_LINE	MixupInterpreter interpreter=new MixupInterpreter(this); 
// ProgressCounter pc= 	TokenNameCOMMENT_LINE	ProgressCounter pc= 
// new ProgressCounter("mixup program","statement",statementList.size()); 	TokenNameCOMMENT_LINE	new ProgressCounter("mixup program","statement",statementList.size()); 
// interpreter.eval(labels); 	TokenNameCOMMENT_LINE	interpreter.eval(labels); 
// pc.finished(); 	TokenNameCOMMENT_LINE	pc.finished(); 
// } 	TokenNameCOMMENT_LINE	} 
/** Add a single statement to the current mixup program. */	TokenNameCOMMENT_JAVADOC	 Add a single statement to the current mixup program. 
public	TokenNamepublic	
void	TokenNamevoid	
addStatement	TokenNameIdentifier	 add Statement
(	TokenNameLPAREN	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
throws	TokenNamethrows	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
statementList	TokenNameIdentifier	 statement List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Statement	TokenNameIdentifier	 Statement
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("Added Statement: "+statementList.get(statementList.size()-1)); 	TokenNameCOMMENT_LINE	System.out.println("Added Statement: "+statementList.get(statementList.size()-1)); 
}	TokenNameRBRACE	
/** Add a single statement to the current mixup program. */	TokenNameCOMMENT_JAVADOC	 Add a single statement to the current mixup program. 
public	TokenNamepublic	
void	TokenNamevoid	
addStatement	TokenNameIdentifier	 add Statement
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
statement	TokenNameIdentifier	 statement
)	TokenNameRPAREN	
throws	TokenNamethrows	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
(	TokenNameLPAREN	
statement	TokenNameIdentifier	 statement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
keyword	TokenNameIdentifier	 keyword
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
legalKeywords	TokenNameIdentifier	 legal Keywords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addStatement	TokenNameIdentifier	 add Statement
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Statement	TokenNameIdentifier	 Statement
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getStatements	TokenNameIdentifier	 get Statements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
statementList	TokenNameIdentifier	 statement List
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Statement	TokenNameIdentifier	 Statement
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** List the program **/	TokenNameCOMMENT_JAVADOC	 List the program *
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
statementList	TokenNameIdentifier	 statement List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
statementList	TokenNameIdentifier	 statement List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Convert a string to an input stream, then a LineNumberReader. */	TokenNameCOMMENT_JAVADOC	 Convert a string to an input stream, then a LineNumberReader. 
static	TokenNamestatic	
private	TokenNameprivate	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
mixupReader	TokenNameIdentifier	 mixup Reader
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
mixupReader	TokenNameIdentifier	 mixup Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
ClassLoader	TokenNameIdentifier	 Class Loader
.	TokenNameDOT	
getSystemResourceAsStream	TokenNameIdentifier	 get System Resource As Stream
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
ClassLoader	TokenNameIdentifier	 Class Loader
.	TokenNameDOT	
getSystemResourceAsStream	TokenNameIdentifier	 get System Resource As Stream
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"No file named '"	TokenNameStringLiteral	No file named '
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
"' found on classpath"	TokenNameStringLiteral	' found on classpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
mixupReader	TokenNameIdentifier	 mixup Reader
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LineNumberReader	TokenNameIdentifier	 Line Number Reader
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * usage: programFile textFile/directory [outfile] * evaluates the given program file against the specified data (either a file or directory of files) * if an outfile is specified it outputs the types as operators to that file */	TokenNameCOMMENT_JAVADOC	 usage: programFile textFile/directory [outfile] evaluates the given program file against the specified data (either a file or directory of files) if an outfile is specified it outputs the types as operators to that file 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
MixupProgram	TokenNameIdentifier	 Mixup Program
program	TokenNameIdentifier	 program
=	TokenNameEQUAL	
new	TokenNamenew	
MixupProgram	TokenNameIdentifier	 Mixup Program
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"program: "	TokenNameStringLiteral	program: 
+	TokenNamePLUS	
program	TokenNameIdentifier	 program
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
)	TokenNameRPAREN	
FancyLoader	TokenNameIdentifier	 Fancy Loader
.	TokenNameDOT	
loadTextLabels	TokenNameIdentifier	 load Text Labels
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
interpreter	TokenNameIdentifier	 interpreter
=	TokenNameEQUAL	
new	TokenNamenew	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
(	TokenNameLPAREN	
program	TokenNameIdentifier	 program
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interpreter	TokenNameIdentifier	 interpreter
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
outFile	TokenNameIdentifier	 out File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
saveTypesAsOps	TokenNameIdentifier	 save Types As Ops
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
outFile	TokenNameIdentifier	 out File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Type "	TokenNameStringLiteral	Type 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" '"	TokenNameStringLiteral	 '
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: programFile textFile/directory [outfile]"	TokenNameStringLiteral	usage: programFile textFile/directory [outfile]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
