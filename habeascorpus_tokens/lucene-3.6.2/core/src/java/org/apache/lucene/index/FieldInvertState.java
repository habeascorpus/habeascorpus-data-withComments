/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
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
AttributeSource	TokenNameIdentifier	 Attribute Source
;	TokenNameSEMICOLON	
/** * This class tracks the number and position / offset parameters of terms * being added to the index. The information collected in this class is * also used to calculate the normalization factor for a field. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 This class tracks the number and position / offset parameters of terms being added to the index. The information collected in this class is also used to calculate the normalization factor for a field. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FieldInvertState	TokenNameIdentifier	 Field Invert State
{	TokenNameLBRACE	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
numOverlap	TokenNameIdentifier	 num Overlap
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
maxTermFrequency	TokenNameIdentifier	 max Term Frequency
;	TokenNameSEMICOLON	
int	TokenNameint	
uniqueTermCount	TokenNameIdentifier	 unique Term Count
;	TokenNameSEMICOLON	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
AttributeSource	TokenNameIdentifier	 Attribute Source
attributeSource	TokenNameIdentifier	 attribute Source
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FieldInvertState	TokenNameIdentifier	 Field Invert State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
FieldInvertState	TokenNameIdentifier	 Field Invert State
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
int	TokenNameint	
numOverlap	TokenNameIdentifier	 num Overlap
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numOverlap	TokenNameIdentifier	 num Overlap
=	TokenNameEQUAL	
numOverlap	TokenNameIdentifier	 num Overlap
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Re-initialize the state, using this boost value. * @param docBoost boost value to use. */	TokenNameCOMMENT_JAVADOC	 Re-initialize the state, using this boost value. @param docBoost boost value to use. 
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
float	TokenNamefloat	
docBoost	TokenNameIdentifier	 doc Boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numOverlap	TokenNameIdentifier	 num Overlap
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
maxTermFrequency	TokenNameIdentifier	 max Term Frequency
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
uniqueTermCount	TokenNameIdentifier	 unique Term Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
docBoost	TokenNameIdentifier	 doc Boost
;	TokenNameSEMICOLON	
attributeSource	TokenNameIdentifier	 attribute Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the last processed term position. * @return the position */	TokenNameCOMMENT_JAVADOC	 Get the last processed term position. @return the position 
public	TokenNamepublic	
int	TokenNameint	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get total number of terms in this field. * @return the length */	TokenNameCOMMENT_JAVADOC	 Get total number of terms in this field. @return the length 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of terms with <code>positionIncrement == 0</code>. * @return the numOverlap */	TokenNameCOMMENT_JAVADOC	 Get the number of terms with <code>positionIncrement == 0</code>. @return the numOverlap 
public	TokenNamepublic	
int	TokenNameint	
getNumOverlap	TokenNameIdentifier	 get Num Overlap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numOverlap	TokenNameIdentifier	 num Overlap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNumOverlap	TokenNameIdentifier	 set Num Overlap
(	TokenNameLPAREN	
int	TokenNameint	
numOverlap	TokenNameIdentifier	 num Overlap
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numOverlap	TokenNameIdentifier	 num Overlap
=	TokenNameEQUAL	
numOverlap	TokenNameIdentifier	 num Overlap
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get end offset of the last processed term. * @return the offset */	TokenNameCOMMENT_JAVADOC	 Get end offset of the last processed term. @return the offset 
public	TokenNamepublic	
int	TokenNameint	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get boost value. This is the cumulative product of * document boost and field boost for all field instances * sharing the same field name. * @return the boost */	TokenNameCOMMENT_JAVADOC	 Get boost value. This is the cumulative product of document boost and field boost for all field instances sharing the same field name. @return the boost 
public	TokenNamepublic	
float	TokenNamefloat	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the maximum term-frequency encountered for any term in the field. A * field containing "the quick brown fox jumps over the lazy dog" would have * a value of 2, because "the" appears twice. */	TokenNameCOMMENT_JAVADOC	 Get the maximum term-frequency encountered for any term in the field. A field containing "the quick brown fox jumps over the lazy dog" would have a value of 2, because "the" appears twice. 
public	TokenNamepublic	
int	TokenNameint	
getMaxTermFrequency	TokenNameIdentifier	 get Max Term Frequency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxTermFrequency	TokenNameIdentifier	 max Term Frequency
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of unique terms encountered in this field. */	TokenNameCOMMENT_JAVADOC	 Return the number of unique terms encountered in this field. 
public	TokenNamepublic	
int	TokenNameint	
getUniqueTermCount	TokenNameIdentifier	 get Unique Term Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
uniqueTermCount	TokenNameIdentifier	 unique Term Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AttributeSource	TokenNameIdentifier	 Attribute Source
getAttributeSource	TokenNameIdentifier	 get Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attributeSource	TokenNameIdentifier	 attribute Source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
