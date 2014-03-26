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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
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
TransformListHandler	TokenNameIdentifier	 Transform List Handler
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
TransformListParser	TokenNameIdentifier	 Transform List Parser
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
SVGTransform	TokenNameIdentifier	 SVG Transform
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
SVGTransformList	TokenNameIdentifier	 SVG Transform List
;	TokenNameSEMICOLON	
/** * This class is the implementation of * <code>SVGTransformList</code>. * * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> * @version $Id: AbstractSVGTransformList.java 498484 2007-01-21 23:13:31Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is the implementation of <code>SVGTransformList</code>. * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> @version $Id: AbstractSVGTransformList.java 498484 2007-01-21 23:13:31Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGTransformList	TokenNameIdentifier	 Abstract SVG Transform List
extends	TokenNameextends	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
implements	TokenNameimplements	
SVGTransformList	TokenNameIdentifier	 SVG Transform List
{	TokenNameLBRACE	
/** * Separator for a point list. */	TokenNameCOMMENT_JAVADOC	 Separator for a point list. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SVG_TRANSFORMATION_LIST_SEPARATOR	TokenNameIdentifier	 SVG  TRANSFORMATION  LIST  SEPARATOR
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Return the separator between transform in the list. */	TokenNameCOMMENT_JAVADOC	 Return the separator between transform in the list. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getItemSeparator	TokenNameIdentifier	 get Item Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_TRANSFORMATION_LIST_SEPARATOR	TokenNameIdentifier	 SVG  TRANSFORMATION  LIST  SEPARATOR
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
/** * <b>DOM</b>: Implements {@link SVGTransformList#initialize(SVGTransform)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransformList#initialize(SVGTransform)}. 
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
SVGTransform	TokenNameIdentifier	 SVG Transform
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGTransform	TokenNameIdentifier	 SVG Transform
)	TokenNameRPAREN	
initializeImpl	TokenNameIdentifier	 initialize Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransformList#getItem(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransformList#getItem(int)}. 
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
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
SVGTransform	TokenNameIdentifier	 SVG Transform
)	TokenNameRPAREN	
getItemImpl	TokenNameIdentifier	 get Item Impl
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGTransformList#insertItemBefore(SVGTransform,int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransformList#insertItemBefore(SVGTransform,int)}. 
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
insertItemBefore	TokenNameIdentifier	 insert Item Before
(	TokenNameLPAREN	
SVGTransform	TokenNameIdentifier	 SVG Transform
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
SVGTransform	TokenNameIdentifier	 SVG Transform
)	TokenNameRPAREN	
insertItemBeforeImpl	TokenNameIdentifier	 insert Item Before Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGTransformList#replaceItem(SVGTransform,int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransformList#replaceItem(SVGTransform,int)}. 
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
replaceItem	TokenNameIdentifier	 replace Item
(	TokenNameLPAREN	
SVGTransform	TokenNameIdentifier	 SVG Transform
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
SVGTransform	TokenNameIdentifier	 SVG Transform
)	TokenNameRPAREN	
replaceItemImpl	TokenNameIdentifier	 replace Item Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransformList#removeItem(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransformList#removeItem(int)}. 
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
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
SVGTransform	TokenNameIdentifier	 SVG Transform
)	TokenNameRPAREN	
removeItemImpl	TokenNameIdentifier	 remove Item Impl
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransformList#appendItem(SVGTransform)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransformList#appendItem(SVGTransform)}. 
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
appendItem	TokenNameIdentifier	 append Item
(	TokenNameLPAREN	
SVGTransform	TokenNameIdentifier	 SVG Transform
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGTransform	TokenNameIdentifier	 SVG Transform
)	TokenNameRPAREN	
appendItemImpl	TokenNameIdentifier	 append Item Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGTransformList#createSVGTransformFromMatrix(SVGMatrix)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransformList#createSVGTransformFromMatrix(SVGMatrix)}. 
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
createSVGTransformFromMatrix	TokenNameIdentifier	 create SVG Transform From Matrix
(	TokenNameLPAREN	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMTransform	TokenNameIdentifier	 SVGOM Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
setMatrix	TokenNameIdentifier	 set Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransformList#consolidate()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransformList#consolidate()}. 
public	TokenNamepublic	
SVGTransform	TokenNameIdentifier	 SVG Transform
consolidate	TokenNameIdentifier	 consolidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
)	TokenNameRPAREN	
getItemImpl	TokenNameIdentifier	 get Item Impl
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
)	TokenNameRPAREN	
getItemImpl	TokenNameIdentifier	 get Item Impl
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
affineTransform	TokenNameIdentifier	 affine Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
createSVGTransformFromMatrix	TokenNameIdentifier	 create SVG Transform From Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an {@link AffineTransform} that represents the same transform * as that specified by this transform list. */	TokenNameCOMMENT_JAVADOC	 Returns an {@link AffineTransform} that represents the same transform as that specified by this transform list. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
getNumberOfItems	TokenNameIdentifier	 get Number Of Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
)	TokenNameRPAREN	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
affineTransform	TokenNameIdentifier	 affine Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
at	TokenNameIdentifier	 at
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link SVGItem} object from the given {@link SVGTransform}. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link SVGItem} object from the given {@link SVGTransform}. 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
createSVGItem	TokenNameIdentifier	 create SVG Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGTransform	TokenNameIdentifier	 SVG Transform
)	TokenNameRPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse the attribute associated with this SVGTransformList. * * @param value the transform list attribute value * @param handler transform list handler */	TokenNameCOMMENT_JAVADOC	 Parse the attribute associated with this SVGTransformList. * @param value the transform list attribute value @param handler transform list handler 
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
TransformListParser	TokenNameIdentifier	 Transform List Parser
transformListParser	TokenNameIdentifier	 transform List Parser
=	TokenNameEQUAL	
new	TokenNamenew	
TransformListParser	TokenNameIdentifier	 Transform List Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformListBuilder	TokenNameIdentifier	 Transform List Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
TransformListBuilder	TokenNameIdentifier	 Transform List Builder
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformListParser	TokenNameIdentifier	 transform List Parser
.	TokenNameDOT	
setTransformListHandler	TokenNameIdentifier	 set Transform List Handler
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformListParser	TokenNameIdentifier	 transform List Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Asserts that the given item is an {@link SVGTransformList}. */	TokenNameCOMMENT_JAVADOC	 Asserts that the given item is an {@link SVGTransformList}. 
protected	TokenNameprotected	
void	TokenNamevoid	
checkItemType	TokenNameIdentifier	 check Item Type
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
instanceof	TokenNameinstanceof	
SVGTransform	TokenNameIdentifier	 SVG Transform
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
createSVGException	TokenNameIdentifier	 create SVG Exception
(	TokenNameLPAREN	
SVGException	TokenNameIdentifier	 SVG Exception
.	TokenNameDOT	
SVG_WRONG_TYPE_ERR	TokenNameIdentifier	 SVG  WRONG  TYPE  ERR
,	TokenNameCOMMA	
"expected.transform"	TokenNameStringLiteral	expected.transform
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An {@link SVGTransform} in the list. */	TokenNameCOMMENT_JAVADOC	 An {@link SVGTransform} in the list. 
protected	TokenNameprotected	
class	TokenNameclass	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
extends	TokenNameextends	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
implements	TokenNameimplements	
SVGItem	TokenNameIdentifier	 SVG Item
{	TokenNameLBRACE	
/** * Whether the transform value specifies only an x value, no y value. */	TokenNameCOMMENT_JAVADOC	 Whether the transform value specifies only an x value, no y value. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
xOnly	TokenNameIdentifier	 x Only
;	TokenNameSEMICOLON	
/** * Whether the rotation transform value specifies only an angle. */	TokenNameCOMMENT_JAVADOC	 Whether the rotation transform value specifies only an angle. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
angleOnly	TokenNameIdentifier	 angle Only
;	TokenNameSEMICOLON	
/** * List the item belongs to. */	TokenNameCOMMENT_JAVADOC	 List the item belongs to. 
protected	TokenNameprotected	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
/** * String representation of the item. * * This is a cached representation of the * item while it is not changed. */	TokenNameCOMMENT_JAVADOC	 String representation of the item. * This is a cached representation of the item while it is not changed. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
itemStringValue	TokenNameIdentifier	 item String Value
;	TokenNameSEMICOLON	
/** * Creates a new, uninitialized SVGTransformItem. */	TokenNameCOMMENT_JAVADOC	 Creates a new, uninitialized SVGTransformItem. 
protected	TokenNameprotected	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGTransformItem from the given {@link SVGTransform}. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGTransformItem from the given {@link SVGTransform}. 
protected	TokenNameprotected	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
SVGTransform	TokenNameIdentifier	 SVG Transform
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assign	TokenNameIdentifier	 assign
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Notifies the parent list that this item has changed. This also * discards the cached representation of the item. */	TokenNameCOMMENT_JAVADOC	 Notifies the parent list that this item has changed. This also discards the cached representation of the item. 
protected	TokenNameprotected	
void	TokenNamevoid	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
itemStringValue	TokenNameIdentifier	 item String Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
itemChanged	TokenNameIdentifier	 item Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Assigns a parent list to this item. * @param list The list the item belongs. */	TokenNameCOMMENT_JAVADOC	 Assigns a parent list to this item. @param list The list the item belongs. 
public	TokenNamepublic	
void	TokenNamevoid	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parent list of this item. */	TokenNameCOMMENT_JAVADOC	 Returns the parent list of this item. 
public	TokenNamepublic	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the cached representation of the item if valid, otherwise * recomputes the String representation of the item. */	TokenNameCOMMENT_JAVADOC	 Returns the cached representation of the item if valid, otherwise recomputes the String representation of the item. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
itemStringValue	TokenNameIdentifier	 item String Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
itemStringValue	TokenNameIdentifier	 item String Value
=	TokenNameEQUAL	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
itemStringValue	TokenNameIdentifier	 item String Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the values from the given {@link SVGTransform} into this * {@link SVGTransformItem}. */	TokenNameCOMMENT_JAVADOC	 Copies the values from the given {@link SVGTransform} into this {@link SVGTransformItem}. 
public	TokenNamepublic	
void	TokenNamevoid	
assign	TokenNameIdentifier	 assign
(	TokenNameLPAREN	
SVGTransform	TokenNameIdentifier	 SVG Transform
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getD	TokenNameIdentifier	 get D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
angleOnly	TokenNameIdentifier	 angle Only
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getA	TokenNameIdentifier	 get A
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getE	TokenNameIdentifier	 get E
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
matrix	TokenNameIdentifier	 matrix
.	TokenNameDOT	
getF	TokenNameIdentifier	 get F
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
instanceof	TokenNameinstanceof	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
internal	TokenNameIdentifier	 internal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractSVGTransform	TokenNameIdentifier	 Abstract SVG Transform
)	TokenNameRPAREN	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
internal	TokenNameIdentifier	 internal
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// XXX Should extract the angle, x and y from the 	TokenNameCOMMENT_LINE	XXX Should extract the angle, x and y from the 
// matrix. 	TokenNameCOMMENT_LINE	matrix. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
:	TokenNameCOLON	
setSkewX	TokenNameIdentifier	 set Skew X
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
:	TokenNameCOLON	
setSkewY	TokenNameIdentifier	 set Skew Y
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getAngle	TokenNameIdentifier	 get Angle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
:	TokenNameCOLON	
setMatrix	TokenNameIdentifier	 set Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the transform to be an x translation. */	TokenNameCOMMENT_JAVADOC	 Sets the transform to be an x translation. 
protected	TokenNameprotected	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xOnly	TokenNameIdentifier	 x Only
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the transform to be rotation. */	TokenNameCOMMENT_JAVADOC	 Sets the transform to be rotation. 
protected	TokenNameprotected	
void	TokenNamevoid	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
angleOnly	TokenNameIdentifier	 angle Only
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the transform to be an x scale. */	TokenNameCOMMENT_JAVADOC	 Sets the transform to be an x scale. 
protected	TokenNameprotected	
void	TokenNamevoid	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xOnly	TokenNameIdentifier	 x Only
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the transform to be a matrix transform. */	TokenNameCOMMENT_JAVADOC	 Sets the transform to be a matrix transform. 
protected	TokenNameprotected	
void	TokenNamevoid	
matrix	TokenNameIdentifier	 matrix
(	TokenNameLPAREN	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
float	TokenNamefloat	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
float	TokenNamefloat	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setMatrix	TokenNameIdentifier	 set Matrix
(	TokenNameLPAREN	
new	TokenNamenew	
SVGOMMatrix	TokenNameIdentifier	 SVGOM Matrix
(	TokenNameLPAREN	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setMatrix(SVGMatrix)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setMatrix(SVGMatrix)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setMatrix	TokenNameIdentifier	 set Matrix
(	TokenNameLPAREN	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setMatrix	TokenNameIdentifier	 set Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setTranslate(float,float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setTranslate(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
float	TokenNamefloat	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setScale(float,float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setScale(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
float	TokenNamefloat	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGTransform#setRotate(float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setRotate(float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
,	TokenNameCOMMA	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
float	TokenNamefloat	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
,	TokenNameCOMMA	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setSkewX(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setSkewX(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setSkewX	TokenNameIdentifier	 set Skew X
(	TokenNameLPAREN	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setSkewX	TokenNameIdentifier	 set Skew X
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGTransform#setSkewY(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGTransform#setSkewY(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setSkewY	TokenNameIdentifier	 set Skew Y
(	TokenNameLPAREN	
float	TokenNamefloat	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setSkewY	TokenNameIdentifier	 set Skew Y
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the {@link SVGMatrix} used to store the transform. */	TokenNameCOMMENT_JAVADOC	 Creates the {@link SVGMatrix} used to store the transform. 
protected	TokenNameprotected	
SVGMatrix	TokenNameIdentifier	 SVG Matrix
createMatrix	TokenNameIdentifier	 create Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AbstractSVGMatrix	TokenNameIdentifier	 Abstract SVG Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
getAffineTransform	TokenNameIdentifier	 get Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
affineTransform	TokenNameIdentifier	 affine Transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setA	TokenNameIdentifier	 set A
(	TokenNameLPAREN	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setA	TokenNameIdentifier	 set A
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setB	TokenNameIdentifier	 set B
(	TokenNameLPAREN	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setB	TokenNameIdentifier	 set B
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setC	TokenNameIdentifier	 set C
(	TokenNameLPAREN	
float	TokenNamefloat	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setC	TokenNameIdentifier	 set C
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setD	TokenNameIdentifier	 set D
(	TokenNameLPAREN	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setD	TokenNameIdentifier	 set D
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setE	TokenNameIdentifier	 set E
(	TokenNameLPAREN	
float	TokenNamefloat	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setE	TokenNameIdentifier	 set E
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setF	TokenNameIdentifier	 set F
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setF	TokenNameIdentifier	 set F
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the string representation of this transform. */	TokenNameCOMMENT_JAVADOC	 Returns the string representation of this transform. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_TRANSLATE	TokenNameIdentifier	 SVG  TRANSFORM  TRANSLATE
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"translate("	TokenNameStringLiteral	translate(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
xOnly	TokenNameIdentifier	 x Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_ROTATE	TokenNameIdentifier	 SVG  TRANSFORM  ROTATE
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"rotate("	TokenNameStringLiteral	rotate(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
angleOnly	TokenNameIdentifier	 angle Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SCALE	TokenNameIdentifier	 SVG  TRANSFORM  SCALE
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"scale("	TokenNameStringLiteral	scale(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
xOnly	TokenNameIdentifier	 x Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWX	TokenNameIdentifier	 SVG  TRANSFORM  SKEWX
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"skewX("	TokenNameStringLiteral	skewX(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_SKEWY	TokenNameIdentifier	 SVG  TRANSFORM  SKEWY
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"skewY("	TokenNameStringLiteral	skewY(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
angle	TokenNameIdentifier	 angle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGTransform	TokenNameIdentifier	 SVG Transform
.	TokenNameDOT	
SVG_TRANSFORM_MATRIX	TokenNameIdentifier	 SVG  TRANSFORM  MATRIX
:	TokenNameCOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"matrix("	TokenNameStringLiteral	matrix(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
affineTransform	TokenNameIdentifier	 affine Transform
.	TokenNameDOT	
getMatrix	TokenNameIdentifier	 get Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Helper class to interface the {@link TransformListParser} and the * {@link ListHandler}. */	TokenNameCOMMENT_JAVADOC	 Helper class to interface the {@link TransformListParser} and the {@link ListHandler}. 
protected	TokenNameprotected	
class	TokenNameclass	
TransformListBuilder	TokenNameIdentifier	 Transform List Builder
implements	TokenNameimplements	
TransformListHandler	TokenNameIdentifier	 Transform List Handler
{	TokenNameLBRACE	
/** * The {@link ListHandler} to pass newly created * {@link SVGTransformItem} objects to. */	TokenNameCOMMENT_JAVADOC	 The {@link ListHandler} to pass newly created {@link SVGTransformItem} objects to. 
protected	TokenNameprotected	
ListHandler	TokenNameIdentifier	 List Handler
listHandler	TokenNameIdentifier	 list Handler
;	TokenNameSEMICOLON	
/** * Creates a new TransformListBuilder. */	TokenNameCOMMENT_JAVADOC	 Creates a new TransformListBuilder. 
public	TokenNamepublic	
TransformListBuilder	TokenNameIdentifier	 Transform List Builder
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
/** * Implements {@link TransformListHandler#startTransformList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#startTransformList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startTransformList	TokenNameIdentifier	 start Transform List
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
/** * Implements {@link * TransformListHandler#matrix(float,float,float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#matrix(float,float,float,float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
matrix	TokenNameIdentifier	 matrix
(	TokenNameLPAREN	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
float	TokenNamefloat	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
float	TokenNamefloat	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
float	TokenNamefloat	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
float	TokenNamefloat	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
matrix	TokenNameIdentifier	 matrix
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#rotate(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#rotate(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#rotate(float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#rotate(float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
float	TokenNamefloat	
theta	TokenNameIdentifier	 theta
,	TokenNameCOMMA	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
float	TokenNamefloat	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setRotate	TokenNameIdentifier	 set Rotate
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
,	TokenNameCOMMA	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#translate(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#translate(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#translate(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#translate(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
float	TokenNamefloat	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
float	TokenNamefloat	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setTranslate	TokenNameIdentifier	 set Translate
(	TokenNameLPAREN	
tx	TokenNameIdentifier	 tx
,	TokenNameCOMMA	
ty	TokenNameIdentifier	 ty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#scale(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#scale(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#scale(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#scale(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
scale	TokenNameIdentifier	 scale
(	TokenNameLPAREN	
float	TokenNamefloat	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
float	TokenNamefloat	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
,	TokenNameCOMMA	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#skewX(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#skewX(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
skewX	TokenNameIdentifier	 skew X
(	TokenNameLPAREN	
float	TokenNamefloat	
skx	TokenNameIdentifier	 skx
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setSkewX	TokenNameIdentifier	 set Skew X
(	TokenNameLPAREN	
skx	TokenNameIdentifier	 skx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#skewY(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#skewY(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
skewY	TokenNameIdentifier	 skew Y
(	TokenNameLPAREN	
float	TokenNamefloat	
sky	TokenNameIdentifier	 sky
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTransformItem	TokenNameIdentifier	 SVG Transform Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setSkewY	TokenNameIdentifier	 set Skew Y
(	TokenNameLPAREN	
sky	TokenNameIdentifier	 sky
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link TransformListHandler#endTransformList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link TransformListHandler#endTransformList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endTransformList	TokenNameIdentifier	 end Transform List
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
