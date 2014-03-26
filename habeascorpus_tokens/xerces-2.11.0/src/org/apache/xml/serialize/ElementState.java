/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** * Holds the state of the currently serialized element. * * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended * that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation * API for XML (TrAX) for serializing XML. See the Xerces documentation for more * information. * @version $Revision: 476047 $ $Date: 2006-11-16 23:27:45 -0500 (Thu, 16 Nov 2006) $ * @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> * @see BaseMarkupSerializer */	TokenNameCOMMENT_JAVADOC	 Holds the state of the currently serialized element. * @deprecated This class was deprecated in Xerces 2.9.0. It is recommended that new applications use the DOM Level 3 LSSerializer or JAXP's Transformation API for XML (TrAX) for serializing XML. See the Xerces documentation for more information. @version $Revision: 476047 $ $Date: 2006-11-16 23:27:45 -0500 (Thu, 16 Nov 2006) $ @author <a href="mailto:arkin@intalio.com">Assaf Arkin</a> @see BaseMarkupSerializer 
public	TokenNamepublic	
class	TokenNameclass	
ElementState	TokenNameIdentifier	 Element State
{	TokenNameLBRACE	
/** * The element's raw tag name (local or prefix:local). */	TokenNameCOMMENT_JAVADOC	 The element's raw tag name (local or prefix:local). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
;	TokenNameSEMICOLON	
/** * The element's local tag name. */	TokenNameCOMMENT_JAVADOC	 The element's local tag name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
/** * The element's namespace URI. */	TokenNameCOMMENT_JAVADOC	 The element's namespace URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * True if element is space preserving. */	TokenNameCOMMENT_JAVADOC	 True if element is space preserving. 
public	TokenNamepublic	
boolean	TokenNameboolean	
preserveSpace	TokenNameIdentifier	 preserve Space
;	TokenNameSEMICOLON	
/** * True if element is empty. Turns false immediately * after serializing the first contents of the element. */	TokenNameCOMMENT_JAVADOC	 True if element is empty. Turns false immediately after serializing the first contents of the element. 
public	TokenNamepublic	
boolean	TokenNameboolean	
empty	TokenNameIdentifier	 empty
;	TokenNameSEMICOLON	
/** * True if the last serialized node was an element node. */	TokenNameCOMMENT_JAVADOC	 True if the last serialized node was an element node. 
public	TokenNamepublic	
boolean	TokenNameboolean	
afterElement	TokenNameIdentifier	 after Element
;	TokenNameSEMICOLON	
/** * True if the last serialized node was a comment node. */	TokenNameCOMMENT_JAVADOC	 True if the last serialized node was a comment node. 
public	TokenNamepublic	
boolean	TokenNameboolean	
afterComment	TokenNameIdentifier	 after Comment
;	TokenNameSEMICOLON	
/** * True if textual content of current element should be * serialized as CDATA section. */	TokenNameCOMMENT_JAVADOC	 True if textual content of current element should be serialized as CDATA section. 
public	TokenNamepublic	
boolean	TokenNameboolean	
doCData	TokenNameIdentifier	 do C Data
;	TokenNameSEMICOLON	
/** * True if textual content of current element should be * serialized as raw characters (unescaped). */	TokenNameCOMMENT_JAVADOC	 True if textual content of current element should be serialized as raw characters (unescaped). 
public	TokenNamepublic	
boolean	TokenNameboolean	
unescaped	TokenNameIdentifier	 unescaped
;	TokenNameSEMICOLON	
/** * True while inside CData and printing text as CData. */	TokenNameCOMMENT_JAVADOC	 True while inside CData and printing text as CData. 
public	TokenNamepublic	
boolean	TokenNameboolean	
inCData	TokenNameIdentifier	 in C Data
;	TokenNameSEMICOLON	
/** * Association between namespace URIs (keys) and prefixes (values). */	TokenNameCOMMENT_JAVADOC	 Association between namespace URIs (keys) and prefixes (values). 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
prefixes	TokenNameIdentifier	 prefixes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
