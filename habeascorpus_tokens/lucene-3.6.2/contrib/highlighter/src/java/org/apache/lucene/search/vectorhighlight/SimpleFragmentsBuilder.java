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
/** * A simple implementation of FragmentsBuilder. * */	TokenNameCOMMENT_JAVADOC	 A simple implementation of FragmentsBuilder. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleFragmentsBuilder	TokenNameIdentifier	 Simple Fragments Builder
extends	TokenNameextends	
BaseFragmentsBuilder	TokenNameIdentifier	 Base Fragments Builder
{	TokenNameLBRACE	
/** * a constructor. */	TokenNameCOMMENT_JAVADOC	 a constructor. 
public	TokenNamepublic	
SimpleFragmentsBuilder	TokenNameIdentifier	 Simple Fragments Builder
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
SimpleFragmentsBuilder	TokenNameIdentifier	 Simple Fragments Builder
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
SimpleFragmentsBuilder	TokenNameIdentifier	 Simple Fragments Builder
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
SimpleFragmentsBuilder	TokenNameIdentifier	 Simple Fragments Builder
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
/** * do nothing. return the source list. */	TokenNameCOMMENT_JAVADOC	 do nothing. return the source list. 
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
return	TokenNamereturn	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
