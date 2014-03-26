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
/** * Lightweight class to hold term, weight, and positions used for scoring this * term. */	TokenNameCOMMENT_JAVADOC	 Lightweight class to hold term, weight, and positions used for scoring this term. 
public	TokenNamepublic	
class	TokenNameclass	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
extends	TokenNameextends	
WeightedTerm	TokenNameIdentifier	 Weighted Term
{	TokenNameLBRACE	
boolean	TokenNameboolean	
positionSensitive	TokenNameIdentifier	 position Sensitive
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PositionSpan	TokenNameIdentifier	 Position Span
>	TokenNameGREATER	
positionSpans	TokenNameIdentifier	 position Spans
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PositionSpan	TokenNameIdentifier	 Position Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @param weight * @param term */	TokenNameCOMMENT_JAVADOC	 @param weight @param term 
public	TokenNamepublic	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
(	TokenNameLPAREN	
float	TokenNamefloat	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
positionSpans	TokenNameIdentifier	 position Spans
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PositionSpan	TokenNameIdentifier	 Position Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param weight * @param term * @param positionSensitive */	TokenNameCOMMENT_JAVADOC	 @param weight @param term @param positionSensitive 
public	TokenNamepublic	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
(	TokenNameLPAREN	
float	TokenNamefloat	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
boolean	TokenNameboolean	
positionSensitive	TokenNameIdentifier	 position Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
positionSensitive	TokenNameIdentifier	 position Sensitive
=	TokenNameEQUAL	
positionSensitive	TokenNameIdentifier	 position Sensitive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks to see if this term is valid at <code>position</code>. * * @param position * to check against valid term positions * @return true iff this term is a hit at this position */	TokenNameCOMMENT_JAVADOC	 Checks to see if this term is valid at <code>position</code>. * @param position to check against valid term positions @return true iff this term is a hit at this position 
public	TokenNamepublic	
boolean	TokenNameboolean	
checkPosition	TokenNameIdentifier	 check Position
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// There would probably be a slight speed improvement if PositionSpans 	TokenNameCOMMENT_LINE	There would probably be a slight speed improvement if PositionSpans 
// where kept in some sort of priority queue - that way this method 	TokenNameCOMMENT_LINE	where kept in some sort of priority queue - that way this method 
// could 	TokenNameCOMMENT_LINE	could 
// bail early without checking each PositionSpan. 	TokenNameCOMMENT_LINE	bail early without checking each PositionSpan. 
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
PositionSpan	TokenNameIdentifier	 Position Span
>	TokenNameGREATER	
positionSpanIt	TokenNameIdentifier	 position Span It
=	TokenNameEQUAL	
positionSpans	TokenNameIdentifier	 position Spans
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
positionSpanIt	TokenNameIdentifier	 position Span It
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PositionSpan	TokenNameIdentifier	 Position Span
posSpan	TokenNameIdentifier	 pos Span
=	TokenNameEQUAL	
positionSpanIt	TokenNameIdentifier	 position Span It
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>=	TokenNameGREATER_EQUAL	
posSpan	TokenNameIdentifier	 pos Span
.	TokenNameDOT	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
<=	TokenNameLESS_EQUAL	
posSpan	TokenNameIdentifier	 pos Span
.	TokenNameDOT	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addPositionSpans	TokenNameIdentifier	 add Position Spans
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PositionSpan	TokenNameIdentifier	 Position Span
>	TokenNameGREATER	
positionSpans	TokenNameIdentifier	 position Spans
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
positionSpans	TokenNameIdentifier	 position Spans
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
positionSpans	TokenNameIdentifier	 position Spans
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPositionSensitive	TokenNameIdentifier	 is Position Sensitive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
positionSensitive	TokenNameIdentifier	 position Sensitive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPositionSensitive	TokenNameIdentifier	 set Position Sensitive
(	TokenNameLPAREN	
boolean	TokenNameboolean	
positionSensitive	TokenNameIdentifier	 position Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
positionSensitive	TokenNameIdentifier	 position Sensitive
=	TokenNameEQUAL	
positionSensitive	TokenNameIdentifier	 position Sensitive
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PositionSpan	TokenNameIdentifier	 Position Span
>	TokenNameGREATER	
getPositionSpans	TokenNameIdentifier	 get Position Spans
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
positionSpans	TokenNameIdentifier	 position Spans
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
