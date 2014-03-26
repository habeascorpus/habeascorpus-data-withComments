/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMDefaultBaseTraversers.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMDefaultBaseTraversers.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
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
XMLStringFactory	TokenNameIdentifier	 XML String Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeCounter	TokenNameIdentifier	 Node Counter
;	TokenNameSEMICOLON	
/** * This class implements the traversers for DTMDefaultBase. * * PLEASE NOTE that the public interface for all traversers should be * in terms of DTM Node Handles... but they may use the internal node * identity indices within their logic, for efficiency's sake. Be very * careful to avoid confusing these when maintaining this code. * */	TokenNameCOMMENT_JAVADOC	 This class implements the traversers for DTMDefaultBase. * PLEASE NOTE that the public interface for all traversers should be in terms of DTM Node Handles... but they may use the internal node identity indices within their logic, for efficiency's sake. Be very careful to avoid confusing these when maintaining this code. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DTMDefaultBaseTraversers	TokenNameIdentifier	 DTM Default Base Traversers
extends	TokenNameextends	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
{	TokenNameLBRACE	
/** * Construct a DTMDefaultBaseTraversers object from a DOM node. * * @param mgr The DTMManager who owns this DTM. * @param source The object that is used to specify the construction source. * @param dtmIdentity The DTM identity ID for this DTM. * @param whiteSpaceFilter The white space filter for this DTM, which may * be null. * @param xstringfactory The factory to use for creating XMLStrings. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. */	TokenNameCOMMENT_JAVADOC	 Construct a DTMDefaultBaseTraversers object from a DOM node. * @param mgr The DTMManager who owns this DTM. @param source The object that is used to specify the construction source. @param dtmIdentity The DTM identity ID for this DTM. @param whiteSpaceFilter The white space filter for this DTM, which may be null. @param xstringfactory The factory to use for creating XMLStrings. @param doIndexing true if the caller considers it worth it to use indexing schemes. 
public	TokenNamepublic	
DTMDefaultBaseTraversers	TokenNameIdentifier	 DTM Default Base Traversers
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a DTMDefaultBaseTraversers object from a DOM node. * * @param mgr The DTMManager who owns this DTM. * @param source The object that is used to specify the construction source. * @param dtmIdentity The DTM identity ID for this DTM. * @param whiteSpaceFilter The white space filter for this DTM, which may * be null. * @param xstringfactory The factory to use for creating XMLStrings. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * @param blocksize The block size of the DTM. * @param usePrevsib true if we want to build the previous sibling node array. * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM. */	TokenNameCOMMENT_JAVADOC	 Construct a DTMDefaultBaseTraversers object from a DOM node. * @param mgr The DTMManager who owns this DTM. @param source The object that is used to specify the construction source. @param dtmIdentity The DTM identity ID for this DTM. @param whiteSpaceFilter The white space filter for this DTM, which may be null. @param xstringfactory The factory to use for creating XMLStrings. @param doIndexing true if the caller considers it worth it to use indexing schemes. @param blocksize The block size of the DTM. @param usePrevsib true if we want to build the previous sibling node array. @param newNameTable true if we want to use a new ExpandedNameTable for this DTM. 
public	TokenNamepublic	
DTMDefaultBaseTraversers	TokenNameIdentifier	 DTM Default Base Traversers
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
boolean	TokenNameboolean	
usePrevsib	TokenNameIdentifier	 use Prevsib
,	TokenNameCOMMA	
boolean	TokenNameboolean	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
usePrevsib	TokenNameIdentifier	 use Prevsib
,	TokenNameCOMMA	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This returns a stateless "traverser", that can navigate * over an XPath axis, though perhaps not in document order. * * @param axis One of Axes.ANCESTORORSELF, etc. * * @return A DTMAxisTraverser, or null if the given axis isn't supported. */	TokenNameCOMMENT_JAVADOC	 This returns a stateless "traverser", that can navigate over an XPath axis, though perhaps not in document order. * @param axis One of Axes.ANCESTORORSELF, etc. * @return A DTMAxisTraverser, or null if the given axis isn't supported. 
public	TokenNamepublic	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
traverser	TokenNameIdentifier	 traverser
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_traversers	TokenNameIdentifier	 m traversers
)	TokenNameRPAREN	
// Cache of stateless traversers for this DTM 	TokenNameCOMMENT_LINE	Cache of stateless traversers for this DTM 
{	TokenNameLBRACE	
m_traversers	TokenNameIdentifier	 m traversers
=	TokenNameEQUAL	
new	TokenNamenew	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
[	TokenNameLBRACKET	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
getNamesLength	TokenNameIdentifier	 get Names Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
m_traversers	TokenNameIdentifier	 m traversers
[	TokenNameLBRACKET	
axis	TokenNameIdentifier	 axis
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Share/reuse existing traverser 	TokenNameCOMMENT_LINE	Share/reuse existing traverser 
if	TokenNameif	
(	TokenNameLPAREN	
traverser	TokenNameIdentifier	 traverser
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
traverser	TokenNameIdentifier	 traverser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
// Generate new traverser 	TokenNameCOMMENT_LINE	Generate new traverser 
{	TokenNameLBRACE	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ANCESTOR	TokenNameIdentifier	 ANCESTOR
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
AncestorTraverser	TokenNameIdentifier	 Ancestor Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ANCESTORORSELF	TokenNameIdentifier	 ANCESTORORSELF
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
AncestorOrSelfTraverser	TokenNameIdentifier	 Ancestor Or Self Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeTraverser	TokenNameIdentifier	 Attribute Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
ChildTraverser	TokenNameIdentifier	 Child Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
DescendantTraverser	TokenNameIdentifier	 Descendant Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTORSELF	TokenNameIdentifier	 DESCENDANTORSELF
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
DescendantOrSelfTraverser	TokenNameIdentifier	 Descendant Or Self Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FOLLOWING	TokenNameIdentifier	 FOLLOWING
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
FollowingTraverser	TokenNameIdentifier	 Following Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FOLLOWINGSIBLING	TokenNameIdentifier	 FOLLOWINGSIBLING
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
FollowingSiblingTraverser	TokenNameIdentifier	 Following Sibling Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceTraverser	TokenNameIdentifier	 Namespace Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
NAMESPACEDECLS	TokenNameIdentifier	 NAMESPACEDECLS
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceDeclsTraverser	TokenNameIdentifier	 Namespace Decls Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
ParentTraverser	TokenNameIdentifier	 Parent Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDING	TokenNameIdentifier	 PRECEDING
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
PrecedingTraverser	TokenNameIdentifier	 Preceding Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDINGSIBLING	TokenNameIdentifier	 PRECEDINGSIBLING
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
PrecedingSiblingTraverser	TokenNameIdentifier	 Preceding Sibling Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
SELF	TokenNameIdentifier	 SELF
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
SelfTraverser	TokenNameIdentifier	 Self Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ALL	TokenNameIdentifier	 ALL
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
AllFromRootTraverser	TokenNameIdentifier	 All From Root Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ALLFROMNODE	TokenNameIdentifier	 ALLFROMNODE
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
AllFromNodeTraverser	TokenNameIdentifier	 All From Node Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDINGANDANCESTOR	TokenNameIdentifier	 PRECEDINGANDANCESTOR
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
PrecedingAndAncestorTraverser	TokenNameIdentifier	 Preceding And Ancestor Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTSFROMROOT	TokenNameIdentifier	 DESCENDANTSFROMROOT
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
DescendantFromRootTraverser	TokenNameIdentifier	 Descendant From Root Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTSORSELFFROMROOT	TokenNameIdentifier	 DESCENDANTSORSELFFROMROOT
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
DescendantOrSelfFromRootTraverser	TokenNameIdentifier	 Descendant Or Self From Root Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
:	TokenNameCOLON	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
new	TokenNamenew	
RootTraverser	TokenNameIdentifier	 Root Traverser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FILTEREDLIST	TokenNameIdentifier	 FILTEREDLIST
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Don't want to throw an exception for this one. 	TokenNameCOMMENT_LINE	Don't want to throw an exception for this one. 
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_UNKNOWN_AXIS_TYPE	TokenNameIdentifier	 ER  UNKNOWN  AXIS  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Unknown axis traversal type: "+axis); 	TokenNameCOMMENT_LINE	"Unknown axis traversal type: "+axis); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
traverser	TokenNameIdentifier	 traverser
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_AXIS_TRAVERSER_NOT_SUPPORTED	TokenNameIdentifier	 ER  AXIS  TRAVERSER  NOT  SUPPORTED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
getNames	TokenNameIdentifier	 get Names
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Axis traverser not supported: " 	TokenNameCOMMENT_LINE	"Axis traverser not supported: " 
// + Axis.names[axis]); 	TokenNameCOMMENT_LINE	+ Axis.names[axis]); 
m_traversers	TokenNameIdentifier	 m traversers
[	TokenNameLBRACKET	
axis	TokenNameIdentifier	 axis
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
;	TokenNameSEMICOLON	
return	TokenNamereturn	
traverser	TokenNameIdentifier	 traverser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
AncestorTraverser	TokenNameIdentifier	 Ancestor Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node if this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node if this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Process using identities 	TokenNameCOMMENT_LINE	Process using identities 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
AncestorOrSelfTraverser	TokenNameIdentifier	 Ancestor Or Self Traverser
extends	TokenNameextends	
AncestorTraverser	TokenNameIdentifier	 Ancestor Traverser
{	TokenNameLBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. To see if * the self node should be processed, use this function. * * @param context The context node of this traversal. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. To see if the self node should be processed, use this function. * @param context The context node of this traversal. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. To see if * the self node should be processed, use this function. If the context * node does not match the expanded type ID, this function will return * false. * * @param context The context node of this traversal. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. To see if the self node should be processed, use this function. If the context node does not match the expanded type ID, this function will return false. * @param context The context node of this traversal. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
?	TokenNameQUESTION	
context	TokenNameIdentifier	 context
:	TokenNameCOLON	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Attribute access */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Attribute access 
private	TokenNameprivate	
class	TokenNameclass	
AttributeTraverser	TokenNameIdentifier	 Attribute Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
:	TokenNameCOLON	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
:	TokenNameCOLON	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
ChildTraverser	TokenNameIdentifier	 Child Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Get the next indexed node that matches the expanded type ID. Before * calling this function, one should first call * {@link #isIndexed(int) isIndexed} to make sure that the index can * contain nodes that match the given expanded type ID. * * @param axisRoot The root identity of the axis. * @param nextPotential The node found must match or occur after this node. * @param expandedTypeID The expanded type ID for the request. * * @return The node ID or NULL if not found. */	TokenNameCOMMENT_JAVADOC	 Get the next indexed node that matches the expanded type ID. Before calling this function, one should first call {@link #isIndexed(int) isIndexed} to make sure that the index can contain nodes that match the given expanded type ID. * @param axisRoot The root identity of the axis. @param nextPotential The node found must match or occur after this node. @param expandedTypeID The expanded type ID for the request. * @return The node ID or NULL if not found. 
protected	TokenNameprotected	
int	TokenNameint	
getNextIndexed	TokenNameIdentifier	 get Next Indexed
(	TokenNameLPAREN	
int	TokenNameint	
axisRoot	TokenNameIdentifier	 axis Root
,	TokenNameCOMMA	
int	TokenNameint	
nextPotential	TokenNameIdentifier	 next Potential
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nsIndex	TokenNameIdentifier	 ns Index
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getNamespaceID	TokenNameIdentifier	 get Namespace ID
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lnIndex	TokenNameIdentifier	 ln Index
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalNameID	TokenNameIdentifier	 get Local Name ID
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nextID	TokenNameIdentifier	 next ID
=	TokenNameEQUAL	
findElementFromIndex	TokenNameIdentifier	 find Element From Index
(	TokenNameLPAREN	
nsIndex	TokenNameIdentifier	 ns Index
,	TokenNameCOMMA	
lnIndex	TokenNameIdentifier	 ln Index
,	TokenNameCOMMA	
nextPotential	TokenNameIdentifier	 next Potential
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
!=	TokenNameNOT_EQUAL	
nextID	TokenNameIdentifier	 next ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
parentID	TokenNameIdentifier	 parent ID
=	TokenNameEQUAL	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
nextID	TokenNameIdentifier	 next ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Is it a child? 	TokenNameCOMMENT_LINE	Is it a child? 
if	TokenNameif	
(	TokenNameLPAREN	
parentID	TokenNameIdentifier	 parent ID
==	TokenNameEQUAL_EQUAL	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
return	TokenNamereturn	
nextID	TokenNameIdentifier	 next ID
;	TokenNameSEMICOLON	
// If the parent occured before the subtree root, then 	TokenNameCOMMENT_LINE	If the parent occured before the subtree root, then 
// we know it is past the child axis. 	TokenNameCOMMENT_LINE	we know it is past the child axis. 
if	TokenNameif	
(	TokenNameLPAREN	
parentID	TokenNameIdentifier	 parent ID
<	TokenNameLESS	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// Otherwise, it could be a descendant below the subtree root 	TokenNameCOMMENT_LINE	Otherwise, it could be a descendant below the subtree root 
// children, or it could be after the subtree root. So we have 	TokenNameCOMMENT_LINE	children, or it could be after the subtree root. So we have 
// to climb up until the parent is less than the subtree root, in 	TokenNameCOMMENT_LINE	to climb up until the parent is less than the subtree root, in 
// which case we return NULL, or until it is equal to the subtree 	TokenNameCOMMENT_LINE	which case we return NULL, or until it is equal to the subtree 
// root, in which case we continue to look. 	TokenNameCOMMENT_LINE	root, in which case we continue to look. 
do	TokenNamedo	
{	TokenNameLBRACE	
parentID	TokenNameIdentifier	 parent ID
=	TokenNameEQUAL	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
parentID	TokenNameIdentifier	 parent ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parentID	TokenNameIdentifier	 parent ID
<	TokenNameLESS	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
parentID	TokenNameIdentifier	 parent ID
>	TokenNameGREATER	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Found node via index: "+first); 	TokenNameCOMMENT_LINE	System.out.println("Found node via index: "+first); 
nextPotential	TokenNameIdentifier	 next Potential
=	TokenNameEQUAL	
nextID	TokenNameIdentifier	 next ID
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. So to traverse * an axis, the first function must be used to get the first node. * * <p>This method needs to be overloaded only by those axis that process * the self node. <\p> * * @param context The context node of this traversal. This is the point * that the traversal starts from. * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. So to traverse an axis, the first function must be used to get the first node. * <p>This method needs to be overloaded only by those axis that process the self node. <\p> * @param context The context node of this traversal. This is the point that the traversal starts from. @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. So to traverse * an axis, the first function must be used to get the first node. * * <p>This method needs to be overloaded only by those axis that process * the self node. <\p> * * @param context The context node of this traversal. This is the point * of origin for the traversal -- its "root node" or starting point. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. So to traverse an axis, the first function must be used to get the first node. * <p>This method needs to be overloaded only by those axis that process the self node. <\p> * @param context The context node of this traversal. This is the point of origin for the traversal -- its "root node" or starting point. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstMatch	TokenNameIdentifier	 first Match
=	TokenNameEQUAL	
getNextIndexed	TokenNameIdentifier	 get Next Indexed
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
,	TokenNameCOMMA	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
firstMatch	TokenNameIdentifier	 first Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// %REVIEW% Dead code. Eliminate? 	TokenNameCOMMENT_LINE	%REVIEW% Dead code. Eliminate? 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Process in Identifier space 	TokenNameCOMMENT_LINE	Process in Identifier space 
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Super class for derived classes that want a convenient way to access * the indexing mechanism. */	TokenNameCOMMENT_JAVADOC	 Super class for derived classes that want a convenient way to access the indexing mechanism. 
private	TokenNameprivate	
abstract	TokenNameabstract	
class	TokenNameclass	
IndexedDTMAxisTraverser	TokenNameIdentifier	 Indexed DTM Axis Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Tell if the indexing is on and the given expanded type ID matches * what is in the indexes. Derived classes should call this before * calling {@link #getNextIndexed(int, int, int) getNextIndexed} method. * * @param expandedTypeID The expanded type ID being requested. * * @return true if it is OK to call the * {@link #getNextIndexed(int, int, int) getNextIndexed} method. */	TokenNameCOMMENT_JAVADOC	 Tell if the indexing is on and the given expanded type ID matches what is in the indexes. Derived classes should call this before calling {@link #getNextIndexed(int, int, int) getNextIndexed} method. * @param expandedTypeID The expanded type ID being requested. * @return true if it is OK to call the {@link #getNextIndexed(int, int, int) getNextIndexed} method. 
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_indexing	TokenNameIdentifier	 m indexing
&&	TokenNameAND_AND	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
.	TokenNameDOT	
ELEMENT	TokenNameIdentifier	 ELEMENT
==	TokenNameEQUAL_EQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if a node is outside the axis being traversed. This method must be * implemented by derived classes, and must be robust enough to handle any * node that occurs after the axis root. * * @param axisRoot The root identity of the axis. * @param identity The node in question. * * @return true if the given node falls outside the axis being traversed. */	TokenNameCOMMENT_JAVADOC	 Tell if a node is outside the axis being traversed. This method must be implemented by derived classes, and must be robust enough to handle any node that occurs after the axis root. * @param axisRoot The root identity of the axis. @param identity The node in question. * @return true if the given node falls outside the axis being traversed. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isAfterAxis	TokenNameIdentifier	 is After Axis
(	TokenNameLPAREN	
int	TokenNameint	
axisRoot	TokenNameIdentifier	 axis Root
,	TokenNameCOMMA	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tell if the axis has been fully processed to tell if a the wait for * an arriving node should terminate. This method must be implemented * be a derived class. * * @param axisRoot The root identity of the axis. * * @return true if the axis has been fully processed. */	TokenNameCOMMENT_JAVADOC	 Tell if the axis has been fully processed to tell if a the wait for an arriving node should terminate. This method must be implemented be a derived class. * @param axisRoot The root identity of the axis. * @return true if the axis has been fully processed. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
axisHasBeenProcessed	TokenNameIdentifier	 axis Has Been Processed
(	TokenNameLPAREN	
int	TokenNameint	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the next indexed node that matches the expanded type ID. Before * calling this function, one should first call * {@link #isIndexed(int) isIndexed} to make sure that the index can * contain nodes that match the given expanded type ID. * * @param axisRoot The root identity of the axis. * @param nextPotential The node found must match or occur after this node. * @param expandedTypeID The expanded type ID for the request. * * @return The node ID or NULL if not found. */	TokenNameCOMMENT_JAVADOC	 Get the next indexed node that matches the expanded type ID. Before calling this function, one should first call {@link #isIndexed(int) isIndexed} to make sure that the index can contain nodes that match the given expanded type ID. * @param axisRoot The root identity of the axis. @param nextPotential The node found must match or occur after this node. @param expandedTypeID The expanded type ID for the request. * @return The node ID or NULL if not found. 
protected	TokenNameprotected	
int	TokenNameint	
getNextIndexed	TokenNameIdentifier	 get Next Indexed
(	TokenNameLPAREN	
int	TokenNameint	
axisRoot	TokenNameIdentifier	 axis Root
,	TokenNameCOMMA	
int	TokenNameint	
nextPotential	TokenNameIdentifier	 next Potential
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nsIndex	TokenNameIdentifier	 ns Index
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getNamespaceID	TokenNameIdentifier	 get Namespace ID
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
lnIndex	TokenNameIdentifier	 ln Index
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalNameID	TokenNameIdentifier	 get Local Name ID
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
findElementFromIndex	TokenNameIdentifier	 find Element From Index
(	TokenNameLPAREN	
nsIndex	TokenNameIdentifier	 ns Index
,	TokenNameCOMMA	
lnIndex	TokenNameIdentifier	 ln Index
,	TokenNameCOMMA	
nextPotential	TokenNameIdentifier	 next Potential
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isAfterAxis	TokenNameIdentifier	 is After Axis
(	TokenNameLPAREN	
axisRoot	TokenNameIdentifier	 axis Root
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// System.out.println("Found node via index: "+first); 	TokenNameCOMMENT_LINE	System.out.println("Found node via index: "+first); 
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
axisHasBeenProcessed	TokenNameIdentifier	 axis Has Been Processed
(	TokenNameLPAREN	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
DescendantTraverser	TokenNameIdentifier	 Descendant Traverser
extends	TokenNameextends	
IndexedDTMAxisTraverser	TokenNameIdentifier	 Indexed DTM Axis Traverser
{	TokenNameLBRACE	
/** * Get the first potential identity that can be returned. This should * be overridded by classes that need to return the self node. * * @param identity The node identity of the root context of the traversal. * * @return The first potential node that can be in the traversal. */	TokenNameCOMMENT_JAVADOC	 Get the first potential identity that can be returned. This should be overridded by classes that need to return the self node. * @param identity The node identity of the root context of the traversal. * @return The first potential node that can be in the traversal. 
protected	TokenNameprotected	
int	TokenNameint	
getFirstPotential	TokenNameIdentifier	 get First Potential
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
identity	TokenNameIdentifier	 identity
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the axis has been fully processed to tell if a the wait for * an arriving node should terminate. * * @param axisRoot The root identity of the axis. * * @return true if the axis has been fully processed. */	TokenNameCOMMENT_JAVADOC	 Tell if the axis has been fully processed to tell if a the wait for an arriving node should terminate. * @param axisRoot The root identity of the axis. * @return true if the axis has been fully processed. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
axisHasBeenProcessed	TokenNameIdentifier	 axis Has Been Processed
(	TokenNameLPAREN	
int	TokenNameint	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
(	TokenNameLPAREN	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the subtree root identity from the handle that was passed in by * the caller. Derived classes may override this to change the root * context of the traversal. * * @param handle handle to the root context. * @return identity of the root of the subtree. */	TokenNameCOMMENT_JAVADOC	 Get the subtree root identity from the handle that was passed in by the caller. Derived classes may override this to change the root context of the traversal. * @param handle handle to the root context. @return identity of the root of the subtree. 
protected	TokenNameprotected	
int	TokenNameint	
getSubtreeRoot	TokenNameIdentifier	 get Subtree Root
(	TokenNameLPAREN	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this node identity is a descendant. Assumes that * the node info for the element has already been obtained. * * %REVIEW% This is really parentFollowsRootInDocumentOrder ... * which fails if the parent starts after the root ends. * May be sufficient for this class's logic, but misleadingly named! * * @param subtreeRootIdentity The root context of the subtree in question. * @param identity The index number of the node in question. * @return true if the index is a descendant of _startNode. */	TokenNameCOMMENT_JAVADOC	 Tell if this node identity is a descendant. Assumes that the node info for the element has already been obtained. * %REVIEW% This is really parentFollowsRootInDocumentOrder ... which fails if the parent starts after the root ends. May be sufficient for this class's logic, but misleadingly named! * @param subtreeRootIdentity The root context of the subtree in question. @param identity The index number of the node in question. @return true if the index is a descendant of _startNode. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isDescendant	TokenNameIdentifier	 is Descendant
(	TokenNameLPAREN	
int	TokenNameint	
subtreeRootIdentity	TokenNameIdentifier	 subtree Root Identity
,	TokenNameCOMMA	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
subtreeRootIdentity	TokenNameIdentifier	 subtree Root Identity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if a node is outside the axis being traversed. This method must be * implemented by derived classes, and must be robust enough to handle any * node that occurs after the axis root. * * @param axisRoot The root identity of the axis. * @param identity The node in question. * * @return true if the given node falls outside the axis being traversed. */	TokenNameCOMMENT_JAVADOC	 Tell if a node is outside the axis being traversed. This method must be implemented by derived classes, and must be robust enough to handle any node that occurs after the axis root. * @param axisRoot The root identity of the axis. @param identity The node in question. * @return true if the given node falls outside the axis being traversed. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isAfterAxis	TokenNameIdentifier	 is After Axis
(	TokenNameLPAREN	
int	TokenNameint	
axisRoot	TokenNameIdentifier	 axis Root
,	TokenNameCOMMA	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% Is there *any* cheaper way to do this? 	TokenNameCOMMENT_LINE	%REVIEW% Is there *any* cheaper way to do this? 
// Yes. In ID space, compare to axisRoot's successor 	TokenNameCOMMENT_LINE	Yes. In ID space, compare to axisRoot's successor 
// (next-sib or ancestor's-next-sib). Probably shallower search. 	TokenNameCOMMENT_LINE	(next-sib or ancestor's-next-sib). Probably shallower search. 
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
==	TokenNameEQUAL_EQUAL	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
>=	TokenNameGREATER_EQUAL	
axisRoot	TokenNameIdentifier	 axis Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. So to traverse * an axis, the first function must be used to get the first node. * * <p>This method needs to be overloaded only by those axis that process * the self node. <\p> * * @param context The context node of this traversal. This is the point * of origin for the traversal -- its "root node" or starting point. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. So to traverse an axis, the first function must be used to get the first node. * <p>This method needs to be overloaded only by those axis that process the self node. <\p> * @param context The context node of this traversal. This is the point of origin for the traversal -- its "root node" or starting point. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
getSubtreeRoot	TokenNameIdentifier	 get Subtree Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstPotential	TokenNameIdentifier	 first Potential
=	TokenNameEQUAL	
getFirstPotential	TokenNameIdentifier	 get First Potential
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
getNextIndexed	TokenNameIdentifier	 get Next Indexed
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
,	TokenNameCOMMA	
firstPotential	TokenNameIdentifier	 first Potential
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
=	TokenNameEQUAL	
getSubtreeRoot	TokenNameIdentifier	 get Subtree Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may call nextNode() 	TokenNameCOMMENT_LINE	may call nextNode() 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDescendant	TokenNameIdentifier	 is Descendant
(	TokenNameLPAREN	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
=	TokenNameEQUAL	
getSubtreeRoot	TokenNameIdentifier	 get Subtree Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
getNextIndexed	TokenNameIdentifier	 get Next Indexed
(	TokenNameLPAREN	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
exptype	TokenNameIdentifier	 exptype
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may call nextNode() 	TokenNameCOMMENT_LINE	may call nextNode() 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDescendant	TokenNameIdentifier	 is Descendant
(	TokenNameLPAREN	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exptype	TokenNameIdentifier	 exptype
!=	TokenNameNOT_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
DescendantOrSelfTraverser	TokenNameIdentifier	 Descendant Or Self Traverser
extends	TokenNameextends	
DescendantTraverser	TokenNameIdentifier	 Descendant Traverser
{	TokenNameLBRACE	
/** * Get the first potential identity that can be returned, which is the * axis context, in this case. * * @param identity The node identity of the root context of the traversal. * * @return The axis context. */	TokenNameCOMMENT_JAVADOC	 Get the first potential identity that can be returned, which is the axis context, in this case. * @param identity The node identity of the root context of the traversal. * @return The axis context. 
protected	TokenNameprotected	
int	TokenNameint	
getFirstPotential	TokenNameIdentifier	 get First Potential
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. To see if * the self node should be processed, use this function. * * @param context The context node of this traversal. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. To see if the self node should be processed, use this function. * @param context The context node of this traversal. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the entire subtree, including the root node. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the entire subtree, including the root node. 
private	TokenNameprivate	
class	TokenNameclass	
AllFromNodeTraverser	TokenNameIdentifier	 All From Node Traverser
extends	TokenNameextends	
DescendantOrSelfTraverser	TokenNameIdentifier	 Descendant Or Self Traverser
{	TokenNameLBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Trickological code: _exptype() has the side-effect of 	TokenNameCOMMENT_LINE	Trickological code: _exptype() has the side-effect of 
// running nextNode until the specified node has been loaded, 	TokenNameCOMMENT_LINE	running nextNode until the specified node has been loaded, 
// and thus can be used to ensure that incremental construction of 	TokenNameCOMMENT_LINE	and thus can be used to ensure that incremental construction of 
// the DTM has gotten this far. Using it just for that side-effect 	TokenNameCOMMENT_LINE	the DTM has gotten this far. Using it just for that side-effect 
// is quite a kluge... 	TokenNameCOMMENT_LINE	is quite a kluge... 
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure it's here. 	TokenNameCOMMENT_LINE	make sure it's here. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDescendant	TokenNameIdentifier	 is Descendant
(	TokenNameLPAREN	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the following access, in document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the following access, in document order. 
private	TokenNameprivate	
class	TokenNameclass	
FollowingTraverser	TokenNameIdentifier	 Following Traverser
extends	TokenNameextends	
DescendantTraverser	TokenNameIdentifier	 Descendant Traverser
{	TokenNameLBRACE	
/** * Get the first of the following. * * @param context The context node of this traversal. This is the point * that the traversal starts from. * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 Get the first of the following. * @param context The context node of this traversal. This is the point that the traversal starts from. @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in ID space 	TokenNameCOMMENT_LINE	Compute in ID space 
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
first	TokenNameIdentifier	 first
&&	TokenNameAND_AND	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first of the following. * * @param context The context node of this traversal. This is the point * of origin for the traversal -- its "root node" or starting point. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 Get the first of the following. * @param context The context node of this traversal. This is the point of origin for the traversal -- its "root node" or starting point. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% This looks like it might want shift into identity space 	TokenNameCOMMENT_LINE	%REVIEW% This looks like it might want shift into identity space 
// to avoid repeated conversion in the individual functions 	TokenNameCOMMENT_LINE	to avoid repeated conversion in the individual functions 
int	TokenNameint	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
first	TokenNameIdentifier	 first
&&	TokenNameAND_AND	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in identity space 	TokenNameCOMMENT_LINE	Compute in identity space 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Only works on IDs, not handles. 	TokenNameCOMMENT_LINE	Only works on IDs, not handles. 
// %REVIEW% Are we using handles or indexes? 	TokenNameCOMMENT_LINE	%REVIEW% Are we using handles or indexes? 
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may call nextNode() 	TokenNameCOMMENT_LINE	may call nextNode() 
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in ID space 	TokenNameCOMMENT_LINE	Compute in ID space 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
etype	TokenNameIdentifier	 etype
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may call nextNode() 	TokenNameCOMMENT_LINE	may call nextNode() 
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
etype	TokenNameIdentifier	 etype
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
etype	TokenNameIdentifier	 etype
!=	TokenNameNOT_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
FollowingSiblingTraverser	TokenNameIdentifier	 Following Sibling Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
NamespaceDeclsTraverser	TokenNameIdentifier	 Namespace Decls Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
:	TokenNameCOLON	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
:	TokenNameCOLON	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
NamespaceTraverser	TokenNameIdentifier	 Namespace Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
:	TokenNameCOLON	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
:	TokenNameCOLON	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
ParentTraverser	TokenNameIdentifier	 Parent Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. So to traverse * an axis, the first function must be used to get the first node. * * <p>This method needs to be overloaded only by those axis that process * the self node. <\p> * * @param context The context node of this traversal. This is the point * that the traversal starts from. * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. So to traverse an axis, the first function must be used to get the first node. * <p>This method needs to be overloaded only by those axis that process the self node. <\p> * @param context The context node of this traversal. This is the point that the traversal starts from. @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. So to traverse * an axis, the first function must be used to get the first node. * * <p>This method needs to be overloaded only by those axis that process * the self node. <\p> * * @param context The context node of this traversal. This is the point * of origin for the traversal -- its "root node" or starting point. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. So to traverse an axis, the first function must be used to get the first node. * <p>This method needs to be overloaded only by those axis that process the self node. <\p> * @param context The context node of this traversal. This is the point of origin for the traversal -- its "root node" or starting point. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in ID space 	TokenNameCOMMENT_LINE	Compute in ID space 
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
PrecedingTraverser	TokenNameIdentifier	 Preceding Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Tell if the current identity is an ancestor of the context identity. * This is an expensive operation, made worse by the stateless traversal. * But the preceding axis is used fairly infrequently. * * @param contextIdent The context node of the axis traversal. * @param currentIdent The node in question. * @return true if the currentIdent node is an ancestor of contextIdent. */	TokenNameCOMMENT_JAVADOC	 Tell if the current identity is an ancestor of the context identity. This is an expensive operation, made worse by the stateless traversal. But the preceding axis is used fairly infrequently. * @param contextIdent The context node of the axis traversal. @param currentIdent The node in question. @return true if the currentIdent node is an ancestor of contextIdent. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isAncestor	TokenNameIdentifier	 is Ancestor
(	TokenNameLPAREN	
int	TokenNameint	
contextIdent	TokenNameIdentifier	 context Ident
,	TokenNameCOMMA	
int	TokenNameint	
currentIdent	TokenNameIdentifier	 current Ident
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% See comments in IsAfterAxis; using the "successor" of 	TokenNameCOMMENT_LINE	%REVIEW% See comments in IsAfterAxis; using the "successor" of 
// contextIdent is probably more efficient. 	TokenNameCOMMENT_LINE	contextIdent is probably more efficient. 
for	TokenNamefor	
(	TokenNameLPAREN	
contextIdent	TokenNameIdentifier	 context Ident
=	TokenNameEQUAL	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
contextIdent	TokenNameIdentifier	 context Ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
contextIdent	TokenNameIdentifier	 context Ident
;	TokenNameSEMICOLON	
contextIdent	TokenNameIdentifier	 context Ident
=	TokenNameEQUAL	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
contextIdent	TokenNameIdentifier	 context Ident
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contextIdent	TokenNameIdentifier	 context Ident
==	TokenNameEQUAL_EQUAL	
currentIdent	TokenNameIdentifier	 current Ident
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// compute in ID space 	TokenNameCOMMENT_LINE	compute in ID space 
int	TokenNameint	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
isAncestor	TokenNameIdentifier	 is Ancestor
(	TokenNameLPAREN	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in ID space 	TokenNameCOMMENT_LINE	Compute in ID space 
int	TokenNameint	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
exptype	TokenNameIdentifier	 exptype
=	TokenNameEQUAL	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exptype	TokenNameIdentifier	 exptype
!=	TokenNameNOT_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
||	TokenNameOR_OR	
isAncestor	TokenNameIdentifier	 is Ancestor
(	TokenNameLPAREN	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor and the Preceding axis, * in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor and the Preceding axis, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
PrecedingAndAncestorTraverser	TokenNameIdentifier	 Preceding And Ancestor Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in ID space 	TokenNameCOMMENT_LINE	Compute in ID space 
int	TokenNameint	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in ID space 	TokenNameCOMMENT_LINE	Compute in ID space 
int	TokenNameint	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
exptype	TokenNameIdentifier	 exptype
=	TokenNameEQUAL	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exptype	TokenNameIdentifier	 exptype
!=	TokenNameNOT_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
PrecedingSiblingTraverser	TokenNameIdentifier	 Preceding Sibling Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Self axis. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Self axis. 
private	TokenNameprivate	
class	TokenNameclass	
SelfTraverser	TokenNameIdentifier	 Self Traverser
extends	TokenNameextends	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
{	TokenNameLBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. To see if * the self node should be processed, use this function. * * @param context The context node of this traversal. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. To see if the self node should be processed, use this function. * @param context The context node of this traversal. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. To see if * the self node should be processed, use this function. If the context * node does not match the expanded type ID, this function will return * false. * * @param context The context node of this traversal. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. To see if the self node should be processed, use this function. If the context node does not match the expanded type ID, this function will return false. * @param context The context node of this traversal. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
?	TokenNameQUESTION	
context	TokenNameIdentifier	 context
:	TokenNameCOLON	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return Always return NULL for this axis. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return Always return NULL for this axis. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Ancestor access, in reverse document order. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Ancestor access, in reverse document order. 
private	TokenNameprivate	
class	TokenNameclass	
AllFromRootTraverser	TokenNameIdentifier	 All From Root Traverser
extends	TokenNameextends	
AllFromNodeTraverser	TokenNameIdentifier	 All From Node Traverser
{	TokenNameLBRACE	
/** * Return the root. * * @param context The context node of this traversal. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 Return the root. * @param context The context node of this traversal. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the root if it matches the expanded type ID. * * @param context The context node of this traversal. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 Return the root if it matches the expanded type ID. * @param context The context node of this traversal. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
?	TokenNameQUESTION	
context	TokenNameIdentifier	 context
:	TokenNameCOLON	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in ID space 	TokenNameCOMMENT_LINE	Compute in ID space 
int	TokenNameint	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Kluge test: Just make sure +1 yielded a real node 	TokenNameCOMMENT_LINE	Kluge test: Just make sure +1 yielded a real node 
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may call nextNode() 	TokenNameCOMMENT_LINE	may call nextNode() 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Compute in ID space 	TokenNameCOMMENT_LINE	Compute in ID space 
int	TokenNameint	
subtreeRootIdent	TokenNameIdentifier	 subtree Root Ident
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
exptype	TokenNameIdentifier	 exptype
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may call nextNode() 	TokenNameCOMMENT_LINE	may call nextNode() 
if	TokenNameif	
(	TokenNameLPAREN	
exptype	TokenNameIdentifier	 exptype
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exptype	TokenNameIdentifier	 exptype
!=	TokenNameNOT_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements traversal of the Self axis. */	TokenNameCOMMENT_JAVADOC	 Implements traversal of the Self axis. 
private	TokenNameprivate	
class	TokenNameclass	
RootTraverser	TokenNameIdentifier	 Root Traverser
extends	TokenNameextends	
AllFromRootTraverser	TokenNameIdentifier	 All From Root Traverser
{	TokenNameLBRACE	
/** * Return the root if it matches the expanded type ID, * else return null (nothing found) * * @param context The context node of this traversal. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 Return the root if it matches the expanded type ID, else return null (nothing found) * @param context The context node of this traversal. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
?	TokenNameQUESTION	
root	TokenNameIdentifier	 root
:	TokenNameCOLON	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node. * * @param context The context node of this iteration. * @param current The current node of the iteration. * * @return Always return NULL for this axis. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node. * @param context The context node of this iteration. @param current The current node of the iteration. * @return Always return NULL for this axis. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Traverse to the next node after the current node that is matched * by the expanded type ID. * * @param context The context node of this iteration. * @param current The current node of the iteration. * @param expandedTypeID The expanded type ID that must match. * * @return the next node in the iteration, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Traverse to the next node after the current node that is matched by the expanded type ID. * @param context The context node of this iteration. @param current The current node of the iteration. @param expandedTypeID The expanded type ID that must match. * @return the next node in the iteration, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A non-xpath axis, returns all nodes that aren't namespaces or attributes, * from and including the root. */	TokenNameCOMMENT_JAVADOC	 A non-xpath axis, returns all nodes that aren't namespaces or attributes, from and including the root. 
private	TokenNameprivate	
class	TokenNameclass	
DescendantOrSelfFromRootTraverser	TokenNameIdentifier	 Descendant Or Self From Root Traverser
extends	TokenNameextends	
DescendantTraverser	TokenNameIdentifier	 Descendant Traverser
{	TokenNameLBRACE	
/** * Get the first potential identity that can be returned, which is the axis * root context in this case. * * @param identity The node identity of the root context of the traversal. * * @return The identity argument. */	TokenNameCOMMENT_JAVADOC	 Get the first potential identity that can be returned, which is the axis root context in this case. * @param identity The node identity of the root context of the traversal. * @return The identity argument. 
protected	TokenNameprotected	
int	TokenNameint	
getFirstPotential	TokenNameIdentifier	 get First Potential
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first potential identity that can be returned. * @param handle handle to the root context. * @return identity of the root of the subtree. */	TokenNameCOMMENT_JAVADOC	 Get the first potential identity that can be returned. @param handle handle to the root context. @return identity of the root of the subtree. 
protected	TokenNameprotected	
int	TokenNameint	
getSubtreeRoot	TokenNameIdentifier	 get Subtree Root
(	TokenNameLPAREN	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% Shouldn't this always be 0? 	TokenNameCOMMENT_LINE	%REVIEW% Shouldn't this always be 0? 
return	TokenNamereturn	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the root. * * @param context The context node of this traversal. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 Return the root. * @param context The context node of this traversal. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. So to traverse * an axis, the first function must be used to get the first node. * * <p>This method needs to be overloaded only by those axis that process * the self node. <\p> * * @param context The context node of this traversal. This is the point * of origin for the traversal -- its "root node" or starting point. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. So to traverse an axis, the first function must be used to get the first node. * <p>This method needs to be overloaded only by those axis that process the self node. <\p> * @param context The context node of this traversal. This is the point of origin for the traversal -- its "root node" or starting point. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstPotential	TokenNameIdentifier	 first Potential
=	TokenNameEQUAL	
getFirstPotential	TokenNameIdentifier	 get First Potential
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
getNextIndexed	TokenNameIdentifier	 get Next Indexed
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
,	TokenNameCOMMA	
firstPotential	TokenNameIdentifier	 first Potential
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A non-xpath axis, returns all nodes that aren't namespaces or attributes, * from but not including the root. */	TokenNameCOMMENT_JAVADOC	 A non-xpath axis, returns all nodes that aren't namespaces or attributes, from but not including the root. 
private	TokenNameprivate	
class	TokenNameclass	
DescendantFromRootTraverser	TokenNameIdentifier	 Descendant From Root Traverser
extends	TokenNameextends	
DescendantTraverser	TokenNameIdentifier	 Descendant Traverser
{	TokenNameLBRACE	
/** * Get the first potential identity that can be returned, which is the axis * root context in this case. * * @param identity The node identity of the root context of the traversal. * * @return The identity argument. */	TokenNameCOMMENT_JAVADOC	 Get the first potential identity that can be returned, which is the axis root context in this case. * @param identity The node identity of the root context of the traversal. * @return The identity argument. 
protected	TokenNameprotected	
int	TokenNameint	
getFirstPotential	TokenNameIdentifier	 get First Potential
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the first potential identity that can be returned. * @param handle handle to the root context. * @return identity of the root of the subtree. */	TokenNameCOMMENT_JAVADOC	 Get the first potential identity that can be returned. @param handle handle to the root context. @return identity of the root of the subtree. 
protected	TokenNameprotected	
int	TokenNameint	
getSubtreeRoot	TokenNameIdentifier	 get Subtree Root
(	TokenNameLPAREN	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the root. * * @param context The context node of this traversal. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 Return the root. * @param context The context node of this traversal. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * By the nature of the stateless traversal, the context node can not be * returned or the iteration will go into an infinate loop. So to traverse * an axis, the first function must be used to get the first node. * * <p>This method needs to be overloaded only by those axis that process * the self node. <\p> * * @param context The context node of this traversal. This is the point * of origin for the traversal -- its "root node" or starting point. * @param expandedTypeID The expanded type ID that must match. * * @return the first node in the traversal. */	TokenNameCOMMENT_JAVADOC	 By the nature of the stateless traversal, the context node can not be returned or the iteration will go into an infinate loop. So to traverse an axis, the first function must be used to get the first node. * <p>This method needs to be overloaded only by those axis that process the self node. <\p> * @param context The context node of this traversal. This is the point of origin for the traversal -- its "root node" or starting point. @param expandedTypeID The expanded type ID that must match. * @return the first node in the traversal. 
public	TokenNamepublic	
int	TokenNameint	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstPotential	TokenNameIdentifier	 first Potential
=	TokenNameEQUAL	
getFirstPotential	TokenNameIdentifier	 get First Potential
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
getNextIndexed	TokenNameIdentifier	 get Next Indexed
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
,	TokenNameCOMMA	
firstPotential	TokenNameIdentifier	 first Potential
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
