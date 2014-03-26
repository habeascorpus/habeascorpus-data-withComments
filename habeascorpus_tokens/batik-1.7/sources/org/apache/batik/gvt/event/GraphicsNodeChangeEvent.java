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
/** * An event which indicates that a change action occurred on a graphics node. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: GraphicsNodeChangeEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An event which indicates that a change action occurred on a graphics node. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: GraphicsNodeChangeEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GraphicsNodeChangeEvent	TokenNameIdentifier	 Graphics Node Change Event
extends	TokenNameextends	
GraphicsNodeEvent	TokenNameIdentifier	 Graphics Node Event
{	TokenNameLBRACE	
/** * The first number in the range of ids used for change events. */	TokenNameCOMMENT_JAVADOC	 The first number in the range of ids used for change events. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHANGE_FIRST	TokenNameIdentifier	 CHANGE  FIRST
=	TokenNameEQUAL	
9800	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "changeStarted" event. This change event occurs * when a change has started on a graphics node (but no changes have * occured on the graphics node it's self). */	TokenNameCOMMENT_JAVADOC	 The id for the "changeStarted" event. This change event occurs when a change has started on a graphics node (but no changes have occured on the graphics node it's self). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHANGE_STARTED	TokenNameIdentifier	 CHANGE  STARTED
=	TokenNameEQUAL	
CHANGE_FIRST	TokenNameIdentifier	 CHANGE  FIRST
;	TokenNameSEMICOLON	
/** * The id for the "changeCompleted" event. This change event * occurs when a change has completed on a graphics node (all * changes have completed on the graphics node it's self). */	TokenNameCOMMENT_JAVADOC	 The id for the "changeCompleted" event. This change event occurs when a change has completed on a graphics node (all changes have completed on the graphics node it's self). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CHANGE_COMPLETED	TokenNameIdentifier	 CHANGE  COMPLETED
=	TokenNameEQUAL	
CHANGE_FIRST	TokenNameIdentifier	 CHANGE  FIRST
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
changeSource	TokenNameIdentifier	 change Source
;	TokenNameSEMICOLON	
/** * Constructs a new graphics node event with the specified source and ID. * @param source the graphics node where the event originated * @param id the id of this event */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node event with the specified source and ID. @param source the graphics node where the event originated @param id the id of this event 
public	TokenNamepublic	
GraphicsNodeChangeEvent	TokenNameIdentifier	 Graphics Node Change Event
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
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setChangeSrc	TokenNameIdentifier	 set Change Src
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
changeSource	TokenNameIdentifier	 change Source
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getChangeSrc	TokenNameIdentifier	 get Change Src
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
changeSource	TokenNameIdentifier	 change Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
