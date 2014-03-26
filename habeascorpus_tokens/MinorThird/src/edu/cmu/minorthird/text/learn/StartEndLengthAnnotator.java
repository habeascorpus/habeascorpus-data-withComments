package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
Instance	TokenNameIdentifier	 Instance
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
AbstractAnnotator	TokenNameIdentifier	 Abstract Annotator
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
Details	TokenNameIdentifier	 Details
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
MixupFinder	TokenNameIdentifier	 Mixup Finder
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
SpanFinder	TokenNameIdentifier	 Span Finder
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
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
Mixup	TokenNameIdentifier	 Mixup
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
/** * Annotator based on classifiers for start, labels, and length. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Annotator based on classifiers for start, labels, and length. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
StartEndLengthAnnotator	TokenNameIdentifier	 Start End Length Annotator
extends	TokenNameextends	
AbstractAnnotator	TokenNameIdentifier	 Abstract Annotator
implements	TokenNameimplements	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
{	TokenNameLBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// finds single-token spans 	TokenNameCOMMENT_LINE	finds single-token spans 
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
SpanFinder	TokenNameIdentifier	 Span Finder
tokenFinder	TokenNameIdentifier	 token Finder
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
tokenFinder	TokenNameIdentifier	 token Finder
=	TokenNameEQUAL	
new	TokenNamenew	
MixupFinder	TokenNameIdentifier	 Mixup Finder
(	TokenNameLPAREN	
new	TokenNamenew	
Mixup	TokenNameIdentifier	 Mixup
(	TokenNameLPAREN	
"...[any]..."	TokenNameStringLiteral	...[any]...
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"illegal tokenFinder"	TokenNameStringLiteral	illegal tokenFinder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// scores lengths 	TokenNameCOMMENT_LINE	scores lengths 
private	TokenNameprivate	
LengthScorer	TokenNameIdentifier	 Length Scorer
lengthScorer	TokenNameIdentifier	 length Scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
;	TokenNameSEMICOLON	
/** * Create an annotator. */	TokenNameCOMMENT_JAVADOC	 Create an annotator. 
public	TokenNamepublic	
StartEndLengthAnnotator	TokenNameIdentifier	 Start End Length Annotator
(	TokenNameLPAREN	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
lengthMap	TokenNameIdentifier	 length Map
,	TokenNameCOMMA	
int	TokenNameint	
totalPosSpans	TokenNameIdentifier	 total Pos Spans
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
lengthScorer	TokenNameIdentifier	 length Scorer
=	TokenNameEQUAL	
new	TokenNamenew	
LengthScorer	TokenNameIdentifier	 Length Scorer
(	TokenNameLPAREN	
lengthMap	TokenNameIdentifier	 length Map
,	TokenNameCOMMA	
totalPosSpans	TokenNameIdentifier	 total Pos Spans
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
annotationType	TokenNameIdentifier	 annotation Type
=	TokenNameEQUAL	
annotationType	TokenNameIdentifier	 annotation Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSpanType	TokenNameIdentifier	 get Span Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
annotationType	TokenNameIdentifier	 annotation Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return something that finds beginnings (for debugging). */	TokenNameCOMMENT_JAVADOC	 Return something that finds beginnings (for debugging). 
public	TokenNamepublic	
SpanFinder	TokenNameIdentifier	 Span Finder
getStartFinder	TokenNameIdentifier	 get Start Finder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FilteredFinder	TokenNameIdentifier	 Filtered Finder
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
tokenFinder	TokenNameIdentifier	 token Finder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return something that finds ends (for debugging). */	TokenNameCOMMENT_JAVADOC	 Return something that finds ends (for debugging). 
public	TokenNamepublic	
SpanFinder	TokenNameIdentifier	 Span Finder
getEndFinder	TokenNameIdentifier	 get End Finder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FilteredFinder	TokenNameIdentifier	 Filtered Finder
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
tokenFinder	TokenNameIdentifier	 token Finder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"annotate"	TokenNameStringLiteral	annotate
,	TokenNameCOMMA	
"document"	TokenNameStringLiteral	document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// look for all start and end tokens 	TokenNameCOMMENT_LINE	look for all start and end tokens 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
startPred	TokenNameIdentifier	 start Pred
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
endPred	TokenNameIdentifier	 end Pred
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
tokenSpan	TokenNameIdentifier	 token Span
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
extractInstance	TokenNameIdentifier	 extract Instance
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
tokenSpan	TokenNameIdentifier	 token Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startPred	TokenNameIdentifier	 start Pred
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endPred	TokenNameIdentifier	 end Pred
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println(document.getDocumentId()+" "+tokenSpan+" "+j+" 	TokenNameCOMMENT_LINE	System.out.println(document.getDocumentId()+" "+tokenSpan+" "+j+" 
// start:"+startPred[j]+" end: "+endPred[j]); 	TokenNameCOMMENT_LINE	start:"+startPred[j]+" end: "+endPred[j]); 
}	TokenNameRBRACE	
// look for nearby start-end pairs, score them 	TokenNameCOMMENT_LINE	look for nearby start-end pairs, score them 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
startScore	TokenNameIdentifier	 start Score
=	TokenNameEQUAL	
startPred	TokenNameIdentifier	 start Pred
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startScore	TokenNameIdentifier	 start Score
<	TokenNameLESS	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// System.out.println("possible start "+j+" ["+startScore+"] 	TokenNameCOMMENT_LINE	System.out.println("possible start "+j+" ["+startScore+"] 
// "+document.subSpan(0,j+1)); 	TokenNameCOMMENT_LINE	"+document.subSpan(0,j+1)); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
lengthScorer	TokenNameIdentifier	 length Scorer
.	TokenNameDOT	
maxLength	TokenNameIdentifier	 max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
lengthScore	TokenNameIdentifier	 length Score
=	TokenNameEQUAL	
lengthScorer	TokenNameIdentifier	 length Scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lengthScore	TokenNameIdentifier	 length Score
+	TokenNamePLUS	
startScore	TokenNameIdentifier	 start Score
<	TokenNameLESS	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// System.out.println("possible length ["+lengthScore+"] "+len); 	TokenNameCOMMENT_LINE	System.out.println("possible length ["+lengthScore+"] "+len); 
double	TokenNamedouble	
endScore	TokenNameIdentifier	 end Score
=	TokenNameEQUAL	
endPred	TokenNameIdentifier	 end Pred
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// System.out.println("possible end "+(j+len-1)+" ["+endScore+"] 	TokenNameCOMMENT_LINE	System.out.println("possible end "+(j+len-1)+" ["+endScore+"] 
// "+document.subSpan(0,j+len)); 	TokenNameCOMMENT_LINE	"+document.subSpan(0,j+len)); 
double	TokenNamedouble	
finalScore	TokenNameIdentifier	 final Score
=	TokenNameEQUAL	
startScore	TokenNameIdentifier	 start Score
+	TokenNamePLUS	
lengthScore	TokenNameIdentifier	 length Score
+	TokenNamePLUS	
endScore	TokenNameIdentifier	 end Score
;	TokenNameSEMICOLON	
// show something 	TokenNameCOMMENT_LINE	show something 
String	TokenNameIdentifier	 String
lContext	TokenNameIdentifier	 l Context
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rContext	TokenNameIdentifier	 r Context
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cContext	TokenNameIdentifier	 c Context
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("possible start ["+startScore+"] 	TokenNameCOMMENT_LINE	System.out.println("possible start ["+startScore+"] 
// "+document.subSpan(0,j+1)); 	TokenNameCOMMENT_LINE	"+document.subSpan(0,j+1)); 
// System.out.println("possible end ["+endScore+"] 	TokenNameCOMMENT_LINE	System.out.println("possible end ["+endScore+"] 
// "+document.subSpan(0,j+len)); 	TokenNameCOMMENT_LINE	"+document.subSpan(0,j+len)); 
// System.out.println("possible length ["+lengthScore+"] "+len); 	TokenNameCOMMENT_LINE	System.out.println("possible length ["+lengthScore+"] "+len); 
if	TokenNameif	
(	TokenNameLPAREN	
finalScore	TokenNameIdentifier	 final Score
>	TokenNameGREATER	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"output ["	TokenNameStringLiteral	output [
+	TokenNamePLUS	
finalScore	TokenNameIdentifier	 final Score
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
+	TokenNamePLUS	
lContext	TokenNameIdentifier	 l Context
+	TokenNamePLUS	
"|"	TokenNameStringLiteral	|
+	TokenNamePLUS	
cContext	TokenNameIdentifier	 c Context
+	TokenNamePLUS	
"|"	TokenNameStringLiteral	|
+	TokenNamePLUS	
rContext	TokenNameIdentifier	 r Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// put a high-scoring combination in the labels 	TokenNameCOMMENT_LINE	put a high-scoring combination in the labels 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"start"	TokenNameStringLiteral	start
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
startPred	TokenNameIdentifier	 start Pred
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"end"	TokenNameStringLiteral	end
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
endPred	TokenNameIdentifier	 end Pred
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"length"	TokenNameStringLiteral	length
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
lengthScore	TokenNameIdentifier	 length Score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
,	TokenNameCOMMA	
annotationType	TokenNameIdentifier	 annotation Type
,	TokenNameCOMMA	
new	TokenNamenew	
Details	TokenNameIdentifier	 Details
(	TokenNameLPAREN	
finalScore	TokenNameIdentifier	 final Score
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
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
documentSpan	TokenNameIdentifier	 document Span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"not implemented"	TokenNameStringLiteral	not implemented
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
"[StartEndLen: "	TokenNameStringLiteral	[StartEndLen: 
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
lengthScorer	TokenNameIdentifier	 length Scorer
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scores lengths using a smoothed histogram. */	TokenNameCOMMENT_JAVADOC	 Scores lengths using a smoothed histogram. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
LengthScorer	TokenNameIdentifier	 Length Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
lengthFreqMap	TokenNameIdentifier	 length Freq Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numLengths	TokenNameIdentifier	 num Lengths
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
mixingFactor	TokenNameIdentifier	 mixing Factor
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxLength	TokenNameIdentifier	 max Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LengthScorer	TokenNameIdentifier	 Length Scorer
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
lengthFreqMap	TokenNameIdentifier	 length Freq Map
,	TokenNameCOMMA	
int	TokenNameint	
totalPosSpans	TokenNameIdentifier	 total Pos Spans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lengthFreqMap	TokenNameIdentifier	 length Freq Map
=	TokenNameEQUAL	
lengthFreqMap	TokenNameIdentifier	 length Freq Map
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numLengths	TokenNameIdentifier	 num Lengths
=	TokenNameEQUAL	
totalPosSpans	TokenNameIdentifier	 total Pos Spans
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lengthFreqMap	TokenNameIdentifier	 length Freq Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
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
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxLength	TokenNameIdentifier	 max Length
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxLength	TokenNameIdentifier	 max Length
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
maxLength	TokenNameIdentifier	 max Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxLength	TokenNameIdentifier	 max Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return Prob(len) */	TokenNameCOMMENT_JAVADOC	 Return Prob(len) 
public	TokenNamepublic	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
lengthFreqMap	TokenNameIdentifier	 length Freq Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
empiricalProb	TokenNameIdentifier	 empirical Prob
=	TokenNameEQUAL	
freq	TokenNameIdentifier	 freq
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
freq	TokenNameIdentifier	 freq
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
numLengths	TokenNameIdentifier	 num Lengths
;	TokenNameSEMICOLON	
double	TokenNamedouble	
smoothedProb	TokenNameIdentifier	 smoothed Prob
=	TokenNameEQUAL	
(	TokenNameLPAREN	
mixingFactor	TokenNameIdentifier	 mixing Factor
/	TokenNameDIVIDE	
maxLength	TokenNameIdentifier	 max Length
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
mixingFactor	TokenNameIdentifier	 mixing Factor
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
empiricalProb	TokenNameIdentifier	 empirical Prob
;	TokenNameSEMICOLON	
double	TokenNamedouble	
odds	TokenNameIdentifier	 odds
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
smoothedProb	TokenNameIdentifier	 smoothed Prob
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
smoothedProb	TokenNameIdentifier	 smoothed Prob
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("odds of len="+len+": "+odds); 	TokenNameCOMMENT_LINE	System.out.println("odds of len="+len+": "+odds); 
return	TokenNamereturn	
odds	TokenNameIdentifier	 odds
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
"[LengthScorer: "	TokenNameStringLiteral	[LengthScorer: 
+	TokenNamePLUS	
maxLength	TokenNameIdentifier	 max Length
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
lengthFreqMap	TokenNameIdentifier	 length Freq Map
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
