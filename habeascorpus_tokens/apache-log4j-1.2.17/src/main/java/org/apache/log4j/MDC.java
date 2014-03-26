/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
Loader	TokenNameIdentifier	 Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
;	TokenNameSEMICOLON	
/** The MDC class is similar to the {@link NDC} class except that it is based on a map instead of a stack. It provides <em>mapped diagnostic contexts</em>. A <em>Mapped Diagnostic Context</em>, or MDC in short, is an instrument for distinguishing interleaved log output from different sources. Log output is typically interleaved when a server handles multiple clients near-simultaneously. <p><b><em>The MDC is managed on a per thread basis</em></b>. A child thread automatically inherits a <em>copy</em> of the mapped diagnostic context of its parent. <p>The MDC class requires JDK 1.2 or above. Under JDK 1.1 the MDC will always return empty values but otherwise will not affect or harm your application. @since 1.2 @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 The MDC class is similar to the {@link NDC} class except that it is based on a map instead of a stack. It provides <em>mapped diagnostic contexts</em>. A <em>Mapped Diagnostic Context</em>, or MDC in short, is an instrument for distinguishing interleaved log output from different sources. Log output is typically interleaved when a server handles multiple clients near-simultaneously. <p><b><em>The MDC is managed on a per thread basis</em></b>. A child thread automatically inherits a <em>copy</em> of the mapped diagnostic context of its parent. <p>The MDC class requires JDK 1.2 or above. Under JDK 1.1 the MDC will always return empty values but otherwise will not affect or harm your application. @since 1.2 @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
MDC	TokenNameIdentifier	 MDC
{	TokenNameLBRACE	
final	TokenNamefinal	
static	TokenNamestatic	
MDC	TokenNameIdentifier	 MDC
mdc	TokenNameIdentifier	 mdc
=	TokenNameEQUAL	
new	TokenNamenew	
MDC	TokenNameIdentifier	 MDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HT_SIZE	TokenNameIdentifier	 HT  SIZE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
java1	TokenNameIdentifier	 java1
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
tlm	TokenNameIdentifier	 tlm
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
removeMethod	TokenNameIdentifier	 remove Method
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MDC	TokenNameIdentifier	 MDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java1	TokenNameIdentifier	 java1
=	TokenNameEQUAL	
Loader	TokenNameIdentifier	 Loader
.	TokenNameDOT	
isJava1	TokenNameIdentifier	 is Java1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
java1	TokenNameIdentifier	 java1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tlm	TokenNameIdentifier	 tlm
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
removeMethod	TokenNameIdentifier	 remove Method
=	TokenNameEQUAL	
ThreadLocal	TokenNameIdentifier	 Thread Local
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"remove"	TokenNameStringLiteral	remove
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// don't do anything - java prior 1.5 	TokenNameCOMMENT_LINE	don't do anything - java prior 1.5 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Put a context value (the <code>o</code> parameter) as identified with the <code>key</code> parameter into the current thread's context map. <p>If the current thread does not have a context map it is created as a side effect. */	TokenNameCOMMENT_JAVADOC	 Put a context value (the <code>o</code> parameter) as identified with the <code>key</code> parameter into the current thread's context map. <p>If the current thread does not have a context map it is created as a side effect. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdc	TokenNameIdentifier	 mdc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdc	TokenNameIdentifier	 mdc
.	TokenNameDOT	
put0	TokenNameIdentifier	 put0
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Get the context identified by the <code>key</code> parameter. <p>This method has no side effects. */	TokenNameCOMMENT_JAVADOC	 Get the context identified by the <code>key</code> parameter. <p>This method has no side effects. 
static	TokenNamestatic	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdc	TokenNameIdentifier	 mdc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mdc	TokenNameIdentifier	 mdc
.	TokenNameDOT	
get0	TokenNameIdentifier	 get0
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Remove the the context identified by the <code>key</code> parameter. */	TokenNameCOMMENT_JAVADOC	 Remove the the context identified by the <code>key</code> parameter. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdc	TokenNameIdentifier	 mdc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdc	TokenNameIdentifier	 mdc
.	TokenNameDOT	
remove0	TokenNameIdentifier	 remove0
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the current thread's MDC as a hashtable. This method is * intended to be used internally. * */	TokenNameCOMMENT_JAVADOC	 Get the current thread's MDC as a hashtable. This method is intended to be used internally. 
public	TokenNamepublic	
static	TokenNamestatic	
Hashtable	TokenNameIdentifier	 Hashtable
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdc	TokenNameIdentifier	 mdc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mdc	TokenNameIdentifier	 mdc
.	TokenNameDOT	
getContext0	TokenNameIdentifier	 get Context0
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
/** * Remove all values from the MDC. * @since 1.2.16 */	TokenNameCOMMENT_JAVADOC	 Remove all values from the MDC. @since 1.2.16 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mdc	TokenNameIdentifier	 mdc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdc	TokenNameIdentifier	 mdc
.	TokenNameDOT	
clear0	TokenNameIdentifier	 clear0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
put0	TokenNameIdentifier	 put0
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
java1	TokenNameIdentifier	 java1
||	TokenNameOR_OR	
tlm	TokenNameIdentifier	 tlm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
)	TokenNameRPAREN	
tlm	TokenNameIdentifier	 tlm
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
HT_SIZE	TokenNameIdentifier	 HT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
)	TokenNameRPAREN	
tlm	TokenNameIdentifier	 tlm
)	TokenNameRPAREN	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
get0	TokenNameIdentifier	 get0
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
java1	TokenNameIdentifier	 java1
||	TokenNameOR_OR	
tlm	TokenNameIdentifier	 tlm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
)	TokenNameRPAREN	
tlm	TokenNameIdentifier	 tlm
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
key	TokenNameIdentifier	 key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
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
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
remove0	TokenNameIdentifier	 remove0
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
java1	TokenNameIdentifier	 java1
&&	TokenNameAND_AND	
tlm	TokenNameIdentifier	 tlm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
)	TokenNameRPAREN	
tlm	TokenNameIdentifier	 tlm
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// clean up if this was the last key 	TokenNameCOMMENT_LINE	clean up if this was the last key 
if	TokenNameif	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear0	TokenNameIdentifier	 clear0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
getContext0	TokenNameIdentifier	 get Context0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
java1	TokenNameIdentifier	 java1
||	TokenNameOR_OR	
tlm	TokenNameIdentifier	 tlm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
)	TokenNameRPAREN	
tlm	TokenNameIdentifier	 tlm
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
clear0	TokenNameIdentifier	 clear0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
java1	TokenNameIdentifier	 java1
&&	TokenNameAND_AND	
tlm	TokenNameIdentifier	 tlm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
)	TokenNameRPAREN	
tlm	TokenNameIdentifier	 tlm
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
removeMethod	TokenNameIdentifier	 remove Method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// java 1.3/1.4 does not have remove - will suffer from a memory leak 	TokenNameCOMMENT_LINE	java 1.3/1.4 does not have remove - will suffer from a memory leak 
try	TokenNametry	
{	TokenNameLBRACE	
removeMethod	TokenNameIdentifier	 remove Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
tlm	TokenNameIdentifier	 tlm
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happen 	TokenNameCOMMENT_LINE	should not happen 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happen 	TokenNameCOMMENT_LINE	should not happen 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
