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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridLayout	TokenNameIdentifier	 Grid Layout
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
JComponent	TokenNameIdentifier	 J Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JFileChooser	TokenNameIdentifier	 J File Chooser
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
ComponentViewer	TokenNameIdentifier	 Component Viewer
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
Viewer	TokenNameIdentifier	 Viewer
;	TokenNameSEMICOLON	
/** * A panel with a text area and a browse button * @author ksteppe */	TokenNameCOMMENT_JAVADOC	 A panel with a text area and a browse button @author ksteppe 
public	TokenNamepublic	
class	TokenNameclass	
FileChooserViewer	TokenNameIdentifier	 File Chooser Viewer
extends	TokenNameextends	
ComponentViewer	TokenNameIdentifier	 Component Viewer
implements	TokenNameimplements	
ActionListener	TokenNameIdentifier	 Action Listener
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JFileChooser	TokenNameIdentifier	 J File Chooser
chooser	TokenNameIdentifier	 chooser
=	TokenNameEQUAL	
new	TokenNamenew	
JFileChooser	TokenNameIdentifier	 J File Chooser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JTextField	TokenNameIdentifier	 J Text Field
textField	TokenNameIdentifier	 text Field
=	TokenNameEQUAL	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
selectedFile	TokenNameIdentifier	 selected File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
openFile	TokenNameIdentifier	 open File
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JButton	TokenNameIdentifier	 J Button
button	TokenNameIdentifier	 button
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
"Browse"	TokenNameStringLiteral	Browse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
defaultDir	TokenNameIdentifier	 default Dir
=	TokenNameEQUAL	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
//= System.getProperty("minorthird"); 	TokenNameCOMMENT_LINE	= System.getProperty("minorthird"); 
public	TokenNamepublic	
FileChooserViewer	TokenNameIdentifier	 File Chooser Viewer
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
superView	TokenNameIdentifier	 super View
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFileSelectionMode	TokenNameIdentifier	 set File Selection Mode
(	TokenNameLPAREN	
JFileChooser	TokenNameIdentifier	 J File Chooser
.	TokenNameDOT	
FILES_AND_DIRECTORIES	TokenNameIdentifier	 FILES  AND  DIRECTORIES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
superView	TokenNameIdentifier	 super View
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
selectedFile	TokenNameIdentifier	 selected File
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
button	TokenNameIdentifier	 button
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
componentFor	TokenNameIdentifier	 component For
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFileSelectionMode	TokenNameIdentifier	 set File Selection Mode
(	TokenNameLPAREN	
int	TokenNameint	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chooser	TokenNameIdentifier	 chooser
.	TokenNameDOT	
setFileSelectionMode	TokenNameIdentifier	 set File Selection Mode
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectedFile	TokenNameIdentifier	 selected File
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
textField	TokenNameIdentifier	 text Field
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
selectedFile	TokenNameIdentifier	 selected File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//fire the action up the chain 	TokenNameCOMMENT_LINE	fire the action up the chain 
sendSignal	TokenNameIdentifier	 send Signal
(	TokenNameLPAREN	
OBJECT_SELECTED	TokenNameIdentifier	 OBJECT  SELECTED
,	TokenNameCOMMA	
selectedFile	TokenNameIdentifier	 selected File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
componentFor	TokenNameIdentifier	 component For
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
JComponent	TokenNameIdentifier	 J Component
componentFor	TokenNameIdentifier	 component For
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"build panel"	TokenNameStringLiteral	build panel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//build up panel 	TokenNameCOMMENT_LINE	build up panel 
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
GridLayout	TokenNameIdentifier	 Grid Layout
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
textField	TokenNameIdentifier	 text Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textField	TokenNameIdentifier	 text Field
.	TokenNameDOT	
setEditable	TokenNameIdentifier	 set Editable
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
button	TokenNameIdentifier	 button
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
ActionListener	TokenNameIdentifier	 Action Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
button	TokenNameIdentifier	 button
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
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
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selectedFile	TokenNameIdentifier	 selected File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
chooser	TokenNameIdentifier	 chooser
.	TokenNameDOT	
setSelectedFile	TokenNameIdentifier	 set Selected File
(	TokenNameLPAREN	
selectedFile	TokenNameIdentifier	 selected File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
chooser	TokenNameIdentifier	 chooser
.	TokenNameDOT	
setSelectedFile	TokenNameIdentifier	 set Selected File
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
defaultDir	TokenNameIdentifier	 default Dir
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
returnVal	TokenNameIdentifier	 return Val
=	TokenNameEQUAL	
openFile	TokenNameIdentifier	 open File
?	TokenNameQUESTION	
chooser	TokenNameIdentifier	 chooser
.	TokenNameDOT	
showOpenDialog	TokenNameIdentifier	 show Open Dialog
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
:	TokenNameCOLON	
chooser	TokenNameIdentifier	 chooser
.	TokenNameDOT	
showSaveDialog	TokenNameIdentifier	 show Save Dialog
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
returnVal	TokenNameIdentifier	 return Val
==	TokenNameEQUAL_EQUAL	
JFileChooser	TokenNameIdentifier	 J File Chooser
.	TokenNameDOT	
APPROVE_OPTION	TokenNameIdentifier	 APPROVE  OPTION
)	TokenNameRPAREN	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
chooser	TokenNameIdentifier	 chooser
.	TokenNameDOT	
getSelectedFile	TokenNameIdentifier	 get Selected File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// default: recieve anything that can be converted to a component 	TokenNameCOMMENT_LINE	default: recieve anything that can be converted to a component 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
receiveContent	TokenNameIdentifier	 receive Content
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDefaultDir	TokenNameIdentifier	 get Default Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultDir	TokenNameIdentifier	 default Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultDir	TokenNameIdentifier	 set Default Dir
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
defaultDir	TokenNameIdentifier	 default Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
defaultDir	TokenNameIdentifier	 default Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
defaultDir	TokenNameIdentifier	 default Dir
=	TokenNameEQUAL	
defaultDir	TokenNameIdentifier	 default Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
