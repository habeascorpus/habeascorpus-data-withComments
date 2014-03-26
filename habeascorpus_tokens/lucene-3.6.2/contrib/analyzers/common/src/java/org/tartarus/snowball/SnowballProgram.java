/* Copyright (c) 2001, Dr Martin Porter Copyright (c) 2002, Richard Boulton All rights reserved. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: * Redistributions of source code must retain the above copyright notice, * this list of conditions and the following disclaimer. * Redistributions in binary form must reproduce the above copyright * notice, this list of conditions and the following disclaimer in the * documentation and/or other materials provided with the distribution. * Neither the name of the copyright holders nor the names of its contributors * may be used to endorse or promote products derived from this software * without specific prior written permission. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2001, Dr Martin Porter Copyright (c) 2002, Richard Boulton All rights reserved. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. Neither the name of the copyright holders nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
tartarus	TokenNameIdentifier	 tartarus
.	TokenNameDOT	
snowball	TokenNameIdentifier	 snowball
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayUtil	TokenNameIdentifier	 Array Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
;	TokenNameSEMICOLON	
/** * This is the rev 502 of the Snowball SVN trunk, * but modified: * made abstract and introduced abstract method stem to avoid expensive reflection in filter class. * refactored StringBuffers to StringBuilder * uses char[] as buffer instead of StringBuffer/StringBuilder * eq_s,eq_s_b,insert,replace_s take CharSequence like eq_v and eq_v_b * reflection calls (Lovins, etc) use EMPTY_ARGS/EMPTY_PARAMS */	TokenNameCOMMENT_JAVADOC	 This is the rev 502 of the Snowball SVN trunk, but modified: made abstract and introduced abstract method stem to avoid expensive reflection in filter class. refactored StringBuffers to StringBuilder uses char[] as buffer instead of StringBuffer/StringBuilder eq_s,eq_s_b,insert,replace_s take CharSequence like eq_v and eq_v_b reflection calls (Lovins, etc) use EMPTY_ARGS/EMPTY_PARAMS 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SnowballProgram	TokenNameIdentifier	 Snowball Program
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_ARGS	TokenNameIdentifier	 EMPTY  ARGS
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SnowballProgram	TokenNameIdentifier	 Snowball Program
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
setCurrent	TokenNameIdentifier	 set Current
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the current string. */	TokenNameCOMMENT_JAVADOC	 Set the current string. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrent	TokenNameIdentifier	 set Current
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
limit_backward	TokenNameIdentifier	 limit backward
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bra	TokenNameIdentifier	 bra
=	TokenNameEQUAL	
cursor	TokenNameIdentifier	 cursor
;	TokenNameSEMICOLON	
ket	TokenNameIdentifier	 ket
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current string. */	TokenNameCOMMENT_JAVADOC	 Get the current string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCurrent	TokenNameIdentifier	 get Current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current string. * @param text character array containing input * @param length valid length of text. */	TokenNameCOMMENT_JAVADOC	 Set the current string. @param text character array containing input @param length valid length of text. 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrent	TokenNameIdentifier	 set Current
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
limit_backward	TokenNameIdentifier	 limit backward
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bra	TokenNameIdentifier	 bra
=	TokenNameEQUAL	
cursor	TokenNameIdentifier	 cursor
;	TokenNameSEMICOLON	
ket	TokenNameIdentifier	 ket
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current buffer containing the stem. * <p> * NOTE: this may be a reference to a different character array than the * one originally provided with setCurrent, in the exceptional case that * stemming produced a longer intermediate or result string. * </p> * <p> * It is necessary to use {@link #getCurrentBufferLength()} to determine * the valid length of the returned buffer. For example, many words are * stemmed simply by subtracting from the length to remove suffixes. * </p> * @see #getCurrentBufferLength() */	TokenNameCOMMENT_JAVADOC	 Get the current buffer containing the stem. <p> NOTE: this may be a reference to a different character array than the one originally provided with setCurrent, in the exceptional case that stemming produced a longer intermediate or result string. </p> <p> It is necessary to use {@link #getCurrentBufferLength()} to determine the valid length of the returned buffer. For example, many words are stemmed simply by subtracting from the length to remove suffixes. </p> @see #getCurrentBufferLength() 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCurrentBuffer	TokenNameIdentifier	 get Current Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the valid length of the character array in * {@link #getCurrentBuffer()}. * @return valid length of the array. */	TokenNameCOMMENT_JAVADOC	 Get the valid length of the character array in {@link #getCurrentBuffer()}. @return valid length of the array. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentBufferLength	TokenNameIdentifier	 get Current Buffer Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// current string 	TokenNameCOMMENT_LINE	current string 
private	TokenNameprivate	
char	TokenNamechar	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
cursor	TokenNameIdentifier	 cursor
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
limit_backward	TokenNameIdentifier	 limit backward
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
bra	TokenNameIdentifier	 bra
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
ket	TokenNameIdentifier	 ket
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
copy_from	TokenNameIdentifier	 copy from
(	TokenNameLPAREN	
SnowballProgram	TokenNameIdentifier	 Snowball Program
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
;	TokenNameSEMICOLON	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
limit_backward	TokenNameIdentifier	 limit backward
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
limit_backward	TokenNameIdentifier	 limit backward
;	TokenNameSEMICOLON	
bra	TokenNameIdentifier	 bra
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bra	TokenNameIdentifier	 bra
;	TokenNameSEMICOLON	
ket	TokenNameIdentifier	 ket
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ket	TokenNameIdentifier	 ket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
in_grouping	TokenNameIdentifier	 in grouping
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
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
cursor	TokenNameIdentifier	 cursor
>=	TokenNameGREATER_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
-=	TokenNameMINUS_EQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
0X1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0X7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
in_grouping_b	TokenNameIdentifier	 in grouping b
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
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
cursor	TokenNameIdentifier	 cursor
<=	TokenNameLESS_EQUAL	
limit_backward	TokenNameIdentifier	 limit backward
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
-=	TokenNameMINUS_EQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
0X1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0X7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
out_grouping	TokenNameIdentifier	 out grouping
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
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
cursor	TokenNameIdentifier	 cursor
>=	TokenNameGREATER_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
-=	TokenNameMINUS_EQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
0X1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0X7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
out_grouping_b	TokenNameIdentifier	 out grouping b
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
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
cursor	TokenNameIdentifier	 cursor
<=	TokenNameLESS_EQUAL	
limit_backward	TokenNameIdentifier	 limit backward
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
-=	TokenNameMINUS_EQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
(	TokenNameLPAREN	
0X1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
&	TokenNameAND	
0X7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
in_range	TokenNameIdentifier	 in range
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
>=	TokenNameGREATER_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
in_range_b	TokenNameIdentifier	 in range b
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
<=	TokenNameLESS_EQUAL	
limit_backward	TokenNameIdentifier	 limit backward
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
out_range	TokenNameIdentifier	 out range
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
>=	TokenNameGREATER_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
out_range_b	TokenNameIdentifier	 out range b
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
<=	TokenNameLESS_EQUAL	
limit_backward	TokenNameIdentifier	 limit backward
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
cursor	TokenNameIdentifier	 cursor
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
eq_s	TokenNameIdentifier	 eq s
(	TokenNameLPAREN	
int	TokenNameint	
s_size	TokenNameIdentifier	 s size
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
cursor	TokenNameIdentifier	 cursor
<	TokenNameLESS	
s_size	TokenNameIdentifier	 s size
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cursor	TokenNameIdentifier	 cursor
+=	TokenNamePLUS_EQUAL	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated for binary back compat. Will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated for binary back compat. Will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
boolean	TokenNameboolean	
eq_s	TokenNameIdentifier	 eq s
(	TokenNameLPAREN	
int	TokenNameint	
s_size	TokenNameIdentifier	 s size
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq_s	TokenNameIdentifier	 eq s
(	TokenNameLPAREN	
s_size	TokenNameIdentifier	 s size
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
eq_s_b	TokenNameIdentifier	 eq s b
(	TokenNameLPAREN	
int	TokenNameint	
s_size	TokenNameIdentifier	 s size
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
-	TokenNameMINUS	
limit_backward	TokenNameIdentifier	 limit backward
<	TokenNameLESS	
s_size	TokenNameIdentifier	 s size
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
cursor	TokenNameIdentifier	 cursor
-	TokenNameMINUS	
s_size	TokenNameIdentifier	 s size
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cursor	TokenNameIdentifier	 cursor
-=	TokenNameMINUS_EQUAL	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated for binary back compat. Will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated for binary back compat. Will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
boolean	TokenNameboolean	
eq_s_b	TokenNameIdentifier	 eq s b
(	TokenNameLPAREN	
int	TokenNameint	
s_size	TokenNameIdentifier	 s size
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq_s_b	TokenNameIdentifier	 eq s b
(	TokenNameLPAREN	
s_size	TokenNameIdentifier	 s size
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
eq_v	TokenNameIdentifier	 eq v
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq_s	TokenNameIdentifier	 eq s
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated for binary back compat. Will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated for binary back compat. Will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
boolean	TokenNameboolean	
eq_v	TokenNameIdentifier	 eq v
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq_s	TokenNameIdentifier	 eq s
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
eq_v_b	TokenNameIdentifier	 eq v b
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq_s_b	TokenNameIdentifier	 eq s b
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated for binary back compat. Will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated for binary back compat. Will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
boolean	TokenNameboolean	
eq_v_b	TokenNameIdentifier	 eq v b
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq_s_b	TokenNameIdentifier	 eq s b
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
find_among	TokenNameIdentifier	 find among
(	TokenNameLPAREN	
Among	TokenNameIdentifier	 Among
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
v_size	TokenNameIdentifier	 v size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
v_size	TokenNameIdentifier	 v size
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
cursor	TokenNameIdentifier	 cursor
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
int	TokenNameint	
common_i	TokenNameIdentifier	 common i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
common_j	TokenNameIdentifier	 common j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
first_key_inspected	TokenNameIdentifier	 first key inspected
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
common	TokenNameIdentifier	 common
=	TokenNameEQUAL	
common_i	TokenNameIdentifier	 common i
<	TokenNameLESS	
common_j	TokenNameIdentifier	 common j
?	TokenNameQUESTION	
common_i	TokenNameIdentifier	 common i
:	TokenNameCOLON	
common_j	TokenNameIdentifier	 common j
;	TokenNameSEMICOLON	
// smaller 	TokenNameCOMMENT_LINE	smaller 
Among	TokenNameIdentifier	 Among
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i2	TokenNameIdentifier	 i2
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
common	TokenNameIdentifier	 common
;	TokenNameSEMICOLON	
i2	TokenNameIdentifier	 i2
<	TokenNameLESS	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
i2	TokenNameIdentifier	 i2
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
common	TokenNameIdentifier	 common
==	TokenNameEQUAL_EQUAL	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
common	TokenNameIdentifier	 common
]	TokenNameRBRACKET	
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
common_j	TokenNameIdentifier	 common j
=	TokenNameEQUAL	
common	TokenNameIdentifier	 common
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
common_i	TokenNameIdentifier	 common i
=	TokenNameEQUAL	
common	TokenNameIdentifier	 common
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// v->s has been inspected 	TokenNameCOMMENT_LINE	v->s has been inspected 
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// only one item in v 	TokenNameCOMMENT_LINE	only one item in v 
// - but now we need to go round once more to get 	TokenNameCOMMENT_LINE	- but now we need to go round once more to get 
// v->s inspected. This looks messy, but is actually 	TokenNameCOMMENT_LINE	v->s inspected. This looks messy, but is actually 
// the optimal approach. 	TokenNameCOMMENT_LINE	the optimal approach. 
if	TokenNameif	
(	TokenNameLPAREN	
first_key_inspected	TokenNameIdentifier	 first key inspected
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
first_key_inspected	TokenNameIdentifier	 first key inspected
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Among	TokenNameIdentifier	 Among
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
common_i	TokenNameIdentifier	 common i
>=	TokenNameGREATER_EQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s_size	TokenNameIdentifier	 s size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
method	TokenNameIdentifier	 method
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
resobj	TokenNameIdentifier	 resobj
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
methodobject	TokenNameIdentifier	 methodobject
,	TokenNameCOMMA	
EMPTY_ARGS	TokenNameIdentifier	 EMPTY  ARGS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
resobj	TokenNameIdentifier	 resobj
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// FIXME - debug message 	TokenNameCOMMENT_LINE	FIXME - debug message 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// FIXME - debug message 	TokenNameCOMMENT_LINE	FIXME - debug message 
}	TokenNameRBRACE	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
substring_i	TokenNameIdentifier	 substring i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// find_among_b is for backwards processing. Same comments apply 	TokenNameCOMMENT_LINE	find_among_b is for backwards processing. Same comments apply 
protected	TokenNameprotected	
int	TokenNameint	
find_among_b	TokenNameIdentifier	 find among b
(	TokenNameLPAREN	
Among	TokenNameIdentifier	 Among
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
v_size	TokenNameIdentifier	 v size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
v_size	TokenNameIdentifier	 v size
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
cursor	TokenNameIdentifier	 cursor
;	TokenNameSEMICOLON	
int	TokenNameint	
lb	TokenNameIdentifier	 lb
=	TokenNameEQUAL	
limit_backward	TokenNameIdentifier	 limit backward
;	TokenNameSEMICOLON	
int	TokenNameint	
common_i	TokenNameIdentifier	 common i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
common_j	TokenNameIdentifier	 common j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
first_key_inspected	TokenNameIdentifier	 first key inspected
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
common	TokenNameIdentifier	 common
=	TokenNameEQUAL	
common_i	TokenNameIdentifier	 common i
<	TokenNameLESS	
common_j	TokenNameIdentifier	 common j
?	TokenNameQUESTION	
common_i	TokenNameIdentifier	 common i
:	TokenNameCOLON	
common_j	TokenNameIdentifier	 common j
;	TokenNameSEMICOLON	
Among	TokenNameIdentifier	 Among
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i2	TokenNameIdentifier	 i2
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s_size	TokenNameIdentifier	 s size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
common	TokenNameIdentifier	 common
;	TokenNameSEMICOLON	
i2	TokenNameIdentifier	 i2
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i2	TokenNameIdentifier	 i2
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
common	TokenNameIdentifier	 common
==	TokenNameEQUAL_EQUAL	
lb	TokenNameIdentifier	 lb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
common	TokenNameIdentifier	 common
]	TokenNameRBRACKET	
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
i2	TokenNameIdentifier	 i2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
common	TokenNameIdentifier	 common
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
common_j	TokenNameIdentifier	 common j
=	TokenNameEQUAL	
common	TokenNameIdentifier	 common
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
common_i	TokenNameIdentifier	 common i
=	TokenNameEQUAL	
common	TokenNameIdentifier	 common
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first_key_inspected	TokenNameIdentifier	 first key inspected
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
first_key_inspected	TokenNameIdentifier	 first key inspected
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Among	TokenNameIdentifier	 Among
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
common_i	TokenNameIdentifier	 common i
>=	TokenNameGREATER_EQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s_size	TokenNameIdentifier	 s size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
method	TokenNameIdentifier	 method
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
resobj	TokenNameIdentifier	 resobj
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
method	TokenNameIdentifier	 method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
methodobject	TokenNameIdentifier	 methodobject
,	TokenNameCOMMA	
EMPTY_ARGS	TokenNameIdentifier	 EMPTY  ARGS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
resobj	TokenNameIdentifier	 resobj
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// FIXME - debug message 	TokenNameCOMMENT_LINE	FIXME - debug message 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// FIXME - debug message 	TokenNameCOMMENT_LINE	FIXME - debug message 
}	TokenNameRBRACE	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
s_size	TokenNameIdentifier	 s size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
substring_i	TokenNameIdentifier	 substring i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* to replace chars between c_bra and c_ket in current by the * chars in s. */	TokenNameCOMMENT_BLOCK	 to replace chars between c_bra and c_ket in current by the chars in s. 
protected	TokenNameprotected	
int	TokenNameint	
replace_s	TokenNameIdentifier	 replace s
(	TokenNameLPAREN	
int	TokenNameint	
c_bra	TokenNameIdentifier	 c bra
,	TokenNameCOMMA	
int	TokenNameint	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
adjustment	TokenNameIdentifier	 adjustment
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
c_ket	TokenNameIdentifier	 c ket
-	TokenNameMINUS	
c_bra	TokenNameIdentifier	 c bra
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
+	TokenNamePLUS	
adjustment	TokenNameIdentifier	 adjustment
;	TokenNameSEMICOLON	
//resize if necessary 	TokenNameCOMMENT_LINE	resize if necessary 
if	TokenNameif	
(	TokenNameLPAREN	
newLength	TokenNameIdentifier	 new Length
>	TokenNameGREATER	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
newBuffer	TokenNameIdentifier	 new Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
newLength	TokenNameIdentifier	 new Length
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newBuffer	TokenNameIdentifier	 new Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
newBuffer	TokenNameIdentifier	 new Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the substring being replaced is longer or shorter than the 	TokenNameCOMMENT_LINE	if the substring being replaced is longer or shorter than the 
// replacement, need to shift things around 	TokenNameCOMMENT_LINE	replacement, need to shift things around 
if	TokenNameif	
(	TokenNameLPAREN	
adjustment	TokenNameIdentifier	 adjustment
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
c_ket	TokenNameIdentifier	 c ket
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
c_bra	TokenNameIdentifier	 c bra
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
-	TokenNameMINUS	
c_ket	TokenNameIdentifier	 c ket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insert the replacement text 	TokenNameCOMMENT_LINE	insert the replacement text 
// Note, faster is s.getChars(0, s.length(), current, c_bra); 	TokenNameCOMMENT_LINE	Note, faster is s.getChars(0, s.length(), current, c_bra); 
// but would have to duplicate this method for both String and StringBuilder 	TokenNameCOMMENT_LINE	but would have to duplicate this method for both String and StringBuilder 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
c_bra	TokenNameIdentifier	 c bra
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
limit	TokenNameIdentifier	 limit
+=	TokenNamePLUS_EQUAL	
adjustment	TokenNameIdentifier	 adjustment
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
>=	TokenNameGREATER_EQUAL	
c_ket	TokenNameIdentifier	 c ket
)	TokenNameRPAREN	
cursor	TokenNameIdentifier	 cursor
+=	TokenNamePLUS_EQUAL	
adjustment	TokenNameIdentifier	 adjustment
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
>	TokenNameGREATER	
c_bra	TokenNameIdentifier	 c bra
)	TokenNameRPAREN	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
c_bra	TokenNameIdentifier	 c bra
;	TokenNameSEMICOLON	
return	TokenNamereturn	
adjustment	TokenNameIdentifier	 adjustment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated for binary back compat. Will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated for binary back compat. Will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
int	TokenNameint	
replace_s	TokenNameIdentifier	 replace s
(	TokenNameLPAREN	
int	TokenNameint	
c_bra	TokenNameIdentifier	 c bra
,	TokenNameCOMMA	
int	TokenNameint	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
replace_s	TokenNameIdentifier	 replace s
(	TokenNameLPAREN	
c_bra	TokenNameIdentifier	 c bra
,	TokenNameCOMMA	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
slice_check	TokenNameIdentifier	 slice check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bra	TokenNameIdentifier	 bra
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
bra	TokenNameIdentifier	 bra
>	TokenNameGREATER	
ket	TokenNameIdentifier	 ket
||	TokenNameOR_OR	
ket	TokenNameIdentifier	 ket
>	TokenNameGREATER	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"faulty slice operation"	TokenNameStringLiteral	faulty slice operation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// FIXME: report error somehow. 	TokenNameCOMMENT_LINE	FIXME: report error somehow. 
/* fprintf(stderr, "faulty slice operation:\n"); debug(z, -1, 0); exit(1); */	TokenNameCOMMENT_BLOCK	 fprintf(stderr, "faulty slice operation:\n"); debug(z, -1, 0); exit(1); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
slice_from	TokenNameIdentifier	 slice from
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slice_check	TokenNameIdentifier	 slice check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replace_s	TokenNameIdentifier	 replace s
(	TokenNameLPAREN	
bra	TokenNameIdentifier	 bra
,	TokenNameCOMMA	
ket	TokenNameIdentifier	 ket
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated for binary back compat. Will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated for binary back compat. Will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
slice_from	TokenNameIdentifier	 slice from
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slice_from	TokenNameIdentifier	 slice from
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated for binary back compat. Will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated for binary back compat. Will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
slice_from	TokenNameIdentifier	 slice from
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slice_from	TokenNameIdentifier	 slice from
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
slice_del	TokenNameIdentifier	 slice del
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slice_from	TokenNameIdentifier	 slice from
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
int	TokenNameint	
c_bra	TokenNameIdentifier	 c bra
,	TokenNameCOMMA	
int	TokenNameint	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
adjustment	TokenNameIdentifier	 adjustment
=	TokenNameEQUAL	
replace_s	TokenNameIdentifier	 replace s
(	TokenNameLPAREN	
c_bra	TokenNameIdentifier	 c bra
,	TokenNameCOMMA	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c_bra	TokenNameIdentifier	 c bra
<=	TokenNameLESS_EQUAL	
bra	TokenNameIdentifier	 bra
)	TokenNameRPAREN	
bra	TokenNameIdentifier	 bra
+=	TokenNamePLUS_EQUAL	
adjustment	TokenNameIdentifier	 adjustment
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c_bra	TokenNameIdentifier	 c bra
<=	TokenNameLESS_EQUAL	
ket	TokenNameIdentifier	 ket
)	TokenNameRPAREN	
ket	TokenNameIdentifier	 ket
+=	TokenNamePLUS_EQUAL	
adjustment	TokenNameIdentifier	 adjustment
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated for binary back compat. Will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated for binary back compat. Will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
int	TokenNameint	
c_bra	TokenNameIdentifier	 c bra
,	TokenNameCOMMA	
int	TokenNameint	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
c_bra	TokenNameIdentifier	 c bra
,	TokenNameCOMMA	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @deprecated for binary back compat. Will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated for binary back compat. Will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
int	TokenNameint	
c_bra	TokenNameIdentifier	 c bra
,	TokenNameCOMMA	
int	TokenNameint	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
StringBuilder	TokenNameIdentifier	 String Builder
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
c_bra	TokenNameIdentifier	 c bra
,	TokenNameCOMMA	
c_ket	TokenNameIdentifier	 c ket
,	TokenNameCOMMA	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Copy the slice into the supplied StringBuffer */	TokenNameCOMMENT_BLOCK	 Copy the slice into the supplied StringBuffer 
protected	TokenNameprotected	
StringBuilder	TokenNameIdentifier	 String Builder
slice_to	TokenNameIdentifier	 slice to
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slice_check	TokenNameIdentifier	 slice check
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
ket	TokenNameIdentifier	 ket
-	TokenNameMINUS	
bra	TokenNameIdentifier	 bra
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
bra	TokenNameIdentifier	 bra
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
StringBuilder	TokenNameIdentifier	 String Builder
assign_to	TokenNameIdentifier	 assign to
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* extern void debug(struct SN_env * z, int number, int line_count) { int i; int limit = SIZE(z->p); //if (number >= 0) printf("%3d (line %4d): '", number, line_count); if (number >= 0) printf("%3d (line %4d): [%d]'", number, line_count,limit); for (i = 0; i <= limit; i++) { if (z->lb == i) printf("{"); if (z->bra == i) printf("["); if (z->c == i) printf("|"); if (z->ket == i) printf("]"); if (z->l == i) printf("}"); if (i < limit) { int ch = z->p[i]; if (ch == 0) ch = '#'; printf("%c", ch); } } printf("'\n"); } */	TokenNameCOMMENT_BLOCK	 extern void debug(struct SN_env z, int number, int line_count) { int i; int limit = SIZE(z->p); //if (number >= 0) printf("%3d (line %4d): '", number, line_count); if (number >= 0) printf("%3d (line %4d): [%d]'", number, line_count,limit); for (i = 0; i <= limit; i++) { if (z->lb == i) printf("{"); if (z->bra == i) printf("["); if (z->c == i) printf("|"); if (z->ket == i) printf("]"); if (z->l == i) printf("}"); if (i < limit) { int ch = z->p[i]; if (ch == 0) ch = '#'; printf("%c", ch); } } printf("'\n"); } 
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
