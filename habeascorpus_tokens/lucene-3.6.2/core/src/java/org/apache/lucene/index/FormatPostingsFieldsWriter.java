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
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
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
IOUtils	TokenNameIdentifier	 IO Utils
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
FormatPostingsFieldsWriter	TokenNameIdentifier	 Format Postings Fields Writer
extends	TokenNameextends	
FormatPostingsFieldsConsumer	TokenNameIdentifier	 Format Postings Fields Consumer
{	TokenNameLBRACE	
final	TokenNamefinal	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
termsOut	TokenNameIdentifier	 terms Out
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
FormatPostingsTermsWriter	TokenNameIdentifier	 Format Postings Terms Writer
termsWriter	TokenNameIdentifier	 terms Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DefaultSkipListWriter	TokenNameIdentifier	 Default Skip List Writer
skipListWriter	TokenNameIdentifier	 skip List Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
totalNumDocs	TokenNameIdentifier	 total Num Docs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FormatPostingsFieldsWriter	TokenNameIdentifier	 Format Postings Fields Writer
(	TokenNameLPAREN	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
segmentName	TokenNameIdentifier	 segment Name
;	TokenNameSEMICOLON	
totalNumDocs	TokenNameIdentifier	 total Num Docs
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
termsOut	TokenNameIdentifier	 terms Out
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
,	TokenNameCOMMA	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
termIndexInterval	TokenNameIdentifier	 term Index Interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: this is a nasty abstraction violation (that we 	TokenNameCOMMENT_LINE	TODO: this is a nasty abstraction violation (that we 
// peek down to find freqOut/proxOut) -- we need a 	TokenNameCOMMENT_LINE	peek down to find freqOut/proxOut) -- we need a 
// better abstraction here whereby these child consumers 	TokenNameCOMMENT_LINE	better abstraction here whereby these child consumers 
// can provide skip data or not 	TokenNameCOMMENT_LINE	can provide skip data or not 
skipListWriter	TokenNameIdentifier	 skip List Writer
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultSkipListWriter	TokenNameIdentifier	 Default Skip List Writer
(	TokenNameLPAREN	
termsOut	TokenNameIdentifier	 terms Out
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
,	TokenNameCOMMA	
termsOut	TokenNameIdentifier	 terms Out
.	TokenNameDOT	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
,	TokenNameCOMMA	
totalNumDocs	TokenNameIdentifier	 total Num Docs
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsWriter	TokenNameIdentifier	 terms Writer
=	TokenNameEQUAL	
new	TokenNamenew	
FormatPostingsTermsWriter	TokenNameIdentifier	 Format Postings Terms Writer
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
,	TokenNameCOMMA	
this	TokenNamethis	
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
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
termsOut	TokenNameIdentifier	 terms Out
,	TokenNameCOMMA	
termsWriter	TokenNameIdentifier	 terms Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Add a new field */	TokenNameCOMMENT_JAVADOC	 Add a new field 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
FormatPostingsTermsConsumer	TokenNameIdentifier	 Format Postings Terms Consumer
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsWriter	TokenNameIdentifier	 terms Writer
.	TokenNameDOT	
setField	TokenNameIdentifier	 set Field
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termsWriter	TokenNameIdentifier	 terms Writer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Called when we are done adding everything. */	TokenNameCOMMENT_JAVADOC	 Called when we are done adding everything. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
termsOut	TokenNameIdentifier	 terms Out
,	TokenNameCOMMA	
termsWriter	TokenNameIdentifier	 terms Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
