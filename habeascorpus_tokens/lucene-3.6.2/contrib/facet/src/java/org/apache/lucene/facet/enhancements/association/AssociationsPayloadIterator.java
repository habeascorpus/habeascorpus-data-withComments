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
.	TokenNameDOT	
association	TokenNameIdentifier	 association
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
CategoryListParams	TokenNameIdentifier	 Category List Params
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
PayloadIntDecodingIterator	TokenNameIdentifier	 Payload Int Decoding Iterator
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
collections	TokenNameIdentifier	 collections
.	TokenNameDOT	
IntIterator	TokenNameIdentifier	 Int Iterator
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
collections	TokenNameIdentifier	 collections
.	TokenNameDOT	
IntToIntMap	TokenNameIdentifier	 Int To Int Map
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
SimpleIntDecoder	TokenNameIdentifier	 Simple Int Decoder
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Allows easy iteration over the associations payload, decoding and breaking it * to (ordinal, value) pairs, stored in a hash. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Allows easy iteration over the associations payload, decoding and breaking it to (ordinal, value) pairs, stored in a hash. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
AssociationsPayloadIterator	TokenNameIdentifier	 Associations Payload Iterator
{	TokenNameLBRACE	
/** * Default Term for associations */	TokenNameCOMMENT_JAVADOC	 Default Term for associations 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
ASSOCIATION_POSTING_TERM	TokenNameIdentifier	 ASSOCIATION  POSTING  TERM
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
CategoryListParams	TokenNameIdentifier	 Category List Params
.	TokenNameDOT	
DEFAULT_TERM	TokenNameIdentifier	 DEFAULT  TERM
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
AssociationEnhancement	TokenNameIdentifier	 Association Enhancement
.	TokenNameDOT	
CATEGORY_LIST_TERM_TEXT	TokenNameIdentifier	 CATEGORY  LIST  TERM  TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Hash mapping to ordinals to the associated int value */	TokenNameCOMMENT_JAVADOC	 Hash mapping to ordinals to the associated int value 
private	TokenNameprivate	
IntToIntMap	TokenNameIdentifier	 Int To Int Map
ordinalToAssociationMap	TokenNameIdentifier	 ordinal To Association Map
;	TokenNameSEMICOLON	
/** * An inner payload decoder which actually goes through the posting and * decode the ints representing the ordinals and the values */	TokenNameCOMMENT_JAVADOC	 An inner payload decoder which actually goes through the posting and decode the ints representing the ordinals and the values 
private	TokenNameprivate	
PayloadIntDecodingIterator	TokenNameIdentifier	 Payload Int Decoding Iterator
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
;	TokenNameSEMICOLON	
/** * Marking whether there are associations (at all) in the given index */	TokenNameCOMMENT_JAVADOC	 Marking whether there are associations (at all) in the given index 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasAssociations	TokenNameIdentifier	 has Associations
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The long-special-value returned for ordinals which have no associated int * value. It is not in the int range of values making it a valid mark. */	TokenNameCOMMENT_JAVADOC	 The long-special-value returned for ordinals which have no associated int value. It is not in the int range of values making it a valid mark. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
NO_ASSOCIATION	TokenNameIdentifier	 NO  ASSOCIATION
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Construct a new association-iterator, initializing the inner payload * iterator, with the supplied term and checking whether there are any * associations within the given index * * @param reader * a reader containing the postings to be iterated * @param field * the field containing the relevant associations list term */	TokenNameCOMMENT_JAVADOC	 Construct a new association-iterator, initializing the inner payload iterator, with the supplied term and checking whether there are any associations within the given index * @param reader a reader containing the postings to be iterated @param field the field containing the relevant associations list term 
public	TokenNamepublic	
AssociationsPayloadIterator	TokenNameIdentifier	 Associations Payload Iterator
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Initialize the payloadDecodingIterator 	TokenNameCOMMENT_LINE	Initialize the payloadDecodingIterator 
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
=	TokenNameEQUAL	
new	TokenNamenew	
PayloadIntDecodingIterator	TokenNameIdentifier	 Payload Int Decoding Iterator
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
// TODO (Facet): should consolidate with AssociationListTokenizer which 	TokenNameCOMMENT_LINE	TODO (Facet): should consolidate with AssociationListTokenizer which 
// uses AssociationEnhancement.getCatTermText() 	TokenNameCOMMENT_LINE	uses AssociationEnhancement.getCatTermText() 
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
AssociationEnhancement	TokenNameIdentifier	 Association Enhancement
.	TokenNameDOT	
CATEGORY_LIST_TERM_TEXT	TokenNameIdentifier	 CATEGORY  LIST  TERM  TEXT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
SimpleIntDecoder	TokenNameIdentifier	 Simple Int Decoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check whether there are any associations 	TokenNameCOMMENT_LINE	Check whether there are any associations 
hasAssociations	TokenNameIdentifier	 has Associations
=	TokenNameEQUAL	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ordinalToAssociationMap	TokenNameIdentifier	 ordinal To Association Map
=	TokenNameEQUAL	
new	TokenNamenew	
IntToIntMap	TokenNameIdentifier	 Int To Int Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skipping to the next document, fetching its associations & populating the * map. * * @param docId * document id to be skipped to * @return true if the document contains associations and they were fetched * correctly. false otherwise. * @throws IOException * on error */	TokenNameCOMMENT_JAVADOC	 Skipping to the next document, fetching its associations & populating the map. * @param docId document id to be skipped to @return true if the document contains associations and they were fetched correctly. false otherwise. @throws IOException on error 
public	TokenNamepublic	
boolean	TokenNameboolean	
setNextDoc	TokenNameIdentifier	 set Next Doc
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ordinalToAssociationMap	TokenNameIdentifier	 ordinal To Association Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
docContainsAssociations	TokenNameIdentifier	 doc Contains Associations
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
docContainsAssociations	TokenNameIdentifier	 doc Contains Associations
=	TokenNameEQUAL	
fetchAssociations	TokenNameIdentifier	 fetch Associations
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
=	TokenNameEQUAL	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"An Error occured while reading a document's associations payload (docId="	TokenNameStringLiteral	An Error occured while reading a document's associations payload (docId=
+	TokenNamePLUS	
docId	TokenNameIdentifier	 doc Id
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
initCause	TokenNameIdentifier	 init Cause
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
ioe	TokenNameIdentifier	 ioe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
docContainsAssociations	TokenNameIdentifier	 doc Contains Associations
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get int association value for the given ordinal. <br> * The return is either an int value casted as long if the ordinal has an * associated value. Otherwise the returned value would be * {@link #NO_ASSOCIATION} which is 'pure long' value (e.g not in the int * range of values) * * @param ordinal * for which the association value is requested * @return the associated int value (encapsulated in a long) if the ordinal * had an associated value, or {@link #NO_ASSOCIATION} otherwise */	TokenNameCOMMENT_JAVADOC	 Get int association value for the given ordinal. <br> The return is either an int value casted as long if the ordinal has an associated value. Otherwise the returned value would be {@link #NO_ASSOCIATION} which is 'pure long' value (e.g not in the int range of values) * @param ordinal for which the association value is requested @return the associated int value (encapsulated in a long) if the ordinal had an associated value, or {@link #NO_ASSOCIATION} otherwise 
public	TokenNamepublic	
long	TokenNamelong	
getAssociation	TokenNameIdentifier	 get Association
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ordinalToAssociationMap	TokenNameIdentifier	 ordinal To Association Map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ordinalToAssociationMap	TokenNameIdentifier	 ordinal To Association Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NO_ASSOCIATION	TokenNameIdentifier	 NO  ASSOCIATION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an iterator over the ordinals which has an association for the * document set by {@link #setNextDoc(int)}. */	TokenNameCOMMENT_JAVADOC	 Get an iterator over the ordinals which has an association for the document set by {@link #setNextDoc(int)}. 
public	TokenNamepublic	
IntIterator	TokenNameIdentifier	 Int Iterator
getAssociatedOrdinals	TokenNameIdentifier	 get Associated Ordinals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ordinalToAssociationMap	TokenNameIdentifier	 ordinal To Association Map
.	TokenNameDOT	
keyIterator	TokenNameIdentifier	 key Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Skips to the given docId, getting the values in pairs of (ordinal, value) * and populating the map * * @param docId * document id owning the associations * @return true if associations were fetched successfully, false otherwise * @throws IOException * on error */	TokenNameCOMMENT_JAVADOC	 Skips to the given docId, getting the values in pairs of (ordinal, value) and populating the map * @param docId document id owning the associations @return true if associations were fetched successfully, false otherwise @throws IOException on error 
private	TokenNameprivate	
boolean	TokenNameboolean	
fetchAssociations	TokenNameIdentifier	 fetch Associations
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// No associations at all? don't bother trying to seek the docID in the 	TokenNameCOMMENT_LINE	No associations at all? don't bother trying to seek the docID in the 
// posting 	TokenNameCOMMENT_LINE	posting 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasAssociations	TokenNameIdentifier	 has Associations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// No associations for this document? well, nothing to decode than, 	TokenNameCOMMENT_LINE	No associations for this document? well, nothing to decode than, 
// return false 	TokenNameCOMMENT_LINE	return false 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// loop over all the values decoded from the payload in pairs. 	TokenNameCOMMENT_LINE	loop over all the values decoded from the payload in pairs. 
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the ordinal 	TokenNameCOMMENT_LINE	Get the ordinal 
long	TokenNamelong	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
.	TokenNameDOT	
nextCategory	TokenNameIdentifier	 next Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if no ordinal - it's the end of data, break the loop 	TokenNameCOMMENT_LINE	if no ordinal - it's the end of data, break the loop 
if	TokenNameif	
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
>	TokenNameGREATER	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get the associated value 	TokenNameCOMMENT_LINE	get the associated value 
long	TokenNamelong	
association	TokenNameIdentifier	 association
=	TokenNameEQUAL	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
.	TokenNameDOT	
nextCategory	TokenNameIdentifier	 next Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we're at this step - it means we have an ordinal, do we have 	TokenNameCOMMENT_LINE	If we're at this step - it means we have an ordinal, do we have 
// an association for it? 	TokenNameCOMMENT_LINE	an association for it? 
if	TokenNameif	
(	TokenNameLPAREN	
association	TokenNameIdentifier	 association
>	TokenNameGREATER	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No association!!! A Broken Pair!! PANIC! 	TokenNameCOMMENT_LINE	No association!!! A Broken Pair!! PANIC! 
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"ERROR! Associations should come in pairs of (ordinal, value), yet this payload has an odd number of values! (docId="	TokenNameStringLiteral	ERROR! Associations should come in pairs of (ordinal, value), yet this payload has an odd number of values! (docId=
+	TokenNamePLUS	
docId	TokenNameIdentifier	 doc Id
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Populate the map with the given ordinal and association pair 	TokenNameCOMMENT_LINE	Populate the map with the given ordinal and association pair 
ordinalToAssociationMap	TokenNameIdentifier	 ordinal To Association Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
association	TokenNameIdentifier	 association
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AssociationsPayloadIterator	TokenNameIdentifier	 Associations Payload Iterator
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AssociationsPayloadIterator	TokenNameIdentifier	 Associations Payload Iterator
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
associationPayloadIter	TokenNameIdentifier	 association Payload Iter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
