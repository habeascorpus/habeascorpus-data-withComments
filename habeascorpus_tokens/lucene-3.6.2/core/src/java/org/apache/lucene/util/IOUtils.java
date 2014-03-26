package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
Charset	TokenNameIdentifier	 Charset
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CharsetDecoder	TokenNameIdentifier	 Charset Decoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
;	TokenNameSEMICOLON	
/** This class emulates the new Java 7 "Try-With-Resources" statement. * Remove once Lucene is on Java 7. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 This class emulates the new Java 7 "Try-With-Resources" statement. Remove once Lucene is on Java 7. @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
IOUtils	TokenNameIdentifier	 IO Utils
{	TokenNameLBRACE	
/** * UTF-8 charset string * @see Charset#forName(String) */	TokenNameCOMMENT_JAVADOC	 UTF-8 charset string @see Charset#forName(String) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UTF_8	TokenNameIdentifier	 UTF 8
=	TokenNameEQUAL	
"UTF-8"	TokenNameStringLiteral	UTF-8
;	TokenNameSEMICOLON	
/** * UTF-8 {@link Charset} instance to prevent repeated * {@link Charset#forName(String)} lookups */	TokenNameCOMMENT_JAVADOC	 UTF-8 {@link Charset} instance to prevent repeated {@link Charset#forName(String)} lookups 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Charset	TokenNameIdentifier	 Charset
CHARSET_UTF_8	TokenNameIdentifier	 CHARSET  UTF 8
=	TokenNameEQUAL	
Charset	TokenNameIdentifier	 Charset
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IOUtils	TokenNameIdentifier	 IO Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// no instance 	TokenNameCOMMENT_LINE	no instance 
/** * <p>Closes all given <tt>Closeable</tt>s, suppressing all thrown exceptions. Some of the <tt>Closeable</tt>s * may be null, they are ignored. After everything is closed, method either throws <tt>priorException</tt>, * if one is supplied, or the first of suppressed exceptions, or completes normally.</p> * <p>Sample usage:<br/> * <pre> * Closeable resource1 = null, resource2 = null, resource3 = null; * ExpectedException priorE = null; * try { * resource1 = ...; resource2 = ...; resource3 = ...; // Acquisition may throw ExpectedException * ..do..stuff.. // May throw ExpectedException * } catch (ExpectedException e) { * priorE = e; * } finally { * closeSafely(priorE, resource1, resource2, resource3); * } * </pre> * </p> * @param priorException <tt>null</tt> or an exception that will be rethrown after method completion * @param objects objects to call <tt>close()</tt> on */	TokenNameCOMMENT_JAVADOC	 <p>Closes all given <tt>Closeable</tt>s, suppressing all thrown exceptions. Some of the <tt>Closeable</tt>s may be null, they are ignored. After everything is closed, method either throws <tt>priorException</tt>, if one is supplied, or the first of suppressed exceptions, or completes normally.</p> <p>Sample usage:<br/> <pre> Closeable resource1 = null, resource2 = null, resource3 = null; ExpectedException priorE = null; try { resource1 = ...; resource2 = ...; resource3 = ...; // Acquisition may throw ExpectedException ..do..stuff.. // May throw ExpectedException } catch (ExpectedException e) { priorE = e; } finally { closeSafely(priorE, resource1, resource2, resource3); } </pre> </p> @param priorException <tt>null</tt> or an exception that will be rethrown after method completion @param objects objects to call <tt>close()</tt> on 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
E	TokenNameIdentifier	 E
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
void	TokenNamevoid	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
E	TokenNameIdentifier	 E
priorException	TokenNameIdentifier	 prior Exception
,	TokenNameCOMMA	
Closeable	TokenNameIdentifier	 Closeable
...	TokenNameELLIPSIS	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
throws	TokenNamethrows	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
object	TokenNameIdentifier	 object
:	TokenNameCOLON	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
object	TokenNameIdentifier	 object
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addSuppressed	TokenNameIdentifier	 add Suppressed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
priorException	TokenNameIdentifier	 prior Exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
th	TokenNameIdentifier	 th
:	TokenNameCOLON	
priorException	TokenNameIdentifier	 prior Exception
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
priorException	TokenNameIdentifier	 prior Exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
priorException	TokenNameIdentifier	 prior Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
IOException	TokenNameIdentifier	 IO Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** @see #closeWhileHandlingException(Exception, Closeable...) */	TokenNameCOMMENT_JAVADOC	 @see #closeWhileHandlingException(Exception, Closeable...) 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
E	TokenNameIdentifier	 E
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
>	TokenNameGREATER	
void	TokenNamevoid	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
E	TokenNameIdentifier	 E
priorException	TokenNameIdentifier	 prior Exception
,	TokenNameCOMMA	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Closeable	TokenNameIdentifier	 Closeable
>	TokenNameGREATER	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
throws	TokenNamethrows	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
object	TokenNameIdentifier	 object
:	TokenNameCOLON	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
object	TokenNameIdentifier	 object
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addSuppressed	TokenNameIdentifier	 add Suppressed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
priorException	TokenNameIdentifier	 prior Exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
th	TokenNameIdentifier	 th
:	TokenNameCOLON	
priorException	TokenNameIdentifier	 prior Exception
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
priorException	TokenNameIdentifier	 prior Exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
priorException	TokenNameIdentifier	 prior Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
IOException	TokenNameIdentifier	 IO Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Closes all given <tt>Closeable</tt>s. Some of the * <tt>Closeable</tt>s may be null; they are * ignored. After everything is closed, the method either * throws the first exception it hit while closing, or * completes normally if there were no exceptions. * * @param objects * objects to call <tt>close()</tt> on */	TokenNameCOMMENT_JAVADOC	 Closes all given <tt>Closeable</tt>s. Some of the <tt>Closeable</tt>s may be null; they are ignored. After everything is closed, the method either throws the first exception it hit while closing, or completes normally if there were no exceptions. * @param objects objects to call <tt>close()</tt> on 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
...	TokenNameELLIPSIS	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
object	TokenNameIdentifier	 object
:	TokenNameCOLON	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
object	TokenNameIdentifier	 object
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addSuppressed	TokenNameIdentifier	 add Suppressed
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
IOException	TokenNameIdentifier	 IO Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see #close(Closeable...) */	TokenNameCOMMENT_JAVADOC	 @see #close(Closeable...) 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Closeable	TokenNameIdentifier	 Closeable
>	TokenNameGREATER	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
object	TokenNameIdentifier	 object
:	TokenNameCOLON	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
object	TokenNameIdentifier	 object
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addSuppressed	TokenNameIdentifier	 add Suppressed
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
IOException	TokenNameIdentifier	 IO Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Closes all given <tt>Closeable</tt>s, suppressing all thrown exceptions. * Some of the <tt>Closeable</tt>s may be null, they are ignored. * * @param objects * objects to call <tt>close()</tt> on */	TokenNameCOMMENT_JAVADOC	 Closes all given <tt>Closeable</tt>s, suppressing all thrown exceptions. Some of the <tt>Closeable</tt>s may be null, they are ignored. * @param objects objects to call <tt>close()</tt> on 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
...	TokenNameELLIPSIS	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
object	TokenNameIdentifier	 object
:	TokenNameCOLON	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
object	TokenNameIdentifier	 object
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see #closeWhileHandlingException(Closeable...) */	TokenNameCOMMENT_JAVADOC	 @see #closeWhileHandlingException(Closeable...) 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Closeable	TokenNameIdentifier	 Closeable
>	TokenNameGREATER	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
object	TokenNameIdentifier	 object
:	TokenNameCOLON	
objects	TokenNameIdentifier	 objects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
object	TokenNameIdentifier	 object
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This reflected {@link Method} is {@code null} before Java 7 */	TokenNameCOMMENT_JAVADOC	 This reflected {@link Method} is {@code null} before Java 7 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Method	TokenNameIdentifier	 Method
SUPPRESS_METHOD	TokenNameIdentifier	 SUPPRESS  METHOD
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
Throwable	TokenNameIdentifier	 Throwable
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"addSuppressed"	TokenNameStringLiteral	addSuppressed
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SUPPRESS_METHOD	TokenNameIdentifier	 SUPPRESS  METHOD
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** adds a Throwable to the list of suppressed Exceptions of the first Throwable (if Java 7 is detected) * @param exception this exception should get the suppressed one added * @param suppressed the suppressed exception */	TokenNameCOMMENT_JAVADOC	 adds a Throwable to the list of suppressed Exceptions of the first Throwable (if Java 7 is detected) @param exception this exception should get the suppressed one added @param suppressed the suppressed exception 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
void	TokenNamevoid	
addSuppressed	TokenNameIdentifier	 add Suppressed
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
exception	TokenNameIdentifier	 exception
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
suppressed	TokenNameIdentifier	 suppressed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SUPPRESS_METHOD	TokenNameIdentifier	 SUPPRESS  METHOD
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
exception	TokenNameIdentifier	 exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
suppressed	TokenNameIdentifier	 suppressed
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
SUPPRESS_METHOD	TokenNameIdentifier	 SUPPRESS  METHOD
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
,	TokenNameCOMMA	
suppressed	TokenNameIdentifier	 suppressed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore any exceptions caused by invoking (e.g. security constraints) 	TokenNameCOMMENT_LINE	ignore any exceptions caused by invoking (e.g. security constraints) 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wrapping the given {@link InputStream} in a reader using a {@link CharsetDecoder}. * Unlike Java's defaults this reader will throw an exception if your it detects * the read charset doesn't match the expected {@link Charset}. * <p> * Decoding readers are useful to load configuration files, stopword lists or synonym files * to detect character set problems. However, its not recommended to use as a common purpose * reader. * * @param stream the stream to wrap in a reader * @param charSet the expected charset * @return a wrapping reader */	TokenNameCOMMENT_JAVADOC	 Wrapping the given {@link InputStream} in a reader using a {@link CharsetDecoder}. Unlike Java's defaults this reader will throw an exception if your it detects the read charset doesn't match the expected {@link Charset}. <p> Decoding readers are useful to load configuration files, stopword lists or synonym files to detect character set problems. However, its not recommended to use as a common purpose reader. * @param stream the stream to wrap in a reader @param charSet the expected charset @return a wrapping reader 
public	TokenNamepublic	
static	TokenNamestatic	
Reader	TokenNameIdentifier	 Reader
getDecodingReader	TokenNameIdentifier	 get Decoding Reader
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
Charset	TokenNameIdentifier	 Charset
charSet	TokenNameIdentifier	 char Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
CharsetDecoder	TokenNameIdentifier	 Charset Decoder
charSetDecoder	TokenNameIdentifier	 char Set Decoder
=	TokenNameEQUAL	
charSet	TokenNameIdentifier	 char Set
.	TokenNameDOT	
newDecoder	TokenNameIdentifier	 new Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
onMalformedInput	TokenNameIdentifier	 on Malformed Input
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
.	TokenNameDOT	
onUnmappableCharacter	TokenNameIdentifier	 on Unmappable Character
(	TokenNameLPAREN	
CodingErrorAction	TokenNameIdentifier	 Coding Error Action
.	TokenNameDOT	
REPORT	TokenNameIdentifier	 REPORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
charSetDecoder	TokenNameIdentifier	 char Set Decoder
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Opens a Reader for the given {@link File} using a {@link CharsetDecoder}. * Unlike Java's defaults this reader will throw an exception if your it detects * the read charset doesn't match the expected {@link Charset}. * <p> * Decoding readers are useful to load configuration files, stopword lists or synonym files * to detect character set problems. However, its not recommended to use as a common purpose * reader. * @param file the file to open a reader on * @param charSet the expected charset * @return a reader to read the given file */	TokenNameCOMMENT_JAVADOC	 Opens a Reader for the given {@link File} using a {@link CharsetDecoder}. Unlike Java's defaults this reader will throw an exception if your it detects the read charset doesn't match the expected {@link Charset}. <p> Decoding readers are useful to load configuration files, stopword lists or synonym files to detect character set problems. However, its not recommended to use as a common purpose reader. @param file the file to open a reader on @param charSet the expected charset @return a reader to read the given file 
public	TokenNamepublic	
static	TokenNamestatic	
Reader	TokenNameIdentifier	 Reader
getDecodingReader	TokenNameIdentifier	 get Decoding Reader
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
Charset	TokenNameIdentifier	 Charset
charSet	TokenNameIdentifier	 char Set
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FileInputStream	TokenNameIdentifier	 File Input Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
getDecodingReader	TokenNameIdentifier	 get Decoding Reader
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
charSet	TokenNameIdentifier	 char Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Opens a Reader for the given resource using a {@link CharsetDecoder}. * Unlike Java's defaults this reader will throw an exception if your it detects * the read charset doesn't match the expected {@link Charset}. * <p> * Decoding readers are useful to load configuration files, stopword lists or synonym files * to detect character set problems. However, its not recommended to use as a common purpose * reader. * @param clazz the class used to locate the resource * @param resource the resource name to load * @param charSet the expected charset * @return a reader to read the given file * */	TokenNameCOMMENT_JAVADOC	 Opens a Reader for the given resource using a {@link CharsetDecoder}. Unlike Java's defaults this reader will throw an exception if your it detects the read charset doesn't match the expected {@link Charset}. <p> Decoding readers are useful to load configuration files, stopword lists or synonym files to detect character set problems. However, its not recommended to use as a common purpose reader. @param clazz the class used to locate the resource @param resource the resource name to load @param charSet the expected charset @return a reader to read the given file 
public	TokenNamepublic	
static	TokenNamestatic	
Reader	TokenNameIdentifier	 Reader
getDecodingReader	TokenNameIdentifier	 get Decoding Reader
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
Charset	TokenNameIdentifier	 Charset
charSet	TokenNameIdentifier	 char Set
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
getDecodingReader	TokenNameIdentifier	 get Decoding Reader
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
charSet	TokenNameIdentifier	 char Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
