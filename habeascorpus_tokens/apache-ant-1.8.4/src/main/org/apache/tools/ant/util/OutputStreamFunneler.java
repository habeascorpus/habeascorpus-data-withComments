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
util	TokenNameIdentifier	 util
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * Manages a set of <code>OutputStream</code>s to * write to a single underlying stream, which is * closed only when the last &quot;funnel&quot; * has been closed. */	TokenNameCOMMENT_JAVADOC	 Manages a set of <code>OutputStream</code>s to write to a single underlying stream, which is closed only when the last &quot;funnel&quot; has been closed. 
public	TokenNamepublic	
class	TokenNameclass	
OutputStreamFunneler	TokenNameIdentifier	 Output Stream Funneler
{	TokenNameLBRACE	
/** * Default timeout. * @see #setTimeout(long) */	TokenNameCOMMENT_JAVADOC	 Default timeout. @see #setTimeout(long) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
DEFAULT_TIMEOUT_MILLIS	TokenNameIdentifier	 DEFAULT  TIMEOUT  MILLIS
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
Funnel	TokenNameIdentifier	 Funnel
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Funnel	TokenNameIdentifier	 Funnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
OutputStreamFunneler	TokenNameIdentifier	 Output Stream Funneler
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
OutputStreamFunneler	TokenNameIdentifier	 Output Stream Funneler
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieIfClosed	TokenNameIdentifier	 die If Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
OutputStreamFunneler	TokenNameIdentifier	 Output Stream Funneler
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieIfClosed	TokenNameIdentifier	 die If Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
OutputStreamFunneler	TokenNameIdentifier	 Output Stream Funneler
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieIfClosed	TokenNameIdentifier	 die If Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
OutputStreamFunneler	TokenNameIdentifier	 Output Stream Funneler
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieIfClosed	TokenNameIdentifier	 die If Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
closed	TokenNameIdentifier	 closed
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
timeoutMillis	TokenNameIdentifier	 timeout Millis
;	TokenNameSEMICOLON	
/** * Create a new <code>OutputStreamFunneler</code> for * the specified <code>OutputStream</code>. * @param out <code>OutputStream</code>. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>OutputStreamFunneler</code> for the specified <code>OutputStream</code>. @param out <code>OutputStream</code>. 
public	TokenNamepublic	
OutputStreamFunneler	TokenNameIdentifier	 Output Stream Funneler
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
DEFAULT_TIMEOUT_MILLIS	TokenNameIdentifier	 DEFAULT  TIMEOUT  MILLIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new <code>OutputStreamFunneler</code> for * the specified <code>OutputStream</code>, with the * specified timeout value. * @param out <code>OutputStream</code>. * @param timeoutMillis <code>long</code>. * @see #setTimeout(long) */	TokenNameCOMMENT_JAVADOC	 Create a new <code>OutputStreamFunneler</code> for the specified <code>OutputStream</code>, with the specified timeout value. @param out <code>OutputStream</code>. @param timeoutMillis <code>long</code>. @see #setTimeout(long) 
public	TokenNamepublic	
OutputStreamFunneler	TokenNameIdentifier	 Output Stream Funneler
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
long	TokenNamelong	
timeoutMillis	TokenNameIdentifier	 timeout Millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"OutputStreamFunneler.<init>: out == null"	TokenNameStringLiteral	OutputStreamFunneler.<init>: out == null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//as far as we know 	TokenNameCOMMENT_LINE	as far as we know 
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
timeoutMillis	TokenNameIdentifier	 timeout Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the timeout for this <code>OutputStreamFunneler</code>. * This is the maximum time that may elapse between the closure * of the last &quot;funnel&quot; and the next call to * <code>getOutputStream()</code> without closing the * underlying stream. * @param timeoutMillis <code>long</code> timeout value. */	TokenNameCOMMENT_JAVADOC	 Set the timeout for this <code>OutputStreamFunneler</code>. This is the maximum time that may elapse between the closure of the last &quot;funnel&quot; and the next call to <code>getOutputStream()</code> without closing the underlying stream. @param timeoutMillis <code>long</code> timeout value. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setTimeout	TokenNameIdentifier	 set Timeout
(	TokenNameLPAREN	
long	TokenNamelong	
timeoutMillis	TokenNameIdentifier	 timeout Millis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeoutMillis	TokenNameIdentifier	 timeout Millis
=	TokenNameEQUAL	
timeoutMillis	TokenNameIdentifier	 timeout Millis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a &quot;funnel&quot; <code>OutputStream</code> instance to * write to this <code>OutputStreamFunneler</code>'s underlying * <code>OutputStream</code>. * @return <code>OutputStream</code>. * @throws IOException if unable to create the funnel. */	TokenNameCOMMENT_JAVADOC	 Get a &quot;funnel&quot; <code>OutputStream</code> instance to write to this <code>OutputStreamFunneler</code>'s underlying <code>OutputStream</code>. @return <code>OutputStream</code>. @throws IOException if unable to create the funnel. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
OutputStream	TokenNameIdentifier	 Output Stream
getFunnelInstance	TokenNameIdentifier	 get Funnel Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dieIfClosed	TokenNameIdentifier	 die If Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Funnel	TokenNameIdentifier	 Funnel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
Funnel	TokenNameIdentifier	 Funnel
funnel	TokenNameIdentifier	 funnel
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
//ignore release of an already-closed funnel 	TokenNameCOMMENT_LINE	ignore release of an already-closed funnel 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
funnel	TokenNameIdentifier	 funnel
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
timeoutMillis	TokenNameIdentifier	 timeout Millis
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
timeoutMillis	TokenNameIdentifier	 timeout Millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
eyeEx	TokenNameIdentifier	 eye Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
funnel	TokenNameIdentifier	 funnel
.	TokenNameDOT	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
dieIfClosed	TokenNameIdentifier	 die If Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
dieIfClosed	TokenNameIdentifier	 die If Closed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closed	TokenNameIdentifier	 closed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"The funneled OutputStream has been closed."	TokenNameStringLiteral	The funneled OutputStream has been closed.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
