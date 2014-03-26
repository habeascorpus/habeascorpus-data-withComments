package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Fieldable	TokenNameIdentifier	 Fieldable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
;	TokenNameSEMICOLON	
/** * Holds state for inverting all occurrences of a single * field in the document. This class doesn't do anything * itself; instead, it forwards the tokens produced by * analysis to its own consumer * (InvertedDocConsumerPerField). It also interacts with an * endConsumer (InvertedDocEndConsumerPerField). */	TokenNameCOMMENT_JAVADOC	 Holds state for inverting all occurrences of a single field in the document. This class doesn't do anything itself; instead, it forwards the tokens produced by analysis to its own consumer (InvertedDocConsumerPerField). It also interacts with an endConsumer (InvertedDocEndConsumerPerField). 
final	TokenNamefinal	
class	TokenNameclass	
DocInverterPerField	TokenNameIdentifier	 Doc Inverter Per Field
extends	TokenNameextends	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
{	TokenNameLBRACE	
final	TokenNamefinal	
private	TokenNameprivate	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
final	TokenNamefinal	
private	TokenNameprivate	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InvertedDocEndConsumerPerField	TokenNameIdentifier	 Inverted Doc End Consumer Per Field
endConsumer	TokenNameIdentifier	 end Consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInvertState	TokenNameIdentifier	 Field Invert State
fieldState	TokenNameIdentifier	 field State
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocInverterPerField	TokenNameIdentifier	 Doc Inverter Per Field
(	TokenNameLPAREN	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
perThread	TokenNameIdentifier	 per Thread
,	TokenNameCOMMA	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
fieldState	TokenNameIdentifier	 field State
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endConsumer	TokenNameIdentifier	 end Consumer
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
endConsumer	TokenNameIdentifier	 end Consumer
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
endConsumer	TokenNameIdentifier	 end Consumer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
processFields	TokenNameIdentifier	 process Fields
(	TokenNameLPAREN	
final	TokenNamefinal	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
maxFieldLength	TokenNameIdentifier	 max Field Length
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
maxFieldLength	TokenNameIdentifier	 max Field Length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
doInvert	TokenNameIdentifier	 do Invert
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// TODO FI: this should be "genericized" to querying 	TokenNameCOMMENT_LINE	TODO FI: this should be "genericized" to querying 
// consumer if it wants to see this particular field 	TokenNameCOMMENT_LINE	consumer if it wants to see this particular field 
// tokenized. 	TokenNameCOMMENT_LINE	tokenized. 
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
doInvert	TokenNameIdentifier	 do Invert
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if the field omits norms, the boost cannot be indexed. 	TokenNameCOMMENT_LINE	if the field omits norms, the boost cannot be indexed. 
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getOmitNorms	TokenNameIdentifier	 get Omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
boost	TokenNameIdentifier	 boost
!=	TokenNameNOT_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"You cannot set an index-time boost: norms are omitted for field '"	TokenNameStringLiteral	You cannot set an index-time boost: norms are omitted for field '
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
getPositionIncrementGap	TokenNameIdentifier	 get Position Increment Gap
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isTokenized	TokenNameIdentifier	 is Tokenized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// un-tokenized field 	TokenNameCOMMENT_LINE	un-tokenized field 
String	TokenNameIdentifier	 String
stringValue	TokenNameIdentifier	 string Value
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
valueLength	TokenNameIdentifier	 value Length
=	TokenNameEQUAL	
stringValue	TokenNameIdentifier	 string Value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
singleToken	TokenNameIdentifier	 single Token
.	TokenNameDOT	
reinit	TokenNameIdentifier	 reinit
(	TokenNameLPAREN	
stringValue	TokenNameIdentifier	 string Value
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
valueLength	TokenNameIdentifier	 value Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
attributeSource	TokenNameIdentifier	 attribute Source
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
singleToken	TokenNameIdentifier	 single Token
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
setAborting	TokenNameIdentifier	 set Aborting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
valueLength	TokenNameIdentifier	 value Length
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// tokenized field 	TokenNameCOMMENT_LINE	tokenized field 
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
streamValue	TokenNameIdentifier	 stream Value
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
tokenStreamValue	TokenNameIdentifier	 token Stream Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
streamValue	TokenNameIdentifier	 stream Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
streamValue	TokenNameIdentifier	 stream Value
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// the field does not have a TokenStream, 	TokenNameCOMMENT_LINE	the field does not have a TokenStream, 
// so we have to obtain one from the analyzer 	TokenNameCOMMENT_LINE	so we have to obtain one from the analyzer 
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
// find or make Reader 	TokenNameCOMMENT_LINE	find or make Reader 
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
readerValue	TokenNameIdentifier	 reader Value
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
readerValue	TokenNameIdentifier	 reader Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
readerValue	TokenNameIdentifier	 reader Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
readerValue	TokenNameIdentifier	 reader Value
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
stringValue	TokenNameIdentifier	 string Value
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stringValue	TokenNameIdentifier	 string Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"field must have either TokenStream, String or Reader value"	TokenNameStringLiteral	field must have either TokenStream, String or Reader value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
stringReader	TokenNameIdentifier	 string Reader
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
stringValue	TokenNameIdentifier	 string Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
stringReader	TokenNameIdentifier	 string Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Tokenize field and add to postingTable 	TokenNameCOMMENT_LINE	Tokenize field and add to postingTable 
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
reusableTokenStream	TokenNameIdentifier	 reusable Token Stream
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset the TokenStream to the first token 	TokenNameCOMMENT_LINE	reset the TokenStream to the first token 
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
startLength	TokenNameIdentifier	 start Length
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
attributeSource	TokenNameIdentifier	 attribute Source
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAttribute	TokenNameIdentifier	 offset Attribute
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
attributeSource	TokenNameIdentifier	 attribute Source
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAttribute	TokenNameIdentifier	 pos Incr Attribute
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
attributeSource	TokenNameIdentifier	 attribute Source
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we hit an exception in stream.next below 	TokenNameCOMMENT_LINE	If we hit an exception in stream.next below 
// (which is fairly common, eg if analyzer 	TokenNameCOMMENT_LINE	(which is fairly common, eg if analyzer 
// chokes on a given document), then it's 	TokenNameCOMMENT_LINE	chokes on a given document), then it's 
// non-aborting and (above) this one document 	TokenNameCOMMENT_LINE	non-aborting and (above) this one document 
// will be marked as deleted, but still 	TokenNameCOMMENT_LINE	will be marked as deleted, but still 
// consume a docID 	TokenNameCOMMENT_LINE	consume a docID 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
posIncr	TokenNameIdentifier	 pos Incr
=	TokenNameEQUAL	
posIncrAttribute	TokenNameIdentifier	 pos Incr Attribute
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
posIncr	TokenNameIdentifier	 pos Incr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"position overflow for field '"	TokenNameStringLiteral	position overflow for field '
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// position is legal, we can safely place it in fieldState now. 	TokenNameCOMMENT_LINE	position is legal, we can safely place it in fieldState now. 
// not sure if anything will use fieldState after non-aborting exc... 	TokenNameCOMMENT_LINE	not sure if anything will use fieldState after non-aborting exc... 
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posIncr	TokenNameIdentifier	 pos Incr
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
numOverlap	TokenNameIdentifier	 num Overlap
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// If we hit an exception in here, we abort 	TokenNameCOMMENT_LINE	If we hit an exception in here, we abort 
// all buffered documents since the last 	TokenNameCOMMENT_LINE	all buffered documents since the last 
// flush, on the likelihood that the 	TokenNameCOMMENT_LINE	flush, on the likelihood that the 
// internal state of the consumer is now 	TokenNameCOMMENT_LINE	internal state of the consumer is now 
// corrupt and should not be flushed to a 	TokenNameCOMMENT_LINE	corrupt and should not be flushed to a 
// new segment: 	TokenNameCOMMENT_LINE	new segment: 
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
setAborting	TokenNameIdentifier	 set Aborting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
maxFieldLength	TokenNameIdentifier	 max Field Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"maxFieldLength "	TokenNameStringLiteral	maxFieldLength 
+	TokenNamePLUS	
maxFieldLength	TokenNameIdentifier	 max Field Length
+	TokenNamePLUS	
" reached for field "	TokenNameStringLiteral	 reached for field 
+	TokenNamePLUS	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
", ignoring following tokens"	TokenNameStringLiteral	, ignoring following tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
=	TokenNameEQUAL	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// trigger streams to perform end-of-stream operations 	TokenNameCOMMENT_LINE	trigger streams to perform end-of-stream operations 
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
offsetAttribute	TokenNameIdentifier	 offset Attribute
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+=	TokenNamePLUS_EQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
getOffsetGap	TokenNameIdentifier	 get Offset Gap
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
*=	TokenNameMULTIPLY_EQUAL	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-2387: don't hang onto the field, so GC can 	TokenNameCOMMENT_LINE	LUCENE-2387: don't hang onto the field, so GC can 
// reclaim 	TokenNameCOMMENT_LINE	reclaim 
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endConsumer	TokenNameIdentifier	 end Consumer
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
