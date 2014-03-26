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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
AttributeImpl	TokenNameIdentifier	 Attribute Impl
;	TokenNameSEMICOLON	
/** * The start and end character offset of a Token. */	TokenNameCOMMENT_JAVADOC	 The start and end character offset of a Token. 
public	TokenNamepublic	
class	TokenNameclass	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
/** Returns this Token's starting offset, the position of the first character corresponding to this token in the source text. Note that the difference between endOffset() and startOffset() may not be equal to termText.length(), as the term text may have been altered by a stemmer or some other filter. */	TokenNameCOMMENT_JAVADOC	 Returns this Token's starting offset, the position of the first character corresponding to this token in the source text. Note that the difference between endOffset() and startOffset() may not be equal to termText.length(), as the term text may have been altered by a stemmer or some other filter. 
public	TokenNamepublic	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
// TODO: check that these are valid! IE, each should be 	TokenNameCOMMENT_LINE	TODO: check that these are valid! IE, each should be 
// >= 0, and endOffset should be >= startOffset. 	TokenNameCOMMENT_LINE	>= 0, and endOffset should be >= startOffset. 
// Problem is this could "break" existing 	TokenNameCOMMENT_LINE	Problem is this could "break" existing 
// tokenizers/filters. 	TokenNameCOMMENT_LINE	tokenizers/filters. 
this	TokenNamethis	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns this Token's ending offset, one greater than the position of the last character corresponding to this token in the source text. The length of the token in the source text is (endOffset - startOffset). */	TokenNameCOMMENT_JAVADOC	 Returns this Token's ending offset, one greater than the position of the last character corresponding to this token in the source text. The length of the token in the source text is (endOffset - startOffset). 
public	TokenNamepublic	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OffsetAttributeImpl	TokenNameIdentifier	 Offset Attribute Impl
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
==	TokenNameEQUAL_EQUAL	
startOffset	TokenNameIdentifier	 start Offset
&&	TokenNameAND_AND	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
==	TokenNameEQUAL_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
