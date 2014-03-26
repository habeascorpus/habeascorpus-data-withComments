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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventObject	TokenNameIdentifier	 Event Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
GraphicsNode	TokenNameIdentifier	 Graphics Node
;	TokenNameSEMICOLON	
/** * This class represents an event which indicate an event originated * from a GVTTreeBuilder instance. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GVTTreeBuilderEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an event which indicate an event originated from a GVTTreeBuilder instance. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GVTTreeBuilderEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GVTTreeBuilderEvent	TokenNameIdentifier	 GVT Tree Builder Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
/** * The GVT root. */	TokenNameCOMMENT_JAVADOC	 The GVT root. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gvtRoot	TokenNameIdentifier	 gvt Root
;	TokenNameSEMICOLON	
/** * Creates a new GVTTreeBuilderEvent. * @param source the object that originated the event, ie. the * GVTTreeBuilder. * @param root the GVT root. */	TokenNameCOMMENT_JAVADOC	 Creates a new GVTTreeBuilderEvent. @param source the object that originated the event, ie. the GVTTreeBuilder. @param root the GVT root. 
public	TokenNamepublic	
GVTTreeBuilderEvent	TokenNameIdentifier	 GVT Tree Builder Event
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
GraphicsNode	TokenNameIdentifier	 Graphics Node
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gvtRoot	TokenNameIdentifier	 gvt Root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the GVT tree root, or null if the gvt construction * was not completed or just started. */	TokenNameCOMMENT_JAVADOC	 Returns the GVT tree root, or null if the gvt construction was not completed or just started. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getGVTRoot	TokenNameIdentifier	 get GVT Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gvtRoot	TokenNameIdentifier	 gvt Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
