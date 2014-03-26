/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
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
/** SyslogQuietWriter extends QuietWriter by prepending the syslog level code before each printed String. @since 0.7.3 */	TokenNameCOMMENT_JAVADOC	 SyslogQuietWriter extends QuietWriter by prepending the syslog level code before each printed String. @since 0.7.3 
public	TokenNamepublic	
class	TokenNameclass	
SyslogQuietWriter	TokenNameIdentifier	 Syslog Quiet Writer
extends	TokenNameextends	
QuietWriter	TokenNameIdentifier	 Quiet Writer
{	TokenNameLBRACE	
int	TokenNameint	
syslogFacility	TokenNameIdentifier	 syslog Facility
;	TokenNameSEMICOLON	
int	TokenNameint	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SyslogQuietWriter	TokenNameIdentifier	 Syslog Quiet Writer
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
int	TokenNameint	
syslogFacility	TokenNameIdentifier	 syslog Facility
,	TokenNameCOMMA	
ErrorHandler	TokenNameIdentifier	 Error Handler
eh	TokenNameIdentifier	 eh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
eh	TokenNameIdentifier	 eh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
syslogFacility	TokenNameIdentifier	 syslog Facility
=	TokenNameEQUAL	
syslogFacility	TokenNameIdentifier	 syslog Facility
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSyslogFacility	TokenNameIdentifier	 set Syslog Facility
(	TokenNameLPAREN	
int	TokenNameint	
syslogFacility	TokenNameIdentifier	 syslog Facility
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
syslogFacility	TokenNameIdentifier	 syslog Facility
=	TokenNameEQUAL	
syslogFacility	TokenNameIdentifier	 syslog Facility
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
(	TokenNameLPAREN	
syslogFacility	TokenNameIdentifier	 syslog Facility
|	TokenNameOR	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
+	TokenNamePLUS	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
