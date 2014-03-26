/* Egothor Software License version 1.00 Copyright (C) 1997-2004 Leo Galambos. Copyright (C) 2002-2004 "Egothor developers" on behalf of the Egothor Project. All rights reserved. This software is copyrighted by the "Egothor developers". If this license applies to a single file or document, the "Egothor developers" are the people or entities mentioned as copyright holders in that file or document. If this license applies to the Egothor project as a whole, the copyright holders are the people or entities mentioned in the file CREDITS. This file can be found in the same location as this license in the distribution. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: 1. Redistributions of source code must retain the above copyright notice, the list of contributors, this list of conditions, and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, the list of contributors, this list of conditions, and the disclaimer that follows these conditions in the documentation and/or other materials provided with the distribution. 3. The name "Egothor" must not be used to endorse or promote products derived from this software without prior written permission. For written permission, please contact Leo.G@seznam.cz 4. Products derived from this software may not be called "Egothor", nor may "Egothor" appear in their name, without prior written permission from Leo.G@seznam.cz. In addition, we request that you include in the end-user documentation provided with the redistribution and/or in the software itself an acknowledgement equivalent to the following: "This product includes software developed by the Egothor Project. http://egothor.sf.net/" THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE EGOTHOR PROJECT OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. This software consists of voluntary contributions made by many individuals on behalf of the Egothor Project and was originally created by Leo Galambos (Leo.G@seznam.cz). */	TokenNameCOMMENT_BLOCK	 Egothor Software License version 1.00 Copyright (C) 1997-2004 Leo Galambos. Copyright (C) 2002-2004 "Egothor developers" on behalf of the Egothor Project. All rights reserved. This software is copyrighted by the "Egothor developers". If this license applies to a single file or document, the "Egothor developers" are the people or entities mentioned as copyright holders in that file or document. If this license applies to the Egothor project as a whole, the copyright holders are the people or entities mentioned in the file CREDITS. This file can be found in the same location as this license in the distribution. Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: 1. Redistributions of source code must retain the above copyright notice, the list of contributors, this list of conditions, and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, the list of contributors, this list of conditions, and the disclaimer that follows these conditions in the documentation and/or other materials provided with the distribution. 3. The name "Egothor" must not be used to endorse or promote products derived from this software without prior written permission. For written permission, please contact Leo.G@seznam.cz 4. Products derived from this software may not be called "Egothor", nor may "Egothor" appear in their name, without prior written permission from Leo.G@seznam.cz. In addition, we request that you include in the end-user documentation provided with the redistribution and/or in the software itself an acknowledgement equivalent to the following: "This product includes software developed by the Egothor Project. http://egothor.sf.net/" THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE EGOTHOR PROJECT OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. This software consists of voluntary contributions made by many individuals on behalf of the Egothor Project and was originally created by Leo Galambos (Leo.G@seznam.cz). 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
egothor	TokenNameIdentifier	 egothor
.	TokenNameDOT	
stemmer	TokenNameIdentifier	 stemmer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
/** * The Row class represents a row in a matrix representation of a trie. */	TokenNameCOMMENT_JAVADOC	 The Row class represents a row in a matrix representation of a trie. 
public	TokenNamepublic	
class	TokenNameclass	
Row	TokenNameIdentifier	 Row
{	TokenNameLBRACE	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
,	TokenNameCOMMA	
Cell	TokenNameIdentifier	 Cell
>	TokenNameGREATER	
cells	TokenNameIdentifier	 cells
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
,	TokenNameCOMMA	
Cell	TokenNameIdentifier	 Cell
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
uniformCnt	TokenNameIdentifier	 uniform Cnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
uniformSkip	TokenNameIdentifier	 uniform Skip
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Construct a Row object from input carried in via the given input stream. * * @param is the input stream * @exception IOException if an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Construct a Row object from input carried in via the given input stream. * @param is the input stream @exception IOException if an I/O error occurs 
public	TokenNamepublic	
Row	TokenNameIdentifier	 Row
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readChar	TokenNameIdentifier	 read Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Cell	TokenNameIdentifier	 Cell
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
Cell	TokenNameIdentifier	 Cell
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The default constructor for the Row object. */	TokenNameCOMMENT_JAVADOC	 The default constructor for the Row object. 
public	TokenNamepublic	
Row	TokenNameIdentifier	 Row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a Row using the cells of the given Row. * * @param old the Row to copy */	TokenNameCOMMENT_JAVADOC	 Construct a Row using the cells of the given Row. * @param old the Row to copy 
public	TokenNamepublic	
Row	TokenNameIdentifier	 Row
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
old	TokenNameIdentifier	 old
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cells	TokenNameIdentifier	 cells
=	TokenNameEQUAL	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
cells	TokenNameIdentifier	 cells
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the command in the Cell of the given Character to the given integer. * * @param way the Character defining the Cell * @param cmd the new command */	TokenNameCOMMENT_JAVADOC	 Set the command in the Cell of the given Character to the given integer. * @param way the Character defining the Cell @param cmd the new command 
public	TokenNamepublic	
void	TokenNamevoid	
setCmd	TokenNameIdentifier	 set Cmd
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
way	TokenNameIdentifier	 way
,	TokenNameCOMMA	
int	TokenNameint	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Cell	TokenNameIdentifier	 Cell
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
way	TokenNameIdentifier	 way
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
Cell	TokenNameIdentifier	 Cell
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
way	TokenNameIdentifier	 way
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the reference to the next row in the Cell of the given Character to the * given integer. * * @param way the Character defining the Cell * @param ref The new ref value */	TokenNameCOMMENT_JAVADOC	 Set the reference to the next row in the Cell of the given Character to the given integer. * @param way the Character defining the Cell @param ref The new ref value 
public	TokenNamepublic	
void	TokenNamevoid	
setRef	TokenNameIdentifier	 set Ref
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
way	TokenNameIdentifier	 way
,	TokenNameCOMMA	
int	TokenNameint	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Cell	TokenNameIdentifier	 Cell
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
way	TokenNameIdentifier	 way
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
Cell	TokenNameIdentifier	 Cell
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
way	TokenNameIdentifier	 way
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the number of cells in use. * * @return the number of cells in use */	TokenNameCOMMENT_JAVADOC	 Return the number of cells in use. * @return the number of cells in use 
public	TokenNamepublic	
int	TokenNameint	
getCells	TokenNameIdentifier	 get Cells
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Cell	TokenNameIdentifier	 Cell
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of references (how many transitions) to other rows. * * @return the number of references */	TokenNameCOMMENT_JAVADOC	 Return the number of references (how many transitions) to other rows. * @return the number of references 
public	TokenNamepublic	
int	TokenNameint	
getCellsPnt	TokenNameIdentifier	 get Cells Pnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Cell	TokenNameIdentifier	 Cell
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of patch commands saved in this Row. * * @return the number of patch commands */	TokenNameCOMMENT_JAVADOC	 Return the number of patch commands saved in this Row. * @return the number of patch commands 
public	TokenNamepublic	
int	TokenNameint	
getCellsVal	TokenNameIdentifier	 get Cells Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Cell	TokenNameIdentifier	 Cell
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the command in the Cell associated with the given Character. * * @param way the Character associated with the Cell holding the desired * command * @return the command */	TokenNameCOMMENT_JAVADOC	 Return the command in the Cell associated with the given Character. * @param way the Character associated with the Cell holding the desired command @return the command 
public	TokenNamepublic	
int	TokenNameint	
getCmd	TokenNameIdentifier	 get Cmd
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
way	TokenNameIdentifier	 way
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Cell	TokenNameIdentifier	 Cell
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
way	TokenNameIdentifier	 way
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of patch commands were in the Cell associated with the * given Character before the Trie containing this Row was reduced. * * @param way the Character associated with the desired Cell * @return the number of patch commands before reduction */	TokenNameCOMMENT_JAVADOC	 Return the number of patch commands were in the Cell associated with the given Character before the Trie containing this Row was reduced. * @param way the Character associated with the desired Cell @return the number of patch commands before reduction 
public	TokenNamepublic	
int	TokenNameint	
getCnt	TokenNameIdentifier	 get Cnt
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
way	TokenNameIdentifier	 way
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Cell	TokenNameIdentifier	 Cell
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
way	TokenNameIdentifier	 way
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the reference to the next Row in the Cell associated with the given * Character. * * @param way the Character associated with the desired Cell * @return the reference, or -1 if the Cell is <tt>null,/tt> */	TokenNameCOMMENT_JAVADOC	 Return the reference to the next Row in the Cell associated with the given Character. * @param way the Character associated with the desired Cell @return the reference, or -1 if the Cell is <tt>null,/tt> 
public	TokenNamepublic	
int	TokenNameint	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
way	TokenNameIdentifier	 way
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Cell	TokenNameIdentifier	 Cell
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
way	TokenNameIdentifier	 way
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write the contents of this Row to the given output stream. * * @param os the output stream * @exception IOException if an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Write the contents of this Row to the given output stream. * @param os the output stream @exception IOException if an I/O error occurs 
public	TokenNamepublic	
void	TokenNamevoid	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Cell	TokenNameIdentifier	 Cell
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeChar	TokenNameIdentifier	 write Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
charValue	TokenNameIdentifier	 char Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cnt	TokenNameIdentifier	 cnt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the number of identical Cells (containing patch commands) in this * Row. * * @param eqSkip when set to <tt>false</tt> the removed patch commands are * considered * @return the number of identical Cells, or -1 if there are (at least) two * different cells */	TokenNameCOMMENT_JAVADOC	 Return the number of identical Cells (containing patch commands) in this Row. * @param eqSkip when set to <tt>false</tt> the removed patch commands are considered @return the number of identical Cells, or -1 if there are (at least) two different cells 
public	TokenNamepublic	
int	TokenNameint	
uniformCmd	TokenNameIdentifier	 uniform Cmd
(	TokenNameLPAREN	
boolean	TokenNameboolean	
eqSkip	TokenNameIdentifier	 eq Skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Cell	TokenNameIdentifier	 Cell
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
uniformCnt	TokenNameIdentifier	 uniform Cnt
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
uniformSkip	TokenNameIdentifier	 uniform Skip
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Cell	TokenNameIdentifier	 Cell
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
uniformSkip	TokenNameIdentifier	 uniform Skip
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eqSkip	TokenNameIdentifier	 eq Skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uniformSkip	TokenNameIdentifier	 uniform Skip
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uniformCnt	TokenNameIdentifier	 uniform Cnt
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
uniformCnt	TokenNameIdentifier	 uniform Cnt
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write the contents of this Row to stdout. */	TokenNameCOMMENT_JAVADOC	 Write the contents of this Row to stdout. 
public	TokenNamepublic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Cell	TokenNameIdentifier	 Cell
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Cell	TokenNameIdentifier	 Cell
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
