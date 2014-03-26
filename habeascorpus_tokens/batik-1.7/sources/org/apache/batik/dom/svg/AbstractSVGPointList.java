/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
PointsHandler	TokenNameIdentifier	 Points Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
PointsParser	TokenNameIdentifier	 Points Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGException	TokenNameIdentifier	 SVG Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGPoint	TokenNameIdentifier	 SVG Point
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGPointList	TokenNameIdentifier	 SVG Point List
;	TokenNameSEMICOLON	
/** * Abstract implementation of {@link SVGPointList}. * * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> * @version $Id: AbstractSVGPointList.java 479349 2006-11-26 11:54:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 Abstract implementation of {@link SVGPointList}. * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> @version $Id: AbstractSVGPointList.java 479349 2006-11-26 11:54:23Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGPointList	TokenNameIdentifier	 Abstract SVG Point List
extends	TokenNameextends	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
implements	TokenNameimplements	
SVGPointList	TokenNameIdentifier	 SVG Point List
{	TokenNameLBRACE	
/** * Separator for a point list. */	TokenNameCOMMENT_JAVADOC	 Separator for a point list. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SVG_POINT_LIST_SEPARATOR	TokenNameIdentifier	 SVG  POINT  LIST  SEPARATOR
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Return the separator between points in the list. */	TokenNameCOMMENT_JAVADOC	 Return the separator between points in the list. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getItemSeparator	TokenNameIdentifier	 get Item Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_POINT_LIST_SEPARATOR	TokenNameIdentifier	 SVG  POINT  LIST  SEPARATOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an SVGException when the checkItemType fails. * @return SVGException */	TokenNameCOMMENT_JAVADOC	 Create an SVGException when the checkItemType fails. @return SVGException 
protected	TokenNameprotected	
abstract	TokenNameabstract	
SVGException	TokenNameIdentifier	 SVG Exception
createSVGException	TokenNameIdentifier	 create SVG Exception
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <b>DOM</b>: Implements {@link SVGPointList#initialize(SVGPoint)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPointList#initialize(SVGPoint)}. 
public	TokenNamepublic	
SVGPoint	TokenNameIdentifier	 SVG Point
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
)	TokenNameRPAREN	
initializeImpl	TokenNameIdentifier	 initialize Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPointList#getItem(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPointList#getItem(int)}. 
public	TokenNamepublic	
SVGPoint	TokenNameIdentifier	 SVG Point
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
)	TokenNameRPAREN	
getItemImpl	TokenNameIdentifier	 get Item Impl
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGPointList#insertItemBefore(SVGPoint,int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPointList#insertItemBefore(SVGPoint,int)}. 
public	TokenNamepublic	
SVGPoint	TokenNameIdentifier	 SVG Point
insertItemBefore	TokenNameIdentifier	 insert Item Before
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
newItem	TokenNameIdentifier	 new Item
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
)	TokenNameRPAREN	
insertItemBeforeImpl	TokenNameIdentifier	 insert Item Before Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGPointList#replaceItem(SVGPoint,int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPointList#replaceItem(SVGPoint,int)}. 
public	TokenNamepublic	
SVGPoint	TokenNameIdentifier	 SVG Point
replaceItem	TokenNameIdentifier	 replace Item
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
newItem	TokenNameIdentifier	 new Item
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
)	TokenNameRPAREN	
replaceItemImpl	TokenNameIdentifier	 replace Item Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPointList#removeItem(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPointList#removeItem(int)}. 
public	TokenNamepublic	
SVGPoint	TokenNameIdentifier	 SVG Point
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
)	TokenNameRPAREN	
removeItemImpl	TokenNameIdentifier	 remove Item Impl
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPointList#appendItem(SVGPoint)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPointList#appendItem(SVGPoint)}. 
public	TokenNamepublic	
SVGPoint	TokenNameIdentifier	 SVG Point
appendItem	TokenNameIdentifier	 append Item
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
)	TokenNameRPAREN	
appendItemImpl	TokenNameIdentifier	 append Item Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link SVGItem} object from the given {@link SVGPoint}. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link SVGItem} object from the given {@link SVGPoint}. 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
createSVGItem	TokenNameIdentifier	 create SVG Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGPoint	TokenNameIdentifier	 SVG Point
point	TokenNameIdentifier	 point
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGPoint	TokenNameIdentifier	 SVG Point
)	TokenNameRPAREN	
newItem	TokenNameIdentifier	 new Item
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGPointItem	TokenNameIdentifier	 SVG Point Item
(	TokenNameLPAREN	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
point	TokenNameIdentifier	 point
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the 'points' attribute. * * @param value 'points' attribute value * @param handler point list handler */	TokenNameCOMMENT_JAVADOC	 Parses the 'points' attribute. * @param value 'points' attribute value @param handler point list handler 
protected	TokenNameprotected	
void	TokenNamevoid	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ListHandler	TokenNameIdentifier	 List Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
PointsParser	TokenNameIdentifier	 Points Parser
pointsParser	TokenNameIdentifier	 points Parser
=	TokenNameEQUAL	
new	TokenNamenew	
PointsParser	TokenNameIdentifier	 Points Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PointsListBuilder	TokenNameIdentifier	 Points List Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
PointsListBuilder	TokenNameIdentifier	 Points List Builder
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointsParser	TokenNameIdentifier	 points Parser
.	TokenNameDOT	
setPointsHandler	TokenNameIdentifier	 set Points Handler
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pointsParser	TokenNameIdentifier	 points Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Asserts that the given item is an {@link SVGPoint}. */	TokenNameCOMMENT_JAVADOC	 Asserts that the given item is an {@link SVGPoint}. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkItemType	TokenNameIdentifier	 check Item Type
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
instanceof	TokenNameinstanceof	
SVGPoint	TokenNameIdentifier	 SVG Point
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createSVGException	TokenNameIdentifier	 create SVG Exception
(	TokenNameLPAREN	
SVGException	TokenNameIdentifier	 SVG Exception
.	TokenNameDOT	
SVG_WRONG_TYPE_ERR	TokenNameIdentifier	 SVG  WRONG  TYPE  ERR
,	TokenNameCOMMA	
"expected.point"	TokenNameStringLiteral	expected.point
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An {@link SVGPoint} in the list. */	TokenNameCOMMENT_JAVADOC	 An {@link SVGPoint} in the list. 
protected	TokenNameprotected	
class	TokenNameclass	
SVGPointItem	TokenNameIdentifier	 SVG Point Item
extends	TokenNameextends	
AbstractSVGItem	TokenNameIdentifier	 Abstract SVG Item
implements	TokenNameimplements	
SVGPoint	TokenNameIdentifier	 SVG Point
{	TokenNameLBRACE	
/** * The x value. */	TokenNameCOMMENT_JAVADOC	 The x value. 
protected	TokenNameprotected	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The y value. */	TokenNameCOMMENT_JAVADOC	 The y value. 
protected	TokenNameprotected	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
/** * Creates a new SVGPointItem. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGPointItem. 
public	TokenNamepublic	
SVGPointItem	TokenNameIdentifier	 SVG Point Item
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a String representation of this SVGPoint. */	TokenNameCOMMENT_JAVADOC	 Return a String representation of this SVGPoint. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#getX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#getX()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#getY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#getY()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#setX(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#setX(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setX	TokenNameIdentifier	 set X
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#setY(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#setY(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setY	TokenNameIdentifier	 set Y
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGPoint#matrixTransform(SVGMatrix)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGPoint#matrixTransform(SVGMatrix)}. 
public	TokenNamepublic	
SVGPoint	TokenNameIdentifier	 SVG Point
matrixTransform	TokenNameIdentifier	 matrix Transform
(	TokenNameLPAREN	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGOMPoint	TokenNameIdentifier	 SVGOM Point
.	TokenNameDOT	
matrixTransform	TokenNameIdentifier	 matrix Transform
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Helper class to interface the {@link PointsParser} and the * {@link PointsHandler}. */	TokenNameCOMMENT_JAVADOC	 Helper class to interface the {@link PointsParser} and the {@link PointsHandler}. 
protected	TokenNameprotected	
class	TokenNameclass	
PointsListBuilder	TokenNameIdentifier	 Points List Builder
implements	TokenNameimplements	
PointsHandler	TokenNameIdentifier	 Points Handler
{	TokenNameLBRACE	
/** * The {@link ListHandler} to pass newly created {@link SVGPointItem} * objects to. */	TokenNameCOMMENT_JAVADOC	 The {@link ListHandler} to pass newly created {@link SVGPointItem} objects to. 
protected	TokenNameprotected	
ListHandler	TokenNameIdentifier	 List Handler
listHandler	TokenNameIdentifier	 list Handler
;	TokenNameSEMICOLON	
/** * Creates a new PointsListBuilder. */	TokenNameCOMMENT_JAVADOC	 Creates a new PointsListBuilder. 
public	TokenNamepublic	
PointsListBuilder	TokenNameIdentifier	 Points List Builder
(	TokenNameLPAREN	
ListHandler	TokenNameIdentifier	 List Handler
listHandler	TokenNameIdentifier	 list Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
listHandler	TokenNameIdentifier	 list Handler
=	TokenNameEQUAL	
listHandler	TokenNameIdentifier	 list Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PointsHandler#startPoints()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PointsHandler#startPoints()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startPoints	TokenNameIdentifier	 start Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
startList	TokenNameIdentifier	 start List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PointsHandler#point(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PointsHandler#point(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
point	TokenNameIdentifier	 point
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
new	TokenNamenew	
SVGPointItem	TokenNameIdentifier	 SVG Point Item
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PointsHandler#endPoints()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PointsHandler#endPoints()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endPoints	TokenNameIdentifier	 end Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
endList	TokenNameIdentifier	 end List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
