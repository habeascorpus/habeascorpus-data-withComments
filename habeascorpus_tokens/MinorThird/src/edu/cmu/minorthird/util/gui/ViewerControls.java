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
JPanel	TokenNameIdentifier	 J Panel
;	TokenNameSEMICOLON	
/** * Controls for a ControlledViewer. * * The intended use for this is to couple it with a ControllableViewer * in a ControlledViewer. When this object is 'updated', the * ControllableViewer's applyControls() method will be called with * this object, and the ControllableViewer can then interrogate the * ViewerControls to get the state of the buttons. An 'update' is any * actionEvent forwarded with the ViewerControls. * * <p> To use this, add a set of JButtons, etc to this object in the * abstract initialize() routine. If any buttons are to force an * immediate update, then use addActionListener(this). If desired, * add an 'applyButton()', which simply is a button which forces an * update. * * @author William cohen */	TokenNameCOMMENT_JAVADOC	 Controls for a ControlledViewer. * The intended use for this is to couple it with a ControllableViewer in a ControlledViewer. When this object is 'updated', the ControllableViewer's applyControls() method will be called with this object, and the ControllableViewer can then interrogate the ViewerControls to get the state of the buttons. An 'update' is any actionEvent forwarded with the ViewerControls. * <p> To use this, add a set of JButtons, etc to this object in the abstract initialize() routine. If any buttons are to force an immediate update, then use addActionListener(this). If desired, add an 'applyButton()', which simply is a button which forces an update. * @author William cohen 
abstract	TokenNameabstract	
public	TokenNamepublic	
class	TokenNameclass	
ViewerControls	TokenNameIdentifier	 Viewer Controls
extends	TokenNameextends	
JPanel	TokenNameIdentifier	 J Panel
implements	TokenNameimplements	
ActionListener	TokenNameIdentifier	 Action Listener
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20081125L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BOTTOM	TokenNameIdentifier	 BOTTOM
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
RIGHT	TokenNameIdentifier	 RIGHT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TOP	TokenNameIdentifier	 TOP
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
LEFT	TokenNameIdentifier	 LEFT
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Viewer	TokenNameIdentifier	 Viewer
viewer	TokenNameIdentifier	 viewer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ViewerControls	TokenNameIdentifier	 Viewer Controls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Declare the viewer controlled by this ViewerControls object. */	TokenNameCOMMENT_JAVADOC	 Declare the viewer controlled by this ViewerControls object. 
public	TokenNamepublic	
void	TokenNamevoid	
setControlledViewer	TokenNameIdentifier	 set Controlled Viewer
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
instanceof	TokenNameinstanceof	
Controllable	TokenNameIdentifier	 Controllable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"viewer must be controllable"	TokenNameStringLiteral	viewer must be controllable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
=	TokenNameEQUAL	
viewer	TokenNameIdentifier	 viewer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the viewer that is controlled by this object. */	TokenNameCOMMENT_JAVADOC	 Return the viewer that is controlled by this object. 
public	TokenNamepublic	
Controllable	TokenNameIdentifier	 Controllable
getControlledViewer	TokenNameIdentifier	 get Controlled Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Controllable	TokenNameIdentifier	 Controllable
)	TokenNameRPAREN	
viewer	TokenNameIdentifier	 viewer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add an update button. */	TokenNameCOMMENT_JAVADOC	 Add an update button. 
public	TokenNamepublic	
void	TokenNamevoid	
addApplyButton	TokenNameIdentifier	 add Apply Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
makeApplyButton	TokenNameIdentifier	 make Apply Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create an 'apply' button. */	TokenNameCOMMENT_JAVADOC	 Create an 'apply' button. 
public	TokenNamepublic	
JButton	TokenNameIdentifier	 J Button
makeApplyButton	TokenNameIdentifier	 make Apply Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
new	TokenNamenew	
AbstractAction	TokenNameIdentifier	 Abstract Action
(	TokenNameLPAREN	
"Apply"	TokenNameStringLiteral	Apply
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Controllable	TokenNameIdentifier	 Controllable
)	TokenNameRPAREN	
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
.	TokenNameDOT	
applyControls	TokenNameIdentifier	 apply Controls
(	TokenNameLPAREN	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// implement ActionListener 	TokenNameCOMMENT_LINE	implement ActionListener 
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
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Controllable	TokenNameIdentifier	 Controllable
)	TokenNameRPAREN	
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
.	TokenNameDOT	
applyControls	TokenNameIdentifier	 apply Controls
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Override this with one of the other values to help * ControlledViewer decide where to place the controls. */	TokenNameCOMMENT_JAVADOC	 Override this with one of the other values to help ControlledViewer decide where to place the controls. 
public	TokenNamepublic	
int	TokenNameint	
preferredLocation	TokenNameIdentifier	 preferred Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BOTTOM	TokenNameIdentifier	 BOTTOM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Override this with one of the other values to help * ControlledViewer decide whether to allow the * ViewerControls to be resizable */	TokenNameCOMMENT_JAVADOC	 Override this with one of the other values to help ControlledViewer decide whether to allow the ViewerControls to be resizable 
public	TokenNamepublic	
boolean	TokenNameboolean	
prefersToBeResized	TokenNameIdentifier	 prefers To Be Resized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// abstract actions 	TokenNameCOMMENT_LINE	abstract actions 
// 	TokenNameCOMMENT_LINE	 
/** Set up any buttons, etc for this set of ViewerControls. */	TokenNameCOMMENT_JAVADOC	 Set up any buttons, etc for this set of ViewerControls. 
abstract	TokenNameabstract	
protected	TokenNameprotected	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
