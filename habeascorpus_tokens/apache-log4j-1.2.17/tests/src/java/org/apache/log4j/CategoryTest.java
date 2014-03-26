/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
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
/** * Tests of Category. * * @author Curt Arnold * @since 1.2.14 */	TokenNameCOMMENT_JAVADOC	 Tests of Category. * @author Curt Arnold @since 1.2.14 
public	TokenNamepublic	
class	TokenNameclass	
CategoryTest	TokenNameIdentifier	 Category Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Constructs new instance of test. * @param name test name. */	TokenNameCOMMENT_JAVADOC	 Constructs new instance of test. @param name test name. 
public	TokenNamepublic	
CategoryTest	TokenNameIdentifier	 Category Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests Category.forcedLog. */	TokenNameCOMMENT_JAVADOC	 Tests Category.forcedLog. 
public	TokenNamepublic	
void	TokenNamevoid	
testForcedLog	TokenNameIdentifier	 test Forced Log
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MockCategory	TokenNameIdentifier	 Mock Category
category	TokenNameIdentifier	 category
=	TokenNameEQUAL	
new	TokenNamenew	
MockCategory	TokenNameIdentifier	 Mock Category
(	TokenNameLPAREN	
"org.example.foo"	TokenNameStringLiteral	org.example.foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
category	TokenNameIdentifier	 category
.	TokenNameDOT	
setAdditivity	TokenNameIdentifier	 set Additivity
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
category	TokenNameIdentifier	 category
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
new	TokenNamenew	
VectorAppender	TokenNameIdentifier	 Vector Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
category	TokenNameIdentifier	 category
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Hello, World"	TokenNameStringLiteral	Hello, World
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests that the return type of getChainedPriority is Priority. * @throws Exception thrown if Category.getChainedPriority can not be found. */	TokenNameCOMMENT_JAVADOC	 Tests that the return type of getChainedPriority is Priority. @throws Exception thrown if Category.getChainedPriority can not be found. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetChainedPriorityReturnType	TokenNameIdentifier	 test Get Chained Priority Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getChainedPriority"	TokenNameStringLiteral	getChainedPriority
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
getReturnType	TokenNameIdentifier	 get Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests l7dlog(Priority, String, Throwable). */	TokenNameCOMMENT_JAVADOC	 Tests l7dlog(Priority, String, Throwable). 
public	TokenNamepublic	
void	TokenNamevoid	
testL7dlog	TokenNameIdentifier	 test L7dlog
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.example.foo"	TokenNameStringLiteral	org.example.foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
l7dlog	TokenNameIdentifier	 l7dlog
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests l7dlog(Priority, String, Object[], Throwable). */	TokenNameCOMMENT_JAVADOC	 Tests l7dlog(Priority, String, Object[], Throwable). 
public	TokenNamepublic	
void	TokenNamevoid	
testL7dlog4Param	TokenNameIdentifier	 test L7dlog4 Param
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.example.foo"	TokenNameStringLiteral	org.example.foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
l7dlog	TokenNameIdentifier	 l7dlog
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests setPriority(Priority). * @deprecated */	TokenNameCOMMENT_JAVADOC	 Tests setPriority(Priority). @deprecated 
public	TokenNamepublic	
void	TokenNamevoid	
testSetPriority	TokenNameIdentifier	 test Set Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.example.foo"	TokenNameStringLiteral	org.example.foo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Derived category to check method signature of forcedLog. */	TokenNameCOMMENT_JAVADOC	 Derived category to check method signature of forcedLog. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MockCategory	TokenNameIdentifier	 Mock Category
extends	TokenNameextends	
Logger	TokenNameIdentifier	 Logger
{	TokenNameLBRACE	
/** * Create new instance of MockCategory. * @param name category name */	TokenNameCOMMENT_JAVADOC	 Create new instance of MockCategory. @param name category name 
public	TokenNamepublic	
MockCategory	TokenNameIdentifier	 Mock Category
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
new	TokenNamenew	
Hierarchy	TokenNameIdentifier	 Hierarchy
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Request an info level message. * @param msg message */	TokenNameCOMMENT_JAVADOC	 Request an info level message. @param msg message 
public	TokenNamepublic	
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Priority	TokenNameIdentifier	 Priority
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
;	TokenNameSEMICOLON	
forcedLog	TokenNameIdentifier	 forced Log
(	TokenNameLPAREN	
MockCategory	TokenNameIdentifier	 Mock Category
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
