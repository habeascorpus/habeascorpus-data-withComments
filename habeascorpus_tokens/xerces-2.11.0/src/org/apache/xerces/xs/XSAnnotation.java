/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
/** * This interface represents the Annotation schema component. */	TokenNameCOMMENT_JAVADOC	 This interface represents the Annotation schema component. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSAnnotation	TokenNameIdentifier	 XS Annotation
extends	TokenNameextends	
XSObject	TokenNameIdentifier	 XS Object
{	TokenNameLBRACE	
// TargetType 	TokenNameCOMMENT_LINE	TargetType 
/** * The object type is <code>org.w3c.dom.Element</code>. */	TokenNameCOMMENT_JAVADOC	 The object type is <code>org.w3c.dom.Element</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
W3C_DOM_ELEMENT	TokenNameIdentifier	 W3 C  DOM  ELEMENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The object type is <code>org.xml.sax.ContentHandler</code>. */	TokenNameCOMMENT_JAVADOC	 The object type is <code>org.xml.sax.ContentHandler</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SAX_CONTENTHANDLER	TokenNameIdentifier	 SAX  CONTENTHANDLER
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The object type is <code>org.w3c.dom.Document</code>. */	TokenNameCOMMENT_JAVADOC	 The object type is <code>org.w3c.dom.Document</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
W3C_DOM_DOCUMENT	TokenNameIdentifier	 W3 C  DOM  DOCUMENT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Write contents of the annotation to the specified object. If the * specified <code>target</code> is a DOM object, in-scope namespace * declarations for <code>annotation</code> element are added as * attribute nodes of the serialized <code>annotation</code>, otherwise * the corresponding events for all in-scope namespace declarations are * sent via the specified document handler. * @param target A target pointer to the annotation target object, i.e. * <code>org.w3c.dom.Document</code>, <code>org.w3c.dom.Element</code> * , <code>org.xml.sax.ContentHandler</code>. * @param targetType A target type. * @return True if the <code>target</code> is a recognized type and * supported by this implementation, otherwise false. */	TokenNameCOMMENT_JAVADOC	 Write contents of the annotation to the specified object. If the specified <code>target</code> is a DOM object, in-scope namespace declarations for <code>annotation</code> element are added as attribute nodes of the serialized <code>annotation</code>, otherwise the corresponding events for all in-scope namespace declarations are sent via the specified document handler. @param target A target pointer to the annotation target object, i.e. <code>org.w3c.dom.Document</code>, <code>org.w3c.dom.Element</code> , <code>org.xml.sax.ContentHandler</code>. @param targetType A target type. @return True if the <code>target</code> is a recognized type and supported by this implementation, otherwise false. 
public	TokenNamepublic	
boolean	TokenNameboolean	
writeAnnotation	TokenNameIdentifier	 write Annotation
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
short	TokenNameshort	
targetType	TokenNameIdentifier	 target Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A text representation of the annotation. */	TokenNameCOMMENT_JAVADOC	 A text representation of the annotation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAnnotationString	TokenNameIdentifier	 get Annotation String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
