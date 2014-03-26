/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFunction	TokenNameIdentifier	 X Path Function
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
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
/** * A sample implementation of XPathFunctionResolver, with support for * EXSLT extension functions and Java extension functions. */	TokenNameCOMMENT_JAVADOC	 A sample implementation of XPathFunctionResolver, with support for EXSLT extension functions and Java extension functions. 
public	TokenNamepublic	
class	TokenNameclass	
XPathFunctionResolverImpl	TokenNameIdentifier	 X Path Function Resolver Impl
implements	TokenNameimplements	
XPathFunctionResolver	TokenNameIdentifier	 X Path Function Resolver
{	TokenNameLBRACE	
/** * Resolve an extension function from the qualified name and arity. */	TokenNameCOMMENT_JAVADOC	 Resolve an extension function from the qualified name and arity. 
public	TokenNamepublic	
XPathFunction	TokenNameIdentifier	 X Path Function
resolveFunction	TokenNameIdentifier	 resolve Function
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
int	TokenNameint	
arity	TokenNameIdentifier	 arity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_XPATH_RESOLVER_NULL_QNAME	TokenNameIdentifier	 ER  XPATH  RESOLVER  NULL  QNAME
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arity	TokenNameIdentifier	 arity
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_XPATH_RESOLVER_NEGATIVE_ARITY	TokenNameIdentifier	 ER  XPATH  RESOLVER  NEGATIVE  ARITY
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"http://exslt.org"	TokenNameStringLiteral	http://exslt.org
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
getEXSLTClassName	TokenNameIdentifier	 get EXSLT Class Name
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
.	TokenNameDOT	
JAVA_EXT_URI	TokenNameIdentifier	 JAVA  EXT  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lastSlash	TokenNameIdentifier	 last Slash
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
lastSlash	TokenNameIdentifier	 last Slash
)	TokenNameRPAREN	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lastSlash	TokenNameIdentifier	 last Slash
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastDotIndex	TokenNameIdentifier	 last Dot Index
=	TokenNameEQUAL	
localPart	TokenNameIdentifier	 local Part
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastDotIndex	TokenNameIdentifier	 last Dot Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
+	TokenNamePLUS	
localPart	TokenNameIdentifier	 local Part
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastDotIndex	TokenNameIdentifier	 last Dot Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
localPart	TokenNameIdentifier	 local Part
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastDotIndex	TokenNameIdentifier	 last Dot Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
localPart	TokenNameIdentifier	 local Part
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lastDotIndex	TokenNameIdentifier	 last Dot Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
methodName	TokenNameIdentifier	 method Name
=	TokenNameEQUAL	
localPart	TokenNameIdentifier	 local Part
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
className	TokenNameIdentifier	 class Name
||	TokenNameOR_OR	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
methodName	TokenNameIdentifier	 method Name
||	TokenNameOR_OR	
methodName	TokenNameIdentifier	 method Name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
.	TokenNameDOT	
getClassForName	TokenNameIdentifier	 get Class For Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
new	TokenNamenew	
ExtensionHandlerJavaClass	TokenNameIdentifier	 Extension Handler Java Class
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
"javaclass"	TokenNameStringLiteral	javaclass
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XPathFunctionImpl	TokenNameIdentifier	 X Path Function Impl
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the implementation class name of an EXSLT extension from * a given namespace uri. The uri must starts with "http://exslt.org". */	TokenNameCOMMENT_JAVADOC	 Return the implementation class name of an EXSLT extension from a given namespace uri. The uri must starts with "http://exslt.org". 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getEXSLTClassName	TokenNameIdentifier	 get EXSLT Class Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
.	TokenNameDOT	
EXSLT_MATH_URI	TokenNameIdentifier	 EXSLT  MATH  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"org.apache.xalan.lib.ExsltMath"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltMath
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
.	TokenNameDOT	
EXSLT_SET_URI	TokenNameIdentifier	 EXSLT  SET  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"org.apache.xalan.lib.ExsltSets"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltSets
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
.	TokenNameDOT	
EXSLT_STRING_URI	TokenNameIdentifier	 EXSLT  STRING  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"org.apache.xalan.lib.ExsltStrings"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltStrings
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
.	TokenNameDOT	
EXSLT_DATETIME_URI	TokenNameIdentifier	 EXSLT  DATETIME  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"org.apache.xalan.lib.ExsltDatetime"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltDatetime
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
.	TokenNameDOT	
EXSLT_DYNAMIC_URI	TokenNameIdentifier	 EXSLT  DYNAMIC  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"org.apache.xalan.lib.ExsltDynamic"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltDynamic
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExtensionNamespaceContext	TokenNameIdentifier	 Extension Namespace Context
.	TokenNameDOT	
EXSLT_URI	TokenNameIdentifier	 EXSLT  URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
"org.apache.xalan.lib.ExsltCommon"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltCommon
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
