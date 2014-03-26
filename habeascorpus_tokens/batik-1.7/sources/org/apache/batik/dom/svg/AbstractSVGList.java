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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGException	TokenNameIdentifier	 SVG Exception
;	TokenNameSEMICOLON	
/** * This class is a base implementation for a live * list representation of SVG attributes. * <p> * This class provides support for an SVG list representation of an * attribute. It implements basic list functionality that is common to all * of the <code>SVG*List</code> interfaces. * </p> * <p> * For a specific attribute, it requires an {@link #getValueAsString() * attribute value}, a {@link #doParse(String,ListHandler) parser}, * and a method to {@link #createSVGItem(Object) create items}. * </p> * <p> * Whenever the attribute changes outside of the control of the list, this * list must be {@link #invalidate invalidated}. * </p> * * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> * @version $Id: AbstractSVGList.java 511565 2007-02-25 18:04:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class is a base implementation for a live list representation of SVG attributes. <p> This class provides support for an SVG list representation of an attribute. It implements basic list functionality that is common to all of the <code>SVG*List</code> interfaces. </p> <p> For a specific attribute, it requires an {@link #getValueAsString() attribute value}, a {@link #doParse(String,ListHandler) parser}, and a method to {@link #createSVGItem(Object) create items}. </p> <p> Whenever the attribute changes outside of the control of the list, this list must be {@link #invalidate invalidated}. </p> * @author <a href="mailto:nicolas.socheleau@bitflash.com">Nicolas Socheleau</a> @version $Id: AbstractSVGList.java 511565 2007-02-25 18:04:46Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
{	TokenNameLBRACE	
/** * Whether this list is valid. */	TokenNameCOMMENT_JAVADOC	 Whether this list is valid. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
;	TokenNameSEMICOLON	
/** * The list of items. */	TokenNameCOMMENT_JAVADOC	 The list of items. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
itemList	TokenNameIdentifier	 item List
;	TokenNameSEMICOLON	
/** * Returns the separator string to use when constructing a string * representation of the entire list. */	TokenNameCOMMENT_JAVADOC	 Returns the separator string to use when constructing a string representation of the entire list. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getItemSeparator	TokenNameIdentifier	 get Item Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates an {@link SVGItem} object that has the same values as those * in the specified SVG object. * * @param newItem the SVG object * @return the newly created {@link SVGItem} object */	TokenNameCOMMENT_JAVADOC	 Creates an {@link SVGItem} object that has the same values as those in the specified SVG object. * @param newItem the SVG object @return the newly created {@link SVGItem} object 
protected	TokenNameprotected	
abstract	TokenNameabstract	
SVGItem	TokenNameIdentifier	 SVG Item
createSVGItem	TokenNameIdentifier	 create SVG Item
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parses the given attribute value and informs the specified * {@link ListHandler} of the parsed list items. * * @param value the attribute value to be parsed * @param builder the object to be informed of the parsed list items */	TokenNameCOMMENT_JAVADOC	 Parses the given attribute value and informs the specified {@link ListHandler} of the parsed list items. * @param value the attribute value to be parsed @param builder the object to be informed of the parsed list items 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ListHandler	TokenNameIdentifier	 List Handler
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
/** * Asserts that the given object is an appropriate SVG object for this list. */	TokenNameCOMMENT_JAVADOC	 Asserts that the given object is an appropriate SVG object for this list. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
checkItemType	TokenNameIdentifier	 check Item Type
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
SVGException	TokenNameIdentifier	 SVG Exception
;	TokenNameSEMICOLON	
/** * Returns the value of the DOM attribute containing the list. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the DOM attribute containing the list. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the DOM attribute value containing the number list. * @param value the String representation of the list, or null * if the list contains no items */	TokenNameCOMMENT_JAVADOC	 Sets the DOM attribute value containing the number list. @param value the String representation of the list, or null if the list contains no items 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
setAttributeValue	TokenNameIdentifier	 set Attribute Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a DOM Exception. */	TokenNameCOMMENT_JAVADOC	 Create a DOM Exception. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
DOMException	TokenNameIdentifier	 DOM Exception
createDOMException	TokenNameIdentifier	 create DOM Exception
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
/** * Returns the number of items in the list. */	TokenNameCOMMENT_JAVADOC	 Returns the number of items in the list. 
public	TokenNamepublic	
int	TokenNameint	
getNumberOfItems	TokenNameIdentifier	 get Number Of Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
itemList	TokenNameIdentifier	 item List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes all items from the list. * @exception DOMException NO_MODIFICATION_ALLOWED_ERR: * Raised when the list cannot be modified. */	TokenNameCOMMENT_JAVADOC	 Removes all items from the list. @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the list cannot be modified. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
itemList	TokenNameIdentifier	 item List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remove all the items. 	TokenNameCOMMENT_LINE	Remove all the items. 
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
itemList	TokenNameIdentifier	 item List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the DOM attribute. 	TokenNameCOMMENT_LINE	Set the DOM attribute. 
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Removes all items from the list and adds the specified item to * the list. * * @param newItem the item which should become the only member of the list. * @return the item being inserted into the list. * @exception DOMException NO_MODIFICATION_ALLOWED_ERR: * Raised when the list cannot be modified. * @exception SVGException SVG_WRONG_TYPE_ERR: * Raised if parameter newItem is the wrong type of object for the given * list. */	TokenNameCOMMENT_JAVADOC	 Removes all items from the list and adds the specified item to the list. * @param newItem the item which should become the only member of the list. @return the item being inserted into the list. @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the list cannot be modified. @exception SVGException SVG_WRONG_TYPE_ERR: Raised if parameter newItem is the wrong type of object for the given list. 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
initializeImpl	TokenNameIdentifier	 initialize Impl
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
checkItemType	TokenNameIdentifier	 check Item Type
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Clear the list, creating it if it doesn't exist yet. 	TokenNameCOMMENT_LINE	Clear the list, creating it if it doesn't exist yet. 
if	TokenNameif	
(	TokenNameLPAREN	
itemList	TokenNameIdentifier	 item List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
itemList	TokenNameIdentifier	 item List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
itemList	TokenNameIdentifier	 item List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
removeIfNeeded	TokenNameIdentifier	 remove If Needed
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the item. 	TokenNameCOMMENT_LINE	Add the item. 
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the item's parent. 	TokenNameCOMMENT_LINE	Set the item's parent. 
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Update the DOM attribute. 	TokenNameCOMMENT_LINE	Update the DOM attribute. 
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the item from the list at the specified index. * * @param index The index of the item from the list which is to be returned. * The first item is number 0. * @return The selected item. * @exception DOMException INDEX_SIZE_ERR: * Raised if the index number is negative or greater than or equal to * <code>numberOfItems</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the item from the list at the specified index. * @param index The index of the item from the list which is to be returned. The first item is number 0. @return The selected item. @exception DOMException INDEX_SIZE_ERR: Raised if the index number is negative or greater than or equal to <code>numberOfItems</code>. 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
getItemImpl	TokenNameIdentifier	 get Item Impl
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
itemList	TokenNameIdentifier	 item List
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
"index.out.of.bounds"	TokenNameStringLiteral	index.out.of.bounds
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
)	TokenNameRPAREN	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts a new item into the list at the specified position. * <p> * The first item is number 0. If <code>newItem</code> is already in a * list, it is removed from its previous list before it is inserted into * this list. * </p> * * @param newItem The item which is to be inserted * into the list. * @param index The index of the item before which * the new item is to be inserted. The first item * is number 0. If the index is equal to 0, then * the new item is inserted at the front of the * list. If the index is greater than or equal to * <code>numberOfItems</code>, then the new item is appended * to the end of the list. * @return The inserted item. * @exception DOMException NO_MODIFICATION_ALLOWED_ERR: * Raised when the list cannot be modified. * @exception SVGException SVG_WRONG_TYPE_ERR: * Raised if parameter <code>newItem</code> is the wrong type of * object for the given list. */	TokenNameCOMMENT_JAVADOC	 Inserts a new item into the list at the specified position. <p> The first item is number 0. If <code>newItem</code> is already in a list, it is removed from its previous list before it is inserted into this list. </p> * @param newItem The item which is to be inserted into the list. @param index The index of the item before which the new item is to be inserted. The first item is number 0. If the index is equal to 0, then the new item is inserted at the front of the list. If the index is greater than or equal to <code>numberOfItems</code>, then the new item is appended to the end of the list. @return The inserted item. @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the list cannot be modified. @exception SVGException SVG_WRONG_TYPE_ERR: Raised if parameter <code>newItem</code> is the wrong type of object for the given list. 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
insertItemBeforeImpl	TokenNameIdentifier	 insert Item Before Impl
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
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
checkItemType	TokenNameIdentifier	 check Item Type
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
"index.out.of.bounds"	TokenNameStringLiteral	index.out.of.bounds
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
removeIfNeeded	TokenNameIdentifier	 remove If Needed
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Insert the item at its position. 	TokenNameCOMMENT_LINE	Insert the item at its position. 
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the item's parent. 	TokenNameCOMMENT_LINE	Set the item's parent. 
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reset the DOM attribute. 	TokenNameCOMMENT_LINE	Reset the DOM attribute. 
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replaces an existing item in the list with a new item. * <p> * If <code>newItem</code> is already in a list, it is removed from its * previous list before it is inserted into this list. * </p> * * @param newItem The item which is to be inserted * into the list. * @param index The index of the item which is to * be replaced. The first item is number 0. * @return The inserted item. * @exception DOMException NO_MODIFICATION_ALLOWED_ERR: * Raised when the list cannot be modified. * @exception DOMException INDEX_SIZE_ERR: * Raised if the index number is negative or greater * than or equal to <code>numberOfItems</code>. * @exception SVGException SVG_WRONG_TYPE_ERR: * Raised if parameter newItem is the wrong type * of object for the given list. */	TokenNameCOMMENT_JAVADOC	 Replaces an existing item in the list with a new item. <p> If <code>newItem</code> is already in a list, it is removed from its previous list before it is inserted into this list. </p> * @param newItem The item which is to be inserted into the list. @param index The index of the item which is to be replaced. The first item is number 0. @return The inserted item. @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the list cannot be modified. @exception DOMException INDEX_SIZE_ERR: Raised if the index number is negative or greater than or equal to <code>numberOfItems</code>. @exception SVGException SVG_WRONG_TYPE_ERR: Raised if parameter newItem is the wrong type of object for the given list. 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
replaceItemImpl	TokenNameIdentifier	 replace Item Impl
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
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
checkItemType	TokenNameIdentifier	 check Item Type
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
"index.out.of.bounds"	TokenNameStringLiteral	index.out.of.bounds
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
removeIfNeeded	TokenNameIdentifier	 remove If Needed
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Replace the item in the list. 	TokenNameCOMMENT_LINE	Replace the item in the list. 
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the item's parent. 	TokenNameCOMMENT_LINE	Set the item's parent. 
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reset the DOM attribute. 	TokenNameCOMMENT_LINE	Reset the DOM attribute. 
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes an existing item from the list. * * @param index The index of the item which * is to be removed. The first item is number 0. * @return The removed item. * @exception DOMException NO_MODIFICATION_ALLOWED_ERR: * Raised when the list cannot be modified. * @exception DOMException INDEX_SIZE_ERR: * Raised if the index number is negative or greater * than or equal to <code>numberOfItems</code>. */	TokenNameCOMMENT_JAVADOC	 Removes an existing item from the list. * @param index The index of the item which is to be removed. The first item is number 0. @return The removed item. @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the list cannot be modified. @exception DOMException INDEX_SIZE_ERR: Raised if the index number is negative or greater than or equal to <code>numberOfItems</code>. 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
removeItemImpl	TokenNameIdentifier	 remove Item Impl
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INDEX_SIZE_ERR	TokenNameIdentifier	 INDEX  SIZE  ERR
,	TokenNameCOMMA	
"index.out.of.bounds"	TokenNameStringLiteral	index.out.of.bounds
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
)	TokenNameRPAREN	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the item to have no parent list. 	TokenNameCOMMENT_LINE	Set the item to have no parent list. 
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reset the DOM attribute. 	TokenNameCOMMENT_LINE	Reset the DOM attribute. 
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts a new item at the end of the list. * If newItem is already in a list, it is removed from its previous list * before it is inserted into this list. * * @param newItem The item which is to be inserted into the list. The * first item is number 0. * @return The inserted item. * @exception DOMException NO_MODIFICATION_ALLOWED_ERR: * Raised when the list cannot be modified. * @exception SVGException SVG_WRONG_TYPE_ERR: * Raised if parameter newItem is the wrong type of object for the given * list. */	TokenNameCOMMENT_JAVADOC	 Inserts a new item at the end of the list. If newItem is already in a list, it is removed from its previous list before it is inserted into this list. * @param newItem The item which is to be inserted into the list. The first item is number 0. @return The inserted item. @exception DOMException NO_MODIFICATION_ALLOWED_ERR: Raised when the list cannot be modified. @exception SVGException SVG_WRONG_TYPE_ERR: Raised if parameter newItem is the wrong type of object for the given list. 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
appendItemImpl	TokenNameIdentifier	 append Item Impl
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
,	TokenNameCOMMA	
SVGException	TokenNameIdentifier	 SVG Exception
{	TokenNameLBRACE	
checkItemType	TokenNameIdentifier	 check Item Type
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
removeIfNeeded	TokenNameIdentifier	 remove If Needed
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the item's parent. 	TokenNameCOMMENT_LINE	Set the item's parent. 
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the specified object from its parent list if it is an item, or * creates a new item if the specified object is not an item. * * @param newItem an instance of {@link SVGItem} to remove from its parent * list, or an SVG object for which a new {@link SVGItem} should be * created * @return item the {@link SVGItem} just removed from its parent list, or * the newly created {@link SVGItem} */	TokenNameCOMMENT_JAVADOC	 Removes the specified object from its parent list if it is an item, or creates a new item if the specified object is not an item. * @param newItem an instance of {@link SVGItem} to remove from its parent list, or an SVG object for which a new {@link SVGItem} should be created @return item the {@link SVGItem} just removed from its parent list, or the newly created {@link SVGItem} 
protected	TokenNameprotected	
SVGItem	TokenNameIdentifier	 SVG Item
removeIfNeeded	TokenNameIdentifier	 remove If Needed
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
instanceof	TokenNameinstanceof	
SVGItem	TokenNameIdentifier	 SVG Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is an existing item, so remove it from its parent list. 	TokenNameCOMMENT_LINE	This is an existing item, so remove it from its parent list. 
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
)	TokenNameRPAREN	
newItem	TokenNameIdentifier	 new Item
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// This must be an SVG object, so create a new SVGItem from it. 	TokenNameCOMMENT_LINE	This must be an SVG object, so create a new SVGItem from it. 
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
createSVGItem	TokenNameIdentifier	 create SVG Item
(	TokenNameLPAREN	
newItem	TokenNameIdentifier	 new Item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the list, if needed. */	TokenNameCOMMENT_JAVADOC	 Initializes the list, if needed. 
protected	TokenNameprotected	
void	TokenNamevoid	
revalidate	TokenNameIdentifier	 revalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
valid	TokenNameIdentifier	 valid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ListBuilder	TokenNameIdentifier	 List Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
ListBuilder	TokenNameIdentifier	 List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
parsedList	TokenNameIdentifier	 parsed List
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
getList	TokenNameIdentifier	 get List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parsedList	TokenNameIdentifier	 parsed List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
itemList	TokenNameIdentifier	 item List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
itemList	TokenNameIdentifier	 item List
=	TokenNameEQUAL	
parsedList	TokenNameIdentifier	 parsed List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
itemList	TokenNameIdentifier	 item List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the DOM attribute value to be the string representation of the * given list. */	TokenNameCOMMENT_JAVADOC	 Sets the DOM attribute value to be the string representation of the given list. 
protected	TokenNameprotected	
void	TokenNamevoid	
setValueAsString	TokenNameIdentifier	 set Value As String
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
finalValue	TokenNameIdentifier	 final Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getItemSeparator	TokenNameIdentifier	 get Item Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finalValue	TokenNameIdentifier	 final Value
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setAttributeValue	TokenNameIdentifier	 set Attribute Value
(	TokenNameLPAREN	
finalValue	TokenNameIdentifier	 final Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method to be called by a member {@link SVGItem} object when its value * changes. This causes the DOM attribute to be reset. */	TokenNameCOMMENT_JAVADOC	 Method to be called by a member {@link SVGItem} object when its value changes. This causes the DOM attribute to be reset. 
public	TokenNamepublic	
void	TokenNamevoid	
itemChanged	TokenNameIdentifier	 item Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the value of the associated attribute. */	TokenNameCOMMENT_JAVADOC	 Resets the value of the associated attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValueAsString	TokenNameIdentifier	 set Value As String
(	TokenNameLPAREN	
itemList	TokenNameIdentifier	 item List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends the string representation of the given {@link SVGItem} to * the DOM attribute. This is called in response to an append to * the list. */	TokenNameCOMMENT_JAVADOC	 Appends the string representation of the given {@link SVGItem} to the DOM attribute. This is called in response to an append to the list. 
protected	TokenNameprotected	
void	TokenNamevoid	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getItemSeparator	TokenNameIdentifier	 get Item Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setAttributeValue	TokenNameIdentifier	 set Attribute Value
(	TokenNameLPAREN	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invalidates this list. */	TokenNameCOMMENT_JAVADOC	 Invalidates this list. 
public	TokenNamepublic	
void	TokenNamevoid	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes an item from the list. * * This operation takes place when an * item was already in one list and * is being added to another one. */	TokenNameCOMMENT_JAVADOC	 Removes an item from the list. * This operation takes place when an item was already in one list and is being added to another one. 
protected	TokenNameprotected	
void	TokenNamevoid	
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
itemList	TokenNameIdentifier	 item List
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetAttribute	TokenNameIdentifier	 reset Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Clears the list and sets the parent of the former list items to null. */	TokenNameCOMMENT_JAVADOC	 Clears the list and sets the parent of the former list items to null. 
protected	TokenNameprotected	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A class for receiving notification of parsed list items. */	TokenNameCOMMENT_JAVADOC	 A class for receiving notification of parsed list items. 
protected	TokenNameprotected	
class	TokenNameclass	
ListBuilder	TokenNameIdentifier	 List Builder
implements	TokenNameimplements	
ListHandler	TokenNameIdentifier	 List Handler
{	TokenNameLBRACE	
/** * The list being built. */	TokenNameCOMMENT_JAVADOC	 The list being built. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
/** * Returns the newly created list. */	TokenNameCOMMENT_JAVADOC	 Returns the newly created list. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getList	TokenNameIdentifier	 get List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Begins the construction of the list. */	TokenNameCOMMENT_JAVADOC	 Begins the construction of the list. 
public	TokenNamepublic	
void	TokenNamevoid	
startList	TokenNameIdentifier	 start List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an item to the list. */	TokenNameCOMMENT_JAVADOC	 Adds an item to the list. 
public	TokenNamepublic	
void	TokenNamevoid	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
SVGItem	TokenNameIdentifier	 SVG Item
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
AbstractSVGList	TokenNameIdentifier	 Abstract SVG List
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ends the construction of the list. */	TokenNameCOMMENT_JAVADOC	 Ends the construction of the list. 
public	TokenNamepublic	
void	TokenNamevoid	
endList	TokenNameIdentifier	 end List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
