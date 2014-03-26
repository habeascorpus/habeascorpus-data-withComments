/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FlowList.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FlowList.java 468650 2006-10-28 07:03:30Z minchau $ 
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
Vector	TokenNameIdentifier	 Vector
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
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FlowList	TokenNameIdentifier	 Flow List
{	TokenNameLBRACE	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
_elements	TokenNameIdentifier	 elements
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FlowList	TokenNameIdentifier	 Flow List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FlowList	TokenNameIdentifier	 Flow List
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
bh	TokenNameIdentifier	 bh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
bh	TokenNameIdentifier	 bh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FlowList	TokenNameIdentifier	 Flow List
(	TokenNameLPAREN	
FlowList	TokenNameIdentifier	 Flow List
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
_elements	TokenNameIdentifier	 elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FlowList	TokenNameIdentifier	 Flow List
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
bh	TokenNameIdentifier	 bh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_elements	TokenNameIdentifier	 elements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
bh	TokenNameIdentifier	 bh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FlowList	TokenNameIdentifier	 Flow List
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
FlowList	TokenNameIdentifier	 Flow List
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_elements	TokenNameIdentifier	 elements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
_elements	TokenNameIdentifier	 elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
_elements	TokenNameIdentifier	 elements
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Back patch a flow list. All instruction handles must be branch handles. */	TokenNameCOMMENT_JAVADOC	 Back patch a flow list. All instruction handles must be branch handles. 
public	TokenNamepublic	
void	TokenNamevoid	
backPatch	TokenNameIdentifier	 back Patch
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_elements	TokenNameIdentifier	 elements
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
_elements	TokenNameIdentifier	 elements
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BranchHandle	TokenNameIdentifier	 Branch Handle
bh	TokenNameIdentifier	 bh
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BranchHandle	TokenNameIdentifier	 Branch Handle
)	TokenNameRPAREN	
_elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bh	TokenNameIdentifier	 bh
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// avoid backpatching more than once 	TokenNameCOMMENT_LINE	avoid backpatching more than once 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Redirect the handles from oldList to newList. "This" flow list * is assumed to be relative to oldList. */	TokenNameCOMMENT_JAVADOC	 Redirect the handles from oldList to newList. "This" flow list is assumed to be relative to oldList. 
public	TokenNamepublic	
FlowList	TokenNameIdentifier	 Flow List
copyAndRedirect	TokenNameIdentifier	 copy And Redirect
(	TokenNameLPAREN	
InstructionList	TokenNameIdentifier	 Instruction List
oldList	TokenNameIdentifier	 old List
,	TokenNameCOMMA	
InstructionList	TokenNameIdentifier	 Instruction List
newList	TokenNameIdentifier	 new List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FlowList	TokenNameIdentifier	 Flow List
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
FlowList	TokenNameIdentifier	 Flow List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_elements	TokenNameIdentifier	 elements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
_elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
oldIter	TokenNameIdentifier	 old Iter
=	TokenNameEQUAL	
oldList	TokenNameIdentifier	 old List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
newIter	TokenNameIdentifier	 new Iter
=	TokenNameEQUAL	
newList	TokenNameIdentifier	 new List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
oldIter	TokenNameIdentifier	 old Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
oldIh	TokenNameIdentifier	 old Ih
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
oldIter	TokenNameIdentifier	 old Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
newIh	TokenNameIdentifier	 new Ih
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
newIter	TokenNameIdentifier	 new Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_elements	TokenNameIdentifier	 elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
oldIh	TokenNameIdentifier	 old Ih
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newIh	TokenNameIdentifier	 new Ih
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
