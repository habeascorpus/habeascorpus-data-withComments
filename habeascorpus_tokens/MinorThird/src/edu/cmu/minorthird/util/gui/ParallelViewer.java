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
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
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
Iterator	TokenNameIdentifier	 Iterator
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
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
SwingConstants	TokenNameIdentifier	 Swing Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ChangeEvent	TokenNameIdentifier	 Change Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ChangeListener	TokenNameIdentifier	 Change Listener
;	TokenNameSEMICOLON	
/** * Conceptually this allows one to view several parallel aspects of a single * object. This is mapped to a JTabbedPane. * * <p> * Note: when content is sent to a ParallelViewer, the viewer immediate forwards * the content only to the currently selected subview. This means that the * non-default subviews can be expensive to compute - no extra overhead will be * incurred unless the user actually selects these views. <b>However</b>, * before the ParallelViewer recieves content, it also checks that <b>every</b> * subview can receive the content, using that subview's canRecieve * method. So * if a subview's canRecieve method is expensive (e.g., if it simply calls * receive to see if there is an error, as the default implementation of * ComponentViewer does) then this extra overhead will be incurred. * * @author William cohen */	TokenNameCOMMENT_JAVADOC	 Conceptually this allows one to view several parallel aspects of a single object. This is mapped to a JTabbedPane. * <p> Note: when content is sent to a ParallelViewer, the viewer immediate forwards the content only to the currently selected subview. This means that the non-default subviews can be expensive to compute - no extra overhead will be incurred unless the user actually selects these views. <b>However</b>, before the ParallelViewer recieves content, it also checks that <b>every</b> subview can receive the content, using that subview's canRecieve method. So if a subview's canRecieve method is expensive (e.g., if it simply calls receive to see if there is an error, as the default implementation of ComponentViewer does) then this extra overhead will be incurred. * @author William cohen 
public	TokenNamepublic	
class	TokenNameclass	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
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
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
parallelPane	TokenNameIdentifier	 parallel Pane
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
subViewList	TokenNameIdentifier	 sub View List
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Called at creation time. */	TokenNameCOMMENT_JAVADOC	 Called at creation time. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
parallelPane	TokenNameIdentifier	 parallel Pane
=	TokenNameEQUAL	
new	TokenNamenew	
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subViewList	TokenNameIdentifier	 sub View List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parallelPane	TokenNameIdentifier	 parallel Pane
,	TokenNameCOMMA	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parallelPane	TokenNameIdentifier	 parallel Pane
.	TokenNameDOT	
addChangeListener	TokenNameIdentifier	 add Change Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ChangeListener	TokenNameIdentifier	 Change Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
stateChanged	TokenNameIdentifier	 state Changed
(	TokenNameLPAREN	
ChangeEvent	TokenNameIdentifier	 Change Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// update the content of the currently selected view 	TokenNameCOMMENT_LINE	update the content of the currently selected view 
receiveContent	TokenNameIdentifier	 receive Content
(	TokenNameLPAREN	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
getContent	TokenNameIdentifier	 get Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Change default look of tabbed pane to put tabs on the left */	TokenNameCOMMENT_JAVADOC	 Change default look of tabbed pane to put tabs on the left 
public	TokenNamepublic	
void	TokenNamevoid	
putTabsOnLeft	TokenNameIdentifier	 put Tabs On Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parallelPane	TokenNameIdentifier	 parallel Pane
.	TokenNameDOT	
setTabPlacement	TokenNameIdentifier	 set Tab Placement
(	TokenNameLPAREN	
SwingConstants	TokenNameIdentifier	 Swing Constants
.	TokenNameDOT	
LEFT	TokenNameIdentifier	 LEFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parallelPane	TokenNameIdentifier	 parallel Pane
.	TokenNameDOT	
setTabLayoutPolicy	TokenNameIdentifier	 set Tab Layout Policy
(	TokenNameLPAREN	
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
.	TokenNameDOT	
SCROLL_TAB_LAYOUT	TokenNameIdentifier	 SCROLL  TAB  LAYOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add a new way of viewing the content object. */	TokenNameCOMMENT_JAVADOC	 Add a new way of viewing the content object. 
public	TokenNamepublic	
void	TokenNamevoid	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
Viewer	TokenNameIdentifier	 Viewer
view	TokenNameIdentifier	 view
)	TokenNameRPAREN	
{	TokenNameLBRACE	
view	TokenNameIdentifier	 view
.	TokenNameDOT	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subViewList	TokenNameIdentifier	 sub View List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
view	TokenNameIdentifier	 view
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parallelPane	TokenNameIdentifier	 parallel Pane
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
view	TokenNameIdentifier	 view
)	TokenNameRPAREN	
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
// just send content to the currently selected subview 	TokenNameCOMMENT_LINE	just send content to the currently selected subview 
Viewer	TokenNameIdentifier	 Viewer
subView	TokenNameIdentifier	 sub View
=	TokenNameEQUAL	
subViewList	TokenNameIdentifier	 sub View List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parallelPane	TokenNameIdentifier	 parallel Pane
.	TokenNameDOT	
getSelectedIndex	TokenNameIdentifier	 get Selected Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subView	TokenNameIdentifier	 sub View
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * override the default definition, to make sure the subView returned is * current. */	TokenNameCOMMENT_BLOCK	 override the default definition, to make sure the subView returned is current. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
getNamedSubView	TokenNameIdentifier	 get Named Sub View
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
subviewer	TokenNameIdentifier	 subviewer
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getNamedSubView	TokenNameIdentifier	 get Named Sub View
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subviewer	TokenNameIdentifier	 subviewer
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
getContent	TokenNameIdentifier	 get Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
subviewer	TokenNameIdentifier	 subviewer
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
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
subViewList	TokenNameIdentifier	 sub View List
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
Viewer	TokenNameIdentifier	 Viewer
subView	TokenNameIdentifier	 sub View
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
subView	TokenNameIdentifier	 sub View
.	TokenNameDOT	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Viewer	TokenNameIdentifier	 Viewer
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
subViewList	TokenNameIdentifier	 sub View List
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
Viewer	TokenNameIdentifier	 Viewer
subView	TokenNameIdentifier	 sub View
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subView	TokenNameIdentifier	 sub View
.	TokenNameDOT	
clearContent	TokenNameIdentifier	 clear Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"signal:"	TokenNameStringLiteral	signal:
+	TokenNamePLUS	
signal	TokenNameIdentifier	 signal
+	TokenNamePLUS	
" argument:"	TokenNameStringLiteral	 argument:
+	TokenNamePLUS	
argument	TokenNameIdentifier	 argument
+	TokenNamePLUS	
" at:"	TokenNameStringLiteral	 at:
+	TokenNamePLUS	
this	TokenNamethis	
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
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
