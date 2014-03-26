package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Copyright 2007 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2007 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Store a sorted collection of {@link org.apache.lucene.index.TermVectorEntry}s. Collects all term information * into a single, SortedSet. * <br/> * NOTE: This Mapper ignores all Field information for the Document. This means that if you are using offset/positions you will not * know what Fields they correlate with. * <br/> * This is not thread-safe */	TokenNameCOMMENT_JAVADOC	 Store a sorted collection of {@link org.apache.lucene.index.TermVectorEntry}s. Collects all term information into a single, SortedSet. <br/> NOTE: This Mapper ignores all Field information for the Document. This means that if you are using offset/positions you will not know what Fields they correlate with. <br/> This is not thread-safe 
public	TokenNamepublic	
class	TokenNameclass	
SortedTermVectorMapper	TokenNameIdentifier	 Sorted Term Vector Mapper
extends	TokenNameextends	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
currentSet	TokenNameIdentifier	 current Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
termToTVE	TokenNameIdentifier	 term To TVE
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
storeOffsets	TokenNameIdentifier	 store Offsets
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
storePositions	TokenNameIdentifier	 store Positions
;	TokenNameSEMICOLON	
/** * Stand-in name for the field in {@link TermVectorEntry}. */	TokenNameCOMMENT_JAVADOC	 Stand-in name for the field in {@link TermVectorEntry}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ALL	TokenNameIdentifier	 ALL
=	TokenNameEQUAL	
"_ALL_"	TokenNameStringLiteral	_ALL_
;	TokenNameSEMICOLON	
/** * * @param comparator A Comparator for sorting {@link TermVectorEntry}s */	TokenNameCOMMENT_JAVADOC	 * @param comparator A Comparator for sorting {@link TermVectorEntry}s 
public	TokenNamepublic	
SortedTermVectorMapper	TokenNameIdentifier	 Sorted Term Vector Mapper
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
SortedTermVectorMapper	TokenNameIdentifier	 Sorted Term Vector Mapper
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
}	TokenNameRBRACE	
/** * * @param term The term to map * @param frequency The frequency of the term * @param offsets Offset information, may be null * @param positions Position information, may be null */	TokenNameCOMMENT_JAVADOC	 * @param term The term to map @param frequency The frequency of the term @param offsets Offset information, may be null @param positions Position information, may be null 
//We need to combine any previous mentions of the term 	TokenNameCOMMENT_LINE	We need to combine any previous mentions of the term 
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
termToTVE	TokenNameIdentifier	 term To TVE
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
(	TokenNameLPAREN	
ALL	TokenNameIdentifier	 ALL
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
frequency	TokenNameIdentifier	 frequency
,	TokenNameCOMMA	
storeOffsets	TokenNameIdentifier	 store Offsets
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
?	TokenNameQUESTION	
offsets	TokenNameIdentifier	 offsets
:	TokenNameCOLON	
null	TokenNamenull	
,	TokenNameCOMMA	
storePositions	TokenNameIdentifier	 store Positions
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
?	TokenNameQUESTION	
positions	TokenNameIdentifier	 positions
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termToTVE	TokenNameIdentifier	 term To TVE
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
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
else	TokenNameelse	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setFrequency	TokenNameIdentifier	 set Frequency
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
frequency	TokenNameIdentifier	 frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storeOffsets	TokenNameIdentifier	 store Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
existingOffsets	TokenNameIdentifier	 existing Offsets
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//A few diff. cases here: offsets is null, existing offsets is null, both are null, same for positions 	TokenNameCOMMENT_LINE	A few diff. cases here: offsets is null, existing offsets is null, both are null, same for positions 
if	TokenNameif	
(	TokenNameLPAREN	
existingOffsets	TokenNameIdentifier	 existing Offsets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
offsets	TokenNameIdentifier	 offsets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//copy over the existing offsets 	TokenNameCOMMENT_LINE	copy over the existing offsets 
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newOffsets	TokenNameIdentifier	 new Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
existingOffsets	TokenNameIdentifier	 existing Offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
existingOffsets	TokenNameIdentifier	 existing Offsets
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newOffsets	TokenNameIdentifier	 new Offsets
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
existingOffsets	TokenNameIdentifier	 existing Offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newOffsets	TokenNameIdentifier	 new Offsets
,	TokenNameCOMMA	
existingOffsets	TokenNameIdentifier	 existing Offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setOffsets	TokenNameIdentifier	 set Offsets
(	TokenNameLPAREN	
newOffsets	TokenNameIdentifier	 new Offsets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
existingOffsets	TokenNameIdentifier	 existing Offsets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
offsets	TokenNameIdentifier	 offsets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setOffsets	TokenNameIdentifier	 set Offsets
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//else leave it alone 	TokenNameCOMMENT_LINE	else leave it alone 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
storePositions	TokenNameIdentifier	 store Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
existingPositions	TokenNameIdentifier	 existing Positions
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
existingPositions	TokenNameIdentifier	 existing Positions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
positions	TokenNameIdentifier	 positions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newPositions	TokenNameIdentifier	 new Positions
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
existingPositions	TokenNameIdentifier	 existing Positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
existingPositions	TokenNameIdentifier	 existing Positions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newPositions	TokenNameIdentifier	 new Positions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
existingPositions	TokenNameIdentifier	 existing Positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newPositions	TokenNameIdentifier	 new Positions
,	TokenNameCOMMA	
existingPositions	TokenNameIdentifier	 existing Positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setPositions	TokenNameIdentifier	 set Positions
(	TokenNameLPAREN	
newPositions	TokenNameIdentifier	 new Positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
existingPositions	TokenNameIdentifier	 existing Positions
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
positions	TokenNameIdentifier	 positions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
setPositions	TokenNameIdentifier	 set Positions
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
this	TokenNamethis	
.	TokenNameDOT	
storeOffsets	TokenNameIdentifier	 store Offsets
=	TokenNameEQUAL	
storeOffsets	TokenNameIdentifier	 store Offsets
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
storePositions	TokenNameIdentifier	 store Positions
=	TokenNameEQUAL	
storePositions	TokenNameIdentifier	 store Positions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The TermVectorEntrySet. A SortedSet of {@link TermVectorEntry} objects. Sort is by the comparator passed into the constructor. *<br/> * This set will be empty until after the mapping process takes place. * * @return The SortedSet of {@link TermVectorEntry}. */	TokenNameCOMMENT_JAVADOC	 The TermVectorEntrySet. A SortedSet of {@link TermVectorEntry} objects. Sort is by the comparator passed into the constructor. *<br/> This set will be empty until after the mapping process takes place. * @return The SortedSet of {@link TermVectorEntry}. 
public	TokenNamepublic	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TermVectorEntry	TokenNameIdentifier	 Term Vector Entry
>	TokenNameGREATER	
getTermVectorEntrySet	TokenNameIdentifier	 get Term Vector Entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentSet	TokenNameIdentifier	 current Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
