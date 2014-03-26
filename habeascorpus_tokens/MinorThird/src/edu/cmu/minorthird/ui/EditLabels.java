package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
ui	TokenNameIdentifier	 ui
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
TextBase	TokenNameIdentifier	 Text Base
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
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
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
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
TextBaseEditor	TokenNameIdentifier	 Text Base Editor
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
JointCommandLineProcessor	TokenNameIdentifier	 Joint Command Line Processor
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
/** * Hand-label some documents. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Hand-label some documents. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
EditLabels	TokenNameIdentifier	 Edit Labels
extends	TokenNameextends	
UIMain	TokenNameIdentifier	 UI Main
{	TokenNameLBRACE	
// private data needed 	TokenNameCOMMENT_LINE	private data needed 
private	TokenNameprivate	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
EditParams	TokenNameIdentifier	 Edit Params
edit	TokenNameIdentifier	 edit
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
EditParams	TokenNameIdentifier	 Edit Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
editorOutputLabels	TokenNameIdentifier	 editor Output Labels
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
EditParams	TokenNameIdentifier	 Edit Params
getEditParameters	TokenNameIdentifier	 get Edit Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
edit	TokenNameIdentifier	 edit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEditParameters	TokenNameIdentifier	 set Edit Parameters
(	TokenNameLPAREN	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
EditParams	TokenNameIdentifier	 Edit Params
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
edit	TokenNameIdentifier	 edit
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEditLabelsHelp	TokenNameIdentifier	 get Edit Labels Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"<A HREF="http://minorthird.sourceforge.net/tutorials/EditLabels%20Tutorial.htm">EditLabels Tutorial</A></html>"	TokenNameStringLiteral	<A HREF="http://minorthird.sourceforge.net/tutorials/EditLabels%20Tutorial.htm">EditLabels Tutorial</A></html>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
JointCommandLineProcessor	TokenNameIdentifier	 Joint Command Line Processor
(	TokenNameLPAREN	
new	TokenNamenew	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
gui	TokenNameIdentifier	 gui
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
edit	TokenNameIdentifier	 edit
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// invoke the TextBaseLabeler 	TokenNameCOMMENT_LINE	invoke the TextBaseLabeler 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
doMain	TokenNameIdentifier	 do Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
editFile	TokenNameIdentifier	 edit File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"need to specify -edit"	TokenNameStringLiteral	need to specify -edit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBase	TokenNameIdentifier	 Text Base
textBase	TokenNameIdentifier	 text Base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
editorOutputLabels	TokenNameIdentifier	 editor Output Labels
=	TokenNameEQUAL	
new	TokenNamenew	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadOps	TokenNameIdentifier	 load Ops
(	TokenNameLPAREN	
textBase	TokenNameIdentifier	 text Base
,	TokenNameCOMMA	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
editFile	TokenNameIdentifier	 edit File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Can't load from "	TokenNameStringLiteral	Can't load from 
+	TokenNamePLUS	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
editFile	TokenNameIdentifier	 edit File
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
trueType	TokenNameIdentifier	 true Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
editorOutputLabels	TokenNameIdentifier	 editor Output Labels
.	TokenNameDOT	
declareType	TokenNameIdentifier	 declare Type
(	TokenNameLPAREN	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
trueType	TokenNameIdentifier	 true Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TextBaseEditor	TokenNameIdentifier	 Text Base Editor
editor	TokenNameIdentifier	 editor
=	TokenNameEQUAL	
TextBaseEditor	TokenNameIdentifier	 Text Base Editor
.	TokenNameDOT	
edit	TokenNameIdentifier	 edit
(	TokenNameLPAREN	
editorOutputLabels	TokenNameIdentifier	 editor Output Labels
,	TokenNameCOMMA	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
editFile	TokenNameIdentifier	 edit File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
extractedType	TokenNameIdentifier	 extracted Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
editor	TokenNameIdentifier	 editor
.	TokenNameDOT	
getViewer	TokenNameIdentifier	 get Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGuessBox	TokenNameIdentifier	 get Guess Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setSelectedItem	TokenNameIdentifier	 set Selected Item
(	TokenNameLPAREN	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
extractedType	TokenNameIdentifier	 extracted Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
trueType	TokenNameIdentifier	 true Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
editor	TokenNameIdentifier	 editor
.	TokenNameDOT	
getViewer	TokenNameIdentifier	 get Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTruthBox	TokenNameIdentifier	 get Truth Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setSelectedItem	TokenNameIdentifier	 set Selected Item
(	TokenNameLPAREN	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
trueType	TokenNameIdentifier	 true Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
showResult	TokenNameIdentifier	 show Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"Output of editing"	TokenNameStringLiteral	Output of editing
,	TokenNameCOMMA	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
editorOutputLabels	TokenNameIdentifier	 editor Output Labels
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getMainResult	TokenNameIdentifier	 get Main Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
editorOutputLabels	TokenNameIdentifier	 editor Output Labels
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
EditLabels	TokenNameIdentifier	 Edit Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
callMain	TokenNameIdentifier	 call Main
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
