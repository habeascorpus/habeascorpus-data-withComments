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
/** * This interface represents a listener to the SVGDocumentLoaderEvent events. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGDocumentLoaderListener.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface represents a listener to the SVGDocumentLoaderEvent events. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGDocumentLoaderListener.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGDocumentLoaderListener	TokenNameIdentifier	 SVG Document Loader Listener
{	TokenNameLBRACE	
/** * Called when the loading of a document was started. */	TokenNameCOMMENT_JAVADOC	 Called when the loading of a document was started. 
void	TokenNamevoid	
documentLoadingStarted	TokenNameIdentifier	 document Loading Started
(	TokenNameLPAREN	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when the loading of a document was completed. */	TokenNameCOMMENT_JAVADOC	 Called when the loading of a document was completed. 
void	TokenNamevoid	
documentLoadingCompleted	TokenNameIdentifier	 document Loading Completed
(	TokenNameLPAREN	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when the loading of a document was cancelled. */	TokenNameCOMMENT_JAVADOC	 Called when the loading of a document was cancelled. 
void	TokenNamevoid	
documentLoadingCancelled	TokenNameIdentifier	 document Loading Cancelled
(	TokenNameLPAREN	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when the loading of a document has failed. */	TokenNameCOMMENT_JAVADOC	 Called when the loading of a document has failed. 
void	TokenNamevoid	
documentLoadingFailed	TokenNameIdentifier	 document Loading Failed
(	TokenNameLPAREN	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	