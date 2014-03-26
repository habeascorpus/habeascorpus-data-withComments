package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayUtil	TokenNameIdentifier	 Array Util
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
Similarity	TokenNameIdentifier	 Similarity
;	TokenNameSEMICOLON	
/** Taps into DocInverter, as an InvertedDocEndConsumer, * which is called at the end of inverting each field. We * just look at the length for the field (docState.length) * and record the norm. */	TokenNameCOMMENT_JAVADOC	 Taps into DocInverter, as an InvertedDocEndConsumer, which is called at the end of inverting each field. We just look at the length for the field (docState.length) and record the norm. 
final	TokenNamefinal	
class	TokenNameclass	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
extends	TokenNameextends	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
>	TokenNameGREATER	
{	TokenNameLBRACE	
final	TokenNamefinal	
NormsWriterPerThread	TokenNameIdentifier	 Norms Writer Per Thread
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
// Holds all docID/norm pairs we've seen 	TokenNameCOMMENT_LINE	Holds all docID/norm pairs we've seen 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docIDs	TokenNameIdentifier	 doc I Ds
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInvertState	TokenNameIdentifier	 Field Invert State
fieldState	TokenNameIdentifier	 field State
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Shrink back if we are overallocated now: 	TokenNameCOMMENT_LINE	Shrink back if we are overallocated now: 
docIDs	TokenNameIdentifier	 doc I Ds
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
docIDs	TokenNameIdentifier	 doc I Ds
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
norms	TokenNameIdentifier	 norms
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
(	TokenNameLPAREN	
final	TokenNamefinal	
DocInverterPerField	TokenNameIdentifier	 Doc Inverter Per Field
docInverterPerField	TokenNameIdentifier	 doc Inverter Per Field
,	TokenNameCOMMA	
final	TokenNamefinal	
NormsWriterPerThread	TokenNameIdentifier	 Norms Writer Per Thread
perThread	TokenNameIdentifier	 per Thread
,	TokenNameCOMMA	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
=	TokenNameEQUAL	
docInverterPerField	TokenNameIdentifier	 doc Inverter Per Field
.	TokenNameDOT	
fieldState	TokenNameIdentifier	 field State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
NormsWriterPerField	TokenNameIdentifier	 Norms Writer Per Field
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
&&	TokenNameAND_AND	
!	TokenNameNOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
docIDs	TokenNameIdentifier	 doc I Ds
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
docIDs	TokenNameIdentifier	 doc I Ds
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
norms	TokenNameIdentifier	 norms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
norms	TokenNameIdentifier	 norms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
norms	TokenNameIdentifier	 norms
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
upto	TokenNameIdentifier	 upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
float	TokenNamefloat	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
.	TokenNameDOT	
computeNorm	TokenNameIdentifier	 compute Norm
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
fieldState	TokenNameIdentifier	 field State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
norms	TokenNameIdentifier	 norms
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
.	TokenNameDOT	
encodeNormValue	TokenNameIdentifier	 encode Norm Value
(	TokenNameLPAREN	
norm	TokenNameIdentifier	 norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docIDs	TokenNameIdentifier	 doc I Ds
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
