/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtensionNamespacesManager.java 469672 2006-10-31 21:56:19Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtensionNamespacesManager.java 469672 2006-10-31 21:56:19Z minchau $ 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
/** * Used during assembly of a stylesheet to collect the information for each * extension namespace that is required during the transformation process * to generate an {@link ExtensionHandler}. * */	TokenNameCOMMENT_JAVADOC	 Used during assembly of a stylesheet to collect the information for each extension namespace that is required during the transformation process to generate an {@link ExtensionHandler}. 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionNamespacesManager	TokenNameIdentifier	 Extension Namespaces Manager
{	TokenNameLBRACE	
/** * Vector of ExtensionNamespaceSupport objects to be used to generate ExtensionHandlers. */	TokenNameCOMMENT_JAVADOC	 Vector of ExtensionNamespaceSupport objects to be used to generate ExtensionHandlers. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_extensions	TokenNameIdentifier	 m extensions
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Vector of ExtensionNamespaceSupport objects for predefined ExtensionNamespaces. Elements * from this vector are added to the m_extensions vector when encountered in the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Vector of ExtensionNamespaceSupport objects for predefined ExtensionNamespaces. Elements from this vector are added to the m_extensions vector when encountered in the stylesheet. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Vector of extension namespaces for which sufficient information is not yet available to * complete the registration process. */	TokenNameCOMMENT_JAVADOC	 Vector of extension namespaces for which sufficient information is not yet available to complete the registration process. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_unregisteredExtensions	TokenNameIdentifier	 m unregistered Extensions
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An ExtensionNamespacesManager is instantiated the first time an extension function or * element is found in the stylesheet. During initialization, a vector of ExtensionNamespaceSupport * objects is created, one for each predefined extension namespace. */	TokenNameCOMMENT_JAVADOC	 An ExtensionNamespacesManager is instantiated the first time an extension function or element is found in the stylesheet. During initialization, a vector of ExtensionNamespaceSupport objects is created, one for each predefined extension namespace. 
public	TokenNamepublic	
ExtensionNamespacesManager	TokenNameIdentifier	 Extension Namespaces Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPredefinedNamespaces	TokenNameIdentifier	 set Predefined Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If necessary, register the extension namespace found compiling a function or * creating an extension element. * * If it is a predefined namespace, create a * support object to simplify the instantiate of an appropriate ExtensionHandler * during transformation runtime. Otherwise, add the namespace, if necessary, * to a vector of undefined extension namespaces, to be defined later. * */	TokenNameCOMMENT_JAVADOC	 If necessary, register the extension namespace found compiling a function or creating an extension element. * If it is a predefined namespace, create a support object to simplify the instantiate of an appropriate ExtensionHandler during transformation runtime. Otherwise, add the namespace, if necessary, to a vector of undefined extension namespaces, to be defined later. 
public	TokenNamepublic	
void	TokenNamevoid	
registerExtension	TokenNameIdentifier	 register Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceIndex	TokenNameIdentifier	 namespace Index
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
m_extensions	TokenNameIdentifier	 m extensions
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
predef	TokenNameIdentifier	 predef
=	TokenNameEQUAL	
namespaceIndex	TokenNameIdentifier	 namespace Index
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
predef	TokenNameIdentifier	 predef
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_extensions	TokenNameIdentifier	 m extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
predef	TokenNameIdentifier	 predef
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
m_unregisteredExtensions	TokenNameIdentifier	 m unregistered Extensions
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_unregisteredExtensions	TokenNameIdentifier	 m unregistered Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Register the extension namespace for an ElemExtensionDecl or ElemFunction, * and prepare a support object to launch the appropriate ExtensionHandler at * transformation runtime. */	TokenNameCOMMENT_JAVADOC	 Register the extension namespace for an ElemExtensionDecl or ElemFunction, and prepare a support object to launch the appropriate ExtensionHandler at transformation runtime. 
public	TokenNamepublic	
void	TokenNamevoid	
registerExtension	TokenNameIdentifier	 register Extension
(	TokenNameLPAREN	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
extNsSpt	TokenNameIdentifier	 ext Ns Spt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceIndex	TokenNameIdentifier	 namespace Index
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
m_extensions	TokenNameIdentifier	 m extensions
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_extensions	TokenNameIdentifier	 m extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_unregisteredExtensions	TokenNameIdentifier	 m unregistered Extensions
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_unregisteredExtensions	TokenNameIdentifier	 m unregistered Extensions
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the index for a namespace entry in the extension namespace Vector, -1 if * no such entry yet exists. */	TokenNameCOMMENT_JAVADOC	 Get the index for a namespace entry in the extension namespace Vector, -1 if no such entry yet exists. 
public	TokenNamepublic	
int	TokenNameint	
namespaceIndex	TokenNameIdentifier	 namespace Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
extensions	TokenNameIdentifier	 extensions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
)	TokenNameRPAREN	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the vector of extension namespaces. Used to provide * the extensions table access to a list of extension * namespaces encountered during composition of a stylesheet. */	TokenNameCOMMENT_JAVADOC	 Get the vector of extension namespaces. Used to provide the extensions table access to a list of extension namespaces encountered during composition of a stylesheet. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getExtensions	TokenNameIdentifier	 get Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_extensions	TokenNameIdentifier	 m extensions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempt to register any unregistered extension namespaces. */	TokenNameCOMMENT_JAVADOC	 Attempt to register any unregistered extension namespaces. 
public	TokenNamepublic	
void	TokenNamevoid	
registerUnregisteredNamespaces	TokenNameIdentifier	 register Unregistered Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_unregisteredExtensions	TokenNameIdentifier	 m unregistered Extensions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_unregisteredExtensions	TokenNameIdentifier	 m unregistered Extensions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
extNsSpt	TokenNameIdentifier	 ext Ns Spt
=	TokenNameEQUAL	
defineJavaNamespace	TokenNameIdentifier	 define Java Namespace
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_extensions	TokenNameIdentifier	 m extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * For any extension namespace that is not either predefined or defined * by a "component" declaration or exslt function declaration, attempt * to create an ExtensionNamespaceSuport object for the appropriate * Java class or Java package Extension Handler. * * Called by StylesheetRoot.recompose(), after all ElemTemplate compose() * operations have taken place, in order to set up handlers for * the remaining extension namespaces. * * @param ns The extension namespace URI. * @return An ExtensionNamespaceSupport object for this namespace * (which defines the ExtensionHandler to be used), or null if such * an object cannot be created. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 For any extension namespace that is not either predefined or defined by a "component" declaration or exslt function declaration, attempt to create an ExtensionNamespaceSuport object for the appropriate Java class or Java package Extension Handler. * Called by StylesheetRoot.recompose(), after all ElemTemplate compose() operations have taken place, in order to set up handlers for the remaining extension namespaces. * @param ns The extension namespace URI. @return An ExtensionNamespaceSupport object for this namespace (which defines the ExtensionHandler to be used), or null if such an object cannot be created. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
defineJavaNamespace	TokenNameIdentifier	 define Java Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defineJavaNamespace	TokenNameIdentifier	 define Java Namespace
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
defineJavaNamespace	TokenNameIdentifier	 define Java Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
classOrPackage	TokenNameIdentifier	 class Or Package
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
||	TokenNameOR_OR	
ns	TokenNameIdentifier	 ns
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
// defensive. I don't think it's needed. -sb 	TokenNameCOMMENT_LINE	defensive. I don't think it's needed. -sb 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Prepare the name of the actual class or package, stripping 	TokenNameCOMMENT_LINE	Prepare the name of the actual class or package, stripping 
// out any leading "class:". Next, see if there is a /. If so, 	TokenNameCOMMENT_LINE	out any leading "class:". Next, see if there is a /. If so, 
// only look at the text to the right of the rightmost /. 	TokenNameCOMMENT_LINE	only look at the text to the right of the rightmost /. 
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
classOrPackage	TokenNameIdentifier	 class Or Package
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"class:"	TokenNameStringLiteral	class:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
// The className can be null here, and can cause an error in getClassForName 	TokenNameCOMMENT_LINE	The className can be null here, and can cause an error in getClassForName 
// in JDK 1.8. 	TokenNameCOMMENT_LINE	in JDK 1.8. 
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
)	TokenNameRPAREN	
return	TokenNamereturn	
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
return	TokenNamereturn	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
"org.apache.xalan.extensions.ExtensionHandlerJavaClass"	TokenNameStringLiteral	org.apache.xalan.extensions.ExtensionHandlerJavaClass
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
"javaclass"	TokenNameStringLiteral	javaclass
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
}	TokenNameRBRACE	
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
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
"org.apache.xalan.extensions.ExtensionHandlerJavaPackage"	TokenNameStringLiteral	org.apache.xalan.extensions.ExtensionHandlerJavaPackage
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
"javapackage"	TokenNameStringLiteral	javapackage
,	TokenNameCOMMA	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* public ExtensionNamespaceSupport getSupport(int index, Vector extensions) { return (ExtensionNamespaceSupport)extensions.elementAt(index); } */	TokenNameCOMMENT_BLOCK	 public ExtensionNamespaceSupport getSupport(int index, Vector extensions) { return (ExtensionNamespaceSupport)extensions.elementAt(index); } 
/** * Set up a Vector for predefined extension namespaces. */	TokenNameCOMMENT_JAVADOC	 Set up a Vector for predefined extension namespaces. 
private	TokenNameprivate	
void	TokenNamevoid	
setPredefinedNamespaces	TokenNameIdentifier	 set Predefined Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXTENSIONS_JAVA_URL	TokenNameIdentifier	 S  EXTENSIONS  JAVA  URL
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
handlerClassName	TokenNameIdentifier	 handler Class Name
=	TokenNameEQUAL	
"org.apache.xalan.extensions.ExtensionHandlerJavaPackage"	TokenNameStringLiteral	org.apache.xalan.extensions.ExtensionHandlerJavaPackage
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
=	TokenNameEQUAL	
"javapackage"	TokenNameStringLiteral	javapackage
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXTENSIONS_OLD_JAVA_URL	TokenNameIdentifier	 S  EXTENSIONS  OLD  JAVA  URL
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXTENSIONS_LOTUSXSL_JAVA_URL	TokenNameIdentifier	 S  EXTENSIONS  LOTUSXSL  JAVA  URL
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_BUILTIN_EXTENSIONS_URL	TokenNameIdentifier	 S  BUILTIN  EXTENSIONS  URL
;	TokenNameSEMICOLON	
handlerClassName	TokenNameIdentifier	 handler Class Name
=	TokenNameEQUAL	
"org.apache.xalan.extensions.ExtensionHandlerJavaClass"	TokenNameStringLiteral	org.apache.xalan.extensions.ExtensionHandlerJavaClass
;	TokenNameSEMICOLON	
lang	TokenNameIdentifier	 lang
=	TokenNameEQUAL	
"javaclass"	TokenNameStringLiteral	javaclass
;	TokenNameSEMICOLON	
// for remaining predefined extension namespaces. 	TokenNameCOMMENT_LINE	for remaining predefined extension namespaces. 
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.Extensions"	TokenNameStringLiteral	org.apache.xalan.lib.Extensions
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_BUILTIN_OLD_EXTENSIONS_URL	TokenNameIdentifier	 S  BUILTIN  OLD  EXTENSIONS  URL
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Xalan extension namespaces (redirect, pipe and SQL). 	TokenNameCOMMENT_LINE	Xalan extension namespaces (redirect, pipe and SQL). 
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXTENSIONS_REDIRECT_URL	TokenNameIdentifier	 S  EXTENSIONS  REDIRECT  URL
;	TokenNameSEMICOLON	
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.Redirect"	TokenNameStringLiteral	org.apache.xalan.lib.Redirect
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXTENSIONS_PIPE_URL	TokenNameIdentifier	 S  EXTENSIONS  PIPE  URL
;	TokenNameSEMICOLON	
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.PipeDocument"	TokenNameStringLiteral	org.apache.xalan.lib.PipeDocument
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXTENSIONS_SQL_URL	TokenNameIdentifier	 S  EXTENSIONS  SQL  URL
;	TokenNameSEMICOLON	
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.sql.XConnection"	TokenNameStringLiteral	org.apache.xalan.lib.sql.XConnection
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//EXSLT namespaces (not including EXSLT function namespaces which are 	TokenNameCOMMENT_LINE	EXSLT namespaces (not including EXSLT function namespaces which are 
// registered by the associated ElemFunction. 	TokenNameCOMMENT_LINE	registered by the associated ElemFunction. 
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXSLT_COMMON_URL	TokenNameIdentifier	 S  EXSLT  COMMON  URL
;	TokenNameSEMICOLON	
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.ExsltCommon"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltCommon
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXSLT_MATH_URL	TokenNameIdentifier	 S  EXSLT  MATH  URL
;	TokenNameSEMICOLON	
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.ExsltMath"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltMath
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXSLT_SETS_URL	TokenNameIdentifier	 S  EXSLT  SETS  URL
;	TokenNameSEMICOLON	
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.ExsltSets"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltSets
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXSLT_DATETIME_URL	TokenNameIdentifier	 S  EXSLT  DATETIME  URL
;	TokenNameSEMICOLON	
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.ExsltDatetime"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltDatetime
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXSLT_DYNAMIC_URL	TokenNameIdentifier	 S  EXSLT  DYNAMIC  URL
;	TokenNameSEMICOLON	
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.ExsltDynamic"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltDynamic
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXSLT_STRINGS_URL	TokenNameIdentifier	 S  EXSLT  STRINGS  URL
;	TokenNameSEMICOLON	
lib	TokenNameIdentifier	 lib
=	TokenNameEQUAL	
"org.apache.xalan.lib.ExsltStrings"	TokenNameStringLiteral	org.apache.xalan.lib.ExsltStrings
;	TokenNameSEMICOLON	
m_predefExtensions	TokenNameIdentifier	 m predef Extensions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
handlerClassName	TokenNameIdentifier	 handler Class Name
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
lib	TokenNameIdentifier	 lib
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
