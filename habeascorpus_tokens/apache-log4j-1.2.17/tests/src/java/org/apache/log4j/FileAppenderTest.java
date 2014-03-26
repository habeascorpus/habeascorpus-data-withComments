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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
/** * * FileAppender tests. * * @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 * FileAppender tests. * @author Curt Arnold 
public	TokenNamepublic	
class	TokenNameclass	
FileAppenderTest	TokenNameIdentifier	 File Appender Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Tests that any necessary directories are attempted to * be created if they don't exist. See bug 9150. * */	TokenNameCOMMENT_JAVADOC	 Tests that any necessary directories are attempted to be created if they don't exist. See bug 9150. 
public	TokenNamepublic	
void	TokenNamevoid	
testDirectoryCreation	TokenNameIdentifier	 test Directory Creation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// known to fail on JDK 1.1 	TokenNameCOMMENT_LINE	known to fail on JDK 1.1 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.1."	TokenNameStringLiteral	1.1.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
newFile	TokenNameIdentifier	 new File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"output/newdir/temp.log"	TokenNameStringLiteral	output/newdir/temp.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newFile	TokenNameIdentifier	 new File
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
newDir	TokenNameIdentifier	 new Dir
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"output/newdir"	TokenNameStringLiteral	output/newdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newDir	TokenNameIdentifier	 new Dir
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
FileAppender	TokenNameIdentifier	 File Appender
wa	TokenNameIdentifier	 wa
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wa	TokenNameIdentifier	 wa
.	TokenNameDOT	
setFile	TokenNameIdentifier	 set File
(	TokenNameLPAREN	
"output/newdir/temp.log"	TokenNameStringLiteral	output/newdir/temp.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wa	TokenNameIdentifier	 wa
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%m%n"	TokenNameStringLiteral	%m%n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wa	TokenNameIdentifier	 wa
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"output/newdir/temp.log"	TokenNameStringLiteral	output/newdir/temp.log
)	TokenNameRPAREN	
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests that the return type of getThreshold is Priority. * @throws Exception */	TokenNameCOMMENT_JAVADOC	 Tests that the return type of getThreshold is Priority. @throws Exception 
public	TokenNamepublic	
void	TokenNamevoid	
testGetThresholdReturnType	TokenNameIdentifier	 test Get Threshold Return Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
FileAppender	TokenNameIdentifier	 File Appender
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getThreshold"	TokenNameStringLiteral	getThreshold
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
/** * Tests getThreshold and setThreshold. */	TokenNameCOMMENT_JAVADOC	 Tests getThreshold and setThreshold. 
public	TokenNamepublic	
void	TokenNamevoid	
testgetSetThreshold	TokenNameIdentifier	 testget Set Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileAppender	TokenNameIdentifier	 File Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests isAsSevereAsThreshold. */	TokenNameCOMMENT_JAVADOC	 Tests isAsSevereAsThreshold. 
public	TokenNamepublic	
void	TokenNamevoid	
testIsAsSevereAsThreshold	TokenNameIdentifier	 test Is As Severe As Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FileAppender	TokenNameIdentifier	 File Appender
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
new	TokenNamenew	
FileAppender	TokenNameIdentifier	 File Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
.	TokenNameDOT	
isAsSevereAsThreshold	TokenNameIdentifier	 is As Severe As Threshold
(	TokenNameLPAREN	
debug	TokenNameIdentifier	 debug
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
