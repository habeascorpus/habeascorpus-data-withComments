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
/** * Collects parameters that control the decryption of settings. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Collects parameters that control the decryption of settings. * @author Benjamin Bentmann 
public	TokenNamepublic	
interface	TokenNameinterface	
SettingsDecryptionRequest	TokenNameIdentifier	 Settings Decryption Request
{	TokenNameLBRACE	
/** * Gets the servers whose passwords should be decrypted. * * @return The servers to decrypt, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the servers whose passwords should be decrypted. * @return The servers to decrypt, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
getServers	TokenNameIdentifier	 get Servers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the servers whose passwords should be decrypted. * * @param servers The servers to decrypt, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the servers whose passwords should be decrypted. * @param servers The servers to decrypt, may be {@code null}. @return This request, never {@code null}. 
SettingsDecryptionRequest	TokenNameIdentifier	 Settings Decryption Request
setServers	TokenNameIdentifier	 set Servers
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Server	TokenNameIdentifier	 Server
>	TokenNameGREATER	
servers	TokenNameIdentifier	 servers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the proxies whose passwords should be decrypted. * * @return The proxies to decrypt, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the proxies whose passwords should be decrypted. * @return The proxies to decrypt, never {@code null}. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
getProxies	TokenNameIdentifier	 get Proxies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the proxies whose passwords should be decrypted. * * @param proxies The proxies to decrypt, may be {@code null}. * @return This request, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Sets the proxies whose passwords should be decrypted. * @param proxies The proxies to decrypt, may be {@code null}. @return This request, never {@code null}. 
SettingsDecryptionRequest	TokenNameIdentifier	 Settings Decryption Request
setProxies	TokenNameIdentifier	 set Proxies
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Proxy	TokenNameIdentifier	 Proxy
>	TokenNameGREATER	
proxies	TokenNameIdentifier	 proxies
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
