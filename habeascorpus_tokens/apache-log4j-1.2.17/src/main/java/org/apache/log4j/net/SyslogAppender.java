/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
net	TokenNameIdentifier	 net
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Layout	TokenNameIdentifier	 Layout
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
SyslogQuietWriter	TokenNameIdentifier	 Syslog Quiet Writer
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
SyslogWriter	TokenNameIdentifier	 Syslog Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
InetAddress	TokenNameIdentifier	 Inet Address
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
// Contributors: Yves Bossel <ybossel@opengets.cl> 	TokenNameCOMMENT_LINE	Contributors: Yves Bossel <ybossel@opengets.cl> 
// Christopher Taylor <cstaylor@pacbell.net> 	TokenNameCOMMENT_LINE	Christopher Taylor <cstaylor@pacbell.net> 
/** Use SyslogAppender to send log messages to a remote syslog daemon. @author Ceki G&uuml;lc&uuml; @author Anders Kristensen */	TokenNameCOMMENT_JAVADOC	 Use SyslogAppender to send log messages to a remote syslog daemon. @author Ceki G&uuml;lc&uuml; @author Anders Kristensen 
public	TokenNamepublic	
class	TokenNameclass	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
extends	TokenNameextends	
AppenderSkeleton	TokenNameIdentifier	 Appender Skeleton
{	TokenNameLBRACE	
// The following constants are extracted from a syslog.h file 	TokenNameCOMMENT_LINE	The following constants are extracted from a syslog.h file 
// copyrighted by the Regents of the University of California 	TokenNameCOMMENT_LINE	copyrighted by the Regents of the University of California 
// I hope nobody at Berkley gets offended. 	TokenNameCOMMENT_LINE	I hope nobody at Berkley gets offended. 
/** Kernel messages */	TokenNameCOMMENT_JAVADOC	 Kernel messages 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_KERN	TokenNameIdentifier	 LOG  KERN
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Random user-level messages */	TokenNameCOMMENT_JAVADOC	 Random user-level messages 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_USER	TokenNameIdentifier	 LOG  USER
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Mail system */	TokenNameCOMMENT_JAVADOC	 Mail system 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_MAIL	TokenNameIdentifier	 LOG  MAIL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** System daemons */	TokenNameCOMMENT_JAVADOC	 System daemons 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_DAEMON	TokenNameIdentifier	 LOG  DAEMON
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** security/authorization messages */	TokenNameCOMMENT_JAVADOC	 security/authorization messages 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_AUTH	TokenNameIdentifier	 LOG  AUTH
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** messages generated internally by syslogd */	TokenNameCOMMENT_JAVADOC	 messages generated internally by syslogd 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_SYSLOG	TokenNameIdentifier	 LOG  SYSLOG
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** line printer subsystem */	TokenNameCOMMENT_JAVADOC	 line printer subsystem 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_LPR	TokenNameIdentifier	 LOG  LPR
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** network news subsystem */	TokenNameCOMMENT_JAVADOC	 network news subsystem 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_NEWS	TokenNameIdentifier	 LOG  NEWS
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** UUCP subsystem */	TokenNameCOMMENT_JAVADOC	 UUCP subsystem 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_UUCP	TokenNameIdentifier	 LOG  UUCP
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** clock daemon */	TokenNameCOMMENT_JAVADOC	 clock daemon 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_CRON	TokenNameIdentifier	 LOG  CRON
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** security/authorization messages (private) */	TokenNameCOMMENT_JAVADOC	 security/authorization messages (private) 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_AUTHPRIV	TokenNameIdentifier	 LOG  AUTHPRIV
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** ftp daemon */	TokenNameCOMMENT_JAVADOC	 ftp daemon 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_FTP	TokenNameIdentifier	 LOG  FTP
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// other codes through 15 reserved for system use 	TokenNameCOMMENT_LINE	other codes through 15 reserved for system use 
/** reserved for local use */	TokenNameCOMMENT_JAVADOC	 reserved for local use 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_LOCAL0	TokenNameIdentifier	 LOG  LOCA L0
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** reserved for local use */	TokenNameCOMMENT_JAVADOC	 reserved for local use 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_LOCAL1	TokenNameIdentifier	 LOG  LOCA L1
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** reserved for local use */	TokenNameCOMMENT_JAVADOC	 reserved for local use 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_LOCAL2	TokenNameIdentifier	 LOG  LOCA L2
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** reserved for local use */	TokenNameCOMMENT_JAVADOC	 reserved for local use 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_LOCAL3	TokenNameIdentifier	 LOG  LOCA L3
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** reserved for local use */	TokenNameCOMMENT_JAVADOC	 reserved for local use 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_LOCAL4	TokenNameIdentifier	 LOG  LOCA L4
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** reserved for local use */	TokenNameCOMMENT_JAVADOC	 reserved for local use 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_LOCAL5	TokenNameIdentifier	 LOG  LOCA L5
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** reserved for local use */	TokenNameCOMMENT_JAVADOC	 reserved for local use 
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_LOCAL6	TokenNameIdentifier	 LOG  LOCA L6
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** reserved for local use*/	TokenNameCOMMENT_JAVADOC	 reserved for local use
final	TokenNamefinal	
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
LOG_LOCAL7	TokenNameIdentifier	 LOG  LOCA L7
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SYSLOG_HOST_OI	TokenNameIdentifier	 SYSLOG  HOST  OI
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FACILITY_OI	TokenNameIdentifier	 FACILITY  OI
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TAB	TokenNameIdentifier	 TAB
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// Have LOG_USER as default 	TokenNameCOMMENT_LINE	Have LOG_USER as default 
int	TokenNameint	
syslogFacility	TokenNameIdentifier	 syslog Facility
=	TokenNameEQUAL	
LOG_USER	TokenNameIdentifier	 LOG  USER
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
facilityStr	TokenNameIdentifier	 facility Str
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
facilityPrinting	TokenNameIdentifier	 facility Printing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//SyslogTracerPrintWriter stp; 	TokenNameCOMMENT_LINE	SyslogTracerPrintWriter stp; 
SyslogQuietWriter	TokenNameIdentifier	 Syslog Quiet Writer
sqw	TokenNameIdentifier	 sqw
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
syslogHost	TokenNameIdentifier	 syslog Host
;	TokenNameSEMICOLON	
/** * If true, the appender will generate the HEADER (timestamp and host name) * part of the syslog packet. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 If true, the appender will generate the HEADER (timestamp and host name) part of the syslog packet. @since 1.2.15 
private	TokenNameprivate	
boolean	TokenNameboolean	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Date format used if header = true. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Date format used if header = true. @since 1.2.15 
private	TokenNameprivate	
final	TokenNamefinal	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
dateFormat	TokenNameIdentifier	 date Format
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"MMM dd HH:mm:ss "	TokenNameStringLiteral	MMM dd HH:mm:ss 
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Host name used to identify messages from this appender. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Host name used to identify messages from this appender. @since 1.2.15 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
localHostname	TokenNameIdentifier	 local Hostname
;	TokenNameSEMICOLON	
/** * Set to true after the header of the layout has been sent or if it has none. */	TokenNameCOMMENT_JAVADOC	 Set to true after the header of the layout has been sent or if it has none. 
private	TokenNameprivate	
boolean	TokenNameboolean	
layoutHeaderChecked	TokenNameIdentifier	 layout Header Checked
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
initSyslogFacilityStr	TokenNameIdentifier	 init Syslog Facility Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
int	TokenNameint	
syslogFacility	TokenNameIdentifier	 syslog Facility
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
syslogFacility	TokenNameIdentifier	 syslog Facility
=	TokenNameEQUAL	
syslogFacility	TokenNameIdentifier	 syslog Facility
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
initSyslogFacilityStr	TokenNameIdentifier	 init Syslog Facility Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SyslogAppender	TokenNameIdentifier	 Syslog Appender
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
syslogHost	TokenNameIdentifier	 syslog Host
,	TokenNameCOMMA	
int	TokenNameint	
syslogFacility	TokenNameIdentifier	 syslog Facility
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
,	TokenNameCOMMA	
syslogFacility	TokenNameIdentifier	 syslog Facility
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
syslogHost	TokenNameIdentifier	 syslog Host
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Release any resources held by this SyslogAppender. @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 Release any resources held by this SyslogAppender. @since 0.8.4 
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closed	TokenNameIdentifier	 closed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sqw	TokenNameIdentifier	 sqw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
layoutHeaderChecked	TokenNameIdentifier	 layout Header Checked
&&	TokenNameAND_AND	
layout	TokenNameIdentifier	 layout
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getFooter	TokenNameIdentifier	 get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sendLayoutMessage	TokenNameIdentifier	 send Layout Message
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getFooter	TokenNameIdentifier	 get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sqw	TokenNameIdentifier	 sqw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqw	TokenNameIdentifier	 sqw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InterruptedIOException	TokenNameIdentifier	 Interrupted IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
interrupt	TokenNameIdentifier	 interrupt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqw	TokenNameIdentifier	 sqw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sqw	TokenNameIdentifier	 sqw
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initSyslogFacilityStr	TokenNameIdentifier	 init Syslog Facility Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
facilityStr	TokenNameIdentifier	 facility Str
=	TokenNameEQUAL	
getFacilityString	TokenNameIdentifier	 get Facility String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
syslogFacility	TokenNameIdentifier	 syslog Facility
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
facilityStr	TokenNameIdentifier	 facility Str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
+	TokenNamePLUS	
syslogFacility	TokenNameIdentifier	 syslog Facility
+	TokenNamePLUS	
"" is an unknown syslog facility. Defaulting to "USER"."	TokenNameStringLiteral	" is an unknown syslog facility. Defaulting to "USER".
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
syslogFacility	TokenNameIdentifier	 syslog Facility
=	TokenNameEQUAL	
LOG_USER	TokenNameIdentifier	 LOG  USER
;	TokenNameSEMICOLON	
facilityStr	TokenNameIdentifier	 facility Str
=	TokenNameEQUAL	
"user:"	TokenNameStringLiteral	user:
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
facilityStr	TokenNameIdentifier	 facility Str
+=	TokenNamePLUS_EQUAL	
":"	TokenNameStringLiteral	:
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the specified syslog facility as a lower-case String, e.g. "kern", "user", etc. */	TokenNameCOMMENT_JAVADOC	 Returns the specified syslog facility as a lower-case String, e.g. "kern", "user", etc. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getFacilityString	TokenNameIdentifier	 get Facility String
(	TokenNameLPAREN	
int	TokenNameint	
syslogFacility	TokenNameIdentifier	 syslog Facility
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
syslogFacility	TokenNameIdentifier	 syslog Facility
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LOG_KERN	TokenNameIdentifier	 LOG  KERN
:	TokenNameCOLON	
return	TokenNamereturn	
"kern"	TokenNameStringLiteral	kern
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_USER	TokenNameIdentifier	 LOG  USER
:	TokenNameCOLON	
return	TokenNamereturn	
"user"	TokenNameStringLiteral	user
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_MAIL	TokenNameIdentifier	 LOG  MAIL
:	TokenNameCOLON	
return	TokenNamereturn	
"mail"	TokenNameStringLiteral	mail
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_DAEMON	TokenNameIdentifier	 LOG  DAEMON
:	TokenNameCOLON	
return	TokenNamereturn	
"daemon"	TokenNameStringLiteral	daemon
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_AUTH	TokenNameIdentifier	 LOG  AUTH
:	TokenNameCOLON	
return	TokenNamereturn	
"auth"	TokenNameStringLiteral	auth
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_SYSLOG	TokenNameIdentifier	 LOG  SYSLOG
:	TokenNameCOLON	
return	TokenNamereturn	
"syslog"	TokenNameStringLiteral	syslog
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_LPR	TokenNameIdentifier	 LOG  LPR
:	TokenNameCOLON	
return	TokenNamereturn	
"lpr"	TokenNameStringLiteral	lpr
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_NEWS	TokenNameIdentifier	 LOG  NEWS
:	TokenNameCOLON	
return	TokenNamereturn	
"news"	TokenNameStringLiteral	news
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_UUCP	TokenNameIdentifier	 LOG  UUCP
:	TokenNameCOLON	
return	TokenNamereturn	
"uucp"	TokenNameStringLiteral	uucp
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_CRON	TokenNameIdentifier	 LOG  CRON
:	TokenNameCOLON	
return	TokenNamereturn	
"cron"	TokenNameStringLiteral	cron
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_AUTHPRIV	TokenNameIdentifier	 LOG  AUTHPRIV
:	TokenNameCOLON	
return	TokenNamereturn	
"authpriv"	TokenNameStringLiteral	authpriv
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_FTP	TokenNameIdentifier	 LOG  FTP
:	TokenNameCOLON	
return	TokenNamereturn	
"ftp"	TokenNameStringLiteral	ftp
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_LOCAL0	TokenNameIdentifier	 LOG  LOCA L0
:	TokenNameCOLON	
return	TokenNamereturn	
"local0"	TokenNameStringLiteral	local0
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_LOCAL1	TokenNameIdentifier	 LOG  LOCA L1
:	TokenNameCOLON	
return	TokenNamereturn	
"local1"	TokenNameStringLiteral	local1
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_LOCAL2	TokenNameIdentifier	 LOG  LOCA L2
:	TokenNameCOLON	
return	TokenNamereturn	
"local2"	TokenNameStringLiteral	local2
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_LOCAL3	TokenNameIdentifier	 LOG  LOCA L3
:	TokenNameCOLON	
return	TokenNamereturn	
"local3"	TokenNameStringLiteral	local3
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_LOCAL4	TokenNameIdentifier	 LOG  LOCA L4
:	TokenNameCOLON	
return	TokenNamereturn	
"local4"	TokenNameStringLiteral	local4
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_LOCAL5	TokenNameIdentifier	 LOG  LOCA L5
:	TokenNameCOLON	
return	TokenNamereturn	
"local5"	TokenNameStringLiteral	local5
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_LOCAL6	TokenNameIdentifier	 LOG  LOCA L6
:	TokenNameCOLON	
return	TokenNamereturn	
"local6"	TokenNameStringLiteral	local6
;	TokenNameSEMICOLON	
case	TokenNamecase	
LOG_LOCAL7	TokenNameIdentifier	 LOG  LOCA L7
:	TokenNameCOLON	
return	TokenNamereturn	
"local7"	TokenNameStringLiteral	local7
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the integer value corresponding to the named syslog facility, or -1 if it couldn't be recognized. @param facilityName one of the strings KERN, USER, MAIL, DAEMON, AUTH, SYSLOG, LPR, NEWS, UUCP, CRON, AUTHPRIV, FTP, LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7. The matching is case-insensitive. @since 1.1 */	TokenNameCOMMENT_JAVADOC	 Returns the integer value corresponding to the named syslog facility, or -1 if it couldn't be recognized. @param facilityName one of the strings KERN, USER, MAIL, DAEMON, AUTH, SYSLOG, LPR, NEWS, UUCP, CRON, AUTHPRIV, FTP, LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7. The matching is case-insensitive. @since 1.1 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
facilityName	TokenNameIdentifier	 facility Name
=	TokenNameEQUAL	
facilityName	TokenNameIdentifier	 facility Name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"KERN"	TokenNameStringLiteral	KERN
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_KERN	TokenNameIdentifier	 LOG  KERN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"USER"	TokenNameStringLiteral	USER
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_USER	TokenNameIdentifier	 LOG  USER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"MAIL"	TokenNameStringLiteral	MAIL
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_MAIL	TokenNameIdentifier	 LOG  MAIL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"DAEMON"	TokenNameStringLiteral	DAEMON
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_DAEMON	TokenNameIdentifier	 LOG  DAEMON
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"AUTH"	TokenNameStringLiteral	AUTH
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_AUTH	TokenNameIdentifier	 LOG  AUTH
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"SYSLOG"	TokenNameStringLiteral	SYSLOG
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_SYSLOG	TokenNameIdentifier	 LOG  SYSLOG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"LPR"	TokenNameStringLiteral	LPR
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_LPR	TokenNameIdentifier	 LOG  LPR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"NEWS"	TokenNameStringLiteral	NEWS
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_NEWS	TokenNameIdentifier	 LOG  NEWS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"UUCP"	TokenNameStringLiteral	UUCP
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_UUCP	TokenNameIdentifier	 LOG  UUCP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"CRON"	TokenNameStringLiteral	CRON
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_CRON	TokenNameIdentifier	 LOG  CRON
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"AUTHPRIV"	TokenNameStringLiteral	AUTHPRIV
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_AUTHPRIV	TokenNameIdentifier	 LOG  AUTHPRIV
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"FTP"	TokenNameStringLiteral	FTP
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_FTP	TokenNameIdentifier	 LOG  FTP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"LOCAL0"	TokenNameStringLiteral	LOCAL0
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_LOCAL0	TokenNameIdentifier	 LOG  LOCA L0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"LOCAL1"	TokenNameStringLiteral	LOCAL1
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_LOCAL1	TokenNameIdentifier	 LOG  LOCA L1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"LOCAL2"	TokenNameStringLiteral	LOCAL2
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_LOCAL2	TokenNameIdentifier	 LOG  LOCA L2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"LOCAL3"	TokenNameStringLiteral	LOCAL3
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_LOCAL3	TokenNameIdentifier	 LOG  LOCA L3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"LOCAL4"	TokenNameStringLiteral	LOCAL4
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_LOCAL4	TokenNameIdentifier	 LOG  LOCA L4
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"LOCAL5"	TokenNameStringLiteral	LOCAL5
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_LOCAL5	TokenNameIdentifier	 LOG  LOCA L5
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"LOCAL6"	TokenNameStringLiteral	LOCAL6
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_LOCAL6	TokenNameIdentifier	 LOG  LOCA L6
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
"LOCAL7"	TokenNameStringLiteral	LOCAL7
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LOG_LOCAL7	TokenNameIdentifier	 LOG  LOCA L7
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
splitPacket	TokenNameIdentifier	 split Packet
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
byteCount	TokenNameIdentifier	 byte Count
=	TokenNameEQUAL	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// if packet is less than RFC 3164 limit 	TokenNameCOMMENT_LINE	if packet is less than RFC 3164 limit 
// of 1024 bytes, then write it 	TokenNameCOMMENT_LINE	of 1024 bytes, then write it 
// (must allow for up 5to 5 characters in the PRI section 	TokenNameCOMMENT_LINE	(must allow for up 5to 5 characters in the PRI section 
// added by SyslogQuietWriter) 	TokenNameCOMMENT_LINE	added by SyslogQuietWriter) 
if	TokenNameif	
(	TokenNameLPAREN	
byteCount	TokenNameIdentifier	 byte Count
<=	TokenNameLESS_EQUAL	
1019	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sqw	TokenNameIdentifier	 sqw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
split	TokenNameIdentifier	 split
=	TokenNameEQUAL	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
splitPacket	TokenNameIdentifier	 split Packet
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
split	TokenNameIdentifier	 split
)	TokenNameRPAREN	
+	TokenNamePLUS	
"..."	TokenNameStringLiteral	...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
splitPacket	TokenNameIdentifier	 split Packet
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
header	TokenNameIdentifier	 header
+	TokenNamePLUS	
"..."	TokenNameStringLiteral	...
+	TokenNamePLUS	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
split	TokenNameIdentifier	 split
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isAsSevereAsThreshold	TokenNameIdentifier	 is As Severe As Threshold
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// We must not attempt to append if sqw is null. 	TokenNameCOMMENT_LINE	We must not attempt to append if sqw is null. 
if	TokenNameif	
(	TokenNameLPAREN	
sqw	TokenNameIdentifier	 sqw
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"No syslog host is set for SyslogAppedender named ""	TokenNameStringLiteral	No syslog host is set for SyslogAppedender named "
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
""."	TokenNameStringLiteral	".
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
layoutHeaderChecked	TokenNameIdentifier	 layout Header Checked
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sendLayoutMessage	TokenNameIdentifier	 send Layout Message
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
layoutHeaderChecked	TokenNameIdentifier	 layout Header Checked
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
hdr	TokenNameIdentifier	 hdr
=	TokenNameEQUAL	
getPacketHeader	TokenNameIdentifier	 get Packet Header
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
timeStamp	TokenNameIdentifier	 time Stamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
packet	TokenNameIdentifier	 packet
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
packet	TokenNameIdentifier	 packet
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
packet	TokenNameIdentifier	 packet
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
facilityPrinting	TokenNameIdentifier	 facility Printing
||	TokenNameOR_OR	
hdr	TokenNameIdentifier	 hdr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
hdr	TokenNameIdentifier	 hdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
facilityPrinting	TokenNameIdentifier	 facility Printing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
facilityStr	TokenNameIdentifier	 facility Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
packet	TokenNameIdentifier	 packet
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sqw	TokenNameIdentifier	 sqw
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSyslogEquivalent	TokenNameIdentifier	 get Syslog Equivalent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// if message has a remote likelihood of exceeding 1024 bytes 	TokenNameCOMMENT_LINE	if message has a remote likelihood of exceeding 1024 bytes 
// when encoded, consider splitting message into multiple packets 	TokenNameCOMMENT_LINE	when encoded, consider splitting message into multiple packets 
if	TokenNameif	
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitPacket	TokenNameIdentifier	 split Packet
(	TokenNameLPAREN	
hdr	TokenNameIdentifier	 hdr
,	TokenNameCOMMA	
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sqw	TokenNameIdentifier	 sqw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
ignoresThrowable	TokenNameIdentifier	 ignores Throwable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sqw	TokenNameIdentifier	 sqw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
hdr	TokenNameIdentifier	 hdr
+	TokenNamePLUS	
TAB	TokenNameIdentifier	 TAB
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sqw	TokenNameIdentifier	 sqw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
hdr	TokenNameIdentifier	 hdr
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This method returns immediately as options are activated when they are set. */	TokenNameCOMMENT_JAVADOC	 This method returns immediately as options are activated when they are set. 
public	TokenNamepublic	
void	TokenNamevoid	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLocalHostname	TokenNameIdentifier	 get Local Hostname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sendLayoutMessage	TokenNameIdentifier	 send Layout Message
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
layoutHeaderChecked	TokenNameIdentifier	 layout Header Checked
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The SyslogAppender requires a layout. Hence, this method returns <code>true</code>. @since 0.8.4 */	TokenNameCOMMENT_JAVADOC	 The SyslogAppender requires a layout. Hence, this method returns <code>true</code>. @since 0.8.4 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresLayout	TokenNameIdentifier	 requires Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The <b>SyslogHost</b> option is the name of the the syslog host where log output should go. A non-default port can be specified by appending a colon and port number to a host name, an IPv4 address or an IPv6 address enclosed in square brackets. <b>WARNING</b> If the SyslogHost is not set, then this appender will fail. */	TokenNameCOMMENT_JAVADOC	 The <b>SyslogHost</b> option is the name of the the syslog host where log output should go. A non-default port can be specified by appending a colon and port number to a host name, an IPv4 address or an IPv6 address enclosed in square brackets. <b>WARNING</b> If the SyslogHost is not set, then this appender will fail. 
public	TokenNamepublic	
void	TokenNamevoid	
setSyslogHost	TokenNameIdentifier	 set Syslog Host
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
syslogHost	TokenNameIdentifier	 syslog Host
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
sqw	TokenNameIdentifier	 sqw
=	TokenNameEQUAL	
new	TokenNamenew	
SyslogQuietWriter	TokenNameIdentifier	 Syslog Quiet Writer
(	TokenNameLPAREN	
new	TokenNamenew	
SyslogWriter	TokenNameIdentifier	 Syslog Writer
(	TokenNameLPAREN	
syslogHost	TokenNameIdentifier	 syslog Host
)	TokenNameRPAREN	
,	TokenNameCOMMA	
syslogFacility	TokenNameIdentifier	 syslog Facility
,	TokenNameCOMMA	
errorHandler	TokenNameIdentifier	 error Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//this.stp = new SyslogTracerPrintWriter(sqw); 	TokenNameCOMMENT_LINE	this.stp = new SyslogTracerPrintWriter(sqw); 
this	TokenNamethis	
.	TokenNameDOT	
syslogHost	TokenNameIdentifier	 syslog Host
=	TokenNameEQUAL	
syslogHost	TokenNameIdentifier	 syslog Host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value of the <b>SyslogHost</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>SyslogHost</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSyslogHost	TokenNameIdentifier	 get Syslog Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
syslogHost	TokenNameIdentifier	 syslog Host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set the syslog facility. This is the <b>Facility</b> option. <p>The <code>facilityName</code> parameter must be one of the strings KERN, USER, MAIL, DAEMON, AUTH, SYSLOG, LPR, NEWS, UUCP, CRON, AUTHPRIV, FTP, LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7. Case is unimportant. @since 0.8.1 */	TokenNameCOMMENT_JAVADOC	 Set the syslog facility. This is the <b>Facility</b> option. <p>The <code>facilityName</code> parameter must be one of the strings KERN, USER, MAIL, DAEMON, AUTH, SYSLOG, LPR, NEWS, UUCP, CRON, AUTHPRIV, FTP, LOCAL0, LOCAL1, LOCAL2, LOCAL3, LOCAL4, LOCAL5, LOCAL6, LOCAL7. Case is unimportant. @since 0.8.1 
public	TokenNamepublic	
void	TokenNamevoid	
setFacility	TokenNameIdentifier	 set Facility
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
syslogFacility	TokenNameIdentifier	 syslog Facility
=	TokenNameEQUAL	
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
facilityName	TokenNameIdentifier	 facility Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
syslogFacility	TokenNameIdentifier	 syslog Facility
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
facilityName	TokenNameIdentifier	 facility Name
+	TokenNamePLUS	
"] is an unknown syslog facility. Defaulting to [USER]."	TokenNameStringLiteral	] is an unknown syslog facility. Defaulting to [USER].
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syslogFacility	TokenNameIdentifier	 syslog Facility
=	TokenNameEQUAL	
LOG_USER	TokenNameIdentifier	 LOG  USER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
initSyslogFacilityStr	TokenNameIdentifier	 init Syslog Facility Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If there is already a sqw, make it use the new facility. 	TokenNameCOMMENT_LINE	If there is already a sqw, make it use the new facility. 
if	TokenNameif	
(	TokenNameLPAREN	
sqw	TokenNameIdentifier	 sqw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sqw	TokenNameIdentifier	 sqw
.	TokenNameDOT	
setSyslogFacility	TokenNameIdentifier	 set Syslog Facility
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
syslogFacility	TokenNameIdentifier	 syslog Facility
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the value of the <b>Facility</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>Facility</b> option. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFacility	TokenNameIdentifier	 get Facility
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFacilityString	TokenNameIdentifier	 get Facility String
(	TokenNameLPAREN	
syslogFacility	TokenNameIdentifier	 syslog Facility
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If the <b>FacilityPrinting</b> option is set to true, the printed message will include the facility name of the application. It is <em>false</em> by default. */	TokenNameCOMMENT_JAVADOC	 If the <b>FacilityPrinting</b> option is set to true, the printed message will include the facility name of the application. It is <em>false</em> by default. 
public	TokenNamepublic	
void	TokenNamevoid	
setFacilityPrinting	TokenNameIdentifier	 set Facility Printing
(	TokenNameLPAREN	
boolean	TokenNameboolean	
on	TokenNameIdentifier	 on
)	TokenNameRPAREN	
{	TokenNameLBRACE	
facilityPrinting	TokenNameIdentifier	 facility Printing
=	TokenNameEQUAL	
on	TokenNameIdentifier	 on
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the value of the <b>FacilityPrinting</b> option. */	TokenNameCOMMENT_JAVADOC	 Returns the value of the <b>FacilityPrinting</b> option. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFacilityPrinting	TokenNameIdentifier	 get Facility Printing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
facilityPrinting	TokenNameIdentifier	 facility Printing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If true, the appender will generate the HEADER part (that is, timestamp and host name) * of the syslog packet. Default value is false for compatibility with existing behavior, * however should be true unless there is a specific justification. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 If true, the appender will generate the HEADER part (that is, timestamp and host name) of the syslog packet. Default value is false for compatibility with existing behavior, however should be true unless there is a specific justification. @since 1.2.15 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
header	TokenNameIdentifier	 header
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the appender produces the HEADER part (that is, timestamp and host name) * of the syslog packet. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Returns whether the appender produces the HEADER part (that is, timestamp and host name) of the syslog packet. @since 1.2.15 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setHeader	TokenNameIdentifier	 set Header
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the host name used to identify this appender. * @return local host name * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Get the host name used to identify this appender. @return local host name @since 1.2.15 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getLocalHostname	TokenNameIdentifier	 get Local Hostname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localHostname	TokenNameIdentifier	 local Hostname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InetAddress	TokenNameIdentifier	 Inet Address
addr	TokenNameIdentifier	 addr
=	TokenNameEQUAL	
InetAddress	TokenNameIdentifier	 Inet Address
.	TokenNameDOT	
getLocalHost	TokenNameIdentifier	 get Local Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localHostname	TokenNameIdentifier	 local Hostname
=	TokenNameEQUAL	
addr	TokenNameIdentifier	 addr
.	TokenNameDOT	
getHostName	TokenNameIdentifier	 get Host Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
uhe	TokenNameIdentifier	 uhe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
localHostname	TokenNameIdentifier	 local Hostname
=	TokenNameEQUAL	
"UNKNOWN_HOST"	TokenNameStringLiteral	UNKNOWN_HOST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
localHostname	TokenNameIdentifier	 local Hostname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets HEADER portion of packet. * @param timeStamp number of milliseconds after the standard base time. * @return HEADER portion of packet, will be zero-length string if header is false. * @since 1.2.15 */	TokenNameCOMMENT_JAVADOC	 Gets HEADER portion of packet. @param timeStamp number of milliseconds after the standard base time. @return HEADER portion of packet, will be zero-length string if header is false. @since 1.2.15 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getPacketHeader	TokenNameIdentifier	 get Packet Header
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
timeStamp	TokenNameIdentifier	 time Stamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
dateFormat	TokenNameIdentifier	 date Format
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
timeStamp	TokenNameIdentifier	 time Stamp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// RFC 3164 says leading space, not leading zero on days 1-9 	TokenNameCOMMENT_LINE	RFC 3164 says leading space, not leading zero on days 1-9 
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getLocalHostname	TokenNameIdentifier	 get Local Hostname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set header or footer of layout. * @param msg message body, may not be null. */	TokenNameCOMMENT_JAVADOC	 Set header or footer of layout. @param msg message body, may not be null. 
private	TokenNameprivate	
void	TokenNamevoid	
sendLayoutMessage	TokenNameIdentifier	 send Layout Message
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sqw	TokenNameIdentifier	 sqw
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
packet	TokenNameIdentifier	 packet
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
hdr	TokenNameIdentifier	 hdr
=	TokenNameEQUAL	
getPacketHeader	TokenNameIdentifier	 get Packet Header
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
facilityPrinting	TokenNameIdentifier	 facility Printing
||	TokenNameOR_OR	
hdr	TokenNameIdentifier	 hdr
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
hdr	TokenNameIdentifier	 hdr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
facilityPrinting	TokenNameIdentifier	 facility Printing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
facilityStr	TokenNameIdentifier	 facility Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
packet	TokenNameIdentifier	 packet
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sqw	TokenNameIdentifier	 sqw
.	TokenNameDOT	
setLevel	TokenNameIdentifier	 set Level
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sqw	TokenNameIdentifier	 sqw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
