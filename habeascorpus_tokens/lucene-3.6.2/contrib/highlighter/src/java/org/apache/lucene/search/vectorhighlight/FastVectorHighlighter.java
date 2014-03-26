package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
vectorhighlight	TokenNameIdentifier	 vectorhighlight
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
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
highlight	TokenNameIdentifier	 highlight
.	TokenNameDOT	
Encoder	TokenNameIdentifier	 Encoder
;	TokenNameSEMICOLON	
/** * Another highlighter implementation. * */	TokenNameCOMMENT_JAVADOC	 Another highlighter implementation. 
public	TokenNamepublic	
class	TokenNameclass	
FastVectorHighlighter	TokenNameIdentifier	 Fast Vector Highlighter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_PHRASE_HIGHLIGHT	TokenNameIdentifier	 DEFAULT  PHRASE  HIGHLIGHT
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_FIELD_MATCH	TokenNameIdentifier	 DEFAULT  FIELD  MATCH
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
phraseHighlight	TokenNameIdentifier	 phrase Highlight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fieldMatch	TokenNameIdentifier	 field Match
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FragListBuilder	TokenNameIdentifier	 Frag List Builder
fragListBuilder	TokenNameIdentifier	 frag List Builder
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FragmentsBuilder	TokenNameIdentifier	 Fragments Builder
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
phraseLimit	TokenNameIdentifier	 phrase Limit
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
/** * the default constructor. */	TokenNameCOMMENT_JAVADOC	 the default constructor. 
public	TokenNamepublic	
FastVectorHighlighter	TokenNameIdentifier	 Fast Vector Highlighter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_PHRASE_HIGHLIGHT	TokenNameIdentifier	 DEFAULT  PHRASE  HIGHLIGHT
,	TokenNameCOMMA	
DEFAULT_FIELD_MATCH	TokenNameIdentifier	 DEFAULT  FIELD  MATCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * a constructor. Using {@link SimpleFragListBuilder} and {@link ScoreOrderFragmentsBuilder}. * * @param phraseHighlight true or false for phrase highlighting * @param fieldMatch true of false for field matching */	TokenNameCOMMENT_JAVADOC	 a constructor. Using {@link SimpleFragListBuilder} and {@link ScoreOrderFragmentsBuilder}. * @param phraseHighlight true or false for phrase highlighting @param fieldMatch true of false for field matching 
public	TokenNamepublic	
FastVectorHighlighter	TokenNameIdentifier	 Fast Vector Highlighter
(	TokenNameLPAREN	
boolean	TokenNameboolean	
phraseHighlight	TokenNameIdentifier	 phrase Highlight
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fieldMatch	TokenNameIdentifier	 field Match
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
phraseHighlight	TokenNameIdentifier	 phrase Highlight
,	TokenNameCOMMA	
fieldMatch	TokenNameIdentifier	 field Match
,	TokenNameCOMMA	
new	TokenNamenew	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
ScoreOrderFragmentsBuilder	TokenNameIdentifier	 Score Order Fragments Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * a constructor. A {@link FragListBuilder} and a {@link FragmentsBuilder} can be specified (plugins). * * @param phraseHighlight true of false for phrase highlighting * @param fieldMatch true of false for field matching * @param fragListBuilder an instance of {@link FragListBuilder} * @param fragmentsBuilder an instance of {@link FragmentsBuilder} */	TokenNameCOMMENT_JAVADOC	 a constructor. A {@link FragListBuilder} and a {@link FragmentsBuilder} can be specified (plugins). * @param phraseHighlight true of false for phrase highlighting @param fieldMatch true of false for field matching @param fragListBuilder an instance of {@link FragListBuilder} @param fragmentsBuilder an instance of {@link FragmentsBuilder} 
public	TokenNamepublic	
FastVectorHighlighter	TokenNameIdentifier	 Fast Vector Highlighter
(	TokenNameLPAREN	
boolean	TokenNameboolean	
phraseHighlight	TokenNameIdentifier	 phrase Highlight
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fieldMatch	TokenNameIdentifier	 field Match
,	TokenNameCOMMA	
FragListBuilder	TokenNameIdentifier	 Frag List Builder
fragListBuilder	TokenNameIdentifier	 frag List Builder
,	TokenNameCOMMA	
FragmentsBuilder	TokenNameIdentifier	 Fragments Builder
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
phraseHighlight	TokenNameIdentifier	 phrase Highlight
=	TokenNameEQUAL	
phraseHighlight	TokenNameIdentifier	 phrase Highlight
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldMatch	TokenNameIdentifier	 field Match
=	TokenNameEQUAL	
fieldMatch	TokenNameIdentifier	 field Match
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fragListBuilder	TokenNameIdentifier	 frag List Builder
=	TokenNameEQUAL	
fragListBuilder	TokenNameIdentifier	 frag List Builder
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
=	TokenNameEQUAL	
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * create a {@link FieldQuery} object. * * @param query a query * @return the created {@link FieldQuery} object */	TokenNameCOMMENT_JAVADOC	 create a {@link FieldQuery} object. * @param query a query @return the created {@link FieldQuery} object 
public	TokenNamepublic	
FieldQuery	TokenNameIdentifier	 Field Query
getFieldQuery	TokenNameIdentifier	 get Field Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: should we deprecate this? 	TokenNameCOMMENT_LINE	TODO: should we deprecate this? 
// because if there is no reader, then we cannot rewrite MTQ. 	TokenNameCOMMENT_LINE	because if there is no reader, then we cannot rewrite MTQ. 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
phraseHighlight	TokenNameIdentifier	 phrase Highlight
,	TokenNameCOMMA	
fieldMatch	TokenNameIdentifier	 field Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should never be thrown when reader is null 	TokenNameCOMMENT_LINE	should never be thrown when reader is null 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * create a {@link FieldQuery} object. * * @param query a query * @return the created {@link FieldQuery} object */	TokenNameCOMMENT_JAVADOC	 create a {@link FieldQuery} object. * @param query a query @return the created {@link FieldQuery} object 
public	TokenNamepublic	
FieldQuery	TokenNameIdentifier	 Field Query
getFieldQuery	TokenNameIdentifier	 get Field Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldQuery	TokenNameIdentifier	 Field Query
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
phraseHighlight	TokenNameIdentifier	 phrase Highlight
,	TokenNameCOMMA	
fieldMatch	TokenNameIdentifier	 field Match
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return the best fragment. * * @param fieldQuery {@link FieldQuery} object * @param reader {@link IndexReader} of the index * @param docId document id to be highlighted * @param fieldName field of the document to be highlighted * @param fragCharSize the length (number of chars) of a fragment * @return the best fragment (snippet) string * @throws IOException */	TokenNameCOMMENT_JAVADOC	 return the best fragment. * @param fieldQuery {@link FieldQuery} object @param reader {@link IndexReader} of the index @param docId document id to be highlighted @param fieldName field of the document to be highlighted @param fragCharSize the length (number of chars) of a fragment @return the best fragment (snippet) string @throws IOException 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getBestFragment	TokenNameIdentifier	 get Best Fragment
(	TokenNameLPAREN	
final	TokenNamefinal	
FieldQuery	TokenNameIdentifier	 Field Query
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FieldFragList	TokenNameIdentifier	 Field Frag List
fieldFragList	TokenNameIdentifier	 field Frag List
=	TokenNameEQUAL	
getFieldFragList	TokenNameIdentifier	 get Field Frag List
(	TokenNameLPAREN	
fragListBuilder	TokenNameIdentifier	 frag List Builder
,	TokenNameCOMMA	
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
.	TokenNameDOT	
createFragment	TokenNameIdentifier	 create Fragment
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
fieldFragList	TokenNameIdentifier	 field Frag List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return the best fragments. * * @param fieldQuery {@link FieldQuery} object * @param reader {@link IndexReader} of the index * @param docId document id to be highlighted * @param fieldName field of the document to be highlighted * @param fragCharSize the length (number of chars) of a fragment * @param maxNumFragments maximum number of fragments * @return created fragments or null when no fragments created. * size of the array can be less than maxNumFragments * @throws IOException */	TokenNameCOMMENT_JAVADOC	 return the best fragments. * @param fieldQuery {@link FieldQuery} object @param reader {@link IndexReader} of the index @param docId document id to be highlighted @param fieldName field of the document to be highlighted @param fragCharSize the length (number of chars) of a fragment @param maxNumFragments maximum number of fragments @return created fragments or null when no fragments created. size of the array can be less than maxNumFragments @throws IOException 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBestFragments	TokenNameIdentifier	 get Best Fragments
(	TokenNameLPAREN	
final	TokenNamefinal	
FieldQuery	TokenNameIdentifier	 Field Query
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
fragCharSize	TokenNameIdentifier	 frag Char Size
,	TokenNameCOMMA	
int	TokenNameint	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FieldFragList	TokenNameIdentifier	 Field Frag List
fieldFragList	TokenNameIdentifier	 field Frag List
=	TokenNameEQUAL	
getFieldFragList	TokenNameIdentifier	 get Field Frag List
(	TokenNameLPAREN	
fragListBuilder	TokenNameIdentifier	 frag List Builder
,	TokenNameCOMMA	
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
.	TokenNameDOT	
createFragments	TokenNameIdentifier	 create Fragments
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
fieldFragList	TokenNameIdentifier	 field Frag List
,	TokenNameCOMMA	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return the best fragment. * * @param fieldQuery {@link FieldQuery} object * @param reader {@link IndexReader} of the index * @param docId document id to be highlighted * @param fieldName field of the document to be highlighted * @param fragCharSize the length (number of chars) of a fragment * @param fragListBuilder {@link FragListBuilder} object * @param fragmentsBuilder {@link FragmentsBuilder} object * @param preTags pre-tags to be used to highlight terms * @param postTags post-tags to be used to highlight terms * @param encoder an encoder that generates encoded text * @return the best fragment (snippet) string * @throws IOException */	TokenNameCOMMENT_JAVADOC	 return the best fragment. * @param fieldQuery {@link FieldQuery} object @param reader {@link IndexReader} of the index @param docId document id to be highlighted @param fieldName field of the document to be highlighted @param fragCharSize the length (number of chars) of a fragment @param fragListBuilder {@link FragListBuilder} object @param fragmentsBuilder {@link FragmentsBuilder} object @param preTags pre-tags to be used to highlight terms @param postTags post-tags to be used to highlight terms @param encoder an encoder that generates encoded text @return the best fragment (snippet) string @throws IOException 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getBestFragment	TokenNameIdentifier	 get Best Fragment
(	TokenNameLPAREN	
final	TokenNamefinal	
FieldQuery	TokenNameIdentifier	 Field Query
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
fragCharSize	TokenNameIdentifier	 frag Char Size
,	TokenNameCOMMA	
FragListBuilder	TokenNameIdentifier	 Frag List Builder
fragListBuilder	TokenNameIdentifier	 frag List Builder
,	TokenNameCOMMA	
FragmentsBuilder	TokenNameIdentifier	 Fragments Builder
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
preTags	TokenNameIdentifier	 pre Tags
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
postTags	TokenNameIdentifier	 post Tags
,	TokenNameCOMMA	
Encoder	TokenNameIdentifier	 Encoder
encoder	TokenNameIdentifier	 encoder
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FieldFragList	TokenNameIdentifier	 Field Frag List
fieldFragList	TokenNameIdentifier	 field Frag List
=	TokenNameEQUAL	
getFieldFragList	TokenNameIdentifier	 get Field Frag List
(	TokenNameLPAREN	
fragListBuilder	TokenNameIdentifier	 frag List Builder
,	TokenNameCOMMA	
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
.	TokenNameDOT	
createFragment	TokenNameIdentifier	 create Fragment
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
fieldFragList	TokenNameIdentifier	 field Frag List
,	TokenNameCOMMA	
preTags	TokenNameIdentifier	 pre Tags
,	TokenNameCOMMA	
postTags	TokenNameIdentifier	 post Tags
,	TokenNameCOMMA	
encoder	TokenNameIdentifier	 encoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return the best fragments. * * @param fieldQuery {@link FieldQuery} object * @param reader {@link IndexReader} of the index * @param docId document id to be highlighted * @param fieldName field of the document to be highlighted * @param fragCharSize the length (number of chars) of a fragment * @param maxNumFragments maximum number of fragments * @param fragListBuilder {@link FragListBuilder} object * @param fragmentsBuilder {@link FragmentsBuilder} object * @param preTags pre-tags to be used to highlight terms * @param postTags post-tags to be used to highlight terms * @param encoder an encoder that generates encoded text * @return created fragments or null when no fragments created. * size of the array can be less than maxNumFragments * @throws IOException */	TokenNameCOMMENT_JAVADOC	 return the best fragments. * @param fieldQuery {@link FieldQuery} object @param reader {@link IndexReader} of the index @param docId document id to be highlighted @param fieldName field of the document to be highlighted @param fragCharSize the length (number of chars) of a fragment @param maxNumFragments maximum number of fragments @param fragListBuilder {@link FragListBuilder} object @param fragmentsBuilder {@link FragmentsBuilder} object @param preTags pre-tags to be used to highlight terms @param postTags post-tags to be used to highlight terms @param encoder an encoder that generates encoded text @return created fragments or null when no fragments created. size of the array can be less than maxNumFragments @throws IOException 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBestFragments	TokenNameIdentifier	 get Best Fragments
(	TokenNameLPAREN	
final	TokenNamefinal	
FieldQuery	TokenNameIdentifier	 Field Query
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
fragCharSize	TokenNameIdentifier	 frag Char Size
,	TokenNameCOMMA	
int	TokenNameint	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
,	TokenNameCOMMA	
FragListBuilder	TokenNameIdentifier	 Frag List Builder
fragListBuilder	TokenNameIdentifier	 frag List Builder
,	TokenNameCOMMA	
FragmentsBuilder	TokenNameIdentifier	 Fragments Builder
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
preTags	TokenNameIdentifier	 pre Tags
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
postTags	TokenNameIdentifier	 post Tags
,	TokenNameCOMMA	
Encoder	TokenNameIdentifier	 Encoder
encoder	TokenNameIdentifier	 encoder
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FieldFragList	TokenNameIdentifier	 Field Frag List
fieldFragList	TokenNameIdentifier	 field Frag List
=	TokenNameEQUAL	
getFieldFragList	TokenNameIdentifier	 get Field Frag List
(	TokenNameLPAREN	
fragListBuilder	TokenNameIdentifier	 frag List Builder
,	TokenNameCOMMA	
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fragmentsBuilder	TokenNameIdentifier	 fragments Builder
.	TokenNameDOT	
createFragments	TokenNameIdentifier	 create Fragments
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
fieldFragList	TokenNameIdentifier	 field Frag List
,	TokenNameCOMMA	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
,	TokenNameCOMMA	
preTags	TokenNameIdentifier	 pre Tags
,	TokenNameCOMMA	
postTags	TokenNameIdentifier	 post Tags
,	TokenNameCOMMA	
encoder	TokenNameIdentifier	 encoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
FieldFragList	TokenNameIdentifier	 Field Frag List
getFieldFragList	TokenNameIdentifier	 get Field Frag List
(	TokenNameLPAREN	
FragListBuilder	TokenNameIdentifier	 Frag List Builder
fragListBuilder	TokenNameIdentifier	 frag List Builder
,	TokenNameCOMMA	
final	TokenNamefinal	
FieldQuery	TokenNameIdentifier	 Field Query
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
int	TokenNameint	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
fieldTermStack	TokenNameIdentifier	 field Term Stack
=	TokenNameEQUAL	
new	TokenNamenew	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
fieldQuery	TokenNameIdentifier	 field Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fieldPhraseList	TokenNameIdentifier	 field Phrase List
=	TokenNameEQUAL	
new	TokenNamenew	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
fieldTermStack	TokenNameIdentifier	 field Term Stack
,	TokenNameCOMMA	
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
phraseLimit	TokenNameIdentifier	 phrase Limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fragListBuilder	TokenNameIdentifier	 frag List Builder
.	TokenNameDOT	
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
fieldPhraseList	TokenNameIdentifier	 field Phrase List
,	TokenNameCOMMA	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return whether phraseHighlight or not. * * @return whether phraseHighlight or not */	TokenNameCOMMENT_JAVADOC	 return whether phraseHighlight or not. * @return whether phraseHighlight or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPhraseHighlight	TokenNameIdentifier	 is Phrase Highlight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
phraseHighlight	TokenNameIdentifier	 phrase Highlight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return whether fieldMatch or not. * * @return whether fieldMatch or not */	TokenNameCOMMENT_JAVADOC	 return whether fieldMatch or not. * @return whether fieldMatch or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFieldMatch	TokenNameIdentifier	 is Field Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldMatch	TokenNameIdentifier	 field Match
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the maximum number of phrases to analyze when searching for the highest-scoring phrase. */	TokenNameCOMMENT_JAVADOC	 @return the maximum number of phrases to analyze when searching for the highest-scoring phrase. 
public	TokenNamepublic	
int	TokenNameint	
getPhraseLimit	TokenNameIdentifier	 get Phrase Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
phraseLimit	TokenNameIdentifier	 phrase Limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set the maximum number of phrases to analyze when searching for the highest-scoring phrase. * The default is unlimited (Integer.MAX_VALUE). */	TokenNameCOMMENT_JAVADOC	 set the maximum number of phrases to analyze when searching for the highest-scoring phrase. The default is unlimited (Integer.MAX_VALUE). 
public	TokenNamepublic	
void	TokenNamevoid	
setPhraseLimit	TokenNameIdentifier	 set Phrase Limit
(	TokenNameLPAREN	
int	TokenNameint	
phraseLimit	TokenNameIdentifier	 phrase Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
phraseLimit	TokenNameIdentifier	 phrase Limit
=	TokenNameEQUAL	
phraseLimit	TokenNameIdentifier	 phrase Limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
