/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtensionHandlerGeneral.java 469672 2006-10-31 21:56:19Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtensionHandlerGeneral.java 469672 2006-10-31 21:56:19Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLConnection	TokenNameIdentifier	 URL Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Stylesheet	TokenNameIdentifier	 Stylesheet
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
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeList	TokenNameIdentifier	 DTM Node List
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
StringVector	TokenNameIdentifier	 String Vector
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
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathProcessorException	TokenNameIdentifier	 X Path Processor Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
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
/** * Class handling an extension namespace for XPath. Provides functions * to test a function's existence and call a function * * @author Sanjiva Weerawarana (sanjiva@watson.ibm.com) * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Class handling an extension namespace for XPath. Provides functions to test a function's existence and call a function * @author Sanjiva Weerawarana (sanjiva@watson.ibm.com) @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionHandlerGeneral	TokenNameIdentifier	 Extension Handler General
extends	TokenNameextends	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
{	TokenNameLBRACE	
/** script source to run (if any) */	TokenNameCOMMENT_JAVADOC	 script source to run (if any) 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_scriptSrc	TokenNameIdentifier	 m script Src
;	TokenNameSEMICOLON	
/** URL of source of script (if any) */	TokenNameCOMMENT_JAVADOC	 URL of source of script (if any) 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
;	TokenNameSEMICOLON	
/** functions of namespace */	TokenNameCOMMENT_JAVADOC	 functions of namespace 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_functions	TokenNameIdentifier	 m functions
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** elements of namespace */	TokenNameCOMMENT_JAVADOC	 elements of namespace 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_elements	TokenNameIdentifier	 m elements
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// BSF objects used to invoke BSF by reflection. Do not import the BSF classes 	TokenNameCOMMENT_LINE	BSF objects used to invoke BSF by reflection. Do not import the BSF classes 
// since we don't want a compile dependency on BSF. 	TokenNameCOMMENT_LINE	since we don't want a compile dependency on BSF. 
/** BSF manager used to run scripts */	TokenNameCOMMENT_JAVADOC	 BSF manager used to run scripts 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
m_engine	TokenNameIdentifier	 m engine
;	TokenNameSEMICOLON	
/** Engine call to invoke scripts */	TokenNameCOMMENT_JAVADOC	 Engine call to invoke scripts 
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
m_engineCall	TokenNameIdentifier	 m engine Call
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// static fields 	TokenNameCOMMENT_LINE	static fields 
/** BSFManager package name */	TokenNameCOMMENT_JAVADOC	 BSFManager package name 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
;	TokenNameSEMICOLON	
/** Default BSFManager name */	TokenNameCOMMENT_JAVADOC	 Default BSFManager name 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_BSF_MANAGER	TokenNameIdentifier	 DEFAULT  BSF  MANAGER
=	TokenNameEQUAL	
"org.apache.bsf.BSFManager"	TokenNameStringLiteral	org.apache.bsf.BSFManager
;	TokenNameSEMICOLON	
/** Property name to load the BSFManager class */	TokenNameCOMMENT_JAVADOC	 Property name to load the BSFManager class 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
propName	TokenNameIdentifier	 prop Name
=	TokenNameEQUAL	
"org.apache.xalan.extensions.bsf.BSFManager"	TokenNameStringLiteral	org.apache.xalan.extensions.bsf.BSFManager
;	TokenNameSEMICOLON	
/** Integer Zero */	TokenNameCOMMENT_JAVADOC	 Integer Zero 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
ZEROINT	TokenNameIdentifier	 ZEROINT
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
lookUpFactoryClassName	TokenNameIdentifier	 look Up Factory Class Name
(	TokenNameLPAREN	
propName	TokenNameIdentifier	 prop Name
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
=	TokenNameEQUAL	
DEFAULT_BSF_MANAGER	TokenNameIdentifier	 DEFAULT  BSF  MANAGER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct a new extension namespace handler given all the information * needed. * * @param namespaceUri the extension namespace URI that I'm implementing * @param elemNames Vector of element names * @param funcNames string containing list of functions of extension NS * @param scriptLang Scripting language of implementation * @param scriptSrcURL URL of source script * @param scriptSrc the actual script code (if any) * @param systemId * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Construct a new extension namespace handler given all the information needed. * @param namespaceUri the extension namespace URI that I'm implementing @param elemNames Vector of element names @param funcNames string containing list of functions of extension NS @param scriptLang Scripting language of implementation @param scriptSrcURL URL of source script @param scriptSrc the actual script code (if any) @param systemId * @throws TransformerException 
public	TokenNamepublic	
ExtensionHandlerGeneral	TokenNameIdentifier	 Extension Handler General
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceUri	TokenNameIdentifier	 namespace Uri
,	TokenNameCOMMA	
StringVector	TokenNameIdentifier	 String Vector
elemNames	TokenNameIdentifier	 elem Names
,	TokenNameCOMMA	
StringVector	TokenNameIdentifier	 String Vector
funcNames	TokenNameIdentifier	 func Names
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scriptLang	TokenNameIdentifier	 script Lang
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scriptSrcURL	TokenNameIdentifier	 script Src URL
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scriptSrc	TokenNameIdentifier	 script Src
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
namespaceUri	TokenNameIdentifier	 namespace Uri
,	TokenNameCOMMA	
scriptLang	TokenNameIdentifier	 script Lang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elemNames	TokenNameIdentifier	 elem Names
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
junk	TokenNameIdentifier	 junk
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
elemNames	TokenNameIdentifier	 elem Names
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
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
elemNames	TokenNameIdentifier	 elem Names
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_elements	TokenNameIdentifier	 m elements
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
junk	TokenNameIdentifier	 junk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// just stick it in there basically 	TokenNameCOMMENT_LINE	just stick it in there basically 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
funcNames	TokenNameIdentifier	 func Names
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
junk	TokenNameIdentifier	 junk
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
funcNames	TokenNameIdentifier	 func Names
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
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
funcNames	TokenNameIdentifier	 func Names
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_functions	TokenNameIdentifier	 m functions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
junk	TokenNameIdentifier	 junk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// just stick it in there basically 	TokenNameCOMMENT_LINE	just stick it in there basically 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
=	TokenNameEQUAL	
scriptSrcURL	TokenNameIdentifier	 script Src URL
;	TokenNameSEMICOLON	
m_scriptSrc	TokenNameIdentifier	 m script Src
=	TokenNameEQUAL	
scriptSrc	TokenNameIdentifier	 script Src
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
indexOfColon	TokenNameIdentifier	 index Of Colon
=	TokenNameEQUAL	
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexOfSlash	TokenNameIdentifier	 index Of Slash
=	TokenNameEQUAL	
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
indexOfColon	TokenNameIdentifier	 index Of Colon
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
indexOfSlash	TokenNameIdentifier	 index Of Slash
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
indexOfColon	TokenNameIdentifier	 index Of Colon
<	TokenNameLESS	
indexOfSlash	TokenNameIdentifier	 index Of Slash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The url is absolute. 	TokenNameCOMMENT_LINE	The url is absolute. 
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_COULD_NOT_FIND_EXTERN_SCRIPT	TokenNameIdentifier	 ER  COULD  NOT  FIND  EXTERN  SCRIPT
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"src attribute not yet supported for " 	TokenNameCOMMENT_LINE	"src attribute not yet supported for " 
//+ scriptLang); 	TokenNameCOMMENT_LINE	+ scriptLang); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue2	TokenNameIdentifier	 mue2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_COULD_NOT_FIND_EXTERN_SCRIPT	TokenNameIdentifier	 ER  COULD  NOT  FIND  EXTERN  SCRIPT
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
mue2	TokenNameIdentifier	 mue2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"src attribute not yet supported for " 	TokenNameCOMMENT_LINE	"src attribute not yet supported for " 
//+ scriptLang); 	TokenNameCOMMENT_LINE	+ scriptLang); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
URLConnection	TokenNameIdentifier	 URL Connection
uc	TokenNameIdentifier	 uc
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
uc	TokenNameIdentifier	 uc
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bArray	TokenNameIdentifier	 b Array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
uc	TokenNameIdentifier	 uc
.	TokenNameDOT	
getContentLength	TokenNameIdentifier	 get Content Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
bArray	TokenNameIdentifier	 b Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_scriptSrc	TokenNameIdentifier	 m script Src
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bArray	TokenNameIdentifier	 b Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_COULD_NOT_FIND_EXTERN_SCRIPT	TokenNameIdentifier	 ER  COULD  NOT  FIND  EXTERN  SCRIPT
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
m_scriptSrcURL	TokenNameIdentifier	 m script Src URL
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"src attribute not yet supported for " 	TokenNameCOMMENT_LINE	"src attribute not yet supported for " 
//+ scriptLang); 	TokenNameCOMMENT_LINE	+ scriptLang); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
manager	TokenNameIdentifier	 manager
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
manager	TokenNameIdentifier	 manager
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
BSF_MANAGER	TokenNameIdentifier	 BSF  MANAGER
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
ConfigurationError	TokenNameIdentifier	 Configuration Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANNOT_INIT_BSFMGR	TokenNameIdentifier	 ER  CANNOT  INIT  BSFMGR
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Could not initialize BSF manager"); 	TokenNameCOMMENT_LINE	"Could not initialize BSF manager"); 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
loadScriptingEngine	TokenNameIdentifier	 load Scripting Engine
=	TokenNameEQUAL	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"loadScriptingEngine"	TokenNameStringLiteral	loadScriptingEngine
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_engine	TokenNameIdentifier	 m engine
=	TokenNameEQUAL	
loadScriptingEngine	TokenNameIdentifier	 load Scripting Engine
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
manager	TokenNameIdentifier	 manager
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
scriptLang	TokenNameIdentifier	 script Lang
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
engineExec	TokenNameIdentifier	 engine Exec
=	TokenNameEQUAL	
m_engine	TokenNameIdentifier	 m engine
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"exec"	TokenNameStringLiteral	exec
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Compile" the program 	TokenNameCOMMENT_LINE	"Compile" the program 
engineExec	TokenNameIdentifier	 engine Exec
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
m_engine	TokenNameIdentifier	 m engine
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"XalanScript"	TokenNameStringLiteral	XalanScript
,	TokenNameCOMMA	
ZEROINT	TokenNameIdentifier	 ZEROINT
,	TokenNameCOMMA	
ZEROINT	TokenNameIdentifier	 ZEROINT
,	TokenNameCOMMA	
m_scriptSrc	TokenNameIdentifier	 m script Src
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANNOT_CMPL_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CMPL  EXTENSN
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Could not compile extension", e); 	TokenNameCOMMENT_LINE	"Could not compile extension", e); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests whether a certain function name is known within this namespace. * @param function name of the function being tested * @return true if its known, false if not. */	TokenNameCOMMENT_JAVADOC	 Tests whether a certain function name is known within this namespace. @param function name of the function being tested @return true if its known, false if not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFunctionAvailable	TokenNameIdentifier	 is Function Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
function	TokenNameIdentifier	 function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_functions	TokenNameIdentifier	 m functions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
function	TokenNameIdentifier	 function
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether a certain element name is known within this namespace. * @param element name of the element being tested * @return true if its known, false if not. */	TokenNameCOMMENT_JAVADOC	 Tests whether a certain element name is known within this namespace. @param element name of the element being tested @return true if its known, false if not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isElementAvailable	TokenNameIdentifier	 is Element Available
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_elements	TokenNameIdentifier	 m elements
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process a call to a function. * * @param funcName Function name. * @param args The arguments of the function call. * @param methodKey A key that uniquely identifies this class and method call. * @param exprContext The context in which this expression is being executed. * * @return the return value of the function evaluation. * * @throws TransformerException if parsing trouble */	TokenNameCOMMENT_JAVADOC	 Process a call to a function. * @param funcName Function name. @param args The arguments of the function call. @param methodKey A key that uniquely identifies this class and method call. @param exprContext The context in which this expression is being executed. * @return the return value of the function evaluation. * @throws TransformerException if parsing trouble 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argArray	TokenNameIdentifier	 arg Array
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
argArray	TokenNameIdentifier	 arg Array
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argArray	TokenNameIdentifier	 arg Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argArray	TokenNameIdentifier	 arg Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
object	TokenNameIdentifier	 object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
argArray	TokenNameIdentifier	 arg Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
&&	TokenNameAND_AND	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
argArray	TokenNameIdentifier	 arg Array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DTMNodeList	TokenNameIdentifier	 DTM Node List
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_engineCall	TokenNameIdentifier	 m engine Call
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_engineCall	TokenNameIdentifier	 m engine Call
=	TokenNameEQUAL	
m_engine	TokenNameIdentifier	 m engine
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"call"	TokenNameStringLiteral	call
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_engineCall	TokenNameIdentifier	 m engine Call
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
m_engine	TokenNameIdentifier	 m engine
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
argArray	TokenNameIdentifier	 arg Array
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"Stopping after fatal error:"	TokenNameStringLiteral	Stopping after fatal error:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
"Stopping after fatal error:"	TokenNameStringLiteral	Stopping after fatal error:
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("Call to extension function failed: "+msg); 	TokenNameCOMMENT_LINE	System.out.println("Call to extension function failed: "+msg); 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Should probably make a TRaX Extension Exception. 	TokenNameCOMMENT_LINE	Should probably make a TRaX Extension Exception. 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_CANNOT_CREATE_EXTENSN	TokenNameIdentifier	 ER  CANNOT  CREATE  EXTENSN
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
funcName	TokenNameIdentifier	 func Name
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Could not create extension: " + funcName 	TokenNameCOMMENT_LINE	"Could not create extension: " + funcName 
//+ " because of: " + e); 	TokenNameCOMMENT_LINE	+ " because of: " + e); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Process a call to an XPath extension function * * @param extFunction The XPath extension function * @param args The arguments of the function call. * @param exprContext The context in which this expression is being executed. * @return the return value of the function evaluation. * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process a call to an XPath extension function * @param extFunction The XPath extension function @param args The arguments of the function call. @param exprContext The context in which this expression is being executed. @return the return value of the function evaluation. @throws TransformerException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
extFunction	TokenNameIdentifier	 ext Function
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
ExpressionContext	TokenNameIdentifier	 Expression Context
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
extFunction	TokenNameIdentifier	 ext Function
.	TokenNameDOT	
getMethodKey	TokenNameIdentifier	 get Method Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exprContext	TokenNameIdentifier	 expr Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process a call to this extension namespace via an element. As a side * effect, the results are sent to the TransformerImpl's result tree. * * @param localPart Element name's local part. * @param element The extension element being processed. * @param transformer Handle to TransformerImpl. * @param stylesheetTree The compiled stylesheet tree. * @param methodKey A key that uniquely identifies this class and method call. * * @throws XSLProcessorException thrown if something goes wrong * while running the extension handler. * @throws MalformedURLException if loading trouble * @throws FileNotFoundException if loading trouble * @throws IOException if loading trouble * @throws TransformerException if parsing trouble */	TokenNameCOMMENT_JAVADOC	 Process a call to this extension namespace via an element. As a side effect, the results are sent to the TransformerImpl's result tree. * @param localPart Element name's local part. @param element The extension element being processed. @param transformer Handle to TransformerImpl. @param stylesheetTree The compiled stylesheet tree. @param methodKey A key that uniquely identifies this class and method call. * @throws XSLProcessorException thrown if something goes wrong while running the extension handler. @throws MalformedURLException if loading trouble @throws FileNotFoundException if loading trouble @throws IOException if loading trouble @throws TransformerException if parsing trouble 
public	TokenNamepublic	
void	TokenNamevoid	
processElement	TokenNameIdentifier	 process Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
Stylesheet	TokenNameIdentifier	 Stylesheet
stylesheetTree	TokenNameIdentifier	 stylesheet Tree
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
methodKey	TokenNameIdentifier	 method Key
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
xpc	TokenNameIdentifier	 xpc
=	TokenNameEQUAL	
new	TokenNamenew	
XSLProcessorContext	TokenNameIdentifier	 XSL Processor Context
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
stylesheetTree	TokenNameIdentifier	 stylesheet Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
argv	TokenNameIdentifier	 argv
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
xpc	TokenNameIdentifier	 xpc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
localPart	TokenNameIdentifier	 local Part
,	TokenNameCOMMA	
argv	TokenNameIdentifier	 argv
,	TokenNameCOMMA	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getExpressionContext	TokenNameIdentifier	 get Expression Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XPathProcessorException	TokenNameIdentifier	 X Path Processor Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// e.printStackTrace (); 	TokenNameCOMMENT_LINE	e.printStackTrace (); 
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
outputToResultTree	TokenNameIdentifier	 output To Result Tree
(	TokenNameLPAREN	
stylesheetTree	TokenNameIdentifier	 stylesheet Tree
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
