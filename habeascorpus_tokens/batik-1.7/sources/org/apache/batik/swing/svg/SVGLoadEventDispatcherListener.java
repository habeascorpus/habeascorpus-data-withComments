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
/** * This interface represents a listener to the * SVGLoadEventDispatcherEvent events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGLoadEventDispatcherListener.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface represents a listener to the SVGLoadEventDispatcherEvent events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGLoadEventDispatcherListener.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGLoadEventDispatcherListener	TokenNameIdentifier	 SVG Load Event Dispatcher Listener
{	TokenNameLBRACE	
/** * Called when a onload event dispatch started. */	TokenNameCOMMENT_JAVADOC	 Called when a onload event dispatch started. 
void	TokenNamevoid	
svgLoadEventDispatchStarted	TokenNameIdentifier	 svg Load Event Dispatch Started
(	TokenNameLPAREN	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a onload event dispatch was completed. */	TokenNameCOMMENT_JAVADOC	 Called when a onload event dispatch was completed. 
void	TokenNamevoid	
svgLoadEventDispatchCompleted	TokenNameIdentifier	 svg Load Event Dispatch Completed
(	TokenNameLPAREN	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a onload event dispatch was cancelled. */	TokenNameCOMMENT_JAVADOC	 Called when a onload event dispatch was cancelled. 
void	TokenNamevoid	
svgLoadEventDispatchCancelled	TokenNameIdentifier	 svg Load Event Dispatch Cancelled
(	TokenNameLPAREN	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when a onload event dispatch failed. */	TokenNameCOMMENT_JAVADOC	 Called when a onload event dispatch failed. 
void	TokenNamevoid	
svgLoadEventDispatchFailed	TokenNameIdentifier	 svg Load Event Dispatch Failed
(	TokenNameLPAREN	
SVGLoadEventDispatcherEvent	TokenNameIdentifier	 SVG Load Event Dispatcher Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
