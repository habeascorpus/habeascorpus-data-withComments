package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermDocs	TokenNameIdentifier	 Term Docs
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
/** * KeepMode determines which document id to consider as the master, all others being * identified as duplicates. Selecting the "first occurrence" can potentially save on IO. */	TokenNameCOMMENT_JAVADOC	 KeepMode determines which document id to consider as the master, all others being identified as duplicates. Selecting the "first occurrence" can potentially save on IO. 
int	TokenNameint	
keepMode	TokenNameIdentifier	 keep Mode
=	TokenNameEQUAL	
KM_USE_FIRST_OCCURRENCE	TokenNameIdentifier	 KM  USE  FIRST  OCCURRENCE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KM_USE_FIRST_OCCURRENCE	TokenNameIdentifier	 KM  USE  FIRST  OCCURRENCE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
KM_USE_LAST_OCCURRENCE	TokenNameIdentifier	 KM  USE  LAST  OCCURRENCE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * "Full" processing mode starts by setting all bits to false and only setting bits * for documents that contain the given field and are identified as none-duplicates. * "Fast" processing sets all bits to true then unsets all duplicate docs found for the * given field. This approach avoids the need to read TermDocs for terms that are seen * to have a document frequency of exactly "1" (i.e. no duplicates). While a potentially * faster approach , the downside is that bitsets produced will include bits set for * documents that do not actually contain the field given. * */	TokenNameCOMMENT_JAVADOC	 "Full" processing mode starts by setting all bits to false and only setting bits for documents that contain the given field and are identified as none-duplicates. "Fast" processing sets all bits to true then unsets all duplicate docs found for the given field. This approach avoids the need to read TermDocs for terms that are seen to have a document frequency of exactly "1" (i.e. no duplicates). While a potentially faster approach , the downside is that bitsets produced will include bits set for documents that do not actually contain the field given. 
int	TokenNameint	
processingMode	TokenNameIdentifier	 processing Mode
=	TokenNameEQUAL	
PM_FULL_VALIDATION	TokenNameIdentifier	 PM  FULL  VALIDATION
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PM_FULL_VALIDATION	TokenNameIdentifier	 PM  FULL  VALIDATION
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PM_FAST_INVALIDATION	TokenNameIdentifier	 PM  FAST  INVALIDATION
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
KM_USE_LAST_OCCURRENCE	TokenNameIdentifier	 KM  USE  LAST  OCCURRENCE
,	TokenNameCOMMA	
PM_FULL_VALIDATION	TokenNameIdentifier	 PM  FULL  VALIDATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
keepMode	TokenNameIdentifier	 keep Mode
,	TokenNameCOMMA	
int	TokenNameint	
processingMode	TokenNameIdentifier	 processing Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keepMode	TokenNameIdentifier	 keep Mode
=	TokenNameEQUAL	
keepMode	TokenNameIdentifier	 keep Mode
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
processingMode	TokenNameIdentifier	 processing Mode
=	TokenNameEQUAL	
processingMode	TokenNameIdentifier	 processing Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
processingMode	TokenNameIdentifier	 processing Mode
==	TokenNameEQUAL_EQUAL	
PM_FAST_INVALIDATION	TokenNameIdentifier	 PM  FAST  INVALIDATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fastBits	TokenNameIdentifier	 fast Bits
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
correctBits	TokenNameIdentifier	 correct Bits
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
correctBits	TokenNameIdentifier	 correct Bits
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//assume all are INvalid 	TokenNameCOMMENT_LINE	assume all are INvalid 
Term	TokenNameIdentifier	 Term
startTerm	TokenNameIdentifier	 start Term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
startTerm	TokenNameIdentifier	 start Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
currTerm	TokenNameIdentifier	 curr Term
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currTerm	TokenNameIdentifier	 curr Term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
currTerm	TokenNameIdentifier	 curr Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
startTerm	TokenNameIdentifier	 start Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
//term fieldnames are interned 	TokenNameCOMMENT_LINE	term fieldnames are interned 
{	TokenNameLBRACE	
int	TokenNameint	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//set non duplicates 	TokenNameCOMMENT_LINE	set non duplicates 
TermDocs	TokenNameIdentifier	 Term Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
currTerm	TokenNameIdentifier	 curr Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keepMode	TokenNameIdentifier	 keep Mode
==	TokenNameEQUAL_EQUAL	
KM_USE_FIRST_OCCURRENCE	TokenNameIdentifier	 KM  USE  FIRST  OCCURRENCE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
lastDoc	TokenNameIdentifier	 last Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currTerm	TokenNameIdentifier	 curr Term
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
fastBits	TokenNameIdentifier	 fast Bits
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//assume all are valid 	TokenNameCOMMENT_LINE	assume all are valid 
Term	TokenNameIdentifier	 Term
startTerm	TokenNameIdentifier	 start Term
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermEnum	TokenNameIdentifier	 Term Enum
te	TokenNameIdentifier	 te
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
startTerm	TokenNameIdentifier	 start Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
currTerm	TokenNameIdentifier	 curr Term
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currTerm	TokenNameIdentifier	 curr Term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
currTerm	TokenNameIdentifier	 curr Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
startTerm	TokenNameIdentifier	 start Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
//term fieldnames are interned 	TokenNameCOMMENT_LINE	term fieldnames are interned 
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//unset potential duplicates 	TokenNameCOMMENT_LINE	unset potential duplicates 
TermDocs	TokenNameIdentifier	 Term Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
currTerm	TokenNameIdentifier	 curr Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keepMode	TokenNameIdentifier	 keep Mode
==	TokenNameEQUAL_EQUAL	
KM_USE_FIRST_OCCURRENCE	TokenNameIdentifier	 KM  USE  FIRST  OCCURRENCE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
lastDoc	TokenNameIdentifier	 last Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keepMode	TokenNameIdentifier	 keep Mode
==	TokenNameEQUAL_EQUAL	
KM_USE_LAST_OCCURRENCE	TokenNameIdentifier	 KM  USE  LAST  OCCURRENCE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//restore the last bit 	TokenNameCOMMENT_LINE	restore the last bit 
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
lastDoc	TokenNameIdentifier	 last Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currTerm	TokenNameIdentifier	 curr Term
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFieldName	TokenNameIdentifier	 set Field Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getKeepMode	TokenNameIdentifier	 get Keep Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keepMode	TokenNameIdentifier	 keep Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setKeepMode	TokenNameIdentifier	 set Keep Mode
(	TokenNameLPAREN	
int	TokenNameint	
keepMode	TokenNameIdentifier	 keep Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
keepMode	TokenNameIdentifier	 keep Mode
=	TokenNameEQUAL	
keepMode	TokenNameIdentifier	 keep Mode
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
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DuplicateFilter	TokenNameIdentifier	 Duplicate Filter
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
keepMode	TokenNameIdentifier	 keep Mode
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
keepMode	TokenNameIdentifier	 keep Mode
&&	TokenNameAND_AND	
processingMode	TokenNameIdentifier	 processing Mode
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
processingMode	TokenNameIdentifier	 processing Mode
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
||	TokenNameOR_OR	
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fieldName	TokenNameIdentifier	 field Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
217	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
keepMode	TokenNameIdentifier	 keep Mode
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
processingMode	TokenNameIdentifier	 processing Mode
;	TokenNameSEMICOLON	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
fieldName	TokenNameIdentifier	 field Name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getProcessingMode	TokenNameIdentifier	 get Processing Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
processingMode	TokenNameIdentifier	 processing Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setProcessingMode	TokenNameIdentifier	 set Processing Mode
(	TokenNameLPAREN	
int	TokenNameint	
processingMode	TokenNameIdentifier	 processing Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
processingMode	TokenNameIdentifier	 processing Mode
=	TokenNameEQUAL	
processingMode	TokenNameIdentifier	 processing Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
