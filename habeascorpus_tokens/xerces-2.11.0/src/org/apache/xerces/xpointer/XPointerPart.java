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
/** * <p> * Used for scheme specific parsing and evaluation of an XPointer expression. * This interface applies to both ShortHand and SchemeBased XPointer * expressions. * </p> * * @xerces.internal * * @version $Id: XPointerPart.java 603808 2007-12-13 03:44:48Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p> Used for scheme specific parsing and evaluation of an XPointer expression. This interface applies to both ShortHand and SchemeBased XPointer expressions. </p> * @xerces.internal * @version $Id: XPointerPart.java 603808 2007-12-13 03:44:48Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XPointerPart	TokenNameIdentifier	 X Pointer Part
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
/** * Provides scheme specific parsing of a XPointer expression i.e. * the PointerPart or ShortHandPointer. * * @param part A String representing the PointerPart or ShortHandPointer. * @throws XNIException Thrown if the PointerPart string does not conform to * the syntax defined by its scheme. * */	TokenNameCOMMENT_JAVADOC	 Provides scheme specific parsing of a XPointer expression i.e. the PointerPart or ShortHandPointer. * @param part A String representing the PointerPart or ShortHandPointer. @throws XNIException Thrown if the PointerPart string does not conform to the syntax defined by its scheme. 
public	TokenNamepublic	
void	TokenNamevoid	
parseXPointer	TokenNameIdentifier	 parse X Pointer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Evaluates an XML resource with respect to an XPointer expressions * by checking if it's element and attributes parameters match the * criteria specified in the xpointer expression. * * @param element - The name of the element. * @param attributes - The element attributes. * @param augs - Additional information that may include infoset augmentations * @param event - An integer indicating * 0 - The start of an element * 1 - The end of an element * 2 - An empty element call * @throws XNIException Thrown to signal an error * */	TokenNameCOMMENT_JAVADOC	 Evaluates an XML resource with respect to an XPointer expressions by checking if it's element and attributes parameters match the criteria specified in the xpointer expression. * @param element - The name of the element. @param attributes - The element attributes. @param augs - Additional information that may include infoset augmentations @param event - An integer indicating 0 - The start of an element 1 - The end of an element 2 - An empty element call @throws XNIException Thrown to signal an error 
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
/** * Returns true if the XPointer expression resolves to a resource fragment * specified as input else returns false. * * @return True if the xpointer expression matches a fragment in the resource * else returns false. * @throws XNIException Thrown to signal an error * */	TokenNameCOMMENT_JAVADOC	 Returns true if the XPointer expression resolves to a resource fragment specified as input else returns false. * @return True if the xpointer expression matches a fragment in the resource else returns false. @throws XNIException Thrown to signal an error 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFragmentResolved	TokenNameIdentifier	 is Fragment Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Returns true if the XPointer expression resolves to a non-element child * of the current resource fragment. * * @return True if the XPointer expression resolves to a non-element child * of the current resource fragment. * @throws XNIException Thrown to signal an error * */	TokenNameCOMMENT_JAVADOC	 Returns true if the XPointer expression resolves to a non-element child of the current resource fragment. * @return True if the XPointer expression resolves to a non-element child of the current resource fragment. @throws XNIException Thrown to signal an error 
public	TokenNamepublic	
boolean	TokenNameboolean	
isChildFragmentResolved	TokenNameIdentifier	 is Child Fragment Resolved
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * Returns a String containing the scheme name of the PointerPart * or the name of the ShortHand Pointer. * * @return A String containing the scheme name of the PointerPart. * */	TokenNameCOMMENT_JAVADOC	 Returns a String containing the scheme name of the PointerPart or the name of the ShortHand Pointer. * @return A String containing the scheme name of the PointerPart. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemeName	TokenNameIdentifier	 get Scheme Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a String containing the scheme data of the PointerPart. * * @return A String containing the scheme data of the PointerPart. * */	TokenNameCOMMENT_JAVADOC	 Returns a String containing the scheme data of the PointerPart. * @return A String containing the scheme data of the PointerPart. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemeData	TokenNameIdentifier	 get Scheme Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the scheme name of the PointerPart or the ShortHand Pointer name. * * @param schemeName A String containing the scheme name of the PointerPart. * */	TokenNameCOMMENT_JAVADOC	 Sets the scheme name of the PointerPart or the ShortHand Pointer name. * @param schemeName A String containing the scheme name of the PointerPart. 
public	TokenNamepublic	
void	TokenNamevoid	
setSchemeName	TokenNameIdentifier	 set Scheme Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
schemeName	TokenNameIdentifier	 scheme Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the scheme data of the PointerPart. * * @param schemeData A String containing the scheme data of the PointerPart. * */	TokenNameCOMMENT_JAVADOC	 Sets the scheme data of the PointerPart. * @param schemeData A String containing the scheme data of the PointerPart. 
public	TokenNamepublic	
void	TokenNamevoid	
setSchemeData	TokenNameIdentifier	 set Scheme Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
schemeData	TokenNameIdentifier	 scheme Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
