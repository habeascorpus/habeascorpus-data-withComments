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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Dimension	TokenNameIdentifier	 Dimension
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
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
JSplitPane	TokenNameIdentifier	 J Split Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
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
TextBaseEditorPlusLabeler	TokenNameIdentifier	 Text Base Editor Plus Labeler
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
ViewerTracker	TokenNameIdentifier	 Viewer Tracker
viewerTracker2	TokenNameIdentifier	 viewer Tracker2
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TextBaseEditorPlusLabeler	TokenNameIdentifier	 Text Base Editor Plus Labeler
(	TokenNameLPAREN	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
// seen 	TokenNameCOMMENT_LINE	seen 
// in 	TokenNameCOMMENT_LINE	in 
// viewer 	TokenNameCOMMENT_LINE	viewer 
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
viewerTracker2	TokenNameIdentifier	 viewer Tracker2
=	TokenNameEQUAL	
new	TokenNamenew	
SpanEditor	TokenNameIdentifier	 Span Editor
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
// ((SpanLabeler) viewerTracker).addViewer(viewer); 	TokenNameCOMMENT_LINE	((SpanLabeler) viewerTracker).addViewer(viewer); 
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
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getDocumentList	TokenNameIdentifier	 get Document List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addListSelectionListener	TokenNameIdentifier	 add List Selection Listener
(	TokenNameLPAREN	
viewerTracker2	TokenNameIdentifier	 viewer Tracker2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getTruthBox	TokenNameIdentifier	 get Truth Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
TextBaseEditor	TokenNameIdentifier	 Text Base Editor
.	TokenNameDOT	
EditTypeAction	TokenNameIdentifier	 Edit Type Action
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getGuessBox	TokenNameIdentifier	 get Guess Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getTruthBox	TokenNameIdentifier	 get Truth Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
SpanEditor	TokenNameIdentifier	 Span Editor
)	TokenNameRPAREN	
viewerTracker2	TokenNameIdentifier	 viewer Tracker2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getGuessBox	TokenNameIdentifier	 get Guess Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
TextBaseEditor	TokenNameIdentifier	 Text Base Editor
.	TokenNameDOT	
EditTypeAction	TokenNameIdentifier	 Edit Type Action
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getGuessBox	TokenNameIdentifier	 get Guess Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getTruthBox	TokenNameIdentifier	 get Truth Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
SpanEditor	TokenNameIdentifier	 Span Editor
)	TokenNameRPAREN	
viewerTracker2	TokenNameIdentifier	 viewer Tracker2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeTwoTrackerLayout	TokenNameIdentifier	 initialize Two Tracker Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initializeTwoTrackerLayout	TokenNameIdentifier	 initialize Two Tracker Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPreferredSize	TokenNameIdentifier	 set Preferred Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
600	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
gbc	TokenNameIdentifier	 gbc
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
setMinimumSize	TokenNameIdentifier	 set Minimum Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
tabbed	TokenNameIdentifier	 tabbed
=	TokenNameEQUAL	
new	TokenNamenew	
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewerTracker	TokenNameIdentifier	 viewer Tracker
.	TokenNameDOT	
setMinimumSize	TokenNameIdentifier	 set Minimum Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewerTracker2	TokenNameIdentifier	 viewer Tracker2
.	TokenNameDOT	
setMinimumSize	TokenNameIdentifier	 set Minimum Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tabbed	TokenNameIdentifier	 tabbed
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Label parts"	TokenNameStringLiteral	Label parts
,	TokenNameCOMMA	
viewerTracker2	TokenNameIdentifier	 viewer Tracker2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tabbed	TokenNameIdentifier	 tabbed
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Label whole"	TokenNameStringLiteral	Label whole
,	TokenNameCOMMA	
viewerTracker	TokenNameIdentifier	 viewer Tracker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JSplitPane	TokenNameIdentifier	 J Split Pane
splitPane	TokenNameIdentifier	 split Pane
=	TokenNameEQUAL	
new	TokenNamenew	
JSplitPane	TokenNameIdentifier	 J Split Pane
(	TokenNameLPAREN	
JSplitPane	TokenNameIdentifier	 J Split Pane
.	TokenNameDOT	
VERTICAL_SPLIT	TokenNameIdentifier	 VERTICAL  SPLIT
,	TokenNameCOMMA	
viewer	TokenNameIdentifier	 viewer
,	TokenNameCOMMA	
tabbed	TokenNameIdentifier	 tabbed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setDividerLocation	TokenNameIdentifier	 set Divider Location
(	TokenNameLPAREN	
400	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
=	TokenNameEQUAL	
new	TokenNamenew	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
BOTH	TokenNameIdentifier	 BOTH
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
splitPane	TokenNameIdentifier	 split Pane
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** add a 'save' button */	TokenNameCOMMENT_JAVADOC	 add a 'save' button 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setSaveAs	TokenNameIdentifier	 set Save As
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
{	TokenNameLBRACE	
viewerTracker	TokenNameIdentifier	 viewer Tracker
.	TokenNameDOT	
setSaveAs	TokenNameIdentifier	 set Save As
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewerTracker2	TokenNameIdentifier	 viewer Tracker2
.	TokenNameDOT	
setSaveAs	TokenNameIdentifier	 set Save As
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Pop up a frame for editing the labels. */	TokenNameCOMMENT_JAVADOC	 Pop up a frame for editing the labels. 
public	TokenNamepublic	
static	TokenNamestatic	
TextBaseEditorPlusLabeler	TokenNameIdentifier	 Text Base Editor Plus Labeler
editAndLabel	TokenNameIdentifier	 edit And Label
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
"TextBaseEditorPlusLabeler"	TokenNameStringLiteral	TextBaseEditorPlusLabeler
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
TextBaseEditorPlusLabeler	TokenNameIdentifier	 Text Base Editor Plus Labeler
labeler	TokenNameIdentifier	 labeler
=	TokenNameEQUAL	
new	TokenNamenew	
TextBaseEditorPlusLabeler	TokenNameIdentifier	 Text Base Editor Plus Labeler
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
return	TokenNamereturn	
labeler	TokenNameIdentifier	 labeler
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
"Usage: TextBaseEditorPlusLabeler <data> <labelfile>"	TokenNameStringLiteral	Usage: TextBaseEditorPlusLabeler <data> <labelfile>
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
editAndLabel	TokenNameIdentifier	 edit And Label
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
