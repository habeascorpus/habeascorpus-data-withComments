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
highlight	TokenNameIdentifier	 highlight
.	TokenNameDOT	
Encoder	TokenNameIdentifier	 Encoder
;	TokenNameSEMICOLON	
/** * {@link org.apache.lucene.search.vectorhighlight.FragmentsBuilder} is an interface for fragments (snippets) builder classes. * A {@link org.apache.lucene.search.vectorhighlight.FragmentsBuilder} class can be plugged in to * {@link org.apache.lucene.search.vectorhighlight.FastVectorHighlighter}. */	TokenNameCOMMENT_JAVADOC	 {@link org.apache.lucene.search.vectorhighlight.FragmentsBuilder} is an interface for fragments (snippets) builder classes. A {@link org.apache.lucene.search.vectorhighlight.FragmentsBuilder} class can be plugged in to {@link org.apache.lucene.search.vectorhighlight.FastVectorHighlighter}. 
public	TokenNamepublic	
interface	TokenNameinterface	
FragmentsBuilder	TokenNameIdentifier	 Fragments Builder
{	TokenNameLBRACE	
/** * create a fragment. * * @param reader IndexReader of the index * @param docId document id to be highlighted * @param fieldName field of the document to be highlighted * @param fieldFragList FieldFragList object * @return a created fragment or null when no fragment created * @throws IOException */	TokenNameCOMMENT_JAVADOC	 create a fragment. * @param reader IndexReader of the index @param docId document id to be highlighted @param fieldName field of the document to be highlighted @param fieldFragList FieldFragList object @return a created fragment or null when no fragment created @throws IOException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
createFragment	TokenNameIdentifier	 create Fragment
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
FieldFragList	TokenNameIdentifier	 Field Frag List
fieldFragList	TokenNameIdentifier	 field Frag List
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * create multiple fragments. * * @param reader IndexReader of the index * @param docId document id to be highlighter * @param fieldName field of the document to be highlighted * @param fieldFragList FieldFragList object * @param maxNumFragments maximum number of fragments * @return created fragments or null when no fragments created. * size of the array can be less than maxNumFragments * @throws IOException */	TokenNameCOMMENT_JAVADOC	 create multiple fragments. * @param reader IndexReader of the index @param docId document id to be highlighter @param fieldName field of the document to be highlighted @param fieldFragList FieldFragList object @param maxNumFragments maximum number of fragments @return created fragments or null when no fragments created. size of the array can be less than maxNumFragments @throws IOException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
createFragments	TokenNameIdentifier	 create Fragments
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
FieldFragList	TokenNameIdentifier	 Field Frag List
fieldFragList	TokenNameIdentifier	 field Frag List
,	TokenNameCOMMA	
int	TokenNameint	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * create a fragment. * * @param reader IndexReader of the index * @param docId document id to be highlighted * @param fieldName field of the document to be highlighted * @param fieldFragList FieldFragList object * @param preTags pre-tags to be used to highlight terms * @param postTags post-tags to be used to highlight terms * @param encoder an encoder that generates encoded text * @return a created fragment or null when no fragment created * @throws IOException */	TokenNameCOMMENT_JAVADOC	 create a fragment. * @param reader IndexReader of the index @param docId document id to be highlighted @param fieldName field of the document to be highlighted @param fieldFragList FieldFragList object @param preTags pre-tags to be used to highlight terms @param postTags post-tags to be used to highlight terms @param encoder an encoder that generates encoded text @return a created fragment or null when no fragment created @throws IOException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
createFragment	TokenNameIdentifier	 create Fragment
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
FieldFragList	TokenNameIdentifier	 Field Frag List
fieldFragList	TokenNameIdentifier	 field Frag List
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
;	TokenNameSEMICOLON	
/** * create multiple fragments. * * @param reader IndexReader of the index * @param docId document id to be highlighter * @param fieldName field of the document to be highlighted * @param fieldFragList FieldFragList object * @param maxNumFragments maximum number of fragments * @param preTags pre-tags to be used to highlight terms * @param postTags post-tags to be used to highlight terms * @param encoder an encoder that generates encoded text * @return created fragments or null when no fragments created. * size of the array can be less than maxNumFragments * @throws IOException */	TokenNameCOMMENT_JAVADOC	 create multiple fragments. * @param reader IndexReader of the index @param docId document id to be highlighter @param fieldName field of the document to be highlighted @param fieldFragList FieldFragList object @param maxNumFragments maximum number of fragments @param preTags pre-tags to be used to highlight terms @param postTags post-tags to be used to highlight terms @param encoder an encoder that generates encoded text @return created fragments or null when no fragments created. size of the array can be less than maxNumFragments @throws IOException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
createFragments	TokenNameIdentifier	 create Fragments
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
FieldFragList	TokenNameIdentifier	 Field Frag List
fieldFragList	TokenNameIdentifier	 field Frag List
,	TokenNameCOMMA	
int	TokenNameint	
maxNumFragments	TokenNameIdentifier	 max Num Fragments
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
