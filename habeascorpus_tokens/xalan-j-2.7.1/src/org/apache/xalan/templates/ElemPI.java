/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemPI.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemPI.java 468643 2006-10-28 06:56:03Z minchau $ 
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
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
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
XML11Char	TokenNameIdentifier	 XM L11 Char
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
/** * Implement xsl:processing-instruction. * <pre> * <!ELEMENT xsl:processing-instruction %char-template;> * <!ATTLIST xsl:processing-instruction * name %avt; #REQUIRED * %space-att; * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#section-Creating-Processing-Instructions">section-Creating-Processing-Instructions in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:processing-instruction. <pre> <!ELEMENT xsl:processing-instruction %char-template;> <!ATTLIST xsl:processing-instruction name %avt; #REQUIRED %space-att; > </pre> @see <a href="http://www.w3.org/TR/xslt#section-Creating-Processing-Instructions">section-Creating-Processing-Instructions in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemPI	TokenNameIdentifier	 Elem PI
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5621976448020889825L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The xsl:processing-instruction element has a required name * attribute that specifies the name of the processing instruction node. * The value of the name attribute is interpreted as an * attribute value template. * @serial */	TokenNameCOMMENT_JAVADOC	 The xsl:processing-instruction element has a required name attribute that specifies the name of the processing instruction node. The value of the name attribute is interpreted as an attribute value template. @serial 
private	TokenNameprivate	
AVT	TokenNameIdentifier	 AVT
m_name_atv	TokenNameIdentifier	 m name atv
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the "name" attribute. * DJD * * @param v Value for the name attribute */	TokenNameCOMMENT_JAVADOC	 Set the "name" attribute. DJD * @param v Value for the name attribute 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
AVT	TokenNameIdentifier	 AVT
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_name_atv	TokenNameIdentifier	 m name atv
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "name" attribute. * DJD * * @return The value of the "name" attribute */	TokenNameCOMMENT_JAVADOC	 Get the "name" attribute. DJD * @return The value of the "name" attribute 
public	TokenNamepublic	
AVT	TokenNameIdentifier	 AVT
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_name_atv	TokenNameIdentifier	 m name atv
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
m_name_atv	TokenNameIdentifier	 m name atv
)	TokenNameRPAREN	
m_name_atv	TokenNameIdentifier	 m name atv
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
ELEMNAME_PI	TokenNameIdentifier	 ELEMNAME  PI
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
ELEMNAME_PI_STRING	TokenNameIdentifier	 ELEMNAME  PI  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a processing instruction in the result tree. * The content of the xsl:processing-instruction element is a * template for the string-value of the processing instruction node. * @see <a href="http://www.w3.org/TR/xslt#section-Creating-Processing-Instructions">section-Creating-Processing-Instructions in XSLT Specification</a> * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a processing instruction in the result tree. The content of the xsl:processing-instruction element is a template for the string-value of the processing instruction node. @see <a href="http://www.w3.org/TR/xslt#section-Creating-Processing-Instructions">section-Creating-Processing-Instructions in XSLT Specification</a> * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
piName	TokenNameIdentifier	 pi Name
=	TokenNameEQUAL	
m_name_atv	TokenNameIdentifier	 m name atv
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
m_name_atv	TokenNameIdentifier	 m name atv
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ignore processing instruction if name is null 	TokenNameCOMMENT_LINE	Ignore processing instruction if name is null 
if	TokenNameif	
(	TokenNameLPAREN	
piName	TokenNameIdentifier	 pi Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
piName	TokenNameIdentifier	 pi Name
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
WG_PROCESSINGINSTRUCTION_NAME_CANT_BE_XML	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NAME  CANT  BE  XML
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRNAME_NAME	TokenNameIdentifier	 ATTRNAME  NAME
,	TokenNameCOMMA	
piName	TokenNameIdentifier	 pi Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Only check if an avt was used (ie. this wasn't checked at compose time.) 	TokenNameCOMMENT_LINE	Only check if an avt was used (ie. this wasn't checked at compose time.) 
// Ignore processing instruction, if invalid 	TokenNameCOMMENT_LINE	Ignore processing instruction, if invalid 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_name_atv	TokenNameIdentifier	 m name atv
.	TokenNameDOT	
isSimple	TokenNameIdentifier	 is Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
piName	TokenNameIdentifier	 pi Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
WG_PROCESSINGINSTRUCTION_NOTVALID_NCNAME	TokenNameIdentifier	 WG  PROCESSINGINSTRUCTION  NOTVALID  NCNAME
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRNAME_NAME	TokenNameIdentifier	 ATTRNAME  NAME
,	TokenNameCOMMA	
piName	TokenNameIdentifier	 pi Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Note the content model is: 	TokenNameCOMMENT_LINE	Note the content model is: 
// <!ENTITY % instructions " 	TokenNameCOMMENT_LINE	<!ENTITY % instructions " 
// %char-instructions; 	TokenNameCOMMENT_LINE	%char-instructions; 
// | xsl:processing-instruction 	TokenNameCOMMENT_LINE	| xsl:processing-instruction 
// | xsl:comment 	TokenNameCOMMENT_LINE	| xsl:comment 
// | xsl:element 	TokenNameCOMMENT_LINE	| xsl:element 
// | xsl:attribute 	TokenNameCOMMENT_LINE	| xsl:attribute 
// "> 	TokenNameCOMMENT_LINE	"> 
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transformToString	TokenNameIdentifier	 transform To String
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
piName	TokenNameIdentifier	 pi Name
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
/** * Add a child to the child list. * * @param newChild Child to add to child list * * @return The child just added to the child list * * @throws DOMException */	TokenNameCOMMENT_JAVADOC	 Add a child to the child list. * @param newChild Child to add to child list * @return The child just added to the child list * @throws DOMException 
public	TokenNamepublic	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// char-instructions 	TokenNameCOMMENT_LINE	char-instructions 
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEXTLITERALRESULT	TokenNameIdentifier	 ELEMNAME  TEXTLITERALRESULT
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_APPLY_TEMPLATES	TokenNameIdentifier	 ELEMNAME  APPLY  TEMPLATES
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_APPLY_IMPORTS	TokenNameIdentifier	 ELEMNAME  APPLY  IMPORTS
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_CALLTEMPLATE	TokenNameIdentifier	 ELEMNAME  CALLTEMPLATE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_FOREACH	TokenNameIdentifier	 ELEMNAME  FOREACH
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VALUEOF	TokenNameIdentifier	 ELEMNAME  VALUEOF
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_COPY_OF	TokenNameIdentifier	 ELEMNAME  COPY  OF
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_NUMBER	TokenNameIdentifier	 ELEMNAME  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_CHOOSE	TokenNameIdentifier	 ELEMNAME  CHOOSE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_IF	TokenNameIdentifier	 ELEMNAME  IF
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEXT	TokenNameIdentifier	 ELEMNAME  TEXT
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_COPY	TokenNameIdentifier	 ELEMNAME  COPY
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VARIABLE	TokenNameIdentifier	 ELEMNAME  VARIABLE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_MESSAGE	TokenNameIdentifier	 ELEMNAME  MESSAGE
:	TokenNameCOLON	
// instructions 	TokenNameCOMMENT_LINE	instructions 
// case Constants.ELEMNAME_PI: 	TokenNameCOMMENT_LINE	case Constants.ELEMNAME_PI: 
// case Constants.ELEMNAME_COMMENT: 	TokenNameCOMMENT_LINE	case Constants.ELEMNAME_COMMENT: 
// case Constants.ELEMNAME_ELEMENT: 	TokenNameCOMMENT_LINE	case Constants.ELEMNAME_ELEMENT: 
// case Constants.ELEMNAME_ATTRIBUTE: 	TokenNameCOMMENT_LINE	case Constants.ELEMNAME_ATTRIBUTE: 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANNOT_ADD	TokenNameIdentifier	 ER  CANNOT  ADD
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
newChild	TokenNameIdentifier	 new Child
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can not add " +((ElemTemplateElement)newChild).m_elemName + 	TokenNameCOMMENT_LINE	"Can not add " +((ElemTemplateElement)newChild).m_elemName + 
//" to " + this.m_elemName); 	TokenNameCOMMENT_LINE	" to " + this.m_elemName); 
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
newChild	TokenNameIdentifier	 new Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
