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
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
ssh	TokenNameIdentifier	 ssh
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
UserInfo	TokenNameIdentifier	 User Info
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
jcraft	TokenNameIdentifier	 jcraft
.	TokenNameDOT	
jsch	TokenNameIdentifier	 jsch
.	TokenNameDOT	
UIKeyboardInteractive	TokenNameIdentifier	 UI Keyboard Interactive
;	TokenNameSEMICOLON	
/** * Class containing information on an SSH user. */	TokenNameCOMMENT_JAVADOC	 Class containing information on an SSH user. 
public	TokenNamepublic	
class	TokenNameclass	
SSHUserInfo	TokenNameIdentifier	 SSH User Info
implements	TokenNameimplements	
UserInfo	TokenNameIdentifier	 User Info
,	TokenNameCOMMA	
UIKeyboardInteractive	TokenNameIdentifier	 UI Keyboard Interactive
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
keyfile	TokenNameIdentifier	 keyfile
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
passphrase	TokenNameIdentifier	 passphrase
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
trustAllCertificates	TokenNameIdentifier	 trust All Certificates
;	TokenNameSEMICOLON	
/** Constructor for SSHUserInfo. */	TokenNameCOMMENT_JAVADOC	 Constructor for SSHUserInfo. 
public	TokenNamepublic	
SSHUserInfo	TokenNameIdentifier	 SSH User Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
trustAllCertificates	TokenNameIdentifier	 trust All Certificates
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for SSHUserInfo. * @param password the user's password * @param trustAllCertificates if true trust hosts whose identity is unknown */	TokenNameCOMMENT_JAVADOC	 Constructor for SSHUserInfo. @param password the user's password @param trustAllCertificates if true trust hosts whose identity is unknown 
public	TokenNamepublic	
SSHUserInfo	TokenNameIdentifier	 SSH User Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
,	TokenNameCOMMA	
boolean	TokenNameboolean	
trustAllCertificates	TokenNameIdentifier	 trust All Certificates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
=	TokenNameEQUAL	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
trustAllCertificates	TokenNameIdentifier	 trust All Certificates
=	TokenNameEQUAL	
trustAllCertificates	TokenNameIdentifier	 trust All Certificates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the user name. * @return the user name */	TokenNameCOMMENT_JAVADOC	 Gets the user name. @return the user name 
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
/** * Gets the pass phrase of the user. * @param message a message * @return the passphrase */	TokenNameCOMMENT_JAVADOC	 Gets the pass phrase of the user. @param message a message @return the passphrase 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPassphrase	TokenNameIdentifier	 get Passphrase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
passphrase	TokenNameIdentifier	 passphrase
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the user's password. * @return the user's password */	TokenNameCOMMENT_JAVADOC	 Gets the user's password. @return the user's password 
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
/** * Prompts a string. * @param str the string * @return whether the string was prompted */	TokenNameCOMMENT_JAVADOC	 Prompts a string. @param str the string @return whether the string was prompted 
public	TokenNamepublic	
boolean	TokenNameboolean	
prompt	TokenNameIdentifier	 prompt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates whether a retry was done. * @return whether a retry was done */	TokenNameCOMMENT_JAVADOC	 Indicates whether a retry was done. @return whether a retry was done 
public	TokenNamepublic	
boolean	TokenNameboolean	
retry	TokenNameIdentifier	 retry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the name. * @param name The name to set */	TokenNameCOMMENT_JAVADOC	 Sets the name. @param name The name to set 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the passphrase. * @param passphrase The passphrase to set */	TokenNameCOMMENT_JAVADOC	 Sets the passphrase. @param passphrase The passphrase to set 
public	TokenNamepublic	
void	TokenNamevoid	
setPassphrase	TokenNameIdentifier	 set Passphrase
(	TokenNameLPAREN	
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
/** * Sets the password. * @param password The password to set */	TokenNameCOMMENT_JAVADOC	 Sets the password. @param password The password to set 
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
/** * Sets the trust. * @param trust whether to trust or not. */	TokenNameCOMMENT_JAVADOC	 Sets the trust. @param trust whether to trust or not. 
public	TokenNamepublic	
void	TokenNamevoid	
setTrust	TokenNameIdentifier	 set Trust
(	TokenNameLPAREN	
boolean	TokenNameboolean	
trust	TokenNameIdentifier	 trust
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
trustAllCertificates	TokenNameIdentifier	 trust All Certificates
=	TokenNameEQUAL	
trust	TokenNameIdentifier	 trust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return whether to trust or not. */	TokenNameCOMMENT_JAVADOC	 @return whether to trust or not. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getTrust	TokenNameIdentifier	 get Trust
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
trustAllCertificates	TokenNameIdentifier	 trust All Certificates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the passphrase. * @return String */	TokenNameCOMMENT_JAVADOC	 Returns the passphrase. @return String 
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
/** * Returns the keyfile. * @return String */	TokenNameCOMMENT_JAVADOC	 Returns the keyfile. @return String 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKeyfile	TokenNameIdentifier	 get Keyfile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyfile	TokenNameIdentifier	 keyfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the keyfile. * @param keyfile The keyfile to set */	TokenNameCOMMENT_JAVADOC	 Sets the keyfile. @param keyfile The keyfile to set 
public	TokenNamepublic	
void	TokenNamevoid	
setKeyfile	TokenNameIdentifier	 set Keyfile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyfile	TokenNameIdentifier	 keyfile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keyfile	TokenNameIdentifier	 keyfile
=	TokenNameEQUAL	
keyfile	TokenNameIdentifier	 keyfile
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implement the UserInfo interface. * @param message ignored * @return true always */	TokenNameCOMMENT_JAVADOC	 Implement the UserInfo interface. @param message ignored @return true always 
public	TokenNamepublic	
boolean	TokenNameboolean	
promptPassphrase	TokenNameIdentifier	 prompt Passphrase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implement the UserInfo interface. * @param passwordPrompt ignored * @return true the first time this is called, false otherwise */	TokenNameCOMMENT_JAVADOC	 Implement the UserInfo interface. @param passwordPrompt ignored @return true the first time this is called, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
promptPassword	TokenNameIdentifier	 prompt Password
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
passwordPrompt	TokenNameIdentifier	 password Prompt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implement the UserInfo interface. * @param message ignored * @return the value of trustAllCertificates */	TokenNameCOMMENT_JAVADOC	 Implement the UserInfo interface. @param message ignored @return the value of trustAllCertificates 
public	TokenNamepublic	
boolean	TokenNameboolean	
promptYesNo	TokenNameIdentifier	 prompt Yes No
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
trustAllCertificates	TokenNameIdentifier	 trust All Certificates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//why do we do nothing? 	TokenNameCOMMENT_LINE	why do we do nothing? 
/** * Implement the UserInfo interface (noop). * @param message ignored */	TokenNameCOMMENT_JAVADOC	 Implement the UserInfo interface (noop). @param message ignored 
public	TokenNamepublic	
void	TokenNamevoid	
showMessage	TokenNameIdentifier	 show Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//log(message, Project.MSG_DEBUG); 	TokenNameCOMMENT_LINE	log(message, Project.MSG_DEBUG); 
}	TokenNameRBRACE	
/** * Implementation of UIKeyboardInteractive#promptKeyboardInteractive. * @param destination not used. * @param name not used. * @param instruction not used. * @param prompt the method checks if this is one in length. * @param echo the method checks if the first element is false. * @return the password in an size one array if there is a password * and if the prompt and echo checks pass. */	TokenNameCOMMENT_JAVADOC	 Implementation of UIKeyboardInteractive#promptKeyboardInteractive. @param destination not used. @param name not used. @param instruction not used. @param prompt the method checks if this is one in length. @param echo the method checks if the first element is false. @return the password in an size one array if there is a password and if the prompt and echo checks pass. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
promptKeyboardInteractive	TokenNameIdentifier	 prompt Keyboard Interactive
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
destination	TokenNameIdentifier	 destination
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
instruction	TokenNameIdentifier	 instruction
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prompt	TokenNameIdentifier	 prompt
,	TokenNameCOMMA	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
echo	TokenNameIdentifier	 echo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prompt	TokenNameIdentifier	 prompt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
echo	TokenNameIdentifier	 echo
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
response	TokenNameIdentifier	 response
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
response	TokenNameIdentifier	 response
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
password	TokenNameIdentifier	 password
;	TokenNameSEMICOLON	
return	TokenNamereturn	
response	TokenNameIdentifier	 response
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
