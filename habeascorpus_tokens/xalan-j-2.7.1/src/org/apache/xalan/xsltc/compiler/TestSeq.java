/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TestSeq.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TestSeq.java 468650 2006-10-28 07:03:30Z minchau $ 
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
Dictionary	TokenNameIdentifier	 Dictionary
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
GOTO_W	TokenNameIdentifier	 GOTO  W
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
/** * A test sequence is a sequence of patterns that * * (1) occured in templates in the same mode * (2) share the same kernel node type (e.g. A/B and C/C/B) * (3) may also contain patterns matching "*" and "node()" * (element sequence only) or matching "@*" (attribute * sequence only). * * A test sequence may have a default template, which will be * instantiated if none of the other patterns match. * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Erwin Bolwidt <ejb@klomp.org> * @author Morten Jorgensen <morten.jorgensen@sun.com> */	TokenNameCOMMENT_JAVADOC	 A test sequence is a sequence of patterns that * (1) occured in templates in the same mode (2) share the same kernel node type (e.g. A/B and C/C/B) (3) may also contain patterns matching "*" and "node()" (element sequence only) or matching "@*" (attribute sequence only). * A test sequence may have a default template, which will be instantiated if none of the other patterns match. @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Erwin Bolwidt <ejb@klomp.org> @author Morten Jorgensen <morten.jorgensen@sun.com> 
final	TokenNamefinal	
class	TokenNameclass	
TestSeq	TokenNameIdentifier	 Test Seq
{	TokenNameLBRACE	
/** * Integer code for the kernel type of this test sequence */	TokenNameCOMMENT_JAVADOC	 Integer code for the kernel type of this test sequence 
private	TokenNameprivate	
int	TokenNameint	
_kernelType	TokenNameIdentifier	 kernel Type
;	TokenNameSEMICOLON	
/** * Vector of all patterns in the test sequence. May include * patterns with "*", "@*" or "node()" kernel. */	TokenNameCOMMENT_JAVADOC	 Vector of all patterns in the test sequence. May include patterns with "*", "@*" or "node()" kernel. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
_patterns	TokenNameIdentifier	 patterns
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * A reference to the Mode object. */	TokenNameCOMMENT_JAVADOC	 A reference to the Mode object. 
private	TokenNameprivate	
Mode	TokenNameIdentifier	 Mode
_mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Default template for this test sequence */	TokenNameCOMMENT_JAVADOC	 Default template for this test sequence 
private	TokenNameprivate	
Template	TokenNameIdentifier	 Template
_default	TokenNameIdentifier	 default
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Instruction list representing this test sequence. */	TokenNameCOMMENT_JAVADOC	 Instruction list representing this test sequence. 
private	TokenNameprivate	
InstructionList	TokenNameIdentifier	 Instruction List
_instructionList	TokenNameIdentifier	 instruction List
;	TokenNameSEMICOLON	
/** * Cached handle to avoid compiling more than once. */	TokenNameCOMMENT_JAVADOC	 Cached handle to avoid compiling more than once. 
private	TokenNameprivate	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
_start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Creates a new test sequence given a set of patterns and a mode. */	TokenNameCOMMENT_JAVADOC	 Creates a new test sequence given a set of patterns and a mode. 
public	TokenNamepublic	
TestSeq	TokenNameIdentifier	 Test Seq
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
patterns	TokenNameIdentifier	 patterns
,	TokenNameCOMMA	
Mode	TokenNameIdentifier	 Mode
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
patterns	TokenNameIdentifier	 patterns
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TestSeq	TokenNameIdentifier	 Test Seq
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
patterns	TokenNameIdentifier	 patterns
,	TokenNameCOMMA	
int	TokenNameint	
kernelType	TokenNameIdentifier	 kernel Type
,	TokenNameCOMMA	
Mode	TokenNameIdentifier	 Mode
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_patterns	TokenNameIdentifier	 patterns
=	TokenNameEQUAL	
patterns	TokenNameIdentifier	 patterns
;	TokenNameSEMICOLON	
_kernelType	TokenNameIdentifier	 kernel Type
=	TokenNameEQUAL	
kernelType	TokenNameIdentifier	 kernel Type
;	TokenNameSEMICOLON	
_mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of this test sequence. Notice * that test sequences are mutable, so the value returned by this * method is different before and after calling reduce(). */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this test sequence. Notice that test sequences are mutable, so the value returned by this method is different before and after calling reduce(). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
)	TokenNameRPAREN	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Testseq for kernel "	TokenNameStringLiteral	Testseq for kernel 
+	TokenNamePLUS	
_kernelType	TokenNameIdentifier	 kernel Type
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" pattern "	TokenNameStringLiteral	 pattern 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the instruction list for this test sequence */	TokenNameCOMMENT_JAVADOC	 Returns the instruction list for this test sequence 
public	TokenNamepublic	
InstructionList	TokenNameIdentifier	 Instruction List
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_instructionList	TokenNameIdentifier	 instruction List
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the highest priority for a pattern in this test * sequence. This is either the priority of the first or * of the default pattern. */	TokenNameCOMMENT_JAVADOC	 Return the highest priority for a pattern in this test sequence. This is either the priority of the first or of the default pattern. 
public	TokenNamepublic	
double	TokenNamedouble	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Template	TokenNameIdentifier	 Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_default	TokenNameIdentifier	 default
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Pattern	TokenNameIdentifier	 Pattern
)	TokenNameRPAREN	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of the highest priority pattern in * this test sequence. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the highest priority pattern in this test sequence. 
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Template	TokenNameIdentifier	 Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_default	TokenNameIdentifier	 default
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Pattern	TokenNameIdentifier	 Pattern
)	TokenNameRPAREN	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reduce the patterns in this test sequence. Creates a new * vector of patterns and sets the default pattern if it * finds a patterns that is fully reduced. */	TokenNameCOMMENT_JAVADOC	 Reduce the patterns in this test sequence. Creates a new vector of patterns and sets the default pattern if it finds a patterns that is fully reduced. 
public	TokenNamepublic	
void	TokenNamevoid	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
newPatterns	TokenNameIdentifier	 new Patterns
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
_patterns	TokenNameIdentifier	 patterns
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
)	TokenNameRPAREN	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reduce this pattern 	TokenNameCOMMENT_LINE	Reduce this pattern 
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
reduceKernelPattern	TokenNameIdentifier	 reduce Kernel Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Is this pattern fully reduced? 	TokenNameCOMMENT_LINE	Is this pattern fully reduced? 
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
isWildcard	TokenNameIdentifier	 is Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_default	TokenNameIdentifier	 default
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// Ignore following patterns 	TokenNameCOMMENT_LINE	Ignore following patterns 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newPatterns	TokenNameIdentifier	 new Patterns
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_patterns	TokenNameIdentifier	 patterns
=	TokenNameEQUAL	
newPatterns	TokenNameIdentifier	 new Patterns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns, by reference, the templates that are included in * this test sequence. Note that a single template can occur * in several test sequences if its pattern is a union. */	TokenNameCOMMENT_JAVADOC	 Returns, by reference, the templates that are included in this test sequence. Note that a single template can occur in several test sequences if its pattern is a union. 
public	TokenNamepublic	
void	TokenNamevoid	
findTemplates	TokenNameIdentifier	 find Templates
(	TokenNameLPAREN	
Dictionary	TokenNameIdentifier	 Dictionary
templates	TokenNameIdentifier	 templates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_default	TokenNameIdentifier	 default
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
_default	TokenNameIdentifier	 default
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
)	TokenNameRPAREN	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the instruction handle to a template's code. This is * used when a single template occurs in several test * sequences; that is, if its pattern is a union of patterns * (e.g. match="A/B | A/C"). */	TokenNameCOMMENT_JAVADOC	 Get the instruction handle to a template's code. This is used when a single template occurs in several test sequences; that is, if its pattern is a union of patterns (e.g. match="A/B | A/C"). 
private	TokenNameprivate	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
getTemplateHandle	TokenNameIdentifier	 get Template Handle
(	TokenNameLPAREN	
Template	TokenNameIdentifier	 Template
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
)	TokenNameRPAREN	
_mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
getTemplateInstructionHandle	TokenNameIdentifier	 get Template Instruction Handle
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns pattern n in this test sequence */	TokenNameCOMMENT_JAVADOC	 Returns pattern n in this test sequence 
private	TokenNameprivate	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
)	TokenNameRPAREN	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compile the code for this test sequence. Compile patterns * from highest to lowest priority. Note that since patterns * can be share by multiple test sequences, instruction lists * must be copied before backpatching. */	TokenNameCOMMENT_JAVADOC	 Compile the code for this test sequence. Compile patterns from highest to lowest priority. Note that since patterns can be share by multiple test sequences, instruction lists must be copied before backpatching. 
public	TokenNamepublic	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
,	TokenNameCOMMA	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
continuation	TokenNameIdentifier	 continuation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Returned cached value if already compiled 	TokenNameCOMMENT_LINE	Returned cached value if already compiled 
if	TokenNameif	
(	TokenNameLPAREN	
_start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If not patterns, then return handle for default template 	TokenNameCOMMENT_LINE	If not patterns, then return handle for default template 
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
_patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
getTemplateHandle	TokenNameIdentifier	 get Template Handle
(	TokenNameLPAREN	
_default	TokenNameIdentifier	 default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Init handle to jump when all patterns failed 	TokenNameCOMMENT_LINE	Init handle to jump when all patterns failed 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_default	TokenNameIdentifier	 default
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
continuation	TokenNameIdentifier	 continuation
:	TokenNameCOLON	
getTemplateHandle	TokenNameIdentifier	 get Template Handle
(	TokenNameLPAREN	
_default	TokenNameIdentifier	 default
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compile all patterns in reverse order 	TokenNameCOMMENT_LINE	Compile all patterns in reverse order 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Template	TokenNameIdentifier	 Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
new	TokenNamenew	
InstructionList	TokenNameIdentifier	 Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Patterns expect current node on top of stack 	TokenNameCOMMENT_LINE	Patterns expect current node on top of stack 
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadCurrentNode	TokenNameIdentifier	 load Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Apply the test-code compiled for the pattern 	TokenNameCOMMENT_LINE	Apply the test-code compiled for the pattern 
InstructionList	TokenNameIdentifier	 Instruction List
ilist	TokenNameIdentifier	 ilist
=	TokenNameEQUAL	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ilist	TokenNameIdentifier	 ilist
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ilist	TokenNameIdentifier	 ilist
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
addInstructionList	TokenNameIdentifier	 add Instruction List
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
ilist	TokenNameIdentifier	 ilist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make a copy of the instruction list for backpatching 	TokenNameCOMMENT_LINE	Make a copy of the instruction list for backpatching 
InstructionList	TokenNameIdentifier	 Instruction List
copyOfilist	TokenNameIdentifier	 copy Ofilist
=	TokenNameEQUAL	
ilist	TokenNameIdentifier	 ilist
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FlowList	TokenNameIdentifier	 Flow List
trueList	TokenNameIdentifier	 true List
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
getTrueList	TokenNameIdentifier	 get True List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trueList	TokenNameIdentifier	 true List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trueList	TokenNameIdentifier	 true List
=	TokenNameEQUAL	
trueList	TokenNameIdentifier	 true List
.	TokenNameDOT	
copyAndRedirect	TokenNameIdentifier	 copy And Redirect
(	TokenNameLPAREN	
ilist	TokenNameIdentifier	 ilist
,	TokenNameCOMMA	
copyOfilist	TokenNameIdentifier	 copy Ofilist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FlowList	TokenNameIdentifier	 Flow List
falseList	TokenNameIdentifier	 false List
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
getFalseList	TokenNameIdentifier	 get False List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
falseList	TokenNameIdentifier	 false List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
falseList	TokenNameIdentifier	 false List
=	TokenNameEQUAL	
falseList	TokenNameIdentifier	 false List
.	TokenNameDOT	
copyAndRedirect	TokenNameIdentifier	 copy And Redirect
(	TokenNameLPAREN	
ilist	TokenNameIdentifier	 ilist
,	TokenNameCOMMA	
copyOfilist	TokenNameIdentifier	 copy Ofilist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
copyOfilist	TokenNameIdentifier	 copy Ofilist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// On success branch to the template code 	TokenNameCOMMENT_LINE	On success branch to the template code 
final	TokenNamefinal	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
gtmpl	TokenNameIdentifier	 gtmpl
=	TokenNameEQUAL	
getTemplateHandle	TokenNameIdentifier	 get Template Handle
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
GOTO_W	TokenNameIdentifier	 GOTO  W
(	TokenNameLPAREN	
gtmpl	TokenNameIdentifier	 gtmpl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trueList	TokenNameIdentifier	 true List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trueList	TokenNameIdentifier	 true List
.	TokenNameDOT	
backPatch	TokenNameIdentifier	 back Patch
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
falseList	TokenNameIdentifier	 false List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
falseList	TokenNameIdentifier	 false List
.	TokenNameDOT	
backPatch	TokenNameIdentifier	 back Patch
(	TokenNameLPAREN	
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Next pattern's 'fail' target is this pattern's first instruction 	TokenNameCOMMENT_LINE	Next pattern's 'fail' target is this pattern's first instruction 
fail	TokenNameIdentifier	 fail
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Append existing instruction list to the end of this one 	TokenNameCOMMENT_LINE	Append existing instruction list to the end of this one 
if	TokenNameif	
(	TokenNameLPAREN	
_instructionList	TokenNameIdentifier	 instruction List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_instructionList	TokenNameIdentifier	 instruction List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set current instruction list to be this one 	TokenNameCOMMENT_LINE	Set current instruction list to be this one 
_instructionList	TokenNameIdentifier	 instruction List
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
fail	TokenNameIdentifier	 fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
