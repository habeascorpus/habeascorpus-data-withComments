/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
examples	TokenNameIdentifier	 examples
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
UsingSocketAppenders	TokenNameIdentifier	 Using Socket Appenders
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
/** * This is another simple example of how to use the LogFactor5 * logging console. * * The LF5Appender is the primary class that enables logging to the * LogFactor5 logging window. If the following line is added to a properties * file, the LF5Appender will be appended to the root category when * the properties file is loaded: * * log4j.appender.A1=org.apache.log4j.lf5.LF5Appender * * To make this example work, you must ensure that the example.properties file * is in your classpath.You can then run the example at the command line. * * @author Brent Sprecher */	TokenNameCOMMENT_JAVADOC	 This is another simple example of how to use the LogFactor5 logging console. * The LF5Appender is the primary class that enables logging to the LogFactor5 logging window. If the following line is added to a properties file, the LF5Appender will be appended to the root category when the properties file is loaded: * log4j.appender.A1=org.apache.log4j.lf5.LF5Appender * To make this example work, you must ensure that the example.properties file is in your classpath.You can then run the example at the command line. * @author Brent Sprecher 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
UsingSocketAppenders	TokenNameIdentifier	 Using Socket Appenders
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger1	TokenNameIdentifier	 logger1
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
UsingSocketAppenders	TokenNameIdentifier	 Using Socket Appenders
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger2	TokenNameIdentifier	 logger2
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"TestClass.Subclass"	TokenNameStringLiteral	TestClass.Subclass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger3	TokenNameIdentifier	 logger3
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"TestClass.Subclass.Subclass"	TokenNameStringLiteral	TestClass.Subclass.Subclass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Use a PropertyConfigurator to initialize from a property file. 	TokenNameCOMMENT_LINE	Use a PropertyConfigurator to initialize from a property file. 
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
"/examples/lf5/UsingSocketAppenders/socketclient.properties"	TokenNameStringLiteral	/examples/lf5/UsingSocketAppenders/socketclient.properties
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
configFileResource	TokenNameIdentifier	 config File Resource
=	TokenNameEQUAL	
UsingSocketAppenders	TokenNameIdentifier	 Using Socket Appenders
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PropertyConfigurator	TokenNameIdentifier	 Property Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
configFileResource	TokenNameIdentifier	 config File Resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add a bunch of logging statements ... 	TokenNameCOMMENT_LINE	Add a bunch of logging statements ... 
logger1	TokenNameIdentifier	 logger1
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Homer Simpson."	TokenNameStringLiteral	Hello, my name is Homer Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger1	TokenNameIdentifier	 logger1
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Lisa Simpson."	TokenNameStringLiteral	Hello, my name is Lisa Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger2	TokenNameIdentifier	 logger2
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Marge Simpson."	TokenNameStringLiteral	Hello, my name is Marge Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger2	TokenNameIdentifier	 logger2
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Bart Simpson."	TokenNameStringLiteral	Hello, my name is Bart Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger3	TokenNameIdentifier	 logger3
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Maggie Simpson."	TokenNameStringLiteral	Hello, my name is Maggie Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger2	TokenNameIdentifier	 logger2
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"We are the Simpsons!"	TokenNameStringLiteral	We are the Simpsons!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger2	TokenNameIdentifier	 logger2
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Mmmmmm .... Chocolate."	TokenNameStringLiteral	Mmmmmm .... Chocolate.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger3	TokenNameIdentifier	 logger3
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Homer likes chocolate"	TokenNameStringLiteral	Homer likes chocolate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger3	TokenNameIdentifier	 logger3
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Doh!"	TokenNameStringLiteral	Doh!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger3	TokenNameIdentifier	 logger3
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"We are the Simpsons!"	TokenNameStringLiteral	We are the Simpsons!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger1	TokenNameIdentifier	 logger1
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Bart: I am through with working! Working is for chumps!"	TokenNameStringLiteral	Bart: I am through with working! Working is for chumps!
+	TokenNamePLUS	
"Homer: Son, I'm proud of you. I was twice your age before "	TokenNameStringLiteral	Homer: Son, I'm proud of you. I was twice your age before 
+	TokenNamePLUS	
"I figured that out."	TokenNameStringLiteral	I figured that out.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger1	TokenNameIdentifier	 logger1
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Mmm...forbidden donut."	TokenNameStringLiteral	Mmm...forbidden donut.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger1	TokenNameIdentifier	 logger1
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"D'oh! A deer! A female deer!"	TokenNameStringLiteral	D'oh! A deer! A female deer!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger1	TokenNameIdentifier	 logger1
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Truly, yours is a butt that won't quit."	TokenNameStringLiteral	Truly, yours is a butt that won't quit.
+	TokenNamePLUS	
"- Bart, writing as Woodrow to Ms. Krabappel."	TokenNameStringLiteral	- Bart, writing as Woodrow to Ms. Krabappel.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger2	TokenNameIdentifier	 logger2
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Dear Baby, Welcome to Dumpsville. Population: you."	TokenNameStringLiteral	Dear Baby, Welcome to Dumpsville. Population: you.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger2	TokenNameIdentifier	 logger2
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Dear Baby, Welcome to Dumpsville. Population: you."	TokenNameStringLiteral	Dear Baby, Welcome to Dumpsville. Population: you.
,	TokenNameCOMMA	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Dumpsville, USA"	TokenNameStringLiteral	Dumpsville, USA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger3	TokenNameIdentifier	 logger3
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Mr. Hutz, are you aware you're not wearing pants?"	TokenNameStringLiteral	Mr. Hutz, are you aware you're not wearing pants?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger3	TokenNameIdentifier	 logger3
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Mr. Hutz, are you aware you're not wearing pants?"	TokenNameStringLiteral	Mr. Hutz, are you aware you're not wearing pants?
,	TokenNameCOMMA	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Error !!"	TokenNameStringLiteral	Error !!
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger3	TokenNameIdentifier	 logger3
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"Eep."	TokenNameStringLiteral	Eep.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger3	TokenNameIdentifier	 logger3
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"Mmm...forbidden donut."	TokenNameStringLiteral	Mmm...forbidden donut.
,	TokenNameCOMMA	
new	TokenNamenew	
SecurityException	TokenNameIdentifier	 Security Exception
(	TokenNameLPAREN	
"Fatal Exception ... "	TokenNameStringLiteral	Fatal Exception ... 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger3	TokenNameIdentifier	 logger3
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"D'oh! A deer! A female deer!"	TokenNameStringLiteral	D'oh! A deer! A female deer!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger2	TokenNameIdentifier	 logger2
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"Mmmmmm .... Chocolate."	TokenNameStringLiteral	Mmmmmm .... Chocolate.
,	TokenNameCOMMA	
new	TokenNamenew	
SecurityException	TokenNameIdentifier	 Security Exception
(	TokenNameLPAREN	
"Fatal Exception"	TokenNameStringLiteral	Fatal Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Put the main thread is put to sleep for 5 seconds to allow the 	TokenNameCOMMENT_LINE	Put the main thread is put to sleep for 5 seconds to allow the 
// SocketServer to process all incoming messages before the Socket is 	TokenNameCOMMENT_LINE	SocketServer to process all incoming messages before the Socket is 
// closed. This is done to overcome some basic limitations with the 	TokenNameCOMMENT_LINE	closed. This is done to overcome some basic limitations with the 
// way the SocketServer and SocketAppender classes manage sockets. 	TokenNameCOMMENT_LINE	way the SocketServer and SocketAppender classes manage sockets. 
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
5000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
