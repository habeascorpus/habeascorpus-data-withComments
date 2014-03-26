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
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Algorithm	TokenNameIdentifier	 Algorithm
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
;	TokenNameSEMICOLON	
/** * Run the benchmark algorithm. * <p>Usage: java Benchmark algorithm-file * <ol> * <li>Read algorithm.</li> * <li> Run the algorithm.</li> * </ol> * Things to be added/fixed in "Benchmarking by tasks": * <ol> * <li>TODO - report into Excel and/or graphed view.</li> * <li>TODO - perf comparison between Lucene releases over the years.</li> * <li>TODO - perf report adequate to include in Lucene nightly build site? (so we can easily track performance changes.)</li> * <li>TODO - add overall time control for repeated execution (vs. current by-count only).</li> * <li>TODO - query maker that is based on index statistics.</li> * </ol> */	TokenNameCOMMENT_JAVADOC	 Run the benchmark algorithm. <p>Usage: java Benchmark algorithm-file <ol> <li>Read algorithm.</li> <li> Run the algorithm.</li> </ol> Things to be added/fixed in "Benchmarking by tasks": <ol> <li>TODO - report into Excel and/or graphed view.</li> <li>TODO - perf comparison between Lucene releases over the years.</li> <li>TODO - perf report adequate to include in Lucene nightly build site? (so we can easily track performance changes.)</li> <li>TODO - add overall time control for repeated execution (vs. current by-count only).</li> <li>TODO - query maker that is based on index statistics.</li> </ol> 
public	TokenNamepublic	
class	TokenNameclass	
Benchmark	TokenNameIdentifier	 Benchmark
{	TokenNameLBRACE	
private	TokenNameprivate	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Algorithm	TokenNameIdentifier	 Algorithm
algorithm	TokenNameIdentifier	 algorithm
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
executed	TokenNameIdentifier	 executed
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Benchmark	TokenNameIdentifier	 Benchmark
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
algReader	TokenNameIdentifier	 alg Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// prepare run data 	TokenNameCOMMENT_LINE	prepare run data 
try	TokenNametry	
{	TokenNameLBRACE	
runData	TokenNameIdentifier	 run Data
=	TokenNameEQUAL	
new	TokenNamenew	
PerfRunData	TokenNameIdentifier	 Perf Run Data
(	TokenNameLPAREN	
new	TokenNamenew	
Config	TokenNameIdentifier	 Config
(	TokenNameLPAREN	
algReader	TokenNameIdentifier	 alg Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"Error: cannot init PerfRunData!"	TokenNameStringLiteral	Error: cannot init PerfRunData!
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// parse algorithm 	TokenNameCOMMENT_LINE	parse algorithm 
try	TokenNametry	
{	TokenNameLBRACE	
algorithm	TokenNameIdentifier	 algorithm
=	TokenNameEQUAL	
new	TokenNamenew	
Algorithm	TokenNameIdentifier	 Algorithm
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"Error: cannot understand algorithm!"	TokenNameStringLiteral	Error: cannot understand algorithm!
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Execute this benchmark */	TokenNameCOMMENT_JAVADOC	 Execute this benchmark 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
executed	TokenNameIdentifier	 executed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Benchmark was already executed"	TokenNameStringLiteral	Benchmark was already executed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
executed	TokenNameIdentifier	 executed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
setStartTimeMillis	TokenNameIdentifier	 set Start Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
algorithm	TokenNameIdentifier	 algorithm
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Run the benchmark algorithm. * @param args benchmark config and algorithm files */	TokenNameCOMMENT_JAVADOC	 Run the benchmark algorithm. @param args benchmark config and algorithm files 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility: execute benchmark from command line * @param args single argument is expected: algorithm-file */	TokenNameCOMMENT_JAVADOC	 Utility: execute benchmark from command line @param args single argument is expected: algorithm-file 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// verify command line args 	TokenNameCOMMENT_LINE	verify command line args 
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: java Benchmark <algorithm file>"	TokenNameStringLiteral	Usage: java Benchmark <algorithm file>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// verify input files 	TokenNameCOMMENT_LINE	verify input files 
File	TokenNameIdentifier	 File
algFile	TokenNameIdentifier	 alg File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
algFile	TokenNameIdentifier	 alg File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
algFile	TokenNameIdentifier	 alg File
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
algFile	TokenNameIdentifier	 alg File
.	TokenNameDOT	
canRead	TokenNameIdentifier	 can Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"cannot find/read algorithm file: "	TokenNameStringLiteral	cannot find/read algorithm file: 
+	TokenNamePLUS	
algFile	TokenNameIdentifier	 alg File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Running algorithm from: "	TokenNameStringLiteral	Running algorithm from: 
+	TokenNamePLUS	
algFile	TokenNameIdentifier	 alg File
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Benchmark	TokenNameIdentifier	 Benchmark
benchmark	TokenNameIdentifier	 benchmark
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
benchmark	TokenNameIdentifier	 benchmark
=	TokenNameEQUAL	
new	TokenNamenew	
Benchmark	TokenNameIdentifier	 Benchmark
(	TokenNameLPAREN	
new	TokenNamenew	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
algFile	TokenNameIdentifier	 alg File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"------------> algorithm:"	TokenNameStringLiteral	------------> algorithm:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
getAlgorithm	TokenNameIdentifier	 get Algorithm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// execute 	TokenNameCOMMENT_LINE	execute 
try	TokenNametry	
{	TokenNameLBRACE	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Error: cannot execute the algorithm! "	TokenNameStringLiteral	Error: cannot execute the algorithm! 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"####################"	TokenNameStringLiteral	####################
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"### D O N E !!! ###"	TokenNameStringLiteral	### D O N E !!! ###
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"####################"	TokenNameStringLiteral	####################
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the algorithm. */	TokenNameCOMMENT_JAVADOC	 @return Returns the algorithm. 
public	TokenNamepublic	
Algorithm	TokenNameIdentifier	 Algorithm
getAlgorithm	TokenNameIdentifier	 get Algorithm
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
algorithm	TokenNameIdentifier	 algorithm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the runData. */	TokenNameCOMMENT_JAVADOC	 @return Returns the runData. 
public	TokenNamepublic	
PerfRunData	TokenNameIdentifier	 Perf Run Data
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
runData	TokenNameIdentifier	 run Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
