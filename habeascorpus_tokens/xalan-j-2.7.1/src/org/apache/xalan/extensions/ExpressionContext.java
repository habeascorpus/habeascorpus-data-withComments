/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExpressionContext.java 468637 2006-10-28 06:51:02Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExpressionContext.java 468637 2006-10-28 06:51:02Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * An object that implements this interface can supply * information about the current XPath expression context. */	TokenNameCOMMENT_JAVADOC	 An object that implements this interface can supply information about the current XPath expression context. 
public	TokenNamepublic	
interface	TokenNameinterface	
ExpressionContext	TokenNameIdentifier	 Expression Context
{	TokenNameLBRACE	
/** * Get the current context node. * @return The current context node. */	TokenNameCOMMENT_JAVADOC	 Get the current context node. @return The current context node. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current context node list. * @return An iterator for the current context list, as * defined in XSLT. */	TokenNameCOMMENT_JAVADOC	 Get the current context node list. @return An iterator for the current context list, as defined in XSLT. 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
getContextNodes	TokenNameIdentifier	 get Context Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the error listener. * @return The registered error listener. */	TokenNameCOMMENT_JAVADOC	 Get the error listener. @return The registered error listener. 
public	TokenNamepublic	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the value of a node as a number. * @param n Node to be converted to a number. May be null. * @return value of n as a number. */	TokenNameCOMMENT_JAVADOC	 Get the value of a node as a number. @param n Node to be converted to a number. May be null. @return value of n as a number. 
public	TokenNamepublic	
double	TokenNamedouble	
toNumber	TokenNameIdentifier	 to Number
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the value of a node as a string. * @param n Node to be converted to a string. May be null. * @return value of n as a string, or an empty string if n is null. */	TokenNameCOMMENT_JAVADOC	 Get the value of a node as a string. @param n Node to be converted to a string. May be null. @return value of n as a string, or an empty string if n is null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get a variable based on it's qualified name. * * @param qname The qualified name of the variable. * * @return The evaluated value of the variable. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Get a variable based on it's qualified name. * @param qname The qualified name of the variable. * @return The evaluated value of the variable. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
/** * Get the XPathContext that owns this ExpressionContext. * * Note: exslt:function requires the XPathContext to access * the variable stack and TransformerImpl. * * @return The current XPathContext. * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Get the XPathContext that owns this ExpressionContext. * Note: exslt:function requires the XPathContext to access the variable stack and TransformerImpl. * @return The current XPathContext. @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
