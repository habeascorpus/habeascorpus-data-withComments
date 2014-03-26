/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
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
/** * This interface represents a property value. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: Value.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface represents a property value. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: Value.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
Value	TokenNameIdentifier	 Value
{	TokenNameLBRACE	
/** * A string representation of the current value. */	TokenNameCOMMENT_JAVADOC	 A string representation of the current value. 
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A code defining the type of the value. */	TokenNameCOMMENT_JAVADOC	 A code defining the type of the value. 
short	TokenNameshort	
getCssValueType	TokenNameIdentifier	 get Css Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The type of the value. */	TokenNameCOMMENT_JAVADOC	 The type of the value. 
short	TokenNameshort	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method is used to get the float value. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a float * value. */	TokenNameCOMMENT_JAVADOC	 This method is used to get the float value. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a float value. 
float	TokenNamefloat	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * This method is used to get the string value. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a string * value. */	TokenNameCOMMENT_JAVADOC	 This method is used to get the string value. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a string value. 
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The red value of the RGB color. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a RGB * color value. */	TokenNameCOMMENT_JAVADOC	 The red value of the RGB color. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a RGB color value. 
Value	TokenNameIdentifier	 Value
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The green value of the RGB color. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a RGB * color value. */	TokenNameCOMMENT_JAVADOC	 The green value of the RGB color. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a RGB color value. 
Value	TokenNameIdentifier	 Value
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The blue value of the RGB color. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a RGB * color value. */	TokenNameCOMMENT_JAVADOC	 The blue value of the RGB color. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a RGB color value. 
Value	TokenNameIdentifier	 Value
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The number of <code>CSSValues</code> in the list. The range of valid * values of the indices is <code>0</code> to <code>length-1</code> * inclusive. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a list * value. */	TokenNameCOMMENT_JAVADOC	 The number of <code>CSSValues</code> in the list. The range of valid values of the indices is <code>0</code> to <code>length-1</code> inclusive. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a list value. 
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * Used to retrieve a rule by ordinal index. * @return The style rule at the <code>index</code> position in the * list, or <code>null</code> if that is not a valid index. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a list * value. */	TokenNameCOMMENT_JAVADOC	 Used to retrieve a rule by ordinal index. @return The style rule at the <code>index</code> position in the list, or <code>null</code> if that is not a valid index. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a list value. 
Value	TokenNameIdentifier	 Value
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The top value of the rect. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a Rect * value. */	TokenNameCOMMENT_JAVADOC	 The top value of the rect. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a Rect value. 
Value	TokenNameIdentifier	 Value
getTop	TokenNameIdentifier	 get Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The right value of the rect. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a Rect * value. */	TokenNameCOMMENT_JAVADOC	 The right value of the rect. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a Rect value. 
Value	TokenNameIdentifier	 Value
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The bottom value of the rect. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a Rect * value. */	TokenNameCOMMENT_JAVADOC	 The bottom value of the rect. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a Rect value. 
Value	TokenNameIdentifier	 Value
getBottom	TokenNameIdentifier	 get Bottom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The left value of the rect. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a Rect * value. */	TokenNameCOMMENT_JAVADOC	 The left value of the rect. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a Rect value. 
Value	TokenNameIdentifier	 Value
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The identifier value of the counter. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a Counter * value. */	TokenNameCOMMENT_JAVADOC	 The identifier value of the counter. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a Counter value. 
String	TokenNameIdentifier	 String
getIdentifier	TokenNameIdentifier	 get Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The listStyle value of the counter. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a Counter * value. */	TokenNameCOMMENT_JAVADOC	 The listStyle value of the counter. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a Counter value. 
String	TokenNameIdentifier	 String
getListStyle	TokenNameIdentifier	 get List Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
/** * The separator value of the counter. * @exception DOMException * INVALID_ACCESS_ERR: Raised if the value doesn't contain a Counter * value. */	TokenNameCOMMENT_JAVADOC	 The separator value of the counter. @exception DOMException INVALID_ACCESS_ERR: Raised if the value doesn't contain a Counter value. 
String	TokenNameIdentifier	 String
getSeparator	TokenNameIdentifier	 get Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
