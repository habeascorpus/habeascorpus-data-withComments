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
/** * The MultiTrie is a Trie of Tries. It stores words and their associated patch * commands. The MultiTrie handles patch commmands individually (each command by * itself). */	TokenNameCOMMENT_JAVADOC	 The MultiTrie is a Trie of Tries. It stores words and their associated patch commands. The MultiTrie handles patch commmands individually (each command by itself). 
public	TokenNamepublic	
class	TokenNameclass	
MultiTrie	TokenNameIdentifier	 Multi Trie
extends	TokenNameextends	
Trie	TokenNameIdentifier	 Trie
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
EOM	TokenNameIdentifier	 EOM
=	TokenNameEQUAL	
'*'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EOM_NODE	TokenNameIdentifier	 EOM  NODE
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
EOM	TokenNameIdentifier	 EOM
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Trie	TokenNameIdentifier	 Trie
>	TokenNameGREATER	
tries	TokenNameIdentifier	 tries
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Trie	TokenNameIdentifier	 Trie
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
BY	TokenNameIdentifier	 BY
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Constructor for the MultiTrie object. * * @param is the input stream * @exception IOException if an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Constructor for the MultiTrie object. * @param is the input stream @exception IOException if an I/O error occurs 
public	TokenNamepublic	
MultiTrie	TokenNameIdentifier	 Multi Trie
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
forward	TokenNameIdentifier	 forward
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readBoolean	TokenNameIdentifier	 read Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BY	TokenNameIdentifier	 BY
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
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Constructor for the MultiTrie object * * @param forward set to <tt>true</tt> if the elements should be read left to * right */	TokenNameCOMMENT_JAVADOC	 Constructor for the MultiTrie object * @param forward set to <tt>true</tt> if the elements should be read left to right 
public	TokenNamepublic	
MultiTrie	TokenNameIdentifier	 Multi Trie
(	TokenNameLPAREN	
boolean	TokenNameboolean	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the element that is stored in a cell associated with the given key. * * @param key the key to the cell holding the desired element * @return the element */	TokenNameCOMMENT_JAVADOC	 Return the element that is stored in a cell associated with the given key. * @param key the key to the cell holding the desired element @return the element 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getFully	TokenNameIdentifier	 get Fully
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
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
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getFully	TokenNameIdentifier	 get Fully
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
EOM	TokenNameIdentifier	 EOM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the element that is stored as last on a path belonging to the given * key. * * @param key the key associated with the desired element * @return the element that is stored as last on a path */	TokenNameCOMMENT_JAVADOC	 Return the element that is stored as last on a path belonging to the given key. * @param key the key associated with the desired element @return the element that is stored as last on a path 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getLastOnPath	TokenNameIdentifier	 get Last On Path
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
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
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getLastOnPath	TokenNameIdentifier	 get Last On Path
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
EOM	TokenNameIdentifier	 EOM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write this data structure to the given output stream. * * @param os the output stream * @exception IOException if an I/O error occurs */	TokenNameCOMMENT_JAVADOC	 Write this data structure to the given output stream. * @param os the output stream @exception IOException if an I/O error occurs 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
BY	TokenNameIdentifier	 BY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Trie	TokenNameIdentifier	 Trie
trie	TokenNameIdentifier	 trie
:	TokenNameCOLON	
tries	TokenNameIdentifier	 tries
)	TokenNameRPAREN	
trie	TokenNameIdentifier	 trie
.	TokenNameDOT	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an element to this structure consisting of the given key and patch * command. * <p> * This method will return without executing if the <tt>cmd</tt> * parameter's length is 0. * * @param key the key * @param cmd the patch command */	TokenNameCOMMENT_JAVADOC	 Add an element to this structure consisting of the given key and patch command. <p> This method will return without executing if the <tt>cmd</tt> parameter's length is 0. * @param key the key @param cmd the patch command 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
levels	TokenNameIdentifier	 levels
=	TokenNameEQUAL	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
BY	TokenNameIdentifier	 BY
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
>=	TokenNameGREATER_EQUAL	
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Trie	TokenNameIdentifier	 Trie
(	TokenNameLPAREN	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
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
levels	TokenNameIdentifier	 levels
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
BY	TokenNameIdentifier	 BY
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
BY	TokenNameIdentifier	 BY
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
BY	TokenNameIdentifier	 BY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tries	TokenNameIdentifier	 tries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
levels	TokenNameIdentifier	 levels
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
EOM_NODE	TokenNameIdentifier	 EOM  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove empty rows from the given Trie and return the newly reduced Trie. * * @param by the Trie to reduce * @return the newly reduced Trie */	TokenNameCOMMENT_JAVADOC	 Remove empty rows from the given Trie and return the newly reduced Trie. * @param by the Trie to reduce @return the newly reduced Trie 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Trie	TokenNameIdentifier	 Trie
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
Reduce	TokenNameIdentifier	 Reduce
by	TokenNameIdentifier	 by
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Trie	TokenNameIdentifier	 Trie
>	TokenNameGREATER	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Trie	TokenNameIdentifier	 Trie
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Trie	TokenNameIdentifier	 Trie
trie	TokenNameIdentifier	 trie
:	TokenNameCOLON	
tries	TokenNameIdentifier	 tries
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
trie	TokenNameIdentifier	 trie
.	TokenNameDOT	
reduce	TokenNameIdentifier	 reduce
(	TokenNameLPAREN	
by	TokenNameIdentifier	 by
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiTrie	TokenNameIdentifier	 Multi Trie
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
new	TokenNamenew	
MultiTrie	TokenNameIdentifier	 Multi Trie
(	TokenNameLPAREN	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
tries	TokenNameIdentifier	 tries
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print the given prefix and the position(s) in the Trie where it appears. * * @param prefix the desired prefix */	TokenNameCOMMENT_JAVADOC	 Print the given prefix and the position(s) in the Trie where it appears. * @param prefix the desired prefix 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
printInfo	TokenNameIdentifier	 print Info
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Trie	TokenNameIdentifier	 Trie
trie	TokenNameIdentifier	 trie
:	TokenNameCOLON	
tries	TokenNameIdentifier	 tries
)	TokenNameRPAREN	
trie	TokenNameIdentifier	 trie
.	TokenNameDOT	
printInfo	TokenNameIdentifier	 print Info
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] "	TokenNameStringLiteral	] 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
