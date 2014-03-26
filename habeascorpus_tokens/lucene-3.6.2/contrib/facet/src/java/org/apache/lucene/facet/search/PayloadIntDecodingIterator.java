package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
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
UnsafeByteArrayInputStream	TokenNameIdentifier	 Unsafe Byte Array Input Stream
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
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
IntDecoder	TokenNameIdentifier	 Int Decoder
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A payload deserializer comes with its own working space (buffer). One need to * define the {@link IndexReader} and {@link Term} in which the payload resides. * The iterator then consumes the payload information of each document and * decodes it into categories. A typical use case of this class is: * * <pre> * IndexReader reader = [open your reader]; * Term t = new Term(&quot;field&quot;, &quot;where-payload-exists&quot;); * CategoryListIterator cli = new PayloadIntDecodingIterator(reader, t); * if (!cli.init()) { * // it means there are no payloads / documents associated with that term. * // Usually a sanity check. However, init() must be called. * } * DocIdSetIterator disi = [you usually iterate on something else, such as a Scorer]; * int doc; * while ((doc = disi.nextDoc()) != DocIdSetIterator.NO_MORE_DOCS) { * cli.setdoc(doc); * long category; * while ((category = cli.nextCategory()) &lt; Integer.MAX_VALUE) { * } * } * </pre> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A payload deserializer comes with its own working space (buffer). One need to define the {@link IndexReader} and {@link Term} in which the payload resides. The iterator then consumes the payload information of each document and decodes it into categories. A typical use case of this class is: * <pre> IndexReader reader = [open your reader]; Term t = new Term(&quot;field&quot;, &quot;where-payload-exists&quot;); CategoryListIterator cli = new PayloadIntDecodingIterator(reader, t); if (!cli.init()) { // it means there are no payloads / documents associated with that term. // Usually a sanity check. However, init() must be called. } DocIdSetIterator disi = [you usually iterate on something else, such as a Scorer]; int doc; while ((doc = disi.nextDoc()) != DocIdSetIterator.NO_MORE_DOCS) { cli.setdoc(doc); long category; while ((category = cli.nextCategory()) &lt; Integer.MAX_VALUE) { } } </pre> * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
PayloadIntDecodingIterator	TokenNameIdentifier	 Payload Int Decoding Iterator
implements	TokenNameimplements	
CategoryListIterator	TokenNameIdentifier	 Category List Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
UnsafeByteArrayInputStream	TokenNameIdentifier	 Unsafe Byte Array Input Stream
ubais	TokenNameIdentifier	 ubais
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IntDecoder	TokenNameIdentifier	 Int Decoder
decoder	TokenNameIdentifier	 decoder
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PayloadIterator	TokenNameIdentifier	 Payload Iterator
pi	TokenNameIdentifier	 pi
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PayloadIntDecodingIterator	TokenNameIdentifier	 Payload Int Decoding Iterator
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
IntDecoder	TokenNameIdentifier	 Int Decoder
decoder	TokenNameIdentifier	 decoder
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
decoder	TokenNameIdentifier	 decoder
,	TokenNameCOMMA	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PayloadIntDecodingIterator	TokenNameIdentifier	 Payload Int Decoding Iterator
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
IntDecoder	TokenNameIdentifier	 Int Decoder
decoder	TokenNameIdentifier	 decoder
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
new	TokenNamenew	
PayloadIterator	TokenNameIdentifier	 Payload Iterator
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ubais	TokenNameIdentifier	 ubais
=	TokenNameEQUAL	
new	TokenNamenew	
UnsafeByteArrayInputStream	TokenNameIdentifier	 Unsafe Byte Array Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
decoder	TokenNameIdentifier	 decoder
=	TokenNameEQUAL	
decoder	TokenNameIdentifier	 decoder
;	TokenNameSEMICOLON	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
PayloadIntDecodingIterator	TokenNameIdentifier	 Payload Int Decoding Iterator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PayloadIntDecodingIterator	TokenNameIdentifier	 Payload Int Decoding Iterator
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PayloadIntDecodingIterator	TokenNameIdentifier	 Payload Int Decoding Iterator
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hashCode	TokenNameIdentifier	 hash Code
!=	TokenNameNOT_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Hash codes are the same, check equals() to avoid cases of hash-collisions. 	TokenNameCOMMENT_LINE	Hash codes are the same, check equals() to avoid cases of hash-collisions. 
return	TokenNamereturn	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
indexReader	TokenNameIdentifier	 index Reader
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
nextCategory	TokenNameIdentifier	 next Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
setdoc	TokenNameIdentifier	 setdoc
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Initializing the decoding mechanism with the new payload data 	TokenNameCOMMENT_LINE	Initializing the decoding mechanism with the new payload data 
ubais	TokenNameIdentifier	 ubais
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
reInit	TokenNameIdentifier	 re Init
(	TokenNameLPAREN	
ubais	TokenNameIdentifier	 ubais
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
