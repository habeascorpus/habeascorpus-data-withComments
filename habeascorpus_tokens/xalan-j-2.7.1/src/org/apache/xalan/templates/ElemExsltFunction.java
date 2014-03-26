/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemExsltFunction.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemExsltFunction.java 468643 2006-10-28 06:56:03Z minchau $ 
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
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
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
VariableStack	TokenNameIdentifier	 Variable Stack
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * Implement func:function. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement func:function. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemExsltFunction	TokenNameIdentifier	 Elem Exslt Function
extends	TokenNameextends	
ElemTemplate	TokenNameIdentifier	 Elem Template
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
272154954793534771L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Get an integer representation of the element type. * * @return An integer representation of the element, defined in the * Constants class. * @see org.apache.xalan.templates.Constants */	TokenNameCOMMENT_JAVADOC	 Get an integer representation of the element type. * @return An integer representation of the element, defined in the Constants class. @see org.apache.xalan.templates.Constants 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
EXSLT_ELEMNAME_FUNCTION	TokenNameIdentifier	 EXSLT  ELEMNAME  FUNCTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name, defined in the * Constants class. * @see org.apache.xalan.templates.Constants * @return The node name * */	TokenNameCOMMENT_JAVADOC	 Return the node name, defined in the Constants class. @see org.apache.xalan.templates.Constants @return The node name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
EXSLT_ELEMNAME_FUNCTION_STRING	TokenNameIdentifier	 EXSLT  ELEMNAME  FUNCTION  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
VariableStack	TokenNameIdentifier	 Variable Stack
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Increment the frame bottom of the variable stack by the 	TokenNameCOMMENT_LINE	Increment the frame bottom of the variable stack by the 
// frame size 	TokenNameCOMMENT_LINE	frame size 
int	TokenNameint	
thisFrame	TokenNameIdentifier	 this Frame
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
getStackFrame	TokenNameIdentifier	 get Stack Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextFrame	TokenNameIdentifier	 next Frame
=	TokenNameEQUAL	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
m_frameSize	TokenNameIdentifier	 m frame Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_inArgsSize	TokenNameIdentifier	 m in Args Size
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
"function called with too many args"	TokenNameStringLiteral	function called with too many args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set parameters, 	TokenNameCOMMENT_LINE	Set parameters, 
// have to clear the section of the stack frame that has params. 	TokenNameCOMMENT_LINE	have to clear the section of the stack frame that has params. 
if	TokenNameif	
(	TokenNameLPAREN	
m_inArgsSize	TokenNameIdentifier	 m in Args Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
clearLocalSlots	TokenNameIdentifier	 clear Local Slots
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_inArgsSize	TokenNameIdentifier	 m in Args Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
thisFrame	TokenNameIdentifier	 this Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
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
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
ElemParam	TokenNameIdentifier	 Elem Param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemParam	TokenNameIdentifier	 Elem Param
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemParam	TokenNameIdentifier	 Elem Param
)	TokenNameRPAREN	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setLocalVariable	TokenNameIdentifier	 set Local Variable
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
nextFrame	TokenNameIdentifier	 next Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
nextFrame	TokenNameIdentifier	 next Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Removed ElemTemplate 'push' and 'pop' of RTFContext, in order to avoid losing the RTF context 	TokenNameCOMMENT_LINE	Removed ElemTemplate 'push' and 'pop' of RTFContext, in order to avoid losing the RTF context 
// before a value can be returned. ElemExsltFunction operates in the scope of the template that called 	TokenNameCOMMENT_LINE	before a value can be returned. ElemExsltFunction operates in the scope of the template that called 
// the function. 	TokenNameCOMMENT_LINE	the function. 
// xctxt.pushRTFContext(); 	TokenNameCOMMENT_LINE	xctxt.pushRTFContext(); 
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
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
nextFrame	TokenNameIdentifier	 next Frame
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
executeChildTemplates	TokenNameIdentifier	 execute Child Templates
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reset the stack frame after the function call 	TokenNameCOMMENT_LINE	Reset the stack frame after the function call 
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
thisFrame	TokenNameIdentifier	 this Frame
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
// Following ElemTemplate 'pop' removed -- see above. 	TokenNameCOMMENT_LINE	Following ElemTemplate 'pop' removed -- see above. 
// xctxt.popRTFContext(); 	TokenNameCOMMENT_LINE	xctxt.popRTFContext(); 
}	TokenNameRBRACE	
/** * Called after everything else has been * recomposed, and allows the function to set remaining * values that may be based on some other property that * depends on recomposition. */	TokenNameCOMMENT_JAVADOC	 Called after everything else has been recomposed, and allows the function to set remaining values that may be based on some other property that depends on recomposition. 
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Register the function namespace (if not already registered). 	TokenNameCOMMENT_LINE	Register the function namespace (if not already registered). 
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
handlerClass	TokenNameIdentifier	 handler Class
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getExtensionHandlerClass	TokenNameIdentifier	 get Extension Handler Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
{	TokenNameLBRACE	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
sroot	TokenNameIdentifier	 sroot
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
extNsSpt	TokenNameIdentifier	 ext Ns Spt
=	TokenNameEQUAL	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
handlerClass	TokenNameIdentifier	 handler Class
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getExtensionNamespacesManager	TokenNameIdentifier	 get Extension Namespaces Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
registerExtension	TokenNameIdentifier	 register Extension
(	TokenNameLPAREN	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure there is a handler for the EXSLT functions namespace 	TokenNameCOMMENT_LINE	Make sure there is a handler for the EXSLT functions namespace 
// -- for isElementAvailable(). 	TokenNameCOMMENT_LINE	-- for isElementAvailable(). 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXSLT_FUNCTIONS_URL	TokenNameIdentifier	 S  EXSLT  FUNCTIONS  URL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_EXSLT_FUNCTIONS_URL	TokenNameIdentifier	 S  EXSLT  FUNCTIONS  URL
;	TokenNameSEMICOLON	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
sroot	TokenNameIdentifier	 sroot
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
=	TokenNameEQUAL	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
handlerClass	TokenNameIdentifier	 handler Class
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getExtensionNamespacesManager	TokenNameIdentifier	 get Extension Namespaces Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
registerExtension	TokenNameIdentifier	 register Extension
(	TokenNameLPAREN	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
