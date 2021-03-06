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
/** * A low-level event which indicates that a graphics node has gained or * lost the keyboard focus. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: GraphicsNodeFocusEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A low-level event which indicates that a graphics node has gained or lost the keyboard focus. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: GraphicsNodeFocusEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GraphicsNodeFocusEvent	TokenNameIdentifier	 Graphics Node Focus Event
extends	TokenNameextends	
GraphicsNodeEvent	TokenNameIdentifier	 Graphics Node Event
{	TokenNameLBRACE	
/** * The first number in the range of ids used for focus events. */	TokenNameCOMMENT_JAVADOC	 The first number in the range of ids used for focus events. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FOCUS_FIRST	TokenNameIdentifier	 FOCUS  FIRST
=	TokenNameEQUAL	
1004	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "focusGained" event. This event indicates that * the component gained the keyboard focus. */	TokenNameCOMMENT_JAVADOC	 The id for the "focusGained" event. This event indicates that the component gained the keyboard focus. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FOCUS_GAINED	TokenNameIdentifier	 FOCUS  GAINED
=	TokenNameEQUAL	
FOCUS_FIRST	TokenNameIdentifier	 FOCUS  FIRST
;	TokenNameSEMICOLON	
/** * The id for the "focusLoses" event. This event indicates that * the component lost the keyboard focus. */	TokenNameCOMMENT_JAVADOC	 The id for the "focusLoses" event. This event indicates that the component lost the keyboard focus. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FOCUS_LOST	TokenNameIdentifier	 FOCUS  LOST
=	TokenNameEQUAL	
FOCUS_FIRST	TokenNameIdentifier	 FOCUS  FIRST
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructs a new graphics node focus event. * @param source the graphics node where the event originated * @param id the id of this event */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node focus event. @param source the graphics node where the event originated @param id the id of this event 
public	TokenNamepublic	
GraphicsNodeFocusEvent	TokenNameIdentifier	 Graphics Node Focus Event
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
}	TokenNameRBRACE	
