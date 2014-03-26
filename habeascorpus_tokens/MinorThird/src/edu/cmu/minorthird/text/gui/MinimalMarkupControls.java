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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionListener	TokenNameIdentifier	 Action Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JComboBox	TokenNameIdentifier	 J Combo Box
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleAttributeSet	TokenNameIdentifier	 Simple Attribute Set
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
SpanDifference	TokenNameIdentifier	 Span Difference
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
ViewerControls	TokenNameIdentifier	 Viewer Controls
;	TokenNameSEMICOLON	
/** * A compact control window for marking spans up in a labeling. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A compact control window for marking spans up in a labeling. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
MinimalMarkupControls	TokenNameIdentifier	 Minimal Markup Controls
extends	TokenNameextends	
MarkupControls	TokenNameIdentifier	 Markup Controls
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080306L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MENU_STRING	TokenNameIdentifier	 MENU  STRING
=	TokenNameEQUAL	
" -select type- "	TokenNameStringLiteral	 -select type- 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
SimpleAttributeSet	TokenNameIdentifier	 Simple Attribute Set
HIGHLIGHT_COLOR	TokenNameIdentifier	 HIGHLIGHT  COLOR
=	TokenNameEQUAL	
HiliteColors	TokenNameIdentifier	 Hilite Colors
.	TokenNameDOT	
yellow	TokenNameIdentifier	 yellow
;	TokenNameSEMICOLON	
private	TokenNameprivate	
JComboBox	TokenNameIdentifier	 J Combo Box
typeBox	TokenNameIdentifier	 type Box
;	TokenNameSEMICOLON	
// selects highlighted type 	TokenNameCOMMENT_LINE	selects highlighted type 
// private SpanDifference sd; // result of diffing two types 	TokenNameCOMMENT_LINE	private SpanDifference sd; // result of diffing two types 
public	TokenNamepublic	
MinimalMarkupControls	TokenNameIdentifier	 Minimal Markup Controls
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Lay out the controls - override the super class */	TokenNameCOMMENT_JAVADOC	 Lay out the controls - override the super class 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
types	TokenNameIdentifier	 types
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// will go back and initialize later 	TokenNameCOMMENT_LINE	will go back and initialize later 
typeBox	TokenNameIdentifier	 type Box
=	TokenNameEQUAL	
new	TokenNamenew	
JComboBox	TokenNameIdentifier	 J Combo Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeBox	TokenNameIdentifier	 type Box
.	TokenNameDOT	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
MENU_STRING	TokenNameIdentifier	 MENU  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
types	TokenNameIdentifier	 types
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
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeBox	TokenNameIdentifier	 type Box
.	TokenNameDOT	
addItem	TokenNameIdentifier	 add Item
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
typeBox	TokenNameIdentifier	 type Box
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeBox	TokenNameIdentifier	 type Box
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
MinimalMarkupControls	TokenNameIdentifier	 Minimal Markup Controls
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
getControlledViewer	TokenNameIdentifier	 get Controlled Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
applyControls	TokenNameIdentifier	 apply Controls
(	TokenNameLPAREN	
MinimalMarkupControls	TokenNameIdentifier	 Minimal Markup Controls
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
int	TokenNameint	
preferredLocation	TokenNameIdentifier	 preferred Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ViewerControls	TokenNameIdentifier	 Viewer Controls
.	TokenNameDOT	
BOTTOM	TokenNameIdentifier	 BOTTOM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
prefersToBeResized	TokenNameIdentifier	 prefers To Be Resized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// what's exported to the viewer... 	TokenNameCOMMENT_LINE	what's exported to the viewer... 
// 	TokenNameCOMMENT_LINE	 
/** * Tell the ControlledViewer what color is associated with a type. */	TokenNameCOMMENT_JAVADOC	 Tell the ControlledViewer what color is associated with a type. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
SimpleAttributeSet	TokenNameIdentifier	 Simple Attribute Set
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
selectedType	TokenNameIdentifier	 selected Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
typeBox	TokenNameIdentifier	 type Box
.	TokenNameDOT	
getSelectedItem	TokenNameIdentifier	 get Selected Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
selectedType	TokenNameIdentifier	 selected Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
HIGHLIGHT_COLOR	TokenNameIdentifier	 HIGHLIGHT  COLOR
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the ControlledViewer what color is associated with a property/value * pair */	TokenNameCOMMENT_JAVADOC	 Tell the ControlledViewer what color is associated with a property/value pair 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
SimpleAttributeSet	TokenNameIdentifier	 Simple Attribute Set
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getColoredProperties	TokenNameIdentifier	 get Colored Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getColoredValues	TokenNameIdentifier	 get Colored Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Export a span difference to the controlled Span Viewer. */	TokenNameCOMMENT_JAVADOC	 Export a span difference to the controlled Span Viewer. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
SpanDifference	TokenNameIdentifier	 Span Difference
getSpanDifference	TokenNameIdentifier	 get Span Difference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
