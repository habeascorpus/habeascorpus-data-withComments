/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AVTPartSimple.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AVTPartSimple.java 468643 2006-10-28 06:56:03Z minchau $ 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
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
/** * Simple string part of a complex AVT. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Simple string part of a complex AVT. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
AVTPartSimple	TokenNameIdentifier	 AVT Part Simple
extends	TokenNameextends	
AVTPart	TokenNameIdentifier	 AVT Part
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3744957690598727913L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Simple string value; * @serial */	TokenNameCOMMENT_JAVADOC	 Simple string value; @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_val	TokenNameIdentifier	 m val
;	TokenNameSEMICOLON	
/** * Construct a simple AVT part. * @param val A pure string section of an AVT. */	TokenNameCOMMENT_JAVADOC	 Construct a simple AVT part. @param val A pure string section of an AVT. 
public	TokenNamepublic	
AVTPartSimple	TokenNameIdentifier	 AVT Part Simple
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_val	TokenNameIdentifier	 m val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the AVT part as the original string. * * @return the AVT part as the original string. */	TokenNameCOMMENT_JAVADOC	 Get the AVT part as the original string. * @return the AVT part as the original string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSimpleString	TokenNameIdentifier	 get Simple String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_val	TokenNameIdentifier	 m val
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
// no-op 	TokenNameCOMMENT_LINE	no-op 
}	TokenNameRBRACE	
/** * Write the value into the buffer. * * @param xctxt An XPathContext object, providing infomation specific * to this invocation and this thread. Maintains SAX state, variables, * error handler and so on, so the transformation/XPath object itself * can be simultaneously invoked from multiple threads. * @param buf Buffer to write into. * @param context The current source tree context. * @param nsNode The current namespace context (stylesheet tree context). */	TokenNameCOMMENT_JAVADOC	 Write the value into the buffer. * @param xctxt An XPathContext object, providing infomation specific to this invocation and this thread. Maintains SAX state, variables, error handler and so on, so the transformation/XPath object itself can be simultaneously invoked from multiple threads. @param buf Buffer to write into. @param context The current source tree context. @param nsNode The current namespace context (stylesheet tree context). 
public	TokenNamepublic	
void	TokenNamevoid	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nsNode	TokenNameIdentifier	 ns Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m_val	TokenNameIdentifier	 m val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see XSLTVisitable#callVisitors(XSLTVisitor) */	TokenNameCOMMENT_JAVADOC	 @see XSLTVisitable#callVisitors(XSLTVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't do anything for the subpart for right now. 	TokenNameCOMMENT_LINE	Don't do anything for the subpart for right now. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
