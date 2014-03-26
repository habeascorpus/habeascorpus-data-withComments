/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
.	TokenNameDOT	
rhino	TokenNameIdentifier	 rhino
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FilePermission	TokenNameIdentifier	 File Permission
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLClassLoader	TokenNameIdentifier	 URL Class Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
AccessControlContext	TokenNameIdentifier	 Access Control Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
CodeSource	TokenNameIdentifier	 Code Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
Permission	TokenNameIdentifier	 Permission
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
PermissionCollection	TokenNameIdentifier	 Permission Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
ProtectionDomain	TokenNameIdentifier	 Protection Domain
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
cert	TokenNameIdentifier	 cert
.	TokenNameDOT	
Certificate	TokenNameIdentifier	 Certificate
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
GeneratedClassLoader	TokenNameIdentifier	 Generated Class Loader
;	TokenNameSEMICOLON	
/** * This class loader implementation will work whether or not the * documentURL is null. * * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: RhinoClassLoader.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class loader implementation will work whether or not the documentURL is null. * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: RhinoClassLoader.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
RhinoClassLoader	TokenNameIdentifier	 Rhino Class Loader
extends	TokenNameextends	
URLClassLoader	TokenNameIdentifier	 URL Class Loader
implements	TokenNameimplements	
GeneratedClassLoader	TokenNameIdentifier	 Generated Class Loader
{	TokenNameLBRACE	
/** * URL for the document referencing the script. */	TokenNameCOMMENT_JAVADOC	 URL for the document referencing the script. 
protected	TokenNameprotected	
URL	TokenNameIdentifier	 URL
documentURL	TokenNameIdentifier	 document URL
;	TokenNameSEMICOLON	
/** * CodeSource for classes defined by this loader */	TokenNameCOMMENT_JAVADOC	 CodeSource for classes defined by this loader 
protected	TokenNameprotected	
CodeSource	TokenNameIdentifier	 Code Source
codeSource	TokenNameIdentifier	 code Source
;	TokenNameSEMICOLON	
/** * The AccessControlContext which can be associated with * code loaded by this class loader if it was running * stand-alone (i.e., not invoked by code with lesser * priviledges). */	TokenNameCOMMENT_JAVADOC	 The AccessControlContext which can be associated with code loaded by this class loader if it was running stand-alone (i.e., not invoked by code with lesser priviledges). 
protected	TokenNameprotected	
AccessControlContext	TokenNameIdentifier	 Access Control Context
rhinoAccessControlContext	TokenNameIdentifier	 rhino Access Control Context
;	TokenNameSEMICOLON	
/** * Constructor. * @param documentURL the URL from which to load classes and resources * @param parent the parent class loader for delegation */	TokenNameCOMMENT_JAVADOC	 Constructor. @param documentURL the URL from which to load classes and resources @param parent the parent class loader for delegation 
public	TokenNamepublic	
RhinoClassLoader	TokenNameIdentifier	 Rhino Class Loader
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
documentURL	TokenNameIdentifier	 document URL
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
documentURL	TokenNameIdentifier	 document URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
documentURL	TokenNameIdentifier	 document URL
}	TokenNameRBRACE	
:	TokenNameCOLON	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
documentURL	TokenNameIdentifier	 document URL
=	TokenNameEQUAL	
documentURL	TokenNameIdentifier	 document URL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
documentURL	TokenNameIdentifier	 document URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
codeSource	TokenNameIdentifier	 code Source
=	TokenNameEQUAL	
new	TokenNamenew	
CodeSource	TokenNameIdentifier	 Code Source
(	TokenNameLPAREN	
documentURL	TokenNameIdentifier	 document URL
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Certificate	TokenNameIdentifier	 Certificate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Create the Rhino ProtectionDomain 	TokenNameCOMMENT_LINE	Create the Rhino ProtectionDomain 
// and AccessControlContext 	TokenNameCOMMENT_LINE	and AccessControlContext 
// 	TokenNameCOMMENT_LINE	 
ProtectionDomain	TokenNameIdentifier	 Protection Domain
rhinoProtectionDomain	TokenNameIdentifier	 rhino Protection Domain
=	TokenNameEQUAL	
new	TokenNamenew	
ProtectionDomain	TokenNameIdentifier	 Protection Domain
(	TokenNameLPAREN	
codeSource	TokenNameIdentifier	 code Source
,	TokenNameCOMMA	
getPermissions	TokenNameIdentifier	 get Permissions
(	TokenNameLPAREN	
codeSource	TokenNameIdentifier	 code Source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhinoAccessControlContext	TokenNameIdentifier	 rhino Access Control Context
=	TokenNameEQUAL	
new	TokenNamenew	
AccessControlContext	TokenNameIdentifier	 Access Control Context
(	TokenNameLPAREN	
new	TokenNamenew	
ProtectionDomain	TokenNameIdentifier	 Protection Domain
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rhinoProtectionDomain	TokenNameIdentifier	 rhino Protection Domain
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper, returns the URL array from the parent loader */	TokenNameCOMMENT_JAVADOC	 Helper, returns the URL array from the parent loader 
static	TokenNamestatic	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
ClassLoader	TokenNameIdentifier	 Class Loader
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
RhinoClassLoader	TokenNameIdentifier	 Rhino Class Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
documentURL	TokenNameIdentifier	 document URL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RhinoClassLoader	TokenNameIdentifier	 Rhino Class Loader
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
.	TokenNameDOT	
documentURL	TokenNameIdentifier	 document URL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
documentURL	TokenNameIdentifier	 document URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
documentURL	TokenNameIdentifier	 document URL
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Define and load a Java class */	TokenNameCOMMENT_JAVADOC	 Define and load a Java class 
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
defineClass	TokenNameIdentifier	 define Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
defineClass	TokenNameIdentifier	 define Class
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
codeSource	TokenNameIdentifier	 code Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Links the Java class. */	TokenNameCOMMENT_JAVADOC	 Links the Java class. 
public	TokenNamepublic	
void	TokenNamevoid	
linkClass	TokenNameIdentifier	 link Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
resolveClass	TokenNameIdentifier	 resolve Class
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the AccessControlContext which should be associated with * RhinoCode. */	TokenNameCOMMENT_JAVADOC	 Returns the AccessControlContext which should be associated with RhinoCode. 
public	TokenNamepublic	
AccessControlContext	TokenNameIdentifier	 Access Control Context
getAccessControlContext	TokenNameIdentifier	 get Access Control Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rhinoAccessControlContext	TokenNameIdentifier	 rhino Access Control Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the permissions for the given CodeSource object. * Compared to URLClassLoader, this adds a FilePermission so * that files under the same root directory as the document * can be read. */	TokenNameCOMMENT_JAVADOC	 Returns the permissions for the given CodeSource object. Compared to URLClassLoader, this adds a FilePermission so that files under the same root directory as the document can be read. 
protected	TokenNameprotected	
PermissionCollection	TokenNameIdentifier	 Permission Collection
getPermissions	TokenNameIdentifier	 get Permissions
(	TokenNameLPAREN	
CodeSource	TokenNameIdentifier	 Code Source
codesource	TokenNameIdentifier	 codesource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PermissionCollection	TokenNameIdentifier	 Permission Collection
perms	TokenNameIdentifier	 perms
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
codesource	TokenNameIdentifier	 codesource
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
perms	TokenNameIdentifier	 perms
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getPermissions	TokenNameIdentifier	 get Permissions
(	TokenNameLPAREN	
codesource	TokenNameIdentifier	 codesource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
documentURL	TokenNameIdentifier	 document URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
perms	TokenNameIdentifier	 perms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Permission	TokenNameIdentifier	 Permission
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Permission	TokenNameIdentifier	 Permission
dirPerm	TokenNameIdentifier	 dir Perm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
documentURL	TokenNameIdentifier	 document URL
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPermission	TokenNameIdentifier	 get Permission
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
instanceof	TokenNameinstanceof	
FilePermission	TokenNameIdentifier	 File Permission
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are dealing with a file, as we would expect 	TokenNameCOMMENT_LINE	We are dealing with a file, as we would expect 
// from a document file URL 	TokenNameCOMMENT_LINE	from a document file URL 
int	TokenNameint	
dirEnd	TokenNameIdentifier	 dir End
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dirEnd	TokenNameIdentifier	 dir End
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Include trailing file separator 	TokenNameCOMMENT_LINE	Include trailing file separator 
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dirEnd	TokenNameIdentifier	 dir End
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
+=	TokenNamePLUS_EQUAL	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
dirPerm	TokenNameIdentifier	 dir Perm
=	TokenNameEQUAL	
new	TokenNamenew	
FilePermission	TokenNameIdentifier	 File Permission
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
"read"	TokenNameStringLiteral	read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perms	TokenNameIdentifier	 perms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dirPerm	TokenNameIdentifier	 dir Perm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
perms	TokenNameIdentifier	 perms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
