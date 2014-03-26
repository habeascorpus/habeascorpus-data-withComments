/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
compound	TokenNameIdentifier	 compound
.	TokenNameDOT	
hyphenation	TokenNameIdentifier	 hyphenation
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * This class implements a simple byte vector with access to the underlying * array. * This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. */	TokenNameCOMMENT_JAVADOC	 This class implements a simple byte vector with access to the underlying array. This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. 
public	TokenNamepublic	
class	TokenNameclass	
ByteVector	TokenNameIdentifier	 Byte Vector
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * Capacity increment size */	TokenNameCOMMENT_JAVADOC	 Capacity increment size 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_BLOCK_SIZE	TokenNameIdentifier	 DEFAULT  BLOCK  SIZE
=	TokenNameEQUAL	
2048	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
blockSize	TokenNameIdentifier	 block Size
;	TokenNameSEMICOLON	
/** * The encapsulated array */	TokenNameCOMMENT_JAVADOC	 The encapsulated array 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
/** * Points to next free item */	TokenNameCOMMENT_JAVADOC	 Points to next free item 
private	TokenNameprivate	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteVector	TokenNameIdentifier	 Byte Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_BLOCK_SIZE	TokenNameIdentifier	 DEFAULT  BLOCK  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteVector	TokenNameIdentifier	 Byte Vector
(	TokenNameLPAREN	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
DEFAULT_BLOCK_SIZE	TokenNameIdentifier	 DEFAULT  BLOCK  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteVector	TokenNameIdentifier	 Byte Vector
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
DEFAULT_BLOCK_SIZE	TokenNameIdentifier	 DEFAULT  BLOCK  SIZE
;	TokenNameSEMICOLON	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteVector	TokenNameIdentifier	 Byte Vector
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
capacity	TokenNameIdentifier	 capacity
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
blockSize	TokenNameIdentifier	 block Size
=	TokenNameEQUAL	
DEFAULT_BLOCK_SIZE	TokenNameIdentifier	 DEFAULT  BLOCK  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return number of items in array */	TokenNameCOMMENT_JAVADOC	 return number of items in array 
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns current capacity of array */	TokenNameCOMMENT_JAVADOC	 returns current capacity of array 
public	TokenNamepublic	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
byte	TokenNamebyte	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is to implement memory allocation in the array. Like malloc(). */	TokenNameCOMMENT_JAVADOC	 This is to implement memory allocation in the array. Like malloc(). 
public	TokenNamepublic	
int	TokenNameint	
alloc	TokenNameIdentifier	 alloc
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
>=	TokenNameGREATER_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aux	TokenNameIdentifier	 aux
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
blockSize	TokenNameIdentifier	 block Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
aux	TokenNameIdentifier	 aux
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
aux	TokenNameIdentifier	 aux
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
trimToSize	TokenNameIdentifier	 trim To Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aux	TokenNameIdentifier	 aux
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
aux	TokenNameIdentifier	 aux
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
aux	TokenNameIdentifier	 aux
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
