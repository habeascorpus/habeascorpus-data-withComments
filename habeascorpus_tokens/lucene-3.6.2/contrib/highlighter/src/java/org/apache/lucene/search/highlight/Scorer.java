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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
/** * A Scorer is responsible for scoring a stream of tokens. These token scores * can then be used to compute {@link TextFragment} scores. */	TokenNameCOMMENT_JAVADOC	 A Scorer is responsible for scoring a stream of tokens. These token scores can then be used to compute {@link TextFragment} scores. 
public	TokenNamepublic	
interface	TokenNameinterface	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
/** * Called to init the Scorer with a {@link TokenStream}. You can grab references to * the attributes you are interested in here and access them from {@link #getTokenScore()}. * * @param tokenStream the {@link TokenStream} that will be scored. * @return either a {@link TokenStream} that the Highlighter should continue using (eg * if you read the tokenSream in this method) or null to continue * using the same {@link TokenStream} that was passed in. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Called to init the Scorer with a {@link TokenStream}. You can grab references to the attributes you are interested in here and access them from {@link #getTokenScore()}. * @param tokenStream the {@link TokenStream} that will be scored. @return either a {@link TokenStream} that the Highlighter should continue using (eg if you read the tokenSream in this method) or null to continue using the same {@link TokenStream} that was passed in. @throws IOException 
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Called when a new fragment is started for consideration. * * @param newFragment the fragment that will be scored next */	TokenNameCOMMENT_JAVADOC	 Called when a new fragment is started for consideration. * @param newFragment the fragment that will be scored next 
public	TokenNamepublic	
void	TokenNamevoid	
startFragment	TokenNameIdentifier	 start Fragment
(	TokenNameLPAREN	
TextFragment	TokenNameIdentifier	 Text Fragment
newFragment	TokenNameIdentifier	 new Fragment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called for each token in the current fragment. The {@link Highlighter} will * increment the {@link TokenStream} passed to init on every call. * * @return a score which is passed to the {@link Highlighter} class to influence the * mark-up of the text (this return value is NOT used to score the * fragment) */	TokenNameCOMMENT_JAVADOC	 Called for each token in the current fragment. The {@link Highlighter} will increment the {@link TokenStream} passed to init on every call. * @return a score which is passed to the {@link Highlighter} class to influence the mark-up of the text (this return value is NOT used to score the fragment) 
public	TokenNamepublic	
float	TokenNamefloat	
getTokenScore	TokenNameIdentifier	 get Token Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when the {@link Highlighter} has no more tokens for the current fragment - * the Scorer returns the weighting it has derived for the most recent * fragment, typically based on the results of {@link #getTokenScore()}. * */	TokenNameCOMMENT_JAVADOC	 Called when the {@link Highlighter} has no more tokens for the current fragment - the Scorer returns the weighting it has derived for the most recent fragment, typically based on the results of {@link #getTokenScore()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getFragmentScore	TokenNameIdentifier	 get Fragment Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
