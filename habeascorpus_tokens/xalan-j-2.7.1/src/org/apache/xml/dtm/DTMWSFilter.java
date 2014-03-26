/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMWSFilter.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMWSFilter.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
/** * This interface is meant to be implemented by a client of the DTM, and allows * stripping of whitespace nodes. */	TokenNameCOMMENT_JAVADOC	 This interface is meant to be implemented by a client of the DTM, and allows stripping of whitespace nodes. 
public	TokenNamepublic	
interface	TokenNameinterface	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
{	TokenNameLBRACE	
/** * Do not strip whitespace child nodes of this element. */	TokenNameCOMMENT_JAVADOC	 Do not strip whitespace child nodes of this element. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NOTSTRIP	TokenNameIdentifier	 NOTSTRIP
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Strip whitespace child nodes of this element. */	TokenNameCOMMENT_JAVADOC	 Strip whitespace child nodes of this element. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
STRIP	TokenNameIdentifier	 STRIP
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Inherit whitespace stripping behavior of the parent node. */	TokenNameCOMMENT_JAVADOC	 Inherit whitespace stripping behavior of the parent node. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
INHERIT	TokenNameIdentifier	 INHERIT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Test whether whitespace-only text nodes are visible in the logical * view of <code>DTM</code>. Normally, this function * will be called by the implementation of <code>DTM</code>; * it is not normally called directly from * user code. * * @param elementHandle int Handle of the element. * @return one of NOTSTRIP, STRIP, or INHERIT. */	TokenNameCOMMENT_JAVADOC	 Test whether whitespace-only text nodes are visible in the logical view of <code>DTM</code>. Normally, this function will be called by the implementation of <code>DTM</code>; it is not normally called directly from user code. * @param elementHandle int Handle of the element. @return one of NOTSTRIP, STRIP, or INHERIT. 
public	TokenNamepublic	
short	TokenNameshort	
getShouldStripSpace	TokenNameIdentifier	 get Should Strip Space
(	TokenNameLPAREN	
int	TokenNameint	
elementHandle	TokenNameIdentifier	 element Handle
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
