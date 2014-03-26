package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTextField	TokenNameIdentifier	 J Text Field
;	TokenNameSEMICOLON	
/** * Wraps a viewer and adds a status message at the bottom. Status * messages are sent by a sub-viewer by sending a message with a class * to sendSignal(TEXT_MESSAGE, "content of message"); * * @author William cohen */	TokenNameCOMMENT_JAVADOC	 Wraps a viewer and adds a status message at the bottom. Status messages are sent by a sub-viewer by sending a message with a class to sendSignal(TEXT_MESSAGE, "content of message"); * @author William cohen 
public	TokenNamepublic	
class	TokenNameclass	
MessageViewer	TokenNameIdentifier	 Message Viewer
extends	TokenNameextends	
Viewer	TokenNameIdentifier	 Viewer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Viewer	TokenNameIdentifier	 Viewer
subViewer	TokenNameIdentifier	 sub Viewer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JTextField	TokenNameIdentifier	 J Text Field
statusField	TokenNameIdentifier	 status Field
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MessageViewer	TokenNameIdentifier	 Message Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MessageViewer	TokenNameIdentifier	 Message Viewer
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MessageViewer	TokenNameIdentifier	 Message Viewer
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
subViewer	TokenNameIdentifier	 sub Viewer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSubView	TokenNameIdentifier	 set Sub View
(	TokenNameLPAREN	
subViewer	TokenNameIdentifier	 sub Viewer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSubView	TokenNameIdentifier	 set Sub View
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
subViewer	TokenNameIdentifier	 sub Viewer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subViewer	TokenNameIdentifier	 sub Viewer
=	TokenNameEQUAL	
subViewer	TokenNameIdentifier	 sub Viewer
;	TokenNameSEMICOLON	
subViewer	TokenNameIdentifier	 sub Viewer
.	TokenNameDOT	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subViewer	TokenNameIdentifier	 sub Viewer
,	TokenNameCOMMA	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
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
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
statusField	TokenNameIdentifier	 status Field
=	TokenNameEQUAL	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
statusField	TokenNameIdentifier	 status Field
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// delegate operations to subViewer 	TokenNameCOMMENT_LINE	delegate operations to subViewer 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
receiveContent	TokenNameIdentifier	 receive Content
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subViewer	TokenNameIdentifier	 sub Viewer
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clearContent	TokenNameIdentifier	 clear Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subViewer	TokenNameIdentifier	 sub Viewer
.	TokenNameDOT	
clearContent	TokenNameIdentifier	 clear Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
boolean	TokenNameboolean	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subViewer	TokenNameIdentifier	 sub Viewer
.	TokenNameDOT	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
protected	TokenNameprotected	
boolean	TokenNameboolean	
canHandle	TokenNameIdentifier	 can Handle
(	TokenNameLPAREN	
int	TokenNameint	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
senders	TokenNameIdentifier	 senders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// grab TEXT_MESSAGE signals 	TokenNameCOMMENT_LINE	grab TEXT_MESSAGE signals 
if	TokenNameif	
(	TokenNameLPAREN	
signal	TokenNameIdentifier	 signal
==	TokenNameEQUAL_EQUAL	
TEXT_MESSAGE	TokenNameIdentifier	 TEXT  MESSAGE
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
subViewer	TokenNameIdentifier	 sub Viewer
.	TokenNameDOT	
canHandle	TokenNameIdentifier	 can Handle
(	TokenNameLPAREN	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
senders	TokenNameIdentifier	 senders
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
protected	TokenNameprotected	
void	TokenNamevoid	
handle	TokenNameIdentifier	 handle
(	TokenNameLPAREN	
int	TokenNameint	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
senders	TokenNameIdentifier	 senders
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
signal	TokenNameIdentifier	 signal
==	TokenNameEQUAL_EQUAL	
TEXT_MESSAGE	TokenNameIdentifier	 TEXT  MESSAGE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
statusField	TokenNameIdentifier	 status Field
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
subViewer	TokenNameIdentifier	 sub Viewer
.	TokenNameDOT	
handle	TokenNameIdentifier	 handle
(	TokenNameLPAREN	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
senders	TokenNameIdentifier	 senders
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
protected	TokenNameprotected	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
