/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
xni	TokenNameIdentifier	 xni
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
/** * This sample demonstrates how to create a filter for the document * "streaming" information set that turns element names into upper * case. * <p> * <strong>Note:</strong> This sample does not contain a * <code>main</code> method and cannot be run. It is only for * demonstration purposes. * * @author Andy Clark, IBM * * @version $Id: UpperCaseFilter.java 447690 2006-09-19 02:41:53Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This sample demonstrates how to create a filter for the document "streaming" information set that turns element names into upper case. <p> <strong>Note:</strong> This sample does not contain a <code>main</code> method and cannot be run. It is only for demonstration purposes. * @author Andy Clark, IBM * @version $Id: UpperCaseFilter.java 447690 2006-09-19 02:41:53Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
UpperCaseFilter	TokenNameIdentifier	 Upper Case Filter
extends	TokenNameextends	
PassThroughFilter	TokenNameIdentifier	 Pass Through Filter
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** * Temporary QName structure used by the <code>toUpperCase</code> * method. It should not be used anywhere else. * * @see #toUpperCase */	TokenNameCOMMENT_JAVADOC	 Temporary QName structure used by the <code>toUpperCase</code> method. It should not be used anywhere else. * @see #toUpperCase 
private	TokenNameprivate	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
fQName	TokenNameIdentifier	 f Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// XMLDocumentHandler methods 	TokenNameCOMMENT_LINE	XMLDocumentHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * The start of an element. * * @param element The name of the element. * @param attributes The element attributes. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of an element. * @param element The name of the element. @param attributes The element attributes. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// startElement(QName,XMLAttributes) 	TokenNameCOMMENT_LINE	startElement(QName,XMLAttributes) 
/** * An empty element. * * @param element The name of the element. * @param attributes The element attributes. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 An empty element. * @param element The name of the element. @param attributes The element attributes. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
emptyElement	TokenNameIdentifier	 empty Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
emptyElement	TokenNameIdentifier	 empty Element
(	TokenNameLPAREN	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// emptyElement(QName,XMLAttributes) 	TokenNameCOMMENT_LINE	emptyElement(QName,XMLAttributes) 
/** * The end of an element. * * @param element The name of the element. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of an element. * @param element The name of the element. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// endElement(QName) 	TokenNameCOMMENT_LINE	endElement(QName) 
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
/** * This method upper-cases the prefix, localpart, and rawname * fields in the specified QName and returns a different * QName object containing the upper-cased string values. * * @param qname The QName to upper-case. */	TokenNameCOMMENT_JAVADOC	 This method upper-cases the prefix, localpart, and rawname fields in the specified QName and returns a different QName object containing the upper-cased string values. * @param qname The QName to upper-case. 
protected	TokenNameprotected	
QName	TokenNameIdentifier	 Q Name
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
fQName	TokenNameIdentifier	 f Q Name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fQName	TokenNameIdentifier	 f Q Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// toUpperCase(QName):QName 	TokenNameCOMMENT_LINE	toUpperCase(QName):QName 
}	TokenNameRBRACE	
// class UpperCaseFilter 	TokenNameCOMMENT_LINE	class UpperCaseFilter 
