/* Copyright 2006, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2006, Carnegie Mellon, All Rights Reserved 
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
FileFilter	TokenNameIdentifier	 File Filter
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
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
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
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
ProgressCounter	TokenNameIdentifier	 Progress Counter
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
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
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
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
;	TokenNameSEMICOLON	
/* * A more scalable version of a document-per-file TextBase with * standoff annotation. In a LabeledDirectory, annotations are * generated document-by-document, and each set of annotations is * saved in a .labels file for that document alone, rather than by * reading the entire collection into memory and annotating it at * once. * * @author William Cohen */	TokenNameCOMMENT_BLOCK	 A more scalable version of a document-per-file TextBase with standoff annotation. In a LabeledDirectory, annotations are generated document-by-document, and each set of annotations is saved in a .labels file for that document alone, rather than by reading the entire collection into memory and annotating it at once. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
LabeledDirectory	TokenNameIdentifier	 Labeled Directory
implements	TokenNameimplements	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
.	TokenNameDOT	
Configurable	TokenNameIdentifier	 Configurable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileFilter	TokenNameIdentifier	 File Filter
TEXT_FILE_FILTER	TokenNameIdentifier	 TEXT  FILE  FILTER
=	TokenNameEQUAL	
new	TokenNamenew	
FileFilter	TokenNameIdentifier	 File Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".txt"	TokenNameStringLiteral	.txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Annotator	TokenNameIdentifier	 Annotator
>	TokenNameGREATER	
annotatorList	TokenNameIdentifier	 annotator List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Annotator	TokenNameIdentifier	 Annotator
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
requireList	TokenNameIdentifier	 require List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
resetAll	TokenNameIdentifier	 reset All
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
nameOfFileToView	TokenNameIdentifier	 name Of File To View
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** A CommandLineProcessor for LabeledDirectory. */	TokenNameCOMMENT_JAVADOC	 A CommandLineProcessor for LabeledDirectory. 
public	TokenNamepublic	
class	TokenNameclass	
MyCLP	TokenNameIdentifier	 My CLP
extends	TokenNameextends	
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dir	TokenNameIdentifier	 dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
annotate	TokenNameIdentifier	 annotate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotatorList	TokenNameIdentifier	 annotator List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getAnnotator	TokenNameIdentifier	 get Annotator
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
requireList	TokenNameIdentifier	 require List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetAll	TokenNameIdentifier	 reset All
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
view	TokenNameIdentifier	 view
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nameOfFileToView	TokenNameIdentifier	 name Of File To View
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return a CommandLineProcessor that be used to configure a LabeledDirectory */	TokenNameCOMMENT_JAVADOC	 Return a CommandLineProcessor that be used to configure a LabeledDirectory 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
getCLP	TokenNameIdentifier	 get CLP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MyCLP	TokenNameIdentifier	 My CLP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LabeledDirectory	TokenNameIdentifier	 Labeled Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LabeledDirectory	TokenNameIdentifier	 Labeled Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LabeledDirectory	TokenNameIdentifier	 Labeled Directory
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the TextLabels which annotates this file. */	TokenNameCOMMENT_JAVADOC	 Get the TextLabels which annotates this file. 
public	TokenNamepublic	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
getTextLabels	TokenNameIdentifier	 get Text Labels
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TextBase	TokenNameIdentifier	 Text Base
textBase	TokenNameIdentifier	 text Base
=	TokenNameEQUAL	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
stem	TokenNameIdentifier	 stem
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
".txt"	TokenNameStringLiteral	.txt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
labelFile	TokenNameIdentifier	 label File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stem	TokenNameIdentifier	 stem
+	TokenNamePLUS	
".labels"	TokenNameStringLiteral	.labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
labelFile	TokenNameIdentifier	 label File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadOps	TokenNameIdentifier	 load Ops
(	TokenNameLPAREN	
textBase	TokenNameIdentifier	 text Base
,	TokenNameCOMMA	
labelFile	TokenNameIdentifier	 label File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
textBase	TokenNameIdentifier	 text Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a TextBase that contains exactly this file. */	TokenNameCOMMENT_JAVADOC	 Get a TextBase that contains exactly this file. 
private	TokenNameprivate	
TextBase	TokenNameIdentifier	 Text Base
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
contents	TokenNameIdentifier	 contents
=	TokenNameEQUAL	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
readFile	TokenNameIdentifier	 read File
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"someFile"	TokenNameStringLiteral	someFile
,	TokenNameCOMMA	
contents	TokenNameIdentifier	 contents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Re-label the text files in the directory. This uses lists of * annotators and 'require' calls that have been set up * previously. */	TokenNameCOMMENT_JAVADOC	 Re-label the text files in the directory. This uses lists of annotators and 'require' calls that have been set up previously. 
public	TokenNamepublic	
void	TokenNamevoid	
reLabelText	TokenNameIdentifier	 re Label Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
textFiles	TokenNameIdentifier	 text Files
=	TokenNameEQUAL	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
TEXT_FILE_FILTER	TokenNameIdentifier	 TEXT  FILE  FILTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
textFiles	TokenNameIdentifier	 text Files
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't list directory "	TokenNameStringLiteral	can't list directory 
+	TokenNamePLUS	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
filePC	TokenNameIdentifier	 file PC
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"labeling"	TokenNameStringLiteral	labeling
,	TokenNameCOMMA	
"file"	TokenNameStringLiteral	file
,	TokenNameCOMMA	
textFiles	TokenNameIdentifier	 text Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
new	TokenNamenew	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
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
textFiles	TokenNameIdentifier	 text Files
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
fileJ	TokenNameIdentifier	 file J
=	TokenNameEQUAL	
textFiles	TokenNameIdentifier	 text Files
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
getTextLabels	TokenNameIdentifier	 get Text Labels
(	TokenNameLPAREN	
fileJ	TokenNameIdentifier	 file J
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resetAll	TokenNameIdentifier	 reset All
)	TokenNameRPAREN	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
BasicTextLabels	TokenNameIdentifier	 Basic Text Labels
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Annotator	TokenNameIdentifier	 Annotator
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
annotatorList	TokenNameIdentifier	 annotator List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Annotator	TokenNameIdentifier	 Annotator
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
annotate	TokenNameIdentifier	 annotate
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
requireList	TokenNameIdentifier	 require List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
req	TokenNameIdentifier	 req
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
require	TokenNameIdentifier	 require
(	TokenNameLPAREN	
req	TokenNameIdentifier	 req
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
stem	TokenNameIdentifier	 stem
=	TokenNameEQUAL	
fileJ	TokenNameIdentifier	 file J
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fileJ	TokenNameIdentifier	 file J
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
".txt"	TokenNameStringLiteral	.txt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
labelFile	TokenNameIdentifier	 label File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
stem	TokenNameIdentifier	 stem
+	TokenNamePLUS	
".labels"	TokenNameStringLiteral	.labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
saveTypesAsOps	TokenNameIdentifier	 save Types As Ops
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
labelFile	TokenNameIdentifier	 label File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filePC	TokenNameIdentifier	 file PC
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
filePC	TokenNameIdentifier	 file PC
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// convert to a file and check that it is an existing directory 	TokenNameCOMMENT_LINE	convert to a file and check that it is an existing directory 
private	TokenNameprivate	
File	TokenNameIdentifier	 File
getDirectory	TokenNameIdentifier	 get Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
dirName	TokenNameIdentifier	 dir Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
dirName	TokenNameIdentifier	 dir Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"not a directory: "	TokenNameStringLiteral	not a directory: 
+	TokenNamePLUS	
dirName	TokenNameIdentifier	 dir Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load an annotator from a file 	TokenNameCOMMENT_LINE	load an annotator from a file 
private	TokenNameprivate	
Annotator	TokenNameIdentifier	 Annotator
getAnnotator	TokenNameIdentifier	 get Annotator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
annotatorName	TokenNameIdentifier	 annotator Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
annFile	TokenNameIdentifier	 ann File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
annotatorName	TokenNameIdentifier	 annotator Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Annotator	TokenNameIdentifier	 Annotator
)	TokenNameRPAREN	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
loadSerialized	TokenNameIdentifier	 load Serialized
(	TokenNameLPAREN	
annFile	TokenNameIdentifier	 ann File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't load annotator "	TokenNameStringLiteral	can't load annotator 
+	TokenNamePLUS	
annotatorName	TokenNameIdentifier	 annotator Name
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A simple main program that allows you to add annotations to a directory of text files. */	TokenNameCOMMENT_JAVADOC	 A simple main program that allows you to add annotations to a directory of text files. 
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
LabeledDirectory	TokenNameIdentifier	 Labeled Directory
ld	TokenNameIdentifier	 ld
=	TokenNameEQUAL	
new	TokenNamenew	
LabeledDirectory	TokenNameIdentifier	 Labeled Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ld	TokenNameIdentifier	 ld
.	TokenNameDOT	
getCLP	TokenNameIdentifier	 get CLP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
processArguments	TokenNameIdentifier	 process Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ld	TokenNameIdentifier	 ld
.	TokenNameDOT	
nameOfFileToView	TokenNameIdentifier	 name Of File To View
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ld	TokenNameIdentifier	 ld
.	TokenNameDOT	
reLabelText	TokenNameIdentifier	 re Label Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
ld	TokenNameIdentifier	 ld
.	TokenNameDOT	
getTextLabels	TokenNameIdentifier	 get Text Labels
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
ld	TokenNameIdentifier	 ld
.	TokenNameDOT	
nameOfFileToView	TokenNameIdentifier	 name Of File To View
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
ld	TokenNameIdentifier	 ld
.	TokenNameDOT	
nameOfFileToView	TokenNameIdentifier	 name Of File To View
,	TokenNameCOMMA	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
