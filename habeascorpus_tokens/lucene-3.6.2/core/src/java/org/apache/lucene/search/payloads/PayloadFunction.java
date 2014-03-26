package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
payloads	TokenNameIdentifier	 payloads
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Explanation	TokenNameIdentifier	 Explanation
;	TokenNameSEMICOLON	
/** * An abstract class that defines a way for Payload*Query instances to transform * the cumulative effects of payload scores for a document. * * @see org.apache.lucene.search.payloads.PayloadTermQuery for more information * * @lucene.experimental This class and its derivations are experimental and subject to * change * **/	TokenNameCOMMENT_JAVADOC	 An abstract class that defines a way for Payload*Query instances to transform the cumulative effects of payload scores for a document. * @see org.apache.lucene.search.payloads.PayloadTermQuery for more information * @lucene.experimental This class and its derivations are experimental and subject to change *
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PayloadFunction	TokenNameIdentifier	 Payload Function
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * Calculate the score up to this point for this doc and field * @param docId The current doc * @param field The field * @param start The start position of the matching Span * @param end The end position of the matching Span * @param numPayloadsSeen The number of payloads seen so far * @param currentScore The current score so far * @param currentPayloadScore The score for the current payload * @return The new current Score * * @see org.apache.lucene.search.spans.Spans */	TokenNameCOMMENT_JAVADOC	 Calculate the score up to this point for this doc and field @param docId The current doc @param field The field @param start The start position of the matching Span @param end The end position of the matching Span @param numPayloadsSeen The number of payloads seen so far @param currentScore The current score so far @param currentPayloadScore The score for the current payload @return The new current Score * @see org.apache.lucene.search.spans.Spans 
public	TokenNamepublic	
abstract	TokenNameabstract	
float	TokenNamefloat	
currentScore	TokenNameIdentifier	 current Score
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
numPayloadsSeen	TokenNameIdentifier	 num Payloads Seen
,	TokenNameCOMMA	
float	TokenNamefloat	
currentScore	TokenNameIdentifier	 current Score
,	TokenNameCOMMA	
float	TokenNamefloat	
currentPayloadScore	TokenNameIdentifier	 current Payload Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Calculate the final score for all the payloads seen so far for this doc/field * @param docId The current doc * @param field The current field * @param numPayloadsSeen The total number of payloads seen on this document * @param payloadScore The raw score for those payloads * @return The final score for the payloads */	TokenNameCOMMENT_JAVADOC	 Calculate the final score for all the payloads seen so far for this doc/field @param docId The current doc @param field The current field @param numPayloadsSeen The total number of payloads seen on this document @param payloadScore The raw score for those payloads @return The final score for the payloads 
public	TokenNamepublic	
abstract	TokenNameabstract	
float	TokenNamefloat	
docScore	TokenNameIdentifier	 doc Score
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
numPayloadsSeen	TokenNameIdentifier	 num Payloads Seen
,	TokenNameCOMMA	
float	TokenNamefloat	
payloadScore	TokenNameIdentifier	 payload Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
int	TokenNameint	
docId	TokenNameIdentifier	 doc Id
,	TokenNameCOMMA	
int	TokenNameint	
numPayloadsSeen	TokenNameIdentifier	 num Payloads Seen
,	TokenNameCOMMA	
float	TokenNamefloat	
payloadScore	TokenNameIdentifier	 payload Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"Unimpl Payload Function Explain"	TokenNameStringLiteral	Unimpl Payload Function Explain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
