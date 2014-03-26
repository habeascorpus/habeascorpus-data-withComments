/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorExsltFuncResult.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorExsltFuncResult.java 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemExsltFuncResult	TokenNameIdentifier	 Elem Exslt Func Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemExsltFunction	TokenNameIdentifier	 Elem Exslt Function
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemParam	TokenNameIdentifier	 Elem Param
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemVariable	TokenNameIdentifier	 Elem Variable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * This class processes parse events for an exslt func:result element. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class processes parse events for an exslt func:result element. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ProcessorExsltFuncResult	TokenNameIdentifier	 Processor Exslt Func Result
extends	TokenNameextends	
ProcessorTemplateElem	TokenNameIdentifier	 Processor Template Elem
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
6451230911473482423L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Verify that the func:result element does not appear within a variable, * parameter, or another func:result, and that it belongs to a func:function * element. */	TokenNameCOMMENT_JAVADOC	 Verify that the func:result element does not appear within a variable, parameter, or another func:result, and that it belongs to a func:function element. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getElemTemplateElement	TokenNameIdentifier	 get Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
instanceof	TokenNameinstanceof	
ElemExsltFunction	TokenNameIdentifier	 Elem Exslt Function
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
instanceof	TokenNameinstanceof	
ElemVariable	TokenNameIdentifier	 Elem Variable
||	TokenNameOR_OR	
ancestor	TokenNameIdentifier	 ancestor
instanceof	TokenNameinstanceof	
ElemParam	TokenNameIdentifier	 Elem Param
||	TokenNameOR_OR	
ancestor	TokenNameIdentifier	 ancestor
instanceof	TokenNameinstanceof	
ElemExsltFuncResult	TokenNameIdentifier	 Elem Exslt Func Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"func:result cannot appear within a variable, parameter, or another func:result."	TokenNameStringLiteral	func:result cannot appear within a variable, parameter, or another func:result.
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ancestor	TokenNameIdentifier	 ancestor
=	TokenNameEQUAL	
ancestor	TokenNameIdentifier	 ancestor
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ancestor	TokenNameIdentifier	 ancestor
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"func:result must appear in a func:function element"	TokenNameStringLiteral	func:result must appear in a func:function element
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
