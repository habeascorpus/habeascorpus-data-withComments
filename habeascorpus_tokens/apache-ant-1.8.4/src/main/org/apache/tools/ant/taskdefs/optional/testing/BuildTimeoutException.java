/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
testing	TokenNameIdentifier	 testing
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
Location	TokenNameIdentifier	 Location
;	TokenNameSEMICOLON	
/** * * This exception is used to indicate timeouts. * @since Ant1.8 * */	TokenNameCOMMENT_JAVADOC	 * This exception is used to indicate timeouts. @since Ant1.8 
public	TokenNamepublic	
class	TokenNameclass	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
extends	TokenNameextends	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8057644603246297562L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructs a build exception with no descriptive information. */	TokenNameCOMMENT_JAVADOC	 Constructs a build exception with no descriptive information. 
public	TokenNamepublic	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs an exception with the given descriptive message. * * @param message A description of or information about the exception. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given descriptive message. * @param message A description of or information about the exception. Should not be <code>null</code>. 
public	TokenNamepublic	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an exception with the given message and exception as * a root cause. * * @param message A description of or information about the exception. * Should not be <code>null</code> unless a cause is specified. * @param cause The exception that might have caused this one. * May be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given message and exception as a root cause. * @param message A description of or information about the exception. Should not be <code>null</code> unless a cause is specified. @param cause The exception that might have caused this one. May be <code>null</code>. 
public	TokenNamepublic	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an exception with the given message and exception as * a root cause and a location in a file. * * @param msg A description of or information about the exception. * Should not be <code>null</code> unless a cause is specified. * @param cause The exception that might have caused this one. * May be <code>null</code>. * @param location The location in the project file where the error * occurred. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given message and exception as a root cause and a location in a file. * @param msg A description of or information about the exception. Should not be <code>null</code> unless a cause is specified. @param cause The exception that might have caused this one. May be <code>null</code>. @param location The location in the project file where the error occurred. Must not be <code>null</code>. 
public	TokenNamepublic	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an exception with the given exception as a root cause. * * @param cause The exception that might have caused this one. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given exception as a root cause. * @param cause The exception that might have caused this one. Should not be <code>null</code>. 
public	TokenNamepublic	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an exception with the given descriptive message and a * location in a file. * * @param message A description of or information about the exception. * Should not be <code>null</code>. * @param location The location in the project file where the error * occurred. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given descriptive message and a location in a file. * @param message A description of or information about the exception. Should not be <code>null</code>. @param location The location in the project file where the error occurred. Must not be <code>null</code>. 
public	TokenNamepublic	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
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
}	TokenNameRBRACE	
/** * Constructs an exception with the given exception as * a root cause and a location in a file. * * @param cause The exception that might have caused this one. * Should not be <code>null</code>. * @param location The location in the project file where the error * occurred. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given exception as a root cause and a location in a file. * @param cause The exception that might have caused this one. Should not be <code>null</code>. @param location The location in the project file where the error occurred. Must not be <code>null</code>. 
public	TokenNamepublic	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
