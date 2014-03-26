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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
/** * When an object is selected in the zoomedOut view, it's displayed in * the zoomedIn view. Used for getting a close up view of, say, * objects in a list. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 When an object is selected in the zoomedOut view, it's displayed in the zoomedIn view. Used for getting a close up view of, say, objects in a list. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
ZoomedViewer	TokenNameIdentifier	 Zoomed Viewer
extends	TokenNameextends	
SplitViewer	TokenNameIdentifier	 Split Viewer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
ZoomedViewer	TokenNameIdentifier	 Zoomed Viewer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// rename viewer1,viewer2 	TokenNameCOMMENT_LINE	rename viewer1,viewer2 
private	TokenNameprivate	
Viewer	TokenNameIdentifier	 Viewer
zoomedOut	TokenNameIdentifier	 zoomed Out
,	TokenNameCOMMA	
zoomedIn	TokenNameIdentifier	 zoomed In
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ZoomedViewer	TokenNameIdentifier	 Zoomed Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ZoomedViewer	TokenNameIdentifier	 Zoomed Viewer
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
zoomedOut	TokenNameIdentifier	 zoomed Out
,	TokenNameCOMMA	
Viewer	TokenNameIdentifier	 Viewer
zoomedIn	TokenNameIdentifier	 zoomed In
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
zoomedOut	TokenNameIdentifier	 zoomed Out
,	TokenNameCOMMA	
zoomedIn	TokenNameIdentifier	 zoomed In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
zoomedOut	TokenNameIdentifier	 zoomed Out
=	TokenNameEQUAL	
viewer1	TokenNameIdentifier	 viewer1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
zoomedIn	TokenNameIdentifier	 zoomed In
=	TokenNameEQUAL	
viewer2	TokenNameIdentifier	 viewer2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setSubViews	TokenNameIdentifier	 set Sub Views
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
zoomedOut	TokenNameIdentifier	 zoomed Out
,	TokenNameCOMMA	
Viewer	TokenNameIdentifier	 Viewer
zoomedIn	TokenNameIdentifier	 zoomed In
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setSubViews	TokenNameIdentifier	 set Sub Views
(	TokenNameLPAREN	
zoomedOut	TokenNameIdentifier	 zoomed Out
,	TokenNameCOMMA	
zoomedIn	TokenNameIdentifier	 zoomed In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
zoomedOut	TokenNameIdentifier	 zoomed Out
=	TokenNameEQUAL	
viewer1	TokenNameIdentifier	 viewer1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
zoomedIn	TokenNameIdentifier	 zoomed In
=	TokenNameEQUAL	
viewer2	TokenNameIdentifier	 viewer2
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
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"recieving content: "	TokenNameStringLiteral	recieving content: 
+	TokenNamePLUS	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zoomedOut	TokenNameIdentifier	 zoomed Out
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zoomedIn	TokenNameIdentifier	 zoomed In
.	TokenNameDOT	
clearContent	TokenNameIdentifier	 clear Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the object being displayed as the user sees it. */	TokenNameCOMMENT_JAVADOC	 Get the object being displayed as the user sees it. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getVisibleContent	TokenNameIdentifier	 get Visible Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
zoomedOut	TokenNameIdentifier	 zoomed Out
.	TokenNameDOT	
getVisibleContent	TokenNameIdentifier	 get Visible Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
zoomedOut	TokenNameIdentifier	 zoomed Out
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
zoomedOut	TokenNameIdentifier	 zoomed Out
.	TokenNameDOT	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
zoomedIn	TokenNameIdentifier	 zoomed In
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
&&	TokenNameAND_AND	
signal	TokenNameIdentifier	 signal
==	TokenNameEQUAL_EQUAL	
OBJECT_SELECTED	TokenNameIdentifier	 OBJECT  SELECTED
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"selection in zoomed viewer, content="	TokenNameStringLiteral	selection in zoomed viewer, content=
+	TokenNamePLUS	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"zoomedIn="	TokenNameStringLiteral	zoomedIn=
+	TokenNamePLUS	
zoomedIn	TokenNameIdentifier	 zoomed In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"zoomedIn.canReceive is "	TokenNameStringLiteral	zoomedIn.canReceive is 
+	TokenNamePLUS	
(	TokenNameLPAREN	
zoomedIn	TokenNameIdentifier	 zoomed In
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
zoomedIn	TokenNameIdentifier	 zoomed In
.	TokenNameDOT	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
signal	TokenNameIdentifier	 signal
==	TokenNameEQUAL_EQUAL	
OBJECT_SELECTED	TokenNameIdentifier	 OBJECT  SELECTED
&&	TokenNameAND_AND	
senders	TokenNameIdentifier	 senders
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
zoomedOut	TokenNameIdentifier	 zoomed Out
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
zoomedIn	TokenNameIdentifier	 zoomed In
.	TokenNameDOT	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
