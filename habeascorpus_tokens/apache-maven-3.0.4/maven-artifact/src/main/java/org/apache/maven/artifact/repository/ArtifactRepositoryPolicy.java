package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Calendar	TokenNameIdentifier	 Calendar
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
TimeZone	TokenNameIdentifier	 Time Zone
;	TokenNameSEMICOLON	
/** * Describes a set of policies for a repository to use under certain conditions. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Describes a set of policies for a repository to use under certain conditions. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UPDATE_POLICY_NEVER	TokenNameIdentifier	 UPDATE  POLICY  NEVER
=	TokenNameEQUAL	
"never"	TokenNameStringLiteral	never
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UPDATE_POLICY_ALWAYS	TokenNameIdentifier	 UPDATE  POLICY  ALWAYS
=	TokenNameEQUAL	
"always"	TokenNameStringLiteral	always
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UPDATE_POLICY_DAILY	TokenNameIdentifier	 UPDATE  POLICY  DAILY
=	TokenNameEQUAL	
"daily"	TokenNameStringLiteral	daily
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UPDATE_POLICY_INTERVAL	TokenNameIdentifier	 UPDATE  POLICY  INTERVAL
=	TokenNameEQUAL	
"interval"	TokenNameStringLiteral	interval
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECKSUM_POLICY_FAIL	TokenNameIdentifier	 CHECKSUM  POLICY  FAIL
=	TokenNameEQUAL	
"fail"	TokenNameStringLiteral	fail
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECKSUM_POLICY_WARN	TokenNameIdentifier	 CHECKSUM  POLICY  WARN
=	TokenNameEQUAL	
"warn"	TokenNameStringLiteral	warn
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHECKSUM_POLICY_IGNORE	TokenNameIdentifier	 CHECKSUM  POLICY  IGNORE
=	TokenNameEQUAL	
"ignore"	TokenNameStringLiteral	ignore
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
enabled	TokenNameIdentifier	 enabled
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
updatePolicy	TokenNameIdentifier	 update Policy
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
checksumPolicy	TokenNameIdentifier	 checksum Policy
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
(	TokenNameLPAREN	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enabled	TokenNameIdentifier	 enabled
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
updatePolicy	TokenNameIdentifier	 update Policy
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
checksumPolicy	TokenNameIdentifier	 checksum Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
enabled	TokenNameIdentifier	 enabled
=	TokenNameEQUAL	
enabled	TokenNameIdentifier	 enabled
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
updatePolicy	TokenNameIdentifier	 update Policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updatePolicy	TokenNameIdentifier	 update Policy
=	TokenNameEQUAL	
UPDATE_POLICY_DAILY	TokenNameIdentifier	 UPDATE  POLICY  DAILY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
updatePolicy	TokenNameIdentifier	 update Policy
=	TokenNameEQUAL	
updatePolicy	TokenNameIdentifier	 update Policy
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
checksumPolicy	TokenNameIdentifier	 checksum Policy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checksumPolicy	TokenNameIdentifier	 checksum Policy
=	TokenNameEQUAL	
CHECKSUM_POLICY_WARN	TokenNameIdentifier	 CHECKSUM  POLICY  WARN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
checksumPolicy	TokenNameIdentifier	 checksum Policy
=	TokenNameEQUAL	
checksumPolicy	TokenNameIdentifier	 checksum Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEnabled	TokenNameIdentifier	 set Enabled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
enabled	TokenNameIdentifier	 enabled
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
enabled	TokenNameIdentifier	 enabled
=	TokenNameEQUAL	
enabled	TokenNameIdentifier	 enabled
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUpdatePolicy	TokenNameIdentifier	 set Update Policy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
updatePolicy	TokenNameIdentifier	 update Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
updatePolicy	TokenNameIdentifier	 update Policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
updatePolicy	TokenNameIdentifier	 update Policy
=	TokenNameEQUAL	
updatePolicy	TokenNameIdentifier	 update Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setChecksumPolicy	TokenNameIdentifier	 set Checksum Policy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
checksumPolicy	TokenNameIdentifier	 checksum Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
checksumPolicy	TokenNameIdentifier	 checksum Policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
checksumPolicy	TokenNameIdentifier	 checksum Policy
=	TokenNameEQUAL	
checksumPolicy	TokenNameIdentifier	 checksum Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
enabled	TokenNameIdentifier	 enabled
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
updatePolicy	TokenNameIdentifier	 update Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
checksumPolicy	TokenNameIdentifier	 checksum Policy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
checkOutOfDate	TokenNameIdentifier	 check Out Of Date
(	TokenNameLPAREN	
Date	TokenNameIdentifier	 Date
lastModified	TokenNameIdentifier	 last Modified
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
checkForUpdates	TokenNameIdentifier	 check For Updates
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
UPDATE_POLICY_ALWAYS	TokenNameIdentifier	 UPDATE  POLICY  ALWAYS
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
updatePolicy	TokenNameIdentifier	 update Policy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkForUpdates	TokenNameIdentifier	 check For Updates
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
UPDATE_POLICY_DAILY	TokenNameIdentifier	 UPDATE  POLICY  DAILY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
updatePolicy	TokenNameIdentifier	 update Policy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get local midnight boundary 	TokenNameCOMMENT_LINE	Get local midnight boundary 
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
HOUR_OF_DAY	TokenNameIdentifier	 HOUR  OF  DAY
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
SECOND	TokenNameIdentifier	 SECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MILLISECOND	TokenNameIdentifier	 MILLISECOND
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
after	TokenNameIdentifier	 after
(	TokenNameLPAREN	
lastModified	TokenNameIdentifier	 last Modified
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkForUpdates	TokenNameIdentifier	 check For Updates
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
updatePolicy	TokenNameIdentifier	 update Policy
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
UPDATE_POLICY_INTERVAL	TokenNameIdentifier	 UPDATE  POLICY  INTERVAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
updatePolicy	TokenNameIdentifier	 update Policy
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
UPDATE_POLICY_INTERVAL	TokenNameIdentifier	 UPDATE  POLICY  INTERVAL
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
minutes	TokenNameIdentifier	 minutes
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Calendar	TokenNameIdentifier	 Calendar
cal	TokenNameIdentifier	 cal
=	TokenNameEQUAL	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Calendar	TokenNameIdentifier	 Calendar
.	TokenNameDOT	
MINUTE	TokenNameIdentifier	 MINUTE
,	TokenNameCOMMA	
-	TokenNameMINUS	
minutes	TokenNameIdentifier	 minutes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cal	TokenNameIdentifier	 cal
.	TokenNameDOT	
getTime	TokenNameIdentifier	 get Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
after	TokenNameIdentifier	 after
(	TokenNameLPAREN	
lastModified	TokenNameIdentifier	 last Modified
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkForUpdates	TokenNameIdentifier	 check For Updates
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// else assume "never" 	TokenNameCOMMENT_LINE	else assume "never" 
return	TokenNamereturn	
checkForUpdates	TokenNameIdentifier	 check For Updates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"{enabled="	TokenNameStringLiteral	{enabled=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
enabled	TokenNameIdentifier	 enabled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", checksums="	TokenNameStringLiteral	, checksums=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
checksumPolicy	TokenNameIdentifier	 checksum Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", updates="	TokenNameStringLiteral	, updates=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
updatePolicy	TokenNameIdentifier	 update Policy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
isEnabled	TokenNameIdentifier	 is Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setEnabled	TokenNameIdentifier	 set Enabled
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ordinalOfChecksumPolicy	TokenNameIdentifier	 ordinal Of Checksum Policy
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
ordinalOfChecksumPolicy	TokenNameIdentifier	 ordinal Of Checksum Policy
(	TokenNameLPAREN	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setChecksumPolicy	TokenNameIdentifier	 set Checksum Policy
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getChecksumPolicy	TokenNameIdentifier	 get Checksum Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ordinalOfUpdatePolicy	TokenNameIdentifier	 ordinal Of Update Policy
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
ordinalOfUpdatePolicy	TokenNameIdentifier	 ordinal Of Update Policy
(	TokenNameLPAREN	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setUpdatePolicy	TokenNameIdentifier	 set Update Policy
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
getUpdatePolicy	TokenNameIdentifier	 get Update Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
ordinalOfChecksumPolicy	TokenNameIdentifier	 ordinal Of Checksum Policy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
.	TokenNameDOT	
CHECKSUM_POLICY_FAIL	TokenNameIdentifier	 CHECKSUM  POLICY  FAIL
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
.	TokenNameDOT	
CHECKSUM_POLICY_IGNORE	TokenNameIdentifier	 CHECKSUM  POLICY  IGNORE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
ordinalOfUpdatePolicy	TokenNameIdentifier	 ordinal Of Update Policy
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
.	TokenNameDOT	
UPDATE_POLICY_DAILY	TokenNameIdentifier	 UPDATE  POLICY  DAILY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1440	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
.	TokenNameDOT	
UPDATE_POLICY_ALWAYS	TokenNameIdentifier	 UPDATE  POLICY  ALWAYS
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
policy	TokenNameIdentifier	 policy
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
ArtifactRepositoryPolicy	TokenNameIdentifier	 Artifact Repository Policy
.	TokenNameDOT	
UPDATE_POLICY_INTERVAL	TokenNameIdentifier	 UPDATE  POLICY  INTERVAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
policy	TokenNameIdentifier	 policy
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
UPDATE_POLICY_INTERVAL	TokenNameIdentifier	 UPDATE  POLICY  INTERVAL
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
