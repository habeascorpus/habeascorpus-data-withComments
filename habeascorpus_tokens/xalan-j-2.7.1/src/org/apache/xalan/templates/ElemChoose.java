/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemChoose.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemChoose.java 468643 2006-10-28 06:56:03Z minchau $ 
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
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
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
/** * Implement xsl:choose. * <pre> * <!ELEMENT xsl:choose (xsl:when+, xsl:otherwise?)> * <!ATTLIST xsl:choose %space-att;> * </pre> * @see <a href="http://www.w3.org/TR/xslt#section-Conditional-Processing-with-xsl:choose">XXX in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:choose. <pre> <!ELEMENT xsl:choose (xsl:when+, xsl:otherwise?)> <!ATTLIST xsl:choose %space-att;> </pre> @see <a href="http://www.w3.org/TR/xslt#section-Conditional-Processing-with-xsl:choose">XXX in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemChoose	TokenNameIdentifier	 Elem Choose
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3070117361903102033L	TokenNameLongLiteral	
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
ELEMNAME_CHOOSE	TokenNameIdentifier	 ELEMNAME  CHOOSE
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
ELEMNAME_CHOOSE_STRING	TokenNameIdentifier	 ELEMNAME  CHOOSE  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor ElemChoose * */	TokenNameCOMMENT_JAVADOC	 Constructor ElemChoose 
public	TokenNamepublic	
ElemChoose	TokenNameIdentifier	 Elem Choose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Execute the xsl:choose transformation. * * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the xsl:choose transformation. * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
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
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
childElem	TokenNameIdentifier	 child Elem
=	TokenNameEQUAL	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childElem	TokenNameIdentifier	 child Elem
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
childElem	TokenNameIdentifier	 child Elem
=	TokenNameEQUAL	
childElem	TokenNameIdentifier	 child Elem
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
childElem	TokenNameIdentifier	 child Elem
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_WHEN	TokenNameIdentifier	 ELEMNAME  WHEN
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
ElemWhen	TokenNameIdentifier	 Elem When
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemWhen	TokenNameIdentifier	 Elem When
)	TokenNameRPAREN	
childElem	TokenNameIdentifier	 child Elem
;	TokenNameSEMICOLON	
// must be xsl:when 	TokenNameCOMMENT_LINE	must be xsl:when 
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
// System.err.println("\""+when.getTest().getPatternString()+"\""); 	TokenNameCOMMENT_LINE	System.err.println("\""+when.getTest().getPatternString()+"\""); 
// if(when.getTest().getPatternString().equals("COLLECTION/icuser/ictimezone/LITERAL='GMT +13:00 Pacific/Tongatapu'")) 	TokenNameCOMMENT_LINE	if(when.getTest().getPatternString().equals("COLLECTION/icuser/ictimezone/LITERAL='GMT +13:00 Pacific/Tongatapu'")) 
// System.err.println("Found COLLECTION/icuser/ictimezone/LITERAL"); 	TokenNameCOMMENT_LINE	System.err.println("Found COLLECTION/icuser/ictimezone/LITERAL"); 
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
when	TokenNameIdentifier	 when
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
when	TokenNameIdentifier	 when
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
fireSelectedEvent	TokenNameIdentifier	 fire Selected Event
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
when	TokenNameIdentifier	 when
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
when	TokenNameIdentifier	 when
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
when	TokenNameIdentifier	 when
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
when	TokenNameIdentifier	 when
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
when	TokenNameIdentifier	 when
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
when	TokenNameIdentifier	 when
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
when	TokenNameIdentifier	 when
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
when	TokenNameIdentifier	 when
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_OTHERWISE	TokenNameIdentifier	 ELEMNAME  OTHERWISE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
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
childElem	TokenNameIdentifier	 child Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// xsl:otherwise 	TokenNameCOMMENT_LINE	xsl:otherwise 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
childElem	TokenNameIdentifier	 child Elem
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
childElem	TokenNameIdentifier	 child Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CHOOSE_REQUIRES_WHEN	TokenNameIdentifier	 ER  CHOOSE  REQUIRES  WHEN
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
/** * Add a child to the child list. * * @param newChild Child to add to this node's child list * * @return The child that was just added to the child list * * @throws DOMException */	TokenNameCOMMENT_JAVADOC	 Add a child to the child list. * @param newChild Child to add to this node's child list * @return The child that was just added to the child list * @throws DOMException 
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
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_WHEN	TokenNameIdentifier	 ELEMNAME  WHEN
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_OTHERWISE	TokenNameIdentifier	 ELEMNAME  OTHERWISE
:	TokenNameCOLON	
// TODO: Positional checking 	TokenNameCOMMENT_LINE	TODO: Positional checking 
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
/** * Tell if this element can accept variable declarations. * @return true if the element can accept and process variable declarations. */	TokenNameCOMMENT_JAVADOC	 Tell if this element can accept variable declarations. @return true if the element can accept and process variable declarations. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canAcceptVariables	TokenNameIdentifier	 can Accept Variables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
