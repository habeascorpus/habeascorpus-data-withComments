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
/** * A term in the inverted index, coupled to the documents it occurs in. * * @see org.apache.lucene.index.Term */	TokenNameCOMMENT_JAVADOC	 A term in the inverted index, coupled to the documents it occurs in. * @see org.apache.lucene.index.Term 
public	TokenNamepublic	
class	TokenNameclass	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
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
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
instantiatedTerm	TokenNameIdentifier	 instantiated Term
,	TokenNameCOMMA	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
instantiatedTerm1	TokenNameIdentifier	 instantiated Term1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
instantiatedTerm	TokenNameIdentifier	 instantiated Term
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
instantiatedTerm1	TokenNameIdentifier	 instantiated Term1
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
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
termComparator	TokenNameIdentifier	 term Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
/** * index of term in InstantiatedIndex * @see org.apache.lucene.store.instantiated.InstantiatedIndex#getOrderedTerms() */	TokenNameCOMMENT_JAVADOC	 index of term in InstantiatedIndex @see org.apache.lucene.store.instantiated.InstantiatedIndex#getOrderedTerms() 
private	TokenNameprivate	
int	TokenNameint	
termIndex	TokenNameIdentifier	 term Index
;	TokenNameSEMICOLON	
/** * @return Term associated with this entry of the index object graph */	TokenNameCOMMENT_JAVADOC	 @return Term associated with this entry of the index object graph 
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getTerm	TokenNameIdentifier	 get Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
InstantiatedTerm	TokenNameIdentifier	 Instantiated Term
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// this could speed up TermDocs.skipTo even more 	TokenNameCOMMENT_LINE	this could speed up TermDocs.skipTo even more 
// private Map</** document number*/Integer, /** index in associatedDocuments */Integer> associatedDocumentIndexByDocumentNumber = new HashMap<Integer, Integer>(); 	TokenNameCOMMENT_LINE	private Map</** document number*/Integer, /** index in associatedDocuments */Integer> associatedDocumentIndexByDocumentNumber = new HashMap<Integer, Integer>(); 
// 	TokenNameCOMMENT_LINE	 
// public Map</** document number*/Integer, /** index in associatedDocuments */Integer> getAssociatedDocumentIndexByDocumentNumber() { 	TokenNameCOMMENT_LINE	public Map</** document number*/Integer, /** index in associatedDocuments */Integer> getAssociatedDocumentIndexByDocumentNumber() { 
// return associatedDocumentIndexByDocumentNumber; 	TokenNameCOMMENT_LINE	return associatedDocumentIndexByDocumentNumber; 
// } 	TokenNameCOMMENT_LINE	} 
/** Ordered by document number */	TokenNameCOMMENT_JAVADOC	 Ordered by document number 
private	TokenNameprivate	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
associatedDocuments	TokenNameIdentifier	 associated Documents
;	TokenNameSEMICOLON	
/** * Meta data per document in which this term is occurring. * Ordered by document number. * * @return Meta data per document in which this term is occurring. */	TokenNameCOMMENT_JAVADOC	 Meta data per document in which this term is occurring. Ordered by document number. * @return Meta data per document in which this term is occurring. 
public	TokenNamepublic	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
associatedDocuments	TokenNameIdentifier	 associated Documents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Meta data per document in which this term is occurring. * Ordered by document number. * * @param associatedDocuments meta data per document in which this term is occurring, ordered by document number */	TokenNameCOMMENT_JAVADOC	 Meta data per document in which this term is occurring. Ordered by document number. * @param associatedDocuments meta data per document in which this term is occurring, ordered by document number 
void	TokenNamevoid	
setAssociatedDocuments	TokenNameIdentifier	 set Associated Documents
(	TokenNameLPAREN	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
associatedDocuments	TokenNameIdentifier	 associated Documents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
associatedDocuments	TokenNameIdentifier	 associated Documents
=	TokenNameEQUAL	
associatedDocuments	TokenNameIdentifier	 associated Documents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds index to the first beyond the current whose document number is * greater than or equal to <i>target</i>, -1 if there is no such element. * * @param target the document number to match * @return -1 if there is no such element */	TokenNameCOMMENT_JAVADOC	 Finds index to the first beyond the current whose document number is greater than or equal to <i>target</i>, -1 if there is no such element. * @param target the document number to match @return -1 if there is no such element 
public	TokenNamepublic	
int	TokenNameint	
seekCeilingDocumentInformationIndex	TokenNameIdentifier	 seek Ceiling Document Information Index
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seekCeilingDocumentInformationIndex	TokenNameIdentifier	 seek Ceiling Document Information Index
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds index to the first beyond the current whose document number is * greater than or equal to <i>target</i>, -1 if there is no such element. * * @param target the document number to match * @param startOffset associated documents index start offset * @return -1 if there is no such element */	TokenNameCOMMENT_JAVADOC	 Finds index to the first beyond the current whose document number is greater than or equal to <i>target</i>, -1 if there is no such element. * @param target the document number to match @param startOffset associated documents index start offset @return -1 if there is no such element 
public	TokenNamepublic	
int	TokenNameint	
seekCeilingDocumentInformationIndex	TokenNameIdentifier	 seek Ceiling Document Information Index
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seekCeilingDocumentInformationIndex	TokenNameIdentifier	 seek Ceiling Document Information Index
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Finds index to the first beyond the current whose document number is * greater than or equal to <i>target</i>, -1 if there is no such element. * * @param target the document number to match * @param startOffset associated documents index start offset * @param endPosition associated documents index end position * @return -1 if there is no such element */	TokenNameCOMMENT_JAVADOC	 Finds index to the first beyond the current whose document number is greater than or equal to <i>target</i>, -1 if there is no such element. * @param target the document number to match @param startOffset associated documents index start offset @param endPosition associated documents index end position @return -1 if there is no such element 
public	TokenNamepublic	
int	TokenNameint	
seekCeilingDocumentInformationIndex	TokenNameIdentifier	 seek Ceiling Document Information Index
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
int	TokenNameint	
endPosition	TokenNameIdentifier	 end Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
binarySearchAssociatedDocuments	TokenNameIdentifier	 binary Search Associated Documents
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endPosition	TokenNameIdentifier	 end Position
-	TokenNameMINUS	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// int pos = Arrays.binarySearch(getAssociatedDocuments(), target, InstantiatedTermDocumentInformation.doumentNumberIntegerComparator); 	TokenNameCOMMENT_LINE	int pos = Arrays.binarySearch(getAssociatedDocuments(), target, InstantiatedTermDocumentInformation.doumentNumberIntegerComparator); 
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
binarySearchAssociatedDocuments	TokenNameIdentifier	 binary Search Associated Documents
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
binarySearchAssociatedDocuments	TokenNameIdentifier	 binary Search Associated Documents
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
binarySearchAssociatedDocuments	TokenNameIdentifier	 binary Search Associated Documents
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
binarySearchAssociatedDocuments	TokenNameIdentifier	 binary Search Associated Documents
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
associatedDocuments	TokenNameIdentifier	 associated Documents
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param target value to search for in the array * @param offset index of the first valid value in the array * @param length number of valid values in the array * @return index of an occurrence of key in array, or -(insertionIndex + 1) if key is not contained in array (<i>insertionIndex</i> is then the index at which key could be inserted). */	TokenNameCOMMENT_JAVADOC	 @param target value to search for in the array @param offset index of the first valid value in the array @param length number of valid values in the array @return index of an occurrence of key in array, or -(insertionIndex + 1) if key is not contained in array (<i>insertionIndex</i> is then the index at which key could be inserted). 
public	TokenNamepublic	
int	TokenNameint	
binarySearchAssociatedDocuments	TokenNameIdentifier	 binary Search Associated Documents
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// implementation originally from http://ochafik.free.fr/blog/?p=106 	TokenNameCOMMENT_LINE	implementation originally from http://ochafik.free.fr/blog/?p=106 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
minVal	TokenNameIdentifier	 min Val
=	TokenNameEQUAL	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
min	TokenNameIdentifier	 min
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxVal	TokenNameIdentifier	 max Val
=	TokenNameEQUAL	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
max	TokenNameIdentifier	 max
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nPreviousSteps	TokenNameIdentifier	 n Previous Steps
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// be careful not to compute key - minVal, for there might be an integer overflow. 	TokenNameCOMMENT_LINE	be careful not to compute key - minVal, for there might be an integer overflow. 
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
<=	TokenNameLESS_EQUAL	
minVal	TokenNameIdentifier	 min Val
)	TokenNameRPAREN	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
==	TokenNameEQUAL_EQUAL	
minVal	TokenNameIdentifier	 min Val
?	TokenNameQUESTION	
min	TokenNameIdentifier	 min
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
>=	TokenNameGREATER_EQUAL	
maxVal	TokenNameIdentifier	 max Val
)	TokenNameRPAREN	
return	TokenNamereturn	
target	TokenNameIdentifier	 target
==	TokenNameEQUAL_EQUAL	
maxVal	TokenNameIdentifier	 max Val
?	TokenNameQUESTION	
max	TokenNameIdentifier	 max
:	TokenNameCOLON	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
assert	TokenNameassert	
min	TokenNameIdentifier	 min
!=	TokenNameNOT_EQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
int	TokenNameint	
pivot	TokenNameIdentifier	 pivot
;	TokenNameSEMICOLON	
// A typical binarySearch algorithm uses pivot = (min + max) / 2. 	TokenNameCOMMENT_LINE	A typical binarySearch algorithm uses pivot = (min + max) / 2. 
// The pivot we use here tries to be smarter and to choose a pivot close to the expectable location of the key. 	TokenNameCOMMENT_LINE	The pivot we use here tries to be smarter and to choose a pivot close to the expectable location of the key. 
// This reduces dramatically the number of steps needed to get to the key. 	TokenNameCOMMENT_LINE	This reduces dramatically the number of steps needed to get to the key. 
// However, it does not work well with a logarithmic distribution of values, for instance. 	TokenNameCOMMENT_LINE	However, it does not work well with a logarithmic distribution of values, for instance. 
// When the key is not found quickly the smart way, we switch to the standard pivot. 	TokenNameCOMMENT_LINE	When the key is not found quickly the smart way, we switch to the standard pivot. 
if	TokenNameif	
(	TokenNameLPAREN	
nPreviousSteps	TokenNameIdentifier	 n Previous Steps
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pivot	TokenNameIdentifier	 pivot
=	TokenNameEQUAL	
(	TokenNameLPAREN	
min	TokenNameIdentifier	 min
+	TokenNamePLUS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// stop increasing nPreviousSteps from now on 	TokenNameCOMMENT_LINE	stop increasing nPreviousSteps from now on 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// NOTE: We cannot do the following operations in int precision, because there might be overflows. 	TokenNameCOMMENT_LINE	NOTE: We cannot do the following operations in int precision, because there might be overflows. 
// long operations are slower than float operations with the hardware this was tested on (intel core duo 2, JVM 1.6.0). 	TokenNameCOMMENT_LINE	long operations are slower than float operations with the hardware this was tested on (intel core duo 2, JVM 1.6.0). 
// Overall, using float proved to be the safest and fastest approach. 	TokenNameCOMMENT_LINE	Overall, using float proved to be the safest and fastest approach. 
pivot	TokenNameIdentifier	 pivot
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
+	TokenNamePLUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
-	TokenNameMINUS	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
minVal	TokenNameIdentifier	 min Val
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
maxVal	TokenNameIdentifier	 max Val
-	TokenNameMINUS	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
minVal	TokenNameIdentifier	 min Val
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
-	TokenNameMINUS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nPreviousSteps	TokenNameIdentifier	 n Previous Steps
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
pivotVal	TokenNameIdentifier	 pivot Val
=	TokenNameEQUAL	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
pivot	TokenNameIdentifier	 pivot
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: do not store key - pivotVal because of overflows 	TokenNameCOMMENT_LINE	NOTE: do not store key - pivotVal because of overflows 
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
>	TokenNameGREATER	
pivotVal	TokenNameIdentifier	 pivot Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
pivot	TokenNameIdentifier	 pivot
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
==	TokenNameEQUAL_EQUAL	
pivotVal	TokenNameIdentifier	 pivot Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pivot	TokenNameIdentifier	 pivot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
min	TokenNameIdentifier	 min
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
pivot	TokenNameIdentifier	 pivot
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxVal	TokenNameIdentifier	 max Val
=	TokenNameEQUAL	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
max	TokenNameIdentifier	 max
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minVal	TokenNameIdentifier	 min Val
=	TokenNameEQUAL	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
min	TokenNameIdentifier	 min
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocumentNumber	TokenNameIdentifier	 get Document Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Navigates to the view of this occurrences of this term in a specific document. * * This method is only used by InstantiatedIndex(IndexReader) and * should not be optimized for less CPU at the cost of more RAM. * * @param documentNumber the n:th document in the index * @return view of this term from specified document */	TokenNameCOMMENT_JAVADOC	 Navigates to the view of this occurrences of this term in a specific document. * This method is only used by InstantiatedIndex(IndexReader) and should not be optimized for less CPU at the cost of more RAM. * @param documentNumber the n:th document in the index @return view of this term from specified document 
public	TokenNamepublic	
InstantiatedTermDocumentInformation	TokenNameIdentifier	 Instantiated Term Document Information
getAssociatedDocument	TokenNameIdentifier	 get Associated Document
(	TokenNameLPAREN	
int	TokenNameint	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
binarySearchAssociatedDocuments	TokenNameIdentifier	 binary Search Associated Documents
(	TokenNameLPAREN	
documentNumber	TokenNameIdentifier	 document Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
getAssociatedDocuments	TokenNameIdentifier	 get Associated Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getTermIndex	TokenNameIdentifier	 get Term Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termIndex	TokenNameIdentifier	 term Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTermIndex	TokenNameIdentifier	 set Term Index
(	TokenNameLPAREN	
int	TokenNameint	
termIndex	TokenNameIdentifier	 term Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
termIndex	TokenNameIdentifier	 term Index
=	TokenNameEQUAL	
termIndex	TokenNameIdentifier	 term Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
