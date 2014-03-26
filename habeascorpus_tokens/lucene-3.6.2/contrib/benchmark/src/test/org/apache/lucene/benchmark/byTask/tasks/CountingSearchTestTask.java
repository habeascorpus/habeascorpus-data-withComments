/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
PerfRunData	TokenNameIdentifier	 Perf Run Data
;	TokenNameSEMICOLON	
/** * Test Search task which counts number of searches. */	TokenNameCOMMENT_JAVADOC	 Test Search task which counts number of searches. 
public	TokenNamepublic	
class	TokenNameclass	
CountingSearchTestTask	TokenNameIdentifier	 Counting Search Test Task
extends	TokenNameextends	
SearchTask	TokenNameIdentifier	 Search Task
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
numSearches	TokenNameIdentifier	 num Searches
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
startMillis	TokenNameIdentifier	 start Millis
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
lastMillis	TokenNameIdentifier	 last Millis
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
prevLastMillis	TokenNameIdentifier	 prev Last Millis
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CountingSearchTestTask	TokenNameIdentifier	 Counting Search Test Task
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
incrNumSearches	TokenNameIdentifier	 incr Num Searches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
incrNumSearches	TokenNameIdentifier	 incr Num Searches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prevLastMillis	TokenNameIdentifier	 prev Last Millis
=	TokenNameEQUAL	
lastMillis	TokenNameIdentifier	 last Millis
;	TokenNameSEMICOLON	
lastMillis	TokenNameIdentifier	 last Millis
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
numSearches	TokenNameIdentifier	 num Searches
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startMillis	TokenNameIdentifier	 start Millis
=	TokenNameEQUAL	
prevLastMillis	TokenNameIdentifier	 prev Last Millis
=	TokenNameEQUAL	
lastMillis	TokenNameIdentifier	 last Millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
numSearches	TokenNameIdentifier	 num Searches
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getElapsedMillis	TokenNameIdentifier	 get Elapsed Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastMillis	TokenNameIdentifier	 last Millis
-	TokenNameMINUS	
startMillis	TokenNameIdentifier	 start Millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
