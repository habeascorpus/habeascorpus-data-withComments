/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Expression.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Expression.java 468655 2006-10-28 07:12:06Z minchau $ 
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
ErrorListener	TokenNameIdentifier	 Error Listener
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
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
DTM	TokenNameIdentifier	 DTM
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XMLString	TokenNameIdentifier	 XML String
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
XNodeSet	TokenNameIdentifier	 X Node Set
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
/** * This abstract class serves as the base for all expression objects. An * Expression can be executed to return a {@link org.apache.xpath.objects.XObject}, * normally has a location within a document or DOM, can send error and warning * events, and normally do not hold state and are meant to be immutable once * construction has completed. An exception to the immutibility rule is iterators * and walkers, which must be cloned in order to be used -- the original must * still be immutable. */	TokenNameCOMMENT_JAVADOC	 This abstract class serves as the base for all expression objects. An Expression can be executed to return a {@link org.apache.xpath.objects.XObject}, normally has a location within a document or DOM, can send error and warning events, and normally do not hold state and are meant to be immutable once construction has completed. An exception to the immutibility rule is iterators and walkers, which must be cloned in order to be used -- the original must still be immutable. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Expression	TokenNameIdentifier	 Expression
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
ExpressionNode	TokenNameIdentifier	 Expression Node
,	TokenNameCOMMA	
XPathVisitable	TokenNameIdentifier	 X Path Visitable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
565665869777906902L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * The location where this expression was built from. Need for diagnostic * messages. May be null. * @serial */	TokenNameCOMMENT_JAVADOC	 The location where this expression was built from. Need for diagnostic messages. May be null. @serial 
private	TokenNameprivate	
ExpressionNode	TokenNameIdentifier	 Expression Node
m_parent	TokenNameIdentifier	 m parent
;	TokenNameSEMICOLON	
/** * Tell if this expression or it's subexpressions can traverse outside * the current subtree. * * @return true if traversal outside the context node's subtree can occur. */	TokenNameCOMMENT_JAVADOC	 Tell if this expression or it's subexpressions can traverse outside the current subtree. * @return true if traversal outside the context node's subtree can occur. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Set the location where this expression was built from. 	TokenNameCOMMENT_LINE	* Set the location where this expression was built from. 
// * 	TokenNameCOMMENT_LINE	* 
// * 	TokenNameCOMMENT_LINE	* 
// * @param locator the location where this expression was built from, may be 	TokenNameCOMMENT_LINE	* @param locator the location where this expression was built from, may be 
// * null. 	TokenNameCOMMENT_LINE	* null. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void setSourceLocator(SourceLocator locator) 	TokenNameCOMMENT_LINE	public void setSourceLocator(SourceLocator locator) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_slocator = locator; 	TokenNameCOMMENT_LINE	m_slocator = locator; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Execute an expression in the XPath runtime context, and return the * result of the expression. * * * @param xctxt The XPath runtime context. * @param currentNode The currentNode. * * @return The result of the expression in the form of a <code>XObject</code>. * * @throws javax.xml.transform.TransformerException if a runtime exception * occurs. */	TokenNameCOMMENT_JAVADOC	 Execute an expression in the XPath runtime context, and return the result of the expression. * @param xctxt The XPath runtime context. @param currentNode The currentNode. * @return The result of the expression in the form of a <code>XObject</code>. * @throws javax.xml.transform.TransformerException if a runtime exception occurs. 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// For now, the current node is already pushed. 	TokenNameCOMMENT_LINE	For now, the current node is already pushed. 
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute an expression in the XPath runtime context, and return the * result of the expression. * * * @param xctxt The XPath runtime context. * @param currentNode The currentNode. * @param dtm The DTM of the current node. * @param expType The expanded type ID of the current node. * * @return The result of the expression in the form of a <code>XObject</code>. * * @throws javax.xml.transform.TransformerException if a runtime exception * occurs. */	TokenNameCOMMENT_JAVADOC	 Execute an expression in the XPath runtime context, and return the result of the expression. * @param xctxt The XPath runtime context. @param currentNode The currentNode. @param dtm The DTM of the current node. @param expType The expanded type ID of the current node. * @return The result of the expression in the form of a <code>XObject</code>. * @throws javax.xml.transform.TransformerException if a runtime exception occurs. 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
// For now, the current node is already pushed. 	TokenNameCOMMENT_LINE	For now, the current node is already pushed. 
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute an expression in the XPath runtime context, and return the * result of the expression. * * * @param xctxt The XPath runtime context. * * @return The result of the expression in the form of a <code>XObject</code>. * * @throws javax.xml.transform.TransformerException if a runtime exception * occurs. */	TokenNameCOMMENT_JAVADOC	 Execute an expression in the XPath runtime context, and return the result of the expression. * @param xctxt The XPath runtime context. * @return The result of the expression in the form of a <code>XObject</code>. * @throws javax.xml.transform.TransformerException if a runtime exception occurs. 
public	TokenNamepublic	
abstract	TokenNameabstract	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
/** * Execute an expression in the XPath runtime context, and return the * result of the expression, but tell that a "safe" object doesn't have * to be returned. The default implementation just calls execute(xctxt). * * * @param xctxt The XPath runtime context. * @param destructiveOK true if a "safe" object doesn't need to be returned. * * @return The result of the expression in the form of a <code>XObject</code>. * * @throws javax.xml.transform.TransformerException if a runtime exception * occurs. */	TokenNameCOMMENT_JAVADOC	 Execute an expression in the XPath runtime context, and return the result of the expression, but tell that a "safe" object doesn't have to be returned. The default implementation just calls execute(xctxt). * @param xctxt The XPath runtime context. @param destructiveOK true if a "safe" object doesn't need to be returned. * @return The result of the expression in the form of a <code>XObject</code>. * @throws javax.xml.transform.TransformerException if a runtime exception occurs. 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
boolean	TokenNameboolean	
destructiveOK	TokenNameIdentifier	 destructive OK
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate expression to a number. * * * @param xctxt The XPath runtime context. * @return The expression evaluated as a double. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Evaluate expression to a number. * @param xctxt The XPath runtime context. @return The expression evaluated as a double. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
double	TokenNamedouble	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate expression to a boolean. * * * @param xctxt The XPath runtime context. * @return false * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Evaluate expression to a boolean. * @param xctxt The XPath runtime context. @return false * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cast result object to a string. * * * @param xctxt The XPath runtime context. * @return The string this wraps or the empty string if null * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Cast result object to a string. * @param xctxt The XPath runtime context. @return The string this wraps or the empty string if null * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
xstr	TokenNameIdentifier	 xstr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the expression is a nodeset expression. In other words, tell * if you can execute {@link #asNode(XPathContext) asNode} without an exception. * @return true if the expression can be represented as a nodeset. */	TokenNameCOMMENT_JAVADOC	 Tell if the expression is a nodeset expression. In other words, tell if you can execute {@link #asNode(XPathContext) asNode} without an exception. @return true if the expression can be represented as a nodeset. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNodesetExpr	TokenNameIdentifier	 is Nodeset Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the first node out of the nodeset, if this expression is * a nodeset expression. * @param xctxt The XPath runtime context. * @return the first node out of the nodeset, or DTM.NULL. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Return the first node out of the nodeset, if this expression is a nodeset expression. @param xctxt The XPath runtime context. @return the first node out of the nodeset, or DTM.NULL. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
int	TokenNameint	
asNode	TokenNameIdentifier	 as Node
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an select expression and a context, evaluate the XPath * and return the resulting iterator. * * @param xctxt The execution context. * @param contextNode The node that "." expresses. * * * @return A valid DTMIterator. * @throws TransformerException thrown if the active ProblemListener decides * the error condition is severe enough to halt processing. * * @throws javax.xml.transform.TransformerException * @xsl.usage experimental */	TokenNameCOMMENT_JAVADOC	 Given an select expression and a context, evaluate the XPath and return the resulting iterator. * @param xctxt The execution context. @param contextNode The node that "." expresses. * @return A valid DTMIterator. @throws TransformerException thrown if the active ProblemListener decides the error condition is severe enough to halt processing. * @throws javax.xml.transform.TransformerException @xsl.usage experimental 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
asIterator	TokenNameIdentifier	 as Iterator
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNodeAndExpression	TokenNameIdentifier	 push Current Node And Expression
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNodeAndExpression	TokenNameIdentifier	 pop Current Node And Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given an select expression and a context, evaluate the XPath * and return the resulting iterator, but do not clone. * * @param xctxt The execution context. * @param contextNode The node that "." expresses. * * * @return A valid DTMIterator. * @throws TransformerException thrown if the active ProblemListener decides * the error condition is severe enough to halt processing. * * @throws javax.xml.transform.TransformerException * @xsl.usage experimental */	TokenNameCOMMENT_JAVADOC	 Given an select expression and a context, evaluate the XPath and return the resulting iterator, but do not clone. * @param xctxt The execution context. @param contextNode The node that "." expresses. * @return A valid DTMIterator. @throws TransformerException thrown if the active ProblemListener decides the error condition is severe enough to halt processing. * @throws javax.xml.transform.TransformerException @xsl.usage experimental 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
asIteratorRaw	TokenNameIdentifier	 as Iterator Raw
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNodeAndExpression	TokenNameIdentifier	 push Current Node And Expression
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XNodeSet	TokenNameIdentifier	 X Node Set
nodeset	TokenNameIdentifier	 nodeset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XNodeSet	TokenNameIdentifier	 X Node Set
)	TokenNameRPAREN	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nodeset	TokenNameIdentifier	 nodeset
.	TokenNameDOT	
iterRaw	TokenNameIdentifier	 iter Raw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNodeAndExpression	TokenNameIdentifier	 pop Current Node And Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Execute an expression in the XPath runtime context, and return the * result of the expression. * * * @param xctxt The XPath runtime context. * NEEDSDOC @param handler * * @return The result of the expression in the form of a <code>XObject</code>. * * @throws javax.xml.transform.TransformerException if a runtime exception * occurs. * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Execute an expression in the XPath runtime context, and return the result of the expression. * @param xctxt The XPath runtime context. NEEDSDOC @param handler * @return The result of the expression in the form of a <code>XObject</code>. * @throws javax.xml.transform.TransformerException if a runtime exception occurs. @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
executeCharsToContentHandler	TokenNameIdentifier	 execute Chars To Content Handler
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this expression returns a stable number that will not change during * iterations within the expression. This is used to determine if a proximity * position predicate can indicate that no more searching has to occur. * * * @return true if the expression represents a stable number. */	TokenNameCOMMENT_JAVADOC	 Tell if this expression returns a stable number that will not change during iterations within the expression. This is used to determine if a proximity position predicate can indicate that no more searching has to occur. * @return true if the expression represents a stable number. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStableNumber	TokenNameIdentifier	 is Stable Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). * NEEDSDOC @param globalsSize */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). NEEDSDOC @param globalsSize 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** * Compare this object with another object and see * if they are equal, include the sub heararchy. * * @param expr Another expression object. * @return true if this objects class and the expr * object's class are the same, and the data contained * within both objects are considered equal. */	TokenNameCOMMENT_JAVADOC	 Compare this object with another object and see if they are equal, include the sub heararchy. * @param expr Another expression object. @return true if this objects class and the expr object's class are the same, and the data contained within both objects are considered equal. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This is a utility method to tell if the passed in * class is the same class as this. It is to be used by * the deepEquals method. I'm bottlenecking it here * because I'm not totally confident that comparing the * class objects is the best way to do this. * @return true of the passed in class is the exact same * class as this class. */	TokenNameCOMMENT_JAVADOC	 This is a utility method to tell if the passed in class is the same class as this. It is to be used by the deepEquals method. I'm bottlenecking it here because I'm not totally confident that comparing the class objects is the best way to do this. @return true of the passed in class is the exact same class as this class. 
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
isSameClass	TokenNameIdentifier	 is Same Class
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Warn the user of an problem. * * @param xctxt The XPath runtime context. * @param msg An error msgkey that corresponds to one of the conststants found * in {@link org.apache.xpath.res.XPATHErrorResources}, which is * a key for a format string. * @param args An array of arguments represented in the format string, which * may be null. * * @throws TransformerException if the current ErrorListoner determines to * throw an exception. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Warn the user of an problem. * @param xctxt The XPath runtime context. @param msg An error msgkey that corresponds to one of the conststants found in {@link org.apache.xpath.res.XPATHErrorResources}, which is a key for a format string. @param args An array of arguments represented in the format string, which may be null. * @throws TransformerException if the current ErrorListoner determines to throw an exception. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHWarning	TokenNameIdentifier	 create XPATH Warning
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorListener	TokenNameIdentifier	 Error Listener
eh	TokenNameIdentifier	 eh
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TO DO: Need to get stylesheet Locator from here. 	TokenNameCOMMENT_LINE	TO DO: Need to get stylesheet Locator from here. 
eh	TokenNameIdentifier	 eh
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell the user of an assertion error, and probably throw an * exception. * * @param b If false, a runtime exception will be thrown. * @param msg The assertion message, which should be informative. * * @throws RuntimeException if the b argument is false. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell the user of an assertion error, and probably throw an exception. * @param b If false, a runtime exception will be thrown. @param msg The assertion message, which should be informative. * @throws RuntimeException if the b argument is false. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
fMsg	TokenNameIdentifier	 f Msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_INCORRECT_PROGRAMMER_ASSERTION	TokenNameIdentifier	 ER  INCORRECT  PROGRAMMER  ASSERTION
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
fMsg	TokenNameIdentifier	 f Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param xctxt The XPath runtime context. * @param msg An error msgkey that corresponds to one of the constants found * in {@link org.apache.xpath.res.XPATHErrorResources}, which is * a key for a format string. * @param args An array of arguments represented in the format string, which * may be null. * * @throws TransformerException if the current ErrorListoner determines to * throw an exception. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param xctxt The XPath runtime context. @param msg An error msgkey that corresponds to one of the constants found in {@link org.apache.xpath.res.XPATHErrorResources}, which is a key for a format string. @param args An array of arguments represented in the format string, which may be null. * @throws TransformerException if the current ErrorListoner determines to throw an exception. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
fmsg	TokenNameIdentifier	 fmsg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorListener	TokenNameIdentifier	 Error Listener
eh	TokenNameIdentifier	 eh
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
fmsg	TokenNameIdentifier	 fmsg
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eh	TokenNameIdentifier	 eh
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the first non-Expression parent of this node. * @return null or first ancestor that is not an Expression. */	TokenNameCOMMENT_JAVADOC	 Get the first non-Expression parent of this node. @return null or first ancestor that is not an Expression. 
public	TokenNamepublic	
ExpressionNode	TokenNameIdentifier	 Expression Node
getExpressionOwner	TokenNameIdentifier	 get Expression Owner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpressionNode	TokenNameIdentifier	 Expression Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
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
//=============== ExpressionNode methods ================ 	TokenNameCOMMENT_LINE	=============== ExpressionNode methods ================ 
/** This pair of methods are used to inform the node of its parent. */	TokenNameCOMMENT_JAVADOC	 This pair of methods are used to inform the node of its parent. 
public	TokenNamepublic	
void	TokenNamevoid	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
,	TokenNameCOMMA	
"Can not parent an expression to itself!"	TokenNameStringLiteral	Can not parent an expression to itself!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parent	TokenNameIdentifier	 m parent
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExpressionNode	TokenNameIdentifier	 Expression Node
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_parent	TokenNameIdentifier	 m parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method tells the node to add its argument to the node's list of children. */	TokenNameCOMMENT_JAVADOC	 This method tells the node to add its argument to the node's list of children. 
public	TokenNamepublic	
void	TokenNamevoid	
exprAddChild	TokenNameIdentifier	 expr Add Child
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"exprAddChild method not implemented!"	TokenNameStringLiteral	exprAddChild method not implemented!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method returns a child node. The children are numbered from zero, left to right. */	TokenNameCOMMENT_JAVADOC	 This method returns a child node. The children are numbered from zero, left to right. 
public	TokenNamepublic	
ExpressionNode	TokenNameIdentifier	 Expression Node
exprGetChild	TokenNameIdentifier	 expr Get Child
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the number of children the node has. */	TokenNameCOMMENT_JAVADOC	 Return the number of children the node has. 
public	TokenNamepublic	
int	TokenNameint	
exprGetNumChildren	TokenNameIdentifier	 expr Get Num Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//=============== SourceLocator methods ================ 	TokenNameCOMMENT_LINE	=============== SourceLocator methods ================ 
/** * Return the public identifier for the current document event. * * <p>The return value is the public identifier of the document * entity or of the external parsed entity in which the markup that * triggered the event appears.</p> * * @return A string containing the public identifier, or * null if none is available. * @see #getSystemId */	TokenNameCOMMENT_JAVADOC	 Return the public identifier for the current document event. * <p>The return value is the public identifier of the document entity or of the external parsed entity in which the markup that triggered the event appears.</p> * @return A string containing the public identifier, or null if none is available. @see #getSystemId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_parent	TokenNameIdentifier	 m parent
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the system identifier for the current document event. * * <p>The return value is the system identifier of the document * entity or of the external parsed entity in which the markup that * triggered the event appears.</p> * * <p>If the system identifier is a URL, the parser must resolve it * fully before passing it to the application.</p> * * @return A string containing the system identifier, or null * if none is available. * @see #getPublicId */	TokenNameCOMMENT_JAVADOC	 Return the system identifier for the current document event. * <p>The return value is the system identifier of the document entity or of the external parsed entity in which the markup that triggered the event appears.</p> * <p>If the system identifier is a URL, the parser must resolve it fully before passing it to the application.</p> * @return A string containing the system identifier, or null if none is available. @see #getPublicId 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_parent	TokenNameIdentifier	 m parent
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the line number where the current document event ends. * * <p><strong>Warning:</strong> The return value from the method * is intended only as an approximation for the sake of error * reporting; it is not intended to provide sufficient information * to edit the character content of the original XML document.</p> * * <p>The return value is an approximation of the line number * in the document entity or external parsed entity where the * markup that triggered the event appears.</p> * * @return The line number, or -1 if none is available. * @see #getColumnNumber */	TokenNameCOMMENT_JAVADOC	 Return the line number where the current document event ends. * <p><strong>Warning:</strong> The return value from the method is intended only as an approximation for the sake of error reporting; it is not intended to provide sufficient information to edit the character content of the original XML document.</p> * <p>The return value is an approximation of the line number in the document entity or external parsed entity where the markup that triggered the event appears.</p> * @return The line number, or -1 if none is available. @see #getColumnNumber 
public	TokenNamepublic	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_parent	TokenNameIdentifier	 m parent
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the character position where the current document event ends. * * <p><strong>Warning:</strong> The return value from the method * is intended only as an approximation for the sake of error * reporting; it is not intended to provide sufficient information * to edit the character content of the original XML document.</p> * * <p>The return value is an approximation of the column number * in the document entity or external parsed entity where the * markup that triggered the event appears.</p> * * @return The column number, or -1 if none is available. * @see #getLineNumber */	TokenNameCOMMENT_JAVADOC	 Return the character position where the current document event ends. * <p><strong>Warning:</strong> The return value from the method is intended only as an approximation for the sake of error reporting; it is not intended to provide sufficient information to edit the character content of the original XML document.</p> * <p>The return value is an approximation of the column number in the document entity or external parsed entity where the markup that triggered the event appears.</p> * @return The column number, or -1 if none is available. @see #getLineNumber 
public	TokenNamepublic	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_parent	TokenNameIdentifier	 m parent
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
