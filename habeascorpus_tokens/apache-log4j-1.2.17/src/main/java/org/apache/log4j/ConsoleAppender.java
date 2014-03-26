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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
/** * ConsoleAppender appends log events to <code>System.out</code> or * <code>System.err</code> using a layout specified by the user. The * default target is <code>System.out</code>. * * @author Ceki G&uuml;lc&uuml; * @author Curt Arnold * @since 1.1 */	TokenNameCOMMENT_JAVADOC	 ConsoleAppender appends log events to <code>System.out</code> or <code>System.err</code> using a layout specified by the user. The default target is <code>System.out</code>. * @author Ceki G&uuml;lc&uuml; @author Curt Arnold @since 1.1 
public	TokenNamepublic	
class	TokenNameclass	
ConsoleAppender	TokenNameIdentifier	 Console Appender
extends	TokenNameextends	
WriterAppender	TokenNameIdentifier	 Writer Appender
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYSTEM_OUT	TokenNameIdentifier	 SYSTEM  OUT
=	TokenNameEQUAL	
"System.out"	TokenNameStringLiteral	System.out
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYSTEM_ERR	TokenNameIdentifier	 SYSTEM  ERR
=	TokenNameEQUAL	
"System.err"	TokenNameStringLiteral	System.err
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
SYSTEM_OUT	TokenNameIdentifier	 SYSTEM  OUT
;	TokenNameSEMICOLON	
/** * Determines if the appender honors reassignments of System.out * or System.err made after configuration. */	TokenNameCOMMENT_JAVADOC	 Determines if the appender honors reassignments of System.out or System.err made after configuration. 
private	TokenNameprivate	
boolean	TokenNameboolean	
follow	TokenNameIdentifier	 follow
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructs an unconfigured appender. */	TokenNameCOMMENT_JAVADOC	 Constructs an unconfigured appender. 
public	TokenNamepublic	
ConsoleAppender	TokenNameIdentifier	 Console Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a configured appender. * * @param layout layout, may not be null. */	TokenNameCOMMENT_JAVADOC	 Creates a configured appender. * @param layout layout, may not be null. 
public	TokenNamepublic	
ConsoleAppender	TokenNameIdentifier	 Console Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
SYSTEM_OUT	TokenNameIdentifier	 SYSTEM  OUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a configured appender. * @param layout layout, may not be null. * @param target target, either "System.err" or "System.out". */	TokenNameCOMMENT_JAVADOC	 Creates a configured appender. @param layout layout, may not be null. @param target target, either "System.err" or "System.out". 
public	TokenNamepublic	
ConsoleAppender	TokenNameIdentifier	 Console Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of the <b>Target</b> option. Recognized values * are "System.out" and "System.err". Any other value will be * ignored. * */	TokenNameCOMMENT_JAVADOC	 Sets the value of the <b>Target</b> option. Recognized values are "System.out" and "System.err". Any other value will be ignored. 
public	TokenNamepublic	
void	TokenNamevoid	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
SYSTEM_OUT	TokenNameIdentifier	 SYSTEM  OUT
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
SYSTEM_OUT	TokenNameIdentifier	 SYSTEM  OUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
SYSTEM_ERR	TokenNameIdentifier	 SYSTEM  ERR
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
SYSTEM_ERR	TokenNameIdentifier	 SYSTEM  ERR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
targetWarn	TokenNameIdentifier	 target Warn
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the current value of the <b>Target</b> property. The * default value of the option is "System.out". * * See also {@link #setTarget}. * */	TokenNameCOMMENT_JAVADOC	 Returns the current value of the <b>Target</b> property. The default value of the option is "System.out". * See also {@link #setTarget}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether the appender honors reassignments of System.out * or System.err made after configuration. * @param newValue if true, appender will use value of System.out or * System.err in force at the time when logging events are appended. * @since 1.2.13 */	TokenNameCOMMENT_JAVADOC	 Sets whether the appender honors reassignments of System.out or System.err made after configuration. @param newValue if true, appender will use value of System.out or System.err in force at the time when logging events are appended. @since 1.2.13 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setFollow	TokenNameIdentifier	 set Follow
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
follow	TokenNameIdentifier	 follow
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets whether the appender honors reassignments of System.out * or System.err made after configuration. * @return true if appender will use value of System.out or * System.err in force at the time when logging events are appended. * @since 1.2.13 */	TokenNameCOMMENT_JAVADOC	 Gets whether the appender honors reassignments of System.out or System.err made after configuration. @return true if appender will use value of System.out or System.err in force at the time when logging events are appended. @since 1.2.13 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
getFollow	TokenNameIdentifier	 get Follow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
follow	TokenNameIdentifier	 follow
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
targetWarn	TokenNameIdentifier	 target Warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
val	TokenNameIdentifier	 val
+	TokenNamePLUS	
"] should be System.out or System.err."	TokenNameStringLiteral	] should be System.out or System.err.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Using previously set target, System.out by default."	TokenNameStringLiteral	Using previously set target, System.out by default.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prepares the appender for use. */	TokenNameCOMMENT_JAVADOC	 Prepares the appender for use. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
follow	TokenNameIdentifier	 follow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SYSTEM_ERR	TokenNameIdentifier	 SYSTEM  ERR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
createWriter	TokenNameIdentifier	 create Writer
(	TokenNameLPAREN	
new	TokenNamenew	
SystemErrStream	TokenNameIdentifier	 System Err Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
createWriter	TokenNameIdentifier	 create Writer
(	TokenNameLPAREN	
new	TokenNamenew	
SystemOutStream	TokenNameIdentifier	 System Out Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SYSTEM_ERR	TokenNameIdentifier	 SYSTEM  ERR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
createWriter	TokenNameIdentifier	 create Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setWriter	TokenNameIdentifier	 set Writer
(	TokenNameLPAREN	
createWriter	TokenNameIdentifier	 create Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
closeWriter	TokenNameIdentifier	 close Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
follow	TokenNameIdentifier	 follow
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
closeWriter	TokenNameIdentifier	 close Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An implementation of OutputStream that redirects to the * current System.err. * */	TokenNameCOMMENT_JAVADOC	 An implementation of OutputStream that redirects to the current System.err. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SystemErrStream	TokenNameIdentifier	 System Err Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
public	TokenNamepublic	
SystemErrStream	TokenNameIdentifier	 System Err Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
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
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An implementation of OutputStream that redirects to the * current System.out. * */	TokenNameCOMMENT_JAVADOC	 An implementation of OutputStream that redirects to the current System.out. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SystemOutStream	TokenNameIdentifier	 System Out Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
public	TokenNamepublic	
SystemOutStream	TokenNameIdentifier	 System Out Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
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
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
