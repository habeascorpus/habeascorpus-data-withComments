/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
CDATASection	TokenNameIdentifier	 CDATA Section
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
/** * XML provides the CDATA markup to allow a region of text in which * most of the XML delimiter recognition does not take place. This is * intended to ease the task of quoting XML fragments and other * programmatic information in a document's text without needing to * escape these special characters. It's primarily a convenience feature * for those who are hand-editing XML. * <P> * CDATASection is an Extended DOM feature, and is not used in HTML * contexts. * <P> * Within the DOM, CDATASections are treated essentially as Text * blocks. Their distinct type is retained in order to allow us to * properly recreate the XML syntax when we write them out. * <P> * Reminder: CDATA IS NOT A COMPLETELY GENERAL SOLUTION; it can't * quote its own end-of-block marking. If you need to write out a * CDATA that contains the ]]> sequence, it's your responsibility to * split that string over two successive CDATAs at that time. * <P> * CDATA does not participate in Element.normalize() processing. * * @xerces.internal * * @version $Id: CDATASectionImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ * @since PR-DOM-Level-1-19980818. */	TokenNameCOMMENT_JAVADOC	 XML provides the CDATA markup to allow a region of text in which most of the XML delimiter recognition does not take place. This is intended to ease the task of quoting XML fragments and other programmatic information in a document's text without needing to escape these special characters. It's primarily a convenience feature for those who are hand-editing XML. <P> CDATASection is an Extended DOM feature, and is not used in HTML contexts. <P> Within the DOM, CDATASections are treated essentially as Text blocks. Their distinct type is retained in order to allow us to properly recreate the XML syntax when we write them out. <P> Reminder: CDATA IS NOT A COMPLETELY GENERAL SOLUTION; it can't quote its own end-of-block marking. If you need to write out a CDATA that contains the ]]> sequence, it's your responsibility to split that string over two successive CDATAs at that time. <P> CDATA does not participate in Element.normalize() processing. * @xerces.internal * @version $Id: CDATASectionImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ @since PR-DOM-Level-1-19980818. 
public	TokenNamepublic	
class	TokenNameclass	
CDATASectionImpl	TokenNameIdentifier	 CDATA Section Impl
extends	TokenNameextends	
TextImpl	TokenNameIdentifier	 Text Impl
implements	TokenNameimplements	
CDATASection	TokenNameIdentifier	 CDATA Section
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2372071297878177780L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Factory constructor for creating a CDATA section. */	TokenNameCOMMENT_JAVADOC	 Factory constructor for creating a CDATA section. 
public	TokenNamepublic	
CDATASectionImpl	TokenNameIdentifier	 CDATA Section Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDoc	TokenNameIdentifier	 owner Doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDoc	TokenNameIdentifier	 owner Doc
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
/** * A short integer indicating what type of node this is. The named * constants for this value are defined in the org.w3c.dom.Node interface. */	TokenNameCOMMENT_JAVADOC	 A short integer indicating what type of node this is. The named constants for this value are defined in the org.w3c.dom.Node interface. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the node name. */	TokenNameCOMMENT_JAVADOC	 Returns the node name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#cdata-section"	TokenNameStringLiteral	#cdata-section
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class CDATASectionImpl 	TokenNameCOMMENT_LINE	class CDATASectionImpl 
