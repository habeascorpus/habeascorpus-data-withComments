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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * The TermVectorOffsetInfo class holds information pertaining to a Term in a {@link org.apache.lucene.index.TermPositionVector}'s * offset information. This offset information is the character offset as set during the Analysis phase (and thus may not be the actual offset in the * original content). */	TokenNameCOMMENT_JAVADOC	 The TermVectorOffsetInfo class holds information pertaining to a Term in a {@link org.apache.lucene.index.TermPositionVector}'s offset information. This offset information is the character offset as set during the Analysis phase (and thus may not be the actual offset in the original content). 
public	TokenNamepublic	
class	TokenNameclass	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * Convenience declaration when creating a {@link org.apache.lucene.index.TermPositionVector} that stores only position information. */	TokenNameCOMMENT_JAVADOC	 Convenience declaration when creating a {@link org.apache.lucene.index.TermPositionVector} that stores only position information. 
public	TokenNamepublic	
transient	TokenNametransient	
static	TokenNamestatic	
final	TokenNamefinal	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_OFFSET_INFO	TokenNameIdentifier	 EMPTY  OFFSET  INFO
=	TokenNameEQUAL	
new	TokenNamenew	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
(	TokenNameLPAREN	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The accessor for the ending offset for the term * @return The offset */	TokenNameCOMMENT_JAVADOC	 The accessor for the ending offset for the term @return The offset 
public	TokenNamepublic	
int	TokenNameint	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEndOffset	TokenNameIdentifier	 set End Offset
(	TokenNameLPAREN	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The accessor for the starting offset of the term. * * @return The offset */	TokenNameCOMMENT_JAVADOC	 The accessor for the starting offset of the term. * @return The offset 
public	TokenNamepublic	
int	TokenNameint	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStartOffset	TokenNameIdentifier	 set Start Offset
(	TokenNameLPAREN	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Two TermVectorOffsetInfos are equals if both the start and end offsets are the same * @param o The comparison Object * @return true if both {@link #getStartOffset()} and {@link #getEndOffset()} are the same for both objects. */	TokenNameCOMMENT_JAVADOC	 Two TermVectorOffsetInfos are equals if both the start and end offsets are the same @param o The comparison Object @return true if both {@link #getStartOffset()} and {@link #getEndOffset()} are the same for both objects. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
termVectorOffsetInfo	TokenNameIdentifier	 term Vector Offset Info
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermVectorOffsetInfo	TokenNameIdentifier	 Term Vector Offset Info
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
!=	TokenNameNOT_EQUAL	
termVectorOffsetInfo	TokenNameIdentifier	 term Vector Offset Info
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
!=	TokenNameNOT_EQUAL	
termVectorOffsetInfo	TokenNameIdentifier	 term Vector Offset Info
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
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
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
29	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
