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
/** * This class represents RGB colors. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: RGBColorValue.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents RGB colors. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: RGBColorValue.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
RGBColorValue	TokenNameIdentifier	 RGB Color Value
extends	TokenNameextends	
AbstractValue	TokenNameIdentifier	 Abstract Value
{	TokenNameLBRACE	
/** * The red component. */	TokenNameCOMMENT_JAVADOC	 The red component. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
/** * The green component. */	TokenNameCOMMENT_JAVADOC	 The green component. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
/** * The blue component. */	TokenNameCOMMENT_JAVADOC	 The blue component. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
/** * Creates a new RGBColorValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new RGBColorValue. 
public	TokenNamepublic	
RGBColorValue	TokenNameIdentifier	 RGB Color Value
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
red	TokenNameIdentifier	 red
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
green	TokenNameIdentifier	 green
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
blue	TokenNameIdentifier	 blue
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
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
CSS_RGBCOLOR	TokenNameIdentifier	 CSS  RGBCOLOR
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
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
red	TokenNameIdentifier	 red
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
green	TokenNameIdentifier	 green
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
blue	TokenNameIdentifier	 blue
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getRed()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getRed()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
red	TokenNameIdentifier	 red
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getGreen()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getGreen()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
green	TokenNameIdentifier	 green
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link Value#getBlue()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link Value#getBlue()}. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
blue	TokenNameIdentifier	 blue
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of the color. */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of the color. 
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
