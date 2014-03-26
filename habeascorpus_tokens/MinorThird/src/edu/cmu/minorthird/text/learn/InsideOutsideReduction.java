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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
Set	TokenNameIdentifier	 Set
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
ExampleSchema	TokenNameIdentifier	 Example Schema
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
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
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
MixupProgram	TokenNameIdentifier	 Mixup Program
;	TokenNameSEMICOLON	
/** * Reducing an extraction task to tagging tokens as inside the type to extract, * or outside the type to extract. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Reducing an extraction task to tagging tokens as inside the type to extract, or outside the type to extract. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
InsideOutsideReduction	TokenNameIdentifier	 Inside Outside Reduction
extends	TokenNameextends	
Extraction2TaggingReduction	TokenNameIdentifier	 Extraction2 Tagging Reduction
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// saves result of last reduction 	TokenNameCOMMENT_LINE	saves result of last reduction 
transient	TokenNametransient	
private	TokenNameprivate	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
taggedLabels	TokenNameIdentifier	 tagged Labels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
tokenProp	TokenNameIdentifier	 token Prop
=	TokenNameEQUAL	
"_inside"	TokenNameStringLiteral	_inside
;	TokenNameSEMICOLON	
// all tag values that were used 	TokenNameCOMMENT_LINE	all tag values that were used 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
tagset	TokenNameIdentifier	 tagset
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reduceExtraction2Tagging	TokenNameIdentifier	 reduce Extraction2 Tagging
(	TokenNameLPAREN	
AnnotationExample	TokenNameIdentifier	 Annotation Example
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reduceDocument	TokenNameIdentifier	 reduce Document
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getDocumentSpan	TokenNameIdentifier	 get Document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getInputType	TokenNameIdentifier	 get Input Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getInputProp	TokenNameIdentifier	 get Input Prop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
reduceDocument	TokenNameIdentifier	 reduce Document
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spanProp	TokenNameIdentifier	 span Prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
taggedLabels	TokenNameIdentifier	 tagged Labels
=	TokenNameEQUAL	
new	TokenNamenew	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assignDefaultLabels	TokenNameIdentifier	 assign Default Labels
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
taggedLabels	TokenNameIdentifier	 tagged Labels
,	TokenNameCOMMA	
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
spanProp	TokenNameIdentifier	 span Prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// label the tokens inside a span to be extracted as POS if there's just one 	TokenNameCOMMENT_LINE	label the tokens inside a span to be extracted as POS if there's just one 
// type to extract, or with the property value, otherwise. 	TokenNameCOMMENT_LINE	type to extract, or with the property value, otherwise. 
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
spanType	TokenNameIdentifier	 span Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
taggedLabels	TokenNameIdentifier	 tagged Labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
:	TokenNameCOLON	
taggedLabels	TokenNameIdentifier	 tagged Labels
.	TokenNameDOT	
getSpansWithProperty	TokenNameIdentifier	 get Spans With Property
(	TokenNameLPAREN	
spanProp	TokenNameIdentifier	 span Prop
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
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
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
=	TokenNameEQUAL	
spanType	TokenNameIdentifier	 span Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
:	TokenNameCOLON	
taggedLabels	TokenNameIdentifier	 tagged Labels
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
spanProp	TokenNameIdentifier	 span Prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tagset	TokenNameIdentifier	 tagset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
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
taggedLabels	TokenNameIdentifier	 tagged Labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tokenProp	TokenNameIdentifier	 token Prop
,	TokenNameCOMMA	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTokenProp	TokenNameIdentifier	 get Token Prop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenProp	TokenNameIdentifier	 token Prop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getNonDefaultTagValues	TokenNameIdentifier	 get Non Default Tag Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tagset	TokenNameIdentifier	 tagset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
getTaggedLabels	TokenNameIdentifier	 get Tagged Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
taggedLabels	TokenNameIdentifier	 tagged Labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a TextLabels in which tagged tokens are used to solve the extraction * problem. */	TokenNameCOMMENT_JAVADOC	 Return a TextLabels in which tagged tokens are used to solve the extraction problem. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractFromTags	TokenNameIdentifier	 extract From Tags
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
output	TokenNameIdentifier	 output
,	TokenNameCOMMA	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
taggedLabels	TokenNameIdentifier	 tagged Labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
MixupProgram	TokenNameIdentifier	 Mixup Program
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
MixupProgram	TokenNameIdentifier	 Mixup Program
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tagset	TokenNameIdentifier	 tagset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
tagset	TokenNameIdentifier	 tagset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addStatement	TokenNameIdentifier	 add Statement
(	TokenNameLPAREN	
"defSpanType "	TokenNameStringLiteral	defSpanType 
+	TokenNamePLUS	
output	TokenNameIdentifier	 output
+	TokenNamePLUS	
" =: "	TokenNameStringLiteral	 =: 
+	TokenNamePLUS	
makePattern	TokenNameIdentifier	 make Pattern
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
tagset	TokenNameIdentifier	 tagset
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
tag	TokenNameIdentifier	 tag
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addStatement	TokenNameIdentifier	 add Statement
(	TokenNameLPAREN	
"defSpanProp "	TokenNameStringLiteral	defSpanProp 
+	TokenNamePLUS	
output	TokenNameIdentifier	 output
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
tag	TokenNameIdentifier	 tag
+	TokenNamePLUS	
" =: "	TokenNameStringLiteral	 =: 
+	TokenNamePLUS	
makePattern	TokenNameIdentifier	 make Pattern
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
interp	TokenNameIdentifier	 interp
=	TokenNameEQUAL	
new	TokenNamenew	
MixupInterpreter	TokenNameIdentifier	 Mixup Interpreter
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
taggedLabels	TokenNameIdentifier	 tagged Labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Mixup	TokenNameIdentifier	 Mixup
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"mixup error: "	TokenNameStringLiteral	mixup error: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
makePattern	TokenNameIdentifier	 make Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"... [L "	TokenNameStringLiteral	... [L 
+	TokenNamePLUS	
tokenProp	TokenNameIdentifier	 token Prop
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
+	TokenNamePLUS	
"+ R] ..."	TokenNameStringLiteral	+ R] ...
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
