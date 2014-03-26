/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemTemplate.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemTemplate.java 468643 2006-10-28 06:56:03Z minchau $ 
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
/** * Implement xsl:template. * <pre> * <!ELEMENT xsl:template * (#PCDATA * %instructions; * %result-elements; * | xsl:param) * > * * <!ATTLIST xsl:template * match %pattern; #IMPLIED * name %qname; #IMPLIED * priority %priority; #IMPLIED * mode %qname; #IMPLIED * %space-att; * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:template. <pre> <!ELEMENT xsl:template (#PCDATA %instructions; %result-elements; | xsl:param) > * <!ATTLIST xsl:template match %pattern; #IMPLIED name %qname; #IMPLIED priority %priority; #IMPLIED mode %qname; #IMPLIED %space-att; > </pre> @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemTemplate	TokenNameIdentifier	 Elem Template
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5283056789965384058L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The public identifier for the current document event. * @serial */	TokenNameCOMMENT_JAVADOC	 The public identifier for the current document event. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_publicId	TokenNameIdentifier	 m public Id
;	TokenNameSEMICOLON	
/** The system identifier for the current document event. * @serial */	TokenNameCOMMENT_JAVADOC	 The system identifier for the current document event. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_systemId	TokenNameIdentifier	 m system Id
;	TokenNameSEMICOLON	
/** * Return the public identifier for the current document event. * <p>This will be the public identifier * @return A string containing the public identifier, or * null if none is available. * @see #getSystemId */	TokenNameCOMMENT_JAVADOC	 Return the public identifier for the current document event. <p>This will be the public identifier @return A string containing the public identifier, or null if none is available. @see #getSystemId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_publicId	TokenNameIdentifier	 m public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the system identifier for the current document event. * * <p>If the system identifier is a URL, the parser must resolve it * fully before passing it to the application.</p> * * @return A string containing the system identifier, or null * if none is available. * @see #getPublicId */	TokenNameCOMMENT_JAVADOC	 Return the system identifier for the current document event. * <p>If the system identifier is a URL, the parser must resolve it fully before passing it to the application.</p> * @return A string containing the system identifier, or null if none is available. @see #getPublicId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_systemId	TokenNameIdentifier	 m system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the location information for this element. * * @param locator SourceLocator holding location information */	TokenNameCOMMENT_JAVADOC	 Set the location information for this element. * @param locator SourceLocator holding location information 
public	TokenNamepublic	
void	TokenNamevoid	
setLocaterInfo	TokenNameIdentifier	 set Locater Info
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_publicId	TokenNameIdentifier	 m public Id
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_systemId	TokenNameIdentifier	 m system Id
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setLocaterInfo	TokenNameIdentifier	 set Locater Info
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The owning stylesheet. * (Should this only be put on the template element, to * conserve space?) * @serial */	TokenNameCOMMENT_JAVADOC	 The owning stylesheet. (Should this only be put on the template element, to conserve space?) @serial 
private	TokenNameprivate	
Stylesheet	TokenNameIdentifier	 Stylesheet
m_stylesheet	TokenNameIdentifier	 m stylesheet
;	TokenNameSEMICOLON	
/** * Get the stylesheet composed (resolves includes and * imports and has methods on it that return "composed" properties. * * @return The stylesheet composed. */	TokenNameCOMMENT_JAVADOC	 Get the stylesheet composed (resolves includes and imports and has methods on it that return "composed" properties. * @return The stylesheet composed. 
public	TokenNamepublic	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
getStylesheetComposed	TokenNameIdentifier	 get Stylesheet Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stylesheet	TokenNameIdentifier	 m stylesheet
.	TokenNameDOT	
getStylesheetComposed	TokenNameIdentifier	 get Stylesheet Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the owning stylesheet. * * @return The owning stylesheet. */	TokenNameCOMMENT_JAVADOC	 Get the owning stylesheet. * @return The owning stylesheet. 
public	TokenNamepublic	
Stylesheet	TokenNameIdentifier	 Stylesheet
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stylesheet	TokenNameIdentifier	 m stylesheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the owning stylesheet. * * @param sheet The owning stylesheet for this element */	TokenNameCOMMENT_JAVADOC	 Set the owning stylesheet. * @param sheet The owning stylesheet for this element 
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheet	TokenNameIdentifier	 set Stylesheet
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
sheet	TokenNameIdentifier	 sheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_stylesheet	TokenNameIdentifier	 m stylesheet
=	TokenNameEQUAL	
sheet	TokenNameIdentifier	 sheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the root stylesheet. * * @return The root stylesheet for this element */	TokenNameCOMMENT_JAVADOC	 Get the root stylesheet. * @return The root stylesheet for this element 
public	TokenNamepublic	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_stylesheet	TokenNameIdentifier	 m stylesheet
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The match attribute is a Pattern that identifies the source * node or nodes to which the rule applies. * @serial */	TokenNameCOMMENT_JAVADOC	 The match attribute is a Pattern that identifies the source node or nodes to which the rule applies. @serial 
private	TokenNameprivate	
XPath	TokenNameIdentifier	 X Path
m_matchPattern	TokenNameIdentifier	 m match Pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "match" attribute. * The match attribute is a Pattern that identifies the source * node or nodes to which the rule applies. The match attribute * is required unless the xsl:template element has a name * attribute (see [6 Named Templates]). It is an error for the * value of the match attribute to contain a VariableReference. * @see <a href="http://www.w3.org/TR/xslt#patterns">patterns in XSLT Specification</a> * * @param v Value to set for the "match" attribute */	TokenNameCOMMENT_JAVADOC	 Set the "match" attribute. The match attribute is a Pattern that identifies the source node or nodes to which the rule applies. The match attribute is required unless the xsl:template element has a name attribute (see [6 Named Templates]). It is an error for the value of the match attribute to contain a VariableReference. @see <a href="http://www.w3.org/TR/xslt#patterns">patterns in XSLT Specification</a> * @param v Value to set for the "match" attribute 
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
/** * Get the "match" attribute. * The match attribute is a Pattern that identifies the source * node or nodes to which the rule applies. The match attribute * is required unless the xsl:template element has a name * attribute (see [6 Named Templates]). It is an error for the * value of the match attribute to contain a VariableReference. * @see <a href="http://www.w3.org/TR/xslt#patterns">patterns in XSLT Specification</a> * * @return Value of the "match" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "match" attribute. The match attribute is a Pattern that identifies the source node or nodes to which the rule applies. The match attribute is required unless the xsl:template element has a name attribute (see [6 Named Templates]). It is an error for the value of the match attribute to contain a VariableReference. @see <a href="http://www.w3.org/TR/xslt#patterns">patterns in XSLT Specification</a> * @return Value of the "match" attribute 
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
/** * An xsl:template element with a name attribute specifies a named template. * @serial */	TokenNameCOMMENT_JAVADOC	 An xsl:template element with a name attribute specifies a named template. @serial 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "name" attribute. * An xsl:template element with a name attribute specifies a named template. * If an xsl:template element has a name attribute, it may, but need not, * also have a match attribute. * @see <a href="http://www.w3.org/TR/xslt#named-templates">named-templates in XSLT Specification</a> * * @param v Value to set the "name" attribute */	TokenNameCOMMENT_JAVADOC	 Set the "name" attribute. An xsl:template element with a name attribute specifies a named template. If an xsl:template element has a name attribute, it may, but need not, also have a match attribute. @see <a href="http://www.w3.org/TR/xslt#named-templates">named-templates in XSLT Specification</a> * @param v Value to set the "name" attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "name" attribute. * An xsl:template element with a name attribute specifies a named template. * If an xsl:template element has a name attribute, it may, but need not, * also have a match attribute. * @see <a href="http://www.w3.org/TR/xslt#named-templates">named-templates in XSLT Specification</a> * * @return Value of the "name" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "name" attribute. An xsl:template element with a name attribute specifies a named template. If an xsl:template element has a name attribute, it may, but need not, also have a match attribute. @see <a href="http://www.w3.org/TR/xslt#named-templates">named-templates in XSLT Specification</a> * @return Value of the "name" attribute 
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
/** * Modes allow an element to be processed multiple times, * each time producing a different result. * @serial */	TokenNameCOMMENT_JAVADOC	 Modes allow an element to be processed multiple times, each time producing a different result. @serial 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
m_mode	TokenNameIdentifier	 m mode
;	TokenNameSEMICOLON	
/** * Set the "mode" attribute. * Modes allow an element to be processed multiple times, * each time producing a different result. If xsl:template * does not have a match attribute, it must not have a mode attribute. * @see <a href="http://www.w3.org/TR/xslt#modes">modes in XSLT Specification</a> * * @param v Value to set the "mode" attribute */	TokenNameCOMMENT_JAVADOC	 Set the "mode" attribute. Modes allow an element to be processed multiple times, each time producing a different result. If xsl:template does not have a match attribute, it must not have a mode attribute. @see <a href="http://www.w3.org/TR/xslt#modes">modes in XSLT Specification</a> * @param v Value to set the "mode" attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setMode	TokenNameIdentifier	 set Mode
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mode	TokenNameIdentifier	 m mode
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "mode" attribute. * Modes allow an element to be processed multiple times, * each time producing a different result. If xsl:template * does not have a match attribute, it must not have a mode attribute. * @see <a href="http://www.w3.org/TR/xslt#modes">modes in XSLT Specification</a> * * @return Value of the "mode" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "mode" attribute. Modes allow an element to be processed multiple times, each time producing a different result. If xsl:template does not have a match attribute, it must not have a mode attribute. @see <a href="http://www.w3.org/TR/xslt#modes">modes in XSLT Specification</a> * @return Value of the "mode" attribute 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_mode	TokenNameIdentifier	 m mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The priority of a template rule is specified by the priority * attribute on the template rule. * @serial */	TokenNameCOMMENT_JAVADOC	 The priority of a template rule is specified by the priority attribute on the template rule. @serial 
private	TokenNameprivate	
double	TokenNamedouble	
m_priority	TokenNameIdentifier	 m priority
=	TokenNameEQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH_SCORE_NONE	TokenNameIdentifier	 MATCH  SCORE  NONE
;	TokenNameSEMICOLON	
/** * Set the "priority" attribute. * The priority of a template rule is specified by the priority * attribute on the template rule. The value of this must be a * real number (positive or negative), matching the production * Number with an optional leading minus sign (-). * @see <a href="http://www.w3.org/TR/xslt#conflict">conflict in XSLT Specification</a> * * @param v The value to set for the "priority" attribute */	TokenNameCOMMENT_JAVADOC	 Set the "priority" attribute. The priority of a template rule is specified by the priority attribute on the template rule. The value of this must be a real number (positive or negative), matching the production Number with an optional leading minus sign (-). @see <a href="http://www.w3.org/TR/xslt#conflict">conflict in XSLT Specification</a> * @param v The value to set for the "priority" attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_priority	TokenNameIdentifier	 m priority
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "priority" attribute. * The priority of a template rule is specified by the priority * attribute on the template rule. The value of this must be a * real number (positive or negative), matching the production * Number with an optional leading minus sign (-). * @see <a href="http://www.w3.org/TR/xslt#conflict">conflict in XSLT Specification</a> * * @return The value of the "priority" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "priority" attribute. The priority of a template rule is specified by the priority attribute on the template rule. The value of this must be a real number (positive or negative), matching the production Number with an optional leading minus sign (-). @see <a href="http://www.w3.org/TR/xslt#conflict">conflict in XSLT Specification</a> * @return The value of the "priority" attribute 
public	TokenNamepublic	
double	TokenNamedouble	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_priority	TokenNameIdentifier	 m priority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an int constant identifying the type of element. * @see org.apache.xalan.templates.Constants * * @return The token ID for the element */	TokenNameCOMMENT_JAVADOC	 Get an int constant identifying the type of element. @see org.apache.xalan.templates.Constants * @return The token ID for the element 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return The element's name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return The element's name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE_STRING	TokenNameIdentifier	 ELEMNAME  TEMPLATE  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The stack frame size for this template, which is equal to the maximum number * of params and variables that can be declared in the template at one time. */	TokenNameCOMMENT_JAVADOC	 The stack frame size for this template, which is equal to the maximum number of params and variables that can be declared in the template at one time. 
public	TokenNamepublic	
int	TokenNameint	
m_frameSize	TokenNameIdentifier	 m frame Size
;	TokenNameSEMICOLON	
/** * The size of the portion of the stack frame that can hold parameter * arguments. */	TokenNameCOMMENT_JAVADOC	 The size of the portion of the stack frame that can hold parameter arguments. 
int	TokenNameint	
m_inArgsSize	TokenNameIdentifier	 m in Args Size
;	TokenNameSEMICOLON	
/** * List of namespace/local-name pairs, DTM style, that are unique * qname identifiers for the arguments. The position of a given qname * in the list is the argument ID, and thus the position in the stack * frame. */	TokenNameCOMMENT_JAVADOC	 List of namespace/local-name pairs, DTM style, that are unique qname identifiers for the arguments. The position of a given qname in the list is the argument ID, and thus the position in the stack frame. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_argsQNameIDs	TokenNameIdentifier	 m args Q Name I Ds
;	TokenNameSEMICOLON	
/** * This function is called after everything else has been * recomposed, and allows the template to set remaining * values that may be based on some other property that * depends on recomposition. */	TokenNameCOMMENT_JAVADOC	 This function is called after everything else has been recomposed, and allows the template to set remaining values that may be based on some other property that depends on recomposition. 
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
.	TokenNameDOT	
ComposeState	TokenNameIdentifier	 Compose State
cstate	TokenNameIdentifier	 cstate
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vnames	TokenNameIdentifier	 vnames
=	TokenNameEQUAL	
cstate	TokenNameIdentifier	 cstate
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
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
resetStackFrameSize	TokenNameIdentifier	 reset Stack Frame Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_inArgsSize	TokenNameIdentifier	 m in Args Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This after the template's children have been composed. */	TokenNameCOMMENT_JAVADOC	 This after the template's children have been composed. 
public	TokenNamepublic	
void	TokenNamevoid	
endCompose	TokenNameIdentifier	 end Compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
.	TokenNameDOT	
ComposeState	TokenNameIdentifier	 Compose State
cstate	TokenNameIdentifier	 cstate
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getComposeState	TokenNameIdentifier	 get Compose State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
endCompose	TokenNameIdentifier	 end Compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_frameSize	TokenNameIdentifier	 m frame Size
=	TokenNameEQUAL	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
getFrameSize	TokenNameIdentifier	 get Frame Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cstate	TokenNameIdentifier	 cstate
.	TokenNameDOT	
resetStackFrameSize	TokenNameIdentifier	 reset Stack Frame Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy the template contents into the result tree. * The content of the xsl:template element is the template * that is instantiated when the template rule is applied. * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Copy the template contents into the result tree. The content of the xsl:template element is the template that is instantiated when the template rule is applied. * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getStackGuard	TokenNameIdentifier	 get Stack Guard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
checkForInfinateLoop	TokenNameIdentifier	 check For Infinate Loop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushRTFContext	TokenNameIdentifier	 push RTF Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %REVIEW% commenting out of the code below. 	TokenNameCOMMENT_LINE	%REVIEW% commenting out of the code below. 
// if (null != sourceNode) 	TokenNameCOMMENT_LINE	if (null != sourceNode) 
// { 	TokenNameCOMMENT_LINE	{ 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// } 	TokenNameCOMMENT_LINE	} 
// else // if(null == sourceNode) 	TokenNameCOMMENT_LINE	else // if(null == sourceNode) 
// { 	TokenNameCOMMENT_LINE	{ 
// transformer.getMsgMgr().error(this, 	TokenNameCOMMENT_LINE	transformer.getMsgMgr().error(this, 
// this, sourceNode, 	TokenNameCOMMENT_LINE	this, sourceNode, 
// XSLTErrorResources.ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES); 	TokenNameCOMMENT_LINE	XSLTErrorResources.ER_NULL_SOURCENODE_HANDLEAPPLYTEMPLATES); 
// 	TokenNameCOMMENT_LINE	 
// //"sourceNode is null in handleApplyTemplatesInstruction!"); 	TokenNameCOMMENT_LINE	//"sourceNode is null in handleApplyTemplatesInstruction!"); 
// } 	TokenNameCOMMENT_LINE	} 
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popRTFContext	TokenNameIdentifier	 pop RTF Context
(	TokenNameLPAREN	
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
recomposeTemplates	TokenNameIdentifier	 recompose Templates
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
