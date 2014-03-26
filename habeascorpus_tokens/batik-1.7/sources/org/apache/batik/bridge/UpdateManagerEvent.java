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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * This class represents an event which indicate an event originated * from a UpdateManager instance. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: UpdateManagerEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an event which indicate an event originated from a UpdateManager instance. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: UpdateManagerEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
/** * The buffered image. */	TokenNameCOMMENT_JAVADOC	 The buffered image. 
protected	TokenNameprotected	
BufferedImage	TokenNameIdentifier	 Buffered Image
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
/** * The dirty areas, as a List of Rectangles. */	TokenNameCOMMENT_JAVADOC	 The dirty areas, as a List of Rectangles. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
dirtyAreas	TokenNameIdentifier	 dirty Areas
;	TokenNameSEMICOLON	
/** * True if before painting this update the canvas's painting * transform needs to be cleared. */	TokenNameCOMMENT_JAVADOC	 True if before painting this update the canvas's painting transform needs to be cleared. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
clearPaintingTransform	TokenNameIdentifier	 clear Painting Transform
;	TokenNameSEMICOLON	
/** * Creates a new UpdateManagerEvent. * @param source the object that originated the event, ie. the * UpdateManager. * @param bi the image to paint. * @param das List of dirty areas. */	TokenNameCOMMENT_JAVADOC	 Creates a new UpdateManagerEvent. @param source the object that originated the event, ie. the UpdateManager. @param bi the image to paint. @param das List of dirty areas. 
public	TokenNamepublic	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
das	TokenNameIdentifier	 das
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dirtyAreas	TokenNameIdentifier	 dirty Areas
=	TokenNameEQUAL	
das	TokenNameIdentifier	 das
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clearPaintingTransform	TokenNameIdentifier	 clear Painting Transform
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new UpdateManagerEvent. * @param source the object that originated the event, ie. the * UpdateManager. * @param bi the image to paint. * @param das List of dirty areas. * @param cpt Indicates if the painting transform should be * cleared as a result of this event. */	TokenNameCOMMENT_JAVADOC	 Creates a new UpdateManagerEvent. @param source the object that originated the event, ie. the UpdateManager. @param bi the image to paint. @param das List of dirty areas. @param cpt Indicates if the painting transform should be cleared as a result of this event. 
public	TokenNamepublic	
UpdateManagerEvent	TokenNameIdentifier	 Update Manager Event
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
BufferedImage	TokenNameIdentifier	 Buffered Image
bi	TokenNameIdentifier	 bi
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
das	TokenNameIdentifier	 das
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cpt	TokenNameIdentifier	 cpt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dirtyAreas	TokenNameIdentifier	 dirty Areas
=	TokenNameEQUAL	
das	TokenNameIdentifier	 das
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
clearPaintingTransform	TokenNameIdentifier	 clear Painting Transform
=	TokenNameEQUAL	
cpt	TokenNameIdentifier	 cpt
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
/** * Returns the dirty areas (list of rectangles) */	TokenNameCOMMENT_JAVADOC	 Returns the dirty areas (list of rectangles) 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getDirtyAreas	TokenNameIdentifier	 get Dirty Areas
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dirtyAreas	TokenNameIdentifier	 dirty Areas
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns true if the component should clear it's painting transform * before painting the associated BufferedImage. */	TokenNameCOMMENT_JAVADOC	 returns true if the component should clear it's painting transform before painting the associated BufferedImage. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getClearPaintingTransform	TokenNameIdentifier	 get Clear Painting Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clearPaintingTransform	TokenNameIdentifier	 clear Painting Transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
