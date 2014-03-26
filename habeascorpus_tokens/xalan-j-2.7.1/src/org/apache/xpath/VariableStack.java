/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: VariableStack.java 524812 2007-04-02 15:52:03Z zongaro $ */	TokenNameCOMMENT_BLOCK	 $Id: VariableStack.java 524812 2007-04-02 15:52:03Z zongaro $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * Defines a class to keep track of a stack for * template arguments and variables. * * <p>This has been changed from the previous incarnations of this * class to be fairly low level.</p> * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Defines a class to keep track of a stack for template arguments and variables. * <p>This has been changed from the previous incarnations of this class to be fairly low level.</p> @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
VariableStack	TokenNameIdentifier	 Variable Stack
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** * limitation for 1K */	TokenNameCOMMENT_JAVADOC	 limitation for 1K 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CLEARLIMITATION	TokenNameIdentifier	 CLEARLIMITATION
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructor for a variable stack. */	TokenNameCOMMENT_JAVADOC	 Constructor for a variable stack. 
public	TokenNamepublic	
VariableStack	TokenNameIdentifier	 Variable Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for a variable stack. * @param initStackSize The initial stack size. Must be at least one. The * stack can grow if needed. */	TokenNameCOMMENT_JAVADOC	 Constructor for a variable stack. @param initStackSize The initial stack size. Must be at least one. The stack can grow if needed. 
public	TokenNamepublic	
VariableStack	TokenNameIdentifier	 Variable Stack
(	TokenNameLPAREN	
int	TokenNameint	
initStackSize	TokenNameIdentifier	 init Stack Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Allow for twice as many variables as stack link entries 	TokenNameCOMMENT_LINE	Allow for twice as many variables as stack link entries 
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
initStackSize	TokenNameIdentifier	 init Stack Size
,	TokenNameCOMMA	
initStackSize	TokenNameIdentifier	 init Stack Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a clone of this variable stack. * * @return a clone of this variable stack. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Returns a clone of this variable stack. * @return a clone of this variable stack. * @throws CloneNotSupportedException 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
VariableStack	TokenNameIdentifier	 Variable Stack
vs	TokenNameIdentifier	 vs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
VariableStack	TokenNameIdentifier	 Variable Stack
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// I *think* I can get away with a shallow clone here? 	TokenNameCOMMENT_LINE	I *think* I can get away with a shallow clone here? 
vs	TokenNameIdentifier	 vs
.	TokenNameDOT	
_stackFrames	TokenNameIdentifier	 stack Frames
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
_stackFrames	TokenNameIdentifier	 stack Frames
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vs	TokenNameIdentifier	 vs
.	TokenNameDOT	
_links	TokenNameIdentifier	 links
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
_links	TokenNameIdentifier	 links
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
vs	TokenNameIdentifier	 vs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The stack frame where all variables and params will be kept. * @serial */	TokenNameCOMMENT_JAVADOC	 The stack frame where all variables and params will be kept. @serial 
XObject	TokenNameIdentifier	 X Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_stackFrames	TokenNameIdentifier	 stack Frames
;	TokenNameSEMICOLON	
/** * The top of the stack frame (<code>_stackFrames</code>). * @serial */	TokenNameCOMMENT_JAVADOC	 The top of the stack frame (<code>_stackFrames</code>). @serial 
int	TokenNameint	
_frameTop	TokenNameIdentifier	 frame Top
;	TokenNameSEMICOLON	
/** * The bottom index of the current frame (relative to <code>_stackFrames</code>). * @serial */	TokenNameCOMMENT_JAVADOC	 The bottom index of the current frame (relative to <code>_stackFrames</code>). @serial 
private	TokenNameprivate	
int	TokenNameint	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
;	TokenNameSEMICOLON	
/** * The stack of frame positions. I call 'em links because of distant * <a href="http://math.millikin.edu/mprogers/Courses/currentCourses/CS481-ComputerArchitecture/cs481.Motorola68000.html"> * Motorola 68000 assembler</a> memories. :-) * @serial */	TokenNameCOMMENT_JAVADOC	 The stack of frame positions. I call 'em links because of distant <a href="http://math.millikin.edu/mprogers/Courses/currentCourses/CS481-ComputerArchitecture/cs481.Motorola68000.html"> Motorola 68000 assembler</a> memories. :-) @serial 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_links	TokenNameIdentifier	 links
;	TokenNameSEMICOLON	
/** * The top of the links stack. */	TokenNameCOMMENT_JAVADOC	 The top of the links stack. 
int	TokenNameint	
_linksTop	TokenNameIdentifier	 links Top
;	TokenNameSEMICOLON	
/** * Get the element at the given index, regardless of stackframe. * * @param i index from zero. * * @return The item at the given index. */	TokenNameCOMMENT_JAVADOC	 Get the element at the given index, regardless of stackframe. * @param i index from zero. * @return The item at the given index. 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get size of the stack. * * @return the total size of the execution stack. */	TokenNameCOMMENT_JAVADOC	 Get size of the stack. * @return the total size of the execution stack. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_frameTop	TokenNameIdentifier	 frame Top
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the stack to a start position. */	TokenNameCOMMENT_JAVADOC	 Reset the stack to a start position. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the stack was previously allocated, assume that about the same 	TokenNameCOMMENT_LINE	If the stack was previously allocated, assume that about the same 
// amount of stack space will be needed again; otherwise, use a very 	TokenNameCOMMENT_LINE	amount of stack space will be needed again; otherwise, use a very 
// large stack size. 	TokenNameCOMMENT_LINE	large stack size. 
int	TokenNameint	
linksSize	TokenNameIdentifier	 links Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_links	TokenNameIdentifier	 links
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XPathContext	TokenNameIdentifier	 X Path Context
.	TokenNameDOT	
RECURSIONLIMIT	TokenNameIdentifier	 RECURSIONLIMIT
:	TokenNameCOLON	
_links	TokenNameIdentifier	 links
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
varArraySize	TokenNameIdentifier	 var Array Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_stackFrames	TokenNameIdentifier	 stack Frames
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XPathContext	TokenNameIdentifier	 X Path Context
.	TokenNameDOT	
RECURSIONLIMIT	TokenNameIdentifier	 RECURSIONLIMIT
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
_stackFrames	TokenNameIdentifier	 stack Frames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
linksSize	TokenNameIdentifier	 links Size
,	TokenNameCOMMA	
varArraySize	TokenNameIdentifier	 var Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the stack to a start position. * @param linksSize Initial stack size to use * @param varArraySize Initial variable array size to use */	TokenNameCOMMENT_JAVADOC	 Reset the stack to a start position. @param linksSize Initial stack size to use @param varArraySize Initial variable array size to use 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
int	TokenNameint	
linksSize	TokenNameIdentifier	 links Size
,	TokenNameCOMMA	
int	TokenNameint	
varArraySize	TokenNameIdentifier	 var Array Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_frameTop	TokenNameIdentifier	 frame Top
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_linksTop	TokenNameIdentifier	 links Top
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Don't bother reallocating _links array if it exists already 	TokenNameCOMMENT_LINE	Don't bother reallocating _links array if it exists already 
if	TokenNameif	
(	TokenNameLPAREN	
_links	TokenNameIdentifier	 links
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_links	TokenNameIdentifier	 links
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
linksSize	TokenNameIdentifier	 links Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Adding one here to the stack of frame positions will allow us always 	TokenNameCOMMENT_LINE	Adding one here to the stack of frame positions will allow us always 
// to look one under without having to check if we're at zero. 	TokenNameCOMMENT_LINE	to look one under without having to check if we're at zero. 
// (As long as the caller doesn't screw up link/unlink.) 	TokenNameCOMMENT_LINE	(As long as the caller doesn't screw up link/unlink.) 
_links	TokenNameIdentifier	 links
[	TokenNameLBRACKET	
_linksTop	TokenNameIdentifier	 links Top
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Get a clean _stackFrames array and discard the old one. 	TokenNameCOMMENT_LINE	Get a clean _stackFrames array and discard the old one. 
_stackFrames	TokenNameIdentifier	 stack Frames
=	TokenNameEQUAL	
new	TokenNamenew	
XObject	TokenNameIdentifier	 X Object
[	TokenNameLBRACKET	
varArraySize	TokenNameIdentifier	 var Array Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current stack frame. * * @param sf The new stack frame position. */	TokenNameCOMMENT_JAVADOC	 Set the current stack frame. * @param sf The new stack frame position. 
public	TokenNamepublic	
void	TokenNamevoid	
setStackFrame	TokenNameIdentifier	 set Stack Frame
(	TokenNameLPAREN	
int	TokenNameint	
sf	TokenNameIdentifier	 sf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
=	TokenNameEQUAL	
sf	TokenNameIdentifier	 sf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the position from where the search should start, * which is either the searchStart property, or the top * of the stack if that value is -1. * * @return The current stack frame position. */	TokenNameCOMMENT_JAVADOC	 Get the position from where the search should start, which is either the searchStart property, or the top of the stack if that value is -1. * @return The current stack frame position. 
public	TokenNamepublic	
int	TokenNameint	
getStackFrame	TokenNameIdentifier	 get Stack Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allocates memory (called a stackframe) on the stack; used to store * local variables and parameter arguments. * * <p>I use the link/unlink concept because of distant * <a href="http://math.millikin.edu/mprogers/Courses/currentCourses/CS481-ComputerArchitecture/cs481.Motorola68000.html"> * Motorola 68000 assembler</a> memories.</p> * * @param size The size of the stack frame allocation. This ammount should * normally be the maximum number of variables that you can have allocated * at one time in the new stack frame. * * @return The bottom of the stack frame, from where local variable addressing * should start from. */	TokenNameCOMMENT_JAVADOC	 Allocates memory (called a stackframe) on the stack; used to store local variables and parameter arguments. * <p>I use the link/unlink concept because of distant <a href="http://math.millikin.edu/mprogers/Courses/currentCourses/CS481-ComputerArchitecture/cs481.Motorola68000.html"> Motorola 68000 assembler</a> memories.</p> * @param size The size of the stack frame allocation. This ammount should normally be the maximum number of variables that you can have allocated at one time in the new stack frame. * @return The bottom of the stack frame, from where local variable addressing should start from. 
public	TokenNamepublic	
int	TokenNameint	
link	TokenNameIdentifier	 link
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
=	TokenNameEQUAL	
_frameTop	TokenNameIdentifier	 frame Top
;	TokenNameSEMICOLON	
_frameTop	TokenNameIdentifier	 frame Top
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_frameTop	TokenNameIdentifier	 frame Top
>=	TokenNameGREATER_EQUAL	
_stackFrames	TokenNameIdentifier	 stack Frames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
newsf	TokenNameIdentifier	 newsf
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XObject	TokenNameIdentifier	 X Object
[	TokenNameLBRACKET	
_stackFrames	TokenNameIdentifier	 stack Frames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
XPathContext	TokenNameIdentifier	 X Path Context
.	TokenNameDOT	
RECURSIONLIMIT	TokenNameIdentifier	 RECURSIONLIMIT
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
_stackFrames	TokenNameIdentifier	 stack Frames
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newsf	TokenNameIdentifier	 newsf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
_stackFrames	TokenNameIdentifier	 stack Frames
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_stackFrames	TokenNameIdentifier	 stack Frames
=	TokenNameEQUAL	
newsf	TokenNameIdentifier	 newsf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_linksTop	TokenNameIdentifier	 links Top
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
_links	TokenNameIdentifier	 links
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newlinks	TokenNameIdentifier	 newlinks
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
_links	TokenNameIdentifier	 links
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
(	TokenNameLPAREN	
CLEARLIMITATION	TokenNameIdentifier	 CLEARLIMITATION
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
_links	TokenNameIdentifier	 links
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newlinks	TokenNameIdentifier	 newlinks
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
_links	TokenNameIdentifier	 links
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_links	TokenNameIdentifier	 links
=	TokenNameEQUAL	
newlinks	TokenNameIdentifier	 newlinks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_links	TokenNameIdentifier	 links
[	TokenNameLBRACKET	
_linksTop	TokenNameIdentifier	 links Top
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Free up the stack frame that was last allocated with * {@link #link(int size)}. */	TokenNameCOMMENT_JAVADOC	 Free up the stack frame that was last allocated with {@link #link(int size)}. 
public	TokenNamepublic	
void	TokenNamevoid	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_frameTop	TokenNameIdentifier	 frame Top
=	TokenNameEQUAL	
_links	TokenNameIdentifier	 links
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
_linksTop	TokenNameIdentifier	 links Top
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
=	TokenNameEQUAL	
_links	TokenNameIdentifier	 links
[	TokenNameLBRACKET	
_linksTop	TokenNameIdentifier	 links Top
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Free up the stack frame that was last allocated with * {@link #link(int size)}. * @param currentFrame The current frame to set to * after the unlink. */	TokenNameCOMMENT_JAVADOC	 Free up the stack frame that was last allocated with {@link #link(int size)}. @param currentFrame The current frame to set to after the unlink. 
public	TokenNamepublic	
void	TokenNamevoid	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
int	TokenNameint	
currentFrame	TokenNameIdentifier	 current Frame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_frameTop	TokenNameIdentifier	 frame Top
=	TokenNameEQUAL	
_links	TokenNameIdentifier	 links
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
_linksTop	TokenNameIdentifier	 links Top
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
=	TokenNameEQUAL	
currentFrame	TokenNameIdentifier	 current Frame
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a local variable or parameter in the current stack frame. * * * @param index Local variable index relative to the current stack * frame bottom. * * @param val The value of the variable that is being set. */	TokenNameCOMMENT_JAVADOC	 Set a local variable or parameter in the current stack frame. * @param index Local variable index relative to the current stack frame bottom. * @param val The value of the variable that is being set. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalVariable	TokenNameIdentifier	 set Local Variable
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a local variable or parameter in the specified stack frame. * * * @param index Local variable index relative to the current stack * frame bottom. * NEEDSDOC @param stackFrame * * @param val The value of the variable that is being set. */	TokenNameCOMMENT_JAVADOC	 Set a local variable or parameter in the specified stack frame. * @param index Local variable index relative to the current stack frame bottom. NEEDSDOC @param stackFrame * @param val The value of the variable that is being set. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalVariable	TokenNameIdentifier	 set Local Variable
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
int	TokenNameint	
stackFrame	TokenNameIdentifier	 stack Frame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
stackFrame	TokenNameIdentifier	 stack Frame
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a local variable or parameter in the current stack frame. * * * @param xctxt The XPath context, which must be passed in order to * lazy evaluate variables. * * @param index Local variable index relative to the current stack * frame bottom. * * @return The value of the variable. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Get a local variable or parameter in the current stack frame. * @param xctxt The XPath context, which must be passed in order to lazy evaluate variables. * @param index Local variable index relative to the current stack frame bottom. * @return The value of the variable. * @throws TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getLocalVariable	TokenNameIdentifier	 get Local Variable
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_VARIABLE_ACCESSED_BEFORE_BIND	TokenNameIdentifier	 ER  VARIABLE  ACCESSED  BEFORE  BIND
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Variable accessed before it is bound!", xctxt.getSAXLocator()); 	TokenNameCOMMENT_LINE	"Variable accessed before it is bound!", xctxt.getSAXLocator()); 
// Lazy execution of variables. 	TokenNameCOMMENT_LINE	Lazy execution of variables. 
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_UNRESOLVEDVARIABLE	TokenNameIdentifier	 CLASS  UNRESOLVEDVARIABLE
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a local variable or parameter in the current stack frame. * * * @param index Local variable index relative to the given * frame bottom. * NEEDSDOC @param frame * * @return The value of the variable. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Get a local variable or parameter in the current stack frame. * @param index Local variable index relative to the given frame bottom. NEEDSDOC @param frame * @return The value of the variable. * @throws TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getLocalVariable	TokenNameIdentifier	 get Local Variable
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
int	TokenNameint	
frame	TokenNameIdentifier	 frame
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a local variable or parameter in the current stack frame. * * * @param xctxt The XPath context, which must be passed in order to * lazy evaluate variables. * * @param index Local variable index relative to the current stack * frame bottom. * * @return The value of the variable. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Get a local variable or parameter in the current stack frame. * @param xctxt The XPath context, which must be passed in order to lazy evaluate variables. * @param index Local variable index relative to the current stack frame bottom. * @return The value of the variable. * @throws TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getLocalVariable	TokenNameIdentifier	 get Local Variable
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
destructiveOK	TokenNameIdentifier	 destructive OK
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
+=	TokenNamePLUS_EQUAL	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_VARIABLE_ACCESSED_BEFORE_BIND	TokenNameIdentifier	 ER  VARIABLE  ACCESSED  BEFORE  BIND
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Variable accessed before it is bound!", xctxt.getSAXLocator()); 	TokenNameCOMMENT_LINE	"Variable accessed before it is bound!", xctxt.getSAXLocator()); 
// Lazy execution of variables. 	TokenNameCOMMENT_LINE	Lazy execution of variables. 
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_UNRESOLVEDVARIABLE	TokenNameIdentifier	 CLASS  UNRESOLVEDVARIABLE
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
destructiveOK	TokenNameIdentifier	 destructive OK
?	TokenNameQUESTION	
val	TokenNameIdentifier	 val
:	TokenNameCOLON	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
getFresh	TokenNameIdentifier	 get Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if a local variable has been set or not. * * @param index Local variable index relative to the current stack * frame bottom. * * @return true if the value at the index is not null. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Tell if a local variable has been set or not. * @param index Local variable index relative to the current stack frame bottom. * @return true if the value at the index is not null. * @throws TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLocalSet	TokenNameIdentifier	 is Local Set
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** NEEDSDOC Field m_nulls */	TokenNameCOMMENT_JAVADOC	 NEEDSDOC Field m_nulls 
private	TokenNameprivate	
static	TokenNamestatic	
XObject	TokenNameIdentifier	 X Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_nulls	TokenNameIdentifier	 m nulls
=	TokenNameEQUAL	
new	TokenNamenew	
XObject	TokenNameIdentifier	 X Object
[	TokenNameLBRACKET	
CLEARLIMITATION	TokenNameIdentifier	 CLEARLIMITATION
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Use this to clear the variables in a section of the stack. This is * used to clear the parameter section of the stack, so that default param * values can tell if they've already been set. It is important to note that * this function has a 1K limitation. * * @param start The start position, relative to the current local stack frame. * @param len The number of slots to be cleared. */	TokenNameCOMMENT_JAVADOC	 Use this to clear the variables in a section of the stack. This is used to clear the parameter section of the stack, so that default param values can tell if they've already been set. It is important to note that this function has a 1K limitation. * @param start The start position, relative to the current local stack frame. @param len The number of slots to be cleared. 
public	TokenNamepublic	
void	TokenNamevoid	
clearLocalSlots	TokenNameIdentifier	 clear Local Slots
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
+=	TokenNamePLUS_EQUAL	
_currentFrameBottom	TokenNameIdentifier	 current Frame Bottom
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_nulls	TokenNameIdentifier	 m nulls
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
_stackFrames	TokenNameIdentifier	 stack Frames
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a global variable or parameter in the global stack frame. * * * @param index Local variable index relative to the global stack frame * bottom. * * @param val The value of the variable that is being set. */	TokenNameCOMMENT_JAVADOC	 Set a global variable or parameter in the global stack frame. * @param index Local variable index relative to the global stack frame bottom. * @param val The value of the variable that is being set. 
public	TokenNamepublic	
void	TokenNamevoid	
setGlobalVariable	TokenNameIdentifier	 set Global Variable
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
final	TokenNamefinal	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a global variable or parameter from the global stack frame. * * * @param xctxt The XPath context, which must be passed in order to * lazy evaluate variables. * * @param index Global variable index relative to the global stack * frame bottom. * * @return The value of the variable. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Get a global variable or parameter from the global stack frame. * @param xctxt The XPath context, which must be passed in order to lazy evaluate variables. * @param index Global variable index relative to the global stack frame bottom. * @return The value of the variable. * @throws TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getGlobalVariable	TokenNameIdentifier	 get Global Variable
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Lazy execution of variables. 	TokenNameCOMMENT_LINE	Lazy execution of variables. 
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_UNRESOLVEDVARIABLE	TokenNameIdentifier	 CLASS  UNRESOLVEDVARIABLE
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a global variable or parameter from the global stack frame. * * * @param xctxt The XPath context, which must be passed in order to * lazy evaluate variables. * * @param index Global variable index relative to the global stack * frame bottom. * * @return The value of the variable. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Get a global variable or parameter from the global stack frame. * @param xctxt The XPath context, which must be passed in order to lazy evaluate variables. * @param index Global variable index relative to the global stack frame bottom. * @return The value of the variable. * @throws TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getGlobalVariable	TokenNameIdentifier	 get Global Variable
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
boolean	TokenNameboolean	
destructiveOK	TokenNameIdentifier	 destructive OK
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Lazy execution of variables. 	TokenNameCOMMENT_LINE	Lazy execution of variables. 
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_UNRESOLVEDVARIABLE	TokenNameIdentifier	 CLASS  UNRESOLVEDVARIABLE
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
_stackFrames	TokenNameIdentifier	 stack Frames
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
destructiveOK	TokenNameIdentifier	 destructive OK
?	TokenNameQUESTION	
val	TokenNameIdentifier	 val
:	TokenNameCOLON	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
getFresh	TokenNameIdentifier	 get Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a variable based on it's qualified name. * This is for external use only. * * @param xctxt The XPath context, which must be passed in order to * lazy evaluate variables. * * @param qname The qualified name of the variable. * * @return The evaluated value of the variable. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Get a variable based on it's qualified name. This is for external use only. * @param xctxt The XPath context, which must be passed in order to lazy evaluate variables. * @param qname The qualified name of the variable. * @return The evaluated value of the variable. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
prefixResolver	TokenNameIdentifier	 prefix Resolver
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the current ElemTemplateElement, which must be pushed in as the 	TokenNameCOMMENT_LINE	Get the current ElemTemplateElement, which must be pushed in as the 
// prefix resolver, and then walk backwards in document order, searching 	TokenNameCOMMENT_LINE	prefix resolver, and then walk backwards in document order, searching 
// for an xsl:param element or xsl:variable element that matches our 	TokenNameCOMMENT_LINE	for an xsl:param element or xsl:variable element that matches our 
// qname. If we reach the top level, use the StylesheetRoot's composed 	TokenNameCOMMENT_LINE	qname. If we reach the top level, use the StylesheetRoot's composed 
// list of top level variables and parameters. 	TokenNameCOMMENT_LINE	list of top level variables and parameters. 
if	TokenNameif	
(	TokenNameLPAREN	
prefixResolver	TokenNameIdentifier	 prefix Resolver
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemVariable	TokenNameIdentifier	 Elem Variable
vvar	TokenNameIdentifier	 vvar
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
prefixResolver	TokenNameIdentifier	 prefix Resolver
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
savedprev	TokenNameIdentifier	 savedprev
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getPreviousSiblingElem	TokenNameIdentifier	 get Previous Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
instanceof	TokenNameinstanceof	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vvar	TokenNameIdentifier	 vvar
=	TokenNameEQUAL	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
vvar	TokenNameIdentifier	 vvar
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
getLocalVariable	TokenNameIdentifier	 get Local Variable
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
vvar	TokenNameIdentifier	 vvar
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
savedprev	TokenNameIdentifier	 savedprev
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
vvar	TokenNameIdentifier	 vvar
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getVariableOrParamComposed	TokenNameIdentifier	 get Variable Or Param Composed
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
vvar	TokenNameIdentifier	 vvar
)	TokenNameRPAREN	
return	TokenNamereturn	
getGlobalVariable	TokenNameIdentifier	 get Global Variable
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
vvar	TokenNameIdentifier	 vvar
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_VAR_NOT_RESOLVABLE	TokenNameIdentifier	 ER  VAR  NOT  RESOLVABLE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Variable not resolvable: " + qname); 	TokenNameCOMMENT_LINE	"Variable not resolvable: " + qname); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end VariableStack 	TokenNameCOMMENT_LINE	end VariableStack 
