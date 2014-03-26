/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
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
CodeSource	TokenNameIdentifier	 Code Source
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
Policy	TokenNameIdentifier	 Policy
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
/** * This <tt>ClassLoader</tt> implementation only grants permission to * connect back to the server from where the document referencing the * jar file was loaded. * * A <tt>URLClassLoader</tt> extension is needed in case the user * allows linked jar files to come from a different origin than * the document referencing them. * * @author <a mailto="vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: DocumentJarClassLoader.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This <tt>ClassLoader</tt> implementation only grants permission to connect back to the server from where the document referencing the jar file was loaded. * A <tt>URLClassLoader</tt> extension is needed in case the user allows linked jar files to come from a different origin than the document referencing them. * @author <a mailto="vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: DocumentJarClassLoader.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DocumentJarClassLoader	TokenNameIdentifier	 Document Jar Class Loader
extends	TokenNameextends	
URLClassLoader	TokenNameIdentifier	 URL Class Loader
{	TokenNameLBRACE	
/** * CodeSource for the Document which referenced the Jar file * @see #getPermissions */	TokenNameCOMMENT_JAVADOC	 CodeSource for the Document which referenced the Jar file @see #getPermissions 
protected	TokenNameprotected	
CodeSource	TokenNameIdentifier	 Code Source
documentCodeSource	TokenNameIdentifier	 document Code Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor */	TokenNameCOMMENT_JAVADOC	 Constructor 
public	TokenNamepublic	
DocumentJarClassLoader	TokenNameIdentifier	 Document Jar Class Loader
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
jarURL	TokenNameIdentifier	 jar URL
,	TokenNameCOMMA	
URL	TokenNameIdentifier	 URL
documentURL	TokenNameIdentifier	 document URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
jarURL	TokenNameIdentifier	 jar URL
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
documentURL	TokenNameIdentifier	 document URL
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
documentCodeSource	TokenNameIdentifier	 document Code Source
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
}	TokenNameRBRACE	
/** * Returns the permissions for the given codesource object. * The implementation of this method first gets the permissions * granted by the policy, and then adds additional permissions * based on the URL of the codesource. * <p> * Then, if the documentURL passed at construction time is * not null, the permissions granted to that URL are added. * * As a result, the jar file code will only be able to * connect to the server which served the document. * * @param codesource the codesource * @return the permissions granted to the codesource */	TokenNameCOMMENT_JAVADOC	 Returns the permissions for the given codesource object. The implementation of this method first gets the permissions granted by the policy, and then adds additional permissions based on the URL of the codesource. <p> Then, if the documentURL passed at construction time is not null, the permissions granted to that URL are added. * As a result, the jar file code will only be able to connect to the server which served the document. * @param codesource the codesource @return the permissions granted to the codesource 
protected	TokenNameprotected	
PermissionCollection	TokenNameIdentifier	 Permission Collection
getPermissions	TokenNameIdentifier	 get Permissions
(	TokenNameLPAREN	
CodeSource	TokenNameIdentifier	 Code Source
codesource	TokenNameIdentifier	 codesource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First, get the permissions which may be granted 	TokenNameCOMMENT_LINE	First, get the permissions which may be granted 
// through the policy file(s) 	TokenNameCOMMENT_LINE	through the policy file(s) 
Policy	TokenNameIdentifier	 Policy
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
Policy	TokenNameIdentifier	 Policy
.	TokenNameDOT	
getPolicy	TokenNameIdentifier	 get Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PermissionCollection	TokenNameIdentifier	 Permission Collection
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getPermissions	TokenNameIdentifier	 get Permissions
(	TokenNameLPAREN	
codesource	TokenNameIdentifier	 codesource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now, add permissions if the documentCodeSource is not null 	TokenNameCOMMENT_LINE	Now, add permissions if the documentCodeSource is not null 
if	TokenNameif	
(	TokenNameLPAREN	
documentCodeSource	TokenNameIdentifier	 document Code Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PermissionCollection	TokenNameIdentifier	 Permission Collection
urlPC	TokenNameIdentifier	 url PC
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getPermissions	TokenNameIdentifier	 get Permissions
(	TokenNameLPAREN	
documentCodeSource	TokenNameIdentifier	 document Code Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pc	TokenNameIdentifier	 pc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
urlPC	TokenNameIdentifier	 url PC
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Permission	TokenNameIdentifier	 Permission
)	TokenNameRPAREN	
(	TokenNameLPAREN	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
urlPC	TokenNameIdentifier	 url PC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
