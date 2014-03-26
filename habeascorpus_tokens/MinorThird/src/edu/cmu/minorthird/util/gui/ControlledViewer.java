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
JCheckBox	TokenNameIdentifier	 J Check Box
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JSplitPane	TokenNameIdentifier	 J Split Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTextField	TokenNameIdentifier	 J Text Field
;	TokenNameSEMICOLON	
/** * A Viewer coupled with a ViewerControls object. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A Viewer coupled with a ViewerControls object. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
ControlledViewer	TokenNameIdentifier	 Controlled Viewer
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
viewer	TokenNameIdentifier	 viewer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ViewerControls	TokenNameIdentifier	 Viewer Controls
controls	TokenNameIdentifier	 controls
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ControlledViewer	TokenNameIdentifier	 Controlled Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ControlledViewer	TokenNameIdentifier	 Controlled Viewer
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
viewer	TokenNameIdentifier	 viewer
,	TokenNameCOMMA	
ViewerControls	TokenNameIdentifier	 Viewer Controls
controls	TokenNameIdentifier	 controls
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setComponents	TokenNameIdentifier	 set Components
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
,	TokenNameCOMMA	
controls	TokenNameIdentifier	 controls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setComponents	TokenNameIdentifier	 set Components
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
viewer	TokenNameIdentifier	 viewer
,	TokenNameCOMMA	
ViewerControls	TokenNameIdentifier	 Viewer Controls
controls	TokenNameIdentifier	 controls
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
controls	TokenNameIdentifier	 controls
=	TokenNameEQUAL	
controls	TokenNameIdentifier	 controls
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
=	TokenNameEQUAL	
viewer	TokenNameIdentifier	 viewer
;	TokenNameSEMICOLON	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
setControlledViewer	TokenNameIdentifier	 set Controlled Viewer
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer	TokenNameIdentifier	 viewer
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
if	TokenNameif	
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
prefersToBeResized	TokenNameIdentifier	 prefers To Be Resized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
preferredLocation	TokenNameIdentifier	 preferred Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
BOTTOM	TokenNameIdentifier	 BOTTOM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JSplitPane	TokenNameIdentifier	 J Split Pane
splitPane	TokenNameIdentifier	 split Pane
=	TokenNameEQUAL	
new	TokenNamenew	
JSplitPane	TokenNameIdentifier	 J Split Pane
(	TokenNameLPAREN	
JSplitPane	TokenNameIdentifier	 J Split Pane
.	TokenNameDOT	
VERTICAL_SPLIT	TokenNameIdentifier	 VERTICAL  SPLIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setResizeWeight	TokenNameIdentifier	 set Resize Weight
(	TokenNameLPAREN	
0.90	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setTopComponent	TokenNameIdentifier	 set Top Component
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setBottomComponent	TokenNameIdentifier	 set Bottom Component
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
splitPane	TokenNameIdentifier	 split Pane
,	TokenNameCOMMA	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
preferredLocation	TokenNameIdentifier	 preferred Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
TOP	TokenNameIdentifier	 TOP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JSplitPane	TokenNameIdentifier	 J Split Pane
splitPane	TokenNameIdentifier	 split Pane
=	TokenNameEQUAL	
new	TokenNamenew	
JSplitPane	TokenNameIdentifier	 J Split Pane
(	TokenNameLPAREN	
JSplitPane	TokenNameIdentifier	 J Split Pane
.	TokenNameDOT	
VERTICAL_SPLIT	TokenNameIdentifier	 VERTICAL  SPLIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setResizeWeight	TokenNameIdentifier	 set Resize Weight
(	TokenNameLPAREN	
0.10	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setTopComponent	TokenNameIdentifier	 set Top Component
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setBottomComponent	TokenNameIdentifier	 set Bottom Component
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
splitPane	TokenNameIdentifier	 split Pane
,	TokenNameCOMMA	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
preferredLocation	TokenNameIdentifier	 preferred Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
RIGHT	TokenNameIdentifier	 RIGHT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JSplitPane	TokenNameIdentifier	 J Split Pane
splitPane	TokenNameIdentifier	 split Pane
=	TokenNameEQUAL	
new	TokenNamenew	
JSplitPane	TokenNameIdentifier	 J Split Pane
(	TokenNameLPAREN	
JSplitPane	TokenNameIdentifier	 J Split Pane
.	TokenNameDOT	
HORIZONTAL_SPLIT	TokenNameIdentifier	 HORIZONTAL  SPLIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setResizeWeight	TokenNameIdentifier	 set Resize Weight
(	TokenNameLPAREN	
0.75	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setLeftComponent	TokenNameIdentifier	 set Left Component
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setRightComponent	TokenNameIdentifier	 set Right Component
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
splitPane	TokenNameIdentifier	 split Pane
,	TokenNameCOMMA	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
preferredLocation	TokenNameIdentifier	 preferred Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
LEFT	TokenNameIdentifier	 LEFT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JSplitPane	TokenNameIdentifier	 J Split Pane
splitPane	TokenNameIdentifier	 split Pane
=	TokenNameEQUAL	
new	TokenNamenew	
JSplitPane	TokenNameIdentifier	 J Split Pane
(	TokenNameLPAREN	
JSplitPane	TokenNameIdentifier	 J Split Pane
.	TokenNameDOT	
HORIZONTAL_SPLIT	TokenNameIdentifier	 HORIZONTAL  SPLIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setResizeWeight	TokenNameIdentifier	 set Resize Weight
(	TokenNameLPAREN	
0.25	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setLeftComponent	TokenNameIdentifier	 set Left Component
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setRightComponent	TokenNameIdentifier	 set Right Component
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
splitPane	TokenNameIdentifier	 split Pane
,	TokenNameCOMMA	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"controls has illegal preferred location "	TokenNameStringLiteral	controls has illegal preferred location 
+	TokenNamePLUS	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
preferredLocation	TokenNameIdentifier	 preferred Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
controls	TokenNameIdentifier	 controls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
;	TokenNameSEMICOLON	
int	TokenNameint	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
controls	TokenNameIdentifier	 controls
.	TokenNameDOT	
preferredLocation	TokenNameIdentifier	 preferred Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
==	TokenNameEQUAL_EQUAL	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
BOTTOM	TokenNameIdentifier	 BOTTOM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
==	TokenNameEQUAL_EQUAL	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
TOP	TokenNameIdentifier	 TOP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
==	TokenNameEQUAL_EQUAL	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
RIGHT	TokenNameIdentifier	 RIGHT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
loc	TokenNameIdentifier	 loc
==	TokenNameEQUAL_EQUAL	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
LEFT	TokenNameIdentifier	 LEFT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
part	TokenNameIdentifier	 part
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"controls has illegal preferred location "	TokenNameStringLiteral	controls has illegal preferred location 
+	TokenNamePLUS	
loc	TokenNameIdentifier	 loc
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
controls	TokenNameIdentifier	 controls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
gbc	TokenNameIdentifier	 gbc
=	TokenNameEQUAL	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
x1	TokenNameIdentifier	 x1
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
viewer	TokenNameIdentifier	 viewer
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
=	TokenNameEQUAL	
fillerGBC	TokenNameIdentifier	 filler GBC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
/=	TokenNameDIVIDE_EQUAL	
part	TokenNameIdentifier	 part
;	TokenNameSEMICOLON	
gbc	TokenNameIdentifier	 gbc
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
/=	TokenNameDIVIDE_EQUAL	
part	TokenNameIdentifier	 part
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
controls	TokenNameIdentifier	 controls
,	TokenNameCOMMA	
gbc	TokenNameIdentifier	 gbc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ViewerControls	TokenNameIdentifier	 Viewer Controls
getControls	TokenNameIdentifier	 get Controls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
controls	TokenNameIdentifier	 controls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// delegate signals & content to sub-viewer 	TokenNameCOMMENT_LINE	delegate signals & content to sub-viewer 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clearContent	TokenNameIdentifier	 clear Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
clearContent	TokenNameIdentifier	 clear Content
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
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
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
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
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
viewer	TokenNameIdentifier	 viewer
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
viewer	TokenNameIdentifier	 viewer
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
// 	TokenNameCOMMENT_LINE	 
// a very simple test case 	TokenNameCOMMENT_LINE	a very simple test case 
// 	TokenNameCOMMENT_LINE	 
/** a test case */	TokenNameCOMMENT_JAVADOC	 a test case 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argv	TokenNameIdentifier	 argv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
ControlledViewer	TokenNameIdentifier	 Controlled Viewer
(	TokenNameLPAREN	
new	TokenNamenew	
MyViewer	TokenNameIdentifier	 My Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MyControls	TokenNameIdentifier	 My Controls
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
"William Cohen"	TokenNameStringLiteral	William Cohen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for test case 	TokenNameCOMMENT_LINE	for test case 
static	TokenNamestatic	
private	TokenNameprivate	
class	TokenNameclass	
MyViewer	TokenNameIdentifier	 My Viewer
extends	TokenNameextends	
TransformedVanillaViewer	TokenNameIdentifier	 Transformed Vanilla Viewer
implements	TokenNameimplements	
Controllable	TokenNameIdentifier	 Controllable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
uc	TokenNameIdentifier	 uc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
lastObj	TokenNameIdentifier	 last Obj
;	TokenNameSEMICOLON	
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
lastObj	TokenNameIdentifier	 last Obj
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
uc	TokenNameIdentifier	 uc
?	TokenNameQUESTION	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"transform: "	TokenNameStringLiteral	transform: 
+	TokenNamePLUS	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
" => "	TokenNameStringLiteral	 => 
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
applyControls	TokenNameIdentifier	 apply Controls
(	TokenNameLPAREN	
ViewerControls	TokenNameIdentifier	 Viewer Controls
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"controls: "	TokenNameStringLiteral	controls: 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MyControls	TokenNameIdentifier	 My Controls
mc	TokenNameIdentifier	 mc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MyControls	TokenNameIdentifier	 My Controls
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
uc	TokenNameIdentifier	 uc
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
.	TokenNameDOT	
ucBox	TokenNameIdentifier	 uc Box
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
.	TokenNameDOT	
prefixField	TokenNameIdentifier	 prefix Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"recieving: "	TokenNameStringLiteral	recieving: 
+	TokenNamePLUS	
lastObj	TokenNameIdentifier	 last Obj
+	TokenNamePLUS	
" with uc="	TokenNameStringLiteral	 with uc=
+	TokenNamePLUS	
uc	TokenNameIdentifier	 uc
+	TokenNamePLUS	
" prefix="	TokenNameStringLiteral	 prefix=
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
receiveContent	TokenNameIdentifier	 receive Content
(	TokenNameLPAREN	
lastObj	TokenNameIdentifier	 last Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// for test case 	TokenNameCOMMENT_LINE	for test case 
static	TokenNamestatic	
private	TokenNameprivate	
class	TokenNameclass	
MyControls	TokenNameIdentifier	 My Controls
extends	TokenNameextends	
ViewerControls	TokenNameIdentifier	 Viewer Controls
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080517L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JCheckBox	TokenNameIdentifier	 J Check Box
ucBox	TokenNameIdentifier	 uc Box
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JTextField	TokenNameIdentifier	 J Text Field
prefixField	TokenNameIdentifier	 prefix Field
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ucBox	TokenNameIdentifier	 uc Box
=	TokenNameEQUAL	
new	TokenNamenew	
JCheckBox	TokenNameIdentifier	 J Check Box
(	TokenNameLPAREN	
"uc"	TokenNameStringLiteral	uc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ucBox	TokenNameIdentifier	 uc Box
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ucBox	TokenNameIdentifier	 uc Box
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefixField	TokenNameIdentifier	 prefix Field
=	TokenNameEQUAL	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
"the man: "	TokenNameStringLiteral	the man: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
prefixField	TokenNameIdentifier	 prefix Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addApplyButton	TokenNameIdentifier	 add Apply Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[uc: "	TokenNameStringLiteral	[uc: 
+	TokenNamePLUS	
ucBox	TokenNameIdentifier	 uc Box
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" prefix: "	TokenNameStringLiteral	 prefix: 
+	TokenNamePLUS	
prefixField	TokenNameIdentifier	 prefix Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
