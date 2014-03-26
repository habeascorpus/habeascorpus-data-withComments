/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * Utility class used in testing to capture errors dispatched * by appenders. * * @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 Utility class used in testing to capture errors dispatched by appenders. * @author Curt Arnold 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
implements	TokenNameimplements	
ErrorHandler	TokenNameIdentifier	 Error Handler
{	TokenNameLBRACE	
/** * Logger. */	TokenNameCOMMENT_JAVADOC	 Logger. 
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
/** * Appender. */	TokenNameCOMMENT_JAVADOC	 Appender. 
private	TokenNameprivate	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
;	TokenNameSEMICOLON	
/** * Backup appender. */	TokenNameCOMMENT_JAVADOC	 Backup appender. 
private	TokenNameprivate	
Appender	TokenNameIdentifier	 Appender
backupAppender	TokenNameIdentifier	 backup Appender
;	TokenNameSEMICOLON	
/** * Array of processed errors. */	TokenNameCOMMENT_JAVADOC	 Array of processed errors. 
private	TokenNameprivate	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
VectorErrorHandler	TokenNameIdentifier	 Vector Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
setLogger	TokenNameIdentifier	 set Logger
(	TokenNameLPAREN	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets last logger specified by setLogger. * @return logger. */	TokenNameCOMMENT_JAVADOC	 Gets last logger specified by setLogger. @return logger. 
public	TokenNamepublic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
final	TokenNamefinal	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
errorCode	TokenNameIdentifier	 error Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
final	TokenNamefinal	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
errorCode	TokenNameIdentifier	 error Code
)	TokenNameRPAREN	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets message from specified error. * * @param index index. * @return message, may be null. */	TokenNameCOMMENT_JAVADOC	 Gets message from specified error. * @param index index. @return message, may be null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets exception from specified error. * * @param index index. * @return exception. */	TokenNameCOMMENT_JAVADOC	 Gets exception from specified error. * @param index index. @return exception. 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets error code from specified error. * * @param index index. * @return error code, -1 if not specified. */	TokenNameCOMMENT_JAVADOC	 Gets error code from specified error. * @param index index. @return error code, -1 if not specified. 
public	TokenNamepublic	
int	TokenNameint	
getErrorCode	TokenNameIdentifier	 get Error Code
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets logging event from specified error. * * @param index index. * @return exception. */	TokenNameCOMMENT_JAVADOC	 Gets logging event from specified error. * @param index index. @return exception. 
public	TokenNamepublic	
LoggingEvent	TokenNameIdentifier	 Logging Event
getEvent	TokenNameIdentifier	 get Event
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets number of errors captured. * @return number of errors captured. */	TokenNameCOMMENT_JAVADOC	 Gets number of errors captured. @return number of errors captured. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
errors	TokenNameIdentifier	 errors
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
setAppender	TokenNameIdentifier	 set Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
appender	TokenNameIdentifier	 appender
=	TokenNameEQUAL	
appender	TokenNameIdentifier	 appender
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get appender. * @return appender, may be null. */	TokenNameCOMMENT_JAVADOC	 Get appender. @return appender, may be null. 
public	TokenNamepublic	
Appender	TokenNameIdentifier	 Appender
getAppender	TokenNameIdentifier	 get Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
appender	TokenNameIdentifier	 appender
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
setBackupAppender	TokenNameIdentifier	 set Backup Appender
(	TokenNameLPAREN	
final	TokenNamefinal	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
backupAppender	TokenNameIdentifier	 backup Appender
=	TokenNameEQUAL	
appender	TokenNameIdentifier	 appender
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get backup appender. * @return backup appender, may be null. */	TokenNameCOMMENT_JAVADOC	 Get backup appender. @return backup appender, may be null. 
public	TokenNamepublic	
Appender	TokenNameIdentifier	 Appender
getBackupAppender	TokenNameIdentifier	 get Backup Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
backupAppender	TokenNameIdentifier	 backup Appender
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
