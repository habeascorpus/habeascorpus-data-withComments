/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TypeSizes	TokenNameIdentifier	 Type Sizes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
.	TokenNameDOT	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
.	TokenNameDOT	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
;	TokenNameSEMICOLON	
/** * Container that carries compression parameters and chunks to decompress data from stream. */	TokenNameCOMMENT_JAVADOC	 Container that carries compression parameters and chunks to decompress data from stream. 
public	TokenNamepublic	
class	TokenNameclass	
CompressionInfo	TokenNameIdentifier	 Compression Info
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
CompressionInfo	TokenNameIdentifier	 Compression Info
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
CompressionInfoSerializer	TokenNameIdentifier	 Compression Info Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunks	TokenNameIdentifier	 chunks
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompressionInfo	TokenNameIdentifier	 Compression Info
(	TokenNameLPAREN	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunks	TokenNameIdentifier	 chunks
,	TokenNameCOMMA	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
chunks	TokenNameIdentifier	 chunks
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
parameters	TokenNameIdentifier	 parameters
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chunks	TokenNameIdentifier	 chunks
=	TokenNameEQUAL	
chunks	TokenNameIdentifier	 chunks
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
CompressionInfoSerializer	TokenNameIdentifier	 Compression Info Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
CompressionInfo	TokenNameIdentifier	 Compression Info
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
CompressionInfo	TokenNameIdentifier	 Compression Info
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
chunkCount	TokenNameIdentifier	 chunk Count
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
chunkCount	TokenNameIdentifier	 chunk Count
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
chunkCount	TokenNameIdentifier	 chunk Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
chunks	TokenNameIdentifier	 chunks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compression params 	TokenNameCOMMENT_LINE	compression params 
CompressionParameters	TokenNameIdentifier	 Compression Parameters
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompressionInfo	TokenNameIdentifier	 Compression Info
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// chunks 	TokenNameCOMMENT_LINE	chunks 
int	TokenNameint	
chunkCount	TokenNameIdentifier	 chunk Count
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chunkCount	TokenNameIdentifier	 chunk Count
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chunks	TokenNameIdentifier	 chunks
=	TokenNameEQUAL	
new	TokenNamenew	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
[	TokenNameLBRACKET	
chunkCount	TokenNameIdentifier	 chunk Count
]	TokenNameRBRACKET	
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
chunkCount	TokenNameIdentifier	 chunk Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
chunks	TokenNameIdentifier	 chunks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compression params 	TokenNameCOMMENT_LINE	compression params 
CompressionParameters	TokenNameIdentifier	 Compression Parameters
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CompressionInfo	TokenNameIdentifier	 Compression Info
(	TokenNameLPAREN	
chunks	TokenNameIdentifier	 chunks
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
CompressionInfo	TokenNameIdentifier	 Compression Info
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// chunks 	TokenNameCOMMENT_LINE	chunks 
int	TokenNameint	
chunkCount	TokenNameIdentifier	 chunk Count
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
chunks	TokenNameIdentifier	 chunks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
chunkCount	TokenNameIdentifier	 chunk Count
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
chunkCount	TokenNameIdentifier	 chunk Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
CompressionMetadata	TokenNameIdentifier	 Compression Metadata
.	TokenNameDOT	
Chunk	TokenNameIdentifier	 Chunk
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
chunks	TokenNameIdentifier	 chunks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compression params 	TokenNameCOMMENT_LINE	compression params 
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
