package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
BorderLayout	TokenNameIdentifier	 Border Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JComponent	TokenNameIdentifier	 J Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JFrame	TokenNameIdentifier	 J Frame
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
WindowConstants	TokenNameIdentifier	 Window Constants
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
FancyLoader	TokenNameIdentifier	 Fancy Loader
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
TextLabels	TokenNameIdentifier	 Text Labels
;	TokenNameSEMICOLON	
/** * Label top-level "document" spans in a TextBase. */	TokenNameCOMMENT_JAVADOC	 Label top-level "document" spans in a TextBase. 
public	TokenNamepublic	
class	TokenNameclass	
TextBaseLabeler	TokenNameIdentifier	 Text Base Labeler
extends	TokenNameextends	
TrackedTextBaseComponent	TokenNameIdentifier	 Tracked Text Base Component
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
200803014L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// private SpanLabeler spanLabeler; 	TokenNameCOMMENT_LINE	private SpanLabeler spanLabeler; 
public	TokenNamepublic	
TextBaseLabeler	TokenNameIdentifier	 Text Base Labeler
(	TokenNameLPAREN	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
// seen in viewer 	TokenNameCOMMENT_LINE	seen in viewer 
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
// changed in editor 	TokenNameCOMMENT_LINE	changed in editor 
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
=	TokenNameEQUAL	
new	TokenNamenew	
TextBaseViewer	TokenNameIdentifier	 Text Base Viewer
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewerTracker	TokenNameIdentifier	 viewer Tracker
=	TokenNameEQUAL	
new	TokenNamenew	
SpanLabeler	TokenNameIdentifier	 Span Labeler
(	TokenNameLPAREN	
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getDocumentList	TokenNameIdentifier	 get Document List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getSpanPainter	TokenNameIdentifier	 get Span Painter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SpanLabeler	TokenNameIdentifier	 Span Labeler
)	TokenNameRPAREN	
viewerTracker	TokenNameIdentifier	 viewer Tracker
)	TokenNameRPAREN	
.	TokenNameDOT	
addViewer	TokenNameIdentifier	 add Viewer
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getDocumentList	TokenNameIdentifier	 get Document List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addListSelectionListener	TokenNameIdentifier	 add List Selection Listener
(	TokenNameLPAREN	
viewerTracker	TokenNameIdentifier	 viewer Tracker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeLayout	TokenNameIdentifier	 initialize Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Pop up a frame for editing the labels. */	TokenNameCOMMENT_JAVADOC	 Pop up a frame for editing the labels. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
label	TokenNameIdentifier	 label
(	TokenNameLPAREN	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JFrame	TokenNameIdentifier	 J Frame
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
new	TokenNamenew	
JFrame	TokenNameIdentifier	 J Frame
(	TokenNameLPAREN	
"TextBaseLabeler"	TokenNameStringLiteral	TextBaseLabeler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
=	TokenNameEQUAL	
new	TokenNamenew	
StatusMessage	TokenNameIdentifier	 Status Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBaseLabeler	TokenNameIdentifier	 Text Base Labeler
labeler	TokenNameIdentifier	 labeler
=	TokenNameEQUAL	
new	TokenNamenew	
TextBaseLabeler	TokenNameIdentifier	 Text Base Labeler
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
labeler	TokenNameIdentifier	 labeler
.	TokenNameDOT	
setSaveAs	TokenNameIdentifier	 set Save As
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JComponent	TokenNameIdentifier	 J Component
main	TokenNameIdentifier	 main
=	TokenNameEQUAL	
new	TokenNamenew	
StatusMessagePanel	TokenNameIdentifier	 Status Message Panel
(	TokenNameLPAREN	
labeler	TokenNameIdentifier	 labeler
,	TokenNameCOMMA	
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
main	TokenNameIdentifier	 main
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
CENTER	TokenNameIdentifier	 CENTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
setDefaultCloseOperation	TokenNameIdentifier	 set Default Close Operation
(	TokenNameLPAREN	
WindowConstants	TokenNameIdentifier	 Window Constants
.	TokenNameDOT	
DISPOSE_ON_CLOSE	TokenNameIdentifier	 DISPOSE  ON  CLOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
pack	TokenNameIdentifier	 pack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
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
"Usage: TextBaseLabeler <data> <labelfile>"	TokenNameStringLiteral	Usage: TextBaseLabeler <data> <labelfile>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
)	TokenNameRPAREN	
FancyLoader	TokenNameIdentifier	 Fancy Loader
.	TokenNameDOT	
loadTextLabels	TokenNameIdentifier	 load Text Labels
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
