package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
writercache	TokenNameIdentifier	 writercache
.	TokenNameDOT	
cl2o	TokenNameIdentifier	 cl2o
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Similar to {@link StringBuilder}, but with a more efficient growing strategy. * This class uses char array blocks to grow. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Similar to {@link StringBuilder}, but with a more efficient growing strategy. This class uses char array blocks to grow. * @lucene.experimental 
class	TokenNameclass	
CharBlockArray	TokenNameIdentifier	 Char Block Array
implements	TokenNameimplements	
Appendable	TokenNameIdentifier	 Appendable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
DefaultBlockSize	TokenNameIdentifier	 Default Block Size
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 32 KB default size 	TokenNameCOMMENT_LINE	32 KB default size 
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
Block	TokenNameIdentifier	 Block
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Block	TokenNameIdentifier	 Block
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Block	TokenNameIdentifier	 Block
>	TokenNameGREATER	
blocks	TokenNameIdentifier	 blocks
;	TokenNameSEMICOLON	
Block	TokenNameIdentifier	 Block
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
CharBlockArray	TokenNameIdentifier	 Char Block Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DefaultBlockSize	TokenNameIdentifier	 Default Block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CharBlockArray	TokenNameIdentifier	 Char Block Array
(	TokenNameLPAREN	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Block	TokenNameIdentifier	 Block
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
addBlock	TokenNameIdentifier	 add Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addBlock	TokenNameIdentifier	 add Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
Block	TokenNameIdentifier	 Block
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
blockIndex	TokenNameIdentifier	 block Index
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
/	TokenNameDIVIDE	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
indexInBlock	TokenNameIdentifier	 index In Block
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
%	TokenNameREMAINDER	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharBlockArray	TokenNameIdentifier	 Char Block Array
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharBlockArray	TokenNameIdentifier	 Char Block Array
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addBlock	TokenNameIdentifier	 add Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharBlockArray	TokenNameIdentifier	 Char Block Array
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharBlockArray	TokenNameIdentifier	 Char Block Array
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
int	TokenNameint	
remain	TokenNameIdentifier	 remain
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
remain	TokenNameIdentifier	 remain
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addBlock	TokenNameIdentifier	 add Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
remain	TokenNameIdentifier	 remain
;	TokenNameSEMICOLON	
int	TokenNameint	
remainingInBlock	TokenNameIdentifier	 remaining In Block
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remainingInBlock	TokenNameIdentifier	 remaining In Block
<	TokenNameLESS	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
remainingInBlock	TokenNameIdentifier	 remaining In Block
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
remain	TokenNameIdentifier	 remain
-=	TokenNameMINUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharBlockArray	TokenNameIdentifier	 Char Block Array
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
remain	TokenNameIdentifier	 remain
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
remain	TokenNameIdentifier	 remain
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addBlock	TokenNameIdentifier	 add Block
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
remain	TokenNameIdentifier	 remain
;	TokenNameSEMICOLON	
int	TokenNameint	
remainingInBlock	TokenNameIdentifier	 remaining In Block
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
blockSize	TokenNameIdentifier	 block Size
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remainingInBlock	TokenNameIdentifier	 remaining In Block
<	TokenNameLESS	
toCopy	TokenNameIdentifier	 to Copy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
toCopy	TokenNameIdentifier	 to Copy
=	TokenNameEQUAL	
remainingInBlock	TokenNameIdentifier	 remaining In Block
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
toCopy	TokenNameIdentifier	 to Copy
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
remain	TokenNameIdentifier	 remain
-=	TokenNameMINUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
toCopy	TokenNameIdentifier	 to Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Block	TokenNameIdentifier	 Block
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
blockIndex	TokenNameIdentifier	 block Index
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
indexInBlock	TokenNameIdentifier	 index In Block
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"subsequence not implemented yet"	TokenNameStringLiteral	subsequence not implemented yet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
blockSize	TokenNameIdentifier	 block Size
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
this	TokenNamethis	
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
blocks	TokenNameIdentifier	 blocks
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
oos	TokenNameIdentifier	 oos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
oos	TokenNameIdentifier	 oos
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oos	TokenNameIdentifier	 oos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oos	TokenNameIdentifier	 oos
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
CharBlockArray	TokenNameIdentifier	 Char Block Array
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
ois	TokenNameIdentifier	 ois
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ois	TokenNameIdentifier	 ois
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CharBlockArray	TokenNameIdentifier	 Char Block Array
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharBlockArray	TokenNameIdentifier	 Char Block Array
)	TokenNameRPAREN	
ois	TokenNameIdentifier	 ois
.	TokenNameDOT	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ois	TokenNameIdentifier	 ois
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ois	TokenNameIdentifier	 ois
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
