/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xpointer	TokenNameIdentifier	 xpointer
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
Augmentations	TokenNameIdentifier	 Augmentations
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * <p> * The XPointerProcessor is responsible for parsing an XPointer * expression and and providing scheme specific resolution of * the document fragment pointed to be the pointer. * </p> * * @xerces.internal * * @version $Id: XPointerProcessor.java 603808 2007-12-13 03:44:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p> The XPointerProcessor is responsible for parsing an XPointer expression and and providing scheme specific resolution of the document fragment pointed to be the pointer. </p> * @xerces.internal * @version $Id: XPointerProcessor.java 603808 2007-12-13 03:44:48Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XPointerProcessor	TokenNameIdentifier	 X Pointer Processor
{	TokenNameLBRACE	
// The start element event 	TokenNameCOMMENT_LINE	The start element event 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENT_ELEMENT_START	TokenNameIdentifier	 EVENT  ELEMENT  START
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The end element event 	TokenNameCOMMENT_LINE	The end element event 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENT_ELEMENT_END	TokenNameIdentifier	 EVENT  ELEMENT  END
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The empty element event 	TokenNameCOMMENT_LINE	The empty element event 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EVENT_ELEMENT_EMPTY	TokenNameIdentifier	 EVENT  ELEMENT  EMPTY
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Parses an XPointer expression. It performs scheme specific processing * depending on the pointer parts and sets up a Vector of XPointerParts * in the order (left-to-right) they appear in the XPointer expression. * * @param xpointer A String representing the xpointer expression. * @throws XNIException Thrown if the xpointer string does not conform to * the XPointer Framework syntax or the syntax of the pointer part does * not conform to its definition for its scheme. */	TokenNameCOMMENT_JAVADOC	 Parses an XPointer expression. It performs scheme specific processing depending on the pointer parts and sets up a Vector of XPointerParts in the order (left-to-right) they appear in the XPointer expression. * @param xpointer A String representing the xpointer expression. @throws XNIException Thrown if the xpointer string does not conform to the XPointer Framework syntax or the syntax of the pointer part does not conform to its definition for its scheme. 
public	TokenNamepublic	
void	TokenNamevoid	
parseXPointer	TokenNameIdentifier	 parse X Pointer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xpointer	TokenNameIdentifier	 xpointer
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Evaluates an XML resource with respect to an XPointer expressions * by checking if it's element and attributes parameters match the * criteria specified in the xpointer expression. * * @param element - The name of the element. * @param attributes - The element attributes. * @param augs - Additional information that may include infoset augmentations * @param event - An integer indicating * 0 - The start of an element * 1 - The end of an element * 2 - An empty element call * @return true if the element was resolved by the xpointer * @throws XNIException Thrown to signal an error */	TokenNameCOMMENT_JAVADOC	 Evaluates an XML resource with respect to an XPointer expressions by checking if it's element and attributes parameters match the criteria specified in the xpointer expression. * @param element - The name of the element. @param attributes - The element attributes. @param augs - Additional information that may include infoset augmentations @param event - An integer indicating 0 - The start of an element 1 - The end of an element 2 - An empty element call @return true if the element was resolved by the xpointer @throws XNIException Thrown to signal an error 
public	TokenNamepublic	
boolean	TokenNameboolean	
resolveXPointer	TokenNameIdentifier	 resolve X Pointer
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
,	TokenNameCOMMA	
int	TokenNameint	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Returns true if the XPointer expression resolves to the current resource fragment * or Node which is part of the input resource being streamed else returns false. * * @return True if the xpointer expression matches a node/fragment in the resource * else returns false. * @throws XNIException Thrown to signal an error */	TokenNameCOMMENT_JAVADOC	 Returns true if the XPointer expression resolves to the current resource fragment or Node which is part of the input resource being streamed else returns false. * @return True if the xpointer expression matches a node/fragment in the resource else returns false. @throws XNIException Thrown to signal an error 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFragmentResolved	TokenNameIdentifier	 is Fragment Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Returns true if the XPointer expression resolves any subresource of the * input resource. * * @return True if the xpointer expression matches a fragment in the resource * else returns false. * @throws XNIException Thrown to signal an error */	TokenNameCOMMENT_JAVADOC	 Returns true if the XPointer expression resolves any subresource of the input resource. * @return True if the xpointer expression matches a fragment in the resource else returns false. @throws XNIException Thrown to signal an error 
public	TokenNamepublic	
boolean	TokenNameboolean	
isXPointerResolved	TokenNameIdentifier	 is X Pointer Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
