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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
BufferedImage	TokenNameIdentifier	 Buffered Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventObject	TokenNameIdentifier	 Event Object
;	TokenNameSEMICOLON	
/** * This class represents an event which indicate an event originated * from a GVTTreeRenderer instance. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GVTTreeRendererEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an event which indicate an event originated from a GVTTreeRenderer instance. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GVTTreeRendererEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
/** * The buffered image. */	TokenNameCOMMENT_JAVADOC	 The buffered image. 
protected	TokenNameprotected	
BufferedImage	TokenNameIdentifier	 Buffered Image
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
/** * Creates a new GVTTreeRendererEvent. * @param source the object that originated the event, ie. the * GVTTreeRenderer. * @param bi the image to paint. */	TokenNameCOMMENT_JAVADOC	 Creates a new GVTTreeRendererEvent. @param source the object that originated the event, ie. the GVTTreeRenderer. @param bi the image to paint. 
public	TokenNamepublic	
GVTTreeRendererEvent	TokenNameIdentifier	 GVT Tree Renderer Event
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the image to display, or null if the rendering failed. */	TokenNameCOMMENT_JAVADOC	 Returns the image to display, or null if the rendering failed. 
public	TokenNamepublic	
BufferedImage	TokenNameIdentifier	 Buffered Image
getImage	TokenNameIdentifier	 get Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
