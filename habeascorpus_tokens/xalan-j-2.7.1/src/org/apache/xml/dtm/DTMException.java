/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMException.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMException.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
/** * This class specifies an exceptional condition that occured * in the DTM module. */	TokenNameCOMMENT_JAVADOC	 This class specifies an exceptional condition that occured in the DTM module. 
public	TokenNamepublic	
class	TokenNameclass	
DTMException	TokenNameIdentifier	 DTM Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
775576419181334734L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** Field locator specifies where the error occured. * @serial */	TokenNameCOMMENT_JAVADOC	 Field locator specifies where the error occured. @serial 
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
/** * Method getLocator retrieves an instance of a SourceLocator * object that specifies where an error occured. * * @return A SourceLocator object, or null if none was specified. */	TokenNameCOMMENT_JAVADOC	 Method getLocator retrieves an instance of a SourceLocator object that specifies where an error occured. * @return A SourceLocator object, or null if none was specified. 
public	TokenNamepublic	
SourceLocator	TokenNameIdentifier	 Source Locator
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method setLocator sets an instance of a SourceLocator * object that specifies where an error occured. * * @param location A SourceLocator object, or null to clear the location. */	TokenNameCOMMENT_JAVADOC	 Method setLocator sets an instance of a SourceLocator object that specifies where an error occured. * @param location A SourceLocator object, or null to clear the location. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocator	TokenNameIdentifier	 set Locator
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Field containedException specifies a wrapped exception. May be null. * @serial */	TokenNameCOMMENT_JAVADOC	 Field containedException specifies a wrapped exception. May be null. @serial 
Throwable	TokenNameIdentifier	 Throwable
containedException	TokenNameIdentifier	 contained Exception
;	TokenNameSEMICOLON	
/** * This method retrieves an exception that this exception wraps. * * @return An Throwable object, or null. * @see #getCause */	TokenNameCOMMENT_JAVADOC	 This method retrieves an exception that this exception wraps. * @return An Throwable object, or null. @see #getCause 
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
containedException	TokenNameIdentifier	 contained Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the cause of this throwable or <code>null</code> if the * cause is nonexistent or unknown. (The cause is the throwable that * caused this throwable to get thrown.) */	TokenNameCOMMENT_JAVADOC	 Returns the cause of this throwable or <code>null</code> if the cause is nonexistent or unknown. (The cause is the throwable that caused this throwable to get thrown.) 
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
containedException	TokenNameIdentifier	 contained Exception
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
containedException	TokenNameIdentifier	 contained Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the <i>cause</i> of this throwable to the specified value. * (The cause is the throwable that caused this throwable to get thrown.) * * <p>This method can be called at most once. It is generally called from * within the constructor, or immediately after creating the * throwable. If this throwable was created * with {@link #DTMException(Throwable)} or * {@link #DTMException(String,Throwable)}, this method cannot be called * even once. * * @param cause the cause (which is saved for later retrieval by the * {@link #getCause()} method). (A <tt>null</tt> value is * permitted, and indicates that the cause is nonexistent or * unknown.) * @return a reference to this <code>Throwable</code> instance. * @throws IllegalArgumentException if <code>cause</code> is this * throwable. (A throwable cannot * be its own cause.) * @throws IllegalStateException if this throwable was * created with {@link #DTMException(Throwable)} or * {@link #DTMException(String,Throwable)}, or this method has already * been called on this throwable. */	TokenNameCOMMENT_JAVADOC	 Initializes the <i>cause</i> of this throwable to the specified value. (The cause is the throwable that caused this throwable to get thrown.) * <p>This method can be called at most once. It is generally called from within the constructor, or immediately after creating the throwable. If this throwable was created with {@link #DTMException(Throwable)} or {@link #DTMException(String,Throwable)}, this method cannot be called even once. * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method). (A <tt>null</tt> value is permitted, and indicates that the cause is nonexistent or unknown.) @return a reference to this <code>Throwable</code> instance. @throws IllegalArgumentException if <code>cause</code> is this throwable. (A throwable cannot be its own cause.) @throws IllegalStateException if this throwable was created with {@link #DTMException(Throwable)} or {@link #DTMException(String,Throwable)}, or this method has already been called on this throwable. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Throwable	TokenNameIdentifier	 Throwable
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
containedException	TokenNameIdentifier	 contained Exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_CANNOT_OVERWRITE_CAUSE	TokenNameIdentifier	 ER  CANNOT  OVERWRITE  CAUSE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Can't overwrite cause"); 	TokenNameCOMMENT_LINE	"Can't overwrite cause"); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cause	TokenNameIdentifier	 cause
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_SELF_CAUSATION_NOT_PERMITTED	TokenNameIdentifier	 ER  SELF  CAUSATION  NOT  PERMITTED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Self-causation not permitted"); 	TokenNameCOMMENT_LINE	"Self-causation not permitted"); 
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
containedException	TokenNameIdentifier	 contained Exception
=	TokenNameEQUAL	
cause	TokenNameIdentifier	 cause
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new DTMException. * * @param message The error or warning message. */	TokenNameCOMMENT_JAVADOC	 Create a new DTMException. * @param message The error or warning message. 
public	TokenNamepublic	
DTMException	TokenNameIdentifier	 DTM Exception
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
this	TokenNamethis	
.	TokenNameDOT	
containedException	TokenNameIdentifier	 contained Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new DTMException wrapping an existing exception. * * @param e The exception to be wrapped. */	TokenNameCOMMENT_JAVADOC	 Create a new DTMException wrapping an existing exception. * @param e The exception to be wrapped. 
public	TokenNamepublic	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
containedException	TokenNameIdentifier	 contained Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wrap an existing exception in a DTMException. * * <p>This is used for throwing processor exceptions before * the processing has started.</p> * * @param message The error or warning message, or null to * use the message from the embedded exception. * @param e Any exception */	TokenNameCOMMENT_JAVADOC	 Wrap an existing exception in a DTMException. * <p>This is used for throwing processor exceptions before the processing has started.</p> * @param message The error or warning message, or null to use the message from the embedded exception. @param e Any exception 
public	TokenNamepublic	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
containedException	TokenNameIdentifier	 contained Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new DTMException from a message and a Locator. * * <p>This constructor is especially useful when an application is * creating its own exception from within a DocumentHandler * callback.</p> * * @param message The error or warning message. * @param locator The locator object for the error or warning. */	TokenNameCOMMENT_JAVADOC	 Create a new DTMException from a message and a Locator. * <p>This constructor is especially useful when an application is creating its own exception from within a DocumentHandler callback.</p> * @param message The error or warning message. @param locator The locator object for the error or warning. 
public	TokenNamepublic	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
containedException	TokenNameIdentifier	 contained Exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Wrap an existing exception in a DTMException. * * @param message The error or warning message, or null to * use the message from the embedded exception. * @param locator The locator object for the error or warning. * @param e Any exception */	TokenNameCOMMENT_JAVADOC	 Wrap an existing exception in a DTMException. * @param message The error or warning message, or null to use the message from the embedded exception. @param locator The locator object for the error or warning. @param e Any exception 
public	TokenNamepublic	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
containedException	TokenNameIdentifier	 contained Exception
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the error message with location information * appended. */	TokenNameCOMMENT_JAVADOC	 Get the error message with location information appended. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessageAndLocation	TokenNameIdentifier	 get Message And Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuffer	TokenNameIdentifier	 sbuffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; SystemID: "	TokenNameStringLiteral	; SystemID: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; Line#: "	TokenNameStringLiteral	; Line#: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; Column#: "	TokenNameStringLiteral	; Column#: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the location information as a string. * * @return A string with location info, or null * if there is no location information. */	TokenNameCOMMENT_JAVADOC	 Get the location information as a string. * @return A string with location info, or null if there is no location information. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocationAsString	TokenNameIdentifier	 get Location As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuffer	TokenNameIdentifier	 sbuffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; SystemID: "	TokenNameStringLiteral	; SystemID: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; Line#: "	TokenNameStringLiteral	; Line#: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; Column#: "	TokenNameStringLiteral	; Column#: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sbuffer	TokenNameIdentifier	 sbuffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Print the the trace of methods from where the error * originated. This will trace all nested exception * objects, as well as this object. */	TokenNameCOMMENT_JAVADOC	 Print the the trace of methods from where the error originated. This will trace all nested exception objects, as well as this object. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print the the trace of methods from where the error * originated. This will trace all nested exception * objects, as well as this object. * @param s The stream where the dump will be sent to. */	TokenNameCOMMENT_JAVADOC	 Print the the trace of methods from where the error originated. This will trace all nested exception objects, as well as this object. @param s The stream where the dump will be sent to. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print the the trace of methods from where the error * originated. This will trace all nested exception * objects, as well as this object. * @param s The writer where the dump will be sent to. */	TokenNameCOMMENT_JAVADOC	 Print the the trace of methods from where the error originated. This will trace all nested exception objects, as well as this object. @param s The writer where the dump will be sent to. 
public	TokenNamepublic	
void	TokenNamevoid	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
locInfo	TokenNameIdentifier	 loc Info
=	TokenNameEQUAL	
getLocationAsString	TokenNameIdentifier	 get Location As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locInfo	TokenNameIdentifier	 loc Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
locInfo	TokenNameIdentifier	 loc Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isJdk14OrHigher	TokenNameIdentifier	 is Jdk14 Or Higher
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getCause"	TokenNameStringLiteral	getCause
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isJdk14OrHigher	TokenNameIdentifier	 is Jdk14 Or Higher
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
// The printStackTrace method of the Throwable class in jdk 1.4 	TokenNameCOMMENT_LINE	The printStackTrace method of the Throwable class in jdk 1.4 
// and higher will include the cause when printing the backtrace. 	TokenNameCOMMENT_LINE	and higher will include the cause when printing the backtrace. 
// The following code is only required when using jdk 1.3 or lower 	TokenNameCOMMENT_LINE	The following code is only required when using jdk 1.3 or lower 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isJdk14OrHigher	TokenNameIdentifier	 is Jdk14 Or Higher
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"---------"	TokenNameStringLiteral	---------
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
instanceof	TokenNameinstanceof	
DTMException	TokenNameIdentifier	 DTM Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
locInfo	TokenNameIdentifier	 loc Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMException	TokenNameIdentifier	 DTM Exception
)	TokenNameRPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocationAsString	TokenNameIdentifier	 get Location As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
locInfo	TokenNameIdentifier	 loc Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
locInfo	TokenNameIdentifier	 loc Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Could not print stack trace..."	TokenNameStringLiteral	Could not print stack trace...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
meth	TokenNameIdentifier	 meth
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getException"	TokenNameStringLiteral	getException
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
meth	TokenNameIdentifier	 meth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
)	TokenNameRPAREN	
meth	TokenNameIdentifier	 meth
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
==	TokenNameEQUAL_EQUAL	
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
ite	TokenNameIdentifier	 ite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
iae	TokenNameIdentifier	 iae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
