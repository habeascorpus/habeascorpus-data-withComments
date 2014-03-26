/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
examples	TokenNameIdentifier	 examples
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
UsingLogMonitorAdapter	TokenNameIdentifier	 Using Log Monitor Adapter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
LogLevel	TokenNameIdentifier	 Log Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
;	TokenNameSEMICOLON	
/** * This class is a simple example of how use the LogMonitorAdapter to * bypass the Log4JAppender and post LogRecords directly to the LogMonitor * using customized LogLevels * * To make this example work, ensure that the lf5.jar and lf5-license.jar * files are in your classpath, and then run the example at the command line. * * @author Richard Hurst */	TokenNameCOMMENT_JAVADOC	 This class is a simple example of how use the LogMonitorAdapter to bypass the Log4JAppender and post LogRecords directly to the LogMonitor using customized LogLevels * To make this example work, ensure that the lf5.jar and lf5-license.jar files are in your classpath, and then run the example at the command line. * @author Richard Hurst 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
CustomizedLogLevels	TokenNameIdentifier	 Customized Log Levels
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
LEVEL_ONE	TokenNameIdentifier	 LEVEL  ONE
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"LEVEL 1"	TokenNameStringLiteral	LEVEL 1
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
LEVEL_TWO	TokenNameIdentifier	 LEVEL  TWO
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"LEVEL 2"	TokenNameStringLiteral	LEVEL 2
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
LEVEL_THREE	TokenNameIdentifier	 LEVEL  THREE
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"LEVEL 3"	TokenNameStringLiteral	LEVEL 3
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
LEVEL_FOUR	TokenNameIdentifier	 LEVEL  FOUR
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"LEVEL 4"	TokenNameStringLiteral	LEVEL 4
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
LogLevel	TokenNameIdentifier	 Log Level
DEFAULT	TokenNameIdentifier	 DEFAULT
=	TokenNameEQUAL	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
(	TokenNameLPAREN	
"DEFAULT"	TokenNameStringLiteral	DEFAULT
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
static	TokenNamestatic	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
_adapter	TokenNameIdentifier	 adapter
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// The first LogLevel in the Array will be used as the default LogLevel. 	TokenNameCOMMENT_LINE	The first LogLevel in the Array will be used as the default LogLevel. 
_adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
new	TokenNamenew	
LogLevel	TokenNameIdentifier	 Log Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
DEFAULT	TokenNameIdentifier	 DEFAULT
,	TokenNameCOMMA	
LEVEL_ONE	TokenNameIdentifier	 LEVEL  ONE
,	TokenNameCOMMA	
LEVEL_TWO	TokenNameIdentifier	 LEVEL  TWO
,	TokenNameCOMMA	
LEVEL_THREE	TokenNameIdentifier	 LEVEL  THREE
,	TokenNameCOMMA	
LEVEL_FOUR	TokenNameIdentifier	 LEVEL  FOUR
,	TokenNameCOMMA	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if a different log level is to be used it can be specified as such 	TokenNameCOMMENT_LINE	if a different log level is to be used it can be specified as such 
// _adapter.setDefaultLevel(LEVEL_THREE); 	TokenNameCOMMENT_LINE	_adapter.setDefaultLevel(LEVEL_THREE); 
}	TokenNameRBRACE	
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CustomizedLogLevels	TokenNameIdentifier	 Customized Log Levels
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
new	TokenNamenew	
CustomizedLogLevels	TokenNameIdentifier	 Customized Log Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
doMyBidding	TokenNameIdentifier	 do My Bidding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
doMyBidding	TokenNameIdentifier	 do My Bidding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// tell the LogMonitorAdapter which LogLevel is the severe Level if necessary 	TokenNameCOMMENT_LINE	tell the LogMonitorAdapter which LogLevel is the severe Level if necessary 
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
setSevereLevel	TokenNameIdentifier	 set Severe Level
(	TokenNameLPAREN	
LEVEL_ONE	TokenNameIdentifier	 LEVEL  ONE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
levels	TokenNameIdentifier	 levels
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// will used the default Level 	TokenNameCOMMENT_LINE	will used the default Level 
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
,	TokenNameCOMMA	
"Using the customized LogLevels"	TokenNameStringLiteral	Using the customized LogLevels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
,	TokenNameCOMMA	
LEVEL_FOUR	TokenNameIdentifier	 LEVEL  FOUR
,	TokenNameCOMMA	
"This is a test"	TokenNameStringLiteral	This is a test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
,	TokenNameCOMMA	
LEVEL_THREE	TokenNameIdentifier	 LEVEL  THREE
,	TokenNameCOMMA	
"Hmmm fobidden doughnut"	TokenNameStringLiteral	Hmmm fobidden doughnut
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
,	TokenNameCOMMA	
LEVEL_ONE	TokenNameIdentifier	 LEVEL  ONE
,	TokenNameCOMMA	
"Danger Danger Will Robinson"	TokenNameStringLiteral	Danger Danger Will Robinson
,	TokenNameCOMMA	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"DANGER"	TokenNameStringLiteral	DANGER
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"32"	TokenNameStringLiteral	32
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
,	TokenNameCOMMA	
LEVEL_TWO	TokenNameIdentifier	 LEVEL  TWO
,	TokenNameCOMMA	
"Exit stage right->"	TokenNameStringLiteral	Exit stage right->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
,	TokenNameCOMMA	
LEVEL_FOUR	TokenNameIdentifier	 LEVEL  FOUR
,	TokenNameCOMMA	
"What's up Doc?"	TokenNameStringLiteral	What's up Doc?
,	TokenNameCOMMA	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"Unfortunate exception"	TokenNameStringLiteral	Unfortunate exception
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
