package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MockIndexInput	TokenNameIdentifier	 Mock Index Input
extends	TokenNameextends	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
{	TokenNameLBRACE	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MockIndexInput	TokenNameIdentifier	 Mock Index Input
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"MockIndexInput"	TokenNameStringLiteral	MockIndexInput
,	TokenNameCOMMA	
BufferedIndexInput	TokenNameIdentifier	 Buffered Index Input
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
readInternal	TokenNameIdentifier	 read Internal
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
int	TokenNameint	
destOffset	TokenNameIdentifier	 dest Offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
remainder	TokenNameIdentifier	 remainder
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
remainder	TokenNameIdentifier	 remainder
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// int bufferNumber = start / buffer.length; 	TokenNameCOMMENT_LINE	int bufferNumber = start / buffer.length; 
int	TokenNameint	
bufferOffset	TokenNameIdentifier	 buffer Offset
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
%	TokenNameREMAINDER	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
bytesInBuffer	TokenNameIdentifier	 bytes In Buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
bufferOffset	TokenNameIdentifier	 buffer Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
=	TokenNameEQUAL	
bytesInBuffer	TokenNameIdentifier	 bytes In Buffer
>=	TokenNameGREATER_EQUAL	
remainder	TokenNameIdentifier	 remainder
?	TokenNameQUESTION	
remainder	TokenNameIdentifier	 remainder
:	TokenNameCOLON	
bytesInBuffer	TokenNameIdentifier	 bytes In Buffer
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
bufferOffset	TokenNameIdentifier	 buffer Offset
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
destOffset	TokenNameIdentifier	 dest Offset
,	TokenNameCOMMA	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
destOffset	TokenNameIdentifier	 dest Offset
+=	TokenNamePLUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
+=	TokenNamePLUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
remainder	TokenNameIdentifier	 remainder
-=	TokenNameMINUS_EQUAL	
bytesToCopy	TokenNameIdentifier	 bytes To Copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pointer	TokenNameIdentifier	 pointer
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
seekInternal	TokenNameIdentifier	 seek Internal
(	TokenNameLPAREN	
long	TokenNamelong	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
