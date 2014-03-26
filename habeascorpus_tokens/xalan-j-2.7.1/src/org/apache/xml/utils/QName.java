/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: QName.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: QName.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Class to represent a qualified name: "The name of an internal XSLT object, * specifically a named template (see [7 Named Templates]), a mode (see [6.7 Modes]), * an attribute set (see [8.1.4 Named Attribute Sets]), a key (see [14.2 Keys]), * a locale (see [14.3 Number Formatting]), a variable or a parameter (see * [12 Variables and Parameters]) is specified as a QName. If it has a prefix, * then the prefix is expanded into a URI reference using the namespace declarations * in effect on the attribute in which the name occurs. The expanded name * consisting of the local part of the name and the possibly null URI reference * is used as the name of the object. The default namespace is not used for * unprefixed names." * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 Class to represent a qualified name: "The name of an internal XSLT object, specifically a named template (see [7 Named Templates]), a mode (see [6.7 Modes]), an attribute set (see [8.1.4 Named Attribute Sets]), a key (see [14.2 Keys]), a locale (see [14.3 Number Formatting]), a variable or a parameter (see [12 Variables and Parameters]) is specified as a QName. If it has a prefix, then the prefix is expanded into a URI reference using the namespace declarations in effect on the attribute in which the name occurs. The expanded name consisting of the local part of the name and the possibly null URI reference is used as the name of the object. The default namespace is not used for unprefixed names." @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
QName	TokenNameIdentifier	 Q Name
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
467434581652829920L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The local name. * @serial */	TokenNameCOMMENT_JAVADOC	 The local name. @serial 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
/** * The namespace URI. * @serial */	TokenNameCOMMENT_JAVADOC	 The namespace URI. @serial 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * The namespace prefix. * @serial */	TokenNameCOMMENT_JAVADOC	 The namespace prefix. @serial 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
/** * The XML namespace. */	TokenNameCOMMENT_JAVADOC	 The XML namespace. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
S_XMLNAMESPACEURI	TokenNameIdentifier	 S  XMLNAMESPACEURI
=	TokenNameEQUAL	
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral	http://www.w3.org/XML/1998/namespace
;	TokenNameSEMICOLON	
/** * The cached hashcode, which is calculated at construction time. * @serial */	TokenNameCOMMENT_JAVADOC	 The cached hashcode, which is calculated at construction time. @serial 
private	TokenNameprivate	
int	TokenNameint	
m_hashCode	TokenNameIdentifier	 m hash Code
;	TokenNameSEMICOLON	
/** * Constructs an empty QName. * 20001019: Try making this public, to support Serializable? -- JKESS */	TokenNameCOMMENT_JAVADOC	 Constructs an empty QName. 20001019: Try making this public, to support Serializable? -- JKESS 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs a new QName with the specified namespace URI and * local name. * * @param namespaceURI The namespace URI if known, or null * @param localName The local name */	TokenNameCOMMENT_JAVADOC	 Constructs a new QName with the specified namespace URI and local name. * @param namespaceURI The namespace URI if known, or null @param localName The local name 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new QName with the specified namespace URI and * local name. * * @param namespaceURI The namespace URI if known, or null * @param localName The local name * @param validate If true the new QName will be validated and an IllegalArgumentException will * be thrown if it is invalid. */	TokenNameCOMMENT_JAVADOC	 Constructs a new QName with the specified namespace URI and local name. * @param namespaceURI The namespace URI if known, or null @param localName The local name @param validate If true the new QName will be validated and an IllegalArgumentException will be thrown if it is invalid. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This check was already here. So, for now, I will not add it to the validation 	TokenNameCOMMENT_LINE	This check was already here. So, for now, I will not add it to the validation 
// that is done when the validate parameter is true. 	TokenNameCOMMENT_LINE	that is done when the validate parameter is true. 
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_LOCALNAME_NULL	TokenNameIdentifier	 ER  ARG  LOCALNAME  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'localName' is null"); 	TokenNameCOMMENT_LINE	"Argument 'localName' is null"); 
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'localName' not a valid NCName"); 	TokenNameCOMMENT_LINE	"Argument 'localName' not a valid NCName"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
_localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
m_hashCode	TokenNameIdentifier	 m hash Code
=	TokenNameEQUAL	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new QName with the specified namespace URI, prefix * and local name. * * @param namespaceURI The namespace URI if known, or null * @param prefix The namespace prefix is known, or null * @param localName The local name * */	TokenNameCOMMENT_JAVADOC	 Constructs a new QName with the specified namespace URI, prefix and local name. * @param namespaceURI The namespace URI if known, or null @param prefix The namespace prefix is known, or null @param localName The local name 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new QName with the specified namespace URI, prefix * and local name. * * @param namespaceURI The namespace URI if known, or null * @param prefix The namespace prefix is known, or null * @param localName The local name * @param validate If true the new QName will be validated and an IllegalArgumentException will * be thrown if it is invalid. */	TokenNameCOMMENT_JAVADOC	 Constructs a new QName with the specified namespace URI, prefix and local name. * @param namespaceURI The namespace URI if known, or null @param prefix The namespace prefix is known, or null @param localName The local name @param validate If true the new QName will be validated and an IllegalArgumentException will be thrown if it is invalid. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This check was already here. So, for now, I will not add it to the validation 	TokenNameCOMMENT_LINE	This check was already here. So, for now, I will not add it to the validation 
// that is done when the validate parameter is true. 	TokenNameCOMMENT_LINE	that is done when the validate parameter is true. 
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_LOCALNAME_NULL	TokenNameIdentifier	 ER  ARG  LOCALNAME  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'localName' is null"); 	TokenNameCOMMENT_LINE	"Argument 'localName' is null"); 
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'localName' not a valid NCName"); 	TokenNameCOMMENT_LINE	"Argument 'localName' not a valid NCName"); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_PREFIX_INVALID	TokenNameIdentifier	 ER  ARG  PREFIX  INVALID
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'prefix' not a valid NCName"); 	TokenNameCOMMENT_LINE	"Argument 'prefix' not a valid NCName"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
_prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
_localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
m_hashCode	TokenNameIdentifier	 m hash Code
=	TokenNameEQUAL	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a QName from a string, without namespace resolution. Good * for a few odd cases. * * @param localName Local part of qualified name * */	TokenNameCOMMENT_JAVADOC	 Construct a QName from a string, without namespace resolution. Good for a few odd cases. * @param localName Local part of qualified name 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a QName from a string, without namespace resolution. Good * for a few odd cases. * * @param localName Local part of qualified name * @param validate If true the new QName will be validated and an IllegalArgumentException will * be thrown if it is invalid. */	TokenNameCOMMENT_JAVADOC	 Construct a QName from a string, without namespace resolution. Good for a few odd cases. * @param localName Local part of qualified name @param validate If true the new QName will be validated and an IllegalArgumentException will be thrown if it is invalid. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This check was already here. So, for now, I will not add it to the validation 	TokenNameCOMMENT_LINE	This check was already here. So, for now, I will not add it to the validation 
// that is done when the validate parameter is true. 	TokenNameCOMMENT_LINE	that is done when the validate parameter is true. 
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_LOCALNAME_NULL	TokenNameIdentifier	 ER  ARG  LOCALNAME  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'localName' is null"); 	TokenNameCOMMENT_LINE	"Argument 'localName' is null"); 
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'localName' not a valid NCName"); 	TokenNameCOMMENT_LINE	"Argument 'localName' not a valid NCName"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
m_hashCode	TokenNameIdentifier	 m hash Code
=	TokenNameEQUAL	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a QName from a string, resolving the prefix * using the given namespace stack. The default namespace is * not resolved. * * @param qname Qualified name to resolve * @param namespaces Namespace stack to use to resolve namespace */	TokenNameCOMMENT_JAVADOC	 Construct a QName from a string, resolving the prefix using the given namespace stack. The default namespace is not resolved. * @param qname Qualified name to resolve @param namespaces Namespace stack to use to resolve namespace 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
Stack	TokenNameIdentifier	 Stack
namespaces	TokenNameIdentifier	 namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
namespaces	TokenNameIdentifier	 namespaces
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a QName from a string, resolving the prefix * using the given namespace stack. The default namespace is * not resolved. * * @param qname Qualified name to resolve * @param namespaces Namespace stack to use to resolve namespace * @param validate If true the new QName will be validated and an IllegalArgumentException will * be thrown if it is invalid. */	TokenNameCOMMENT_JAVADOC	 Construct a QName from a string, resolving the prefix using the given namespace stack. The default namespace is not resolved. * @param qname Qualified name to resolve @param namespaces Namespace stack to use to resolve namespace @param validate If true the new QName will be validated and an IllegalArgumentException will be thrown if it is invalid. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
Stack	TokenNameIdentifier	 Stack
namespaces	TokenNameIdentifier	 namespaces
,	TokenNameCOMMA	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
S_XMLNAMESPACEURI	TokenNameIdentifier	 S  XMLNAMESPACEURI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Do we want this? 	TokenNameCOMMENT_LINE	Do we want this? 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
namespaces	TokenNameIdentifier	 namespaces
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
depth	TokenNameIdentifier	 depth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NameSpace	TokenNameIdentifier	 Name Space
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NameSpace	TokenNameIdentifier	 Name Space
)	TokenNameRPAREN	
namespaces	TokenNameIdentifier	 namespaces
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
m_prefix	TokenNameIdentifier	 m prefix
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
m_prefix	TokenNameIdentifier	 m prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
m_uri	TokenNameIdentifier	 m uri
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Prefix must resolve to a namespace: "+prefix); 	TokenNameCOMMENT_LINE	"Prefix must resolve to a namespace: "+prefix); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
:	TokenNameCOLON	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
_localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'localName' not a valid NCName"); 	TokenNameCOMMENT_LINE	"Argument 'localName' not a valid NCName"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
_prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
m_hashCode	TokenNameIdentifier	 m hash Code
=	TokenNameEQUAL	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a QName from a string, resolving the prefix * using the given namespace context and prefix resolver. * The default namespace is not resolved. * * @param qname Qualified name to resolve * @param namespaceContext Namespace Context to use * @param resolver Prefix resolver for this context */	TokenNameCOMMENT_JAVADOC	 Construct a QName from a string, resolving the prefix using the given namespace context and prefix resolver. The default namespace is not resolved. * @param qname Qualified name to resolve @param namespaceContext Namespace Context to use @param resolver Prefix resolver for this context 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
namespaceContext	TokenNameIdentifier	 namespace Context
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
namespaceContext	TokenNameIdentifier	 namespace Context
,	TokenNameCOMMA	
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a QName from a string, resolving the prefix * using the given namespace context and prefix resolver. * The default namespace is not resolved. * * @param qname Qualified name to resolve * @param namespaceContext Namespace Context to use * @param resolver Prefix resolver for this context * @param validate If true the new QName will be validated and an IllegalArgumentException will * be thrown if it is invalid. */	TokenNameCOMMENT_JAVADOC	 Construct a QName from a string, resolving the prefix using the given namespace context and prefix resolver. The default namespace is not resolved. * @param qname Qualified name to resolve @param namespaceContext Namespace Context to use @param resolver Prefix resolver for this context @param validate If true the new QName will be validated and an IllegalArgumentException will be thrown if it is invalid. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
namespaceContext	TokenNameIdentifier	 namespace Context
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
S_XMLNAMESPACEURI	TokenNameIdentifier	 S  XMLNAMESPACEURI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Do we want this? 	TokenNameCOMMENT_LINE	Do we want this? 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
_namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Prefix must resolve to a namespace: "+prefix); 	TokenNameCOMMENT_LINE	"Prefix must resolve to a namespace: "+prefix); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// TODO: error or warning... 	TokenNameCOMMENT_LINE	TODO: error or warning... 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
:	TokenNameCOLON	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
_localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'localName' not a valid NCName"); 	TokenNameCOMMENT_LINE	"Argument 'localName' not a valid NCName"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_hashCode	TokenNameIdentifier	 m hash Code
=	TokenNameEQUAL	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a QName from a string, resolving the prefix * using the given namespace stack. The default namespace is * not resolved. * * @param qname Qualified name to resolve * @param resolver Prefix resolver for this context */	TokenNameCOMMENT_JAVADOC	 Construct a QName from a string, resolving the prefix using the given namespace stack. The default namespace is not resolved. * @param qname Qualified name to resolve @param resolver Prefix resolver for this context 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a QName from a string, resolving the prefix * using the given namespace stack. The default namespace is * not resolved. * * @param qname Qualified name to resolve * @param resolver Prefix resolver for this context * @param validate If true the new QName will be validated and an IllegalArgumentException will * be thrown if it is invalid. */	TokenNameCOMMENT_JAVADOC	 Construct a QName from a string, resolving the prefix using the given namespace stack. The default namespace is not resolved. * @param qname Qualified name to resolve @param resolver Prefix resolver for this context @param validate If true the new QName will be validated and an IllegalArgumentException will be thrown if it is invalid. 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
resolver	TokenNameIdentifier	 resolver
,	TokenNameCOMMA	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xml"	TokenNameStringLiteral	xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
S_XMLNAMESPACEURI	TokenNameIdentifier	 S  XMLNAMESPACEURI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
_namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_PREFIX_MUST_RESOLVE	TokenNameIdentifier	 ER  PREFIX  MUST  RESOLVE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Prefix must resolve to a namespace: "+prefix); 	TokenNameCOMMENT_LINE	"Prefix must resolve to a namespace: "+prefix); 
}	TokenNameRBRACE	
_localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
indexOfNSSep	TokenNameIdentifier	 index Of NS Sep
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NAME_CANT_START_WITH_COLON	TokenNameIdentifier	 ER  NAME  CANT  START  WITH  COLON
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
validate	TokenNameIdentifier	 validate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_localName	TokenNameIdentifier	 local Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
_localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ARG_LOCALNAME_INVALID	TokenNameIdentifier	 ER  ARG  LOCALNAME  INVALID
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Argument 'localName' not a valid NCName"); 	TokenNameCOMMENT_LINE	"Argument 'localName' not a valid NCName"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_hashCode	TokenNameIdentifier	 m hash Code
=	TokenNameEQUAL	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the namespace URI. Returns null if the namespace URI * is not known. * * @return The namespace URI, or null */	TokenNameCOMMENT_JAVADOC	 Returns the namespace URI. Returns null if the namespace URI is not known. * @return The namespace URI, or null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the namespace prefix. Returns null if the namespace * prefix is not known. * * @return The namespace prefix, or null */	TokenNameCOMMENT_JAVADOC	 Returns the namespace prefix. Returns null if the namespace prefix is not known. * @return The namespace prefix, or null 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local part of the qualified name. * * @return The local part of the qualified name */	TokenNameCOMMENT_JAVADOC	 Returns the local part of the qualified name. * @return The local part of the qualified name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the string representation of the qualified name, using the * prefix if available, or the '{ns}foo' notation if not. Performs * string concatenation, so beware of performance issues. * * @return the string representation of the namespace */	TokenNameCOMMENT_JAVADOC	 Return the string representation of the qualified name, using the prefix if available, or the '{ns}foo' notation if not. Performs string concatenation, so beware of performance issues. * @return the string representation of the namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
_prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
_localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
_namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
_namespaceURI	TokenNameIdentifier	 namespace URI
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
+	TokenNamePLUS	
_localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
_localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the string representation of the qualified name using the * the '{ns}foo' notation. Performs * string concatenation, so beware of performance issues. * * @return the string representation of the namespace */	TokenNameCOMMENT_JAVADOC	 Return the string representation of the qualified name using the the '{ns}foo' notation. Performs string concatenation, so beware of performance issues. * @return the string representation of the namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toNamespacedString	TokenNameIdentifier	 to Namespaced String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
_namespaceURI	TokenNameIdentifier	 namespace URI
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
+	TokenNamePLUS	
_localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
_localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the namespace of the qualified name. * * @return the namespace URI of the qualified name */	TokenNameCOMMENT_JAVADOC	 Get the namespace of the qualified name. * @return the namespace URI of the qualified name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the local part of the qualified name. * * @return the local part of the qualified name */	TokenNameCOMMENT_JAVADOC	 Get the local part of the qualified name. * @return the local part of the qualified name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the cached hashcode of the qualified name. * * @return the cached hashcode of the qualified name */	TokenNameCOMMENT_JAVADOC	 Return the cached hashcode of the qualified name. * @return the cached hashcode of the qualified name 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_hashCode	TokenNameIdentifier	 m hash Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override equals and agree that we're equal if * the passed object is a string and it matches * the name of the arg. * * @param ns Namespace URI to compare to * @param localPart Local part of qualified name to compare to * * @return True if the local name and uri match */	TokenNameCOMMENT_JAVADOC	 Override equals and agree that we're equal if the passed object is a string and it matches the name of the arg. * @param ns Namespace URI to compare to @param localPart Local part of qualified name to compare to * @return True if the local name and uri match 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
thisnamespace	TokenNameIdentifier	 thisnamespace
=	TokenNameEQUAL	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
thisnamespace	TokenNameIdentifier	 thisnamespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
thisnamespace	TokenNameIdentifier	 thisnamespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
thisnamespace	TokenNameIdentifier	 thisnamespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override equals and agree that we're equal if * the passed object is a QName and it matches * the name of the arg. * * @return True if the qualified names are equal */	TokenNameCOMMENT_JAVADOC	 Override equals and agree that we're equal if the passed object is a QName and it matches the name of the arg. * @return True if the qualified names are equal 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
instanceof	TokenNameinstanceof	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
object	TokenNameIdentifier	 object
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
thisnamespace	TokenNameIdentifier	 thisnamespace
=	TokenNameEQUAL	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
thatnamespace	TokenNameIdentifier	 thatnamespace
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
thisnamespace	TokenNameIdentifier	 thisnamespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
thatnamespace	TokenNameIdentifier	 thatnamespace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
thisnamespace	TokenNameIdentifier	 thisnamespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
thatnamespace	TokenNameIdentifier	 thatnamespace
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
thisnamespace	TokenNameIdentifier	 thisnamespace
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
thatnamespace	TokenNameIdentifier	 thatnamespace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a string, create and return a QName object * * * @param name String to use to create QName * * @return a QName object */	TokenNameCOMMENT_JAVADOC	 Given a string, create and return a QName object * @param name String to use to create QName * @return a QName object 
public	TokenNamepublic	
static	TokenNamestatic	
QName	TokenNameIdentifier	 Q Name
getQNameFromString	TokenNameIdentifier	 get Q Name From String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
"{}"	TokenNameStringLiteral	{}
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function tells if a raw attribute name is a * xmlns attribute. * * @param attRawName Raw name of attribute * * @return True if the attribute starts with or is equal to xmlns */	TokenNameCOMMENT_JAVADOC	 This function tells if a raw attribute name is a xmlns attribute. * @param attRawName Raw name of attribute * @return True if the attribute starts with or is equal to xmlns 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isXMLNSDecl	TokenNameIdentifier	 is XMLNS Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attRawName	TokenNameIdentifier	 att Raw Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
attRawName	TokenNameIdentifier	 att Raw Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
attRawName	TokenNameIdentifier	 att Raw Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
||	TokenNameOR_OR	
attRawName	TokenNameIdentifier	 att Raw Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function tells if a raw attribute name is a * xmlns attribute. * * @param attRawName Raw name of attribute * * @return Prefix of attribute */	TokenNameCOMMENT_JAVADOC	 This function tells if a raw attribute name is a xmlns attribute. * @param attRawName Raw name of attribute * @return Prefix of attribute 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getPrefixFromXMLNSDecl	TokenNameIdentifier	 get Prefix From XMLNS Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
attRawName	TokenNameIdentifier	 att Raw Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
attRawName	TokenNameIdentifier	 att Raw Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
attRawName	TokenNameIdentifier	 att Raw Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local name of the given node. * * @param qname Input name * * @return Local part of the name if prefixed, or the given name if not */	TokenNameCOMMENT_JAVADOC	 Returns the local name of the given node. * @param qname Input name * @return Local part of the name if prefixed, or the given name if not 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
:	TokenNameCOLON	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the local name of the given node. * * @param qname Input name * * @return Prefix of name or empty string if none there */	TokenNameCOMMENT_JAVADOC	 Returns the local name of the given node. * @param qname Input name * @return Prefix of name or empty string if none there 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getPrefixPart	TokenNameIdentifier	 get Prefix Part
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
