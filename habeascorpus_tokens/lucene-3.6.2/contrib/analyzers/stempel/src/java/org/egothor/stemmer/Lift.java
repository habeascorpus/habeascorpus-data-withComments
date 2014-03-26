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
/** * The Lift class is a data structure that is a variation of a Patricia trie. * <p> * Lift's <i>raison d'etre</i> is to implement reduction of the trie via the * Lift-Up method., which makes the data structure less liable to overstemming. */	TokenNameCOMMENT_JAVADOC	 The Lift class is a data structure that is a variation of a Patricia trie. <p> Lift's <i>raison d'etre</i> is to implement reduction of the trie via the Lift-Up method., which makes the data structure less liable to overstemming. 
public	TokenNamepublic	
class	TokenNameclass	
Lift	TokenNameIdentifier	 Lift
extends	TokenNameextends	
Reduce	TokenNameIdentifier	 Reduce
{	TokenNameLBRACE	
boolean	TokenNameboolean	
changeSkip	TokenNameIdentifier	 change Skip
;	TokenNameSEMICOLON	
/** * Constructor for the Lift object. * * @param changeSkip when set to <tt>true</tt>, comparison of two Cells takes * a skip command into account */	TokenNameCOMMENT_JAVADOC	 Constructor for the Lift object. * @param changeSkip when set to <tt>true</tt>, comparison of two Cells takes a skip command into account 
public	TokenNamepublic	
Lift	TokenNameIdentifier	 Lift
(	TokenNameLPAREN	
boolean	TokenNameboolean	
changeSkip	TokenNameIdentifier	 change Skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
changeSkip	TokenNameIdentifier	 change Skip
=	TokenNameEQUAL	
changeSkip	TokenNameIdentifier	 change Skip
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Optimize (eliminate rows with no content) the given Trie and return the * reduced Trie. * * @param orig the Trie to optimized * @return the reduced Trie */	TokenNameCOMMENT_JAVADOC	 Optimize (eliminate rows with no content) the given Trie and return the reduced Trie. * @param orig the Trie to optimized @return the reduced Trie 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
orows	TokenNameIdentifier	 orows
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
liftUp	TokenNameIdentifier	 lift Up
(	TokenNameLPAREN	
orows	TokenNameIdentifier	 orows
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
,	TokenNameCOMMA	
orows	TokenNameIdentifier	 orows
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
orows	TokenNameIdentifier	 orows
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
/** * Reduce the trie using Lift-Up reduction. * <p> * The Lift-Up reduction propagates all leaf-values (patch commands), where * possible, to higher levels which are closer to the root of the trie. * * @param in the Row to consider when optimizing * @param nodes contains the patch commands */	TokenNameCOMMENT_JAVADOC	 Reduce the trie using Lift-Up reduction. <p> The Lift-Up reduction propagates all leaf-values (patch commands), where possible, to higher levels which are closer to the root of the trie. * @param in the Row to consider when optimizing @param nodes contains the patch commands 
public	TokenNamepublic	
void	TokenNamevoid	
liftUp	TokenNameIdentifier	 lift Up
(	TokenNameLPAREN	
Row	TokenNameIdentifier	 Row
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Row	TokenNameIdentifier	 Row
>	TokenNameGREATER	
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Cell	TokenNameIdentifier	 Cell
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Row	TokenNameIdentifier	 Row
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
uniformCmd	TokenNameIdentifier	 uniform Cmd
(	TokenNameLPAREN	
changeSkip	TokenNameIdentifier	 change Skip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
changeSkip	TokenNameIdentifier	 change Skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
!=	TokenNameNOT_EQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
uniformSkip	TokenNameIdentifier	 uniform Skip
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
uniformSkip	TokenNameIdentifier	 uniform Skip
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cnt	TokenNameIdentifier	 cnt
+=	TokenNamePLUS_EQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
uniformCnt	TokenNameIdentifier	 uniform Cnt
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
uniformCnt	TokenNameIdentifier	 uniform Cnt
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
changeSkip	TokenNameIdentifier	 change Skip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
uniformSkip	TokenNameIdentifier	 uniform Skip
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
