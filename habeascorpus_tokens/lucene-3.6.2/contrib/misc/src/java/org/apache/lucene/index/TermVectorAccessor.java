package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
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
StringHelper	TokenNameIdentifier	 String Helper
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
/* * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Transparent access to the vector space model, * either via TermFreqVector or by resolving it from the inverted index. * <p/> * Resolving a term vector from a large index can be a time consuming process. * <p/> * Warning! This class is not thread safe! */	TokenNameCOMMENT_JAVADOC	 Transparent access to the vector space model, either via TermFreqVector or by resolving it from the inverted index. <p/> Resolving a term vector from a large index can be a time consuming process. <p/> Warning! This class is not thread safe! 
public	TokenNamepublic	
class	TokenNameclass	
TermVectorAccessor	TokenNameIdentifier	 Term Vector Accessor
{	TokenNameLBRACE	
public	TokenNamepublic	
TermVectorAccessor	TokenNameIdentifier	 Term Vector Accessor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Instance reused to save garbage collector some time */	TokenNameCOMMENT_JAVADOC	 Instance reused to save garbage collector some time 
private	TokenNameprivate	
TermVectorMapperDecorator	TokenNameIdentifier	 Term Vector Mapper Decorator
decoratedMapper	TokenNameIdentifier	 decorated Mapper
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorMapperDecorator	TokenNameIdentifier	 Term Vector Mapper Decorator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Visits the TermVectorMapper and populates it with terms available for a given document, * either via a vector created at index time or by resolving them from the inverted index. * * @param indexReader Index source * @param documentNumber Source document to access * @param fieldName Field to resolve * @param mapper Mapper to be mapped with data * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Visits the TermVectorMapper and populates it with terms available for a given document, either via a vector created at index time or by resolving them from the inverted index. * @param indexReader Index source @param documentNumber Source document to access @param fieldName Field to resolve @param mapper Mapper to be mapped with data @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
int	TokenNameint	
documentNumber	TokenNameIdentifier	 document Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
decoratedMapper	TokenNameIdentifier	 decorated Mapper
.	TokenNameDOT	
decorated	TokenNameIdentifier	 decorated
=	TokenNameEQUAL	
mapper	TokenNameIdentifier	 mapper
;	TokenNameSEMICOLON	
decoratedMapper	TokenNameIdentifier	 decorated Mapper
.	TokenNameDOT	
termVectorStored	TokenNameIdentifier	 term Vector Stored
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
getTermFreqVector	TokenNameIdentifier	 get Term Freq Vector
(	TokenNameLPAREN	
documentNumber	TokenNameIdentifier	 document Number
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
decoratedMapper	TokenNameIdentifier	 decorated Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
decoratedMapper	TokenNameIdentifier	 decorated Mapper
.	TokenNameDOT	
termVectorStored	TokenNameIdentifier	 term Vector Stored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
mapper	TokenNameIdentifier	 mapper
,	TokenNameCOMMA	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Instance reused to save garbage collector some time */	TokenNameCOMMENT_JAVADOC	 Instance reused to save garbage collector some time 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
/** Instance reused to save garbage collector some time */	TokenNameCOMMENT_JAVADOC	 Instance reused to save garbage collector some time 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
positions	TokenNameIdentifier	 positions
;	TokenNameSEMICOLON	
/** Instance reused to save garbage collector some time */	TokenNameCOMMENT_JAVADOC	 Instance reused to save garbage collector some time 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
frequencies	TokenNameIdentifier	 frequencies
;	TokenNameSEMICOLON	
/** * Populates the mapper with terms available for the given field in a document * by resolving the inverted index. * * @param indexReader * @param field interned field name * @param mapper * @param documentNumber * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Populates the mapper with terms available for the given field in a document by resolving the inverted index. * @param indexReader @param field interned field name @param mapper @param documentNumber @throws IOException 
private	TokenNameprivate	
void	TokenNamevoid	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
mapper	TokenNameIdentifier	 mapper
,	TokenNameCOMMA	
int	TokenNameint	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frequencies	TokenNameIdentifier	 frequencies
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frequencies	TokenNameIdentifier	 frequencies
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termPositions	TokenNameIdentifier	 term Positions
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frequencies	TokenNameIdentifier	 frequencies
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
termPositions	TokenNameIdentifier	 term Positions
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
isIgnoringPositions	TokenNameIdentifier	 is Ignoring Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
termPositions	TokenNameIdentifier	 term Positions
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
termPositions	TokenNameIdentifier	 term Positions
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
termPositions	TokenNameIdentifier	 term Positions
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
setExpectations	TokenNameIdentifier	 set Expectations
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
!	TokenNameNOT	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
isIgnoringPositions	TokenNameIdentifier	 is Ignoring Positions
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
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
frequencies	TokenNameIdentifier	 frequencies
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
TermVectorMapperDecorator	TokenNameIdentifier	 Term Vector Mapper Decorator
extends	TokenNameextends	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
decorated	TokenNameIdentifier	 decorated
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isIgnoringPositions	TokenNameIdentifier	 is Ignoring Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
decorated	TokenNameIdentifier	 decorated
.	TokenNameDOT	
isIgnoringPositions	TokenNameIdentifier	 is Ignoring Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isIgnoringOffsets	TokenNameIdentifier	 is Ignoring Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
decorated	TokenNameIdentifier	 decorated
.	TokenNameDOT	
isIgnoringOffsets	TokenNameIdentifier	 is Ignoring Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
termVectorStored	TokenNameIdentifier	 term Vector Stored
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setExpectations	TokenNameIdentifier	 set Expectations
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeOffsets	TokenNameIdentifier	 store Offsets
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storePositions	TokenNameIdentifier	 store Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decorated	TokenNameIdentifier	 decorated
.	TokenNameDOT	
setExpectations	TokenNameIdentifier	 set Expectations
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
numTerms	TokenNameIdentifier	 num Terms
,	TokenNameCOMMA	
storeOffsets	TokenNameIdentifier	 store Offsets
,	TokenNameCOMMA	
storePositions	TokenNameIdentifier	 store Positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termVectorStored	TokenNameIdentifier	 term Vector Stored
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
frequency	TokenNameIdentifier	 frequency
,	TokenNameCOMMA	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decorated	TokenNameIdentifier	 decorated
.	TokenNameDOT	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
int	TokenNameint	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decorated	TokenNameIdentifier	 decorated
.	TokenNameDOT	
setDocumentNumber	TokenNameIdentifier	 set Document Number
(	TokenNameLPAREN	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
