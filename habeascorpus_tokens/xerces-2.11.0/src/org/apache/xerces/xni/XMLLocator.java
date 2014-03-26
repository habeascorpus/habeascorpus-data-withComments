/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
;	TokenNameSEMICOLON	
/** * Location information. * * @author Andy Clark, IBM * * @version $Id: XMLLocator.java 447247 2006-09-18 05:23:52Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Location information. * @author Andy Clark, IBM * @version $Id: XMLLocator.java 447247 2006-09-18 05:23:52Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLLocator	TokenNameIdentifier	 XML Locator
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLLocator methods 	TokenNameCOMMENT_LINE	XMLLocator methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the public identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the public identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the literal system identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the literal system identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the base system identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the base system identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the expanded system identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the expanded system identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the line number, or <code>-1</code> if no line number is available. */	TokenNameCOMMENT_JAVADOC	 Returns the line number, or <code>-1</code> if no line number is available. 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the column number, or <code>-1</code> if no column number is available. */	TokenNameCOMMENT_JAVADOC	 Returns the column number, or <code>-1</code> if no column number is available. 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the character offset, or <code>-1</code> if no character offset is available. */	TokenNameCOMMENT_JAVADOC	 Returns the character offset, or <code>-1</code> if no character offset is available. 
public	TokenNamepublic	
int	TokenNameint	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the encoding of the current entity. * Note that, for a given entity, this value can only be * considered final once the encoding declaration has been read (or once it * has been determined that there is no such declaration) since, no encoding * having been specified on the XMLInputSource, the parser * will make an initial "guess" which could be in error. */	TokenNameCOMMENT_JAVADOC	 Returns the encoding of the current entity. Note that, for a given entity, this value can only be considered final once the encoding declaration has been read (or once it has been determined that there is no such declaration) since, no encoding having been specified on the XMLInputSource, the parser will make an initial "guess" which could be in error. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the XML version of the current entity. This will normally be the * value from the XML or text declaration or defaulted by the parser. Note that * that this value may be different than the version of the processing rules * applied to the current entity. For instance, an XML 1.1 document may refer to * XML 1.0 entities. In such a case the rules of XML 1.1 are applied to the entire * document. Also note that, for a given entity, this value can only be considered * final once the XML or text declaration has been read or once it has been * determined that there is no such declaration. */	TokenNameCOMMENT_JAVADOC	 Returns the XML version of the current entity. This will normally be the value from the XML or text declaration or defaulted by the parser. Note that that this value may be different than the version of the processing rules applied to the current entity. For instance, an XML 1.1 document may refer to XML 1.0 entities. In such a case the rules of XML 1.1 are applied to the entire document. Also note that, for a given entity, this value can only be considered final once the XML or text declaration has been read or once it has been determined that there is no such declaration. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXMLVersion	TokenNameIdentifier	 get XML Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLLocator 	TokenNameCOMMENT_LINE	interface XMLLocator 
