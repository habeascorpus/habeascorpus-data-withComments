package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spell	TokenNameIdentifier	 spell
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
/** * Score first, then frequency * **/	TokenNameCOMMENT_JAVADOC	 Score first, then frequency *
public	TokenNamepublic	
class	TokenNameclass	
SuggestWordScoreComparator	TokenNameIdentifier	 Suggest Word Score Comparator
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
SuggestWord	TokenNameIdentifier	 Suggest Word
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
SuggestWord	TokenNameIdentifier	 Suggest Word
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
SuggestWord	TokenNameIdentifier	 Suggest Word
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first criteria: the distance 	TokenNameCOMMENT_LINE	first criteria: the distance 
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
score	TokenNameIdentifier	 score
>	TokenNameGREATER	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
score	TokenNameIdentifier	 score
<	TokenNameLESS	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// second criteria (if first criteria is equal): the popularity 	TokenNameCOMMENT_LINE	second criteria (if first criteria is equal): the popularity 
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
>	TokenNameGREATER	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
<	TokenNameLESS	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// third criteria: term text 	TokenNameCOMMENT_LINE	third criteria: term text 
return	TokenNamereturn	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
