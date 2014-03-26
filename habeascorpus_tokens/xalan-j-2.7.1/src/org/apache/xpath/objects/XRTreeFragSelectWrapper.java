/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XRTreeFragSelectWrapper.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XRTreeFragSelectWrapper.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
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
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMIterator	TokenNameIdentifier	 DTM Iterator
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
XMLString	TokenNameIdentifier	 XML String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Expression	TokenNameIdentifier	 Expression
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * This class makes an select statement act like an result tree fragment. */	TokenNameCOMMENT_JAVADOC	 This class makes an select statement act like an result tree fragment. 
public	TokenNamepublic	
class	TokenNameclass	
XRTreeFragSelectWrapper	TokenNameIdentifier	 XR Tree Frag Select Wrapper
extends	TokenNameextends	
XRTreeFrag	TokenNameIdentifier	 XR Tree Frag
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6526177905590461251L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XRTreeFragSelectWrapper	TokenNameIdentifier	 XR Tree Frag Select Wrapper
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). 
public	TokenNamepublic	
void	TokenNamevoid	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
int	TokenNameint	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For support of literal objects in xpaths. * * @param xctxt The XPath execution context. * * @return the result of executing the select expression * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 For support of literal objects in xpaths. * @param xctxt The XPath execution context. * @return the result of executing the select expression * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
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
XObject	TokenNameIdentifier	 X Object
m_selected	TokenNameIdentifier	 m selected
;	TokenNameSEMICOLON	
m_selected	TokenNameIdentifier	 m selected
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
m_obj	TokenNameIdentifier	 m obj
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_selected	TokenNameIdentifier	 m selected
.	TokenNameDOT	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
m_allowRelease	TokenNameIdentifier	 m allow Release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_selected	TokenNameIdentifier	 m selected
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CLASS_STRING	TokenNameIdentifier	 CLASS  STRING
)	TokenNameRPAREN	
return	TokenNamereturn	
m_selected	TokenNameIdentifier	 m selected
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
XString	TokenNameIdentifier	 X String
(	TokenNameLPAREN	
m_selected	TokenNameIdentifier	 m selected
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Detaches the <code>DTMIterator</code> from the set which it iterated * over, releasing any computational resources and placing the iterator * in the INVALID state. After <code>detach</code> has been invoked, * calls to <code>nextNode</code> or <code>previousNode</code> will * raise a runtime exception. * * In general, detach should only be called once on the object. */	TokenNameCOMMENT_JAVADOC	 Detaches the <code>DTMIterator</code> from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. After <code>detach</code> has been invoked, calls to <code>nextNode</code> or <code>previousNode</code> will raise a runtime exception. * In general, detach should only be called once on the object. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_DETACH_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  DETACH  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"detach() not supported by XRTreeFragSelectWrapper!"); 	TokenNameCOMMENT_LINE	"detach() not supported by XRTreeFragSelectWrapper!"); 
}	TokenNameRBRACE	
/** * Cast result object to a number. * * @return The result tree fragment as a number or NaN */	TokenNameCOMMENT_JAVADOC	 Cast result object to a number. * @return The result tree fragment as a number or NaN 
public	TokenNamepublic	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
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
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NUM_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  NUM  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"num() not supported by XRTreeFragSelectWrapper!"); 	TokenNameCOMMENT_LINE	"num() not supported by XRTreeFragSelectWrapper!"); 
}	TokenNameRBRACE	
/** * Cast result object to an XMLString. * * @return The document fragment node data or the empty string. */	TokenNameCOMMENT_JAVADOC	 Cast result object to an XMLString. * @return The document fragment node data or the empty string. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_XSTR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  XSTR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"xstr() not supported by XRTreeFragSelectWrapper!"); 	TokenNameCOMMENT_LINE	"xstr() not supported by XRTreeFragSelectWrapper!"); 
}	TokenNameRBRACE	
/** * Cast result object to a string. * * @return The document fragment node data or the empty string. */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @return The document fragment node data or the empty string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_STR_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  STR  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"str() not supported by XRTreeFragSelectWrapper!"); 	TokenNameCOMMENT_LINE	"str() not supported by XRTreeFragSelectWrapper!"); 
}	TokenNameRBRACE	
/** * Tell what kind of class this is. * * @return the string type */	TokenNameCOMMENT_JAVADOC	 Tell what kind of class this is. * @return the string type 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CLASS_STRING	TokenNameIdentifier	 CLASS  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a result tree fragment. * * @return The document fragment this wraps */	TokenNameCOMMENT_JAVADOC	 Cast result object to a result tree fragment. * @return The document fragment this wraps 
public	TokenNamepublic	
int	TokenNameint	
rtf	TokenNameIdentifier	 rtf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  RTF  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"rtf() not supported by XRTreeFragSelectWrapper!"); 	TokenNameCOMMENT_LINE	"rtf() not supported by XRTreeFragSelectWrapper!"); 
}	TokenNameRBRACE	
/** * Cast result object to a DTMIterator. * * @return The document fragment as a DTMIterator */	TokenNameCOMMENT_JAVADOC	 Cast result object to a DTMIterator. * @return The document fragment as a DTMIterator 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
asNodeIterator	TokenNameIdentifier	 as Node Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_RTF_NOT_SUPPORTED_XRTREEFRAGSELECTWRAPPER	TokenNameIdentifier	 ER  RTF  NOT  SUPPORTED  XRTREEFRAGSELECTWRAPPER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"asNodeIterator() not supported by XRTreeFragSelectWrapper!"); 	TokenNameCOMMENT_LINE	"asNodeIterator() not supported by XRTreeFragSelectWrapper!"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
