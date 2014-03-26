package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
instantiated	TokenNameIdentifier	 instantiated
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
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
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
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
/** * Copyright 2006 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2006 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * There is one instance of this class per indexed term in a document * and it contains the meta data about each occurrence of a term in a document. * * It is the inner glue of the inverted index. * * <pre> * [Term]-- {0..*} | {0..*} --(field)[Document] * &lt;&lt;ordered>> * | * [TermDocumentInformation] * +payloads * +termPositions * +termOffsets * </pre> * */	TokenNameCOMMENT_JAVADOC	 There is one instance of this class per indexed term in a document and it contains the meta data about each occurrence of a term in a document. * It is the inner glue of the inverted index. * <pre> [Term]-- {0..*} | {0..*} --(field)[Document] &lt;&lt;ordered>> | [TermDocumentInformation] +payloads +termPositions +termOffsets </pre> 
public	TokenNamepublic	
class	TokenNameclass	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1l	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
>	TokenNameGREATER	
termComparator	TokenNameIdentifier	 term Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
instantiatedTermDocumentInformation	TokenNameIdentifier	 instantiated Term Document Information
,	TokenNameCOMMA	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
instantiatedTermDocumentInformation1	TokenNameIdentifier	 instantiated Term Document Information1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instantiatedTermDocumentInformation	TokenNameIdentifier	 instantiated Term Document Information
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
instantiatedTermDocumentInformation1	TokenNameIdentifier	 instantiated Term Document Information1
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
>	TokenNameGREATER	
documentNumberComparator	TokenNameIdentifier	 document Number Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
instantiatedTermDocumentInformation	TokenNameIdentifier	 instantiated Term Document Information
,	TokenNameCOMMA	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
instantiatedTermDocumentInformation1	TokenNameIdentifier	 instantiated Term Document Information1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instantiatedTermDocumentInformation	TokenNameIdentifier	 instantiated Term Document Information
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
instantiatedTermDocumentInformation1	TokenNameIdentifier	 instantiated Term Document Information1
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
doumentNumberIntegerComparator	TokenNameIdentifier	 doument Number Integer Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
di	TokenNameIdentifier	 di
=	TokenNameEQUAL	
(	TokenNameLPAREN	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
o2	TokenNameIdentifier	 o2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payloads	TokenNameIdentifier	 payloads
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termPositions	TokenNameIdentifier	 term Positions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termOffsets	TokenNameIdentifier	 term Offsets
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
(	TokenNameLPAREN	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termPositions	TokenNameIdentifier	 term Positions
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payloads	TokenNameIdentifier	 payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
=	TokenNameEQUAL	
termPositions	TokenNameIdentifier	 term Positions
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
payloads	TokenNameIdentifier	 payloads
=	TokenNameEQUAL	
payloads	TokenNameIdentifier	 payloads
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not quite sure why I wanted this. 	TokenNameCOMMENT_LINE	not quite sure why I wanted this. 
// /** 	TokenNameCOMMENT_LINE	/** 
// * [Term]--- {0..* ordered} ->[Info] 	TokenNameCOMMENT_LINE	* [Term]--- {0..* ordered} ->[Info] 
// */ 	TokenNameCOMMENT_LINE	*/ 
// private int indexFromTerm; 	TokenNameCOMMENT_LINE	private int indexFromTerm; 
// public int getIndexFromTerm() { 	TokenNameCOMMENT_LINE	public int getIndexFromTerm() { 
// return indexFromTerm; 	TokenNameCOMMENT_LINE	return indexFromTerm; 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// void setIndexFromTerm(int indexFromTerm) { 	TokenNameCOMMENT_LINE	void setIndexFromTerm(int indexFromTerm) { 
// this.indexFromTerm = indexFromTerm; 	TokenNameCOMMENT_LINE	this.indexFromTerm = indexFromTerm; 
// } 	TokenNameCOMMENT_LINE	} 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termPositions	TokenNameIdentifier	 term Positions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPayloads	TokenNameIdentifier	 get Payloads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
payloads	TokenNameIdentifier	 payloads
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setTermPositions	TokenNameIdentifier	 set Term Positions
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termPositions	TokenNameIdentifier	 term Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
=	TokenNameEQUAL	
termPositions	TokenNameIdentifier	 term Positions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setTerm	TokenNameIdentifier	 set Term
(	TokenNameLPAREN	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setDocument	TokenNameIdentifier	 set Document
(	TokenNameLPAREN	
InstantiatedDocument	TokenNameIdentifier	 Instantiated Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTermOffsets	TokenNameIdentifier	 get Term Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termOffsets	TokenNameIdentifier	 term Offsets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setTermOffsets	TokenNameIdentifier	 set Term Offsets
(	TokenNameLPAREN	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termOffsets	TokenNameIdentifier	 term Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
termOffsets	TokenNameIdentifier	 term Offsets
=	TokenNameEQUAL	
termOffsets	TokenNameIdentifier	 term Offsets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
