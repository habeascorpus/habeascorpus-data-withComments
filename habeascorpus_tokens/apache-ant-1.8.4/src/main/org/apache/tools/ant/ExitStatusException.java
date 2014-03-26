/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
/** * BuildException + exit status. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 BuildException + exit status. * @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
ExitStatusException	TokenNameIdentifier	 Exit Status Exception
extends	TokenNameextends	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
7760846806886585968L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Status code */	TokenNameCOMMENT_JAVADOC	 Status code 
private	TokenNameprivate	
int	TokenNameint	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
/** * Constructs an <code>ExitStatusException</code>. * @param status the associated status code */	TokenNameCOMMENT_JAVADOC	 Constructs an <code>ExitStatusException</code>. @param status the associated status code 
public	TokenNamepublic	
ExitStatusException	TokenNameIdentifier	 Exit Status Exception
(	TokenNameLPAREN	
int	TokenNameint	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an <code>ExitStatusException</code>. * @param msg the associated message * @param status the associated status code */	TokenNameCOMMENT_JAVADOC	 Constructs an <code>ExitStatusException</code>. @param msg the associated message @param status the associated status code 
public	TokenNamepublic	
ExitStatusException	TokenNameIdentifier	 Exit Status Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
int	TokenNameint	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an exit status exception with location information too * @param message error message * @param status exit status * @param location exit location */	TokenNameCOMMENT_JAVADOC	 Construct an exit status exception with location information too @param message error message @param status exit status @param location exit location 
public	TokenNamepublic	
ExitStatusException	TokenNameIdentifier	 Exit Status Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
int	TokenNameint	
status	TokenNameIdentifier	 status
,	TokenNameCOMMA	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the status code. * @return <code>int</code> */	TokenNameCOMMENT_JAVADOC	 Get the status code. @return <code>int</code> 
public	TokenNamepublic	
int	TokenNameint	
getStatus	TokenNameIdentifier	 get Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
