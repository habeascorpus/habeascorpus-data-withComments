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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
;	TokenNameSEMICOLON	
/** * This class represents CSS rect values. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: RectValue.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents CSS rect values. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: RectValue.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
RectValue	TokenNameIdentifier	 Rect Value
extends	TokenNameextends	
AbstractValue	TokenNameIdentifier	 Abstract Value
{	TokenNameLBRACE	
/** * The top value. */	TokenNameCOMMENT_JAVADOC	 The top value. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
/** * The right value. */	TokenNameCOMMENT_JAVADOC	 The right value. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
/** * The bottom value. */	TokenNameCOMMENT_JAVADOC	 The bottom value. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
/** * The left value. */	TokenNameCOMMENT_JAVADOC	 The left value. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
/** * Creates a new Rect value. */	TokenNameCOMMENT_JAVADOC	 Creates a new Rect value. 
public	TokenNamepublic	
RectValue	TokenNameIdentifier	 Rect Value
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The type of the value. */	TokenNameCOMMENT_JAVADOC	 The type of the value. 
public	TokenNamepublic	
short	TokenNameshort	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_RECT	TokenNameIdentifier	 CSS  RECT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A string representation of the current value. */	TokenNameCOMMENT_JAVADOC	 A string representation of the current value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"rect("	TokenNameStringLiteral	rect(
+	TokenNamePLUS	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getTop()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getTop()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getTop	TokenNameIdentifier	 get Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getRight()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getRight()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getBottom()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getBottom()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getBottom	TokenNameIdentifier	 get Bottom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getLeft()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getLeft()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of this value. */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of this value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
