/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id$ */	TokenNameCOMMENT_BLOCK	 $Id$ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Instruction	TokenNameIdentifier	 Instruction
;	TokenNameSEMICOLON	
/** * <p>Marks the end of a region of byte code that can be copied into a new * method. See the {@link OutlineableChunkStart} pseudo-instruction for * details.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Marks the end of a region of byte code that can be copied into a new method. See the {@link OutlineableChunkStart} pseudo-instruction for details.</p> 
class	TokenNameclass	
OutlineableChunkEnd	TokenNameIdentifier	 Outlineable Chunk End
extends	TokenNameextends	
MarkerInstruction	TokenNameIdentifier	 Marker Instruction
{	TokenNameLBRACE	
/** * A constant instance of {@link OutlineableChunkEnd}. As it has no fields, * there should be no need to create an instance of this class. */	TokenNameCOMMENT_JAVADOC	 A constant instance of {@link OutlineableChunkEnd}. As it has no fields, there should be no need to create an instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
OUTLINEABLECHUNKEND	TokenNameIdentifier	 OUTLINEABLECHUNKEND
=	TokenNameEQUAL	
new	TokenNamenew	
OutlineableChunkEnd	TokenNameIdentifier	 Outlineable Chunk End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Private default constructor. As it has no fields, * there should be no need to create an instance of this class. See * {@link OutlineableChunkEnd#OUTLINEABLECHUNKEND}. */	TokenNameCOMMENT_JAVADOC	 Private default constructor. As it has no fields, there should be no need to create an instance of this class. See {@link OutlineableChunkEnd#OUTLINEABLECHUNKEND}. 
private	TokenNameprivate	
OutlineableChunkEnd	TokenNameIdentifier	 Outlineable Chunk End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get the name of this instruction. Used for debugging. * @return the instruction name */	TokenNameCOMMENT_JAVADOC	 Get the name of this instruction. Used for debugging. @return the instruction name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
OutlineableChunkEnd	TokenNameIdentifier	 Outlineable Chunk End
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of this instruction. Used for debugging. * @return the instruction name */	TokenNameCOMMENT_JAVADOC	 Get the name of this instruction. Used for debugging. @return the instruction name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of this instruction. Used for debugging. * @return the instruction name */	TokenNameCOMMENT_JAVADOC	 Get the name of this instruction. Used for debugging. @return the instruction name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
boolean	TokenNameboolean	
verbose	TokenNameIdentifier	 verbose
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
