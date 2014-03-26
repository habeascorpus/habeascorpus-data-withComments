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
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
;	TokenNameSEMICOLON	
/** This is a DocFieldConsumer that inverts each field, * separately, from a Document, and accepts a * InvertedTermsConsumer to process those terms. */	TokenNameCOMMENT_JAVADOC	 This is a DocFieldConsumer that inverts each field, separately, from a Document, and accepts a InvertedTermsConsumer to process those terms. 
final	TokenNamefinal	
class	TokenNameclass	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
extends	TokenNameextends	
DocFieldConsumerPerThread	TokenNameIdentifier	 Doc Field Consumer Per Thread
{	TokenNameLBRACE	
final	TokenNamefinal	
DocInverter	TokenNameIdentifier	 Doc Inverter
docInverter	TokenNameIdentifier	 doc Inverter
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InvertedDocConsumerPerThread	TokenNameIdentifier	 Inverted Doc Consumer Per Thread
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InvertedDocEndConsumerPerThread	TokenNameIdentifier	 Inverted Doc End Consumer Per Thread
endConsumer	TokenNameIdentifier	 end Consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SingleTokenAttributeSource	TokenNameIdentifier	 Single Token Attribute Source
singleToken	TokenNameIdentifier	 single Token
=	TokenNameEQUAL	
new	TokenNamenew	
SingleTokenAttributeSource	TokenNameIdentifier	 Single Token Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
class	TokenNameclass	
SingleTokenAttributeSource	TokenNameIdentifier	 Single Token Attribute Source
extends	TokenNameextends	
AttributeSource	TokenNameIdentifier	 Attribute Source
{	TokenNameLBRACE	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAttribute	TokenNameIdentifier	 term Attribute
;	TokenNameSEMICOLON	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAttribute	TokenNameIdentifier	 offset Attribute
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SingleTokenAttributeSource	TokenNameIdentifier	 Single Token Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAttribute	TokenNameIdentifier	 term Attribute
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAttribute	TokenNameIdentifier	 offset Attribute
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reinit	TokenNameIdentifier	 reinit
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
stringValue	TokenNameIdentifier	 string Value
,	TokenNameCOMMA	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termAttribute	TokenNameIdentifier	 term Attribute
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
stringValue	TokenNameIdentifier	 string Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAttribute	TokenNameIdentifier	 offset Attribute
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
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInvertState	TokenNameIdentifier	 Field Invert State
fieldState	TokenNameIdentifier	 field State
=	TokenNameEQUAL	
new	TokenNamenew	
FieldInvertState	TokenNameIdentifier	 Field Invert State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Used to read a string value for a field 	TokenNameCOMMENT_LINE	Used to read a string value for a field 
final	TokenNamefinal	
ReusableStringReader	TokenNameIdentifier	 Reusable String Reader
stringReader	TokenNameIdentifier	 string Reader
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableStringReader	TokenNameIdentifier	 Reusable String Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
(	TokenNameLPAREN	
DocFieldProcessorPerThread	TokenNameIdentifier	 Doc Field Processor Per Thread
docFieldProcessorPerThread	TokenNameIdentifier	 doc Field Processor Per Thread
,	TokenNameCOMMA	
DocInverter	TokenNameIdentifier	 Doc Inverter
docInverter	TokenNameIdentifier	 doc Inverter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docInverter	TokenNameIdentifier	 doc Inverter
=	TokenNameEQUAL	
docInverter	TokenNameIdentifier	 doc Inverter
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
docFieldProcessorPerThread	TokenNameIdentifier	 doc Field Processor Per Thread
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
docInverter	TokenNameIdentifier	 doc Inverter
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endConsumer	TokenNameIdentifier	 end Consumer
=	TokenNameEQUAL	
docInverter	TokenNameIdentifier	 doc Inverter
.	TokenNameDOT	
endConsumer	TokenNameIdentifier	 end Consumer
.	TokenNameDOT	
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endConsumer	TokenNameIdentifier	 end Consumer
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// TODO: allow endConsumer.finishDocument to also return 	TokenNameCOMMENT_LINE	TODO: allow endConsumer.finishDocument to also return 
// a DocWriter 	TokenNameCOMMENT_LINE	a DocWriter 
endConsumer	TokenNameIdentifier	 end Consumer
.	TokenNameDOT	
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
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
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DocInverterPerField	TokenNameIdentifier	 Doc Inverter Per Field
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
