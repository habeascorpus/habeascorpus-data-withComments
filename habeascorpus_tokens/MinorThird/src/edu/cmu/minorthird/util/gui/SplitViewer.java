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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JSplitPane	TokenNameIdentifier	 J Split Pane
;	TokenNameSEMICOLON	
/** * Two viewers, arranged side-by-side or top-and-bottom. * * @author William cohen */	TokenNameCOMMENT_JAVADOC	 Two viewers, arranged side-by-side or top-and-bottom. * @author William cohen 
abstract	TokenNameabstract	
public	TokenNamepublic	
class	TokenNameclass	
SplitViewer	TokenNameIdentifier	 Split Viewer
extends	TokenNameextends	
Viewer	TokenNameIdentifier	 Viewer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20081125L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
JSplitPane	TokenNameIdentifier	 J Split Pane
splitPane	TokenNameIdentifier	 split Pane
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Viewer	TokenNameIdentifier	 Viewer
viewer1	TokenNameIdentifier	 viewer1
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
viewer2	TokenNameIdentifier	 viewer2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SplitViewer	TokenNameIdentifier	 Split Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SplitViewer	TokenNameIdentifier	 Split Viewer
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
viewer1	TokenNameIdentifier	 viewer1
,	TokenNameCOMMA	
Viewer	TokenNameIdentifier	 Viewer
viewer2	TokenNameIdentifier	 viewer2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSubViews	TokenNameIdentifier	 set Sub Views
(	TokenNameLPAREN	
viewer1	TokenNameIdentifier	 viewer1
,	TokenNameCOMMA	
viewer2	TokenNameIdentifier	 viewer2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setVertical	TokenNameIdentifier	 set Vertical
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setOrientation	TokenNameIdentifier	 set Orientation
(	TokenNameLPAREN	
JSplitPane	TokenNameIdentifier	 J Split Pane
.	TokenNameDOT	
VERTICAL_SPLIT	TokenNameIdentifier	 VERTICAL  SPLIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setHorizontal	TokenNameIdentifier	 set Horizontal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setOrientation	TokenNameIdentifier	 set Orientation
(	TokenNameLPAREN	
JSplitPane	TokenNameIdentifier	 J Split Pane
.	TokenNameDOT	
HORIZONTAL_SPLIT	TokenNameIdentifier	 HORIZONTAL  SPLIT
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
0.50	TokenNameDoubleLiteral	
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
public	TokenNamepublic	
void	TokenNamevoid	
setSubViews	TokenNameIdentifier	 set Sub Views
(	TokenNameLPAREN	
Viewer	TokenNameIdentifier	 Viewer
viewer1	TokenNameIdentifier	 viewer1
,	TokenNameCOMMA	
Viewer	TokenNameIdentifier	 Viewer
viewer2	TokenNameIdentifier	 viewer2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
viewer2	TokenNameIdentifier	 viewer2
=	TokenNameEQUAL	
viewer2	TokenNameIdentifier	 viewer2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
viewer1	TokenNameIdentifier	 viewer1
=	TokenNameEQUAL	
viewer1	TokenNameIdentifier	 viewer1
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
getOrientation	TokenNameIdentifier	 get Orientation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
JSplitPane	TokenNameIdentifier	 J Split Pane
.	TokenNameDOT	
VERTICAL_SPLIT	TokenNameIdentifier	 VERTICAL  SPLIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setTopComponent	TokenNameIdentifier	 set Top Component
(	TokenNameLPAREN	
viewer1	TokenNameIdentifier	 viewer1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setBottomComponent	TokenNameIdentifier	 set Bottom Component
(	TokenNameLPAREN	
viewer2	TokenNameIdentifier	 viewer2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer1	TokenNameIdentifier	 viewer1
.	TokenNameDOT	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
"top"	TokenNameStringLiteral	top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer2	TokenNameIdentifier	 viewer2
.	TokenNameDOT	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
"bottom"	TokenNameStringLiteral	bottom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setLeftComponent	TokenNameIdentifier	 set Left Component
(	TokenNameLPAREN	
viewer1	TokenNameIdentifier	 viewer1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPane	TokenNameIdentifier	 split Pane
.	TokenNameDOT	
setRightComponent	TokenNameIdentifier	 set Right Component
(	TokenNameLPAREN	
viewer2	TokenNameIdentifier	 viewer2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer1	TokenNameIdentifier	 viewer1
.	TokenNameDOT	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
"left"	TokenNameStringLiteral	left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer2	TokenNameIdentifier	 viewer2
.	TokenNameDOT	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
"right"	TokenNameStringLiteral	right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clearContent	TokenNameIdentifier	 clear Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
viewer1	TokenNameIdentifier	 viewer1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
viewer2	TokenNameIdentifier	 viewer2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
viewer1	TokenNameIdentifier	 viewer1
.	TokenNameDOT	
clearContent	TokenNameIdentifier	 clear Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viewer2	TokenNameIdentifier	 viewer2
.	TokenNameDOT	
clearContent	TokenNameIdentifier	 clear Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
