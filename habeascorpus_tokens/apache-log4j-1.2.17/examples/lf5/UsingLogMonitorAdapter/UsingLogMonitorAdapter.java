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
/** * This class is a simple example of how use the LogMonitorAdapter to * bypass the Log4JAppender and post LogRecords directly to the LogMonitor * * To make this example work, ensure that the lf5.jar and lf5-license.jar * files are in your classpath, and then run the example at the command line. * * @author Richard Hurst */	TokenNameCOMMENT_JAVADOC	 This class is a simple example of how use the LogMonitorAdapter to bypass the Log4JAppender and post LogRecords directly to the LogMonitor * To make this example work, ensure that the lf5.jar and lf5-license.jar files are in your classpath, and then run the example at the command line. * @author Richard Hurst 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
UsingLogMonitorAdapter	TokenNameIdentifier	 Using Log Monitor Adapter
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
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
_adapter	TokenNameIdentifier	 adapter
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
_adapter	TokenNameIdentifier	 adapter
=	TokenNameEQUAL	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
LogMonitorAdapter	TokenNameIdentifier	 Log Monitor Adapter
.	TokenNameDOT	
LOG4J_LOG_LEVELS	TokenNameIdentifier	 LO G4 J  LOG  LEVELS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
UsingLogMonitorAdapter	TokenNameIdentifier	 Using Log Monitor Adapter
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
new	TokenNamenew	
UsingLogMonitorAdapter	TokenNameIdentifier	 Using Log Monitor Adapter
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
String	TokenNameIdentifier	 String
logger	TokenNameIdentifier	 logger
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
// will default to debug log level 	TokenNameCOMMENT_LINE	will default to debug log level 
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
"Doh this is a debugging"	TokenNameStringLiteral	Doh this is a debugging
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
"Hmmm fobidden doughnut"	TokenNameStringLiteral	Hmmm fobidden doughnut
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
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
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Exit stage right->"	TokenNameStringLiteral	Exit stage right->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_adapter	TokenNameIdentifier	 adapter
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
LogLevel	TokenNameIdentifier	 Log Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
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
