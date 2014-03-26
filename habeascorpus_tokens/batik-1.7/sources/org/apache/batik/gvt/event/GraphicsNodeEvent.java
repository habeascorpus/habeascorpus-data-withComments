/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
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
/** * A low-level event for GraphicsNode. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: GraphicsNodeEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A low-level event for GraphicsNode. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: GraphicsNodeEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GraphicsNodeEvent	TokenNameIdentifier	 Graphics Node Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
/** Indicates whether or not this event is consumed. */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not this event is consumed. 
private	TokenNameprivate	
boolean	TokenNameboolean	
consumed	TokenNameIdentifier	 consumed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The ID of this event. */	TokenNameCOMMENT_JAVADOC	 The ID of this event. 
protected	TokenNameprotected	
int	TokenNameint	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
/** * Constructs a new graphics node event with the specified source and ID. * @param source the graphics node where the event originated * @param id the id of this event */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node event with the specified source and ID. @param source the graphics node where the event originated @param id the id of this event 
public	TokenNamepublic	
GraphicsNodeEvent	TokenNameIdentifier	 Graphics Node Event
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the ID of this event. */	TokenNameCOMMENT_JAVADOC	 Returns the ID of this event. 
public	TokenNamepublic	
int	TokenNameint	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the graphics node where the event is originated. */	TokenNameCOMMENT_JAVADOC	 Returns the graphics node where the event is originated. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getGraphicsNode	TokenNameIdentifier	 get Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Consumes this event so that it will not be processed * in the default manner by the source which originated it. */	TokenNameCOMMENT_JAVADOC	 Consumes this event so that it will not be processed in the default manner by the source which originated it. 
public	TokenNamepublic	
void	TokenNamevoid	
consume	TokenNameIdentifier	 consume
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
consumed	TokenNameIdentifier	 consumed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether or not this event has been consumed. */	TokenNameCOMMENT_JAVADOC	 Returns whether or not this event has been consumed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isConsumed	TokenNameIdentifier	 is Consumed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
consumed	TokenNameIdentifier	 consumed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
