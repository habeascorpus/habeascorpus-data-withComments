/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
/** This class used to output log statements from within the log4j package. <p>Log4j components cannot make log4j logging calls. However, it is sometimes useful for the user to learn about what log4j is doing. You can enable log4j internal logging by defining the <b>log4j.configDebug</b> variable. <p>All log4j internal debug calls go to <code>System.out</code> where as internal error messages are sent to <code>System.err</code>. All internal messages are prepended with the string "log4j: ". @since 0.8.2 @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 This class used to output log statements from within the log4j package. <p>Log4j components cannot make log4j logging calls. However, it is sometimes useful for the user to learn about what log4j is doing. You can enable log4j internal logging by defining the <b>log4j.configDebug</b> variable. <p>All log4j internal debug calls go to <code>System.out</code> where as internal error messages are sent to <code>System.err</code>. All internal messages are prepended with the string "log4j: ". @since 0.8.2 @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
LogLog	TokenNameIdentifier	 Log Log
{	TokenNameLBRACE	
/** Defining this value makes log4j print log4j-internal debug statements to <code>System.out</code>. <p> The value of this string is <b>log4j.debug</b>. <p>Note that the search for all option names is case sensitive. */	TokenNameCOMMENT_JAVADOC	 Defining this value makes log4j print log4j-internal debug statements to <code>System.out</code>. <p> The value of this string is <b>log4j.debug</b>. <p>Note that the search for all option names is case sensitive. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEBUG_KEY	TokenNameIdentifier	 DEBUG  KEY
=	TokenNameEQUAL	
"log4j.debug"	TokenNameStringLiteral	log4j.debug
;	TokenNameSEMICOLON	
/** Defining this value makes log4j components print log4j-internal debug statements to <code>System.out</code>. <p> The value of this string is <b>log4j.configDebug</b>. <p>Note that the search for all option names is case sensitive. @deprecated Use {@link #DEBUG_KEY} instead. */	TokenNameCOMMENT_JAVADOC	 Defining this value makes log4j components print log4j-internal debug statements to <code>System.out</code>. <p> The value of this string is <b>log4j.configDebug</b>. <p>Note that the search for all option names is case sensitive. @deprecated Use {@link #DEBUG_KEY} instead. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CONFIG_DEBUG_KEY	TokenNameIdentifier	 CONFIG  DEBUG  KEY
=	TokenNameEQUAL	
"log4j.configDebug"	TokenNameStringLiteral	log4j.configDebug
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
debugEnabled	TokenNameIdentifier	 debug Enabled
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** In quietMode not even errors generate any output. */	TokenNameCOMMENT_JAVADOC	 In quietMode not even errors generate any output. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
quietMode	TokenNameIdentifier	 quiet Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX	TokenNameIdentifier	 PREFIX
=	TokenNameEQUAL	
"log4j: "	TokenNameStringLiteral	log4j: 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERR_PREFIX	TokenNameIdentifier	 ERR  PREFIX
=	TokenNameEQUAL	
"log4j:ERROR "	TokenNameStringLiteral	log4j:ERROR 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
WARN_PREFIX	TokenNameIdentifier	 WARN  PREFIX
=	TokenNameEQUAL	
"log4j:WARN "	TokenNameStringLiteral	log4j:WARN 
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
DEBUG_KEY	TokenNameIdentifier	 DEBUG  KEY
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
getSystemProperty	TokenNameIdentifier	 get System Property
(	TokenNameLPAREN	
CONFIG_DEBUG_KEY	TokenNameIdentifier	 CONFIG  DEBUG  KEY
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
debugEnabled	TokenNameIdentifier	 debug Enabled
=	TokenNameEQUAL	
OptionConverter	TokenNameIdentifier	 Option Converter
.	TokenNameDOT	
toBoolean	TokenNameIdentifier	 to Boolean
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Allows to enable/disable log4j internal logging. */	TokenNameCOMMENT_JAVADOC	 Allows to enable/disable log4j internal logging. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
setInternalDebugging	TokenNameIdentifier	 set Internal Debugging
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enabled	TokenNameIdentifier	 enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
debugEnabled	TokenNameIdentifier	 debug Enabled
=	TokenNameEQUAL	
enabled	TokenNameIdentifier	 enabled
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method is used to output log4j internal debug statements. Output goes to <code>System.out</code>. */	TokenNameCOMMENT_JAVADOC	 This method is used to output log4j internal debug statements. Output goes to <code>System.out</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debugEnabled	TokenNameIdentifier	 debug Enabled
&&	TokenNameAND_AND	
!	TokenNameNOT	
quietMode	TokenNameIdentifier	 quiet Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This method is used to output log4j internal debug statements. Output goes to <code>System.out</code>. */	TokenNameCOMMENT_JAVADOC	 This method is used to output log4j internal debug statements. Output goes to <code>System.out</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
debugEnabled	TokenNameIdentifier	 debug Enabled
&&	TokenNameAND_AND	
!	TokenNameNOT	
quietMode	TokenNameIdentifier	 quiet Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
PREFIX	TokenNameIdentifier	 PREFIX
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This method is used to output log4j internal error statements. There is no way to disable error statements. Output goes to <code>System.err</code>. */	TokenNameCOMMENT_JAVADOC	 This method is used to output log4j internal error statements. There is no way to disable error statements. Output goes to <code>System.err</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quietMode	TokenNameIdentifier	 quiet Mode
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ERR_PREFIX	TokenNameIdentifier	 ERR  PREFIX
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method is used to output log4j internal error statements. There is no way to disable error statements. Output goes to <code>System.err</code>. */	TokenNameCOMMENT_JAVADOC	 This method is used to output log4j internal error statements. There is no way to disable error statements. Output goes to <code>System.err</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quietMode	TokenNameIdentifier	 quiet Mode
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ERR_PREFIX	TokenNameIdentifier	 ERR  PREFIX
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** In quite mode no LogLog generates strictly no output, not even for errors. @param quietMode A true for not */	TokenNameCOMMENT_JAVADOC	 In quite mode no LogLog generates strictly no output, not even for errors. @param quietMode A true for not 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setQuietMode	TokenNameIdentifier	 set Quiet Mode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
quietMode	TokenNameIdentifier	 quiet Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
quietMode	TokenNameIdentifier	 quiet Mode
=	TokenNameEQUAL	
quietMode	TokenNameIdentifier	 quiet Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method is used to output log4j internal warning statements. There is no way to disable warning statements. Output goes to <code>System.err</code>. */	TokenNameCOMMENT_JAVADOC	 This method is used to output log4j internal warning statements. There is no way to disable warning statements. Output goes to <code>System.err</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quietMode	TokenNameIdentifier	 quiet Mode
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
WARN_PREFIX	TokenNameIdentifier	 WARN  PREFIX
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method is used to output log4j internal warnings. There is no way to disable warning statements. Output goes to <code>System.err</code>. */	TokenNameCOMMENT_JAVADOC	 This method is used to output log4j internal warnings. There is no way to disable warning statements. Output goes to <code>System.err</code>. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quietMode	TokenNameIdentifier	 quiet Mode
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
WARN_PREFIX	TokenNameIdentifier	 WARN  PREFIX
+	TokenNamePLUS	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
