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
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
ExitException	TokenNameIdentifier	 Exit Exception
;	TokenNameSEMICOLON	
/** * JUnit 3 testcases for org.apache.tools.ant.types.Permissions. * */	TokenNameCOMMENT_JAVADOC	 JUnit 3 testcases for org.apache.tools.ant.types.Permissions. 
public	TokenNamepublic	
class	TokenNameclass	
PermissionsTest	TokenNameIdentifier	 Permissions Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
Permissions	TokenNameIdentifier	 Permissions
perms	TokenNameIdentifier	 perms
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PermissionsTest	TokenNameIdentifier	 Permissions Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
=	TokenNameEQUAL	
new	TokenNamenew	
Permissions	TokenNameIdentifier	 Permissions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
new	TokenNamenew	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Grant extra permissions to read and write the user.* properties and read to the 	TokenNameCOMMENT_LINE	Grant extra permissions to read and write the user.* properties and read to the 
// java.home property 	TokenNameCOMMENT_LINE	java.home property 
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setActions	TokenNameIdentifier	 set Actions
(	TokenNameLPAREN	
"read, write"	TokenNameStringLiteral	read, write
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"user.*"	TokenNameStringLiteral	user.*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
"java.util.PropertyPermission"	TokenNameStringLiteral	java.util.PropertyPermission
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
addConfiguredGrant	TokenNameIdentifier	 add Configured Grant
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
new	TokenNamenew	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setActions	TokenNameIdentifier	 set Actions
(	TokenNameLPAREN	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"java.home"	TokenNameStringLiteral	java.home
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
"java.util.PropertyPermission"	TokenNameStringLiteral	java.util.PropertyPermission
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
addConfiguredGrant	TokenNameIdentifier	 add Configured Grant
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
new	TokenNamenew	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setActions	TokenNameIdentifier	 set Actions
(	TokenNameLPAREN	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"file.encoding"	TokenNameStringLiteral	file.encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
"java.util.PropertyPermission"	TokenNameStringLiteral	java.util.PropertyPermission
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
addConfiguredGrant	TokenNameIdentifier	 add Configured Grant
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Revoke permission to write user.home (granted above via user.*), still able to read though. 	TokenNameCOMMENT_LINE	Revoke permission to write user.home (granted above via user.*), still able to read though. 
// and the default granted permission to read os.name. 	TokenNameCOMMENT_LINE	and the default granted permission to read os.name. 
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
new	TokenNamenew	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setActions	TokenNameIdentifier	 set Actions
(	TokenNameLPAREN	
"write"	TokenNameStringLiteral	write
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"user.home"	TokenNameStringLiteral	user.home
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
"java.util.PropertyPermission"	TokenNameStringLiteral	java.util.PropertyPermission
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
addConfiguredRevoke	TokenNameIdentifier	 add Configured Revoke
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
new	TokenNamenew	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setActions	TokenNameIdentifier	 set Actions
(	TokenNameLPAREN	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
"os.*"	TokenNameStringLiteral	os.*
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
"java.util.PropertyPermission"	TokenNameStringLiteral	java.util.PropertyPermission
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
addConfiguredRevoke	TokenNameIdentifier	 add Configured Revoke
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests a permission that is granted per default. */	TokenNameCOMMENT_JAVADOC	 Tests a permission that is granted per default. 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultGranted	TokenNameIdentifier	 test Default Granted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
restoreSecurityManager	TokenNameIdentifier	 restore Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Tests a permission that has been granted later via wildcard. */	TokenNameCOMMENT_JAVADOC	 Tests a permission that has been granted later via wildcard. 
public	TokenNamepublic	
void	TokenNamevoid	
testGranted	TokenNameIdentifier	 test Granted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.name"	TokenNameStringLiteral	user.name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"user.name"	TokenNameStringLiteral	user.name
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
restoreSecurityManager	TokenNameIdentifier	 restore Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Tests a permission that has been granted and revoked later. */	TokenNameCOMMENT_JAVADOC	 Tests a permission that has been granted and revoked later. 
public	TokenNamepublic	
void	TokenNamevoid	
testGrantedAndRevoked	TokenNameIdentifier	 test Granted And Revoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"user.home"	TokenNameStringLiteral	user.home
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"user.home"	TokenNameStringLiteral	user.home
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Could perform an action that should have been forbidden."	TokenNameStringLiteral	Could perform an action that should have been forbidden.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Was expected, test passes 	TokenNameCOMMENT_LINE	Was expected, test passes 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
restoreSecurityManager	TokenNameIdentifier	 restore Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Tests a permission that is granted as per default but revoked later via wildcard. */	TokenNameCOMMENT_JAVADOC	 Tests a permission that is granted as per default but revoked later via wildcard. 
public	TokenNamepublic	
void	TokenNamevoid	
testDefaultRevoked	TokenNameIdentifier	 test Default Revoked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Could perform an action that should have been forbidden."	TokenNameStringLiteral	Could perform an action that should have been forbidden.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Was expected, test passes 	TokenNameCOMMENT_LINE	Was expected, test passes 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
restoreSecurityManager	TokenNameIdentifier	 restore Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Tests a permission that has not been granted or revoked. */	TokenNameCOMMENT_JAVADOC	 Tests a permission that has not been granted or revoked. 
public	TokenNamepublic	
void	TokenNamevoid	
testOther	TokenNameIdentifier	 test Other
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ls	TokenNameIdentifier	 ls
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
,	TokenNameCOMMA	
ls	TokenNameIdentifier	 ls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Could perform an action that should have been forbidden."	TokenNameStringLiteral	Could perform an action that should have been forbidden.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Was expected, test passes 	TokenNameCOMMENT_LINE	Was expected, test passes 
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
restoreSecurityManager	TokenNameIdentifier	 restore Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Tests an exit condition. */	TokenNameCOMMENT_JAVADOC	 Tests an exit condition. 
public	TokenNamepublic	
void	TokenNamevoid	
testExit	TokenNameIdentifier	 test Exit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"If this is the last line on standard out the testExit f.a.i.l.e.d"	TokenNameStringLiteral	If this is the last line on standard out the testExit f.a.i.l.e.d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Totaly impossible that this fail is ever executed. Please let me know if it is!"	TokenNameStringLiteral	Totaly impossible that this fail is ever executed. Please let me know if it is!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ExitException	TokenNameIdentifier	 Exit Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getStatus	TokenNameIdentifier	 get Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Received wrong exit status in Exit Exception."	TokenNameStringLiteral	Received wrong exit status in Exit Exception.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"testExit successful."	TokenNameStringLiteral	testExit successful.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
restoreSecurityManager	TokenNameIdentifier	 restore Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
