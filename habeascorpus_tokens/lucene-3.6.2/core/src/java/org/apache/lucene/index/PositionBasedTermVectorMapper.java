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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * For each Field, store position by position information. It ignores frequency information * <p/> * This is not thread-safe. */	TokenNameCOMMENT_JAVADOC	 For each Field, store position by position information. It ignores frequency information <p/> This is not thread-safe. 
public	TokenNamepublic	
class	TokenNameclass	
PositionBasedTermVectorMapper	TokenNameIdentifier	 Position Based Term Vector Mapper
extends	TokenNameextends	
TermVectorMapper	TokenNameIdentifier	 Term Vector Mapper
{	TokenNameLBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
TVPositionInfo	TokenNameIdentifier	 TV Position Info
>>	TokenNameRIGHT_SHIFT	
fieldToTerms	TokenNameIdentifier	 field To Terms
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
currentField	TokenNameIdentifier	 current Field
;	TokenNameSEMICOLON	
/** * A Map of Integer and TVPositionInfo */	TokenNameCOMMENT_JAVADOC	 A Map of Integer and TVPositionInfo 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
TVPositionInfo	TokenNameIdentifier	 TV Position Info
>	TokenNameGREATER	
currentPositions	TokenNameIdentifier	 current Positions
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
storeOffsets	TokenNameIdentifier	 store Offsets
;	TokenNameSEMICOLON	
/** * * */	TokenNameCOMMENT_JAVADOC	 * 
public	TokenNamepublic	
PositionBasedTermVectorMapper	TokenNameIdentifier	 Position Based Term Vector Mapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PositionBasedTermVectorMapper	TokenNameIdentifier	 Position Based Term Vector Mapper
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoringOffsets	TokenNameIdentifier	 ignoring Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
ignoringOffsets	TokenNameIdentifier	 ignoring Offsets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Never ignores positions. This mapper doesn't make much sense unless there are positions * @return false */	TokenNameCOMMENT_JAVADOC	 Never ignores positions. This mapper doesn't make much sense unless there are positions @return false 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isIgnoringPositions	TokenNameIdentifier	 is Ignoring Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Callback for the TermVectorReader. * @param term * @param frequency * @param offsets * @param positions */	TokenNameCOMMENT_JAVADOC	 Callback for the TermVectorReader. @param term @param frequency @param offsets @param positions 
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
posVal	TokenNameIdentifier	 pos Val
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TVPositionInfo	TokenNameIdentifier	 TV Position Info
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
currentPositions	TokenNameIdentifier	 current Positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
posVal	TokenNameIdentifier	 pos Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
new	TokenNamenew	
TVPositionInfo	TokenNameIdentifier	 TV Position Info
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
storeOffsets	TokenNameIdentifier	 store Offsets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentPositions	TokenNameIdentifier	 current Positions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
posVal	TokenNameIdentifier	 pos Val
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Callback mechanism used by the TermVectorReader * @param field The field being read * @param numTerms The number of terms in the vector * @param storeOffsets Whether offsets are available * @param storePositions Whether positions are available */	TokenNameCOMMENT_JAVADOC	 Callback mechanism used by the TermVectorReader @param field The field being read @param numTerms The number of terms in the vector @param storeOffsets Whether offsets are available @param storePositions Whether positions are available 
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
if	TokenNameif	
(	TokenNameLPAREN	
storePositions	TokenNameIdentifier	 store Positions
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"You must store positions in order to use this Mapper"	TokenNameStringLiteral	You must store positions in order to use this Mapper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
storeOffsets	TokenNameIdentifier	 store Offsets
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ignoring offsets 	TokenNameCOMMENT_LINE	ignoring offsets 
}	TokenNameRBRACE	
fieldToTerms	TokenNameIdentifier	 field To Terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
TVPositionInfo	TokenNameIdentifier	 TV Position Info
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
numTerms	TokenNameIdentifier	 num Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
storeOffsets	TokenNameIdentifier	 store Offsets
=	TokenNameEQUAL	
storeOffsets	TokenNameIdentifier	 store Offsets
;	TokenNameSEMICOLON	
currentField	TokenNameIdentifier	 current Field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
currentPositions	TokenNameIdentifier	 current Positions
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
TVPositionInfo	TokenNameIdentifier	 TV Position Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldToTerms	TokenNameIdentifier	 field To Terms
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
currentField	TokenNameIdentifier	 current Field
,	TokenNameCOMMA	
currentPositions	TokenNameIdentifier	 current Positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the mapping between fields and terms, sorted by the comparator * * @return A map between field names and a Map. The sub-Map key is the position as the integer, the value is {@link org.apache.lucene.index.PositionBasedTermVectorMapper.TVPositionInfo}. */	TokenNameCOMMENT_JAVADOC	 Get the mapping between fields and terms, sorted by the comparator * @return A map between field names and a Map. The sub-Map key is the position as the integer, the value is {@link org.apache.lucene.index.PositionBasedTermVectorMapper.TVPositionInfo}. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
TVPositionInfo	TokenNameIdentifier	 TV Position Info
>>	TokenNameRIGHT_SHIFT	
getFieldToTerms	TokenNameIdentifier	 get Field To Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldToTerms	TokenNameIdentifier	 field To Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Container for a term at a position */	TokenNameCOMMENT_JAVADOC	 Container for a term at a position 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TVPositionInfo	TokenNameIdentifier	 TV Position Info
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
>	TokenNameGREATER	
offsets	TokenNameIdentifier	 offsets
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TVPositionInfo	TokenNameIdentifier	 TV Position Info
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeOffsets	TokenNameIdentifier	 store Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
storeOffsets	TokenNameIdentifier	 store Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * * @return The position of the term */	TokenNameCOMMENT_JAVADOC	 * @return The position of the term 
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Note, there may be multiple terms at the same position * @return A List of Strings */	TokenNameCOMMENT_JAVADOC	 Note, there may be multiple terms at the same position @return A List of Strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parallel list (to {@link #getTerms()}) of TermVectorOffsetInfo objects. There may be multiple entries since there may be multiple terms at a position * @return A List of TermVectorOffsetInfo objects, if offsets are stored. */	TokenNameCOMMENT_JAVADOC	 Parallel list (to {@link #getTerms()}) of TermVectorOffsetInfo objects. There may be multiple entries since there may be multiple terms at a position @return A List of TermVectorOffsetInfo objects, if offsets are stored. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
>	TokenNameGREATER	
getOffsets	TokenNameIdentifier	 get Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offsets	TokenNameIdentifier	 offsets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
