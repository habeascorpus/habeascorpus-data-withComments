package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitSet	TokenNameIdentifier	 Bit Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSet	TokenNameIdentifier	 Doc Id Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
;	TokenNameSEMICOLON	
/** Simple DocIdSet and DocIdSetIterator backed by a BitSet */	TokenNameCOMMENT_JAVADOC	 Simple DocIdSet and DocIdSetIterator backed by a BitSet 
public	TokenNamepublic	
class	TokenNameclass	
DocIdBitSet	TokenNameIdentifier	 Doc Id Bit Set
extends	TokenNameextends	
DocIdSet	TokenNameIdentifier	 Doc Id Set
{	TokenNameLBRACE	
private	TokenNameprivate	
BitSet	TokenNameIdentifier	 Bit Set
bitSet	TokenNameIdentifier	 bit Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocIdBitSet	TokenNameIdentifier	 Doc Id Bit Set
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
bitSet	TokenNameIdentifier	 bit Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bitSet	TokenNameIdentifier	 bit Set
=	TokenNameEQUAL	
bitSet	TokenNameIdentifier	 bit Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DocIdBitSetIterator	TokenNameIdentifier	 Doc Id Bit Set Iterator
(	TokenNameLPAREN	
bitSet	TokenNameIdentifier	 bit Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This DocIdSet implementation is cacheable. */	TokenNameCOMMENT_JAVADOC	 This DocIdSet implementation is cacheable. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the underlying BitSet. */	TokenNameCOMMENT_JAVADOC	 Returns the underlying BitSet. 
public	TokenNamepublic	
BitSet	TokenNameIdentifier	 Bit Set
getBitSet	TokenNameIdentifier	 get Bit Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
bitSet	TokenNameIdentifier	 bit Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DocIdBitSetIterator	TokenNameIdentifier	 Doc Id Bit Set Iterator
extends	TokenNameextends	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BitSet	TokenNameIdentifier	 Bit Set
bitSet	TokenNameIdentifier	 bit Set
;	TokenNameSEMICOLON	
DocIdBitSetIterator	TokenNameIdentifier	 Doc Id Bit Set Iterator
(	TokenNameLPAREN	
BitSet	TokenNameIdentifier	 Bit Set
bitSet	TokenNameIdentifier	 bit Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bitSet	TokenNameIdentifier	 bit Set
=	TokenNameEQUAL	
bitSet	TokenNameIdentifier	 bit Set
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docId	TokenNameIdentifier	 doc Id
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docId	TokenNameIdentifier	 doc Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// (docId + 1) on next line requires -1 initial value for docNr: 	TokenNameCOMMENT_LINE	(docId + 1) on next line requires -1 initial value for docNr: 
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
bitSet	TokenNameIdentifier	 bit Set
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
docId	TokenNameIdentifier	 doc Id
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -1 returned by BitSet.nextSetBit() when exhausted 	TokenNameCOMMENT_LINE	-1 returned by BitSet.nextSetBit() when exhausted 
docId	TokenNameIdentifier	 doc Id
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
:	TokenNameCOLON	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docId	TokenNameIdentifier	 doc Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
bitSet	TokenNameIdentifier	 bit Set
.	TokenNameDOT	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -1 returned by BitSet.nextSetBit() when exhausted 	TokenNameCOMMENT_LINE	-1 returned by BitSet.nextSetBit() when exhausted 
docId	TokenNameIdentifier	 doc Id
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
:	TokenNameCOLON	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docId	TokenNameIdentifier	 doc Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
