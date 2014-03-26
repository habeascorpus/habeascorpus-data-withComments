/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
grammars	TokenNameIdentifier	 grammars
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLAttributes	TokenNameIdentifier	 XML Attributes
;	TokenNameSEMICOLON	
/** * All information specific to XML Schema grammars. * * @author Sandy Gao, IBM * * @version $Id: XMLSchemaDescription.java 570134 2007-08-27 14:14:28Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 All information specific to XML Schema grammars. * @author Sandy Gao, IBM * @version $Id: XMLSchemaDescription.java 570134 2007-08-27 14:14:28Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
extends	TokenNameextends	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
{	TokenNameLBRACE	
// used to indicate what triggered the call 	TokenNameCOMMENT_LINE	used to indicate what triggered the call 
/** * Indicate that the current schema document is &lt;include&gt;d by another * schema document. */	TokenNameCOMMENT_JAVADOC	 Indicate that the current schema document is &lt;include&gt;d by another schema document. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_INCLUDE	TokenNameIdentifier	 CONTEXT  INCLUDE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the current schema document is &lt;redefine&gt;d by another * schema document. */	TokenNameCOMMENT_JAVADOC	 Indicate that the current schema document is &lt;redefine&gt;d by another schema document. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_REDEFINE	TokenNameIdentifier	 CONTEXT  REDEFINE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the current schema document is &lt;import&gt;ed by another * schema document. */	TokenNameCOMMENT_JAVADOC	 Indicate that the current schema document is &lt;import&gt;ed by another schema document. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_IMPORT	TokenNameIdentifier	 CONTEXT  IMPORT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the current schema document is being preparsed. */	TokenNameCOMMENT_JAVADOC	 Indicate that the current schema document is being preparsed. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_PREPARSE	TokenNameIdentifier	 CONTEXT  PREPARSE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the parse of the current schema document is triggered * by xsi:schemaLocation/noNamespaceSchemaLocation attribute(s) in the * instance document. This value is only used if we don't defer the loading * of schema documents. */	TokenNameCOMMENT_JAVADOC	 Indicate that the parse of the current schema document is triggered by xsi:schemaLocation/noNamespaceSchemaLocation attribute(s) in the instance document. This value is only used if we don't defer the loading of schema documents. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_INSTANCE	TokenNameIdentifier	 CONTEXT  INSTANCE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the parse of the current schema document is triggered by * the occurrence of an element whose namespace is the target namespace * of this schema document. This value is only used if we do defer the * loading of schema documents until a component from that namespace is * referenced from the instance. */	TokenNameCOMMENT_JAVADOC	 Indicate that the parse of the current schema document is triggered by the occurrence of an element whose namespace is the target namespace of this schema document. This value is only used if we do defer the loading of schema documents until a component from that namespace is referenced from the instance. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_ELEMENT	TokenNameIdentifier	 CONTEXT  ELEMENT
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the parse of the current schema document is triggered by * the occurrence of an attribute whose namespace is the target namespace * of this schema document. This value is only used if we do defer the * loading of schema documents until a component from that namespace is * referenced from the instance. */	TokenNameCOMMENT_JAVADOC	 Indicate that the parse of the current schema document is triggered by the occurrence of an attribute whose namespace is the target namespace of this schema document. This value is only used if we do defer the loading of schema documents until a component from that namespace is referenced from the instance. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_ATTRIBUTE	TokenNameIdentifier	 CONTEXT  ATTRIBUTE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the parse of the current schema document is triggered by * the occurrence of an "xsi:type" attribute, whose value (a QName) has * the target namespace of this schema document as its namespace. * This value is only used if we do defer the loading of schema documents * until a component from that namespace is referenced from the instance. */	TokenNameCOMMENT_JAVADOC	 Indicate that the parse of the current schema document is triggered by the occurrence of an "xsi:type" attribute, whose value (a QName) has the target namespace of this schema document as its namespace. This value is only used if we do defer the loading of schema documents until a component from that namespace is referenced from the instance. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_XSITYPE	TokenNameIdentifier	 CONTEXT  XSITYPE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Get the context. The returned value is one of the pre-defined * CONTEXT_xxx constants. * * @return the value indicating the context */	TokenNameCOMMENT_JAVADOC	 Get the context. The returned value is one of the pre-defined CONTEXT_xxx constants. * @return the value indicating the context 
public	TokenNamepublic	
short	TokenNameshort	
getContextType	TokenNameIdentifier	 get Context Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If the context is "include" or "redefine", then return the target * namespace of the enclosing schema document; otherwise, the expected * target namespace of this document. * * @return the expected/enclosing target namespace */	TokenNameCOMMENT_JAVADOC	 If the context is "include" or "redefine", then return the target namespace of the enclosing schema document; otherwise, the expected target namespace of this document. * @return the expected/enclosing target namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * For import and references from the instance document, it's possible to * have multiple hints for one namespace. So this method returns an array, * which contains all location hints. * * @return an array of all location hints associated to the expected * target namespace */	TokenNameCOMMENT_JAVADOC	 For import and references from the instance document, it's possible to have multiple hints for one namespace. So this method returns an array, which contains all location hints. * @return an array of all location hints associated to the expected target namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocationHints	TokenNameIdentifier	 get Location Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If a call is triggered by an element/attribute/xsi:type in the instance, * this call returns the name of such triggering component: the name of * the element/attribute, or the value of the xsi:type. * * @return the name of the triggering component */	TokenNameCOMMENT_JAVADOC	 If a call is triggered by an element/attribute/xsi:type in the instance, this call returns the name of such triggering component: the name of the element/attribute, or the value of the xsi:type. * @return the name of the triggering component 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getTriggeringComponent	TokenNameIdentifier	 get Triggering Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If a call is triggered by an attribute or xsi:type, then this method * returns the enclosing element of such element. * * @return the name of the enclosing element */	TokenNameCOMMENT_JAVADOC	 If a call is triggered by an attribute or xsi:type, then this method returns the enclosing element of such element. * @return the name of the enclosing element 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getEnclosingElementName	TokenNameIdentifier	 get Enclosing Element Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If a call is triggered by an element/attribute/xsi:type in the instance, * this call returns all attributes of such an element (or enclosing element). * * @return all attributes of the triggering/enclosing element */	TokenNameCOMMENT_JAVADOC	 If a call is triggered by an element/attribute/xsi:type in the instance, this call returns all attributes of such an element (or enclosing element). * @return all attributes of the triggering/enclosing element 
public	TokenNamepublic	
XMLAttributes	TokenNameIdentifier	 XML Attributes
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XSDDescription 	TokenNameCOMMENT_LINE	XSDDescription 
