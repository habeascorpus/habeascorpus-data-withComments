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
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * A TarFileSet is a FileSet with extra attributes useful in the context of * Tar/Jar tasks. * * A TarFileSet extends FileSets with the ability to extract a subset of the * entries of a Tar file for inclusion in another Tar file. It also includes * a prefix attribute which is prepended to each entry in the output Tar file. * */	TokenNameCOMMENT_JAVADOC	 A TarFileSet is a FileSet with extra attributes useful in the context of Tar/Jar tasks. * A TarFileSet extends FileSets with the ability to extract a subset of the entries of a Tar file for inclusion in another Tar file. It also includes a prefix attribute which is prepended to each entry in the output Tar file. 
public	TokenNamepublic	
class	TokenNameclass	
TarFileSet	TokenNameIdentifier	 Tar File Set
extends	TokenNameextends	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
userNameSet	TokenNameIdentifier	 user Name Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
groupNameSet	TokenNameIdentifier	 group Name Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
userIdSet	TokenNameIdentifier	 user Id Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
groupIdSet	TokenNameIdentifier	 group Id Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
groupName	TokenNameIdentifier	 group Name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
uid	TokenNameIdentifier	 uid
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
gid	TokenNameIdentifier	 gid
;	TokenNameSEMICOLON	
/** Constructor for TarFileSet */	TokenNameCOMMENT_JAVADOC	 Constructor for TarFileSet 
public	TokenNamepublic	
TarFileSet	TokenNameIdentifier	 Tar File Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor using a fileset arguement. * @param fileset the fileset to use */	TokenNameCOMMENT_JAVADOC	 Constructor using a fileset arguement. @param fileset the fileset to use 
protected	TokenNameprotected	
TarFileSet	TokenNameIdentifier	 Tar File Set
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor using a tarfileset arguement. * @param fileset the tarfileset to use */	TokenNameCOMMENT_JAVADOC	 Constructor using a tarfileset arguement. @param fileset the tarfileset to use 
protected	TokenNameprotected	
TarFileSet	TokenNameIdentifier	 Tar File Set
(	TokenNameLPAREN	
TarFileSet	TokenNameIdentifier	 Tar File Set
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fileset	TokenNameIdentifier	 fileset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The username for the tar entry * This is not the same as the UID. * @param userName the user name for the tar entry. */	TokenNameCOMMENT_JAVADOC	 The username for the tar entry This is not the same as the UID. @param userName the user name for the tar entry. 
public	TokenNamepublic	
void	TokenNamevoid	
setUserName	TokenNameIdentifier	 set User Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkTarFileSetAttributesAllowed	TokenNameIdentifier	 check Tar File Set Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
userNameSet	TokenNameIdentifier	 user Name Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
userName	TokenNameIdentifier	 user Name
=	TokenNameEQUAL	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the user name for the tar entry */	TokenNameCOMMENT_JAVADOC	 @return the user name for the tar entry 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserName	TokenNameIdentifier	 get User Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TarFileSet	TokenNameIdentifier	 Tar File Set
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUserName	TokenNameIdentifier	 get User Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return whether the user name has been explicitly set. */	TokenNameCOMMENT_JAVADOC	 @return whether the user name has been explicitly set. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasUserNameBeenSet	TokenNameIdentifier	 has User Name Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userNameSet	TokenNameIdentifier	 user Name Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The uid for the tar entry * This is not the same as the User name. * @param uid the id of the user for the tar entry. */	TokenNameCOMMENT_JAVADOC	 The uid for the tar entry This is not the same as the User name. @param uid the id of the user for the tar entry. 
public	TokenNamepublic	
void	TokenNamevoid	
setUid	TokenNameIdentifier	 set Uid
(	TokenNameLPAREN	
int	TokenNameint	
uid	TokenNameIdentifier	 uid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkTarFileSetAttributesAllowed	TokenNameIdentifier	 check Tar File Set Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
userIdSet	TokenNameIdentifier	 user Id Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
uid	TokenNameIdentifier	 uid
=	TokenNameEQUAL	
uid	TokenNameIdentifier	 uid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the uid for the tar entry */	TokenNameCOMMENT_JAVADOC	 @return the uid for the tar entry 
public	TokenNamepublic	
int	TokenNameint	
getUid	TokenNameIdentifier	 get Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TarFileSet	TokenNameIdentifier	 Tar File Set
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getUid	TokenNameIdentifier	 get Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
uid	TokenNameIdentifier	 uid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return whether the user id has been explicitly set. */	TokenNameCOMMENT_JAVADOC	 @return whether the user id has been explicitly set. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasUserIdBeenSet	TokenNameIdentifier	 has User Id Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userIdSet	TokenNameIdentifier	 user Id Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The groupname for the tar entry; optional, default="" * This is not the same as the GID. * @param groupName the group name string. */	TokenNameCOMMENT_JAVADOC	 The groupname for the tar entry; optional, default="" This is not the same as the GID. @param groupName the group name string. 
public	TokenNamepublic	
void	TokenNamevoid	
setGroup	TokenNameIdentifier	 set Group
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupName	TokenNameIdentifier	 group Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkTarFileSetAttributesAllowed	TokenNameIdentifier	 check Tar File Set Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
groupNameSet	TokenNameIdentifier	 group Name Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupName	TokenNameIdentifier	 group Name
=	TokenNameEQUAL	
groupName	TokenNameIdentifier	 group Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the group name string. */	TokenNameCOMMENT_JAVADOC	 @return the group name string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGroup	TokenNameIdentifier	 get Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TarFileSet	TokenNameIdentifier	 Tar File Set
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGroup	TokenNameIdentifier	 get Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
groupName	TokenNameIdentifier	 group Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return whether the group name has been explicitly set. */	TokenNameCOMMENT_JAVADOC	 @return whether the group name has been explicitly set. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasGroupBeenSet	TokenNameIdentifier	 has Group Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupNameSet	TokenNameIdentifier	 group Name Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The GID for the tar entry; optional, default="0" * This is not the same as the group name. * @param gid the group id. */	TokenNameCOMMENT_JAVADOC	 The GID for the tar entry; optional, default="0" This is not the same as the group name. @param gid the group id. 
public	TokenNamepublic	
void	TokenNamevoid	
setGid	TokenNameIdentifier	 set Gid
(	TokenNameLPAREN	
int	TokenNameint	
gid	TokenNameIdentifier	 gid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkTarFileSetAttributesAllowed	TokenNameIdentifier	 check Tar File Set Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
groupIdSet	TokenNameIdentifier	 group Id Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gid	TokenNameIdentifier	 gid
=	TokenNameEQUAL	
gid	TokenNameIdentifier	 gid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the group identifier. */	TokenNameCOMMENT_JAVADOC	 @return the group identifier. 
public	TokenNamepublic	
int	TokenNameint	
getGid	TokenNameIdentifier	 get Gid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TarFileSet	TokenNameIdentifier	 Tar File Set
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGid	TokenNameIdentifier	 get Gid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
gid	TokenNameIdentifier	 gid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return whether the group id has been explicitly set. */	TokenNameCOMMENT_JAVADOC	 @return whether the group id has been explicitly set. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasGroupIdBeenSet	TokenNameIdentifier	 has Group Id Been Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupIdSet	TokenNameIdentifier	 group Id Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new scanner. * @return the created scanner. */	TokenNameCOMMENT_JAVADOC	 Create a new scanner. @return the created scanner. 
protected	TokenNameprotected	
ArchiveScanner	TokenNameIdentifier	 Archive Scanner
newArchiveScanner	TokenNameIdentifier	 new Archive Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TarScanner	TokenNameIdentifier	 Tar Scanner
zs	TokenNameIdentifier	 zs
=	TokenNameEQUAL	
new	TokenNamenew	
TarScanner	TokenNameIdentifier	 Tar Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
zs	TokenNameIdentifier	 zs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Makes this instance in effect a reference to another instance. * * <p>You must not set another attribute or nest elements inside * this element if you make it a reference.</p> * @param r the <code>Reference</code> to use. * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Makes this instance in effect a reference to another instance. * <p>You must not set another attribute or nest elements inside this element if you make it a reference.</p> @param r the <code>Reference</code> to use. @throws BuildException on error 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userNameSet	TokenNameIdentifier	 user Name Set
||	TokenNameOR_OR	
userIdSet	TokenNameIdentifier	 user Id Set
||	TokenNameOR_OR	
groupNameSet	TokenNameIdentifier	 group Name Set
||	TokenNameOR_OR	
groupIdSet	TokenNameIdentifier	 group Id Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
tooManyAttributes	TokenNameIdentifier	 too Many Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A TarFileset accepts another TarFileSet or a FileSet as reference * FileSets are often used by the war task for the lib attribute * @param p the project to use * @return the abstract fileset instance */	TokenNameCOMMENT_JAVADOC	 A TarFileset accepts another TarFileSet or a FileSet as reference FileSets are often used by the war task for the lib attribute @param p the project to use @return the abstract fileset instance 
protected	TokenNameprotected	
AbstractFileSet	TokenNameIdentifier	 Abstract File Set
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
TarFileSet	TokenNameIdentifier	 Tar File Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
AbstractFileSet	TokenNameIdentifier	 Abstract File Set
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TarFileSet	TokenNameIdentifier	 Tar File Set
zfs	TokenNameIdentifier	 zfs
=	TokenNameEQUAL	
new	TokenNamenew	
TarFileSet	TokenNameIdentifier	 Tar File Set
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FileSet	TokenNameIdentifier	 File Set
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
configureFileSet	TokenNameIdentifier	 configure File Set
(	TokenNameLPAREN	
zfs	TokenNameIdentifier	 zfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
zfs	TokenNameIdentifier	 zfs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRefId	TokenNameIdentifier	 get Ref Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" doesn't denote a tarfileset or a fileset"	TokenNameStringLiteral	 doesn't denote a tarfileset or a fileset
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Configure a fileset based on this fileset. * If the fileset is a TarFileSet copy in the tarfileset * specific attributes. * @param zfs the archive fileset to configure. */	TokenNameCOMMENT_JAVADOC	 Configure a fileset based on this fileset. If the fileset is a TarFileSet copy in the tarfileset specific attributes. @param zfs the archive fileset to configure. 
protected	TokenNameprotected	
void	TokenNamevoid	
configureFileSet	TokenNameIdentifier	 configure File Set
(	TokenNameLPAREN	
ArchiveFileSet	TokenNameIdentifier	 Archive File Set
zfs	TokenNameIdentifier	 zfs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
configureFileSet	TokenNameIdentifier	 configure File Set
(	TokenNameLPAREN	
zfs	TokenNameIdentifier	 zfs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
zfs	TokenNameIdentifier	 zfs
instanceof	TokenNameinstanceof	
TarFileSet	TokenNameIdentifier	 Tar File Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TarFileSet	TokenNameIdentifier	 Tar File Set
tfs	TokenNameIdentifier	 tfs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TarFileSet	TokenNameIdentifier	 Tar File Set
)	TokenNameRPAREN	
zfs	TokenNameIdentifier	 zfs
;	TokenNameSEMICOLON	
tfs	TokenNameIdentifier	 tfs
.	TokenNameDOT	
setUserName	TokenNameIdentifier	 set User Name
(	TokenNameLPAREN	
userName	TokenNameIdentifier	 user Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tfs	TokenNameIdentifier	 tfs
.	TokenNameDOT	
setGroup	TokenNameIdentifier	 set Group
(	TokenNameLPAREN	
groupName	TokenNameIdentifier	 group Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tfs	TokenNameIdentifier	 tfs
.	TokenNameDOT	
setUid	TokenNameIdentifier	 set Uid
(	TokenNameLPAREN	
uid	TokenNameIdentifier	 uid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tfs	TokenNameIdentifier	 tfs
.	TokenNameDOT	
setGid	TokenNameIdentifier	 set Gid
(	TokenNameLPAREN	
gid	TokenNameIdentifier	 gid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return a TarFileSet that has the same properties * as this one. * @return the cloned tarFileSet */	TokenNameCOMMENT_JAVADOC	 Return a TarFileSet that has the same properties as this one. @return the cloned tarFileSet 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TarFileSet	TokenNameIdentifier	 Tar File Set
)	TokenNameRPAREN	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A check attributes for TarFileSet. * If there is a reference, and * it is a TarFileSet, the tar fileset attributes * cannot be used. */	TokenNameCOMMENT_JAVADOC	 A check attributes for TarFileSet. If there is a reference, and it is a TarFileSet, the tar fileset attributes cannot be used. 
private	TokenNameprivate	
void	TokenNamevoid	
checkTarFileSetAttributesAllowed	TokenNameIdentifier	 check Tar File Set Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
getRefid	TokenNameIdentifier	 get Refid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getReferencedObject	TokenNameIdentifier	 get Referenced Object
(	TokenNameLPAREN	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
TarFileSet	TokenNameIdentifier	 Tar File Set
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
