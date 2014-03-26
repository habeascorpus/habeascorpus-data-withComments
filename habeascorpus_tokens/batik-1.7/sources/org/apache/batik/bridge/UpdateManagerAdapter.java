/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
/** * This is an adapter for the UpdateManagerListener interface. * It's methods do nothing. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: UpdateManagerAdapter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is an adapter for the UpdateManagerListener interface. It's methods do nothing. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: UpdateManagerAdapter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
UpdateManagerAdapter	TokenNameIdentifier	 Update Manager Adapter
implements	TokenNameimplements	
UpdateManagerListener	TokenNameIdentifier	 Update Manager Listener
{	TokenNameLBRACE	
/** * Called when the manager was started. */	TokenNameCOMMENT_JAVADOC	 Called when the manager was started. 
public	TokenNamepublic	
void	TokenNamevoid	
managerStarted	TokenNameIdentifier	 manager Started
(	TokenNameLPAREN	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when the manager was suspended. */	TokenNameCOMMENT_JAVADOC	 Called when the manager was suspended. 
public	TokenNamepublic	
void	TokenNamevoid	
managerSuspended	TokenNameIdentifier	 manager Suspended
(	TokenNameLPAREN	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when the manager was resumed. */	TokenNameCOMMENT_JAVADOC	 Called when the manager was resumed. 
public	TokenNamepublic	
void	TokenNamevoid	
managerResumed	TokenNameIdentifier	 manager Resumed
(	TokenNameLPAREN	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when the manager was stopped. */	TokenNameCOMMENT_JAVADOC	 Called when the manager was stopped. 
public	TokenNamepublic	
void	TokenNamevoid	
managerStopped	TokenNameIdentifier	 manager Stopped
(	TokenNameLPAREN	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when an update started. */	TokenNameCOMMENT_JAVADOC	 Called when an update started. 
public	TokenNamepublic	
void	TokenNamevoid	
updateStarted	TokenNameIdentifier	 update Started
(	TokenNameLPAREN	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when an update was completed. */	TokenNameCOMMENT_JAVADOC	 Called when an update was completed. 
public	TokenNamepublic	
void	TokenNamevoid	
updateCompleted	TokenNameIdentifier	 update Completed
(	TokenNameLPAREN	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when an update failed. */	TokenNameCOMMENT_JAVADOC	 Called when an update failed. 
public	TokenNamepublic	
void	TokenNamevoid	
updateFailed	TokenNameIdentifier	 update Failed
(	TokenNameLPAREN	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
