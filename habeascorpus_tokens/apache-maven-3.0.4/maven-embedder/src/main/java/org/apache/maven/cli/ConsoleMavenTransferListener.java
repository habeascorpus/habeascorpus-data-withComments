package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
transfer	TokenNameIdentifier	 transfer
.	TokenNameDOT	
TransferCancelledException	TokenNameIdentifier	 Transfer Cancelled Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
transfer	TokenNameIdentifier	 transfer
.	TokenNameDOT	
TransferEvent	TokenNameIdentifier	 Transfer Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
sonatype	TokenNameIdentifier	 sonatype
.	TokenNameDOT	
aether	TokenNameIdentifier	 aether
.	TokenNameDOT	
transfer	TokenNameIdentifier	 transfer
.	TokenNameDOT	
TransferResource	TokenNameIdentifier	 Transfer Resource
;	TokenNameSEMICOLON	
/** * Console download progress meter. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Console download progress meter. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
ConsoleMavenTransferListener	TokenNameIdentifier	 Console Maven Transfer Listener
extends	TokenNameextends	
AbstractMavenTransferListener	TokenNameIdentifier	 Abstract Maven Transfer Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
TransferResource	TokenNameIdentifier	 Transfer Resource
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
downloads	TokenNameIdentifier	 downloads
=	TokenNameEQUAL	
new	TokenNamenew	
ConcurrentHashMap	TokenNameIdentifier	 Concurrent Hash Map
<	TokenNameLESS	
TransferResource	TokenNameIdentifier	 Transfer Resource
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastLength	TokenNameIdentifier	 last Length
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ConsoleMavenTransferListener	TokenNameIdentifier	 Console Maven Transfer Listener
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
transferProgressed	TokenNameIdentifier	 transfer Progressed
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferCancelledException	TokenNameIdentifier	 Transfer Cancelled Exception
{	TokenNameLBRACE	
TransferResource	TokenNameIdentifier	 Transfer Resource
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
downloads	TokenNameIdentifier	 downloads
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTransferredBytes	TokenNameIdentifier	 get Transferred Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
TransferResource	TokenNameIdentifier	 Transfer Resource
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
downloads	TokenNameIdentifier	 downloads
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getContentLength	TokenNameIdentifier	 get Content Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
complete	TokenNameIdentifier	 complete
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: This null check guards against http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6312056 	TokenNameCOMMENT_LINE	NOTE: This null check guards against http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=6312056 
if	TokenNameif	
(	TokenNameLPAREN	
complete	TokenNameIdentifier	 complete
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getStatus	TokenNameIdentifier	 get Status
(	TokenNameLPAREN	
complete	TokenNameIdentifier	 complete
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
pad	TokenNameIdentifier	 pad
=	TokenNameEQUAL	
lastLength	TokenNameIdentifier	 last Length
-	TokenNameMINUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastLength	TokenNameIdentifier	 last Length
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pad	TokenNameIdentifier	 pad
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
pad	TokenNameIdentifier	 pad
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getStatus	TokenNameIdentifier	 get Status
(	TokenNameLPAREN	
long	TokenNamelong	
complete	TokenNameIdentifier	 complete
,	TokenNameCOMMA	
long	TokenNamelong	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
total	TokenNameIdentifier	 total
>=	TokenNameGREATER_EQUAL	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toKB	TokenNameIdentifier	 to KB
(	TokenNameLPAREN	
complete	TokenNameIdentifier	 complete
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
toKB	TokenNameIdentifier	 to KB
(	TokenNameLPAREN	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
+	TokenNamePLUS	
" KB "	TokenNameStringLiteral	 KB 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
total	TokenNameIdentifier	 total
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
complete	TokenNameIdentifier	 complete
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
total	TokenNameIdentifier	 total
+	TokenNamePLUS	
" B "	TokenNameStringLiteral	 B 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
complete	TokenNameIdentifier	 complete
>=	TokenNameGREATER_EQUAL	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toKB	TokenNameIdentifier	 to KB
(	TokenNameLPAREN	
complete	TokenNameIdentifier	 complete
)	TokenNameRPAREN	
+	TokenNamePLUS	
" KB "	TokenNameStringLiteral	 KB 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
complete	TokenNameIdentifier	 complete
+	TokenNamePLUS	
" B "	TokenNameStringLiteral	 B 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
pad	TokenNameIdentifier	 pad
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
spaces	TokenNameIdentifier	 spaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
block	TokenNameIdentifier	 block
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
spaces	TokenNameIdentifier	 spaces
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
spaces	TokenNameIdentifier	 spaces
,	TokenNameCOMMA	
block	TokenNameIdentifier	 block
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
block	TokenNameIdentifier	 block
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
spaces	TokenNameIdentifier	 spaces
-=	TokenNameMINUS_EQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
transferSucceeded	TokenNameIdentifier	 transfer Succeeded
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transferCompleted	TokenNameIdentifier	 transfer Completed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
transferSucceeded	TokenNameIdentifier	 transfer Succeeded
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
transferFailed	TokenNameIdentifier	 transfer Failed
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transferCompleted	TokenNameIdentifier	 transfer Completed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
transferFailed	TokenNameIdentifier	 transfer Failed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
transferCompleted	TokenNameIdentifier	 transfer Completed
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
downloads	TokenNameIdentifier	 downloads
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pad	TokenNameIdentifier	 pad
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
lastLength	TokenNameIdentifier	 last Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
