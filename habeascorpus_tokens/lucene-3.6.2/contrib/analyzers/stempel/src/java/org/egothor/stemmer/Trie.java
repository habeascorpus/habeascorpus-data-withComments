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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * A Trie is used to store a dictionary of words and their stems. * <p> * Actually, what is stored are words with their respective patch commands. A * trie can be termed forward (keys read from left to right) or backward (keys * read from right to left). This property will vary depending on the language * for which a Trie is constructed. */	TokenNameCOMMENT_JAVADOC	 A Trie is used to store a dictionary of words and their stems. <p> Actually, what is stored are words with their respective patch commands. A trie can be termed forward (keys read from left to right) or backward (keys read from right to left). This property will vary depending on the language for which a Trie is constructed. 
public	TokenNamepublic	
class	TokenNameclass	
Trie	TokenNameIdentifier	 Trie
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
>	TokenNameGREATER	
cmds	TokenNameIdentifier	 cmds
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
forward	TokenNameIdentifier	 forward
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor for the Trie object. * * @param is the input stream * @exception IOException if an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Constructor for the Trie object. * @param is the input stream @exception IOException if an I/O error occurs 
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
forward	TokenNameIdentifier	 forward
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readBoolean	TokenNameIdentifier	 read Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Row	TokenNameIdentifier	 Row
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Constructor for the Trie object. * * @param forward set to <tt>true</tt> */	TokenNameCOMMENT_JAVADOC	 Constructor for the Trie object. * @param forward set to <tt>true</tt> 
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
boolean	TokenNameboolean	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Row	TokenNameIdentifier	 Row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
forward	TokenNameIdentifier	 forward
=	TokenNameEQUAL	
forward	TokenNameIdentifier	 forward
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor for the Trie object. * * @param forward <tt>true</tt> if read left to right, <tt>false</tt> if read * right to left * @param root index of the row that is the root node * @param cmds the patch commands to store * @param rows a Vector of Vectors. Each inner Vector is a node of this Trie */	TokenNameCOMMENT_JAVADOC	 Constructor for the Trie object. * @param forward <tt>true</tt> if read left to right, <tt>false</tt> if read right to left @param root index of the row that is the root node @param cmds the patch commands to store @param rows a Vector of Vectors. Each inner Vector is a node of this Trie 
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
boolean	TokenNameboolean	
forward	TokenNameIdentifier	 forward
,	TokenNameCOMMA	
int	TokenNameint	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
>	TokenNameGREATER	
cmds	TokenNameIdentifier	 cmds
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
rows	TokenNameIdentifier	 rows
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cmds	TokenNameIdentifier	 cmds
=	TokenNameEQUAL	
cmds	TokenNameIdentifier	 cmds
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
forward	TokenNameIdentifier	 forward
=	TokenNameEQUAL	
forward	TokenNameIdentifier	 forward
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the all attribute of the Trie object * * @param key Description of the Parameter * @return The all value */	TokenNameCOMMENT_JAVADOC	 Gets the all attribute of the Trie object * @param key Description of the Parameter @return The all value 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAll	TokenNameIdentifier	 get All
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
resc	TokenNameIdentifier	 resc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Row	TokenNameIdentifier	 Row
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
StrEnum	TokenNameIdentifier	 Str Enum
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
StrEnum	TokenNameIdentifier	 Str Enum
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
false	TokenNamefalse	
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
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
getCmd	TokenNameIdentifier	 get Cmd
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
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
resc	TokenNameIdentifier	 resc
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
resc	TokenNameIdentifier	 resc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
br	TokenNameIdentifier	 br
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
getCmd	TokenNameIdentifier	 get Cmd
(	TokenNameLPAREN	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
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
resc	TokenNameIdentifier	 resc
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
resc	TokenNameIdentifier	 resc
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resc	TokenNameIdentifier	 resc
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
R	TokenNameIdentifier	 R
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
CharSequence	TokenNameIdentifier	 Char Sequence
[	TokenNameLBRACKET	
resc	TokenNameIdentifier	 resc
]	TokenNameRBRACKET	
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
resc	TokenNameIdentifier	 resc
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
R	TokenNameIdentifier	 R
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
R	TokenNameIdentifier	 R
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of cells in this Trie object. * * @return the number of cells */	TokenNameCOMMENT_JAVADOC	 Return the number of cells in this Trie object. * @return the number of cells 
public	TokenNamepublic	
int	TokenNameint	
getCells	TokenNameIdentifier	 get Cells
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getCells	TokenNameIdentifier	 get Cells
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the cellsPnt attribute of the Trie object * * @return The cellsPnt value */	TokenNameCOMMENT_JAVADOC	 Gets the cellsPnt attribute of the Trie object * @return The cellsPnt value 
public	TokenNamepublic	
int	TokenNameint	
getCellsPnt	TokenNameIdentifier	 get Cells Pnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getCellsPnt	TokenNameIdentifier	 get Cells Pnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the cellsVal attribute of the Trie object * * @return The cellsVal value */	TokenNameCOMMENT_JAVADOC	 Gets the cellsVal attribute of the Trie object * @return The cellsVal value 
public	TokenNamepublic	
int	TokenNameint	
getCellsVal	TokenNameIdentifier	 get Cells Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getCellsVal	TokenNameIdentifier	 get Cells Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the element that is stored in a cell associated with the given key. * * @param key the key * @return the associated element */	TokenNameCOMMENT_JAVADOC	 Return the element that is stored in a cell associated with the given key. * @param key the key @return the associated element 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getFully	TokenNameIdentifier	 get Fully
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Row	TokenNameIdentifier	 Row
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
Cell	TokenNameIdentifier	 Cell
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
int	TokenNameint	
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StrEnum	TokenNameIdentifier	 Str Enum
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
StrEnum	TokenNameIdentifier	 Str Enum
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Character	TokenNameIdentifier	 Character
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Character	TokenNameIdentifier	 Character
aux	TokenNameIdentifier	 aux
=	TokenNameEQUAL	
null	TokenNamenull	
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
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
;	TokenNameSEMICOLON	
skip	TokenNameIdentifier	 skip
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
skip	TokenNameIdentifier	 skip
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aux	TokenNameIdentifier	 aux
=	TokenNameEQUAL	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the element that is stored as last on a path associated with the * given key. * * @param key the key associated with the desired element * @return the last on path element */	TokenNameCOMMENT_JAVADOC	 Return the element that is stored as last on a path associated with the given key. * @param key the key associated with the desired element @return the last on path element 
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getLastOnPath	TokenNameIdentifier	 get Last On Path
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Row	TokenNameIdentifier	 Row
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
CharSequence	TokenNameIdentifier	 Char Sequence
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
StrEnum	TokenNameIdentifier	 Str Enum
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
StrEnum	TokenNameIdentifier	 Str Enum
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
forward	TokenNameIdentifier	 forward
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
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
getCmd	TokenNameIdentifier	 get Cmd
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
getCmd	TokenNameIdentifier	 get Cmd
(	TokenNameLPAREN	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
:	TokenNameCOLON	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the Row at the given index. * * @param index the index containing the desired Row * @return the Row */	TokenNameCOMMENT_JAVADOC	 Return the Row at the given index. * @param index the index containing the desired Row @return the Row 
private	TokenNameprivate	
Row	TokenNameIdentifier	 Row
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write this Trie to the given output stream. * * @param os the output stream * @exception IOException if an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Write this Trie to the given output stream. * @param os the output stream @exception IOException if an I/O error occurs 
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
writeBoolean	TokenNameIdentifier	 write Boolean
(	TokenNameLPAREN	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
cmd	TokenNameIdentifier	 cmd
:	TokenNameCOLON	
cmds	TokenNameIdentifier	 cmds
)	TokenNameRPAREN	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the given key associated with the given patch command. If either * parameter is null this method will return without executing. * * @param key the key * @param cmd the patch command */	TokenNameCOMMENT_JAVADOC	 Add the given key associated with the given patch command. If either parameter is null this method will return without executing. * @param key the key @param cmd the patch command 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
cmd	TokenNameIdentifier	 cmd
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
id_cmd	TokenNameIdentifier	 id cmd
=	TokenNameEQUAL	
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
id_cmd	TokenNameIdentifier	 id cmd
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
id_cmd	TokenNameIdentifier	 id cmd
=	TokenNameEQUAL	
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
Row	TokenNameIdentifier	 Row
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StrEnum	TokenNameIdentifier	 Str Enum
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
StrEnum	TokenNameIdentifier	 Str Enum
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
forward	TokenNameIdentifier	 forward
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Character	TokenNameIdentifier	 Character
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
getRow	TokenNameIdentifier	 get Row
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Row	TokenNameIdentifier	 Row
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
new	TokenNamenew	
Row	TokenNameIdentifier	 Row
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
setRef	TokenNameIdentifier	 set Ref
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
setCmd	TokenNameIdentifier	 set Cmd
(	TokenNameLPAREN	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
id_cmd	TokenNameIdentifier	 id cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove empty rows from the given Trie and return the newly reduced Trie. * * @param by the Trie to reduce * @return the newly reduced Trie */	TokenNameCOMMENT_JAVADOC	 Remove empty rows from the given Trie and return the newly reduced Trie. * @param by the Trie to reduce @return the newly reduced Trie 
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
Reduce	TokenNameIdentifier	 Reduce
by	TokenNameIdentifier	 by
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
by	TokenNameIdentifier	 by
.	TokenNameDOT	
optimize	TokenNameIdentifier	 optimize
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printInfo	TokenNameIdentifier	 print Info
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
"nds "	TokenNameStringLiteral	nds 
+	TokenNamePLUS	
rows	TokenNameIdentifier	 rows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" cmds "	TokenNameStringLiteral	 cmds 
+	TokenNamePLUS	
cmds	TokenNameIdentifier	 cmds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" cells "	TokenNameStringLiteral	 cells 
+	TokenNamePLUS	
getCells	TokenNameIdentifier	 get Cells
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" valcells "	TokenNameStringLiteral	 valcells 
+	TokenNamePLUS	
getCellsVal	TokenNameIdentifier	 get Cells Val
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" pntcells "	TokenNameStringLiteral	 pntcells 
+	TokenNamePLUS	
getCellsPnt	TokenNameIdentifier	 get Cells Pnt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class is part of the Egothor Project */	TokenNameCOMMENT_JAVADOC	 This class is part of the Egothor Project 
class	TokenNameclass	
StrEnum	TokenNameIdentifier	 Str Enum
{	TokenNameLBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
int	TokenNameint	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
int	TokenNameint	
by	TokenNameIdentifier	 by
;	TokenNameSEMICOLON	
/** * Constructor for the StrEnum object * * @param s Description of the Parameter * @param up Description of the Parameter */	TokenNameCOMMENT_JAVADOC	 Constructor for the StrEnum object * @param s Description of the Parameter @param up Description of the Parameter 
StrEnum	TokenNameIdentifier	 Str Enum
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
boolean	TokenNameboolean	
up	TokenNameIdentifier	 up
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
up	TokenNameIdentifier	 up
)	TokenNameRPAREN	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
by	TokenNameIdentifier	 by
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
by	TokenNameIdentifier	 by
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
from	TokenNameIdentifier	 from
+=	TokenNamePLUS_EQUAL	
by	TokenNameIdentifier	 by
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
