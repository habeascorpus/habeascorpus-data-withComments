package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A query that scores each document as the value of the numeric input field. * <p> * The query matches all documents, and scores each document according to the numeric * value of that field. * <p> * It is assumed, and expected, that: * <ul> * <li>The field used here is indexed, and has exactly * one token in every scored document.</li> * <li>Best if this field is un_tokenized.</li> * <li>That token is parseable to the selected type.</li> * </ul> * <p> * Combining this query in a FunctionQuery allows much freedom in affecting document scores. * Note, that with this freedom comes responsibility: it is more than likely that the * default Lucene scoring is superior in quality to scoring modified as explained here. * However, in some cases, and certainly for research experiments, this capability may turn useful. * <p> * When constructing this query, select the appropriate type. That type should match the data stored in the * field. So in fact the "right" type should be selected before indexing. Type selection * has effect on the RAM usage: * <ul> * <li>{@link Type#BYTE} consumes 1 * maxDocs bytes.</li> * <li>{@link Type#SHORT} consumes 2 * maxDocs bytes.</li> * <li>{@link Type#INT} consumes 4 * maxDocs bytes.</li> * <li>{@link Type#FLOAT} consumes 8 * maxDocs bytes.</li> * </ul> * <p> * <b>Caching:</b> * Values for the numeric field are loaded once and cached in memory for further use with the same IndexReader. * To take advantage of this, it is extremely important to reuse index-readers or index-searchers, * otherwise, for instance if for each query a new index reader is opened, large penalties would be * paid for loading the field values into memory over and over again! * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A query that scores each document as the value of the numeric input field. <p> The query matches all documents, and scores each document according to the numeric value of that field. <p> It is assumed, and expected, that: <ul> <li>The field used here is indexed, and has exactly one token in every scored document.</li> <li>Best if this field is un_tokenized.</li> <li>That token is parseable to the selected type.</li> </ul> <p> Combining this query in a FunctionQuery allows much freedom in affecting document scores. Note, that with this freedom comes responsibility: it is more than likely that the default Lucene scoring is superior in quality to scoring modified as explained here. However, in some cases, and certainly for research experiments, this capability may turn useful. <p> When constructing this query, select the appropriate type. That type should match the data stored in the field. So in fact the "right" type should be selected before indexing. Type selection has effect on the RAM usage: <ul> <li>{@link Type#BYTE} consumes 1 maxDocs bytes.</li> <li>{@link Type#SHORT} consumes 2 maxDocs bytes.</li> <li>{@link Type#INT} consumes 4 maxDocs bytes.</li> <li>{@link Type#FLOAT} consumes 8 maxDocs bytes.</li> </ul> <p> <b>Caching:</b> Values for the numeric field are loaded once and cached in memory for further use with the same IndexReader. To take advantage of this, it is extremely important to reuse index-readers or index-searchers, otherwise, for instance if for each query a new index reader is opened, large penalties would be paid for loading the field values into memory over and over again! * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
extends	TokenNameextends	
ValueSourceQuery	TokenNameIdentifier	 Value Source Query
{	TokenNameLBRACE	
/** * Type of score field, indicating how field values are interpreted/parsed. * <p> * The type selected at search search time should match the data stored in the field. * Different types have different RAM requirements: * <ul> * <li>{@link #BYTE} consumes 1 * maxDocs bytes.</li> * <li>{@link #SHORT} consumes 2 * maxDocs bytes.</li> * <li>{@link #INT} consumes 4 * maxDocs bytes.</li> * <li>{@link #FLOAT} consumes 8 * maxDocs bytes.</li> * </ul> */	TokenNameCOMMENT_JAVADOC	 Type of score field, indicating how field values are interpreted/parsed. <p> The type selected at search search time should match the data stored in the field. Different types have different RAM requirements: <ul> <li>{@link #BYTE} consumes 1 maxDocs bytes.</li> <li>{@link #SHORT} consumes 2 maxDocs bytes.</li> <li>{@link #INT} consumes 4 maxDocs bytes.</li> <li>{@link #FLOAT} consumes 8 maxDocs bytes.</li> </ul> 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
/** field values are interpreted as numeric byte values. */	TokenNameCOMMENT_JAVADOC	 field values are interpreted as numeric byte values. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
BYTE	TokenNameIdentifier	 BYTE
=	TokenNameEQUAL	
new	TokenNamenew	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
"byte"	TokenNameStringLiteral	byte
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** field values are interpreted as numeric short values. */	TokenNameCOMMENT_JAVADOC	 field values are interpreted as numeric short values. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
SHORT	TokenNameIdentifier	 SHORT
=	TokenNameEQUAL	
new	TokenNamenew	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
"short"	TokenNameStringLiteral	short
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** field values are interpreted as numeric int values. */	TokenNameCOMMENT_JAVADOC	 field values are interpreted as numeric int values. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
INT	TokenNameIdentifier	 INT
=	TokenNameEQUAL	
new	TokenNamenew	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
"int"	TokenNameStringLiteral	int
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** field values are interpreted as numeric float values. */	TokenNameCOMMENT_JAVADOC	 field values are interpreted as numeric float values. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
FLOAT	TokenNameIdentifier	 FLOAT
=	TokenNameEQUAL	
new	TokenNamenew	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
"float"	TokenNameStringLiteral	float
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
typeName	TokenNameIdentifier	 type Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
typeName	TokenNameIdentifier	 type Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*(non-Javadoc) @see java.lang.Object#toString() */	TokenNameCOMMENT_BLOCK	(non-Javadoc) @see java.lang.Object#toString() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"::"	TokenNameStringLiteral	::
+	TokenNamePLUS	
typeName	TokenNameIdentifier	 type Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a FieldScoreQuery - a query that scores each document as the value of the numeric input field. * <p> * The <code>type</code> param tells how to parse the field string values into a numeric score value. * @param field the numeric field to be used. * @param type the type of the field: either * {@link Type#BYTE}, {@link Type#SHORT}, {@link Type#INT}, or {@link Type#FLOAT}. */	TokenNameCOMMENT_JAVADOC	 Create a FieldScoreQuery - a query that scores each document as the value of the numeric input field. <p> The <code>type</code> param tells how to parse the field string values into a numeric score value. @param field the numeric field to be used. @param type the type of the field: either {@link Type#BYTE}, {@link Type#SHORT}, {@link Type#INT}, or {@link Type#FLOAT}. 
public	TokenNamepublic	
FieldScoreQuery	TokenNameIdentifier	 Field Score Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
getValueSource	TokenNameIdentifier	 get Value Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create the appropriate (cached) field value source. 	TokenNameCOMMENT_LINE	create the appropriate (cached) field value source. 
private	TokenNameprivate	
static	TokenNamestatic	
ValueSource	TokenNameIdentifier	 Value Source
getValueSource	TokenNameIdentifier	 get Value Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BYTE	TokenNameIdentifier	 BYTE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ByteFieldSource	TokenNameIdentifier	 Byte Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ShortFieldSource	TokenNameIdentifier	 Short Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
IntFieldSource	TokenNameIdentifier	 Int Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FloatFieldSource	TokenNameIdentifier	 Float Field Source
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
" is not a known Field Score Query Type!"	TokenNameStringLiteral	 is not a known Field Score Query Type!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
