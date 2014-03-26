/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: KeyDeclaration.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: KeyDeclaration.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
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
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
/** * Holds the attribute declarations for the xsl:keys element. * A stylesheet declares a set of keys for each document using * the xsl:key element. When this set of keys contains a member * with node x, name y and value z, we say that node x has a key * with name y and value z. * @see <a href="http://www.w3.org/TR/xslt#key">key in XSLT Specification</a> * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Holds the attribute declarations for the xsl:keys element. A stylesheet declares a set of keys for each document using the xsl:key element. When this set of keys contains a member with node x, name y and value z, we say that node x has a key with name y and value z. @see <a href="http://www.w3.org/TR/xslt#key">key in XSLT Specification</a> @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
7724030248631137918L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructs a new element representing the xsl:key. The parameters * are needed to prioritize this key element as part of the recomposing * process. For this element, they are not automatically created * because the element is never added on to the stylesheet parent. */	TokenNameCOMMENT_JAVADOC	 Constructs a new element representing the xsl:key. The parameters are needed to prioritize this key element as part of the recomposing process. For this element, they are not automatically created because the element is never added on to the stylesheet parent. 
public	TokenNamepublic	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
parentNode	TokenNameIdentifier	 parent Node
,	TokenNameCOMMA	
int	TokenNameint	
docOrderNumber	TokenNameIdentifier	 doc Order Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_parentNode	TokenNameIdentifier	 m parent Node
=	TokenNameEQUAL	
parentNode	TokenNameIdentifier	 parent Node
;	TokenNameSEMICOLON	
setUid	TokenNameIdentifier	 set Uid
(	TokenNameLPAREN	
docOrderNumber	TokenNameIdentifier	 doc Order Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "name" property. * @serial */	TokenNameCOMMENT_JAVADOC	 The "name" property. @serial 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
/** * Set the "name" attribute. * The name attribute specifies the name of the key. The value * of the name attribute is a QName, which is expanded as * described in [2.4 Qualified Names]. * * @param name Value to set for the "name" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "name" attribute. The name attribute specifies the name of the key. The value of the name attribute is a QName, which is expanded as described in [2.4 Qualified Names]. * @param name Value to set for the "name" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "name" attribute. * The name attribute specifies the name of the key. The value * of the name attribute is a QName, which is expanded as * described in [2.4 Qualified Names]. * * @return Value of the "name" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "name" attribute. The name attribute specifies the name of the key. The value of the name attribute is a QName, which is expanded as described in [2.4 Qualified Names]. * @return Value of the "name" attribute. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return the element's name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return the element's name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_KEY_STRING	TokenNameIdentifier	 ELEMNAME  KEY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "match" attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The "match" attribute. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_matchPattern	TokenNameIdentifier	 m match Pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "match" attribute. * The match attribute is a Pattern; an xsl:key element gives * information about the keys of any node that matches the * pattern specified in the match attribute. * @see <a href="http://www.w3.org/TR/xslt#patterns">patterns in XSLT Specification</a> * * @param v Value to set for the "match" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "match" attribute. The match attribute is a Pattern; an xsl:key element gives information about the keys of any node that matches the pattern specified in the match attribute. @see <a href="http://www.w3.org/TR/xslt#patterns">patterns in XSLT Specification</a> * @param v Value to set for the "match" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_matchPattern	TokenNameIdentifier	 m match Pattern
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "match" attribute. * The match attribute is a Pattern; an xsl:key element gives * information about the keys of any node that matches the * pattern specified in the match attribute. * @see <a href="http://www.w3.org/TR/xslt#patterns">patterns in XSLT Specification</a> * * @return Value of the "match" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "match" attribute. The match attribute is a Pattern; an xsl:key element gives information about the keys of any node that matches the pattern specified in the match attribute. @see <a href="http://www.w3.org/TR/xslt#patterns">patterns in XSLT Specification</a> * @return Value of the "match" attribute. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_matchPattern	TokenNameIdentifier	 m match Pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The "use" attribute. * @serial */	TokenNameCOMMENT_JAVADOC	 The "use" attribute. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_use	TokenNameIdentifier	 m use
;	TokenNameSEMICOLON	
/** * Set the "use" attribute. * The use attribute is an expression specifying the values * of the key; the expression is evaluated once for each node * that matches the pattern. * * @param v Value to set for the "use" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "use" attribute. The use attribute is an expression specifying the values of the key; the expression is evaluated once for each node that matches the pattern. * @param v Value to set for the "use" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setUse	TokenNameIdentifier	 set Use
(	TokenNameLPAREN	
XPath	TokenNameIdentifier	 X Path
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_use	TokenNameIdentifier	 m use
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "use" attribute. * The use attribute is an expression specifying the values * of the key; the expression is evaluated once for each node * that matches the pattern. * * @return Value of the "use" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "use" attribute. The use attribute is an expression specifying the values of the key; the expression is evaluated once for each node that matches the pattern. * @return Value of the "use" attribute. 
public	TokenNamepublic	
XPath	TokenNameIdentifier	 X Path
getUse	TokenNameIdentifier	 get Use
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_use	TokenNameIdentifier	 m use
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an int constant identifying the type of element. * @see org.apache.xalan.templates.Constants * * @return The token ID for this element */	TokenNameCOMMENT_JAVADOC	 Get an int constant identifying the type of element. @see org.apache.xalan.templates.Constants * @return The token ID for this element 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_KEY	TokenNameIdentifier	 ELEMNAME  KEY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called after everything else has been * recomposed, and allows the template to set remaining * values that may be based on some other property that * depends on recomposition. */	TokenNameCOMMENT_JAVADOC	 This function is called after everything else has been recomposed, and allows the template to set remaining values that may be based on some other property that depends on recomposition. 
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vnames	TokenNameIdentifier	 vnames
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVariableNames	TokenNameIdentifier	 get Variable Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_matchPattern	TokenNameIdentifier	 m match Pattern
)	TokenNameRPAREN	
m_matchPattern	TokenNameIdentifier	 m match Pattern
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vnames	TokenNameIdentifier	 vnames
,	TokenNameCOMMA	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalsSize	TokenNameIdentifier	 get Globals Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_use	TokenNameIdentifier	 m use
)	TokenNameRPAREN	
m_use	TokenNameIdentifier	 m use
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vnames	TokenNameIdentifier	 vnames
,	TokenNameCOMMA	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGlobalsSize	TokenNameIdentifier	 get Globals Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is called during recomposition to * control how this element is composed. * @param root The root stylesheet for this transformation. */	TokenNameCOMMENT_JAVADOC	 This function is called during recomposition to control how this element is composed. @param root The root stylesheet for this transformation. 
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
recomposeKeys	TokenNameIdentifier	 recompose Keys
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
