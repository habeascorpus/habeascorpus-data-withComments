package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
/** * This attribute can be used to mark a token as a keyword. Keyword aware * {@link TokenStream}s can decide to modify a token based on the return value * of {@link #isKeyword()} if the token is modified. Stemming filters for * instance can use this attribute to conditionally skip a term if * {@link #isKeyword()} returns <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 This attribute can be used to mark a token as a keyword. Keyword aware {@link TokenStream}s can decide to modify a token based on the return value of {@link #isKeyword()} if the token is modified. Stemming filters for instance can use this attribute to conditionally skip a term if {@link #isKeyword()} returns <code>true</code>. 
public	TokenNamepublic	
interface	TokenNameinterface	
KeywordAttribute	TokenNameIdentifier	 Keyword Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** * Returns <code>true</code> iff the current token is a keyword, otherwise * <code>false</code>/ * * @return <code>true</code> iff the current token is a keyword, otherwise * <code>false</code>/ */	TokenNameCOMMENT_JAVADOC	 Returns <code>true</code> iff the current token is a keyword, otherwise <code>false</code>/ * @return <code>true</code> iff the current token is a keyword, otherwise <code>false</code>/ 
public	TokenNamepublic	
boolean	TokenNameboolean	
isKeyword	TokenNameIdentifier	 is Keyword
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Marks the current token as keyword iff set to <code>true</code>. * * @param isKeyword * <code>true</code> iff the current token is a keyword, otherwise * <code>false</code>. */	TokenNameCOMMENT_JAVADOC	 Marks the current token as keyword iff set to <code>true</code>. * @param isKeyword <code>true</code> iff the current token is a keyword, otherwise <code>false</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setKeyword	TokenNameIdentifier	 set Keyword
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isKeyword	TokenNameIdentifier	 is Keyword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
