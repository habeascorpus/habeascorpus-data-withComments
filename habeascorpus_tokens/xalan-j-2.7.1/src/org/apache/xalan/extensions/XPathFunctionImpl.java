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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
;	TokenNameSEMICOLON	
/** * A sample implementation of XPathFunction, with support for * EXSLT extension functions and Java extension functions. */	TokenNameCOMMENT_JAVADOC	 A sample implementation of XPathFunction, with support for EXSLT extension functions and Java extension functions. 
public	TokenNamepublic	
class	TokenNameclass	
XPathFunctionImpl	TokenNameIdentifier	 X Path Function Impl
implements	TokenNameimplements	
XPathFunction	TokenNameIdentifier	 X Path Function
{	TokenNameLBRACE	
private	TokenNameprivate	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
m_handler	TokenNameIdentifier	 m handler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_funcName	TokenNameIdentifier	 m func Name
;	TokenNameSEMICOLON	
/** * Construct an instance of XPathFunctionImpl from the * ExtensionHandler and function name. */	TokenNameCOMMENT_JAVADOC	 Construct an instance of XPathFunctionImpl from the ExtensionHandler and function name. 
public	TokenNamepublic	
XPathFunctionImpl	TokenNameIdentifier	 X Path Function Impl
(	TokenNameLPAREN	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
funcName	TokenNameIdentifier	 func Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_handler	TokenNameIdentifier	 m handler
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
;	TokenNameSEMICOLON	
m_funcName	TokenNameIdentifier	 m func Name
=	TokenNameEQUAL	
funcName	TokenNameIdentifier	 func Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.xpath.XPathFunction#evaluate(java.util.List) */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.xpath.XPathFunction#evaluate(java.util.List) 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
argsVec	TokenNameIdentifier	 args Vec
=	TokenNameEQUAL	
listToVector	TokenNameIdentifier	 list To Vector
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// The method key and ExpressionContext are set to null. 	TokenNameCOMMENT_LINE	The method key and ExpressionContext are set to null. 
return	TokenNamereturn	
m_handler	TokenNameIdentifier	 m handler
.	TokenNameDOT	
callFunction	TokenNameIdentifier	 call Function
(	TokenNameLPAREN	
m_funcName	TokenNameIdentifier	 m func Name
,	TokenNameCOMMA	
argsVec	TokenNameIdentifier	 args Vec
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XPathFunctionException	TokenNameIdentifier	 X Path Function Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Convert a java.util.List to a java.util.Vector. * No conversion is done if the List is already a Vector. */	TokenNameCOMMENT_JAVADOC	 Convert a java.util.List to a java.util.Vector. No conversion is done if the List is already a Vector. 
private	TokenNameprivate	
static	TokenNamestatic	
Vector	TokenNameIdentifier	 Vector
listToVector	TokenNameIdentifier	 list To Vector
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
instanceof	TokenNameinstanceof	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
