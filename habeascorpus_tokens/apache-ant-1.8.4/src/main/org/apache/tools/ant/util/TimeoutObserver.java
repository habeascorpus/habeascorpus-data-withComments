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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Interface for classes that want to be notified by Watchdog. * * @since Ant 1.5 * * @see org.apache.tools.ant.util.Watchdog * */	TokenNameCOMMENT_JAVADOC	 Interface for classes that want to be notified by Watchdog. * @since Ant 1.5 * @see org.apache.tools.ant.util.Watchdog 
public	TokenNamepublic	
interface	TokenNameinterface	
TimeoutObserver	TokenNameIdentifier	 Timeout Observer
{	TokenNameLBRACE	
/** * Called when the watchdow times out. * * @param w the watchdog that timed out. */	TokenNameCOMMENT_JAVADOC	 Called when the watchdow times out. * @param w the watchdog that timed out. 
void	TokenNamevoid	
timeoutOccured	TokenNameIdentifier	 timeout Occured
(	TokenNameLPAREN	
Watchdog	TokenNameIdentifier	 Watchdog
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
