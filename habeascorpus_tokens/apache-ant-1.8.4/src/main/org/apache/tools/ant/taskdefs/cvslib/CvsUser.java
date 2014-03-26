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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
cvslib	TokenNameIdentifier	 cvslib
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
/** * Represents a CVS user with a userID and a full name. * */	TokenNameCOMMENT_JAVADOC	 Represents a CVS user with a userID and a full name. 
public	TokenNamepublic	
class	TokenNameclass	
CvsUser	TokenNameIdentifier	 Cvs User
{	TokenNameLBRACE	
/** The user's Id */	TokenNameCOMMENT_JAVADOC	 The user's Id 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
userID	TokenNameIdentifier	 user ID
;	TokenNameSEMICOLON	
/** The user's full name */	TokenNameCOMMENT_JAVADOC	 The user's full name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
displayName	TokenNameIdentifier	 display Name
;	TokenNameSEMICOLON	
/** * Set the user's fullname * * @param displayName the user's full name */	TokenNameCOMMENT_JAVADOC	 Set the user's fullname * @param displayName the user's full name 
public	TokenNamepublic	
void	TokenNamevoid	
setDisplayname	TokenNameIdentifier	 set Displayname
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
displayName	TokenNameIdentifier	 display Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
displayName	TokenNameIdentifier	 display Name
=	TokenNameEQUAL	
displayName	TokenNameIdentifier	 display Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the user's id * * @param userID the user's new id value. */	TokenNameCOMMENT_JAVADOC	 Set the user's id * @param userID the user's new id value. 
public	TokenNamepublic	
void	TokenNamevoid	
setUserid	TokenNameIdentifier	 set Userid
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
userID	TokenNameIdentifier	 user ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
userID	TokenNameIdentifier	 user ID
=	TokenNameEQUAL	
userID	TokenNameIdentifier	 user ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the user's id. * * @return The userID value */	TokenNameCOMMENT_JAVADOC	 Get the user's id. * @return The userID value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUserID	TokenNameIdentifier	 get User ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
userID	TokenNameIdentifier	 user ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the user's full name * * @return the user's full name */	TokenNameCOMMENT_JAVADOC	 Get the user's full name * @return the user's full name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDisplayname	TokenNameIdentifier	 get Displayname
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
displayName	TokenNameIdentifier	 display Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Validate that this object is configured. * * @exception BuildException if the instance has not be correctly * configured. */	TokenNameCOMMENT_JAVADOC	 Validate that this object is configured. * @exception BuildException if the instance has not be correctly configured. 
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
userID	TokenNameIdentifier	 user ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Username attribute must be set."	TokenNameStringLiteral	Username attribute must be set.
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
displayName	TokenNameIdentifier	 display Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"Displayname attribute must be set for userID "	TokenNameStringLiteral	Displayname attribute must be set for userID 
+	TokenNamePLUS	
userID	TokenNameIdentifier	 user ID
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
