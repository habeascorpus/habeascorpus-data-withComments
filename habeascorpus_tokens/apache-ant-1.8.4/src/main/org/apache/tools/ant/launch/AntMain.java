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
launch	TokenNameIdentifier	 launch
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
/** * Interface used to bridge to the actual Main class without any * messy reflection * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Interface used to bridge to the actual Main class without any messy reflection * @since Ant 1.6 
public	TokenNamepublic	
interface	TokenNameinterface	
AntMain	TokenNameIdentifier	 Ant Main
{	TokenNameLBRACE	
/** * Start Ant. * * @param args command line args * @param additionalUserProperties properties to set beyond those that * may be specified on the args list * @param coreLoader - not used * * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 Start Ant. * @param args command line args @param additionalUserProperties properties to set beyond those that may be specified on the args list @param coreLoader - not used * @since Ant 1.6 
void	TokenNamevoid	
startAnt	TokenNameIdentifier	 start Ant
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
Properties	TokenNameIdentifier	 Properties
additionalUserProperties	TokenNameIdentifier	 additional User Properties
,	TokenNameCOMMA	
ClassLoader	TokenNameIdentifier	 Class Loader
coreLoader	TokenNameIdentifier	 core Loader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
