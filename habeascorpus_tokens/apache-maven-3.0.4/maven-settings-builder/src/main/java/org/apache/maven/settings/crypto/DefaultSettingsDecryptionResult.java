package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
crypto	TokenNameIdentifier	 crypto
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Proxy	TokenNameIdentifier	 Proxy
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
Server	TokenNameIdentifier	 Server
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
building	TokenNameIdentifier	 building
.	TokenNameDOT	
SettingsProblem	TokenNameIdentifier	 Settings Problem
;	TokenNameSEMICOLON	
/** * Collects the output of the settings decrypter. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects the output of the settings decrypter. * @author Benjamin Bentmann 
class	TokenNameclass	
DefaultSettingsDecryptionResult	TokenNameIdentifier	 Default Settings Decryption Result
implements	TokenNameimplements	
SettingsDecryptionResult	TokenNameIdentifier	 Settings Decryption Result
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
servers	TokenNameIdentifier	 servers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
proxies	TokenNameIdentifier	 proxies
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DefaultSettingsDecryptionResult	TokenNameIdentifier	 Default Settings Decryption Result
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
servers	TokenNameIdentifier	 servers
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
proxies	TokenNameIdentifier	 proxies
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
problems	TokenNameIdentifier	 problems
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
servers	TokenNameIdentifier	 servers
=	TokenNameEQUAL	
(	TokenNameLPAREN	
servers	TokenNameIdentifier	 servers
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
servers	TokenNameIdentifier	 servers
:	TokenNameCOLON	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
proxies	TokenNameIdentifier	 proxies
=	TokenNameEQUAL	
(	TokenNameLPAREN	
proxies	TokenNameIdentifier	 proxies
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
proxies	TokenNameIdentifier	 proxies
:	TokenNameCOLON	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
problems	TokenNameIdentifier	 problems
=	TokenNameEQUAL	
(	TokenNameLPAREN	
problems	TokenNameIdentifier	 problems
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
problems	TokenNameIdentifier	 problems
:	TokenNameCOLON	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Server	TokenNameIdentifier	 Server
getServer	TokenNameIdentifier	 get Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
servers	TokenNameIdentifier	 servers
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
servers	TokenNameIdentifier	 servers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
servers	TokenNameIdentifier	 servers
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Proxy	TokenNameIdentifier	 Proxy
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
proxies	TokenNameIdentifier	 proxies
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
proxies	TokenNameIdentifier	 proxies
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
getProxies	TokenNameIdentifier	 get Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
proxies	TokenNameIdentifier	 proxies
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
problems	TokenNameIdentifier	 problems
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
