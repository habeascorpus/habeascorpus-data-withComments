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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
;	TokenNameSEMICOLON	
/** OpenBitSet with added methods to bulk-update the bits * from a {@link DocIdSetIterator}. */	TokenNameCOMMENT_JAVADOC	 OpenBitSet with added methods to bulk-update the bits from a {@link DocIdSetIterator}. 
public	TokenNamepublic	
class	TokenNameclass	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
extends	TokenNameextends	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
{	TokenNameLBRACE	
/** Construct an OpenBitSetDISI with its bits set * from the doc ids of the given DocIdSetIterator. * Also give a maximum size one larger than the largest doc id for which a * bit may ever be set on this OpenBitSetDISI. */	TokenNameCOMMENT_JAVADOC	 Construct an OpenBitSetDISI with its bits set from the doc ids of the given DocIdSetIterator. Also give a maximum size one larger than the largest doc id for which a bit may ever be set on this OpenBitSetDISI. 
public	TokenNamepublic	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
,	TokenNameCOMMA	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inPlaceOr	TokenNameIdentifier	 in Place Or
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Construct an OpenBitSetDISI with no bits set, and a given maximum size * one larger than the largest doc id for which a bit may ever be set * on this OpenBitSetDISI. */	TokenNameCOMMENT_JAVADOC	 Construct an OpenBitSetDISI with no bits set, and a given maximum size one larger than the largest doc id for which a bit may ever be set on this OpenBitSetDISI. 
public	TokenNamepublic	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
(	TokenNameLPAREN	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Perform an inplace OR with the doc ids from a given DocIdSetIterator, * setting the bit for each such doc id. * These doc ids should be smaller than the maximum size passed to the * constructor. */	TokenNameCOMMENT_JAVADOC	 Perform an inplace OR with the doc ids from a given DocIdSetIterator, setting the bit for each such doc id. These doc ids should be smaller than the maximum size passed to the constructor. 
public	TokenNamepublic	
void	TokenNamevoid	
inPlaceOr	TokenNameIdentifier	 in Place Or
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
disi	TokenNameIdentifier	 disi
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fastSet	TokenNameIdentifier	 fast Set
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Perform an inplace AND with the doc ids from a given DocIdSetIterator, * leaving only the bits set for which the doc ids are in common. * These doc ids should be smaller than the maximum size passed to the * constructor. */	TokenNameCOMMENT_JAVADOC	 Perform an inplace AND with the doc ids from a given DocIdSetIterator, leaving only the bits set for which the doc ids are in common. These doc ids should be smaller than the maximum size passed to the constructor. 
public	TokenNamepublic	
void	TokenNamevoid	
inPlaceAnd	TokenNameIdentifier	 in Place And
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
=	TokenNameEQUAL	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
disiDoc	TokenNameIdentifier	 disi Doc
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
disiDoc	TokenNameIdentifier	 disi Doc
=	TokenNameEQUAL	
disi	TokenNameIdentifier	 disi
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
,	TokenNameCOMMA	
disiDoc	TokenNameIdentifier	 disi Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
=	TokenNameEQUAL	
nextSetBit	TokenNameIdentifier	 next Set Bit
(	TokenNameLPAREN	
disiDoc	TokenNameIdentifier	 disi Doc
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
bitSetDoc	TokenNameIdentifier	 bit Set Doc
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Perform an inplace NOT with the doc ids from a given DocIdSetIterator, * clearing all the bits for each such doc id. * These doc ids should be smaller than the maximum size passed to the * constructor. */	TokenNameCOMMENT_JAVADOC	 Perform an inplace NOT with the doc ids from a given DocIdSetIterator, clearing all the bits for each such doc id. These doc ids should be smaller than the maximum size passed to the constructor. 
public	TokenNamepublic	
void	TokenNamevoid	
inPlaceNot	TokenNameIdentifier	 in Place Not
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
disi	TokenNameIdentifier	 disi
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fastClear	TokenNameIdentifier	 fast Clear
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Perform an inplace XOR with the doc ids from a given DocIdSetIterator, * flipping all the bits for each such doc id. * These doc ids should be smaller than the maximum size passed to the * constructor. */	TokenNameCOMMENT_JAVADOC	 Perform an inplace XOR with the doc ids from a given DocIdSetIterator, flipping all the bits for each such doc id. These doc ids should be smaller than the maximum size passed to the constructor. 
public	TokenNamepublic	
void	TokenNamevoid	
inPlaceXor	TokenNameIdentifier	 in Place Xor
(	TokenNameLPAREN	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
disi	TokenNameIdentifier	 disi
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fastFlip	TokenNameIdentifier	 fast Flip
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
