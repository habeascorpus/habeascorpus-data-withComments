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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionEvent	TokenNameIdentifier	 Action Event
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
JComboBox	TokenNameIdentifier	 J Combo Box
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
SampleTextBases	TokenNameIdentifier	 Sample Text Bases
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
learn	TokenNameIdentifier	 learn
.	TokenNameDOT	
OnlineTextClassifierLearner	TokenNameIdentifier	 Online Text Classifier Learner
;	TokenNameSEMICOLON	
/** Interactively edit the contents of a TextBase and MutableTextLabels. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Interactively edit the contents of a TextBase and MutableTextLabels. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
OnlineLearnerEditor	TokenNameIdentifier	 Online Learner Editor
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
private	TokenNameprivate	
OnlineClassifierDocumentEditor	TokenNameIdentifier	 Online Classifier Document Editor
ocdEditor	TokenNameIdentifier	 ocd Editor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OnlineClassifierDocumentEditor	TokenNameIdentifier	 Online Classifier Document Editor
getOnlineClassifierDocumentEditor	TokenNameIdentifier	 get Online Classifier Document Editor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ocdEditor	TokenNameIdentifier	 ocd Editor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
OnlineLearnerEditor	TokenNameIdentifier	 Online Learner Editor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"construct"	TokenNameStringLiteral	construct
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
setLabels	TokenNameIdentifier	 set Labels
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnlineLearnerEditor	TokenNameIdentifier	 Online Learner Editor
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
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
OnlineTextClassifierLearner	TokenNameIdentifier	 Online Text Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// super(base, viewLabels, editLabels, statusMsg); 	TokenNameCOMMENT_LINE	super(base, viewLabels, editLabels, statusMsg); 
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
statusMsg	TokenNameIdentifier	 status Msg
,	TokenNameCOMMA	
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
,	TokenNameCOMMA	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
OnlineTextClassifierLearner	TokenNameIdentifier	 Online Text Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
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
createOnlineClassifierDocumentEditor	TokenNameIdentifier	 create Online Classifier Document Editor
(	TokenNameLPAREN	
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
viewer	TokenNameIdentifier	 viewer
,	TokenNameCOMMA	
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
statusMsg	TokenNameIdentifier	 status Msg
,	TokenNameCOMMA	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ocdEditor	TokenNameIdentifier	 ocd Editor
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OnlineClassifierDocumentEditor	TokenNameIdentifier	 Online Classifier Document Editor
)	TokenNameRPAREN	
viewerTracker	TokenNameIdentifier	 viewer Tracker
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
saveLabels	TokenNameIdentifier	 save Labels
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
+	TokenNamePLUS	
".labels"	TokenNameStringLiteral	.labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ocdEditor	TokenNameIdentifier	 ocd Editor
.	TokenNameDOT	
setSaveAs	TokenNameIdentifier	 set Save As
(	TokenNameLPAREN	
saveLabels	TokenNameIdentifier	 save Labels
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
ocdEditor	TokenNameIdentifier	 ocd Editor
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
ocdEditor	TokenNameIdentifier	 ocd Editor
)	TokenNameRPAREN	
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
ocdEditor	TokenNameIdentifier	 ocd Editor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ocdEditor	TokenNameIdentifier	 ocd Editor
.	TokenNameDOT	
setReadOnly	TokenNameIdentifier	 set Read Only
(	TokenNameLPAREN	
readOnly	TokenNameIdentifier	 read Only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeLayout	TokenNameIdentifier	 initialize Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
createOnlineClassifierDocumentEditor	TokenNameIdentifier	 create Online Classifier Document Editor
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
TextBaseViewer	TokenNameIdentifier	 Text Base Viewer
viewer	TokenNameIdentifier	 viewer
,	TokenNameCOMMA	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
StatusMessage	TokenNameIdentifier	 Status Message
statusMsg	TokenNameIdentifier	 status Msg
,	TokenNameCOMMA	
OnlineTextClassifierLearner	TokenNameIdentifier	 Online Text Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
viewerTracker	TokenNameIdentifier	 viewer Tracker
=	TokenNameEQUAL	
new	TokenNamenew	
OnlineClassifierDocumentEditor	TokenNameIdentifier	 Online Classifier Document Editor
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
viewLabels	TokenNameIdentifier	 view Labels
,	TokenNameCOMMA	
viewer	TokenNameIdentifier	 viewer
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
}	TokenNameRBRACE	
/** Change the type of span being edited. */	TokenNameCOMMENT_JAVADOC	 Change the type of span being edited. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
EditTypeAction	TokenNameIdentifier	 Edit Type Action
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
private	TokenNameprivate	
JComboBox	TokenNameIdentifier	 J Combo Box
guessBox	TokenNameIdentifier	 guess Box
,	TokenNameCOMMA	
truthBox	TokenNameIdentifier	 truth Box
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnlineClassifierDocumentEditor	TokenNameIdentifier	 Online Classifier Document Editor
ocdEditor	TokenNameIdentifier	 ocd Editor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EditTypeAction	TokenNameIdentifier	 Edit Type Action
(	TokenNameLPAREN	
JComboBox	TokenNameIdentifier	 J Combo Box
guessBox	TokenNameIdentifier	 guess Box
,	TokenNameCOMMA	
JComboBox	TokenNameIdentifier	 J Combo Box
truthBox	TokenNameIdentifier	 truth Box
,	TokenNameCOMMA	
OnlineClassifierDocumentEditor	TokenNameIdentifier	 Online Classifier Document Editor
ocdEditor	TokenNameIdentifier	 ocd Editor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
guessBox	TokenNameIdentifier	 guess Box
=	TokenNameEQUAL	
guessBox	TokenNameIdentifier	 guess Box
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
truthBox	TokenNameIdentifier	 truth Box
=	TokenNameEQUAL	
truthBox	TokenNameIdentifier	 truth Box
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ocdEditor	TokenNameIdentifier	 ocd Editor
=	TokenNameEQUAL	
ocdEditor	TokenNameIdentifier	 ocd Editor
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
truthType	TokenNameIdentifier	 truth Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
truthBox	TokenNameIdentifier	 truth Box
.	TokenNameDOT	
getSelectedItem	TokenNameIdentifier	 get Selected Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
guessType	TokenNameIdentifier	 guess Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
guessBox	TokenNameIdentifier	 guess Box
.	TokenNameDOT	
getSelectedItem	TokenNameIdentifier	 get Selected Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
TextBaseViewer	TokenNameIdentifier	 Text Base Viewer
.	TokenNameDOT	
NULL_TRUTH_ENTRY	TokenNameIdentifier	 NULL  TRUTH  ENTRY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
truthType	TokenNameIdentifier	 truth Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ocdEditor	TokenNameIdentifier	 ocd Editor
.	TokenNameDOT	
setTypesBeingEdited	TokenNameIdentifier	 set Types Being Edited
(	TokenNameLPAREN	
guessType	TokenNameIdentifier	 guess Type
,	TokenNameCOMMA	
truthType	TokenNameIdentifier	 truth Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ocdEditor	TokenNameIdentifier	 ocd Editor
.	TokenNameDOT	
setTypesBeingEdited	TokenNameIdentifier	 set Types Being Edited
(	TokenNameLPAREN	
guessType	TokenNameIdentifier	 guess Type
,	TokenNameCOMMA	
guessType	TokenNameIdentifier	 guess Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Pop up a frame for editing the labels. */	TokenNameCOMMENT_JAVADOC	 Pop up a frame for editing the labels. 
public	TokenNamepublic	
static	TokenNamestatic	
OnlineLearnerEditor	TokenNameIdentifier	 Online Learner Editor
edit	TokenNameIdentifier	 edit
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rk	TokenNameIdentifier	 rk
,	TokenNameCOMMA	
OnlineTextClassifierLearner	TokenNameIdentifier	 Online Text Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextBase	TokenNameIdentifier	 Text Base
textBase	TokenNameIdentifier	 text Base
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
OnlineLearnerEditor	TokenNameIdentifier	 Online Learner Editor
editor	TokenNameIdentifier	 editor
=	TokenNameEQUAL	
new	TokenNamenew	
OnlineLearnerEditor	TokenNameIdentifier	 Online Learner Editor
(	TokenNameLPAREN	
textBase	TokenNameIdentifier	 text Base
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
editLabels	TokenNameIdentifier	 edit Labels
,	TokenNameCOMMA	
rk	TokenNameIdentifier	 rk
,	TokenNameCOMMA	
statusMsg	TokenNameIdentifier	 status Msg
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
editor	TokenNameIdentifier	 editor
.	TokenNameDOT	
initializeLayout	TokenNameIdentifier	 initialize Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
editor	TokenNameIdentifier	 editor
.	TokenNameDOT	
buildFrame	TokenNameIdentifier	 build Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
editor	TokenNameIdentifier	 editor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setLabels	TokenNameIdentifier	 set Labels
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
=	TokenNameEQUAL	
checkReadOnly	TokenNameIdentifier	 check Read Only
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextBase	TokenNameIdentifier	 Text Base
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
saveFile	TokenNameIdentifier	 save File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
SampleTextBases	TokenNameIdentifier	 Sample Text Bases
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
SampleTextBases	TokenNameIdentifier	 Sample Text Bases
.	TokenNameDOT	
getTruthLabels	TokenNameIdentifier	 get Truth Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Sample Text Bases"	TokenNameStringLiteral	Sample Text Bases
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//labels = edu.cmu.minorthird.text.ann.TestExtractionProblem.getLabels(); 	TokenNameCOMMENT_LINE	labels = edu.cmu.minorthird.text.ann.TestExtractionProblem.getLabels(); 
//base = labels.getTextBase(); 	TokenNameCOMMENT_LINE	base = labels.getTextBase(); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"load from "	TokenNameStringLiteral	load from 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
saveFile	TokenNameIdentifier	 save File
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
saveFile	TokenNameIdentifier	 save File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
TextLabelsLoader	TokenNameIdentifier	 Text Labels Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadOps	TokenNameIdentifier	 load Ops
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
saveFile	TokenNameIdentifier	 save File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"load text bases"	TokenNameStringLiteral	load text bases
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
new	TokenNamenew	
StatusMessage	TokenNameIdentifier	 Status Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
"default"	TokenNameStringLiteral	default
,	TokenNameCOMMA	
readOnly	TokenNameIdentifier	 read Only
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSaveAs	TokenNameIdentifier	 set Save As
(	TokenNameLPAREN	
saveFile	TokenNameIdentifier	 save File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
checkReadOnly	TokenNameIdentifier	 check Read Only
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
readOnly	TokenNameIdentifier	 read Only
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// int argp = 0; 	TokenNameCOMMENT_LINE	int argp = 0; 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
argp	TokenNameIdentifier	 argp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
argp	TokenNameIdentifier	 argp
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
argp	TokenNameIdentifier	 argp
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"-readOnly"	TokenNameStringLiteral	-readOnly
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
argp	TokenNameIdentifier	 argp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readOnly	TokenNameIdentifier	 read Only
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
argp	TokenNameIdentifier	 argp
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
readOnly	TokenNameIdentifier	 read Only
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Entry point that runs a gui to examine labels and change them. @param args first argument is labels file and second is save file **/	TokenNameCOMMENT_JAVADOC	 Entry point that runs a gui to examine labels and change them. @param args first argument is labels file and second is save file *
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
File	TokenNameIdentifier	 File
saveFile	TokenNameIdentifier	 save File
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
TextBaseEditor	TokenNameIdentifier	 Text Base Editor
.	TokenNameDOT	
edit	TokenNameIdentifier	 edit
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
saveFile	TokenNameIdentifier	 save File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage repositoryKey outputFile"	TokenNameStringLiteral	usage repositoryKey outputFile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
