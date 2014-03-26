/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeCounter.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeCounter.java 468651 2006-10-28 07:04:25Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
DOM	TokenNameIdentifier	 DOM
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
Translet	TokenNameIdentifier	 Translet
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
Axis	TokenNameIdentifier	 Axis
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
NodeCounter	TokenNameIdentifier	 Node Counter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
END	TokenNameIdentifier	 END
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
DOM	TokenNameIdentifier	 DOM
.	TokenNameDOT	
FIRST_TYPE	TokenNameIdentifier	 FIRST  TYPE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
_value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
DOM	TokenNameIdentifier	 DOM
_document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
_iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Translet	TokenNameIdentifier	 Translet
_translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_lang	TokenNameIdentifier	 lang
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_letterValue	TokenNameIdentifier	 letter Value
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
_groupSep	TokenNameIdentifier	 group Sep
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_groupSize	TokenNameIdentifier	 group Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_separFirst	TokenNameIdentifier	 separ First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_separLast	TokenNameIdentifier	 separ Last
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
_separToks	TokenNameIdentifier	 separ Toks
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
_formatToks	TokenNameIdentifier	 format Toks
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_nSepars	TokenNameIdentifier	 n Separs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_nFormats	TokenNameIdentifier	 n Formats
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
Thousands	TokenNameIdentifier	 Thousands
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"m"	TokenNameStringLiteral	m
,	TokenNameCOMMA	
"mm"	TokenNameStringLiteral	mm
,	TokenNameCOMMA	
"mmm"	TokenNameStringLiteral	mmm
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
Hundreds	TokenNameIdentifier	 Hundreds
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"cc"	TokenNameStringLiteral	cc
,	TokenNameCOMMA	
"ccc"	TokenNameStringLiteral	ccc
,	TokenNameCOMMA	
"cd"	TokenNameStringLiteral	cd
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
"dc"	TokenNameStringLiteral	dc
,	TokenNameCOMMA	
"dcc"	TokenNameStringLiteral	dcc
,	TokenNameCOMMA	
"dccc"	TokenNameStringLiteral	dccc
,	TokenNameCOMMA	
"cm"	TokenNameStringLiteral	cm
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
Tens	TokenNameIdentifier	 Tens
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"x"	TokenNameStringLiteral	x
,	TokenNameCOMMA	
"xx"	TokenNameStringLiteral	xx
,	TokenNameCOMMA	
"xxx"	TokenNameStringLiteral	xxx
,	TokenNameCOMMA	
"xl"	TokenNameStringLiteral	xl
,	TokenNameCOMMA	
"l"	TokenNameStringLiteral	l
,	TokenNameCOMMA	
"lx"	TokenNameStringLiteral	lx
,	TokenNameCOMMA	
"lxx"	TokenNameStringLiteral	lxx
,	TokenNameCOMMA	
"lxxx"	TokenNameStringLiteral	lxxx
,	TokenNameCOMMA	
"xc"	TokenNameStringLiteral	xc
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
Ones	TokenNameIdentifier	 Ones
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
"ii"	TokenNameStringLiteral	ii
,	TokenNameCOMMA	
"iii"	TokenNameStringLiteral	iii
,	TokenNameCOMMA	
"iv"	TokenNameStringLiteral	iv
,	TokenNameCOMMA	
"v"	TokenNameStringLiteral	v
,	TokenNameCOMMA	
"vi"	TokenNameStringLiteral	vi
,	TokenNameCOMMA	
"vii"	TokenNameStringLiteral	vii
,	TokenNameCOMMA	
"viii"	TokenNameStringLiteral	viii
,	TokenNameCOMMA	
"ix"	TokenNameStringLiteral	ix
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
_tempBuffer	TokenNameIdentifier	 temp Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
NodeCounter	TokenNameIdentifier	 Node Counter
(	TokenNameLPAREN	
Translet	TokenNameIdentifier	 Translet
translet	TokenNameIdentifier	 translet
,	TokenNameCOMMA	
DOM	TokenNameIdentifier	 DOM
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
translet	TokenNameIdentifier	 translet
;	TokenNameSEMICOLON	
_document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
_iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the start node for this counter. The same <tt>NodeCounter</tt> * object can be used multiple times by resetting the starting node. */	TokenNameCOMMENT_JAVADOC	 Set the start node for this counter. The same <tt>NodeCounter</tt> object can be used multiple times by resetting the starting node. 
abstract	TokenNameabstract	
public	TokenNamepublic	
NodeCounter	TokenNameIdentifier	 Node Counter
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If the user specified a value attribute, use this instead of * counting nodes. */	TokenNameCOMMENT_JAVADOC	 If the user specified a value attribute, use this instead of counting nodes. 
public	TokenNamepublic	
NodeCounter	TokenNameIdentifier	 Node Counter
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets formatting fields before calling formatNumbers(). */	TokenNameCOMMENT_JAVADOC	 Sets formatting fields before calling formatNumbers(). 
protected	TokenNameprotected	
void	TokenNamevoid	
setFormatting	TokenNameIdentifier	 set Formatting
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
letterValue	TokenNameIdentifier	 letter Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupSep	TokenNameIdentifier	 group Sep
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupSize	TokenNameIdentifier	 group Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_lang	TokenNameIdentifier	 lang
=	TokenNameEQUAL	
lang	TokenNameIdentifier	 lang
;	TokenNameSEMICOLON	
_groupSep	TokenNameIdentifier	 group Sep
=	TokenNameEQUAL	
groupSep	TokenNameIdentifier	 group Sep
;	TokenNameSEMICOLON	
_letterValue	TokenNameIdentifier	 letter Value
=	TokenNameEQUAL	
letterValue	TokenNameIdentifier	 letter Value
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
_groupSize	TokenNameIdentifier	 group Size
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
groupSize	TokenNameIdentifier	 group Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_groupSize	TokenNameIdentifier	 group Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setTokens	TokenNameIdentifier	 set Tokens
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// format == null assumed here 	TokenNameCOMMENT_LINE	format == null assumed here 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
setTokens	TokenNameIdentifier	 set Tokens
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
_format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// has already been set 	TokenNameCOMMENT_LINE	has already been set 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
// reset 	TokenNameCOMMENT_LINE	reset 
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
_separFirst	TokenNameIdentifier	 separ First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
_separLast	TokenNameIdentifier	 separ Last
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
_nSepars	TokenNameIdentifier	 n Separs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_nFormats	TokenNameIdentifier	 n Formats
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_separToks	TokenNameIdentifier	 separ Toks
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_formatToks	TokenNameIdentifier	 format Toks
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Tokenize the format string into alphanumeric and non-alphanumeric * tokens as described in M. Kay page 241. */	TokenNameCOMMENT_BLOCK	 Tokenize the format string into alphanumeric and non-alphanumeric tokens as described in M. Kay page 241. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isFirst	TokenNameIdentifier	 is First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_separToks	TokenNameIdentifier	 separ Toks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
_separFirst	TokenNameIdentifier	 separ First
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_formatToks	TokenNameIdentifier	 format Toks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
!	TokenNameNOT	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_separToks	TokenNameIdentifier	 separ Toks
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_nSepars	TokenNameIdentifier	 n Separs
=	TokenNameEQUAL	
_separToks	TokenNameIdentifier	 separ Toks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nFormats	TokenNameIdentifier	 n Formats
=	TokenNameEQUAL	
_formatToks	TokenNameIdentifier	 format Toks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_nSepars	TokenNameIdentifier	 n Separs
>	TokenNameGREATER	
_nFormats	TokenNameIdentifier	 n Formats
)	TokenNameRPAREN	
_separLast	TokenNameIdentifier	 separ Last
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_separFirst	TokenNameIdentifier	 separ First
)	TokenNameRPAREN	
_nSepars	TokenNameIdentifier	 n Separs
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_separLast	TokenNameIdentifier	 separ Last
)	TokenNameRPAREN	
_nSepars	TokenNameIdentifier	 n Separs
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_nSepars	TokenNameIdentifier	 n Separs
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_separToks	TokenNameIdentifier	 separ Toks
.	TokenNameDOT	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nSepars	TokenNameIdentifier	 n Separs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_separFirst	TokenNameIdentifier	 separ First
)	TokenNameRPAREN	
_nSepars	TokenNameIdentifier	 n Separs
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets formatting fields to their default values. */	TokenNameCOMMENT_JAVADOC	 Sets formatting fields to their default values. 
public	TokenNamepublic	
NodeCounter	TokenNameIdentifier	 Node Counter
setDefaultFormatting	TokenNameIdentifier	 set Default Formatting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFormatting	TokenNameIdentifier	 set Formatting
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
"en"	TokenNameStringLiteral	en
,	TokenNameCOMMA	
"alphabetic"	TokenNameStringLiteral	alphabetic
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of <tt>node</tt> according to the level and * the from and count patterns. */	TokenNameCOMMENT_JAVADOC	 Returns the position of <tt>node</tt> according to the level and the from and count patterns. 
abstract	TokenNameabstract	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCounter	TokenNameIdentifier	 get Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the position of <tt>node</tt> according to the level and * the from and count patterns. This position is converted into a * string based on the arguments passed. */	TokenNameCOMMENT_JAVADOC	 Returns the position of <tt>node</tt> according to the level and the from and count patterns. This position is converted into a string based on the arguments passed. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCounter	TokenNameIdentifier	 get Counter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
letterValue	TokenNameIdentifier	 letter Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupSep	TokenNameIdentifier	 group Sep
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
groupSize	TokenNameIdentifier	 group Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setFormatting	TokenNameIdentifier	 set Formatting
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
letterValue	TokenNameIdentifier	 letter Value
,	TokenNameCOMMA	
groupSep	TokenNameIdentifier	 group Sep
,	TokenNameCOMMA	
groupSize	TokenNameIdentifier	 group Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getCounter	TokenNameIdentifier	 get Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if <tt>node</tt> matches the count pattern. By * default a node matches the count patterns if it is of the * same type as the starting node. */	TokenNameCOMMENT_JAVADOC	 Returns true if <tt>node</tt> matches the count pattern. By default a node matches the count patterns if it is of the same type as the starting node. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchesCount	TokenNameIdentifier	 matches Count
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
_document	TokenNameIdentifier	 document
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if <tt>node</tt> matches the from pattern. By default, * no node matches the from pattern. */	TokenNameCOMMENT_JAVADOC	 Returns true if <tt>node</tt> matches the from pattern. By default, no node matches the from pattern. 
public	TokenNamepublic	
boolean	TokenNameboolean	
matchesFrom	TokenNameIdentifier	 matches From
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format a single value according to the format parameters. */	TokenNameCOMMENT_JAVADOC	 Format a single value according to the format parameters. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
formatNumbers	TokenNameIdentifier	 format Numbers
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
formatNumbers	TokenNameIdentifier	 format Numbers
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format a sequence of values according to the format paramaters * set by calling setFormatting(). */	TokenNameCOMMENT_JAVADOC	 Format a sequence of values according to the format paramaters set by calling setFormatting(). 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
formatNumbers	TokenNameIdentifier	 format Numbers
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
nValues	TokenNameIdentifier	 n Values
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
_format	TokenNameIdentifier	 format
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
=	TokenNameEQUAL	
true	TokenNametrue	
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
nValues	TokenNameIdentifier	 n Values
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
isEmpty	TokenNameIdentifier	 is Empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEmpty	TokenNameIdentifier	 is Empty
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Format the output string using the values array and the fmt. tokens 	TokenNameCOMMENT_LINE	Format the output string using the values array and the fmt. tokens 
boolean	TokenNameboolean	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_tempBuffer	TokenNameIdentifier	 temp Buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
_tempBuffer	TokenNameIdentifier	 temp Buffer
;	TokenNameSEMICOLON	
// Append separation token before first digit/letter/numeral 	TokenNameCOMMENT_LINE	Append separation token before first digit/letter/numeral 
if	TokenNameif	
(	TokenNameLPAREN	
_separFirst	TokenNameIdentifier	 separ First
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_separToks	TokenNameIdentifier	 separ Toks
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Append next digit/letter/numeral and separation token 	TokenNameCOMMENT_LINE	Append next digit/letter/numeral and separation token 
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
nValues	TokenNameIdentifier	 n Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isFirst	TokenNameIdentifier	 is First
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_separToks	TokenNameIdentifier	 separ Toks
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatValue	TokenNameIdentifier	 format Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_formatToks	TokenNameIdentifier	 format Toks
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
_nFormats	TokenNameIdentifier	 n Formats
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
>=	TokenNameGREATER_EQUAL	
_nSepars	TokenNameIdentifier	 n Separs
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
isFirst	TokenNameIdentifier	 is First
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Append separation token after last digit/letter/numeral 	TokenNameCOMMENT_LINE	Append separation token after last digit/letter/numeral 
if	TokenNameif	
(	TokenNameLPAREN	
_separLast	TokenNameIdentifier	 separ Last
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_separToks	TokenNameIdentifier	 separ Toks
.	TokenNameDOT	
lastElement	TokenNameIdentifier	 last Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Format a single value based on the appropriate formatting token. * This method is based on saxon (Michael Kay) and only implements * lang="en". */	TokenNameCOMMENT_JAVADOC	 Format a single value based on the appropriate formatting token. This method is based on saxon (Michael Kay) and only implements lang="en". 
private	TokenNameprivate	
void	TokenNamevoid	
formatValue	TokenNameIdentifier	 format Value
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
zero	TokenNameIdentifier	 zero
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
getNumericValue	TokenNameIdentifier	 get Numeric Value
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_groupSize	TokenNameIdentifier	 group Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
zero	TokenNameIdentifier	 zero
+	TokenNamePLUS	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
/	TokenNameDIVIDE	
10	TokenNameIntegerLiteral	
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
format	TokenNameIdentifier	 format
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
zero	TokenNameIdentifier	 zero
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_groupSize	TokenNameIdentifier	 group Size
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
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
_groupSize	TokenNameIdentifier	 group Size
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_groupSep	TokenNameIdentifier	 group Sep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'i'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
_letterValue	TokenNameIdentifier	 letter Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"alphabetic"	TokenNameStringLiteral	alphabetic
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
romanValue	TokenNameIdentifier	 roman Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'I'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
_letterValue	TokenNameIdentifier	 letter Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"alphabetic"	TokenNameStringLiteral	alphabetic
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
romanValue	TokenNameIdentifier	 roman Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
// Special case for Greek alphabet 	TokenNameCOMMENT_LINE	Special case for Greek alphabet 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
0x3b1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
0x3c9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0x3c9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// omega 	TokenNameCOMMENT_LINE	omega 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// General case: search for end of group 	TokenNameCOMMENT_LINE	General case: search for end of group 
while	TokenNamewhile	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetterOrDigit	TokenNameIdentifier	 is Letter Or Digit
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
alphaValue	TokenNameIdentifier	 alpha Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
alphaValue	TokenNameIdentifier	 alpha Value
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
-	TokenNameMINUS	
min	TokenNameIdentifier	 min
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
+	TokenNamePLUS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
alphaValue	TokenNameIdentifier	 alpha Value
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
range	TokenNameIdentifier	 range
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
+	TokenNamePLUS	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
romanValue	TokenNameIdentifier	 roman Value
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
4000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Thousands	TokenNameIdentifier	 Thousands
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
Hundreds	TokenNameIdentifier	 Hundreds
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
/	TokenNameDIVIDE	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
Tens	TokenNameIdentifier	 Tens
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
/	TokenNameDIVIDE	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
Ones	TokenNameIdentifier	 Ones
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
%	TokenNameREMAINDER	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
