/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * Portions of this software are based upon public domain software * originally written at the National Center for Supercomputing Applications, * University of Illinois, Urbana-Champaign. */	TokenNameCOMMENT_BLOCK	 Portions of this software are based upon public domain software originally written at the National Center for Supercomputing Applications, University of Illinois, Urbana-Champaign. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
perforce	TokenNameIdentifier	 perforce
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
/** * simple implementation of P4HandlerAdapter used by tasks which are not * actually processing the output from Perforce */	TokenNameCOMMENT_JAVADOC	 simple implementation of P4HandlerAdapter used by tasks which are not actually processing the output from Perforce 
public	TokenNamepublic	
class	TokenNameclass	
SimpleP4OutputHandler	TokenNameIdentifier	 Simple P4 Output Handler
extends	TokenNameextends	
P4HandlerAdapter	TokenNameIdentifier	 P4 Handler Adapter
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
P4Base	TokenNameIdentifier	 P4 Base
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * simple constructor * @param parent a P4Base instance */	TokenNameCOMMENT_JAVADOC	 simple constructor @param parent a P4Base instance 
public	TokenNamepublic	
SimpleP4OutputHandler	TokenNameIdentifier	 Simple P4 Output Handler
(	TokenNameLPAREN	
P4Base	TokenNameIdentifier	 P4 Base
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * process one line of stderr/stdout * if error conditions are detected, then setters are called on the * parent * @param line line of output * @throws BuildException does not throw exceptions any more */	TokenNameCOMMENT_JAVADOC	 process one line of stderr/stdout if error conditions are detected, then setters are called on the parent @param line line of output @throws BuildException does not throw exceptions any more 
public	TokenNamepublic	
void	TokenNamevoid	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/^exit/"	TokenNameStringLiteral	/^exit/
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Throw exception on errors (except up-to-date) 	TokenNameCOMMENT_LINE	Throw exception on errors (except up-to-date) 
// 	TokenNameCOMMENT_LINE	 
//When a server is down, the code expects : 	TokenNameCOMMENT_LINE	When a server is down, the code expects : 
//Perforce client error: 	TokenNameCOMMENT_LINE	Perforce client error: 
//Connect to server failed; check $P4PORT. 	TokenNameCOMMENT_LINE	Connect to server failed; check $P4PORT. 
//TCP connect to localhost:1666 failed. 	TokenNameCOMMENT_LINE	TCP connect to localhost:1666 failed. 
//connect: localhost:1666: Connection refused 	TokenNameCOMMENT_LINE	connect: localhost:1666: Connection refused 
//Some forms producing commands (p4 -s change -o) do tag the output 	TokenNameCOMMENT_LINE	Some forms producing commands (p4 -s change -o) do tag the output 
//others don't..... 	TokenNameCOMMENT_LINE	others don't..... 
//Others mark errors as info, for example edit a file 	TokenNameCOMMENT_LINE	Others mark errors as info, for example edit a file 
//which is already open for edit..... 	TokenNameCOMMENT_LINE	which is already open for edit..... 
//Just look for error: - catches most things.... 	TokenNameCOMMENT_LINE	Just look for error: - catches most things.... 
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/^error:/"	TokenNameStringLiteral	/^error:/
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
||	TokenNameOR_OR	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/^Perforce client error:/"	TokenNameStringLiteral	/^Perforce client error:/
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//when running labelsync, if view elements are in sync, 	TokenNameCOMMENT_LINE	when running labelsync, if view elements are in sync, 
//Perforce produces a line of output 	TokenNameCOMMENT_LINE	Perforce produces a line of output 
//looking like this one : 	TokenNameCOMMENT_LINE	looking like this one : 
//error: //depot/file2 - label in sync. 	TokenNameCOMMENT_LINE	error: //depot/file2 - label in sync. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/label in sync/"	TokenNameStringLiteral	/label in sync/
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/up-to-date/"	TokenNameStringLiteral	/up-to-date/
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setInError	TokenNameIdentifier	 set In Error
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//sync says "error:" when a file is up-to-date 	TokenNameCOMMENT_LINE	sync says "error:" when a file is up-to-date 
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
"s/^[^:]*: //"	TokenNameStringLiteral	s/^[^:]*: //
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"/^info.*?:/"	TokenNameStringLiteral	/^info.*?:/
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//sometimes there's "info1: 	TokenNameCOMMENT_LINE	sometimes there's "info1: 
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
"s/^[^:]*: //"	TokenNameStringLiteral	s/^[^:]*: //
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getInError	TokenNameIdentifier	 get In Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
:	TokenNameCOLON	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getInError	TokenNameIdentifier	 get In Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setErrorMessage	TokenNameIdentifier	 set Error Message
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getErrorMessage	TokenNameIdentifier	 get Error Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
