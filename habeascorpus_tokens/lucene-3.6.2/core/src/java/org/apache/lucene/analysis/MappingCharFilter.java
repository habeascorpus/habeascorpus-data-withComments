/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
/** * Simplistic {@link CharFilter} that applies the mappings * contained in a {@link NormalizeCharMap} to the character * stream, and correcting the resulting changes to the * offsets. */	TokenNameCOMMENT_JAVADOC	 Simplistic {@link CharFilter} that applies the mappings contained in a {@link NormalizeCharMap} to the character stream, and correcting the resulting changes to the offsets. 
public	TokenNamepublic	
class	TokenNameclass	
MappingCharFilter	TokenNameIdentifier	 Mapping Char Filter
extends	TokenNameextends	
BaseCharFilter	TokenNameIdentifier	 Base Char Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
normMap	TokenNameIdentifier	 norm Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
replacement	TokenNameIdentifier	 replacement
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
charPointer	TokenNameIdentifier	 char Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nextCharCounter	TokenNameIdentifier	 next Char Counter
;	TokenNameSEMICOLON	
/** Default constructor that takes a {@link CharStream}. */	TokenNameCOMMENT_JAVADOC	 Default constructor that takes a {@link CharStream}. 
public	TokenNamepublic	
MappingCharFilter	TokenNameIdentifier	 Mapping Char Filter
(	TokenNameLPAREN	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
normMap	TokenNameIdentifier	 norm Map
,	TokenNameCOMMA	
CharStream	TokenNameIdentifier	 Char Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
normMap	TokenNameIdentifier	 norm Map
=	TokenNameEQUAL	
normMap	TokenNameIdentifier	 norm Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Easy-use constructor that takes a {@link Reader}. */	TokenNameCOMMENT_JAVADOC	 Easy-use constructor that takes a {@link Reader}. 
public	TokenNamepublic	
MappingCharFilter	TokenNameIdentifier	 Mapping Char Filter
(	TokenNameLPAREN	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
normMap	TokenNameIdentifier	 norm Map
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
CharReader	TokenNameIdentifier	 Char Reader
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
normMap	TokenNameIdentifier	 norm Map
=	TokenNameEQUAL	
normMap	TokenNameIdentifier	 norm Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
replacement	TokenNameIdentifier	 replacement
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
charPointer	TokenNameIdentifier	 char Pointer
<	TokenNameLESS	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
replacement	TokenNameIdentifier	 replacement
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
charPointer	TokenNameIdentifier	 char Pointer
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
firstChar	TokenNameIdentifier	 first Char
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstChar	TokenNameIdentifier	 first Char
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
nm	TokenNameIdentifier	 nm
=	TokenNameEQUAL	
normMap	TokenNameIdentifier	 norm Map
.	TokenNameDOT	
submap	TokenNameIdentifier	 submap
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
normMap	TokenNameIdentifier	 norm Map
.	TokenNameDOT	
submap	TokenNameIdentifier	 submap
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
firstChar	TokenNameIdentifier	 first Char
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nm	TokenNameIdentifier	 nm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
firstChar	TokenNameIdentifier	 first Char
;	TokenNameSEMICOLON	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
nm	TokenNameIdentifier	 nm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
firstChar	TokenNameIdentifier	 first Char
;	TokenNameSEMICOLON	
replacement	TokenNameIdentifier	 replacement
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
normStr	TokenNameIdentifier	 norm Str
;	TokenNameSEMICOLON	
charPointer	TokenNameIdentifier	 char Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prevCumulativeDiff	TokenNameIdentifier	 prev Cumulative Diff
=	TokenNameEQUAL	
getLastCumulativeDiff	TokenNameIdentifier	 get Last Cumulative Diff
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
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
-	TokenNameMINUS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
addOffCorrectMap	TokenNameIdentifier	 add Off Correct Map
(	TokenNameLPAREN	
nextCharCounter	TokenNameIdentifier	 next Char Counter
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
prevCumulativeDiff	TokenNameIdentifier	 prev Cumulative Diff
,	TokenNameCOMMA	
prevCumulativeDiff	TokenNameIdentifier	 prev Cumulative Diff
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
addOffCorrectMap	TokenNameIdentifier	 add Off Correct Map
(	TokenNameLPAREN	
nextCharCounter	TokenNameIdentifier	 next Char Counter
-	TokenNameMINUS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
-	TokenNameMINUS	
prevCumulativeDiff	TokenNameIdentifier	 prev Cumulative Diff
,	TokenNameCOMMA	
prevCumulativeDiff	TokenNameIdentifier	 prev Cumulative Diff
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextCharCounter	TokenNameIdentifier	 next Char Counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
removeFirst	TokenNameIdentifier	 remove First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charValue	TokenNameIdentifier	 char Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
nextChar	TokenNameIdentifier	 next Char
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextChar	TokenNameIdentifier	 next Char
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextCharCounter	TokenNameIdentifier	 next Char Counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nextChar	TokenNameIdentifier	 next Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
pushChar	TokenNameIdentifier	 push Char
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextCharCounter	TokenNameIdentifier	 next Char Counter
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
addFirst	TokenNameIdentifier	 add First
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
pushLastChar	TokenNameIdentifier	 push Last Char
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
addLast	TokenNameIdentifier	 add Last
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
submap	TokenNameIdentifier	 submap
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chr	TokenNameIdentifier	 chr
=	TokenNameEQUAL	
nextChar	TokenNameIdentifier	 next Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chr	TokenNameIdentifier	 chr
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NormalizeCharMap	TokenNameIdentifier	 Normalize Char Map
subMap	TokenNameIdentifier	 sub Map
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
submap	TokenNameIdentifier	 submap
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
chr	TokenNameIdentifier	 chr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
subMap	TokenNameIdentifier	 sub Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
subMap	TokenNameIdentifier	 sub Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushChar	TokenNameIdentifier	 push Char
(	TokenNameLPAREN	
chr	TokenNameIdentifier	 chr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
normStr	TokenNameIdentifier	 norm Str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cbuf	TokenNameIdentifier	 cbuf
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
pushLastChar	TokenNameIdentifier	 push Last Char
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
cbuf	TokenNameIdentifier	 cbuf
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
