/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
/** Internal class LCount is used to track the number of listeners registered for a given event name, as an entry in a global hashtable. This should allow us to avoid generating, or discard, events for which no listeners are registered. ***** There should undoubtedly be methods here to manipulate this table. At the moment that code's residing in NodeImpl. Move it when we have a chance to do so. Sorry; we were rushed. ???? CONCERN: Hashtables are known to be "overserialized" in current versions of Java. That may impact performance. ???? CONCERN: The hashtable should probably be a per-document object. Finer granularity would be even better, but would cost more cycles to resolve and might not save enough event traffic to be worth the investment. */	TokenNameCOMMENT_JAVADOC	 Internal class LCount is used to track the number of listeners registered for a given event name, as an entry in a global hashtable. This should allow us to avoid generating, or discard, events for which no listeners are registered. ***** There should undoubtedly be methods here to manipulate this table. At the moment that code's residing in NodeImpl. Move it when we have a chance to do so. Sorry; we were rushed. ???? CONCERN: Hashtables are known to be "overserialized" in current versions of Java. That may impact performance. ???? CONCERN: The hashtable should probably be a per-document object. Finer granularity would be even better, but would cost more cycles to resolve and might not save enough event traffic to be worth the investment. 
/** * @xerces.internal * * @version $Id: LCount.java 447266 2006-09-18 05:57:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @version $Id: LCount.java 447266 2006-09-18 05:57:49Z mrglavas $ 
class	TokenNameclass	
LCount	TokenNameIdentifier	 L Count
{	TokenNameLBRACE	
static	TokenNamestatic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
lCounts	TokenNameIdentifier	 l Counts
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
captures	TokenNameIdentifier	 captures
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bubbles	TokenNameIdentifier	 bubbles
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
defaults	TokenNameIdentifier	 defaults
,	TokenNameCOMMA	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
LCount	TokenNameIdentifier	 L Count
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
evtName	TokenNameIdentifier	 evt Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LCount	TokenNameIdentifier	 L Count
lc	TokenNameIdentifier	 lc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LCount	TokenNameIdentifier	 L Count
)	TokenNameRPAREN	
lCounts	TokenNameIdentifier	 l Counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
evtName	TokenNameIdentifier	 evt Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lc	TokenNameIdentifier	 lc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
lCounts	TokenNameIdentifier	 l Counts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
evtName	TokenNameIdentifier	 evt Name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
lc	TokenNameIdentifier	 lc
=	TokenNameEQUAL	
new	TokenNamenew	
LCount	TokenNameIdentifier	 L Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lc	TokenNameIdentifier	 lc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class LCount 	TokenNameCOMMENT_LINE	class LCount 
