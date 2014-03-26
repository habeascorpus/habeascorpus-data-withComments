package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
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
FileReader	TokenNameIdentifier	 File Reader
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
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
/** * The ExtractAbbrev class implements a simple algorithm for * extraction of abbreviations and their definitions from biomedical * text. Abbreviations (short forms) are extracted from the input * file, and those abbreviations for which a definition (long form) is * found are printed out, along with that definition, one per line. * * See: * A Simple Algorithm for Identifying Abbreviation Definitions in Biomedical Text * A.S. Schwartz, M.A. Hearst; Pacific Symposium on Biocomputing 8:451-462(2003) * for a detailed description of the algorithm. (http://biotext.berkeley.edu/papers/psb03.pdf) * * @author Ariel Schwartz and William Cohen * @version 03/12/03 and 11/04 * */	TokenNameCOMMENT_JAVADOC	 The ExtractAbbrev class implements a simple algorithm for extraction of abbreviations and their definitions from biomedical text. Abbreviations (short forms) are extracted from the input file, and those abbreviations for which a definition (long form) is found are printed out, along with that definition, one per line. * See: A Simple Algorithm for Identifying Abbreviation Definitions in Biomedical Text A.S. Schwartz, M.A. Hearst; Pacific Symposium on Biocomputing 8:451-462(2003) for a detailed description of the algorithm. (http://biotext.berkeley.edu/papers/psb03.pdf) * @author Ariel Schwartz and William Cohen @version 03/12/03 and 11/04 
public	TokenNamepublic	
class	TokenNameclass	
ExtractAbbrev	TokenNameIdentifier	 Extract Abbrev
extends	TokenNameextends	
AbstractAnnotator	TokenNameIdentifier	 Abstract Annotator
{	TokenNameLBRACE	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
ExtractAbbrev	TokenNameIdentifier	 Extract Abbrev
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The annotation type provided by this annotator. */	TokenNameCOMMENT_JAVADOC	 The annotation type provided by this annotator. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PROVIDED_ANNOTATION	TokenNameIdentifier	 PROVIDED  ANNOTATION
=	TokenNameEQUAL	
"abbrev"	TokenNameStringLiteral	abbrev
;	TokenNameSEMICOLON	
/** The type asserted for extracted acronyms */	TokenNameCOMMENT_JAVADOC	 The type asserted for extracted acronyms 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SHORT_FORM_TYPE	TokenNameIdentifier	 SHORT  FORM  TYPE
=	TokenNameEQUAL	
"abbrevShort"	TokenNameStringLiteral	abbrevShort
;	TokenNameSEMICOLON	
/** The type asserted for expansions of extracted acronyms */	TokenNameCOMMENT_JAVADOC	 The type asserted for expansions of extracted acronyms 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LONG_FORM_TYPE	TokenNameIdentifier	 LONG  FORM  TYPE
=	TokenNameEQUAL	
"abbrevLong"	TokenNameStringLiteral	abbrevLong
;	TokenNameSEMICOLON	
/** This property links an extracted acronym to its expansion */	TokenNameCOMMENT_JAVADOC	 This property links an extracted acronym to its expansion 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LONG_FORM_PROP	TokenNameIdentifier	 LONG  FORM  PROP
=	TokenNameEQUAL	
"expansion"	TokenNameStringLiteral	expansion
;	TokenNameSEMICOLON	
/** This property links an expansion to its acronym */	TokenNameCOMMENT_JAVADOC	 This property links an expansion to its acronym 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SHORT_FORM_PROP	TokenNameIdentifier	 SHORT  FORM  PROP
=	TokenNameEQUAL	
"acronym"	TokenNameStringLiteral	acronym
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
mTestDefinitions	TokenNameIdentifier	 m Test Definitions
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
truePositives	TokenNameIdentifier	 true Positives
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
falsePositives	TokenNameIdentifier	 false Positives
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
falseNegatives	TokenNameIdentifier	 false Negatives
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
trueNegatives	TokenNameIdentifier	 true Negatives
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
DELIMITER	TokenNameIdentifier	 DELIMITER
=	TokenNameEQUAL	
'\t'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
testMode	TokenNameIdentifier	 test Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// added by wcohen - implements the AbstractAnnotator interface 	TokenNameCOMMENT_LINE	added by wcohen - implements the AbstractAnnotator interface 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
StringSpan	TokenNameIdentifier	 String Span
>	TokenNameGREATER	
accum	TokenNameIdentifier	 accum
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
StringSpan	TokenNameIdentifier	 String Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// accumulator, used by Schwartz's code 	TokenNameCOMMENT_LINE	accumulator, used by Schwartz's code 
private	TokenNameprivate	
boolean	TokenNameboolean	
annotationMode	TokenNameIdentifier	 annotation Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// flag, used by Schwartz's code 	TokenNameCOMMENT_LINE	flag, used by Schwartz's code 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
doAnnotate	TokenNameIdentifier	 do Annotate
(	TokenNameLPAREN	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotationMode	TokenNameIdentifier	 annotation Mode
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
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
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentContents	TokenNameIdentifier	 get Document Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// call Schwartz's code to fill up accum with short,long pairs 	TokenNameCOMMENT_LINE	call Schwartz's code to fill up accum with short,long pairs 
extractAbbrPairsFromString	TokenNameIdentifier	 extract Abbr Pairs From String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// build annotations based on the contents of the accumulator 	TokenNameCOMMENT_LINE	build annotations based on the contents of the accumulator 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
StringSpan	TokenNameIdentifier	 String Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
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
StringSpan	TokenNameIdentifier	 String Span
shortForm	TokenNameIdentifier	 short Form
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringSpan	TokenNameIdentifier	 String Span
longForm	TokenNameIdentifier	 long Form
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
shortSpan	TokenNameIdentifier	 short Span
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"shortSpan["	TokenNameStringLiteral	shortSpan[
+	TokenNamePLUS	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
".."	TokenNameStringLiteral	..
+	TokenNamePLUS	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
+	TokenNamePLUS	
"] of doc: near '"	TokenNameStringLiteral	] of doc: near '
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentContents	TokenNameIdentifier	 get Document Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"shortForm='"	TokenNameStringLiteral	shortForm='
+	TokenNamePLUS	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' shortSpan='"	TokenNameStringLiteral	' shortSpan='
+	TokenNamePLUS	
shortSpan	TokenNameIdentifier	 short Span
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
longSpan	TokenNameIdentifier	 long Span
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
shortSpan	TokenNameIdentifier	 short Span
,	TokenNameCOMMA	
SHORT_FORM_TYPE	TokenNameIdentifier	 SHORT  FORM  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
longSpan	TokenNameIdentifier	 long Span
,	TokenNameCOMMA	
LONG_FORM_TYPE	TokenNameIdentifier	 LONG  FORM  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
shortSpan	TokenNameIdentifier	 short Span
,	TokenNameCOMMA	
SHORT_FORM_PROP	TokenNameIdentifier	 SHORT  FORM  PROP
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
longSpan	TokenNameIdentifier	 long Span
,	TokenNameCOMMA	
LONG_FORM_PROP	TokenNameIdentifier	 LONG  FORM  PROP
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
annotationMode	TokenNameIdentifier	 annotation Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setAnnotatedBy	TokenNameIdentifier	 set Annotated By
(	TokenNameLPAREN	
PROVIDED_ANNOTATION	TokenNameIdentifier	 PROVIDED  ANNOTATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explainAnnotation	TokenNameIdentifier	 explain Annotation
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"No explanation implemented."	TokenNameStringLiteral	No explanation implemented.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isValidShortForm	TokenNameIdentifier	 is Valid Short Form
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
hasLetter	TokenNameIdentifier	 has Letter
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasLetter	TokenNameIdentifier	 has Letter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
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
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
hasCapital	TokenNameIdentifier	 has Capital
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
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
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isUpperCase	TokenNameIdentifier	 is Upper Case
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
loadTrueDefinitions	TokenNameIdentifier	 load True Definitions
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inFile	TokenNameIdentifier	 in File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
abbrString	TokenNameIdentifier	 abbr String
,	TokenNameCOMMA	
defnString	TokenNameIdentifier	 defn String
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
definitions	TokenNameIdentifier	 definitions
=	TokenNameEQUAL	
mTestDefinitions	TokenNameIdentifier	 m Test Definitions
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
fin	TokenNameIdentifier	 fin
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
inFile	TokenNameIdentifier	 in File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
fin	TokenNameIdentifier	 fin
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
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
DELIMITER	TokenNameIdentifier	 DELIMITER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abbrString	TokenNameIdentifier	 abbr String
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defnString	TokenNameIdentifier	 defn String
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
definitions	TokenNameIdentifier	 definitions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
abbrString	TokenNameIdentifier	 abbr String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
defnString	TokenNameIdentifier	 defn String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
definitions	TokenNameIdentifier	 definitions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
abbrString	TokenNameIdentifier	 abbr String
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
isTrueDefinition	TokenNameIdentifier	 is True Definition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
shortForm	TokenNameIdentifier	 short Form
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
longForm	TokenNameIdentifier	 long Form
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
itr	TokenNameIdentifier	 itr
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
mTestDefinitions	TokenNameIdentifier	 m Test Definitions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
itr	TokenNameIdentifier	 itr
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
itr	TokenNameIdentifier	 itr
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
itr	TokenNameIdentifier	 itr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
longForm	TokenNameIdentifier	 long Form
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
extractAbbrPairsFromFile	TokenNameIdentifier	 extract Abbr Pairs From File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
inFile	TokenNameIdentifier	 in File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
fin	TokenNameIdentifier	 fin
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
inFile	TokenNameIdentifier	 in File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
fin	TokenNameIdentifier	 fin
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
+=	TokenNamePLUS_EQUAL	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
extractAbbrPairsFromString	TokenNameIdentifier	 extract Abbr Pairs From String
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
extractAbbrPairsFromString	TokenNameIdentifier	 extract Abbr Pairs From String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
currString	TokenNameIdentifier	 curr String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sentence	TokenNameIdentifier	 sentence
=	TokenNameEQUAL	
currString	TokenNameIdentifier	 curr String
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\.\s{2}"	TokenNameStringLiteral	\.\s{2}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
sentence	TokenNameIdentifier	 sentence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extractAbbrPairsFromSentence	TokenNameIdentifier	 extract Abbr Pairs From Sentence
(	TokenNameLPAREN	
new	TokenNamenew	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
currString	TokenNameIdentifier	 curr String
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
sentence	TokenNameIdentifier	 sentence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
sentence	TokenNameIdentifier	 sentence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// the +3 is for the period and the two following spaces 	TokenNameCOMMENT_LINE	the +3 is for the period and the two following spaces 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Holds a substring of a longer string. */	TokenNameCOMMENT_JAVADOC	 Holds a substring of a longer string. 
static	TokenNamestatic	
private	TokenNameprivate	
class	TokenNameclass	
StringSpan	TokenNameIdentifier	 String Span
{	TokenNameLBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
StringSpan	TokenNameIdentifier	 String Span
EMPTY	TokenNameIdentifier	 EMPTY
=	TokenNameEQUAL	
new	TokenNamenew	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
mySubstring	TokenNameIdentifier	 my Substring
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
mySubstring	TokenNameIdentifier	 my Substring
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
StringSpan	TokenNameIdentifier	 String Span
ss	TokenNameIdentifier	 ss
,	TokenNameCOMMA	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mySubstring	TokenNameIdentifier	 my Substring
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//public int offset() { return lo; } 	TokenNameCOMMENT_LINE	public int offset() { return lo; } 
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mySubstring	TokenNameIdentifier	 my Substring
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mySubstring	TokenNameIdentifier	 my Substring
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mySubstring	TokenNameIdentifier	 my Substring
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mySubstring	TokenNameIdentifier	 my Substring
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mySubstring	TokenNameIdentifier	 my Substring
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mySubstring	TokenNameIdentifier	 my Substring
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mySubstring	TokenNameIdentifier	 my Substring
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StringSpan	TokenNameIdentifier	 String Span
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
int	TokenNameint	
newLo	TokenNameIdentifier	 new Lo
,	TokenNameCOMMA	
int	TokenNameint	
newHi	TokenNameIdentifier	 new Hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
newLo	TokenNameIdentifier	 new Lo
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
newHi	TokenNameIdentifier	 new Hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StringSpan	TokenNameIdentifier	 String Span
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
int	TokenNameint	
newLo	TokenNameIdentifier	 new Lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
newLo	TokenNameIdentifier	 new Lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StringSpan	TokenNameIdentifier	 String Span
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringSpan	TokenNameIdentifier	 String Span
ss	TokenNameIdentifier	 ss
=	TokenNameEQUAL	
new	TokenNamenew	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
<	TokenNameLESS	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
>	TokenNameGREATER	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
mySubstring	TokenNameIdentifier	 my Substring
=	TokenNameEQUAL	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
ss	TokenNameIdentifier	 ss
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ss	TokenNameIdentifier	 ss
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
extractAbbrPairsFromSentence	TokenNameIdentifier	 extract Abbr Pairs From Sentence
(	TokenNameLPAREN	
StringSpan	TokenNameIdentifier	 String Span
currSentence	TokenNameIdentifier	 curr Sentence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringSpan	TokenNameIdentifier	 String Span
longForm	TokenNameIdentifier	 long Form
=	TokenNameEQUAL	
StringSpan	TokenNameIdentifier	 String Span
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
StringSpan	TokenNameIdentifier	 String Span
shortForm	TokenNameIdentifier	 short Form
=	TokenNameEQUAL	
StringSpan	TokenNameIdentifier	 String Span
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
int	TokenNameint	
openParenIndex	TokenNameIdentifier	 open Paren Index
,	TokenNameCOMMA	
closeParenIndex	TokenNameIdentifier	 close Paren Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sentenceEnd	TokenNameIdentifier	 sentence End
,	TokenNameCOMMA	
newCloseParenIndex	TokenNameIdentifier	 new Close Paren Index
,	TokenNameCOMMA	
tmpIndex	TokenNameIdentifier	 tmp Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
shortTokenizer	TokenNameIdentifier	 short Tokenizer
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"finding pairs in '"	TokenNameStringLiteral	finding pairs in '
+	TokenNamePLUS	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openParenIndex	TokenNameIdentifier	 open Paren Index
=	TokenNameEQUAL	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" ("	TokenNameStringLiteral	 (
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
openParenIndex	TokenNameIdentifier	 open Paren Index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
openParenIndex	TokenNameIdentifier	 open Paren Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
sentenceEnd	TokenNameIdentifier	 sentence End
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
". "	TokenNameStringLiteral	. 
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
openParenIndex	TokenNameIdentifier	 open Paren Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
sentenceEnd	TokenNameIdentifier	 sentence End
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Do nothing 	TokenNameCOMMENT_LINE	Do nothing 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
openParenIndex	TokenNameIdentifier	 open Paren Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currSentence	TokenNameIdentifier	 curr Sentence
=	TokenNameEQUAL	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
sentenceEnd	TokenNameIdentifier	 sentence End
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
closeParenIndex	TokenNameIdentifier	 close Paren Index
=	TokenNameEQUAL	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
openParenIndex	TokenNameIdentifier	 open Paren Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sentenceEnd	TokenNameIdentifier	 sentence End
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
". "	TokenNameStringLiteral	. 
,	TokenNameCOMMA	
openParenIndex	TokenNameIdentifier	 open Paren Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
,	TokenNameCOMMA	
openParenIndex	TokenNameIdentifier	 open Paren Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sentenceEnd	TokenNameIdentifier	 sentence End
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sentenceEnd	TokenNameIdentifier	 sentence End
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//longForm = currSentence.substring(sentenceEnd + 2, openParenIndex); 	TokenNameCOMMENT_LINE	longForm = currSentence.substring(sentenceEnd + 2, openParenIndex); 
//shortForm = currSentence.substring(openParenIndex + 1, closeParenIndex); 	TokenNameCOMMENT_LINE	shortForm = currSentence.substring(openParenIndex + 1, closeParenIndex); 
longForm	TokenNameIdentifier	 long Form
=	TokenNameEQUAL	
new	TokenNamenew	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
currSentence	TokenNameIdentifier	 curr Sentence
,	TokenNameCOMMA	
sentenceEnd	TokenNameIdentifier	 sentence End
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
openParenIndex	TokenNameIdentifier	 open Paren Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shortForm	TokenNameIdentifier	 short Form
=	TokenNameEQUAL	
new	TokenNamenew	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
currSentence	TokenNameIdentifier	 curr Sentence
,	TokenNameCOMMA	
openParenIndex	TokenNameIdentifier	 open Paren Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
closeParenIndex	TokenNameIdentifier	 close Paren Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
newCloseParenIndex	TokenNameIdentifier	 new Close Paren Index
=	TokenNameEQUAL	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
closeParenIndex	TokenNameIdentifier	 close Paren Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//shortForm = currSentence.substring(openParenIndex + 1, newCloseParenIndex); 	TokenNameCOMMENT_LINE	shortForm = currSentence.substring(openParenIndex + 1, newCloseParenIndex); 
shortForm	TokenNameIdentifier	 short Form
=	TokenNameEQUAL	
new	TokenNamenew	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
currSentence	TokenNameIdentifier	 curr Sentence
,	TokenNameCOMMA	
openParenIndex	TokenNameIdentifier	 open Paren Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newCloseParenIndex	TokenNameIdentifier	 new Close Paren Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closeParenIndex	TokenNameIdentifier	 close Paren Index
=	TokenNameEQUAL	
newCloseParenIndex	TokenNameIdentifier	 new Close Paren Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmpIndex	TokenNameIdentifier	 tmp Index
=	TokenNameEQUAL	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
shortForm	TokenNameIdentifier	 short Form
=	TokenNameEQUAL	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmpIndex	TokenNameIdentifier	 tmp Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tmpIndex	TokenNameIdentifier	 tmp Index
=	TokenNameEQUAL	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
shortForm	TokenNameIdentifier	 short Form
=	TokenNameEQUAL	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmpIndex	TokenNameIdentifier	 tmp Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shortTokenizer	TokenNameIdentifier	 short Tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shortTokenizer	TokenNameIdentifier	 short Tokenizer
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Long form in ( ) 	TokenNameCOMMENT_LINE	Long form in ( ) 
tmpIndex	TokenNameIdentifier	 tmp Index
=	TokenNameEQUAL	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
openParenIndex	TokenNameIdentifier	 open Paren Index
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//tmpStr = currSentence.substring(tmpIndex + 1, openParenIndex - 1); 	TokenNameCOMMENT_LINE	tmpStr = currSentence.substring(tmpIndex + 1, openParenIndex - 1); 
StringSpan	TokenNameIdentifier	 String Span
tmpStr	TokenNameIdentifier	 tmp Str
=	TokenNameEQUAL	
new	TokenNamenew	
StringSpan	TokenNameIdentifier	 String Span
(	TokenNameLPAREN	
currSentence	TokenNameIdentifier	 curr Sentence
,	TokenNameCOMMA	
tmpIndex	TokenNameIdentifier	 tmp Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
openParenIndex	TokenNameIdentifier	 open Paren Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
longForm	TokenNameIdentifier	 long Form
=	TokenNameEQUAL	
shortForm	TokenNameIdentifier	 short Form
;	TokenNameSEMICOLON	
shortForm	TokenNameIdentifier	 short Form
=	TokenNameEQUAL	
tmpStr	TokenNameIdentifier	 tmp Str
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasCapital	TokenNameIdentifier	 has Capital
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
shortForm	TokenNameIdentifier	 short Form
=	TokenNameEQUAL	
StringSpan	TokenNameIdentifier	 String Span
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isValidShortForm	TokenNameIdentifier	 is Valid Short Form
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extractAbbrPair	TokenNameIdentifier	 extract Abbr Pair
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
currSentence	TokenNameIdentifier	 curr Sentence
=	TokenNameEQUAL	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
closeParenIndex	TokenNameIdentifier	 close Paren Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
openParenIndex	TokenNameIdentifier	 open Paren Index
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
openParenIndex	TokenNameIdentifier	 open Paren Index
)	TokenNameRPAREN	
>	TokenNameGREATER	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// Matching close paren was not found 	TokenNameCOMMENT_LINE	Matching close paren was not found 
currSentence	TokenNameIdentifier	 curr Sentence
=	TokenNameEQUAL	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
openParenIndex	TokenNameIdentifier	 open Paren Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Read next line 	TokenNameCOMMENT_LINE	Read next line 
}	TokenNameRBRACE	
shortForm	TokenNameIdentifier	 short Form
=	TokenNameEQUAL	
StringSpan	TokenNameIdentifier	 String Span
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
longForm	TokenNameIdentifier	 long Form
=	TokenNameEQUAL	
StringSpan	TokenNameIdentifier	 String Span
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
openParenIndex	TokenNameIdentifier	 open Paren Index
=	TokenNameEQUAL	
currSentence	TokenNameIdentifier	 curr Sentence
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" ("	TokenNameStringLiteral	 (
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
StringSpan	TokenNameIdentifier	 String Span
findBestLongForm	TokenNameIdentifier	 find Best Long Form
(	TokenNameLPAREN	
StringSpan	TokenNameIdentifier	 String Span
shortForm	TokenNameIdentifier	 short Form
,	TokenNameCOMMA	
StringSpan	TokenNameIdentifier	 String Span
longForm	TokenNameIdentifier	 long Form
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sIndex	TokenNameIdentifier	 s Index
;	TokenNameSEMICOLON	
int	TokenNameint	
lIndex	TokenNameIdentifier	 l Index
;	TokenNameSEMICOLON	
char	TokenNamechar	
currChar	TokenNameIdentifier	 curr Char
;	TokenNameSEMICOLON	
sIndex	TokenNameIdentifier	 s Index
=	TokenNameEQUAL	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lIndex	TokenNameIdentifier	 l Index
=	TokenNameEQUAL	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
sIndex	TokenNameIdentifier	 s Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sIndex	TokenNameIdentifier	 s Index
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currChar	TokenNameIdentifier	 curr Char
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
sIndex	TokenNameIdentifier	 s Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
currChar	TokenNameIdentifier	 curr Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lIndex	TokenNameIdentifier	 l Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
lIndex	TokenNameIdentifier	 l Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
currChar	TokenNameIdentifier	 curr Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
sIndex	TokenNameIdentifier	 s Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
lIndex	TokenNameIdentifier	 l Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
lIndex	TokenNameIdentifier	 l Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
lIndex	TokenNameIdentifier	 l Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lIndex	TokenNameIdentifier	 l Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
lIndex	TokenNameIdentifier	 l Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lIndex	TokenNameIdentifier	 l Index
=	TokenNameEQUAL	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
lIndex	TokenNameIdentifier	 l Index
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lIndex	TokenNameIdentifier	 l Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
extractAbbrPair	TokenNameIdentifier	 extract Abbr Pair
(	TokenNameLPAREN	
StringSpan	TokenNameIdentifier	 String Span
shortForm	TokenNameIdentifier	 short Form
,	TokenNameCOMMA	
StringSpan	TokenNameIdentifier	 String Span
longForm	TokenNameIdentifier	 long Form
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringSpan	TokenNameIdentifier	 String Span
bestLongForm	TokenNameIdentifier	 best Long Form
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
;	TokenNameSEMICOLON	
int	TokenNameint	
longFormSize	TokenNameIdentifier	 long Form Size
,	TokenNameCOMMA	
shortFormSize	TokenNameIdentifier	 short Form Size
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"finding long form for '"	TokenNameStringLiteral	finding long form for '
+	TokenNamePLUS	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' and '"	TokenNameStringLiteral	' and '
+	TokenNamePLUS	
longForm	TokenNameIdentifier	 long Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
bestLongForm	TokenNameIdentifier	 best Long Form
=	TokenNameEQUAL	
findBestLongForm	TokenNameIdentifier	 find Best Long Form
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
,	TokenNameCOMMA	
longForm	TokenNameIdentifier	 long Form
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bestLongForm	TokenNameIdentifier	 best Long Form
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
bestLongForm	TokenNameIdentifier	 best Long Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
" -"	TokenNameStringLiteral	 -
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
longFormSize	TokenNameIdentifier	 long Form Size
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shortFormSize	TokenNameIdentifier	 short Form Size
=	TokenNameEQUAL	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
shortFormSize	TokenNameIdentifier	 short Form Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
shortFormSize	TokenNameIdentifier	 short Form Size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bestLongForm	TokenNameIdentifier	 best Long Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
bestLongForm	TokenNameIdentifier	 best Long Form
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
bestLongForm	TokenNameIdentifier	 best Long Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
longFormSize	TokenNameIdentifier	 long Form Size
>	TokenNameGREATER	
shortFormSize	TokenNameIdentifier	 short Form Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
longFormSize	TokenNameIdentifier	 long Form Size
>	TokenNameGREATER	
shortFormSize	TokenNameIdentifier	 short Form Size
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
shortFormSize	TokenNameIdentifier	 short Form Size
>	TokenNameGREATER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// at this point we have bestLongForm as expansion of shortForm 	TokenNameCOMMENT_LINE	at this point we have bestLongForm as expansion of shortForm 
if	TokenNameif	
(	TokenNameLPAREN	
annotationMode	TokenNameIdentifier	 annotation Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bestLongForm	TokenNameIdentifier	 best Long Form
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testMode	TokenNameIdentifier	 test Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isTrueDefinition	TokenNameIdentifier	 is True Definition
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bestLongForm	TokenNameIdentifier	 best Long Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
DELIMITER	TokenNameIdentifier	 DELIMITER
+	TokenNamePLUS	
bestLongForm	TokenNameIdentifier	 best Long Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
DELIMITER	TokenNameIdentifier	 DELIMITER
+	TokenNamePLUS	
"TP"	TokenNameStringLiteral	TP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
truePositives	TokenNameIdentifier	 true Positives
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
falsePositives	TokenNameIdentifier	 false Positives
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
DELIMITER	TokenNameIdentifier	 DELIMITER
+	TokenNamePLUS	
bestLongForm	TokenNameIdentifier	 best Long Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
DELIMITER	TokenNameIdentifier	 DELIMITER
+	TokenNamePLUS	
"FP"	TokenNameStringLiteral	FP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
annotationMode	TokenNameIdentifier	 annotation Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
shortForm	TokenNameIdentifier	 short Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
DELIMITER	TokenNameIdentifier	 DELIMITER
+	TokenNamePLUS	
bestLongForm	TokenNameIdentifier	 best Long Form
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: ExtractAbbrev [-options] <filename>"	TokenNameStringLiteral	Usage: ExtractAbbrev [-options] <filename>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" <filename> contains text from which abbreviations are extracted"	TokenNameStringLiteral	 <filename> contains text from which abbreviations are extracted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -testlist <file> = list of true abbreviation definition pairs"	TokenNameStringLiteral	 -testlist <file> = list of true abbreviation definition pairs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -usage or -help = this message"	TokenNameStringLiteral	 -usage or -help = this message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// String shortForm, longForm, defnString, str; 	TokenNameCOMMENT_LINE	String shortForm, longForm, defnString, str; 
ExtractAbbrev	TokenNameIdentifier	 Extract Abbrev
extractAbbrev	TokenNameIdentifier	 extract Abbrev
=	TokenNameEQUAL	
new	TokenNamenew	
ExtractAbbrev	TokenNameIdentifier	 Extract Abbrev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
testList	TokenNameIdentifier	 test List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//parse arguments 	TokenNameCOMMENT_LINE	parse arguments 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-testlist"	TokenNameStringLiteral	-testlist
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
testList	TokenNameIdentifier	 test List
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
extractAbbrev	TokenNameIdentifier	 extract Abbrev
.	TokenNameDOT	
testMode	TokenNameIdentifier	 test Mode
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-usage"	TokenNameStringLiteral	-usage
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-help"	TokenNameStringLiteral	-help
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Must be last arg 	TokenNameCOMMENT_LINE	Must be last arg 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extractAbbrev	TokenNameIdentifier	 extract Abbrev
.	TokenNameDOT	
testMode	TokenNameIdentifier	 test Mode
)	TokenNameRPAREN	
extractAbbrev	TokenNameIdentifier	 extract Abbrev
.	TokenNameDOT	
loadTrueDefinitions	TokenNameIdentifier	 load True Definitions
(	TokenNameLPAREN	
testList	TokenNameIdentifier	 test List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
extractAbbrev	TokenNameIdentifier	 extract Abbrev
.	TokenNameDOT	
extractAbbrPairsFromFile	TokenNameIdentifier	 extract Abbr Pairs From File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extractAbbrev	TokenNameIdentifier	 extract Abbrev
.	TokenNameDOT	
testMode	TokenNameIdentifier	 test Mode
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TP: "	TokenNameStringLiteral	TP: 
+	TokenNamePLUS	
extractAbbrev	TokenNameIdentifier	 extract Abbrev
.	TokenNameDOT	
truePositives	TokenNameIdentifier	 true Positives
+	TokenNamePLUS	
" FP: "	TokenNameStringLiteral	 FP: 
+	TokenNamePLUS	
extractAbbrev	TokenNameIdentifier	 extract Abbrev
.	TokenNameDOT	
falsePositives	TokenNameIdentifier	 false Positives
+	TokenNamePLUS	
" FN: "	TokenNameStringLiteral	 FN: 
+	TokenNamePLUS	
extractAbbrev	TokenNameIdentifier	 extract Abbrev
.	TokenNameDOT	
falseNegatives	TokenNameIdentifier	 false Negatives
+	TokenNamePLUS	
" TN: "	TokenNameStringLiteral	 TN: 
+	TokenNamePLUS	
extractAbbrev	TokenNameIdentifier	 extract Abbrev
.	TokenNameDOT	
trueNegatives	TokenNameIdentifier	 true Negatives
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
