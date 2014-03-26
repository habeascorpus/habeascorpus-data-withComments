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
/** * Access to the Fieldable Info file that describes document fields and whether or * not they are indexed. Each segment has a separate Fieldable Info file. Objects * of this class are thread-safe for multiple readers, but only one thread can * be adding documents at a time, with no other reader or writer threads * accessing this object. **/	TokenNameCOMMENT_JAVADOC	 Access to the Fieldable Info file that describes document fields and whether or not they are indexed. Each segment has a separate Fieldable Info file. Objects of this class are thread-safe for multiple readers, but only one thread can be adding documents at a time, with no other reader or writer threads accessing this object. *
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FieldInfo	TokenNameIdentifier	 Field Info
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
;	TokenNameSEMICOLON	
// True if any document indexed term vectors 	TokenNameCOMMENT_LINE	True if any document indexed term vectors 
public	TokenNamepublic	
boolean	TokenNameboolean	
storeTermVector	TokenNameIdentifier	 store Term Vector
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
;	TokenNameSEMICOLON	
// omit norms associated with indexed fields 	TokenNameCOMMENT_LINE	omit norms associated with indexed fields 
public	TokenNamepublic	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
// whether this field stores payloads together with term positions 	TokenNameCOMMENT_LINE	whether this field stores payloads together with term positions 
/** * Controls how much information is stored in the postings lists. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Controls how much information is stored in the postings lists. @lucene.experimental 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
IndexOptions	TokenNameIdentifier	 Index Options
{	TokenNameLBRACE	
/** only documents are indexed: term frequencies and positions are omitted */	TokenNameCOMMENT_JAVADOC	 only documents are indexed: term frequencies and positions are omitted 
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
,	TokenNameCOMMA	
/** only documents and term frequencies are indexed: positions are omitted */	TokenNameCOMMENT_JAVADOC	 only documents and term frequencies are indexed: positions are omitted 
DOCS_AND_FREQS	TokenNameIdentifier	 DOCS  AND  FREQS
,	TokenNameCOMMA	
/** full postings: documents, frequencies, and positions */	TokenNameCOMMENT_JAVADOC	 full postings: documents, frequencies, and positions 
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
FieldInfo	TokenNameIdentifier	 Field Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
na	TokenNameIdentifier	 na
,	TokenNameCOMMA	
boolean	TokenNameboolean	
tk	TokenNameIdentifier	 tk
,	TokenNameCOMMA	
int	TokenNameint	
nu	TokenNameIdentifier	 nu
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
na	TokenNameIdentifier	 na
;	TokenNameSEMICOLON	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
tk	TokenNameIdentifier	 tk
;	TokenNameSEMICOLON	
number	TokenNameIdentifier	 number
=	TokenNameEQUAL	
nu	TokenNameIdentifier	 nu
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isIndexed	TokenNameIdentifier	 is Indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
=	TokenNameEQUAL	
storeTermVector	TokenNameIdentifier	 store Term Vector
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
=	TokenNameEQUAL	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
=	TokenNameEQUAL	
omitNorms	TokenNameIdentifier	 omit Norms
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// for non-indexed fields, leave defaults 	TokenNameCOMMENT_LINE	for non-indexed fields, leave defaults 
this	TokenNamethis	
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
||	TokenNameOR_OR	
!	TokenNameNOT	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldInfo	TokenNameIdentifier	 Field Info
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
number	TokenNameIdentifier	 number
,	TokenNameCOMMA	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storeTermVector	TokenNameIdentifier	 store Term Vector
,	TokenNameCOMMA	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
,	TokenNameCOMMA	
boolean	TokenNameboolean	
storePayloads	TokenNameIdentifier	 store Payloads
,	TokenNameCOMMA	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
!=	TokenNameNOT_EQUAL	
isIndexed	TokenNameIdentifier	 is Indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// once indexed, always index 	TokenNameCOMMENT_LINE	once indexed, always index 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIndexed	TokenNameIdentifier	 is Indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if updated field data is not for indexing, leave the updates out 	TokenNameCOMMENT_LINE	if updated field data is not for indexing, leave the updates out 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
!=	TokenNameNOT_EQUAL	
storeTermVector	TokenNameIdentifier	 store Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// once vector, always vector 	TokenNameCOMMENT_LINE	once vector, always vector 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
!=	TokenNameNOT_EQUAL	
storePayloads	TokenNameIdentifier	 store Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
!=	TokenNameNOT_EQUAL	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// once norms are stored, always store 	TokenNameCOMMENT_LINE	once norms are stored, always store 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
!=	TokenNameNOT_EQUAL	
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// downgrade 	TokenNameCOMMENT_LINE	downgrade 
this	TokenNamethis	
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
:	TokenNameCOLON	
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
this	TokenNamethis	
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
||	TokenNameOR_OR	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
