package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * @since 3.0 * @author Kristian Rosenvold * <p/> * NOTE: This class is not part of any public api and can be changed or deleted without prior notice. * This class in particular may spontaneusly self-combust and be replaced by a plexus-compliant thread aware * logger implementation at any time. */	TokenNameCOMMENT_JAVADOC	 @since 3.0 @author Kristian Rosenvold <p/> NOTE: This class is not part of any public api and can be changed or deleted without prior notice. This class in particular may spontaneusly self-combust and be replaced by a plexus-compliant thread aware logger implementation at any time. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"SynchronizationOnLocalVariableOrMethodParameter"	TokenNameStringLiteral	SynchronizationOnLocalVariableOrMethodParameter
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
ThreadOutputMuxer	TokenNameIdentifier	 Thread Output Muxer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
projects	TokenNameIdentifier	 projects
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
projectBuildThreadLocal	TokenNameIdentifier	 project Build Thread Local
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
,	TokenNameCOMMA	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
>	TokenNameGREATER	
streams	TokenNameIdentifier	 streams
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
,	TokenNameCOMMA	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
,	TokenNameCOMMA	
PrintStream	TokenNameIdentifier	 Print Stream
>	TokenNameGREATER	
printStreams	TokenNameIdentifier	 print Streams
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
,	TokenNameCOMMA	
PrintStream	TokenNameIdentifier	 Print Stream
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
defaultOutputStreamForUnknownData	TokenNameIdentifier	 default Output Stream For Unknown Data
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
defaultPringStream	TokenNameIdentifier	 default Pring Stream
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
defaultOutputStreamForUnknownData	TokenNameIdentifier	 default Output Stream For Unknown Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
completedBuilds	TokenNameIdentifier	 completed Builds
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
ProjectSegment	TokenNameIdentifier	 Project Segment
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
volatile	TokenNamevolatile	
ProjectSegment	TokenNameIdentifier	 Project Segment
currentBuild	TokenNameIdentifier	 current Build
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
originalSystemOUtStream	TokenNameIdentifier	 original System O Ut Stream
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ConsolePrinter	TokenNameIdentifier	 Console Printer
printer	TokenNameIdentifier	 printer
;	TokenNameSEMICOLON	
/** * A simple but safe solution for printing to the console. */	TokenNameCOMMENT_JAVADOC	 A simple but safe solution for printing to the console. 
class	TokenNameclass	
ConsolePrinter	TokenNameIdentifier	 Console Printer
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
public	TokenNamepublic	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
running	TokenNameIdentifier	 running
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ProjectBuildList	TokenNameIdentifier	 Project Build List
projectBuildList	TokenNameIdentifier	 project Build List
;	TokenNameSEMICOLON	
ConsolePrinter	TokenNameIdentifier	 Console Printer
(	TokenNameLPAREN	
ProjectBuildList	TokenNameIdentifier	 Project Build List
projectBuildList	TokenNameIdentifier	 project Build List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
projectBuildList	TokenNameIdentifier	 project Build List
=	TokenNameEQUAL	
projectBuildList	TokenNameIdentifier	 project Build List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
running	TokenNameIdentifier	 running
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
:	TokenNameCOLON	
projectBuildList	TokenNameIdentifier	 project Build List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
projectStream	TokenNameIdentifier	 project Stream
=	TokenNameEQUAL	
printStreams	TokenNameIdentifier	 print Streams
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
projectOs	TokenNameIdentifier	 project Os
=	TokenNameEQUAL	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
projectStream	TokenNameIdentifier	 project Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
projectStream	TokenNameIdentifier	 project Stream
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
projectOs	TokenNameIdentifier	 project Os
.	TokenNameDOT	
writeTo	TokenNameIdentifier	 write To
(	TokenNameLPAREN	
originalSystemOUtStream	TokenNameIdentifier	 original System O Ut Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
projectOs	TokenNameIdentifier	 project Os
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
completedBuilds	TokenNameIdentifier	 completed Builds
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
running	TokenNameIdentifier	 running
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Wait until we are sure the print-stream thread is running. */	TokenNameCOMMENT_BLOCK	 Wait until we are sure the print-stream thread is running. 
public	TokenNamepublic	
void	TokenNamevoid	
waitUntilRunning	TokenNameIdentifier	 wait Until Running
(	TokenNameLPAREN	
boolean	TokenNameboolean	
expect	TokenNameIdentifier	 expect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
running	TokenNameIdentifier	 running
==	TokenNameEQUAL_EQUAL	
expect	TokenNameIdentifier	 expect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ThreadOutputMuxer	TokenNameIdentifier	 Thread Output Muxer
(	TokenNameLPAREN	
ProjectBuildList	TokenNameIdentifier	 Project Build List
segmentChunks	TokenNameIdentifier	 segment Chunks
,	TokenNameCOMMA	
PrintStream	TokenNameIdentifier	 Print Stream
originalSystemOut	TokenNameIdentifier	 original System Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
projects	TokenNameIdentifier	 projects
=	TokenNameEQUAL	
segmentChunks	TokenNameIdentifier	 segment Chunks
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
segmentChunk	TokenNameIdentifier	 segment Chunk
:	TokenNameCOLON	
segmentChunks	TokenNameIdentifier	 segment Chunks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
streams	TokenNameIdentifier	 streams
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
segmentChunk	TokenNameIdentifier	 segment Chunk
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printStreams	TokenNameIdentifier	 print Streams
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
segmentChunk	TokenNameIdentifier	 segment Chunk
,	TokenNameCOMMA	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalSystemOUtStream	TokenNameIdentifier	 original System O Ut Stream
=	TokenNameEQUAL	
originalSystemOut	TokenNameIdentifier	 original System Out
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
new	TokenNamenew	
ThreadBoundPrintStream	TokenNameIdentifier	 Thread Bound Print Stream
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
originalSystemOUtStream	TokenNameIdentifier	 original System O Ut Stream
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printer	TokenNameIdentifier	 printer
=	TokenNameEQUAL	
new	TokenNamenew	
ConsolePrinter	TokenNameIdentifier	 Console Printer
(	TokenNameLPAREN	
segmentChunks	TokenNameIdentifier	 segment Chunks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
printer	TokenNameIdentifier	 printer
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
waitUntilRunning	TokenNameIdentifier	 wait Until Running
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printer	TokenNameIdentifier	 printer
.	TokenNameDOT	
waitUntilRunning	TokenNameIdentifier	 wait Until Running
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setOut	TokenNameIdentifier	 set Out
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
originalSystemOUtStream	TokenNameIdentifier	 original System O Ut Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentBuild	TokenNameIdentifier	 current Build
=	TokenNameEQUAL	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
projects	TokenNameIdentifier	 projects
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
ownsRealOutputStream	TokenNameIdentifier	 owns Real Output Stream
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
projectBuild	TokenNameIdentifier	 project Build
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
currentBuild	TokenNameIdentifier	 current Build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
PrintStream	TokenNameIdentifier	 Print Stream
getThreadBoundPrintStream	TokenNameIdentifier	 get Thread Bound Print Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProjectSegment	TokenNameIdentifier	 Project Segment
threadProject	TokenNameIdentifier	 thread Project
=	TokenNameEQUAL	
projectBuildThreadLocal	TokenNameIdentifier	 project Build Thread Local
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
threadProject	TokenNameIdentifier	 thread Project
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultPringStream	TokenNameIdentifier	 default Pring Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ownsRealOutputStream	TokenNameIdentifier	 owns Real Output Stream
(	TokenNameLPAREN	
threadProject	TokenNameIdentifier	 thread Project
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originalSystemOUtStream	TokenNameIdentifier	 original System O Ut Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
printStreams	TokenNameIdentifier	 print Streams
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
threadProject	TokenNameIdentifier	 thread Project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
associateThreadWithProjectSegment	TokenNameIdentifier	 associate Thread With Project Segment
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
{	TokenNameLBRACE	
projectBuildThreadLocal	TokenNameIdentifier	 project Build Thread Local
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setThisModuleComplete	TokenNameIdentifier	 set This Module Complete
(	TokenNameLPAREN	
ProjectSegment	TokenNameIdentifier	 Project Segment
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
{	TokenNameLBRACE	
completedBuilds	TokenNameIdentifier	 completed Builds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
printStreams	TokenNameIdentifier	 print Streams
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
projectBuild	TokenNameIdentifier	 project Build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
disconnectThreadFromProject	TokenNameIdentifier	 disconnect Thread From Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
disconnectThreadFromProject	TokenNameIdentifier	 disconnect Thread From Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
projectBuildThreadLocal	TokenNameIdentifier	 project Build Thread Local
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
ThreadBoundPrintStream	TokenNameIdentifier	 Thread Bound Print Stream
extends	TokenNameextends	
PrintStream	TokenNameIdentifier	 Print Stream
{	TokenNameLBRACE	
public	TokenNamepublic	
ThreadBoundPrintStream	TokenNameIdentifier	 Thread Bound Print Stream
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
systemOutStream	TokenNameIdentifier	 system Out Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
systemOutStream	TokenNameIdentifier	 system Out Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
PrintStream	TokenNameIdentifier	 Print Stream
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getThreadBoundPrintStream	TokenNameIdentifier	 get Thread Bound Print Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
char	TokenNamechar	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
long	TokenNamelong	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
long	TokenNamelong	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
boolean	TokenNameboolean	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
char	TokenNamechar	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
char	TokenNamechar	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
PrintStream	TokenNameIdentifier	 Print Stream
currentStream	TokenNameIdentifier	 current Stream
=	TokenNameEQUAL	
getOutputStreamForCurrentThread	TokenNameIdentifier	 get Output Stream For Current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
currentStream	TokenNameIdentifier	 current Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentStream	TokenNameIdentifier	 current Stream
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
