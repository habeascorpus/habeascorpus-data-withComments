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
ActionEvent	TokenNameIdentifier	 Action Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionListener	TokenNameIdentifier	 Action Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
AbstractAction	TokenNameIdentifier	 Abstract Action
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JButton	TokenNameIdentifier	 J Button
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JComboBox	TokenNameIdentifier	 J Combo Box
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JLabel	TokenNameIdentifier	 J Label
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JList	TokenNameIdentifier	 J List
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTextField	TokenNameIdentifier	 J Text Field
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLabels	TokenNameIdentifier	 Text Labels
;	TokenNameSEMICOLON	
/** * Interactivly edit document spans. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Interactivly edit document spans. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
SpanLabeler	TokenNameIdentifier	 Span Labeler
extends	TokenNameextends	
ViewerTracker	TokenNameIdentifier	 Viewer Tracker
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
200803014L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// private static final String EDITOR_PROP=SpanEditor.EDITOR_PROP; 	TokenNameCOMMENT_LINE	private static final String EDITOR_PROP=SpanEditor.EDITOR_PROP; 
// map top-level spans to type that labels them 	TokenNameCOMMENT_LINE	map top-level spans to type that labels them 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LABEL_PROP	TokenNameIdentifier	 LABEL  PROP
=	TokenNameEQUAL	
"userLabel"	TokenNameStringLiteral	userLabel
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NULL_TYPE	TokenNameIdentifier	 NULL  TYPE
=	TokenNameEQUAL	
"- pick label -"	TokenNameStringLiteral	- pick label -
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNKNOWN_TYPE	TokenNameIdentifier	 UNKNOWN  TYPE
=	TokenNameEQUAL	
"- unknown -"	TokenNameStringLiteral	- unknown -
;	TokenNameSEMICOLON	
// internal state 	TokenNameCOMMENT_LINE	internal state 
// private String labelType=UNKNOWN_TYPE; 	TokenNameCOMMENT_LINE	private String labelType=UNKNOWN_TYPE; 
// buttons 	TokenNameCOMMENT_LINE	buttons 
final	TokenNamefinal	
JLabel	TokenNameIdentifier	 J Label
currentTypeLabel	TokenNameIdentifier	 current Type Label
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
UNKNOWN_TYPE	TokenNameIdentifier	 UNKNOWN  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JComboBox	TokenNameIdentifier	 J Combo Box
typeBox	TokenNameIdentifier	 type Box
=	TokenNameEQUAL	
new	TokenNamenew	
LabelChooserBox	TokenNameIdentifier	 Label Chooser Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JButton	TokenNameIdentifier	 J Button
addCurrentTypeButton	TokenNameIdentifier	 add Current Type Button
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
new	TokenNamenew	
AddCurrentTypeAction	TokenNameIdentifier	 Add Current Type Action
(	TokenNameLPAREN	
"Accept class:"	TokenNameStringLiteral	Accept class:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JTextField	TokenNameIdentifier	 J Text Field
newTypeField	TokenNameIdentifier	 new Type Field
=	TokenNameEQUAL	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JButton	TokenNameIdentifier	 J Button
addNewTypeButton	TokenNameIdentifier	 add New Type Button
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
new	TokenNamenew	
AddNewTypeAction	TokenNameIdentifier	 Add New Type Action
(	TokenNameLPAREN	
"New class:"	TokenNameStringLiteral	New class:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param viewLabels * a superset of editLabels which may include some additional * read-only information * @param editLabels * the labels being modified * @param documentList * the document Span being edited is associated with the selected * entry of the documentList. * @param spanPainter * used to repaint documentList elements * @param statusMsg * a JLabel used for status messages. */	TokenNameCOMMENT_JAVADOC	 @param viewLabels a superset of editLabels which may include some additional read-only information @param editLabels the labels being modified @param documentList the document Span being edited is associated with the selected entry of the documentList. @param spanPainter used to repaint documentList elements @param statusMsg a JLabel used for status messages. 
public	TokenNamepublic	
SpanLabeler	TokenNameIdentifier	 Span Labeler
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
JList	TokenNameIdentifier	 J List
documentList	TokenNameIdentifier	 document List
,	TokenNameCOMMA	
SpanPainter	TokenNameIdentifier	 Span Painter
spanPainter	TokenNameIdentifier	 span Painter
,	TokenNameCOMMA	
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
documentList	TokenNameIdentifier	 document List
,	TokenNameCOMMA	
spanPainter	TokenNameIdentifier	 span Painter
,	TokenNameCOMMA	
statusMsg	TokenNameIdentifier	 status Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setViewEntireDocument	TokenNameIdentifier	 set View Entire Document
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newTypeField	TokenNameIdentifier	 new Type Field
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
addNewTypeButton	TokenNameIdentifier	 add New Type Button
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
restoreLabelProps	TokenNameIdentifier	 restore Label Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// layout stuff 	TokenNameCOMMENT_LINE	layout stuff 
// 	TokenNameCOMMENT_LINE	 
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
int	TokenNameint	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentTypeLabel	TokenNameIdentifier	 current Type Label
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
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
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
addCurrentTypeButton	TokenNameIdentifier	 add Current Type Button
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
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
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
typeBox	TokenNameIdentifier	 type Box
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
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
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
addNewTypeButton	TokenNameIdentifier	 add New Type Button
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
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
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newTypeField	TokenNameIdentifier	 new Type Field
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
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
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
upButton	TokenNameIdentifier	 up Button
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
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
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
downButton	TokenNameIdentifier	 down Button
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
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
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
saveButton	TokenNameIdentifier	 save Button
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// saveButton.setEnabled( saveAsFile!=null ); 	TokenNameCOMMENT_LINE	saveButton.setEnabled( saveAsFile!=null ); 
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
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridwidth	TokenNameIdentifier	 gridwidth
=	TokenNameEQUAL	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
editorHolder	TokenNameIdentifier	 editor Holder
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loadSpan	TokenNameIdentifier	 load Span
(	TokenNameLPAREN	
nullSpan	TokenNameIdentifier	 null Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if documentSpan s has type t, then setProperty(s,LABEL_PROP,t) 	TokenNameCOMMENT_LINE	if documentSpan s has type t, then setProperty(s,LABEL_PROP,t) 
private	TokenNameprivate	
void	TokenNamevoid	
restoreLabelProps	TokenNameIdentifier	 restore Label Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("restoring label properties"); 	TokenNameCOMMENT_LINE	System.out.println("restoring label properties"); 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
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
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
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
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
hasType	TokenNameIdentifier	 has Type
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("restoring "+t+" for "+s); 	TokenNameCOMMENT_LINE	System.out.println("restoring "+t+" for "+s); 
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
LABEL_PROP	TokenNameIdentifier	 LABEL  PROP
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
loadSpanHook	TokenNameIdentifier	 load Span Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
oldLabel	TokenNameIdentifier	 old Label
=	TokenNameEQUAL	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
documentSpan	TokenNameIdentifier	 document Span
,	TokenNameCOMMA	
LABEL_PROP	TokenNameIdentifier	 LABEL  PROP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldLabel	TokenNameIdentifier	 old Label
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentTypeLabel	TokenNameIdentifier	 current Type Label
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
UNKNOWN_TYPE	TokenNameIdentifier	 UNKNOWN  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentTypeLabel	TokenNameIdentifier	 current Type Label
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
oldLabel	TokenNameIdentifier	 old Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Say where the viewer is.. */	TokenNameCOMMENT_JAVADOC	 Say where the viewer is.. 
public	TokenNamepublic	
void	TokenNamevoid	
addViewer	TokenNameIdentifier	 add Viewer
(	TokenNameLPAREN	
TextBaseViewer	TokenNameIdentifier	 Text Base Viewer
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
=	TokenNameEQUAL	
viewer	TokenNameIdentifier	 viewer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
TextBaseViewer	TokenNameIdentifier	 Text Base Viewer
viewer	TokenNameIdentifier	 viewer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
AddNewTypeAction	TokenNameIdentifier	 Add New Type Action
extends	TokenNameextends	
AbstractAction	TokenNameIdentifier	 Abstract Action
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
200803014L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AddNewTypeAction	TokenNameIdentifier	 Add New Type Action
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
newTypeField	TokenNameIdentifier	 new Type Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
isType	TokenNameIdentifier	 is Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
typeBox	TokenNameIdentifier	 type Box
.	TokenNameDOT	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getGuessBox	TokenNameIdentifier	 get Guess Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getTruthBox	TokenNameIdentifier	 get Truth Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
getDisplayedTypeBox	TokenNameIdentifier	 get Displayed Type Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
setDocumentType	TokenNameIdentifier	 set Document Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
AddCurrentTypeAction	TokenNameIdentifier	 Add Current Type Action
extends	TokenNameextends	
AbstractAction	TokenNameIdentifier	 Abstract Action
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
200803014L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AddCurrentTypeAction	TokenNameIdentifier	 Add Current Type Action
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
typeBox	TokenNameIdentifier	 type Box
.	TokenNameDOT	
getSelectedItem	TokenNameIdentifier	 get Selected Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
NULL_TYPE	TokenNameIdentifier	 NULL  TYPE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setDocumentType	TokenNameIdentifier	 set Document Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
LabelChooserBox	TokenNameIdentifier	 Label Chooser Box
extends	TokenNameextends	
JComboBox	TokenNameIdentifier	 J Combo Box
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
200803014L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LabelChooserBox	TokenNameIdentifier	 Label Chooser Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
NULL_TYPE	TokenNameIdentifier	 NULL  TYPE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
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
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
getSelectedItem	TokenNameIdentifier	 get Selected Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
NULL_TYPE	TokenNameIdentifier	 NULL  TYPE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setDocumentType	TokenNameIdentifier	 set Document Type
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setDocumentType	TokenNameIdentifier	 set Document Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statusMsg	TokenNameIdentifier	 status Msg
.	TokenNameDOT	
display	TokenNameIdentifier	 display
(	TokenNameLPAREN	
"setting type="	TokenNameStringLiteral	setting type=
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
"for "	TokenNameStringLiteral	for 
+	TokenNamePLUS	
documentSpan	TokenNameIdentifier	 document Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentTypeLabel	TokenNameIdentifier	 current Type Label
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
oldLabel	TokenNameIdentifier	 old Label
=	TokenNameEQUAL	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
documentSpan	TokenNameIdentifier	 document Span
,	TokenNameCOMMA	
LABEL_PROP	TokenNameIdentifier	 LABEL  PROP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldLabel	TokenNameIdentifier	 old Label
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// clear the old label 	TokenNameCOMMENT_LINE	clear the old label 
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
defineTypeInside	TokenNameIdentifier	 define Type Inside
(	TokenNameLPAREN	
oldLabel	TokenNameIdentifier	 old Label
,	TokenNameCOMMA	
documentSpan	TokenNameIdentifier	 document Span
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
documentSpan	TokenNameIdentifier	 document Span
,	TokenNameCOMMA	
LABEL_PROP	TokenNameIdentifier	 LABEL  PROP
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
documentSpan	TokenNameIdentifier	 document Span
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
editLabels	TokenNameIdentifier	 edit Labels
.	TokenNameDOT	
closeTypeInside	TokenNameIdentifier	 close Type Inside
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
documentSpan	TokenNameIdentifier	 document Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
