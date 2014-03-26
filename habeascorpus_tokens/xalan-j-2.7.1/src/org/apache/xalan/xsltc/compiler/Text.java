/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Text.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Text.java 468650 2006-10-28 07:03:30Z minchau $ 
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
GETSTATIC	TokenNameIdentifier	 GETSTATIC
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
PUSH	TokenNameIdentifier	 PUSH
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ClassGenerator	TokenNameIdentifier	 Class Generator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MethodGenerator	TokenNameIdentifier	 Method Generator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Util	TokenNameIdentifier	 Util
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
final	TokenNamefinal	
class	TokenNameclass	
Text	TokenNameIdentifier	 Text
extends	TokenNameextends	
Instruction	TokenNameIdentifier	 Instruction
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_escaping	TokenNameIdentifier	 escaping
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_textElement	TokenNameIdentifier	 text Element
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Create a blank Text syntax tree node. */	TokenNameCOMMENT_JAVADOC	 Create a blank Text syntax tree node. 
public	TokenNamepublic	
Text	TokenNameIdentifier	 Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_textElement	TokenNameIdentifier	 text Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create text syntax tree node. * @param text is the text to put in the node. */	TokenNameCOMMENT_JAVADOC	 Create text syntax tree node. @param text is the text to put in the node. 
public	TokenNamepublic	
Text	TokenNameIdentifier	 Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the text wrapped inside this node * @return The text wrapped inside this node */	TokenNameCOMMENT_JAVADOC	 Returns the text wrapped inside this node @return The text wrapped inside this node 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the text for this node. Appends the given text to any already * existing text (using string concatenation, so use only when needed). * @param text is the text to wrap inside this node. */	TokenNameCOMMENT_JAVADOC	 Set the text for this node. Appends the given text to any already existing text (using string concatenation, so use only when needed). @param text is the text to wrap inside this node. 
protected	TokenNameprotected	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
else	TokenNameelse	
_text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
_text	TokenNameIdentifier	 text
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
display	TokenNameIdentifier	 display
(	TokenNameLPAREN	
int	TokenNameint	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Text"	TokenNameStringLiteral	Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
IndentIncrement	TokenNameIdentifier	 Indent Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
parseContents	TokenNameIdentifier	 parse Contents
(	TokenNameLPAREN	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"disable-output-escaping"	TokenNameStringLiteral	disable-output-escaping
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_escaping	TokenNameIdentifier	 escaping
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
parseChildren	TokenNameIdentifier	 parse Children
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_textElement	TokenNameIdentifier	 text Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_textElement	TokenNameIdentifier	 text Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
LiteralElement	TokenNameIdentifier	 Literal Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LiteralElement	TokenNameIdentifier	 Literal Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LiteralElement	TokenNameIdentifier	 Literal Element
)	TokenNameRPAREN	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
space	TokenNameIdentifier	 space
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
"xml:space"	TokenNameStringLiteral	xml:space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
space	TokenNameIdentifier	 space
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
space	TokenNameIdentifier	 space
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"preserve"	TokenNameStringLiteral	preserve
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
textLength	TokenNameIdentifier	 text Length
=	TokenNameEQUAL	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
textLength	TokenNameIdentifier	 text Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
textLength	TokenNameIdentifier	 text Length
)	TokenNameRPAREN	
_ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
textLength	TokenNameIdentifier	 text Length
=	TokenNameEQUAL	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
textLength	TokenNameIdentifier	 text Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
textLength	TokenNameIdentifier	 text Length
)	TokenNameRPAREN	
_ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ignore	TokenNameIdentifier	 ignore
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isIgnore	TokenNameIdentifier	 is Ignore
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_ignore	TokenNameIdentifier	 ignore
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isTextElement	TokenNameIdentifier	 is Text Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_textElement	TokenNameIdentifier	 text Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
contextDependent	TokenNameIdentifier	 context Dependent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x20	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x09	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x0A	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x0D	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
cpg	TokenNameIdentifier	 cpg
=	TokenNameEQUAL	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getConstantPool	TokenNameIdentifier	 get Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Turn off character escaping if so is wanted. 	TokenNameCOMMENT_LINE	Turn off character escaping if so is wanted. 
final	TokenNamefinal	
int	TokenNameint	
esc	TokenNameIdentifier	 esc
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
OUTPUT_HANDLER	TokenNameIdentifier	 OUTPUT  HANDLER
,	TokenNameCOMMA	
"setEscaping"	TokenNameStringLiteral	setEscaping
,	TokenNameCOMMA	
"(Z)Z"	TokenNameStringLiteral	(Z)Z
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_escaping	TokenNameIdentifier	 escaping
)	TokenNameRPAREN	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadHandler	TokenNameIdentifier	 load Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUSH	TokenNameIdentifier	 PUSH
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
esc	TokenNameIdentifier	 esc
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadHandler	TokenNameIdentifier	 load Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Call characters(String) or characters(char[],int,int), as 	TokenNameCOMMENT_LINE	Call characters(String) or characters(char[],int,int), as 
// appropriate. 	TokenNameCOMMENT_LINE	appropriate. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
canLoadAsArrayOffsetLength	TokenNameIdentifier	 can Load As Array Offset Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
characters	TokenNameIdentifier	 characters
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
OUTPUT_HANDLER	TokenNameIdentifier	 OUTPUT  HANDLER
,	TokenNameCOMMA	
"characters"	TokenNameStringLiteral	characters
,	TokenNameCOMMA	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
+	TokenNamePLUS	
")V"	TokenNameStringLiteral	)V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUSH	TokenNameIdentifier	 PUSH
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
,	TokenNameCOMMA	
_text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
characters	TokenNameIdentifier	 characters
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
characters	TokenNameIdentifier	 characters
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
OUTPUT_HANDLER	TokenNameIdentifier	 OUTPUT  HANDLER
,	TokenNameCOMMA	
"characters"	TokenNameStringLiteral	characters
,	TokenNameCOMMA	
"([CII)V"	TokenNameStringLiteral	([CII)V
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loadAsArrayOffsetLength	TokenNameIdentifier	 load As Array Offset Length
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
characters	TokenNameIdentifier	 characters
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Restore character escaping setting to whatever it was. 	TokenNameCOMMENT_LINE	Restore character escaping setting to whatever it was. 
// Note: setEscaping(bool) returns the original (old) value 	TokenNameCOMMENT_LINE	Note: setEscaping(bool) returns the original (old) value 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_escaping	TokenNameIdentifier	 escaping
)	TokenNameRPAREN	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadHandler	TokenNameIdentifier	 load Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SWAP	TokenNameIdentifier	 SWAP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
esc	TokenNameIdentifier	 esc
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
POP	TokenNameIdentifier	 POP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
translateContents	TokenNameIdentifier	 translate Contents
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check whether this Text node can be stored in a char[] in the translet. * Calling this is precondition to calling loadAsArrayOffsetLength. * @see #loadAsArrayOffsetLength(ClassGenerator,MethodGenerator) * @return true if this Text node can be */	TokenNameCOMMENT_JAVADOC	 Check whether this Text node can be stored in a char[] in the translet. Calling this is precondition to calling loadAsArrayOffsetLength. @see #loadAsArrayOffsetLength(ClassGenerator,MethodGenerator) @return true if this Text node can be 
public	TokenNamepublic	
boolean	TokenNameboolean	
canLoadAsArrayOffsetLength	TokenNameIdentifier	 can Load As Array Offset Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Magic number! 21845*3 == 65535. BCEL uses a DataOutputStream to 	TokenNameCOMMENT_LINE	Magic number! 21845*3 == 65535. BCEL uses a DataOutputStream to 
// serialize class files. The Java run-time places a limit on the size 	TokenNameCOMMENT_LINE	serialize class files. The Java run-time places a limit on the size 
// of String data written using a DataOutputStream - it cannot require 	TokenNameCOMMENT_LINE	of String data written using a DataOutputStream - it cannot require 
// more than 64KB when represented as UTF-8. The number of bytes 	TokenNameCOMMENT_LINE	more than 64KB when represented as UTF-8. The number of bytes 
// required to represent a Java string as UTF-8 cannot be greater 	TokenNameCOMMENT_LINE	required to represent a Java string as UTF-8 cannot be greater 
// than three times the number of char's in the string, hence the 	TokenNameCOMMENT_LINE	than three times the number of char's in the string, hence the 
// check for 21845. 	TokenNameCOMMENT_LINE	check for 21845. 
return	TokenNamereturn	
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
21845	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generates code that loads the array that will contain the character * data represented by this Text node, followed by the offset of the * data from the start of the array, and then the length of the data. * * The pre-condition to calling this method is that * canLoadAsArrayOffsetLength() returns true. * @see #canLoadArrayOffsetLength() */	TokenNameCOMMENT_JAVADOC	 Generates code that loads the array that will contain the character data represented by this Text node, followed by the offset of the data from the start of the array, and then the length of the data. * The pre-condition to calling this method is that canLoadAsArrayOffsetLength() returns true. @see #canLoadArrayOffsetLength() 
public	TokenNamepublic	
void	TokenNamevoid	
loadAsArrayOffsetLength	TokenNameIdentifier	 load As Array Offset Length
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
cpg	TokenNameIdentifier	 cpg
=	TokenNameEQUAL	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getConstantPool	TokenNameIdentifier	 get Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
getInstructionList	TokenNameIdentifier	 get Instruction List
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
// The XSLTC object keeps track of character data 	TokenNameCOMMENT_LINE	The XSLTC object keeps track of character data 
// that is to be stored in char arrays. 	TokenNameCOMMENT_LINE	that is to be stored in char arrays. 
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
addCharacterData	TokenNameIdentifier	 add Character Data
(	TokenNameLPAREN	
_text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
charDataFieldName	TokenNameIdentifier	 char Data Field Name
=	TokenNameEQUAL	
STATIC_CHAR_DATA_FIELD	TokenNameIdentifier	 STATIC  CHAR  DATA  FIELD
+	TokenNamePLUS	
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getCharacterDataCount	TokenNameIdentifier	 get Character Data Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
GETSTATIC	TokenNameIdentifier	 GETSTATIC
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addFieldref	TokenNameIdentifier	 add Fieldref
(	TokenNameLPAREN	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
charDataFieldName	TokenNameIdentifier	 char Data Field Name
,	TokenNameCOMMA	
STATIC_CHAR_DATA_FIELD_SIG	TokenNameIdentifier	 STATIC  CHAR  DATA  FIELD  SIG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUSH	TokenNameIdentifier	 PUSH
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUSH	TokenNameIdentifier	 PUSH
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
,	TokenNameCOMMA	
_text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
