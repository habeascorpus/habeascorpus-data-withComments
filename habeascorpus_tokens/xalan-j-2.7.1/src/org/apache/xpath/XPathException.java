/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPathException.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XPathException.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class implements an exception object that all * XPath classes will throw in case of an error. This class * extends TransformerException, and may hold other exceptions. In the * case of nested exceptions, printStackTrace will dump * all the traces of the nested exceptions, not just the trace * of this object. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 This class implements an exception object that all XPath classes will throw in case of an error. This class extends TransformerException, and may hold other exceptions. In the case of nested exceptions, printStackTrace will dump all the traces of the nested exceptions, not just the trace of this object. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
XPathException	TokenNameIdentifier	 X Path Exception
extends	TokenNameextends	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
4263549717619045963L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The home of the expression that caused the error. * @serial */	TokenNameCOMMENT_JAVADOC	 The home of the expression that caused the error. @serial 
Object	TokenNameIdentifier	 Object
m_styleNode	TokenNameIdentifier	 m style Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get the stylesheet node from where this error originated. * @return The stylesheet node from where this error originated, or null. */	TokenNameCOMMENT_JAVADOC	 Get the stylesheet node from where this error originated. @return The stylesheet node from where this error originated, or null. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getStylesheetNode	TokenNameIdentifier	 get Stylesheet Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_styleNode	TokenNameIdentifier	 m style Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the stylesheet node from where this error originated. * @param styleNode The stylesheet node from where this error originated, or null. */	TokenNameCOMMENT_JAVADOC	 Set the stylesheet node from where this error originated. @param styleNode The stylesheet node from where this error originated, or null. 
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheetNode	TokenNameIdentifier	 set Stylesheet Node
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
styleNode	TokenNameIdentifier	 style Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_styleNode	TokenNameIdentifier	 m style Node
=	TokenNameEQUAL	
styleNode	TokenNameIdentifier	 style Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A nested exception. * @serial */	TokenNameCOMMENT_JAVADOC	 A nested exception. @serial 
protected	TokenNameprotected	
Exception	TokenNameIdentifier	 Exception
m_exception	TokenNameIdentifier	 m exception
;	TokenNameSEMICOLON	
/** * Create an XPathException object that holds * an error message. * @param message The error message. */	TokenNameCOMMENT_JAVADOC	 Create an XPathException object that holds an error message. @param message The error message. 
public	TokenNamepublic	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
ExpressionNode	TokenNameIdentifier	 Expression Node
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setLocator	TokenNameIdentifier	 set Locator
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setStylesheetNode	TokenNameIdentifier	 set Stylesheet Node
(	TokenNameLPAREN	
getStylesheetNode	TokenNameIdentifier	 get Stylesheet Node
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XPathException object that holds * an error message. * @param message The error message. */	TokenNameCOMMENT_JAVADOC	 Create an XPathException object that holds an error message. @param message The error message. 
public	TokenNamepublic	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the XSLT ElemVariable that this sub-expression references. In order for * this to work, the SourceLocator must be the owning ElemTemplateElement. * @return The dereference to the ElemVariable, or null if not found. */	TokenNameCOMMENT_JAVADOC	 Get the XSLT ElemVariable that this sub-expression references. In order for this to work, the SourceLocator must be the owning ElemTemplateElement. @return The dereference to the ElemVariable, or null if not found. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
getStylesheetNode	TokenNameIdentifier	 get Stylesheet Node
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpressionNode	TokenNameIdentifier	 Expression Node
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
getExpressionOwner	TokenNameIdentifier	 get Expression Owner
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
owner	TokenNameIdentifier	 owner
&&	TokenNameAND_AND	
owner	TokenNameIdentifier	 owner
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first non-Expression parent of this node. * @return null or first ancestor that is not an Expression. */	TokenNameCOMMENT_JAVADOC	 Get the first non-Expression parent of this node. @return null or first ancestor that is not an Expression. 
protected	TokenNameprotected	
ExpressionNode	TokenNameIdentifier	 Expression Node
getExpressionOwner	TokenNameIdentifier	 get Expression Owner
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpressionNode	TokenNameIdentifier	 Expression Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
Expression	TokenNameIdentifier	 Expression
)	TokenNameRPAREN	
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XPathException object that holds * an error message and the stylesheet node that * the error originated from. * @param message The error message. * @param styleNode The stylesheet node that the error originated from. */	TokenNameCOMMENT_JAVADOC	 Create an XPathException object that holds an error message and the stylesheet node that the error originated from. @param message The error message. @param styleNode The stylesheet node that the error originated from. 
public	TokenNamepublic	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
styleNode	TokenNameIdentifier	 style Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_styleNode	TokenNameIdentifier	 m style Node
=	TokenNameEQUAL	
styleNode	TokenNameIdentifier	 style Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XPathException object that holds * an error message, the stylesheet node that * the error originated from, and another exception * that caused this exception. * @param message The error message. * @param styleNode The stylesheet node that the error originated from. * @param e The exception that caused this exception. */	TokenNameCOMMENT_JAVADOC	 Create an XPathException object that holds an error message, the stylesheet node that the error originated from, and another exception that caused this exception. @param message The error message. @param styleNode The stylesheet node that the error originated from. @param e The exception that caused this exception. 
public	TokenNamepublic	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_styleNode	TokenNameIdentifier	 m style Node
=	TokenNameEQUAL	
styleNode	TokenNameIdentifier	 style Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_exception	TokenNameIdentifier	 m exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XPathException object that holds * an error message, and another exception * that caused this exception. * @param message The error message. * @param e The exception that caused this exception. */	TokenNameCOMMENT_JAVADOC	 Create an XPathException object that holds an error message, and another exception that caused this exception. @param message The error message. @param e The exception that caused this exception. 
public	TokenNamepublic	
XPathException	TokenNameIdentifier	 X Path Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_exception	TokenNameIdentifier	 m exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print the the trace of methods from where the error * originated. This will trace all nested exception * objects, as well as this object. * @param s The stream where the dump will be sent to. */	TokenNameCOMMENT_JAVADOC	 Print the the trace of methods from where the error originated. This will trace all nested exception objects, as well as this object. @param s The stream where the dump will be sent to. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
m_exception	TokenNameIdentifier	 m exception
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"---------"	TokenNameStringLiteral	---------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformerException	TokenNameIdentifier	 Transformer Exception
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
==	TokenNameEQUAL_EQUAL	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Find the most contained message. * * @return The error message of the originating exception. */	TokenNameCOMMENT_JAVADOC	 Find the most contained message. * @return The error message of the originating exception. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lastMessage	TokenNameIdentifier	 last Message
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
m_exception	TokenNameIdentifier	 m exception
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
nextMessage	TokenNameIdentifier	 next Message
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nextMessage	TokenNameIdentifier	 next Message
)	TokenNameRPAREN	
lastMessage	TokenNameIdentifier	 last Message
=	TokenNameEQUAL	
nextMessage	TokenNameIdentifier	 next Message
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformerException	TokenNameIdentifier	 Transformer Exception
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
==	TokenNameEQUAL_EQUAL	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
lastMessage	TokenNameIdentifier	 last Message
)	TokenNameRPAREN	
?	TokenNameQUESTION	
lastMessage	TokenNameIdentifier	 last Message
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print the the trace of methods from where the error * originated. This will trace all nested exception * objects, as well as this object. * @param s The writer where the dump will be sent to. */	TokenNameCOMMENT_JAVADOC	 Print the the trace of methods from where the error originated. This will trace all nested exception objects, as well as this object. @param s The writer where the dump will be sent to. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isJdk14OrHigher	TokenNameIdentifier	 is Jdk14 Or Higher
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getCause"	TokenNameStringLiteral	getCause
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isJdk14OrHigher	TokenNameIdentifier	 is Jdk14 Or Higher
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
// The printStackTrace method of the Throwable class in jdk 1.4 	TokenNameCOMMENT_LINE	The printStackTrace method of the Throwable class in jdk 1.4 
// and higher will include the cause when printing the backtrace. 	TokenNameCOMMENT_LINE	and higher will include the cause when printing the backtrace. 
// The following code is only required when using jdk 1.3 or lower 	TokenNameCOMMENT_LINE	The following code is only required when using jdk 1.3 or lower 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isJdk14OrHigher	TokenNameIdentifier	 is Jdk14 Or Higher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
m_exception	TokenNameIdentifier	 m exception
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"---------"	TokenNameStringLiteral	---------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Could not print stack trace..."	TokenNameStringLiteral	Could not print stack trace...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
instanceof	TokenNameinstanceof	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformerException	TokenNameIdentifier	 Transformer Exception
se	TokenNameIdentifier	 se
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
)	TokenNameRPAREN	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
Throwable	TokenNameIdentifier	 Throwable
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
==	TokenNameEQUAL_EQUAL	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the embedded exception, if any. * Overrides javax.xml.transform.TransformerException.getException(). * * @return The embedded exception, or null if there is none. */	TokenNameCOMMENT_JAVADOC	 Return the embedded exception, if any. Overrides javax.xml.transform.TransformerException.getException(). * @return The embedded exception, or null if there is none. 
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_exception	TokenNameIdentifier	 m exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
