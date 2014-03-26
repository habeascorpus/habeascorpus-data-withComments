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
/** Holds one hit in {@link TopDocs}. */	TokenNameCOMMENT_JAVADOC	 Holds one hit in {@link TopDocs}. 
public	TokenNamepublic	
class	TokenNameclass	
ScoreDoc	TokenNameIdentifier	 Score Doc
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** The score of this document for the query. */	TokenNameCOMMENT_JAVADOC	 The score of this document for the query. 
public	TokenNamepublic	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
/** Expert: A hit document's number. * @see Searcher#doc(int) */	TokenNameCOMMENT_JAVADOC	 Expert: A hit document's number. @see Searcher#doc(int) 
public	TokenNamepublic	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
/** Only set by {@link TopDocs#merge} */	TokenNameCOMMENT_JAVADOC	 Only set by {@link TopDocs#merge} 
public	TokenNamepublic	
int	TokenNameint	
shardIndex	TokenNameIdentifier	 shard Index
;	TokenNameSEMICOLON	
/** Constructs a ScoreDoc. */	TokenNameCOMMENT_JAVADOC	 Constructs a ScoreDoc. 
public	TokenNamepublic	
ScoreDoc	TokenNameIdentifier	 Score Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs a ScoreDoc. */	TokenNameCOMMENT_JAVADOC	 Constructs a ScoreDoc. 
public	TokenNamepublic	
ScoreDoc	TokenNameIdentifier	 Score Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
int	TokenNameint	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
=	TokenNameEQUAL	
shardIndex	TokenNameIdentifier	 shard Index
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
return	TokenNamereturn	
"doc="	TokenNameStringLiteral	doc=
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" score="	TokenNameStringLiteral	 score=
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
" shardIndex="	TokenNameStringLiteral	 shardIndex=
+	TokenNamePLUS	
shardIndex	TokenNameIdentifier	 shard Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
