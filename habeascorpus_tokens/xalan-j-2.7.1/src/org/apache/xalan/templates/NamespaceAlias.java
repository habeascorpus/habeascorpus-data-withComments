/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NamespaceAlias.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NamespaceAlias.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
/** * Object to hold an xsl:namespace element. * A stylesheet can use the xsl:namespace-alias element to declare * that one namespace URI is an alias for another namespace URI. * @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> */	TokenNameCOMMENT_JAVADOC	 Object to hold an xsl:namespace element. A stylesheet can use the xsl:namespace-alias element to declare that one namespace URI is an alias for another namespace URI. @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> 
public	TokenNamepublic	
class	TokenNameclass	
NamespaceAlias	TokenNameIdentifier	 Namespace Alias
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
456173966637810718L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructor NamespaceAlias * * @param docOrderNumber The document order number * */	TokenNameCOMMENT_JAVADOC	 Constructor NamespaceAlias * @param docOrderNumber The document order number 
public	TokenNamepublic	
NamespaceAlias	TokenNameIdentifier	 Namespace Alias
(	TokenNameLPAREN	
int	TokenNameint	
docOrderNumber	TokenNameIdentifier	 doc Order Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_docOrderNumber	TokenNameIdentifier	 m doc Order Number
=	TokenNameEQUAL	
docOrderNumber	TokenNameIdentifier	 doc Order Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "stylesheet-prefix" attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The "stylesheet-prefix" attribute. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_StylesheetPrefix	TokenNameIdentifier	 m  Stylesheet Prefix
;	TokenNameSEMICOLON	
/** * Set the "stylesheet-prefix" attribute. * * @param v non-null prefix value. */	TokenNameCOMMENT_JAVADOC	 Set the "stylesheet-prefix" attribute. * @param v non-null prefix value. 
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheetPrefix	TokenNameIdentifier	 set Stylesheet Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_StylesheetPrefix	TokenNameIdentifier	 m  Stylesheet Prefix
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "stylesheet-prefix" attribute. * * @return non-null prefix value. */	TokenNameCOMMENT_JAVADOC	 Get the "stylesheet-prefix" attribute. * @return non-null prefix value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStylesheetPrefix	TokenNameIdentifier	 get Stylesheet Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_StylesheetPrefix	TokenNameIdentifier	 m  Stylesheet Prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The namespace in the stylesheet space. * @serial */	TokenNameCOMMENT_JAVADOC	 The namespace in the stylesheet space. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_StylesheetNamespace	TokenNameIdentifier	 m  Stylesheet Namespace
;	TokenNameSEMICOLON	
/** * Set the value for the stylesheet namespace. * * @param v non-null prefix value. */	TokenNameCOMMENT_JAVADOC	 Set the value for the stylesheet namespace. * @param v non-null prefix value. 
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheetNamespace	TokenNameIdentifier	 set Stylesheet Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_StylesheetNamespace	TokenNameIdentifier	 m  Stylesheet Namespace
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value for the stylesheet namespace. * * @return non-null prefix value. */	TokenNameCOMMENT_JAVADOC	 Get the value for the stylesheet namespace. * @return non-null prefix value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStylesheetNamespace	TokenNameIdentifier	 get Stylesheet Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_StylesheetNamespace	TokenNameIdentifier	 m  Stylesheet Namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "result-prefix" attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The "result-prefix" attribute. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_ResultPrefix	TokenNameIdentifier	 m  Result Prefix
;	TokenNameSEMICOLON	
/** * Set the "result-prefix" attribute. * * @param v non-null prefix value. */	TokenNameCOMMENT_JAVADOC	 Set the "result-prefix" attribute. * @param v non-null prefix value. 
public	TokenNamepublic	
void	TokenNamevoid	
setResultPrefix	TokenNameIdentifier	 set Result Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ResultPrefix	TokenNameIdentifier	 m  Result Prefix
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "result-prefix" attribute. * * @return non-null prefix value. */	TokenNameCOMMENT_JAVADOC	 Get the "result-prefix" attribute. * @return non-null prefix value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getResultPrefix	TokenNameIdentifier	 get Result Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_ResultPrefix	TokenNameIdentifier	 m  Result Prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The result namespace. * @serial */	TokenNameCOMMENT_JAVADOC	 The result namespace. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_ResultNamespace	TokenNameIdentifier	 m  Result Namespace
;	TokenNameSEMICOLON	
/** * Set the result namespace. * * @param v non-null namespace value */	TokenNameCOMMENT_JAVADOC	 Set the result namespace. * @param v non-null namespace value 
public	TokenNamepublic	
void	TokenNamevoid	
setResultNamespace	TokenNameIdentifier	 set Result Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ResultNamespace	TokenNameIdentifier	 m  Result Namespace
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the result namespace value. * * @return non-null namespace value. */	TokenNameCOMMENT_JAVADOC	 Get the result namespace value. * @return non-null namespace value. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getResultNamespace	TokenNameIdentifier	 get Result Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_ResultNamespace	TokenNameIdentifier	 m  Result Namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called to recompose() all of the namespace alias properties elements. * * @param root The owning root stylesheet */	TokenNameCOMMENT_JAVADOC	 This function is called to recompose() all of the namespace alias properties elements. * @param root The owning root stylesheet 
public	TokenNamepublic	
void	TokenNamevoid	
recompose	TokenNameIdentifier	 recompose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
recomposeNamespaceAliases	TokenNameIdentifier	 recompose Namespace Aliases
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
