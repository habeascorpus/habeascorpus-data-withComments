/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contributors: Mathias Bogaert 	TokenNameCOMMENT_LINE	Contributors: Mathias Bogaert 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** Check every now and then that a certain file has not changed. If it has, then call the {@link #doOnChange} method. @author Ceki G&uuml;lc&uuml; @since version 0.9.1 */	TokenNameCOMMENT_JAVADOC	 Check every now and then that a certain file has not changed. If it has, then call the {@link #doOnChange} method. @author Ceki G&uuml;lc&uuml; @since version 0.9.1 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FileWatchdog	TokenNameIdentifier	 File Watchdog
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
/** The default delay between every file modification check, set to 60 seconds. */	TokenNameCOMMENT_JAVADOC	 The default delay between every file modification check, set to 60 seconds. 
static	TokenNamestatic	
final	TokenNamefinal	
public	TokenNamepublic	
long	TokenNamelong	
DEFAULT_DELAY	TokenNameIdentifier	 DEFAULT  DELAY
=	TokenNameEQUAL	
60000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The name of the file to observe for changes. */	TokenNameCOMMENT_JAVADOC	 The name of the file to observe for changes. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
/** The delay to observe between every check. By default set {@link #DEFAULT_DELAY}. */	TokenNameCOMMENT_JAVADOC	 The delay to observe between every check. By default set {@link #DEFAULT_DELAY}. 
protected	TokenNameprotected	
long	TokenNamelong	
delay	TokenNameIdentifier	 delay
=	TokenNameEQUAL	
DEFAULT_DELAY	TokenNameIdentifier	 DEFAULT  DELAY
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
long	TokenNamelong	
lastModif	TokenNameIdentifier	 last Modif
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
warnedAlready	TokenNameIdentifier	 warned Already
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
interrupted	TokenNameIdentifier	 interrupted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
FileWatchdog	TokenNameIdentifier	 File Watchdog
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"FileWatchdog"	TokenNameStringLiteral	FileWatchdog
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAndConfigure	TokenNameIdentifier	 check And Configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the delay to observe between each check of the file changes. */	TokenNameCOMMENT_JAVADOC	 Set the delay to observe between each check of the file changes. 
public	TokenNamepublic	
void	TokenNamevoid	
setDelay	TokenNameIdentifier	 set Delay
(	TokenNameLPAREN	
long	TokenNamelong	
delay	TokenNameIdentifier	 delay
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delay	TokenNameIdentifier	 delay
=	TokenNameEQUAL	
delay	TokenNameIdentifier	 delay
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
abstract	TokenNameabstract	
protected	TokenNameprotected	
void	TokenNamevoid	
doOnChange	TokenNameIdentifier	 do On Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
checkAndConfigure	TokenNameIdentifier	 check And Configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
fileExists	TokenNameIdentifier	 file Exists
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
fileExists	TokenNameIdentifier	 file Exists
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Was not allowed to read check file existance, file:["	TokenNameStringLiteral	Was not allowed to read check file existance, file:[
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
"]."	TokenNameStringLiteral	].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interrupted	TokenNameIdentifier	 interrupted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// there is no point in continuing 	TokenNameCOMMENT_LINE	there is no point in continuing 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fileExists	TokenNameIdentifier	 file Exists
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this can also throw a SecurityException 	TokenNameCOMMENT_LINE	this can also throw a SecurityException 
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
>	TokenNameGREATER	
lastModif	TokenNameIdentifier	 last Modif
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// however, if we reached this point this 	TokenNameCOMMENT_LINE	however, if we reached this point this 
lastModif	TokenNameIdentifier	 last Modif
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
// is very unlikely. 	TokenNameCOMMENT_LINE	is very unlikely. 
doOnChange	TokenNameIdentifier	 do On Change
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
warnedAlready	TokenNameIdentifier	 warned Already
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
warnedAlready	TokenNameIdentifier	 warned Already
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
filename	TokenNameIdentifier	 filename
+	TokenNamePLUS	
"] does not exist."	TokenNameStringLiteral	] does not exist.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
warnedAlready	TokenNameIdentifier	 warned Already
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
interrupted	TokenNameIdentifier	 interrupted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
delay	TokenNameIdentifier	 delay
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no interruption expected 	TokenNameCOMMENT_LINE	no interruption expected 
}	TokenNameRBRACE	
checkAndConfigure	TokenNameIdentifier	 check And Configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
