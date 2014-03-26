/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: MethodGenerator.java 469275 2006-10-30 21:04:47Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: MethodGenerator.java 469275 2006-10-30 21:04:47Z minchau $ 
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
classfile	TokenNameIdentifier	 classfile
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
ALOAD	TokenNameIdentifier	 ALOAD
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
ASTORE	TokenNameIdentifier	 ASTORE
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
BranchHandle	TokenNameIdentifier	 Branch Handle
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
BranchInstruction	TokenNameIdentifier	 Branch Instruction
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
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
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
DLOAD	TokenNameIdentifier	 DLOAD
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
DSTORE	TokenNameIdentifier	 DSTORE
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
FLOAD	TokenNameIdentifier	 FLOAD
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
FSTORE	TokenNameIdentifier	 FSTORE
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
GETFIELD	TokenNameIdentifier	 GETFIELD
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
GOTO	TokenNameIdentifier	 GOTO
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
ICONST	TokenNameIdentifier	 ICONST
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
IfInstruction	TokenNameIdentifier	 If Instruction
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
ILOAD	TokenNameIdentifier	 ILOAD
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
IndexedInstruction	TokenNameIdentifier	 Indexed Instruction
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
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
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
INVOKESPECIAL	TokenNameIdentifier	 INVOKESPECIAL
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
INVOKESTATIC	TokenNameIdentifier	 INVOKESTATIC
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
INVOKEVIRTUAL	TokenNameIdentifier	 INVOKEVIRTUAL
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
ISTORE	TokenNameIdentifier	 ISTORE
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
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
InstructionHandle	TokenNameIdentifier	 Instruction Handle
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
InstructionList	TokenNameIdentifier	 Instruction List
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
InstructionTargeter	TokenNameIdentifier	 Instruction Targeter
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
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
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
LocalVariableInstruction	TokenNameIdentifier	 Local Variable Instruction
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
LLOAD	TokenNameIdentifier	 LLOAD
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
LSTORE	TokenNameIdentifier	 LSTORE
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
MethodGen	TokenNameIdentifier	 Method Gen
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
NEW	TokenNameIdentifier	 NEW
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
PUTFIELD	TokenNameIdentifier	 PUTFIELD
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
RET	TokenNameIdentifier	 RET
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
Select	TokenNameIdentifier	 Select
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
TargetLostException	TokenNameIdentifier	 Target Lost Exception
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
Type	TokenNameIdentifier	 Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
Pattern	TokenNameIdentifier	 Pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
XSLTC	TokenNameIdentifier	 XSLTC
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
class	TokenNameclass	
MethodGenerator	TokenNameIdentifier	 Method Generator
extends	TokenNameextends	
MethodGen	TokenNameIdentifier	 Method Gen
implements	TokenNameimplements	
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
Constants	TokenNameIdentifier	 Constants
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INVALID_INDEX	TokenNameIdentifier	 INVALID  INDEX
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
START_ELEMENT_SIG	TokenNameIdentifier	 START  ELEMENT  SIG
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
")V"	TokenNameStringLiteral	)V
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
END_ELEMENT_SIG	TokenNameIdentifier	 END  ELEMENT  SIG
=	TokenNameEQUAL	
START_ELEMENT_SIG	TokenNameIdentifier	 START  ELEMENT  SIG
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InstructionList	TokenNameIdentifier	 Instruction List
_mapTypeSub	TokenNameIdentifier	 map Type Sub
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_INDEX	TokenNameIdentifier	 DOM  INDEX
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ITERATOR_INDEX	TokenNameIdentifier	 ITERATOR  INDEX
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HANDLER_INDEX	TokenNameIdentifier	 HANDLER  INDEX
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_METHOD_SIZE	TokenNameIdentifier	 MAX  METHOD  SIZE
=	TokenNameEQUAL	
65535	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_BRANCH_TARGET_OFFSET	TokenNameIdentifier	 MAX  BRANCH  TARGET  OFFSET
=	TokenNameEQUAL	
32767	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MIN_BRANCH_TARGET_OFFSET	TokenNameIdentifier	 MIN  BRANCH  TARGET  OFFSET
=	TokenNameEQUAL	
-	TokenNameMINUS	
32768	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TARGET_METHOD_SIZE	TokenNameIdentifier	 TARGET  METHOD  SIZE
=	TokenNameEQUAL	
60000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MINIMUM_OUTLINEABLE_CHUNK_SIZE	TokenNameIdentifier	 MINIMUM  OUTLINEABLE  CHUNK  SIZE
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Instruction	TokenNameIdentifier	 Instruction
_iloadCurrent	TokenNameIdentifier	 iload Current
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Instruction	TokenNameIdentifier	 Instruction
_istoreCurrent	TokenNameIdentifier	 istore Current
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_astoreHandler	TokenNameIdentifier	 astore Handler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_aloadHandler	TokenNameIdentifier	 aload Handler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_astoreIterator	TokenNameIdentifier	 astore Iterator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_aloadIterator	TokenNameIdentifier	 aload Iterator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_aloadDom	TokenNameIdentifier	 aload Dom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_astoreDom	TokenNameIdentifier	 astore Dom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_startElement	TokenNameIdentifier	 start Element
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_endElement	TokenNameIdentifier	 end Element
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_startDocument	TokenNameIdentifier	 start Document
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_endDocument	TokenNameIdentifier	 end Document
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_attribute	TokenNameIdentifier	 attribute
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_uniqueAttribute	TokenNameIdentifier	 unique Attribute
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_setStartNode	TokenNameIdentifier	 set Start Node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_reset	TokenNameIdentifier	 reset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SlotAllocator	TokenNameIdentifier	 Slot Allocator
_slotAllocator	TokenNameIdentifier	 slot Allocator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_allocatorInit	TokenNameIdentifier	 allocator Init
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LocalVariableRegistry	TokenNameIdentifier	 Local Variable Registry
_localVariableRegistry	TokenNameIdentifier	 local Variable Registry
;	TokenNameSEMICOLON	
/** * A mapping between patterns and instruction lists used by * test sequences to avoid compiling the same pattern multiple * times. Note that patterns whose kernels are "*", "node()" * and "@*" can between shared by test sequences. */	TokenNameCOMMENT_JAVADOC	 A mapping between patterns and instruction lists used by test sequences to avoid compiling the same pattern multiple times. Note that patterns whose kernels are "*", "node()" and "@*" can between shared by test sequences. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_preCompiled	TokenNameIdentifier	 pre Compiled
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MethodGenerator	TokenNameIdentifier	 Method Generator
(	TokenNameLPAREN	
int	TokenNameint	
access_flags	TokenNameIdentifier	 access flags
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
return_type	TokenNameIdentifier	 return type
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arg_types	TokenNameIdentifier	 arg types
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arg_names	TokenNameIdentifier	 arg names
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
method_name	TokenNameIdentifier	 method name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
class_name	TokenNameIdentifier	 class name
,	TokenNameCOMMA	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
,	TokenNameCOMMA	
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
cpg	TokenNameIdentifier	 cpg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
access_flags	TokenNameIdentifier	 access flags
,	TokenNameCOMMA	
return_type	TokenNameIdentifier	 return type
,	TokenNameCOMMA	
arg_types	TokenNameIdentifier	 arg types
,	TokenNameCOMMA	
arg_names	TokenNameIdentifier	 arg names
,	TokenNameCOMMA	
method_name	TokenNameIdentifier	 method name
,	TokenNameCOMMA	
class_name	TokenNameIdentifier	 class name
,	TokenNameCOMMA	
il	TokenNameIdentifier	 il
,	TokenNameCOMMA	
cpg	TokenNameIdentifier	 cpg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_astoreHandler	TokenNameIdentifier	 astore Handler
=	TokenNameEQUAL	
new	TokenNamenew	
ASTORE	TokenNameIdentifier	 ASTORE
(	TokenNameLPAREN	
HANDLER_INDEX	TokenNameIdentifier	 HANDLER  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_aloadHandler	TokenNameIdentifier	 aload Handler
=	TokenNameEQUAL	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
HANDLER_INDEX	TokenNameIdentifier	 HANDLER  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_astoreIterator	TokenNameIdentifier	 astore Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
ASTORE	TokenNameIdentifier	 ASTORE
(	TokenNameLPAREN	
ITERATOR_INDEX	TokenNameIdentifier	 ITERATOR  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_aloadIterator	TokenNameIdentifier	 aload Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
ITERATOR_INDEX	TokenNameIdentifier	 ITERATOR  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_aloadDom	TokenNameIdentifier	 aload Dom
=	TokenNameEQUAL	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
DOM_INDEX	TokenNameIdentifier	 DOM  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_astoreDom	TokenNameIdentifier	 astore Dom
=	TokenNameEQUAL	
new	TokenNamenew	
ASTORE	TokenNameIdentifier	 ASTORE
(	TokenNameLPAREN	
DOM_INDEX	TokenNameIdentifier	 DOM  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
startElement	TokenNameIdentifier	 start Element
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier	 TRANSLET  OUTPUT  INTERFACE
,	TokenNameCOMMA	
"startElement"	TokenNameStringLiteral	startElement
,	TokenNameCOMMA	
START_ELEMENT_SIG	TokenNameIdentifier	 START  ELEMENT  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_startElement	TokenNameIdentifier	 start Element
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
startElement	TokenNameIdentifier	 start Element
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
endElement	TokenNameIdentifier	 end Element
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier	 TRANSLET  OUTPUT  INTERFACE
,	TokenNameCOMMA	
"endElement"	TokenNameStringLiteral	endElement
,	TokenNameCOMMA	
END_ELEMENT_SIG	TokenNameIdentifier	 END  ELEMENT  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_endElement	TokenNameIdentifier	 end Element
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
endElement	TokenNameIdentifier	 end Element
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier	 TRANSLET  OUTPUT  INTERFACE
,	TokenNameCOMMA	
"addAttribute"	TokenNameStringLiteral	addAttribute
,	TokenNameCOMMA	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
")V"	TokenNameStringLiteral	)V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
attribute	TokenNameIdentifier	 attribute
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
uniqueAttribute	TokenNameIdentifier	 unique Attribute
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier	 TRANSLET  OUTPUT  INTERFACE
,	TokenNameCOMMA	
"addUniqueAttribute"	TokenNameStringLiteral	addUniqueAttribute
,	TokenNameCOMMA	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
"I)V"	TokenNameStringLiteral	I)V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_uniqueAttribute	TokenNameIdentifier	 unique Attribute
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
uniqueAttribute	TokenNameIdentifier	 unique Attribute
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier	 TRANSLET  OUTPUT  INTERFACE
,	TokenNameCOMMA	
"namespaceAfterStartElement"	TokenNameStringLiteral	namespaceAfterStartElement
,	TokenNameCOMMA	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
")V"	TokenNameStringLiteral	)V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier	 TRANSLET  OUTPUT  INTERFACE
,	TokenNameCOMMA	
"startDocument"	TokenNameStringLiteral	startDocument
,	TokenNameCOMMA	
"()V"	TokenNameStringLiteral	()V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_startDocument	TokenNameIdentifier	 start Document
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
TRANSLET_OUTPUT_INTERFACE	TokenNameIdentifier	 TRANSLET  OUTPUT  INTERFACE
,	TokenNameCOMMA	
"endDocument"	TokenNameStringLiteral	endDocument
,	TokenNameCOMMA	
"()V"	TokenNameStringLiteral	()V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_endDocument	TokenNameIdentifier	 end Document
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
NODE_ITERATOR	TokenNameIdentifier	 NODE  ITERATOR
,	TokenNameCOMMA	
SET_START_NODE	TokenNameIdentifier	 SET  START  NODE
,	TokenNameCOMMA	
SET_START_NODE_SIG	TokenNameIdentifier	 SET  START  NODE  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_setStartNode	TokenNameIdentifier	 set Start Node
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
NODE_ITERATOR	TokenNameIdentifier	 NODE  ITERATOR
,	TokenNameCOMMA	
"reset"	TokenNameStringLiteral	reset
,	TokenNameCOMMA	
"()"	TokenNameStringLiteral	()
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_reset	TokenNameIdentifier	 reset
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
NODE_ITERATOR	TokenNameIdentifier	 NODE  ITERATOR
,	TokenNameCOMMA	
NEXT	TokenNameIdentifier	 NEXT
,	TokenNameCOMMA	
NEXT_SIG	TokenNameIdentifier	 NEXT  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_slotAllocator	TokenNameIdentifier	 slot Allocator
=	TokenNameEQUAL	
new	TokenNamenew	
SlotAllocator	TokenNameIdentifier	 Slot Allocator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_slotAllocator	TokenNameIdentifier	 slot Allocator
.	TokenNameDOT	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
getLocalVariableRegistry	TokenNameIdentifier	 get Local Variable Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocals	TokenNameIdentifier	 get Locals
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_allocatorInit	TokenNameIdentifier	 allocator Init
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allocates a local variable. If the slot allocator has already been * initialized, then call addLocalVariable2() so that the new variable * is known to the allocator. Failing to do this may cause the allocator * to return a slot that is already in use. */	TokenNameCOMMENT_JAVADOC	 Allocates a local variable. If the slot allocator has already been initialized, then call addLocalVariable2() so that the new variable is known to the allocator. Failing to do this may cause the allocator to return a slot that is already in use. 
public	TokenNamepublic	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
addLocalVariable	TokenNameIdentifier	 add Local Variable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_allocatorInit	TokenNameIdentifier	 allocator Init
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
addLocalVariable2	TokenNameIdentifier	 add Local Variable2
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
addLocalVariable	TokenNameIdentifier	 add Local Variable
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getLocalVariableRegistry	TokenNameIdentifier	 get Local Variable Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
registerLocalVariable	TokenNameIdentifier	 register Local Variable
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lvg	TokenNameIdentifier	 lvg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
addLocalVariable2	TokenNameIdentifier	 add Local Variable2
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
addLocalVariable	TokenNameIdentifier	 add Local Variable
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
_slotAllocator	TokenNameIdentifier	 slot Allocator
.	TokenNameDOT	
allocateSlot	TokenNameIdentifier	 allocate Slot
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getLocalVariableRegistry	TokenNameIdentifier	 get Local Variable Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
registerLocalVariable	TokenNameIdentifier	 register Local Variable
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lvg	TokenNameIdentifier	 lvg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
LocalVariableRegistry	TokenNameIdentifier	 Local Variable Registry
getLocalVariableRegistry	TokenNameIdentifier	 get Local Variable Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_localVariableRegistry	TokenNameIdentifier	 local Variable Registry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_localVariableRegistry	TokenNameIdentifier	 local Variable Registry
=	TokenNameEQUAL	
new	TokenNamenew	
LocalVariableRegistry	TokenNameIdentifier	 Local Variable Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_localVariableRegistry	TokenNameIdentifier	 local Variable Registry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Keeps track of all local variables used in the method. * <p>The * {@link MethodGen#addLocalVariable(String,Type,InstructionHandle,InstructionHandle)}</code> * and * {@link MethodGen#addLocalVariable(String,Type,int,InstructionHandle,InstructionHandle)}</code> * methods of {@link MethodGen} will only keep track of * {@link LocalVariableGen} object until it'ss removed by a call to * {@link MethodGen#removeLocalVariable(LocalVariableGen)}.</p> * <p>In order to support efficient copying of local variables to outlined * methods by * {@link #outline(InstructionHandle,InstructionHandle,String,ClassGenerator)}, * this class keeps track of all local variables defined by the method.</p> */	TokenNameCOMMENT_JAVADOC	 Keeps track of all local variables used in the method. <p>The {@link MethodGen#addLocalVariable(String,Type,InstructionHandle,InstructionHandle)}</code> and {@link MethodGen#addLocalVariable(String,Type,int,InstructionHandle,InstructionHandle)}</code> methods of {@link MethodGen} will only keep track of {@link LocalVariableGen} object until it'ss removed by a call to {@link MethodGen#removeLocalVariable(LocalVariableGen)}.</p> <p>In order to support efficient copying of local variables to outlined methods by {@link #outline(InstructionHandle,InstructionHandle,String,ClassGenerator)}, this class keeps track of all local variables defined by the method.</p> 
protected	TokenNameprotected	
class	TokenNameclass	
LocalVariableRegistry	TokenNameIdentifier	 Local Variable Registry
{	TokenNameLBRACE	
/** * <p>A <code>java.lang.ArrayList</code> of all * {@link LocalVariableGen}s created for this method, indexed by the * slot number of the local variable. The JVM stack frame of local * variables is divided into "slots". A single slot can be used to * store more than one variable in a method, without regard to type, so * long as the byte code keeps the ranges of the two disjoint.</p> * <p>If only one registration of use of a particular slot occurs, the * corresponding entry of <code>_variables</code> contains the * <code>LocalVariableGen</code>; if more than one occurs, the * corresponding entry contains all such <code>LocalVariableGen</code>s * registered for the same slot; and if none occurs, the entry will be * <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 <p>A <code>java.lang.ArrayList</code> of all {@link LocalVariableGen}s created for this method, indexed by the slot number of the local variable. The JVM stack frame of local variables is divided into "slots". A single slot can be used to store more than one variable in a method, without regard to type, so long as the byte code keeps the ranges of the two disjoint.</p> <p>If only one registration of use of a particular slot occurs, the corresponding entry of <code>_variables</code> contains the <code>LocalVariableGen</code>; if more than one occurs, the corresponding entry contains all such <code>LocalVariableGen</code>s registered for the same slot; and if none occurs, the entry will be <code>null</code>. 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
_variables	TokenNameIdentifier	 variables
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Maps a name to a {@link LocalVariableGen} */	TokenNameCOMMENT_JAVADOC	 Maps a name to a {@link LocalVariableGen} 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
_nameToLVGMap	TokenNameIdentifier	 name To LVG Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Registers a {@link org.apache.bcel.generic.LocalVariableGen} * for this method. * <p><b>Preconditions:</b> * <ul> * <li>The range of instructions for <code>lvg</code> does not * overlap with the range of instructions for any * <code>LocalVariableGen</code> with the same slot index previously * registered for this method. <b><em>(Unchecked.)</em></b></li> * </ul></p> * @param lvg The variable to be registered */	TokenNameCOMMENT_JAVADOC	 Registers a {@link org.apache.bcel.generic.LocalVariableGen} for this method. <p><b>Preconditions:</b> <ul> <li>The range of instructions for <code>lvg</code> does not overlap with the range of instructions for any <code>LocalVariableGen</code> with the same slot index previously registered for this method. <b><em>(Unchecked.)</em></b></li> </ul></p> @param lvg The variable to be registered 
protected	TokenNameprotected	
void	TokenNamevoid	
registerLocalVariable	TokenNameIdentifier	 register Local Variable
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
registrySize	TokenNameIdentifier	 registry Size
=	TokenNameEQUAL	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the LocalVariableGen uses a slot index beyond any previously 	TokenNameCOMMENT_LINE	If the LocalVariableGen uses a slot index beyond any previously 
// encountered, expand the _variables, padding with intervening null 	TokenNameCOMMENT_LINE	encountered, expand the _variables, padding with intervening null 
// entries as required. 	TokenNameCOMMENT_LINE	entries as required. 
if	TokenNameif	
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
>=	TokenNameGREATER_EQUAL	
registrySize	TokenNameIdentifier	 registry Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
registrySize	TokenNameIdentifier	 registry Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
slot	TokenNameIdentifier	 slot
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// If the LocalVariableGen reuses a slot, make sure the entry 	TokenNameCOMMENT_LINE	If the LocalVariableGen reuses a slot, make sure the entry 
// in _variables contains an ArrayList and add the newly 	TokenNameCOMMENT_LINE	in _variables contains an ArrayList and add the newly 
// registered LocalVariableGen to the list. If the entry in 	TokenNameCOMMENT_LINE	registered LocalVariableGen to the list. If the entry in 
// _variables just contains null padding, store the 	TokenNameCOMMENT_LINE	_variables just contains null padding, store the 
// LocalVariableGen directly. 	TokenNameCOMMENT_LINE	LocalVariableGen directly. 
Object	TokenNameIdentifier	 Object
localsInSlot	TokenNameIdentifier	 locals In Slot
=	TokenNameEQUAL	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localsInSlot	TokenNameIdentifier	 locals In Slot
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localsInSlot	TokenNameIdentifier	 locals In Slot
instanceof	TokenNameinstanceof	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
listOfLocalsInSlot	TokenNameIdentifier	 list Of Locals In Slot
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listOfLocalsInSlot	TokenNameIdentifier	 list Of Locals In Slot
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
localsInSlot	TokenNameIdentifier	 locals In Slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listOfLocalsInSlot	TokenNameIdentifier	 list Of Locals In Slot
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
listOfLocalsInSlot	TokenNameIdentifier	 list Of Locals In Slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
localsInSlot	TokenNameIdentifier	 locals In Slot
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
registerByName	TokenNameIdentifier	 register By Name
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Find which {@link LocalVariableGen}, if any, is registered for a * particular JVM local stack frame slot at a particular position in the * byte code for the method.</p> * <p><b>Preconditions:</b> * <ul> * <li>The {@link InstructionList#setPositions()} has been called for * the {@link InstructionList} associated with this * {@link MethodGenerator}.</li> * </ul></p> * @param slot the JVM local stack frame slot number * @param offset the position in the byte code * @return the <code>LocalVariableGen</code> for the local variable * stored in the relevant slot at the relevant offset; <code>null</code> * if there is none. */	TokenNameCOMMENT_JAVADOC	 <p>Find which {@link LocalVariableGen}, if any, is registered for a particular JVM local stack frame slot at a particular position in the byte code for the method.</p> <p><b>Preconditions:</b> <ul> <li>The {@link InstructionList#setPositions()} has been called for the {@link InstructionList} associated with this {@link MethodGenerator}.</li> </ul></p> @param slot the JVM local stack frame slot number @param offset the position in the byte code @return the <code>LocalVariableGen</code> for the local variable stored in the relevant slot at the relevant offset; <code>null</code> if there is none. 
protected	TokenNameprotected	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lookupRegisteredLocalVariable	TokenNameIdentifier	 lookup Registered Local Variable
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
localsInSlot	TokenNameIdentifier	 locals In Slot
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_variables	TokenNameIdentifier	 variables
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// If this slot index was never used, _variables.get will return 	TokenNameCOMMENT_LINE	If this slot index was never used, _variables.get will return 
// null; if it was used once, it will return the LocalVariableGen; 	TokenNameCOMMENT_LINE	null; if it was used once, it will return the LocalVariableGen; 
// more than once it will return an ArrayList of all the 	TokenNameCOMMENT_LINE	more than once it will return an ArrayList of all the 
// LocalVariableGens for variables stored in that slot. For each 	TokenNameCOMMENT_LINE	LocalVariableGens for variables stored in that slot. For each 
// LocalVariableGen, check whether its range includes the 	TokenNameCOMMENT_LINE	LocalVariableGen, check whether its range includes the 
// specified offset, and return the first such encountered. 	TokenNameCOMMENT_LINE	specified offset, and return the first such encountered. 
if	TokenNameif	
(	TokenNameLPAREN	
localsInSlot	TokenNameIdentifier	 locals In Slot
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localsInSlot	TokenNameIdentifier	 locals In Slot
instanceof	TokenNameinstanceof	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
localsInSlot	TokenNameIdentifier	 locals In Slot
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetInLocalVariableGenRange	TokenNameIdentifier	 offset In Local Variable Gen Range
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lvg	TokenNameIdentifier	 lvg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
listOfLocalsInSlot	TokenNameIdentifier	 list Of Locals In Slot
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
localsInSlot	TokenNameIdentifier	 locals In Slot
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
listOfLocalsInSlot	TokenNameIdentifier	 list Of Locals In Slot
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
listOfLocalsInSlot	TokenNameIdentifier	 list Of Locals In Slot
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetInLocalVariableGenRange	TokenNameIdentifier	 offset In Local Variable Gen Range
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lvg	TokenNameIdentifier	 lvg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// No local variable stored in the specified slot at the specified 	TokenNameCOMMENT_LINE	No local variable stored in the specified slot at the specified 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Set up a mapping of the name of the specified * {@link LocalVariableGen} object to the <code>LocalVariableGen</code> * itself.</p> * <p>This is a bit of a hack. XSLTC is relying on the fact that the * name that is being looked up won't be duplicated, which isn't * guaranteed. It replaces code which used to call * {@link MethodGen#getLocalVariables()} and looped through the * <code>LocalVariableGen</code> objects it contained to find the one * with the specified name. However, <code>getLocalVariables()</code> * has the side effect of setting the start and end for any * <code>LocalVariableGen</code> which did not already have them * set, which causes problems for outlining..</p> * <p>See also {@link #lookUpByName(String)} and * {@link #removeByNameTracking(LocalVariableGen)}</P * @param lvg a <code>LocalVariableGen</code> */	TokenNameCOMMENT_JAVADOC	 <p>Set up a mapping of the name of the specified {@link LocalVariableGen} object to the <code>LocalVariableGen</code> itself.</p> <p>This is a bit of a hack. XSLTC is relying on the fact that the name that is being looked up won't be duplicated, which isn't guaranteed. It replaces code which used to call {@link MethodGen#getLocalVariables()} and looped through the <code>LocalVariableGen</code> objects it contained to find the one with the specified name. However, <code>getLocalVariables()</code> has the side effect of setting the start and end for any <code>LocalVariableGen</code> which did not already have them set, which causes problems for outlining..</p> <p>See also {@link #lookUpByName(String)} and {@link #removeByNameTracking(LocalVariableGen)}</P @param lvg a <code>LocalVariableGen</code> 
protected	TokenNameprotected	
void	TokenNamevoid	
registerByName	TokenNameIdentifier	 register By Name
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
=	TokenNameEQUAL	
_nameToLVGMap	TokenNameIdentifier	 name To LVG Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nameToLVGMap	TokenNameIdentifier	 name To LVG Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
sameNameList	TokenNameIdentifier	 same Name List
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
instanceof	TokenNameinstanceof	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sameNameList	TokenNameIdentifier	 same Name List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
;	TokenNameSEMICOLON	
sameNameList	TokenNameIdentifier	 same Name List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sameNameList	TokenNameIdentifier	 same Name List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sameNameList	TokenNameIdentifier	 same Name List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sameNameList	TokenNameIdentifier	 same Name List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_nameToLVGMap	TokenNameIdentifier	 name To LVG Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sameNameList	TokenNameIdentifier	 same Name List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Remove the mapping from the name of the specified * {@link LocalVariableGen} to itself. * See also {@link #registerByName(LocalVariableGen)} and * {@link #lookUpByName(String)} * @param lvg a <code>LocalVariableGen</code> */	TokenNameCOMMENT_JAVADOC	 Remove the mapping from the name of the specified {@link LocalVariableGen} to itself. See also {@link #registerByName(LocalVariableGen)} and {@link #lookUpByName(String)} @param lvg a <code>LocalVariableGen</code> 
protected	TokenNameprotected	
void	TokenNamevoid	
removeByNameTracking	TokenNameIdentifier	 remove By Name Tracking
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
=	TokenNameEQUAL	
_nameToLVGMap	TokenNameIdentifier	 name To LVG Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
instanceof	TokenNameinstanceof	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
sameNameList	TokenNameIdentifier	 same Name List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sameNameList	TokenNameIdentifier	 same Name List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sameNameList	TokenNameIdentifier	 same Name List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sameNameList	TokenNameIdentifier	 same Name List
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_nameToLVGMap	TokenNameIdentifier	 name To LVG Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Given the name of a variable, finds a {@link LocalVariableGen} * corresponding to it.</p> * <p>See also {@link #registerByName(LocalVariableGen)} and * {@link #removeByNameTracking(LocalVariableGen)}</p> * @param name * @return */	TokenNameCOMMENT_JAVADOC	 <p>Given the name of a variable, finds a {@link LocalVariableGen} corresponding to it.</p> <p>See also {@link #registerByName(LocalVariableGen)} and {@link #removeByNameTracking(LocalVariableGen)}</p> @param name @return 
protected	TokenNameprotected	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lookUpByName	TokenNameIdentifier	 look Up By Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
=	TokenNameEQUAL	
_nameToLVGMap	TokenNameIdentifier	 name To LVG Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
instanceof	TokenNameinstanceof	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
sameNameList	TokenNameIdentifier	 same Name List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sameNameList	TokenNameIdentifier	 same Name List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
sameNameList	TokenNameIdentifier	 same Name List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
duplicateNameEntry	TokenNameIdentifier	 duplicate Name Entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lvg	TokenNameIdentifier	 lvg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Gets all {@link LocalVariableGen} objects for this method.</p> * <p>When the <code>includeRemoved</code> argument has the value * <code>false</code>, this method replaces uses of * {@link MethodGen#getLocalVariables()} which has * a side-effect of setting the start and end range for any * <code>LocalVariableGen</code> if either was <code>null</code>. That * side-effect causes problems for outlining of code in XSLTC. * @param includeRemoved Specifies whether all local variables ever * declared should be returned (<code>true</code>) or only those not * removed (<code>false</code>) * @return an array of <code>LocalVariableGen</code> containing all the * local variables */	TokenNameCOMMENT_JAVADOC	 <p>Gets all {@link LocalVariableGen} objects for this method.</p> <p>When the <code>includeRemoved</code> argument has the value <code>false</code>, this method replaces uses of {@link MethodGen#getLocalVariables()} which has a side-effect of setting the start and end range for any <code>LocalVariableGen</code> if either was <code>null</code>. That side-effect causes problems for outlining of code in XSLTC. @param includeRemoved Specifies whether all local variables ever declared should be returned (<code>true</code>) or only those not removed (<code>false</code>) @return an array of <code>LocalVariableGen</code> containing all the local variables 
protected	TokenNameprotected	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocals	TokenNameIdentifier	 get Locals
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includeRemoved	TokenNameIdentifier	 include Removed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
locals	TokenNameIdentifier	 locals
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
allVarsEverDeclared	TokenNameIdentifier	 all Vars Ever Declared
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
includeRemoved	TokenNameIdentifier	 include Removed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
slotCount	TokenNameIdentifier	 slot Count
=	TokenNameEQUAL	
allVarsEverDeclared	TokenNameIdentifier	 all Vars Ever Declared
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
slotCount	TokenNameIdentifier	 slot Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
slotEntries	TokenNameIdentifier	 slot Entries
=	TokenNameEQUAL	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slotEntries	TokenNameIdentifier	 slot Entries
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
slotEntries	TokenNameIdentifier	 slot Entries
instanceof	TokenNameinstanceof	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
slotList	TokenNameIdentifier	 slot List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
slotEntries	TokenNameIdentifier	 slot Entries
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
slotList	TokenNameIdentifier	 slot List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allVarsEverDeclared	TokenNameIdentifier	 all Vars Ever Declared
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slotList	TokenNameIdentifier	 slot List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
allVarsEverDeclared	TokenNameIdentifier	 all Vars Ever Declared
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
slotEntries	TokenNameIdentifier	 slot Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
nameVarsPairsIter	TokenNameIdentifier	 name Vars Pairs Iter
=	TokenNameEQUAL	
_nameToLVGMap	TokenNameIdentifier	 name To LVG Map
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nameVarsPairsIter	TokenNameIdentifier	 name Vars Pairs Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
nameVarsPair	TokenNameIdentifier	 name Vars Pair
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
nameVarsPairsIter	TokenNameIdentifier	 name Vars Pairs Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
nameVarsPair	TokenNameIdentifier	 name Vars Pair
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
instanceof	TokenNameinstanceof	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
varsList	TokenNameIdentifier	 vars List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
vars	TokenNameIdentifier	 vars
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
varsList	TokenNameIdentifier	 vars List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allVarsEverDeclared	TokenNameIdentifier	 all Vars Ever Declared
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
varsList	TokenNameIdentifier	 vars List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
allVarsEverDeclared	TokenNameIdentifier	 all Vars Ever Declared
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
locals	TokenNameIdentifier	 locals
=	TokenNameEQUAL	
new	TokenNamenew	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
[	TokenNameLBRACKET	
allVarsEverDeclared	TokenNameIdentifier	 all Vars Ever Declared
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
allVarsEverDeclared	TokenNameIdentifier	 all Vars Ever Declared
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
locals	TokenNameIdentifier	 locals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
locals	TokenNameIdentifier	 locals
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Determines whether a particular variable is in use at a particular offset * in the byte code for this method. * <p><b>Preconditions:</b> * <ul> * <li>The {@link InstructionList#setPositions()} has been called for the * {@link InstructionList} associated with this {@link MethodGenerator}. * </li></ul></p> * @param lvg the {@link LocalVariableGen} for the variable * @param offset the position in the byte code * @return <code>true</code> if and only if the specified variable is in * use at the particular byte code offset. */	TokenNameCOMMENT_JAVADOC	 Determines whether a particular variable is in use at a particular offset in the byte code for this method. <p><b>Preconditions:</b> <ul> <li>The {@link InstructionList#setPositions()} has been called for the {@link InstructionList} associated with this {@link MethodGenerator}. </li></ul></p> @param lvg the {@link LocalVariableGen} for the variable @param offset the position in the byte code @return <code>true</code> if and only if the specified variable is in use at the particular byte code offset. 
boolean	TokenNameboolean	
offsetInLocalVariableGenRange	TokenNameIdentifier	 offset In Local Variable Gen Range
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
lvgStart	TokenNameIdentifier	 lvg Start
=	TokenNameEQUAL	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
lvgEnd	TokenNameIdentifier	 lvg End
=	TokenNameEQUAL	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no start handle is recorded for the LocalVariableGen, it is 	TokenNameCOMMENT_LINE	If no start handle is recorded for the LocalVariableGen, it is 
// assumed to be in use from the beginning of the method. 	TokenNameCOMMENT_LINE	assumed to be in use from the beginning of the method. 
if	TokenNameif	
(	TokenNameLPAREN	
lvgStart	TokenNameIdentifier	 lvg Start
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lvgStart	TokenNameIdentifier	 lvg Start
=	TokenNameEQUAL	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If no end handle is recorded for the LocalVariableGen, it is assumed 	TokenNameCOMMENT_LINE	If no end handle is recorded for the LocalVariableGen, it is assumed 
// to be in use to the end of the method. 	TokenNameCOMMENT_LINE	to be in use to the end of the method. 
if	TokenNameif	
(	TokenNameLPAREN	
lvgEnd	TokenNameIdentifier	 lvg End
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lvgEnd	TokenNameIdentifier	 lvg End
=	TokenNameEQUAL	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Does the range of the instruction include the specified offset? 	TokenNameCOMMENT_LINE	Does the range of the instruction include the specified offset? 
// Note that the InstructionHandle.getPosition method returns the 	TokenNameCOMMENT_LINE	Note that the InstructionHandle.getPosition method returns the 
// offset of the beginning of an instruction. A LocalVariableGen's 	TokenNameCOMMENT_LINE	offset of the beginning of an instruction. A LocalVariableGen's 
// range includes the end instruction itself, so that instruction's 	TokenNameCOMMENT_LINE	range includes the end instruction itself, so that instruction's 
// length must be taken into consideration in computing whether the 	TokenNameCOMMENT_LINE	length must be taken into consideration in computing whether the 
// varible is in range at a particular offset. 	TokenNameCOMMENT_LINE	varible is in range at a particular offset. 
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lvgStart	TokenNameIdentifier	 lvg Start
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
lvgEnd	TokenNameIdentifier	 lvg End
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
lvgEnd	TokenNameIdentifier	 lvg End
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeLocalVariable	TokenNameIdentifier	 remove Local Variable
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_slotAllocator	TokenNameIdentifier	 slot Allocator
.	TokenNameDOT	
releaseSlot	TokenNameIdentifier	 release Slot
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getLocalVariableRegistry	TokenNameIdentifier	 get Local Variable Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeByNameTracking	TokenNameIdentifier	 remove By Name Tracking
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
removeLocalVariable	TokenNameIdentifier	 remove Local Variable
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadDOM	TokenNameIdentifier	 load DOM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_aloadDom	TokenNameIdentifier	 aload Dom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
storeDOM	TokenNameIdentifier	 store DOM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_astoreDom	TokenNameIdentifier	 astore Dom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
storeHandler	TokenNameIdentifier	 store Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_astoreHandler	TokenNameIdentifier	 astore Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadHandler	TokenNameIdentifier	 load Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_aloadHandler	TokenNameIdentifier	 aload Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
storeIterator	TokenNameIdentifier	 store Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_astoreIterator	TokenNameIdentifier	 astore Iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadIterator	TokenNameIdentifier	 load Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_aloadIterator	TokenNameIdentifier	 aload Iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_setStartNode	TokenNameIdentifier	 set Start Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_reset	TokenNameIdentifier	 reset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_startElement	TokenNameIdentifier	 start Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_endElement	TokenNameIdentifier	 end Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_startDocument	TokenNameIdentifier	 start Document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_endDocument	TokenNameIdentifier	 end Document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
attribute	TokenNameIdentifier	 attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_attribute	TokenNameIdentifier	 attribute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
uniqueAttribute	TokenNameIdentifier	 unique Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_uniqueAttribute	TokenNameIdentifier	 unique Attribute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
namespace	TokenNameIdentifier	 namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_namespace	TokenNameIdentifier	 namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadCurrentNode	TokenNameIdentifier	 load Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_iloadCurrent	TokenNameIdentifier	 iload Current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
getLocalIndex	TokenNameIdentifier	 get Local Index
(	TokenNameLPAREN	
"current"	TokenNameStringLiteral	current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_iloadCurrent	TokenNameIdentifier	 iload Current
=	TokenNameEQUAL	
new	TokenNamenew	
ILOAD	TokenNameIdentifier	 ILOAD
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_iloadCurrent	TokenNameIdentifier	 iload Current
=	TokenNameEQUAL	
new	TokenNamenew	
ICONST	TokenNameIdentifier	 ICONST
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_iloadCurrent	TokenNameIdentifier	 iload Current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
storeCurrentNode	TokenNameIdentifier	 store Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_istoreCurrent	TokenNameIdentifier	 istore Current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
_istoreCurrent	TokenNameIdentifier	 istore Current
:	TokenNameCOLON	
(	TokenNameLPAREN	
_istoreCurrent	TokenNameIdentifier	 istore Current
=	TokenNameEQUAL	
new	TokenNamenew	
ISTORE	TokenNameIdentifier	 ISTORE
(	TokenNameLPAREN	
getLocalIndex	TokenNameIdentifier	 get Local Index
(	TokenNameLPAREN	
"current"	TokenNameStringLiteral	current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** by default context node is the same as current node. MK437 */	TokenNameCOMMENT_JAVADOC	 by default context node is the same as current node. MK437 
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadContextNode	TokenNameIdentifier	 load Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loadCurrentNode	TokenNameIdentifier	 load Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
storeContextNode	TokenNameIdentifier	 store Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
storeCurrentNode	TokenNameIdentifier	 store Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLocalIndex	TokenNameIdentifier	 get Local Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalVariable	TokenNameIdentifier	 get Local Variable
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
getLocalVariable	TokenNameIdentifier	 get Local Variable
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLocalVariableRegistry	TokenNameIdentifier	 get Local Variable Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lookUpByName	TokenNameIdentifier	 look Up By Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxLocals	TokenNameIdentifier	 set Max Locals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the current number of local variable slots 	TokenNameCOMMENT_LINE	Get the current number of local variable slots 
int	TokenNameint	
maxLocals	TokenNameIdentifier	 max Locals
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getMaxLocals	TokenNameIdentifier	 get Max Locals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get numer of actual variables 	TokenNameCOMMENT_LINE	Get numer of actual variables 
final	TokenNamefinal	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
localVars	TokenNameIdentifier	 local Vars
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getLocalVariables	TokenNameIdentifier	 get Local Variables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
localVars	TokenNameIdentifier	 local Vars
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localVars	TokenNameIdentifier	 local Vars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
maxLocals	TokenNameIdentifier	 max Locals
)	TokenNameRPAREN	
maxLocals	TokenNameIdentifier	 max Locals
=	TokenNameEQUAL	
localVars	TokenNameIdentifier	 local Vars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We want at least 5 local variable slots (for parameters) 	TokenNameCOMMENT_LINE	We want at least 5 local variable slots (for parameters) 
if	TokenNameif	
(	TokenNameLPAREN	
maxLocals	TokenNameIdentifier	 max Locals
<	TokenNameLESS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
maxLocals	TokenNameIdentifier	 max Locals
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setMaxLocals	TokenNameIdentifier	 set Max Locals
(	TokenNameLPAREN	
maxLocals	TokenNameIdentifier	 max Locals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a pre-compiled pattern to this mode. */	TokenNameCOMMENT_JAVADOC	 Add a pre-compiled pattern to this mode. 
public	TokenNamepublic	
void	TokenNamevoid	
addInstructionList	TokenNameIdentifier	 add Instruction List
(	TokenNameLPAREN	
Pattern	TokenNameIdentifier	 Pattern
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
InstructionList	TokenNameIdentifier	 Instruction List
ilist	TokenNameIdentifier	 ilist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_preCompiled	TokenNameIdentifier	 pre Compiled
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
ilist	TokenNameIdentifier	 ilist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the instruction list for a pre-compiled pattern. Used by * test sequences to avoid compiling patterns more than once. */	TokenNameCOMMENT_JAVADOC	 Get the instruction list for a pre-compiled pattern. Used by test sequences to avoid compiling patterns more than once. 
public	TokenNamepublic	
InstructionList	TokenNameIdentifier	 Instruction List
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
Pattern	TokenNameIdentifier	 Pattern
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
InstructionList	TokenNameIdentifier	 Instruction List
)	TokenNameRPAREN	
_preCompiled	TokenNameIdentifier	 pre Compiled
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used to keep track of an outlineable chunk of instructions in the * current method. See {@link OutlineableChunkStart} and * {@link OutlineableChunkEnd} for more information. */	TokenNameCOMMENT_JAVADOC	 Used to keep track of an outlineable chunk of instructions in the current method. See {@link OutlineableChunkStart} and {@link OutlineableChunkEnd} for more information. 
private	TokenNameprivate	
class	TokenNameclass	
Chunk	TokenNameIdentifier	 Chunk
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
{	TokenNameLBRACE	
/** * {@link InstructionHandle} of the first instruction in the outlineable * chunk. */	TokenNameCOMMENT_JAVADOC	 {@link InstructionHandle} of the first instruction in the outlineable chunk. 
private	TokenNameprivate	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
m_start	TokenNameIdentifier	 m start
;	TokenNameSEMICOLON	
/** * {@link org.apache.bcel.generic.InstructionHandle} of the first * instruction in the outlineable chunk. */	TokenNameCOMMENT_JAVADOC	 {@link org.apache.bcel.generic.InstructionHandle} of the first instruction in the outlineable chunk. 
private	TokenNameprivate	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
m_end	TokenNameIdentifier	 m end
;	TokenNameSEMICOLON	
/** * Number of bytes in the instructions contained in this outlineable * chunk. */	TokenNameCOMMENT_JAVADOC	 Number of bytes in the instructions contained in this outlineable chunk. 
private	TokenNameprivate	
int	TokenNameint	
m_size	TokenNameIdentifier	 m size
;	TokenNameSEMICOLON	
/** * <p>Constructor for an outlineable {@link MethodGenerator.Chunk}.</p> * <p><b>Preconditions:</b> * <ul> * <li>The {@link InstructionList#setPositions()} has been called for * the {@link InstructionList} associated with this * {@link MethodGenerator}.</li> * </ul></p> * @param start The {@link InstructionHandle} of the first * instruction in the outlineable chunk. * @param end The {@link InstructionHandle} of the last * instruction in the outlineable chunk. */	TokenNameCOMMENT_JAVADOC	 <p>Constructor for an outlineable {@link MethodGenerator.Chunk}.</p> <p><b>Preconditions:</b> <ul> <li>The {@link InstructionList#setPositions()} has been called for the {@link InstructionList} associated with this {@link MethodGenerator}.</li> </ul></p> @param start The {@link InstructionHandle} of the first instruction in the outlineable chunk. @param end The {@link InstructionHandle} of the last instruction in the outlineable chunk. 
Chunk	TokenNameIdentifier	 Chunk
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_start	TokenNameIdentifier	 m start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
m_end	TokenNameIdentifier	 m end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
m_size	TokenNameIdentifier	 m size
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines whether this outlineable {@link MethodGenerator.Chunk} is * followed immediately by the argument * <code>MethodGenerator.Chunk</code>, with no other intervening * instructions, including {@link OutlineableChunkStart} or * {@link OutlineableChunkEnd} instructions. * @param neighbour an outlineable {@link MethodGenerator.Chunk} * @return <code>true</code> if and only if the argument chunk * immediately follows <code>this</code> chunk */	TokenNameCOMMENT_JAVADOC	 Determines whether this outlineable {@link MethodGenerator.Chunk} is followed immediately by the argument <code>MethodGenerator.Chunk</code>, with no other intervening instructions, including {@link OutlineableChunkStart} or {@link OutlineableChunkEnd} instructions. @param neighbour an outlineable {@link MethodGenerator.Chunk} @return <code>true</code> if and only if the argument chunk immediately follows <code>this</code> chunk 
boolean	TokenNameboolean	
isAdjacentTo	TokenNameIdentifier	 is Adjacent To
(	TokenNameLPAREN	
Chunk	TokenNameIdentifier	 Chunk
neighbour	TokenNameIdentifier	 neighbour
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getChunkEnd	TokenNameIdentifier	 get Chunk End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
neighbour	TokenNameIdentifier	 neighbour
.	TokenNameDOT	
getChunkStart	TokenNameIdentifier	 get Chunk Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Getter method for the start of this {@linke MethodGenerator.Chunk} * @return the {@link org.apache.bcel.generic.InstructionHandle} of the * start of this chunk */	TokenNameCOMMENT_JAVADOC	 Getter method for the start of this {@linke MethodGenerator.Chunk} @return the {@link org.apache.bcel.generic.InstructionHandle} of the start of this chunk 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
getChunkStart	TokenNameIdentifier	 get Chunk Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_start	TokenNameIdentifier	 m start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Getter method for the end of this {@link MethodGenerator.Chunk} * @return the {@link InstructionHandle} of the start of this chunk */	TokenNameCOMMENT_JAVADOC	 Getter method for the end of this {@link MethodGenerator.Chunk} @return the {@link InstructionHandle} of the start of this chunk 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
getChunkEnd	TokenNameIdentifier	 get Chunk End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_end	TokenNameIdentifier	 m end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The size of this {@link MethodGenerator.Chunk} * @return the number of bytes in the byte code represented by this * chunk. */	TokenNameCOMMENT_JAVADOC	 The size of this {@link MethodGenerator.Chunk} @return the number of bytes in the byte code represented by this chunk. 
int	TokenNameint	
getChunkSize	TokenNameIdentifier	 get Chunk Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_size	TokenNameIdentifier	 m size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements the <code>java.util.Comparable.compareTo(Object)</code> * method. * @return * <ul> * <li>A positive <code>int</code> if the length of <code>this</code> * chunk in bytes is greater than that of <code>comparand</code></li> * <li>A negative <code>int</code> if the length of <code>this</code> * chunk in bytes is less than that of <code>comparand</code></li> * <li>Zero, otherwise.</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Implements the <code>java.util.Comparable.compareTo(Object)</code> method. @return <ul> <li>A positive <code>int</code> if the length of <code>this</code> chunk in bytes is greater than that of <code>comparand</code></li> <li>A negative <code>int</code> if the length of <code>this</code> chunk in bytes is less than that of <code>comparand</code></li> <li>Zero, otherwise.</li> </ul> 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
comparand	TokenNameIdentifier	 comparand
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getChunkSize	TokenNameIdentifier	 get Chunk Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Chunk	TokenNameIdentifier	 Chunk
)	TokenNameRPAREN	
comparand	TokenNameIdentifier	 comparand
)	TokenNameRPAREN	
.	TokenNameDOT	
getChunkSize	TokenNameIdentifier	 get Chunk Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Find the outlineable chunks in this method that would be the best choices * to outline, based on size and position in the method. * @param classGen The {@link ClassGen} with which the generated methods * will be associated * @param totalMethodSize the size of the bytecode in the original method * @return a <code>java.util.ArrayList</code> containing the * {@link MethodGenerator.Chunk}s that may be outlined from this method */	TokenNameCOMMENT_JAVADOC	 Find the outlineable chunks in this method that would be the best choices to outline, based on size and position in the method. @param classGen The {@link ClassGen} with which the generated methods will be associated @param totalMethodSize the size of the bytecode in the original method @return a <code>java.util.ArrayList</code> containing the {@link MethodGenerator.Chunk}s that may be outlined from this method 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
getCandidateChunks	TokenNameIdentifier	 get Candidate Chunks
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
int	TokenNameint	
totalMethodSize	TokenNameIdentifier	 total Method Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
instructions	TokenNameIdentifier	 instructions
=	TokenNameEQUAL	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
candidateChunks	TokenNameIdentifier	 candidate Chunks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Stack	TokenNameIdentifier	 Stack
subChunkStack	TokenNameIdentifier	 sub Chunk Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
openChunkAtCurrLevel	TokenNameIdentifier	 open Chunk At Curr Level
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
firstInstruction	TokenNameIdentifier	 first Instruction
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
currentHandle	TokenNameIdentifier	 current Handle
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_openChunks	TokenNameIdentifier	 m open Chunks
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
OUTLINE_ERR_UNBALANCED_MARKERS	TokenNameIdentifier	 OUTLINE  ERR  UNBALANCED  MARKERS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InternalError	TokenNameIdentifier	 Internal Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Scan instructions in the method, keeping track of the nesting level 	TokenNameCOMMENT_LINE	Scan instructions in the method, keeping track of the nesting level 
// of outlineable chunks. 	TokenNameCOMMENT_LINE	of outlineable chunks. 
// 	TokenNameCOMMENT_LINE	 
// currLevelChunks 	TokenNameCOMMENT_LINE	currLevelChunks 
// keeps track of the child chunks of a chunk. For each chunk, 	TokenNameCOMMENT_LINE	keeps track of the child chunks of a chunk. For each chunk, 
// there will be a pair of entries: the InstructionHandles for the 	TokenNameCOMMENT_LINE	there will be a pair of entries: the InstructionHandles for the 
// start and for the end of the chunk 	TokenNameCOMMENT_LINE	start and for the end of the chunk 
// subChunkStack 	TokenNameCOMMENT_LINE	subChunkStack 
// a stack containing the partially accumulated currLevelChunks for 	TokenNameCOMMENT_LINE	a stack containing the partially accumulated currLevelChunks for 
// each chunk that's still open at the current position in the 	TokenNameCOMMENT_LINE	each chunk that's still open at the current position in the 
// InstructionList. 	TokenNameCOMMENT_LINE	InstructionList. 
// candidateChunks 	TokenNameCOMMENT_LINE	candidateChunks 
// the list of chunks which have been accepted as candidates chunks 	TokenNameCOMMENT_LINE	the list of chunks which have been accepted as candidates chunks 
// for outlining 	TokenNameCOMMENT_LINE	for outlining 
do	TokenNamedo	
{	TokenNameLBRACE	
// Get the next instruction. The loop will perform one extra 	TokenNameCOMMENT_LINE	Get the next instruction. The loop will perform one extra 
// iteration after it reaches the end of the InstructionList, with 	TokenNameCOMMENT_LINE	iteration after it reaches the end of the InstructionList, with 
// currentHandle set to null. 	TokenNameCOMMENT_LINE	currentHandle set to null. 
currentHandle	TokenNameIdentifier	 current Handle
=	TokenNameEQUAL	
instructions	TokenNameIdentifier	 instructions
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
instructions	TokenNameIdentifier	 instructions
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Instruction	TokenNameIdentifier	 Instruction
inst	TokenNameIdentifier	 inst
=	TokenNameEQUAL	
(	TokenNameLPAREN	
currentHandle	TokenNameIdentifier	 current Handle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
currentHandle	TokenNameIdentifier	 current Handle
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// At the first iteration, create a chunk representing all the 	TokenNameCOMMENT_LINE	At the first iteration, create a chunk representing all the 
// code in the method. This is done just to simplify the logic - 	TokenNameCOMMENT_LINE	code in the method. This is done just to simplify the logic - 
// this chunk can never be outlined because it will be too big. 	TokenNameCOMMENT_LINE	this chunk can never be outlined because it will be too big. 
if	TokenNameif	
(	TokenNameLPAREN	
firstInstruction	TokenNameIdentifier	 first Instruction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
openChunkAtCurrLevel	TokenNameIdentifier	 open Chunk At Curr Level
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentHandle	TokenNameIdentifier	 current Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstInstruction	TokenNameIdentifier	 first Instruction
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Found a new chunk 	TokenNameCOMMENT_LINE	Found a new chunk 
if	TokenNameif	
(	TokenNameLPAREN	
inst	TokenNameIdentifier	 inst
instanceof	TokenNameinstanceof	
OutlineableChunkStart	TokenNameIdentifier	 Outlineable Chunk Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If last MarkerInstruction encountered was an 	TokenNameCOMMENT_LINE	If last MarkerInstruction encountered was an 
// OutlineableChunkStart, this represents the first chunk 	TokenNameCOMMENT_LINE	OutlineableChunkStart, this represents the first chunk 
// nested within that previous chunk - push the list of chunks 	TokenNameCOMMENT_LINE	nested within that previous chunk - push the list of chunks 
// from the outer level onto the stack 	TokenNameCOMMENT_LINE	from the outer level onto the stack 
if	TokenNameif	
(	TokenNameLPAREN	
openChunkAtCurrLevel	TokenNameIdentifier	 open Chunk At Curr Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subChunkStack	TokenNameIdentifier	 sub Chunk Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
openChunkAtCurrLevel	TokenNameIdentifier	 open Chunk At Curr Level
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentHandle	TokenNameIdentifier	 current Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Close off an open chunk 	TokenNameCOMMENT_LINE	Close off an open chunk 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currentHandle	TokenNameIdentifier	 current Handle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
inst	TokenNameIdentifier	 inst
instanceof	TokenNameinstanceof	
OutlineableChunkEnd	TokenNameIdentifier	 Outlineable Chunk End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
nestedSubChunks	TokenNameIdentifier	 nested Sub Chunks
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// If the last MarkerInstruction encountered was an 	TokenNameCOMMENT_LINE	If the last MarkerInstruction encountered was an 
// OutlineableChunkEnd, it means that the current instruction 	TokenNameCOMMENT_LINE	OutlineableChunkEnd, it means that the current instruction 
// marks the end of a chunk that contained child chunks. 	TokenNameCOMMENT_LINE	marks the end of a chunk that contained child chunks. 
// Those children might need to be examined below in case they 	TokenNameCOMMENT_LINE	Those children might need to be examined below in case they 
// are better candidates for outlining than the current chunk. 	TokenNameCOMMENT_LINE	are better candidates for outlining than the current chunk. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
openChunkAtCurrLevel	TokenNameIdentifier	 open Chunk At Curr Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nestedSubChunks	TokenNameIdentifier	 nested Sub Chunks
=	TokenNameEQUAL	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
;	TokenNameSEMICOLON	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
)	TokenNameRPAREN	
subChunkStack	TokenNameIdentifier	 sub Chunk Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get the handle for the start of this chunk (the last entry 	TokenNameCOMMENT_LINE	Get the handle for the start of this chunk (the last entry 
// in currLevelChunks) 	TokenNameCOMMENT_LINE	in currLevelChunks) 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
chunkStart	TokenNameIdentifier	 chunk Start
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkEndPosition	TokenNameIdentifier	 chunk End Position
=	TokenNameEQUAL	
(	TokenNameLPAREN	
currentHandle	TokenNameIdentifier	 current Handle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
currentHandle	TokenNameIdentifier	 current Handle
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
totalMethodSize	TokenNameIdentifier	 total Method Size
;	TokenNameSEMICOLON	
int	TokenNameint	
chunkSize	TokenNameIdentifier	 chunk Size
=	TokenNameEQUAL	
chunkEndPosition	TokenNameIdentifier	 chunk End Position
-	TokenNameMINUS	
chunkStart	TokenNameIdentifier	 chunk Start
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Two ranges of chunk size to consider: 	TokenNameCOMMENT_LINE	Two ranges of chunk size to consider: 
// 	TokenNameCOMMENT_LINE	 
// 1. [0,TARGET_METHOD_SIZE] 	TokenNameCOMMENT_LINE	1. [0,TARGET_METHOD_SIZE] 
// Keep this chunk in consideration as a candidate, 	TokenNameCOMMENT_LINE	Keep this chunk in consideration as a candidate, 
// and ignore its subchunks, if any - there's nothing to be 	TokenNameCOMMENT_LINE	and ignore its subchunks, if any - there's nothing to be 
// gained by outlining both the current chunk and its 	TokenNameCOMMENT_LINE	gained by outlining both the current chunk and its 
// children! 	TokenNameCOMMENT_LINE	children! 
// 	TokenNameCOMMENT_LINE	 
// 2. (TARGET_METHOD_SIZE,+infinity) 	TokenNameCOMMENT_LINE	2. (TARGET_METHOD_SIZE,+infinity) 
// Ignore this chunk - it's too big. Add its subchunks 	TokenNameCOMMENT_LINE	Ignore this chunk - it's too big. Add its subchunks 
// as candidates, after merging adjacent chunks to produce 	TokenNameCOMMENT_LINE	as candidates, after merging adjacent chunks to produce 
// chunks that are as large as possible 	TokenNameCOMMENT_LINE	chunks that are as large as possible 
if	TokenNameif	
(	TokenNameLPAREN	
chunkSize	TokenNameIdentifier	 chunk Size
<=	TokenNameLESS_EQUAL	
TARGET_METHOD_SIZE	TokenNameIdentifier	 TARGET  METHOD  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentHandle	TokenNameIdentifier	 current Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
openChunkAtCurrLevel	TokenNameIdentifier	 open Chunk At Curr Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
childChunkCount	TokenNameIdentifier	 child Chunk Count
=	TokenNameEQUAL	
nestedSubChunks	TokenNameIdentifier	 nested Sub Chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childChunkCount	TokenNameIdentifier	 child Chunk Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Chunk	TokenNameIdentifier	 Chunk
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
childChunks	TokenNameIdentifier	 child Chunks
=	TokenNameEQUAL	
new	TokenNamenew	
Chunk	TokenNameIdentifier	 Chunk
[	TokenNameLBRACKET	
childChunkCount	TokenNameIdentifier	 child Chunk Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Gather all the child chunks of the current chunk 	TokenNameCOMMENT_LINE	Gather all the child chunks of the current chunk 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
childChunkCount	TokenNameIdentifier	 child Chunk Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
nestedSubChunks	TokenNameIdentifier	 nested Sub Chunks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
nestedSubChunks	TokenNameIdentifier	 nested Sub Chunks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childChunks	TokenNameIdentifier	 child Chunks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Chunk	TokenNameIdentifier	 Chunk
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Merge adjacent siblings 	TokenNameCOMMENT_LINE	Merge adjacent siblings 
ArrayList	TokenNameIdentifier	 Array List
mergedChildChunks	TokenNameIdentifier	 merged Child Chunks
=	TokenNameEQUAL	
mergeAdjacentChunks	TokenNameIdentifier	 merge Adjacent Chunks
(	TokenNameLPAREN	
childChunks	TokenNameIdentifier	 child Chunks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add chunks that mean minimum size requirements 	TokenNameCOMMENT_LINE	Add chunks that mean minimum size requirements 
// to the list of candidate chunks for outlining 	TokenNameCOMMENT_LINE	to the list of candidate chunks for outlining 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
mergedChildChunks	TokenNameIdentifier	 merged Child Chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Chunk	TokenNameIdentifier	 Chunk
mergedChunk	TokenNameIdentifier	 merged Chunk
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Chunk	TokenNameIdentifier	 Chunk
)	TokenNameRPAREN	
mergedChildChunks	TokenNameIdentifier	 merged Child Chunks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
mergedSize	TokenNameIdentifier	 merged Size
=	TokenNameEQUAL	
mergedChunk	TokenNameIdentifier	 merged Chunk
.	TokenNameDOT	
getChunkSize	TokenNameIdentifier	 get Chunk Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mergedSize	TokenNameIdentifier	 merged Size
>=	TokenNameGREATER_EQUAL	
MINIMUM_OUTLINEABLE_CHUNK_SIZE	TokenNameIdentifier	 MINIMUM  OUTLINEABLE  CHUNK  SIZE
&&	TokenNameAND_AND	
mergedSize	TokenNameIdentifier	 merged Size
<=	TokenNameLESS_EQUAL	
TARGET_METHOD_SIZE	TokenNameIdentifier	 TARGET  METHOD  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
candidateChunks	TokenNameIdentifier	 candidate Chunks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mergedChunk	TokenNameIdentifier	 merged Chunk
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Drop the chunk which was too big 	TokenNameCOMMENT_LINE	Drop the chunk which was too big 
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// currLevelChunks contains pairs of InstructionHandles. If 	TokenNameCOMMENT_LINE	currLevelChunks contains pairs of InstructionHandles. If 
// its size is an odd number, the loop has encountered the 	TokenNameCOMMENT_LINE	its size is an odd number, the loop has encountered the 
// start of a chunk at this level, but not its end. 	TokenNameCOMMENT_LINE	start of a chunk at this level, but not its end. 
openChunkAtCurrLevel	TokenNameIdentifier	 open Chunk At Curr Level
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currLevelChunks	TokenNameIdentifier	 curr Level Chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
currentHandle	TokenNameIdentifier	 current Handle
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
candidateChunks	TokenNameIdentifier	 candidate Chunks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Merge adjacent sibling chunks to produce larger candidate chunks for * outlining * @param chunks array of sibling {@link MethodGenerator.Chunk}s that are * under consideration for outlining. Chunks must be in * the order encountered in the {@link InstructionList} * @return a <code>java.util.ArrayList</code> of * <code>MethodGenerator.Chunk</code>s maximally merged */	TokenNameCOMMENT_JAVADOC	 Merge adjacent sibling chunks to produce larger candidate chunks for outlining @param chunks array of sibling {@link MethodGenerator.Chunk}s that are under consideration for outlining. Chunks must be in the order encountered in the {@link InstructionList} @return a <code>java.util.ArrayList</code> of <code>MethodGenerator.Chunk</code>s maximally merged 
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
mergeAdjacentChunks	TokenNameIdentifier	 merge Adjacent Chunks
(	TokenNameLPAREN	
Chunk	TokenNameIdentifier	 Chunk
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunks	TokenNameIdentifier	 chunks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
adjacencyRunStart	TokenNameIdentifier	 adjacency Run Start
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
adjacencyRunLength	TokenNameIdentifier	 adjacency Run Length
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunkWasMerged	TokenNameIdentifier	 chunk Was Merged
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
maximumRunOfChunks	TokenNameIdentifier	 maximum Run Of Chunks
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOfCurrentRun	TokenNameIdentifier	 start Of Current Run
;	TokenNameSEMICOLON	
int	TokenNameint	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
mergedChunks	TokenNameIdentifier	 merged Chunks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOfCurrentRun	TokenNameIdentifier	 start Of Current Run
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Loop through chunks, and record in adjacencyRunStart where each 	TokenNameCOMMENT_LINE	Loop through chunks, and record in adjacencyRunStart where each 
// run of adjacent chunks begins and how many are in that run. For 	TokenNameCOMMENT_LINE	run of adjacent chunks begins and how many are in that run. For 
// example, given chunks A B C D E F, if A is adjacent to B, but not 	TokenNameCOMMENT_LINE	example, given chunks A B C D E F, if A is adjacent to B, but not 
// to C, and C, D, E and F are all adjacent, 	TokenNameCOMMENT_LINE	to C, and C, D, E and F are all adjacent, 
// adjacencyRunStart[0] == 0; adjacencyRunLength[0] == 2 	TokenNameCOMMENT_LINE	adjacencyRunStart[0] == 0; adjacencyRunLength[0] == 2 
// adjacencyRunStart[1] == 2; adjacencyRunLength[1] == 4 	TokenNameCOMMENT_LINE	adjacencyRunStart[1] == 2; adjacencyRunLength[1] == 4 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
chunks	TokenNameIdentifier	 chunks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
isAdjacentTo	TokenNameIdentifier	 is Adjacent To
(	TokenNameLPAREN	
chunks	TokenNameIdentifier	 chunks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lengthOfRun	TokenNameIdentifier	 length Of Run
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
startOfCurrentRun	TokenNameIdentifier	 start Of Current Run
;	TokenNameSEMICOLON	
// Track the longest run of chunks found 	TokenNameCOMMENT_LINE	Track the longest run of chunks found 
if	TokenNameif	
(	TokenNameLPAREN	
maximumRunOfChunks	TokenNameIdentifier	 maximum Run Of Chunks
<	TokenNameLESS	
lengthOfRun	TokenNameIdentifier	 length Of Run
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maximumRunOfChunks	TokenNameIdentifier	 maximum Run Of Chunks
=	TokenNameEQUAL	
lengthOfRun	TokenNameIdentifier	 length Of Run
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lengthOfRun	TokenNameIdentifier	 length Of Run
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
adjacencyRunLength	TokenNameIdentifier	 adjacency Run Length
[	TokenNameLBRACKET	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lengthOfRun	TokenNameIdentifier	 length Of Run
;	TokenNameSEMICOLON	
adjacencyRunStart	TokenNameIdentifier	 adjacency Run Start
[	TokenNameLBRACKET	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
startOfCurrentRun	TokenNameIdentifier	 start Of Current Run
;	TokenNameSEMICOLON	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startOfCurrentRun	TokenNameIdentifier	 start Of Current Run
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
startOfCurrentRun	TokenNameIdentifier	 start Of Current Run
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lengthOfRun	TokenNameIdentifier	 length Of Run
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
startOfCurrentRun	TokenNameIdentifier	 start Of Current Run
;	TokenNameSEMICOLON	
// Track the longest run of chunks found 	TokenNameCOMMENT_LINE	Track the longest run of chunks found 
if	TokenNameif	
(	TokenNameLPAREN	
maximumRunOfChunks	TokenNameIdentifier	 maximum Run Of Chunks
<	TokenNameLESS	
lengthOfRun	TokenNameIdentifier	 length Of Run
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maximumRunOfChunks	TokenNameIdentifier	 maximum Run Of Chunks
=	TokenNameEQUAL	
lengthOfRun	TokenNameIdentifier	 length Of Run
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
adjacencyRunLength	TokenNameIdentifier	 adjacency Run Length
[	TokenNameLBRACKET	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
startOfCurrentRun	TokenNameIdentifier	 start Of Current Run
;	TokenNameSEMICOLON	
adjacencyRunStart	TokenNameIdentifier	 adjacency Run Start
[	TokenNameLBRACKET	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
startOfCurrentRun	TokenNameIdentifier	 start Of Current Run
;	TokenNameSEMICOLON	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Try merging adjacent chunks to come up with better sized chunks for 	TokenNameCOMMENT_LINE	Try merging adjacent chunks to come up with better sized chunks for 
// outlining. This algorithm is not optimal, but it should be 	TokenNameCOMMENT_LINE	outlining. This algorithm is not optimal, but it should be 
// reasonably fast. Consider an example like this, where four chunks 	TokenNameCOMMENT_LINE	reasonably fast. Consider an example like this, where four chunks 
// of the sizes specified in brackets are adjacent. The best way of 	TokenNameCOMMENT_LINE	of the sizes specified in brackets are adjacent. The best way of 
// combining these chunks would be to merge the first pair and merge 	TokenNameCOMMENT_LINE	combining these chunks would be to merge the first pair and merge 
// the last three to form two chunks, but the algorithm will merge the 	TokenNameCOMMENT_LINE	the last three to form two chunks, but the algorithm will merge the 
// three in the middle instead, leaving three chunks in all. 	TokenNameCOMMENT_LINE	three in the middle instead, leaving three chunks in all. 
// [25000] [25000] [20000] [1000] [20000] 	TokenNameCOMMENT_LINE	[25000] [25000] [20000] [1000] [20000] 
// Start by trying to merge the maximum number of adjacent chunks, and 	TokenNameCOMMENT_LINE	Start by trying to merge the maximum number of adjacent chunks, and 
// work down from there. 	TokenNameCOMMENT_LINE	work down from there. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
numToMerge	TokenNameIdentifier	 num To Merge
=	TokenNameEQUAL	
maximumRunOfChunks	TokenNameIdentifier	 maximum Run Of Chunks
;	TokenNameSEMICOLON	
numToMerge	TokenNameIdentifier	 num To Merge
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numToMerge	TokenNameIdentifier	 num To Merge
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Look at each run of adjacent chunks 	TokenNameCOMMENT_LINE	Look at each run of adjacent chunks 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
run	TokenNameIdentifier	 run
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
run	TokenNameIdentifier	 run
<	TokenNameLESS	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
;	TokenNameSEMICOLON	
run	TokenNameIdentifier	 run
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
runStart	TokenNameIdentifier	 run Start
=	TokenNameEQUAL	
adjacencyRunStart	TokenNameIdentifier	 adjacency Run Start
[	TokenNameLBRACKET	
run	TokenNameIdentifier	 run
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
runEnd	TokenNameIdentifier	 run End
=	TokenNameEQUAL	
runStart	TokenNameIdentifier	 run Start
+	TokenNamePLUS	
adjacencyRunLength	TokenNameIdentifier	 adjacency Run Length
[	TokenNameLBRACKET	
run	TokenNameIdentifier	 run
]	TokenNameRBRACKET	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundChunksToMerge	TokenNameIdentifier	 found Chunks To Merge
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Within the current run of adjacent chunks, look at all 	TokenNameCOMMENT_LINE	Within the current run of adjacent chunks, look at all 
// "subruns" of length numToMerge, until we run out or find 	TokenNameCOMMENT_LINE	"subruns" of length numToMerge, until we run out or find 
// a subrun that can be merged. 	TokenNameCOMMENT_LINE	a subrun that can be merged. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
mergeStart	TokenNameIdentifier	 merge Start
=	TokenNameEQUAL	
runStart	TokenNameIdentifier	 run Start
;	TokenNameSEMICOLON	
mergeStart	TokenNameIdentifier	 merge Start
+	TokenNamePLUS	
numToMerge	TokenNameIdentifier	 num To Merge
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
runEnd	TokenNameIdentifier	 run End
&&	TokenNameAND_AND	
!	TokenNameNOT	
foundChunksToMerge	TokenNameIdentifier	 found Chunks To Merge
;	TokenNameSEMICOLON	
mergeStart	TokenNameIdentifier	 merge Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mergeEnd	TokenNameIdentifier	 merge End
=	TokenNameEQUAL	
mergeStart	TokenNameIdentifier	 merge Start
+	TokenNamePLUS	
numToMerge	TokenNameIdentifier	 num To Merge
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
mergeSize	TokenNameIdentifier	 merge Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Find out how big the subrun is 	TokenNameCOMMENT_LINE	Find out how big the subrun is 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
mergeStart	TokenNameIdentifier	 merge Start
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
mergeEnd	TokenNameIdentifier	 merge End
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergeSize	TokenNameIdentifier	 merge Size
=	TokenNameEQUAL	
mergeSize	TokenNameIdentifier	 merge Size
+	TokenNamePLUS	
chunks	TokenNameIdentifier	 chunks
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getChunkSize	TokenNameIdentifier	 get Chunk Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the current subrun is small enough to outline, 	TokenNameCOMMENT_LINE	If the current subrun is small enough to outline, 
// merge it, and split the remaining chunks in the run 	TokenNameCOMMENT_LINE	merge it, and split the remaining chunks in the run 
if	TokenNameif	
(	TokenNameLPAREN	
mergeSize	TokenNameIdentifier	 merge Size
<=	TokenNameLESS_EQUAL	
TARGET_METHOD_SIZE	TokenNameIdentifier	 TARGET  METHOD  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundChunksToMerge	TokenNameIdentifier	 found Chunks To Merge
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
mergeStart	TokenNameIdentifier	 merge Start
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
mergeEnd	TokenNameIdentifier	 merge End
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chunkWasMerged	TokenNameIdentifier	 chunk Was Merged
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mergedChunks	TokenNameIdentifier	 merged Chunks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Chunk	TokenNameIdentifier	 Chunk
(	TokenNameLPAREN	
chunks	TokenNameIdentifier	 chunks
[	TokenNameLBRACKET	
mergeStart	TokenNameIdentifier	 merge Start
]	TokenNameRBRACKET	
.	TokenNameDOT	
getChunkStart	TokenNameIdentifier	 get Chunk Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chunks	TokenNameIdentifier	 chunks
[	TokenNameLBRACKET	
mergeEnd	TokenNameIdentifier	 merge End
]	TokenNameRBRACKET	
.	TokenNameDOT	
getChunkEnd	TokenNameIdentifier	 get Chunk End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Adjust the length of the current run of adjacent 	TokenNameCOMMENT_LINE	Adjust the length of the current run of adjacent 
// chunks to end at the newly merged chunk... 	TokenNameCOMMENT_LINE	chunks to end at the newly merged chunk... 
adjacencyRunLength	TokenNameIdentifier	 adjacency Run Length
[	TokenNameLBRACKET	
run	TokenNameIdentifier	 run
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
adjacencyRunStart	TokenNameIdentifier	 adjacency Run Start
[	TokenNameLBRACKET	
run	TokenNameIdentifier	 run
]	TokenNameRBRACKET	
-	TokenNameMINUS	
mergeStart	TokenNameIdentifier	 merge Start
;	TokenNameSEMICOLON	
int	TokenNameint	
trailingRunLength	TokenNameIdentifier	 trailing Run Length
=	TokenNameEQUAL	
runEnd	TokenNameIdentifier	 run End
-	TokenNameMINUS	
mergeEnd	TokenNameIdentifier	 merge End
;	TokenNameSEMICOLON	
// and any chunks that follow the newly merged chunk 	TokenNameCOMMENT_LINE	and any chunks that follow the newly merged chunk 
// in the current run of adjacent chunks form another 	TokenNameCOMMENT_LINE	in the current run of adjacent chunks form another 
// new run of adjacent chunks 	TokenNameCOMMENT_LINE	new run of adjacent chunks 
if	TokenNameif	
(	TokenNameLPAREN	
trailingRunLength	TokenNameIdentifier	 trailing Run Length
>=	TokenNameGREATER_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
adjacencyRunStart	TokenNameIdentifier	 adjacency Run Start
[	TokenNameLBRACKET	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mergeEnd	TokenNameIdentifier	 merge End
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
adjacencyRunLength	TokenNameIdentifier	 adjacency Run Length
[	TokenNameLBRACKET	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
trailingRunLength	TokenNameIdentifier	 trailing Run Length
;	TokenNameSEMICOLON	
numAdjacentRuns	TokenNameIdentifier	 num Adjacent Runs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Make a final pass for any chunk that wasn't merged with a sibling 	TokenNameCOMMENT_LINE	Make a final pass for any chunk that wasn't merged with a sibling 
// and include it in the list of chunks after merging. 	TokenNameCOMMENT_LINE	and include it in the list of chunks after merging. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
chunkWasMerged	TokenNameIdentifier	 chunk Was Merged
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergedChunks	TokenNameIdentifier	 merged Chunks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
chunks	TokenNameIdentifier	 chunks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
mergedChunks	TokenNameIdentifier	 merged Chunks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Breaks up the IL for this {@link MethodGenerator} into separate * outlined methods so that no method exceeds the 64KB limit on the length * of the byte code associated with a method. * @param classGen The {@link ClassGen} with which the generated methods * will be associated * @param originalMethodSize The number of bytes of bytecode represented by * the {@link InstructionList} of this method * @return an array of the outlined <code>Method</code>s and the original * method itself */	TokenNameCOMMENT_JAVADOC	 Breaks up the IL for this {@link MethodGenerator} into separate outlined methods so that no method exceeds the 64KB limit on the length of the byte code associated with a method. @param classGen The {@link ClassGen} with which the generated methods will be associated @param originalMethodSize The number of bytes of bytecode represented by the {@link InstructionList} of this method @return an array of the outlined <code>Method</code>s and the original method itself 
public	TokenNamepublic	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outlineChunks	TokenNameIdentifier	 outline Chunks
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
int	TokenNameint	
originalMethodSize	TokenNameIdentifier	 original Method Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
methodsOutlined	TokenNameIdentifier	 methods Outlined
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currentMethodSize	TokenNameIdentifier	 current Method Size
=	TokenNameEQUAL	
originalMethodSize	TokenNameIdentifier	 original Method Size
;	TokenNameSEMICOLON	
int	TokenNameint	
outlinedCount	TokenNameIdentifier	 outlined Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
moreMethodsOutlined	TokenNameIdentifier	 more Methods Outlined
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
originalMethodName	TokenNameIdentifier	 original Method Name
=	TokenNameEQUAL	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Special handling for initialization methods. No other methods can 	TokenNameCOMMENT_LINE	Special handling for initialization methods. No other methods can 
// include the less than and greater than characters in their names, 	TokenNameCOMMENT_LINE	include the less than and greater than characters in their names, 
// so we munge the names here. 	TokenNameCOMMENT_LINE	so we munge the names here. 
if	TokenNameif	
(	TokenNameLPAREN	
originalMethodName	TokenNameIdentifier	 original Method Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"<init>"	TokenNameStringLiteral	<init>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
originalMethodName	TokenNameIdentifier	 original Method Name
=	TokenNameEQUAL	
"$lt$init$gt$"	TokenNameStringLiteral	$lt$init$gt$
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
originalMethodName	TokenNameIdentifier	 original Method Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"<clinit>"	TokenNameStringLiteral	<clinit>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
originalMethodName	TokenNameIdentifier	 original Method Name
=	TokenNameEQUAL	
"$lt$clinit$gt$"	TokenNameStringLiteral	$lt$clinit$gt$
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Loop until the original method comes in under the JVM limit or 	TokenNameCOMMENT_LINE	Loop until the original method comes in under the JVM limit or 
// the loop was unable to outline any more methods 	TokenNameCOMMENT_LINE	the loop was unable to outline any more methods 
do	TokenNamedo	
{	TokenNameLBRACE	
// Get all the best candidates for outlining, and sort them in 	TokenNameCOMMENT_LINE	Get all the best candidates for outlining, and sort them in 
// ascending order of size 	TokenNameCOMMENT_LINE	ascending order of size 
ArrayList	TokenNameIdentifier	 Array List
candidateChunks	TokenNameIdentifier	 candidate Chunks
=	TokenNameEQUAL	
getCandidateChunks	TokenNameIdentifier	 get Candidate Chunks
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
currentMethodSize	TokenNameIdentifier	 current Method Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
candidateChunks	TokenNameIdentifier	 candidate Chunks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
moreMethodsOutlined	TokenNameIdentifier	 more Methods Outlined
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Loop over the candidates for outlining, from the largest to the 	TokenNameCOMMENT_LINE	Loop over the candidates for outlining, from the largest to the 
// smallest and outline them one at a time, until the loop has 	TokenNameCOMMENT_LINE	smallest and outline them one at a time, until the loop has 
// outlined all or the original method comes in under the JVM 	TokenNameCOMMENT_LINE	outlined all or the original method comes in under the JVM 
// limit on the size of a method. 	TokenNameCOMMENT_LINE	limit on the size of a method. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
candidateChunks	TokenNameIdentifier	 candidate Chunks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
currentMethodSize	TokenNameIdentifier	 current Method Size
>	TokenNameGREATER	
TARGET_METHOD_SIZE	TokenNameIdentifier	 TARGET  METHOD  SIZE
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Chunk	TokenNameIdentifier	 Chunk
chunkToOutline	TokenNameIdentifier	 chunk To Outline
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Chunk	TokenNameIdentifier	 Chunk
)	TokenNameRPAREN	
candidateChunks	TokenNameIdentifier	 candidate Chunks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodsOutlined	TokenNameIdentifier	 methods Outlined
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
outline	TokenNameIdentifier	 outline
(	TokenNameLPAREN	
chunkToOutline	TokenNameIdentifier	 chunk To Outline
.	TokenNameDOT	
getChunkStart	TokenNameIdentifier	 get Chunk Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
chunkToOutline	TokenNameIdentifier	 chunk To Outline
.	TokenNameDOT	
getChunkEnd	TokenNameIdentifier	 get Chunk End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
originalMethodName	TokenNameIdentifier	 original Method Name
+	TokenNamePLUS	
"$outline$"	TokenNameStringLiteral	$outline$
+	TokenNamePLUS	
outlinedCount	TokenNameIdentifier	 outlined Count
,	TokenNameCOMMA	
classGen	TokenNameIdentifier	 class Gen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outlinedCount	TokenNameIdentifier	 outlined Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
moreMethodsOutlined	TokenNameIdentifier	 more Methods Outlined
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
lastInst	TokenNameIdentifier	 last Inst
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
setPositions	TokenNameIdentifier	 set Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check the size of the method now 	TokenNameCOMMENT_LINE	Check the size of the method now 
currentMethodSize	TokenNameIdentifier	 current Method Size
=	TokenNameEQUAL	
lastInst	TokenNameIdentifier	 last Inst
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
lastInst	TokenNameIdentifier	 last Inst
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
moreMethodsOutlined	TokenNameIdentifier	 more Methods Outlined
&&	TokenNameAND_AND	
currentMethodSize	TokenNameIdentifier	 current Method Size
>	TokenNameGREATER	
TARGET_METHOD_SIZE	TokenNameIdentifier	 TARGET  METHOD  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Outlining failed to reduce the size of the current method 	TokenNameCOMMENT_LINE	Outlining failed to reduce the size of the current method 
// sufficiently. Throw an internal error. 	TokenNameCOMMENT_LINE	sufficiently. Throw an internal error. 
if	TokenNameif	
(	TokenNameLPAREN	
currentMethodSize	TokenNameIdentifier	 current Method Size
>	TokenNameGREATER	
MAX_METHOD_SIZE	TokenNameIdentifier	 MAX  METHOD  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
OUTLINE_ERR_METHOD_TOO_BIG	TokenNameIdentifier	 OUTLINE  ERR  METHOD  TOO  BIG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InternalError	TokenNameIdentifier	 Internal Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
methodsArr	TokenNameIdentifier	 methods Arr
=	TokenNameEQUAL	
new	TokenNamenew	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
methodsOutlined	TokenNameIdentifier	 methods Outlined
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
methodsOutlined	TokenNameIdentifier	 methods Outlined
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
methodsArr	TokenNameIdentifier	 methods Arr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodsArr	TokenNameIdentifier	 methods Arr
[	TokenNameLBRACKET	
methodsOutlined	TokenNameIdentifier	 methods Outlined
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getThisMethod	TokenNameIdentifier	 get This Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
methodsArr	TokenNameIdentifier	 methods Arr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an outlineable chunk of code in the current {@link MethodGenerator} * move ("outline") the chunk to a new method, and replace the chunk in the * old method with a reference to that new method. No * {@link OutlineableChunkStart} or {@link OutlineableChunkEnd} instructions * are copied. * @param first The {@link InstructionHandle} of the first instruction in * the chunk to outline * @param last The <code>InstructionHandle</code> of the last instruction in * the chunk to outline * @param outlinedMethodName The name of the new method * @param classGen The {@link ClassGenerator} of which the original * and new methods will be members * @return The new {@link Method} containing the outlined code. */	TokenNameCOMMENT_JAVADOC	 Given an outlineable chunk of code in the current {@link MethodGenerator} move ("outline") the chunk to a new method, and replace the chunk in the old method with a reference to that new method. No {@link OutlineableChunkStart} or {@link OutlineableChunkEnd} instructions are copied. @param first The {@link InstructionHandle} of the first instruction in the chunk to outline @param last The <code>InstructionHandle</code> of the last instruction in the chunk to outline @param outlinedMethodName The name of the new method @param classGen The {@link ClassGenerator} of which the original and new methods will be members @return The new {@link Method} containing the outlined code. 
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
outline	TokenNameIdentifier	 outline
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
outlinedMethodName	TokenNameIdentifier	 outlined Method Name
,	TokenNameCOMMA	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We're not equipped to deal with exception handlers yet. Bail out! 	TokenNameCOMMENT_LINE	We're not equipped to deal with exception handlers yet. Bail out! 
if	TokenNameif	
(	TokenNameLPAREN	
getExceptionHandlers	TokenNameIdentifier	 get Exception Handlers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
OUTLINE_ERR_TRY_CATCH	TokenNameIdentifier	 OUTLINE  ERR  TRY  CATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InternalError	TokenNameIdentifier	 Internal Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
outlineChunkStartOffset	TokenNameIdentifier	 outline Chunk Start Offset
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
outlineChunkEndOffset	TokenNameIdentifier	 outline Chunk End Offset
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
cpg	TokenNameIdentifier	 cpg
=	TokenNameEQUAL	
getConstantPool	TokenNameIdentifier	 get Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create new outlined method with signature: 	TokenNameCOMMENT_LINE	Create new outlined method with signature: 
// 	TokenNameCOMMENT_LINE	 
// private final outlinedMethodName(CopyLocals copyLocals); 	TokenNameCOMMENT_LINE	private final outlinedMethodName(CopyLocals copyLocals); 
// 	TokenNameCOMMENT_LINE	 
// CopyLocals is an object that is used to copy-in/copy-out local 	TokenNameCOMMENT_LINE	CopyLocals is an object that is used to copy-in/copy-out local 
// variables that are used by the outlined method. Only locals whose 	TokenNameCOMMENT_LINE	variables that are used by the outlined method. Only locals whose 
// value is potentially set or referenced outside the range of the 	TokenNameCOMMENT_LINE	value is potentially set or referenced outside the range of the 
// chunk that is being outlined will be represented in CopyLocals. The 	TokenNameCOMMENT_LINE	chunk that is being outlined will be represented in CopyLocals. The 
// type of the variable for copying local variables is actually 	TokenNameCOMMENT_LINE	type of the variable for copying local variables is actually 
// generated to be unique - it is not named CopyLocals. 	TokenNameCOMMENT_LINE	generated to be unique - it is not named CopyLocals. 
// 	TokenNameCOMMENT_LINE	 
// The outlined method never needs to be referenced outside of this 	TokenNameCOMMENT_LINE	The outlined method never needs to be referenced outside of this 
// class, and will never be overridden, so we mark it private final. 	TokenNameCOMMENT_LINE	class, and will never be overridden, so we mark it private final. 
final	TokenNamefinal	
InstructionList	TokenNameIdentifier	 Instruction List
newIL	TokenNameIdentifier	 new IL
=	TokenNameEQUAL	
new	TokenNamenew	
InstructionList	TokenNameIdentifier	 Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
XSLTC	TokenNameIdentifier	 XSLTC
xsltc	TokenNameIdentifier	 xsltc
=	TokenNameEQUAL	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getXSLTC	TokenNameIdentifier	 get XSLTC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
argTypeName	TokenNameIdentifier	 arg Type Name
=	TokenNameEQUAL	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getHelperClassName	TokenNameIdentifier	 get Helper Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argTypes	TokenNameIdentifier	 arg Types
=	TokenNameEQUAL	
new	TokenNamenew	
Type	TokenNameIdentifier	 Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
new	TokenNamenew	
ObjectType	TokenNameIdentifier	 Object Type
(	TokenNameLPAREN	
argTypeName	TokenNameIdentifier	 arg Type Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toJCType	TokenNameIdentifier	 to JC Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
argName	TokenNameIdentifier	 arg Name
=	TokenNameEQUAL	
"copyLocals"	TokenNameStringLiteral	copyLocals
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argNames	TokenNameIdentifier	 arg Names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
argName	TokenNameIdentifier	 arg Name
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
methodAttributes	TokenNameIdentifier	 method Attributes
=	TokenNameEQUAL	
ACC_PRIVATE	TokenNameIdentifier	 ACC  PRIVATE
|	TokenNameOR	
ACC_FINAL	TokenNameIdentifier	 ACC  FINAL
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
isStaticMethod	TokenNameIdentifier	 is Static Method
=	TokenNameEQUAL	
(	TokenNameLPAREN	
getAccessFlags	TokenNameIdentifier	 get Access Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
ACC_STATIC	TokenNameIdentifier	 ACC  STATIC
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isStaticMethod	TokenNameIdentifier	 is Static Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
methodAttributes	TokenNameIdentifier	 method Attributes
=	TokenNameEQUAL	
methodAttributes	TokenNameIdentifier	 method Attributes
|	TokenNameOR	
ACC_STATIC	TokenNameIdentifier	 ACC  STATIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
MethodGenerator	TokenNameIdentifier	 Method Generator
outlinedMethodGen	TokenNameIdentifier	 outlined Method Gen
=	TokenNameEQUAL	
new	TokenNamenew	
MethodGenerator	TokenNameIdentifier	 Method Generator
(	TokenNameLPAREN	
methodAttributes	TokenNameIdentifier	 method Attributes
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
VOID	TokenNameIdentifier	 VOID
,	TokenNameCOMMA	
argTypes	TokenNameIdentifier	 arg Types
,	TokenNameCOMMA	
argNames	TokenNameIdentifier	 arg Names
,	TokenNameCOMMA	
outlinedMethodName	TokenNameIdentifier	 outlined Method Name
,	TokenNameCOMMA	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newIL	TokenNameIdentifier	 new IL
,	TokenNameCOMMA	
cpg	TokenNameIdentifier	 cpg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create class for copying local variables to the outlined method. 	TokenNameCOMMENT_LINE	Create class for copying local variables to the outlined method. 
// The fields the class will need to contain will be determined as the 	TokenNameCOMMENT_LINE	The fields the class will need to contain will be determined as the 
// code in the outlineable chunk is examined. 	TokenNameCOMMENT_LINE	code in the outlineable chunk is examined. 
ClassGenerator	TokenNameIdentifier	 Class Generator
copyAreaCG	TokenNameIdentifier	 copy Area CG
=	TokenNameEQUAL	
new	TokenNamenew	
ClassGenerator	TokenNameIdentifier	 Class Generator
(	TokenNameLPAREN	
argTypeName	TokenNameIdentifier	 arg Type Name
,	TokenNameCOMMA	
OBJECT_CLASS	TokenNameIdentifier	 OBJECT  CLASS
,	TokenNameCOMMA	
argTypeName	TokenNameIdentifier	 arg Type Name
+	TokenNamePLUS	
".java"	TokenNameStringLiteral	.java
,	TokenNameCOMMA	
ACC_FINAL	TokenNameIdentifier	 ACC  FINAL
|	TokenNameOR	
ACC_PUBLIC	TokenNameIdentifier	 ACC  PUBLIC
|	TokenNameOR	
ACC_SUPER	TokenNameIdentifier	 ACC  SUPER
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
copyAreaCPG	TokenNameIdentifier	 copy Area CPG
=	TokenNameEQUAL	
copyAreaCG	TokenNameIdentifier	 copy Area CG
.	TokenNameDOT	
getConstantPool	TokenNameIdentifier	 get Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyAreaCG	TokenNameIdentifier	 copy Area CG
.	TokenNameDOT	
addEmptyConstructor	TokenNameIdentifier	 add Empty Constructor
(	TokenNameLPAREN	
ACC_PUBLIC	TokenNameIdentifier	 ACC  PUBLIC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Number of fields in the copy class 	TokenNameCOMMENT_LINE	Number of fields in the copy class 
int	TokenNameint	
copyAreaFieldCount	TokenNameIdentifier	 copy Area Field Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The handle for the instruction after the last one to be outlined. 	TokenNameCOMMENT_LINE	The handle for the instruction after the last one to be outlined. 
// Note that this should never end up being null. An outlineable chunk 	TokenNameCOMMENT_LINE	Note that this should never end up being null. An outlineable chunk 
// won't contain a RETURN instruction or other branch out of the chunk, 	TokenNameCOMMENT_LINE	won't contain a RETURN instruction or other branch out of the chunk, 
// and the JVM specification prohibits code in a method from just 	TokenNameCOMMENT_LINE	and the JVM specification prohibits code in a method from just 
// "falling off the end" so this should always point to a valid handle. 	TokenNameCOMMENT_LINE	"falling off the end" so this should always point to a valid handle. 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// InstructionLists for copying values into and out of an instance of 	TokenNameCOMMENT_LINE	InstructionLists for copying values into and out of an instance of 
// CopyLocals: 	TokenNameCOMMENT_LINE	CopyLocals: 
// oldMethCoypInIL - from locals in old method into an instance 	TokenNameCOMMENT_LINE	oldMethCoypInIL - from locals in old method into an instance 
// of the CopyLocals class (oldMethCopyInIL) 	TokenNameCOMMENT_LINE	of the CopyLocals class (oldMethCopyInIL) 
// oldMethCopyOutIL - from CopyLocals back into locals in the old 	TokenNameCOMMENT_LINE	oldMethCopyOutIL - from CopyLocals back into locals in the old 
// method 	TokenNameCOMMENT_LINE	method 
// newMethCopyInIL - from CopyLocals into locals in the new 	TokenNameCOMMENT_LINE	newMethCopyInIL - from CopyLocals into locals in the new 
// method 	TokenNameCOMMENT_LINE	method 
// newMethCopyOutIL - from locals in new method into the instance 	TokenNameCOMMENT_LINE	newMethCopyOutIL - from locals in new method into the instance 
// of the CopyLocals class 	TokenNameCOMMENT_LINE	of the CopyLocals class 
InstructionList	TokenNameIdentifier	 Instruction List
oldMethCopyInIL	TokenNameIdentifier	 old Meth Copy In IL
=	TokenNameEQUAL	
new	TokenNamenew	
InstructionList	TokenNameIdentifier	 Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionList	TokenNameIdentifier	 Instruction List
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
=	TokenNameEQUAL	
new	TokenNamenew	
InstructionList	TokenNameIdentifier	 Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionList	TokenNameIdentifier	 Instruction List
newMethCopyInIL	TokenNameIdentifier	 new Meth Copy In IL
=	TokenNameEQUAL	
new	TokenNamenew	
InstructionList	TokenNameIdentifier	 Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionList	TokenNameIdentifier	 Instruction List
newMethCopyOutIL	TokenNameIdentifier	 new Meth Copy Out IL
=	TokenNameEQUAL	
new	TokenNamenew	
InstructionList	TokenNameIdentifier	 Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Allocate instance of class in which we'll copy in or copy out locals 	TokenNameCOMMENT_LINE	Allocate instance of class in which we'll copy in or copy out locals 
// and make two copies: last copy is used to invoke constructor; 	TokenNameCOMMENT_LINE	and make two copies: last copy is used to invoke constructor; 
// other two are used for references to fields in the CopyLocals object 	TokenNameCOMMENT_LINE	other two are used for references to fields in the CopyLocals object 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
outlinedMethodCallSetup	TokenNameIdentifier	 outlined Method Call Setup
=	TokenNameEQUAL	
oldMethCopyInIL	TokenNameIdentifier	 old Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
NEW	TokenNameIdentifier	 NEW
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
argTypeName	TokenNameIdentifier	 arg Type Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldMethCopyInIL	TokenNameIdentifier	 old Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
DUP	TokenNameIdentifier	 DUP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldMethCopyInIL	TokenNameIdentifier	 old Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
DUP	TokenNameIdentifier	 DUP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldMethCopyInIL	TokenNameIdentifier	 old Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKESPECIAL	TokenNameIdentifier	 INVOKESPECIAL
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addMethodref	TokenNameIdentifier	 add Methodref
(	TokenNameLPAREN	
argTypeName	TokenNameIdentifier	 arg Type Name
,	TokenNameCOMMA	
"<init>"	TokenNameStringLiteral	<init>
,	TokenNameCOMMA	
"()V"	TokenNameStringLiteral	()V
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Generate code to invoke the new outlined method, and place the code 	TokenNameCOMMENT_LINE	Generate code to invoke the new outlined method, and place the code 
// on oldMethCopyOutIL 	TokenNameCOMMENT_LINE	on oldMethCopyOutIL 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
outlinedMethodRef	TokenNameIdentifier	 outlined Method Ref
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isStaticMethod	TokenNameIdentifier	 is Static Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outlinedMethodRef	TokenNameIdentifier	 outlined Method Ref
=	TokenNameEQUAL	
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKESTATIC	TokenNameIdentifier	 INVOKESTATIC
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addMethodref	TokenNameIdentifier	 add Methodref
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
outlinedMethodName	TokenNameIdentifier	 outlined Method Name
,	TokenNameCOMMA	
outlinedMethodGen	TokenNameIdentifier	 outlined Method Gen
.	TokenNameDOT	
getSignature	TokenNameIdentifier	 get Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
THIS	TokenNameIdentifier	 THIS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
SWAP	TokenNameIdentifier	 SWAP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outlinedMethodRef	TokenNameIdentifier	 outlined Method Ref
=	TokenNameEQUAL	
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEVIRTUAL	TokenNameIdentifier	 INVOKEVIRTUAL
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addMethodref	TokenNameIdentifier	 add Methodref
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
outlinedMethodName	TokenNameIdentifier	 outlined Method Name
,	TokenNameCOMMA	
outlinedMethodGen	TokenNameIdentifier	 outlined Method Gen
.	TokenNameDOT	
getSignature	TokenNameIdentifier	 get Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Used to keep track of the first in a sequence of 	TokenNameCOMMENT_LINE	Used to keep track of the first in a sequence of 
// OutlineableChunkStart instructions 	TokenNameCOMMENT_LINE	OutlineableChunkStart instructions 
boolean	TokenNameboolean	
chunkStartTargetMappingsPending	TokenNameIdentifier	 chunk Start Target Mappings Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
pendingTargetMappingHandle	TokenNameIdentifier	 pending Target Mapping Handle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Used to keep track of the last instruction that was copied 	TokenNameCOMMENT_LINE	Used to keep track of the last instruction that was copied 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
lastCopyHandle	TokenNameIdentifier	 last Copy Handle
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Keeps track of the mapping from instruction handles in the old 	TokenNameCOMMENT_LINE	Keeps track of the mapping from instruction handles in the old 
// method to instruction handles in the outlined method. Only need 	TokenNameCOMMENT_LINE	method to instruction handles in the outlined method. Only need 
// to track instructions that are targeted by something else in the 	TokenNameCOMMENT_LINE	to track instructions that are targeted by something else in the 
// generated BCEL 	TokenNameCOMMENT_LINE	generated BCEL 
HashMap	TokenNameIdentifier	 Hash Map
targetMap	TokenNameIdentifier	 target Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Keeps track of the mapping from local variables in the old method 	TokenNameCOMMENT_LINE	Keeps track of the mapping from local variables in the old method 
// to local variables in the outlined method. 	TokenNameCOMMENT_LINE	to local variables in the outlined method. 
HashMap	TokenNameIdentifier	 Hash Map
localVarMap	TokenNameIdentifier	 local Var Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashMap	TokenNameIdentifier	 Hash Map
revisedLocalVarStart	TokenNameIdentifier	 revised Local Var Start
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashMap	TokenNameIdentifier	 Hash Map
revisedLocalVarEnd	TokenNameIdentifier	 revised Local Var End
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pass 1: Make copies of all instructions, append them to the new list 	TokenNameCOMMENT_LINE	Pass 1: Make copies of all instructions, append them to the new list 
// and associate old instruction references with the new ones, i.e., 	TokenNameCOMMENT_LINE	and associate old instruction references with the new ones, i.e., 
// a 1:1 mapping. The special marker instructions are not copied. 	TokenNameCOMMENT_LINE	a 1:1 mapping. The special marker instructions are not copied. 
// Also, identify local variables whose values need to be copied into or 	TokenNameCOMMENT_LINE	Also, identify local variables whose values need to be copied into or 
// out of the new outlined method, and builds up targetMap and 	TokenNameCOMMENT_LINE	out of the new outlined method, and builds up targetMap and 
// localVarMap as described above. The code identifies those local 	TokenNameCOMMENT_LINE	localVarMap as described above. The code identifies those local 
// variables first so that they can have fixed slots in the stack 	TokenNameCOMMENT_LINE	variables first so that they can have fixed slots in the stack 
// frame for the outlined method assigned them ahead of all those 	TokenNameCOMMENT_LINE	frame for the outlined method assigned them ahead of all those 
// variables that don't need to exist for the entirety of the outlined 	TokenNameCOMMENT_LINE	variables that don't need to exist for the entirety of the outlined 
// method invocation. 	TokenNameCOMMENT_LINE	method invocation. 
for	TokenNamefor	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
!=	TokenNameNOT_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instruction	TokenNameIdentifier	 Instruction
inst	TokenNameIdentifier	 inst
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// MarkerInstructions are not copied, so if something else targets 	TokenNameCOMMENT_LINE	MarkerInstructions are not copied, so if something else targets 
// one, the targetMap will point to the nearest copied sibling 	TokenNameCOMMENT_LINE	one, the targetMap will point to the nearest copied sibling 
// InstructionHandle: for an OutlineableChunkEnd, the nearest 	TokenNameCOMMENT_LINE	InstructionHandle: for an OutlineableChunkEnd, the nearest 
// preceding sibling; for an OutlineableChunkStart, the nearest 	TokenNameCOMMENT_LINE	preceding sibling; for an OutlineableChunkStart, the nearest 
// following sibling. 	TokenNameCOMMENT_LINE	following sibling. 
if	TokenNameif	
(	TokenNameLPAREN	
inst	TokenNameIdentifier	 inst
instanceof	TokenNameinstanceof	
MarkerInstruction	TokenNameIdentifier	 Marker Instruction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
hasTargeters	TokenNameIdentifier	 has Targeters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inst	TokenNameIdentifier	 inst
instanceof	TokenNameinstanceof	
OutlineableChunkEnd	TokenNameIdentifier	 Outlineable Chunk End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetMap	TokenNameIdentifier	 target Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
,	TokenNameCOMMA	
lastCopyHandle	TokenNameIdentifier	 last Copy Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
chunkStartTargetMappingsPending	TokenNameIdentifier	 chunk Start Target Mappings Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chunkStartTargetMappingsPending	TokenNameIdentifier	 chunk Start Target Mappings Pending
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
pendingTargetMappingHandle	TokenNameIdentifier	 pending Target Mapping Handle
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Copy the instruction and append it to the outlined method's 	TokenNameCOMMENT_LINE	Copy the instruction and append it to the outlined method's 
// InstructionList. 	TokenNameCOMMENT_LINE	InstructionList. 
Instruction	TokenNameIdentifier	 Instruction
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
inst	TokenNameIdentifier	 inst
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use clone for shallow copy 	TokenNameCOMMENT_LINE	Use clone for shallow copy 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastCopyHandle	TokenNameIdentifier	 last Copy Handle
=	TokenNameEQUAL	
newIL	TokenNameIdentifier	 new IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lastCopyHandle	TokenNameIdentifier	 last Copy Handle
=	TokenNameEQUAL	
newIL	TokenNameIdentifier	 new IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
LocalVariableInstruction	TokenNameIdentifier	 Local Variable Instruction
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
RET	TokenNameIdentifier	 RET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For any instruction that touches a local variable, 	TokenNameCOMMENT_LINE	For any instruction that touches a local variable, 
// check whether the local variable's value needs to be 	TokenNameCOMMENT_LINE	check whether the local variable's value needs to be 
// copied into or out of the outlined method. If so, 	TokenNameCOMMENT_LINE	copied into or out of the outlined method. If so, 
// generate the code to perform the necessary copying, and 	TokenNameCOMMENT_LINE	generate the code to perform the necessary copying, and 
// use localVarMap to map the variable in the original 	TokenNameCOMMENT_LINE	use localVarMap to map the variable in the original 
// method to the variable in the new method. 	TokenNameCOMMENT_LINE	method to the variable in the new method. 
IndexedInstruction	TokenNameIdentifier	 Indexed Instruction
lvi	TokenNameIdentifier	 lvi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexedInstruction	TokenNameIdentifier	 Indexed Instruction
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
int	TokenNameint	
oldLocalVarIndex	TokenNameIdentifier	 old Local Var Index
=	TokenNameEQUAL	
lvi	TokenNameIdentifier	 lvi
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
oldLVG	TokenNameIdentifier	 old LVG
=	TokenNameEQUAL	
getLocalVariableRegistry	TokenNameIdentifier	 get Local Variable Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lookupRegisteredLocalVariable	TokenNameIdentifier	 lookup Registered Local Variable
(	TokenNameLPAREN	
oldLocalVarIndex	TokenNameIdentifier	 old Local Var Index
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
newLVG	TokenNameIdentifier	 new LVG
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
localVarMap	TokenNameIdentifier	 local Var Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Has the code already mapped this local variable to a 	TokenNameCOMMENT_LINE	Has the code already mapped this local variable to a 
// local in the new method? 	TokenNameCOMMENT_LINE	local in the new method? 
if	TokenNameif	
(	TokenNameLPAREN	
localVarMap	TokenNameIdentifier	 local Var Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Determine whether the local variable needs to be 	TokenNameCOMMENT_LINE	Determine whether the local variable needs to be 
// copied into or out of the outlined by checking 	TokenNameCOMMENT_LINE	copied into or out of the outlined by checking 
// whether the range of instructions in which the 	TokenNameCOMMENT_LINE	whether the range of instructions in which the 
// variable is accessible is outside the range of 	TokenNameCOMMENT_LINE	variable is accessible is outside the range of 
// instructions in the outlineable chunk. 	TokenNameCOMMENT_LINE	instructions in the outlineable chunk. 
// Special case a chunk start offset of zero: a local 	TokenNameCOMMENT_LINE	Special case a chunk start offset of zero: a local 
// variable live at that position must be a method 	TokenNameCOMMENT_LINE	variable live at that position must be a method 
// parameter, so the code doesn't need to check whether 	TokenNameCOMMENT_LINE	parameter, so the code doesn't need to check whether 
// the variable is live before that point; being live 	TokenNameCOMMENT_LINE	the variable is live before that point; being live 
// at offset zero is sufficient to know that the value 	TokenNameCOMMENT_LINE	at offset zero is sufficient to know that the value 
// must be copied in to the outlined method. 	TokenNameCOMMENT_LINE	must be copied in to the outlined method. 
boolean	TokenNameboolean	
copyInLocalValue	TokenNameIdentifier	 copy In Local Value
=	TokenNameEQUAL	
offsetInLocalVariableGenRange	TokenNameIdentifier	 offset In Local Variable Gen Range
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
,	TokenNameCOMMA	
(	TokenNameLPAREN	
outlineChunkStartOffset	TokenNameIdentifier	 outline Chunk Start Offset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
outlineChunkStartOffset	TokenNameIdentifier	 outline Chunk Start Offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
copyOutLocalValue	TokenNameIdentifier	 copy Out Local Value
=	TokenNameEQUAL	
offsetInLocalVariableGenRange	TokenNameIdentifier	 offset In Local Variable Gen Range
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
,	TokenNameCOMMA	
outlineChunkEndOffset	TokenNameIdentifier	 outline Chunk End Offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For any variable that needs to be copied into or out 	TokenNameCOMMENT_LINE	For any variable that needs to be copied into or out 
// of the outlined method, create a field in the 	TokenNameCOMMENT_LINE	of the outlined method, create a field in the 
// CopyLocals class, and generate the necessary code for 	TokenNameCOMMENT_LINE	CopyLocals class, and generate the necessary code for 
// copying the value. 	TokenNameCOMMENT_LINE	copying the value. 
if	TokenNameif	
(	TokenNameLPAREN	
copyInLocalValue	TokenNameIdentifier	 copy In Local Value
||	TokenNameOR_OR	
copyOutLocalValue	TokenNameIdentifier	 copy Out Local Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
varName	TokenNameIdentifier	 var Name
=	TokenNameEQUAL	
oldLVG	TokenNameIdentifier	 old LVG
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Type	TokenNameIdentifier	 Type
varType	TokenNameIdentifier	 var Type
=	TokenNameEQUAL	
oldLVG	TokenNameIdentifier	 old LVG
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newLVG	TokenNameIdentifier	 new LVG
=	TokenNameEQUAL	
outlinedMethodGen	TokenNameIdentifier	 outlined Method Gen
.	TokenNameDOT	
addLocalVariable	TokenNameIdentifier	 add Local Variable
(	TokenNameLPAREN	
varName	TokenNameIdentifier	 var Name
,	TokenNameCOMMA	
varType	TokenNameIdentifier	 var Type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newLocalVarIndex	TokenNameIdentifier	 new Local Var Index
=	TokenNameEQUAL	
newLVG	TokenNameIdentifier	 new LVG
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
varSignature	TokenNameIdentifier	 var Signature
=	TokenNameEQUAL	
varType	TokenNameIdentifier	 var Type
.	TokenNameDOT	
getSignature	TokenNameIdentifier	 get Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Record the mapping from the old local to the new 	TokenNameCOMMENT_LINE	Record the mapping from the old local to the new 
localVarMap	TokenNameIdentifier	 local Var Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
,	TokenNameCOMMA	
newLVG	TokenNameIdentifier	 new LVG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyAreaFieldCount	TokenNameIdentifier	 copy Area Field Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
copyAreaFieldName	TokenNameIdentifier	 copy Area Field Name
=	TokenNameEQUAL	
"field"	TokenNameStringLiteral	field
+	TokenNamePLUS	
copyAreaFieldCount	TokenNameIdentifier	 copy Area Field Count
;	TokenNameSEMICOLON	
copyAreaCG	TokenNameIdentifier	 copy Area CG
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
ACC_PUBLIC	TokenNameIdentifier	 ACC  PUBLIC
,	TokenNameCOMMA	
copyAreaCPG	TokenNameIdentifier	 copy Area CPG
.	TokenNameDOT	
addUtf8	TokenNameIdentifier	 add Utf8
(	TokenNameLPAREN	
copyAreaFieldName	TokenNameIdentifier	 copy Area Field Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
copyAreaCPG	TokenNameIdentifier	 copy Area CPG
.	TokenNameDOT	
addUtf8	TokenNameIdentifier	 add Utf8
(	TokenNameLPAREN	
varSignature	TokenNameIdentifier	 var Signature
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
copyAreaCPG	TokenNameIdentifier	 copy Area CPG
.	TokenNameDOT	
getConstantPool	TokenNameIdentifier	 get Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldRef	TokenNameIdentifier	 field Ref
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addFieldref	TokenNameIdentifier	 add Fieldref
(	TokenNameLPAREN	
argTypeName	TokenNameIdentifier	 arg Type Name
,	TokenNameCOMMA	
copyAreaFieldName	TokenNameIdentifier	 copy Area Field Name
,	TokenNameCOMMA	
varSignature	TokenNameIdentifier	 var Signature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
copyInLocalValue	TokenNameIdentifier	 copy In Local Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Generate code for the old method to store the 	TokenNameCOMMENT_LINE	Generate code for the old method to store the 
// value of the local into the correct field in 	TokenNameCOMMENT_LINE	value of the local into the correct field in 
// CopyLocals prior to invocation of the 	TokenNameCOMMENT_LINE	CopyLocals prior to invocation of the 
// outlined method. 	TokenNameCOMMENT_LINE	outlined method. 
oldMethCopyInIL	TokenNameIdentifier	 old Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
DUP	TokenNameIdentifier	 DUP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
copyInLoad	TokenNameIdentifier	 copy In Load
=	TokenNameEQUAL	
oldMethCopyInIL	TokenNameIdentifier	 old Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
loadLocal	TokenNameIdentifier	 load Local
(	TokenNameLPAREN	
oldLocalVarIndex	TokenNameIdentifier	 old Local Var Index
,	TokenNameCOMMA	
varType	TokenNameIdentifier	 var Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldMethCopyInIL	TokenNameIdentifier	 old Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUTFIELD	TokenNameIdentifier	 PUTFIELD
(	TokenNameLPAREN	
fieldRef	TokenNameIdentifier	 field Ref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the end of the live range of the old 	TokenNameCOMMENT_LINE	If the end of the live range of the old 
// variable was in the middle of the outlined 	TokenNameCOMMENT_LINE	variable was in the middle of the outlined 
// chunk. Make the load of its value the new 	TokenNameCOMMENT_LINE	chunk. Make the load of its value the new 
// end of its range. 	TokenNameCOMMENT_LINE	end of its range. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
copyOutLocalValue	TokenNameIdentifier	 copy Out Local Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revisedLocalVarEnd	TokenNameIdentifier	 revised Local Var End
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
,	TokenNameCOMMA	
copyInLoad	TokenNameIdentifier	 copy In Load
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Generate code for start of the outlined 	TokenNameCOMMENT_LINE	Generate code for start of the outlined 
// method to copy the value from a field in 	TokenNameCOMMENT_LINE	method to copy the value from a field in 
// CopyLocals to the new local in the outlined 	TokenNameCOMMENT_LINE	CopyLocals to the new local in the outlined 
// method 	TokenNameCOMMENT_LINE	method 
newMethCopyInIL	TokenNameIdentifier	 new Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
ALOAD_1	TokenNameIdentifier	 ALOAD 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newMethCopyInIL	TokenNameIdentifier	 new Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
GETFIELD	TokenNameIdentifier	 GETFIELD
(	TokenNameLPAREN	
fieldRef	TokenNameIdentifier	 field Ref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newMethCopyInIL	TokenNameIdentifier	 new Meth Copy In IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
storeLocal	TokenNameIdentifier	 store Local
(	TokenNameLPAREN	
newLocalVarIndex	TokenNameIdentifier	 new Local Var Index
,	TokenNameCOMMA	
varType	TokenNameIdentifier	 var Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
copyOutLocalValue	TokenNameIdentifier	 copy Out Local Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Generate code for the end of the outlined 	TokenNameCOMMENT_LINE	Generate code for the end of the outlined 
// method to copy the value from the new local 	TokenNameCOMMENT_LINE	method to copy the value from the new local 
// variable into a field in CopyLocals 	TokenNameCOMMENT_LINE	variable into a field in CopyLocals 
// method 	TokenNameCOMMENT_LINE	method 
newMethCopyOutIL	TokenNameIdentifier	 new Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
ALOAD_1	TokenNameIdentifier	 ALOAD 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newMethCopyOutIL	TokenNameIdentifier	 new Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
loadLocal	TokenNameIdentifier	 load Local
(	TokenNameLPAREN	
newLocalVarIndex	TokenNameIdentifier	 new Local Var Index
,	TokenNameCOMMA	
varType	TokenNameIdentifier	 var Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newMethCopyOutIL	TokenNameIdentifier	 new Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUTFIELD	TokenNameIdentifier	 PUTFIELD
(	TokenNameLPAREN	
fieldRef	TokenNameIdentifier	 field Ref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Generate code to copy the value from a field 	TokenNameCOMMENT_LINE	Generate code to copy the value from a field 
// in CopyLocals into a local in the original 	TokenNameCOMMENT_LINE	in CopyLocals into a local in the original 
// method following invocation of the outlined 	TokenNameCOMMENT_LINE	method following invocation of the outlined 
// method. 	TokenNameCOMMENT_LINE	method. 
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
DUP	TokenNameIdentifier	 DUP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
GETFIELD	TokenNameIdentifier	 GETFIELD
(	TokenNameLPAREN	
fieldRef	TokenNameIdentifier	 field Ref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
copyOutStore	TokenNameIdentifier	 copy Out Store
=	TokenNameEQUAL	
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
storeLocal	TokenNameIdentifier	 store Local
(	TokenNameLPAREN	
oldLocalVarIndex	TokenNameIdentifier	 old Local Var Index
,	TokenNameCOMMA	
varType	TokenNameIdentifier	 var Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the start of the live range of the old 	TokenNameCOMMENT_LINE	If the start of the live range of the old 
// variable was in the middle of the outlined 	TokenNameCOMMENT_LINE	variable was in the middle of the outlined 
// chunk. Make this store into it the new start 	TokenNameCOMMENT_LINE	chunk. Make this store into it the new start 
// of its range. 	TokenNameCOMMENT_LINE	of its range. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
copyInLocalValue	TokenNameIdentifier	 copy In Local Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
revisedLocalVarStart	TokenNameIdentifier	 revised Local Var Start
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
,	TokenNameCOMMA	
copyOutStore	TokenNameIdentifier	 copy Out Store
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
hasTargeters	TokenNameIdentifier	 has Targeters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetMap	TokenNameIdentifier	 target Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
,	TokenNameCOMMA	
lastCopyHandle	TokenNameIdentifier	 last Copy Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If this is the first instruction copied following a sequence 	TokenNameCOMMENT_LINE	If this is the first instruction copied following a sequence 
// of OutlineableChunkStart instructions, indicate that the 	TokenNameCOMMENT_LINE	of OutlineableChunkStart instructions, indicate that the 
// sequence of old instruction all map to this newly created 	TokenNameCOMMENT_LINE	sequence of old instruction all map to this newly created 
// instruction 	TokenNameCOMMENT_LINE	instruction 
if	TokenNameif	
(	TokenNameLPAREN	
chunkStartTargetMappingsPending	TokenNameIdentifier	 chunk Start Target Mappings Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
targetMap	TokenNameIdentifier	 target Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pendingTargetMappingHandle	TokenNameIdentifier	 pending Target Mapping Handle
,	TokenNameCOMMA	
lastCopyHandle	TokenNameIdentifier	 last Copy Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pendingTargetMappingHandle	TokenNameIdentifier	 pending Target Mapping Handle
=	TokenNameEQUAL	
pendingTargetMappingHandle	TokenNameIdentifier	 pending Target Mapping Handle
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
pendingTargetMappingHandle	TokenNameIdentifier	 pending Target Mapping Handle
!=	TokenNameNOT_EQUAL	
ih	TokenNameIdentifier	 ih
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chunkStartTargetMappingsPending	TokenNameIdentifier	 chunk Start Target Mappings Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Pass 2: Walk old and new instruction lists, updating branch targets 	TokenNameCOMMENT_LINE	Pass 2: Walk old and new instruction lists, updating branch targets 
// and local variable references in the new list 	TokenNameCOMMENT_LINE	and local variable references in the new list 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
newIL	TokenNameIdentifier	 new IL
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// i == old instruction; c == copied instruction 	TokenNameCOMMENT_LINE	i == old instruction; c == copied instruction 
Instruction	TokenNameIdentifier	 Instruction
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Instruction	TokenNameIdentifier	 Instruction
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
instanceof	TokenNameinstanceof	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
bc	TokenNameIdentifier	 bc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
itarget	TokenNameIdentifier	 itarget
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// old target 	TokenNameCOMMENT_LINE	old target 
// New target must be in targetMap 	TokenNameCOMMENT_LINE	New target must be in targetMap 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
newTarget	TokenNameIdentifier	 new Target
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
targetMap	TokenNameIdentifier	 target Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
itarget	TokenNameIdentifier	 itarget
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bc	TokenNameIdentifier	 bc
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
newTarget	TokenNameIdentifier	 new Target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Handle LOOKUPSWITCH or TABLESWITCH which may have many 	TokenNameCOMMENT_LINE	Handle LOOKUPSWITCH or TABLESWITCH which may have many 
// target instructions 	TokenNameCOMMENT_LINE	target instructions 
if	TokenNameif	
(	TokenNameLPAREN	
bi	TokenNameIdentifier	 bi
instanceof	TokenNameinstanceof	
Select	TokenNameIdentifier	 Select
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
itargets	TokenNameIdentifier	 itargets
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Select	TokenNameIdentifier	 Select
)	TokenNameRPAREN	
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
.	TokenNameDOT	
getTargets	TokenNameIdentifier	 get Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ctargets	TokenNameIdentifier	 ctargets
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Select	TokenNameIdentifier	 Select
)	TokenNameRPAREN	
bc	TokenNameIdentifier	 bc
)	TokenNameRPAREN	
.	TokenNameDOT	
getTargets	TokenNameIdentifier	 get Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Update all targets 	TokenNameCOMMENT_LINE	Update all targets 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
itargets	TokenNameIdentifier	 itargets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ctargets	TokenNameIdentifier	 ctargets
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
targetMap	TokenNameIdentifier	 target Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
itargets	TokenNameIdentifier	 itargets
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
instanceof	TokenNameinstanceof	
LocalVariableInstruction	TokenNameIdentifier	 Local Variable Instruction
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
instanceof	TokenNameinstanceof	
RET	TokenNameIdentifier	 RET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For any instruction that touches a local variable, 	TokenNameCOMMENT_LINE	For any instruction that touches a local variable, 
// map the location of the variable in the original 	TokenNameCOMMENT_LINE	map the location of the variable in the original 
// method to its location in the new method. 	TokenNameCOMMENT_LINE	method to its location in the new method. 
IndexedInstruction	TokenNameIdentifier	 Indexed Instruction
lvi	TokenNameIdentifier	 lvi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexedInstruction	TokenNameIdentifier	 Indexed Instruction
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
int	TokenNameint	
oldLocalVarIndex	TokenNameIdentifier	 old Local Var Index
=	TokenNameEQUAL	
lvi	TokenNameIdentifier	 lvi
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
oldLVG	TokenNameIdentifier	 old LVG
=	TokenNameEQUAL	
getLocalVariableRegistry	TokenNameIdentifier	 get Local Variable Registry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lookupRegisteredLocalVariable	TokenNameIdentifier	 lookup Registered Local Variable
(	TokenNameLPAREN	
oldLocalVarIndex	TokenNameIdentifier	 old Local Var Index
,	TokenNameCOMMA	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
newLVG	TokenNameIdentifier	 new LVG
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
localVarMap	TokenNameIdentifier	 local Var Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newLocalVarIndex	TokenNameIdentifier	 new Local Var Index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newLVG	TokenNameIdentifier	 new LVG
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create new variable based on old variable - use same 	TokenNameCOMMENT_LINE	Create new variable based on old variable - use same 
// name and type, but we will let the variable be active 	TokenNameCOMMENT_LINE	name and type, but we will let the variable be active 
// for the entire outlined method. 	TokenNameCOMMENT_LINE	for the entire outlined method. 
// LocalVariableGen oldLocal = oldLocals[oldLocalVarIndex]; 	TokenNameCOMMENT_LINE	LocalVariableGen oldLocal = oldLocals[oldLocalVarIndex]; 
String	TokenNameIdentifier	 String
varName	TokenNameIdentifier	 var Name
=	TokenNameEQUAL	
oldLVG	TokenNameIdentifier	 old LVG
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Type	TokenNameIdentifier	 Type
varType	TokenNameIdentifier	 var Type
=	TokenNameEQUAL	
oldLVG	TokenNameIdentifier	 old LVG
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newLVG	TokenNameIdentifier	 new LVG
=	TokenNameEQUAL	
outlinedMethodGen	TokenNameIdentifier	 outlined Method Gen
.	TokenNameDOT	
addLocalVariable	TokenNameIdentifier	 add Local Variable
(	TokenNameLPAREN	
varName	TokenNameIdentifier	 var Name
,	TokenNameCOMMA	
varType	TokenNameIdentifier	 var Type
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newLocalVarIndex	TokenNameIdentifier	 new Local Var Index
=	TokenNameEQUAL	
newLVG	TokenNameIdentifier	 new LVG
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localVarMap	TokenNameIdentifier	 local Var Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
,	TokenNameCOMMA	
newLVG	TokenNameIdentifier	 new LVG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The old variable's live range was wholly contained in 	TokenNameCOMMENT_LINE	The old variable's live range was wholly contained in 
// the outlined chunk. There should no longer be stores 	TokenNameCOMMENT_LINE	the outlined chunk. There should no longer be stores 
// of values into it or loads of its value, so we can just 	TokenNameCOMMENT_LINE	of values into it or loads of its value, so we can just 
// mark its live range as the reference to the outlined 	TokenNameCOMMENT_LINE	mark its live range as the reference to the outlined 
// method. 	TokenNameCOMMENT_LINE	method. 
revisedLocalVarStart	TokenNameIdentifier	 revised Local Var Start
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
,	TokenNameCOMMA	
outlinedMethodRef	TokenNameIdentifier	 outlined Method Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
revisedLocalVarEnd	TokenNameIdentifier	 revised Local Var End
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
oldLVG	TokenNameIdentifier	 old LVG
,	TokenNameCOMMA	
outlinedMethodRef	TokenNameIdentifier	 outlined Method Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newLocalVarIndex	TokenNameIdentifier	 new Local Var Index
=	TokenNameEQUAL	
newLVG	TokenNameIdentifier	 new LVG
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lvi	TokenNameIdentifier	 lvi
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
newLocalVarIndex	TokenNameIdentifier	 new Local Var Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the old instruction marks the end of the range of a local 	TokenNameCOMMENT_LINE	If the old instruction marks the end of the range of a local 
// variable, make sure that any slots on the stack reserved for 	TokenNameCOMMENT_LINE	variable, make sure that any slots on the stack reserved for 
// local variables are made available for reuse by calling 	TokenNameCOMMENT_LINE	local variables are made available for reuse by calling 
// MethodGenerator.removeLocalVariable 	TokenNameCOMMENT_LINE	MethodGenerator.removeLocalVariable 
if	TokenNameif	
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
hasTargeters	TokenNameIdentifier	 has Targeters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstructionTargeter	TokenNameIdentifier	 Instruction Targeter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targeters	TokenNameIdentifier	 targeters
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getTargeters	TokenNameIdentifier	 get Targeters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
targeters	TokenNameIdentifier	 targeters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstructionTargeter	TokenNameIdentifier	 Instruction Targeter
targeter	TokenNameIdentifier	 targeter
=	TokenNameEQUAL	
targeters	TokenNameIdentifier	 targeters
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targeter	TokenNameIdentifier	 targeter
instanceof	TokenNameinstanceof	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
targeter	TokenNameIdentifier	 targeter
)	TokenNameRPAREN	
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ih	TokenNameIdentifier	 ih
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
newLVG	TokenNameIdentifier	 new LVG
=	TokenNameEQUAL	
localVarMap	TokenNameIdentifier	 local Var Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
targeter	TokenNameIdentifier	 targeter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newLVG	TokenNameIdentifier	 new LVG
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outlinedMethodGen	TokenNameIdentifier	 outlined Method Gen
.	TokenNameDOT	
removeLocalVariable	TokenNameIdentifier	 remove Local Variable
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
newLVG	TokenNameIdentifier	 new LVG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If the current instruction in the original list was a marker, 	TokenNameCOMMENT_LINE	If the current instruction in the original list was a marker, 
// it wasn't copied, so don't advance through the list of copied 	TokenNameCOMMENT_LINE	it wasn't copied, so don't advance through the list of copied 
// instructions yet. 	TokenNameCOMMENT_LINE	instructions yet. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
instanceof	TokenNameinstanceof	
MarkerInstruction	TokenNameIdentifier	 Marker Instruction
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// POP the reference to the CopyLocals object from the stack 	TokenNameCOMMENT_LINE	POP the reference to the CopyLocals object from the stack 
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
POP	TokenNameIdentifier	 POP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now that the generation of the outlined code is complete, update 	TokenNameCOMMENT_LINE	Now that the generation of the outlined code is complete, update 
// the old local variables with new start and end ranges, as required. 	TokenNameCOMMENT_LINE	the old local variables with new start and end ranges, as required. 
Iterator	TokenNameIdentifier	 Iterator
revisedLocalVarStartPairIter	TokenNameIdentifier	 revised Local Var Start Pair Iter
=	TokenNameEQUAL	
revisedLocalVarStart	TokenNameIdentifier	 revised Local Var Start
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
revisedLocalVarStartPairIter	TokenNameIdentifier	 revised Local Var Start Pair Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
lvgRangeStartPair	TokenNameIdentifier	 lvg Range Start Pair
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
revisedLocalVarStartPairIter	TokenNameIdentifier	 revised Local Var Start Pair Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
lvgRangeStartPair	TokenNameIdentifier	 lvg Range Start Pair
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
startInst	TokenNameIdentifier	 start Inst
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
lvgRangeStartPair	TokenNameIdentifier	 lvg Range Start Pair
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
setStart	TokenNameIdentifier	 set Start
(	TokenNameLPAREN	
startInst	TokenNameIdentifier	 start Inst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
revisedLocalVarEndPairIter	TokenNameIdentifier	 revised Local Var End Pair Iter
=	TokenNameEQUAL	
revisedLocalVarEnd	TokenNameIdentifier	 revised Local Var End
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
revisedLocalVarEndPairIter	TokenNameIdentifier	 revised Local Var End Pair Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
lvgRangeEndPair	TokenNameIdentifier	 lvg Range End Pair
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
revisedLocalVarEndPairIter	TokenNameIdentifier	 revised Local Var End Pair Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
lvgRangeEndPair	TokenNameIdentifier	 lvg Range End Pair
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
endInst	TokenNameIdentifier	 end Inst
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
lvgRangeEndPair	TokenNameIdentifier	 lvg Range End Pair
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
endInst	TokenNameIdentifier	 end Inst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dumpClass	TokenNameIdentifier	 dump Class
(	TokenNameLPAREN	
copyAreaCG	TokenNameIdentifier	 copy Area CG
.	TokenNameDOT	
getJavaClass	TokenNameIdentifier	 get Java Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Assemble the instruction lists so that the old method invokes the 	TokenNameCOMMENT_LINE	Assemble the instruction lists so that the old method invokes the 
// new outlined method 	TokenNameCOMMENT_LINE	new outlined method 
InstructionList	TokenNameIdentifier	 Instruction List
oldMethodIL	TokenNameIdentifier	 old Method IL
=	TokenNameEQUAL	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldMethodIL	TokenNameIdentifier	 old Method IL
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
oldMethCopyInIL	TokenNameIdentifier	 old Meth Copy In IL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldMethodIL	TokenNameIdentifier	 old Method IL
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
oldMethCopyOutIL	TokenNameIdentifier	 old Meth Copy Out IL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Insert the copying code into the outlined method 	TokenNameCOMMENT_LINE	Insert the copying code into the outlined method 
newIL	TokenNameIdentifier	 new IL
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
newMethCopyInIL	TokenNameIdentifier	 new Meth Copy In IL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newIL	TokenNameIdentifier	 new IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
newMethCopyOutIL	TokenNameIdentifier	 new Meth Copy Out IL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newIL	TokenNameIdentifier	 new IL
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
InstructionConstants	TokenNameIdentifier	 Instruction Constants
.	TokenNameDOT	
RETURN	TokenNameIdentifier	 RETURN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Discard instructions in outlineable chunk from old method 	TokenNameCOMMENT_LINE	Discard instructions in outlineable chunk from old method 
try	TokenNametry	
{	TokenNameLBRACE	
oldMethodIL	TokenNameIdentifier	 old Method IL
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TargetLostException	TokenNameIdentifier	 Target Lost Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targets	TokenNameIdentifier	 targets
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getTargets	TokenNameIdentifier	 get Targets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If there were still references to old instructions lingering, 	TokenNameCOMMENT_LINE	If there were still references to old instructions lingering, 
// clean those up. The only instructions targetting the deleted 	TokenNameCOMMENT_LINE	clean those up. The only instructions targetting the deleted 
// instructions should have been part of the chunk that was just 	TokenNameCOMMENT_LINE	instructions should have been part of the chunk that was just 
// deleted, except that instructions might branch to the start of 	TokenNameCOMMENT_LINE	deleted, except that instructions might branch to the start of 
// the outlined chunk; similarly, all the live ranges of local 	TokenNameCOMMENT_LINE	the outlined chunk; similarly, all the live ranges of local 
// variables should have been adjusted, except for unreferenced 	TokenNameCOMMENT_LINE	variables should have been adjusted, except for unreferenced 
// variables. 	TokenNameCOMMENT_LINE	variables. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
targets	TokenNameIdentifier	 targets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
lostTarget	TokenNameIdentifier	 lost Target
=	TokenNameEQUAL	
targets	TokenNameIdentifier	 targets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
InstructionTargeter	TokenNameIdentifier	 Instruction Targeter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targeters	TokenNameIdentifier	 targeters
=	TokenNameEQUAL	
lostTarget	TokenNameIdentifier	 lost Target
.	TokenNameDOT	
getTargeters	TokenNameIdentifier	 get Targeters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
targeters	TokenNameIdentifier	 targeters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
targeters	TokenNameIdentifier	 targeters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvgTargeter	TokenNameIdentifier	 lvg Targeter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
targeters	TokenNameIdentifier	 targeters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// In the case of any lingering variable references, 	TokenNameCOMMENT_LINE	In the case of any lingering variable references, 
// just make the live range point to the outlined 	TokenNameCOMMENT_LINE	just make the live range point to the outlined 
// function reference. Such variables should be unused 	TokenNameCOMMENT_LINE	function reference. Such variables should be unused 
// anyway. 	TokenNameCOMMENT_LINE	anyway. 
if	TokenNameif	
(	TokenNameLPAREN	
lvgTargeter	TokenNameIdentifier	 lvg Targeter
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
lostTarget	TokenNameIdentifier	 lost Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lvgTargeter	TokenNameIdentifier	 lvg Targeter
.	TokenNameDOT	
setStart	TokenNameIdentifier	 set Start
(	TokenNameLPAREN	
outlinedMethodRef	TokenNameIdentifier	 outlined Method Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lvgTargeter	TokenNameIdentifier	 lvg Targeter
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
lostTarget	TokenNameIdentifier	 lost Target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lvgTargeter	TokenNameIdentifier	 lvg Targeter
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
outlinedMethodRef	TokenNameIdentifier	 outlined Method Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
targeters	TokenNameIdentifier	 targeters
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
updateTarget	TokenNameIdentifier	 update Target
(	TokenNameLPAREN	
lostTarget	TokenNameIdentifier	 lost Target
,	TokenNameCOMMA	
outlinedMethodCallSetup	TokenNameIdentifier	 outlined Method Call Setup
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Make a copy for the new method of all exceptions that might be thrown 	TokenNameCOMMENT_LINE	Make a copy for the new method of all exceptions that might be thrown 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exceptions	TokenNameIdentifier	 exceptions
=	TokenNameEQUAL	
getExceptions	TokenNameIdentifier	 get Exceptions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outlinedMethodGen	TokenNameIdentifier	 outlined Method Gen
.	TokenNameDOT	
addException	TokenNameIdentifier	 add Exception
(	TokenNameLPAREN	
exceptions	TokenNameIdentifier	 exceptions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
outlinedMethodGen	TokenNameIdentifier	 outlined Method Gen
.	TokenNameDOT	
getThisMethod	TokenNameIdentifier	 get This Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Helper method to generate an instance of a subclass of * {@link LoadInstruction} based on the specified {@link Type} that will * load the specified local variable * @param index the JVM stack frame index of the variable that is to be * loaded * @param type the {@link Type} of the variable * @return the generated {@link LoadInstruction} */	TokenNameCOMMENT_JAVADOC	 Helper method to generate an instance of a subclass of {@link LoadInstruction} based on the specified {@link Type} that will load the specified local variable @param index the JVM stack frame index of the variable that is to be loaded @param type the {@link Type} of the variable @return the generated {@link LoadInstruction} 
private	TokenNameprivate	
static	TokenNamestatic	
Instruction	TokenNameIdentifier	 Instruction
loadLocal	TokenNameIdentifier	 load Local
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BOOLEAN	TokenNameIdentifier	 BOOLEAN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ILOAD	TokenNameIdentifier	 ILOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ILOAD	TokenNameIdentifier	 ILOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ILOAD	TokenNameIdentifier	 ILOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
LONG	TokenNameIdentifier	 LONG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LLOAD	TokenNameIdentifier	 LLOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ILOAD	TokenNameIdentifier	 ILOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
CHAR	TokenNameIdentifier	 CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ILOAD	TokenNameIdentifier	 ILOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FLOAD	TokenNameIdentifier	 FLOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DLOAD	TokenNameIdentifier	 DLOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Helper method to generate an instance of a subclass of * {@link StoreInstruction} based on the specified {@link Type} that will * store a value in the specified local variable * @param index the JVM stack frame index of the variable that is to be * stored * @param type the {@link Type} of the variable * @return the generated {@link StoredInstruction} */	TokenNameCOMMENT_JAVADOC	 Helper method to generate an instance of a subclass of {@link StoreInstruction} based on the specified {@link Type} that will store a value in the specified local variable @param index the JVM stack frame index of the variable that is to be stored @param type the {@link Type} of the variable @return the generated {@link StoredInstruction} 
private	TokenNameprivate	
static	TokenNamestatic	
Instruction	TokenNameIdentifier	 Instruction
storeLocal	TokenNameIdentifier	 store Local
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BOOLEAN	TokenNameIdentifier	 BOOLEAN
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ISTORE	TokenNameIdentifier	 ISTORE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ISTORE	TokenNameIdentifier	 ISTORE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ISTORE	TokenNameIdentifier	 ISTORE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
LONG	TokenNameIdentifier	 LONG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LSTORE	TokenNameIdentifier	 LSTORE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ISTORE	TokenNameIdentifier	 ISTORE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
CHAR	TokenNameIdentifier	 CHAR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ISTORE	TokenNameIdentifier	 ISTORE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FSTORE	TokenNameIdentifier	 FSTORE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DSTORE	TokenNameIdentifier	 DSTORE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ASTORE	TokenNameIdentifier	 ASTORE
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Track the number of outlineable chunks seen. */	TokenNameCOMMENT_JAVADOC	 Track the number of outlineable chunks seen. 
private	TokenNameprivate	
int	TokenNameint	
m_totalChunks	TokenNameIdentifier	 m total Chunks
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Track the number of outlineable chunks started but not yet ended. Used * to detect imbalances in byte code generation. */	TokenNameCOMMENT_JAVADOC	 Track the number of outlineable chunks started but not yet ended. Used to detect imbalances in byte code generation. 
private	TokenNameprivate	
int	TokenNameint	
m_openChunks	TokenNameIdentifier	 m open Chunks
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Mark the end of the method's * {@link InstructionList} as the start of an outlineable chunk of code. * The outlineable chunk begins after the {@link InstructionHandle} that is * at the end of the method's {@link InstructionList}, or at the start of * the method if the <code>InstructionList</code> is empty. * See {@link OutlineableChunkStart} for more information. */	TokenNameCOMMENT_JAVADOC	 Mark the end of the method's {@link InstructionList} as the start of an outlineable chunk of code. The outlineable chunk begins after the {@link InstructionHandle} that is at the end of the method's {@link InstructionList}, or at the start of the method if the <code>InstructionList</code> is empty. See {@link OutlineableChunkStart} for more information. 
public	TokenNamepublic	
void	TokenNamevoid	
markChunkStart	TokenNameIdentifier	 mark Chunk Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// m_chunkTree.markChunkStart(); 	TokenNameCOMMENT_LINE	m_chunkTree.markChunkStart(); 
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
OutlineableChunkStart	TokenNameIdentifier	 Outlineable Chunk Start
.	TokenNameDOT	
OUTLINEABLECHUNKSTART	TokenNameIdentifier	 OUTLINEABLECHUNKSTART
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_totalChunks	TokenNameIdentifier	 m total Chunks
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
m_openChunks	TokenNameIdentifier	 m open Chunks
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Mark the end of an outlineable chunk of code. See * {@link OutlineableChunkStart} for more information. */	TokenNameCOMMENT_JAVADOC	 Mark the end of an outlineable chunk of code. See {@link OutlineableChunkStart} for more information. 
public	TokenNamepublic	
void	TokenNamevoid	
markChunkEnd	TokenNameIdentifier	 mark Chunk End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// m_chunkTree.markChunkEnd(); 	TokenNameCOMMENT_LINE	m_chunkTree.markChunkEnd(); 
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
OutlineableChunkEnd	TokenNameIdentifier	 Outlineable Chunk End
.	TokenNameDOT	
OUTLINEABLECHUNKEND	TokenNameIdentifier	 OUTLINEABLECHUNKEND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_openChunks	TokenNameIdentifier	 m open Chunks
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_openChunks	TokenNameIdentifier	 m open Chunks
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
OUTLINE_ERR_UNBALANCED_MARKERS	TokenNameIdentifier	 OUTLINE  ERR  UNBALANCED  MARKERS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InternalError	TokenNameIdentifier	 Internal Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Get all {@link Method}s generated by this {@link MethodGenerator}. * The {@link MethodGen#getMethod()} only returns a single * <code>Method</code> object. This method takes into account the Java * Virtual Machine Specification limit of 64KB on the size of a method, and * may return more than one <code>Method</code>.</p> * <p>If the code associated with the <code>MethodGenerator</code> would * exceed the 64KB limit, this method will attempt to split the code in * the {@link InstructionList} associated with this * <code>MethodGenerator</code> into several methods.</p> * @param classGen the {@link ClassGenerator} of which these methods are * members * @return an array of all the <code>Method</code>s generated */	TokenNameCOMMENT_JAVADOC	 <p>Get all {@link Method}s generated by this {@link MethodGenerator}. The {@link MethodGen#getMethod()} only returns a single <code>Method</code> object. This method takes into account the Java Virtual Machine Specification limit of 64KB on the size of a method, and may return more than one <code>Method</code>.</p> <p>If the code associated with the <code>MethodGenerator</code> would exceed the 64KB limit, this method will attempt to split the code in the {@link InstructionList} associated with this <code>MethodGenerator</code> into several methods.</p> @param classGen the {@link ClassGenerator} of which these methods are members @return an array of all the <code>Method</code>s generated 
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getGeneratedMethods	TokenNameIdentifier	 get Generated Methods
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
generatedMethods	TokenNameIdentifier	 generated Methods
;	TokenNameSEMICOLON	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
setPositions	TokenNameIdentifier	 set Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
instructionListSize	TokenNameIdentifier	 instruction List Size
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Need to look for any branch target offsets that exceed the range 	TokenNameCOMMENT_LINE	Need to look for any branch target offsets that exceed the range 
// [-32768,32767] 	TokenNameCOMMENT_LINE	[-32768,32767] 
if	TokenNameif	
(	TokenNameLPAREN	
instructionListSize	TokenNameIdentifier	 instruction List Size
>	TokenNameGREATER	
MAX_BRANCH_TARGET_OFFSET	TokenNameIdentifier	 MAX  BRANCH  TARGET  OFFSET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
ilChanged	TokenNameIdentifier	 il Changed
=	TokenNameEQUAL	
widenConditionalBranchTargetOffsets	TokenNameIdentifier	 widen Conditional Branch Target Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If any branch instructions needed widening, recompute the size 	TokenNameCOMMENT_LINE	If any branch instructions needed widening, recompute the size 
// of the byte code for the method 	TokenNameCOMMENT_LINE	of the byte code for the method 
if	TokenNameif	
(	TokenNameLPAREN	
ilChanged	TokenNameIdentifier	 il Changed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
setPositions	TokenNameIdentifier	 set Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instructionListSize	TokenNameIdentifier	 instruction List Size
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
instructionListSize	TokenNameIdentifier	 instruction List Size
>	TokenNameGREATER	
MAX_METHOD_SIZE	TokenNameIdentifier	 MAX  METHOD  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
generatedMethods	TokenNameIdentifier	 generated Methods
=	TokenNameEQUAL	
outlineChunks	TokenNameIdentifier	 outline Chunks
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
instructionListSize	TokenNameIdentifier	 instruction List Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
generatedMethods	TokenNameIdentifier	 generated Methods
=	TokenNameEQUAL	
new	TokenNamenew	
Method	TokenNameIdentifier	 Method
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
getThisMethod	TokenNameIdentifier	 get This Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
generatedMethods	TokenNameIdentifier	 generated Methods
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Method	TokenNameIdentifier	 Method
getThisMethod	TokenNameIdentifier	 get This Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stripAttributes	TokenNameIdentifier	 strip Attributes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMaxLocals	TokenNameIdentifier	 set Max Locals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMaxStack	TokenNameIdentifier	 set Max Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeNOPs	TokenNameIdentifier	 remove NO Ps
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Rewrites branches to avoid the JVM limits of relative branch * offsets. There is no need to invoke this method if the bytecode for the * {@link MethodGenerator} does not exceed 32KB.</p> * <p>The Java Virtual Machine Specification permits the code portion of a * method to be up to 64KB in length. However, some control transfer * instructions specify relative offsets as a signed 16-bit quantity, * limiting the range to a subset of the instructions that might be in a * method.</p> * <p>The <code>TABLESWITCH</code> and <code>LOOKUPSWITCH</code> * instructions always use 32-bit signed relative offsets, so they are * immune to this problem.</p> * <p>The <code>GOTO</code> and <code>JSR</code> * instructions come in two forms, one of which uses 16-bit relative * offsets, and the other of which uses 32-bit relative offsets. The BCEL * library decides whether to use the wide form of <code>GOTO</code> or * <code>JSR</code>instructions based on the relative offset of the target * of the instruction without any intervention by the user of the * library.</p> * <p>This leaves the various conditional branch instructions, * <code>IFEQ</code>, <code>IFNULL</code>, <code>IF_ICMPEQ</code>, * <em>et al.</em>, all of which use 16-bit signed relative offsets, with no * 32-bit wide form available.</p> * <p>This method scans the {@link InstructionList} associated with this * {@link MethodGenerator} and finds all conditional branch instructions * that might exceed the 16-bit limitation for relative branch offsets. * The logic of each such instruction is inverted, and made to target the * instruction which follows it. An unconditional branch to the original * target of the instruction is then inserted between the conditional * branch and the instruction which previously followed it. The * unconditional branch is permitted to have a 16-bit or a 32-bit relative * offset, as described above. For example, * <code> * 1234: NOP * ... * 55278: IFEQ -54044 * 55280: NOP * </code> * is rewritten as * <code> * 1234: NOP * ... * 55278: IFNE 7 * 55280: GOTO_W -54046 * 55285: NOP * </code></p> * <p><b>Preconditions:</b> * <ul><li>The {@link InstructionList#setPositions()} has been called for * the <code>InstructionList</code> associated with this * <code>MethodGenerator</code>. * </li></ul></p> * <p><b>Postconditions:</b> * <ul><li>Any further changes to the <code>InstructionList</code> for this * <code>MethodGenerator</code> will invalidate the changes made by this * method.</li></ul> * </p> * @return <code>true</code> if the <code>InstructionList</code> was * modified; <code>false</code> otherwise * @see The Java Virtual Machine Specification, Second Edition */	TokenNameCOMMENT_JAVADOC	 <p>Rewrites branches to avoid the JVM limits of relative branch offsets. There is no need to invoke this method if the bytecode for the {@link MethodGenerator} does not exceed 32KB.</p> <p>The Java Virtual Machine Specification permits the code portion of a method to be up to 64KB in length. However, some control transfer instructions specify relative offsets as a signed 16-bit quantity, limiting the range to a subset of the instructions that might be in a method.</p> <p>The <code>TABLESWITCH</code> and <code>LOOKUPSWITCH</code> instructions always use 32-bit signed relative offsets, so they are immune to this problem.</p> <p>The <code>GOTO</code> and <code>JSR</code> instructions come in two forms, one of which uses 16-bit relative offsets, and the other of which uses 32-bit relative offsets. The BCEL library decides whether to use the wide form of <code>GOTO</code> or <code>JSR</code>instructions based on the relative offset of the target of the instruction without any intervention by the user of the library.</p> <p>This leaves the various conditional branch instructions, <code>IFEQ</code>, <code>IFNULL</code>, <code>IF_ICMPEQ</code>, <em>et al.</em>, all of which use 16-bit signed relative offsets, with no 32-bit wide form available.</p> <p>This method scans the {@link InstructionList} associated with this {@link MethodGenerator} and finds all conditional branch instructions that might exceed the 16-bit limitation for relative branch offsets. The logic of each such instruction is inverted, and made to target the instruction which follows it. An unconditional branch to the original target of the instruction is then inserted between the conditional branch and the instruction which previously followed it. The unconditional branch is permitted to have a 16-bit or a 32-bit relative offset, as described above. For example, <code> 1234: NOP ... 55278: IFEQ -54044 55280: NOP </code> is rewritten as <code> 1234: NOP ... 55278: IFNE 7 55280: GOTO_W -54046 55285: NOP </code></p> <p><b>Preconditions:</b> <ul><li>The {@link InstructionList#setPositions()} has been called for the <code>InstructionList</code> associated with this <code>MethodGenerator</code>. </li></ul></p> <p><b>Postconditions:</b> <ul><li>Any further changes to the <code>InstructionList</code> for this <code>MethodGenerator</code> will invalidate the changes made by this method.</li></ul> </p> @return <code>true</code> if the <code>InstructionList</code> was modified; <code>false</code> otherwise @see The Java Virtual Machine Specification, Second Edition 
boolean	TokenNameboolean	
widenConditionalBranchTargetOffsets	TokenNameIdentifier	 widen Conditional Branch Target Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
ilChanged	TokenNameIdentifier	 il Changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxOffsetChange	TokenNameIdentifier	 max Offset Change
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Loop through all the instructions, finding those that would be 	TokenNameCOMMENT_LINE	Loop through all the instructions, finding those that would be 
// affected by inserting new instructions in the InstructionList, and 	TokenNameCOMMENT_LINE	affected by inserting new instructions in the InstructionList, and 
// calculating the maximum amount by which the relative offset between 	TokenNameCOMMENT_LINE	calculating the maximum amount by which the relative offset between 
// two instructions could possibly change. 	TokenNameCOMMENT_LINE	two instructions could possibly change. 
// In part this loop duplicates code in 	TokenNameCOMMENT_LINE	In part this loop duplicates code in 
// org.apache.bcel.generic.InstructionList.setPosition(), which does 	TokenNameCOMMENT_LINE	org.apache.bcel.generic.InstructionList.setPosition(), which does 
// this to determine whether to use 16-bit or 32-bit offsets for GOTO 	TokenNameCOMMENT_LINE	this to determine whether to use 16-bit or 32-bit offsets for GOTO 
// and JSR instructions. Ideally, that method would do the same for 	TokenNameCOMMENT_LINE	and JSR instructions. Ideally, that method would do the same for 
// conditional branch instructions, but it doesn't, so we duplicate the 	TokenNameCOMMENT_LINE	conditional branch instructions, but it doesn't, so we duplicate the 
// processing here. 	TokenNameCOMMENT_LINE	processing here. 
for	TokenNamefor	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instruction	TokenNameIdentifier	 Instruction
inst	TokenNameIdentifier	 inst
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
inst	TokenNameIdentifier	 inst
.	TokenNameDOT	
getOpcode	TokenNameIdentifier	 get Opcode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Instructions that may have 16-bit or 32-bit branch targets. 	TokenNameCOMMENT_LINE	Instructions that may have 16-bit or 32-bit branch targets. 
// The size of the branch offset might increase by two bytes. 	TokenNameCOMMENT_LINE	The size of the branch offset might increase by two bytes. 
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
GOTO	TokenNameIdentifier	 GOTO
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JSR	TokenNameIdentifier	 JSR
:	TokenNameCOLON	
maxOffsetChange	TokenNameIdentifier	 max Offset Change
=	TokenNameEQUAL	
maxOffsetChange	TokenNameIdentifier	 max Offset Change
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Instructions that contain padding for alignment purposes 	TokenNameCOMMENT_LINE	Instructions that contain padding for alignment purposes 
// Up to three bytes of padding might be needed. For greater 	TokenNameCOMMENT_LINE	Up to three bytes of padding might be needed. For greater 
// accuracy, we should be able to discount any padding already 	TokenNameCOMMENT_LINE	accuracy, we should be able to discount any padding already 
// added to these instructions by InstructionList.setPosition(), 	TokenNameCOMMENT_LINE	added to these instructions by InstructionList.setPosition(), 
// their APIs do not expose that information. 	TokenNameCOMMENT_LINE	their APIs do not expose that information. 
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
TABLESWITCH	TokenNameIdentifier	 TABLESWITCH
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
LOOKUPSWITCH	TokenNameIdentifier	 LOOKUPSWITCH
:	TokenNameCOLON	
maxOffsetChange	TokenNameIdentifier	 max Offset Change
=	TokenNameEQUAL	
maxOffsetChange	TokenNameIdentifier	 max Offset Change
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Instructions that might be rewritten by this method as a 	TokenNameCOMMENT_LINE	Instructions that might be rewritten by this method as a 
// conditional branch followed by an unconditional branch. 	TokenNameCOMMENT_LINE	conditional branch followed by an unconditional branch. 
// The unconditional branch would require five bytes. 	TokenNameCOMMENT_LINE	The unconditional branch would require five bytes. 
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IF_ACMPEQ	TokenNameIdentifier	 IF  ACMPEQ
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IF_ACMPNE	TokenNameIdentifier	 IF  ACMPNE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IF_ICMPEQ	TokenNameIdentifier	 IF  ICMPEQ
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IF_ICMPGE	TokenNameIdentifier	 IF  ICMPGE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IF_ICMPGT	TokenNameIdentifier	 IF  ICMPGT
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IF_ICMPLE	TokenNameIdentifier	 IF  ICMPLE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IF_ICMPLT	TokenNameIdentifier	 IF  ICMPLT
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IF_ICMPNE	TokenNameIdentifier	 IF  ICMPNE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IFEQ	TokenNameIdentifier	 IFEQ
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IFGE	TokenNameIdentifier	 IFGE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IFGT	TokenNameIdentifier	 IFGT
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IFLE	TokenNameIdentifier	 IFLE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IFLT	TokenNameIdentifier	 IFLT
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IFNE	TokenNameIdentifier	 IFNE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IFNONNULL	TokenNameIdentifier	 IFNONNULL
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
IFNULL	TokenNameIdentifier	 IFNULL
:	TokenNameCOLON	
maxOffsetChange	TokenNameIdentifier	 max Offset Change
=	TokenNameEQUAL	
maxOffsetChange	TokenNameIdentifier	 max Offset Change
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now that the maximum number of bytes by which the method might grow 	TokenNameCOMMENT_LINE	Now that the maximum number of bytes by which the method might grow 
// has been determined, look for conditional branches to see which 	TokenNameCOMMENT_LINE	has been determined, look for conditional branches to see which 
// might possibly exceed the 16-bit relative offset. 	TokenNameCOMMENT_LINE	might possibly exceed the 16-bit relative offset. 
for	TokenNamefor	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instruction	TokenNameIdentifier	 Instruction
inst	TokenNameIdentifier	 inst
=	TokenNameEQUAL	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getInstruction	TokenNameIdentifier	 get Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inst	TokenNameIdentifier	 inst
instanceof	TokenNameinstanceof	
IfInstruction	TokenNameIdentifier	 If Instruction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IfInstruction	TokenNameIdentifier	 If Instruction
oldIfInst	TokenNameIdentifier	 old If Inst
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IfInstruction	TokenNameIdentifier	 If Instruction
)	TokenNameRPAREN	
inst	TokenNameIdentifier	 inst
;	TokenNameSEMICOLON	
BranchHandle	TokenNameIdentifier	 Branch Handle
oldIfHandle	TokenNameIdentifier	 old If Handle
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BranchHandle	TokenNameIdentifier	 Branch Handle
)	TokenNameRPAREN	
ih	TokenNameIdentifier	 ih
;	TokenNameSEMICOLON	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
oldIfInst	TokenNameIdentifier	 old If Inst
.	TokenNameDOT	
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
relativeTargetOffset	TokenNameIdentifier	 relative Target Offset
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
oldIfHandle	TokenNameIdentifier	 old If Handle
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Consider the worst case scenario in which the conditional 	TokenNameCOMMENT_LINE	Consider the worst case scenario in which the conditional 
// branch and its target are separated by all the instructions 	TokenNameCOMMENT_LINE	branch and its target are separated by all the instructions 
// in the method that might increase in size. If that results 	TokenNameCOMMENT_LINE	in the method that might increase in size. If that results 
// in a relative offset that cannot be represented as a 32-bit 	TokenNameCOMMENT_LINE	in a relative offset that cannot be represented as a 32-bit 
// signed quantity, rewrite the instruction as described above. 	TokenNameCOMMENT_LINE	signed quantity, rewrite the instruction as described above. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
relativeTargetOffset	TokenNameIdentifier	 relative Target Offset
-	TokenNameMINUS	
maxOffsetChange	TokenNameIdentifier	 max Offset Change
<	TokenNameLESS	
MIN_BRANCH_TARGET_OFFSET	TokenNameIdentifier	 MIN  BRANCH  TARGET  OFFSET
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
relativeTargetOffset	TokenNameIdentifier	 relative Target Offset
+	TokenNamePLUS	
maxOffsetChange	TokenNameIdentifier	 max Offset Change
>	TokenNameGREATER	
MAX_BRANCH_TARGET_OFFSET	TokenNameIdentifier	 MAX  BRANCH  TARGET  OFFSET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Invert the logic of the IF instruction, and append 	TokenNameCOMMENT_LINE	Invert the logic of the IF instruction, and append 
// that to the InstructionList following the original IF 	TokenNameCOMMENT_LINE	that to the InstructionList following the original IF 
// instruction 	TokenNameCOMMENT_LINE	instruction 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
nextHandle	TokenNameIdentifier	 next Handle
=	TokenNameEQUAL	
oldIfHandle	TokenNameIdentifier	 old If Handle
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IfInstruction	TokenNameIdentifier	 If Instruction
invertedIfInst	TokenNameIdentifier	 inverted If Inst
=	TokenNameEQUAL	
oldIfInst	TokenNameIdentifier	 old If Inst
.	TokenNameDOT	
negate	TokenNameIdentifier	 negate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BranchHandle	TokenNameIdentifier	 Branch Handle
invertedIfHandle	TokenNameIdentifier	 inverted If Handle
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
oldIfHandle	TokenNameIdentifier	 old If Handle
,	TokenNameCOMMA	
invertedIfInst	TokenNameIdentifier	 inverted If Inst
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Append an unconditional branch to the target of the 	TokenNameCOMMENT_LINE	Append an unconditional branch to the target of the 
// original IF instruction after the new IF instruction 	TokenNameCOMMENT_LINE	original IF instruction after the new IF instruction 
BranchHandle	TokenNameIdentifier	 Branch Handle
gotoHandle	TokenNameIdentifier	 goto Handle
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
invertedIfHandle	TokenNameIdentifier	 inverted If Handle
,	TokenNameCOMMA	
new	TokenNamenew	
GOTO	TokenNameIdentifier	 GOTO
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the original IF was the last instruction in 	TokenNameCOMMENT_LINE	If the original IF was the last instruction in 
// InstructionList, add a new no-op to act as the target 	TokenNameCOMMENT_LINE	InstructionList, add a new no-op to act as the target 
// of the new IF 	TokenNameCOMMENT_LINE	of the new IF 
if	TokenNameif	
(	TokenNameLPAREN	
nextHandle	TokenNameIdentifier	 next Handle
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextHandle	TokenNameIdentifier	 next Handle
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
gotoHandle	TokenNameIdentifier	 goto Handle
,	TokenNameCOMMA	
NOP	TokenNameIdentifier	 NOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make the new IF instruction branch around the GOTO 	TokenNameCOMMENT_LINE	Make the new IF instruction branch around the GOTO 
invertedIfHandle	TokenNameIdentifier	 inverted If Handle
.	TokenNameDOT	
updateTarget	TokenNameIdentifier	 update Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
nextHandle	TokenNameIdentifier	 next Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If anything still "points" to the old IF instruction, 	TokenNameCOMMENT_LINE	If anything still "points" to the old IF instruction, 
// make adjustments to refer to either the new IF or GOTO 	TokenNameCOMMENT_LINE	make adjustments to refer to either the new IF or GOTO 
// instruction 	TokenNameCOMMENT_LINE	instruction 
if	TokenNameif	
(	TokenNameLPAREN	
oldIfHandle	TokenNameIdentifier	 old If Handle
.	TokenNameDOT	
hasTargeters	TokenNameIdentifier	 has Targeters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstructionTargeter	TokenNameIdentifier	 Instruction Targeter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
targeters	TokenNameIdentifier	 targeters
=	TokenNameEQUAL	
oldIfHandle	TokenNameIdentifier	 old If Handle
.	TokenNameDOT	
getTargeters	TokenNameIdentifier	 get Targeters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
targeters	TokenNameIdentifier	 targeters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstructionTargeter	TokenNameIdentifier	 Instruction Targeter
targeter	TokenNameIdentifier	 targeter
=	TokenNameEQUAL	
targeters	TokenNameIdentifier	 targeters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Ideally, one should simply be able to use 	TokenNameCOMMENT_LINE	Ideally, one should simply be able to use 
// InstructionTargeter.updateTarget to change 	TokenNameCOMMENT_LINE	InstructionTargeter.updateTarget to change 
// references to the old IF instruction to the new 	TokenNameCOMMENT_LINE	references to the old IF instruction to the new 
// IF instruction. However, if a LocalVariableGen 	TokenNameCOMMENT_LINE	IF instruction. However, if a LocalVariableGen 
// indicated the old IF marked the end of the range 	TokenNameCOMMENT_LINE	indicated the old IF marked the end of the range 
// in which the IF variable is in use, the live 	TokenNameCOMMENT_LINE	in which the IF variable is in use, the live 
// range of the variable must extend to include the 	TokenNameCOMMENT_LINE	range of the variable must extend to include the 
// newly created GOTO instruction. The need for 	TokenNameCOMMENT_LINE	newly created GOTO instruction. The need for 
// this sort of specific knowledge of an 	TokenNameCOMMENT_LINE	this sort of specific knowledge of an 
// implementor of the InstructionTargeter interface 	TokenNameCOMMENT_LINE	implementor of the InstructionTargeter interface 
// makes the code more fragile. Future implementors 	TokenNameCOMMENT_LINE	makes the code more fragile. Future implementors 
// of the interface might have similar requirements 	TokenNameCOMMENT_LINE	of the interface might have similar requirements 
// which wouldn't be accommodated seemlessly. 	TokenNameCOMMENT_LINE	which wouldn't be accommodated seemlessly. 
if	TokenNameif	
(	TokenNameLPAREN	
targeter	TokenNameIdentifier	 targeter
instanceof	TokenNameinstanceof	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
lvg	TokenNameIdentifier	 lvg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocalVariableGen	TokenNameIdentifier	 Local Variable Gen
)	TokenNameRPAREN	
targeter	TokenNameIdentifier	 targeter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
oldIfHandle	TokenNameIdentifier	 old If Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
setStart	TokenNameIdentifier	 set Start
(	TokenNameLPAREN	
invertedIfHandle	TokenNameIdentifier	 inverted If Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
oldIfHandle	TokenNameIdentifier	 old If Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lvg	TokenNameIdentifier	 lvg
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
gotoHandle	TokenNameIdentifier	 goto Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
targeter	TokenNameIdentifier	 targeter
.	TokenNameDOT	
updateTarget	TokenNameIdentifier	 update Target
(	TokenNameLPAREN	
oldIfHandle	TokenNameIdentifier	 old If Handle
,	TokenNameCOMMA	
invertedIfHandle	TokenNameIdentifier	 inverted If Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
oldIfHandle	TokenNameIdentifier	 old If Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TargetLostException	TokenNameIdentifier	 Target Lost Exception
tle	TokenNameIdentifier	 tle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This can never happen - we updated the list of 	TokenNameCOMMENT_LINE	This can never happen - we updated the list of 
// instructions that target the deleted instruction 	TokenNameCOMMENT_LINE	instructions that target the deleted instruction 
// prior to deleting it. 	TokenNameCOMMENT_LINE	prior to deleting it. 
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
OUTLINE_ERR_DELETED_TARGET	TokenNameIdentifier	 OUTLINE  ERR  DELETED  TARGET
,	TokenNameCOMMA	
tle	TokenNameIdentifier	 tle
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InternalError	TokenNameIdentifier	 Internal Error
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Adjust the pointer in the InstructionList to point after 	TokenNameCOMMENT_LINE	Adjust the pointer in the InstructionList to point after 
// the newly inserted IF instruction 	TokenNameCOMMENT_LINE	the newly inserted IF instruction 
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
gotoHandle	TokenNameIdentifier	 goto Handle
;	TokenNameSEMICOLON	
// Indicate that this method rewrote at least one IF 	TokenNameCOMMENT_LINE	Indicate that this method rewrote at least one IF 
ilChanged	TokenNameIdentifier	 il Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Did this method rewrite any IF instructions? 	TokenNameCOMMENT_LINE	Did this method rewrite any IF instructions? 
return	TokenNamereturn	
ilChanged	TokenNameIdentifier	 il Changed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
