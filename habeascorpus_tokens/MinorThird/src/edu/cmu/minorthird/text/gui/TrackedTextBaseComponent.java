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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
WindowAdapter	TokenNameIdentifier	 Window Adapter
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
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
/** * A TextBaseViewer augmented with a ViewerTracker component. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A TextBaseViewer augmented with a ViewerTracker component. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
TrackedTextBaseComponent	TokenNameIdentifier	 Tracked Text Base Component
extends	TokenNameextends	
JComponent	TokenNameIdentifier	 J Component
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080314L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLabels	TokenNameIdentifier	 Text Labels
viewLabels	TokenNameIdentifier	 view Labels
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
editLabels	TokenNameIdentifier	 edit Labels
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TextBaseViewer	TokenNameIdentifier	 Text Base Viewer
viewer	TokenNameIdentifier	 viewer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ViewerTracker	TokenNameIdentifier	 Viewer Tracker
viewerTracker	TokenNameIdentifier	 viewer Tracker
;	TokenNameSEMICOLON	
// after Kevin's refactoring of components in this package, 	TokenNameCOMMENT_LINE	after Kevin's refactoring of components in this package, 
// initLayout was sometimes called zero times, sometimes once. 	TokenNameCOMMENT_LINE	initLayout was sometimes called zero times, sometimes once. 
// after William's fixes, this went to once or twice. 	TokenNameCOMMENT_LINE	after William's fixes, this went to once or twice. 
// this flag keeps initLayout code from happening more than once. 	TokenNameCOMMENT_LINE	this flag keeps initLayout code from happening more than once. 
private	TokenNameprivate	
boolean	TokenNameboolean	
laidOut	TokenNameIdentifier	 laid Out
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TrackedTextBaseComponent	TokenNameIdentifier	 Tracked Text Base Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TrackedTextBaseComponent	TokenNameIdentifier	 Tracked Text Base Component
(	TokenNameLPAREN	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLabels	TokenNameIdentifier	 Text Labels
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
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
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLabels	TokenNameIdentifier	 Text Labels
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
viewLabels	TokenNameIdentifier	 view Labels
=	TokenNameEQUAL	
viewLabels	TokenNameIdentifier	 view Labels
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
editLabels	TokenNameIdentifier	 edit Labels
=	TokenNameEQUAL	
editLabels	TokenNameIdentifier	 edit Labels
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
statusMsg	TokenNameIdentifier	 status Msg
=	TokenNameEQUAL	
statusMsg	TokenNameIdentifier	 status Msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextBaseViewer	TokenNameIdentifier	 Text Base Viewer
getViewer	TokenNameIdentifier	 get Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
viewer	TokenNameIdentifier	 viewer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ViewerTracker	TokenNameIdentifier	 Viewer Tracker
getViewerTracker	TokenNameIdentifier	 get Viewer Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
viewerTracker	TokenNameIdentifier	 viewer Tracker
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Layout stuff - assumes that viewer and viewerTracker are already created. */	TokenNameCOMMENT_JAVADOC	 Layout stuff - assumes that viewer and viewerTracker are already created. 
protected	TokenNameprotected	
void	TokenNamevoid	
initializeLayout	TokenNameIdentifier	 initialize Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
laidOut	TokenNameIdentifier	 laid Out
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
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
viewerTracker	TokenNameIdentifier	 viewer Tracker
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
laidOut	TokenNameIdentifier	 laid Out
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** change the text labels */	TokenNameCOMMENT_JAVADOC	 change the text labels 
public	TokenNamepublic	
void	TokenNamevoid	
updateTextLabels	TokenNameIdentifier	 update Text Labels
(	TokenNameLPAREN	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLabels	TokenNameIdentifier	 Text Labels
newLabels	TokenNameIdentifier	 new Labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
viewLabels	TokenNameIdentifier	 view Labels
=	TokenNameEQUAL	
newLabels	TokenNameIdentifier	 new Labels
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
updateTextLabels	TokenNameIdentifier	 update Text Labels
(	TokenNameLPAREN	
newLabels	TokenNameIdentifier	 new Labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewerTracker	TokenNameIdentifier	 viewer Tracker
.	TokenNameDOT	
updateViewLabels	TokenNameIdentifier	 update View Labels
(	TokenNameLPAREN	
newLabels	TokenNameIdentifier	 new Labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** add a 'save' button */	TokenNameCOMMENT_JAVADOC	 add a 'save' button 
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
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
buildFrame	TokenNameIdentifier	 build Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JComponent	TokenNameIdentifier	 J Component
main	TokenNameIdentifier	 main
=	TokenNameEQUAL	
new	TokenNamenew	
StatusMessagePanel	TokenNameIdentifier	 Status Message Panel
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JFrame	TokenNameIdentifier	 J Frame
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
new	TokenNamenew	
JFrame	TokenNameIdentifier	 J Frame
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
addWindowListener	TokenNameIdentifier	 add Window Listener
(	TokenNameLPAREN	
new	TokenNamenew	
WindowAdapter	TokenNameIdentifier	 Window Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// public void windowClosing(WindowEvent e) 	TokenNameCOMMENT_LINE	public void windowClosing(WindowEvent e) 
// { 	TokenNameCOMMENT_LINE	{ 
// System.exit(0); 	TokenNameCOMMENT_LINE	System.exit(0); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
