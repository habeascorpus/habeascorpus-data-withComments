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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedSet	TokenNameIdentifier	 Sorted Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Matcher	TokenNameIdentifier	 Matcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
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
BasicTextBase	TokenNameIdentifier	 Basic Text Base
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
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
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
BoneheadStemmer	TokenNameIdentifier	 Bonehead Stemmer
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
TextLabels	TokenNameIdentifier	 Text Labels
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
Token	TokenNameIdentifier	 Token
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ProgressCounter	TokenNameIdentifier	 Progress Counter
;	TokenNameSEMICOLON	
/** A simple pattern-matching and information extraction language. <pre> EXAMPLE: ... in('begin') @number? [ any{2,5} in('end') ] ... && [!in('begin')*] && [!in('end')*] BNF: simplePrim -> [!] simplePrim1 simplePrim1 -> id | a(DICT) | ai(DICT) | eq(CONST) | eqi(CONST) | re(REGEX) | any | ... | PROPERTY:VALUE | PROPERTY:a(foo) ) prim -> < simplePrim [,simplePrim]* > | simplePrim repeatedPrim -> [L] prim [R] repeat | @type | @type? repeat -> {int,int} | {,int} | {int,} | {int} | ? | * | + pattern -> | repeatedPrim pattern basicExpr -> pattern [ pattern ] pattern basicExpr -> (expr) expr -> basicExpr "||" expr expr -> basicExpr "&&" expr SEMANTICS: basicExpr is pattern match - like a regex, but returns all matches, not just the longest one token-level tests: eq('foo') check token is exactly foo 'foo' is short for eq('foo') re('regex') checks if token matches the regex eqi('foo') check lowercase version of token is foo 'foo' or eq('foo') checks a token is equal to 'foo' a(bar) checks a token is in dictionary 'bar' ai(bar) checks that the token is in dictionary 'bar', ignoring case color:red checks that the token has property 'color' set to 'red' color:a(primaryColor) checks that the token's property 'color' is in the dictionary 'primaryColor' !test is negation of test <test1, test2, ... test3> conjoins token-level tests any is true for any token token-sequences: test? is 0 or 1 tokens matching test test+ is 1+ tokens matching test test* is 0+ tokens matching test test{3,7} is between 3 and 7 tokens matching test ... is equal to any* <code>@foo</code> matches a span of type foo <code>@foo?</code> matches a span of type foo or the empty sequence L means sequence can't be extended to left and still match R means sequence can't be extended to right and still match expr || expr is union expr && expr is piping: generate with expr1, filter with expr2 </pre> The name's an acronym for My Information eXtraction and Understanding Package. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A simple pattern-matching and information extraction language. <pre> EXAMPLE: ... in('begin') @number? [ any{2,5} in('end') ] ... && [!in('begin')*] && [!in('end')*] BNF: simplePrim -> [!] simplePrim1 simplePrim1 -> id | a(DICT) | ai(DICT) | eq(CONST) | eqi(CONST) | re(REGEX) | any | ... | PROPERTY:VALUE | PROPERTY:a(foo) ) prim -> < simplePrim [,simplePrim]* > | simplePrim repeatedPrim -> [L] prim [R] repeat | @type | @type? repeat -> {int,int} | {,int} | {int,} | {int} | ? | | + pattern -> | repeatedPrim pattern basicExpr -> pattern [ pattern ] pattern basicExpr -> (expr) expr -> basicExpr "||" expr expr -> basicExpr "&&" expr SEMANTICS: basicExpr is pattern match - like a regex, but returns all matches, not just the longest one token-level tests: eq('foo') check token is exactly foo 'foo' is short for eq('foo') re('regex') checks if token matches the regex eqi('foo') check lowercase version of token is foo 'foo' or eq('foo') checks a token is equal to 'foo' a(bar) checks a token is in dictionary 'bar' ai(bar) checks that the token is in dictionary 'bar', ignoring case color:red checks that the token has property 'color' set to 'red' color:a(primaryColor) checks that the token's property 'color' is in the dictionary 'primaryColor' !test is negation of test <test1, test2, ... test3> conjoins token-level tests any is true for any token token-sequences: test? is 0 or 1 tokens matching test test+ is 1+ tokens matching test test* is 0+ tokens matching test test{3,7} is between 3 and 7 tokens matching test ... is equal to any* <code>@foo</code> matches a span of type foo <code>@foo?</code> matches a span of type foo or the empty sequence L means sequence can't be extended to left and still match R means sequence can't be extended to right and still match expr || expr is union expr && expr is piping: generate with expr1, filter with expr2 </pre> The name's an acronym for My Information eXtraction and Understanding Package. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
Mixup	TokenNameIdentifier	 Mixup
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
/** Without constraints, the maximum number of times a mixup * expression can extract something from a document of length N is * O(N*N). The maxNumberOfMatches... variables below constrain * this behavior, for efficiency. The variable below is a threshold * after which these constraints kick in. */	TokenNameCOMMENT_JAVADOC	 Without constraints, the maximum number of times a mixup expression can extract something from a document of length N is O(N*N). The maxNumberOfMatches... variables below constrain this behavior, for efficiency. The variable below is a threshold after which these constraints kick in. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
minMatchesToApplyConstraints	TokenNameIdentifier	 min Matches To Apply Constraints
=	TokenNameEQUAL	
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Without constraints, the maximum number of times a mixup * expression can extract something from a document of length N is * O(N*N), since any token can be the begin or end of an extracted * span. The maxNumberOfMatchesPerToken value limits this to * maxNumberOfMatchesPerToken*N. */	TokenNameCOMMENT_JAVADOC	 Without constraints, the maximum number of times a mixup expression can extract something from a document of length N is O(N*N), since any token can be the begin or end of an extracted span. The maxNumberOfMatchesPerToken value limits this to maxNumberOfMatchesPerToken*N. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
maxNumberOfMatchesPerToken	TokenNameIdentifier	 max Number Of Matches Per Token
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Without constrains, the maximum number of times a mixup * expression can extract something from a document of length N is * O(N*N), since any token can be the begin or end of an extracted * span. This limits the number of matches to a fixed number. */	TokenNameCOMMENT_JAVADOC	 Without constrains, the maximum number of times a mixup expression can extract something from a document of length N is O(N*N), since any token can be the begin or end of an extracted span. This limits the number of matches to a fixed number. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
maxNumberOfMatches	TokenNameIdentifier	 max Number Of Matches
=	TokenNameEQUAL	
134217728	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//2^27 	TokenNameCOMMENT_LINE	2^27 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// tokenize: words, single-quoted strings, "&&", "||", "..." or single non-word chars 	TokenNameCOMMENT_LINE	tokenize: words, single-quoted strings, "&&", "||", "..." or single non-word chars 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Pattern	TokenNameIdentifier	 Pattern
tokenizerPattern	TokenNameIdentifier	 tokenizer Pattern
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"\s*((\n)|(\w+)|(\/\/)|('(\\'|[^\'])*')|\&\&|\|\||\.\.\.|\\\;|\W)\s*"	TokenNameStringLiteral	\s*((\n)|(\w+)|(\/\/)|('(\\'|[^\'])*')|\&\&|\|\||\.\.\.|\\\;|\W)\s*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Pattern.compile("\\s*(\\w+|'([^']|\\\\')*'|\\&\\&|\\|\\||\\.\\.\\.|\\W)\\s*"); 	TokenNameCOMMENT_LINE	Pattern.compile("\\s*(\\w+|'([^']|\\\\')*'|\\&\\&|\\|\\||\\.\\.\\.|\\W)\\s*"); 
// legal functions 	TokenNameCOMMENT_LINE	legal functions 
private	TokenNameprivate	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
legalFunctions	TokenNameIdentifier	 legal Functions
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
legalFunctions	TokenNameIdentifier	 legal Functions
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"re"	TokenNameStringLiteral	re
,	TokenNameCOMMA	
"eq"	TokenNameStringLiteral	eq
,	TokenNameCOMMA	
"eqi"	TokenNameStringLiteral	eqi
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"ai"	TokenNameStringLiteral	ai
,	TokenNameCOMMA	
"any"	TokenNameStringLiteral	any
,	TokenNameCOMMA	
"prop"	TokenNameStringLiteral	prop
,	TokenNameCOMMA	
"propDict"	TokenNameStringLiteral	propDict
}	TokenNameRBRACE	
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
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
legalFunctions	TokenNameIdentifier	 legal Functions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
RE	TokenNameIdentifier	 RE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
EQ	TokenNameIdentifier	 EQ
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
EQI	TokenNameIdentifier	 EQI
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
A	TokenNameIdentifier	 A
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
AI	TokenNameIdentifier	 AI
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ANY	TokenNameIdentifier	 ANY
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
PROP	TokenNameIdentifier	 PROP
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
PROPDICT	TokenNameIdentifier	 PROPDICT
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ELIPSE	TokenNameIdentifier	 ELIPSE
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Expr	TokenNameIdentifier	 Expr
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
/** Create a new mixup query. */	TokenNameCOMMENT_JAVADOC	 Create a new mixup query. 
public	TokenNamepublic	
Mixup	TokenNameIdentifier	 Mixup
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
new	TokenNamenew	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
MixupParser	TokenNameIdentifier	 Mixup Parser
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
.	TokenNameDOT	
parseExpr	TokenNameIdentifier	 parse Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Mixup	TokenNameIdentifier	 Mixup
(	TokenNameLPAREN	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
MixupParser	TokenNameIdentifier	 Mixup Parser
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
.	TokenNameDOT	
parseExpr	TokenNameIdentifier	 parse Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Extract subspans from each generated span using the mixup expression. */	TokenNameCOMMENT_JAVADOC	 Extract subspans from each generated span using the mixup expression. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
spanLooper	TokenNameIdentifier	 span Looper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
spanLooper	TokenNameIdentifier	 span Looper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Matcher	TokenNameIdentifier	 Matcher
matcher	TokenNameIdentifier	 matcher
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
nextToken	TokenNameIdentifier	 next Token
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
cursor	TokenNameIdentifier	 cursor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
nextCursor	TokenNameIdentifier	 next Cursor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
tokenizerPattern	TokenNameIdentifier	 tokenizer Pattern
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// advance to next token, and check that it's what's expected 	TokenNameCOMMENT_LINE	advance to next token, and check that it's what's expected 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
throws	TokenNamethrows	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Token at Error: "	TokenNameStringLiteral	Token at Error: 
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"statement error: expected one of: "	TokenNameStringLiteral	statement error: expected one of: 
+	TokenNamePLUS	
setContents	TokenNameIdentifier	 set Contents
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
+	TokenNamePLUS	
"^^^"	TokenNameStringLiteral	^^^
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** convert a set to a string listing the elements */	TokenNameCOMMENT_JAVADOC	 convert a set to a string listing the elements 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
setContents	TokenNameIdentifier	 set Contents
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
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
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
set	TokenNameIdentifier	 set
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
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
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
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// recursive descent parser for the BNF above 	TokenNameCOMMENT_LINE	recursive descent parser for the BNF above 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MixupParser	TokenNameIdentifier	 Mixup Parser
{	TokenNameLBRACE	
private	TokenNameprivate	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MixupParser	TokenNameIdentifier	 Mixup Parser
(	TokenNameLPAREN	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Expr	TokenNameIdentifier	 Expr
parseExpr	TokenNameIdentifier	 parse Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// Expr expr1=null; 	TokenNameCOMMENT_LINE	Expr expr1=null; 
Expr	TokenNameIdentifier	 Expr
expr2	TokenNameIdentifier	 expr2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
BasicExpr	TokenNameIdentifier	 Basic Expr
basic	TokenNameIdentifier	 basic
=	TokenNameEQUAL	
parseBasicExpr	TokenNameIdentifier	 parse Basic Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"&&"	TokenNameStringLiteral	&&
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"||"	TokenNameStringLiteral	||
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expr2	TokenNameIdentifier	 expr2
=	TokenNameEQUAL	
parseExpr	TokenNameIdentifier	 parse Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
basic	TokenNameIdentifier	 basic
,	TokenNameCOMMA	
expr2	TokenNameIdentifier	 expr2
,	TokenNameCOMMA	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
BasicExpr	TokenNameIdentifier	 Basic Expr
parseBasicExpr	TokenNameIdentifier	 parse Basic Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expr	TokenNameIdentifier	 Expr
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
parseExpr	TokenNameIdentifier	 parse Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
")"	TokenNameStringLiteral	)
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected close paren"	TokenNameStringLiteral	expected close paren
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// past ')' 	TokenNameCOMMENT_LINE	past ')' 
return	TokenNamereturn	
new	TokenNamenew	
BasicExpr	TokenNameIdentifier	 Basic Expr
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"||"	TokenNameStringLiteral	||
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"&&"	TokenNameStringLiteral	&&
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
")"	TokenNameStringLiteral	)
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parseRepeatedPrim	TokenNameIdentifier	 parse Repeated Prim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"no left bracket"	TokenNameStringLiteral	no left bracket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"no right bracket"	TokenNameStringLiteral	no right bracket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BasicExpr	TokenNameIdentifier	 Basic Expr
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
[	TokenNameLBRACKET	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
parseRepeatedPrim	TokenNameIdentifier	 parse Repeated Prim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"@"	TokenNameStringLiteral	@
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
maxCount	TokenNameIdentifier	 max Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
minCount	TokenNameIdentifier	 min Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
minCount	TokenNameIdentifier	 min Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"L"	TokenNameStringLiteral	L
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
leftMost	TokenNameIdentifier	 left Most
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parsePrim	TokenNameIdentifier	 parse Prim
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseRepeat	TokenNameIdentifier	 parse Repeat
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"R"	TokenNameStringLiteral	R
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
rightMost	TokenNameIdentifier	 right Most
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
expandShortcuts	TokenNameIdentifier	 expand Shortcuts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
checkFunction	TokenNameIdentifier	 check Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"syntax error"	TokenNameStringLiteral	syntax error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parsePrim	TokenNameIdentifier	 parse Prim
(	TokenNameLPAREN	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseSimplePrim	TokenNameIdentifier	 parse Simple Prim
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseSimplePrim	TokenNameIdentifier	 parse Simple Prim
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected '>'"	TokenNameStringLiteral	expected '>'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parseSimplePrim	TokenNameIdentifier	 parse Simple Prim
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parseSimplePrim	TokenNameIdentifier	 parse Simple Prim
(	TokenNameLPAREN	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
Prim	TokenNameIdentifier	 Prim
prim	TokenNameIdentifier	 prim
=	TokenNameEQUAL	
new	TokenNamenew	
Prim	TokenNameIdentifier	 Prim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
negated	TokenNameIdentifier	 negated
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
funcString	TokenNameIdentifier	 func String
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
// int funcLength=tok.token.length(); 	TokenNameCOMMENT_LINE	int funcLength=tok.token.length(); 
// char firstLetter=tok.token.charAt(0); 	TokenNameCOMMENT_LINE	char firstLetter=tok.token.charAt(0); 
if	TokenNameif	
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
A	TokenNameIdentifier	 A
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"eq"	TokenNameStringLiteral	eq
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
EQ	TokenNameIdentifier	 EQ
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"ai"	TokenNameStringLiteral	ai
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
AI	TokenNameIdentifier	 AI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"re"	TokenNameStringLiteral	re
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
RE	TokenNameIdentifier	 RE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"any"	TokenNameStringLiteral	any
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
ANY	TokenNameIdentifier	 ANY
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"eqi"	TokenNameStringLiteral	eqi
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
EQI	TokenNameIdentifier	 EQI
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"..."	TokenNameStringLiteral	...
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
ELIPSE	TokenNameIdentifier	 ELIPSE
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"prop"	TokenNameStringLiteral	prop
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
PROP	TokenNameIdentifier	 PROP
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"propDict"	TokenNameStringLiteral	propDict
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
PROPDICT	TokenNameIdentifier	 PROPDICT
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to argument 	TokenNameCOMMENT_LINE	to argument 
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to ')' 	TokenNameCOMMENT_LINE	to ')' 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
")"	TokenNameStringLiteral	)
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected close paren"	TokenNameStringLiteral	expected close paren
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// past prim 	TokenNameCOMMENT_LINE	past prim 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
funcString	TokenNameIdentifier	 func String
;	TokenNameSEMICOLON	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
PROP	TokenNameIdentifier	 PROP
;	TokenNameSEMICOLON	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
funcString	TokenNameIdentifier	 func String
=	TokenNameEQUAL	
"prop"	TokenNameStringLiteral	prop
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to property value 	TokenNameCOMMENT_LINE	to property value 
if	TokenNameif	
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to '(' 	TokenNameCOMMENT_LINE	to '(' 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"("	TokenNameStringLiteral	(
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"a"	TokenNameStringLiteral	a
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// past value 	TokenNameCOMMENT_LINE	past value 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to dictionary name 	TokenNameCOMMENT_LINE	to dictionary name 
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
PROPDICT	TokenNameIdentifier	 PROPDICT
;	TokenNameSEMICOLON	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
funcString	TokenNameIdentifier	 func String
=	TokenNameEQUAL	
"propDict"	TokenNameStringLiteral	propDict
;	TokenNameSEMICOLON	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
")"	TokenNameStringLiteral	)
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected close paren"	TokenNameStringLiteral	expected close paren
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// past close paren 	TokenNameCOMMENT_LINE	past close paren 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// past value 	TokenNameCOMMENT_LINE	past value 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
expandShortcuts	TokenNameIdentifier	 expand Shortcuts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
prim	TokenNameIdentifier	 prim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parseRepeat	TokenNameIdentifier	 parse Repeat
(	TokenNameLPAREN	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
","	TokenNameStringLiteral	,
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to "," 	TokenNameCOMMENT_LINE	to "," 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
","	TokenNameStringLiteral	,
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected ",""	TokenNameStringLiteral	expected ","
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"}"	TokenNameStringLiteral	}
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to "}" 	TokenNameCOMMENT_LINE	to "}" 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
"-1"	TokenNameStringLiteral	-1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"}"	TokenNameStringLiteral	}
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected "}""	TokenNameStringLiteral	expected "}"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"+"	TokenNameStringLiteral	+
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
"-1"	TokenNameStringLiteral	-1
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
"-1"	TokenNameStringLiteral	-1
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"?"	TokenNameStringLiteral	?
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
"1"	TokenNameStringLiteral	1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
minCount	TokenNameIdentifier	 min Count
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
maxCount	TokenNameIdentifier	 max Count
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected an integer: min = '"	TokenNameStringLiteral	expected an integer: min = '
+	TokenNamePLUS	
min	TokenNameIdentifier	 min
+	TokenNamePLUS	
"' max='"	TokenNameStringLiteral	' max='
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Signals an error in parsing a mixup document. */	TokenNameCOMMENT_JAVADOC	 Signals an error in parsing a mixup document. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ParseException	TokenNameIdentifier	 Parse Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080303L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// encodes a pattern that matches a single TextToken 	TokenNameCOMMENT_LINE	encodes a pattern that matches a single TextToken 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Prim	TokenNameIdentifier	 Prim
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
public	TokenNamepublic	
boolean	TokenNameboolean	
negated	TokenNameIdentifier	 negated
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
funcString	TokenNameIdentifier	 func String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Pattern	TokenNameIdentifier	 Pattern
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** See if the predicate for this pattern succeeds for this TextToken. */	TokenNameCOMMENT_JAVADOC	 See if the predicate for this pattern succeeds for this TextToken. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchesPrim	TokenNameIdentifier	 matches Prim
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
matchesUnnegatedPrim	TokenNameIdentifier	 matches Unnegated Prim
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
negated	TokenNameIdentifier	 negated
==	TokenNameEQUAL_EQUAL	
!	TokenNameNOT	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
matchesUnnegatedPrim	TokenNameIdentifier	 matches Unnegated Prim
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
==	TokenNameEQUAL_EQUAL	
A	TokenNameIdentifier	 A
)	TokenNameRPAREN	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
inDict	TokenNameIdentifier	 in Dict
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//a 	TokenNameCOMMENT_LINE	a 
if	TokenNameif	
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
==	TokenNameEQUAL_EQUAL	
EQ	TokenNameIdentifier	 EQ
)	TokenNameRPAREN	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//eq 	TokenNameCOMMENT_LINE	eq 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
==	TokenNameEQUAL_EQUAL	
AI	TokenNameIdentifier	 AI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ai 	TokenNameCOMMENT_LINE	ai 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lc	TokenNameIdentifier	 lc
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
lcToken	TokenNameIdentifier	 lc Token
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[lcToken "	TokenNameStringLiteral	[lcToken 
+	TokenNamePLUS	
lc	TokenNameIdentifier	 lc
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lc	TokenNameIdentifier	 lc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public int getIndex(){ 	TokenNameCOMMENT_LINE	public int getIndex(){ 
// return 0; 	TokenNameCOMMENT_LINE	return 0; 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
inDict	TokenNameIdentifier	 in Dict
(	TokenNameLPAREN	
lcToken	TokenNameIdentifier	 lc Token
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
==	TokenNameEQUAL_EQUAL	
RE	TokenNameIdentifier	 RE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//re 	TokenNameCOMMENT_LINE	re 
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
==	TokenNameEQUAL_EQUAL	
ANY	TokenNameIdentifier	 ANY
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//any 	TokenNameCOMMENT_LINE	any 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
==	TokenNameEQUAL_EQUAL	
EQI	TokenNameIdentifier	 EQI
)	TokenNameRPAREN	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//eqi 	TokenNameCOMMENT_LINE	eqi 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
==	TokenNameEQUAL_EQUAL	
PROP	TokenNameIdentifier	 PROP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//prop 	TokenNameCOMMENT_LINE	prop 
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
==	TokenNameEQUAL_EQUAL	
PROPDICT	TokenNameIdentifier	 PROPDICT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//propDict 	TokenNameCOMMENT_LINE	propDict 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
propVal	TokenNameIdentifier	 prop Val
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propVal	TokenNameIdentifier	 prop Val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
propValToken	TokenNameIdentifier	 prop Val Token
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[token:"	TokenNameStringLiteral	[token:
+	TokenNamePLUS	
propVal	TokenNameIdentifier	 prop Val
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
propVal	TokenNameIdentifier	 prop Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// public int getIndex(){ 	TokenNameCOMMENT_LINE	public int getIndex(){ 
// return 0; 	TokenNameCOMMENT_LINE	return 0; 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
//System.out.println("testing "+propValToken+" for membership in dict "+value); 	TokenNameCOMMENT_LINE	System.out.println("testing "+propValToken+" for membership in dict "+value); 
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
inDict	TokenNameIdentifier	 in Dict
(	TokenNameLPAREN	
propValToken	TokenNameIdentifier	 prop Val Token
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"illegal function '"	TokenNameStringLiteral	illegal function '
+	TokenNamePLUS	
funcString	TokenNameIdentifier	 func String
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Expand some syntactic sugar-like abbreviations. */	TokenNameCOMMENT_JAVADOC	 Expand some syntactic sugar-like abbreviations. 
public	TokenNamepublic	
void	TokenNamevoid	
expandShortcuts	TokenNameIdentifier	 expand Shortcuts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expand the 'const' abbreviation to eq('const') 	TokenNameCOMMENT_LINE	expand the 'const' abbreviation to eq('const') 
if	TokenNameif	
(	TokenNameLPAREN	
funcString	TokenNameIdentifier	 func String
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
funcString	TokenNameIdentifier	 func String
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
funcString	TokenNameIdentifier	 func String
;	TokenNameSEMICOLON	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
EQ	TokenNameIdentifier	 EQ
;	TokenNameSEMICOLON	
funcString	TokenNameIdentifier	 func String
=	TokenNameEQUAL	
"eq"	TokenNameStringLiteral	eq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// unquote a quoted argument 	TokenNameCOMMENT_LINE	unquote a quoted argument 
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argument	TokenNameIdentifier	 argument
=	TokenNameEQUAL	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"\\'"	TokenNameStringLiteral	\\'
,	TokenNameCOMMA	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// precompile a regex 	TokenNameCOMMENT_LINE	precompile a regex 
if	TokenNameif	
(	TokenNameLPAREN	
RE	TokenNameIdentifier	 RE
==	TokenNameEQUAL_EQUAL	
function	TokenNameIdentifier	 function
)	TokenNameRPAREN	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check for correctness 	TokenNameCOMMENT_LINE	check for correctness 
}	TokenNameRBRACE	
/** is this a legal function? */	TokenNameCOMMENT_JAVADOC	 is this a legal function? 
public	TokenNamepublic	
boolean	TokenNameboolean	
checkFunction	TokenNameIdentifier	 check Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
legalFunctions	TokenNameIdentifier	 legal Functions
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
funcString	TokenNameIdentifier	 func String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
negated	TokenNameIdentifier	 negated
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"!"	TokenNameStringLiteral	!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
PROP	TokenNameIdentifier	 PROP
!=	TokenNameNOT_EQUAL	
function	TokenNameIdentifier	 function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
funcString	TokenNameIdentifier	 func String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
argument	TokenNameIdentifier	 argument
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
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
}	TokenNameRBRACE	
// encodes a pattern matching a series of Token's 	TokenNameCOMMENT_LINE	encodes a pattern matching a series of Token's 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
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
public	TokenNamepublic	
boolean	TokenNameboolean	
leftMost	TokenNameIdentifier	 left Most
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
rightMost	TokenNameIdentifier	 right Most
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Prim	TokenNameIdentifier	 Prim
>	TokenNameGREATER	
primList	TokenNameIdentifier	 prim List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Prim	TokenNameIdentifier	 Prim
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
whereIMatch	TokenNameIdentifier	 where I Match
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
whatIIndexed	TokenNameIdentifier	 what I Indexed
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
minCount	TokenNameIdentifier	 min Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
maxCount	TokenNameIdentifier	 max Count
;	TokenNameSEMICOLON	
// -1 indicates infinity 	TokenNameCOMMENT_LINE	-1 indicates infinity 
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// non-null for @type and @type? 	TokenNameCOMMENT_LINE	non-null for @type and @type? 
/** Expand some syntactic sugar-like abbreviations. */	TokenNameCOMMENT_JAVADOC	 Expand some syntactic sugar-like abbreviations. 
public	TokenNamepublic	
void	TokenNamevoid	
expandShortcuts	TokenNameIdentifier	 expand Shortcuts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expand the 'const' abbreviation to eq('const') 	TokenNameCOMMENT_LINE	expand the 'const' abbreviation to eq('const') 
if	TokenNameif	
(	TokenNameLPAREN	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Prim	TokenNameIdentifier	 Prim
prim	TokenNameIdentifier	 prim
=	TokenNameEQUAL	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ELIPSE	TokenNameIdentifier	 ELIPSE
==	TokenNameEQUAL_EQUAL	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
=	TokenNameEQUAL	
ANY	TokenNameIdentifier	 ANY
;	TokenNameSEMICOLON	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
funcString	TokenNameIdentifier	 func String
=	TokenNameEQUAL	
"any"	TokenNameStringLiteral	any
;	TokenNameSEMICOLON	
minCount	TokenNameIdentifier	 min Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
maxCount	TokenNameIdentifier	 max Count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
checkFunction	TokenNameIdentifier	 check Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Prim	TokenNameIdentifier	 Prim
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
primList	TokenNameIdentifier	 prim List
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
Prim	TokenNameIdentifier	 Prim
prim	TokenNameIdentifier	 prim
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"..."	TokenNameStringLiteral	...
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
funcString	TokenNameIdentifier	 func String
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
checkFunction	TokenNameIdentifier	 check Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minCount	TokenNameIdentifier	 min Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
"?"	TokenNameStringLiteral	?
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
if	TokenNameif	
(	TokenNameLPAREN	
leftMost	TokenNameIdentifier	 left Most
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"L "	TokenNameStringLiteral	L 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Prim	TokenNameIdentifier	 Prim
)	TokenNameRPAREN	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"empty prim list"	TokenNameStringLiteral	empty prim list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
primList	TokenNameIdentifier	 prim List
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
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
minCount	TokenNameIdentifier	 min Count
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
maxCount	TokenNameIdentifier	 max Count
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rightMost	TokenNameIdentifier	 right Most
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"R"	TokenNameStringLiteral	R
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Indexes where tokens match in the PrimList */	TokenNameCOMMENT_JAVADOC	 Indexes where tokens match in the PrimList 
public	TokenNamepublic	
void	TokenNamevoid	
index	TokenNameIdentifier	 index
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
whatIIndexed	TokenNameIdentifier	 what I Indexed
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
whereIMatch	TokenNameIdentifier	 where I Match
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
whereIMatch	TokenNameIdentifier	 where I Match
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
matchesPrimList	TokenNameIdentifier	 matches Prim List
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** See if this pattern matches span.subSpan(lo,len). */	TokenNameCOMMENT_JAVADOC	 See if this pattern matches span.subSpan(lo,len). 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchesSubspan	TokenNameIdentifier	 matches Subspan
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minCount	TokenNameIdentifier	 min Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
hasType	TokenNameIdentifier	 has Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
hasType	TokenNameIdentifier	 has Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// check and see if this span has been indexed or not 	TokenNameCOMMENT_LINE	check and see if this span has been indexed or not 
//String span1 = span.asString(); 	TokenNameCOMMENT_LINE	String span1 = span.asString(); 
//String span2 = ""; 	TokenNameCOMMENT_LINE	String span2 = ""; 
//if(whatIIndexed != null) span2 = whatIIndexed.asString(); 	TokenNameCOMMENT_LINE	if(whatIIndexed != null) span2 = whatIIndexed.asString(); 
//if(!span1.trim().equals(span2.trim())) index(span, labels); 	TokenNameCOMMENT_LINE	if(!span1.trim().equals(span2.trim())) index(span, labels); 
if	TokenNameif	
(	TokenNameLPAREN	
whatIIndexed	TokenNameIdentifier	 what I Indexed
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
whatIIndexed	TokenNameIdentifier	 what I Indexed
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
maxCount	TokenNameIdentifier	 max Count
&&	TokenNameAND_AND	
maxCount	TokenNameIdentifier	 max Count
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
minCount	TokenNameIdentifier	 min Count
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
spanSize	TokenNameIdentifier	 span Size
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
spanSize	TokenNameIdentifier	 span Size
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//if (!matchesPrimList(labels,span.getToken(i))) return false; 	TokenNameCOMMENT_LINE	if (!matchesPrimList(labels,span.getToken(i))) return false; 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
whereIMatch	TokenNameIdentifier	 where I Match
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
leftMost	TokenNameIdentifier	 left Most
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
maxCount	TokenNameIdentifier	 max Count
||	TokenNameOR_OR	
maxCount	TokenNameIdentifier	 max Count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
/*matchesPrimList(labels,span.getToken(lo-1))*/	TokenNameCOMMENT_BLOCK	matchesPrimList(labels,span.getToken(lo-1))
whereIMatch	TokenNameIdentifier	 where I Match
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rightMost	TokenNameIdentifier	 right Most
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
maxCount	TokenNameIdentifier	 max Count
||	TokenNameOR_OR	
maxCount	TokenNameIdentifier	 max Count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
spanSize	TokenNameIdentifier	 span Size
&&	TokenNameAND_AND	
/*matchesPrimList(labels,span.getToken(lo+len))*/	TokenNameCOMMENT_BLOCK	matchesPrimList(labels,span.getToken(lo+len))
whereIMatch	TokenNameIdentifier	 where I Match
[	TokenNameLBRACKET	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
matchesPrimList	TokenNameIdentifier	 matches Prim List
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Prim	TokenNameIdentifier	 Prim
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
primList	TokenNameIdentifier	 prim List
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
Prim	TokenNameIdentifier	 Prim
prim	TokenNameIdentifier	 prim
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
matchesPrim	TokenNameIdentifier	 matches Prim
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// encodes a basicExpr in the BNF above 	TokenNameCOMMENT_LINE	encodes a basicExpr in the BNF above 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
BasicExpr	TokenNameIdentifier	 Basic Expr
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
public	TokenNamepublic	
final	TokenNamefinal	
Expr	TokenNameIdentifier	 Expr
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
repPrim	TokenNameIdentifier	 rep Prim
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
leftBracket	TokenNameIdentifier	 left Bracket
,	TokenNameCOMMA	
rightBracket	TokenNameIdentifier	 right Bracket
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
BasicExpr	TokenNameIdentifier	 Basic Expr
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BasicExpr	TokenNameIdentifier	 Basic Expr
(	TokenNameLPAREN	
Expr	TokenNameIdentifier	 Expr
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repPrim	TokenNameIdentifier	 rep Prim
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
leftBracket	TokenNameIdentifier	 left Bracket
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
rightBracket	TokenNameIdentifier	 right Bracket
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BasicExpr	TokenNameIdentifier	 Basic Expr
(	TokenNameLPAREN	
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
repPrim	TokenNameIdentifier	 rep Prim
,	TokenNameCOMMA	
int	TokenNameint	
leftBracket	TokenNameIdentifier	 left Bracket
,	TokenNameCOMMA	
int	TokenNameint	
rightBracket	TokenNameIdentifier	 right Bracket
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
repPrim	TokenNameIdentifier	 rep Prim
=	TokenNameEQUAL	
repPrim	TokenNameIdentifier	 rep Prim
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
leftBracket	TokenNameIdentifier	 left Bracket
=	TokenNameEQUAL	
leftBracket	TokenNameIdentifier	 left Bracket
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
rightBracket	TokenNameIdentifier	 right Bracket
=	TokenNameEQUAL	
rightBracket	TokenNameIdentifier	 right Bracket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
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
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
leftBracket	TokenNameIdentifier	 left Bracket
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
repPrim	TokenNameIdentifier	 rep Prim
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
rightBracket	TokenNameIdentifier	 right Bracket
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
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
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
spanLooper	TokenNameIdentifier	 span Looper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
spanLooper	TokenNameIdentifier	 span Looper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"mixup"	TokenNameStringLiteral	mixup
,	TokenNameCOMMA	
"span"	TokenNameStringLiteral	span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
accum	TokenNameIdentifier	 accum
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
spanLooper	TokenNameIdentifier	 span Looper
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
spanLooper	TokenNameIdentifier	 span Looper
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// match(labels,accum,span,new int[repPrim.length],new int[repPrim.length],1,0,0); 	TokenNameCOMMENT_LINE	match(labels,accum,span,new int[repPrim.length],new int[repPrim.length],1,0,0); 
fastMatch	TokenNameIdentifier	 fast Match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
accum	TokenNameIdentifier	 accum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// most time taken here 	TokenNameCOMMENT_LINE	most time taken here 
private	TokenNameprivate	
void	TokenNamevoid	
fastMatch	TokenNameIdentifier	 fast Match
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
accum	TokenNameIdentifier	 accum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// log.debug("span size: " + span.size() + " - " + span.asString()); 	TokenNameCOMMENT_LINE	log.debug("span size: " + span.size() + " - " + span.asString()); 
// there are at most span.length^2 matches of every repeated primitive 	TokenNameCOMMENT_LINE	there are at most span.length^2 matches of every repeated primitive 
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"matching span id/size="	TokenNameStringLiteral	matching span id/size=
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"before alloc: max/free="	TokenNameStringLiteral	before alloc: max/free=
+	TokenNamePLUS	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
maxMemory	TokenNameIdentifier	 max Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We may overflow the int datatype if there are too many tokens in the span, in which case we should use 	TokenNameCOMMENT_LINE	We may overflow the int datatype if there are too many tokens in the span, in which case we should use 
// the largest available int as it is highly unlikely that there will *actually* be anywhere near that 	TokenNameCOMMENT_LINE	the largest available int as it is highly unlikely that there will *actually* be anywhere near that 
// many matches to store. 	TokenNameCOMMENT_LINE	many matches to store. 
//int maxRepeatedPrimMatches = span.size() * (span.size()+1); 	TokenNameCOMMENT_LINE	int maxRepeatedPrimMatches = span.size() * (span.size()+1); 
int	TokenNameint	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// overflow 	TokenNameCOMMENT_LINE	overflow 
else	TokenNameelse	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now apply any constraints that may further limit the number of possible matches 	TokenNameCOMMENT_LINE	Now apply any constraints that may further limit the number of possible matches 
if	TokenNameif	
(	TokenNameLPAREN	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
>	TokenNameGREATER	
minMatchesToApplyConstraints	TokenNameIdentifier	 min Matches To Apply Constraints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxNumberOfMatchesPerToken	TokenNameIdentifier	 max Number Of Matches Per Token
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the span is large enough (ie has more than Integer.MAX_VALUE/maxNumberOfMatchesPerToken tokens) then we will 	TokenNameCOMMENT_LINE	If the span is large enough (ie has more than Integer.MAX_VALUE/maxNumberOfMatchesPerToken tokens) then we will 
// overflow int again here so check for that and only attempt to adjust for the constraint if it will 	TokenNameCOMMENT_LINE	overflow int again here so check for that and only attempt to adjust for the constraint if it will 
// succeed. Otherwise stick with the maximum int value. 	TokenNameCOMMENT_LINE	succeed. Otherwise stick with the maximum int value. 
if	TokenNameif	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
/	TokenNameDIVIDE	
maxNumberOfMatchesPerToken	TokenNameIdentifier	 max Number Of Matches Per Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
maxNumberOfMatchesPerToken	TokenNameIdentifier	 max Number Of Matches Per Token
*	TokenNameMULTIPLY	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now we can arbitrarily set a limit to the number of matches so if this is the case, then we should 	TokenNameCOMMENT_LINE	Now we can arbitrarily set a limit to the number of matches so if this is the case, then we should 
// use that limit if it is larger than the number of possible matches we computed. 	TokenNameCOMMENT_LINE	use that limit if it is larger than the number of possible matches we computed. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxNumberOfMatches	TokenNameIdentifier	 max Number Of Matches
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
maxNumberOfMatches	TokenNameIdentifier	 max Number Of Matches
<	TokenNameLESS	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
=	TokenNameEQUAL	
maxNumberOfMatches	TokenNameIdentifier	 max Number Of Matches
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
loIndexBuffer	TokenNameIdentifier	 lo Index Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lengthBuffer	TokenNameIdentifier	 length Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"alloc hi-lo: max/free="	TokenNameStringLiteral	alloc hi-lo: max/free=
+	TokenNamePLUS	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
maxMemory	TokenNameIdentifier	 max Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// store possible places that repPrim[i] can match 	TokenNameCOMMENT_LINE	store possible places that repPrim[i] can match 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
possibleLos	TokenNameIdentifier	 possible Los
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
possibleLens	TokenNameIdentifier	 possible Lens
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// also record min/max length 	TokenNameCOMMENT_LINE	also record min/max length 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minLen	TokenNameIdentifier	 min Len
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
maxLen	TokenNameIdentifier	 max Len
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isAny	TokenNameIdentifier	 is Any
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"after alloc: max/free="	TokenNameStringLiteral	after alloc: max/free=
+	TokenNamePLUS	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
maxMemory	TokenNameIdentifier	 max Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// work out possible lengths for repPrim[i] 	TokenNameCOMMENT_LINE	work out possible lengths for repPrim[i] 
RepeatedPrim	TokenNameIdentifier	 Repeated Prim
rp	TokenNameIdentifier	 rp
=	TokenNameEQUAL	
repPrim	TokenNameIdentifier	 rep Prim
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
minLen	TokenNameIdentifier	 min Len
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
minCount	TokenNameIdentifier	 min Count
;	TokenNameSEMICOLON	
maxLen	TokenNameIdentifier	 max Len
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
maxCount	TokenNameIdentifier	 max Count
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
maxCount	TokenNameIdentifier	 max Count
<	TokenNameLESS	
maxLen	TokenNameIdentifier	 max Len
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
maxLen	TokenNameIdentifier	 max Len
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
maxCount	TokenNameIdentifier	 max Count
;	TokenNameSEMICOLON	
// see if repPrim[i] is "any" 	TokenNameCOMMENT_LINE	see if repPrim[i] is "any" 
if	TokenNameif	
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Prim	TokenNameIdentifier	 Prim
prim	TokenNameIdentifier	 prim
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Prim	TokenNameIdentifier	 Prim
)	TokenNameRPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
primList	TokenNameIdentifier	 prim List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isAny	TokenNameIdentifier	 is Any
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ANY	TokenNameIdentifier	 ANY
==	TokenNameEQUAL_EQUAL	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
function	TokenNameIdentifier	 function
&&	TokenNameAND_AND	
!	TokenNameNOT	
prim	TokenNameIdentifier	 prim
.	TokenNameDOT	
negated	TokenNameIdentifier	 negated
&&	TokenNameAND_AND	
!	TokenNameNOT	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
leftMost	TokenNameIdentifier	 left Most
&&	TokenNameAND_AND	
!	TokenNameNOT	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
rightMost	TokenNameIdentifier	 right Most
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAny	TokenNameIdentifier	 is Any
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find all places this matches 	TokenNameCOMMENT_LINE	find all places this matches 
int	TokenNameint	
numMatches	TokenNameIdentifier	 num Matches
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// look up matches from the labels for a spantype repPrim, eg @foo 	TokenNameCOMMENT_LINE	look up matches from the labels for a spantype repPrim, eg @foo 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
el	TokenNameIdentifier	 el
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numMatches	TokenNameIdentifier	 num Matches
>=	TokenNameGREATER_EQUAL	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
)	TokenNameRPAREN	
{	TokenNameLBRACE	
overflowWarning	TokenNameIdentifier	 overflow Warning
(	TokenNameLPAREN	
numMatches	TokenNameIdentifier	 num Matches
,	TokenNameCOMMA	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
el	TokenNameIdentifier	 el
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numMatches	TokenNameIdentifier	 num Matches
>=	TokenNameGREATER_EQUAL	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
)	TokenNameRPAREN	
{	TokenNameLBRACE	
overflowWarning	TokenNameIdentifier	 overflow Warning
(	TokenNameLPAREN	
numMatches	TokenNameIdentifier	 num Matches
,	TokenNameCOMMA	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
loIndexBuffer	TokenNameIdentifier	 lo Index Buffer
[	TokenNameLBRACKET	
numMatches	TokenNameIdentifier	 num Matches
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lengthBuffer	TokenNameIdentifier	 length Buffer
[	TokenNameLBRACKET	
numMatches	TokenNameIdentifier	 num Matches
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numMatches	TokenNameIdentifier	 num Matches
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
minCount	TokenNameIdentifier	 min Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// something besides @foo or @foo? 	TokenNameCOMMENT_LINE	something besides @foo or @foo? 
// check all possible subspans 	TokenNameCOMMENT_LINE	check all possible subspans 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
topLen	TokenNameIdentifier	 top Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
maxLen	TokenNameIdentifier	 max Len
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
minLen	TokenNameIdentifier	 min Len
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
topLen	TokenNameIdentifier	 top Len
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numMatches	TokenNameIdentifier	 num Matches
>=	TokenNameGREATER_EQUAL	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
)	TokenNameRPAREN	
{	TokenNameLBRACE	
overflowWarning	TokenNameIdentifier	 overflow Warning
(	TokenNameLPAREN	
numMatches	TokenNameIdentifier	 num Matches
,	TokenNameCOMMA	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//84% time taken in matchesSubspan 	TokenNameCOMMENT_LINE	84% time taken in matchesSubspan 
if	TokenNameif	
(	TokenNameLPAREN	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
matchesSubspan	TokenNameIdentifier	 matches Subspan
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loIndexBuffer	TokenNameIdentifier	 lo Index Buffer
[	TokenNameLBRACKET	
numMatches	TokenNameIdentifier	 num Matches
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
lengthBuffer	TokenNameIdentifier	 length Buffer
[	TokenNameLBRACKET	
numMatches	TokenNameIdentifier	 num Matches
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
numMatches	TokenNameIdentifier	 num Matches
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// save matches from buffer into loIndices, lengths 	TokenNameCOMMENT_LINE	save matches from buffer into loIndices, lengths 
possibleLos	TokenNameIdentifier	 possible Los
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numMatches	TokenNameIdentifier	 num Matches
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
possibleLens	TokenNameIdentifier	 possible Lens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numMatches	TokenNameIdentifier	 num Matches
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
<	TokenNameLESS	
numMatches	TokenNameIdentifier	 num Matches
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
possibleLos	TokenNameIdentifier	 possible Los
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
loIndexBuffer	TokenNameIdentifier	 lo Index Buffer
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
possibleLens	TokenNameIdentifier	 possible Lens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lengthBuffer	TokenNameIdentifier	 length Buffer
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// now find a good series of loIndex/length pairs 	TokenNameCOMMENT_LINE	now find a good series of loIndex/length pairs 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lows	TokenNameIdentifier	 lows
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
highs	TokenNameIdentifier	 highs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fastMatch	TokenNameIdentifier	 fast Match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
accum	TokenNameIdentifier	 accum
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
possibleLos	TokenNameIdentifier	 possible Los
,	TokenNameCOMMA	
possibleLens	TokenNameIdentifier	 possible Lens
,	TokenNameCOMMA	
isAny	TokenNameIdentifier	 is Any
,	TokenNameCOMMA	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
overflowWarning	TokenNameIdentifier	 overflow Warning
(	TokenNameLPAREN	
int	TokenNameint	
numMatches	TokenNameIdentifier	 num Matches
,	TokenNameCOMMA	
int	TokenNameint	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"mixup warning at pattern #"	TokenNameStringLiteral	mixup warning at pattern #
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
repPrim	TokenNameIdentifier	 rep Prim
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
") on "	TokenNameStringLiteral	) on 
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"not enough room to store all matches: adjust Mixup.maxNumberOfMatches(PerToken)"	TokenNameStringLiteral	not enough room to store all matches: adjust Mixup.maxNumberOfMatches(PerToken)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"size="	TokenNameStringLiteral	size=
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" numMatches="	TokenNameStringLiteral	 numMatches=
+	TokenNamePLUS	
numMatches	TokenNameIdentifier	 num Matches
+	TokenNamePLUS	
" max="	TokenNameStringLiteral	 max=
+	TokenNamePLUS	
maxRepeatedPrimMatches	TokenNameIdentifier	 max Repeated Prim Matches
+	TokenNamePLUS	
" minConstraint="	TokenNameStringLiteral	 minConstraint=
+	TokenNamePLUS	
minMatchesToApplyConstraints	TokenNameIdentifier	 min Matches To Apply Constraints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
fastMatch	TokenNameIdentifier	 fast Match
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
// passed along to subroutines 	TokenNameCOMMENT_LINE	passed along to subroutines 
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
accum	TokenNameIdentifier	 accum
,	TokenNameCOMMA	
// accumulate matches 	TokenNameCOMMENT_LINE	accumulate matches 
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
// span being matched 	TokenNameCOMMENT_LINE	span being matched 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
// lows[i] is lo index of match to repPrim[i] 	TokenNameCOMMENT_LINE	lows[i] is lo index of match to repPrim[i] 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
// highs[i] is high index of match to repPrim[i] 	TokenNameCOMMENT_LINE	highs[i] is high index of match to repPrim[i] 
int	TokenNameint	
tab	TokenNameIdentifier	 tab
,	TokenNameCOMMA	
// for debugging 	TokenNameCOMMENT_LINE	for debugging 
int	TokenNameint	
spanCursor	TokenNameIdentifier	 span Cursor
,	TokenNameCOMMA	
// index into the span being matched 	TokenNameCOMMENT_LINE	index into the span being matched 
int	TokenNameint	
patternCursor	TokenNameIdentifier	 pattern Cursor
,	TokenNameCOMMA	
// index into the repPrim's being matched 	TokenNameCOMMENT_LINE	index into the repPrim's being matched 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
possibleLos	TokenNameIdentifier	 possible Los
,	TokenNameCOMMA	
// loIndices[i] is all places repPrim[i] might match 	TokenNameCOMMENT_LINE	loIndices[i] is all places repPrim[i] might match 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
possibleLens	TokenNameIdentifier	 possible Lens
,	TokenNameCOMMA	
// lengths[i] is parallel-to-loIndices array of lengths 	TokenNameCOMMENT_LINE	lengths[i] is parallel-to-loIndices array of lengths 
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isAny	TokenNameIdentifier	 is Any
,	TokenNameCOMMA	
// true if repPrim[i] is "any" 	TokenNameCOMMENT_LINE	true if repPrim[i] is "any" 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
// min lengths of subseq matching an isAny==true repPrim[i] 	TokenNameCOMMENT_LINE	min lengths of subseq matching an isAny==true repPrim[i] 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
// max lengths of subseq matching an isAny==true repPrim[i] 	TokenNameCOMMENT_LINE	max lengths of subseq matching an isAny==true repPrim[i] 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
patternCursor	TokenNameIdentifier	 pattern Cursor
==	TokenNameEQUAL_EQUAL	
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spanCursor	TokenNameIdentifier	 span Cursor
==	TokenNameEQUAL_EQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a complete, successful match 	TokenNameCOMMENT_LINE	a complete, successful match 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
showMatch	TokenNameIdentifier	 show Match
(	TokenNameLPAREN	
tab	TokenNameIdentifier	 tab
,	TokenNameCOMMA	
"complete"	TokenNameStringLiteral	complete
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
patternCursor	TokenNameIdentifier	 pattern Cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
lows	TokenNameIdentifier	 lows
[	TokenNameLBRACKET	
leftBracket	TokenNameIdentifier	 left Bracket
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
highs	TokenNameIdentifier	 highs
[	TokenNameLBRACKET	
rightBracket	TokenNameIdentifier	 right Bracket
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// a deadend 	TokenNameCOMMENT_LINE	a deadend 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
showMatch	TokenNameIdentifier	 show Match
(	TokenNameLPAREN	
tab	TokenNameIdentifier	 tab
,	TokenNameCOMMA	
"failed"	TokenNameStringLiteral	failed
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
patternCursor	TokenNameIdentifier	 pattern Cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// continue a partial match 	TokenNameCOMMENT_LINE	continue a partial match 
if	TokenNameif	
(	TokenNameLPAREN	
isAny	TokenNameIdentifier	 is Any
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
repPrim	TokenNameIdentifier	 rep Prim
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
!	TokenNameNOT	
isAny	TokenNameIdentifier	 is Any
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// trick to handle something like '...' followed by a specific pattern 	TokenNameCOMMENT_LINE	trick to handle something like '...' followed by a specific pattern 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
possibleLos	TokenNameIdentifier	 possible Los
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nextSpanCursor	TokenNameIdentifier	 next Span Cursor
=	TokenNameEQUAL	
possibleLos	TokenNameIdentifier	 possible Los
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
nextSpanCursor	TokenNameIdentifier	 next Span Cursor
-	TokenNameMINUS	
spanCursor	TokenNameIdentifier	 span Cursor
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>=	TokenNameGREATER_EQUAL	
minLen	TokenNameIdentifier	 min Len
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
maxLen	TokenNameIdentifier	 max Len
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lows	TokenNameIdentifier	 lows
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
spanCursor	TokenNameIdentifier	 span Cursor
;	TokenNameSEMICOLON	
highs	TokenNameIdentifier	 highs
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
spanCursor	TokenNameIdentifier	 span Cursor
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
showMatch	TokenNameIdentifier	 show Match
(	TokenNameLPAREN	
tab	TokenNameIdentifier	 tab
,	TokenNameCOMMA	
"partial"	TokenNameStringLiteral	partial
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fastMatch	TokenNameIdentifier	 fast Match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
accum	TokenNameIdentifier	 accum
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
tab	TokenNameIdentifier	 tab
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
spanCursor	TokenNameIdentifier	 span Cursor
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
possibleLos	TokenNameIdentifier	 possible Los
,	TokenNameCOMMA	
possibleLens	TokenNameIdentifier	 possible Lens
,	TokenNameCOMMA	
isAny	TokenNameIdentifier	 is Any
,	TokenNameCOMMA	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
topLen	TokenNameIdentifier	 top Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
maxLen	TokenNameIdentifier	 max Len
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
spanCursor	TokenNameIdentifier	 span Cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
minLen	TokenNameIdentifier	 min Len
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
topLen	TokenNameIdentifier	 top Len
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lows	TokenNameIdentifier	 lows
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
spanCursor	TokenNameIdentifier	 span Cursor
;	TokenNameSEMICOLON	
highs	TokenNameIdentifier	 highs
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
spanCursor	TokenNameIdentifier	 span Cursor
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
showMatch	TokenNameIdentifier	 show Match
(	TokenNameLPAREN	
tab	TokenNameIdentifier	 tab
,	TokenNameCOMMA	
"partial"	TokenNameStringLiteral	partial
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fastMatch	TokenNameIdentifier	 fast Match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
accum	TokenNameIdentifier	 accum
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
tab	TokenNameIdentifier	 tab
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
spanCursor	TokenNameIdentifier	 span Cursor
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
possibleLos	TokenNameIdentifier	 possible Los
,	TokenNameCOMMA	
possibleLens	TokenNameIdentifier	 possible Lens
,	TokenNameCOMMA	
isAny	TokenNameIdentifier	 is Any
,	TokenNameCOMMA	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
topLen	TokenNameIdentifier	 top Len
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
spanCursor	TokenNameIdentifier	 span Cursor
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
possibleLos	TokenNameIdentifier	 possible Los
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
possibleLos	TokenNameIdentifier	 possible Los
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
spanCursor	TokenNameIdentifier	 span Cursor
&&	TokenNameAND_AND	
possibleLens	TokenNameIdentifier	 possible Lens
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
topLen	TokenNameIdentifier	 top Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
possibleLens	TokenNameIdentifier	 possible Lens
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lows	TokenNameIdentifier	 lows
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
spanCursor	TokenNameIdentifier	 span Cursor
;	TokenNameSEMICOLON	
highs	TokenNameIdentifier	 highs
[	TokenNameLBRACKET	
patternCursor	TokenNameIdentifier	 pattern Cursor
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
spanCursor	TokenNameIdentifier	 span Cursor
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
showMatch	TokenNameIdentifier	 show Match
(	TokenNameLPAREN	
tab	TokenNameIdentifier	 tab
,	TokenNameCOMMA	
"partial"	TokenNameStringLiteral	partial
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fastMatch	TokenNameIdentifier	 fast Match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
accum	TokenNameIdentifier	 accum
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
tab	TokenNameIdentifier	 tab
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
spanCursor	TokenNameIdentifier	 span Cursor
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
patternCursor	TokenNameIdentifier	 pattern Cursor
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
possibleLos	TokenNameIdentifier	 possible Los
,	TokenNameCOMMA	
possibleLens	TokenNameIdentifier	 possible Lens
,	TokenNameCOMMA	
isAny	TokenNameIdentifier	 is Any
,	TokenNameCOMMA	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
maxLen	TokenNameIdentifier	 max Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// obsolete slower match routine, kept around as a reference implementation for debugging 	TokenNameCOMMENT_LINE	obsolete slower match routine, kept around as a reference implementation for debugging 
// 	TokenNameCOMMENT_LINE	 
// private void match(TextLabels env,Set accum,Span span,int[] lows, 	TokenNameCOMMENT_LINE	private void match(TextLabels env,Set accum,Span span,int[] lows, 
// int[] highs,int tab,int spanCursor,int patternCursor){ 	TokenNameCOMMENT_LINE	int[] highs,int tab,int spanCursor,int patternCursor){ 
// if(patternCursor==repPrim.length){ 	TokenNameCOMMENT_LINE	if(patternCursor==repPrim.length){ 
// if(spanCursor==span.size()){ 	TokenNameCOMMENT_LINE	if(spanCursor==span.size()){ 
// // a complete, successful match 	TokenNameCOMMENT_LINE	// a complete, successful match 
// if(DEBUG) 	TokenNameCOMMENT_LINE	if(DEBUG) 
// showMatch(tab,"complete",span,lows,highs,patternCursor); 	TokenNameCOMMENT_LINE	showMatch(tab,"complete",span,lows,highs,patternCursor); 
// int lo=lows[leftBracket]; 	TokenNameCOMMENT_LINE	int lo=lows[leftBracket]; 
// int hi=highs[rightBracket-1]; 	TokenNameCOMMENT_LINE	int hi=highs[rightBracket-1]; 
// accum.add(span.subSpan(lo,hi-lo)); 	TokenNameCOMMENT_LINE	accum.add(span.subSpan(lo,hi-lo)); 
// }else{ 	TokenNameCOMMENT_LINE	}else{ 
// // a deadend 	TokenNameCOMMENT_LINE	// a deadend 
// if(DEBUG) 	TokenNameCOMMENT_LINE	if(DEBUG) 
// showMatch(tab,"failed",span,lows,highs,patternCursor); 	TokenNameCOMMENT_LINE	showMatch(tab,"failed",span,lows,highs,patternCursor); 
// } 	TokenNameCOMMENT_LINE	} 
// }else{ 	TokenNameCOMMENT_LINE	}else{ 
// // continue a partial match 	TokenNameCOMMENT_LINE	// continue a partial match 
// RepeatedPrim nextPattern=repPrim[patternCursor]; 	TokenNameCOMMENT_LINE	RepeatedPrim nextPattern=repPrim[patternCursor]; 
// int maxLen=span.size()-spanCursor; 	TokenNameCOMMENT_LINE	int maxLen=span.size()-spanCursor; 
// if(nextPattern.maxCount>=0&&nextPattern.maxCount<maxLen) 	TokenNameCOMMENT_LINE	if(nextPattern.maxCount>=0&&nextPattern.maxCount<maxLen) 
// maxLen=nextPattern.maxCount; 	TokenNameCOMMENT_LINE	maxLen=nextPattern.maxCount; 
// for(int len=nextPattern.minCount;len<=maxLen;len++){ 	TokenNameCOMMENT_LINE	for(int len=nextPattern.minCount;len<=maxLen;len++){ 
// // 84% time taken in matchesSubspan 	TokenNameCOMMENT_LINE	// 84% time taken in matchesSubspan 
// boolean lenOk=nextPattern.matchesSubspan(env,span,spanCursor,len); 	TokenNameCOMMENT_LINE	boolean lenOk=nextPattern.matchesSubspan(env,span,spanCursor,len); 
// if(lenOk){ 	TokenNameCOMMENT_LINE	if(lenOk){ 
// lows[patternCursor]=spanCursor; 	TokenNameCOMMENT_LINE	lows[patternCursor]=spanCursor; 
// highs[patternCursor]=spanCursor+len; 	TokenNameCOMMENT_LINE	highs[patternCursor]=spanCursor+len; 
// if(DEBUG) 	TokenNameCOMMENT_LINE	if(DEBUG) 
// showMatch(tab,"partial",span,lows,highs,patternCursor+1); 	TokenNameCOMMENT_LINE	showMatch(tab,"partial",span,lows,highs,patternCursor+1); 
// match(env,accum,span,lows,highs,tab+1,spanCursor+len, 	TokenNameCOMMENT_LINE	match(env,accum,span,lows,highs,tab+1,spanCursor+len, 
// patternCursor+1); 	TokenNameCOMMENT_LINE	patternCursor+1); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// for debugging 	TokenNameCOMMENT_LINE	for debugging 
private	TokenNameprivate	
void	TokenNamevoid	
showMatch	TokenNameIdentifier	 show Match
(	TokenNameLPAREN	
int	TokenNameint	
tab	TokenNameIdentifier	 tab
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lows	TokenNameIdentifier	 lows
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
highs	TokenNameIdentifier	 highs
,	TokenNameCOMMA	
int	TokenNameint	
patternCursor	TokenNameIdentifier	 pattern Cursor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tab	TokenNameIdentifier	 tab
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"| "	TokenNameStringLiteral	| 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
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
patternCursor	TokenNameIdentifier	 pattern Cursor
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
repPrim	TokenNameIdentifier	 rep Prim
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
lows	TokenNameIdentifier	 lows
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
highs	TokenNameIdentifier	 highs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]<"	TokenNameStringLiteral	]<
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
lows	TokenNameIdentifier	 lows
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
highs	TokenNameIdentifier	 highs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
lows	TokenNameIdentifier	 lows
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// encodes an expression in the BNF above 	TokenNameCOMMENT_LINE	encodes an expression in the BNF above 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Expr	TokenNameIdentifier	 Expr
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
private	TokenNameprivate	
BasicExpr	TokenNameIdentifier	 Basic Expr
expr1	TokenNameIdentifier	 expr1
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Expr	TokenNameIdentifier	 Expr
expr2	TokenNameIdentifier	 expr2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Expr	TokenNameIdentifier	 Expr
(	TokenNameLPAREN	
BasicExpr	TokenNameIdentifier	 Basic Expr
expr1	TokenNameIdentifier	 expr1
,	TokenNameCOMMA	
Expr	TokenNameIdentifier	 Expr
expr2	TokenNameIdentifier	 expr2
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
expr1	TokenNameIdentifier	 expr1
=	TokenNameEQUAL	
expr1	TokenNameIdentifier	 expr1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
expr2	TokenNameIdentifier	 expr2
=	TokenNameEQUAL	
expr2	TokenNameIdentifier	 expr2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
spanIt	TokenNameIdentifier	 span It
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expr2	TokenNameIdentifier	 expr2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expr1	TokenNameIdentifier	 expr1
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
spanIt	TokenNameIdentifier	 span It
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"&&"	TokenNameStringLiteral	&&
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expr2	TokenNameIdentifier	 expr2
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
expr1	TokenNameIdentifier	 expr1
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
spanIt	TokenNameIdentifier	 span It
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"||"	TokenNameStringLiteral	||
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"illegal operator '"	TokenNameStringLiteral	illegal operator '
+	TokenNamePLUS	
op	TokenNameIdentifier	 op
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// copy the input looper 	TokenNameCOMMENT_LINE	copy the input looper 
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
save	TokenNameIdentifier	 save
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
spanIt	TokenNameIdentifier	 span It
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
save	TokenNameIdentifier	 save
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
spanIt	TokenNameIdentifier	 span It
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// union the outputs of expr1 and expr2 	TokenNameCOMMENT_LINE	union the outputs of expr1 and expr2 
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
expr1	TokenNameIdentifier	 expr1
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
save	TokenNameIdentifier	 save
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
expr2	TokenNameIdentifier	 expr2
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
save	TokenNameIdentifier	 save
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
union	TokenNameIdentifier	 union
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
union	TokenNameIdentifier	 union
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
union	TokenNameIdentifier	 union
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
union	TokenNameIdentifier	 union
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
expr1	TokenNameIdentifier	 expr1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expr2	TokenNameIdentifier	 expr2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
op	TokenNameIdentifier	 op
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
expr2	TokenNameIdentifier	 expr2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// interactive test routine 	TokenNameCOMMENT_LINE	interactive test routine 
// 	TokenNameCOMMENT_LINE	 
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
Mixup	TokenNameIdentifier	 Mixup
mixup	TokenNameIdentifier	 mixup
=	TokenNameEQUAL	
new	TokenNamenew	
Mixup	TokenNameIdentifier	 Mixup
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"normalized expression = "	TokenNameStringLiteral	normalized expression = 
+	TokenNamePLUS	
mixup	TokenNameIdentifier	 mixup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
"arg_"	TokenNameStringLiteral	arg_
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
new	TokenNamenew	
BoneheadStemmer	TokenNameIdentifier	 Bonehead Stemmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("labels="+labels); 	TokenNameCOMMENT_LINE	System.out.println("labels="+labels); 
//labels.addWord("the", "det"); 	TokenNameCOMMENT_LINE	labels.addWord("the", "det"); 
//labels.addWord("thi", "det"); 	TokenNameCOMMENT_LINE	labels.addWord("thi", "det"); 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
