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
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
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
List	TokenNameIdentifier	 List
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
LBJ2	TokenNameIdentifier	 LB J2
.	TokenNameDOT	
nlp	TokenNameIdentifier	 nlp
.	TokenNameDOT	
SentenceSplitter	TokenNameIdentifier	 Sentence Splitter
;	TokenNameSEMICOLON	
import	TokenNameimport	
LBJ2	TokenNameIdentifier	 LB J2
.	TokenNameDOT	
nlp	TokenNameIdentifier	 nlp
.	TokenNameDOT	
WordSplitter	TokenNameIdentifier	 Word Splitter
;	TokenNameSEMICOLON	
import	TokenNameimport	
LBJ2	TokenNameIdentifier	 LB J2
.	TokenNameDOT	
nlp	TokenNameIdentifier	 nlp
.	TokenNameDOT	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
PlainToTokenParser	TokenNameIdentifier	 Plain To Token Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
LBJ2	TokenNameIdentifier	 LB J2
.	TokenNameDOT	
nlp	TokenNameIdentifier	 nlp
.	TokenNameDOT	
seg	TokenNameIdentifier	 seg
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
IOUtil	TokenNameIdentifier	 IO Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
illinois	TokenNameIdentifier	 illinois
.	TokenNameDOT	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
cogcomp	TokenNameIdentifier	 cogcomp
.	TokenNameDOT	
lbj	TokenNameIdentifier	 lbj
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
POSTagger	TokenNameIdentifier	 POS Tagger
;	TokenNameSEMICOLON	
/** * A wrapper for UIUC CCG's LBJ POS tagger * * http://cogcomp.cs.illinois.edu/page/software_view/3 * * @author frank */	TokenNameCOMMENT_JAVADOC	 A wrapper for UIUC CCG's LBJ POS tagger * http://cogcomp.cs.illinois.edu/page/software_view/3 * @author frank 
public	TokenNamepublic	
class	TokenNameclass	
LBJPOSTagger	TokenNameIdentifier	 LBJPOS Tagger
extends	TokenNameextends	
StringAnnotator	TokenNameIdentifier	 String Annotator
{	TokenNameLBRACE	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
LBJPOSTagger	TokenNameIdentifier	 LBJPOS Tagger
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LBJPOSTagger	TokenNameIdentifier	 LBJPOS Tagger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// tell superclass what type of annotation is being provided 	TokenNameCOMMENT_LINE	tell superclass what type of annotation is being provided 
providedAnnotation	TokenNameIdentifier	 provided Annotation
=	TokenNameEQUAL	
"pos"	TokenNameStringLiteral	pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns char based stand-off annotations for POS in the given string * * @param in String to tag * @return tagged String */	TokenNameCOMMENT_JAVADOC	 Returns char based stand-off annotations for POS in the given string * @param in String to tag @return tagged String 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
CharAnnotation	TokenNameIdentifier	 Char Annotation
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
annotateString	TokenNameIdentifier	 annotate String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CharAnnotation	TokenNameIdentifier	 Char Annotation
>	TokenNameGREATER	
tags	TokenNameIdentifier	 tags
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CharAnnotation	TokenNameIdentifier	 Char Annotation
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
POSTagger	TokenNameIdentifier	 POS Tagger
tagger	TokenNameIdentifier	 tagger
=	TokenNameEQUAL	
new	TokenNamenew	
POSTagger	TokenNameIdentifier	 POS Tagger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PlainToTokenParser	TokenNameIdentifier	 Plain To Token Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
PlainToTokenParser	TokenNameIdentifier	 Plain To Token Parser
(	TokenNameLPAREN	
new	TokenNamenew	
WordSplitter	TokenNameIdentifier	 Word Splitter
(	TokenNameLPAREN	
new	TokenNamenew	
SentenceSplitter	TokenNameIdentifier	 Sentence Splitter
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
word	TokenNameIdentifier	 word
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
CharAnnotation	TokenNameIdentifier	 Char Annotation
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
tagger	TokenNameIdentifier	 tagger
.	TokenNameDOT	
discreteValue	TokenNameIdentifier	 discrete Value
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
CharAnnotation	TokenNameIdentifier	 Char Annotation
[	TokenNameLBRACKET	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
"See: http://cogcomp.cs.illinois.edu/page/software_view/3"	TokenNameStringLiteral	See: http://cogcomp.cs.illinois.edu/page/software_view/3
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: <input_file> <output_file>"	TokenNameStringLiteral	Usage: <input_file> <output_file>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
inFile	TokenNameIdentifier	 in File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
outFile	TokenNameIdentifier	 out File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inFile	TokenNameIdentifier	 in File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
inFile	TokenNameIdentifier	 in File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"Error: File "	TokenNameStringLiteral	Error: File 
+	TokenNamePLUS	
inFile	TokenNameIdentifier	 in File
+	TokenNamePLUS	
" could not be found!"	TokenNameStringLiteral	 could not be found!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
inFile	TokenNameIdentifier	 in File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LBJPOSTagger	TokenNameIdentifier	 LBJPOS Tagger
tagger	TokenNameIdentifier	 tagger
=	TokenNameEQUAL	
new	TokenNamenew	
LBJPOSTagger	TokenNameIdentifier	 LBJPOS Tagger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharAnnotation	TokenNameIdentifier	 Char Annotation
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tags	TokenNameIdentifier	 tags
=	TokenNameEQUAL	
tagger	TokenNameIdentifier	 tagger
.	TokenNameDOT	
annotateString	TokenNameIdentifier	 annotate String
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
outFile	TokenNameIdentifier	 out File
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"utf8"	TokenNameStringLiteral	utf8
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
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
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
tags	TokenNameIdentifier	 tags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tags	TokenNameIdentifier	 tags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
tags	TokenNameIdentifier	 tags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
tags	TokenNameIdentifier	 tags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
