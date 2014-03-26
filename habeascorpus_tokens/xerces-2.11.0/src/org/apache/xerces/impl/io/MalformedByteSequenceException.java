/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
CharConversionException	TokenNameIdentifier	 Char Conversion Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MessageFormatter	TokenNameIdentifier	 Message Formatter
;	TokenNameSEMICOLON	
/** * <p>Signals that a malformed byte sequence was detected * by a <code>java.io.Reader</code> that decodes bytes * of a given encoding into characters.</p> * * @xerces.internal * * @author Michael Glavassevich, IBM * * @version $Id: MalformedByteSequenceException.java 718095 2008-11-16 20:00:14Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>Signals that a malformed byte sequence was detected by a <code>java.io.Reader</code> that decodes bytes of a given encoding into characters.</p> * @xerces.internal * @author Michael Glavassevich, IBM * @version $Id: MalformedByteSequenceException.java 718095 2008-11-16 20:00:14Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
extends	TokenNameextends	
CharConversionException	TokenNameIdentifier	 Char Conversion Exception
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8436382245048328739L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** message formatter **/	TokenNameCOMMENT_JAVADOC	 message formatter *
private	TokenNameprivate	
MessageFormatter	TokenNameIdentifier	 Message Formatter
fFormatter	TokenNameIdentifier	 f Formatter
;	TokenNameSEMICOLON	
/** locale for error message **/	TokenNameCOMMENT_JAVADOC	 locale for error message *
private	TokenNameprivate	
Locale	TokenNameIdentifier	 Locale
fLocale	TokenNameIdentifier	 f Locale
;	TokenNameSEMICOLON	
/** error domain **/	TokenNameCOMMENT_JAVADOC	 error domain *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fDomain	TokenNameIdentifier	 f Domain
;	TokenNameSEMICOLON	
/** key for the error message **/	TokenNameCOMMENT_JAVADOC	 key for the error message *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fKey	TokenNameIdentifier	 f Key
;	TokenNameSEMICOLON	
/** replacement arguements for the error message **/	TokenNameCOMMENT_JAVADOC	 replacement arguements for the error message *
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fArguments	TokenNameIdentifier	 f Arguments
;	TokenNameSEMICOLON	
/** message text for this message, initially null **/	TokenNameCOMMENT_JAVADOC	 message text for this message, initially null *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fMessage	TokenNameIdentifier	 f Message
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a MalformedByteSequenceException with the given * parameters which may be passed to an error reporter to * generate a localized string for this exception. * * @param formatter The MessageFormatter used for building the * message text for this exception. * @param locale The Locale for which messages are to be reported. * @param domain The error domain. * @param key The key of the error message. * @param arguments The replacement arguments for the error message, * if needed. */	TokenNameCOMMENT_JAVADOC	 Constructs a MalformedByteSequenceException with the given parameters which may be passed to an error reporter to generate a localized string for this exception. * @param formatter The MessageFormatter used for building the message text for this exception. @param locale The Locale for which messages are to be reported. @param domain The error domain. @param key The key of the error message. @param arguments The replacement arguments for the error message, if needed. 
public	TokenNamepublic	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
(	TokenNameLPAREN	
MessageFormatter	TokenNameIdentifier	 Message Formatter
formatter	TokenNameIdentifier	 formatter
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
domain	TokenNameIdentifier	 domain
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fFormatter	TokenNameIdentifier	 f Formatter
=	TokenNameEQUAL	
formatter	TokenNameIdentifier	 formatter
;	TokenNameSEMICOLON	
fLocale	TokenNameIdentifier	 f Locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
fDomain	TokenNameIdentifier	 f Domain
=	TokenNameEQUAL	
domain	TokenNameIdentifier	 domain
;	TokenNameSEMICOLON	
fKey	TokenNameIdentifier	 f Key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
fArguments	TokenNameIdentifier	 f Arguments
=	TokenNameEQUAL	
arguments	TokenNameIdentifier	 arguments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(MessageFormatter, Locale, String, String, Object[]) 	TokenNameCOMMENT_LINE	<init>(MessageFormatter, Locale, String, String, Object[]) 
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * <p>Returns the error domain of the error message.</p> * * @return the error domain */	TokenNameCOMMENT_JAVADOC	 <p>Returns the error domain of the error message.</p> * @return the error domain 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDomain	TokenNameIdentifier	 get Domain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fDomain	TokenNameIdentifier	 f Domain
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getDomain 	TokenNameCOMMENT_LINE	getDomain 
/** * <p>Returns the key of the error message.</p> * * @return the error key of the error message */	TokenNameCOMMENT_JAVADOC	 <p>Returns the key of the error message.</p> * @return the error key of the error message 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fKey	TokenNameIdentifier	 f Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getKey() 	TokenNameCOMMENT_LINE	getKey() 
/** * <p>Returns the replacement arguments for the error * message or <code>null</code> if none exist.</p> * * @return the replacement arguments for the error message * or <code>null</code> if none exist */	TokenNameCOMMENT_JAVADOC	 <p>Returns the replacement arguments for the error message or <code>null</code> if none exist.</p> * @return the replacement arguments for the error message or <code>null</code> if none exist 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getArguments	TokenNameIdentifier	 get Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fArguments	TokenNameIdentifier	 f Arguments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getArguments(); 	TokenNameCOMMENT_LINE	getArguments(); 
/** * <p>Returns the localized message for this exception.</p> * * @return the localized message for this exception. */	TokenNameCOMMENT_JAVADOC	 <p>Returns the localized message for this exception.</p> * @return the localized message for this exception. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fMessage	TokenNameIdentifier	 f Message
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fMessage	TokenNameIdentifier	 f Message
=	TokenNameEQUAL	
fFormatter	TokenNameIdentifier	 f Formatter
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
fLocale	TokenNameIdentifier	 f Locale
,	TokenNameCOMMA	
fKey	TokenNameIdentifier	 f Key
,	TokenNameCOMMA	
fArguments	TokenNameIdentifier	 f Arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The references to the message formatter and locale 	TokenNameCOMMENT_LINE	The references to the message formatter and locale 
// aren't needed anymore so null them. 	TokenNameCOMMENT_LINE	aren't needed anymore so null them. 
fFormatter	TokenNameIdentifier	 f Formatter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fLocale	TokenNameIdentifier	 f Locale
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fMessage	TokenNameIdentifier	 f Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getMessage() 	TokenNameCOMMENT_LINE	getMessage() 
}	TokenNameRBRACE	
// MalformedByteSequenceException 	TokenNameCOMMENT_LINE	MalformedByteSequenceException 
