/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class implements the {@link * org.w3c.dom.ProcessingInstruction} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GenericProcessingInstruction.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link org.w3c.dom.ProcessingInstruction} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GenericProcessingInstruction.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
extends	TokenNameextends	
AbstractProcessingInstruction	TokenNameIdentifier	 Abstract Processing Instruction
{	TokenNameLBRACE	
/** * The target. */	TokenNameCOMMENT_JAVADOC	 The target. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
/** * Is this node immutable? */	TokenNameCOMMENT_JAVADOC	 Is this node immutable? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
/** * Creates a new ProcessingInstruction object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ProcessingInstruction object. 
protected	TokenNameprotected	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new ProcessingInstruction object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ProcessingInstruction object. 
public	TokenNamepublic	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the node name. */	TokenNameCOMMENT_JAVADOC	 Sets the node name. 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeName	TokenNameIdentifier	 set Node Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Tests whether this node is readonly. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets this node readonly attribute. */	TokenNameCOMMENT_JAVADOC	 Sets this node readonly attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setReadonly	TokenNameIdentifier	 set Readonly
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readonly	TokenNameIdentifier	 readonly
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.ProcessingInstruction#getTarget()}. * @return {@link #target}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.ProcessingInstruction#getTarget()}. @return {@link #target}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the target value. */	TokenNameCOMMENT_JAVADOC	 Sets the target value. 
public	TokenNamepublic	
void	TokenNamevoid	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Exports this node to the given document. */	TokenNameCOMMENT_JAVADOC	 Exports this node to the given document. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
export	TokenNameIdentifier	 export
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
export	TokenNameIdentifier	 export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deeply exports this node to the given document. */	TokenNameCOMMENT_JAVADOC	 Deeply exports this node to the given document. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
deepExport	TokenNameIdentifier	 deep Export
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy the fields of the current node into the given node. * @param n a node of the type of this. */	TokenNameCOMMENT_JAVADOC	 Copy the fields of the current node into the given node. @param n a node of the type of this. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
copyInto	TokenNameIdentifier	 copy Into
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deeply copy the fields of the current node into the given node. * @param n a node of the type of this. */	TokenNameCOMMENT_JAVADOC	 Deeply copy the fields of the current node into the given node. @param n a node of the type of this. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
deepCopyInto	TokenNameIdentifier	 deep Copy Into
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
deepCopyInto	TokenNameIdentifier	 deep Copy Into
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GenericProcessingInstruction	TokenNameIdentifier	 Generic Processing Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
