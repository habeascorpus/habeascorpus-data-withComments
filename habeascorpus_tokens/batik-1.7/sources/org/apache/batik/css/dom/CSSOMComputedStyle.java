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
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
CSSEngine	TokenNameIdentifier	 CSS Engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
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
CSSRule	TokenNameIdentifier	 CSS Rule
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
CSSStyleDeclaration	TokenNameIdentifier	 CSS Style Declaration
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
CSSValue	TokenNameIdentifier	 CSS Value
;	TokenNameSEMICOLON	
/** * This class represents the computed style of an element. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSOMComputedStyle.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents the computed style of an element. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSOMComputedStyle.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
CSSOMComputedStyle	TokenNameIdentifier	 CSSOM Computed Style
implements	TokenNameimplements	
CSSStyleDeclaration	TokenNameIdentifier	 CSS Style Declaration
{	TokenNameLBRACE	
/** * The CSS engine used to compute the values. */	TokenNameCOMMENT_JAVADOC	 The CSS engine used to compute the values. 
protected	TokenNameprotected	
CSSEngine	TokenNameIdentifier	 CSS Engine
cssEngine	TokenNameIdentifier	 css Engine
;	TokenNameSEMICOLON	
/** * The associated element. */	TokenNameCOMMENT_JAVADOC	 The associated element. 
protected	TokenNameprotected	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
/** * The optional pseudo-element. */	TokenNameCOMMENT_JAVADOC	 The optional pseudo-element. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
pseudoElement	TokenNameIdentifier	 pseudo Element
;	TokenNameSEMICOLON	
/** * The CSS values. */	TokenNameCOMMENT_JAVADOC	 The CSS values. 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new computed style. */	TokenNameCOMMENT_JAVADOC	 Creates a new computed style. 
public	TokenNamepublic	
CSSOMComputedStyle	TokenNameIdentifier	 CSSOM Computed Style
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pseudoElt	TokenNameIdentifier	 pseudo Elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cssEngine	TokenNameIdentifier	 css Engine
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
;	TokenNameSEMICOLON	
pseudoElement	TokenNameIdentifier	 pseudo Element
=	TokenNameEQUAL	
pseudoElt	TokenNameIdentifier	 pseudo Elt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#getCssText()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#getCssText()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getNumberOfProperties	TokenNameIdentifier	 get Number Of Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
pseudoElement	TokenNameIdentifier	 pseudo Element
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#setCssText(String)}. * Throws a NO_MODIFICATION_ALLOWED_ERR {@link org.w3c.dom.DOMException}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#setCssText(String)}. Throws a NO_MODIFICATION_ALLOWED_ERR {@link org.w3c.dom.DOMException}. 
public	TokenNamepublic	
void	TokenNamevoid	
setCssText	TokenNameIdentifier	 set Css Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cssText	TokenNameIdentifier	 css Text
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#getPropertyValue(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#getPropertyValue(String)}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPropertyValue	TokenNameIdentifier	 get Property Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getPropertyIndex	TokenNameIdentifier	 get Property Index
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
pseudoElement	TokenNameIdentifier	 pseudo Element
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#getPropertyCSSValue(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#getPropertyCSSValue(String)}. 
public	TokenNamepublic	
CSSValue	TokenNameIdentifier	 CSS Value
getPropertyCSSValue	TokenNameIdentifier	 get Property CSS Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CSSValue	TokenNameIdentifier	 CSS Value
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CSSValue	TokenNameIdentifier	 CSS Value
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getPropertyIndex	TokenNameIdentifier	 get Property Index
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
createCSSValue	TokenNameIdentifier	 create CSS Value
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
propertyName	TokenNameIdentifier	 property Name
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#removeProperty(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#removeProperty(String)}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
removeProperty	TokenNameIdentifier	 remove Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#getPropertyPriority(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#getPropertyPriority(String)}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPropertyPriority	TokenNameIdentifier	 get Property Priority
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#setProperty(String,String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#setProperty(String,String,String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyName	TokenNameIdentifier	 property Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prio	TokenNameIdentifier	 prio
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#getLength()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#getLength()}. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getNumberOfProperties	TokenNameIdentifier	 get Number Of Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#item(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#item(int)}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getNumberOfProperties	TokenNameIdentifier	 get Number Of Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.css.CSSStyleDeclaration#getParentRule()}. * @return null. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.css.CSSStyleDeclaration#getParentRule()}. @return null. 
public	TokenNamepublic	
CSSRule	TokenNameIdentifier	 CSS Rule
getParentRule	TokenNameIdentifier	 get Parent Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a CSSValue to manage the value at the given index. */	TokenNameCOMMENT_JAVADOC	 Creates a CSSValue to manage the value at the given index. 
protected	TokenNameprotected	
CSSValue	TokenNameIdentifier	 CSS Value
createCSSValue	TokenNameIdentifier	 create CSS Value
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ComputedCSSValue	TokenNameIdentifier	 Computed CSS Value
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To manage a computed CSSValue. */	TokenNameCOMMENT_JAVADOC	 To manage a computed CSSValue. 
public	TokenNamepublic	
class	TokenNameclass	
ComputedCSSValue	TokenNameIdentifier	 Computed CSS Value
extends	TokenNameextends	
CSSOMValue	TokenNameIdentifier	 CSSOM Value
implements	TokenNameimplements	
CSSOMValue	TokenNameIdentifier	 CSSOM Value
.	TokenNameDOT	
ValueProvider	TokenNameIdentifier	 Value Provider
{	TokenNameLBRACE	
/** * The index of the associated value. */	TokenNameCOMMENT_JAVADOC	 The index of the associated value. 
protected	TokenNameprotected	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Creates a new ComputedCSSValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new ComputedCSSValue. 
public	TokenNamepublic	
ComputedCSSValue	TokenNameIdentifier	 Computed CSS Value
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
valueProvider	TokenNameIdentifier	 value Provider
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Value associated with this object. */	TokenNameCOMMENT_JAVADOC	 Returns the Value associated with this object. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
pseudoElement	TokenNameIdentifier	 pseudo Element
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
