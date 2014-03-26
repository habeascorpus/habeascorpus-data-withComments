/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: KeyIterator.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: KeyIterator.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
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
Axis	TokenNameIdentifier	 Axis
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
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
OneStepIteratorForward	TokenNameIdentifier	 One Step Iterator Forward
;	TokenNameSEMICOLON	
/** * This class implements an optimized iterator for * "key()" patterns, matching each node to the * match attribute in one or more xsl:key declarations. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class implements an optimized iterator for "key()" patterns, matching each node to the match attribute in one or more xsl:key declarations. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
KeyIterator	TokenNameIdentifier	 Key Iterator
extends	TokenNameextends	
OneStepIteratorForward	TokenNameIdentifier	 One Step Iterator Forward
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1349109910100249661L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Key name. * @serial */	TokenNameCOMMENT_JAVADOC	 Key name. @serial 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
/** * Get the key name from a key declaration this iterator will process * * * @return Key name */	TokenNameCOMMENT_JAVADOC	 Get the key name from a key declaration this iterator will process * @return Key name 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Vector of Key declarations in the stylesheet. * @serial */	TokenNameCOMMENT_JAVADOC	 Vector of Key declarations in the stylesheet. @serial 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
;	TokenNameSEMICOLON	
/** * Get the key declarations from the stylesheet * * * @return Vector containing the key declarations from the stylesheet */	TokenNameCOMMENT_JAVADOC	 Get the key declarations from the stylesheet * @return Vector containing the key declarations from the stylesheet 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getKeyDeclarations	TokenNameIdentifier	 get Key Declarations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a KeyIterator object. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a KeyIterator object. * @throws javax.xml.transform.TransformerException 
KeyIterator	TokenNameIdentifier	 Key Iterator
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
keyDeclarations	TokenNameIdentifier	 key Declarations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_keyDeclarations	TokenNameIdentifier	 m key Declarations
=	TokenNameEQUAL	
keyDeclarations	TokenNameIdentifier	 key Declarations
;	TokenNameSEMICOLON	
// m_prefixResolver = nscontext; 	TokenNameCOMMENT_LINE	m_prefixResolver = nscontext; 
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test whether a specified node is visible in the logical view of a * TreeWalker or NodeIterator. This function will be called by the * implementation of TreeWalker and NodeIterator; it is not intended to * be called directly from user code. * * @param testNode The node to check to see if it passes the filter or not. * * @return a constant to determine whether the node is accepted, * rejected, or skipped, as defined above . */	TokenNameCOMMENT_JAVADOC	 Test whether a specified node is visible in the logical view of a TreeWalker or NodeIterator. This function will be called by the implementation of TreeWalker and NodeIterator; it is not intended to be called directly from user code. * @param testNode The node to check to see if it passes the filter or not. * @return a constant to determine whether the node is accepted, rejected, or skipped, as defined above . 
public	TokenNamepublic	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
int	TokenNameint	
testNode	TokenNameIdentifier	 test Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
foundKey	TokenNameIdentifier	 found Key
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
KeyIterator	TokenNameIdentifier	 Key Iterator
ki	TokenNameIdentifier	 ki
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyIterator	TokenNameIdentifier	 Key Iterator
)	TokenNameRPAREN	
m_lpi	TokenNameIdentifier	 m lpi
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
ki	TokenNameIdentifier	 ki
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
ki	TokenNameIdentifier	 ki
.	TokenNameDOT	
getKeyDeclarations	TokenNameIdentifier	 get Key Declarations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ki	TokenNameIdentifier	 ki
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// System.out.println("lookupKey: "+lookupKey); 	TokenNameCOMMENT_LINE	System.out.println("lookupKey: "+lookupKey); 
int	TokenNameint	
nDeclarations	TokenNameIdentifier	 n Declarations
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Walk through each of the declarations made with xsl:key 	TokenNameCOMMENT_LINE	Walk through each of the declarations made with xsl:key 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nDeclarations	TokenNameIdentifier	 n Declarations
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
kd	TokenNameIdentifier	 kd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyDeclaration	TokenNameIdentifier	 Key Declaration
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only continue if the name on this key declaration 	TokenNameCOMMENT_LINE	Only continue if the name on this key declaration 
// matches the name on the iterator for this walker. 	TokenNameCOMMENT_LINE	matches the name on the iterator for this walker. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
kd	TokenNameIdentifier	 kd
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
foundKey	TokenNameIdentifier	 found Key
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// xctxt.setNamespaceContext(ki.getPrefixResolver()); 	TokenNameCOMMENT_LINE	xctxt.setNamespaceContext(ki.getPrefixResolver()); 
// See if our node matches the given key declaration according to 	TokenNameCOMMENT_LINE	See if our node matches the given key declaration according to 
// the match attribute on xsl:key. 	TokenNameCOMMENT_LINE	the match attribute on xsl:key. 
XPath	TokenNameIdentifier	 X Path
matchExpr	TokenNameIdentifier	 match Expr
=	TokenNameEQUAL	
kd	TokenNameIdentifier	 kd
.	TokenNameDOT	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
matchExpr	TokenNameIdentifier	 match Expr
.	TokenNameDOT	
getMatchScore	TokenNameIdentifier	 get Match Score
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
testNode	TokenNameIdentifier	 test Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
==	TokenNameEQUAL_EQUAL	
kd	TokenNameIdentifier	 kd
.	TokenNameDOT	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
MATCH_SCORE_NONE	TokenNameIdentifier	 MATCH  SCORE  NONE
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end for(int i = 0; i < nDeclarations; i++) 	TokenNameCOMMENT_LINE	end for(int i = 0; i < nDeclarations; i++) 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: What to do? 	TokenNameCOMMENT_LINE	TODO: What to do? 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundKey	TokenNameIdentifier	 found Key
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_XSLKEY_DECLARATION	TokenNameIdentifier	 ER  NO  XSLKEY  DECLARATION
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_REJECT	TokenNameIdentifier	 FILTER  REJECT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
