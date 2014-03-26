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
File	TokenNameIdentifier	 File
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
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
MixupDebugger	TokenNameIdentifier	 Mixup Debugger
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
/** * Run a mixup program. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Run a mixup program. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
DebugMixup	TokenNameIdentifier	 Debug Mixup
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
private	TokenNameprivate	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
MixupParams	TokenNameIdentifier	 Mixup Params
mixup	TokenNameIdentifier	 mixup
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
MixupParams	TokenNameIdentifier	 Mixup Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
debuggerOutputLabels	TokenNameIdentifier	 debugger Output Labels
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
MixupParams	TokenNameIdentifier	 Mixup Params
getMixupParameters	TokenNameIdentifier	 get Mixup Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mixup	TokenNameIdentifier	 mixup
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMixupParameters	TokenNameIdentifier	 set Mixup Parameters
(	TokenNameLPAREN	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
MixupParams	TokenNameIdentifier	 Mixup Params
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mixup	TokenNameIdentifier	 mixup
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
getDebugMixupHelp	TokenNameIdentifier	 get Debug Mixup Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"<A HREF="http://minorthird.sourceforge.net/tutorials/Mixup%20Tutorial.htm">Mixup Tutorial</A></html>"	TokenNameStringLiteral	<A HREF="http://minorthird.sourceforge.net/tutorials/Mixup%20Tutorial.htm">Mixup Tutorial</A></html>
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
,	TokenNameCOMMA	
mixup	TokenNameIdentifier	 mixup
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// run the mixup program 	TokenNameCOMMENT_LINE	run the mixup program 
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
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
fileName	TokenNameIdentifier	 file Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"need to specify -mixup"	TokenNameStringLiteral	need to specify -mixup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
debuggerOutputLabels	TokenNameIdentifier	 debugger Output Labels
=	TokenNameEQUAL	
new	TokenNamenew	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MixupDebugger	TokenNameIdentifier	 Mixup Debugger
debugger	TokenNameIdentifier	 debugger
=	TokenNameEQUAL	
MixupDebugger	TokenNameIdentifier	 Mixup Debugger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
debuggerOutputLabels	TokenNameIdentifier	 debugger Output Labels
,	TokenNameCOMMA	
edit	TokenNameIdentifier	 edit
.	TokenNameDOT	
editFile	TokenNameIdentifier	 edit File
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
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
debugger	TokenNameIdentifier	 debugger
.	TokenNameDOT	
getEditor	TokenNameIdentifier	 get Editor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
debugger	TokenNameIdentifier	 debugger
.	TokenNameDOT	
getEditor	TokenNameIdentifier	 get Editor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"Output of "	TokenNameStringLiteral	Output of 
+	TokenNamePLUS	
mixup	TokenNameIdentifier	 mixup
.	TokenNameDOT	
fileName	TokenNameIdentifier	 file Name
,	TokenNameCOMMA	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
debuggerOutputLabels	TokenNameIdentifier	 debugger Output Labels
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
debuggerOutputLabels	TokenNameIdentifier	 debugger Output Labels
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
DebugMixup	TokenNameIdentifier	 Debug Mixup
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
