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
/** * Signals an error condition during a build */	TokenNameCOMMENT_JAVADOC	 Signals an error condition during a build 
public	TokenNamepublic	
class	TokenNameclass	
BuildException	TokenNameIdentifier	 Build Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5419014565354664240L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Location in the build file where the exception occurred */	TokenNameCOMMENT_JAVADOC	 Location in the build file where the exception occurred 
private	TokenNameprivate	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
Location	TokenNameIdentifier	 Location
.	TokenNameDOT	
UNKNOWN_LOCATION	TokenNameIdentifier	 UNKNOWN  LOCATION
;	TokenNameSEMICOLON	
/** * Constructs a build exception with no descriptive information. */	TokenNameCOMMENT_JAVADOC	 Constructs a build exception with no descriptive information. 
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an exception with the given descriptive message. * * @param message A description of or information about the exception. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given descriptive message. * @param message A description of or information about the exception. Should not be <code>null</code>. 
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
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
BuildException	TokenNameIdentifier	 Build Exception
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an exception with the given message and exception as * a root cause and a location in a file. * * @param msg A description of or information about the exception. * Should not be <code>null</code> unless a cause is specified. * @param cause The exception that might have caused this one. * May be <code>null</code>. * @param location The location in the project file where the error * occurred. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given message and exception as a root cause and a location in a file. * @param msg A description of or information about the exception. Should not be <code>null</code> unless a cause is specified. @param cause The exception that might have caused this one. May be <code>null</code>. @param location The location in the project file where the error occurred. Must not be <code>null</code>. 
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
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
this	TokenNamethis	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an exception with the given exception as a root cause. * * @param cause The exception that might have caused this one. * Should not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given exception as a root cause. * @param cause The exception that might have caused this one. Should not be <code>null</code>. 
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
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
BuildException	TokenNameIdentifier	 Build Exception
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs an exception with the given exception as * a root cause and a location in a file. * * @param cause The exception that might have caused this one. * Should not be <code>null</code>. * @param location The location in the project file where the error * occurred. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs an exception with the given exception as a root cause and a location in a file. * @param cause The exception that might have caused this one. Should not be <code>null</code>. @param location The location in the project file where the error occurred. Must not be <code>null</code>. 
public	TokenNamepublic	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
,	TokenNameCOMMA	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the nested exception, if any. * * @return the nested exception, or <code>null</code> if no * exception is associated with this one * @deprecated Use {@link #getCause} instead. */	TokenNameCOMMENT_JAVADOC	 Returns the nested exception, if any. * @return the nested exception, or <code>null</code> if no exception is associated with this one @deprecated Use {@link #getCause} instead. 
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the location of the error and the error message. * * @return the location of the error and the error message */	TokenNameCOMMENT_JAVADOC	 Returns the location of the error and the error message. * @return the location of the error and the error message 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
location	TokenNameIdentifier	 location
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the file location where the error occurred. * * @param location The file location where the error occurred. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the file location where the error occurred. * @param location The file location where the error occurred. Must not be <code>null</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the file location where the error occurred. * * @return the file location where the error occurred. */	TokenNameCOMMENT_JAVADOC	 Returns the file location where the error occurred. * @return the file location where the error occurred. 
public	TokenNamepublic	
Location	TokenNameIdentifier	 Location
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
