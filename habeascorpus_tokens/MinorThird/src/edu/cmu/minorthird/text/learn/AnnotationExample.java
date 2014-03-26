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
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Feedback for an annotation learner. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Feedback for an annotation learner. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
AnnotationExample	TokenNameIdentifier	 Annotation Example
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
OUTSIDE	TokenNameIdentifier	 OUTSIDE
=	TokenNameEQUAL	
"outside"	TokenNameStringLiteral	outside
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
INSIDE	TokenNameIdentifier	 INSIDE
=	TokenNameEQUAL	
"inside"	TokenNameStringLiteral	inside
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
START	TokenNameIdentifier	 START
=	TokenNameEQUAL	
"start"	TokenNameStringLiteral	start
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
END	TokenNameIdentifier	 END
=	TokenNameEQUAL	
"end"	TokenNameStringLiteral	end
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
NOT_START_OR_END	TokenNameIdentifier	 NOT  START  OR  END
=	TokenNameEQUAL	
"notStartOrEnd"	TokenNameStringLiteral	notStartOrEnd
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
inputSpanType	TokenNameIdentifier	 input Span Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
inputSpanProp	TokenNameIdentifier	 input Span Prop
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Span	TokenNameIdentifier	 Span
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
/** * @param document give feedback to learner about this document * @param labels feedback information is in these labels * @param inputSpanType learner will learn how to extract spans of this type * @param inputSpanProp learner will classify extracted spans according to this type */	TokenNameCOMMENT_JAVADOC	 @param document give feedback to learner about this document @param labels feedback information is in these labels @param inputSpanType learner will learn how to extract spans of this type @param inputSpanProp learner will classify extracted spans according to this type 
public	TokenNamepublic	
AnnotationExample	TokenNameIdentifier	 Annotation Example
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
inputSpanType	TokenNameIdentifier	 input Span Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
inputSpanProp	TokenNameIdentifier	 input Span Prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inputSpanType	TokenNameIdentifier	 input Span Type
=	TokenNameEQUAL	
inputSpanType	TokenNameIdentifier	 input Span Type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inputSpanProp	TokenNameIdentifier	 input Span Prop
=	TokenNameEQUAL	
inputSpanProp	TokenNameIdentifier	 input Span Prop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getDocumentSpan	TokenNameIdentifier	 get Document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInputType	TokenNameIdentifier	 get Input Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inputSpanType	TokenNameIdentifier	 input Span Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInputProp	TokenNameIdentifier	 get Input Prop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inputSpanProp	TokenNameIdentifier	 input Span Prop
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
"[AnnEx: document="	TokenNameStringLiteral	[AnnEx: document=
+	TokenNamePLUS	
document	TokenNameIdentifier	 document
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the name of the class associated with this span. If * inputSpanType is defined, the class name will be POS or NEG; * otherwise, if inputSpanProp is defined, the class name will be * the property value assigned, or NEG. */	TokenNameCOMMENT_JAVADOC	 Return the name of the class associated with this span. If inputSpanType is defined, the class name will be POS or NEG; otherwise, if inputSpanProp is defined, the class name will be the property value assigned, or NEG. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getInputType	TokenNameIdentifier	 get Input Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hasType	TokenNameIdentifier	 has Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
getInputType	TokenNameIdentifier	 get Input Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
getInputProp	TokenNameIdentifier	 get Input Prop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
propValue	TokenNameIdentifier	 prop Value
=	TokenNameEQUAL	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
getInputProp	TokenNameIdentifier	 get Input Prop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
propValue	TokenNameIdentifier	 prop Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
propValue	TokenNameIdentifier	 prop Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"inputType && inputProp undefined for answeredQuery: "	TokenNameStringLiteral	inputType && inputProp undefined for answeredQuery: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// convenience methods 	TokenNameCOMMENT_LINE	convenience methods 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
labelTokensInsideOutside	TokenNameIdentifier	 label Tokens Inside Outside
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labelTokens	TokenNameIdentifier	 label Tokens
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
inputSpanType	TokenNameIdentifier	 input Span Type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
OUTSIDE	TokenNameIdentifier	 OUTSIDE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labelTokens	TokenNameIdentifier	 label Tokens
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
inputSpanType	TokenNameIdentifier	 input Span Type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
INSIDE	TokenNameIdentifier	 INSIDE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
labelTokensStartEnd	TokenNameIdentifier	 label Tokens Start End
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labelTokens	TokenNameIdentifier	 label Tokens
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
closureIterator	TokenNameIdentifier	 closure Iterator
(	TokenNameLPAREN	
inputSpanType	TokenNameIdentifier	 input Span Type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
NOT_START_OR_END	TokenNameIdentifier	 NOT  START  OR  END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
inputSpanType	TokenNameIdentifier	 input Span Type
,	TokenNameCOMMA	
documentId	TokenNameIdentifier	 document Id
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
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
START	TokenNameIdentifier	 START
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
labelTokens	TokenNameIdentifier	 label Tokens
(	TokenNameLPAREN	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
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
s	TokenNameIdentifier	 s
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
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
