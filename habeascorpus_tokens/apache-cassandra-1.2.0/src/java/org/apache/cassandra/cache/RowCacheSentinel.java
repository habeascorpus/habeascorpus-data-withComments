/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicLong	TokenNameIdentifier	 Atomic Long
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Objects	TokenNameIdentifier	 Objects
;	TokenNameSEMICOLON	
/** * A sentinel object for row caches. See comments to getThroughCache and CASSANDRA-3862. */	TokenNameCOMMENT_JAVADOC	 A sentinel object for row caches. See comments to getThroughCache and CASSANDRA-3862. 
public	TokenNamepublic	
class	TokenNameclass	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
implements	TokenNameimplements	
IRowCacheEntry	TokenNameIdentifier	 I Row Cache Entry
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
generator	TokenNameIdentifier	 generator
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
sentinelId	TokenNameIdentifier	 sentinel Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sentinelId	TokenNameIdentifier	 sentinel Id
=	TokenNameEQUAL	
generator	TokenNameIdentifier	 generator
.	TokenNameDOT	
getAndIncrement	TokenNameIdentifier	 get And Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
(	TokenNameLPAREN	
long	TokenNamelong	
sentinelId	TokenNameIdentifier	 sentinel Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sentinelId	TokenNameIdentifier	 sentinel Id
=	TokenNameEQUAL	
sentinelId	TokenNameIdentifier	 sentinel Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RowCacheSentinel	TokenNameIdentifier	 Row Cache Sentinel
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
sentinelId	TokenNameIdentifier	 sentinel Id
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
sentinelId	TokenNameIdentifier	 sentinel Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
sentinelId	TokenNameIdentifier	 sentinel Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
