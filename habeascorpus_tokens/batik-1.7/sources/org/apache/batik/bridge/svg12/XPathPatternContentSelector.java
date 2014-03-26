/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
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
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractDocument	TokenNameIdentifier	 Abstract Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg12	TokenNameIdentifier	 svg12
.	TokenNameDOT	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathException	TokenNameIdentifier	 X Path Exception
;	TokenNameSEMICOLON	
/** * A class to handle the XPath Pattern syntax for XBL content elements. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: XPathPatternContentSelector.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A class to handle the XPath Pattern syntax for XBL content elements. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: XPathPatternContentSelector.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
XPathPatternContentSelector	TokenNameIdentifier	 X Path Pattern Content Selector
extends	TokenNameextends	
AbstractContentSelector	TokenNameIdentifier	 Abstract Content Selector
{	TokenNameLBRACE	
/** * The Xalan prefix resolver. */	TokenNameCOMMENT_JAVADOC	 The Xalan prefix resolver. 
protected	TokenNameprotected	
NSPrefixResolver	TokenNameIdentifier	 NS Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
=	TokenNameEQUAL	
new	TokenNamenew	
NSPrefixResolver	TokenNameIdentifier	 NS Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The XPath expression. */	TokenNameCOMMENT_JAVADOC	 The XPath expression. 
protected	TokenNameprotected	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
/** * The XPath context. */	TokenNameCOMMENT_JAVADOC	 The XPath context. 
protected	TokenNameprotected	
XPathContext	TokenNameIdentifier	 X Path Context
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
/** * The selected nodes. */	TokenNameCOMMENT_JAVADOC	 The selected nodes. 
protected	TokenNameprotected	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
selectedContent	TokenNameIdentifier	 selected Content
;	TokenNameSEMICOLON	
/** * The expression string. */	TokenNameCOMMENT_JAVADOC	 The expression string. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
expression	TokenNameIdentifier	 expression
;	TokenNameSEMICOLON	
/** * Creates a new XPathPatternContentSelector. */	TokenNameCOMMENT_JAVADOC	 Creates a new XPathPatternContentSelector. 
public	TokenNamepublic	
XPathPatternContentSelector	TokenNameIdentifier	 X Path Pattern Content Selector
(	TokenNameLPAREN	
ContentManager	TokenNameIdentifier	 Content Manager
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
XBLOMContentElement	TokenNameIdentifier	 XBLOM Content Element
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
bound	TokenNameIdentifier	 bound
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
selector	TokenNameIdentifier	 selector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
bound	TokenNameIdentifier	 bound
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
selector	TokenNameIdentifier	 selector
;	TokenNameSEMICOLON	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the XPath selector. */	TokenNameCOMMENT_JAVADOC	 Parses the XPath selector. 
protected	TokenNameprotected	
void	TokenNamevoid	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH	TokenNameIdentifier	 MATCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
contentElement	TokenNameIdentifier	 content Element
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createXPathException	TokenNameIdentifier	 create X Path Exception
(	TokenNameLPAREN	
XPathException	TokenNameIdentifier	 X Path Exception
.	TokenNameDOT	
INVALID_EXPRESSION_ERR	TokenNameIdentifier	 INVALID  EXPRESSION  ERR
,	TokenNameCOMMA	
"xpath.invalid.expression"	TokenNameStringLiteral	xpath.invalid.expression
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a list of nodes that were matched by the given selector * string. */	TokenNameCOMMENT_JAVADOC	 Returns a list of nodes that were matched by the given selector string. 
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
getSelectedContent	TokenNameIdentifier	 get Selected Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selectedContent	TokenNameIdentifier	 selected Content
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectedContent	TokenNameIdentifier	 selected Content
=	TokenNameEQUAL	
new	TokenNamenew	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
selectedContent	TokenNameIdentifier	 selected Content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Forces this selector to update its selected nodes list. * Returns true if the selected node list needed updating. * This assumes that the previous content elements in this * shadow tree (in document order) have up-to-date selectedContent * lists. */	TokenNameCOMMENT_JAVADOC	 Forces this selector to update its selected nodes list. Returns true if the selected node list needed updating. This assumes that the previous content elements in this shadow tree (in document order) have up-to-date selectedContent lists. 
boolean	TokenNameboolean	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
selectedContent	TokenNameIdentifier	 selected Content
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
selectedContent	TokenNameIdentifier	 selected Content
=	TokenNameEQUAL	
new	TokenNamenew	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
selectedContent	TokenNameIdentifier	 selected Content
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implementation of NodeList that contains the nodes that matched * this selector. */	TokenNameCOMMENT_JAVADOC	 Implementation of NodeList that contains the nodes that matched this selector. 
protected	TokenNameprotected	
class	TokenNameclass	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
implements	TokenNameimplements	
NodeList	TokenNameIdentifier	 Node List
{	TokenNameLBRACE	
/** * The selected nodes. */	TokenNameCOMMENT_JAVADOC	 The selected nodes. 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new SelectedNodes object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SelectedNodes object. 
public	TokenNamepublic	
SelectedNodes	TokenNameIdentifier	 Selected Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
oldNodes	TokenNameIdentifier	 old Nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
boundElement	TokenNameIdentifier	 bound Element
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
nodesSize	TokenNameIdentifier	 nodes Size
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldNodes	TokenNameIdentifier	 old Nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodesSize	TokenNameIdentifier	 nodes Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nodesSize	TokenNameIdentifier	 nodes Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldNodes	TokenNameIdentifier	 old Nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
descendantSelected	TokenNameIdentifier	 descendant Selected
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
||	TokenNameOR_OR	
descendantSelected	TokenNameIdentifier	 descendant Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
double	TokenNamedouble	
matchScore	TokenNameIdentifier	 match Score
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
prefixResolver	TokenNameIdentifier	 prefix Resolver
)	TokenNameRPAREN	
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchScore	TokenNameIdentifier	 match Score
!=	TokenNameNOT_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH_SCORE_NONE	TokenNameIdentifier	 MATCH  SCORE  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
descendantSelected	TokenNameIdentifier	 descendant Selected
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
contentElement	TokenNameIdentifier	 content Element
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createXPathException	TokenNameIdentifier	 create X Path Exception
(	TokenNameLPAREN	
XPathException	TokenNameIdentifier	 X Path Exception
.	TokenNameDOT	
INVALID_EXPRESSION_ERR	TokenNameIdentifier	 INVALID  EXPRESSION  ERR
,	TokenNameCOMMA	
"xpath.error"	TokenNameStringLiteral	xpath.error
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
expression	TokenNameIdentifier	 expression
,	TokenNameCOMMA	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#item(int)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#item(int)}. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#getLength()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.NodeList#getLength()}. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Xalan prefix resolver. */	TokenNameCOMMENT_JAVADOC	 Xalan prefix resolver. 
protected	TokenNameprotected	
class	TokenNameclass	
NSPrefixResolver	TokenNameIdentifier	 NS Prefix Resolver
implements	TokenNameimplements	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
{	TokenNameLBRACE	
/** * Get the base URI for this resolver. Since this resolver isn't * associated with a particular node, returns null. */	TokenNameCOMMENT_JAVADOC	 Get the base URI for this resolver. Since this resolver isn't associated with a particular node, returns null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseIdentifier	TokenNameIdentifier	 get Base Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolves the given namespace prefix. */	TokenNameCOMMENT_JAVADOC	 Resolves the given namespace prefix. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
contentElement	TokenNameIdentifier	 content Element
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resolves the given namespace prefix. */	TokenNameCOMMENT_JAVADOC	 Resolves the given namespace prefix. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore the context node 	TokenNameCOMMENT_LINE	ignore the context node 
return	TokenNamereturn	
contentElement	TokenNameIdentifier	 content Element
.	TokenNameDOT	
lookupNamespaceURI	TokenNameIdentifier	 lookup Namespace URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this PrefixResolver handles a null prefix. */	TokenNameCOMMENT_JAVADOC	 Returns whether this PrefixResolver handles a null prefix. 
public	TokenNamepublic	
boolean	TokenNameboolean	
handlesNullPrefixes	TokenNameIdentifier	 handles Null Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
