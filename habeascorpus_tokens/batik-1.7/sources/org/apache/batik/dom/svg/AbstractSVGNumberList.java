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
NumberListHandler	TokenNameIdentifier	 Number List Handler
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
NumberListParser	TokenNameIdentifier	 Number List Parser
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
Element	TokenNameIdentifier	 Element
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
SVGNumber	TokenNameIdentifier	 SVG Number
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
SVGNumberList	TokenNameIdentifier	 SVG Number List
;	TokenNameSEMICOLON	
/** * This class is the implementation of {@link SVGNumberList}. * * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> * @version $Id: AbstractSVGNumberList.java 479349 2006-11-26 11:54:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class is the implementation of {@link SVGNumberList}. * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> @version $Id: AbstractSVGNumberList.java 479349 2006-11-26 11:54:23Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGNumberList	TokenNameIdentifier	 Abstract SVG Number List
extends	TokenNameextends	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
implements	TokenNameimplements	
SVGNumberList	TokenNameIdentifier	 SVG Number List
{	TokenNameLBRACE	
/** * Separator for a length list. */	TokenNameCOMMENT_JAVADOC	 Separator for a length list. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SVG_NUMBER_LIST_SEPARATOR	TokenNameIdentifier	 SVG  NUMBER  LIST  SEPARATOR
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** * Return the separator between values in the list. */	TokenNameCOMMENT_JAVADOC	 Return the separator between values in the list. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getItemSeparator	TokenNameIdentifier	 get Item Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_NUMBER_LIST_SEPARATOR	TokenNameIdentifier	 SVG  NUMBER  LIST  SEPARATOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an SVGException when the {@link #checkItemType(Object)} fails. */	TokenNameCOMMENT_JAVADOC	 Create an SVGException when the {@link #checkItemType(Object)} fails. 
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
/** * Returns the element associated with this SVGNumberList. */	TokenNameCOMMENT_JAVADOC	 Returns the element associated with this SVGNumberList. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
Element	TokenNameIdentifier	 Element
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new SVGNumberList. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGNumberList. 
protected	TokenNameprotected	
AbstractSVGNumberList	TokenNameIdentifier	 Abstract SVG Number List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGNumberList#initialize(SVGNumber)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGNumberList#initialize(SVGNumber)}. 
public	TokenNamepublic	
SVGNumber	TokenNameIdentifier	 SVG Number
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
SVGNumber	TokenNameIdentifier	 SVG Number
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGNumber	TokenNameIdentifier	 SVG Number
)	TokenNameRPAREN	
initializeImpl	TokenNameIdentifier	 initialize Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGNumberList#getItem(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGNumberList#getItem(int)}. 
public	TokenNamepublic	
SVGNumber	TokenNameIdentifier	 SVG Number
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
SVGNumber	TokenNameIdentifier	 SVG Number
)	TokenNameRPAREN	
getItemImpl	TokenNameIdentifier	 get Item Impl
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGNumberList#insertItemBefore(SVGNumber,int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGNumberList#insertItemBefore(SVGNumber,int)}. 
public	TokenNamepublic	
SVGNumber	TokenNameIdentifier	 SVG Number
insertItemBefore	TokenNameIdentifier	 insert Item Before
(	TokenNameLPAREN	
SVGNumber	TokenNameIdentifier	 SVG Number
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
SVGNumber	TokenNameIdentifier	 SVG Number
)	TokenNameRPAREN	
insertItemBeforeImpl	TokenNameIdentifier	 insert Item Before Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGNumberList#replaceItem(SVGNumber,int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGNumberList#replaceItem(SVGNumber,int)}. 
public	TokenNamepublic	
SVGNumber	TokenNameIdentifier	 SVG Number
replaceItem	TokenNameIdentifier	 replace Item
(	TokenNameLPAREN	
SVGNumber	TokenNameIdentifier	 SVG Number
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
SVGNumber	TokenNameIdentifier	 SVG Number
)	TokenNameRPAREN	
replaceItemImpl	TokenNameIdentifier	 replace Item Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGNumberList#removeItem(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGNumberList#removeItem(int)}. 
public	TokenNamepublic	
SVGNumber	TokenNameIdentifier	 SVG Number
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
SVGNumber	TokenNameIdentifier	 SVG Number
)	TokenNameRPAREN	
removeItemImpl	TokenNameIdentifier	 remove Item Impl
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGNumberList#appendItem(SVGNumber)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGNumberList#appendItem(SVGNumber)}. 
public	TokenNamepublic	
SVGNumber	TokenNameIdentifier	 SVG Number
appendItem	TokenNameIdentifier	 append Item
(	TokenNameLPAREN	
SVGNumber	TokenNameIdentifier	 SVG Number
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGNumber	TokenNameIdentifier	 SVG Number
)	TokenNameRPAREN	
appendItemImpl	TokenNameIdentifier	 append Item Impl
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link SVGNumberItem} from the given {@link SVGNumber}. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link SVGNumberItem} from the given {@link SVGNumber}. 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
createSVGItem	TokenNameIdentifier	 create SVG Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGNumber	TokenNameIdentifier	 SVG Number
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGNumber	TokenNameIdentifier	 SVG Number
)	TokenNameRPAREN	
newItem	TokenNameIdentifier	 new Item
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SVGNumberItem	TokenNameIdentifier	 SVG Number Item
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse the attribute associated with this SVGNumberList. * @param value attribute value * @param handler list handler */	TokenNameCOMMENT_JAVADOC	 Parse the attribute associated with this SVGNumberList. @param value attribute value @param handler list handler 
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
NumberListParser	TokenNameIdentifier	 Number List Parser
NumberListParser	TokenNameIdentifier	 Number List Parser
=	TokenNameEQUAL	
new	TokenNamenew	
NumberListParser	TokenNameIdentifier	 Number List Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumberListBuilder	TokenNameIdentifier	 Number List Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
NumberListBuilder	TokenNameIdentifier	 Number List Builder
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumberListParser	TokenNameIdentifier	 Number List Parser
.	TokenNameDOT	
setNumberListHandler	TokenNameIdentifier	 set Number List Handler
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumberListParser	TokenNameIdentifier	 Number List Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Asserts that the given item object is an {@link SVGNumber}. */	TokenNameCOMMENT_JAVADOC	 Asserts that the given item object is an {@link SVGNumber}. 
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
SVGNumber	TokenNameIdentifier	 SVG Number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XXX Fix error code. 	TokenNameCOMMENT_LINE	XXX Fix error code. 
createSVGException	TokenNameIdentifier	 create SVG Exception
(	TokenNameLPAREN	
SVGException	TokenNameIdentifier	 SVG Exception
.	TokenNameDOT	
SVG_WRONG_TYPE_ERR	TokenNameIdentifier	 SVG  WRONG  TYPE  ERR
,	TokenNameCOMMA	
"expected SVGNumber"	TokenNameStringLiteral	expected SVGNumber
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Representation of the item SVGNumber. */	TokenNameCOMMENT_JAVADOC	 Representation of the item SVGNumber. 
protected	TokenNameprotected	
class	TokenNameclass	
SVGNumberItem	TokenNameIdentifier	 SVG Number Item
extends	TokenNameextends	
AbstractSVGNumber	TokenNameIdentifier	 Abstract SVG Number
implements	TokenNameimplements	
SVGItem	TokenNameIdentifier	 SVG Item
{	TokenNameLBRACE	
/** * The {@link SVGNumberList} this item belongs to. */	TokenNameCOMMENT_JAVADOC	 The {@link SVGNumberList} this item belongs to. 
protected	TokenNameprotected	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
parentList	TokenNameIdentifier	 parent List
;	TokenNameSEMICOLON	
/** * Creates a new SVGNumberItem. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGNumberItem. 
public	TokenNamepublic	
SVGNumberItem	TokenNameIdentifier	 SVG Number Item
(	TokenNameLPAREN	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a String representation of the number. */	TokenNameCOMMENT_JAVADOC	 Returns a String representation of the number. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Associates this item to the given {@link SVGNumberList}. */	TokenNameCOMMENT_JAVADOC	 Associates this item to the given {@link SVGNumberList}. 
public	TokenNamepublic	
void	TokenNamevoid	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentList	TokenNameIdentifier	 parent List
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the list the item belongs to. */	TokenNameCOMMENT_JAVADOC	 Returns the list the item belongs to. 
public	TokenNamepublic	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parentList	TokenNameIdentifier	 parent List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Notifies the parent {@link SVGNumberList} that this item's value * has changed. */	TokenNameCOMMENT_JAVADOC	 Notifies the parent {@link SVGNumberList} that this item's value has changed. 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parentList	TokenNameIdentifier	 parent List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentList	TokenNameIdentifier	 parent List
.	TokenNameDOT	
itemChanged	TokenNameIdentifier	 item Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Helper class to interface the {@link NumberListParser} and the * {@link NumberListHandler}. */	TokenNameCOMMENT_JAVADOC	 Helper class to interface the {@link NumberListParser} and the {@link NumberListHandler}. 
protected	TokenNameprotected	
class	TokenNameclass	
NumberListBuilder	TokenNameIdentifier	 Number List Builder
implements	TokenNameimplements	
NumberListHandler	TokenNameIdentifier	 Number List Handler
{	TokenNameLBRACE	
/** * The ListHandler to notify of parsed numbers. */	TokenNameCOMMENT_JAVADOC	 The ListHandler to notify of parsed numbers. 
protected	TokenNameprotected	
ListHandler	TokenNameIdentifier	 List Handler
listHandler	TokenNameIdentifier	 list Handler
;	TokenNameSEMICOLON	
/** * The number just parsed. */	TokenNameCOMMENT_JAVADOC	 The number just parsed. 
protected	TokenNameprotected	
float	TokenNamefloat	
currentValue	TokenNameIdentifier	 current Value
;	TokenNameSEMICOLON	
/** * Creates a new NumberListBuilder. */	TokenNameCOMMENT_JAVADOC	 Creates a new NumberListBuilder. 
public	TokenNamepublic	
NumberListBuilder	TokenNameIdentifier	 Number List Builder
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
/** * Implements {@link NumberListHandler#startNumberList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#startNumberList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startNumberList	TokenNameIdentifier	 start Number List
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
/** * Implements {@link NumberListHandler#startNumber()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#startNumber()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startNumber	TokenNameIdentifier	 start Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentValue	TokenNameIdentifier	 current Value
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link NumberListHandler#numberValue(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#numberValue(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
numberValue	TokenNameIdentifier	 number Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
currentValue	TokenNameIdentifier	 current Value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link NumberListHandler#endNumber()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#endNumber()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endNumber	TokenNameIdentifier	 end Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
new	TokenNamenew	
SVGNumberItem	TokenNameIdentifier	 SVG Number Item
(	TokenNameLPAREN	
currentValue	TokenNameIdentifier	 current Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link NumberListHandler#endNumberList()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link NumberListHandler#endNumberList()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endNumberList	TokenNameIdentifier	 end Number List
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
