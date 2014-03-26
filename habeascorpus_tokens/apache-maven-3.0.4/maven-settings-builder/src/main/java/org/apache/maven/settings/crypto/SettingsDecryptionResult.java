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
public	TokenNamepublic	
interface	TokenNameinterface	
SettingsDecryptionResult	TokenNameIdentifier	 Settings Decryption Result
{	TokenNameLBRACE	
/** * Gets the decrypted server. This is a convenience method to retrieve the first element from {@link #getServers()}. * * @return The decrypted server or {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the decrypted server. This is a convenience method to retrieve the first element from {@link #getServers()}. * @return The decrypted server or {@code null}. 
Server	TokenNameIdentifier	 Server
getServer	TokenNameIdentifier	 get Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the decrypted servers. * * @return The decrypted server, can be empty but never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the decrypted servers. * @return The decrypted server, can be empty but never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the decrypted proxy. This is a convenience method to retrieve the first element from {@link #getProxies()}. * * @return The decrypted proxy or {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the decrypted proxy. This is a convenience method to retrieve the first element from {@link #getProxies()}. * @return The decrypted proxy or {@code null}. 
Proxy	TokenNameIdentifier	 Proxy
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the decrypted proxies. * * @return The decrypted proxy, can be empty but never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the decrypted proxies. * @return The decrypted proxy, can be empty but never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
getProxies	TokenNameIdentifier	 get Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the problems that were encountered during the settings decryption. * * @return The problems that were encountered during the decryption, can be empty but never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the problems that were encountered during the settings decryption. * @return The problems that were encountered during the decryption, can be empty but never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SettingsProblem	TokenNameIdentifier	 Settings Problem
>	TokenNameGREATER	
getProblems	TokenNameIdentifier	 get Problems
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
