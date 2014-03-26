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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
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
SortedMap	TokenNameIdentifier	 Sorted Map
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
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
;	TokenNameSEMICOLON	
/** * Compares two sets of spans. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Compares two sets of spans. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
SpanDifference	TokenNameIdentifier	 Span Difference
{	TokenNameLBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SpanDifference	TokenNameIdentifier	 Span Difference
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Max value of an status indicator, eg FALSE_POS, FALSE_NEG, etc */	TokenNameCOMMENT_JAVADOC	 Max value of an status indicator, eg FALSE_POS, FALSE_NEG, etc 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
MAX_STATUS	TokenNameIdentifier	 MAX  STATUS
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Indicates a false positive span. Specificially, indicates part of * document inside a 'guess' span, but not inside a 'truth' span, * where the set of truth spans for this area is known to be * complete. */	TokenNameCOMMENT_JAVADOC	 Indicates a false positive span. Specificially, indicates part of document inside a 'guess' span, but not inside a 'truth' span, where the set of truth spans for this area is known to be complete. 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
FALSE_POS	TokenNameIdentifier	 FALSE  POS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Indicates a false negative span. Specificially, indicates part of * document inside a truth span but not inside a guess span. */	TokenNameCOMMENT_JAVADOC	 Indicates a false negative span. Specificially, indicates part of document inside a truth span but not inside a guess span. 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
FALSE_NEG	TokenNameIdentifier	 FALSE  NEG
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Indicates a true positive negative span. Specificially, indicates * part of document inside a truth span and also inside a guess * span. */	TokenNameCOMMENT_JAVADOC	 Indicates a true positive negative span. Specificially, indicates part of document inside a truth span and also inside a guess span. 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
TRUE_POS	TokenNameIdentifier	 TRUE  POS
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Indicates something inside a guess span which may or may not * be inside a truth span. */	TokenNameCOMMENT_JAVADOC	 Indicates something inside a guess span which may or may not be inside a truth span. 
static	TokenNamestatic	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
UNKNOWN_POS	TokenNameIdentifier	 UNKNOWN  POS
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
UNMARKED	TokenNameIdentifier	 UNMARKED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
LEFT	TokenNameIdentifier	 LEFT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
RIGHT	TokenNameIdentifier	 RIGHT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
GUESS	TokenNameIdentifier	 GUESS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
TRUTH	TokenNameIdentifier	 TRUTH
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
CLOSURE	TokenNameIdentifier	 CLOSURE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// for debugging, map guess, truth, closure to strings 	TokenNameCOMMENT_LINE	for debugging, map guess, truth, closure to strings 
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
strCode	TokenNameIdentifier	 str Code
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
"G"	TokenNameStringLiteral	G
,	TokenNameCOMMA	
"T"	TokenNameStringLiteral	T
,	TokenNameCOMMA	
"C"	TokenNameStringLiteral	C
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// caches differences 	TokenNameCOMMENT_LINE	caches differences 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
diffedSpans	TokenNameIdentifier	 diffed Spans
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
guessSet	TokenNameIdentifier	 guess Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
truthSet	TokenNameIdentifier	 truth Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>>	TokenNameRIGHT_SHIFT	
closureMap	TokenNameIdentifier	 closure Map
;	TokenNameSEMICOLON	
// caches performance measures 	TokenNameCOMMENT_LINE	caches performance measures 
double	TokenNamedouble	
tokenFalsePos	TokenNameIdentifier	 token False Pos
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tokenFalseNeg	TokenNameIdentifier	 token False Neg
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tokenTruePos	TokenNameIdentifier	 token True Pos
;	TokenNameSEMICOLON	
double	TokenNamedouble	
spanFalsePos	TokenNameIdentifier	 span False Pos
;	TokenNameSEMICOLON	
double	TokenNamedouble	
spanFalseNeg	TokenNameIdentifier	 span False Neg
;	TokenNameSEMICOLON	
double	TokenNamedouble	
spanTruePos	TokenNameIdentifier	 span True Pos
;	TokenNameSEMICOLON	
// indicates if tokenFalseNeg,etc are valid 	TokenNameCOMMENT_LINE	indicates if tokenFalseNeg,etc are valid 
boolean	TokenNameboolean	
performanceCacheIsValid	TokenNameIdentifier	 performance Cache Is Valid
;	TokenNameSEMICOLON	
/** * Create an aggregation of the results in several SpanDifference's. */	TokenNameCOMMENT_JAVADOC	 Create an aggregation of the results in several SpanDifference's. 
public	TokenNamepublic	
SpanDifference	TokenNameIdentifier	 Span Difference
(	TokenNameLPAREN	
SpanDifference	TokenNameIdentifier	 Span Difference
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
spanDifferences	TokenNameIdentifier	 span Differences
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
accum	TokenNameIdentifier	 accum
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenFalsePos	TokenNameIdentifier	 token False Pos
=	TokenNameEQUAL	
tokenFalseNeg	TokenNameIdentifier	 token False Neg
=	TokenNameEQUAL	
tokenTruePos	TokenNameIdentifier	 token True Pos
=	TokenNameEQUAL	
spanFalsePos	TokenNameIdentifier	 span False Pos
=	TokenNameEQUAL	
spanFalseNeg	TokenNameIdentifier	 span False Neg
=	TokenNameEQUAL	
spanTruePos	TokenNameIdentifier	 span True Pos
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
spanDifferences	TokenNameIdentifier	 span Differences
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SpanDifference	TokenNameIdentifier	 Span Difference
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
spanDifferences	TokenNameIdentifier	 span Differences
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
diffedSpans	TokenNameIdentifier	 diffed Spans
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
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tokenFalsePos	TokenNameIdentifier	 token False Pos
+=	TokenNamePLUS_EQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
tokenFalsePos	TokenNameIdentifier	 token False Pos
;	TokenNameSEMICOLON	
tokenFalseNeg	TokenNameIdentifier	 token False Neg
+=	TokenNamePLUS_EQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
tokenFalseNeg	TokenNameIdentifier	 token False Neg
;	TokenNameSEMICOLON	
tokenTruePos	TokenNameIdentifier	 token True Pos
+=	TokenNamePLUS_EQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
tokenTruePos	TokenNameIdentifier	 token True Pos
;	TokenNameSEMICOLON	
spanFalsePos	TokenNameIdentifier	 span False Pos
+=	TokenNamePLUS_EQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
spanFalsePos	TokenNameIdentifier	 span False Pos
;	TokenNameSEMICOLON	
spanFalseNeg	TokenNameIdentifier	 span False Neg
+=	TokenNamePLUS_EQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
spanFalseNeg	TokenNameIdentifier	 span False Neg
;	TokenNameSEMICOLON	
spanTruePos	TokenNameIdentifier	 span True Pos
+=	TokenNamePLUS_EQUAL	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
spanTruePos	TokenNameIdentifier	 span True Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
diffedSpans	TokenNameIdentifier	 diffed Spans
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
accum	TokenNameIdentifier	 accum
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
diffedSpans	TokenNameIdentifier	 diffed Spans
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// make sure we don't recompute this! 	TokenNameCOMMENT_LINE	make sure we don't recompute this! 
performanceCacheIsValid	TokenNameIdentifier	 performance Cache Is Valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create machinery to analyze the differences between the two sets * of spans. It is assume that the first argument is a complete * list of all guess spans and the second argument is a complete * list of all truth spans. */	TokenNameCOMMENT_JAVADOC	 Create machinery to analyze the differences between the two sets of spans. It is assume that the first argument is a complete list of all guess spans and the second argument is a complete list of all truth spans. 
public	TokenNamepublic	
SpanDifference	TokenNameIdentifier	 Span Difference
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
guess	TokenNameIdentifier	 guess
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
truth	TokenNameIdentifier	 truth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
guess	TokenNameIdentifier	 guess
,	TokenNameCOMMA	
truth	TokenNameIdentifier	 truth
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create machinery to analyze the differences between the two sets * of spans. It is assumed that the first argument is a complete * list of all guess spans, the second argument is a partial list of * all truth spans, and the third argument is the set of spans S * for which all truth spans contained by S are known. */	TokenNameCOMMENT_JAVADOC	 Create machinery to analyze the differences between the two sets of spans. It is assumed that the first argument is a complete list of all guess spans, the second argument is a partial list of all truth spans, and the third argument is the set of spans S for which all truth spans contained by S are known. 
public	TokenNamepublic	
SpanDifference	TokenNameIdentifier	 Span Difference
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
guess	TokenNameIdentifier	 guess
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
truth	TokenNameIdentifier	 truth
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
closures	TokenNameIdentifier	 closures
)	TokenNameRPAREN	
{	TokenNameLBRACE	
guessSet	TokenNameIdentifier	 guess Set
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
truthSet	TokenNameIdentifier	 truth Set
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closureMap	TokenNameIdentifier	 closure Map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// load up all the boundaries into a sorted set 	TokenNameCOMMENT_LINE	load up all the boundaries into a sorted set 
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
>	TokenNameGREATER	
changes	TokenNameIdentifier	 changes
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("adding boundaries..."); 	TokenNameCOMMENT_LINE	System.out.println("adding boundaries..."); 
while	TokenNamewhile	
(	TokenNameLPAREN	
guess	TokenNameIdentifier	 guess
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
guess	TokenNameIdentifier	 guess
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changes	TokenNameIdentifier	 changes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getLeftBoundary	TokenNameIdentifier	 get Left Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LEFT	TokenNameIdentifier	 LEFT
,	TokenNameCOMMA	
GUESS	TokenNameIdentifier	 GUESS
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changes	TokenNameIdentifier	 changes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRightBoundary	TokenNameIdentifier	 get Right Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RIGHT	TokenNameIdentifier	 RIGHT
,	TokenNameCOMMA	
GUESS	TokenNameIdentifier	 GUESS
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
guessSet	TokenNameIdentifier	 guess Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
truth	TokenNameIdentifier	 truth
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
truth	TokenNameIdentifier	 truth
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changes	TokenNameIdentifier	 changes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getLeftBoundary	TokenNameIdentifier	 get Left Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LEFT	TokenNameIdentifier	 LEFT
,	TokenNameCOMMA	
TRUTH	TokenNameIdentifier	 TRUTH
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changes	TokenNameIdentifier	 changes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRightBoundary	TokenNameIdentifier	 get Right Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RIGHT	TokenNameIdentifier	 RIGHT
,	TokenNameCOMMA	
TRUTH	TokenNameIdentifier	 TRUTH
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
truthSet	TokenNameIdentifier	 truth Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
closures	TokenNameIdentifier	 closures
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
closures	TokenNameIdentifier	 closures
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
closures	TokenNameIdentifier	 closures
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changes	TokenNameIdentifier	 changes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getLeftBoundary	TokenNameIdentifier	 get Left Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LEFT	TokenNameIdentifier	 LEFT
,	TokenNameCOMMA	
CLOSURE	TokenNameIdentifier	 CLOSURE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changes	TokenNameIdentifier	 changes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getRightBoundary	TokenNameIdentifier	 get Right Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RIGHT	TokenNameIdentifier	 RIGHT
,	TokenNameCOMMA	
CLOSURE	TokenNameIdentifier	 CLOSURE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
closuresForId	TokenNameIdentifier	 closures For Id
=	TokenNameEQUAL	
closureMap	TokenNameIdentifier	 closure Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
closuresForId	TokenNameIdentifier	 closures For Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
closureMap	TokenNameIdentifier	 closure Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
closuresForId	TokenNameIdentifier	 closures For Id
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closuresForId	TokenNameIdentifier	 closures For Id
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// go thru the boundaries and create a list of differences 	TokenNameCOMMENT_LINE	go thru the boundaries and create a list of differences 
//System.out.println("creating differences..."); 	TokenNameCOMMENT_LINE	System.out.println("creating differences..."); 
diffedSpans	TokenNameIdentifier	 diffed Spans
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
performanceCacheIsValid	TokenNameIdentifier	 performance Cache Is Valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
UNMARKED	TokenNameIdentifier	 UNMARKED
;	TokenNameSEMICOLON	
// if there is an explicit list of things which are 'closed', then 	TokenNameCOMMENT_LINE	if there is an explicit list of things which are 'closed', then 
// use it, and otherwise assume that the closed world assumption holds 	TokenNameCOMMENT_LINE	use it, and otherwise assume that the closed world assumption holds 
// everywhere. 	TokenNameCOMMENT_LINE	everywhere. 
boolean	TokenNameboolean	
insideClosure	TokenNameIdentifier	 inside Closure
=	TokenNameEQUAL	
closures	TokenNameIdentifier	 closures
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
fpLeft	TokenNameIdentifier	 fp Left
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
tpLeft	TokenNameIdentifier	 tp Left
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
fnLeft	TokenNameIdentifier	 fn Left
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
changes	TokenNameIdentifier	 changes
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
ChangeBoundary	TokenNameIdentifier	 Change Boundary
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("state = "+state+" cb = "+cb); 	TokenNameCOMMENT_LINE	System.out.println("state = "+state+" cb = "+cb); 
if	TokenNameif	
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
==	TokenNameEQUAL_EQUAL	
CLOSURE	TokenNameIdentifier	 CLOSURE
)	TokenNameRPAREN	
insideClosure	TokenNameIdentifier	 inside Closure
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
UNMARKED	TokenNameIdentifier	 UNMARKED
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
==	TokenNameEQUAL_EQUAL	
TRUTH	TokenNameIdentifier	 TRUTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
FALSE_NEG	TokenNameIdentifier	 FALSE  NEG
;	TokenNameSEMICOLON	
// truth starts, start false neg 	TokenNameCOMMENT_LINE	truth starts, start false neg 
fnLeft	TokenNameIdentifier	 fn Left
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
UNMARKED	TokenNameIdentifier	 UNMARKED
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
==	TokenNameEQUAL_EQUAL	
GUESS	TokenNameIdentifier	 GUESS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
FALSE_POS	TokenNameIdentifier	 FALSE  POS
;	TokenNameSEMICOLON	
// guess starts, start false pos 	TokenNameCOMMENT_LINE	guess starts, start false pos 
fpLeft	TokenNameIdentifier	 fp Left
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
FALSE_POS	TokenNameIdentifier	 FALSE  POS
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
==	TokenNameEQUAL_EQUAL	
TRUTH	TokenNameIdentifier	 TRUTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
TRUE_POS	TokenNameIdentifier	 TRUE  POS
;	TokenNameSEMICOLON	
// truth starts, false pos -> true pos 	TokenNameCOMMENT_LINE	truth starts, false pos -> true pos 
if	TokenNameif	
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
fpLeft	TokenNameIdentifier	 fp Left
.	TokenNameDOT	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
diffedSpans	TokenNameIdentifier	 diffed Spans
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
DiffedSpan	TokenNameIdentifier	 Diffed Span
(	TokenNameLPAREN	
insideClosure	TokenNameIdentifier	 inside Closure
,	TokenNameCOMMA	
FALSE_POS	TokenNameIdentifier	 FALSE  POS
,	TokenNameCOMMA	
fpLeft	TokenNameIdentifier	 fp Left
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tpLeft	TokenNameIdentifier	 tp Left
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
FALSE_POS	TokenNameIdentifier	 FALSE  POS
&&	TokenNameAND_AND	
!	TokenNameNOT	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
==	TokenNameEQUAL_EQUAL	
GUESS	TokenNameIdentifier	 GUESS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
UNMARKED	TokenNameIdentifier	 UNMARKED
;	TokenNameSEMICOLON	
// guess ends, end false pos 	TokenNameCOMMENT_LINE	guess ends, end false pos 
if	TokenNameif	
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
fpLeft	TokenNameIdentifier	 fp Left
.	TokenNameDOT	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
diffedSpans	TokenNameIdentifier	 diffed Spans
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
DiffedSpan	TokenNameIdentifier	 Diffed Span
(	TokenNameLPAREN	
insideClosure	TokenNameIdentifier	 inside Closure
,	TokenNameCOMMA	
FALSE_POS	TokenNameIdentifier	 FALSE  POS
,	TokenNameCOMMA	
fpLeft	TokenNameIdentifier	 fp Left
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fpLeft	TokenNameIdentifier	 fp Left
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
FALSE_NEG	TokenNameIdentifier	 FALSE  NEG
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
==	TokenNameEQUAL_EQUAL	
GUESS	TokenNameIdentifier	 GUESS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
TRUE_POS	TokenNameIdentifier	 TRUE  POS
;	TokenNameSEMICOLON	
// guess starts, false neg -> true pos 	TokenNameCOMMENT_LINE	guess starts, false neg -> true pos 
if	TokenNameif	
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
fnLeft	TokenNameIdentifier	 fn Left
.	TokenNameDOT	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
diffedSpans	TokenNameIdentifier	 diffed Spans
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
DiffedSpan	TokenNameIdentifier	 Diffed Span
(	TokenNameLPAREN	
insideClosure	TokenNameIdentifier	 inside Closure
,	TokenNameCOMMA	
FALSE_NEG	TokenNameIdentifier	 FALSE  NEG
,	TokenNameCOMMA	
fnLeft	TokenNameIdentifier	 fn Left
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tpLeft	TokenNameIdentifier	 tp Left
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
FALSE_NEG	TokenNameIdentifier	 FALSE  NEG
&&	TokenNameAND_AND	
!	TokenNameNOT	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
==	TokenNameEQUAL_EQUAL	
TRUTH	TokenNameIdentifier	 TRUTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
UNMARKED	TokenNameIdentifier	 UNMARKED
;	TokenNameSEMICOLON	
// truth ends, end false neg 	TokenNameCOMMENT_LINE	truth ends, end false neg 
if	TokenNameif	
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
fnLeft	TokenNameIdentifier	 fn Left
.	TokenNameDOT	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
diffedSpans	TokenNameIdentifier	 diffed Spans
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
DiffedSpan	TokenNameIdentifier	 Diffed Span
(	TokenNameLPAREN	
insideClosure	TokenNameIdentifier	 inside Closure
,	TokenNameCOMMA	
FALSE_NEG	TokenNameIdentifier	 FALSE  NEG
,	TokenNameCOMMA	
fnLeft	TokenNameIdentifier	 fn Left
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fnLeft	TokenNameIdentifier	 fn Left
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
TRUE_POS	TokenNameIdentifier	 TRUE  POS
&&	TokenNameAND_AND	
!	TokenNameNOT	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
==	TokenNameEQUAL_EQUAL	
TRUTH	TokenNameIdentifier	 TRUTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
FALSE_POS	TokenNameIdentifier	 FALSE  POS
;	TokenNameSEMICOLON	
// truth ends, true pos->false pos 	TokenNameCOMMENT_LINE	truth ends, true pos->false pos 
if	TokenNameif	
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
tpLeft	TokenNameIdentifier	 tp Left
.	TokenNameDOT	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
diffedSpans	TokenNameIdentifier	 diffed Spans
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
DiffedSpan	TokenNameIdentifier	 Diffed Span
(	TokenNameLPAREN	
insideClosure	TokenNameIdentifier	 inside Closure
,	TokenNameCOMMA	
TRUE_POS	TokenNameIdentifier	 TRUE  POS
,	TokenNameCOMMA	
tpLeft	TokenNameIdentifier	 tp Left
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fpLeft	TokenNameIdentifier	 fp Left
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
TRUE_POS	TokenNameIdentifier	 TRUE  POS
&&	TokenNameAND_AND	
!	TokenNameNOT	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
==	TokenNameEQUAL_EQUAL	
GUESS	TokenNameIdentifier	 GUESS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
FALSE_NEG	TokenNameIdentifier	 FALSE  NEG
;	TokenNameSEMICOLON	
// guess ends, true pos->false neg 	TokenNameCOMMENT_LINE	guess ends, true pos->false neg 
if	TokenNameif	
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
tpLeft	TokenNameIdentifier	 tp Left
.	TokenNameDOT	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
diffedSpans	TokenNameIdentifier	 diffed Spans
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
DiffedSpan	TokenNameIdentifier	 Diffed Span
(	TokenNameLPAREN	
insideClosure	TokenNameIdentifier	 inside Closure
,	TokenNameCOMMA	
TRUE_POS	TokenNameIdentifier	 TRUE  POS
,	TokenNameCOMMA	
tpLeft	TokenNameIdentifier	 tp Left
,	TokenNameCOMMA	
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fnLeft	TokenNameIdentifier	 fn Left
=	TokenNameEQUAL	
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//System.out.println("span diff complete"); 	TokenNameCOMMENT_LINE	System.out.println("span diff complete"); 
//for (Iterator i=diffedSpans.iterator(); i.hasNext(); ) System.out.println(i.next()); 	TokenNameCOMMENT_LINE	for (Iterator i=diffedSpans.iterator(); i.hasNext(); ) System.out.println(i.next()); 
}	TokenNameRBRACE	
public	TokenNamepublic	
Looper	TokenNameIdentifier	 Looper
differenceIterator	TokenNameIdentifier	 difference Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Looper	TokenNameIdentifier	 Looper
(	TokenNameLPAREN	
diffedSpans	TokenNameIdentifier	 diffed Spans
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the percentage of tokens in 'guess' spans that are true * positives (ignoring tokens that are UNKNOWN_POS). */	TokenNameCOMMENT_JAVADOC	 Return the percentage of tokens in 'guess' spans that are true positives (ignoring tokens that are UNKNOWN_POS). 
public	TokenNamepublic	
double	TokenNamedouble	
tokenPrecision	TokenNameIdentifier	 token Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
performanceCacheIsValid	TokenNameIdentifier	 performance Cache Is Valid
)	TokenNameRPAREN	
cachePerformance	TokenNameIdentifier	 cache Performance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenTruePos	TokenNameIdentifier	 token True Pos
+	TokenNamePLUS	
tokenFalsePos	TokenNameIdentifier	 token False Pos
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
tokenTruePos	TokenNameIdentifier	 token True Pos
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
tokenTruePos	TokenNameIdentifier	 token True Pos
+	TokenNamePLUS	
tokenFalsePos	TokenNameIdentifier	 token False Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the percentage of tokens in true positive spans that are in guess * spans (ignoring tokens that are UNKNOWN_POS). */	TokenNameCOMMENT_JAVADOC	 Return the percentage of tokens in true positive spans that are in guess spans (ignoring tokens that are UNKNOWN_POS). 
public	TokenNamepublic	
double	TokenNamedouble	
tokenRecall	TokenNameIdentifier	 token Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
performanceCacheIsValid	TokenNameIdentifier	 performance Cache Is Valid
)	TokenNameRPAREN	
cachePerformance	TokenNameIdentifier	 cache Performance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenTruePos	TokenNameIdentifier	 token True Pos
+	TokenNamePLUS	
tokenFalseNeg	TokenNameIdentifier	 token False Neg
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
tokenTruePos	TokenNameIdentifier	 token True Pos
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
tokenTruePos	TokenNameIdentifier	 token True Pos
+	TokenNamePLUS	
tokenFalseNeg	TokenNameIdentifier	 token False Neg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the percentage of 'guess' spans that are also 'truth' * spans, ignoring non-truth spans that are not inside closure spans. */	TokenNameCOMMENT_JAVADOC	 Return the percentage of 'guess' spans that are also 'truth' spans, ignoring non-truth spans that are not inside closure spans. 
public	TokenNamepublic	
double	TokenNamedouble	
spanPrecision	TokenNameIdentifier	 span Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
performanceCacheIsValid	TokenNameIdentifier	 performance Cache Is Valid
)	TokenNameRPAREN	
cachePerformance	TokenNameIdentifier	 cache Performance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spanTruePos	TokenNameIdentifier	 span True Pos
+	TokenNamePLUS	
spanFalsePos	TokenNameIdentifier	 span False Pos
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
spanTruePos	TokenNameIdentifier	 span True Pos
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
spanTruePos	TokenNameIdentifier	 span True Pos
+	TokenNamePLUS	
spanFalsePos	TokenNameIdentifier	 span False Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the percentage of 'truth' spans that are also 'guess' * spans */	TokenNameCOMMENT_JAVADOC	 Return the percentage of 'truth' spans that are also 'guess' spans 
public	TokenNamepublic	
double	TokenNamedouble	
spanRecall	TokenNameIdentifier	 span Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
performanceCacheIsValid	TokenNameIdentifier	 performance Cache Is Valid
)	TokenNameRPAREN	
cachePerformance	TokenNameIdentifier	 cache Performance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spanTruePos	TokenNameIdentifier	 span True Pos
+	TokenNamePLUS	
spanFalseNeg	TokenNameIdentifier	 span False Neg
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
spanTruePos	TokenNameIdentifier	 span True Pos
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
spanTruePos	TokenNameIdentifier	 span True Pos
+	TokenNamePLUS	
spanFalseNeg	TokenNameIdentifier	 span False Neg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
cachePerformance	TokenNameIdentifier	 cache Performance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenFalsePos	TokenNameIdentifier	 token False Pos
=	TokenNameEQUAL	
tokenFalseNeg	TokenNameIdentifier	 token False Neg
=	TokenNameEQUAL	
tokenTruePos	TokenNameIdentifier	 token True Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
diffedSpans	TokenNameIdentifier	 diffed Spans
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
DiffedSpan	TokenNameIdentifier	 Diffed Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numTokens	TokenNameIdentifier	 num Tokens
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
diffSpan	TokenNameIdentifier	 diff Span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
==	TokenNameEQUAL_EQUAL	
FALSE_POS	TokenNameIdentifier	 FALSE  POS
)	TokenNameRPAREN	
tokenFalsePos	TokenNameIdentifier	 token False Pos
+=	TokenNamePLUS_EQUAL	
numTokens	TokenNameIdentifier	 num Tokens
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
==	TokenNameEQUAL_EQUAL	
FALSE_NEG	TokenNameIdentifier	 FALSE  NEG
)	TokenNameRPAREN	
tokenFalseNeg	TokenNameIdentifier	 token False Neg
+=	TokenNamePLUS_EQUAL	
numTokens	TokenNameIdentifier	 num Tokens
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
==	TokenNameEQUAL_EQUAL	
TRUE_POS	TokenNameIdentifier	 TRUE  POS
)	TokenNameRPAREN	
tokenTruePos	TokenNameIdentifier	 token True Pos
+=	TokenNamePLUS_EQUAL	
numTokens	TokenNameIdentifier	 num Tokens
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
spanFalsePos	TokenNameIdentifier	 span False Pos
=	TokenNameEQUAL	
spanFalseNeg	TokenNameIdentifier	 span False Neg
=	TokenNameEQUAL	
spanTruePos	TokenNameIdentifier	 span True Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("guessSet: "+guessSet); 	TokenNameCOMMENT_LINE	System.out.println("guessSet: "+guessSet); 
//System.out.println("truthSet: "+truthSet); 	TokenNameCOMMENT_LINE	System.out.println("truthSet: "+truthSet); 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
truthSet	TokenNameIdentifier	 truth Set
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
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
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
guessSet	TokenNameIdentifier	 guess Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spanFalseNeg	TokenNameIdentifier	 span False Neg
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"fn: "	TokenNameStringLiteral	fn: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
guessSet	TokenNameIdentifier	 guess Set
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
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
truthSet	TokenNameIdentifier	 truth Set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spanTruePos	TokenNameIdentifier	 span True Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"tp: "	TokenNameStringLiteral	tp: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
closuresForId	TokenNameIdentifier	 closures For Id
=	TokenNameEQUAL	
closureMap	TokenNameIdentifier	 closure Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
closuresForId	TokenNameIdentifier	 closures For Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
closuresForId	TokenNameIdentifier	 closures For Id
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
Span	TokenNameIdentifier	 Span
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"fp: "	TokenNameStringLiteral	fp: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spanFalsePos	TokenNameIdentifier	 span False Pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//closuresForId!=null 	TokenNameCOMMENT_LINE	closuresForId!=null 
}	TokenNameRBRACE	
//guess not in truthSet 	TokenNameCOMMENT_LINE	guess not in truthSet 
}	TokenNameRBRACE	
// for guess 	TokenNameCOMMENT_LINE	for guess 
performanceCacheIsValid	TokenNameIdentifier	 performance Cache Is Valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A Span.Looper which also passes out two additional types * of information about each returned span s: * <ol> * <li>if s is a FALSE_POS, FALSE_NEG, or TRUE_POS, * relative to the original spans. * <li>the true span and/or guess spans associated with s. *</ol> */	TokenNameCOMMENT_JAVADOC	 A Span.Looper which also passes out two additional types of information about each returned span s: <ol> <li>if s is a FALSE_POS, FALSE_NEG, or TRUE_POS, relative to the original spans. <li>the true span and/or guess spans associated with s. *</ol> 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Looper	TokenNameIdentifier	 Looper
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
DiffedSpan	TokenNameIdentifier	 Diffed Span
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
estSize	TokenNameIdentifier	 est Size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Looper	TokenNameIdentifier	 Looper
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
estSize	TokenNameIdentifier	 est Size
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Looper	TokenNameIdentifier	 Looper
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"not implemented"	TokenNameStringLiteral	not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
diffSpan	TokenNameIdentifier	 diff Span
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return status of the last span returned - does it indicate a false positive, * false negative, or true positive area? */	TokenNameCOMMENT_JAVADOC	 Return status of the last span returned - does it indicate a false positive, false negative, or true positive area? 
public	TokenNamepublic	
int	TokenNameint	
getStatus	TokenNameIdentifier	 get Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Guess span that support this difference. */	TokenNameCOMMENT_JAVADOC	 Guess span that support this difference. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getOriginalGuessSpan	TokenNameIdentifier	 get Original Guess Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
estimatedSize	TokenNameIdentifier	 estimated Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
estSize	TokenNameIdentifier	 est Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Indicates a point at which the document changes from * being false positive, false negative, true positive, * or neither. */	TokenNameCOMMENT_JAVADOC	 Indicates a point at which the document changes from being false positive, false negative, true positive, or neither. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
point	TokenNameIdentifier	 point
;	TokenNameSEMICOLON	
// empty span 	TokenNameCOMMENT_LINE	empty span 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLeft	TokenNameIdentifier	 is Left
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
originalGuessSpan	TokenNameIdentifier	 original Guess Span
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
point	TokenNameIdentifier	 point
,	TokenNameCOMMA	
int	TokenNameint	
leftRight	TokenNameIdentifier	 left Right
,	TokenNameCOMMA	
int	TokenNameint	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
originalGuessSpan	TokenNameIdentifier	 original Guess Span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
point	TokenNameIdentifier	 point
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
=	TokenNameEQUAL	
leftRight	TokenNameIdentifier	 left Right
==	TokenNameEQUAL_EQUAL	
LEFT	TokenNameIdentifier	 LEFT
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
=	TokenNameEQUAL	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
=	TokenNameEQUAL	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
(	TokenNameLPAREN	
isLeft	TokenNameIdentifier	 is Left
?	TokenNameQUESTION	
"L"	TokenNameStringLiteral	L
:	TokenNameCOLON	
"R"	TokenNameStringLiteral	R
)	TokenNameRPAREN	
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
strCode	TokenNameIdentifier	 str Code
[	TokenNameLBRACKET	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
cb	TokenNameIdentifier	 cb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isLeft	TokenNameIdentifier	 is Left
&&	TokenNameAND_AND	
!	TokenNameNOT	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
isLeft	TokenNameIdentifier	 is Left
)	TokenNameRPAREN	
return	TokenNamereturn	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
-	TokenNameMINUS	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
guessTruthClosure	TokenNameIdentifier	 guess Truth Closure
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** A difference between the guess and truth spans. */	TokenNameCOMMENT_JAVADOC	 A difference between the guess and truth spans. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DiffedSpan	TokenNameIdentifier	 Diffed Span
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
DiffedSpan	TokenNameIdentifier	 Diffed Span
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
Span	TokenNameIdentifier	 Span
diffSpan	TokenNameIdentifier	 diff Span
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Span	TokenNameIdentifier	 Span
originalGuessSpan	TokenNameIdentifier	 original Guess Span
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DiffedSpan	TokenNameIdentifier	 Diffed Span
(	TokenNameLPAREN	
boolean	TokenNameboolean	
insideClosure	TokenNameIdentifier	 inside Closure
,	TokenNameCOMMA	
int	TokenNameint	
statusCWA	TokenNameIdentifier	 status CWA
,	TokenNameCOMMA	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
leftBoundary	TokenNameIdentifier	 left Boundary
,	TokenNameCOMMA	
ChangeBoundary	TokenNameIdentifier	 Change Boundary
rightBoundary	TokenNameIdentifier	 right Boundary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
insideClosure	TokenNameIdentifier	 inside Closure
&	TokenNameAND	
statusCWA	TokenNameIdentifier	 status CWA
==	TokenNameEQUAL_EQUAL	
FALSE_POS	TokenNameIdentifier	 FALSE  POS
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
UNKNOWN_POS	TokenNameIdentifier	 UNKNOWN  POS
;	TokenNameSEMICOLON	
else	TokenNameelse	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
statusCWA	TokenNameIdentifier	 status CWA
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
leftBoundary	TokenNameIdentifier	 left Boundary
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rightBoundary	TokenNameIdentifier	 right Boundary
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"error diffing "	TokenNameStringLiteral	error diffing 
+	TokenNamePLUS	
leftBoundary	TokenNameIdentifier	 left Boundary
.	TokenNameDOT	
point	TokenNameIdentifier	 point
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
rightBoundary	TokenNameIdentifier	 right Boundary
.	TokenNameDOT	
point	TokenNameIdentifier	 point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
leftBoundary	TokenNameIdentifier	 left Boundary
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
rightBoundary	TokenNameIdentifier	 right Boundary
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
diffSpan	TokenNameIdentifier	 diff Span
=	TokenNameEQUAL	
leftBoundary	TokenNameIdentifier	 left Boundary
.	TokenNameDOT	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
=	TokenNameEQUAL	
leftBoundary	TokenNameIdentifier	 left Boundary
.	TokenNameDOT	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
=	TokenNameEQUAL	
rightBoundary	TokenNameIdentifier	 right Boundary
.	TokenNameDOT	
originalGuessSpan	TokenNameIdentifier	 original Guess Span
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[Diff "	TokenNameStringLiteral	[Diff 
+	TokenNamePLUS	
status	TokenNameIdentifier	 status
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
diffSpan	TokenNameIdentifier	 diff Span
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
DiffedSpan	TokenNameIdentifier	 Diffed Span
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
diffSpan	TokenNameIdentifier	 diff Span
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
diffSpan	TokenNameIdentifier	 diff Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[SpanDiff: token p/r="	TokenNameStringLiteral	[SpanDiff: token p/r=
+	TokenNamePLUS	
tokenPrecision	TokenNameIdentifier	 token Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
tokenRecall	TokenNameIdentifier	 token Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" span p/r="	TokenNameStringLiteral	 span p/r=
+	TokenNamePLUS	
spanPrecision	TokenNameIdentifier	 span Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
spanRecall	TokenNameIdentifier	 span Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return a string containing all the summary statistics * printed moderately neatly on two lines. */	TokenNameCOMMENT_JAVADOC	 Return a string containing all the summary statistics printed moderately neatly on two lines. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toSummary	TokenNameIdentifier	 to Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
tokenF	TokenNameIdentifier	 token F
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
tokenPrecision	TokenNameIdentifier	 token Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tokenRecall	TokenNameIdentifier	 token Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
tokenPrecision	TokenNameIdentifier	 token Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
tokenRecall	TokenNameIdentifier	 token Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
spanF	TokenNameIdentifier	 span F
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
spanPrecision	TokenNameIdentifier	 span Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
spanRecall	TokenNameIdentifier	 span Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
spanPrecision	TokenNameIdentifier	 span Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
spanRecall	TokenNameIdentifier	 span Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
"TokenPrecision: "	TokenNameStringLiteral	TokenPrecision: 
+	TokenNamePLUS	
fmt	TokenNameIdentifier	 fmt
(	TokenNameLPAREN	
tokenPrecision	TokenNameIdentifier	 token Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" TokenRecall: "	TokenNameStringLiteral	 TokenRecall: 
+	TokenNamePLUS	
fmt	TokenNameIdentifier	 fmt
(	TokenNameLPAREN	
tokenRecall	TokenNameIdentifier	 token Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" F: "	TokenNameStringLiteral	 F: 
+	TokenNamePLUS	
fmt	TokenNameIdentifier	 fmt
(	TokenNameLPAREN	
tokenF	TokenNameIdentifier	 token F
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"SpanPrecision: "	TokenNameStringLiteral	SpanPrecision: 
+	TokenNamePLUS	
fmt	TokenNameIdentifier	 fmt
(	TokenNameLPAREN	
spanPrecision	TokenNameIdentifier	 span Precision
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" SpanRecall: "	TokenNameStringLiteral	 SpanRecall: 
+	TokenNamePLUS	
fmt	TokenNameIdentifier	 fmt
(	TokenNameLPAREN	
spanRecall	TokenNameIdentifier	 span Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" F: "	TokenNameStringLiteral	 F: 
+	TokenNamePLUS	
fmt	TokenNameIdentifier	 fmt
(	TokenNameLPAREN	
spanF	TokenNameIdentifier	 span F
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//+"\n"+"Token TP,FP,FN: "+tokenTruePos+","+tokenFalsePos+","+tokenFalseNeg 	TokenNameCOMMENT_LINE	+"\n"+"Token TP,FP,FN: "+tokenTruePos+","+tokenFalsePos+","+tokenFalseNeg 
//+"\n"+"Span TP,FP,FN: "+spanTruePos+","+spanFalsePos+","+spanFalseNeg; 	TokenNameCOMMENT_LINE	+"\n"+"Span TP,FP,FN: "+spanTruePos+","+spanFalsePos+","+spanFalseNeg; 
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fmt	TokenNameIdentifier	 fmt
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
fmt	TokenNameIdentifier	 fmt
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"0.0000"	TokenNameStringLiteral	0.0000
)	TokenNameRPAREN	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
class	TokenNameclass	
Invoker	TokenNameIdentifier	 Invoker
extends	TokenNameextends	
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
{	TokenNameLBRACE	
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
textLabels	TokenNameIdentifier	 text Labels
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
predictedType	TokenNameIdentifier	 predicted Type
=	TokenNameEQUAL	
"_predicted"	TokenNameStringLiteral	_predicted
,	TokenNameCOMMA	
actualType	TokenNameIdentifier	 actual Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
labels	TokenNameIdentifier	 labels
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textLabels	TokenNameIdentifier	 text Labels
=	TokenNameEQUAL	
FancyLoader	TokenNameIdentifier	 Fancy Loader
.	TokenNameDOT	
loadTextLabels	TokenNameIdentifier	 load Text Labels
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
predicted	TokenNameIdentifier	 predicted
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
predictedType	TokenNameIdentifier	 predicted Type
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actual	TokenNameIdentifier	 actual
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actualType	TokenNameIdentifier	 actual Type
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Invoker	TokenNameIdentifier	 Invoker
inv	TokenNameIdentifier	 inv
=	TokenNameEQUAL	
new	TokenNamenew	
Invoker	TokenNameIdentifier	 Invoker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
processArguments	TokenNameIdentifier	 process Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
textLabels	TokenNameIdentifier	 text Labels
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"-labels must be set"	TokenNameStringLiteral	-labels must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
actualType	TokenNameIdentifier	 actual Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"-actual must be set"	TokenNameStringLiteral	-actual must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
guess	TokenNameIdentifier	 guess
=	TokenNameEQUAL	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
textLabels	TokenNameIdentifier	 text Labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
predictedType	TokenNameIdentifier	 predicted Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
truth	TokenNameIdentifier	 truth
=	TokenNameEQUAL	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
textLabels	TokenNameIdentifier	 text Labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
actualType	TokenNameIdentifier	 actual Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
closure	TokenNameIdentifier	 closure
=	TokenNameEQUAL	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
textLabels	TokenNameIdentifier	 text Labels
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
actualType	TokenNameIdentifier	 actual Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
guess	TokenNameIdentifier	 guess
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"spanType '"	TokenNameStringLiteral	spanType '
+	TokenNamePLUS	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
predictedType	TokenNameIdentifier	 predicted Type
+	TokenNamePLUS	
"' not found"	TokenNameStringLiteral	' not found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
truth	TokenNameIdentifier	 truth
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"spanType '"	TokenNameStringLiteral	spanType '
+	TokenNamePLUS	
inv	TokenNameIdentifier	 inv
.	TokenNameDOT	
actualType	TokenNameIdentifier	 actual Type
+	TokenNamePLUS	
"' not found"	TokenNameStringLiteral	' not found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanDifference	TokenNameIdentifier	 Span Difference
sd	TokenNameIdentifier	 sd
=	TokenNameEQUAL	
new	TokenNamenew	
SpanDifference	TokenNameIdentifier	 Span Difference
(	TokenNameLPAREN	
guess	TokenNameIdentifier	 guess
,	TokenNameCOMMA	
truth	TokenNameIdentifier	 truth
,	TokenNameCOMMA	
closure	TokenNameIdentifier	 closure
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
toSummary	TokenNameIdentifier	 to Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
