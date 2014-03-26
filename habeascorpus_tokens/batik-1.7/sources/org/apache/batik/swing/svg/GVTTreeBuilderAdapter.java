/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
/** * An adapter class that represents a listener to the GVTTreeBuilderEvent * events. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: GVTTreeBuilderAdapter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An adapter class that represents a listener to the GVTTreeBuilderEvent events. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: GVTTreeBuilderAdapter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
GVTTreeBuilderAdapter	TokenNameIdentifier	 GVT Tree Builder Adapter
implements	TokenNameimplements	
GVTTreeBuilderListener	TokenNameIdentifier	 GVT Tree Builder Listener
{	TokenNameLBRACE	
/** * Called when a build started. * The data of the event is initialized to the old document. */	TokenNameCOMMENT_JAVADOC	 Called when a build started. The data of the event is initialized to the old document. 
public	TokenNamepublic	
void	TokenNamevoid	
gvtBuildStarted	TokenNameIdentifier	 gvt Build Started
(	TokenNameLPAREN	
GVTTreeBuilderEvent	TokenNameIdentifier	 GVT Tree Builder Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when a build was completed. */	TokenNameCOMMENT_JAVADOC	 Called when a build was completed. 
public	TokenNamepublic	
void	TokenNamevoid	
gvtBuildCompleted	TokenNameIdentifier	 gvt Build Completed
(	TokenNameLPAREN	
GVTTreeBuilderEvent	TokenNameIdentifier	 GVT Tree Builder Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when a build was cancelled. */	TokenNameCOMMENT_JAVADOC	 Called when a build was cancelled. 
public	TokenNamepublic	
void	TokenNamevoid	
gvtBuildCancelled	TokenNameIdentifier	 gvt Build Cancelled
(	TokenNameLPAREN	
GVTTreeBuilderEvent	TokenNameIdentifier	 GVT Tree Builder Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when a build failed. */	TokenNameCOMMENT_JAVADOC	 Called when a build failed. 
public	TokenNamepublic	
void	TokenNamevoid	
gvtBuildFailed	TokenNameIdentifier	 gvt Build Failed
(	TokenNameLPAREN	
GVTTreeBuilderEvent	TokenNameIdentifier	 GVT Tree Builder Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
