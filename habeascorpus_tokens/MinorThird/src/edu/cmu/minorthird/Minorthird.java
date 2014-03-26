package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
ui	TokenNameIdentifier	 ui
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
border	TokenNameIdentifier	 border
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * A launch bar for Minorthird applications. */	TokenNameCOMMENT_JAVADOC	 A launch bar for Minorthird applications. 
public	TokenNamepublic	
class	TokenNameclass	
Minorthird	TokenNameIdentifier	 Minorthird
extends	TokenNameextends	
JFrame	TokenNameIdentifier	 J Frame
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
defaultArgs	TokenNameIdentifier	 default Args
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Minorthird	TokenNameIdentifier	 Minorthird
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
// copy the args, adding 'gui' 	TokenNameCOMMENT_LINE	copy the args, adding 'gui' 
defaultArgs	TokenNameIdentifier	 default Args
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
defaultArgs	TokenNameIdentifier	 default Args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
"-gui"	TokenNameStringLiteral	-gui
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
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultArgs	TokenNameIdentifier	 default Args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// build the content panel 	TokenNameCOMMENT_LINE	build the content panel 
initContent	TokenNameIdentifier	 init Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pop the launcher window 	TokenNameCOMMENT_LINE	pop the launcher window 
setDefaultCloseOperation	TokenNameIdentifier	 set Default Close Operation
(	TokenNameLPAREN	
WindowConstants	TokenNameIdentifier	 Window Constants
.	TokenNameDOT	
DISPOSE_ON_CLOSE	TokenNameIdentifier	 DISPOSE  ON  CLOSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pack	TokenNameIdentifier	 pack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initContent	TokenNameIdentifier	 init Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JPanel	TokenNameIdentifier	 J Panel
panel	TokenNameIdentifier	 panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
GridLayout	TokenNameIdentifier	 Grid Layout
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
new	TokenNamenew	
TitledBorder	TokenNameIdentifier	 Titled Border
(	TokenNameLPAREN	
"Applications to Launch"	TokenNameStringLiteral	Applications to Launch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
tcPanel	TokenNameIdentifier	 tc Panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tcPanel	TokenNameIdentifier	 tc Panel
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
new	TokenNamenew	
TitledBorder	TokenNameIdentifier	 Titled Border
(	TokenNameLPAREN	
"Classify Text"	TokenNameStringLiteral	Classify Text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addUIButton	TokenNameIdentifier	 add UI Button
(	TokenNameLPAREN	
tcPanel	TokenNameIdentifier	 tc Panel
,	TokenNameCOMMA	
"Expt"	TokenNameStringLiteral	Expt
,	TokenNameCOMMA	
new	TokenNamenew	
TrainTestClassifier	TokenNameIdentifier	 Train Test Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addUIButton	TokenNameIdentifier	 add UI Button
(	TokenNameLPAREN	
tcPanel	TokenNameIdentifier	 tc Panel
,	TokenNameCOMMA	
"Train"	TokenNameStringLiteral	Train
,	TokenNameCOMMA	
new	TokenNamenew	
TrainClassifier	TokenNameIdentifier	 Train Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addUIButton	TokenNameIdentifier	 add UI Button
(	TokenNameLPAREN	
tcPanel	TokenNameIdentifier	 tc Panel
,	TokenNameCOMMA	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
new	TokenNamenew	
TestClassifier	TokenNameIdentifier	 Test Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tcPanel	TokenNameIdentifier	 tc Panel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
txPanel	TokenNameIdentifier	 tx Panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
txPanel	TokenNameIdentifier	 tx Panel
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
new	TokenNamenew	
TitledBorder	TokenNameIdentifier	 Titled Border
(	TokenNameLPAREN	
"Extract From Text"	TokenNameStringLiteral	Extract From Text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addUIButton	TokenNameIdentifier	 add UI Button
(	TokenNameLPAREN	
txPanel	TokenNameIdentifier	 tx Panel
,	TokenNameCOMMA	
"Expt"	TokenNameStringLiteral	Expt
,	TokenNameCOMMA	
new	TokenNamenew	
TrainTestExtractor	TokenNameIdentifier	 Train Test Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addUIButton	TokenNameIdentifier	 add UI Button
(	TokenNameLPAREN	
txPanel	TokenNameIdentifier	 tx Panel
,	TokenNameCOMMA	
"Train"	TokenNameStringLiteral	Train
,	TokenNameCOMMA	
new	TokenNamenew	
TrainExtractor	TokenNameIdentifier	 Train Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addUIButton	TokenNameIdentifier	 add UI Button
(	TokenNameLPAREN	
txPanel	TokenNameIdentifier	 tx Panel
,	TokenNameCOMMA	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
new	TokenNamenew	
TestExtractor	TokenNameIdentifier	 Test Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
txPanel	TokenNameIdentifier	 tx Panel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
cPanel	TokenNameIdentifier	 c Panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cPanel	TokenNameIdentifier	 c Panel
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
new	TokenNamenew	
TitledBorder	TokenNameIdentifier	 Titled Border
(	TokenNameLPAREN	
"Non-Text Data"	TokenNameStringLiteral	Non-Text Data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cPanel	TokenNameIdentifier	 c Panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
new	TokenNamenew	
AbstractAction	TokenNameIdentifier	 Abstract Action
(	TokenNameLPAREN	
"Expt/Train/Test"	TokenNameStringLiteral	Expt/Train/Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
UI	TokenNameIdentifier	 UI
.	TokenNameDOT	
DataClassificationTask	TokenNameIdentifier	 Data Classification Task
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
callMain	TokenNameIdentifier	 call Main
(	TokenNameLPAREN	
defaultArgs	TokenNameIdentifier	 default Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cPanel	TokenNameIdentifier	 c Panel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
oPanel	TokenNameIdentifier	 o Panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oPanel	TokenNameIdentifier	 o Panel
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
new	TokenNamenew	
TitledBorder	TokenNameIdentifier	 Titled Border
(	TokenNameLPAREN	
"Execute"	TokenNameStringLiteral	Execute
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addUIButton	TokenNameIdentifier	 add UI Button
(	TokenNameLPAREN	
oPanel	TokenNameIdentifier	 o Panel
,	TokenNameCOMMA	
"Mixup"	TokenNameStringLiteral	Mixup
,	TokenNameCOMMA	
new	TokenNamenew	
RunMixup	TokenNameIdentifier	 Run Mixup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addUIButton	TokenNameIdentifier	 add UI Button
(	TokenNameLPAREN	
oPanel	TokenNameIdentifier	 o Panel
,	TokenNameCOMMA	
"Annotator"	TokenNameStringLiteral	Annotator
,	TokenNameCOMMA	
new	TokenNamenew	
ApplyAnnotator	TokenNameIdentifier	 Apply Annotator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
oPanel	TokenNameIdentifier	 o Panel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//addHelpPane(panel); 	TokenNameCOMMENT_LINE	addHelpPane(panel); 
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
setPreferredSize	TokenNameIdentifier	 set Preferred Size
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
panel	TokenNameIdentifier	 panel
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
CENTER	TokenNameIdentifier	 CENTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
"Minorthird LaunchPad"	TokenNameStringLiteral	Minorthird LaunchPad
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addUIButton	TokenNameIdentifier	 add UI Button
(	TokenNameLPAREN	
final	TokenNamefinal	
JPanel	TokenNameIdentifier	 J Panel
panel	TokenNameIdentifier	 panel
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
final	TokenNamefinal	
UIMain	TokenNameIdentifier	 UI Main
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
new	TokenNamenew	
AbstractAction	TokenNameIdentifier	 Abstract Action
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071015	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
callMain	TokenNameIdentifier	 call Main
(	TokenNameLPAREN	
defaultArgs	TokenNameIdentifier	 default Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* private void addHelpPane(JPanel panel) { JEditorPane editorPane = new JEditorPane(); editorPane.setEditable(false); try { java.net.URL helpURL = new java.net.URL("http://wcohen.com/index.html"); editorPane.setPage(helpURL); } catch (Exception e) { e.printStackTrace(); } panel.add(new JScrollPane(editorPane)); } */	TokenNameCOMMENT_BLOCK	 private void addHelpPane(JPanel panel) { JEditorPane editorPane = new JEditorPane(); editorPane.setEditable(false); try { java.net.URL helpURL = new java.net.URL("http://wcohen.com/index.html"); editorPane.setPage(helpURL); } catch (Exception e) { e.printStackTrace(); } panel.add(new JScrollPane(editorPane)); } 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
Minorthird	TokenNameIdentifier	 Minorthird
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
