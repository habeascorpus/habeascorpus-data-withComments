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
/** * An adapter class that represents a listener to the * <tt>GVTTreeRendererEvent</tt> events. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: GVTTreeRendererAdapter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An adapter class that represents a listener to the <tt>GVTTreeRendererEvent</tt> events. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: GVTTreeRendererAdapter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
GVTTreeRendererAdapter	TokenNameIdentifier	 GVT Tree Renderer Adapter
implements	TokenNameimplements	
GVTTreeRendererListener	TokenNameIdentifier	 GVT Tree Renderer Listener
{	TokenNameLBRACE	
/** * Called when a rendering is in its preparing phase. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering is in its preparing phase. 
public	TokenNamepublic	
void	TokenNamevoid	
gvtRenderingPrepare	TokenNameIdentifier	 gvt Rendering Prepare
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when a rendering started. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering started. 
public	TokenNamepublic	
void	TokenNamevoid	
gvtRenderingStarted	TokenNameIdentifier	 gvt Rendering Started
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when a rendering was completed. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering was completed. 
public	TokenNamepublic	
void	TokenNamevoid	
gvtRenderingCompleted	TokenNameIdentifier	 gvt Rendering Completed
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when a rendering was cancelled. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering was cancelled. 
public	TokenNamepublic	
void	TokenNamevoid	
gvtRenderingCancelled	TokenNameIdentifier	 gvt Rendering Cancelled
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Called when a rendering failed. */	TokenNameCOMMENT_JAVADOC	 Called when a rendering failed. 
public	TokenNamepublic	
void	TokenNamevoid	
gvtRenderingFailed	TokenNameIdentifier	 gvt Rendering Failed
(	TokenNameLPAREN	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
