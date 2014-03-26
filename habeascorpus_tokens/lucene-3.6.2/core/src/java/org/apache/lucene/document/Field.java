package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
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
IndexWriter	TokenNameIdentifier	 Index Writer
;	TokenNameSEMICOLON	
// for javadoc 	TokenNameCOMMENT_LINE	for javadoc 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringHelper	TokenNameIdentifier	 String Helper
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
FieldInfo	TokenNameIdentifier	 Field Info
.	TokenNameDOT	
IndexOptions	TokenNameIdentifier	 Index Options
;	TokenNameSEMICOLON	
/** A field is a section of a Document. Each field has two parts, a name and a value. Values may be free text, provided as a String or as a Reader, or they may be atomic keywords, which are not further processed. Such keywords may be used to represent dates, urls, etc. Fields are optionally stored in the index, so that they may be returned with hits on the document. */	TokenNameCOMMENT_JAVADOC	 A field is a section of a Document. Each field has two parts, a name and a value. Values may be free text, provided as a String or as a Reader, or they may be atomic keywords, which are not further processed. Such keywords may be used to represent dates, urls, etc. Fields are optionally stored in the index, so that they may be returned with hits on the document. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Field	TokenNameIdentifier	 Field
extends	TokenNameextends	
AbstractField	TokenNameIdentifier	 Abstract Field
implements	TokenNameimplements	
Fieldable	TokenNameIdentifier	 Fieldable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Specifies whether and how a field should be stored. */	TokenNameCOMMENT_JAVADOC	 Specifies whether and how a field should be stored. 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Store	TokenNameIdentifier	 Store
{	TokenNameLBRACE	
/** Store the original field value in the index. This is useful for short texts * like a document's title which should be displayed with the results. The * value is stored in its original form, i.e. no analyzer is used before it is * stored. */	TokenNameCOMMENT_JAVADOC	 Store the original field value in the index. This is useful for short texts like a document's title which should be displayed with the results. The value is stored in its original form, i.e. no analyzer is used before it is stored. 
YES	TokenNameIdentifier	 YES
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Do not store the field value in the index. */	TokenNameCOMMENT_JAVADOC	 Do not store the field value in the index. 
NO	TokenNameIdentifier	 NO
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Specifies whether and how a field should be indexed. */	TokenNameCOMMENT_JAVADOC	 Specifies whether and how a field should be indexed. 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Index	TokenNameIdentifier	 Index
{	TokenNameLBRACE	
/** Do not index the field value. This field can thus not be searched, * but one can still access its contents provided it is * {@link Field.Store stored}. */	TokenNameCOMMENT_JAVADOC	 Do not index the field value. This field can thus not be searched, but one can still access its contents provided it is {@link Field.Store stored}. 
NO	TokenNameIdentifier	 NO
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnalyzed	TokenNameIdentifier	 is Analyzed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Index the tokens produced by running the field's * value through an Analyzer. This is useful for * common text. */	TokenNameCOMMENT_JAVADOC	 Index the tokens produced by running the field's value through an Analyzer. This is useful for common text. 
ANALYZED	TokenNameIdentifier	 ANALYZED
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnalyzed	TokenNameIdentifier	 is Analyzed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Index the field's value without using an Analyzer, so it can be searched. * As no analyzer is used the value will be stored as a single term. This is * useful for unique Ids like product numbers. */	TokenNameCOMMENT_JAVADOC	 Index the field's value without using an Analyzer, so it can be searched. As no analyzer is used the value will be stored as a single term. This is useful for unique Ids like product numbers. 
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnalyzed	TokenNameIdentifier	 is Analyzed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Expert: Index the field's value without an Analyzer, * and also disable the indexing of norms. Note that you * can also separately enable/disable norms by calling * {@link Field#setOmitNorms}. No norms means that * index-time field and document boosting and field * length normalization are disabled. The benefit is * less memory usage as norms take up one byte of RAM * per indexed field for every document in the index, * during searching. Note that once you index a given * field <i>with</i> norms enabled, disabling norms will * have no effect. In other words, for this to have the * above described effect on a field, all instances of * that field must be indexed with NOT_ANALYZED_NO_NORMS * from the beginning. */	TokenNameCOMMENT_JAVADOC	 Expert: Index the field's value without an Analyzer, and also disable the indexing of norms. Note that you can also separately enable/disable norms by calling {@link Field#setOmitNorms}. No norms means that index-time field and document boosting and field length normalization are disabled. The benefit is less memory usage as norms take up one byte of RAM per indexed field for every document in the index, during searching. Note that once you index a given field <i>with</i> norms enabled, disabling norms will have no effect. In other words, for this to have the above described effect on a field, all instances of that field must be indexed with NOT_ANALYZED_NO_NORMS from the beginning. 
NOT_ANALYZED_NO_NORMS	TokenNameIdentifier	 NOT  ANALYZED  NO  NORMS
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnalyzed	TokenNameIdentifier	 is Analyzed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Expert: Index the tokens produced by running the * field's value through an Analyzer, and also * separately disable the storing of norms. See * {@link #NOT_ANALYZED_NO_NORMS} for what norms are * and why you may want to disable them. */	TokenNameCOMMENT_JAVADOC	 Expert: Index the tokens produced by running the field's value through an Analyzer, and also separately disable the storing of norms. See {@link #NOT_ANALYZED_NO_NORMS} for what norms are and why you may want to disable them. 
ANALYZED_NO_NORMS	TokenNameIdentifier	 ANALYZED  NO  NORMS
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnalyzed	TokenNameIdentifier	 is Analyzed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Get the best representation of the index given the flags. */	TokenNameCOMMENT_JAVADOC	 Get the best representation of the index given the flags. 
public	TokenNamepublic	
static	TokenNamestatic	
Index	TokenNameIdentifier	 Index
toIndex	TokenNameIdentifier	 to Index
(	TokenNameLPAREN	
boolean	TokenNameboolean	
indexed	TokenNameIdentifier	 indexed
,	TokenNameCOMMA	
boolean	TokenNameboolean	
analyzed	TokenNameIdentifier	 analyzed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toIndex	TokenNameIdentifier	 to Index
(	TokenNameLPAREN	
indexed	TokenNameIdentifier	 indexed
,	TokenNameCOMMA	
analyzed	TokenNameIdentifier	 analyzed
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: Get the best representation of the index given the flags. */	TokenNameCOMMENT_JAVADOC	 Expert: Get the best representation of the index given the flags. 
public	TokenNamepublic	
static	TokenNamestatic	
Index	TokenNameIdentifier	 Index
toIndex	TokenNameIdentifier	 to Index
(	TokenNameLPAREN	
boolean	TokenNameboolean	
indexed	TokenNameIdentifier	 indexed
,	TokenNameCOMMA	
boolean	TokenNameboolean	
analyzed	TokenNameIdentifier	 analyzed
,	TokenNameCOMMA	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If it is not indexed nothing else matters 	TokenNameCOMMENT_LINE	If it is not indexed nothing else matters 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
indexed	TokenNameIdentifier	 indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// typical, non-expert 	TokenNameCOMMENT_LINE	typical, non-expert 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
omitNorms	TokenNameIdentifier	 omit Norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
analyzed	TokenNameIdentifier	 analyzed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Expert: Norms omitted 	TokenNameCOMMENT_LINE	Expert: Norms omitted 
if	TokenNameif	
(	TokenNameLPAREN	
analyzed	TokenNameIdentifier	 analyzed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED_NO_NORMS	TokenNameIdentifier	 ANALYZED  NO  NORMS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED_NO_NORMS	TokenNameIdentifier	 NOT  ANALYZED  NO  NORMS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isAnalyzed	TokenNameIdentifier	 is Analyzed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
omitNorms	TokenNameIdentifier	 omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Specifies whether and how a field should have term vectors. */	TokenNameCOMMENT_JAVADOC	 Specifies whether and how a field should have term vectors. 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
TermVector	TokenNameIdentifier	 Term Vector
{	TokenNameLBRACE	
/** Do not store term vectors. */	TokenNameCOMMENT_JAVADOC	 Do not store term vectors. 
NO	TokenNameIdentifier	 NO
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withPositions	TokenNameIdentifier	 with Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withOffsets	TokenNameIdentifier	 with Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Store the term vectors of each document. A term vector is a list * of the document's terms and their number of occurrences in that document. */	TokenNameCOMMENT_JAVADOC	 Store the term vectors of each document. A term vector is a list of the document's terms and their number of occurrences in that document. 
YES	TokenNameIdentifier	 YES
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withPositions	TokenNameIdentifier	 with Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withOffsets	TokenNameIdentifier	 with Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** * Store the term vector + token position information * * @see #YES */	TokenNameCOMMENT_JAVADOC	 Store the term vector + token position information * @see #YES 
WITH_POSITIONS	TokenNameIdentifier	 WITH  POSITIONS
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withPositions	TokenNameIdentifier	 with Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withOffsets	TokenNameIdentifier	 with Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** * Store the term vector + Token offset information * * @see #YES */	TokenNameCOMMENT_JAVADOC	 Store the term vector + Token offset information * @see #YES 
WITH_OFFSETS	TokenNameIdentifier	 WITH  OFFSETS
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withPositions	TokenNameIdentifier	 with Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withOffsets	TokenNameIdentifier	 with Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** * Store the term vector + Token position and offset information * * @see #YES * @see #WITH_POSITIONS * @see #WITH_OFFSETS */	TokenNameCOMMENT_JAVADOC	 Store the term vector + Token position and offset information * @see #YES @see #WITH_POSITIONS @see #WITH_OFFSETS 
WITH_POSITIONS_OFFSETS	TokenNameIdentifier	 WITH  POSITIONS  OFFSETS
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withPositions	TokenNameIdentifier	 with Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
withOffsets	TokenNameIdentifier	 with Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Get the best representation of a TermVector given the flags. */	TokenNameCOMMENT_JAVADOC	 Get the best representation of a TermVector given the flags. 
public	TokenNamepublic	
static	TokenNamestatic	
TermVector	TokenNameIdentifier	 Term Vector
toTermVector	TokenNameIdentifier	 to Term Vector
(	TokenNameLPAREN	
boolean	TokenNameboolean	
stored	TokenNameIdentifier	 stored
,	TokenNameCOMMA	
boolean	TokenNameboolean	
withOffsets	TokenNameIdentifier	 with Offsets
,	TokenNameCOMMA	
boolean	TokenNameboolean	
withPositions	TokenNameIdentifier	 with Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If it is not stored, nothing else matters. 	TokenNameCOMMENT_LINE	If it is not stored, nothing else matters. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
stored	TokenNameIdentifier	 stored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
withOffsets	TokenNameIdentifier	 with Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
withPositions	TokenNameIdentifier	 with Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
WITH_POSITIONS_OFFSETS	TokenNameIdentifier	 WITH  POSITIONS  OFFSETS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
WITH_OFFSETS	TokenNameIdentifier	 WITH  OFFSETS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
withPositions	TokenNameIdentifier	 with Positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
WITH_POSITIONS	TokenNameIdentifier	 WITH  POSITIONS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
withPositions	TokenNameIdentifier	 with Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
withOffsets	TokenNameIdentifier	 with Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The value of the field as a String, or null. If null, the Reader value or * binary value is used. Exactly one of stringValue(), * readerValue(), and getBinaryValue() must be set. */	TokenNameCOMMENT_JAVADOC	 The value of the field as a String, or null. If null, the Reader value or binary value is used. Exactly one of stringValue(), readerValue(), and getBinaryValue() must be set. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldsData	TokenNameIdentifier	 fields Data
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
?	TokenNameQUESTION	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
fieldsData	TokenNameIdentifier	 fields Data
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The value of the field as a Reader, or null. If null, the String value or * binary value is used. Exactly one of stringValue(), * readerValue(), and getBinaryValue() must be set. */	TokenNameCOMMENT_JAVADOC	 The value of the field as a Reader, or null. If null, the String value or binary value is used. Exactly one of stringValue(), readerValue(), and getBinaryValue() must be set. 
public	TokenNamepublic	
Reader	TokenNameIdentifier	 Reader
readerValue	TokenNameIdentifier	 reader Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldsData	TokenNameIdentifier	 fields Data
instanceof	TokenNameinstanceof	
Reader	TokenNameIdentifier	 Reader
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
)	TokenNameRPAREN	
fieldsData	TokenNameIdentifier	 fields Data
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The TokesStream for this field to be used when indexing, or null. If null, the Reader value * or String value is analyzed to produce the indexed tokens. */	TokenNameCOMMENT_JAVADOC	 The TokesStream for this field to be used when indexing, or null. If null, the Reader value or String value is analyzed to produce the indexed tokens. 
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStreamValue	TokenNameIdentifier	 token Stream Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenStream	TokenNameIdentifier	 token Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p>Expert: change the value of this field. This can * be used during indexing to re-use a single Field * instance to improve indexing speed by avoiding GC cost * of new'ing and reclaiming Field instances. Typically * a single {@link Document} instance is re-used as * well. This helps most on small documents.</p> * * <p>Each Field instance should only be used once * within a single {@link Document} instance. See <a * href="http://wiki.apache.org/lucene-java/ImproveIndexingSpeed">ImproveIndexingSpeed</a> * for details.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Expert: change the value of this field. This can be used during indexing to re-use a single Field instance to improve indexing speed by avoiding GC cost of new'ing and reclaiming Field instances. Typically a single {@link Document} instance is re-used as well. This helps most on small documents.</p> * <p>Each Field instance should only be used once within a single {@link Document} instance. See <a href="http://wiki.apache.org/lucene-java/ImproveIndexingSpeed">ImproveIndexingSpeed</a> for details.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBinary	TokenNameIdentifier	 is Binary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"cannot set a String value on a binary field"	TokenNameStringLiteral	cannot set a String value on a binary field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: change the value of this field. See <a href="#setValue(java.lang.String)">setValue(String)</a>. */	TokenNameCOMMENT_JAVADOC	 Expert: change the value of this field. See <a href="#setValue(java.lang.String)">setValue(String)</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isBinary	TokenNameIdentifier	 is Binary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"cannot set a Reader value on a binary field"	TokenNameStringLiteral	cannot set a Reader value on a binary field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isStored	TokenNameIdentifier	 is Stored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"cannot set a Reader value on a stored field"	TokenNameStringLiteral	cannot set a Reader value on a stored field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: change the value of this field. See <a href="#setValue(java.lang.String)">setValue(String)</a>. */	TokenNameCOMMENT_JAVADOC	 Expert: change the value of this field. See <a href="#setValue(java.lang.String)">setValue(String)</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isBinary	TokenNameIdentifier	 is Binary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"cannot set a byte[] value on a non-binary field"	TokenNameStringLiteral	cannot set a byte[] value on a non-binary field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
binaryLength	TokenNameIdentifier	 binary Length
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
binaryOffset	TokenNameIdentifier	 binary Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: change the value of this field. See <a href="#setValue(java.lang.String)">setValue(String)</a>. */	TokenNameCOMMENT_JAVADOC	 Expert: change the value of this field. See <a href="#setValue(java.lang.String)">setValue(String)</a>. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isBinary	TokenNameIdentifier	 is Binary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"cannot set a byte[] value on a non-binary field"	TokenNameStringLiteral	cannot set a byte[] value on a non-binary field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
binaryLength	TokenNameIdentifier	 binary Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
binaryOffset	TokenNameIdentifier	 binary Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: sets the token stream to be used for indexing and causes isIndexed() and isTokenized() to return true. * May be combined with stored values from stringValue() or getBinaryValue() */	TokenNameCOMMENT_JAVADOC	 Expert: sets the token stream to be used for indexing and causes isIndexed() and isTokenized() to return true. May be combined with stored values from stringValue() or getBinaryValue() 
public	TokenNamepublic	
void	TokenNamevoid	
setTokenStream	TokenNameIdentifier	 set Token Stream
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isTokenized	TokenNameIdentifier	 is Tokenized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokenStream	TokenNameIdentifier	 token Stream
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a field by specifying its name, value and how it will * be saved in the index. Term vectors will not be stored in the index. * * @param name The name of the field * @param value The string to process * @param store Whether <code>value</code> should be stored in the index * @param index Whether the field should be indexed, and if so, if it should * be tokenized before indexing * @throws NullPointerException if name or value is <code>null</code> * @throws IllegalArgumentException if the field is neither stored nor indexed */	TokenNameCOMMENT_JAVADOC	 Create a field by specifying its name, value and how it will be saved in the index. Term vectors will not be stored in the index. * @param name The name of the field @param value The string to process @param store Whether <code>value</code> should be stored in the index @param index Whether the field should be indexed, and if so, if it should be tokenized before indexing @throws NullPointerException if name or value is <code>null</code> @throws IllegalArgumentException if the field is neither stored nor indexed 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Store	TokenNameIdentifier	 Store
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
Index	TokenNameIdentifier	 Index
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a field by specifying its name, value and how it will * be saved in the index. * * @param name The name of the field * @param value The string to process * @param store Whether <code>value</code> should be stored in the index * @param index Whether the field should be indexed, and if so, if it should * be tokenized before indexing * @param termVector Whether term vector should be stored * @throws NullPointerException if name or value is <code>null</code> * @throws IllegalArgumentException in any of the following situations: * <ul> * <li>the field is neither stored nor indexed</li> * <li>the field is not indexed but termVector is <code>TermVector.YES</code></li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Create a field by specifying its name, value and how it will be saved in the index. * @param name The name of the field @param value The string to process @param store Whether <code>value</code> should be stored in the index @param index Whether the field should be indexed, and if so, if it should be tokenized before indexing @param termVector Whether term vector should be stored @throws NullPointerException if name or value is <code>null</code> @throws IllegalArgumentException in any of the following situations: <ul> <li>the field is neither stored nor indexed</li> <li>the field is not indexed but termVector is <code>TermVector.YES</code></li> </ul> 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Store	TokenNameIdentifier	 Store
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
Index	TokenNameIdentifier	 Index
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
TermVector	TokenNameIdentifier	 Term Vector
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a field by specifying its name, value and how it will * be saved in the index. * * @param name The name of the field * @param internName Whether to .intern() name or not * @param value The string to process * @param store Whether <code>value</code> should be stored in the index * @param index Whether the field should be indexed, and if so, if it should * be tokenized before indexing * @param termVector Whether term vector should be stored * @throws NullPointerException if name or value is <code>null</code> * @throws IllegalArgumentException in any of the following situations: * <ul> * <li>the field is neither stored nor indexed</li> * <li>the field is not indexed but termVector is <code>TermVector.YES</code></li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Create a field by specifying its name, value and how it will be saved in the index. * @param name The name of the field @param internName Whether to .intern() name or not @param value The string to process @param store Whether <code>value</code> should be stored in the index @param index Whether the field should be indexed, and if so, if it should be tokenized before indexing @param termVector Whether term vector should be stored @throws NullPointerException if name or value is <code>null</code> @throws IllegalArgumentException in any of the following situations: <ul> <li>the field is neither stored nor indexed</li> <li>the field is not indexed but termVector is <code>TermVector.YES</code></li> </ul> 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
internName	TokenNameIdentifier	 intern Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Store	TokenNameIdentifier	 Store
store	TokenNameIdentifier	 store
,	TokenNameCOMMA	
Index	TokenNameIdentifier	 Index
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
TermVector	TokenNameIdentifier	 Term Vector
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"name cannot be null"	TokenNameStringLiteral	name cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"value cannot be null"	TokenNameStringLiteral	value cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
&&	TokenNameAND_AND	
store	TokenNameIdentifier	 store
==	TokenNameEQUAL_EQUAL	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"it doesn't make sense to have a field that "	TokenNameStringLiteral	it doesn't make sense to have a field that 
+	TokenNamePLUS	
"is neither indexed nor stored"	TokenNameStringLiteral	is neither indexed nor stored
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
&&	TokenNameAND_AND	
termVector	TokenNameIdentifier	 term Vector
!=	TokenNameNOT_EQUAL	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"cannot store term vector information "	TokenNameStringLiteral	cannot store term vector information 
+	TokenNamePLUS	
"for a field that is not indexed"	TokenNameStringLiteral	for a field that is not indexed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
internName	TokenNameIdentifier	 intern Name
)	TokenNameRPAREN	
// field names are optionally interned 	TokenNameCOMMENT_LINE	field names are optionally interned 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
=	TokenNameEQUAL	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isTokenized	TokenNameIdentifier	 is Tokenized
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
isAnalyzed	TokenNameIdentifier	 is Analyzed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
omitNorms	TokenNameIdentifier	 omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// note: now this reads even wierder than before 	TokenNameCOMMENT_LINE	note: now this reads even wierder than before 
this	TokenNamethis	
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
setStoreTermVector	TokenNameIdentifier	 set Store Term Vector
(	TokenNameLPAREN	
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a tokenized and indexed field that is not stored. Term vectors will * not be stored. The Reader is read only when the Document is added to the index, * i.e. you may not close the Reader until {@link IndexWriter#addDocument(Document)} * has been called. * * @param name The name of the field * @param reader The reader with the content * @throws NullPointerException if name or reader is <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Create a tokenized and indexed field that is not stored. Term vectors will not be stored. The Reader is read only when the Document is added to the index, i.e. you may not close the Reader until {@link IndexWriter#addDocument(Document)} has been called. * @param name The name of the field @param reader The reader with the content @throws NullPointerException if name or reader is <code>null</code> 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a tokenized and indexed field that is not stored, optionally with * storing term vectors. The Reader is read only when the Document is added to the index, * i.e. you may not close the Reader until {@link IndexWriter#addDocument(Document)} * has been called. * * @param name The name of the field * @param reader The reader with the content * @param termVector Whether term vector should be stored * @throws NullPointerException if name or reader is <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Create a tokenized and indexed field that is not stored, optionally with storing term vectors. The Reader is read only when the Document is added to the index, i.e. you may not close the Reader until {@link IndexWriter#addDocument(Document)} has been called. * @param name The name of the field @param reader The reader with the content @param termVector Whether term vector should be stored @throws NullPointerException if name or reader is <code>null</code> 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
TermVector	TokenNameIdentifier	 Term Vector
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"name cannot be null"	TokenNameStringLiteral	name cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"reader cannot be null"	TokenNameStringLiteral	reader cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// field names are interned 	TokenNameCOMMENT_LINE	field names are interned 
this	TokenNamethis	
.	TokenNameDOT	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isTokenized	TokenNameIdentifier	 is Tokenized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
setStoreTermVector	TokenNameIdentifier	 set Store Term Vector
(	TokenNameLPAREN	
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a tokenized and indexed field that is not stored. Term vectors will * not be stored. This is useful for pre-analyzed fields. * The TokenStream is read only when the Document is added to the index, * i.e. you may not close the TokenStream until {@link IndexWriter#addDocument(Document)} * has been called. * * @param name The name of the field * @param tokenStream The TokenStream with the content * @throws NullPointerException if name or tokenStream is <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Create a tokenized and indexed field that is not stored. Term vectors will not be stored. This is useful for pre-analyzed fields. The TokenStream is read only when the Document is added to the index, i.e. you may not close the TokenStream until {@link IndexWriter#addDocument(Document)} has been called. * @param name The name of the field @param tokenStream The TokenStream with the content @throws NullPointerException if name or tokenStream is <code>null</code> 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a tokenized and indexed field that is not stored, optionally with * storing term vectors. This is useful for pre-analyzed fields. * The TokenStream is read only when the Document is added to the index, * i.e. you may not close the TokenStream until {@link IndexWriter#addDocument(Document)} * has been called. * * @param name The name of the field * @param tokenStream The TokenStream with the content * @param termVector Whether term vector should be stored * @throws NullPointerException if name or tokenStream is <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Create a tokenized and indexed field that is not stored, optionally with storing term vectors. This is useful for pre-analyzed fields. The TokenStream is read only when the Document is added to the index, i.e. you may not close the TokenStream until {@link IndexWriter#addDocument(Document)} has been called. * @param name The name of the field @param tokenStream The TokenStream with the content @param termVector Whether term vector should be stored @throws NullPointerException if name or tokenStream is <code>null</code> 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
,	TokenNameCOMMA	
TermVector	TokenNameIdentifier	 Term Vector
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"name cannot be null"	TokenNameStringLiteral	name cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokenStream	TokenNameIdentifier	 token Stream
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"tokenStream cannot be null"	TokenNameStringLiteral	tokenStream cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// field names are interned 	TokenNameCOMMENT_LINE	field names are interned 
this	TokenNamethis	
.	TokenNameDOT	
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokenStream	TokenNameIdentifier	 token Stream
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isTokenized	TokenNameIdentifier	 is Tokenized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isBinary	TokenNameIdentifier	 is Binary
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
setStoreTermVector	TokenNameIdentifier	 set Store Term Vector
(	TokenNameLPAREN	
termVector	TokenNameIdentifier	 term Vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a stored field with binary value. Optionally the value may be compressed. * * @param name The name of the field * @param value The binary value * @param store Must be Store.YES * @throws IllegalArgumentException if store is <code>Store.NO</code> * @deprecated Use {@link #Field(String, byte[]) instead} */	TokenNameCOMMENT_JAVADOC	 Create a stored field with binary value. Optionally the value may be compressed. * @param name The name of the field @param value The binary value @param store Must be Store.YES @throws IllegalArgumentException if store is <code>Store.NO</code> @deprecated Use {@link #Field(String, byte[]) instead} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Store	TokenNameIdentifier	 Store
store	TokenNameIdentifier	 store
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
store	TokenNameIdentifier	 store
==	TokenNameEQUAL_EQUAL	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"binary values can't be unstored"	TokenNameStringLiteral	binary values can't be unstored
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a stored field with binary value. Optionally the value may be compressed. * * @param name The name of the field * @param value The binary value */	TokenNameCOMMENT_JAVADOC	 Create a stored field with binary value. Optionally the value may be compressed. * @param name The name of the field @param value The binary value 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a stored field with binary value. Optionally the value may be compressed. * * @param name The name of the field * @param value The binary value * @param offset Starting offset in value where this Field's bytes are * @param length Number of bytes to use for this Field, starting at offset * @param store How <code>value</code> should be stored (compressed or not) * @throws IllegalArgumentException if store is <code>Store.NO</code> * @deprecated Use {@link #Field(String, byte[], int, int) instead} */	TokenNameCOMMENT_JAVADOC	 Create a stored field with binary value. Optionally the value may be compressed. * @param name The name of the field @param value The binary value @param offset Starting offset in value where this Field's bytes are @param length Number of bytes to use for this Field, starting at offset @param store How <code>value</code> should be stored (compressed or not) @throws IllegalArgumentException if store is <code>Store.NO</code> @deprecated Use {@link #Field(String, byte[], int, int) instead} 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
Store	TokenNameIdentifier	 Store
store	TokenNameIdentifier	 store
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
store	TokenNameIdentifier	 store
==	TokenNameEQUAL_EQUAL	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"binary values can't be unstored"	TokenNameStringLiteral	binary values can't be unstored
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a stored field with binary value. Optionally the value may be compressed. * * @param name The name of the field * @param value The binary value * @param offset Starting offset in value where this Field's bytes are * @param length Number of bytes to use for this Field, starting at offset */	TokenNameCOMMENT_JAVADOC	 Create a stored field with binary value. Optionally the value may be compressed. * @param name The name of the field @param value The binary value @param offset Starting offset in value where this Field's bytes are @param length Number of bytes to use for this Field, starting at offset 
public	TokenNamepublic	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"name cannot be null"	TokenNameStringLiteral	name cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"value cannot be null"	TokenNameStringLiteral	value cannot be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
StringHelper	TokenNameIdentifier	 String Helper
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// field names are interned 	TokenNameCOMMENT_LINE	field names are interned 
fieldsData	TokenNameIdentifier	 fields Data
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
isStored	TokenNameIdentifier	 is Stored
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
isIndexed	TokenNameIdentifier	 is Indexed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
isTokenized	TokenNameIdentifier	 is Tokenized
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
;	TokenNameSEMICOLON	
omitNorms	TokenNameIdentifier	 omit Norms
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
isBinary	TokenNameIdentifier	 is Binary
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
binaryLength	TokenNameIdentifier	 binary Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
binaryOffset	TokenNameIdentifier	 binary Offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
setStoreTermVector	TokenNameIdentifier	 set Store Term Vector
(	TokenNameLPAREN	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
