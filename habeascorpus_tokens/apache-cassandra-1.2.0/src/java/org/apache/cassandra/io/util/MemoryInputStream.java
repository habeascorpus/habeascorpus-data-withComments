/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MemoryInputStream	TokenNameIdentifier	 Memory Input Stream
extends	TokenNameextends	
AbstractDataInput	TokenNameIdentifier	 Abstract Data Input
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
mem	TokenNameIdentifier	 mem
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MemoryInputStream	TokenNameIdentifier	 Memory Input Stream
(	TokenNameLPAREN	
RefCountedMemory	TokenNameIdentifier	 Ref Counted Memory
mem	TokenNameIdentifier	 mem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mem	TokenNameIdentifier	 mem
=	TokenNameEQUAL	
mem	TokenNameIdentifier	 mem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
mem	TokenNameIdentifier	 mem
.	TokenNameDOT	
getByte	TokenNameIdentifier	 get Byte
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
mem	TokenNameIdentifier	 mem
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
seekInternal	TokenNameIdentifier	 seek Internal
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
skipBytes	TokenNameIdentifier	 skip Bytes
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
seekInternal	TokenNameIdentifier	 seek Internal
(	TokenNameLPAREN	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing. 	TokenNameCOMMENT_LINE	do nothing. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
