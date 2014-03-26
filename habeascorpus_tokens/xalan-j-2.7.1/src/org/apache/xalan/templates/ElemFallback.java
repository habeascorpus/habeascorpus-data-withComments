/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemFallback.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemFallback.java 468643 2006-10-28 06:56:03Z minchau $ 
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
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
;	TokenNameSEMICOLON	
/** * Implement xsl:fallback. * <pre> * <!ELEMENT xsl:fallback %template;> * <!ATTLIST xsl:fallback %space-att;> * </pre> * @see <a href="http://www.w3.org/TR/xslt#fallback">fallback in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:fallback. <pre> <!ELEMENT xsl:fallback %template;> <!ATTLIST xsl:fallback %space-att;> </pre> @see <a href="http://www.w3.org/TR/xslt#fallback">fallback in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemFallback	TokenNameIdentifier	 Elem Fallback
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1782962139867340703L	TokenNameLongLiteral	
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
ELEMNAME_FALLBACK	TokenNameIdentifier	 ELEMNAME  FALLBACK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return The Element's name */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return The Element's name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_FALLBACK_STRING	TokenNameIdentifier	 ELEMNAME  FALLBACK  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is the normal call when xsl:fallback is instantiated. * In accordance with the XSLT 1.0 Recommendation, chapter 15, * "Normally, instantiating an xsl:fallback element does nothing." * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 This is the normal call when xsl:fallback is instantiated. In accordance with the XSLT 1.0 Recommendation, chapter 15, "Normally, instantiating an xsl:fallback element does nothing." * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
}	TokenNameRBRACE	
/** * Execute the fallback elements. This must be explicitly called to * instantiate the content of an xsl:fallback element. * When an XSLT transformer performs fallback for an instruction * element, if the instruction element has one or more xsl:fallback * children, then the content of each of the xsl:fallback children * must be instantiated in sequence; otherwise, an error must * be signaled. The content of an xsl:fallback element is a template. * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the fallback elements. This must be explicitly called to instantiate the content of an xsl:fallback element. When an XSLT transformer performs fallback for an instruction element, if the instruction element has one or more xsl:fallback children, then the content of each of the xsl:fallback children must be instantiated in sequence; otherwise, an error must be signaled. The content of an xsl:fallback element is a template. * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
executeFallback	TokenNameIdentifier	 execute Fallback
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
int	TokenNameint	
parentElemType	TokenNameIdentifier	 parent Elem Type
=	TokenNameEQUAL	
m_parentNode	TokenNameIdentifier	 m parent Node
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_EXTENSIONCALL	TokenNameIdentifier	 ELEMNAME  EXTENSIONCALL
==	TokenNameEQUAL_EQUAL	
parentElemType	TokenNameIdentifier	 parent Elem Type
||	TokenNameOR_OR	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_UNDEFINED	TokenNameIdentifier	 ELEMNAME  UNDEFINED
==	TokenNameEQUAL_EQUAL	
parentElemType	TokenNameIdentifier	 parent Elem Type
)	TokenNameRPAREN	
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
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
true	TokenNametrue	
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
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Should never happen 	TokenNameCOMMENT_LINE	Should never happen 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Error! parent of xsl:fallback must be an extension or unknown element!"	TokenNameStringLiteral	Error! parent of xsl:fallback must be an extension or unknown element!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
