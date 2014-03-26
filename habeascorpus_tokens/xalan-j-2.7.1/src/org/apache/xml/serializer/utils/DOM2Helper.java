/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOM2Helper.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOM2Helper.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class provides a DOM level 2 "helper", which provides services currently * not provided be the DOM standard. * * This class is a copy of the one in org.apache.xml.utils. * It exists to cut the serializers dependancy on that package. * * The differences from the original class are: * it doesn't extend DOMHelper, not depricated, * dropped method isNodeAfter(Node node1, Node node2) * dropped method parse(InputSource) * dropped method supportSAX() * dropped method setDocument(doc) * dropped method checkNode(Node) * dropped method getDocument() * dropped method getElementByID(String id, Document doc) * dropped method getParentOfNode(Node node) * dropped field Document m_doc; * made class non-public * * This class is not a public API, it is only public because it is * used in org.apache.xml.serializer. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class provides a DOM level 2 "helper", which provides services currently not provided be the DOM standard. * This class is a copy of the one in org.apache.xml.utils. It exists to cut the serializers dependancy on that package. * The differences from the original class are: it doesn't extend DOMHelper, not depricated, dropped method isNodeAfter(Node node1, Node node2) dropped method parse(InputSource) dropped method supportSAX() dropped method setDocument(doc) dropped method checkNode(Node) dropped method getDocument() dropped method getElementByID(String id, Document doc) dropped method getParentOfNode(Node node) dropped field Document m_doc; made class non-public * This class is not a public API, it is only public because it is used in org.apache.xml.serializer. * @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
{	TokenNameLBRACE	
/** * Construct an instance. */	TokenNameCOMMENT_JAVADOC	 Construct an instance. 
public	TokenNamepublic	
DOM2Helper	TokenNameIdentifier	 DO M2 Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the local name of the given node, as defined by the * XML Namespaces specification. This is prepared to handle documents * built using DOM Level 1 methods by falling back upon explicitly * parsing the node name. * * @param n Node to be examined * * @return String containing the local name, or null if the node * was not assigned a Namespace. */	TokenNameCOMMENT_JAVADOC	 Returns the local name of the given node, as defined by the XML Namespaces specification. This is prepared to handle documents built using DOM Level 1 methods by falling back upon explicitly parsing the node name. * @param n Node to be examined * @return String containing the local name, or null if the node was not assigned a Namespace. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalNameOfNode	TokenNameIdentifier	 get Local Name Of Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getLocalNameOfNodeFallback	TokenNameIdentifier	 get Local Name Of Node Fallback
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local name of the given node. If the node's name begins * with a namespace prefix, this is the part after the colon; otherwise * it's the full node name. * * This method is copied from org.apache.xml.utils.DOMHelper * * @param n the node to be examined. * * @return String containing the Local Name */	TokenNameCOMMENT_JAVADOC	 Returns the local name of the given node. If the node's name begins with a namespace prefix, this is the part after the colon; otherwise it's the full node name. * This method is copied from org.apache.xml.utils.DOMHelper * @param n the node to be examined. * @return String containing the Local Name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getLocalNameOfNodeFallback	TokenNameIdentifier	 get Local Name Of Node Fallback
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
:	TokenNameCOLON	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Namespace Name (Namespace URI) for the given node. * In a Level 2 DOM, you can ask the node itself. Note, however, that * doing so conflicts with our decision in getLocalNameOfNode not * to trust the that the DOM was indeed created using the Level 2 * methods. If Level 1 methods were used, these two functions will * disagree with each other. * <p> * TODO: Reconcile with getLocalNameOfNode. * * @param n Node to be examined * * @return String containing the Namespace URI bound to this DOM node * at the time the Node was created. */	TokenNameCOMMENT_JAVADOC	 Returns the Namespace Name (Namespace URI) for the given node. In a Level 2 DOM, you can ask the node itself. Note, however, that doing so conflicts with our decision in getLocalNameOfNode not to trust the that the DOM was indeed created using the Level 2 methods. If Level 1 methods were used, these two functions will disagree with each other. <p> TODO: Reconcile with getLocalNameOfNode. * @param n Node to be examined * @return String containing the Namespace URI bound to this DOM node at the time the Node was created. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceOfNode	TokenNameIdentifier	 get Namespace Of Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Field m_useDOM2getNamespaceURI is a compile-time flag which * gates some of the parser options used to build a DOM -- but * that code is commented out at this time and nobody else * references it, so I've commented this out as well. */	TokenNameCOMMENT_JAVADOC	 Field m_useDOM2getNamespaceURI is a compile-time flag which gates some of the parser options used to build a DOM -- but that code is commented out at this time and nobody else references it, so I've commented this out as well. 
//private boolean m_useDOM2getNamespaceURI = false; 	TokenNameCOMMENT_LINE	private boolean m_useDOM2getNamespaceURI = false; 
}	TokenNameRBRACE	
