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
public	TokenNamepublic	
class	TokenNameclass	
Authentication	TokenNameIdentifier	 Authentication
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
privateKey	TokenNameIdentifier	 private Key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
passphrase	TokenNameIdentifier	 passphrase
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Authentication	TokenNameIdentifier	 Authentication
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Username used to login to the host */	TokenNameCOMMENT_JAVADOC	 Username used to login to the host 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
/** * Password associated with the login */	TokenNameCOMMENT_JAVADOC	 Password associated with the login 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
/** * Get the user's password which is used when connecting to the repository. * * @return password of user */	TokenNameCOMMENT_JAVADOC	 Get the user's password which is used when connecting to the repository. * @return password of user 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPassword	TokenNameIdentifier	 get Password
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the user's password which is used when connecting to the repository. * * @param password password of the user */	TokenNameCOMMENT_JAVADOC	 Set the user's password which is used when connecting to the repository. * @param password password of the user 
public	TokenNamepublic	
void	TokenNamevoid	
setPassword	TokenNameIdentifier	 set Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the username used to access the repository. * * @return username at repository */	TokenNameCOMMENT_JAVADOC	 Get the username used to access the repository. * @return username at repository 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUsername	TokenNameIdentifier	 get Username
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
username	TokenNameIdentifier	 username
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set username used to access the repository. * * @param userName the username used to access repository */	TokenNameCOMMENT_JAVADOC	 Set username used to access the repository. * @param userName the username used to access repository 
public	TokenNamepublic	
void	TokenNamevoid	
setUsername	TokenNameIdentifier	 set Username
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
userName	TokenNameIdentifier	 user Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
username	TokenNameIdentifier	 username
=	TokenNameEQUAL	
userName	TokenNameIdentifier	 user Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the passphrase of the private key file. The passphrase is used only when host/protocol supports * authentication via exchange of private/public keys and private key was used for authentication. * * @return passphrase of the private key file */	TokenNameCOMMENT_JAVADOC	 Get the passphrase of the private key file. The passphrase is used only when host/protocol supports authentication via exchange of private/public keys and private key was used for authentication. * @return passphrase of the private key file 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPassphrase	TokenNameIdentifier	 get Passphrase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
passphrase	TokenNameIdentifier	 passphrase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the passphrase of the private key file. * * @param passphrase passphrase of the private key file */	TokenNameCOMMENT_JAVADOC	 Set the passphrase of the private key file. * @param passphrase passphrase of the private key file 
public	TokenNamepublic	
void	TokenNamevoid	
setPassphrase	TokenNameIdentifier	 set Passphrase
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
passphrase	TokenNameIdentifier	 passphrase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
passphrase	TokenNameIdentifier	 passphrase
=	TokenNameEQUAL	
passphrase	TokenNameIdentifier	 passphrase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the absolute path to the private key file. * * @return absolute path to private key */	TokenNameCOMMENT_JAVADOC	 Get the absolute path to the private key file. * @return absolute path to private key 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrivateKey	TokenNameIdentifier	 get Private Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
privateKey	TokenNameIdentifier	 private Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the absolute path to private key file. * * @param privateKey path to private key in local file system */	TokenNameCOMMENT_JAVADOC	 Set the absolute path to private key file. * @param privateKey path to private key in local file system 
public	TokenNamepublic	
void	TokenNamevoid	
setPrivateKey	TokenNameIdentifier	 set Private Key
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
privateKey	TokenNameIdentifier	 private Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
privateKey	TokenNameIdentifier	 private Key
=	TokenNameEQUAL	
privateKey	TokenNameIdentifier	 private Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
