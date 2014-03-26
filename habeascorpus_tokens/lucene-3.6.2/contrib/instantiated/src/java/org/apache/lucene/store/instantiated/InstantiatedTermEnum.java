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
Term	TokenNameIdentifier	 Term
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
TermEnum	TokenNameIdentifier	 Term Enum
;	TokenNameSEMICOLON	
/** * A {@link org.apache.lucene.index.TermEnum} navigating an {@link org.apache.lucene.store.instantiated.InstantiatedIndexReader}. */	TokenNameCOMMENT_JAVADOC	 A {@link org.apache.lucene.index.TermEnum} navigating an {@link org.apache.lucene.store.instantiated.InstantiatedIndexReader}. 
public	TokenNamepublic	
class	TokenNameclass	
InstantiatedTermEnum	TokenNameIdentifier	 Instantiated Term Enum
extends	TokenNameextends	
TermEnum	TokenNameIdentifier	 Term Enum
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
InstantiatedIndexReader	TokenNameIdentifier	 Instantiated Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InstantiatedTermEnum	TokenNameIdentifier	 Instantiated Term Enum
(	TokenNameLPAREN	
InstantiatedIndexReader	TokenNameIdentifier	 Instantiated Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nextTermIndex	TokenNameIdentifier	 next Term Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InstantiatedTermEnum	TokenNameIdentifier	 Instantiated Term Enum
(	TokenNameLPAREN	
InstantiatedIndexReader	TokenNameIdentifier	 Instantiated Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nextTermIndex	TokenNameIdentifier	 next Term Index
=	TokenNameEQUAL	
startPosition	TokenNameIdentifier	 start Position
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
nextTermIndex	TokenNameIdentifier	 next Term Index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
/** * Increments the enumeration to the next element. True if one exists. */	TokenNameCOMMENT_JAVADOC	 Increments the enumeration to the next element. True if one exists. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOrderedTerms	TokenNameIdentifier	 get Ordered Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
nextTermIndex	TokenNameIdentifier	 next Term Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getOrderedTerms	TokenNameIdentifier	 get Ordered Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
nextTermIndex	TokenNameIdentifier	 next Term Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
nextTermIndex	TokenNameIdentifier	 next Term Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the current Term in the enumeration. */	TokenNameCOMMENT_JAVADOC	 Returns the current Term in the enumeration. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the docFreq of the current Term in the enumeration. */	TokenNameCOMMENT_JAVADOC	 Returns the docFreq of the current Term in the enumeration. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes the enumeration to further activity, freeing resources. */	TokenNameCOMMENT_JAVADOC	 Closes the enumeration to further activity, freeing resources. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
