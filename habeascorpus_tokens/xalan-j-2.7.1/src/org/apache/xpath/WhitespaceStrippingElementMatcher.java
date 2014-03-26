/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: WhitespaceStrippingElementMatcher.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: WhitespaceStrippingElementMatcher.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * A class that implements this interface can tell if a given element should * strip whitespace nodes from it's children. */	TokenNameCOMMENT_JAVADOC	 A class that implements this interface can tell if a given element should strip whitespace nodes from it's children. 
public	TokenNamepublic	
interface	TokenNameinterface	
WhitespaceStrippingElementMatcher	TokenNameIdentifier	 Whitespace Stripping Element Matcher
{	TokenNameLBRACE	
/** * Get information about whether or not an element should strip whitespace. * @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * * @param support The XPath runtime state. * @param targetElement Element to check * * @return true if the whitespace should be stripped. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Get information about whether or not an element should strip whitespace. @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * @param support The XPath runtime state. @param targetElement Element to check * @return true if the whitespace should be stripped. * @throws TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldStripWhiteSpace	TokenNameIdentifier	 should Strip White Space
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
support	TokenNameIdentifier	 support
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
targetElement	TokenNameIdentifier	 target Element
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
/** * Get information about whether or not whitespace can be stripped. * @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * * @return true if the whitespace can be stripped. */	TokenNameCOMMENT_JAVADOC	 Get information about whether or not whitespace can be stripped. @see <a href="http://www.w3.org/TR/xslt#strip">strip in XSLT Specification</a> * @return true if the whitespace can be stripped. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canStripWhiteSpace	TokenNameIdentifier	 can Strip White Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
