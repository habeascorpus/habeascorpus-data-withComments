/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPathFactory.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XPathFactory.java 468655 2006-10-28 07:12:06Z minchau $ 
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
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
;	TokenNameSEMICOLON	
/** * Factory class for creating an XPath. Implementors of XPath derivatives * will need to make a derived class of this. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Factory class for creating an XPath. Implementors of XPath derivatives will need to make a derived class of this. @xsl.usage advanced 
public	TokenNamepublic	
interface	TokenNameinterface	
XPathFactory	TokenNameIdentifier	 X Path Factory
{	TokenNameLBRACE	
/** * Create an XPath. * * @param exprString The XPath expression string. * @param locator The location of the expression string, mainly for diagnostic * purposes. * @param prefixResolver This will be called in order to resolve prefixes * to namespace URIs. * @param type One of {@link org.apache.xpath.XPath#SELECT} or * {@link org.apache.xpath.XPath#MATCH}. * * @return an XPath ready for execution. */	TokenNameCOMMENT_JAVADOC	 Create an XPath. * @param exprString The XPath expression string. @param locator The location of the expression string, mainly for diagnostic purposes. @param prefixResolver This will be called in order to resolve prefixes to namespace URIs. @param type One of {@link org.apache.xpath.XPath#SELECT} or {@link org.apache.xpath.XPath#MATCH}. * @return an XPath ready for execution. 
XPath	TokenNameIdentifier	 X Path
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
exprString	TokenNameIdentifier	 expr String
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
