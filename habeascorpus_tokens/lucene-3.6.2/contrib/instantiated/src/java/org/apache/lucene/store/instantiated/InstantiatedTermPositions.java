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
/** * Copyright 2006 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2006 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermPositions	TokenNameIdentifier	 Term Positions
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * A {@link org.apache.lucene.index.TermPositions} navigating an {@link InstantiatedIndexReader}. */	TokenNameCOMMENT_JAVADOC	 A {@link org.apache.lucene.index.TermPositions} navigating an {@link InstantiatedIndexReader}. 
public	TokenNamepublic	
class	TokenNameclass	
InstantiatedTermPositions	TokenNameIdentifier	 Instantiated Term Positions
extends	TokenNameextends	
InstantiatedTermDocs	TokenNameIdentifier	 Instantiated Term Docs
implements	TokenNameimplements	
TermPositions	TokenNameIdentifier	 Term Positions
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentDocumentInformation	TokenNameIdentifier	 current Document Information
.	TokenNameDOT	
getPayloads	TokenNameIdentifier	 get Payloads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
currentTermPositionIndex	TokenNameIdentifier	 current Term Position Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
payloads	TokenNameIdentifier	 payloads
=	TokenNameEQUAL	
currentDocumentInformation	TokenNameIdentifier	 current Document Information
.	TokenNameDOT	
getPayloads	TokenNameIdentifier	 get Payloads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
currentTermPositionIndex	TokenNameIdentifier	 current Term Position Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// read payloads lazily 	TokenNameCOMMENT_LINE	read payloads lazily 
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the array is too small to store the payload data, 	TokenNameCOMMENT_LINE	the array is too small to store the payload data, 
return	TokenNamereturn	
payloads	TokenNameIdentifier	 payloads
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
payloads	TokenNameIdentifier	 payloads
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
payloads	TokenNameIdentifier	 payloads
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPayloadAvailable	TokenNameIdentifier	 is Payload Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentDocumentInformation	TokenNameIdentifier	 current Document Information
.	TokenNameDOT	
getPayloads	TokenNameIdentifier	 get Payloads
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
currentTermPositionIndex	TokenNameIdentifier	 current Term Position Index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InstantiatedTermPositions	TokenNameIdentifier	 Instantiated Term Positions
(	TokenNameLPAREN	
InstantiatedIndexReader	TokenNameIdentifier	 Instantiated Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns next position in the current document. It is an error to call * this more than {@link #freq()} times * without calling {@link #next()}<p> This is * invalid until {@link #next()} is called for * the first time. */	TokenNameCOMMENT_JAVADOC	 Returns next position in the current document. It is an error to call this more than {@link #freq()} times without calling {@link #next()}<p> This is invalid until {@link #next()} is called for the first time. 
public	TokenNamepublic	
int	TokenNameint	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentTermPositionIndex	TokenNameIdentifier	 current Term Position Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// if you get an array out of index exception here, 	TokenNameCOMMENT_LINE	if you get an array out of index exception here, 
// it might be due to currentDocumentInformation.getIndexFromTerm not being set!! 	TokenNameCOMMENT_LINE	it might be due to currentDocumentInformation.getIndexFromTerm not being set!! 
return	TokenNamereturn	
currentDocumentInformation	TokenNameIdentifier	 current Document Information
.	TokenNameDOT	
getTermPositions	TokenNameIdentifier	 get Term Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
currentTermPositionIndex	TokenNameIdentifier	 current Term Position Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
currentTermPositionIndex	TokenNameIdentifier	 current Term Position Index
;	TokenNameSEMICOLON	
/** * Moves to the next pair in the enumeration. * <p> Returns true if there is such a next pair in the enumeration. */	TokenNameCOMMENT_JAVADOC	 Moves to the next pair in the enumeration. <p> Returns true if there is such a next pair in the enumeration. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentTermPositionIndex	TokenNameIdentifier	 current Term Position Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skips entries to the first beyond the current whose document number is * greater than or equal to <currentTermPositionIndex>target</currentTermPositionIndex>. <p>Returns true iff there is such * an entry. <p>Behaves as if written: <pre> * boolean skipTo(int target) { * do { * if (!next()) * return false; * } while (target > doc()); * return true; * } * </pre> * Some implementations are considerably more efficient than that. */	TokenNameCOMMENT_JAVADOC	 Skips entries to the first beyond the current whose document number is greater than or equal to <currentTermPositionIndex>target</currentTermPositionIndex>. <p>Returns true iff there is such an entry. <p>Behaves as if written: <pre> boolean skipTo(int target) { do { if (!next()) return false; } while (target > doc()); return true; } </pre> Some implementations are considerably more efficient than that. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentTermPositionIndex	TokenNameIdentifier	 current Term Position Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
