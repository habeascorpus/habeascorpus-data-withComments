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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * An abstract annotator that is based on marking up substrings within * a string, using the CharAnnotation class. * * This is a bad class, can only define types and not properties * * @author ksteppe */	TokenNameCOMMENT_JAVADOC	 An abstract annotator that is based on marking up substrings within a string, using the CharAnnotation class. * This is a bad class, can only define types and not properties * @author ksteppe 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
StringAnnotator	TokenNameIdentifier	 String Annotator
extends	TokenNameextends	
AbstractAnnotator	TokenNameIdentifier	 Abstract Annotator
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
providedAnnotation	TokenNameIdentifier	 provided Annotation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
//add the annotations into labels 	TokenNameCOMMENT_LINE	add the annotations into labels 
TextBase	TokenNameIdentifier	 Text Base
textBase	TokenNameIdentifier	 text Base
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
textBase	TokenNameIdentifier	 text Base
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
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
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
spanString	TokenNameIdentifier	 span String
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharAnnotation	TokenNameIdentifier	 Char Annotation
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
annotations	TokenNameIdentifier	 annotations
=	TokenNameEQUAL	
annotateString	TokenNameIdentifier	 annotate String
(	TokenNameLPAREN	
spanString	TokenNameIdentifier	 span String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
annotations	TokenNameIdentifier	 annotations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
annotations	TokenNameIdentifier	 annotations
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharAnnotation	TokenNameIdentifier	 Char Annotation
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
annotations	TokenNameIdentifier	 annotations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
newSpan	TokenNameIdentifier	 new Span
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
newSpan	TokenNameIdentifier	 new Span
,	TokenNameCOMMA	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
newSpan	TokenNameIdentifier	 new Span
,	TokenNameCOMMA	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
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
newSpan	TokenNameIdentifier	 new Span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
newSpan	TokenNameIdentifier	 new Span
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
providedAnnotation	TokenNameIdentifier	 provided Annotation
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setAnnotatedBy	TokenNameIdentifier	 set Annotated By
(	TokenNameLPAREN	
providedAnnotation	TokenNameIdentifier	 provided Annotation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
closedTypes	TokenNameIdentifier	 closed Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Override this class to provide the actual annotations for a span. */	TokenNameCOMMENT_JAVADOC	 Override this class to provide the actual annotations for a span. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
CharAnnotation	TokenNameIdentifier	 Char Annotation
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
annotateString	TokenNameIdentifier	 annotate String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
spanString	TokenNameIdentifier	 span String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
