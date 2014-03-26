package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Simple standalone tool that forever acquires & releases a * lock using a specific LockFactory. Run without any args * to see usage. * * @see VerifyingLockFactory * @see LockVerifyServer */	TokenNameCOMMENT_JAVADOC	 Simple standalone tool that forever acquires & releases a lock using a specific LockFactory. Run without any args to see usage. * @see VerifyingLockFactory @see LockVerifyServer 
public	TokenNamepublic	
class	TokenNameclass	
LockStressTest	TokenNameIdentifier	 Lock Stress Test
{	TokenNameLBRACE	
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
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Usage: java org.apache.lucene.store.LockStressTest myID verifierHostOrIP verifierPort lockFactoryClassName lockDirName sleepTime "	TokenNameStringLiteral	 Usage: java org.apache.lucene.store.LockStressTest myID verifierHostOrIP verifierPort lockFactoryClassName lockDirName sleepTime 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
" myID = int from 0 .. 255 (should be unique for test process) "	TokenNameStringLiteral	 myID = int from 0 .. 255 (should be unique for test process) 
+	TokenNamePLUS	
" verifierHostOrIP = host name or IP address where LockVerifyServer is running "	TokenNameStringLiteral	 verifierHostOrIP = host name or IP address where LockVerifyServer is running 
+	TokenNamePLUS	
" verifierPort = port that LockVerifyServer is listening on "	TokenNameStringLiteral	 verifierPort = port that LockVerifyServer is listening on 
+	TokenNamePLUS	
" lockFactoryClassName = primary LockFactory class that we will use "	TokenNameStringLiteral	 lockFactoryClassName = primary LockFactory class that we will use 
+	TokenNamePLUS	
" lockDirName = path to the lock directory (only set for Simple/NativeFSLockFactory "	TokenNameStringLiteral	 lockDirName = path to the lock directory (only set for Simple/NativeFSLockFactory 
+	TokenNamePLUS	
" sleepTimeMS = milliseconds to pause betweeen each lock obtain/release "	TokenNameStringLiteral	 sleepTimeMS = milliseconds to pause betweeen each lock obtain/release 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"You should run multiple instances of this process, each with its own "	TokenNameStringLiteral	You should run multiple instances of this process, each with its own 
+	TokenNamePLUS	
"unique ID, and each pointing to the same lock directory, to verify "	TokenNameStringLiteral	unique ID, and each pointing to the same lock directory, to verify 
+	TokenNamePLUS	
"that locking is working correctly. "	TokenNameStringLiteral	that locking is working correctly. 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"Make sure you are first running LockVerifyServer. "	TokenNameStringLiteral	Make sure you are first running LockVerifyServer. 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
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
final	TokenNamefinal	
int	TokenNameint	
myID	TokenNameIdentifier	 my ID
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
myID	TokenNameIdentifier	 my ID
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
myID	TokenNameIdentifier	 my ID
>	TokenNameGREATER	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"myID must be a unique int 0..255"	TokenNameStringLiteral	myID must be a unique int 0..255
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
final	TokenNamefinal	
String	TokenNameIdentifier	 String
verifierHost	TokenNameIdentifier	 verifier Host
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
verifierPort	TokenNameIdentifier	 verifier Port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lockFactoryClassName	TokenNameIdentifier	 lock Factory Class Name
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
lockDirName	TokenNameIdentifier	 lock Dir Name
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
sleepTimeMS	TokenNameIdentifier	 sleep Time MS
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LockFactory	TokenNameIdentifier	 Lock Factory
lockFactory	TokenNameIdentifier	 lock Factory
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
lockFactory	TokenNameIdentifier	 lock Factory
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
lockFactoryClassName	TokenNameIdentifier	 lock Factory Class Name
)	TokenNameRPAREN	
.	TokenNameDOT	
asSubclass	TokenNameIdentifier	 as Subclass
(	TokenNameLPAREN	
LockFactory	TokenNameIdentifier	 Lock Factory
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"IllegalAccessException when instantiating LockClass "	TokenNameStringLiteral	IllegalAccessException when instantiating LockClass 
+	TokenNamePLUS	
lockFactoryClassName	TokenNameIdentifier	 lock Factory Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"InstantiationException when instantiating LockClass "	TokenNameStringLiteral	InstantiationException when instantiating LockClass 
+	TokenNamePLUS	
lockFactoryClassName	TokenNameIdentifier	 lock Factory Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unable to cast LockClass "	TokenNameStringLiteral	unable to cast LockClass 
+	TokenNamePLUS	
lockFactoryClassName	TokenNameIdentifier	 lock Factory Class Name
+	TokenNamePLUS	
" instance to a LockFactory"	TokenNameStringLiteral	 instance to a LockFactory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"unable to find LockClass "	TokenNameStringLiteral	unable to find LockClass 
+	TokenNamePLUS	
lockFactoryClassName	TokenNameIdentifier	 lock Factory Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
lockDir	TokenNameIdentifier	 lock Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
lockDirName	TokenNameIdentifier	 lock Dir Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lockFactory	TokenNameIdentifier	 lock Factory
instanceof	TokenNameinstanceof	
FSLockFactory	TokenNameIdentifier	 FS Lock Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FSLockFactory	TokenNameIdentifier	 FS Lock Factory
)	TokenNameRPAREN	
lockFactory	TokenNameIdentifier	 lock Factory
)	TokenNameRPAREN	
.	TokenNameDOT	
setLockDir	TokenNameIdentifier	 set Lock Dir
(	TokenNameLPAREN	
lockDir	TokenNameIdentifier	 lock Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lockFactory	TokenNameIdentifier	 lock Factory
.	TokenNameDOT	
setLockPrefix	TokenNameIdentifier	 set Lock Prefix
(	TokenNameLPAREN	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LockFactory	TokenNameIdentifier	 Lock Factory
verifyLF	TokenNameIdentifier	 verify LF
=	TokenNameEQUAL	
new	TokenNamenew	
VerifyingLockFactory	TokenNameIdentifier	 Verifying Lock Factory
(	TokenNameLPAREN	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
myID	TokenNameIdentifier	 my ID
,	TokenNameCOMMA	
lockFactory	TokenNameIdentifier	 lock Factory
,	TokenNameCOMMA	
verifierHost	TokenNameIdentifier	 verifier Host
,	TokenNameCOMMA	
verifierPort	TokenNameIdentifier	 verifier Port
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Lock	TokenNameIdentifier	 Lock
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
verifyLF	TokenNameIdentifier	 verify LF
.	TokenNameDOT	
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
"test.lock"	TokenNameStringLiteral	test.lock
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
obtained	TokenNameIdentifier	 obtained
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
obtained	TokenNameIdentifier	 obtained
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
LockObtainFailedException	TokenNameIdentifier	 Lock Obtain Failed Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obtained	TokenNameIdentifier	 obtained
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"l"	TokenNameStringLiteral	l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
sleepTimeMS	TokenNameIdentifier	 sleep Time MS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
