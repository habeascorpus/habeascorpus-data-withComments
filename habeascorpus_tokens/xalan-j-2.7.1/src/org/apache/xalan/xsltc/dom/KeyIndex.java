/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: KeyIndex.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: KeyIndex.java 468651 2006-10-28 07:04:25Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
DOM	TokenNameIdentifier	 DOM
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
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
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
BasisLibrary	TokenNameIdentifier	 Basis Library
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IntegerArray	TokenNameIdentifier	 Integer Array
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
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
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
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
;	TokenNameSEMICOLON	
/** * Stores mappings of key values or IDs to DTM nodes. * <em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em> * @author Morten Jorgensen * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 Stores mappings of key values or IDs to DTM nodes. <em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em> @author Morten Jorgensen @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
class	TokenNameclass	
KeyIndex	TokenNameIdentifier	 Key Index
extends	TokenNameextends	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
{	TokenNameLBRACE	
/** * A mapping between values and nodesets for the current document. Used * only while building keys. */	TokenNameCOMMENT_JAVADOC	 A mapping between values and nodesets for the current document. Used only while building keys. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * The document node currently being processed. Used only while building * keys. */	TokenNameCOMMENT_JAVADOC	 The document node currently being processed. Used only while building keys. 
private	TokenNameprivate	
int	TokenNameint	
_currentDocumentNode	TokenNameIdentifier	 current Document Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * A mapping from a document node to the mapping between values and nodesets */	TokenNameCOMMENT_JAVADOC	 A mapping from a document node to the mapping between values and nodesets 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_rootToIndexMap	TokenNameIdentifier	 root To Index Map
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The node set associated to the current value passed * to lookupKey(); */	TokenNameCOMMENT_JAVADOC	 The node set associated to the current value passed to lookupKey(); 
private	TokenNameprivate	
IntegerArray	TokenNameIdentifier	 Integer Array
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The XSLTC DOM object if this KeyIndex is being used to implement the * id() function. */	TokenNameCOMMENT_JAVADOC	 The XSLTC DOM object if this KeyIndex is being used to implement the id() function. 
private	TokenNameprivate	
DOM	TokenNameIdentifier	 DOM
_dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
;	TokenNameSEMICOLON	
/** * Store position after call to setMark() */	TokenNameCOMMENT_JAVADOC	 Store position after call to setMark() 
private	TokenNameprivate	
int	TokenNameint	
_markedPosition	TokenNameIdentifier	 marked Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
KeyIndex	TokenNameIdentifier	 Key Index
(	TokenNameLPAREN	
int	TokenNameint	
dummy	TokenNameIdentifier	 dummy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Adds a node to the node list for a given value. Nodes will * always be added in document order. */	TokenNameCOMMENT_JAVADOC	 Adds a node to the node list for a given value. Nodes will always be added in document order. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_currentDocumentNode	TokenNameIdentifier	 current Document Node
!=	TokenNameNOT_EQUAL	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentDocumentNode	TokenNameIdentifier	 current Document Node
=	TokenNameEQUAL	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
_index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_rootToIndexMap	TokenNameIdentifier	 root To Index Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
_index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IntegerArray	TokenNameIdentifier	 Integer Array
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
_index	TokenNameIdentifier	 index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerArray	TokenNameIdentifier	 Integer Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_index	TokenNameIdentifier	 index
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Because nodes are added in document order, 	TokenNameCOMMENT_LINE	Because nodes are added in document order, 
// duplicates can be eliminated easily at this stage. 	TokenNameCOMMENT_LINE	duplicates can be eliminated easily at this stage. 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Merge the current value's nodeset set by lookupKey() with _nodes. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Merge the current value's nodeset set by lookupKey() with _nodes. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
KeyIndex	TokenNameIdentifier	 Key Index
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method must be called by the code generated by the id() function * prior to returning the node iterator. The lookup code for key() and * id() differ in the way the lookup value can be whitespace separated * list of tokens for the id() function, but a single string for the * key() function. * @deprecated */	TokenNameCOMMENT_JAVADOC	 This method must be called by the code generated by the id() function prior to returning the node iterator. The lookup code for key() and id() differ in the way the lookup value can be whitespace separated list of tokens for the id() function, but a single string for the key() function. @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
lookupId	TokenNameIdentifier	 lookup Id
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Clear _nodes array 	TokenNameCOMMENT_LINE	Clear _nodes array 
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntegerArray	TokenNameIdentifier	 Integer Array
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
_index	TokenNameIdentifier	 index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
hasDOMSource	TokenNameIdentifier	 has DOM Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
getDOMNodeById	TokenNameIdentifier	 get DOM Node By Id
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return an IntegerArray for the DOM Node which has the given id. * * @param id The id * @return A IntegerArray representing the Node whose id is the given value. */	TokenNameCOMMENT_JAVADOC	 Return an IntegerArray for the DOM Node which has the given id. * @param id The id @return A IntegerArray representing the Node whose id is the given value. 
public	TokenNamepublic	
IntegerArray	TokenNameIdentifier	 Integer Array
getDOMNodeById	TokenNameIdentifier	 get DOM Node By Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IntegerArray	TokenNameIdentifier	 Integer Array
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getElementById	TokenNameIdentifier	 get Element By Id
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
_rootToIndexMap	TokenNameIdentifier	 root To Index Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_rootToIndexMap	TokenNameIdentifier	 root To Index Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerArray	TokenNameIdentifier	 Integer Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getNodeHandle	TokenNameIdentifier	 get Node Handle
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>This method must be called by the code generated by the key() function * prior to returning the node iterator.</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>This method must be called by the code generated by the key() function prior to returning the node iterator.</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
lookupKey	TokenNameIdentifier	 lookup Key
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IntegerArray	TokenNameIdentifier	 Integer Array
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
_index	TokenNameIdentifier	 index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Callers should not call next() after it returns END.</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>Callers should not call next() after it returns END.</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
_position	TokenNameIdentifier	 position
<	TokenNameLESS	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNodeHandle	TokenNameIdentifier	 get Node Handle
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
_position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a context node and the argument to the XPath <code>id</code> * function, checks whether the context node is in the set of nodes that * results from that reference to the <code>id</code> function. This is * used in the implementation of <code>id</code> patterns. * * @param node The context node * @param value The argument to the <code>id</code> function * @return <code>1</code> if the context node is in the set of nodes * returned by the reference to the <code>id</code> function; * <code>0</code>, otherwise */	TokenNameCOMMENT_JAVADOC	 Given a context node and the argument to the XPath <code>id</code> function, checks whether the context node is in the set of nodes that results from that reference to the <code>id</code> function. This is used in the implementation of <code>id</code> patterns. * @param node The context node @param value The argument to the <code>id</code> function @return <code>1</code> if the context node is in the set of nodes returned by the reference to the <code>id</code> function; <code>0</code>, otherwise 
public	TokenNamepublic	
int	TokenNameint	
containsID	TokenNameIdentifier	 contains ID
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
int	TokenNameint	
rootHandle	TokenNameIdentifier	 root Handle
=	TokenNameEQUAL	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
)	TokenNameRPAREN	
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the mapping table for the document containing the context node 	TokenNameCOMMENT_LINE	Get the mapping table for the document containing the context node 
Hashtable	TokenNameIdentifier	 Hashtable
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
_rootToIndexMap	TokenNameIdentifier	 root To Index Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Split argument to id function into XML whitespace separated tokens 	TokenNameCOMMENT_LINE	Split argument to id function into XML whitespace separated tokens 
final	TokenNamefinal	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntegerArray	TokenNameIdentifier	 Integer Array
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If input was from W3C DOM, use DOM's getElementById to do 	TokenNameCOMMENT_LINE	If input was from W3C DOM, use DOM's getElementById to do 
// the look-up. 	TokenNameCOMMENT_LINE	the look-up. 
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
hasDOMSource	TokenNameIdentifier	 has DOM Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
getDOMNodeById	TokenNameIdentifier	 get DOM Node By Id
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Did we find the context node in the set of nodes? 	TokenNameCOMMENT_LINE	Did we find the context node in the set of nodes? 
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Didn't find the context node in the set of nodes returned by id 	TokenNameCOMMENT_LINE	Didn't find the context node in the set of nodes returned by id 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Given a context node and the second argument to the XSLT * <code>key</code> function, checks whether the context node is in the * set of nodes that results from that reference to the <code>key</code> * function. This is used in the implementation of key patterns.</p> * <p>This particular {@link KeyIndex} object is the result evaluating the * first argument to the <code>key</code> function, so it's not taken into * any further account.</p> * * @param node The context node * @param value The second argument to the <code>key</code> function * @return <code>1</code> if and only if the context node is in the set of * nodes returned by the reference to the <code>key</code> function; * <code>0</code>, otherwise */	TokenNameCOMMENT_JAVADOC	 <p>Given a context node and the second argument to the XSLT <code>key</code> function, checks whether the context node is in the set of nodes that results from that reference to the <code>key</code> function. This is used in the implementation of key patterns.</p> <p>This particular {@link KeyIndex} object is the result evaluating the first argument to the <code>key</code> function, so it's not taken into any further account.</p> * @param node The context node @param value The second argument to the <code>key</code> function @return <code>1</code> if and only if the context node is in the set of nodes returned by the reference to the <code>key</code> function; <code>0</code>, otherwise 
public	TokenNamepublic	
int	TokenNameint	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
rootHandle	TokenNameIdentifier	 root Handle
=	TokenNameEQUAL	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
)	TokenNameRPAREN	
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the mapping table for the document containing the context node 	TokenNameCOMMENT_LINE	Get the mapping table for the document containing the context node 
Hashtable	TokenNameIdentifier	 Hashtable
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
_rootToIndexMap	TokenNameIdentifier	 root To Index Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check whether the context node is present in the set of nodes 	TokenNameCOMMENT_LINE	Check whether the context node is present in the set of nodes 
// returned by the key function 	TokenNameCOMMENT_LINE	returned by the key function 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
IntegerArray	TokenNameIdentifier	 Integer Array
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The particular key name identifies no nodes in this document 	TokenNameCOMMENT_LINE	The particular key name identifies no nodes in this document 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Resets the iterator to the last start node.</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>Resets the iterator to the last start node.</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns the number of elements in this iterator.</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>Returns the number of elements in this iterator.</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns the position of the current node in the set.</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>Returns the position of the current node in the set.</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Remembers the current node for the next call to gotoMark().</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>Remembers the current node for the next call to gotoMark().</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_markedPosition	TokenNameIdentifier	 marked Position
=	TokenNameEQUAL	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Restores the current node remembered by setMark().</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>Restores the current node remembered by setMark().</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
_markedPosition	TokenNameIdentifier	 marked Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END.</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END.</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Get start to END should 'close' the iterator, * i.e. subsequent call to next() should return END.</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>Get start to END should 'close' the iterator, i.e. subsequent call to next() should return END.</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
int	TokenNameint	
getStartNode	TokenNameIdentifier	 get Start Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>True if this iterator has a reversed axis.</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>True if this iterator has a reversed axis.</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Returns a deep copy of this iterator.</p> * <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is * <b>deprecated.</b></em></p> * @deprecated */	TokenNameCOMMENT_JAVADOC	 <p>Returns a deep copy of this iterator.</p> <p><em>Use of an instance of this class as a {@link DTMAxisIterator} is <b>deprecated.</b></em></p> @deprecated 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
KeyIndex	TokenNameIdentifier	 Key Index
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
new	TokenNamenew	
KeyIndex	TokenNameIdentifier	 Key Index
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
_index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_rootToIndexMap	TokenNameIdentifier	 root To Index Map
=	TokenNameEQUAL	
_rootToIndexMap	TokenNameIdentifier	 root To Index Map
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDom	TokenNameIdentifier	 set Dom
(	TokenNameLPAREN	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dom	TokenNameIdentifier	 dom
instanceof	TokenNameinstanceof	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
)	TokenNameRPAREN	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dom	TokenNameIdentifier	 dom
instanceof	TokenNameinstanceof	
DOMAdapter	TokenNameIdentifier	 DOM Adapter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOM	TokenNameIdentifier	 DOM
idom	TokenNameIdentifier	 idom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMAdapter	TokenNameIdentifier	 DOM Adapter
)	TokenNameRPAREN	
dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
.	TokenNameDOT	
getDOMImpl	TokenNameIdentifier	 get DOM Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idom	TokenNameIdentifier	 idom
instanceof	TokenNameinstanceof	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
)	TokenNameRPAREN	
idom	TokenNameIdentifier	 idom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a {@link KeyIndexIterator} that iterates over the nodes that * result from a reference to the XSLT <code>key</code> function or * XPath <code>id</code> function. * * @param keyValue A string or iterator representing the key values or id * references * @param isKeyCall A <code>boolean</code> indicating whether the iterator * is being created for a reference <code>key</code> or * <code>id</code> */	TokenNameCOMMENT_JAVADOC	 Create a {@link KeyIndexIterator} that iterates over the nodes that result from a reference to the XSLT <code>key</code> function or XPath <code>id</code> function. * @param keyValue A string or iterator representing the key values or id references @param isKeyCall A <code>boolean</code> indicating whether the iterator is being created for a reference <code>key</code> or <code>id</code> 
public	TokenNamepublic	
KeyIndexIterator	TokenNameIdentifier	 Key Index Iterator
getKeyIndexIterator	TokenNameIdentifier	 get Key Index Iterator
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
keyValue	TokenNameIdentifier	 key Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isKeyCall	TokenNameIdentifier	 is Key Call
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyValue	TokenNameIdentifier	 key Value
instanceof	TokenNameinstanceof	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getKeyIndexIterator	TokenNameIdentifier	 get Key Index Iterator
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
)	TokenNameRPAREN	
keyValue	TokenNameIdentifier	 key Value
,	TokenNameCOMMA	
isKeyCall	TokenNameIdentifier	 is Key Call
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
getKeyIndexIterator	TokenNameIdentifier	 get Key Index Iterator
(	TokenNameLPAREN	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
stringF	TokenNameIdentifier	 string F
(	TokenNameLPAREN	
keyValue	TokenNameIdentifier	 key Value
,	TokenNameCOMMA	
_dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
,	TokenNameCOMMA	
isKeyCall	TokenNameIdentifier	 is Key Call
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a {@link KeyIndexIterator} that iterates over the nodes that * result from a reference to the XSLT <code>key</code> function or * XPath <code>id</code> function. * * @param keyValue A string representing the key values or id * references * @param isKeyCall A <code>boolean</code> indicating whether the iterator * is being created for a reference <code>key</code> or * <code>id</code> */	TokenNameCOMMENT_JAVADOC	 Create a {@link KeyIndexIterator} that iterates over the nodes that result from a reference to the XSLT <code>key</code> function or XPath <code>id</code> function. * @param keyValue A string representing the key values or id references @param isKeyCall A <code>boolean</code> indicating whether the iterator is being created for a reference <code>key</code> or <code>id</code> 
public	TokenNamepublic	
KeyIndexIterator	TokenNameIdentifier	 Key Index Iterator
getKeyIndexIterator	TokenNameIdentifier	 get Key Index Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyValue	TokenNameIdentifier	 key Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isKeyCall	TokenNameIdentifier	 is Key Call
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
KeyIndexIterator	TokenNameIdentifier	 Key Index Iterator
(	TokenNameLPAREN	
keyValue	TokenNameIdentifier	 key Value
,	TokenNameCOMMA	
isKeyCall	TokenNameIdentifier	 is Key Call
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a {@link KeyIndexIterator} that iterates over the nodes that * result from a reference to the XSLT <code>key</code> function or * XPath <code>id</code> function. * * @param keyValue An iterator representing the key values or id * references * @param isKeyCall A <code>boolean</code> indicating whether the iterator * is being created for a reference <code>key</code> or * <code>id</code> */	TokenNameCOMMENT_JAVADOC	 Create a {@link KeyIndexIterator} that iterates over the nodes that result from a reference to the XSLT <code>key</code> function or XPath <code>id</code> function. * @param keyValue An iterator representing the key values or id references @param isKeyCall A <code>boolean</code> indicating whether the iterator is being created for a reference <code>key</code> or <code>id</code> 
public	TokenNamepublic	
KeyIndexIterator	TokenNameIdentifier	 Key Index Iterator
getKeyIndexIterator	TokenNameIdentifier	 get Key Index Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
keyValue	TokenNameIdentifier	 key Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isKeyCall	TokenNameIdentifier	 is Key Call
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
KeyIndexIterator	TokenNameIdentifier	 Key Index Iterator
(	TokenNameLPAREN	
keyValue	TokenNameIdentifier	 key Value
,	TokenNameCOMMA	
isKeyCall	TokenNameIdentifier	 is Key Call
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used to represent an empty node set. */	TokenNameCOMMENT_JAVADOC	 Used to represent an empty node set. 
final	TokenNamefinal	
private	TokenNameprivate	
static	TokenNamestatic	
IntegerArray	TokenNameIdentifier	 Integer Array
EMPTY_NODES	TokenNameIdentifier	 EMPTY  NODES
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerArray	TokenNameIdentifier	 Integer Array
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An iterator representing the result of a reference to either the * XSLT <code>key</code> function or the XPath <code>id</code> function. */	TokenNameCOMMENT_JAVADOC	 An iterator representing the result of a reference to either the XSLT <code>key</code> function or the XPath <code>id</code> function. 
public	TokenNamepublic	
class	TokenNameclass	
KeyIndexIterator	TokenNameIdentifier	 Key Index Iterator
extends	TokenNameextends	
MultiValuedNodeHeapIterator	TokenNameIdentifier	 Multi Valued Node Heap Iterator
{	TokenNameLBRACE	
/** * <p>A reference to the <code>key</code> function that only has one * key value or to the <code>id</code> function that has only one string * argument can be optimized to ignore the multi-valued heap. This * field will be <code>null</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 <p>A reference to the <code>key</code> function that only has one key value or to the <code>id</code> function that has only one string argument can be optimized to ignore the multi-valued heap. This field will be <code>null</code> otherwise. 
private	TokenNameprivate	
IntegerArray	TokenNameIdentifier	 Integer Array
_nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
/** * <p>This field contains the iterator representing a node set key value * argument to the <code>key</code> function or a node set argument * to the <code>id</code> function.</p> * * <p>Exactly one of this field and {@link #_keyValue} must be * <code>null</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>This field contains the iterator representing a node set key value argument to the <code>key</code> function or a node set argument to the <code>id</code> function.</p> * <p>Exactly one of this field and {@link #_keyValue} must be <code>null</code>.</p> 
private	TokenNameprivate	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
_keyValueIterator	TokenNameIdentifier	 key Value Iterator
;	TokenNameSEMICOLON	
/** * <p>This field contains the iterator representing a non-node-set key * value argument to the <code>key</code> function or a non-node-set * argument to the <code>id</code> function.</p> * * <p>Exactly one of this field and {@link #_keyValueIterator} must be * <code>null</code>.</p> */	TokenNameCOMMENT_JAVADOC	 <p>This field contains the iterator representing a non-node-set key value argument to the <code>key</code> function or a non-node-set argument to the <code>id</code> function.</p> * <p>Exactly one of this field and {@link #_keyValueIterator} must be <code>null</code>.</p> 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_keyValue	TokenNameIdentifier	 key Value
;	TokenNameSEMICOLON	
/** * Indicates whether this object represents the result of a reference * to the <code>key</code> function (<code>true</code>) or the * <code>id</code> function (<code>false</code>). */	TokenNameCOMMENT_JAVADOC	 Indicates whether this object represents the result of a reference to the <code>key</code> function (<code>true</code>) or the <code>id</code> function (<code>false</code>). 
private	TokenNameprivate	
boolean	TokenNameboolean	
_isKeyIterator	TokenNameIdentifier	 is Key Iterator
;	TokenNameSEMICOLON	
/** * Represents the DTM nodes retrieved for one key value or one string * argument to <code>id</code> for use as one heap node in a * {@link MultiValuedNodeHeapIterator}. */	TokenNameCOMMENT_JAVADOC	 Represents the DTM nodes retrieved for one key value or one string argument to <code>id</code> for use as one heap node in a {@link MultiValuedNodeHeapIterator}. 
protected	TokenNameprotected	
class	TokenNameclass	
KeyIndexHeapNode	TokenNameIdentifier	 Key Index Heap Node
extends	TokenNameextends	
MultiValuedNodeHeapIterator	TokenNameIdentifier	 Multi Valued Node Heap Iterator
.	TokenNameDOT	
HeapNode	TokenNameIdentifier	 Heap Node
{	TokenNameLBRACE	
/** * {@link IntegerArray} of DTM nodes retrieved for one key value. * Must contain no duplicates and be stored in document order. */	TokenNameCOMMENT_JAVADOC	 {@link IntegerArray} of DTM nodes retrieved for one key value. Must contain no duplicates and be stored in document order. 
private	TokenNameprivate	
IntegerArray	TokenNameIdentifier	 Integer Array
_nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
/** * Position in {@link #_nodes} array of next node to return from * this heap node. */	TokenNameCOMMENT_JAVADOC	 Position in {@link #_nodes} array of next node to return from this heap node. 
private	TokenNameprivate	
int	TokenNameint	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Marked position. Used by {@link #setMark()} and * {@link #gotoMark()} */	TokenNameCOMMENT_JAVADOC	 Marked position. Used by {@link #setMark()} and {@link #gotoMark()} 
private	TokenNameprivate	
int	TokenNameint	
_markPosition	TokenNameIdentifier	 mark Position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Create a heap node representing DTM nodes retrieved for one * key value in a reference to the <code>key</code> function * or string argument to the <code>id</code> function. */	TokenNameCOMMENT_JAVADOC	 Create a heap node representing DTM nodes retrieved for one key value in a reference to the <code>key</code> function or string argument to the <code>id</code> function. 
KeyIndexHeapNode	TokenNameIdentifier	 Key Index Heap Node
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Advance to the next node represented by this {@link HeapNode} * * @return the next DTM node. */	TokenNameCOMMENT_JAVADOC	 Advance to the next node represented by this {@link HeapNode} * @return the next DTM node. 
public	TokenNamepublic	
int	TokenNameint	
step	TokenNameIdentifier	 step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_position	TokenNameIdentifier	 position
<	TokenNameLESS	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
_position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a deep copy of this {@link HeapNode}. The clone is not * reset from the current position of the original. * * @return the cloned heap node */	TokenNameCOMMENT_JAVADOC	 Creates a deep copy of this {@link HeapNode}. The clone is not reset from the current position of the original. * @return the cloned heap node 
public	TokenNamepublic	
HeapNode	TokenNameIdentifier	 Heap Node
cloneHeapNode	TokenNameIdentifier	 clone Heap Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
KeyIndexHeapNode	TokenNameIdentifier	 Key Index Heap Node
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
KeyIndexHeapNode	TokenNameIdentifier	 Key Index Heap Node
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneHeapNode	TokenNameIdentifier	 clone Heap Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_markPosition	TokenNameIdentifier	 mark Position
=	TokenNameEQUAL	
_markPosition	TokenNameIdentifier	 mark Position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remembers the current node for the next call to * {@link #gotoMark()}. */	TokenNameCOMMENT_JAVADOC	 Remembers the current node for the next call to {@link #gotoMark()}. 
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_markPosition	TokenNameIdentifier	 mark Position
=	TokenNameEQUAL	
_position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Restores the current node remembered by {@link #setMark()}. */	TokenNameCOMMENT_JAVADOC	 Restores the current node remembered by {@link #setMark()}. 
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
_markPosition	TokenNameIdentifier	 mark Position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs a comparison of the two heap nodes * * @param heapNode the heap node against which to compare * @return <code>true</code> if and only if the current node for * this heap node is before the current node of the * argument heap node in document order. */	TokenNameCOMMENT_JAVADOC	 Performs a comparison of the two heap nodes * @param heapNode the heap node against which to compare @return <code>true</code> if and only if the current node for this heap node is before the current node of the argument heap node in document order. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLessThan	TokenNameIdentifier	 is Less Than
(	TokenNameLPAREN	
HeapNode	TokenNameIdentifier	 Heap Node
heapNode	TokenNameIdentifier	 heap Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_node	TokenNameIdentifier	 node
<	TokenNameLESS	
heapNode	TokenNameIdentifier	 heap Node
.	TokenNameDOT	
_node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Sets context with respect to which this heap node is * evaluated.</p> * <p>This has no real effect on this kind of heap node. Instead, * the {@link KeyIndexIterator#setStartNode(int)} method should * create new instances of this class to represent the effect of * changing the context.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Sets context with respect to which this heap node is evaluated.</p> <p>This has no real effect on this kind of heap node. Instead, the {@link KeyIndexIterator#setStartNode(int)} method should create new instances of this class to represent the effect of changing the context.</p> 
public	TokenNamepublic	
HeapNode	TokenNameIdentifier	 Heap Node
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the heap node back to its beginning. */	TokenNameCOMMENT_JAVADOC	 Reset the heap node back to its beginning. 
public	TokenNamepublic	
HeapNode	TokenNameIdentifier	 Heap Node
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Constructor used when the argument to <code>key</code> or * <code>id</code> is not a node set. * * @param keyValue the argument to <code>key</code> or <code>id</code> * cast to a <code>String</code> * @param isKeyIterator indicates whether the constructed iterator * represents a reference to <code>key</code> or * <code>id</code>. */	TokenNameCOMMENT_JAVADOC	 Constructor used when the argument to <code>key</code> or <code>id</code> is not a node set. * @param keyValue the argument to <code>key</code> or <code>id</code> cast to a <code>String</code> @param isKeyIterator indicates whether the constructed iterator represents a reference to <code>key</code> or <code>id</code>. 
KeyIndexIterator	TokenNameIdentifier	 Key Index Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyValue	TokenNameIdentifier	 key Value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isKeyIterator	TokenNameIdentifier	 is Key Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_isKeyIterator	TokenNameIdentifier	 is Key Iterator
=	TokenNameEQUAL	
isKeyIterator	TokenNameIdentifier	 is Key Iterator
;	TokenNameSEMICOLON	
_keyValue	TokenNameIdentifier	 key Value
=	TokenNameEQUAL	
keyValue	TokenNameIdentifier	 key Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor used when the argument to <code>key</code> or * <code>id</code> is a node set. * * @param keyValues the argument to <code>key</code> or <code>id</code> * @param isKeyIterator indicates whether the constructed iterator * represents a reference to <code>key</code> or * <code>id</code>. */	TokenNameCOMMENT_JAVADOC	 Constructor used when the argument to <code>key</code> or <code>id</code> is a node set. * @param keyValues the argument to <code>key</code> or <code>id</code> @param isKeyIterator indicates whether the constructed iterator represents a reference to <code>key</code> or <code>id</code>. 
KeyIndexIterator	TokenNameIdentifier	 Key Index Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
keyValues	TokenNameIdentifier	 key Values
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isKeyIterator	TokenNameIdentifier	 is Key Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_keyValueIterator	TokenNameIdentifier	 key Value Iterator
=	TokenNameEQUAL	
keyValues	TokenNameIdentifier	 key Values
;	TokenNameSEMICOLON	
_isKeyIterator	TokenNameIdentifier	 is Key Iterator
=	TokenNameEQUAL	
isKeyIterator	TokenNameIdentifier	 is Key Iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve nodes for a particular key value or a particular id * argument value. * * @param root The root node of the document containing the context node * @param keyValue The key value of id string argument value * @return an {@link IntegerArray} of the resulting nodes */	TokenNameCOMMENT_JAVADOC	 Retrieve nodes for a particular key value or a particular id argument value. * @param root The root node of the document containing the context node @param keyValue The key value of id string argument value @return an {@link IntegerArray} of the resulting nodes 
protected	TokenNameprotected	
IntegerArray	TokenNameIdentifier	 Integer Array
lookupNodes	TokenNameIdentifier	 lookup Nodes
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
keyValue	TokenNameIdentifier	 key Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IntegerArray	TokenNameIdentifier	 Integer Array
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Get mapping from key values/IDs to DTM nodes for this document 	TokenNameCOMMENT_LINE	Get mapping from key values/IDs to DTM nodes for this document 
Hashtable	TokenNameIdentifier	 Hashtable
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
_rootToIndexMap	TokenNameIdentifier	 root To Index Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_isKeyIterator	TokenNameIdentifier	 is Key Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For id function, tokenize argument as whitespace separated 	TokenNameCOMMENT_LINE	For id function, tokenize argument as whitespace separated 
// list of values and look up nodes identified by each ID. 	TokenNameCOMMENT_LINE	list of values and look up nodes identified by each ID. 
final	TokenNamefinal	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
keyValue	TokenNameIdentifier	 key Value
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntegerArray	TokenNameIdentifier	 Integer Array
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Does the ID map to any node in the document? 	TokenNameCOMMENT_LINE	Does the ID map to any node in the document? 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If input was from W3C DOM, use DOM's getElementById to do 	TokenNameCOMMENT_LINE	If input was from W3C DOM, use DOM's getElementById to do 
// the look-up. 	TokenNameCOMMENT_LINE	the look-up. 
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
hasDOMSource	TokenNameIdentifier	 has DOM Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
getDOMNodeById	TokenNameIdentifier	 get DOM Node By Id
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we found any nodes, merge them into the cumulative 	TokenNameCOMMENT_LINE	If we found any nodes, merge them into the cumulative 
// result 	TokenNameCOMMENT_LINE	result 
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For key function, map key value to nodes 	TokenNameCOMMENT_LINE	For key function, map key value to nodes 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntegerArray	TokenNameIdentifier	 Integer Array
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
keyValue	TokenNameIdentifier	 key Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set context node for the iterator. This will cause the iterator * to reset itself, reevaluate arguments to the function, look up * nodes in the input and reinitialize its internal heap. * * @param node the context node * @return A {@link DTMAxisIterator} set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set context node for the iterator. This will cause the iterator to reset itself, reevaluate arguments to the function, look up nodes in the input and reinitialize its internal heap. * @param node the context node @return A {@link DTMAxisIterator} set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
// If the arugment to the function is a node set, set the 	TokenNameCOMMENT_LINE	If the arugment to the function is a node set, set the 
// context node on it. 	TokenNameCOMMENT_LINE	context node on it. 
if	TokenNameif	
(	TokenNameLPAREN	
_keyValueIterator	TokenNameIdentifier	 key Value Iterator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_keyValueIterator	TokenNameIdentifier	 key Value Iterator
=	TokenNameEQUAL	
_keyValueIterator	TokenNameIdentifier	 key Value Iterator
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
;	TokenNameSEMICOLON	
// If at most one key value or at most one string argument to id 	TokenNameCOMMENT_LINE	If at most one key value or at most one string argument to id 
// resulted in nodes being returned, use the IntegerArray 	TokenNameCOMMENT_LINE	resulted in nodes being returned, use the IntegerArray 
// stored at _nodes directly. This relies on the fact that the 	TokenNameCOMMENT_LINE	stored at _nodes directly. This relies on the fact that the 
// IntegerArray never includes duplicate nodes and is always stored 	TokenNameCOMMENT_LINE	IntegerArray never includes duplicate nodes and is always stored 
// in document order. 	TokenNameCOMMENT_LINE	in document order. 
if	TokenNameif	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_position	TokenNameIdentifier	 position
<	TokenNameLESS	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeHandle	TokenNameIdentifier	 node Handle
=	TokenNameEQUAL	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
_position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeHandle	TokenNameIdentifier	 node Handle
=	TokenNameEQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeHandle	TokenNameIdentifier	 node Handle
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodeHandle	TokenNameIdentifier	 node Handle
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the iterator to the last start node. * * @return A DTMAxisIterator, which may or may not be the same as this * iterator. */	TokenNameCOMMENT_JAVADOC	 Resets the iterator to the last start node. * @return A DTMAxisIterator, which may or may not be the same as this iterator. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate the reference to the <code>key</code> or <code>id</code> * function with the context specified by {@link #setStartNode(int)} * and set up this iterator to iterate over the DTM nodes that are * to be returned. */	TokenNameCOMMENT_JAVADOC	 Evaluate the reference to the <code>key</code> or <code>id</code> function with the context specified by {@link #setStartNode(int)} and set up this iterator to iterate over the DTM nodes that are to be returned. 
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// All nodes retrieved are in the same document 	TokenNameCOMMENT_LINE	All nodes retrieved are in the same document 
int	TokenNameint	
rootHandle	TokenNameIdentifier	 root Handle
=	TokenNameEQUAL	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
)	TokenNameRPAREN	
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Is the argument not a node set? 	TokenNameCOMMENT_LINE	Is the argument not a node set? 
if	TokenNameif	
(	TokenNameLPAREN	
_keyValueIterator	TokenNameIdentifier	 key Value Iterator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Look up nodes returned for the single string argument 	TokenNameCOMMENT_LINE	Look up nodes returned for the single string argument 
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
lookupNodes	TokenNameIdentifier	 lookup Nodes
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
,	TokenNameCOMMA	
_keyValue	TokenNameIdentifier	 key Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
EMPTY_NODES	TokenNameIdentifier	 EMPTY  NODES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
keyValues	TokenNameIdentifier	 key Values
=	TokenNameEQUAL	
_keyValueIterator	TokenNameIdentifier	 key Value Iterator
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
retrievedKeyValueIdx	TokenNameIdentifier	 retrieved Key Value Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundNodes	TokenNameIdentifier	 found Nodes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// For each node in the node set argument, get the string value 	TokenNameCOMMENT_LINE	For each node in the node set argument, get the string value 
// and look up the nodes returned by key or id for that string 	TokenNameCOMMENT_LINE	and look up the nodes returned by key or id for that string 
// value. If at most one string value has nodes associated, 	TokenNameCOMMENT_LINE	value. If at most one string value has nodes associated, 
// the nodes will be stored in _nodes; otherwise, the nodes 	TokenNameCOMMENT_LINE	the nodes will be stored in _nodes; otherwise, the nodes 
// will be placed in a heap. 	TokenNameCOMMENT_LINE	will be placed in a heap. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
keyValueNode	TokenNameIdentifier	 key Value Node
=	TokenNameEQUAL	
keyValues	TokenNameIdentifier	 key Values
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keyValueNode	TokenNameIdentifier	 key Value Node
!=	TokenNameNOT_EQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
keyValueNode	TokenNameIdentifier	 key Value Node
=	TokenNameEQUAL	
keyValues	TokenNameIdentifier	 key Values
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
keyValue	TokenNameIdentifier	 key Value
=	TokenNameEQUAL	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
stringF	TokenNameIdentifier	 string F
(	TokenNameLPAREN	
keyValueNode	TokenNameIdentifier	 key Value Node
,	TokenNameCOMMA	
_dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntegerArray	TokenNameIdentifier	 Integer Array
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
lookupNodes	TokenNameIdentifier	 lookup Nodes
(	TokenNameLPAREN	
rootHandle	TokenNameIdentifier	 root Handle
,	TokenNameCOMMA	
keyValue	TokenNameIdentifier	 key Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundNodes	TokenNameIdentifier	 found Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
foundNodes	TokenNameIdentifier	 found Nodes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addHeapNode	TokenNameIdentifier	 add Heap Node
(	TokenNameLPAREN	
new	TokenNamenew	
KeyIndexHeapNode	TokenNameIdentifier	 Key Index Heap Node
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addHeapNode	TokenNameIdentifier	 add Heap Node
(	TokenNameLPAREN	
new	TokenNamenew	
KeyIndexHeapNode	TokenNameIdentifier	 Key Index Heap Node
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundNodes	TokenNameIdentifier	 found Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
EMPTY_NODES	TokenNameIdentifier	 EMPTY  NODES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the number of nodes in this iterator. * * @return the number of nodes */	TokenNameCOMMENT_JAVADOC	 Returns the number of nodes in this iterator. * @return the number of nodes 
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If nodes are stored in _nodes, take advantage of the fact that 	TokenNameCOMMENT_LINE	If nodes are stored in _nodes, take advantage of the fact that 
// there are no duplicates. Otherwise, fall back to the base heap 	TokenNameCOMMENT_LINE	there are no duplicates. Otherwise, fall back to the base heap 
// implementaiton and hope it does a good job with this. 	TokenNameCOMMENT_LINE	implementaiton and hope it does a good job with this. 
return	TokenNamereturn	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node at the given position. * * @param position The position * @return The node at the given position. */	TokenNameCOMMENT_JAVADOC	 Return the node at the given position. * @param position The position @return The node at the given position. 
public	TokenNamepublic	
int	TokenNameint	
getNodeByPosition	TokenNameIdentifier	 get Node By Position
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
// If nodes are stored in _nodes, take advantage of the fact that 	TokenNameCOMMENT_LINE	If nodes are stored in _nodes, take advantage of the fact that 
// there are no duplicates and they are stored in document order. 	TokenNameCOMMENT_LINE	there are no duplicates and they are stored in document order. 
// Otherwise, fall back to the base heap implementation to do a 	TokenNameCOMMENT_LINE	Otherwise, fall back to the base heap implementation to do a 
// good job with this. 	TokenNameCOMMENT_LINE	good job with this. 
if	TokenNameif	
(	TokenNameLPAREN	
_nodes	TokenNameIdentifier	 nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
<=	TokenNameLESS_EQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
_nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getNodeByPosition	TokenNameIdentifier	 get Node By Position
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
