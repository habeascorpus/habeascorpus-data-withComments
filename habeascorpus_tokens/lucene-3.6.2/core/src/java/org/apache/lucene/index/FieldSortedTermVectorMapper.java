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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Copyright 2007 The Apache Software Foundation * <p/> * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * <p/> * http://www.apache.org/licenses/LICENSE-2.0 * <p/> * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2007 The Apache Software Foundation <p/> Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at <p/> http://www.apache.org/licenses/LICENSE-2.0 <p/> Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * For each Field, store a sorted collection of {@link TermVectorEntry}s * <p/> * This is not thread-safe. */	TokenNameCOMMENT_JAVADOC	 For each Field, store a sorted collection of {@link TermVectorEntry}s <p/> This is not thread-safe. 
public	TokenNamepublic	
class	TokenNameclass	
FieldSortedTermVectorMapper	TokenNameIdentifier	 Field Sorted Term Vector Mapper
extends	TokenNameextends	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>>	TokenNameRIGHT_SHIFT	
fieldToTerms	TokenNameIdentifier	 field To Terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
currentSet	TokenNameIdentifier	 current Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
currentField	TokenNameIdentifier	 current Field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
/** * * @param comparator A Comparator for sorting {@link TermVectorEntry}s */	TokenNameCOMMENT_JAVADOC	 * @param comparator A Comparator for sorting {@link TermVectorEntry}s 
public	TokenNamepublic	
FieldSortedTermVectorMapper	TokenNameIdentifier	 Field Sorted Term Vector Mapper
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FieldSortedTermVectorMapper	TokenNameIdentifier	 Field Sorted Term Vector Mapper
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoringPositions	TokenNameIdentifier	 ignoring Positions
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoringOffsets	TokenNameIdentifier	 ignoring Offsets
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ignoringPositions	TokenNameIdentifier	 ignoring Positions
,	TokenNameCOMMA	
ignoringOffsets	TokenNameIdentifier	 ignoring Offsets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
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
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
(	TokenNameLPAREN	
currentField	TokenNameIdentifier	 current Field
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentSet	TokenNameIdentifier	 current Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
currentSet	TokenNameIdentifier	 current Set
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentField	TokenNameIdentifier	 current Field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
fieldToTerms	TokenNameIdentifier	 field To Terms
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
currentSet	TokenNameIdentifier	 current Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the mapping between fields and terms, sorted by the comparator * * @return A map between field names and {@link java.util.SortedSet}s per field. SortedSet entries are {@link TermVectorEntry} */	TokenNameCOMMENT_JAVADOC	 Get the mapping between fields and terms, sorted by the comparator * @return A map between field names and {@link java.util.SortedSet}s per field. SortedSet entries are {@link TermVectorEntry} 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>>	TokenNameRIGHT_SHIFT	
getFieldToTerms	TokenNameIdentifier	 get Field To Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldToTerms	TokenNameIdentifier	 field To Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
