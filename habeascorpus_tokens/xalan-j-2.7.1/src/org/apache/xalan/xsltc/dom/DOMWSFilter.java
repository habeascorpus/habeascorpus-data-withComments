/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DOMWSFilter.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DOMWSFilter.java 468651 2006-10-28 07:04:25Z minchau $ 
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
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
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
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
;	TokenNameSEMICOLON	
/** * A wrapper class that adapts the * {@link org.apache.xml.dtm.DTMWSFilter DTMWSFilter} interface to the XSLTC * DOM {@link org.apache.xalan.xsltc.StripFilter StripFilter} interface. */	TokenNameCOMMENT_JAVADOC	 A wrapper class that adapts the {@link org.apache.xml.dtm.DTMWSFilter DTMWSFilter} interface to the XSLTC DOM {@link org.apache.xalan.xsltc.StripFilter StripFilter} interface. 
public	TokenNamepublic	
class	TokenNameclass	
DOMWSFilter	TokenNameIdentifier	 DOMWS Filter
implements	TokenNameimplements	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
m_translet	TokenNameIdentifier	 m translet
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StripFilter	TokenNameIdentifier	 Strip Filter
m_filter	TokenNameIdentifier	 m filter
;	TokenNameSEMICOLON	
// The Hashtable for DTM to mapping array 	TokenNameCOMMENT_LINE	The Hashtable for DTM to mapping array 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_mappings	TokenNameIdentifier	 m mappings
;	TokenNameSEMICOLON	
// Cache the DTM and mapping that are used last time 	TokenNameCOMMENT_LINE	Cache the DTM and mapping that are used last time 
private	TokenNameprivate	
DTM	TokenNameIdentifier	 DTM
m_currentDTM	TokenNameIdentifier	 m current DTM
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_currentMapping	TokenNameIdentifier	 m current Mapping
;	TokenNameSEMICOLON	
/** * Construct an adapter connecting the <code>DTMWSFilter</code> interface * to the <code>StripFilter</code> interface. * * @param translet A translet that also implements the StripFilter * interface. * * @see org.apache.xml.dtm.DTMWSFilter * @see org.apache.xalan.xsltc.StripFilter */	TokenNameCOMMENT_JAVADOC	 Construct an adapter connecting the <code>DTMWSFilter</code> interface to the <code>StripFilter</code> interface. * @param translet A translet that also implements the StripFilter interface. * @see org.apache.xml.dtm.DTMWSFilter @see org.apache.xalan.xsltc.StripFilter 
public	TokenNamepublic	
DOMWSFilter	TokenNameIdentifier	 DOMWS Filter
(	TokenNameLPAREN	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_translet	TokenNameIdentifier	 m translet
=	TokenNameEQUAL	
translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
m_mappings	TokenNameIdentifier	 m mappings
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
translet	TokenNameIdentifier	 translet
instanceof	TokenNameinstanceof	
StripFilter	TokenNameIdentifier	 Strip Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_filter	TokenNameIdentifier	 m filter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StripFilter	TokenNameIdentifier	 Strip Filter
)	TokenNameRPAREN	
translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Test whether whitespace-only text nodes are visible in the logical * view of <code>DTM</code>. Normally, this function * will be called by the implementation of <code>DTM</code>; * it is not normally called directly from * user code. * * @param node int handle of the node. * @param dtm the DTM that owns this node * @return one of <code>NOTSTRIP</code>, <code>STRIP</code> or * <code>INHERIT</code>. */	TokenNameCOMMENT_JAVADOC	 Test whether whitespace-only text nodes are visible in the logical view of <code>DTM</code>. Normally, this function will be called by the implementation of <code>DTM</code>; it is not normally called directly from user code. * @param node int handle of the node. @param dtm the DTM that owns this node @return one of <code>NOTSTRIP</code>, <code>STRIP</code> or <code>INHERIT</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getShouldStripSpace	TokenNameIdentifier	 get Should Strip Space
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_filter	TokenNameIdentifier	 m filter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
dtm	TokenNameIdentifier	 dtm
instanceof	TokenNameinstanceof	
DOM	TokenNameIdentifier	 DOM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOM	TokenNameIdentifier	 DOM
)	TokenNameRPAREN	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
instanceof	TokenNameinstanceof	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
mappableDOM	TokenNameIdentifier	 mappable DOM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
)	TokenNameRPAREN	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapping	TokenNameIdentifier	 mapping
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
==	TokenNameEQUAL_EQUAL	
m_currentDTM	TokenNameIdentifier	 m current DTM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mapping	TokenNameIdentifier	 mapping
=	TokenNameEQUAL	
m_currentMapping	TokenNameIdentifier	 m current Mapping
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mapping	TokenNameIdentifier	 mapping
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
m_mappings	TokenNameIdentifier	 m mappings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mapping	TokenNameIdentifier	 mapping
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mapping	TokenNameIdentifier	 mapping
=	TokenNameEQUAL	
mappableDOM	TokenNameIdentifier	 mappable DOM
.	TokenNameDOT	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
m_translet	TokenNameIdentifier	 m translet
.	TokenNameDOT	
getNamesArray	TokenNameIdentifier	 get Names Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_translet	TokenNameIdentifier	 m translet
.	TokenNameDOT	
getUrisArray	TokenNameIdentifier	 get Uris Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_translet	TokenNameIdentifier	 m translet
.	TokenNameDOT	
getTypesArray	TokenNameIdentifier	 get Types Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_mappings	TokenNameIdentifier	 m mappings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
mapping	TokenNameIdentifier	 mapping
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentDTM	TokenNameIdentifier	 m current DTM
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
m_currentMapping	TokenNameIdentifier	 m current Mapping
=	TokenNameEQUAL	
mapping	TokenNameIdentifier	 mapping
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
mappableDOM	TokenNameIdentifier	 mappable DOM
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %OPT% The mapping array does not have information about all the 	TokenNameCOMMENT_LINE	%OPT% The mapping array does not have information about all the 
// exptypes. However it does contain enough information about all names 	TokenNameCOMMENT_LINE	exptypes. However it does contain enough information about all names 
// in the translet's namesArray. If the expType does not fall into the 	TokenNameCOMMENT_LINE	in the translet's namesArray. If the expType does not fall into the 
// range of the mapping array, it means that the expType is not for one 	TokenNameCOMMENT_LINE	range of the mapping array, it means that the expType is not for one 
// of the recognized names. In this case we can just set the type to -1. 	TokenNameCOMMENT_LINE	of the recognized names. In this case we can just set the type to -1. 
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
expType	TokenNameIdentifier	 exp Type
<	TokenNameLESS	
mapping	TokenNameIdentifier	 mapping
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
mapping	TokenNameIdentifier	 mapping
[	TokenNameLBRACKET	
expType	TokenNameIdentifier	 exp Type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
INHERIT	TokenNameIdentifier	 INHERIT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_filter	TokenNameIdentifier	 m filter
.	TokenNameDOT	
stripSpace	TokenNameIdentifier	 strip Space
(	TokenNameLPAREN	
dom	TokenNameIdentifier	 dom
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
STRIP	TokenNameIdentifier	 STRIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
NOTSTRIP	TokenNameIdentifier	 NOTSTRIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
NOTSTRIP	TokenNameIdentifier	 NOTSTRIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
