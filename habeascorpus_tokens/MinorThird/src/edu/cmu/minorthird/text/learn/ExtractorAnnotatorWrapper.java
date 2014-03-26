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
InputStream	TokenNameIdentifier	 Input Stream
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
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IOUtil	TokenNameIdentifier	 IO Util
;	TokenNameSEMICOLON	
/** * Wraps an ExtractorAnnotator with some code to implement * a simple API. */	TokenNameCOMMENT_JAVADOC	 Wraps an ExtractorAnnotator with some code to implement a simple API. 
public	TokenNamepublic	
class	TokenNameclass	
ExtractorAnnotatorWrapper	TokenNameIdentifier	 Extractor Annotator Wrapper
{	TokenNameLBRACE	
private	TokenNameprivate	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
annotator	TokenNameIdentifier	 annotator
;	TokenNameSEMICOLON	
/** Construct from a file containing a serialized extractor, as * would be learned by TrainExtractor. */	TokenNameCOMMENT_JAVADOC	 Construct from a file containing a serialized extractor, as would be learned by TrainExtractor. 
public	TokenNamepublic	
ExtractorAnnotatorWrapper	TokenNameIdentifier	 Extractor Annotator Wrapper
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
annotator	TokenNameIdentifier	 annotator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
)	TokenNameRPAREN	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
loadSerialized	TokenNameIdentifier	 load Serialized
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct from an InputStream containing a serialized extractor, as * would be learned by TrainExtractor. */	TokenNameCOMMENT_JAVADOC	 Construct from an InputStream containing a serialized extractor, as would be learned by TrainExtractor. 
public	TokenNamepublic	
ExtractorAnnotatorWrapper	TokenNameIdentifier	 Extractor Annotator Wrapper
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
annotator	TokenNameIdentifier	 annotator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
)	TokenNameRPAREN	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
loadSerialized	TokenNameIdentifier	 load Serialized
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct from an annotator that implements the * ExtractorAnnotator interface. */	TokenNameCOMMENT_JAVADOC	 Construct from an annotator that implements the ExtractorAnnotator interface. 
public	TokenNamepublic	
ExtractorAnnotatorWrapper	TokenNameIdentifier	 Extractor Annotator Wrapper
(	TokenNameLPAREN	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
annotator	TokenNameIdentifier	 annotator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
annotator	TokenNameIdentifier	 annotator
=	TokenNameEQUAL	
annotator	TokenNameIdentifier	 annotator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExtractorAnnotator	TokenNameIdentifier	 Extractor Annotator
getAnnotator	TokenNameIdentifier	 get Annotator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
annotator	TokenNameIdentifier	 annotator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Apply the wrapped annotator to a string, and return all * substrings extracted. */	TokenNameCOMMENT_JAVADOC	 Apply the wrapped annotator to a string, and return all substrings extracted. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
extractFrom	TokenNameIdentifier	 extract From
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextBase	TokenNameIdentifier	 Basic Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
"noSource"	TokenNameStringLiteral	noSource
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
annotator	TokenNameIdentifier	 annotator
.	TokenNameDOT	
annotate	TokenNameIdentifier	 annotate
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
accum	TokenNameIdentifier	 accum
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
annotator	TokenNameIdentifier	 annotator
.	TokenNameDOT	
getSpanType	TokenNameIdentifier	 get Span Type
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
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
accum	TokenNameIdentifier	 accum
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** An interactive test routine to see if this thing works. */	TokenNameCOMMENT_JAVADOC	 An interactive test routine to see if this thing works. 
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
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: annotator-file sample-string1 sample-string2 ..."	TokenNameStringLiteral	usage: annotator-file sample-string1 sample-string2 ...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ExtractorAnnotatorWrapper	TokenNameIdentifier	 Extractor Annotator Wrapper
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
ExtractorAnnotatorWrapper	TokenNameIdentifier	 Extractor Annotator Wrapper
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
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
extractFrom	TokenNameIdentifier	 extract From
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Total of "	TokenNameStringLiteral	Total of 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" extractions from arg"	TokenNameStringLiteral	 extractions from arg
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" '"	TokenNameStringLiteral	 '
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
