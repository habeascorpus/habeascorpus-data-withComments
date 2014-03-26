package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This interface supplies the API for providing feedback to the user from the <code>Mojo</code>, using standard * <code>Maven</code> channels. * <br/> * There should be no big surprises here, although you may notice that the methods accept * <code>java.lang.CharSequence</code> rather than <code>java.lang.String</code>. This is provided mainly as a * convenience, to enable developers to pass things like <code>java.lang.StringBuffer</code> directly into the logger, * rather than formatting first by calling <code>toString()</code>. * * @author jdcasey */	TokenNameCOMMENT_JAVADOC	 This interface supplies the API for providing feedback to the user from the <code>Mojo</code>, using standard <code>Maven</code> channels. <br/> There should be no big surprises here, although you may notice that the methods accept <code>java.lang.CharSequence</code> rather than <code>java.lang.String</code>. This is provided mainly as a convenience, to enable developers to pass things like <code>java.lang.StringBuffer</code> directly into the logger, rather than formatting first by calling <code>toString()</code>. * @author jdcasey 
public	TokenNamepublic	
interface	TokenNameinterface	
Log	TokenNameIdentifier	 Log
{	TokenNameLBRACE	
/** * @return true if the <b>debug</b> error level is enabled */	TokenNameCOMMENT_JAVADOC	 @return true if the <b>debug</b> error level is enabled 
boolean	TokenNameboolean	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send a message to the user in the <b>debug</b> error level. * * @param content */	TokenNameCOMMENT_JAVADOC	 Send a message to the user in the <b>debug</b> error level. * @param content 
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send a message (and accompanying exception) to the user in the <b>debug</b> error level. * <br/> * The error's stacktrace will be output when this error level is enabled. * * @param content * @param error */	TokenNameCOMMENT_JAVADOC	 Send a message (and accompanying exception) to the user in the <b>debug</b> error level. <br/> The error's stacktrace will be output when this error level is enabled. * @param content @param error 
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send an exception to the user in the <b>debug</b> error level. * <br/> * The stack trace for this exception will be output when this error level is enabled. * * @param error */	TokenNameCOMMENT_JAVADOC	 Send an exception to the user in the <b>debug</b> error level. <br/> The stack trace for this exception will be output when this error level is enabled. * @param error 
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if the <b>info</b> error level is enabled */	TokenNameCOMMENT_JAVADOC	 @return true if the <b>info</b> error level is enabled 
boolean	TokenNameboolean	
isInfoEnabled	TokenNameIdentifier	 is Info Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send a message to the user in the <b>info</b> error level. * * @param content */	TokenNameCOMMENT_JAVADOC	 Send a message to the user in the <b>info</b> error level. * @param content 
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send a message (and accompanying exception) to the user in the <b>info</b> error level. * <br/> * The error's stacktrace will be output when this error level is enabled. * * @param content * @param error */	TokenNameCOMMENT_JAVADOC	 Send a message (and accompanying exception) to the user in the <b>info</b> error level. <br/> The error's stacktrace will be output when this error level is enabled. * @param content @param error 
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send an exception to the user in the <b>info</b> error level. * <br/> * The stack trace for this exception will be output when this error level is enabled. * * @param error */	TokenNameCOMMENT_JAVADOC	 Send an exception to the user in the <b>info</b> error level. <br/> The stack trace for this exception will be output when this error level is enabled. * @param error 
void	TokenNamevoid	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if the <b>warn</b> error level is enabled */	TokenNameCOMMENT_JAVADOC	 @return true if the <b>warn</b> error level is enabled 
boolean	TokenNameboolean	
isWarnEnabled	TokenNameIdentifier	 is Warn Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send a message to the user in the <b>warn</b> error level. * * @param content */	TokenNameCOMMENT_JAVADOC	 Send a message to the user in the <b>warn</b> error level. * @param content 
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send a message (and accompanying exception) to the user in the <b>warn</b> error level. * <br/> * The error's stacktrace will be output when this error level is enabled. * * @param content * @param error */	TokenNameCOMMENT_JAVADOC	 Send a message (and accompanying exception) to the user in the <b>warn</b> error level. <br/> The error's stacktrace will be output when this error level is enabled. * @param content @param error 
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send an exception to the user in the <b>warn</b> error level. * <br/> * The stack trace for this exception will be output when this error level is enabled. * * @param error */	TokenNameCOMMENT_JAVADOC	 Send an exception to the user in the <b>warn</b> error level. <br/> The stack trace for this exception will be output when this error level is enabled. * @param error 
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return true if the <b>error</b> error level is enabled */	TokenNameCOMMENT_JAVADOC	 @return true if the <b>error</b> error level is enabled 
boolean	TokenNameboolean	
isErrorEnabled	TokenNameIdentifier	 is Error Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send a message to the user in the <b>error</b> error level. * * @param content */	TokenNameCOMMENT_JAVADOC	 Send a message to the user in the <b>error</b> error level. * @param content 
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send a message (and accompanying exception) to the user in the <b>error</b> error level. * <br/> * The error's stacktrace will be output when this error level is enabled. * * @param content * @param error */	TokenNameCOMMENT_JAVADOC	 Send a message (and accompanying exception) to the user in the <b>error</b> error level. <br/> The error's stacktrace will be output when this error level is enabled. * @param content @param error 
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Send an exception to the user in the <b>error</b> error level. * <br/> * The stack trace for this exception will be output when this error level is enabled. * * @param error */	TokenNameCOMMENT_JAVADOC	 Send an exception to the user in the <b>error</b> error level. <br/> The stack trace for this exception will be output when this error level is enabled. * @param error 
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
