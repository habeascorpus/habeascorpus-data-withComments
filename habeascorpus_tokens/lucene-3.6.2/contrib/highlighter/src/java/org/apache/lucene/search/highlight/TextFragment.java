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
/** * Low-level class used to record information about a section of a document * with a score. * * */	TokenNameCOMMENT_JAVADOC	 Low-level class used to record information about a section of a document with a score. * 
public	TokenNamepublic	
class	TokenNameclass	
TextFragment	TokenNameIdentifier	 Text Fragment
{	TokenNameLBRACE	
CharSequence	TokenNameIdentifier	 Char Sequence
markedUpText	TokenNameIdentifier	 marked Up Text
;	TokenNameSEMICOLON	
int	TokenNameint	
fragNum	TokenNameIdentifier	 frag Num
;	TokenNameSEMICOLON	
int	TokenNameint	
textStartPos	TokenNameIdentifier	 text Start Pos
;	TokenNameSEMICOLON	
int	TokenNameint	
textEndPos	TokenNameIdentifier	 text End Pos
;	TokenNameSEMICOLON	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TextFragment	TokenNameIdentifier	 Text Fragment
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
markedUpText	TokenNameIdentifier	 marked Up Text
,	TokenNameCOMMA	
int	TokenNameint	
textStartPos	TokenNameIdentifier	 text Start Pos
,	TokenNameCOMMA	
int	TokenNameint	
fragNum	TokenNameIdentifier	 frag Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
markedUpText	TokenNameIdentifier	 marked Up Text
=	TokenNameEQUAL	
markedUpText	TokenNameIdentifier	 marked Up Text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
textStartPos	TokenNameIdentifier	 text Start Pos
=	TokenNameEQUAL	
textStartPos	TokenNameIdentifier	 text Start Pos
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fragNum	TokenNameIdentifier	 frag Num
=	TokenNameEQUAL	
fragNum	TokenNameIdentifier	 frag Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @deprecated Use {@link #TextFragment(CharSequence, int, int)} instead. * This constructor will be removed in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link #TextFragment(CharSequence, int, int)} instead. This constructor will be removed in Lucene 4.0 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
TextFragment	TokenNameIdentifier	 Text Fragment
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
markedUpText	TokenNameIdentifier	 marked Up Text
,	TokenNameCOMMA	
int	TokenNameint	
textStartPos	TokenNameIdentifier	 text Start Pos
,	TokenNameCOMMA	
int	TokenNameint	
fragNum	TokenNameIdentifier	 frag Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
markedUpText	TokenNameIdentifier	 marked Up Text
=	TokenNameEQUAL	
markedUpText	TokenNameIdentifier	 marked Up Text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
textStartPos	TokenNameIdentifier	 text Start Pos
=	TokenNameEQUAL	
textStartPos	TokenNameIdentifier	 text Start Pos
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fragNum	TokenNameIdentifier	 frag Num
=	TokenNameEQUAL	
fragNum	TokenNameIdentifier	 frag Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setScore	TokenNameIdentifier	 set Score
(	TokenNameLPAREN	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param frag2 Fragment to be merged into this one */	TokenNameCOMMENT_JAVADOC	 @param frag2 Fragment to be merged into this one 
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
TextFragment	TokenNameIdentifier	 Text Fragment
frag2	TokenNameIdentifier	 frag2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textEndPos	TokenNameIdentifier	 text End Pos
=	TokenNameEQUAL	
frag2	TokenNameIdentifier	 frag2
.	TokenNameDOT	
textEndPos	TokenNameIdentifier	 text End Pos
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
frag2	TokenNameIdentifier	 frag2
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param fragment * @return true if this fragment follows the one passed */	TokenNameCOMMENT_JAVADOC	 @param fragment @return true if this fragment follows the one passed 
public	TokenNamepublic	
boolean	TokenNameboolean	
follows	TokenNameIdentifier	 follows
(	TokenNameLPAREN	
TextFragment	TokenNameIdentifier	 Text Fragment
fragment	TokenNameIdentifier	 fragment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textStartPos	TokenNameIdentifier	 text Start Pos
==	TokenNameEQUAL_EQUAL	
fragment	TokenNameIdentifier	 fragment
.	TokenNameDOT	
textEndPos	TokenNameIdentifier	 text End Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the fragment sequence number */	TokenNameCOMMENT_JAVADOC	 @return the fragment sequence number 
public	TokenNamepublic	
int	TokenNameint	
getFragNum	TokenNameIdentifier	 get Frag Num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fragNum	TokenNameIdentifier	 frag Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Returns the marked-up text for this text fragment */	TokenNameCOMMENT_BLOCK	 Returns the marked-up text for this text fragment 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
markedUpText	TokenNameIdentifier	 marked Up Text
.	TokenNameDOT	
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
textStartPos	TokenNameIdentifier	 text Start Pos
,	TokenNameCOMMA	
textEndPos	TokenNameIdentifier	 text End Pos
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
