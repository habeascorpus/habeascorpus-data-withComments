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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
UnresolvedPermission	TokenNameIdentifier	 Unresolved Permission
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
BuildException	TokenNameIdentifier	 Build Exception
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
/** * This class implements a security manager meant for usage by tasks that run inside the * Ant VM. An examples are the Java Task and JUnitTask. * * The basic functionality is that nothing (except for a base set of permissions) is allowed, unless * the permission is granted either explicitly or implicitly. * If a permission is granted this can be overruled by explicitly revoking the permission. * * It is not permissible to add permissions (either granted or revoked) while the Security Manager * is active (after calling setSecurityManager() but before calling restoreSecurityManager()). * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 This class implements a security manager meant for usage by tasks that run inside the Ant VM. An examples are the Java Task and JUnitTask. * The basic functionality is that nothing (except for a base set of permissions) is allowed, unless the permission is granted either explicitly or implicitly. If a permission is granted this can be overruled by explicitly revoking the permission. * It is not permissible to add permissions (either granted or revoked) while the Security Manager is active (after calling setSecurityManager() but before calling restoreSecurityManager()). * @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
Permissions	TokenNameIdentifier	 Permissions
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
grantedPermissions	TokenNameIdentifier	 granted Permissions
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
revokedPermissions	TokenNameIdentifier	 revoked Permissions
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permissions	TokenNameIdentifier	 Permissions
granted	TokenNameIdentifier	 granted
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SecurityManager	TokenNameIdentifier	 Security Manager
origSm	TokenNameIdentifier	 orig Sm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
delegateToOldSM	TokenNameIdentifier	 delegate To Old SM
;	TokenNameSEMICOLON	
// Mandatory constructor for permission object. 	TokenNameCOMMENT_LINE	Mandatory constructor for permission object. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
PARAMS	TokenNameIdentifier	 PARAMS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Create a set of Permissions. Equivalent to calling * <code>new Permissions(false)</code>. */	TokenNameCOMMENT_JAVADOC	 Create a set of Permissions. Equivalent to calling <code>new Permissions(false)</code>. 
public	TokenNamepublic	
Permissions	TokenNameIdentifier	 Permissions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a set of permissions. * @param delegateToOldSM if <code>true</code> the old security manager * will be used if the permission has not been explicitly granted or revoked * in this instance. */	TokenNameCOMMENT_JAVADOC	 Create a set of permissions. @param delegateToOldSM if <code>true</code> the old security manager will be used if the permission has not been explicitly granted or revoked in this instance. 
public	TokenNamepublic	
Permissions	TokenNameIdentifier	 Permissions
(	TokenNameLPAREN	
boolean	TokenNameboolean	
delegateToOldSM	TokenNameIdentifier	 delegate To Old SM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
delegateToOldSM	TokenNameIdentifier	 delegate To Old SM
=	TokenNameEQUAL	
delegateToOldSM	TokenNameIdentifier	 delegate To Old SM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a permission to be granted. * @param perm The Permissions.Permission to be granted. */	TokenNameCOMMENT_JAVADOC	 Adds a permission to be granted. @param perm The Permissions.Permission to be granted. 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredGrant	TokenNameIdentifier	 add Configured Grant
(	TokenNameLPAREN	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grantedPermissions	TokenNameIdentifier	 granted Permissions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a permission to be revoked. * @param perm The Permissions.Permission to be revoked */	TokenNameCOMMENT_JAVADOC	 Adds a permission to be revoked. @param perm The Permissions.Permission to be revoked 
public	TokenNamepublic	
void	TokenNamevoid	
addConfiguredRevoke	TokenNameIdentifier	 add Configured Revoke
(	TokenNameLPAREN	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revokedPermissions	TokenNameIdentifier	 revoked Permissions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To be used by tasks wishing to use this security model before executing the part to be * subject to these Permissions. Note that setting the SecurityManager too early may * prevent your part from starting, as for instance changing classloaders may be prohibited. * The classloader for the new situation is supposed to be present. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 To be used by tasks wishing to use this security model before executing the part to be subject to these Permissions. Note that setting the SecurityManager too early may prevent your part from starting, as for instance changing classloaders may be prohibited. The classloader for the new situation is supposed to be present. @throws BuildException on error 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
origSm	TokenNameIdentifier	 orig Sm
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getSecurityManager	TokenNameIdentifier	 get Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
new	TokenNamenew	
MySM	TokenNameIdentifier	 My SM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the list of granted permissions, checks the list of revoked permissions. */	TokenNameCOMMENT_JAVADOC	 Initializes the list of granted permissions, checks the list of revoked permissions. 
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
granted	TokenNameIdentifier	 granted
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permissions	TokenNameIdentifier	 Permissions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
revokedPermissions	TokenNameIdentifier	 revoked Permissions
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Revoked permission "	TokenNameStringLiteral	Revoked permission 
+	TokenNamePLUS	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
" does not contain a class."	TokenNameStringLiteral	 does not contain a class.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
grantedPermissions	TokenNameIdentifier	 granted Permissions
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Granted permission "	TokenNameStringLiteral	Granted permission 
+	TokenNamePLUS	
p	TokenNameIdentifier	 p
+	TokenNamePLUS	
" does not contain a class."	TokenNameStringLiteral	 does not contain a class.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
createPermission	TokenNameIdentifier	 create Permission
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Add base set of permissions 	TokenNameCOMMENT_LINE	Add base set of permissions 
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
SocketPermission	TokenNameIdentifier	 Socket Permission
(	TokenNameLPAREN	
"localhost:1024-"	TokenNameStringLiteral	localhost:1024-
,	TokenNameCOMMA	
"listen"	TokenNameStringLiteral	listen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.vendor"	TokenNameStringLiteral	java.vendor
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.vendor.url"	TokenNameStringLiteral	java.vendor.url
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.class.version"	TokenNameStringLiteral	java.class.version
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"os.name"	TokenNameStringLiteral	os.name
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"os.version"	TokenNameStringLiteral	os.version
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"os.arch"	TokenNameStringLiteral	os.arch
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"file.encoding"	TokenNameStringLiteral	file.encoding
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"file.separator"	TokenNameStringLiteral	file.separator
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"path.separator"	TokenNameStringLiteral	path.separator
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"line.separator"	TokenNameStringLiteral	line.separator
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.specification.version"	TokenNameStringLiteral	java.specification.version
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.specification.vendor"	TokenNameStringLiteral	java.specification.vendor
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.specification.name"	TokenNameStringLiteral	java.specification.name
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.vm.specification.version"	TokenNameStringLiteral	java.vm.specification.version
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.vm.specification.vendor"	TokenNameStringLiteral	java.vm.specification.vendor
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.vm.specification.name"	TokenNameStringLiteral	java.vm.specification.name
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.vm.version"	TokenNameStringLiteral	java.vm.version
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.vm.vendor"	TokenNameStringLiteral	java.vm.vendor
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PropertyPermission	TokenNameIdentifier	 Property Permission
(	TokenNameLPAREN	
"java.vm.name"	TokenNameStringLiteral	java.vm.name
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
createPermission	TokenNameIdentifier	 create Permission
(	TokenNameLPAREN	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
permission	TokenNameIdentifier	 permission
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// First add explicitly already resolved permissions will not be 	TokenNameCOMMENT_LINE	First add explicitly already resolved permissions will not be 
// resolved when added as unresolved permission. 	TokenNameCOMMENT_LINE	resolved when added as unresolved permission. 
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
permission	TokenNameIdentifier	 permission
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
permission	TokenNameIdentifier	 permission
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
actions	TokenNameIdentifier	 actions
=	TokenNameEQUAL	
permission	TokenNameIdentifier	 permission
.	TokenNameDOT	
getActions	TokenNameIdentifier	 get Actions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
ctr	TokenNameIdentifier	 ctr
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
PARAMS	TokenNameIdentifier	 PARAMS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
)	TokenNameRPAREN	
ctr	TokenNameIdentifier	 ctr
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
actions	TokenNameIdentifier	 actions
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Let the UnresolvedPermission handle it. 	TokenNameCOMMENT_LINE	Let the UnresolvedPermission handle it. 
return	TokenNamereturn	
new	TokenNamenew	
UnresolvedPermission	TokenNameIdentifier	 Unresolved Permission
(	TokenNameLPAREN	
permission	TokenNameIdentifier	 permission
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
permission	TokenNameIdentifier	 permission
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
permission	TokenNameIdentifier	 permission
.	TokenNameDOT	
getActions	TokenNameIdentifier	 get Actions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To be used by tasks that just finished executing the parts subject to these permissions. */	TokenNameCOMMENT_JAVADOC	 To be used by tasks that just finished executing the parts subject to these permissions. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
restoreSecurityManager	TokenNameIdentifier	 restore Security Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setSecurityManager	TokenNameIdentifier	 set Security Manager
(	TokenNameLPAREN	
origSm	TokenNameIdentifier	 orig Sm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This inner class implements the actual SecurityManager that can be used by tasks * supporting Permissions. */	TokenNameCOMMENT_JAVADOC	 This inner class implements the actual SecurityManager that can be used by tasks supporting Permissions. 
private	TokenNameprivate	
class	TokenNameclass	
MySM	TokenNameIdentifier	 My SM
extends	TokenNameextends	
SecurityManager	TokenNameIdentifier	 Security Manager
{	TokenNameLBRACE	
/** * Exit is treated in a special way in order to be able to return the exit code * towards tasks. * An ExitException is thrown instead of a simple SecurityException to indicate the exit * code. * Overridden from java.lang.SecurityManager * @param status The exit status requested. */	TokenNameCOMMENT_JAVADOC	 Exit is treated in a special way in order to be able to return the exit code towards tasks. An ExitException is thrown instead of a simple SecurityException to indicate the exit code. Overridden from java.lang.SecurityManager @param status The exit status requested. 
public	TokenNamepublic	
void	TokenNamevoid	
checkExit	TokenNameIdentifier	 check Exit
(	TokenNameLPAREN	
int	TokenNameint	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
RuntimePermission	TokenNameIdentifier	 Runtime Permission
(	TokenNameLPAREN	
"exitVM"	TokenNameStringLiteral	exitVM
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
checkPermission	TokenNameIdentifier	 check Permission
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ExitException	TokenNameIdentifier	 Exit Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The central point in checking permissions. * Overridden from java.lang.SecurityManager * * @param perm The permission requested. */	TokenNameCOMMENT_JAVADOC	 The central point in checking permissions. Overridden from java.lang.SecurityManager * @param perm The permission requested. 
public	TokenNamepublic	
void	TokenNamevoid	
checkPermission	TokenNameIdentifier	 check Permission
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
delegateToOldSM	TokenNameIdentifier	 delegate To Old SM
&&	TokenNameAND_AND	
!	TokenNameNOT	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"exitVM"	TokenNameStringLiteral	exitVM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
permOK	TokenNameIdentifier	 perm OK
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
implies	TokenNameIdentifier	 implies
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
permOK	TokenNameIdentifier	 perm OK
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkRevoked	TokenNameIdentifier	 check Revoked
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* if the permission was not explicitly granted or revoked the original security manager will do its work */	TokenNameCOMMENT_BLOCK	 if the permission was not explicitly granted or revoked the original security manager will do its work 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
permOK	TokenNameIdentifier	 perm OK
&&	TokenNameAND_AND	
origSm	TokenNameIdentifier	 orig Sm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
origSm	TokenNameIdentifier	 orig Sm
.	TokenNameDOT	
checkPermission	TokenNameIdentifier	 check Permission
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
granted	TokenNameIdentifier	 granted
.	TokenNameDOT	
implies	TokenNameIdentifier	 implies
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SecurityException	TokenNameIdentifier	 Security Exception
(	TokenNameLPAREN	
"Permission "	TokenNameStringLiteral	Permission 
+	TokenNamePLUS	
perm	TokenNameIdentifier	 perm
+	TokenNamePLUS	
" was not granted."	TokenNameStringLiteral	 was not granted.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkRevoked	TokenNameIdentifier	 check Revoked
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * throws an exception if this permission is revoked * @param perm the permission being checked */	TokenNameCOMMENT_JAVADOC	 throws an exception if this permission is revoked @param perm the permission being checked 
private	TokenNameprivate	
void	TokenNamevoid	
checkRevoked	TokenNameIdentifier	 check Revoked
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
revokedPermissions	TokenNameIdentifier	 revoked Permissions
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Permissions	TokenNameIdentifier	 Permissions
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SecurityException	TokenNameIdentifier	 Security Exception
(	TokenNameLPAREN	
"Permission "	TokenNameStringLiteral	Permission 
+	TokenNamePLUS	
perm	TokenNameIdentifier	 perm
+	TokenNamePLUS	
" was revoked."	TokenNameStringLiteral	 was revoked.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Represents a permission. */	TokenNameCOMMENT_JAVADOC	 Represents a permission. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Permission	TokenNameIdentifier	 Permission
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
actionString	TokenNameIdentifier	 action String
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
actions	TokenNameIdentifier	 actions
;	TokenNameSEMICOLON	
/** * Set the class, mandatory. * @param aClass The class name of the permission. */	TokenNameCOMMENT_JAVADOC	 Set the class, mandatory. @param aClass The class name of the permission. 
public	TokenNamepublic	
void	TokenNamevoid	
setClass	TokenNameIdentifier	 set Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aClass	TokenNameIdentifier	 a Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
aClass	TokenNameIdentifier	 a Class
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the class of the permission. * @return The class name of the permission. */	TokenNameCOMMENT_JAVADOC	 Get the class of the permission. @return The class name of the permission. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the name of the permission. * @param aName The name of the permission. */	TokenNameCOMMENT_JAVADOC	 Set the name of the permission. @param aName The name of the permission. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aName	TokenNameIdentifier	 a Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
aName	TokenNameIdentifier	 a Name
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the permission. * @return The name of the permission. */	TokenNameCOMMENT_JAVADOC	 Get the name of the permission. @return The name of the permission. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the actions. * @param actions The actions of the permission. */	TokenNameCOMMENT_JAVADOC	 Set the actions. @param actions The actions of the permission. 
public	TokenNamepublic	
void	TokenNamevoid	
setActions	TokenNameIdentifier	 set Actions
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
actions	TokenNameIdentifier	 actions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actionString	TokenNameIdentifier	 action String
=	TokenNameEQUAL	
actions	TokenNameIdentifier	 actions
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
actions	TokenNameIdentifier	 actions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
actions	TokenNameIdentifier	 actions
=	TokenNameEQUAL	
parseActions	TokenNameIdentifier	 parse Actions
(	TokenNameLPAREN	
actions	TokenNameIdentifier	 actions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the actions. * @return The actions of the permission. */	TokenNameCOMMENT_JAVADOC	 Get the actions. @return The actions of the permission. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getActions	TokenNameIdentifier	 get Actions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
actionString	TokenNameIdentifier	 action String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Learn whether the permission matches in case of a revoked permission. * @param perm The permission to check against. */	TokenNameCOMMENT_JAVADOC	 Learn whether the permission matches in case of a revoked permission. @param perm The permission to check against. 
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
perm	TokenNameIdentifier	 perm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"*"	TokenNameStringLiteral	*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
actions	TokenNameIdentifier	 actions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
as	TokenNameIdentifier	 as
=	TokenNameEQUAL	
parseActions	TokenNameIdentifier	 parse Actions
(	TokenNameLPAREN	
perm	TokenNameIdentifier	 perm
.	TokenNameDOT	
getActions	TokenNameIdentifier	 get Actions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
actions	TokenNameIdentifier	 actions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// None of the actions revoked, so all allowed. 	TokenNameCOMMENT_LINE	None of the actions revoked, so all allowed. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the actions into a set of separate strings. * @param actions The actions to be parsed. */	TokenNameCOMMENT_JAVADOC	 Parses the actions into a set of separate strings. @param actions The actions to be parsed. 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
parseActions	TokenNameIdentifier	 parse Actions
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
actions	TokenNameIdentifier	 actions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tk	TokenNameIdentifier	 tk
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
actions	TokenNameIdentifier	 actions
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tk	TokenNameIdentifier	 tk
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
tk	TokenNameIdentifier	 tk
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a string description of the permissions. * @return string description of the permissions. */	TokenNameCOMMENT_JAVADOC	 Get a string description of the permissions. @return string description of the permissions. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
"Permission: "	TokenNameStringLiteral	Permission: 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
+	TokenNamePLUS	
" (""	TokenNameStringLiteral	 ("
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
"", ""	TokenNameStringLiteral	", "
+	TokenNamePLUS	
actions	TokenNameIdentifier	 actions
+	TokenNamePLUS	
"")"	TokenNameStringLiteral	")
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
