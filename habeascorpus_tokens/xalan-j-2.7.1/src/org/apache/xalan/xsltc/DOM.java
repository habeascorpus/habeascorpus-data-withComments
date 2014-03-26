/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOM.java 468648 2006-10-28 07:00:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOM.java 468648 2006-10-28 07:00:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
interface	TokenNameinterface	
DOM	TokenNameIdentifier	 DOM
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
FIRST_TYPE	TokenNameIdentifier	 FIRST  TYPE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NO_TYPE	TokenNameIdentifier	 NO  TYPE
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 0 is reserved for NodeIterator.END 	TokenNameCOMMENT_LINE	0 is reserved for NodeIterator.END 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
NULL	TokenNameIdentifier	 NULL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// used by some node iterators to know which node to return 	TokenNameCOMMENT_LINE	used by some node iterators to know which node to return 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
RETURN_CURRENT	TokenNameIdentifier	 RETURN  CURRENT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
RETURN_PARENT	TokenNameIdentifier	 RETURN  PARENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Constants used by getResultTreeFrag to indicate the types of the RTFs. 	TokenNameCOMMENT_LINE	Constants used by getResultTreeFrag to indicate the types of the RTFs. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
SIMPLE_RTF	TokenNameIdentifier	 SIMPLE  RTF
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
ADAPTIVE_RTF	TokenNameIdentifier	 ADAPTIVE  RTF
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TREE_RTF	TokenNameIdentifier	 TREE  RTF
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** returns singleton iterator containg the document root */	TokenNameCOMMENT_JAVADOC	 returns singleton iterator containg the document root 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getTypedChildren	TokenNameIdentifier	 get Typed Children
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getTypedAxisIterator	TokenNameIdentifier	 get Typed Axis Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getNthDescendant	TokenNameIdentifier	 get Nth Descendant
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeself	TokenNameIdentifier	 includeself
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getNamespaceAxisIterator	TokenNameIdentifier	 get Namespace Axis Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getNodeValueIterator	TokenNameIdentifier	 get Node Value Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
int	TokenNameint	
returnType	TokenNameIdentifier	 return Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
orderNodes	TokenNameIdentifier	 order Nodes
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceName	TokenNameIdentifier	 get Namespace Name
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getNamespaceType	TokenNameIdentifier	 get Namespace Type
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
gType	TokenNameIdentifier	 g Type
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringValueX	TokenNameIdentifier	 get String Value X
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransletException	TokenNameIdentifier	 Translet Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
nodes	TokenNameIdentifier	 nodes
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransletException	TokenNameIdentifier	 Translet Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
shallowCopy	TokenNameIdentifier	 shallow Copy
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransletException	TokenNameIdentifier	 Translet Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node1	TokenNameIdentifier	 node1
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
node2	TokenNameIdentifier	 node2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
textNode	TokenNameIdentifier	 text Node
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransletException	TokenNameIdentifier	 Translet Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
makeNode	TokenNameIdentifier	 make Node
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
makeNode	TokenNameIdentifier	 make Node
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
makeNodeList	TokenNameIdentifier	 make Node List
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
makeNodeList	TokenNameIdentifier	 make Node List
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentURI	TokenNameIdentifier	 get Document URI
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setFilter	TokenNameIdentifier	 set Filter
(	TokenNameLPAREN	
StripFilter	TokenNameIdentifier	 Strip Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setupMapping	TokenNameIdentifier	 setup Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
names	TokenNameIdentifier	 names
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
urisArray	TokenNameIdentifier	 uris Array
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
typesArray	TokenNameIdentifier	 types Array
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
namespaces	TokenNameIdentifier	 namespaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttribute	TokenNameIdentifier	 is Attribute
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransletException	TokenNameIdentifier	 Translet Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getNodeIdent	TokenNameIdentifier	 get Node Ident
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nodehandle	TokenNameIdentifier	 nodehandle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getNodeHandle	TokenNameIdentifier	 get Node Handle
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nodeId	TokenNameIdentifier	 node Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DOM	TokenNameIdentifier	 DOM
getResultTreeFrag	TokenNameIdentifier	 get Result Tree Frag
(	TokenNameLPAREN	
int	TokenNameint	
initialSize	TokenNameIdentifier	 initial Size
,	TokenNameCOMMA	
int	TokenNameint	
rtfType	TokenNameIdentifier	 rtf Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DOM	TokenNameIdentifier	 DOM
getResultTreeFrag	TokenNameIdentifier	 get Result Tree Frag
(	TokenNameLPAREN	
int	TokenNameint	
initialSize	TokenNameIdentifier	 initial Size
,	TokenNameCOMMA	
int	TokenNameint	
rtfType	TokenNameIdentifier	 rtf Type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
addToDTMManager	TokenNameIdentifier	 add To DTM Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
getOutputDomBuilder	TokenNameIdentifier	 get Output Dom Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getNSType	TokenNameIdentifier	 get NS Type
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUnparsedEntityURI	TokenNameIdentifier	 get Unparsed Entity URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
getElementsWithIDs	TokenNameIdentifier	 get Elements With I Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
