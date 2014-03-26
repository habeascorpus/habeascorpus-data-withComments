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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * The Reduce object is used to remove gaps in a Trie which stores a dictionary. */	TokenNameCOMMENT_JAVADOC	 The Reduce object is used to remove gaps in a Trie which stores a dictionary. 
public	TokenNamepublic	
class	TokenNameclass	
Reduce	TokenNameIdentifier	 Reduce
{	TokenNameLBRACE	
/** * Constructor for the Reduce object. */	TokenNameCOMMENT_JAVADOC	 Constructor for the Reduce object. 
public	TokenNamepublic	
Reduce	TokenNameIdentifier	 Reduce
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Optimize (remove holes in the rows) the given Trie and return the * restructured Trie. * * @param orig the Trie to optimize * @return the restructured Trie */	TokenNameCOMMENT_JAVADOC	 Optimize (remove holes in the rows) the given Trie and return the restructured Trie. * @param orig the Trie to optimize @return the restructured Trie 
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
optimize	TokenNameIdentifier	 optimize
(	TokenNameLPAREN	
Trie	TokenNameIdentifier	 Trie
orig	TokenNameIdentifier	 orig
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
>	TokenNameGREATER	
cmds	TokenNameIdentifier	 cmds
=	TokenNameEQUAL	
orig	TokenNameIdentifier	 orig
.	TokenNameDOT	
cmds	TokenNameIdentifier	 cmds
;	TokenNameSEMICOLON	
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
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
orows	TokenNameIdentifier	 orows
=	TokenNameEQUAL	
orig	TokenNameIdentifier	 orig
.	TokenNameDOT	
rows	TokenNameIdentifier	 rows
;	TokenNameSEMICOLON	
int	TokenNameint	
remap	TokenNameIdentifier	 remap
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
orows	TokenNameIdentifier	 orows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
remap	TokenNameIdentifier	 remap
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rows	TokenNameIdentifier	 rows
=	TokenNameEQUAL	
removeGaps	TokenNameIdentifier	 remove Gaps
(	TokenNameLPAREN	
orig	TokenNameIdentifier	 orig
.	TokenNameDOT	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
rows	TokenNameIdentifier	 rows
,	TokenNameCOMMA	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
remap	TokenNameIdentifier	 remap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
orig	TokenNameIdentifier	 orig
.	TokenNameDOT	
forward	TokenNameIdentifier	 forward
,	TokenNameCOMMA	
remap	TokenNameIdentifier	 remap
[	TokenNameLBRACKET	
orig	TokenNameIdentifier	 orig
.	TokenNameDOT	
root	TokenNameIdentifier	 root
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
cmds	TokenNameIdentifier	 cmds
,	TokenNameCOMMA	
rows	TokenNameIdentifier	 rows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
removeGaps	TokenNameIdentifier	 remove Gaps
(	TokenNameLPAREN	
int	TokenNameint	
ind	TokenNameIdentifier	 ind
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
old	TokenNameIdentifier	 old
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
int	TokenNameint	
remap	TokenNameIdentifier	 remap
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remap	TokenNameIdentifier	 remap
[	TokenNameLBRACKET	
ind	TokenNameIdentifier	 ind
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Row	TokenNameIdentifier	 Row
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ind	TokenNameIdentifier	 ind
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Cell	TokenNameIdentifier	 Cell
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
now	TokenNameIdentifier	 now
.	TokenNameDOT	
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
&&	TokenNameAND_AND	
remap	TokenNameIdentifier	 remap
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
]	TokenNameRBRACKET	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeGaps	TokenNameIdentifier	 remove Gaps
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
,	TokenNameCOMMA	
old	TokenNameIdentifier	 old
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
remap	TokenNameIdentifier	 remap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
remap	TokenNameIdentifier	 remap
[	TokenNameLBRACKET	
ind	TokenNameIdentifier	 ind
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
new	TokenNamenew	
Remap	TokenNameIdentifier	 Remap
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
,	TokenNameCOMMA	
remap	TokenNameIdentifier	 remap
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class is part of the Egothor Project */	TokenNameCOMMENT_JAVADOC	 This class is part of the Egothor Project 
class	TokenNameclass	
Remap	TokenNameIdentifier	 Remap
extends	TokenNameextends	
Row	TokenNameIdentifier	 Row
{	TokenNameLBRACE	
/** * Constructor for the Remap object * * @param old Description of the Parameter * @param remap Description of the Parameter */	TokenNameCOMMENT_JAVADOC	 Constructor for the Remap object * @param old Description of the Parameter @param remap Description of the Parameter 
public	TokenNamepublic	
Remap	TokenNameIdentifier	 Remap
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
old	TokenNameIdentifier	 old
,	TokenNameCOMMA	
int	TokenNameint	
remap	TokenNameIdentifier	 remap
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
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
old	TokenNameIdentifier	 old
.	TokenNameDOT	
at	TokenNameIdentifier	 at
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Cell	TokenNameIdentifier	 Cell
nc	TokenNameIdentifier	 nc
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
nc	TokenNameIdentifier	 nc
=	TokenNameEQUAL	
new	TokenNamenew	
Cell	TokenNameIdentifier	 Cell
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nc	TokenNameIdentifier	 nc
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
remap	TokenNameIdentifier	 remap
[	TokenNameLBRACKET	
nc	TokenNameIdentifier	 nc
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nc	TokenNameIdentifier	 nc
=	TokenNameEQUAL	
new	TokenNamenew	
Cell	TokenNameIdentifier	 Cell
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cells	TokenNameIdentifier	 cells
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
nc	TokenNameIdentifier	 nc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
