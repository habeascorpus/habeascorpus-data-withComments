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
File	TokenNameIdentifier	 File
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
Serializable	TokenNameIdentifier	 Serializable
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IOUtil	TokenNameIdentifier	 IO Util
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
StringUtil	TokenNameIdentifier	 String Util
;	TokenNameSEMICOLON	
/** * An annotator that 'requires' some type of annotation, but exports * only a selected set of spanTypes (maybe all of them) from the * annotated documents. The 'require' call is done in the context of * a particular set of files (e.g. mixup files). This is a wrapper * around EncapsulatingAnnotatorLoader. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 An annotator that 'requires' some type of annotation, but exports only a selected set of spanTypes (maybe all of them) from the annotated documents. The 'require' call is done in the context of a particular set of files (e.g. mixup files). This is a wrapper around EncapsulatingAnnotatorLoader. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
EncapsulatedAnnotator	TokenNameIdentifier	 Encapsulated Annotator
extends	TokenNameextends	
AbstractAnnotator	TokenNameIdentifier	 Abstract Annotator
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080303L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
requiredAnnotation	TokenNameIdentifier	 required Annotation
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exportedTypes	TokenNameIdentifier	 exported Types
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AnnotatorLoader	TokenNameIdentifier	 Annotator Loader
annotatorLoader	TokenNameIdentifier	 annotator Loader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EncapsulatedAnnotator	TokenNameIdentifier	 Encapsulated Annotator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
requiredAnnotation	TokenNameIdentifier	 required Annotation
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
requiredAnnotation	TokenNameIdentifier	 required Annotation
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
EncapsulatedAnnotator	TokenNameIdentifier	 Encapsulated Annotator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
requiredAnnotation	TokenNameIdentifier	 required Annotation
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
requiredAnnotation	TokenNameIdentifier	 required Annotation
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param exportedTypes - only span types from this list will actually * by exported by the annotator */	TokenNameCOMMENT_JAVADOC	 @param exportedTypes - only span types from this list will actually by exported by the annotator 
public	TokenNamepublic	
EncapsulatedAnnotator	TokenNameIdentifier	 Encapsulated Annotator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
requiredAnnotation	TokenNameIdentifier	 required Annotation
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exportedTypes	TokenNameIdentifier	 exported Types
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
requiredAnnotation	TokenNameIdentifier	 required Annotation
=	TokenNameEQUAL	
requiredAnnotation	TokenNameIdentifier	 required Annotation
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exportedTypes	TokenNameIdentifier	 exported Types
=	TokenNameEQUAL	
exportedTypes	TokenNameIdentifier	 exported Types
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
annotatorLoader	TokenNameIdentifier	 annotator Loader
=	TokenNameEQUAL	
new	TokenNamenew	
EncapsulatingAnnotatorLoader	TokenNameIdentifier	 Encapsulating Annotator Loader
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"will export these types: "	TokenNameStringLiteral	will export these types: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
exportedTypes	TokenNameIdentifier	 exported Types
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"all"	TokenNameStringLiteral	all
:	TokenNameCOLON	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
exportedTypes	TokenNameIdentifier	 exported Types
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
exportedTypes	TokenNameIdentifier	 exported Types
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("exporting all types"); 	TokenNameCOMMENT_LINE	System.out.println("exporting all types"); 
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
requiredAnnotation	TokenNameIdentifier	 required Annotation
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
annotatorLoader	TokenNameIdentifier	 annotator Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// just export a few span types 	TokenNameCOMMENT_LINE	just export a few span types 
//System.out.println("export these types: "+StringUtil.toString(exportedTypes)); 	TokenNameCOMMENT_LINE	System.out.println("export these types: "+StringUtil.toString(exportedTypes)); 
//System.out.println("labels: "+labels); 	TokenNameCOMMENT_LINE	System.out.println("labels: "+labels); 
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
tempLabels	TokenNameIdentifier	 temp Labels
=	TokenNameEQUAL	
new	TokenNamenew	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tempLabels	TokenNameIdentifier	 temp Labels
.	TokenNameDOT	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
requiredAnnotation	TokenNameIdentifier	 required Annotation
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
annotatorLoader	TokenNameIdentifier	 annotator Loader
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
exportedTypes	TokenNameIdentifier	 exported Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("exporting type"+exportedTypes[i]); 	TokenNameCOMMENT_LINE	System.out.println("exporting type"+exportedTypes[i]); 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
tempLabels	TokenNameIdentifier	 temp Labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
exportedTypes	TokenNameIdentifier	 exported Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
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
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
exportedTypes	TokenNameIdentifier	 exported Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//System.out.println("tempLabels: "+tempLabels); 	TokenNameCOMMENT_LINE	System.out.println("tempLabels: "+tempLabels); 
}	TokenNameRBRACE	
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
"annotated with '"	TokenNameStringLiteral	annotated with '
+	TokenNamePLUS	
requiredAnnotation	TokenNameIdentifier	 required Annotation
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a serialized annotator that 'requires' a particular * type of annotation in the context of a particular set of files. */	TokenNameCOMMENT_JAVADOC	 Create a serialized annotator that 'requires' a particular type of annotation in the context of a particular set of files. 
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: save-file requiredAnnotation path [exportedSpan1 ... ]"	TokenNameStringLiteral	usage: save-file requiredAnnotation path [exportedSpan1 ... ]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
EncapsulatedAnnotator	TokenNameIdentifier	 Encapsulated Annotator
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
new	TokenNamenew	
EncapsulatedAnnotator	TokenNameIdentifier	 Encapsulated Annotator
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exportedTypes	TokenNameIdentifier	 exported Types
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
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
exportedTypes	TokenNameIdentifier	 exported Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
exportedTypes	TokenNameIdentifier	 exported Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
new	TokenNamenew	
EncapsulatedAnnotator	TokenNameIdentifier	 Encapsulated Annotator
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
exportedTypes	TokenNameIdentifier	 exported Types
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
saveSerialized	TokenNameIdentifier	 save Serialized
(	TokenNameLPAREN	
ann	TokenNameIdentifier	 ann
,	TokenNameCOMMA	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
