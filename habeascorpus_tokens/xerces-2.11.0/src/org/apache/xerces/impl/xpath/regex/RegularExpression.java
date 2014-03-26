/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IntStack	TokenNameIdentifier	 Int Stack
;	TokenNameSEMICOLON	
/** * A regular expression matching engine using Non-deterministic Finite Automaton (NFA). * This engine does not conform to the POSIX regular expression. * * <hr width="50%"> * <h3>How to use</h3> * * <dl> * <dt>A. Standard way * <dd> * <pre> * RegularExpression re = new RegularExpression(<var>regex</var>); * if (re.matches(text)) { ... } * </pre> * * <dt>B. Capturing groups * <dd> * <pre> * RegularExpression re = new RegularExpression(<var>regex</var>); * Match match = new Match(); * if (re.matches(text, match)) { * ... // You can refer captured texts with methods of the <code>Match</code> class. * } * </pre> * * </dl> * * <h4>Case-insensitive matching</h4> * <pre> * RegularExpression re = new RegularExpression(<var>regex</var>, "i"); * if (re.matches(text) >= 0) { ...} * </pre> * * <h4>Options</h4> * <p>You can specify options to <a href="#RegularExpression(java.lang.String, java.lang.String)"><code>RegularExpression(</code><var>regex</var><code>, </code><var>options</var><code>)</code></a> * or <a href="#setPattern(java.lang.String, java.lang.String)"><code>setPattern(</code><var>regex</var><code>, </code><var>options</var><code>)</code></a>. * This <var>options</var> parameter consists of the following characters. * </p> * <dl> * <dt><a name="I_OPTION"><code>"i"</code></a> * <dd>This option indicates case-insensitive matching. * <dt><a name="M_OPTION"><code>"m"</code></a> * <dd class="REGEX"><kbd>^</kbd> and <kbd>$</kbd> consider the EOL characters within the text. * <dt><a name="S_OPTION"><code>"s"</code></a> * <dd class="REGEX"><kbd>.</kbd> matches any one character. * <dt><a name="U_OPTION"><code>"u"</code></a> * <dd class="REGEX">Redefines <Kbd>\d \D \w \W \s \S \b \B \&lt; \></kbd> as becoming to Unicode. * <dt><a name="W_OPTION"><code>"w"</code></a> * <dd class="REGEX">By this option, <kbd>\b \B \&lt; \></kbd> are processed with the method of * 'Unicode Regular Expression Guidelines' Revision 4. * When "w" and "u" are specified at the same time, * <kbd>\b \B \&lt; \></kbd> are processed for the "w" option. * <dt><a name="COMMA_OPTION"><code>","</code></a> * <dd>The parser treats a comma in a character class as a range separator. * <kbd class="REGEX">[a,b]</kbd> matches <kbd>a</kbd> or <kbd>,</kbd> or <kbd>b</kbd> without this option. * <kbd class="REGEX">[a,b]</kbd> matches <kbd>a</kbd> or <kbd>b</kbd> with this option. * * <dt><a name="X_OPTION"><code>"X"</code></a> * <dd class="REGEX"> * By this option, the engine confoms to <a href="http://www.w3.org/TR/2000/WD-xmlschema-2-20000407/#regexs">XML Schema: Regular Expression</a>. * The <code>match()</code> method does not do subsring matching * but entire string matching. * * </dl> * * <hr width="50%"> * <h3>Syntax</h3> * <table border="1" bgcolor="#ddeeff"> * <tr> * <td> * <h4>Differences from the Perl 5 regular expression</h4> * <ul> * <li>There is 6-digit hexadecimal character representation (<kbd>\\\\\\\\\\\\\\\\	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
RegularExpression	TokenNameIdentifier	 Regular Expression
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
6242499334195006401L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Compiles a token tree into an operation flow. */	TokenNameCOMMENT_JAVADOC	 Compiles a token tree into an operation flow. 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numberOfClosures	TokenNameIdentifier	 number Of Closures
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a token to an operation. */	TokenNameCOMMENT_JAVADOC	 Converts a token to an operation. 
private	TokenNameprivate	
Op	TokenNameIdentifier	 Op
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Op	TokenNameIdentifier	 Op
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createDot	TokenNameIdentifier	 create Dot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CHAR	TokenNameIdentifier	 CHAR
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createChar	TokenNameIdentifier	 create Char
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ANCHOR	TokenNameIdentifier	 ANCHOR
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createAnchor	TokenNameIdentifier	 create Anchor
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChar	TokenNameIdentifier	 get Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
RANGE	TokenNameIdentifier	 RANGE
:	TokenNameCOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NRANGE	TokenNameIdentifier	 NRANGE
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CONCAT	TokenNameIdentifier	 CONCAT
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
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
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
UNION	TokenNameIdentifier	 UNION
:	TokenNameCOLON	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
UnionOp	TokenNameIdentifier	 Union Op
uni	TokenNameIdentifier	 uni
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createUnion	TokenNameIdentifier	 create Union
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uni	TokenNameIdentifier	 uni
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
uni	TokenNameIdentifier	 uni
;	TokenNameSEMICOLON	
// ret.next is null. 	TokenNameCOMMENT_LINE	ret.next is null. 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CLOSURE	TokenNameIdentifier	 CLOSURE
:	TokenNameCOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getMin	TokenNameIdentifier	 get Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getMax	TokenNameIdentifier	 get Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
min	TokenNameIdentifier	 min
==	TokenNameEQUAL_EQUAL	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// {n} 	TokenNameCOMMENT_LINE	{n} 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
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
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
max	TokenNameIdentifier	 max
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
max	TokenNameIdentifier	 max
-=	TokenNameMINUS_EQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// X{2,6} -> XX(X(X(XX?)?)?)? 	TokenNameCOMMENT_LINE	X{2,6} -> XX(X(X(XX?)?)?)? 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
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
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
ChildOp	TokenNameIdentifier	 Child Op
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createQuestion	TokenNameIdentifier	 create Question
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setChild	TokenNameIdentifier	 set Child
(	TokenNameLPAREN	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
ChildOp	TokenNameIdentifier	 Child Op
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createNonGreedyClosure	TokenNameIdentifier	 create Non Greedy Closure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Token.CLOSURE 	TokenNameCOMMENT_LINE	Token.CLOSURE 
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createClosure	TokenNameIdentifier	 create Closure
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
numberOfClosures	TokenNameIdentifier	 number Of Closures
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
setChild	TokenNameIdentifier	 set Child
(	TokenNameLPAREN	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createBackReference	TokenNameIdentifier	 create Back Reference
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getReferenceNumber	TokenNameIdentifier	 get Reference Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
PAREN	TokenNameIdentifier	 PAREN
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getParenNumber	TokenNameIdentifier	 get Paren Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createCapture	TokenNameIdentifier	 create Capture
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getParenNumber	TokenNameIdentifier	 get Paren Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createCapture	TokenNameIdentifier	 create Capture
(	TokenNameLPAREN	
-	TokenNameMINUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getParenNumber	TokenNameIdentifier	 get Paren Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createCapture	TokenNameIdentifier	 create Capture
(	TokenNameLPAREN	
-	TokenNameMINUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getParenNumber	TokenNameIdentifier	 get Paren Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createCapture	TokenNameIdentifier	 create Capture
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getParenNumber	TokenNameIdentifier	 get Paren Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createLook	TokenNameIdentifier	 create Look
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createIndependent	TokenNameIdentifier	 create Independent
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
MODIFIERGROUP	TokenNameIdentifier	 MODIFIERGROUP
:	TokenNameCOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createModifier	TokenNameIdentifier	 create Modifier
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ModifierToken	TokenNameIdentifier	 Modifier Token
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
.	TokenNameDOT	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ModifierToken	TokenNameIdentifier	 Modifier Token
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
)	TokenNameRPAREN	
.	TokenNameDOT	
getOptionsMask	TokenNameIdentifier	 get Options Mask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
CONDITION	TokenNameIdentifier	 CONDITION
:	TokenNameCOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ConditionToken	TokenNameIdentifier	 Condition Token
ctok	TokenNameIdentifier	 ctok
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
ConditionToken	TokenNameIdentifier	 Condition Token
)	TokenNameRPAREN	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
int	TokenNameint	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
ctok	TokenNameIdentifier	 ctok
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
;	TokenNameSEMICOLON	
Op	TokenNameIdentifier	 Op
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
ctok	TokenNameIdentifier	 ctok
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
ctok	TokenNameIdentifier	 ctok
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Op	TokenNameIdentifier	 Op
yes	TokenNameIdentifier	 yes
=	TokenNameEQUAL	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
ctok	TokenNameIdentifier	 ctok
.	TokenNameDOT	
yes	TokenNameIdentifier	 yes
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Op	TokenNameIdentifier	 Op
no	TokenNameIdentifier	 no
=	TokenNameEQUAL	
ctok	TokenNameIdentifier	 ctok
.	TokenNameDOT	
no	TokenNameIdentifier	 no
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
ctok	TokenNameIdentifier	 ctok
.	TokenNameDOT	
no	TokenNameIdentifier	 no
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
reverse	TokenNameIdentifier	 reverse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
createCondition	TokenNameIdentifier	 create Condition
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
condition	TokenNameIdentifier	 condition
,	TokenNameCOMMA	
yes	TokenNameIdentifier	 yes
,	TokenNameCOMMA	
no	TokenNameIdentifier	 no
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Unknown token type: "	TokenNameStringLiteral	Unknown token type: 
+	TokenNamePLUS	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// switch (tok.type) 	TokenNameCOMMENT_LINE	switch (tok.type) 
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Public 	TokenNameCOMMENT_LINE	Public 
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * * @return true if the target is matched to this regular expression. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * @return true if the target is matched to this regular expression. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Match	TokenNameIdentifier	 Match
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern * in specified range or not. * * @param start Start offset of the range. * @param end End offset +1 of the range. * @return true if the target is matched to this regular expression. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern in specified range or not. * @param start Start offset of the range. @param end End offset +1 of the range. @return true if the target is matched to this regular expression. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Match	TokenNameIdentifier	 Match
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * * @param match A Match instance for storing matching result. * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * @param match A Match instance for storing matching result. @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
Match	TokenNameIdentifier	 Match
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern * in specified range or not. * * @param start Start offset of the range. * @param end End offset +1 of the range. * @param match A Match instance for storing matching result. * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern in specified range or not. * @param start Start offset of the range. @param end End offset +1 of the range. @param match A Match instance for storing matching result. @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Match	TokenNameIdentifier	 Match
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
Context	TokenNameIdentifier	 Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Context	TokenNameIdentifier	 Context
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
inuse	TokenNameIdentifier	 inuse
?	TokenNameQUESTION	
new	TokenNamenew	
Context	TokenNameIdentifier	 Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
numberOfClosures	TokenNameIdentifier	 number Of Closures
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setNumberOfGroups	TokenNameIdentifier	 set Number Of Groups
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hasBackReferences	TokenNameIdentifier	 has Back References
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
new	TokenNamenew	
Match	TokenNameIdentifier	 Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setNumberOfGroups	TokenNameIdentifier	 set Number Of Groups
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Need not to call setSource() because 	TokenNameCOMMENT_LINE	Need not to call setSource() because 
// a caller can not access this match instance. 	TokenNameCOMMENT_LINE	a caller can not access this match instance. 
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println("DEBUG: matchEnd="+matchEnd); 	TokenNameCOMMENT_LINE	System.err.println("DEBUG: matchEnd="+matchEnd); 
if	TokenNameif	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchEnd	TokenNameIdentifier	 match End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * The pattern has only fixed string. * The engine uses Boyer-Moore. */	TokenNameCOMMENT_BLOCK	 The pattern has only fixed string. The engine uses Boyer-Moore. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringOnly	TokenNameIdentifier	 fixed String Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("DEBUG: fixed-only: "+this.fixedString); 	TokenNameCOMMENT_LINE	System.err.println("DEBUG: fixed-only: "+this.fixedString); 
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringTable	TokenNameIdentifier	 fixed String Table
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * The pattern contains a fixed string. * The engine checks with Boyer-Moore whether the text contains the fixed string or not. * If not, it return with false. */	TokenNameCOMMENT_BLOCK	 The pattern contains a fixed string. The engine checks with Boyer-Moore whether the text contains the fixed string or not. If not, it return with false. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringTable	TokenNameIdentifier	 fixed String Table
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("Non-match in fixed-string search."); 	TokenNameCOMMENT_LINE	System.err.println("Non-match in fixed-string search."); 
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
minlength	TokenNameIdentifier	 minlength
;	TokenNameSEMICOLON	
int	TokenNameint	
matchStart	TokenNameIdentifier	 match Start
;	TokenNameSEMICOLON	
int	TokenNameint	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * Checks whether the expression starts with ".*". */	TokenNameCOMMENT_BLOCK	 Checks whether the expression starts with ".*". 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CLOSURE	TokenNameIdentifier	 CLOSURE
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
SINGLE_LINE	TokenNameIdentifier	 SINGLE  LINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
matchStart	TokenNameIdentifier	 match Start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Optimization against the first character. */	TokenNameCOMMENT_BLOCK	 Optimization against the first character. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
firstChar	TokenNameIdentifier	 first Char
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("DEBUG: with firstchar-matching: "+this.firstChar); 	TokenNameCOMMENT_LINE	System.err.println("DEBUG: with firstchar-matching: "+this.firstChar); 
RangeToken	TokenNameIdentifier	 Range Token
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
firstChar	TokenNameIdentifier	 first Char
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
matchStart	TokenNameIdentifier	 match Start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
matchStart	TokenNameIdentifier	 match Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
composeFromSurrogates	TokenNameIdentifier	 compose From Surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
matchStart	TokenNameIdentifier	 match Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Straightforward matching. */	TokenNameCOMMENT_BLOCK	 Straightforward matching. 
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchEnd	TokenNameIdentifier	 match End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * * @return true if the target is matched to this regular expression. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * @return true if the target is matched to this regular expression. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Match	TokenNameIdentifier	 Match
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern * in specified range or not. * * @param start Start offset of the range. * @param end End offset +1 of the range. * @return true if the target is matched to this regular expression. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern in specified range or not. * @param start Start offset of the range. @param end End offset +1 of the range. @return true if the target is matched to this regular expression. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Match	TokenNameIdentifier	 Match
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * * @param match A Match instance for storing matching result. * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * @param match A Match instance for storing matching result. @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
Match	TokenNameIdentifier	 Match
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern * in specified range or not. * * @param start Start offset of the range. * @param end End offset +1 of the range. * @param match A Match instance for storing matching result. * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern in specified range or not. * @param start Start offset of the range. @param end End offset +1 of the range. @param match A Match instance for storing matching result. @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Match	TokenNameIdentifier	 Match
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
Context	TokenNameIdentifier	 Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Context	TokenNameIdentifier	 Context
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
inuse	TokenNameIdentifier	 inuse
?	TokenNameQUESTION	
new	TokenNamenew	
Context	TokenNameIdentifier	 Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
numberOfClosures	TokenNameIdentifier	 number Of Closures
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setNumberOfGroups	TokenNameIdentifier	 set Number Of Groups
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hasBackReferences	TokenNameIdentifier	 has Back References
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
new	TokenNamenew	
Match	TokenNameIdentifier	 Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setNumberOfGroups	TokenNameIdentifier	 set Number Of Groups
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Need not to call setSource() because 	TokenNameCOMMENT_LINE	Need not to call setSource() because 
// a caller can not access this match instance. 	TokenNameCOMMENT_LINE	a caller can not access this match instance. 
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"target string="	TokenNameStringLiteral	target string=
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"matchEnd="	TokenNameStringLiteral	matchEnd=
+	TokenNamePLUS	
matchEnd	TokenNameIdentifier	 match End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"con.limit="	TokenNameStringLiteral	con.limit=
+	TokenNamePLUS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchEnd	TokenNameIdentifier	 match End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * The pattern has only fixed string. * The engine uses Boyer-Moore. */	TokenNameCOMMENT_BLOCK	 The pattern has only fixed string. The engine uses Boyer-Moore. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringOnly	TokenNameIdentifier	 fixed String Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("DEBUG: fixed-only: "+this.fixedString); 	TokenNameCOMMENT_LINE	System.err.println("DEBUG: fixed-only: "+this.fixedString); 
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringTable	TokenNameIdentifier	 fixed String Table
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * The pattern contains a fixed string. * The engine checks with Boyer-Moore whether the text contains the fixed string or not. * If not, it return with false. */	TokenNameCOMMENT_BLOCK	 The pattern contains a fixed string. The engine checks with Boyer-Moore whether the text contains the fixed string or not. If not, it return with false. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringTable	TokenNameIdentifier	 fixed String Table
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("Non-match in fixed-string search."); 	TokenNameCOMMENT_LINE	System.err.println("Non-match in fixed-string search."); 
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
minlength	TokenNameIdentifier	 minlength
;	TokenNameSEMICOLON	
int	TokenNameint	
matchStart	TokenNameIdentifier	 match Start
;	TokenNameSEMICOLON	
int	TokenNameint	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * Checks whether the expression starts with ".*". */	TokenNameCOMMENT_BLOCK	 Checks whether the expression starts with ".*". 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CLOSURE	TokenNameIdentifier	 CLOSURE
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
SINGLE_LINE	TokenNameIdentifier	 SINGLE  LINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Optimization against the first character. */	TokenNameCOMMENT_BLOCK	 Optimization against the first character. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
firstChar	TokenNameIdentifier	 first Char
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("DEBUG: with firstchar-matching: "+this.firstChar); 	TokenNameCOMMENT_LINE	System.err.println("DEBUG: with firstchar-matching: "+this.firstChar); 
RangeToken	TokenNameIdentifier	 Range Token
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
firstChar	TokenNameIdentifier	 first Char
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
matchStart	TokenNameIdentifier	 match Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
composeFromSurrogates	TokenNameIdentifier	 compose From Surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Straightforward matching. */	TokenNameCOMMENT_BLOCK	 Straightforward matching. 
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchEnd	TokenNameIdentifier	 match End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return -1 when not match; offset of the end of matched string when match. */	TokenNameCOMMENT_JAVADOC	 @return -1 when not match; offset of the end of matched string when match. 
private	TokenNameprivate	
int	TokenNameint	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
dx	TokenNameIdentifier	 dx
,	TokenNameCOMMA	
int	TokenNameint	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ExpressionTarget	TokenNameIdentifier	 Expression Target
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Stack	TokenNameIdentifier	 Stack
opStack	TokenNameIdentifier	 op Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IntStack	TokenNameIdentifier	 Int Stack
dataStack	TokenNameIdentifier	 data Stack
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
isSetIgnoreCase	TokenNameIdentifier	 is Set Ignore Case
=	TokenNameEQUAL	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
opts	TokenNameIdentifier	 opts
,	TokenNameCOMMA	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
opts	TokenNameIdentifier	 opts
,	TokenNameCOMMA	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// dx value is either 1 or -1 	TokenNameCOMMENT_LINE	dx value is either 1 or -1 
switch	TokenNameswitch	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CHAR	TokenNameIdentifier	 CHAR
:	TokenNameCOLON	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
o1	TokenNameIdentifier	 o1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
offset	TokenNameIdentifier	 offset
:	TokenNameCOLON	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
>=	TokenNameGREATER_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
||	TokenNameOR_OR	
o1	TokenNameIdentifier	 o1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
matchChar	TokenNameIdentifier	 match Char
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
isSetIgnoreCase	TokenNameIdentifier	 is Set Ignore Case
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
o1	TokenNameIdentifier	 o1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
offset	TokenNameIdentifier	 offset
:	TokenNameCOLON	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
>=	TokenNameGREATER_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
||	TokenNameOR_OR	
o1	TokenNameIdentifier	 o1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
opts	TokenNameIdentifier	 opts
,	TokenNameCOMMA	
SINGLE_LINE	TokenNameIdentifier	 SINGLE  LINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
o1	TokenNameIdentifier	 o1
+	TokenNamePLUS	
dx	TokenNameIdentifier	 dx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
o1	TokenNameIdentifier	 o1
+	TokenNamePLUS	
dx	TokenNameIdentifier	 dx
<	TokenNameLESS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
o1	TokenNameIdentifier	 o1
+=	TokenNamePLUS_EQUAL	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
o1	TokenNameIdentifier	 o1
+	TokenNamePLUS	
dx	TokenNameIdentifier	 dx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
o1	TokenNameIdentifier	 o1
+	TokenNamePLUS	
dx	TokenNameIdentifier	 dx
<	TokenNameLESS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
o1	TokenNameIdentifier	 o1
+=	TokenNamePLUS_EQUAL	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
composeFromSurrogates	TokenNameIdentifier	 compose From Surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
o1	TokenNameIdentifier	 o1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
o1	TokenNameIdentifier	 o1
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
RANGE	TokenNameIdentifier	 RANGE
:	TokenNameCOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NRANGE	TokenNameIdentifier	 NRANGE
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
o1	TokenNameIdentifier	 o1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
offset	TokenNameIdentifier	 offset
:	TokenNameCOLON	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
>=	TokenNameGREATER_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
||	TokenNameOR_OR	
o1	TokenNameIdentifier	 o1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
o1	TokenNameIdentifier	 o1
+	TokenNamePLUS	
dx	TokenNameIdentifier	 dx
<	TokenNameLESS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
o1	TokenNameIdentifier	 o1
+	TokenNamePLUS	
dx	TokenNameIdentifier	 dx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
o1	TokenNameIdentifier	 o1
+=	TokenNamePLUS_EQUAL	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
composeFromSurrogates	TokenNameIdentifier	 compose From Surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
RangeToken	TokenNameIdentifier	 Range Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tok	TokenNameIdentifier	 tok
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
o1	TokenNameIdentifier	 o1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
o1	TokenNameIdentifier	 o1
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
ANCHOR	TokenNameIdentifier	 ANCHOR
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
matchAnchor	TokenNameIdentifier	 match Anchor
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
BACKREFERENCE	TokenNameIdentifier	 BACKREFERENCE
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
refno	TokenNameIdentifier	 refno
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
refno	TokenNameIdentifier	 refno
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: Reference number must be more than zero: "	TokenNameStringLiteral	Internal Error: Reference number must be more than zero: 
+	TokenNamePLUS	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
getBeginning	TokenNameIdentifier	 get Beginning
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
o2	TokenNameIdentifier	 o2
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
getBeginning	TokenNameIdentifier	 get Beginning
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
literallen	TokenNameIdentifier	 literallen
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
-	TokenNameMINUS	
o2	TokenNameIdentifier	 o2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
isSetIgnoreCase	TokenNameIdentifier	 is Set Ignore Case
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
literallen	TokenNameIdentifier	 literallen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
literallen	TokenNameIdentifier	 literallen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
isSetIgnoreCase	TokenNameIdentifier	 is Set Ignore Case
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
literallen	TokenNameIdentifier	 literallen
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
literallen	TokenNameIdentifier	 literallen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
-=	TokenNameMINUS_EQUAL	
literallen	TokenNameIdentifier	 literallen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
literal	TokenNameIdentifier	 literal
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
literallen	TokenNameIdentifier	 literallen
=	TokenNameEQUAL	
literal	TokenNameIdentifier	 literal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
isSetIgnoreCase	TokenNameIdentifier	 is Set Ignore Case
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
literal	TokenNameIdentifier	 literal
,	TokenNameCOMMA	
literallen	TokenNameIdentifier	 literallen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
literallen	TokenNameIdentifier	 literallen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
isSetIgnoreCase	TokenNameIdentifier	 is Set Ignore Case
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
literallen	TokenNameIdentifier	 literallen
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
literal	TokenNameIdentifier	 literal
,	TokenNameCOMMA	
literallen	TokenNameIdentifier	 literallen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
-=	TokenNameMINUS_EQUAL	
literallen	TokenNameIdentifier	 literallen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CLOSURE	TokenNameIdentifier	 CLOSURE
:	TokenNameCOLON	
{	TokenNameLBRACE	
// Saves current position to avoid zero-width repeats. 	TokenNameCOMMENT_LINE	Saves current position to avoid zero-width repeats. 
final	TokenNamefinal	
int	TokenNameint	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
closureContexts	TokenNameIdentifier	 closure Contexts
[	TokenNameLBRACKET	
id	TokenNameIdentifier	 id
]	TokenNameRBRACKET	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
closureContexts	TokenNameIdentifier	 closure Contexts
[	TokenNameLBRACKET	
id	TokenNameIdentifier	 id
]	TokenNameRBRACKET	
.	TokenNameDOT	
addOffset	TokenNameIdentifier	 add Offset
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
QUESTION	TokenNameIdentifier	 QUESTION
:	TokenNameCOLON	
{	TokenNameLBRACE	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
:	TokenNameCOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NONGREEDYQUESTION	TokenNameIdentifier	 NONGREEDYQUESTION
:	TokenNameCOLON	
{	TokenNameLBRACE	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
UNION	TokenNameIdentifier	 UNION
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CAPTURE	TokenNameIdentifier	 CAPTURE
:	TokenNameCOLON	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
refno	TokenNameIdentifier	 refno
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
getBeginning	TokenNameIdentifier	 get Beginning
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
refno	TokenNameIdentifier	 refno
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
:	TokenNameCOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
:	TokenNameCOLON	
{	TokenNameLBRACE	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
||	TokenNameOR_OR	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
:	TokenNameCOLON	
{	TokenNameLBRACE	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
MODIFIER	TokenNameIdentifier	 MODIFIER
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
localopts	TokenNameIdentifier	 localopts
=	TokenNameEQUAL	
opts	TokenNameIdentifier	 opts
;	TokenNameSEMICOLON	
localopts	TokenNameIdentifier	 localopts
|=	TokenNameOR_EQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
localopts	TokenNameIdentifier	 localopts
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getData2	TokenNameIdentifier	 get Data2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
opts	TokenNameIdentifier	 opts
=	TokenNameEQUAL	
localopts	TokenNameIdentifier	 localopts
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CONDITION	TokenNameIdentifier	 CONDITION
:	TokenNameCOLON	
{	TokenNameLBRACE	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
ConditionOp	TokenNameIdentifier	 Condition Op
cop	TokenNameIdentifier	 cop
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
ConditionOp	TokenNameIdentifier	 Condition Op
)	TokenNameRPAREN	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Internal Error: Reference number must be more than zero: "	TokenNameStringLiteral	Internal Error: Reference number must be more than zero: 
+	TokenNamePLUS	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
getBeginning	TokenNameIdentifier	 get Beginning
(	TokenNameLPAREN	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
refNumber	TokenNameIdentifier	 ref Number
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
yes	TokenNameIdentifier	 yes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
no	TokenNameIdentifier	 no
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
no	TokenNameIdentifier	 no
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Unknown operation type: "	TokenNameStringLiteral	Unknown operation type: 
+	TokenNamePLUS	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// handle recursive operations 	TokenNameCOMMENT_LINE	handle recursive operations 
while	TokenNamewhile	
(	TokenNameLPAREN	
returned	TokenNameIdentifier	 returned
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// exhausted all the operations 	TokenNameCOMMENT_LINE	exhausted all the operations 
if	TokenNameif	
(	TokenNameLPAREN	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
retValue	TokenNameIdentifier	 ret Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
)	TokenNameRPAREN	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CLOSURE	TokenNameIdentifier	 CLOSURE
:	TokenNameCOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
QUESTION	TokenNameIdentifier	 QUESTION
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NONGREEDYCLOSURE	TokenNameIdentifier	 NONGREEDYCLOSURE
:	TokenNameCOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NONGREEDYQUESTION	TokenNameIdentifier	 NONGREEDYQUESTION
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
UNION	TokenNameIdentifier	 UNION
:	TokenNameCOLON	
{	TokenNameLBRACE	
int	TokenNameint	
unionIndex	TokenNameIdentifier	 union Index
=	TokenNameEQUAL	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"UNION: "	TokenNameStringLiteral	UNION: 
+	TokenNamePLUS	
unionIndex	TokenNameIdentifier	 union Index
+	TokenNamePLUS	
", ret="	TokenNameStringLiteral	, ret=
+	TokenNamePLUS	
retValue	TokenNameIdentifier	 ret Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
unionIndex	TokenNameIdentifier	 union Index
<	TokenNameLESS	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
opStack	TokenNameIdentifier	 op Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
unionIndex	TokenNameIdentifier	 union Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
unionIndex	TokenNameIdentifier	 union Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CAPTURE	TokenNameIdentifier	 CAPTURE
:	TokenNameCOLON	
final	TokenNamefinal	
int	TokenNameint	
refno	TokenNameIdentifier	 refno
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
saved	TokenNameIdentifier	 saved
=	TokenNameEQUAL	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
refno	TokenNameIdentifier	 refno
,	TokenNameCOMMA	
saved	TokenNameIdentifier	 saved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
-	TokenNameMINUS	
refno	TokenNameIdentifier	 refno
,	TokenNameCOMMA	
saved	TokenNameIdentifier	 saved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
LOOKAHEAD	TokenNameIdentifier	 LOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
LOOKBEHIND	TokenNameIdentifier	 LOOKBEHIND
:	TokenNameCOLON	
{	TokenNameLBRACE	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
retValue	TokenNameIdentifier	 ret Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NEGATIVELOOKAHEAD	TokenNameIdentifier	 NEGATIVELOOKAHEAD
:	TokenNameCOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
NEGATIVELOOKBEHIND	TokenNameIdentifier	 NEGATIVELOOKBEHIND
:	TokenNameCOLON	
{	TokenNameLBRACE	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
>	TokenNameGREATER	
retValue	TokenNameIdentifier	 ret Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
MODIFIER	TokenNameIdentifier	 MODIFIER
:	TokenNameCOLON	
opts	TokenNameIdentifier	 opts
=	TokenNameEQUAL	
dataStack	TokenNameIdentifier	 data Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fall through 	TokenNameCOMMENT_LINE	fall through 
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
INDEPENDENT	TokenNameIdentifier	 INDEPENDENT
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
retValue	TokenNameIdentifier	 ret Value
;	TokenNameSEMICOLON	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CONDITION	TokenNameIdentifier	 CONDITION
:	TokenNameCOLON	
{	TokenNameLBRACE	
final	TokenNamefinal	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
ConditionOp	TokenNameIdentifier	 Condition Op
cop	TokenNameIdentifier	 cop
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
ConditionOp	TokenNameIdentifier	 Condition Op
)	TokenNameRPAREN	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
retValue	TokenNameIdentifier	 ret Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
yes	TokenNameIdentifier	 yes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
no	TokenNameIdentifier	 no
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
no	TokenNameIdentifier	 no
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
cop	TokenNameIdentifier	 cop
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
returned	TokenNameIdentifier	 returned
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
matchChar	TokenNameIdentifier	 match Char
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
?	TokenNameQUESTION	
matchIgnoreCase	TokenNameIdentifier	 match Ignore Case
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
:	TokenNameCOLON	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
matchAnchor	TokenNameIdentifier	 match Anchor
(	TokenNameLPAREN	
ExpressionTarget	TokenNameIdentifier	 Expression Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
Op	TokenNameIdentifier	 Op
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
go	TokenNameIdentifier	 go
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
op	TokenNameIdentifier	 op
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'^'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
opts	TokenNameIdentifier	 opts
,	TokenNameCOMMA	
MULTIPLE_LINES	TokenNameIdentifier	 MULTIPLE  LINES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
&&	TokenNameAND_AND	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'@'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// Internal use only. 	TokenNameCOMMENT_LINE	Internal use only. 
// The @ always matches line beginnings. 	TokenNameCOMMENT_LINE	The @ always matches line beginnings. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
&&	TokenNameAND_AND	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'$'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
opts	TokenNameIdentifier	 opts
,	TokenNameCOMMA	
MULTIPLE_LINES	TokenNameIdentifier	 MULTIPLE  LINES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CARRIAGE_RETURN	TokenNameIdentifier	 CARRIAGE  RETURN
&&	TokenNameAND_AND	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
LINE_FEED	TokenNameIdentifier	 LINE  FEED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'A'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'Z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
&&	TokenNameAND_AND	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CARRIAGE_RETURN	TokenNameIdentifier	 CARRIAGE  RETURN
&&	TokenNameAND_AND	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
LINE_FEED	TokenNameIdentifier	 LINE  FEED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'b'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
int	TokenNameint	
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
getWordType	TokenNameIdentifier	 get Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
==	TokenNameEQUAL_EQUAL	
WT_IGNORE	TokenNameIdentifier	 WT  IGNORE
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
getPreviousWordType	TokenNameIdentifier	 get Previous Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
==	TokenNameEQUAL_EQUAL	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'B'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
go	TokenNameIdentifier	 go
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
getWordType	TokenNameIdentifier	 get Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
go	TokenNameIdentifier	 go
=	TokenNameEQUAL	
after	TokenNameIdentifier	 after
==	TokenNameEQUAL_EQUAL	
WT_IGNORE	TokenNameIdentifier	 WT  IGNORE
||	TokenNameOR_OR	
after	TokenNameIdentifier	 after
==	TokenNameEQUAL_EQUAL	
getPreviousWordType	TokenNameIdentifier	 get Previous Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
go	TokenNameIdentifier	 go
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'<'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getWordType	TokenNameIdentifier	 get Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
WT_LETTER	TokenNameIdentifier	 WT  LETTER
||	TokenNameOR_OR	
getPreviousWordType	TokenNameIdentifier	 get Previous Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
WT_OTHER	TokenNameIdentifier	 WT  OTHER
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'>'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getWordType	TokenNameIdentifier	 get Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
WT_OTHER	TokenNameIdentifier	 WT  OTHER
||	TokenNameOR_OR	
getPreviousWordType	TokenNameIdentifier	 get Previous Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
WT_LETTER	TokenNameIdentifier	 WT  LETTER
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// switch anchor type 	TokenNameCOMMENT_LINE	switch anchor type 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
getPreviousWordType	TokenNameIdentifier	 get Previous Word Type
(	TokenNameLPAREN	
ExpressionTarget	TokenNameIdentifier	 Expression Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
getWordType	TokenNameIdentifier	 get Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
--	TokenNameMINUS_MINUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
WT_IGNORE	TokenNameIdentifier	 WT  IGNORE
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
getWordType	TokenNameIdentifier	 get Word Type
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
--	TokenNameMINUS_MINUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
getWordType	TokenNameIdentifier	 get Word Type
(	TokenNameLPAREN	
ExpressionTarget	TokenNameIdentifier	 Expression Target
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
begin	TokenNameIdentifier	 begin
||	TokenNameOR_OR	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
return	TokenNamereturn	
WT_OTHER	TokenNameIdentifier	 WT  OTHER
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getWordType0	TokenNameIdentifier	 get Word Type0
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * * @return true if the target is matched to this regular expression. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * @return true if the target is matched to this regular expression. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Match	TokenNameIdentifier	 Match
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * * @param match A Match instance for storing matching result. * @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. */	TokenNameCOMMENT_JAVADOC	 Checks whether the <var>target</var> text <strong>contains</strong> this pattern or not. * @param match A Match instance for storing matching result. @return Offset of the start position in <VAR>target</VAR>; or -1 if not match. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
Match	TokenNameIdentifier	 Match
match	TokenNameIdentifier	 match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
Context	TokenNameIdentifier	 Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Context	TokenNameIdentifier	 Context
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
inuse	TokenNameIdentifier	 inuse
?	TokenNameQUESTION	
new	TokenNamenew	
Context	TokenNameIdentifier	 Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
numberOfClosures	TokenNameIdentifier	 number Of Closures
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setNumberOfGroups	TokenNameIdentifier	 set Number Of Groups
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
hasBackReferences	TokenNameIdentifier	 has Back References
)	TokenNameRPAREN	
{	TokenNameLBRACE	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
new	TokenNamenew	
Match	TokenNameIdentifier	 Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setNumberOfGroups	TokenNameIdentifier	 set Number Of Groups
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Need not to call setSource() because 	TokenNameCOMMENT_LINE	Need not to call setSource() because 
// a caller can not access this match instance. 	TokenNameCOMMENT_LINE	a caller can not access this match instance. 
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.err.println("DEBUG: matchEnd="+matchEnd); 	TokenNameCOMMENT_LINE	System.err.println("DEBUG: matchEnd="+matchEnd); 
if	TokenNameif	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
==	TokenNameEQUAL_EQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchEnd	TokenNameIdentifier	 match End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * The pattern has only fixed string. * The engine uses Boyer-Moore. */	TokenNameCOMMENT_BLOCK	 The pattern has only fixed string. The engine uses Boyer-Moore. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringOnly	TokenNameIdentifier	 fixed String Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("DEBUG: fixed-only: "+this.fixedString); 	TokenNameCOMMENT_LINE	System.err.println("DEBUG: fixed-only: "+this.fixedString); 
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringTable	TokenNameIdentifier	 fixed String Table
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * The pattern contains a fixed string. * The engine checks with Boyer-Moore whether the text contains the fixed string or not. * If not, it return with false. */	TokenNameCOMMENT_BLOCK	 The pattern contains a fixed string. The engine checks with Boyer-Moore whether the text contains the fixed string or not. If not, it return with false. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringTable	TokenNameIdentifier	 fixed String Table
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("Non-match in fixed-string search."); 	TokenNameCOMMENT_LINE	System.err.println("Non-match in fixed-string search."); 
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
minlength	TokenNameIdentifier	 minlength
;	TokenNameSEMICOLON	
int	TokenNameint	
matchStart	TokenNameIdentifier	 match Start
;	TokenNameSEMICOLON	
int	TokenNameint	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * Checks whether the expression starts with ".*". */	TokenNameCOMMENT_BLOCK	 Checks whether the expression starts with ".*". 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CLOSURE	TokenNameIdentifier	 CLOSURE
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
DOT	TokenNameIdentifier	 DOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
SINGLE_LINE	TokenNameIdentifier	 SINGLE  LINE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
previousIsEOL	TokenNameIdentifier	 previous Is EOL
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Optimization against the first character. */	TokenNameCOMMENT_BLOCK	 Optimization against the first character. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
firstChar	TokenNameIdentifier	 first Char
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.err.println("DEBUG: with firstchar-matching: "+this.firstChar); 	TokenNameCOMMENT_LINE	System.err.println("DEBUG: with firstchar-matching: "+this.firstChar); 
RangeToken	TokenNameIdentifier	 Range Token
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
firstChar	TokenNameIdentifier	 first Char
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
matchStart	TokenNameIdentifier	 match Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
composeFromSurrogates	TokenNameIdentifier	 compose From Surrogates
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Straightforward matching. */	TokenNameCOMMENT_BLOCK	 Straightforward matching. 
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
matchStart	TokenNameIdentifier	 match Start
=	TokenNameEQUAL	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
<=	TokenNameLESS_EQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
matchStart	TokenNameIdentifier	 match Start
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchEnd	TokenNameIdentifier	 match End
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchStart	TokenNameIdentifier	 match Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
match	TokenNameIdentifier	 match
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchEnd	TokenNameIdentifier	 match End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
con	TokenNameIdentifier	 con
.	TokenNameDOT	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
/** * A regular expression. * @serial */	TokenNameCOMMENT_JAVADOC	 A regular expression. @serial 
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
/** * @serial */	TokenNameCOMMENT_JAVADOC	 @serial 
int	TokenNameint	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
/** * The number of parenthesis in the regular expression. * @serial */	TokenNameCOMMENT_JAVADOC	 The number of parenthesis in the regular expression. @serial 
int	TokenNameint	
nofparen	TokenNameIdentifier	 nofparen
;	TokenNameSEMICOLON	
/** * Internal representation of the regular expression. * @serial */	TokenNameCOMMENT_JAVADOC	 Internal representation of the regular expression. @serial 
Token	TokenNameIdentifier	 Token
tokentree	TokenNameIdentifier	 tokentree
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasBackReferences	TokenNameIdentifier	 has Back References
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
int	TokenNameint	
minlength	TokenNameIdentifier	 minlength
;	TokenNameSEMICOLON	
transient	TokenNametransient	
Op	TokenNameIdentifier	 Op
operations	TokenNameIdentifier	 operations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
int	TokenNameint	
numberOfClosures	TokenNameIdentifier	 number Of Closures
;	TokenNameSEMICOLON	
transient	TokenNametransient	
Context	TokenNameIdentifier	 Context
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
RangeToken	TokenNameIdentifier	 Range Token
firstChar	TokenNameIdentifier	 first Char
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
String	TokenNameIdentifier	 String
fixedString	TokenNameIdentifier	 fixed String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
int	TokenNameint	
fixedStringOptions	TokenNameIdentifier	 fixed String Options
;	TokenNameSEMICOLON	
transient	TokenNametransient	
BMPattern	TokenNameIdentifier	 BM Pattern
fixedStringTable	TokenNameIdentifier	 fixed String Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
boolean	TokenNameboolean	
fixedStringOnly	TokenNameIdentifier	 fixed String Only
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
ExpressionTarget	TokenNameIdentifier	 Expression Target
{	TokenNameLBRACE	
abstract	TokenNameabstract	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
StringTarget	TokenNameIdentifier	 String Target
extends	TokenNameextends	
ExpressionTarget	TokenNameIdentifier	 Expression Target
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
StringTarget	TokenNameIdentifier	 String Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
resetTarget	TokenNameIdentifier	 reset Target
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
?	TokenNameQUESTION	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
:	TokenNameCOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
?	TokenNameQUESTION	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
:	TokenNameCOLON	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CharArrayTarget	TokenNameIdentifier	 Char Array Target
extends	TokenNameextends	
ExpressionTarget	TokenNameIdentifier	 Expression Target
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
CharArrayTarget	TokenNameIdentifier	 Char Array Target
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
resetTarget	TokenNameIdentifier	 reset Target
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
?	TokenNameQUESTION	
regionMatchesIgnoreCase	TokenNameIdentifier	 region Matches Ignore Case
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
:	TokenNameCOLON	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
partlen	TokenNameIdentifier	 partlen
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatchesIgnoreCase	TokenNameIdentifier	 region Matches Ignore Case
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
partlen	TokenNameIdentifier	 partlen
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
==	TokenNameEQUAL_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
uch1	TokenNameIdentifier	 uch1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
uch2	TokenNameIdentifier	 uch2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
==	TokenNameEQUAL_EQUAL	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
?	TokenNameQUESTION	
regionMatchesIgnoreCase	TokenNameIdentifier	 region Matches Ignore Case
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
:	TokenNameCOLON	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset2	TokenNameIdentifier	 offset2
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
partlen	TokenNameIdentifier	 partlen
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatchesIgnoreCase	TokenNameIdentifier	 region Matches Ignore Case
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset2	TokenNameIdentifier	 offset2
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
partlen	TokenNameIdentifier	 partlen
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
==	TokenNameEQUAL_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
uch1	TokenNameIdentifier	 uch1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
uch2	TokenNameIdentifier	 uch2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
==	TokenNameEQUAL_EQUAL	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CharacterIteratorTarget	TokenNameIdentifier	 Character Iterator Target
extends	TokenNameextends	
ExpressionTarget	TokenNameIdentifier	 Expression Target
{	TokenNameLBRACE	
CharacterIterator	TokenNameIdentifier	 Character Iterator
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
CharacterIteratorTarget	TokenNameIdentifier	 Character Iterator Target
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
resetTarget	TokenNameIdentifier	 reset Target
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
?	TokenNameQUESTION	
regionMatchesIgnoreCase	TokenNameIdentifier	 region Matches Ignore Case
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
:	TokenNameCOLON	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
partlen	TokenNameIdentifier	 partlen
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatchesIgnoreCase	TokenNameIdentifier	 region Matches Ignore Case
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
partlen	TokenNameIdentifier	 partlen
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
==	TokenNameEQUAL_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
uch1	TokenNameIdentifier	 uch1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
uch2	TokenNameIdentifier	 uch2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
==	TokenNameEQUAL_EQUAL	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreCase	TokenNameIdentifier	 ignore Case
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ignoreCase	TokenNameIdentifier	 ignore Case
)	TokenNameRPAREN	
?	TokenNameQUESTION	
regionMatchesIgnoreCase	TokenNameIdentifier	 region Matches Ignore Case
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
:	TokenNameCOLON	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatches	TokenNameIdentifier	 region Matches
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset2	TokenNameIdentifier	 offset2
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
partlen	TokenNameIdentifier	 partlen
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
regionMatchesIgnoreCase	TokenNameIdentifier	 region Matches Ignore Case
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
offset2	TokenNameIdentifier	 offset2
,	TokenNameCOMMA	
int	TokenNameint	
partlen	TokenNameIdentifier	 partlen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset2	TokenNameIdentifier	 offset2
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
partlen	TokenNameIdentifier	 partlen
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
==	TokenNameEQUAL_EQUAL	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
char	TokenNamechar	
uch1	TokenNameIdentifier	 uch1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
uch2	TokenNameIdentifier	 uch2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
==	TokenNameEQUAL_EQUAL	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ClosureContext	TokenNameIdentifier	 Closure Context
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
addOffset	TokenNameIdentifier	 add Offset
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We do not check for duplicates, caller is responsible for that 	TokenNameCOMMENT_LINE	We do not check for duplicates, caller is responsible for that 
if	TokenNameif	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
==	TokenNameEQUAL_EQUAL	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
expandOffsets	TokenNameIdentifier	 expand Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
currentIndex	TokenNameIdentifier	 current Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expandOffsets	TokenNameIdentifier	 expand Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newLen	TokenNameIdentifier	 new Len
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newOffsets	TokenNameIdentifier	 new Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newLen	TokenNameIdentifier	 new Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newOffsets	TokenNameIdentifier	 new Offsets
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentIndex	TokenNameIdentifier	 current Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newOffsets	TokenNameIdentifier	 new Offsets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Context	TokenNameIdentifier	 Context
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Match	TokenNameIdentifier	 Match
match	TokenNameIdentifier	 match
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
inuse	TokenNameIdentifier	 inuse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ClosureContext	TokenNameIdentifier	 Closure Context
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
closureContexts	TokenNameIdentifier	 closure Contexts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringTarget	TokenNameIdentifier	 String Target
stringTarget	TokenNameIdentifier	 string Target
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharArrayTarget	TokenNameIdentifier	 Char Array Target
charArrayTarget	TokenNameIdentifier	 char Array Target
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharacterIteratorTarget	TokenNameIdentifier	 Character Iterator Target
characterIteratorTarget	TokenNameIdentifier	 character Iterator Target
;	TokenNameSEMICOLON	
ExpressionTarget	TokenNameIdentifier	 Expression Target
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
Context	TokenNameIdentifier	 Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
resetCommon	TokenNameIdentifier	 reset Common
(	TokenNameLPAREN	
int	TokenNameint	
nofclosures	TokenNameIdentifier	 nofclosures
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
closureContexts	TokenNameIdentifier	 closure Contexts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
closureContexts	TokenNameIdentifier	 closure Contexts
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
nofclosures	TokenNameIdentifier	 nofclosures
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
closureContexts	TokenNameIdentifier	 closure Contexts
=	TokenNameEQUAL	
new	TokenNamenew	
ClosureContext	TokenNameIdentifier	 Closure Context
[	TokenNameLBRACKET	
nofclosures	TokenNameIdentifier	 nofclosures
]	TokenNameRBRACKET	
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
nofclosures	TokenNameIdentifier	 nofclosures
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
closureContexts	TokenNameIdentifier	 closure Contexts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
closureContexts	TokenNameIdentifier	 closure Contexts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ClosureContext	TokenNameIdentifier	 Closure Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
closureContexts	TokenNameIdentifier	 closure Contexts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
nofclosures	TokenNameIdentifier	 nofclosures
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
characterIteratorTarget	TokenNameIdentifier	 character Iterator Target
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
characterIteratorTarget	TokenNameIdentifier	 character Iterator Target
=	TokenNameEQUAL	
new	TokenNamenew	
CharacterIteratorTarget	TokenNameIdentifier	 Character Iterator Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
characterIteratorTarget	TokenNameIdentifier	 character Iterator Target
.	TokenNameDOT	
resetTarget	TokenNameIdentifier	 reset Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
characterIteratorTarget	TokenNameIdentifier	 character Iterator Target
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
resetCommon	TokenNameIdentifier	 reset Common
(	TokenNameLPAREN	
nofclosures	TokenNameIdentifier	 nofclosures
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
nofclosures	TokenNameIdentifier	 nofclosures
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stringTarget	TokenNameIdentifier	 string Target
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stringTarget	TokenNameIdentifier	 string Target
=	TokenNameEQUAL	
new	TokenNamenew	
StringTarget	TokenNameIdentifier	 String Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stringTarget	TokenNameIdentifier	 string Target
.	TokenNameDOT	
resetTarget	TokenNameIdentifier	 reset Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
stringTarget	TokenNameIdentifier	 string Target
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
resetCommon	TokenNameIdentifier	 reset Common
(	TokenNameLPAREN	
nofclosures	TokenNameIdentifier	 nofclosures
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
,	TokenNameCOMMA	
int	TokenNameint	
nofclosures	TokenNameIdentifier	 nofclosures
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
charArrayTarget	TokenNameIdentifier	 char Array Target
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charArrayTarget	TokenNameIdentifier	 char Array Target
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayTarget	TokenNameIdentifier	 Char Array Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
charArrayTarget	TokenNameIdentifier	 char Array Target
.	TokenNameDOT	
resetTarget	TokenNameIdentifier	 reset Target
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
charArrayTarget	TokenNameIdentifier	 char Array Target
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
resetCommon	TokenNameIdentifier	 reset Common
(	TokenNameLPAREN	
nofclosures	TokenNameIdentifier	 nofclosures
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setInUse	TokenNameIdentifier	 set In Use
(	TokenNameLPAREN	
boolean	TokenNameboolean	
inUse	TokenNameIdentifier	 in Use
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
inuse	TokenNameIdentifier	 inuse
=	TokenNameEQUAL	
inUse	TokenNameIdentifier	 in Use
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prepares for matching. This method is called just before starting matching. */	TokenNameCOMMENT_JAVADOC	 Prepares for matching. This method is called just before starting matching. 
void	TokenNamevoid	
prepare	TokenNameIdentifier	 prepare
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
tokentree	TokenNameIdentifier	 tokentree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* if (this.operations.type == Op.CLOSURE && this.operations.getChild().type == Op.DOT) { // .* Op anchor = Op.createAnchor(isSet(this.options, SINGLE_LINE) ? 'A' : '@'); anchor.next = this.operations; this.operations = anchor; } */	TokenNameCOMMENT_BLOCK	 if (this.operations.type == Op.CLOSURE && this.operations.getChild().type == Op.DOT) { // .* Op anchor = Op.createAnchor(isSet(this.options, SINGLE_LINE) ? 'A' : '@'); anchor.next = this.operations; this.operations = anchor; } 
if	TokenNameif	
(	TokenNameLPAREN	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
COUNT	TokenNameIdentifier	 COUNT
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"DEBUG: The number of operations: "	TokenNameStringLiteral	DEBUG: The number of operations: 
+	TokenNamePLUS	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
nofinstances	TokenNameIdentifier	 nofinstances
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minlength	TokenNameIdentifier	 minlength
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
tokentree	TokenNameIdentifier	 tokentree
.	TokenNameDOT	
getMinLength	TokenNameIdentifier	 get Min Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
firstChar	TokenNameIdentifier	 first Char
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
PROHIBIT_HEAD_CHARACTER_OPTIMIZATION	TokenNameIdentifier	 PROHIBIT  HEAD  CHARACTER  OPTIMIZATION
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RangeToken	TokenNameIdentifier	 Range Token
firstChar	TokenNameIdentifier	 first Char
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
createRange	TokenNameIdentifier	 create Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
fresult	TokenNameIdentifier	 fresult
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
tokentree	TokenNameIdentifier	 tokentree
.	TokenNameDOT	
analyzeFirstCharacter	TokenNameIdentifier	 analyze First Character
(	TokenNameLPAREN	
firstChar	TokenNameIdentifier	 first Char
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fresult	TokenNameIdentifier	 fresult
==	TokenNameEQUAL_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
FC_TERMINAL	TokenNameIdentifier	 FC  TERMINAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstChar	TokenNameIdentifier	 first Char
.	TokenNameDOT	
compactRanges	TokenNameIdentifier	 compact Ranges
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
firstChar	TokenNameIdentifier	 first Char
=	TokenNameEQUAL	
firstChar	TokenNameIdentifier	 first Char
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"DEBUG: Use the first character optimization: "	TokenNameStringLiteral	DEBUG: Use the first character optimization: 
+	TokenNamePLUS	
firstChar	TokenNameIdentifier	 first Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
CHAR	TokenNameIdentifier	 CHAR
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" *** Only fixed string! *** "	TokenNameStringLiteral	 *** Only fixed string! *** 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringOnly	TokenNameIdentifier	 fixed String Only
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Op	TokenNameIdentifier	 Op
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Op.CHAR 	TokenNameCOMMENT_LINE	Op.CHAR 
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
decomposeToSurrogates	TokenNameIdentifier	 decompose To Surrogates
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ac	TokenNameIdentifier	 ac
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ac	TokenNameIdentifier	 ac
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ac	TokenNameIdentifier	 ac
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringOptions	TokenNameIdentifier	 fixed String Options
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringTable	TokenNameIdentifier	 fixed String Table
=	TokenNameEQUAL	
new	TokenNamenew	
BMPattern	TokenNameIdentifier	 BM Pattern
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
,	TokenNameCOMMA	
256	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringOptions	TokenNameIdentifier	 fixed String Options
,	TokenNameCOMMA	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
PROHIBIT_FIXED_STRING_OPTIMIZATION	TokenNameIdentifier	 PROHIBIT  FIXED  STRING  OPTIMIZATION
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
FixedStringContainer	TokenNameIdentifier	 Fixed String Container
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
FixedStringContainer	TokenNameIdentifier	 Fixed String Container
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokentree	TokenNameIdentifier	 tokentree
.	TokenNameDOT	
findFixedString	TokenNameIdentifier	 find Fixed String
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
=	TokenNameEQUAL	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringOptions	TokenNameIdentifier	 fixed String Options
=	TokenNameEQUAL	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// This pattern has a fixed string of which length is more than one. 	TokenNameCOMMENT_LINE	This pattern has a fixed string of which length is more than one. 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringTable	TokenNameIdentifier	 fixed String Table
=	TokenNameEQUAL	
new	TokenNamenew	
BMPattern	TokenNameIdentifier	 BM Pattern
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
,	TokenNameCOMMA	
256	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringOptions	TokenNameIdentifier	 fixed String Options
,	TokenNameCOMMA	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"DEBUG: The longest fixed string: "	TokenNameStringLiteral	DEBUG: The longest fixed string: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
//+this.fixedString 	TokenNameCOMMENT_LINE	+this.fixedString 
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
createOptionString	TokenNameIdentifier	 create Option String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedStringOptions	TokenNameIdentifier	 fixed String Options
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"String: "	TokenNameStringLiteral	String: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
dumpString	TokenNameIdentifier	 dump String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fixedString	TokenNameIdentifier	 fixed String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An option. * If you specify this option, <span class="REGEX"><kbd>(</kbd><var>X</var><kbd>)</kbd></span> * captures matched text, and <span class="REGEX"><kbd>(:?</kbd><var>X</var><kbd>)</kbd></span> * does not capture. * * @see #RegularExpression(java.lang.String,int) * @see #setPattern(java.lang.String,int) static final int MARK_PARENS = 1<<0; */	TokenNameCOMMENT_JAVADOC	 An option. If you specify this option, <span class="REGEX"><kbd>(</kbd><var>X</var><kbd>)</kbd></span> captures matched text, and <span class="REGEX"><kbd>(:?</kbd><var>X</var><kbd>)</kbd></span> does not capture. * @see #RegularExpression(java.lang.String,int) @see #setPattern(java.lang.String,int) static final int MARK_PARENS = 1<<0; 
/** * "i" */	TokenNameCOMMENT_JAVADOC	 "i" 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IGNORE_CASE	TokenNameIdentifier	 IGNORE  CASE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * "s" */	TokenNameCOMMENT_JAVADOC	 "s" 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SINGLE_LINE	TokenNameIdentifier	 SINGLE  LINE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * "m" */	TokenNameCOMMENT_JAVADOC	 "m" 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MULTIPLE_LINES	TokenNameIdentifier	 MULTIPLE  LINES
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * "x" */	TokenNameCOMMENT_JAVADOC	 "x" 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXTENDED_COMMENT	TokenNameIdentifier	 EXTENDED  COMMENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This option redefines <span class="REGEX"><kbd>\d \D \w \W \s \S</kbd></span>. * * @see #RegularExpression(java.lang.String,int) * @see #setPattern(java.lang.String,int) * @see #UNICODE_WORD_BOUNDARY */	TokenNameCOMMENT_JAVADOC	 This option redefines <span class="REGEX"><kbd>\d \D \w \W \s \S</kbd></span>. * @see #RegularExpression(java.lang.String,int) @see #setPattern(java.lang.String,int) @see #UNICODE_WORD_BOUNDARY 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
USE_UNICODE_CATEGORY	TokenNameIdentifier	 USE  UNICODE  CATEGORY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// "u" 	TokenNameCOMMENT_LINE	"u" 
/** * An option. * This enables to process locale-independent word boundary for <span class="REGEX"><kbd>\b \B \&lt; \></kbd></span>. * <p>By default, the engine considers a position between a word character * (<span class="REGEX"><Kbd>\w</kbd></span>) and a non word character * is a word boundary. * <p>By this option, the engine checks word boundaries with the method of * 'Unicode Regular Expression Guidelines' Revision 4. * * @see #RegularExpression(java.lang.String,int) * @see #setPattern(java.lang.String,int) */	TokenNameCOMMENT_JAVADOC	 An option. This enables to process locale-independent word boundary for <span class="REGEX"><kbd>\b \B \&lt; \></kbd></span>. <p>By default, the engine considers a position between a word character (<span class="REGEX"><Kbd>\w</kbd></span>) and a non word character is a word boundary. <p>By this option, the engine checks word boundaries with the method of 'Unicode Regular Expression Guidelines' Revision 4. * @see #RegularExpression(java.lang.String,int) @see #setPattern(java.lang.String,int) 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNICODE_WORD_BOUNDARY	TokenNameIdentifier	 UNICODE  WORD  BOUNDARY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// "w" 	TokenNameCOMMENT_LINE	"w" 
/** * "H" */	TokenNameCOMMENT_JAVADOC	 "H" 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PROHIBIT_HEAD_CHARACTER_OPTIMIZATION	TokenNameIdentifier	 PROHIBIT  HEAD  CHARACTER  OPTIMIZATION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * "F" */	TokenNameCOMMENT_JAVADOC	 "F" 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PROHIBIT_FIXED_STRING_OPTIMIZATION	TokenNameIdentifier	 PROHIBIT  FIXED  STRING  OPTIMIZATION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * "X". XML Schema mode. */	TokenNameCOMMENT_JAVADOC	 "X". XML Schema mode. 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * ",". */	TokenNameCOMMENT_JAVADOC	 ",". 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SPECIAL_COMMA	TokenNameIdentifier	 SPECIAL  COMMA
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
&	TokenNameAND	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new RegularExpression instance. * * @param regex A regular expression * @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax. */	TokenNameCOMMENT_JAVADOC	 Creates a new RegularExpression instance. * @param regex A regular expression @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax. 
public	TokenNamepublic	
RegularExpression	TokenNameIdentifier	 Regular Expression
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
regex	TokenNameIdentifier	 regex
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new RegularExpression instance with options. * * @param regex A regular expression * @param options A String consisted of "i" "m" "s" "u" "w" "," "X" * @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax. */	TokenNameCOMMENT_JAVADOC	 Creates a new RegularExpression instance with options. * @param regex A regular expression @param options A String consisted of "i" "m" "s" "u" "w" "," "X" @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax. 
public	TokenNamepublic	
RegularExpression	TokenNameIdentifier	 Regular Expression
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
regex	TokenNameIdentifier	 regex
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new RegularExpression instance with options. * * @param regex A regular expression * @param options A String consisted of "i" "m" "s" "u" "w" "," "X" * @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax. */	TokenNameCOMMENT_JAVADOC	 Creates a new RegularExpression instance with options. * @param regex A regular expression @param options A String consisted of "i" "m" "s" "u" "w" "," "X" @exception org.apache.xerces.utils.regex.ParseException <VAR>regex</VAR> is not conforming to the syntax. 
public	TokenNamepublic	
RegularExpression	TokenNameIdentifier	 Regular Expression
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
regex	TokenNameIdentifier	 regex
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
RegularExpression	TokenNameIdentifier	 Regular Expression
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
int	TokenNameint	
parens	TokenNameIdentifier	 parens
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasBackReferences	TokenNameIdentifier	 has Back References
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokentree	TokenNameIdentifier	 tokentree
=	TokenNameEQUAL	
tok	TokenNameIdentifier	 tok
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
=	TokenNameEQUAL	
parens	TokenNameIdentifier	 parens
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasBackReferences	TokenNameIdentifier	 has Back References
=	TokenNameEQUAL	
hasBackReferences	TokenNameIdentifier	 has Back References
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newPattern	TokenNameIdentifier	 new Pattern
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
newPattern	TokenNameIdentifier	 new Pattern
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newPattern	TokenNameIdentifier	 new Pattern
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
newPattern	TokenNameIdentifier	 new Pattern
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newPattern	TokenNameIdentifier	 new Pattern
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
=	TokenNameEQUAL	
newPattern	TokenNameIdentifier	 new Pattern
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
RegexParser	TokenNameIdentifier	 Regex Parser
rp	TokenNameIdentifier	 rp
=	TokenNameEQUAL	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
RegularExpression	TokenNameIdentifier	 Regular Expression
.	TokenNameDOT	
XMLSCHEMA_MODE	TokenNameIdentifier	 XMLSCHEMA  MODE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
ParserForXMLSchema	TokenNameIdentifier	 Parser For XML Schema
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
RegexParser	TokenNameIdentifier	 Regex Parser
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokentree	TokenNameIdentifier	 tokentree
=	TokenNameEQUAL	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
=	TokenNameEQUAL	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
parennumber	TokenNameIdentifier	 parennumber
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasBackReferences	TokenNameIdentifier	 has Back References
=	TokenNameEQUAL	
rp	TokenNameIdentifier	 rp
.	TokenNameDOT	
hasBackReferences	TokenNameIdentifier	 has Back References
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newPattern	TokenNameIdentifier	 new Pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
newPattern	TokenNameIdentifier	 new Pattern
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newPattern	TokenNameIdentifier	 new Pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
newPattern	TokenNameIdentifier	 new Pattern
,	TokenNameCOMMA	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
parseOptions	TokenNameIdentifier	 parse Options
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Represents this instence in String. */	TokenNameCOMMENT_JAVADOC	 Represents this instence in String. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
tokentree	TokenNameIdentifier	 tokentree
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a option string. * The order of letters in it may be different from a string specified * in a constructor or <code>setPattern()</code>. * * @see #RegularExpression(java.lang.String,java.lang.String) * @see #setPattern(java.lang.String,java.lang.String) */	TokenNameCOMMENT_JAVADOC	 Returns a option string. The order of letters in it may be different from a string specified in a constructor or <code>setPattern()</code>. * @see #RegularExpression(java.lang.String,java.lang.String) @see #setPattern(java.lang.String,java.lang.String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
createOptionString	TokenNameIdentifier	 create Option String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if patterns are the same and the options are equivalent. */	TokenNameCOMMENT_JAVADOC	 Return true if patterns are the same and the options are equivalent. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
RegularExpression	TokenNameIdentifier	 Regular Expression
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
RegularExpression	TokenNameIdentifier	 Regular Expression
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RegularExpression	TokenNameIdentifier	 Regular Expression
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
==	TokenNameEQUAL_EQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
options	TokenNameIdentifier	 options
==	TokenNameEQUAL_EQUAL	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getOptions	TokenNameIdentifier	 get Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of regular expression groups. * This method returns 1 when the regular expression has no capturing-parenthesis. * */	TokenNameCOMMENT_JAVADOC	 Return the number of regular expression groups. This method returns 1 when the regular expression has no capturing-parenthesis. 
public	TokenNamepublic	
int	TokenNameint	
getNumberOfGroups	TokenNameIdentifier	 get Number Of Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
nofparen	TokenNameIdentifier	 nofparen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WT_IGNORE	TokenNameIdentifier	 WT  IGNORE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WT_LETTER	TokenNameIdentifier	 WT  LETTER
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WT_OTHER	TokenNameIdentifier	 WT  OTHER
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
getWordType0	TokenNameIdentifier	 get Word Type0
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
opts	TokenNameIdentifier	 opts
,	TokenNameCOMMA	
UNICODE_WORD_BOUNDARY	TokenNameIdentifier	 UNICODE  WORD  BOUNDARY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
opts	TokenNameIdentifier	 opts
,	TokenNameCOMMA	
USE_UNICODE_CATEGORY	TokenNameIdentifier	 USE  UNICODE  CATEGORY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
"IsWord"	TokenNameStringLiteral	IsWord
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
WT_LETTER	TokenNameIdentifier	 WT  LETTER
:	TokenNameCOLON	
WT_OTHER	TokenNameIdentifier	 WT  OTHER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isWordChar	TokenNameIdentifier	 is Word Char
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
?	TokenNameQUESTION	
WT_LETTER	TokenNameIdentifier	 WT  LETTER
:	TokenNameCOLON	
WT_OTHER	TokenNameIdentifier	 WT  OTHER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
UPPERCASE_LETTER	TokenNameIdentifier	 UPPERCASE  LETTER
:	TokenNameCOLON	
// L 	TokenNameCOMMENT_LINE	L 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
LOWERCASE_LETTER	TokenNameIdentifier	 LOWERCASE  LETTER
:	TokenNameCOLON	
// L 	TokenNameCOMMENT_LINE	L 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
TITLECASE_LETTER	TokenNameIdentifier	 TITLECASE  LETTER
:	TokenNameCOLON	
// L 	TokenNameCOMMENT_LINE	L 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MODIFIER_LETTER	TokenNameIdentifier	 MODIFIER  LETTER
:	TokenNameCOLON	
// L 	TokenNameCOMMENT_LINE	L 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
OTHER_LETTER	TokenNameIdentifier	 OTHER  LETTER
:	TokenNameCOLON	
// L 	TokenNameCOMMENT_LINE	L 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
LETTER_NUMBER	TokenNameIdentifier	 LETTER  NUMBER
:	TokenNameCOLON	
// N 	TokenNameCOMMENT_LINE	N 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
DECIMAL_DIGIT_NUMBER	TokenNameIdentifier	 DECIMAL  DIGIT  NUMBER
:	TokenNameCOLON	
// N 	TokenNameCOMMENT_LINE	N 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
OTHER_NUMBER	TokenNameIdentifier	 OTHER  NUMBER
:	TokenNameCOLON	
// N 	TokenNameCOMMENT_LINE	N 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
COMBINING_SPACING_MARK	TokenNameIdentifier	 COMBINING  SPACING  MARK
:	TokenNameCOLON	
// Mc 	TokenNameCOMMENT_LINE	Mc 
return	TokenNamereturn	
WT_LETTER	TokenNameIdentifier	 WT  LETTER
;	TokenNameSEMICOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
FORMAT	TokenNameIdentifier	 FORMAT
:	TokenNameCOLON	
// Cf 	TokenNameCOMMENT_LINE	Cf 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
NON_SPACING_MARK	TokenNameIdentifier	 NON  SPACING  MARK
:	TokenNameCOLON	
// Mn 	TokenNameCOMMENT_LINE	Mn 
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
ENCLOSING_MARK	TokenNameIdentifier	 ENCLOSING  MARK
:	TokenNameCOLON	
// Mc 	TokenNameCOMMENT_LINE	Mc 
return	TokenNamereturn	
WT_IGNORE	TokenNameIdentifier	 WT  IGNORE
;	TokenNameSEMICOLON	
case	TokenNamecase	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
CONTROL	TokenNameIdentifier	 CONTROL
:	TokenNameCOLON	
// Cc 	TokenNameCOMMENT_LINE	Cc 
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'\t'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'\r'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
WT_OTHER	TokenNameIdentifier	 WT  OTHER
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
WT_IGNORE	TokenNameIdentifier	 WT  IGNORE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
WT_OTHER	TokenNameIdentifier	 WT  OTHER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LINE_FEED	TokenNameIdentifier	 LINE  FEED
=	TokenNameEQUAL	
0x000A	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CARRIAGE_RETURN	TokenNameIdentifier	 CARRIAGE  RETURN
=	TokenNameEQUAL	
0x000D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LINE_SEPARATOR	TokenNameIdentifier	 LINE  SEPARATOR
=	TokenNameEQUAL	
0x2028	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PARAGRAPH_SEPARATOR	TokenNameIdentifier	 PARAGRAPH  SEPARATOR
=	TokenNameEQUAL	
0x2029	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isEOLChar	TokenNameIdentifier	 is EOL Char
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
LINE_FEED	TokenNameIdentifier	 LINE  FEED
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
CARRIAGE_RETURN	TokenNameIdentifier	 CARRIAGE  RETURN
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
LINE_SEPARATOR	TokenNameIdentifier	 LINE  SEPARATOR
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
PARAGRAPH_SEPARATOR	TokenNameIdentifier	 PARAGRAPH  SEPARATOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isWordChar	TokenNameIdentifier	 is Word Char
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Legacy word characters 	TokenNameCOMMENT_LINE	Legacy word characters 
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
matchIgnoreCase	TokenNameIdentifier	 match Ignore Case
(	TokenNameLPAREN	
int	TokenNameint	
chardata	TokenNameIdentifier	 chardata
,	TokenNameCOMMA	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chardata	TokenNameIdentifier	 chardata
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chardata	TokenNameIdentifier	 chardata
>	TokenNameGREATER	
0xffff	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
uch1	TokenNameIdentifier	 uch1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
chardata	TokenNameIdentifier	 chardata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
uch2	TokenNameIdentifier	 uch2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
==	TokenNameEQUAL_EQUAL	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch1	TokenNameIdentifier	 uch1
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
uch2	TokenNameIdentifier	 uch2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
