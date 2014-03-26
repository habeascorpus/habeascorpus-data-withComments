package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
jaspell	TokenNameIdentifier	 jaspell
;	TokenNameSEMICOLON	
/** * Copyright (c) 2005 Bruno Martins * All rights reserved. * * Redistribution and use in source and binary forms, with or without * modification, are permitted provided that the following conditions * are met: * 1. Redistributions of source code must retain the above copyright * notice, this list of conditions and the following disclaimer. * 2. Redistributions in binary form must reproduce the above copyright * notice, this list of conditions and the following disclaimer in the * documentation and/or other materials provided with the distribution. * 3. Neither the name of the organization nor the names of its contributors * may be used to endorse or promote products derived from this software * without specific prior written permission. * * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF * THE POSSIBILITY OF SUCH DAMAGE. */	TokenNameCOMMENT_JAVADOC	 Copyright (c) 2005 Bruno Martins All rights reserved. * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. 3. Neither the name of the organization nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission. * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
;	TokenNameSEMICOLON	
/** * Implementation of a Ternary Search Trie, a data structure for storing * <code>String</code> objects that combines the compact size of a binary search * tree with the speed of a digital search trie, and is therefore ideal for * practical use in sorting and searching data.</p> * <p> * * This data structure is faster than hashing for many typical search problems, * and supports a broader range of useful problems and operations. Ternary * searches are faster than hashing and more powerful, too. * </p> * <p> * * The theory of ternary search trees was described at a symposium in 1997 (see * "Fast Algorithms for Sorting and Searching Strings," by J.L. Bentley and R. * Sedgewick, Proceedings of the 8th Annual ACM-SIAM Symposium on Discrete * Algorithms, January 1997). Algorithms in C, Third Edition, by Robert * Sedgewick (Addison-Wesley, 1998) provides yet another view of ternary search * trees. * * @author Bruno Martins * */	TokenNameCOMMENT_JAVADOC	 Implementation of a Ternary Search Trie, a data structure for storing <code>String</code> objects that combines the compact size of a binary search tree with the speed of a digital search trie, and is therefore ideal for practical use in sorting and searching data.</p> <p> * This data structure is faster than hashing for many typical search problems, and supports a broader range of useful problems and operations. Ternary searches are faster than hashing and more powerful, too. </p> <p> * The theory of ternary search trees was described at a symposium in 1997 (see "Fast Algorithms for Sorting and Searching Strings," by J.L. Bentley and R. Sedgewick, Proceedings of the 8th Annual ACM-SIAM Symposium on Discrete Algorithms, January 1997). Algorithms in C, Third Edition, by Robert Sedgewick (Addison-Wesley, 1998) provides yet another view of ternary search trees. * @author Bruno Martins 
public	TokenNamepublic	
class	TokenNameclass	
JaspellTernarySearchTrie	TokenNameIdentifier	 Jaspell Ternary Search Trie
{	TokenNameLBRACE	
/** * An inner class of Ternary Search Trie that represents a node in the trie. */	TokenNameCOMMENT_JAVADOC	 An inner class of Ternary Search Trie that represents a node in the trie. 
protected	TokenNameprotected	
final	TokenNamefinal	
class	TokenNameclass	
TSTNode	TokenNameIdentifier	 TST Node
{	TokenNameLBRACE	
/** Index values for accessing relatives array. */	TokenNameCOMMENT_JAVADOC	 Index values for accessing relatives array. 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
PARENT	TokenNameIdentifier	 PARENT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
LOKID	TokenNameIdentifier	 LOKID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
EQKID	TokenNameIdentifier	 EQKID
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
HIKID	TokenNameIdentifier	 HIKID
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The key to the node. */	TokenNameCOMMENT_JAVADOC	 The key to the node. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
/** The relative nodes. */	TokenNameCOMMENT_JAVADOC	 The relative nodes. 
protected	TokenNameprotected	
TSTNode	TokenNameIdentifier	 TST Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
relatives	TokenNameIdentifier	 relatives
=	TokenNameEQUAL	
new	TokenNamenew	
TSTNode	TokenNameIdentifier	 TST Node
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** The char used in the split. */	TokenNameCOMMENT_JAVADOC	 The char used in the split. 
protected	TokenNameprotected	
char	TokenNamechar	
splitchar	TokenNameIdentifier	 splitchar
;	TokenNameSEMICOLON	
/** * Constructor method. * *@param splitchar * The char used in the split. *@param parent * The parent node. */	TokenNameCOMMENT_JAVADOC	 Constructor method. *@param splitchar The char used in the split. *@param parent The parent node. 
protected	TokenNameprotected	
TSTNode	TokenNameIdentifier	 TST Node
(	TokenNameLPAREN	
char	TokenNamechar	
splitchar	TokenNameIdentifier	 splitchar
,	TokenNameCOMMA	
TSTNode	TokenNameIdentifier	 TST Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
=	TokenNameEQUAL	
splitchar	TokenNameIdentifier	 splitchar
;	TokenNameSEMICOLON	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
PARENT	TokenNameIdentifier	 PARENT
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Compares characters by alfabetical order. * *@param cCompare2 * The first char in the comparison. *@param cRef * The second char in the comparison. *@return A negative number, 0 or a positive number if the second char is * less, equal or greater. */	TokenNameCOMMENT_JAVADOC	 Compares characters by alfabetical order. *@param cCompare2 The first char in the comparison. *@param cRef The second char in the comparison. *@return A negative number, 0 or a positive number if the second char is less, equal or greater. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
compareCharsAlphabetically	TokenNameIdentifier	 compare Chars Alphabetically
(	TokenNameLPAREN	
char	TokenNamechar	
cCompare2	TokenNameIdentifier	 c Compare2
,	TokenNameCOMMA	
char	TokenNamechar	
cRef	TokenNameIdentifier	 c Ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
cCompare2	TokenNameIdentifier	 c Compare2
)	TokenNameRPAREN	
-	TokenNameMINUS	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
cRef	TokenNameIdentifier	 c Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* what follows is the original Jaspell code. private static int compareCharsAlphabetically(int cCompare2, int cRef) { int cCompare = 0; if (cCompare2 >= 65) { if (cCompare2 < 89) { cCompare = (2 * cCompare2) - 65; } else if (cCompare2 < 97) { cCompare = cCompare2 + 24; } else if (cCompare2 < 121) { cCompare = (2 * cCompare2) - 128; } else cCompare = cCompare2; } else cCompare = cCompare2; if (cRef < 65) { return cCompare - cRef; } if (cRef < 89) { return cCompare - ((2 * cRef) - 65); } if (cRef < 97) { return cCompare - (cRef + 24); } if (cRef < 121) { return cCompare - ((2 * cRef) - 128); } return cCompare - cRef; } */	TokenNameCOMMENT_BLOCK	 what follows is the original Jaspell code. private static int compareCharsAlphabetically(int cCompare2, int cRef) { int cCompare = 0; if (cCompare2 >= 65) { if (cCompare2 < 89) { cCompare = (2 cCompare2) - 65; } else if (cCompare2 < 97) { cCompare = cCompare2 + 24; } else if (cCompare2 < 121) { cCompare = (2 cCompare2) - 128; } else cCompare = cCompare2; } else cCompare = cCompare2; if (cRef < 65) { return cCompare - cRef; } if (cRef < 89) { return cCompare - ((2 cRef) - 65); } if (cRef < 97) { return cCompare - (cRef + 24); } if (cRef < 121) { return cCompare - ((2 cRef) - 128); } return cCompare - cRef; } 
/** * The default number of values returned by the <code>matchAlmost</code> * method. */	TokenNameCOMMENT_JAVADOC	 The default number of values returned by the <code>matchAlmost</code> method. 
private	TokenNameprivate	
int	TokenNameint	
defaultNumReturnValues	TokenNameIdentifier	 default Num Return Values
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * the number of differences allowed in a call to the * <code>matchAlmostKey</code> method. */	TokenNameCOMMENT_JAVADOC	 the number of differences allowed in a call to the <code>matchAlmostKey</code> method. 
private	TokenNameprivate	
int	TokenNameint	
matchAlmostDiff	TokenNameIdentifier	 match Almost Diff
;	TokenNameSEMICOLON	
/** The base node in the trie. */	TokenNameCOMMENT_JAVADOC	 The base node in the trie. 
private	TokenNameprivate	
TSTNode	TokenNameIdentifier	 TST Node
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
/** * Constructs an empty Ternary Search Trie. */	TokenNameCOMMENT_JAVADOC	 Constructs an empty Ternary Search Trie. 
public	TokenNamepublic	
JaspellTernarySearchTrie	TokenNameIdentifier	 Jaspell Ternary Search Trie
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// for loading 	TokenNameCOMMENT_LINE	for loading 
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
newRoot	TokenNameIdentifier	 new Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
newRoot	TokenNameIdentifier	 new Root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for saving 	TokenNameCOMMENT_LINE	for saving 
TSTNode	TokenNameIdentifier	 TST Node
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a Ternary Search Trie and loads data from a <code>File</code> * into the Trie. The file is a normal text document, where each line is of * the form word TAB float. * *@param file * The <code>File</code> with the data to load into the Trie. *@exception IOException * A problem occured while reading the data. */	TokenNameCOMMENT_JAVADOC	 Constructs a Ternary Search Trie and loads data from a <code>File</code> into the Trie. The file is a normal text document, where each line is of the form word TAB float. *@param file The <code>File</code> with the data to load into the Trie. *@exception IOException A problem occured while reading the data. 
public	TokenNamepublic	
JaspellTernarySearchTrie	TokenNameIdentifier	 Jaspell Ternary Search Trie
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a Ternary Search Trie and loads data from a <code>File</code> * into the Trie. The file is a normal text document, where each line is of * the form "word TAB float". * *@param file * The <code>File</code> with the data to load into the Trie. *@param compression * If true, the file is compressed with the GZIP algorithm, and if * false, the file is a normal text document. *@exception IOException * A problem occured while reading the data. */	TokenNameCOMMENT_JAVADOC	 Constructs a Ternary Search Trie and loads data from a <code>File</code> into the Trie. The file is a normal text document, where each line is of the form "word TAB float". *@param file The <code>File</code> with the data to load into the Trie. *@param compression If true, the file is compressed with the GZIP algorithm, and if false, the file is a normal text document. *@exception IOException A problem occured while reading the data. 
public	TokenNamepublic	
JaspellTernarySearchTrie	TokenNameIdentifier	 Jaspell Ternary Search Trie
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
boolean	TokenNameboolean	
compression	TokenNameIdentifier	 compression
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BufferedReader	TokenNameIdentifier	 Buffered Reader
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compression	TokenNameIdentifier	 compression
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
new	TokenNamenew	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
Float	TokenNameIdentifier	 Float
occur	TokenNameIdentifier	 occur
,	TokenNameCOMMA	
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numWords	TokenNameIdentifier	 num Words
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
occur	TokenNameIdentifier	 occur
=	TokenNameEQUAL	
one	TokenNameIdentifier	 one
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
occur	TokenNameIdentifier	 occur
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
new	TokenNamenew	
TSTNode	TokenNameIdentifier	 TST Node
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TSTNode	TokenNameIdentifier	 TST Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
rootNode	TokenNameIdentifier	 root Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TSTNode	TokenNameIdentifier	 TST Node
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
int	TokenNameint	
charIndex	TokenNameIdentifier	 char Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
int	TokenNameint	
charComp	TokenNameIdentifier	 char Comp
=	TokenNameEQUAL	
compareCharsAlphabetically	TokenNameIdentifier	 compare Chars Alphabetically
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charComp	TokenNameIdentifier	 char Comp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charIndex	TokenNameIdentifier	 char Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
==	TokenNameEQUAL_EQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
charComp	TokenNameIdentifier	 char Comp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Float	TokenNameIdentifier	 Float
occur2	TokenNameIdentifier	 occur2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
occur2	TokenNameIdentifier	 occur2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
occur2	TokenNameIdentifier	 occur2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
occur	TokenNameIdentifier	 occur
+=	TokenNamePLUS_EQUAL	
occur2	TokenNameIdentifier	 occur2
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
getOrCreateNode	TokenNameIdentifier	 get Or Create Node
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
occur	TokenNameIdentifier	 occur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deletes the node passed in as an argument. If this node has non-null data, * then both the node and the data will be deleted. It also deletes any other * nodes in the trie that are no longer needed after the deletion of the node. * *@param nodeToDelete * The node to delete. */	TokenNameCOMMENT_JAVADOC	 Deletes the node passed in as an argument. If this node has non-null data, then both the node and the data will be deleted. It also deletes any other nodes in the trie that are no longer needed after the deletion of the node. *@param nodeToDelete The node to delete. 
private	TokenNameprivate	
void	TokenNamevoid	
deleteNode	TokenNameIdentifier	 delete Node
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
nodeToDelete	TokenNameIdentifier	 node To Delete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeToDelete	TokenNameIdentifier	 node To Delete
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nodeToDelete	TokenNameIdentifier	 node To Delete
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nodeToDelete	TokenNameIdentifier	 node To Delete
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeToDelete	TokenNameIdentifier	 node To Delete
=	TokenNameEQUAL	
deleteNodeRecursion	TokenNameIdentifier	 delete Node Recursion
(	TokenNameLPAREN	
nodeToDelete	TokenNameIdentifier	 node To Delete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// deleteNodeRecursion(nodeToDelete); 	TokenNameCOMMENT_LINE	deleteNodeRecursion(nodeToDelete); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Recursively visits each node to be deleted. * * To delete a node, first set its data to null, then pass it into this * method, then pass the node returned by this method into this method (make * sure you don't delete the data of any of the nodes returned from this * method!) and continue in this fashion until the node returned by this * method is <code>null</code>. * * The TSTNode instance returned by this method will be next node to be * operated on by <code>deleteNodeRecursion</code> (This emulates recursive * method call while avoiding the JVM overhead normally associated with a * recursive method.) * *@param currentNode * The node to delete. *@return The next node to be called in deleteNodeRecursion. */	TokenNameCOMMENT_JAVADOC	 Recursively visits each node to be deleted. * To delete a node, first set its data to null, then pass it into this method, then pass the node returned by this method into this method (make sure you don't delete the data of any of the nodes returned from this method!) and continue in this fashion until the node returned by this method is <code>null</code>. * The TSTNode instance returned by this method will be next node to be operated on by <code>deleteNodeRecursion</code> (This emulates recursive method call while avoiding the JVM overhead normally associated with a recursive method.) *@param currentNode The node to delete. *@return The next node to be called in deleteNodeRecursion. 
private	TokenNameprivate	
TSTNode	TokenNameIdentifier	 TST Node
deleteNodeRecursion	TokenNameIdentifier	 delete Node Recursion
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// can't delete this node if it has a non-null eq kid or data 	TokenNameCOMMENT_LINE	can't delete this node if it has a non-null eq kid or data 
TSTNode	TokenNameIdentifier	 TST Node
currentParent	TokenNameIdentifier	 current Parent
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
lokidNull	TokenNameIdentifier	 lokid Null
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hikidNull	TokenNameIdentifier	 hikid Null
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
childType	TokenNameIdentifier	 child Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentParent	TokenNameIdentifier	 current Parent
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
childType	TokenNameIdentifier	 child Type
=	TokenNameEQUAL	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currentParent	TokenNameIdentifier	 current Parent
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
childType	TokenNameIdentifier	 child Type
=	TokenNameEQUAL	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currentParent	TokenNameIdentifier	 current Parent
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
childType	TokenNameIdentifier	 child Type
=	TokenNameEQUAL	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lokidNull	TokenNameIdentifier	 lokid Null
&&	TokenNameAND_AND	
hikidNull	TokenNameIdentifier	 hikid Null
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentParent	TokenNameIdentifier	 current Parent
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
childType	TokenNameIdentifier	 child Type
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lokidNull	TokenNameIdentifier	 lokid Null
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentParent	TokenNameIdentifier	 current Parent
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
childType	TokenNameIdentifier	 child Type
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
return	TokenNamereturn	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hikidNull	TokenNameIdentifier	 hikid Null
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentParent	TokenNameIdentifier	 current Parent
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
childType	TokenNameIdentifier	 child Type
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
return	TokenNamereturn	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
deltaHi	TokenNameIdentifier	 delta Hi
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
-	TokenNameMINUS	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
;	TokenNameSEMICOLON	
int	TokenNameint	
deltaLo	TokenNameIdentifier	 delta Lo
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
-	TokenNameMINUS	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
;	TokenNameSEMICOLON	
int	TokenNameint	
movingKid	TokenNameIdentifier	 moving Kid
;	TokenNameSEMICOLON	
TSTNode	TokenNameIdentifier	 TST Node
targetNode	TokenNameIdentifier	 target Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deltaHi	TokenNameIdentifier	 delta Hi
==	TokenNameEQUAL_EQUAL	
deltaLo	TokenNameIdentifier	 delta Lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deltaHi	TokenNameIdentifier	 delta Hi
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
deltaLo	TokenNameIdentifier	 delta Lo
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deltaHi	TokenNameIdentifier	 delta Hi
>	TokenNameGREATER	
deltaLo	TokenNameIdentifier	 delta Lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
movingKid	TokenNameIdentifier	 moving Kid
=	TokenNameEQUAL	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
;	TokenNameSEMICOLON	
targetNode	TokenNameIdentifier	 target Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
movingKid	TokenNameIdentifier	 moving Kid
=	TokenNameEQUAL	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
;	TokenNameSEMICOLON	
targetNode	TokenNameIdentifier	 target Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
movingKid	TokenNameIdentifier	 moving Kid
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
targetNode	TokenNameIdentifier	 target Node
=	TokenNameEQUAL	
targetNode	TokenNameIdentifier	 target Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
movingKid	TokenNameIdentifier	 moving Kid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
targetNode	TokenNameIdentifier	 target Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
movingKid	TokenNameIdentifier	 moving Kid
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
movingKid	TokenNameIdentifier	 moving Kid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
currentParent	TokenNameIdentifier	 current Parent
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
childType	TokenNameIdentifier	 child Type
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
targetNode	TokenNameIdentifier	 target Node
;	TokenNameSEMICOLON	
targetNode	TokenNameIdentifier	 target Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lokidNull	TokenNameIdentifier	 lokid Null
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hikidNull	TokenNameIdentifier	 hikid Null
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
currentParent	TokenNameIdentifier	 current Parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the object indexed by a key. * *@param key * A <code>String</code> index. *@return The object retrieved from the Ternary Search Trie. */	TokenNameCOMMENT_JAVADOC	 Retrieve the object indexed by a key. *@param key A <code>String</code> index. *@return The object retrieved from the Ternary Search Trie. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TSTNode	TokenNameIdentifier	 TST Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the <code>Float</code> indexed by key, increment it by one unit * and store the new <code>Float</code>. * *@param key * A <code>String</code> index. *@return The <code>Float</code> retrieved from the Ternary Search Trie. */	TokenNameCOMMENT_JAVADOC	 Retrieve the <code>Float</code> indexed by key, increment it by one unit and store the new <code>Float</code>. *@param key A <code>String</code> index. *@return The <code>Float</code> retrieved from the Ternary Search Trie. 
public	TokenNamepublic	
Float	TokenNameIdentifier	 Float
getAndIncrement	TokenNameIdentifier	 get And Increment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key2	TokenNameIdentifier	 key2
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TSTNode	TokenNameIdentifier	 TST Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
key2	TokenNameIdentifier	 key2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Float	TokenNameIdentifier	 Float
aux	TokenNameIdentifier	 aux
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aux	TokenNameIdentifier	 aux
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aux	TokenNameIdentifier	 aux
=	TokenNameEQUAL	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
aux	TokenNameIdentifier	 aux
=	TokenNameEQUAL	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
aux	TokenNameIdentifier	 aux
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key2	TokenNameIdentifier	 key2
,	TokenNameCOMMA	
aux	TokenNameIdentifier	 aux
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
aux	TokenNameIdentifier	 aux
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the key that indexes the node argument. * *@param node * The node whose index is to be calculated. *@return The <code>String</code> that indexes the node argument. */	TokenNameCOMMENT_JAVADOC	 Returns the key that indexes the node argument. *@param node The node whose index is to be calculated. *@return The <code>String</code> that indexes the node argument. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
getKeyBuffer	TokenNameIdentifier	 get Key Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getKeyBuffer	TokenNameIdentifier	 get Key Buffer
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getKeyBuffer	TokenNameIdentifier	 get Key Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TSTNode	TokenNameIdentifier	 TST Node
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
TSTNode	TokenNameIdentifier	 TST Node
lastNode	TokenNameIdentifier	 last Node
;	TokenNameSEMICOLON	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastNode	TokenNameIdentifier	 last Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
lastNode	TokenNameIdentifier	 last Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getKeyBuffer	TokenNameIdentifier	 get Key Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastNode	TokenNameIdentifier	 last Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getKeyBuffer	TokenNameIdentifier	 get Key Buffer
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getKeyBuffer	TokenNameIdentifier	 get Key Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the node indexed by key, or <code>null</code> if that node doesn't * exist. Search begins at root node. * *@param key * A <code>String</code> that indexes the node that is returned. *@return The node object indexed by key. This object is an instance of an * inner class named <code>TernarySearchTrie.TSTNode</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the node indexed by key, or <code>null</code> if that node doesn't exist. Search begins at root node. *@param key A <code>String</code> that indexes the node that is returned. *@return The node object indexed by key. This object is an instance of an inner class named <code>TernarySearchTrie.TSTNode</code>. 
public	TokenNamepublic	
TSTNode	TokenNameIdentifier	 TST Node
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the node indexed by key, or <code>null</code> if that node doesn't * exist. The search begins at root node. * *@param key * A <code>String</code> that indexes the node that is returned. *@param startNode * The top node defining the subtrie to be searched. *@return The node object indexed by key. This object is an instance of an * inner class named <code>TernarySearchTrie.TSTNode</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the node indexed by key, or <code>null</code> if that node doesn't exist. The search begins at root node. *@param key A <code>String</code> that indexes the node that is returned. *@param startNode The top node defining the subtrie to be searched. *@return The node object indexed by key. This object is an instance of an inner class named <code>TernarySearchTrie.TSTNode</code>. 
protected	TokenNameprotected	
TSTNode	TokenNameIdentifier	 TST Node
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
TSTNode	TokenNameIdentifier	 TST Node
startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TSTNode	TokenNameIdentifier	 TST Node
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
int	TokenNameint	
charIndex	TokenNameIdentifier	 char Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
charComp	TokenNameIdentifier	 char Comp
=	TokenNameEQUAL	
compareCharsAlphabetically	TokenNameIdentifier	 compare Chars Alphabetically
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charComp	TokenNameIdentifier	 char Comp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charIndex	TokenNameIdentifier	 char Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
==	TokenNameEQUAL_EQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
charComp	TokenNameIdentifier	 char Comp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the node indexed by key, creating that node if it doesn't exist, * and creating any required intermediate nodes if they don't exist. * *@param key * A <code>String</code> that indexes the node that is returned. *@return The node object indexed by key. This object is an instance of an * inner class named <code>TernarySearchTrie.TSTNode</code>. *@exception NullPointerException * If the key is <code>null</code>. *@exception IllegalArgumentException * If the key is an empty <code>String</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the node indexed by key, creating that node if it doesn't exist, and creating any required intermediate nodes if they don't exist. *@param key A <code>String</code> that indexes the node that is returned. *@return The node object indexed by key. This object is an instance of an inner class named <code>TernarySearchTrie.TSTNode</code>. *@exception NullPointerException If the key is <code>null</code>. *@exception IllegalArgumentException If the key is an empty <code>String</code>. 
protected	TokenNameprotected	
TSTNode	TokenNameIdentifier	 TST Node
getOrCreateNode	TokenNameIdentifier	 get Or Create Node
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
throws	TokenNamethrows	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
,	TokenNameCOMMA	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"attempt to get or create node with null key"	TokenNameStringLiteral	attempt to get or create node with null key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"attempt to get or create node with key of zero length"	TokenNameStringLiteral	attempt to get or create node with key of zero length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
new	TokenNamenew	
TSTNode	TokenNameIdentifier	 TST Node
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TSTNode	TokenNameIdentifier	 TST Node
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
rootNode	TokenNameIdentifier	 root Node
;	TokenNameSEMICOLON	
int	TokenNameint	
charIndex	TokenNameIdentifier	 char Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charComp	TokenNameIdentifier	 char Comp
=	TokenNameEQUAL	
compareCharsAlphabetically	TokenNameIdentifier	 compare Chars Alphabetically
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charComp	TokenNameIdentifier	 char Comp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charIndex	TokenNameIdentifier	 char Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
==	TokenNameEQUAL_EQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TSTNode	TokenNameIdentifier	 TST Node
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
charComp	TokenNameIdentifier	 char Comp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TSTNode	TokenNameIdentifier	 TST Node
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
TSTNode	TokenNameIdentifier	 TST Node
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a <code>List</code> of keys that almost match the argument key. * Keys returned will have exactly diff characters that do not match the * target key, where diff is equal to the last value passed in as an argument * to the <code>setMatchAlmostDiff</code> method. * <p> * If the <code>matchAlmost</code> method is called before the * <code>setMatchAlmostDiff</code> method has been called for the first time, * then diff = 0. * *@param key * The target key. *@return A <code>List</code> with the results. */	TokenNameCOMMENT_JAVADOC	 Returns a <code>List</code> of keys that almost match the argument key. Keys returned will have exactly diff characters that do not match the target key, where diff is equal to the last value passed in as an argument to the <code>setMatchAlmostDiff</code> method. <p> If the <code>matchAlmost</code> method is called before the <code>setMatchAlmostDiff</code> method has been called for the first time, then diff = 0. *@param key The target key. *@return A <code>List</code> with the results. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
matchAlmost	TokenNameIdentifier	 match Almost
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchAlmost	TokenNameIdentifier	 match Almost
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
defaultNumReturnValues	TokenNameIdentifier	 default Num Return Values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a <code>List</code> of keys that almost match the argument key. * Keys returned will have exactly diff characters that do not match the * target key, where diff is equal to the last value passed in as an argument * to the <code>setMatchAlmostDiff</code> method. * <p> * If the <code>matchAlmost</code> method is called before the * <code>setMatchAlmostDiff</code> method has been called for the first time, * then diff = 0. * *@param key * The target key. *@param numReturnValues * The maximum number of values returned by this method. *@return A <code>List</code> with the results */	TokenNameCOMMENT_JAVADOC	 Returns a <code>List</code> of keys that almost match the argument key. Keys returned will have exactly diff characters that do not match the target key, where diff is equal to the last value passed in as an argument to the <code>setMatchAlmostDiff</code> method. <p> If the <code>matchAlmost</code> method is called before the <code>setMatchAlmostDiff</code> method has been called for the first time, then diff = 0. *@param key The target key. *@param numReturnValues The maximum number of values returned by this method. *@return A <code>List</code> with the results 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
matchAlmost	TokenNameIdentifier	 match Almost
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
numReturnValues	TokenNameIdentifier	 num Return Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchAlmostRecursion	TokenNameIdentifier	 match Almost Recursion
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
matchAlmostDiff	TokenNameIdentifier	 match Almost Diff
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numReturnValues	TokenNameIdentifier	 num Return Values
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
numReturnValues	TokenNameIdentifier	 num Return Values
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Recursivelly vists the nodes in order to find the ones that almost match a * given key. * *@param currentNode * The current node. *@param charIndex * The current char. *@param d * The number of differences so far. *@param matchAlmostNumReturnValues * The maximum number of values in the result <code>List</code>. *@param matchAlmostResult2 * The results so far. *@param upTo * If true all keys having up to and including matchAlmostDiff * mismatched letters will be included in the result (including a key * that is exactly the same as the target string) otherwise keys will * be included in the result only if they have exactly * matchAlmostDiff number of mismatched letters. *@param matchAlmostKey * The key being searched. *@return A <code>List</code> with the results. */	TokenNameCOMMENT_JAVADOC	 Recursivelly vists the nodes in order to find the ones that almost match a given key. *@param currentNode The current node. *@param charIndex The current char. *@param d The number of differences so far. *@param matchAlmostNumReturnValues The maximum number of values in the result <code>List</code>. *@param matchAlmostResult2 The results so far. *@param upTo If true all keys having up to and including matchAlmostDiff mismatched letters will be included in the result (including a key that is exactly the same as the target string) otherwise keys will be included in the result only if they have exactly matchAlmostDiff number of mismatched letters. *@param matchAlmostKey The key being searched. *@return A <code>List</code> with the results. 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
matchAlmostRecursion	TokenNameIdentifier	 match Almost Recursion
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
int	TokenNameint	
charIndex	TokenNameIdentifier	 char Index
,	TokenNameCOMMA	
int	TokenNameint	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
matchAlmostKey	TokenNameIdentifier	 match Almost Key
,	TokenNameCOMMA	
int	TokenNameint	
matchAlmostNumReturnValues	TokenNameIdentifier	 match Almost Num Return Values
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
matchAlmostResult2	TokenNameIdentifier	 match Almost Result2
,	TokenNameCOMMA	
boolean	TokenNameboolean	
upTo	TokenNameIdentifier	 up To
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
matchAlmostNumReturnValues	TokenNameIdentifier	 match Almost Num Return Values
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
matchAlmostResult2	TokenNameIdentifier	 match Almost Result2
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
matchAlmostNumReturnValues	TokenNameIdentifier	 match Almost Num Return Values
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
>=	TokenNameGREATER_EQUAL	
matchAlmostKey	TokenNameIdentifier	 match Almost Key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchAlmostResult2	TokenNameIdentifier	 match Almost Result2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
charComp	TokenNameIdentifier	 char Comp
=	TokenNameEQUAL	
compareCharsAlphabetically	TokenNameIdentifier	 compare Chars Alphabetically
(	TokenNameLPAREN	
matchAlmostKey	TokenNameIdentifier	 match Almost Key
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
splitchar	TokenNameIdentifier	 splitchar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
matchAlmostResult	TokenNameIdentifier	 match Almost Result
=	TokenNameEQUAL	
matchAlmostResult2	TokenNameIdentifier	 match Almost Result2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charComp	TokenNameIdentifier	 char Comp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchAlmostResult	TokenNameIdentifier	 match Almost Result
=	TokenNameEQUAL	
matchAlmostRecursion	TokenNameIdentifier	 match Almost Recursion
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
charIndex	TokenNameIdentifier	 char Index
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
matchAlmostKey	TokenNameIdentifier	 match Almost Key
,	TokenNameCOMMA	
matchAlmostNumReturnValues	TokenNameIdentifier	 match Almost Num Return Values
,	TokenNameCOMMA	
matchAlmostResult	TokenNameIdentifier	 match Almost Result
,	TokenNameCOMMA	
upTo	TokenNameIdentifier	 up To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
nextD	TokenNameIdentifier	 next D
=	TokenNameEQUAL	
(	TokenNameLPAREN	
charComp	TokenNameIdentifier	 char Comp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
d	TokenNameIdentifier	 d
:	TokenNameCOLON	
d	TokenNameIdentifier	 d
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
cond	TokenNameIdentifier	 cond
=	TokenNameEQUAL	
(	TokenNameLPAREN	
upTo	TokenNameIdentifier	 up To
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
nextD	TokenNameIdentifier	 next D
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
nextD	TokenNameIdentifier	 next D
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
matchAlmostKey	TokenNameIdentifier	 match Almost Key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
charIndex	TokenNameIdentifier	 char Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
cond	TokenNameIdentifier	 cond
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchAlmostResult	TokenNameIdentifier	 match Almost Result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
matchAlmostResult	TokenNameIdentifier	 match Almost Result
=	TokenNameEQUAL	
matchAlmostRecursion	TokenNameIdentifier	 match Almost Recursion
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
charIndex	TokenNameIdentifier	 char Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nextD	TokenNameIdentifier	 next D
,	TokenNameCOMMA	
matchAlmostKey	TokenNameIdentifier	 match Almost Key
,	TokenNameCOMMA	
matchAlmostNumReturnValues	TokenNameIdentifier	 match Almost Num Return Values
,	TokenNameCOMMA	
matchAlmostResult	TokenNameIdentifier	 match Almost Result
,	TokenNameCOMMA	
upTo	TokenNameIdentifier	 up To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
charComp	TokenNameIdentifier	 char Comp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchAlmostResult	TokenNameIdentifier	 match Almost Result
=	TokenNameEQUAL	
matchAlmostRecursion	TokenNameIdentifier	 match Almost Recursion
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
charIndex	TokenNameIdentifier	 char Index
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
matchAlmostKey	TokenNameIdentifier	 match Almost Key
,	TokenNameCOMMA	
matchAlmostNumReturnValues	TokenNameIdentifier	 match Almost Num Return Values
,	TokenNameCOMMA	
matchAlmostResult	TokenNameIdentifier	 match Almost Result
,	TokenNameCOMMA	
upTo	TokenNameIdentifier	 up To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
matchAlmostResult	TokenNameIdentifier	 match Almost Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an alphabetical <code>List</code> of all keys in the trie that * begin with a given prefix. Only keys for nodes having non-null data are * included in the <code>List</code>. * *@param prefix * Each key returned from this method will begin with the characters * in prefix. *@return A <code>List</code> with the results. */	TokenNameCOMMENT_JAVADOC	 Returns an alphabetical <code>List</code> of all keys in the trie that begin with a given prefix. Only keys for nodes having non-null data are included in the <code>List</code>. *@param prefix Each key returned from this method will begin with the characters in prefix. *@return A <code>List</code> with the results. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
matchPrefix	TokenNameIdentifier	 match Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchPrefix	TokenNameIdentifier	 match Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
defaultNumReturnValues	TokenNameIdentifier	 default Num Return Values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an alphabetical <code>List</code> of all keys in the trie that * begin with a given prefix. Only keys for nodes having non-null data are * included in the <code>List</code>. * *@param prefix * Each key returned from this method will begin with the characters * in prefix. *@param numReturnValues * The maximum number of values returned from this method. *@return A <code>List</code> with the results */	TokenNameCOMMENT_JAVADOC	 Returns an alphabetical <code>List</code> of all keys in the trie that begin with a given prefix. Only keys for nodes having non-null data are included in the <code>List</code>. *@param prefix Each key returned from this method will begin with the characters in prefix. *@param numReturnValues The maximum number of values returned from this method. *@return A <code>List</code> with the results 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
matchPrefix	TokenNameIdentifier	 match Prefix
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
int	TokenNameint	
numReturnValues	TokenNameIdentifier	 num Return Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TSTNode	TokenNameIdentifier	 TST Node
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sortKeysRecursion	TokenNameIdentifier	 sort Keys Recursion
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numReturnValues	TokenNameIdentifier	 num Return Values
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
numReturnValues	TokenNameIdentifier	 num Return Values
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of nodes in the trie that have non-null data. * *@return The number of nodes in the trie that have non-null data. */	TokenNameCOMMENT_JAVADOC	 Returns the number of nodes in the trie that have non-null data. *@return The number of nodes in the trie that have non-null data. 
public	TokenNamepublic	
int	TokenNameint	
numDataNodes	TokenNameIdentifier	 num Data Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numDataNodes	TokenNameIdentifier	 num Data Nodes
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of nodes in the subtrie below and including the starting * node. The method counts only nodes that have non-null data. * *@param startingNode * The top node of the subtrie. the node that defines the subtrie. *@return The total number of nodes in the subtrie. */	TokenNameCOMMENT_JAVADOC	 Returns the number of nodes in the subtrie below and including the starting node. The method counts only nodes that have non-null data. *@param startingNode The top node of the subtrie. the node that defines the subtrie. *@return The total number of nodes in the subtrie. 
protected	TokenNameprotected	
int	TokenNameint	
numDataNodes	TokenNameIdentifier	 num Data Nodes
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
startingNode	TokenNameIdentifier	 starting Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recursiveNodeCalculator	TokenNameIdentifier	 recursive Node Calculator
(	TokenNameLPAREN	
startingNode	TokenNameIdentifier	 starting Node
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the total number of nodes in the trie. The method counts nodes * whether or not they have data. * *@return The total number of nodes in the trie. */	TokenNameCOMMENT_JAVADOC	 Returns the total number of nodes in the trie. The method counts nodes whether or not they have data. *@return The total number of nodes in the trie. 
public	TokenNamepublic	
int	TokenNameint	
numNodes	TokenNameIdentifier	 num Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numNodes	TokenNameIdentifier	 num Nodes
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the total number of nodes in the subtrie below and including the * starting Node. The method counts nodes whether or not they have data. * *@param startingNode * The top node of the subtrie. The node that defines the subtrie. *@return The total number of nodes in the subtrie. */	TokenNameCOMMENT_JAVADOC	 Returns the total number of nodes in the subtrie below and including the starting Node. The method counts nodes whether or not they have data. *@param startingNode The top node of the subtrie. The node that defines the subtrie. *@return The total number of nodes in the subtrie. 
protected	TokenNameprotected	
int	TokenNameint	
numNodes	TokenNameIdentifier	 num Nodes
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
startingNode	TokenNameIdentifier	 starting Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recursiveNodeCalculator	TokenNameIdentifier	 recursive Node Calculator
(	TokenNameLPAREN	
startingNode	TokenNameIdentifier	 starting Node
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stores a value in the trie. The value may be retrieved using the key. * *@param key * A <code>String</code> that indexes the object to be stored. *@param value * The object to be stored in the Trie. */	TokenNameCOMMENT_JAVADOC	 Stores a value in the trie. The value may be retrieved using the key. *@param key A <code>String</code> that indexes the object to be stored. *@param value The object to be stored in the Trie. 
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getOrCreateNode	TokenNameIdentifier	 get Or Create Node
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Recursivelly visists each node to calculate the number of nodes. * *@param currentNode * The current node. *@param checkData * If true we check the data to be different of <code>null</code>. *@param numNodes2 * The number of nodes so far. *@return The number of nodes accounted. */	TokenNameCOMMENT_JAVADOC	 Recursivelly visists each node to calculate the number of nodes. *@param currentNode The current node. *@param checkData If true we check the data to be different of <code>null</code>. *@param numNodes2 The number of nodes so far. *@return The number of nodes accounted. 
private	TokenNameprivate	
int	TokenNameint	
recursiveNodeCalculator	TokenNameIdentifier	 recursive Node Calculator
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
checkData	TokenNameIdentifier	 check Data
,	TokenNameCOMMA	
int	TokenNameint	
numNodes2	TokenNameIdentifier	 num Nodes2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numNodes2	TokenNameIdentifier	 num Nodes2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numNodes	TokenNameIdentifier	 num Nodes
=	TokenNameEQUAL	
recursiveNodeCalculator	TokenNameIdentifier	 recursive Node Calculator
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
checkData	TokenNameIdentifier	 check Data
,	TokenNameCOMMA	
numNodes2	TokenNameIdentifier	 num Nodes2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numNodes	TokenNameIdentifier	 num Nodes
=	TokenNameEQUAL	
recursiveNodeCalculator	TokenNameIdentifier	 recursive Node Calculator
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
checkData	TokenNameIdentifier	 check Data
,	TokenNameCOMMA	
numNodes	TokenNameIdentifier	 num Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numNodes	TokenNameIdentifier	 num Nodes
=	TokenNameEQUAL	
recursiveNodeCalculator	TokenNameIdentifier	 recursive Node Calculator
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
checkData	TokenNameIdentifier	 check Data
,	TokenNameCOMMA	
numNodes	TokenNameIdentifier	 num Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
checkData	TokenNameIdentifier	 check Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numNodes	TokenNameIdentifier	 num Nodes
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
numNodes	TokenNameIdentifier	 num Nodes
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numNodes	TokenNameIdentifier	 num Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the value indexed by key. Also removes all nodes that are rendered * unnecessary by the removal of this data. * *@param key * A <code>string</code> that indexes the object to be removed from * the Trie. */	TokenNameCOMMENT_JAVADOC	 Removes the value indexed by key. Also removes all nodes that are rendered unnecessary by the removal of this data. *@param key A <code>string</code> that indexes the object to be removed from the Trie. 
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deleteNode	TokenNameIdentifier	 delete Node
(	TokenNameLPAREN	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the number of characters by which words can differ from target word * when calling the <code>matchAlmost</code> method. * <p> * Arguments less than 0 will set the char difference to 0, and arguments * greater than 3 will set the char difference to 3. * *@param diff * The number of characters by which words can differ from target * word. */	TokenNameCOMMENT_JAVADOC	 Sets the number of characters by which words can differ from target word when calling the <code>matchAlmost</code> method. <p> Arguments less than 0 will set the char difference to 0, and arguments greater than 3 will set the char difference to 3. *@param diff The number of characters by which words can differ from target word. 
public	TokenNamepublic	
void	TokenNamevoid	
setMatchAlmostDiff	TokenNameIdentifier	 set Match Almost Diff
(	TokenNameLPAREN	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchAlmostDiff	TokenNameIdentifier	 match Almost Diff
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchAlmostDiff	TokenNameIdentifier	 match Almost Diff
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
matchAlmostDiff	TokenNameIdentifier	 match Almost Diff
=	TokenNameEQUAL	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the default maximum number of values returned from the * <code>matchPrefix</code> and <code>matchAlmost</code> methods. * <p> * The value should be set this to -1 to get an unlimited number of return * values. note that the methods mentioned above provide overloaded versions * that allow you to specify the maximum number of return values, in which * case this value is temporarily overridden. * **@param num * The number of values that will be returned when calling the * methods above. */	TokenNameCOMMENT_JAVADOC	 Sets the default maximum number of values returned from the <code>matchPrefix</code> and <code>matchAlmost</code> methods. <p> The value should be set this to -1 to get an unlimited number of return values. note that the methods mentioned above provide overloaded versions that allow you to specify the maximum number of return values, in which case this value is temporarily overridden. **@param num The number of values that will be returned when calling the methods above. 
public	TokenNamepublic	
void	TokenNamevoid	
setNumReturnValues	TokenNameIdentifier	 set Num Return Values
(	TokenNameLPAREN	
int	TokenNameint	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultNumReturnValues	TokenNameIdentifier	 default Num Return Values
=	TokenNameEQUAL	
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns keys sorted in alphabetical order. This includes the start Node and * all nodes connected to the start Node. * <p> * The number of keys returned is limited to numReturnValues. To get a list * that isn't limited in size, set numReturnValues to -1. * *@param startNode * The top node defining the subtrie to be searched. *@param numReturnValues * The maximum number of values returned from this method. *@return A <code>List</code> with the results. */	TokenNameCOMMENT_JAVADOC	 Returns keys sorted in alphabetical order. This includes the start Node and all nodes connected to the start Node. <p> The number of keys returned is limited to numReturnValues. To get a list that isn't limited in size, set numReturnValues to -1. *@param startNode The top node defining the subtrie to be searched. *@param numReturnValues The maximum number of values returned from this method. *@return A <code>List</code> with the results. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
sortKeys	TokenNameIdentifier	 sort Keys
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
int	TokenNameint	
numReturnValues	TokenNameIdentifier	 num Return Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sortKeysRecursion	TokenNameIdentifier	 sort Keys Recursion
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
numReturnValues	TokenNameIdentifier	 num Return Values
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
numReturnValues	TokenNameIdentifier	 num Return Values
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns keys sorted in alphabetical order. This includes the current Node * and all nodes connected to the current Node. * <p> * Sorted keys will be appended to the end of the resulting <code>List</code>. * The result may be empty when this method is invoked, but may not be * <code>null</code>. * *@param currentNode * The current node. *@param sortKeysNumReturnValues * The maximum number of values in the result. *@param sortKeysResult2 * The results so far. *@return A <code>List</code> with the results. */	TokenNameCOMMENT_JAVADOC	 Returns keys sorted in alphabetical order. This includes the current Node and all nodes connected to the current Node. <p> Sorted keys will be appended to the end of the resulting <code>List</code>. The result may be empty when this method is invoked, but may not be <code>null</code>. *@param currentNode The current node. *@param sortKeysNumReturnValues The maximum number of values in the result. *@param sortKeysResult2 The results so far. *@return A <code>List</code> with the results. 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
sortKeysRecursion	TokenNameIdentifier	 sort Keys Recursion
(	TokenNameLPAREN	
TSTNode	TokenNameIdentifier	 TST Node
currentNode	TokenNameIdentifier	 current Node
,	TokenNameCOMMA	
int	TokenNameint	
sortKeysNumReturnValues	TokenNameIdentifier	 sort Keys Num Return Values
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
sortKeysResult2	TokenNameIdentifier	 sort Keys Result2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sortKeysResult2	TokenNameIdentifier	 sort Keys Result2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
=	TokenNameEQUAL	
sortKeysRecursion	TokenNameIdentifier	 sort Keys Recursion
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
LOKID	TokenNameIdentifier	 LOKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sortKeysNumReturnValues	TokenNameIdentifier	 sort Keys Num Return Values
,	TokenNameCOMMA	
sortKeysResult2	TokenNameIdentifier	 sort Keys Result2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sortKeysNumReturnValues	TokenNameIdentifier	 sort Keys Num Return Values
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
sortKeysNumReturnValues	TokenNameIdentifier	 sort Keys Num Return Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
=	TokenNameEQUAL	
sortKeysRecursion	TokenNameIdentifier	 sort Keys Recursion
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
EQKID	TokenNameIdentifier	 EQKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sortKeysNumReturnValues	TokenNameIdentifier	 sort Keys Num Return Values
,	TokenNameCOMMA	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sortKeysRecursion	TokenNameIdentifier	 sort Keys Recursion
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
relatives	TokenNameIdentifier	 relatives
[	TokenNameLBRACKET	
TSTNode	TokenNameIdentifier	 TST Node
.	TokenNameDOT	
HIKID	TokenNameIdentifier	 HIKID
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
sortKeysNumReturnValues	TokenNameIdentifier	 sort Keys Num Return Values
,	TokenNameCOMMA	
sortKeysResult	TokenNameIdentifier	 sort Keys Result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
