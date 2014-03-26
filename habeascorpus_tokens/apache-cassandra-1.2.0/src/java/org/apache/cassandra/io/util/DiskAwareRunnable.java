/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
Directories	TokenNameIdentifier	 Directories
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DiskAwareRunnable	TokenNameIdentifier	 Disk Aware Runnable
extends	TokenNameextends	
WrappedRunnable	TokenNameIdentifier	 Wrapped Runnable
{	TokenNameLBRACE	
/** * Run this task after selecting the optimal disk for it */	TokenNameCOMMENT_JAVADOC	 Run this task after selecting the optimal disk for it 
protected	TokenNameprotected	
void	TokenNamevoid	
runMayThrow	TokenNameIdentifier	 run May Throw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
long	TokenNamelong	
writeSize	TokenNameIdentifier	 write Size
;	TokenNameSEMICOLON	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
DataDirectory	TokenNameIdentifier	 Data Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeSize	TokenNameIdentifier	 write Size
=	TokenNameEQUAL	
getExpectedWriteSize	TokenNameIdentifier	 get Expected Write Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
Directories	TokenNameIdentifier	 Directories
.	TokenNameDOT	
getLocationCapableOfSize	TokenNameIdentifier	 get Location Capable Of Size
(	TokenNameLPAREN	
writeSize	TokenNameIdentifier	 write Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
reduceScopeForLimitedSpace	TokenNameIdentifier	 reduce Scope For Limited Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Insufficient disk space to write "	TokenNameStringLiteral	Insufficient disk space to write 
+	TokenNamePLUS	
writeSize	TokenNameIdentifier	 write Size
+	TokenNamePLUS	
" bytes"	TokenNameStringLiteral	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
currentTasks	TokenNameIdentifier	 current Tasks
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
estimatedWorkingSize	TokenNameIdentifier	 estimated Working Size
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
writeSize	TokenNameIdentifier	 write Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
runWith	TokenNameIdentifier	 run With
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
estimatedWorkingSize	TokenNameIdentifier	 estimated Working Size
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
writeSize	TokenNameIdentifier	 write Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
currentTasks	TokenNameIdentifier	 current Tasks
.	TokenNameDOT	
decrementAndGet	TokenNameIdentifier	 decrement And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Executes this task on given {@code dataDirectory}. * @param dataDirectory data directory to work on */	TokenNameCOMMENT_JAVADOC	 Executes this task on given {@code dataDirectory}. @param dataDirectory data directory to work on 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
runWith	TokenNameIdentifier	 run With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
dataDirectory	TokenNameIdentifier	 data Directory
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
;	TokenNameSEMICOLON	
/** * Get expected write size to determine which disk to use for this task. * @return expected size in bytes this task will write to disk. */	TokenNameCOMMENT_JAVADOC	 Get expected write size to determine which disk to use for this task. @return expected size in bytes this task will write to disk. 
public	TokenNamepublic	
abstract	TokenNameabstract	
long	TokenNamelong	
getExpectedWriteSize	TokenNameIdentifier	 get Expected Write Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called if no disk is available with free space for the full write size. * @return true if the scope of the task was successfully reduced. */	TokenNameCOMMENT_JAVADOC	 Called if no disk is available with free space for the full write size. @return true if the scope of the task was successfully reduced. 
public	TokenNamepublic	
boolean	TokenNameboolean	
reduceScopeForLimitedSpace	TokenNameIdentifier	 reduce Scope For Limited Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
