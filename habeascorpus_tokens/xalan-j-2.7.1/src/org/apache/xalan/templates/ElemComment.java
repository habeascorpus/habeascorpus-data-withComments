/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemComment.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemComment.java 468643 2006-10-28 06:56:03Z minchau $ 
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
/** * Implement xsl:comment. * <pre> * <!ELEMENT xsl:comment %char-template;> * <!ATTLIST xsl:comment %space-att;> * </pre> * @see <a href="http://www.w3.org/TR/xslt#section-Creating-Comments">section-Creating-Comments in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:comment. <pre> <!ELEMENT xsl:comment %char-template;> <!ATTLIST xsl:comment %space-att;> </pre> @see <a href="http://www.w3.org/TR/xslt#section-Creating-Comments">section-Creating-Comments in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemComment	TokenNameIdentifier	 Elem Comment
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8813199122875770142L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
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
ELEMNAME_COMMENT	TokenNameIdentifier	 ELEMNAME  COMMENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return This element's name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return This element's name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_COMMENT_STRING	TokenNameIdentifier	 ELEMNAME  COMMENT  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the xsl:comment transformation * * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the xsl:comment transformation * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
try	TokenNametry	
{	TokenNameLBRACE	
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
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
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
finally	TokenNamefinally	
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
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a child to the child list. * * @param newChild Child to add to this node's child list * * @return Child that was just added to child list * * @throws DOMException */	TokenNameCOMMENT_JAVADOC	 Add a child to the child list. * @param newChild Child to add to this node's child list * @return Child that was just added to child list * @throws DOMException 
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
