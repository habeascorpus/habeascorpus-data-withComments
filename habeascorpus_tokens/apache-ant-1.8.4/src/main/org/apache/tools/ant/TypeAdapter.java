/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
/** * Used to wrap types. * */	TokenNameCOMMENT_JAVADOC	 Used to wrap types. 
public	TokenNamepublic	
interface	TokenNameinterface	
TypeAdapter	TokenNameIdentifier	 Type Adapter
{	TokenNameLBRACE	
/** * Sets the project * * @param p the project instance. */	TokenNameCOMMENT_JAVADOC	 Sets the project * @param p the project instance. 
void	TokenNamevoid	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the project * * @return the project instance. */	TokenNameCOMMENT_JAVADOC	 Gets the project * @return the project instance. 
Project	TokenNameIdentifier	 Project
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the proxy object, whose methods are going to be * invoked by ant. * A proxy object is normally the object defined by * a &lt;typedef/&gt; task that is adapted by the "adapter" * attribute. * * @param o The target object. Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the proxy object, whose methods are going to be invoked by ant. A proxy object is normally the object defined by a &lt;typedef/&gt; task that is adapted by the "adapter" attribute. * @param o The target object. Must not be <code>null</code>. 
void	TokenNamevoid	
setProxy	TokenNameIdentifier	 set Proxy
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the proxy object. * * @return the target proxy object */	TokenNameCOMMENT_JAVADOC	 Returns the proxy object. * @return the target proxy object 
Object	TokenNameIdentifier	 Object
getProxy	TokenNameIdentifier	 get Proxy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Check if the proxy class is compatible with this adapter - i.e. * the adapter will be able to adapt instances of the give class. * * @param proxyClass the class to be checked. */	TokenNameCOMMENT_JAVADOC	 Check if the proxy class is compatible with this adapter - i.e. the adapter will be able to adapt instances of the give class. * @param proxyClass the class to be checked. 
void	TokenNamevoid	
checkProxyClass	TokenNameIdentifier	 check Proxy Class
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
proxyClass	TokenNameIdentifier	 proxy Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
