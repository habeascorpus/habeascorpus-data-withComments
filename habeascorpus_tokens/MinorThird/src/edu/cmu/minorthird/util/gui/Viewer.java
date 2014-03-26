/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseAdapter	TokenNameIdentifier	 Mouse Adapter
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseEvent	TokenNameIdentifier	 Mouse Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
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
JPanel	TokenNameIdentifier	 J Panel
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTable	TokenNameIdentifier	 J Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ListSelectionEvent	TokenNameIdentifier	 List Selection Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ListSelectionListener	TokenNameIdentifier	 List Selection Listener
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
/** * * Visualize an object, and obey certain rules for propogating events. * * <p> * Specifically, a Viewer has a superview, which is also a viewer, and displays * some 'content'. The canReceive(), clearContent(), and receiveContent() * methods are used for displaying content. Viewers also send signals via the * sendSignal() method. Signals are passed up to a superview, its superview, and * so on, until a Viewer is found that canHandle() that signal, at which point * the signal is trapped, and processed. * * <p> * Viewers are intended to be used for linked display components. * * @author William cohen * */	TokenNameCOMMENT_JAVADOC	 * Visualize an object, and obey certain rules for propogating events. * <p> Specifically, a Viewer has a superview, which is also a viewer, and displays some 'content'. The canReceive(), clearContent(), and receiveContent() methods are used for displaying content. Viewers also send signals via the sendSignal() method. Signals are passed up to a superview, its superview, and so on, until a Viewer is found that canHandle() that signal, at which point the signal is trapped, and processed. * <p> Viewers are intended to be used for linked display components. * @author William cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Viewer	TokenNameIdentifier	 Viewer
extends	TokenNameextends	
JPanel	TokenNameIdentifier	 J Panel
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20081125L	TokenNameLongLiteral	
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
Viewer	TokenNameIdentifier	 Viewer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
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
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ONLY_SUBVIEWER	TokenNameIdentifier	 ONLY  SUBVIEWER
=	TokenNameEQUAL	
"*main*"	TokenNameStringLiteral	*main*
;	TokenNameSEMICOLON	
static	TokenNamestatic	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
SET_CONTENT	TokenNameIdentifier	 SET  CONTENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
TEXT_MESSAGE	TokenNameIdentifier	 TEXT  MESSAGE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
OBJECT_SELECTED	TokenNameIdentifier	 OBJECT  SELECTED
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
OBJECT_UPDATED	TokenNameIdentifier	 OBJECT  UPDATED
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Viewer	TokenNameIdentifier	 Viewer
superView	TokenNameIdentifier	 super View
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
"empty view"	TokenNameStringLiteral	empty view
;	TokenNameSEMICOLON	
/** Maps String 'names' of subviews to viewers. */	TokenNameCOMMENT_JAVADOC	 Maps String 'names' of subviews to viewers. 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
namedSubViews	TokenNameIdentifier	 named Sub Views
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// setters & getters 	TokenNameCOMMENT_LINE	setters & getters 
// 	TokenNameCOMMENT_LINE	 
/** Declare this viewer to be the only subview of superView. */	TokenNameCOMMENT_JAVADOC	 Declare this viewer to be the only subview of superView. 
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
superView	TokenNameIdentifier	 super View
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if (namedSubViews.keySet().size()>1) 	TokenNameCOMMENT_LINE	if (namedSubViews.keySet().size()>1) 
// throw new IllegalStateException("superview already has a subview"); 	TokenNameCOMMENT_LINE	throw new IllegalStateException("superview already has a subview"); 
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
superView	TokenNameIdentifier	 super View
,	TokenNameCOMMA	
ONLY_SUBVIEWER	TokenNameIdentifier	 ONLY  SUBVIEWER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Declare this viewer to be a subview of superView. */	TokenNameCOMMENT_JAVADOC	 Declare this viewer to be a subview of superView. 
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
superView	TokenNameIdentifier	 super View
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if (namedSubViews.get(title)!=null) 	TokenNameCOMMENT_LINE	if (namedSubViews.get(title)!=null) 
// throw new IllegalStateException("superview already has a subview named 	TokenNameCOMMENT_LINE	throw new IllegalStateException("superview already has a subview named 
// "+title); 	TokenNameCOMMENT_LINE	"+title); 
this	TokenNamethis	
.	TokenNameDOT	
superView	TokenNameIdentifier	 super View
=	TokenNameEQUAL	
superView	TokenNameIdentifier	 super View
;	TokenNameSEMICOLON	
superView	TokenNameIdentifier	 super View
.	TokenNameDOT	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get Viewer in which this viewer is contained. */	TokenNameCOMMENT_JAVADOC	 Get Viewer in which this viewer is contained. 
final	TokenNamefinal	
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
getSuperView	TokenNameIdentifier	 get Super View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
superView	TokenNameIdentifier	 super View
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Change the object being displayed by this viewer. */	TokenNameCOMMENT_JAVADOC	 Change the object being displayed by this viewer. 
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Change the object being displayed by this viewer. If forceUpdate is false, * do not force the display to be changed. */	TokenNameCOMMENT_JAVADOC	 Change the object being displayed by this viewer. If forceUpdate is false, do not force the display to be changed. 
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forceUpdate	TokenNameIdentifier	 force Update
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
content	TokenNameIdentifier	 content
||	TokenNameOR_OR	
forceUpdate	TokenNameIdentifier	 force Update
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
receiveContent	TokenNameIdentifier	 receive Content
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendSignal	TokenNameIdentifier	 send Signal
(	TokenNameLPAREN	
SET_CONTENT	TokenNameIdentifier	 SET  CONTENT
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the object being displayed, as determined by the last call to * setContent(). */	TokenNameCOMMENT_JAVADOC	 Get the object being displayed, as determined by the last call to setContent(). 
final	TokenNamefinal	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getContent	TokenNameIdentifier	 get Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the object being displayed as the user sees it. */	TokenNameCOMMENT_JAVADOC	 Get the object being displayed as the user sees it. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getVisibleContent	TokenNameIdentifier	 get Visible Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ONLY_SUBVIEWER	TokenNameIdentifier	 ONLY  SUBVIEWER
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ONLY_SUBVIEWER	TokenNameIdentifier	 ONLY  SUBVIEWER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVisibleContent	TokenNameIdentifier	 get Visible Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getSerializableContent	TokenNameIdentifier	 get Serializable Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
instanceof	TokenNameinstanceof	
Serializable	TokenNameIdentifier	 Serializable
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ONLY_SUBVIEWER	TokenNameIdentifier	 ONLY  SUBVIEWER
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ONLY_SUBVIEWER	TokenNameIdentifier	 ONLY  SUBVIEWER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSerializableContent	TokenNameIdentifier	 get Serializable Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// signalling 	TokenNameCOMMENT_LINE	signalling 
// 	TokenNameCOMMENT_LINE	 
/** Send a signal. */	TokenNameCOMMENT_JAVADOC	 Send a signal. 
final	TokenNamefinal	
protected	TokenNameprotected	
void	TokenNamevoid	
sendSignal	TokenNameIdentifier	 send Signal
(	TokenNameLPAREN	
int	TokenNameint	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"signal sent by "	TokenNameStringLiteral	signal sent by 
+	TokenNamePLUS	
this	TokenNamethis	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
signal	TokenNameIdentifier	 signal
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
superView	TokenNameIdentifier	 super View
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
senders	TokenNameIdentifier	 senders
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
senders	TokenNameIdentifier	 senders
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
superView	TokenNameIdentifier	 super View
.	TokenNameDOT	
hearBroadcast	TokenNameIdentifier	 hear Broadcast
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
/** * Listen to passing signals, and either handle them, or propogare them upward * to the superViewer. */	TokenNameCOMMENT_JAVADOC	 Listen to passing signals, and either handle them, or propogare them upward to the superViewer. 
final	TokenNamefinal	
private	TokenNameprivate	
void	TokenNamevoid	
hearBroadcast	TokenNameIdentifier	 hear Broadcast
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
canHandle	TokenNameIdentifier	 can Handle
(	TokenNameLPAREN	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
senders	TokenNameIdentifier	 senders
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"signal claimed by "	TokenNameStringLiteral	signal claimed by 
+	TokenNamePLUS	
this	TokenNamethis	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
signal	TokenNameIdentifier	 signal
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
argument	TokenNameIdentifier	 argument
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
senders	TokenNameIdentifier	 senders
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
superView	TokenNameIdentifier	 super View
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"signal forwarded to "	TokenNameStringLiteral	signal forwarded to 
+	TokenNamePLUS	
superView	TokenNameIdentifier	 super View
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
signal	TokenNameIdentifier	 signal
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
argument	TokenNameIdentifier	 argument
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
senders	TokenNameIdentifier	 senders
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
senders	TokenNameIdentifier	 senders
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
superView	TokenNameIdentifier	 super View
.	TokenNameDOT	
hearBroadcast	TokenNameIdentifier	 hear Broadcast
(	TokenNameLPAREN	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
senders	TokenNameIdentifier	 senders
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
superView	TokenNameIdentifier	 super View
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"no superview set for "	TokenNameStringLiteral	no superview set for 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// abstract actions 	TokenNameCOMMENT_LINE	abstract actions 
// 	TokenNameCOMMENT_LINE	 
/** Called at creation time. Initialize the layout of this view. */	TokenNameCOMMENT_JAVADOC	 Called at creation time. Initialize the layout of this view. 
abstract	TokenNameabstract	
protected	TokenNameprotected	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Called when new content obtained. So load it into the viewer. */	TokenNameCOMMENT_JAVADOC	 Called when new content obtained. So load it into the viewer. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
receiveContent	TokenNameIdentifier	 receive Content
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Called when no content should be displayed. */	TokenNameCOMMENT_JAVADOC	 Called when no content should be displayed. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
clearContent	TokenNameIdentifier	 clear Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** See if proposed content is displayable. */	TokenNameCOMMENT_JAVADOC	 See if proposed content is displayable. 
abstract	TokenNameabstract	
public	TokenNamepublic	
boolean	TokenNameboolean	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Handle a signal from a subview. */	TokenNameCOMMENT_JAVADOC	 Handle a signal from a subview. 
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** Offer to handle a signal. */	TokenNameCOMMENT_JAVADOC	 Offer to handle a signal. 
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** Provide a set of subview names */	TokenNameCOMMENT_JAVADOC	 Provide a set of subview names 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getSubViewNames	TokenNameIdentifier	 get Sub View Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
onlySubviewer	TokenNameIdentifier	 only Subviewer
=	TokenNameEQUAL	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ONLY_SUBVIEWER	TokenNameIdentifier	 ONLY  SUBVIEWER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
onlySubviewer	TokenNameIdentifier	 only Subviewer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
onlySubviewer	TokenNameIdentifier	 only Subviewer
.	TokenNameDOT	
getSubViewNames	TokenNameIdentifier	 get Sub View Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve a subview by name. */	TokenNameCOMMENT_JAVADOC	 Retrieve a subview by name. 
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
getNamedSubView	TokenNameIdentifier	 get Named Sub View
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
onlySubviewer	TokenNameIdentifier	 only Subviewer
=	TokenNameEQUAL	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ONLY_SUBVIEWER	TokenNameIdentifier	 ONLY  SUBVIEWER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
onlySubviewer	TokenNameIdentifier	 only Subviewer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
onlySubviewer	TokenNameIdentifier	 only Subviewer
.	TokenNameDOT	
getNamedSubView	TokenNameIdentifier	 get Named Sub View
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
namedSubViews	TokenNameIdentifier	 named Sub Views
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// utility functions 	TokenNameCOMMENT_LINE	utility functions 
// 	TokenNameCOMMENT_LINE	 
/** * Useful default case for a GridBagConstraint. */	TokenNameCOMMENT_JAVADOC	 Useful default case for a GridBagConstraint. 
protected	TokenNameprotected	
static	TokenNamestatic	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
BOTH	TokenNameIdentifier	 BOTH
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
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
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gbc	TokenNameIdentifier	 gbc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a list selection listener which sends the appropriate viewer signal. * The transformer is used to re-map the selected value. */	TokenNameCOMMENT_JAVADOC	 Add a list selection listener which sends the appropriate viewer signal. The transformer is used to re-map the selected value. 
protected	TokenNameprotected	
void	TokenNamevoid	
monitorSelections	TokenNameIdentifier	 monitor Selections
(	TokenNameLPAREN	
final	TokenNamefinal	
JList	TokenNameIdentifier	 J List
jlist	TokenNameIdentifier	 jlist
,	TokenNameCOMMA	
final	TokenNamefinal	
Transform	TokenNameIdentifier	 Transform
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jlist	TokenNameIdentifier	 jlist
.	TokenNameDOT	
addListSelectionListener	TokenNameIdentifier	 add List Selection Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ListSelectionListener	TokenNameIdentifier	 List Selection Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
valueChanged	TokenNameIdentifier	 value Changed
(	TokenNameLPAREN	
ListSelectionEvent	TokenNameIdentifier	 List Selection Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
jlist	TokenNameIdentifier	 jlist
.	TokenNameDOT	
getSelectedIndex	TokenNameIdentifier	 get Selected Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendSignal	TokenNameIdentifier	 send Signal
(	TokenNameLPAREN	
OBJECT_SELECTED	TokenNameIdentifier	 OBJECT  SELECTED
,	TokenNameCOMMA	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
jlist	TokenNameIdentifier	 jlist
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getElementAt	TokenNameIdentifier	 get Element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a list selection listener which sends the appropriate viewer signal. */	TokenNameCOMMENT_JAVADOC	 Add a list selection listener which sends the appropriate viewer signal. 
protected	TokenNameprotected	
void	TokenNamevoid	
monitorSelections	TokenNameIdentifier	 monitor Selections
(	TokenNameLPAREN	
final	TokenNamefinal	
JList	TokenNameIdentifier	 J List
jlist	TokenNameIdentifier	 jlist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monitorSelections	TokenNameIdentifier	 monitor Selections
(	TokenNameLPAREN	
jlist	TokenNameIdentifier	 jlist
,	TokenNameCOMMA	
IDENTITY_TRANSFORM	TokenNameIdentifier	 IDENTITY  TRANSFORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a list selection listener which sends the appropriate viewer signal. * The transformer is used to re-map the selected value. */	TokenNameCOMMENT_JAVADOC	 Add a list selection listener which sends the appropriate viewer signal. The transformer is used to re-map the selected value. 
protected	TokenNameprotected	
void	TokenNamevoid	
monitorSelections	TokenNameIdentifier	 monitor Selections
(	TokenNameLPAREN	
final	TokenNamefinal	
JTable	TokenNameIdentifier	 J Table
jtable	TokenNameIdentifier	 jtable
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
colIndex	TokenNameIdentifier	 col Index
,	TokenNameCOMMA	
final	TokenNamefinal	
Transform	TokenNameIdentifier	 Transform
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
jtable	TokenNameIdentifier	 jtable
.	TokenNameDOT	
addMouseListener	TokenNameIdentifier	 add Mouse Listener
(	TokenNameLPAREN	
new	TokenNamenew	
MouseAdapter	TokenNameIdentifier	 Mouse Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
mouseClicked	TokenNameIdentifier	 mouse Clicked
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
rowIndex	TokenNameIdentifier	 row Index
=	TokenNameEQUAL	
jtable	TokenNameIdentifier	 jtable
.	TokenNameDOT	
rowAtPoint	TokenNameIdentifier	 row At Point
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getPoint	TokenNameIdentifier	 get Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sendSignal	TokenNameIdentifier	 send Signal
(	TokenNameLPAREN	
OBJECT_SELECTED	TokenNameIdentifier	 OBJECT  SELECTED
,	TokenNameCOMMA	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
jtable	TokenNameIdentifier	 jtable
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValueAt	TokenNameIdentifier	 get Value At
(	TokenNameLPAREN	
rowIndex	TokenNameIdentifier	 row Index
,	TokenNameCOMMA	
colIndex	TokenNameIdentifier	 col Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a list selection listener which sends the appropriate viewer signal. */	TokenNameCOMMENT_JAVADOC	 Add a list selection listener which sends the appropriate viewer signal. 
protected	TokenNameprotected	
void	TokenNamevoid	
monitorSelections	TokenNameIdentifier	 monitor Selections
(	TokenNameLPAREN	
final	TokenNamefinal	
JTable	TokenNameIdentifier	 J Table
jtable	TokenNameIdentifier	 jtable
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
colIndex	TokenNameIdentifier	 col Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
monitorSelections	TokenNameIdentifier	 monitor Selections
(	TokenNameLPAREN	
jtable	TokenNameIdentifier	 jtable
,	TokenNameCOMMA	
colIndex	TokenNameIdentifier	 col Index
,	TokenNameCOMMA	
IDENTITY_TRANSFORM	TokenNameIdentifier	 IDENTITY  TRANSFORM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
interface	TokenNameinterface	
Transform	TokenNameIdentifier	 Transform
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
private	TokenNameprivate	
Transform	TokenNameIdentifier	 Transform
IDENTITY_TRANSFORM	TokenNameIdentifier	 IDENTITY  TRANSFORM
=	TokenNameEQUAL	
new	TokenNamenew	
Transform	TokenNameIdentifier	 Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
