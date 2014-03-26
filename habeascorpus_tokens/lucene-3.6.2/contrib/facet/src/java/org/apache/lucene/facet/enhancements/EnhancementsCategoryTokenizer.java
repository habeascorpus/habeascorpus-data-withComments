package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
enhancements	TokenNameIdentifier	 enhancements
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
.	TokenNameDOT	
CategoryTokenizer	TokenNameIdentifier	 Category Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vint8	TokenNameIdentifier	 Vint8
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A tokenizer which adds to each category token payload according to the * {@link CategoryEnhancement}s defined in the given * {@link EnhancementsIndexingParams}. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A tokenizer which adds to each category token payload according to the {@link CategoryEnhancement}s defined in the given {@link EnhancementsIndexingParams}. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
EnhancementsCategoryTokenizer	TokenNameIdentifier	 Enhancements Category Tokenizer
extends	TokenNameextends	
CategoryTokenizer	TokenNameIdentifier	 Category Tokenizer
{	TokenNameLBRACE	
/** * The data buffer used for payload instance. */	TokenNameCOMMENT_JAVADOC	 The data buffer used for payload instance. 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payloadBytes	TokenNameIdentifier	 payload Bytes
;	TokenNameSEMICOLON	
/** * The category enhancements to handle */	TokenNameCOMMENT_JAVADOC	 The category enhancements to handle 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
>	TokenNameGREATER	
enhancements	TokenNameIdentifier	 enhancements
;	TokenNameSEMICOLON	
/** * Buffers for enhancement payload bytes */	TokenNameCOMMENT_JAVADOC	 Buffers for enhancement payload bytes 
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nStart	TokenNameIdentifier	 n Start
;	TokenNameSEMICOLON	
/** * Constructor. * * @param input * The stream of category tokens. * @param indexingParams * The indexing params to use. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param input The stream of category tokens. @param indexingParams The indexing params to use. @throws IOException 
public	TokenNamepublic	
EnhancementsCategoryTokenizer	TokenNameIdentifier	 Enhancements Category Tokenizer
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
EnhancementsIndexingParams	TokenNameIdentifier	 Enhancements Indexing Params
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payloadBytes	TokenNameIdentifier	 payload Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
Vint8	TokenNameIdentifier	 Vint8
.	TokenNameDOT	
MAXIMUM_BYTES_NEEDED	TokenNameIdentifier	 MAXIMUM  BYTES  NEEDED
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
indexingParams	TokenNameIdentifier	 indexing Params
.	TokenNameDOT	
getCategoryEnhancements	TokenNameIdentifier	 get Category Enhancements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
enhancements	TokenNameIdentifier	 enhancements
=	TokenNameEQUAL	
indexingParams	TokenNameIdentifier	 indexing Params
.	TokenNameDOT	
getCategoryEnhancements	TokenNameIdentifier	 get Category Enhancements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
enhancements	TokenNameIdentifier	 enhancements
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// create array of bytes per enhancement 	TokenNameCOMMENT_LINE	create array of bytes per enhancement 
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// write once the number of enhancements in the payload bytes 	TokenNameCOMMENT_LINE	write once the number of enhancements in the payload bytes 
nStart	TokenNameIdentifier	 n Start
=	TokenNameEQUAL	
Vint8	TokenNameIdentifier	 Vint8
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
payloadBytes	TokenNameIdentifier	 payload Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setPayload	TokenNameIdentifier	 set Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
payloadAttribute	TokenNameIdentifier	 payload Attribute
.	TokenNameDOT	
setPayload	TokenNameIdentifier	 set Payload
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
enhancements	TokenNameIdentifier	 enhancements
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear previous payload content 	TokenNameCOMMENT_LINE	clear previous payload content 
int	TokenNameint	
nBytes	TokenNameIdentifier	 n Bytes
=	TokenNameEQUAL	
nStart	TokenNameIdentifier	 n Start
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
nEnhancementBytes	TokenNameIdentifier	 n Enhancement Bytes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryEnhancement	TokenNameIdentifier	 Category Enhancement
enhancement	TokenNameIdentifier	 enhancement
:	TokenNameCOLON	
enhancements	TokenNameIdentifier	 enhancements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get payload bytes from each enhancement 	TokenNameCOMMENT_LINE	get payload bytes from each enhancement 
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
enhancement	TokenNameIdentifier	 enhancement
.	TokenNameDOT	
getCategoryTokenBytes	TokenNameIdentifier	 get Category Token Bytes
(	TokenNameLPAREN	
categoryAttribute	TokenNameIdentifier	 category Attribute
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// write the number of bytes in the payload 	TokenNameCOMMENT_LINE	write the number of bytes in the payload 
if	TokenNameif	
(	TokenNameLPAREN	
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nBytes	TokenNameIdentifier	 n Bytes
+=	TokenNamePLUS_EQUAL	
Vint8	TokenNameIdentifier	 Vint8
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
payloadBytes	TokenNameIdentifier	 payload Bytes
,	TokenNameCOMMA	
nBytes	TokenNameIdentifier	 n Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nBytes	TokenNameIdentifier	 n Bytes
+=	TokenNamePLUS_EQUAL	
Vint8	TokenNameIdentifier	 Vint8
.	TokenNameDOT	
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
payloadBytes	TokenNameIdentifier	 payload Bytes
,	TokenNameCOMMA	
nBytes	TokenNameIdentifier	 n Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nEnhancementBytes	TokenNameIdentifier	 n Enhancement Bytes
+=	TokenNamePLUS_EQUAL	
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nEnhancementBytes	TokenNameIdentifier	 n Enhancement Bytes
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make sure we have space for all bytes 	TokenNameCOMMENT_LINE	make sure we have space for all bytes 
if	TokenNameif	
(	TokenNameLPAREN	
payloadBytes	TokenNameIdentifier	 payload Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
nBytes	TokenNameIdentifier	 n Bytes
+	TokenNamePLUS	
nEnhancementBytes	TokenNameIdentifier	 n Enhancement Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
nBytes	TokenNameIdentifier	 n Bytes
+	TokenNamePLUS	
nEnhancementBytes	TokenNameIdentifier	 n Enhancement Bytes
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
payloadBytes	TokenNameIdentifier	 payload Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nBytes	TokenNameIdentifier	 n Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payloadBytes	TokenNameIdentifier	 payload Bytes
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add the enhancement payload bytes after the existing bytes 	TokenNameCOMMENT_LINE	add the enhancement payload bytes after the existing bytes 
if	TokenNameif	
(	TokenNameLPAREN	
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
payloadBytes	TokenNameIdentifier	 payload Bytes
,	TokenNameCOMMA	
nBytes	TokenNameIdentifier	 n Bytes
,	TokenNameCOMMA	
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nBytes	TokenNameIdentifier	 n Bytes
+=	TokenNamePLUS_EQUAL	
enhancementBytes	TokenNameIdentifier	 enhancement Bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
payloadBytes	TokenNameIdentifier	 payload Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nBytes	TokenNameIdentifier	 n Bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payloadAttribute	TokenNameIdentifier	 payload Attribute
.	TokenNameDOT	
setPayload	TokenNameIdentifier	 set Payload
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
