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
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
;	TokenNameSEMICOLON	
/** * Interface to be implemented by "touchable" resources; * that is, those whose modification time can be altered. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Interface to be implemented by "touchable" resources; that is, those whose modification time can be altered. @since Ant 1.7 
public	TokenNamepublic	
interface	TokenNameinterface	
Touchable	TokenNameIdentifier	 Touchable
{	TokenNameLBRACE	
/** * Method called to "touch" the resource. * @param modTime the time to set the modified "field" of the resource, * measured in milliseconds since the epoch. */	TokenNameCOMMENT_JAVADOC	 Method called to "touch" the resource. @param modTime the time to set the modified "field" of the resource, measured in milliseconds since the epoch. 
void	TokenNamevoid	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
long	TokenNamelong	
modTime	TokenNameIdentifier	 mod Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
