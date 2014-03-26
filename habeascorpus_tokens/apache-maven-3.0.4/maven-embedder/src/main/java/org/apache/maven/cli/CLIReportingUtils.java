package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
cli	TokenNameIdentifier	 cli
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IOUtil	TokenNameIdentifier	 IO Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * Utility class used to report errors, statistics, application version info, etc. * * @author jdcasey * */	TokenNameCOMMENT_JAVADOC	 Utility class used to report errors, statistics, application version info, etc. * @author jdcasey 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CLIReportingUtils	TokenNameIdentifier	 CLI Reporting Utils
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
MB	TokenNameIdentifier	 MB
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MS_PER_SEC	TokenNameIdentifier	 MS  PER  SEC
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SEC_PER_MIN	TokenNameIdentifier	 SEC  PER  MIN
=	TokenNameEQUAL	
60	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUILD_VERSION_PROPERTY	TokenNameIdentifier	 BUILD  VERSION  PROPERTY
=	TokenNameEQUAL	
"version"	TokenNameStringLiteral	version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
showVersion	TokenNameIdentifier	 show Version
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
stdout	TokenNameIdentifier	 stdout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
getBuildProperties	TokenNameIdentifier	 get Build Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stdout	TokenNameIdentifier	 stdout
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
createMavenVersionString	TokenNameIdentifier	 create Maven Version String
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
shortName	TokenNameIdentifier	 short Name
=	TokenNameEQUAL	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"distributionShortName"	TokenNameStringLiteral	distributionShortName
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stdout	TokenNameIdentifier	 stdout
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
shortName	TokenNameIdentifier	 short Name
+	TokenNamePLUS	
" home: "	TokenNameStringLiteral	 home: 
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"maven.home"	TokenNameStringLiteral	maven.home
,	TokenNameCOMMA	
"<unknown maven home>"	TokenNameStringLiteral	<unknown maven home>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stdout	TokenNameIdentifier	 stdout
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Java version: "	TokenNameStringLiteral	Java version: 
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
,	TokenNameCOMMA	
"<unknown java version>"	TokenNameStringLiteral	<unknown java version>
)	TokenNameRPAREN	
+	TokenNamePLUS	
", vendor: "	TokenNameStringLiteral	, vendor: 
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.vendor"	TokenNameStringLiteral	java.vendor
,	TokenNameCOMMA	
"<unknown vendor>"	TokenNameStringLiteral	<unknown vendor>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stdout	TokenNameIdentifier	 stdout
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Java home: "	TokenNameStringLiteral	Java home: 
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.home"	TokenNameStringLiteral	java.home
,	TokenNameCOMMA	
"<unknown java home>"	TokenNameStringLiteral	<unknown java home>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stdout	TokenNameIdentifier	 stdout
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Default locale: "	TokenNameStringLiteral	Default locale: 
+	TokenNamePLUS	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", platform encoding: "	TokenNameStringLiteral	, platform encoding: 
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"file.encoding"	TokenNameStringLiteral	file.encoding
,	TokenNameCOMMA	
"<unknown encoding>"	TokenNameStringLiteral	<unknown encoding>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stdout	TokenNameIdentifier	 stdout
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"OS name: ""	TokenNameStringLiteral	OS name: "
+	TokenNamePLUS	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
OS_NAME	TokenNameIdentifier	 OS  NAME
+	TokenNamePLUS	
"", version: ""	TokenNameStringLiteral	", version: "
+	TokenNamePLUS	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
OS_VERSION	TokenNameIdentifier	 OS  VERSION
+	TokenNamePLUS	
"", arch: ""	TokenNameStringLiteral	", arch: "
+	TokenNamePLUS	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
OS_ARCH	TokenNameIdentifier	 OS  ARCH
+	TokenNamePLUS	
"", family: ""	TokenNameStringLiteral	", family: "
+	TokenNamePLUS	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
OS_FAMILY	TokenNameIdentifier	 OS  FAMILY
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a human readable string containing the Maven version, buildnumber, and time of build * * @param buildProperties The build properties * @return Readable build info */	TokenNameCOMMENT_JAVADOC	 Create a human readable string containing the Maven version, buildnumber, and time of build * @param buildProperties The build properties @return Readable build info 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
createMavenVersionString	TokenNameIdentifier	 create Maven Version String
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
buildProperties	TokenNameIdentifier	 build Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
buildProperties	TokenNameIdentifier	 build Properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"timestamp"	TokenNameStringLiteral	timestamp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
buildProperties	TokenNameIdentifier	 build Properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
BUILD_VERSION_PROPERTY	TokenNameIdentifier	 BUILD  VERSION  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rev	TokenNameIdentifier	 rev
=	TokenNameEQUAL	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
buildProperties	TokenNameIdentifier	 build Properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"buildNumber"	TokenNameStringLiteral	buildNumber
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
distributionName	TokenNameIdentifier	 distribution Name
=	TokenNameEQUAL	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
buildProperties	TokenNameIdentifier	 build Properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"distributionName"	TokenNameStringLiteral	distributionName
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
distributionName	TokenNameIdentifier	 distribution Name
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
version	TokenNameIdentifier	 version
:	TokenNameCOLON	
"<version unknown>"	TokenNameStringLiteral	<version unknown>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rev	TokenNameIdentifier	 rev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
timestamp	TokenNameIdentifier	 timestamp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
" ("	TokenNameStringLiteral	 (
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
rev	TokenNameIdentifier	 rev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"r"	TokenNameStringLiteral	r
+	TokenNamePLUS	
rev	TokenNameIdentifier	 rev
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
fmt	TokenNameIdentifier	 fmt
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
"yyyy-MM-dd HH:mm:ssZ"	TokenNameStringLiteral	yyyy-MM-dd HH:mm:ssZ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
fmt	TokenNameIdentifier	 fmt
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
rev	TokenNameIdentifier	 rev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"; "	TokenNameStringLiteral	; 
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
+	TokenNamePLUS	
ts	TokenNameIdentifier	 ts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"${"	TokenNameStringLiteral	${
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
stats	TokenNameIdentifier	 stats
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Date	TokenNameIdentifier	 Date
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
time	TokenNameIdentifier	 time
=	TokenNameEQUAL	
finish	TokenNameIdentifier	 finish
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Total time: "	TokenNameStringLiteral	Total time: 
+	TokenNamePLUS	
formatTime	TokenNameIdentifier	 format Time
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Finished at: "	TokenNameStringLiteral	Finished at: 
+	TokenNamePLUS	
finish	TokenNameIdentifier	 finish
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//noinspection CallToSystemGC 	TokenNameCOMMENT_LINE	noinspection CallToSystemGC 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
gc	TokenNameIdentifier	 gc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Runtime	TokenNameIdentifier	 Runtime
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Final Memory: "	TokenNameStringLiteral	Final Memory: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
totalMemory	TokenNameIdentifier	 total Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
MB	TokenNameIdentifier	 MB
+	TokenNamePLUS	
"M/"	TokenNameStringLiteral	M/
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
totalMemory	TokenNameIdentifier	 total Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
MB	TokenNameIdentifier	 MB
+	TokenNamePLUS	
"M"	TokenNameStringLiteral	M
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
formatTime	TokenNameIdentifier	 format Time
(	TokenNameLPAREN	
long	TokenNamelong	
ms	TokenNameIdentifier	 ms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
secs	TokenNameIdentifier	 secs
=	TokenNameEQUAL	
ms	TokenNameIdentifier	 ms
/	TokenNameDIVIDE	
MS_PER_SEC	TokenNameIdentifier	 MS  PER  SEC
;	TokenNameSEMICOLON	
long	TokenNamelong	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
secs	TokenNameIdentifier	 secs
/	TokenNameDIVIDE	
SEC_PER_MIN	TokenNameIdentifier	 SEC  PER  MIN
;	TokenNameSEMICOLON	
secs	TokenNameIdentifier	 secs
=	TokenNameEQUAL	
secs	TokenNameIdentifier	 secs
%	TokenNameREMAINDER	
SEC_PER_MIN	TokenNameIdentifier	 SEC  PER  MIN
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
+	TokenNamePLUS	
" minutes "	TokenNameStringLiteral	 minutes 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
"1 minute "	TokenNameStringLiteral	1 minute 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
secs	TokenNameIdentifier	 secs
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
secs	TokenNameIdentifier	 secs
+	TokenNamePLUS	
" seconds"	TokenNameStringLiteral	 seconds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
secs	TokenNameIdentifier	 secs
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"1 second"	TokenNameStringLiteral	1 second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
+=	TokenNamePLUS_EQUAL	
"< 1 second"	TokenNameStringLiteral	< 1 second
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getFormattedTime	TokenNameIdentifier	 get Formatted Time
(	TokenNameLPAREN	
long	TokenNamelong	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
"s.SSS's'"	TokenNameStringLiteral	s.SSS's'
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
/	TokenNameDIVIDE	
60000L	TokenNameLongLiteral	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
"m:s"	TokenNameStringLiteral	m:s
+	TokenNamePLUS	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
/	TokenNameDIVIDE	
3600000L	TokenNameLongLiteral	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
"H:m"	TokenNameStringLiteral	H:m
+	TokenNamePLUS	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DateFormat	TokenNameIdentifier	 Date Format
fmt	TokenNameIdentifier	 fmt
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleDateFormat	TokenNameIdentifier	 Simple Date Format
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fmt	TokenNameIdentifier	 fmt
.	TokenNameDOT	
setTimeZone	TokenNameIdentifier	 set Time Zone
(	TokenNameLPAREN	
TimeZone	TokenNameIdentifier	 Time Zone
.	TokenNameDOT	
getTimeZone	TokenNameIdentifier	 get Time Zone
(	TokenNameLPAREN	
"UTC"	TokenNameStringLiteral	UTC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fmt	TokenNameIdentifier	 fmt
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
time	TokenNameIdentifier	 time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Properties	TokenNameIdentifier	 Properties
getBuildProperties	TokenNameIdentifier	 get Build Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
resourceAsStream	TokenNameIdentifier	 resource As Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
resourceAsStream	TokenNameIdentifier	 resource As Stream
=	TokenNameEQUAL	
MavenCli	TokenNameIdentifier	 Maven Cli
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
"/org/apache/maven/messages/build.properties"	TokenNameStringLiteral	/org/apache/maven/messages/build.properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
resourceAsStream	TokenNameIdentifier	 resource As Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
resourceAsStream	TokenNameIdentifier	 resource As Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Unable determine version from JAR file: "	TokenNameStringLiteral	Unable determine version from JAR file: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
resourceAsStream	TokenNameIdentifier	 resource As Stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
properties	TokenNameIdentifier	 properties
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
showError	TokenNameIdentifier	 show Error
(	TokenNameLPAREN	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
boolean	TokenNameboolean	
showStackTrace	TokenNameIdentifier	 show Stack Trace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStreamLogger	TokenNameIdentifier	 Print Stream Logger
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
showStackTrace	TokenNameIdentifier	 show Stack Trace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cause	TokenNameIdentifier	 cause
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
cause	TokenNameIdentifier	 cause
=	TokenNameEQUAL	
cause	TokenNameIdentifier	 cause
.	TokenNameDOT	
getCause	TokenNameIdentifier	 get Cause
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Caused by: "	TokenNameStringLiteral	Caused by: 
+	TokenNamePLUS	
cause	TokenNameIdentifier	 cause
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
