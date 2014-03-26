/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
Reference	TokenNameIdentifier	 Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** * Test for MDC * * @author Maarten Bosteels */	TokenNameCOMMENT_JAVADOC	 Test for MDC * @author Maarten Bosteels 
public	TokenNamepublic	
class	TokenNameclass	
MDCTestCase	TokenNameIdentifier	 MDC Test Case
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPut	TokenNameIdentifier	 test Put
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
"some value"	TokenNameStringLiteral	some value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"some value"	TokenNameStringLiteral	some value
,	TokenNameCOMMA	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRemoveLastKey	TokenNameIdentifier	 test Remove Last Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
,	TokenNameCOMMA	
"some value"	TokenNameStringLiteral	some value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
"key"	TokenNameStringLiteral	key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkThreadLocalsForLeaks	TokenNameIdentifier	 check Thread Locals For Leaks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkThreadLocalsForLeaks	TokenNameIdentifier	 check Thread Locals For Leaks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// this code is heavily based on code in org.apache.catalina.loader.WebappClassLoader 	TokenNameCOMMENT_LINE	this code is heavily based on code in org.apache.catalina.loader.WebappClassLoader 
// Make the fields in the Thread class that store ThreadLocals accessible 	TokenNameCOMMENT_LINE	Make the fields in the Thread class that store ThreadLocals accessible 
Field	TokenNameIdentifier	 Field
threadLocalsField	TokenNameIdentifier	 thread Locals Field
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"threadLocals"	TokenNameStringLiteral	threadLocals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threadLocalsField	TokenNameIdentifier	 thread Locals Field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Field	TokenNameIdentifier	 Field
inheritableThreadLocalsField	TokenNameIdentifier	 inheritable Thread Locals Field
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"inheritableThreadLocals"	TokenNameStringLiteral	inheritableThreadLocals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inheritableThreadLocalsField	TokenNameIdentifier	 inheritable Thread Locals Field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make the underlying array of ThreadLoad.ThreadLocalMap.Entry objects accessible 	TokenNameCOMMENT_LINE	Make the underlying array of ThreadLoad.ThreadLocalMap.Entry objects accessible 
Class	TokenNameIdentifier	 Class
tlmClass	TokenNameIdentifier	 tlm Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"java.lang.ThreadLocal$ThreadLocalMap"	TokenNameStringLiteral	java.lang.ThreadLocal$ThreadLocalMap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Field	TokenNameIdentifier	 Field
tableField	TokenNameIdentifier	 table Field
=	TokenNameEQUAL	
tlmClass	TokenNameIdentifier	 tlm Class
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"table"	TokenNameStringLiteral	table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tableField	TokenNameIdentifier	 table Field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
thread	TokenNameIdentifier	 thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
threadLocalMap	TokenNameIdentifier	 thread Local Map
;	TokenNameSEMICOLON	
threadLocalMap	TokenNameIdentifier	 thread Local Map
=	TokenNameEQUAL	
threadLocalsField	TokenNameIdentifier	 thread Locals Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
thread	TokenNameIdentifier	 thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check the first map 	TokenNameCOMMENT_LINE	Check the first map 
checkThreadLocalMapForLeaks	TokenNameIdentifier	 check Thread Local Map For Leaks
(	TokenNameLPAREN	
threadLocalMap	TokenNameIdentifier	 thread Local Map
,	TokenNameCOMMA	
tableField	TokenNameIdentifier	 table Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check the second map 	TokenNameCOMMENT_LINE	Check the second map 
threadLocalMap	TokenNameIdentifier	 thread Local Map
=	TokenNameEQUAL	
inheritableThreadLocalsField	TokenNameIdentifier	 inheritable Thread Locals Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
thread	TokenNameIdentifier	 thread
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkThreadLocalMapForLeaks	TokenNameIdentifier	 check Thread Local Map For Leaks
(	TokenNameLPAREN	
threadLocalMap	TokenNameIdentifier	 thread Local Map
,	TokenNameCOMMA	
tableField	TokenNameIdentifier	 table Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkThreadLocalMapForLeaks	TokenNameIdentifier	 check Thread Local Map For Leaks
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
internalTableField	TokenNameIdentifier	 internal Table Field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
,	TokenNameCOMMA	
NoSuchFieldException	TokenNameIdentifier	 No Such Field Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
internalTableField	TokenNameIdentifier	 internal Table Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check the key 	TokenNameCOMMENT_LINE	Check the key 
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
)	TokenNameRPAREN	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
keyClassName	TokenNameIdentifier	 key Class Name
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Found a ThreadLocal with key of type ["	TokenNameStringLiteral	Found a ThreadLocal with key of type [
+	TokenNamePLUS	
keyClassName	TokenNameIdentifier	 key Class Name
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
