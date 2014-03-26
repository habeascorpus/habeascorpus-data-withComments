/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExpressionVisitor.java 468637 2006-10-28 06:51:02Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExpressionVisitor.java 468637 2006-10-28 06:51:02Z minchau $ 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
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
functions	TokenNameIdentifier	 functions
.	TokenNameDOT	
FuncExtFunctionAvailable	TokenNameIdentifier	 Func Ext Function Available
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
Function	TokenNameIdentifier	 Function
;	TokenNameSEMICOLON	
/** * When {@link org.apache.xalan.processor.StylesheetHandler} creates * an {@link org.apache.xpath.XPath}, the ExpressionVisitor * visits the XPath expression. For any extension functions it * encounters, it instructs StylesheetRoot to register the * extension namespace. * * This mechanism is required to locate extension functions * that may be embedded within an expression. */	TokenNameCOMMENT_JAVADOC	 When {@link org.apache.xalan.processor.StylesheetHandler} creates an {@link org.apache.xpath.XPath}, the ExpressionVisitor visits the XPath expression. For any extension functions it encounters, it instructs StylesheetRoot to register the extension namespace. * This mechanism is required to locate extension functions that may be embedded within an expression. 
public	TokenNamepublic	
class	TokenNameclass	
ExpressionVisitor	TokenNameIdentifier	 Expression Visitor
extends	TokenNameextends	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
{	TokenNameLBRACE	
private	TokenNameprivate	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
m_sroot	TokenNameIdentifier	 m sroot
;	TokenNameSEMICOLON	
/** * The constructor sets the StylesheetRoot variable which * is used to register extension namespaces. * @param sroot the StylesheetRoot that is being constructed. */	TokenNameCOMMENT_JAVADOC	 The constructor sets the StylesheetRoot variable which is used to register extension namespaces. @param sroot the StylesheetRoot that is being constructed. 
public	TokenNamepublic	
ExpressionVisitor	TokenNameIdentifier	 Expression Visitor
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_sroot	TokenNameIdentifier	 m sroot
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the function is an extension function, register the namespace. * * @param owner The current XPath object that owns the expression. * @param func The function currently being visited. * * @return true to continue the visit in the subtree, if any. */	TokenNameCOMMENT_JAVADOC	 If the function is an extension function, register the namespace. * @param owner The current XPath object that owns the expression. @param func The function currently being visited. * @return true to continue the visit in the subtree, if any. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitFunction	TokenNameIdentifier	 visit Function
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Function	TokenNameIdentifier	 Function
func	TokenNameIdentifier	 func
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
func	TokenNameIdentifier	 func
instanceof	TokenNameinstanceof	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FuncExtFunction	TokenNameIdentifier	 Func Ext Function
)	TokenNameRPAREN	
func	TokenNameIdentifier	 func
)	TokenNameRPAREN	
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_sroot	TokenNameIdentifier	 m sroot
.	TokenNameDOT	
getExtensionNamespacesManager	TokenNameIdentifier	 get Extension Namespaces Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
registerExtension	TokenNameIdentifier	 register Extension
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
func	TokenNameIdentifier	 func
instanceof	TokenNameinstanceof	
FuncExtFunctionAvailable	TokenNameIdentifier	 Func Ext Function Available
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FuncExtFunctionAvailable	TokenNameIdentifier	 Func Ext Function Available
)	TokenNameRPAREN	
func	TokenNameIdentifier	 func
)	TokenNameRPAREN	
.	TokenNameDOT	
getArg0	TokenNameIdentifier	 get Arg0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
m_sroot	TokenNameIdentifier	 m sroot
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_sroot	TokenNameIdentifier	 m sroot
.	TokenNameDOT	
getExtensionNamespacesManager	TokenNameIdentifier	 get Extension Namespaces Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
registerExtension	TokenNameIdentifier	 register Extension
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
