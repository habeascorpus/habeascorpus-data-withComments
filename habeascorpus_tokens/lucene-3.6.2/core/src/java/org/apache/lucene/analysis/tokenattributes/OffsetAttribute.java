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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
/** * The start and end character offset of a Token. */	TokenNameCOMMENT_JAVADOC	 The start and end character offset of a Token. 
public	TokenNamepublic	
interface	TokenNameinterface	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** Returns this Token's starting offset, the position of the first character corresponding to this token in the source text. Note that the difference between endOffset() and startOffset() may not be equal to termText.length(), as the term text may have been altered by a stemmer or some other filter. */	TokenNameCOMMENT_JAVADOC	 Returns this Token's starting offset, the position of the first character corresponding to this token in the source text. Note that the difference between endOffset() and startOffset() may not be equal to termText.length(), as the term text may have been altered by a stemmer or some other filter. 
public	TokenNamepublic	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the starting and ending offset. @see #startOffset() and #endOffset()*/	TokenNameCOMMENT_JAVADOC	 Set the starting and ending offset. @see #startOffset() and #endOffset()
public	TokenNamepublic	
void	TokenNamevoid	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns this Token's ending offset, one greater than the position of the last character corresponding to this token in the source text. The length of the token in the source text is (endOffset - startOffset). */	TokenNameCOMMENT_JAVADOC	 Returns this Token's ending offset, one greater than the position of the last character corresponding to this token in the source text. The length of the token in the source text is (endOffset - startOffset). 
public	TokenNamepublic	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
