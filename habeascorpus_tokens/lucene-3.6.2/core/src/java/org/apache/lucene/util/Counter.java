package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Simple counter class * * @lucene.internal * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Simple counter class * @lucene.internal @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Counter	TokenNameIdentifier	 Counter
{	TokenNameLBRACE	
/** * Adds the given delta to the counters current value * * @param delta * the delta to add * @return the counters updated value */	TokenNameCOMMENT_JAVADOC	 Adds the given delta to the counters current value * @param delta the delta to add @return the counters updated value 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
long	TokenNamelong	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the counters current value * * @return the counters current value */	TokenNameCOMMENT_JAVADOC	 Returns the counters current value * @return the counters current value 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a new counter. The returned counter is not thread-safe. */	TokenNameCOMMENT_JAVADOC	 Returns a new counter. The returned counter is not thread-safe. 
public	TokenNamepublic	
static	TokenNamestatic	
Counter	TokenNameIdentifier	 Counter
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new counter. * * @param threadSafe * <code>true</code> if the returned counter can be used by multiple * threads concurrently. * @return a new counter. */	TokenNameCOMMENT_JAVADOC	 Returns a new counter. * @param threadSafe <code>true</code> if the returned counter can be used by multiple threads concurrently. @return a new counter. 
public	TokenNamepublic	
static	TokenNamestatic	
Counter	TokenNameIdentifier	 Counter
newCounter	TokenNameIdentifier	 new Counter
(	TokenNameLPAREN	
boolean	TokenNameboolean	
threadSafe	TokenNameIdentifier	 thread Safe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
threadSafe	TokenNameIdentifier	 thread Safe
?	TokenNameQUESTION	
new	TokenNamenew	
AtomicCounter	TokenNameIdentifier	 Atomic Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
SerialCounter	TokenNameIdentifier	 Serial Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
SerialCounter	TokenNameIdentifier	 Serial Counter
extends	TokenNameextends	
Counter	TokenNameIdentifier	 Counter
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
long	TokenNamelong	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
AtomicCounter	TokenNameIdentifier	 Atomic Counter
extends	TokenNameextends	
Counter	TokenNameIdentifier	 Counter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
long	TokenNamelong	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
