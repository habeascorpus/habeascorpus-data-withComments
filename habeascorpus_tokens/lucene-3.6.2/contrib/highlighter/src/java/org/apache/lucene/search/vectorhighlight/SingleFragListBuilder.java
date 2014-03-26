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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
vectorhighlight	TokenNameIdentifier	 vectorhighlight
.	TokenNameDOT	
FieldFragList	TokenNameIdentifier	 Field Frag List
.	TokenNameDOT	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
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
vectorhighlight	TokenNameIdentifier	 vectorhighlight
.	TokenNameDOT	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
.	TokenNameDOT	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
;	TokenNameSEMICOLON	
/** * An implementation class of {@link FragListBuilder} that generates one {@link WeightedFragInfo} object. * Typical use case of this class is that you can get an entire field contents * by using both of this class and {@link SimpleFragmentsBuilder}.<br/> * <pre> * FastVectorHighlighter h = new FastVectorHighlighter( true, true, * new SingleFragListBuilder(), new SimpleFragmentsBuilder() ); * </pre> */	TokenNameCOMMENT_JAVADOC	 An implementation class of {@link FragListBuilder} that generates one {@link WeightedFragInfo} object. Typical use case of this class is that you can get an entire field contents by using both of this class and {@link SimpleFragmentsBuilder}.<br/> <pre> FastVectorHighlighter h = new FastVectorHighlighter( true, true, new SingleFragListBuilder(), new SimpleFragmentsBuilder() ); </pre> 
public	TokenNamepublic	
class	TokenNameclass	
SingleFragListBuilder	TokenNameIdentifier	 Single Frag List Builder
implements	TokenNameimplements	
FragListBuilder	TokenNameIdentifier	 Frag List Builder
{	TokenNameLBRACE	
public	TokenNamepublic	
FieldFragList	TokenNameIdentifier	 Field Frag List
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fieldPhraseList	TokenNameIdentifier	 field Phrase List
,	TokenNameCOMMA	
int	TokenNameint	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldFragList	TokenNameIdentifier	 Field Frag List
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldFragList	TokenNameIdentifier	 Field Frag List
(	TokenNameLPAREN	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
wpil	TokenNameIdentifier	 wpil
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
ite	TokenNameIdentifier	 ite
=	TokenNameEQUAL	
fieldPhraseList	TokenNameIdentifier	 field Phrase List
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
phraseInfo	TokenNameIdentifier	 phrase Info
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ite	TokenNameIdentifier	 ite
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
phraseInfo	TokenNameIdentifier	 phrase Info
=	TokenNameEQUAL	
ite	TokenNameIdentifier	 ite
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
wpil	TokenNameIdentifier	 wpil
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wpil	TokenNameIdentifier	 wpil
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
wpil	TokenNameIdentifier	 wpil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ffl	TokenNameIdentifier	 ffl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
