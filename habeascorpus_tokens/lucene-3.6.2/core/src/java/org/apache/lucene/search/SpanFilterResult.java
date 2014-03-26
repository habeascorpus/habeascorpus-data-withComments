package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Copyright 2005 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2005 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * The results of a SpanQueryFilter. Wraps the BitSet and the position information from the SpanQuery * * @lucene.experimental * **/	TokenNameCOMMENT_JAVADOC	 The results of a SpanQueryFilter. Wraps the BitSet and the position information from the SpanQuery * @lucene.experimental *
public	TokenNamepublic	
class	TokenNameclass	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
{	TokenNameLBRACE	
private	TokenNameprivate	
DocIdSet	TokenNameIdentifier	 Doc Id Set
docIdSet	TokenNameIdentifier	 doc Id Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PositionInfo	TokenNameIdentifier	 Position Info
>	TokenNameGREATER	
positions	TokenNameIdentifier	 positions
;	TokenNameSEMICOLON	
//Spans spans; 	TokenNameCOMMENT_LINE	Spans spans; 
/** * * @param docIdSet The DocIdSet for the Filter * @param positions A List of {@link org.apache.lucene.search.SpanFilterResult.PositionInfo} objects */	TokenNameCOMMENT_JAVADOC	 * @param docIdSet The DocIdSet for the Filter @param positions A List of {@link org.apache.lucene.search.SpanFilterResult.PositionInfo} objects 
public	TokenNamepublic	
SpanFilterResult	TokenNameIdentifier	 Span Filter Result
(	TokenNameLPAREN	
DocIdSet	TokenNameIdentifier	 Doc Id Set
docIdSet	TokenNameIdentifier	 doc Id Set
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PositionInfo	TokenNameIdentifier	 Position Info
>	TokenNameGREATER	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docIdSet	TokenNameIdentifier	 doc Id Set
=	TokenNameEQUAL	
docIdSet	TokenNameIdentifier	 doc Id Set
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The first entry in the array corresponds to the first "on" bit. * Entries are increasing by document order * @return A List of PositionInfo objects */	TokenNameCOMMENT_JAVADOC	 The first entry in the array corresponds to the first "on" bit. Entries are increasing by document order @return A List of PositionInfo objects 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PositionInfo	TokenNameIdentifier	 Position Info
>	TokenNameGREATER	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
positions	TokenNameIdentifier	 positions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the docIdSet */	TokenNameCOMMENT_JAVADOC	 Returns the docIdSet 
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docIdSet	TokenNameIdentifier	 doc Id Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
PositionInfo	TokenNameIdentifier	 Position Info
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
StartEnd	TokenNameIdentifier	 Start End
>	TokenNameGREATER	
positions	TokenNameIdentifier	 positions
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PositionInfo	TokenNameIdentifier	 Position Info
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
StartEnd	TokenNameIdentifier	 Start End
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addPosition	TokenNameIdentifier	 add Position
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
StartEnd	TokenNameIdentifier	 Start End
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDoc	TokenNameIdentifier	 get Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return Positions */	TokenNameCOMMENT_JAVADOC	 * @return Positions 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
StartEnd	TokenNameIdentifier	 Start End
>	TokenNameGREATER	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
positions	TokenNameIdentifier	 positions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
StartEnd	TokenNameIdentifier	 Start End
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StartEnd	TokenNameIdentifier	 Start End
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return The end position of this match */	TokenNameCOMMENT_JAVADOC	 * @return The end position of this match 
public	TokenNamepublic	
int	TokenNameint	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The Start position * @return The start position of this match */	TokenNameCOMMENT_JAVADOC	 The Start position @return The start position of this match 
public	TokenNamepublic	
int	TokenNameint	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
