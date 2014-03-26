/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FuncId.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FuncId.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
StringVector	TokenNameIdentifier	 String Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
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
/** * Execute the Id() function. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Execute the Id() function. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
FuncId	TokenNameIdentifier	 Func Id
extends	TokenNameextends	
FunctionOneArg	TokenNameIdentifier	 Function One Arg
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8930573966143567310L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Fill in a list with nodes that match a space delimited list if ID * ID references. * * @param xctxt The runtime XPath context. * @param docContext The document where the nodes are being looked for. * @param refval A space delimited list of ID references. * @param usedrefs List of references for which nodes were found. * @param nodeSet Node set where the nodes will be added to. * @param mayBeMore true if there is another set of nodes to be looked for. * * @return The usedrefs value. */	TokenNameCOMMENT_JAVADOC	 Fill in a list with nodes that match a space delimited list if ID ID references. * @param xctxt The runtime XPath context. @param docContext The document where the nodes are being looked for. @param refval A space delimited list of ID references. @param usedrefs List of references for which nodes were found. @param nodeSet Node set where the nodes will be added to. @param mayBeMore true if there is another set of nodes to be looked for. * @return The usedrefs value. 
private	TokenNameprivate	
StringVector	TokenNameIdentifier	 String Vector
getNodesByID	TokenNameIdentifier	 get Nodes By ID
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
docContext	TokenNameIdentifier	 doc Context
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
refval	TokenNameIdentifier	 refval
,	TokenNameCOMMA	
StringVector	TokenNameIdentifier	 String Vector
usedrefs	TokenNameIdentifier	 usedrefs
,	TokenNameCOMMA	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
nodeSet	TokenNameIdentifier	 node Set
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mayBeMore	TokenNameIdentifier	 may Be More
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
refval	TokenNameIdentifier	 refval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// DOMHelper dh = xctxt.getDOMHelper(); 	TokenNameCOMMENT_LINE	DOMHelper dh = xctxt.getDOMHelper(); 
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
refval	TokenNameIdentifier	 refval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasMore	TokenNameIdentifier	 has More
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
docContext	TokenNameIdentifier	 doc Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
hasMore	TokenNameIdentifier	 has More
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasMore	TokenNameIdentifier	 has More
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
usedrefs	TokenNameIdentifier	 usedrefs
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
usedrefs	TokenNameIdentifier	 usedrefs
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
nodeSet	TokenNameIdentifier	 node Set
.	TokenNameDOT	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
hasMore	TokenNameIdentifier	 has More
||	TokenNameOR_OR	
mayBeMore	TokenNameIdentifier	 may Be More
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
usedrefs	TokenNameIdentifier	 usedrefs
)	TokenNameRPAREN	
usedrefs	TokenNameIdentifier	 usedrefs
=	TokenNameEQUAL	
new	TokenNamenew	
StringVector	TokenNameIdentifier	 String Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usedrefs	TokenNameIdentifier	 usedrefs
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
usedrefs	TokenNameIdentifier	 usedrefs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the function. The function must return * a valid object. * @param xctxt The current execution context. * @return A valid XObject. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the function. The function must return a valid object. @param xctxt The current execution context. @return A valid XObject. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
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
{	TokenNameLBRACE	
int	TokenNameint	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
docContext	TokenNameIdentifier	 doc Context
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
docContext	TokenNameIdentifier	 doc Context
)	TokenNameRPAREN	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_CONTEXT_HAS_NO_OWNERDOC	TokenNameIdentifier	 ER  CONTEXT  HAS  NO  OWNERDOC
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
m_arg0	TokenNameIdentifier	 m arg0
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
argType	TokenNameIdentifier	 arg Type
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XNodeSet	TokenNameIdentifier	 X Node Set
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
nodeSet	TokenNameIdentifier	 node Set
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
mutableNodeset	TokenNameIdentifier	 mutable Nodeset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
==	TokenNameEQUAL_EQUAL	
argType	TokenNameIdentifier	 arg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
ni	TokenNameIdentifier	 ni
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringVector	TokenNameIdentifier	 String Vector
usedrefs	TokenNameIdentifier	 usedrefs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
ndtm	TokenNameIdentifier	 ndtm
=	TokenNameEQUAL	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
refval	TokenNameIdentifier	 refval
=	TokenNameEQUAL	
ndtm	TokenNameIdentifier	 ndtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
ni	TokenNameIdentifier	 ni
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
usedrefs	TokenNameIdentifier	 usedrefs
=	TokenNameEQUAL	
getNodesByID	TokenNameIdentifier	 get Nodes By ID
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
docContext	TokenNameIdentifier	 doc Context
,	TokenNameCOMMA	
refval	TokenNameIdentifier	 refval
,	TokenNameCOMMA	
usedrefs	TokenNameIdentifier	 usedrefs
,	TokenNameCOMMA	
nodeSet	TokenNameIdentifier	 node Set
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ni.detach(); 	TokenNameCOMMENT_LINE	ni.detach(); 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NULL	TokenNameIdentifier	 CLASS  NULL
==	TokenNameEQUAL_EQUAL	
argType	TokenNameIdentifier	 arg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
refval	TokenNameIdentifier	 refval
=	TokenNameEQUAL	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getNodesByID	TokenNameIdentifier	 get Nodes By ID
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
docContext	TokenNameIdentifier	 doc Context
,	TokenNameCOMMA	
refval	TokenNameIdentifier	 refval
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
nodeSet	TokenNameIdentifier	 node Set
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
