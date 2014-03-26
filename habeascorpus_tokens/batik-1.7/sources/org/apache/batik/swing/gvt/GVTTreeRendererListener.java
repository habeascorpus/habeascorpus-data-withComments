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
gvt	TokenNameIdentifier	 gvt
;	TokenNameSEMICOLON	
/** * This interface represents a listener to the GVTTreeRendererEvent events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GVTTreeRendererListener.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface represents a listener to the GVTTreeRendererEvent events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GVTTreeRendererListener.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
GVTTreeRendererListener	TokenNameIdentifier	 GVT Tree Renderer Listener
{	TokenNameLBRACE	
/** * Called when a rendering is in its preparing phase. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering is in its preparing phase. 
void	TokenNamevoid	
gvtRenderingPrepare	TokenNameIdentifier	 gvt Rendering Prepare
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a rendering started. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering started. 
void	TokenNamevoid	
gvtRenderingStarted	TokenNameIdentifier	 gvt Rendering Started
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a rendering was completed. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering was completed. 
void	TokenNamevoid	
gvtRenderingCompleted	TokenNameIdentifier	 gvt Rendering Completed
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a rendering was cancelled. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering was cancelled. 
void	TokenNamevoid	
gvtRenderingCancelled	TokenNameIdentifier	 gvt Rendering Cancelled
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a rendering failed. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering failed. 
void	TokenNamevoid	
gvtRenderingFailed	TokenNameIdentifier	 gvt Rendering Failed
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
