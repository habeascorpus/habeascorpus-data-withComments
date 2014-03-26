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
/** * Expert: A ScoreDoc which also contains information about * how to sort the referenced document. In addition to the * document number and score, this object contains an array * of values for the document from the field(s) used to sort. * For example, if the sort criteria was to sort by fields * "a", "b" then "c", the <code>fields</code> object array * will have three elements, corresponding respectively to * the term values for the document in fields "a", "b" and "c". * The class of each element in the array will be either * Integer, Float or String depending on the type of values * in the terms of each field. * * <p>Created: Feb 11, 2004 1:23:38 PM * * @since lucene 1.4 * @see ScoreDoc * @see TopFieldDocs */	TokenNameCOMMENT_JAVADOC	 Expert: A ScoreDoc which also contains information about how to sort the referenced document. In addition to the document number and score, this object contains an array of values for the document from the field(s) used to sort. For example, if the sort criteria was to sort by fields "a", "b" then "c", the <code>fields</code> object array will have three elements, corresponding respectively to the term values for the document in fields "a", "b" and "c". The class of each element in the array will be either Integer, Float or String depending on the type of values in the terms of each field. * <p>Created: Feb 11, 2004 1:23:38 PM * @since lucene 1.4 @see ScoreDoc @see TopFieldDocs 
public	TokenNamepublic	
class	TokenNameclass	
FieldDoc	TokenNameIdentifier	 Field Doc
extends	TokenNameextends	
ScoreDoc	TokenNameIdentifier	 Score Doc
{	TokenNameLBRACE	
/** Expert: The values which are used to sort the referenced document. * The order of these will match the original sort criteria given by a * Sort object. Each Object will have been returned from * the <code>value</code> method corresponding * FieldComparator used to sort this field. * @see Sort * @see Searcher#search(Query,Filter,int,Sort) */	TokenNameCOMMENT_JAVADOC	 Expert: The values which are used to sort the referenced document. The order of these will match the original sort criteria given by a Sort object. Each Object will have been returned from the <code>value</code> method corresponding FieldComparator used to sort this field. @see Sort @see Searcher#search(Query,Filter,int,Sort) 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
/** Expert: Creates one of these objects with empty sort information. */	TokenNameCOMMENT_JAVADOC	 Expert: Creates one of these objects with empty sort information. 
public	TokenNamepublic	
FieldDoc	TokenNameIdentifier	 Field Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: Creates one of these objects with the given sort information. */	TokenNameCOMMENT_JAVADOC	 Expert: Creates one of these objects with the given sort information. 
public	TokenNamepublic	
FieldDoc	TokenNameIdentifier	 Field Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: Creates one of these objects with the given sort information. */	TokenNameCOMMENT_JAVADOC	 Expert: Creates one of these objects with the given sort information. 
public	TokenNamepublic	
FieldDoc	TokenNameIdentifier	 Field Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
int	TokenNameint	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// A convenience method for debugging. 	TokenNameCOMMENT_LINE	A convenience method for debugging. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// super.toString returns the doc and score information, so just add the 	TokenNameCOMMENT_LINE	super.toString returns the doc and score information, so just add the 
// fields information 	TokenNameCOMMENT_LINE	fields information 
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"["	TokenNameStringLiteral	[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// discard last ", " 	TokenNameCOMMENT_LINE	discard last ", " 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
