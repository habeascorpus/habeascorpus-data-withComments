/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
;	TokenNameSEMICOLON	
/** * This exception is the base exception of all XNI exceptions. It * can be constructed with an error message or used to wrap another * exception object. * <p> * <strong>Note:</strong> By extending the Java * <code>RuntimeException</code>, XNI handlers and components are * not required to catch XNI exceptions but may explicitly catch * them, if so desired. * * @author Andy Clark, IBM * * @version $Id: XNIException.java 766579 2009-04-20 05:31:56Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This exception is the base exception of all XNI exceptions. It can be constructed with an error message or used to wrap another exception object. <p> <strong>Note:</strong> By extending the Java <code>RuntimeException</code>, XNI handlers and components are not required to catch XNI exceptions but may explicitly catch them, if so desired. * @author Andy Clark, IBM * @version $Id: XNIException.java 766579 2009-04-20 05:31:56Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XNIException	TokenNameIdentifier	 XNI Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
9019819772686063775L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** The wrapped exception. */	TokenNameCOMMENT_JAVADOC	 The wrapped exception. 
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs an XNI exception with a message. * * @param message The exception message. */	TokenNameCOMMENT_JAVADOC	 Constructs an XNI exception with a message. * @param message The exception message. 
public	TokenNamepublic	
XNIException	TokenNameIdentifier	 XNI Exception
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
// <init>(String) 	TokenNameCOMMENT_LINE	<init>(String) 
/** * Constructs an XNI exception with a wrapped exception. * * @param exception The wrapped exception. */	TokenNameCOMMENT_JAVADOC	 Constructs an XNI exception with a wrapped exception. * @param exception The wrapped exception. 
public	TokenNamepublic	
XNIException	TokenNameIdentifier	 XNI Exception
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(Exception) 	TokenNameCOMMENT_LINE	<init>(Exception) 
/** * Constructs an XNI exception with a message and wrapped exception. * * @param message The exception message. * @param exception The wrapped exception. */	TokenNameCOMMENT_JAVADOC	 Constructs an XNI exception with a message and wrapped exception. * @param message The exception message. @param exception The wrapped exception. 
public	TokenNamepublic	
XNIException	TokenNameIdentifier	 XNI Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(Exception,String) 	TokenNameCOMMENT_LINE	<init>(Exception,String) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns the wrapped exception. */	TokenNameCOMMENT_JAVADOC	 Returns the wrapped exception. 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fException	TokenNameIdentifier	 f Exception
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
?	TokenNameQUESTION	
fException	TokenNameIdentifier	 f Exception
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getException():Exception 	TokenNameCOMMENT_LINE	getException():Exception 
/** * Initializes the cause of this <code>XNIException</code>. * The value must be an instance of <code>Exception</code> or * <code>null</code>. * * @param throwable the cause * @return this exception * * @throws IllegalStateException if a cause has already been set * @throws IllegalArgumentException if the cause is this exception * @throws ClassCastException if the cause is not assignable to <code>Exception</code> */	TokenNameCOMMENT_JAVADOC	 Initializes the cause of this <code>XNIException</code>. The value must be an instance of <code>Exception</code> or <code>null</code>. * @param throwable the cause @return this exception * @throws IllegalStateException if a cause has already been set @throws IllegalArgumentException if the cause is this exception @throws ClassCastException if the cause is not assignable to <code>Exception</code> 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Throwable	TokenNameIdentifier	 Throwable
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fException	TokenNameIdentifier	 f Exception
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Add error message. 	TokenNameCOMMENT_LINE	TODO: Add error message. 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
throwable	TokenNameIdentifier	 throwable
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Add error message. 	TokenNameCOMMENT_LINE	TODO: Add error message. 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fException	TokenNameIdentifier	 f Exception
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
)	TokenNameRPAREN	
throwable	TokenNameIdentifier	 throwable
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// initCause(Throwable):Throwable 	TokenNameCOMMENT_LINE	initCause(Throwable):Throwable 
/** Returns the cause of this <code>XNIException</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the cause of this <code>XNIException</code>. 
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getCause():Throwable 	TokenNameCOMMENT_LINE	getCause():Throwable 
}	TokenNameRBRACE	
// class XNIException 	TokenNameCOMMENT_LINE	class XNIException 
