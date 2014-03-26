/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExtensionNamespaceSupport.java 468637 2006-10-28 06:51:02Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExtensionNamespaceSupport.java 468637 2006-10-28 06:51:02Z minchau $ 
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
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
/** * During styleseet composition, an ExtensionNamespaceSupport object is created for each extension * namespace the stylesheet uses. At the beginning of a transformation, TransformerImpl generates * an ExtensionHandler for each of these objects and adds an entry to the ExtensionsTable hashtable. */	TokenNameCOMMENT_JAVADOC	 During styleseet composition, an ExtensionNamespaceSupport object is created for each extension namespace the stylesheet uses. At the beginning of a transformation, TransformerImpl generates an ExtensionHandler for each of these objects and adds an entry to the ExtensionsTable hashtable. 
public	TokenNamepublic	
class	TokenNameclass	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
{	TokenNameLBRACE	
// Namespace, ExtensionHandler class name, constructor signature 	TokenNameCOMMENT_LINE	Namespace, ExtensionHandler class name, constructor signature 
// and arguments. 	TokenNameCOMMENT_LINE	and arguments. 
String	TokenNameIdentifier	 String
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
m_handlerClass	TokenNameIdentifier	 m handler Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_sig	TokenNameIdentifier	 m sig
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_args	TokenNameIdentifier	 m args
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
handlerClass	TokenNameIdentifier	 handler Class
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
constructorArgs	TokenNameIdentifier	 constructor Args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namespace	TokenNameIdentifier	 m namespace
=	TokenNameEQUAL	
namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
m_handlerClass	TokenNameIdentifier	 m handler Class
=	TokenNameEQUAL	
handlerClass	TokenNameIdentifier	 handler Class
;	TokenNameSEMICOLON	
m_args	TokenNameIdentifier	 m args
=	TokenNameEQUAL	
constructorArgs	TokenNameIdentifier	 constructor Args
;	TokenNameSEMICOLON	
// Create the constructor signature. 	TokenNameCOMMENT_LINE	Create the constructor signature. 
m_sig	TokenNameIdentifier	 m sig
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_sig	TokenNameIdentifier	 m sig
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m_args	TokenNameIdentifier	 m args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("arg class " + i + " " +m_sig[i]); 	TokenNameCOMMENT_LINE	System.out.println("arg class " + i + " " +m_sig[i]); 
else	TokenNameelse	
// If an arguments is null, pick the constructor later. 	TokenNameCOMMENT_LINE	If an arguments is null, pick the constructor later. 
{	TokenNameLBRACE	
m_sig	TokenNameIdentifier	 m sig
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_namespace	TokenNameIdentifier	 m namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Launch the ExtensionHandler that this ExtensionNamespaceSupport object defines. */	TokenNameCOMMENT_JAVADOC	 Launch the ExtensionHandler that this ExtensionNamespaceSupport object defines. 
public	TokenNamepublic	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
launch	TokenNameIdentifier	 launch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
.	TokenNameDOT	
getClassForName	TokenNameIdentifier	 get Class For Name
(	TokenNameLPAREN	
m_handlerClass	TokenNameIdentifier	 m handler Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//System.out.println("class " + cl + " " + m_args + " " + m_args.length + " " + m_sig); 	TokenNameCOMMENT_LINE	System.out.println("class " + cl + " " + m_args + " " + m_args.length + " " + m_sig); 
if	TokenNameif	
(	TokenNameLPAREN	
m_sig	TokenNameIdentifier	 m sig
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
m_sig	TokenNameIdentifier	 m sig
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
// Pick the constructor based on number of args. 	TokenNameCOMMENT_LINE	Pick the constructor based on number of args. 
{	TokenNameLBRACE	
Constructor	TokenNameIdentifier	 Constructor
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cons	TokenNameIdentifier	 cons
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
.	TokenNameDOT	
getConstructors	TokenNameIdentifier	 get Constructors
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
cons	TokenNameIdentifier	 cons
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cons	TokenNameIdentifier	 cons
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getParameterTypes	TokenNameIdentifier	 get Parameter Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
m_args	TokenNameIdentifier	 m args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
cons	TokenNameIdentifier	 cons
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("constructor " + con); 	TokenNameCOMMENT_LINE	System.out.println("constructor " + con); 
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
)	TokenNameRPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
m_args	TokenNameIdentifier	 m args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
"ExtensionHandler constructor not found"	TokenNameStringLiteral	ExtensionHandler constructor not found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
