/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
examples	TokenNameIdentifier	 examples
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
InitUsingLog4JProperties	TokenNameIdentifier	 Init Using Log4 J Properties
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * This class is a simple example of how to use the LogFactor5 logging * window. * * The LF5Appender is the primary class that enables logging to the * LogFactor5 logging window. The simplest method of using this Appender * is to add the following line to your log4j.properties file: * * log4j.appender.A1=org.apache.log4j.lf5.LF5Appender * * The log4j.properties file MUST be in you system classpath. If this file * is in your system classpath, a static initializer in the Category class * will load the file during class initialization. The LF5Appender will be * added to the root category of the Category tree. * * Create a log4j.properties file and add this line to it, or add this line * to your existing log4j.properties file. Run the example at the command line * and explore the results! * * @author Brent Sprecher */	TokenNameCOMMENT_JAVADOC	 This class is a simple example of how to use the LogFactor5 logging window. * The LF5Appender is the primary class that enables logging to the LogFactor5 logging window. The simplest method of using this Appender is to add the following line to your log4j.properties file: * log4j.appender.A1=org.apache.log4j.lf5.LF5Appender * The log4j.properties file MUST be in you system classpath. If this file is in your system classpath, a static initializer in the Category class will load the file during class initialization. The LF5Appender will be added to the root category of the Category tree. * Create a log4j.properties file and add this line to it, or add this line to your existing log4j.properties file. Run the example at the command line and explore the results! * @author Brent Sprecher 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
InitUsingLog4JProperties	TokenNameIdentifier	 Init Using Log4 J Properties
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
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
InitUsingLog4JProperties	TokenNameIdentifier	 Init Using Log4 J Properties
.	TokenNameDOT	
class	TokenNameclass	
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
// Add a bunch of logging statements ... 	TokenNameCOMMENT_LINE	Add a bunch of logging statements ... 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Homer Simpson."	TokenNameStringLiteral	Hello, my name is Homer Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Lisa Simpson."	TokenNameStringLiteral	Hello, my name is Lisa Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Marge Simpson."	TokenNameStringLiteral	Hello, my name is Marge Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Bart Simpson."	TokenNameStringLiteral	Hello, my name is Bart Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Hello, my name is Maggie Simpson."	TokenNameStringLiteral	Hello, my name is Maggie Simpson.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"We are the Simpsons!"	TokenNameStringLiteral	We are the Simpsons!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Mmmmmm .... Chocolate."	TokenNameStringLiteral	Mmmmmm .... Chocolate.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Homer likes chocolate"	TokenNameStringLiteral	Homer likes chocolate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Doh!"	TokenNameStringLiteral	Doh!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"We are the Simpsons!"	TokenNameStringLiteral	We are the Simpsons!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Mmm...forbidden donut."	TokenNameStringLiteral	Mmm...forbidden donut.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"D'oh! A deer! A female deer!"	TokenNameStringLiteral	D'oh! A deer! A female deer!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Truly, yours is a butt that won't quit."	TokenNameStringLiteral	Truly, yours is a butt that won't quit.
+	TokenNamePLUS	
"- Bart, writing as Woodrow to Ms. Krabappel."	TokenNameStringLiteral	- Bart, writing as Woodrow to Ms. Krabappel.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Dear Baby, Welcome to Dumpsville. Population: you."	TokenNameStringLiteral	Dear Baby, Welcome to Dumpsville. Population: you.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Mr. Hutz, are you aware you're not wearing pants?"	TokenNameStringLiteral	Mr. Hutz, are you aware you're not wearing pants?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
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
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"Eep."	TokenNameStringLiteral	Eep.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"Mmm...forbidden donut."	TokenNameStringLiteral	Mmm...forbidden donut.
,	TokenNameCOMMA	
new	TokenNamenew	
SecurityException	TokenNameIdentifier	 Security Exception
(	TokenNameLPAREN	
"Fatal Exception"	TokenNameStringLiteral	Fatal Exception
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"D'oh! A deer! A female deer!"	TokenNameStringLiteral	D'oh! A deer! A female deer!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
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
