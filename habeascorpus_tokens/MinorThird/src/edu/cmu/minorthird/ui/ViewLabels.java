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
/** * Interactively view TextLabels. */	TokenNameCOMMENT_JAVADOC	 Interactively view TextLabels. 
public	TokenNamepublic	
class	TokenNameclass	
ViewLabels	TokenNameIdentifier	 View Labels
{	TokenNameLBRACE	
protected	TokenNameprotected	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
BaseParams	TokenNameIdentifier	 Base Params
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
BaseParams	TokenNameIdentifier	 Base Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
ViewLabelsParams	TokenNameIdentifier	 View Labels Params
viewLabels	TokenNameIdentifier	 view Labels
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
ViewLabelsParams	TokenNameIdentifier	 View Labels Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
{	TokenNameLBRACE	
ViewLabels	TokenNameIdentifier	 View Labels
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
ViewLabels	TokenNameIdentifier	 View Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
processArguments	TokenNameIdentifier	 process Arguments
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//m.viewLabels.processArguments(args); 	TokenNameCOMMENT_LINE	m.viewLabels.processArguments(args); 
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"ViewLabels"	TokenNameStringLiteral	ViewLabels
+	TokenNamePLUS	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
