/* Egothor Software License version 1.00 Copyright (C) 1997-2004 Leo Galambos. Copyright (C) 2002-2004 "Egothor developers" on behalf of the Egothor Project. All rights reserved. This software is copyrighted by the "Egothor developers". If this license applies to a single file or document, the "Egothor developers" are the people or entities mentioned as copyright holders in that file or document. If this license applies to the Egothor project as a whole, the copyright holders are the people or entities mentioned in the file CREDITS. This file can be found in the same location as this license in the distribution. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: 1. Redistributions of source code must retain the above copyright notice, the list of contributors, this list of conditions, and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, the list of contributors, this list of conditions, and the disclaimer that follows these conditions in the documentation and/or other materials provided with the distribution. 3. The name "Egothor" must not be used to endorse or promote products derived from this software without prior written permission. For written permission, please contact Leo.G@seznam.cz 4. Products derived from this software may not be called "Egothor", nor may "Egothor" appear in their name, without prior written permission from Leo.G@seznam.cz. In addition, we request that you include in the end-user documentation provided with the redistribution and/or in the software itself an acknowledgement equivalent to the following: "This product includes software developed by the Egothor Project. http://egothor.sf.net/" THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE EGOTHOR PROJECT OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. This software consists of voluntary contributions made by many individuals on behalf of the Egothor Project and was originally created by Leo Galambos (Leo.G@seznam.cz). */	TokenNameCOMMENT_BLOCK	 Egothor Software License version 1.00 Copyright (C) 1997-2004 Leo Galambos. Copyright (C) 2002-2004 "Egothor developers" on behalf of the Egothor Project. All rights reserved. This software is copyrighted by the "Egothor developers". If this license applies to a single file or document, the "Egothor developers" are the people or entities mentioned as copyright holders in that file or document. If this license applies to the Egothor project as a whole, the copyright holders are the people or entities mentioned in the file CREDITS. This file can be found in the same location as this license in the distribution. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: 1. Redistributions of source code must retain the above copyright notice, the list of contributors, this list of conditions, and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, the list of contributors, this list of conditions, and the disclaimer that follows these conditions in the documentation and/or other materials provided with the distribution. 3. The name "Egothor" must not be used to endorse or promote products derived from this software without prior written permission. For written permission, please contact Leo.G@seznam.cz 4. Products derived from this software may not be called "Egothor", nor may "Egothor" appear in their name, without prior written permission from Leo.G@seznam.cz. In addition, we request that you include in the end-user documentation provided with the redistribution and/or in the software itself an acknowledgement equivalent to the following: "This product includes software developed by the Egothor Project. http://egothor.sf.net/" THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE EGOTHOR PROJECT OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. This software consists of voluntary contributions made by many individuals on behalf of the Egothor Project and was originally created by Leo Galambos (Leo.G@seznam.cz). 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
egothor	TokenNameIdentifier	 egothor
.	TokenNameDOT	
stemmer	TokenNameIdentifier	 stemmer
;	TokenNameSEMICOLON	
/** * The Diff object generates a patch string. * <p> * A patch string is actually a command to a stemmer telling it how to reduce a * word to its root. For example, to reduce the word teacher to its root teach * the patch string Db would be generated. This command tells the stemmer to * delete the last 2 characters from the word teacher to reach the stem (the * patch commands are applied starting from the last character in order to save */	TokenNameCOMMENT_JAVADOC	 The Diff object generates a patch string. <p> A patch string is actually a command to a stemmer telling it how to reduce a word to its root. For example, to reduce the word teacher to its root teach the patch string Db would be generated. This command tells the stemmer to delete the last 2 characters from the word teacher to reach the stem (the patch commands are applied starting from the last character in order to save 
public	TokenNamepublic	
class	TokenNameclass	
Diff	TokenNameIdentifier	 Diff
{	TokenNameLBRACE	
int	TokenNameint	
sizex	TokenNameIdentifier	 sizex
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sizey	TokenNameIdentifier	 sizey
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
net	TokenNameIdentifier	 net
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
way	TokenNameIdentifier	 way
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
INSERT	TokenNameIdentifier	 INSERT
;	TokenNameSEMICOLON	
int	TokenNameint	
DELETE	TokenNameIdentifier	 DELETE
;	TokenNameSEMICOLON	
int	TokenNameint	
REPLACE	TokenNameIdentifier	 REPLACE
;	TokenNameSEMICOLON	
int	TokenNameint	
NOOP	TokenNameIdentifier	 NOOP
;	TokenNameSEMICOLON	
/** * Constructor for the Diff object. */	TokenNameCOMMENT_JAVADOC	 Constructor for the Diff object. 
public	TokenNamepublic	
Diff	TokenNameIdentifier	 Diff
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for the Diff object * * @param ins Description of the Parameter * @param del Description of the Parameter * @param rep Description of the Parameter * @param noop Description of the Parameter */	TokenNameCOMMENT_JAVADOC	 Constructor for the Diff object * @param ins Description of the Parameter @param del Description of the Parameter @param rep Description of the Parameter @param noop Description of the Parameter 
public	TokenNamepublic	
Diff	TokenNameIdentifier	 Diff
(	TokenNameLPAREN	
int	TokenNameint	
ins	TokenNameIdentifier	 ins
,	TokenNameCOMMA	
int	TokenNameint	
del	TokenNameIdentifier	 del
,	TokenNameCOMMA	
int	TokenNameint	
rep	TokenNameIdentifier	 rep
,	TokenNameCOMMA	
int	TokenNameint	
noop	TokenNameIdentifier	 noop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
INSERT	TokenNameIdentifier	 INSERT
=	TokenNameEQUAL	
ins	TokenNameIdentifier	 ins
;	TokenNameSEMICOLON	
DELETE	TokenNameIdentifier	 DELETE
=	TokenNameEQUAL	
del	TokenNameIdentifier	 del
;	TokenNameSEMICOLON	
REPLACE	TokenNameIdentifier	 REPLACE
=	TokenNameEQUAL	
rep	TokenNameIdentifier	 rep
;	TokenNameSEMICOLON	
NOOP	TokenNameIdentifier	 NOOP
=	TokenNameEQUAL	
noop	TokenNameIdentifier	 noop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Apply the given patch string <tt>diff</tt> to the given string <tt> * dest</tt>. * * @param dest Destination string * @param diff Patch string */	TokenNameCOMMENT_JAVADOC	 Apply the given patch string <tt>diff</tt> to the given string <tt> dest</tt>. * @param dest Destination string @param diff Patch string 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// orig == "" 	TokenNameCOMMENT_LINE	orig == "" 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
par_num	TokenNameIdentifier	 par num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
-	TokenNameMINUS	
'a'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'-'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
par_num	TokenNameIdentifier	 par num
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'R'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
setCharAt	TokenNameIdentifier	 set Char At
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
-=	TokenNameMINUS_EQUAL	
par_num	TokenNameIdentifier	 par num
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * delete par_num chars from index pos */	TokenNameCOMMENT_BLOCK	 delete par_num chars from index pos 
// String s = orig.toString(); 	TokenNameCOMMENT_LINE	String s = orig.toString(); 
// s = s.substring( 0, pos ) + s.substring( o + 1 ); 	TokenNameCOMMENT_LINE	s = s.substring( 0, pos ) + s.substring( o + 1 ); 
// orig = new StringBuffer( s ); 	TokenNameCOMMENT_LINE	orig = new StringBuffer( s ); 
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'I'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StringIndexOutOfBoundsException	TokenNameIdentifier	 String Index Out Of Bounds Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// x.printStackTrace(); 	TokenNameCOMMENT_LINE	x.printStackTrace(); 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// x.printStackTrace(); 	TokenNameCOMMENT_LINE	x.printStackTrace(); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct a patch string that transforms a to b. * * @param a String 1st string * @param b String 2nd string * @return String */	TokenNameCOMMENT_JAVADOC	 Construct a patch string that transforms a to b. * @param a String 1st string @param b String 2nd string @return String 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
b	TokenNameIdentifier	 b
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
int	TokenNameint	
maxx	TokenNameIdentifier	 maxx
;	TokenNameSEMICOLON	
int	TokenNameint	
maxy	TokenNameIdentifier	 maxy
;	TokenNameSEMICOLON	
int	TokenNameint	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
X	TokenNameIdentifier	 X
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
Y	TokenNameIdentifier	 Y
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
R	TokenNameIdentifier	 R
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
D	TokenNameIdentifier	 D
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * setup memory if needed => processing speed up */	TokenNameCOMMENT_BLOCK	 setup memory if needed => processing speed up 
maxx	TokenNameIdentifier	 maxx
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
maxy	TokenNameIdentifier	 maxy
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxx	TokenNameIdentifier	 maxx
>=	TokenNameGREATER_EQUAL	
sizex	TokenNameIdentifier	 sizex
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
maxy	TokenNameIdentifier	 maxy
>=	TokenNameGREATER_EQUAL	
sizey	TokenNameIdentifier	 sizey
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sizex	TokenNameIdentifier	 sizex
=	TokenNameEQUAL	
maxx	TokenNameIdentifier	 maxx
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sizey	TokenNameIdentifier	 sizey
=	TokenNameEQUAL	
maxy	TokenNameIdentifier	 maxy
+	TokenNamePLUS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
net	TokenNameIdentifier	 net
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sizex	TokenNameIdentifier	 sizex
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
sizey	TokenNameIdentifier	 sizey
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
way	TokenNameIdentifier	 way
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sizex	TokenNameIdentifier	 sizex
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
sizey	TokenNameIdentifier	 sizey
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * clear the network */	TokenNameCOMMENT_BLOCK	 clear the network 
for	TokenNamefor	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
maxx	TokenNameIdentifier	 maxx
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
maxy	TokenNameIdentifier	 maxy
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
net	TokenNameIdentifier	 net
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * set known persistent values */	TokenNameCOMMENT_BLOCK	 set known persistent values 
for	TokenNamefor	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
maxx	TokenNameIdentifier	 maxx
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
net	TokenNameIdentifier	 net
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
way	TokenNameIdentifier	 way
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
X	TokenNameIdentifier	 X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
maxy	TokenNameIdentifier	 maxy
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
net	TokenNameIdentifier	 net
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
way	TokenNameIdentifier	 way
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
maxx	TokenNameIdentifier	 maxx
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
maxy	TokenNameIdentifier	 maxy
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
X	TokenNameIdentifier	 X
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
net	TokenNameIdentifier	 net
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
+	TokenNamePLUS	
DELETE	TokenNameIdentifier	 DELETE
;	TokenNameSEMICOLON	
// way on x costs 1 unit 	TokenNameCOMMENT_LINE	way on x costs 1 unit 
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
Y	TokenNameIdentifier	 Y
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
net	TokenNameIdentifier	 net
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
INSERT	TokenNameIdentifier	 INSERT
;	TokenNameSEMICOLON	
// way on y costs 1 unit 	TokenNameCOMMENT_LINE	way on y costs 1 unit 
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
R	TokenNameIdentifier	 R
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
net	TokenNameIdentifier	 net
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
REPLACE	TokenNameIdentifier	 REPLACE
;	TokenNameSEMICOLON	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
D	TokenNameIdentifier	 D
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
net	TokenNameIdentifier	 net
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
NOOP	TokenNameIdentifier	 NOOP
:	TokenNameCOLON	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// diagonal costs 0, when no change 	TokenNameCOMMENT_LINE	diagonal costs 0, when no change 
short	TokenNameshort	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
D	TokenNameIdentifier	 D
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
min	TokenNameIdentifier	 min
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
X	TokenNameIdentifier	 X
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
X	TokenNameIdentifier	 X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
min	TokenNameIdentifier	 min
]	TokenNameRBRACKET	
>	TokenNameGREATER	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
Y	TokenNameIdentifier	 Y
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
Y	TokenNameIdentifier	 Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
min	TokenNameIdentifier	 min
]	TokenNameRBRACKET	
>	TokenNameGREATER	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
R	TokenNameIdentifier	 R
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
R	TokenNameIdentifier	 R
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
way	TokenNameIdentifier	 way
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
net	TokenNameIdentifier	 net
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
go	TokenNameIdentifier	 go
[	TokenNameLBRACKET	
min	TokenNameIdentifier	 min
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// read the patch string 	TokenNameCOMMENT_LINE	read the patch string 
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
'a'	TokenNameCharacterLiteral	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
deletes	TokenNameIdentifier	 deletes
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
char	TokenNamechar	
equals	TokenNameIdentifier	 equals
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
maxx	TokenNameIdentifier	 maxx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
maxy	TokenNameIdentifier	 maxy
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
way	TokenNameIdentifier	 way
[	TokenNameLBRACKET	
x	TokenNameIdentifier	 x
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
X	TokenNameIdentifier	 X
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
equals	TokenNameIdentifier	 equals
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
(	TokenNameLPAREN	
equals	TokenNameIdentifier	 equals
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
equals	TokenNameIdentifier	 equals
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
deletes	TokenNameIdentifier	 deletes
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// delete 	TokenNameCOMMENT_LINE	delete 
case	TokenNamecase	
Y	TokenNameIdentifier	 Y
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"D"	TokenNameStringLiteral	D
+	TokenNamePLUS	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deletes	TokenNameIdentifier	 deletes
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
equals	TokenNameIdentifier	 equals
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
(	TokenNameLPAREN	
equals	TokenNameIdentifier	 equals
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
equals	TokenNameIdentifier	 equals
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'I'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// insert 	TokenNameCOMMENT_LINE	insert 
case	TokenNamecase	
R	TokenNameIdentifier	 R
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"D"	TokenNameStringLiteral	D
+	TokenNamePLUS	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deletes	TokenNameIdentifier	 deletes
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
equals	TokenNameIdentifier	 equals
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
(	TokenNameLPAREN	
equals	TokenNameIdentifier	 equals
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
equals	TokenNameIdentifier	 equals
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'R'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// replace 	TokenNameCOMMENT_LINE	replace 
case	TokenNamecase	
D	TokenNameIdentifier	 D
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"D"	TokenNameStringLiteral	D
+	TokenNamePLUS	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deletes	TokenNameIdentifier	 deletes
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
equals	TokenNameIdentifier	 equals
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// no change 	TokenNameCOMMENT_LINE	no change 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
!=	TokenNameNOT_EQUAL	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"D"	TokenNameStringLiteral	D
+	TokenNamePLUS	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
deletes	TokenNameIdentifier	 deletes
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
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
}	TokenNameRBRACE	
