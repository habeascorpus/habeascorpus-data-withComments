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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
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
/** * An implementation of FragmentsBuilder that outputs score-order fragments. */	TokenNameCOMMENT_JAVADOC	 An implementation of FragmentsBuilder that outputs score-order fragments. 
public	TokenNamepublic	
class	TokenNameclass	
ScoreOrderFragmentsBuilder	TokenNameIdentifier	 Score Order Fragments Builder
extends	TokenNameextends	
BaseFragmentsBuilder	TokenNameIdentifier	 Base Fragments Builder
{	TokenNameLBRACE	
/** * a constructor. */	TokenNameCOMMENT_JAVADOC	 a constructor. 
public	TokenNamepublic	
ScoreOrderFragmentsBuilder	TokenNameIdentifier	 Score Order Fragments Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * a constructor. * * @param preTags array of pre-tags for markup terms. * @param postTags array of post-tags for markup terms. */	TokenNameCOMMENT_JAVADOC	 a constructor. * @param preTags array of pre-tags for markup terms. @param postTags array of post-tags for markup terms. 
public	TokenNamepublic	
ScoreOrderFragmentsBuilder	TokenNameIdentifier	 Score Order Fragments Builder
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
preTags	TokenNameIdentifier	 pre Tags
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
postTags	TokenNameIdentifier	 post Tags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
preTags	TokenNameIdentifier	 pre Tags
,	TokenNameCOMMA	
postTags	TokenNameIdentifier	 post Tags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ScoreOrderFragmentsBuilder	TokenNameIdentifier	 Score Order Fragments Builder
(	TokenNameLPAREN	
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ScoreOrderFragmentsBuilder	TokenNameIdentifier	 Score Order Fragments Builder
(	TokenNameLPAREN	
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
BoundaryScanner	TokenNameIdentifier	 Boundary Scanner
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
preTags	TokenNameIdentifier	 pre Tags
,	TokenNameCOMMA	
postTags	TokenNameIdentifier	 post Tags
,	TokenNameCOMMA	
bs	TokenNameIdentifier	 bs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sort by score the list of WeightedFragInfo */	TokenNameCOMMENT_JAVADOC	 Sort by score the list of WeightedFragInfo 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
>	TokenNameGREATER	
getWeightedFragInfoList	TokenNameIdentifier	 get Weighted Frag Info List
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
>	TokenNameGREATER	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
new	TokenNamenew	
ScoreComparator	TokenNameIdentifier	 Score Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ScoreComparator	TokenNameIdentifier	 Score Comparator
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
totalBoost	TokenNameIdentifier	 total Boost
>	TokenNameGREATER	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
totalBoost	TokenNameIdentifier	 total Boost
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
totalBoost	TokenNameIdentifier	 total Boost
<	TokenNameLESS	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
totalBoost	TokenNameIdentifier	 total Boost
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// if same score then check startOffset 	TokenNameCOMMENT_LINE	if same score then check startOffset 
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
<	TokenNameLESS	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
>	TokenNameGREATER	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
