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
Collections	TokenNameIdentifier	 Collections
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Statement	TokenNameIdentifier	 Statement
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
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
Statement	TokenNameIdentifier	 Statement
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
REGEX	TokenNameIdentifier	 REGEX
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
MIXUP	TokenNameIdentifier	 MIXUP
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
FILTER	TokenNameIdentifier	 FILTER
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
PROVIDE	TokenNameIdentifier	 PROVIDE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
REQUIRE	TokenNameIdentifier	 REQUIRE
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
DECLARE	TokenNameIdentifier	 DECLARE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TRIE	TokenNameIdentifier	 TRIE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ANNOTATE_WITH	TokenNameIdentifier	 ANNOTATE  WITH
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//TODO: We should handle these properties better, possibly using a java properties object 	TokenNameCOMMENT_LINE	TODO: We should handle these properties better, possibly using a java properties object 
// encodes the statement properties 	TokenNameCOMMENT_LINE	encodes the statement properties 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
keyword	TokenNameIdentifier	 keyword
,	TokenNameCOMMA	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
startType	TokenNameIdentifier	 start Type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// set of words, for a dictionary 	TokenNameCOMMENT_LINE	set of words, for a dictionary 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
wordSet	TokenNameIdentifier	 word Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// file containing dictionary 	TokenNameCOMMENT_LINE	file containing dictionary 
// private File dictFile=null; 	TokenNameCOMMENT_LINE	private File dictFile=null; 
// Variable for whether to ignore case in dictionary 	TokenNameCOMMENT_LINE	Variable for whether to ignore case in dictionary 
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
;	TokenNameSEMICOLON	
// split string for retokenizing textBase 	TokenNameCOMMENT_LINE	split string for retokenizing textBase 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
split	TokenNameIdentifier	 split
,	TokenNameCOMMA	
patt	TokenNameIdentifier	 patt
;	TokenNameSEMICOLON	
// current tokenization level 	TokenNameCOMMENT_LINE	current tokenization level 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
// Variables that define the level and type to be imported to the current textBase 	TokenNameCOMMENT_LINE	Variables that define the level and type to be imported to the current textBase 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
importLevel	TokenNameIdentifier	 import Level
,	TokenNameCOMMA	
importType	TokenNameIdentifier	 import Type
,	TokenNameCOMMA	
oldType	TokenNameIdentifier	 old Type
;	TokenNameSEMICOLON	
// encode generator 	TokenNameCOMMENT_LINE	encode generator 
private	TokenNameprivate	
int	TokenNameint	
statementType	TokenNameIdentifier	 statement Type
;	TokenNameSEMICOLON	
// for statementType = MIXUP or FILTER 	TokenNameCOMMENT_LINE	for statementType = MIXUP or FILTER 
private	TokenNameprivate	
Mixup	TokenNameIdentifier	 Mixup
mixupExpr	TokenNameIdentifier	 mixup Expr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// for statementType TRIE 	TokenNameCOMMENT_LINE	for statementType TRIE 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
phraseList	TokenNameIdentifier	 phrase List
;	TokenNameSEMICOLON	
// for statementType = REGEX 	TokenNameCOMMENT_LINE	for statementType = REGEX 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
regexGroup	TokenNameIdentifier	 regex Group
;	TokenNameSEMICOLON	
// for statementType=PROVIDE,REQUIRE,ANNOTATEWITH,DICTIONARY 	TokenNameCOMMENT_LINE	for statementType=PROVIDE,REQUIRE,ANNOTATEWITH,DICTIONARY 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
fileToLoad	TokenNameIdentifier	 file To Load
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
filesToLoad	TokenNameIdentifier	 files To Load
;	TokenNameSEMICOLON	
// for parsing 	TokenNameCOMMENT_LINE	for parsing 
// private Matcher matcher; 	TokenNameCOMMENT_LINE	private Matcher matcher; 
// for TRIE 	TokenNameCOMMENT_LINE	for TRIE 
private	TokenNameprivate	
int	TokenNameint	
lastTokenStart	TokenNameIdentifier	 last Token Start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
generatorStart	TokenNameIdentifier	 generator Start
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
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
private	TokenNameprivate	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
colonEqualsOrCase	TokenNameIdentifier	 colon Equals Or Case
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
defLevelType	TokenNameIdentifier	 def Level Type
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
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
colonEqualsOrCase	TokenNameIdentifier	 colon Equals Or Case
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colonEqualsOrCase	TokenNameIdentifier	 colon Equals Or Case
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colonEqualsOrCase	TokenNameIdentifier	 colon Equals Or Case
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"case"	TokenNameStringLiteral	case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
generatorStart	TokenNameIdentifier	 generator Start
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
generatorStart	TokenNameIdentifier	 generator Start
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"~"	TokenNameStringLiteral	~
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
generatorStart	TokenNameIdentifier	 generator Start
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
defLevelType	TokenNameIdentifier	 def Level Type
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"re"	TokenNameStringLiteral	re
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defLevelType	TokenNameIdentifier	 def Level Type
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"split"	TokenNameStringLiteral	split
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defLevelType	TokenNameIdentifier	 def Level Type
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"filter"	TokenNameStringLiteral	filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defLevelType	TokenNameIdentifier	 def Level Type
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"pseudotoken"	TokenNameStringLiteral	pseudotoken
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// constructor and parser 	TokenNameCOMMENT_LINE	constructor and parser 
// 	TokenNameCOMMENT_LINE	 
Statement	TokenNameIdentifier	 Statement
(	TokenNameLPAREN	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
MixupTokenizer	TokenNameIdentifier	 Mixup Tokenizer
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
firstTok	TokenNameIdentifier	 first Tok
)	TokenNameRPAREN	
throws	TokenNamethrows	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
keyword	TokenNameIdentifier	 keyword
=	TokenNameEQUAL	
firstTok	TokenNameIdentifier	 first Tok
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"declareSpanType"	TokenNameStringLiteral	declareSpanType
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statementType	TokenNameIdentifier	 statement Type
=	TokenNameEQUAL	
DECLARE	TokenNameIdentifier	 DECLARE
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// advance to end-of-statement marker 	TokenNameCOMMENT_LINE	advance to end-of-statement marker 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"provide"	TokenNameStringLiteral	provide
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statementType	TokenNameIdentifier	 statement Type
=	TokenNameEQUAL	
PROVIDE	TokenNameIdentifier	 PROVIDE
;	TokenNameSEMICOLON	
annotationType	TokenNameIdentifier	 annotation Type
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
annotationType	TokenNameIdentifier	 annotation Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotationType	TokenNameIdentifier	 annotation Type
=	TokenNameEQUAL	
annotationType	TokenNameIdentifier	 annotation Type
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
annotationType	TokenNameIdentifier	 annotation Type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// added to parse ";" -frank 	TokenNameCOMMENT_LINE	added to parse ";" -frank 
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"annotateWith"	TokenNameStringLiteral	annotateWith
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statementType	TokenNameIdentifier	 statement Type
=	TokenNameEQUAL	
ANNOTATE_WITH	TokenNameIdentifier	 ANNOTATE  WITH
;	TokenNameSEMICOLON	
fileToLoad	TokenNameIdentifier	 file To Load
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileToLoad	TokenNameIdentifier	 file To Load
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileToLoad	TokenNameIdentifier	 file To Load
=	TokenNameEQUAL	
fileToLoad	TokenNameIdentifier	 file To Load
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fileToLoad	TokenNameIdentifier	 file To Load
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"require"	TokenNameStringLiteral	require
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statementType	TokenNameIdentifier	 statement Type
=	TokenNameEQUAL	
REQUIRE	TokenNameIdentifier	 REQUIRE
;	TokenNameSEMICOLON	
annotationType	TokenNameIdentifier	 annotation Type
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
annotationType	TokenNameIdentifier	 annotation Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotationType	TokenNameIdentifier	 annotation Type
=	TokenNameEQUAL	
annotationType	TokenNameIdentifier	 annotation Type
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
annotationType	TokenNameIdentifier	 annotation Type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
marker	TokenNameIdentifier	 marker
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Collections.singleton(",")); 	TokenNameCOMMENT_LINE	Collections.singleton(",")); 
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"marker: "	TokenNameStringLiteral	marker: 
+	TokenNamePLUS	
marker	TokenNameIdentifier	 marker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
marker	TokenNameIdentifier	 marker
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fileToLoad	TokenNameIdentifier	 file To Load
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileToLoad	TokenNameIdentifier	 file To Load
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
fileToLoad	TokenNameIdentifier	 file To Load
=	TokenNameEQUAL	
fileToLoad	TokenNameIdentifier	 file To Load
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fileToLoad	TokenNameIdentifier	 file To Load
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"onLevel"	TokenNameStringLiteral	onLevel
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"offLevel"	TokenNameStringLiteral	offLevel
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"importFromLevel"	TokenNameStringLiteral	importFromLevel
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
importLevel	TokenNameIdentifier	 import Level
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// continue to parse NEWTYPE = OLDTYPE 	TokenNameCOMMENT_LINE	continue to parse NEWTYPE = OLDTYPE 
importType	TokenNameIdentifier	 import Type
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read property or type 	TokenNameCOMMENT_LINE	read property or type 
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldType	TokenNameIdentifier	 old Type
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// advance to end-of-statement marker 	TokenNameCOMMENT_LINE	advance to end-of-statement marker 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
propOrType	TokenNameIdentifier	 prop Or Type
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read property or type 	TokenNameCOMMENT_LINE	read property or type 
// importType = propOrType; 	TokenNameCOMMENT_LINE	importType = propOrType; 
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
colonEqualsOrCase	TokenNameIdentifier	 colon Equals Or Case
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read ':' or '=' 	TokenNameCOMMENT_LINE	read ':' or '=' 
if	TokenNameif	
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"defSpanProp"	TokenNameStringLiteral	defSpanProp
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"defTokenProp"	TokenNameStringLiteral	defTokenProp
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"can't define properties here"	TokenNameStringLiteral	can't define properties here
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
propOrType	TokenNameIdentifier	 prop Or Type
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"case"	TokenNameStringLiteral	case
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"defDict"	TokenNameStringLiteral	defDict
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"illegal keyword usage"	TokenNameStringLiteral	illegal keyword usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// token is '=' 	TokenNameCOMMENT_LINE	token is '=' 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"defSpanType"	TokenNameStringLiteral	defSpanType
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"defDict"	TokenNameStringLiteral	defDict
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
"defLevel"	TokenNameStringLiteral	defLevel
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"illegal keyword usage"	TokenNameStringLiteral	illegal keyword usage
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"="	TokenNameStringLiteral	=
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected '='"	TokenNameStringLiteral	expected '='
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
propOrType	TokenNameIdentifier	 prop Or Type
;	TokenNameSEMICOLON	
property	TokenNameIdentifier	 property
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"defDict"	TokenNameStringLiteral	defDict
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// syntax is "defDict [+case] dictName = ", so either 	TokenNameCOMMENT_LINE	syntax is "defDict [+case] dictName = ", so either 
// propOrType = dictName and token = '=', or else 	TokenNameCOMMENT_LINE	propOrType = dictName and token = '=', or else 
// propOrType = + and token = 'case', or else 	TokenNameCOMMENT_LINE	propOrType = + and token = 'case', or else 
ignoreCase	TokenNameIdentifier	 ignore Case
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"case"	TokenNameStringLiteral	case
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ignoreCase	TokenNameIdentifier	 ignore Case
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
"+"	TokenNameStringLiteral	+
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
propOrType	TokenNameIdentifier	 prop Or Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"illegal defDict"	TokenNameStringLiteral	illegal defDict
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
"="	TokenNameStringLiteral	=
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
propOrType	TokenNameIdentifier	 prop Or Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wordSet	TokenNameIdentifier	 word Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesToLoad	TokenNameIdentifier	 files To Load
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read in each line of the file name embraced by double quotes 	TokenNameCOMMENT_LINE	read in each line of the file name embraced by double quotes 
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
defFile	TokenNameIdentifier	 def File
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
)	TokenNameRPAREN	
defFile	TokenNameIdentifier	 def File
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fileToLoad	TokenNameIdentifier	 file To Load
=	TokenNameEQUAL	
defFile	TokenNameIdentifier	 def File
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesToLoad	TokenNameIdentifier	 files To Load
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fileToLoad	TokenNameIdentifier	 file To Load
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
wordSet	TokenNameIdentifier	 word Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
?	TokenNameQUESTION	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
sep	TokenNameIdentifier	 sep
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sep	TokenNameIdentifier	 sep
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
","	TokenNameStringLiteral	,
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sep	TokenNameIdentifier	 sep
)	TokenNameRPAREN	
)	TokenNameRPAREN	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected comma"	TokenNameStringLiteral	expected comma
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"defLevel"	TokenNameStringLiteral	defLevel
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
split	TokenNameIdentifier	 split
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
defLevelType	TokenNameIdentifier	 def Level Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patt	TokenNameIdentifier	 patt
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
patt	TokenNameIdentifier	 patt
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
patt	TokenNameIdentifier	 patt
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
patt	TokenNameIdentifier	 patt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
patt	TokenNameIdentifier	 patt
=	TokenNameEQUAL	
patt	TokenNameIdentifier	 patt
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
patt	TokenNameIdentifier	 patt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// GEN 	TokenNameCOMMENT_LINE	GEN 
// should be at '=' sign or starttype 	TokenNameCOMMENT_LINE	should be at '=' sign or starttype 
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
generatorStart	TokenNameIdentifier	 generator Start
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startType	TokenNameIdentifier	 start Type
=	TokenNameEQUAL	
"top"	TokenNameStringLiteral	top
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
startType	TokenNameIdentifier	 start Type
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
generatorStart	TokenNameIdentifier	 generator Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statementType	TokenNameIdentifier	 statement Type
=	TokenNameEQUAL	
MIXUP	TokenNameIdentifier	 MIXUP
;	TokenNameSEMICOLON	
//mixupExpr = new Mixup( tok.input.substring(tok.matcher.end(1),tok.input.length()) ); 	TokenNameCOMMENT_LINE	mixupExpr = new Mixup( tok.input.substring(tok.matcher.end(1),tok.input.length()) ); 
//if(tok.advance()) 	TokenNameCOMMENT_LINE	if(tok.advance()) 
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
mixupExpr	TokenNameIdentifier	 mixup Expr
=	TokenNameEQUAL	
new	TokenNamenew	
Mixup	TokenNameIdentifier	 Mixup
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statementType	TokenNameIdentifier	 statement Type
=	TokenNameEQUAL	
FILTER	TokenNameIdentifier	 FILTER
;	TokenNameSEMICOLON	
//mixupExpr = new Mixup( tok.input.substring(tok.matcher.end(1),tok.input.length()) ); 	TokenNameCOMMENT_LINE	mixupExpr = new Mixup( tok.input.substring(tok.matcher.end(1),tok.input.length()) ); 
//if(tok.advance()) 	TokenNameCOMMENT_LINE	if(tok.advance()) 
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
mixupExpr	TokenNameIdentifier	 mixup Expr
=	TokenNameEQUAL	
new	TokenNamenew	
Mixup	TokenNameIdentifier	 Mixup
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"~"	TokenNameStringLiteral	~
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"re"	TokenNameStringLiteral	re
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statementType	TokenNameIdentifier	 statement Type
=	TokenNameEQUAL	
REGEX	TokenNameIdentifier	 REGEX
;	TokenNameSEMICOLON	
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"\\'"	TokenNameStringLiteral	\\'
,	TokenNameCOMMA	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singleton	TokenNameIdentifier	 singleton
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
regexGroup	TokenNameIdentifier	 regex Group
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected a regex group number and saw "	TokenNameStringLiteral	expected a regex group number and saw 
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"trie"	TokenNameStringLiteral	trie
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statementType	TokenNameIdentifier	 statement Type
=	TokenNameEQUAL	
TRIE	TokenNameIdentifier	 TRIE
;	TokenNameSEMICOLON	
phraseList	TokenNameIdentifier	 phrase List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fullWord	TokenNameIdentifier	 full Word
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fullWord	TokenNameIdentifier	 full Word
=	TokenNameEQUAL	
fullWord	TokenNameIdentifier	 full Word
+	TokenNamePLUS	
word	TokenNameIdentifier	 word
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fullWord	TokenNameIdentifier	 full Word
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fullWord	TokenNameIdentifier	 full Word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fullWord	TokenNameIdentifier	 full Word
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fullWord	TokenNameIdentifier	 full Word
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//String[] phrases = (String[])phraseList.toArray(); 	TokenNameCOMMENT_LINE	String[] phrases = (String[])phraseList.toArray(); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
"expected 're' or 'trie'"	TokenNameStringLiteral	expected 're' or 'trie'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"unexpected generatorStart '"	TokenNameStringLiteral	unexpected generatorStart '
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** convert a set to a string listing the elements */	TokenNameCOMMENT_JAVADOC	 convert a set to a string listing the elements 
// private String setContents(Set set){ 	TokenNameCOMMENT_LINE	private String setContents(Set set){ 
// StringBuffer buf=new StringBuffer(""); 	TokenNameCOMMENT_LINE	StringBuffer buf=new StringBuffer(""); 
// for(Iterator i=set.iterator();i.hasNext();){ 	TokenNameCOMMENT_LINE	for(Iterator i=set.iterator();i.hasNext();){ 
// if(buf.length()>0) 	TokenNameCOMMENT_LINE	if(buf.length()>0) 
// buf.append(" "); 	TokenNameCOMMENT_LINE	buf.append(" "); 
// buf.append("'"+i.next().toString()+"'"); 	TokenNameCOMMENT_LINE	buf.append("'"+i.next().toString()+"'"); 
// } 	TokenNameCOMMENT_LINE	} 
// return buf.toString(); 	TokenNameCOMMENT_LINE	return buf.toString(); 
// } 	TokenNameCOMMENT_LINE	} 
// an error message 	TokenNameCOMMENT_LINE	an error message 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
parseError	TokenNameIdentifier	 parse Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
(	TokenNameLPAREN	
"statement error at char "	TokenNameStringLiteral	statement error at char 
+	TokenNamePLUS	
lastTokenStart	TokenNameIdentifier	 last Token Start
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
+	TokenNamePLUS	
" in '"	TokenNameStringLiteral	 in '
+	TokenNamePLUS	
input	TokenNameIdentifier	 input
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
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
"defDict"	TokenNameStringLiteral	defDict
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"defLevel"	TokenNameStringLiteral	defLevel
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" = ... "	TokenNameStringLiteral	 = ... 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"onLevel"	TokenNameStringLiteral	onLevel
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"offLevel"	TokenNameStringLiteral	offLevel
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"importFromLevel"	TokenNameStringLiteral	importFromLevel
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
keyword	TokenNameIdentifier	 keyword
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
importLevel	TokenNameIdentifier	 import Level
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
importType	TokenNameIdentifier	 import Type
+	TokenNamePLUS	
" = "	TokenNameStringLiteral	 = 
+	TokenNamePLUS	
oldType	TokenNameIdentifier	 old Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statementType	TokenNameIdentifier	 statement Type
==	TokenNameEQUAL_EQUAL	
DECLARE	TokenNameIdentifier	 DECLARE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statementType	TokenNameIdentifier	 statement Type
==	TokenNameEQUAL_EQUAL	
PROVIDE	TokenNameIdentifier	 PROVIDE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
annotationType	TokenNameIdentifier	 annotation Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statementType	TokenNameIdentifier	 statement Type
==	TokenNameEQUAL_EQUAL	
REQUIRE	TokenNameIdentifier	 REQUIRE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
annotationType	TokenNameIdentifier	 annotation Type
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
fileToLoad	TokenNameIdentifier	 file To Load
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statementType	TokenNameIdentifier	 statement Type
==	TokenNameEQUAL_EQUAL	
ANNOTATE_WITH	TokenNameIdentifier	 ANNOTATE  WITH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
fileToLoad	TokenNameIdentifier	 file To Load
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
genString	TokenNameIdentifier	 gen String
=	TokenNameEQUAL	
"???"	TokenNameStringLiteral	???
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
statementType	TokenNameIdentifier	 statement Type
==	TokenNameEQUAL_EQUAL	
MIXUP	TokenNameIdentifier	 MIXUP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genString	TokenNameIdentifier	 gen String
=	TokenNameEQUAL	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
mixupExpr	TokenNameIdentifier	 mixup Expr
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statementType	TokenNameIdentifier	 statement Type
==	TokenNameEQUAL_EQUAL	
FILTER	TokenNameIdentifier	 FILTER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genString	TokenNameIdentifier	 gen String
=	TokenNameEQUAL	
"- "	TokenNameStringLiteral	- 
+	TokenNamePLUS	
mixupExpr	TokenNameIdentifier	 mixup Expr
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statementType	TokenNameIdentifier	 statement Type
==	TokenNameEQUAL_EQUAL	
REGEX	TokenNameIdentifier	 REGEX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genString	TokenNameIdentifier	 gen String
=	TokenNameEQUAL	
"~ re '"	TokenNameStringLiteral	~ re '
+	TokenNamePLUS	
regex	TokenNameIdentifier	 regex
+	TokenNamePLUS	
"' ,"	TokenNameStringLiteral	' ,
+	TokenNamePLUS	
regexGroup	TokenNameIdentifier	 regex Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
statementType	TokenNameIdentifier	 statement Type
==	TokenNameEQUAL_EQUAL	
TRIE	TokenNameIdentifier	 TRIE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
genString	TokenNameIdentifier	 gen String
=	TokenNameEQUAL	
"~ trie ..."	TokenNameStringLiteral	~ trie ...
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" ="	TokenNameStringLiteral	 =
+	TokenNamePLUS	
startType	TokenNameIdentifier	 start Type
+	TokenNamePLUS	
genString	TokenNameIdentifier	 gen String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
property	TokenNameIdentifier	 property
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
" ="	TokenNameStringLiteral	 =
+	TokenNamePLUS	
startType	TokenNameIdentifier	 start Type
+	TokenNamePLUS	
genString	TokenNameIdentifier	 gen String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// From here down are public accessors to the properties of this Statement. In the future 	TokenNameCOMMENT_LINE	From here down are public accessors to the properties of this Statement. In the future 
// this should be changed to use a better data store for less cumbersome access 	TokenNameCOMMENT_LINE	this should be changed to use a better data store for less cumbersome access 
// 	TokenNameCOMMENT_LINE	 
/** * Returns an integer representing the type this Statement is. Valid types are: * DECLARE, PROVIDE, REQUIRE, ANNOTATE_WITH, MIXUP, FILTER, REGEX, and TRIE. */	TokenNameCOMMENT_JAVADOC	 Returns an integer representing the type this Statement is. Valid types are: DECLARE, PROVIDE, REQUIRE, ANNOTATE_WITH, MIXUP, FILTER, REGEX, and TRIE. 
public	TokenNamepublic	
int	TokenNameint	
getStatementType	TokenNameIdentifier	 get Statement Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
statementType	TokenNameIdentifier	 statement Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the keyword that defines what this Statement does. */	TokenNameCOMMENT_JAVADOC	 Returns the keyword that defines what this Statement does. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyword	TokenNameIdentifier	 get Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyword	TokenNameIdentifier	 keyword
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a list of the files that need to be loaded if this Statement * defines a dictionary. */	TokenNameCOMMENT_JAVADOC	 Returns a list of the files that need to be loaded if this Statement defines a dictionary. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getFilesToLoad	TokenNameIdentifier	 get Files To Load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filesToLoad	TokenNameIdentifier	 files To Load
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the file that needs to be loaded in this Statement is an * ANNOTATE_WITH or REQUIRE statement. */	TokenNameCOMMENT_JAVADOC	 Returns the file that needs to be loaded in this Statement is an ANNOTATE_WITH or REQUIRE statement. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFileToLoad	TokenNameIdentifier	 get File To Load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fileToLoad	TokenNameIdentifier	 file To Load
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type that this Statement matches. */	TokenNameCOMMENT_JAVADOC	 Returns the type that this Statement matches. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the property that this statement matches */	TokenNameCOMMENT_JAVADOC	 Returns the property that this statement matches 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value that this statement will match. */	TokenNameCOMMENT_JAVADOC	 Returns the value that this statement will match. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether or not this statement will ignore case when defining a dictionary. */	TokenNameCOMMENT_JAVADOC	 Returns whether or not this statement will ignore case when defining a dictionary. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIgnoreCase	TokenNameIdentifier	 get Ignore Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ignoreCase	TokenNameIdentifier	 ignore Case
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the set of words defining a dictionary in the case that this statement * defines a dictionary inline. */	TokenNameCOMMENT_JAVADOC	 Returns the set of words defining a dictionary in the case that this statement defines a dictionary inline. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getWordSet	TokenNameIdentifier	 get Word Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wordSet	TokenNameIdentifier	 word Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type of level to create when this Statement is defining a level. */	TokenNameCOMMENT_JAVADOC	 Returns the type of level to create when this Statement is defining a level. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSplit	TokenNameIdentifier	 get Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
split	TokenNameIdentifier	 split
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the pattern that is used to create a new level when this statement * is defining a new level. */	TokenNameCOMMENT_JAVADOC	 Returns the pattern that is used to create a new level when this statement is defining a new level. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPatt	TokenNameIdentifier	 get Patt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
patt	TokenNameIdentifier	 patt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the level name to be used when this statement is performing a level * operation (onLevel, offLeve, defLevel, importFromLevel) */	TokenNameCOMMENT_JAVADOC	 Returns the level name to be used when this statement is performing a level operation (onLevel, offLeve, defLevel, importFromLevel) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type from the source level that should be imported when this statement * executes an importFromLevel call. */	TokenNameCOMMENT_JAVADOC	 Returns the type from the source level that should be imported when this statement executes an importFromLevel call. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOldType	TokenNameIdentifier	 get Old Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
oldType	TokenNameIdentifier	 old Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type that imported spans should be called when this statement * executes an importFromLevel call. */	TokenNameCOMMENT_JAVADOC	 Returns the type that imported spans should be called when this statement executes an importFromLevel call. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getImportType	TokenNameIdentifier	 get Import Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
importType	TokenNameIdentifier	 import Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the level that this statement will import from in a call to importFromLevel. */	TokenNameCOMMENT_JAVADOC	 Returns the level that this statement will import from in a call to importFromLevel. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
importLevel	TokenNameIdentifier	 import Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type that this statement either provides or requires. */	TokenNameCOMMENT_JAVADOC	 Returns the type that this statement either provides or requires. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAnnotationType	TokenNameIdentifier	 get Annotation Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
annotationType	TokenNameIdentifier	 annotation Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the starting type in the case that this statement is a generator statement. */	TokenNameCOMMENT_JAVADOC	 Returns the starting type in the case that this statement is a generator statement. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStartType	TokenNameIdentifier	 get Start Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startType	TokenNameIdentifier	 start Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the mixup expression that this statement will execute. */	TokenNameCOMMENT_JAVADOC	 Returns the mixup expression that this statement will execute. 
public	TokenNamepublic	
Mixup	TokenNameIdentifier	 Mixup
getMixupExpr	TokenNameIdentifier	 get Mixup Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mixupExpr	TokenNameIdentifier	 mixup Expr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the phrase list for when this statement will define a trie. */	TokenNameCOMMENT_JAVADOC	 Returns the phrase list for when this statement will define a trie. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getPhraseList	TokenNameIdentifier	 get Phrase List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
phraseList	TokenNameIdentifier	 phrase List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the regex string that will be executed by this statement. */	TokenNameCOMMENT_JAVADOC	 Returns the regex string that will be executed by this statement. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRegex	TokenNameIdentifier	 get Regex
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the regex group that will be returned when this statement executes. */	TokenNameCOMMENT_JAVADOC	 Returns the regex group that will be returned when this statement executes. 
public	TokenNamepublic	
int	TokenNameint	
getRegexGroup	TokenNameIdentifier	 get Regex Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
regexGroup	TokenNameIdentifier	 regex Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
