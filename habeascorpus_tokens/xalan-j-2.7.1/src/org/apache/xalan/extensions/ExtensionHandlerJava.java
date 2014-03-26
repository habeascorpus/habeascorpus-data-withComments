/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtensionHandlerJava.java 468637 2006-10-28 06:51:02Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtensionHandlerJava.java 468637 2006-10-28 06:51:02Z minchau $ 
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
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** * Abstract base class handling the java language extensions for XPath. * This base class provides cache management shared by all of the * various java extension handlers. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Abstract base class handling the java language extensions for XPath. This base class provides cache management shared by all of the various java extension handlers. * @xsl.usage internal 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ExtensionHandlerJava	TokenNameIdentifier	 Extension Handler Java
extends	TokenNameextends	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
{	TokenNameLBRACE	
/** Extension class name */	TokenNameCOMMENT_JAVADOC	 Extension class name 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_className	TokenNameIdentifier	 m class Name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** Table of cached methods */	TokenNameCOMMENT_JAVADOC	 Table of cached methods 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_cachedMethods	TokenNameIdentifier	 m cached Methods
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct a new extension handler given all the information * needed. * * @param namespaceUri the extension namespace URI that I'm implementing * @param funcNames string containing list of functions of extension NS * @param lang language of code implementing the extension * @param srcURL value of src attribute (if any) - treated as a URL * or a classname depending on the value of lang. If * srcURL is not null, then scriptSrc is ignored. * @param scriptSrc the actual script code (if any) * @param scriptLang the scripting language * @param className the extension class name */	TokenNameCOMMENT_JAVADOC	 Construct a new extension handler given all the information needed. * @param namespaceUri the extension namespace URI that I'm implementing @param funcNames string containing list of functions of extension NS @param lang language of code implementing the extension @param srcURL value of src attribute (if any) - treated as a URL or a classname depending on the value of lang. If srcURL is not null, then scriptSrc is ignored. @param scriptSrc the actual script code (if any) @param scriptLang the scripting language @param className the extension class name 
protected	TokenNameprotected	
ExtensionHandlerJava	TokenNameIdentifier	 Extension Handler Java
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceUri	TokenNameIdentifier	 namespace Uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
scriptLang	TokenNameIdentifier	 script Lang
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
namespaceUri	TokenNameIdentifier	 namespace Uri
,	TokenNameCOMMA	
scriptLang	TokenNameIdentifier	 script Lang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_className	TokenNameIdentifier	 m class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look up the entry in the method cache. * @param methodKey A key that uniquely identifies this invocation in * the stylesheet. * @param objType A Class object or instance object representing the type * @param methodArgs An array of the XObject arguments to be used for * function mangling. * * @return The given method from the method cache */	TokenNameCOMMENT_JAVADOC	 Look up the entry in the method cache. @param methodKey A key that uniquely identifies this invocation in the stylesheet. @param objType A Class object or instance object representing the type @param methodArgs An array of the XObject arguments to be used for function mangling. * @return The given method from the method cache 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getFromCache	TokenNameIdentifier	 get From Cache
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
objType	TokenNameIdentifier	 obj Type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodArgs	TokenNameIdentifier	 method Args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Eventually, we want to insert code to mangle the methodKey with methodArgs 	TokenNameCOMMENT_LINE	Eventually, we want to insert code to mangle the methodKey with methodArgs 
return	TokenNamereturn	
m_cachedMethods	TokenNameIdentifier	 m cached Methods
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a new entry into the method cache. * @param methodKey A key that uniquely identifies this invocation in * the stylesheet. * @param objType A Class object or instance object representing the type * @param methodArgs An array of the XObject arguments to be used for * function mangling. * @param methodObj A Class object or instance object representing the method * * @return The cached method object */	TokenNameCOMMENT_JAVADOC	 Add a new entry into the method cache. @param methodKey A key that uniquely identifies this invocation in the stylesheet. @param objType A Class object or instance object representing the type @param methodArgs An array of the XObject arguments to be used for function mangling. @param methodObj A Class object or instance object representing the method * @return The cached method object 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
putToCache	TokenNameIdentifier	 put To Cache
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
objType	TokenNameIdentifier	 obj Type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodArgs	TokenNameIdentifier	 method Args
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
methodObj	TokenNameIdentifier	 method Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Eventually, we want to insert code to mangle the methodKey with methodArgs 	TokenNameCOMMENT_LINE	Eventually, we want to insert code to mangle the methodKey with methodArgs 
return	TokenNamereturn	
m_cachedMethods	TokenNameIdentifier	 m cached Methods
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
methodKey	TokenNameIdentifier	 method Key
,	TokenNameCOMMA	
methodObj	TokenNameIdentifier	 method Obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
