/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
DocumentEventSupport	TokenNameIdentifier	 Document Event Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
EventSupport	TokenNameIdentifier	 Event Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashTable	TokenNameIdentifier	 Hash Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
;	TokenNameSEMICOLON	
/** * This class implements the {@link org.w3c.dom.DOMImplementation}, * {@link org.w3c.dom.css.DOMImplementationCSS} interfaces. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AbstractDOMImplementation.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.DOMImplementation}, {@link org.w3c.dom.css.DOMImplementationCSS} interfaces. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AbstractDOMImplementation.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractDOMImplementation	TokenNameIdentifier	 Abstract DOM Implementation
implements	TokenNameimplements	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * The supported features. */	TokenNameCOMMENT_JAVADOC	 The supported features. 
protected	TokenNameprotected	
final	TokenNamefinal	
HashTable	TokenNameIdentifier	 Hash Table
features	TokenNameIdentifier	 features
=	TokenNameEQUAL	
new	TokenNamenew	
HashTable	TokenNameIdentifier	 Hash Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
// registerFeature("BasicEvents", "3.0"); 	TokenNameCOMMENT_LINE	registerFeature("BasicEvents", "3.0"); 
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"Core"	TokenNameStringLiteral	Core
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"XML"	TokenNameStringLiteral	XML
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"1.0"	TokenNameStringLiteral	1.0
,	TokenNameCOMMA	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"Events"	TokenNameStringLiteral	Events
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"UIEvents"	TokenNameStringLiteral	UIEvents
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"MouseEvents"	TokenNameStringLiteral	MouseEvents
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"TextEvents"	TokenNameStringLiteral	TextEvents
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"KeyboardEvents"	TokenNameStringLiteral	KeyboardEvents
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"MutationEvents"	TokenNameStringLiteral	MutationEvents
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"2.0"	TokenNameStringLiteral	2.0
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"MutationNameEvents"	TokenNameStringLiteral	MutationNameEvents
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"Traversal"	TokenNameStringLiteral	Traversal
,	TokenNameCOMMA	
"2.0"	TokenNameStringLiteral	2.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
"XPath"	TokenNameStringLiteral	XPath
,	TokenNameCOMMA	
"3.0"	TokenNameStringLiteral	3.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Registers a DOM feature. */	TokenNameCOMMENT_JAVADOC	 Registers a DOM feature. 
protected	TokenNameprotected	
void	TokenNamevoid	
registerFeature	TokenNameIdentifier	 register Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AbstractDOMImplementation object. */	TokenNameCOMMENT_JAVADOC	 Creates a new AbstractDOMImplementation object. 
protected	TokenNameprotected	
AbstractDOMImplementation	TokenNameIdentifier	 Abstract DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.DOMImplementation#hasFeature(String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.DOMImplementation#hasFeature(String,String)}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
feature	TokenNameIdentifier	 feature
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All features are directly castable. 	TokenNameCOMMENT_LINE	All features are directly castable. 
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
feature	TokenNameIdentifier	 feature
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
va	TokenNameIdentifier	 va
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
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
va	TokenNameIdentifier	 va
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
va	TokenNameIdentifier	 va
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements * {@link org.w3c.dom.DOMImplementation#getFeature(String,String)}. * No compound document support, so just return this DOMImlpementation * where appropriate. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.DOMImplementation#getFeature(String,String)}. No compound document support, so just return this DOMImlpementation where appropriate. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an DocumentEventSupport object suitable for use with this implementation. */	TokenNameCOMMENT_JAVADOC	 Creates an DocumentEventSupport object suitable for use with this implementation. 
public	TokenNamepublic	
DocumentEventSupport	TokenNameIdentifier	 Document Event Support
createDocumentEventSupport	TokenNameIdentifier	 create Document Event Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DocumentEventSupport	TokenNameIdentifier	 Document Event Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an EventSupport object for a given node. */	TokenNameCOMMENT_JAVADOC	 Creates an EventSupport object for a given node. 
public	TokenNamepublic	
EventSupport	TokenNameIdentifier	 Event Support
createEventSupport	TokenNameIdentifier	 create Event Support
(	TokenNameLPAREN	
AbstractNode	TokenNameIdentifier	 Abstract Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EventSupport	TokenNameIdentifier	 Event Support
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
