package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
highlight	TokenNameIdentifier	 highlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Simple {@link Formatter} implementation to highlight terms with a pre and * post tag. */	TokenNameCOMMENT_JAVADOC	 Simple {@link Formatter} implementation to highlight terms with a pre and post tag. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleHTMLFormatter	TokenNameIdentifier	 Simple HTML Formatter
implements	TokenNameimplements	
Formatter	TokenNameIdentifier	 Formatter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_PRE_TAG	TokenNameIdentifier	 DEFAULT  PRE  TAG
=	TokenNameEQUAL	
"<B>"	TokenNameStringLiteral	<B>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_POST_TAG	TokenNameIdentifier	 DEFAULT  POST  TAG
=	TokenNameEQUAL	
"</B>"	TokenNameStringLiteral	</B>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
preTag	TokenNameIdentifier	 pre Tag
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
postTag	TokenNameIdentifier	 post Tag
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleHTMLFormatter	TokenNameIdentifier	 Simple HTML Formatter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
preTag	TokenNameIdentifier	 pre Tag
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
postTag	TokenNameIdentifier	 post Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
preTag	TokenNameIdentifier	 pre Tag
=	TokenNameEQUAL	
preTag	TokenNameIdentifier	 pre Tag
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
postTag	TokenNameIdentifier	 post Tag
=	TokenNameEQUAL	
postTag	TokenNameIdentifier	 post Tag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Default constructor uses HTML: &lt;B&gt; tags to markup terms. */	TokenNameCOMMENT_JAVADOC	 Default constructor uses HTML: &lt;B&gt; tags to markup terms. 
public	TokenNamepublic	
SimpleHTMLFormatter	TokenNameIdentifier	 Simple HTML Formatter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_PRE_TAG	TokenNameIdentifier	 DEFAULT  PRE  TAG
,	TokenNameCOMMA	
DEFAULT_POST_TAG	TokenNameIdentifier	 DEFAULT  POST  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.highlight.Formatter#highlightTerm(java.lang.String, org.apache.lucene.search.highlight.TokenGroup) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.highlight.Formatter#highlightTerm(java.lang.String, org.apache.lucene.search.highlight.TokenGroup) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
highlightTerm	TokenNameIdentifier	 highlight Term
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
originalText	TokenNameIdentifier	 original Text
,	TokenNameCOMMA	
TokenGroup	TokenNameIdentifier	 Token Group
tokenGroup	TokenNameIdentifier	 token Group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenGroup	TokenNameIdentifier	 token Group
.	TokenNameDOT	
getTotalScore	TokenNameIdentifier	 get Total Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
originalText	TokenNameIdentifier	 original Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Allocate StringBuilder with the right number of characters from the 	TokenNameCOMMENT_LINE	Allocate StringBuilder with the right number of characters from the 
// beginning, to avoid char[] allocations in the middle of appends. 	TokenNameCOMMENT_LINE	beginning, to avoid char[] allocations in the middle of appends. 
StringBuilder	TokenNameIdentifier	 String Builder
returnBuffer	TokenNameIdentifier	 return Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
preTag	TokenNameIdentifier	 pre Tag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
originalText	TokenNameIdentifier	 original Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
postTag	TokenNameIdentifier	 post Tag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
returnBuffer	TokenNameIdentifier	 return Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
preTag	TokenNameIdentifier	 pre Tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
returnBuffer	TokenNameIdentifier	 return Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
originalText	TokenNameIdentifier	 original Text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
returnBuffer	TokenNameIdentifier	 return Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
postTag	TokenNameIdentifier	 post Tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnBuffer	TokenNameIdentifier	 return Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
