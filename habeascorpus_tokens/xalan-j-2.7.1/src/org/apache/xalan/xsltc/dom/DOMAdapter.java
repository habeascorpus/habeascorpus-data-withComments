/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOMAdapter.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOMAdapter.java 468651 2006-10-28 07:04:25Z minchau $ 
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
StripFilter	TokenNameIdentifier	 Strip Filter
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
TransletException	TokenNameIdentifier	 Translet Exception
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
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
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
/** * @author Jacek Ambroziak * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Morten Jorgensen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DOMAdapter	TokenNameIdentifier	 DOM Adapter
implements	TokenNameimplements	
DOM	TokenNameIdentifier	 DOM
{	TokenNameLBRACE	
// Mutually exclusive casting of DOM interface to known implementations 	TokenNameCOMMENT_LINE	Mutually exclusive casting of DOM interface to known implementations 
private	TokenNameprivate	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DOM	TokenNameIdentifier	 DOM
_dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_namesArray	TokenNameIdentifier	 names Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_urisArray	TokenNameIdentifier	 uris Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_typesArray	TokenNameIdentifier	 types Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_namespaceArray	TokenNameIdentifier	 namespace Array
;	TokenNameSEMICOLON	
// Cached mappings 	TokenNameCOMMENT_LINE	Cached mappings 
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_mapping	TokenNameIdentifier	 mapping
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_NSmapping	TokenNameIdentifier	 N Smapping
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_NSreverse	TokenNameIdentifier	 N Sreverse
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StripFilter	TokenNameIdentifier	 Strip Filter
_filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_multiDOMMask	TokenNameIdentifier	 multi DOM Mask
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DOMAdapter	TokenNameIdentifier	 DOM Adapter
(	TokenNameLPAREN	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
namesArray	TokenNameIdentifier	 names Array
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
namespaceArray	TokenNameIdentifier	 namespace Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
_namesArray	TokenNameIdentifier	 names Array
=	TokenNameEQUAL	
namesArray	TokenNameIdentifier	 names Array
;	TokenNameSEMICOLON	
_urisArray	TokenNameIdentifier	 uris Array
=	TokenNameEQUAL	
urisArray	TokenNameIdentifier	 uris Array
;	TokenNameSEMICOLON	
_typesArray	TokenNameIdentifier	 types Array
=	TokenNameEQUAL	
typesArray	TokenNameIdentifier	 types Array
;	TokenNameSEMICOLON	
_namespaceArray	TokenNameIdentifier	 namespace Array
=	TokenNameEQUAL	
namespaceArray	TokenNameIdentifier	 namespace Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
_namesArray	TokenNameIdentifier	 names Array
=	TokenNameEQUAL	
names	TokenNameIdentifier	 names
;	TokenNameSEMICOLON	
_urisArray	TokenNameIdentifier	 uris Array
=	TokenNameEQUAL	
urisArray	TokenNameIdentifier	 uris Array
;	TokenNameSEMICOLON	
_typesArray	TokenNameIdentifier	 types Array
=	TokenNameEQUAL	
typesArray	TokenNameIdentifier	 types Array
;	TokenNameSEMICOLON	
_namespaceArray	TokenNameIdentifier	 namespace Array
=	TokenNameEQUAL	
namespaces	TokenNameIdentifier	 namespaces
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNamesArray	TokenNameIdentifier	 get Names Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_namesArray	TokenNameIdentifier	 names Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getUrisArray	TokenNameIdentifier	 get Uris Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_urisArray	TokenNameIdentifier	 uris Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTypesArray	TokenNameIdentifier	 get Types Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_typesArray	TokenNameIdentifier	 types Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNamespaceArray	TokenNameIdentifier	 get Namespace Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_namespaceArray	TokenNameIdentifier	 namespace Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DOM	TokenNameIdentifier	 DOM
getDOMImpl	TokenNameIdentifier	 get DOM Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_mapping	TokenNameIdentifier	 mapping
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_mapping	TokenNameIdentifier	 mapping
=	TokenNameEQUAL	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
_namesArray	TokenNameIdentifier	 names Array
,	TokenNameCOMMA	
_urisArray	TokenNameIdentifier	 uris Array
,	TokenNameCOMMA	
_typesArray	TokenNameIdentifier	 types Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
_mapping	TokenNameIdentifier	 mapping
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_reverse	TokenNameIdentifier	 reverse
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getReverseMapping	TokenNameIdentifier	 get Reverse Mapping
(	TokenNameLPAREN	
_namesArray	TokenNameIdentifier	 names Array
,	TokenNameCOMMA	
_urisArray	TokenNameIdentifier	 uris Array
,	TokenNameCOMMA	
_typesArray	TokenNameIdentifier	 types Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
_reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNSMapping	TokenNameIdentifier	 get NS Mapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_NSmapping	TokenNameIdentifier	 N Smapping
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_NSmapping	TokenNameIdentifier	 N Smapping
=	TokenNameEQUAL	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getNamespaceMapping	TokenNameIdentifier	 get Namespace Mapping
(	TokenNameLPAREN	
_namespaceArray	TokenNameIdentifier	 namespace Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
_NSmapping	TokenNameIdentifier	 N Smapping
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getNSReverse	TokenNameIdentifier	 get NS Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_NSreverse	TokenNameIdentifier	 N Sreverse
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_NSreverse	TokenNameIdentifier	 N Sreverse
=	TokenNameEQUAL	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getReverseNamespaceMapping	TokenNameIdentifier	 get Reverse Namespace Mapping
(	TokenNameLPAREN	
_namespaceArray	TokenNameIdentifier	 namespace Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
_NSreverse	TokenNameIdentifier	 N Sreverse
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns singleton iterator containg the document root */	TokenNameCOMMENT_JAVADOC	 Returns singleton iterator containg the document root 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFilter	TokenNameIdentifier	 set Filter
(	TokenNameLPAREN	
StripFilter	TokenNameIdentifier	 Strip Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getTypedChildren	TokenNameIdentifier	 get Typed Children
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getTypedChildren	TokenNameIdentifier	 get Typed Children
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getTypedChildren	TokenNameIdentifier	 get Typed Children
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNamespaceAxisIterator	TokenNameIdentifier	 get Namespace Axis Iterator
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
getNSReverse	TokenNameIdentifier	 get NS Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
ns	TokenNameIdentifier	 ns
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reverse	TokenNameIdentifier	 reverse
=	TokenNameEQUAL	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getTypedAxisIterator	TokenNameIdentifier	 get Typed Axis Iterator
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getTypedAxisIterator	TokenNameIdentifier	 get Typed Axis Iterator
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMultiDOMMask	TokenNameIdentifier	 get Multi DOM Mask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_multiDOMMask	TokenNameIdentifier	 multi DOM Mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMultiDOMMask	TokenNameIdentifier	 set Multi DOM Mask
(	TokenNameLPAREN	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_multiDOMMask	TokenNameIdentifier	 multi DOM Mask
=	TokenNameEQUAL	
mask	TokenNameIdentifier	 mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getNthDescendant	TokenNameIdentifier	 get Nth Descendant
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
boolean	TokenNameboolean	
includeself	TokenNameIdentifier	 includeself
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNthDescendant	TokenNameIdentifier	 get Nth Descendant
(	TokenNameLPAREN	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
includeself	TokenNameIdentifier	 includeself
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getNodeValueIterator	TokenNameIdentifier	 get Node Value Iterator
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNodeValueIterator	TokenNameIdentifier	 get Node Value Iterator
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
orderNodes	TokenNameIdentifier	 order Nodes
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapping	TokenNameIdentifier	 mapping
=	TokenNameEQUAL	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
mapping	TokenNameIdentifier	 mapping
[	TokenNameLBRACKET	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getExpandedTypeID2	TokenNameIdentifier	 get Expanded Type I D2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
mapping	TokenNameIdentifier	 mapping
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
mapping	TokenNameIdentifier	 mapping
[	TokenNameLBRACKET	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNamespaceType	TokenNameIdentifier	 get Namespace Type
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNSMapping	TokenNameIdentifier	 get NS Mapping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNSType	TokenNameIdentifier	 get NS Type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNSType	TokenNameIdentifier	 get NS Type
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNSType	TokenNameIdentifier	 get NS Type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getAttributeNode	TokenNameIdentifier	 get Attribute Node
(	TokenNameLPAREN	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
type	TokenNameIdentifier	 type
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceName	TokenNameIdentifier	 get Namespace Name
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNamespaceName	TokenNameIdentifier	 get Namespace Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringValueX	TokenNameIdentifier	 get String Value X
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getStringValueX	TokenNameIdentifier	 get String Value X
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getStringValueX	TokenNameIdentifier	 get String Value X
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
shallowCopy	TokenNameIdentifier	 shallow Copy
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
shallowCopy	TokenNameIdentifier	 shallow Copy
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
node1	TokenNameIdentifier	 node1
,	TokenNameCOMMA	
node2	TokenNameIdentifier	 node2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
textNode	TokenNameIdentifier	 text Node
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
textNode	TokenNameIdentifier	 text Node
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
makeNode	TokenNameIdentifier	 make Node
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
makeNode	TokenNameIdentifier	 make Node
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
makeNode	TokenNameIdentifier	 make Node
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
makeNode	TokenNameIdentifier	 make Node
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
makeNodeList	TokenNameIdentifier	 make Node List
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
makeNodeList	TokenNameIdentifier	 make Node List
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NodeList	TokenNameIdentifier	 Node List
makeNodeList	TokenNameIdentifier	 make Node List
(	TokenNameLPAREN	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
makeNodeList	TokenNameIdentifier	 make Node List
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getLanguage	TokenNameIdentifier	 get Language
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentURI	TokenNameIdentifier	 set Document URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
setDocumentURI	TokenNameIdentifier	 set Document URI
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentURI	TokenNameIdentifier	 get Document URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getDocumentURI	TokenNameIdentifier	 get Document URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentURI	TokenNameIdentifier	 get Document URI
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getDocumentURI	TokenNameIdentifier	 get Document URI
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
isElement	TokenNameIdentifier	 is Element
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isAttribute	TokenNameIdentifier	 is Attribute
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
isAttribute	TokenNameIdentifier	 is Attribute
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNodeIdent	TokenNameIdentifier	 get Node Ident
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNodeIdent	TokenNameIdentifier	 get Node Ident
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNodeHandle	TokenNameIdentifier	 get Node Handle
(	TokenNameLPAREN	
int	TokenNameint	
nodeId	TokenNameIdentifier	 node Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getNodeHandle	TokenNameIdentifier	 get Node Handle
(	TokenNameLPAREN	
nodeId	TokenNameIdentifier	 node Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a instance of a DOM class to be used as an RTF */	TokenNameCOMMENT_JAVADOC	 Return a instance of a DOM class to be used as an RTF 
public	TokenNamepublic	
DOM	TokenNameIdentifier	 DOM
getResultTreeFrag	TokenNameIdentifier	 get Result Tree Frag
(	TokenNameLPAREN	
int	TokenNameint	
initSize	TokenNameIdentifier	 init Size
,	TokenNameCOMMA	
int	TokenNameint	
rtfType	TokenNameIdentifier	 rtf Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getResultTreeFrag	TokenNameIdentifier	 get Result Tree Frag
(	TokenNameLPAREN	
initSize	TokenNameIdentifier	 init Size
,	TokenNameCOMMA	
rtfType	TokenNameIdentifier	 rtf Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getResultTreeFrag	TokenNameIdentifier	 get Result Tree Frag
(	TokenNameLPAREN	
initSize	TokenNameIdentifier	 init Size
,	TokenNameCOMMA	
rtfType	TokenNameIdentifier	 rtf Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return a instance of a DOM class to be used as an RTF */	TokenNameCOMMENT_JAVADOC	 Return a instance of a DOM class to be used as an RTF 
public	TokenNamepublic	
DOM	TokenNameIdentifier	 DOM
getResultTreeFrag	TokenNameIdentifier	 get Result Tree Frag
(	TokenNameLPAREN	
int	TokenNameint	
initSize	TokenNameIdentifier	 init Size
,	TokenNameCOMMA	
int	TokenNameint	
rtfType	TokenNameIdentifier	 rtf Type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
addToManager	TokenNameIdentifier	 add To Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_enhancedDOM	TokenNameIdentifier	 enhanced DOM
.	TokenNameDOT	
getResultTreeFrag	TokenNameIdentifier	 get Result Tree Frag
(	TokenNameLPAREN	
initSize	TokenNameIdentifier	 init Size
,	TokenNameCOMMA	
rtfType	TokenNameIdentifier	 rtf Type
,	TokenNameCOMMA	
addToManager	TokenNameIdentifier	 add To Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getResultTreeFrag	TokenNameIdentifier	 get Result Tree Frag
(	TokenNameLPAREN	
initSize	TokenNameIdentifier	 init Size
,	TokenNameCOMMA	
rtfType	TokenNameIdentifier	 rtf Type
,	TokenNameCOMMA	
addToManager	TokenNameIdentifier	 add To Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a SerializationHandler class wrapped in a SAX adapter. */	TokenNameCOMMENT_JAVADOC	 Returns a SerializationHandler class wrapped in a SAX adapter. 
public	TokenNamepublic	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
getOutputDomBuilder	TokenNameIdentifier	 get Output Dom Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getOutputDomBuilder	TokenNameIdentifier	 get Output Dom Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUnparsedEntityURI	TokenNameIdentifier	 get Unparsed Entity URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getUnparsedEntityURI	TokenNameIdentifier	 get Unparsed Entity URI
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
getElementsWithIDs	TokenNameIdentifier	 get Elements With I Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getElementsWithIDs	TokenNameIdentifier	 get Elements With I Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
