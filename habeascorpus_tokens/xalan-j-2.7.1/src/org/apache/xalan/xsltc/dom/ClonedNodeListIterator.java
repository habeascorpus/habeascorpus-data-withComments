/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ClonedNodeListIterator.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ClonedNodeListIterator.java 468651 2006-10-28 07:04:25Z minchau $ 
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
/** * A ClonedNodeListIterator is returned by the cloneIterator() method * of a CachedNodeListIterator. Its next() method retrieves the nodes from * the cache of the CachedNodeListIterator. */	TokenNameCOMMENT_JAVADOC	 A ClonedNodeListIterator is returned by the cloneIterator() method of a CachedNodeListIterator. Its next() method retrieves the nodes from the cache of the CachedNodeListIterator. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ClonedNodeListIterator	TokenNameIdentifier	 Cloned Node List Iterator
extends	TokenNameextends	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
{	TokenNameLBRACE	
/** * Source for this iterator. */	TokenNameCOMMENT_JAVADOC	 Source for this iterator. 
private	TokenNameprivate	
CachedNodeListIterator	TokenNameIdentifier	 Cached Node List Iterator
_source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClonedNodeListIterator	TokenNameIdentifier	 Cloned Node List Iterator
(	TokenNameLPAREN	
CachedNodeListIterator	TokenNameIdentifier	 Cached Node List Iterator
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRestartable	TokenNameIdentifier	 set Restartable
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//_isRestartable = isRestartable; 	TokenNameCOMMENT_LINE	_isRestartable = isRestartable; 
//_source.setRestartable(isRestartable); 	TokenNameCOMMENT_LINE	_source.setRestartable(isRestartable); 
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
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
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
_index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
_index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNodeByPosition	TokenNameIdentifier	 get Node By Position
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
