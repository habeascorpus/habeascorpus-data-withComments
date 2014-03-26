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
final	TokenNamefinal	
class	TokenNameclass	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
extends	TokenNameextends	
InvertedDocConsumerPerThread	TokenNameIdentifier	 Inverted Doc Consumer Per Thread
{	TokenNameLBRACE	
final	TokenNamefinal	
TermsHash	TokenNameIdentifier	 Terms Hash
termsHash	TokenNameIdentifier	 terms Hash
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
nextPerThread	TokenNameIdentifier	 next Per Thread
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CharBlockPool	TokenNameIdentifier	 Char Block Pool
charPool	TokenNameIdentifier	 char Pool
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IntBlockPool	TokenNameIdentifier	 Int Block Pool
intPool	TokenNameIdentifier	 int Pool
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
bytePool	TokenNameIdentifier	 byte Pool
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
primary	TokenNameIdentifier	 primary
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
(	TokenNameLPAREN	
DocInverterPerThread	TokenNameIdentifier	 Doc Inverter Per Thread
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
,	TokenNameCOMMA	
final	TokenNamefinal	
TermsHash	TokenNameIdentifier	 Terms Hash
termsHash	TokenNameIdentifier	 terms Hash
,	TokenNameCOMMA	
final	TokenNamefinal	
TermsHash	TokenNameIdentifier	 Terms Hash
nextTermsHash	TokenNameIdentifier	 next Terms Hash
,	TokenNameCOMMA	
final	TokenNamefinal	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
primaryPerThread	TokenNameIdentifier	 primary Per Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termsHash	TokenNameIdentifier	 terms Hash
=	TokenNameEQUAL	
termsHash	TokenNameIdentifier	 terms Hash
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
termsHash	TokenNameIdentifier	 terms Hash
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We are primary 	TokenNameCOMMENT_LINE	We are primary 
charPool	TokenNameIdentifier	 char Pool
=	TokenNameEQUAL	
new	TokenNamenew	
CharBlockPool	TokenNameIdentifier	 Char Block Pool
(	TokenNameLPAREN	
termsHash	TokenNameIdentifier	 terms Hash
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
primary	TokenNameIdentifier	 primary
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
charPool	TokenNameIdentifier	 char Pool
=	TokenNameEQUAL	
primaryPerThread	TokenNameIdentifier	 primary Per Thread
.	TokenNameDOT	
charPool	TokenNameIdentifier	 char Pool
;	TokenNameSEMICOLON	
primary	TokenNameIdentifier	 primary
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
intPool	TokenNameIdentifier	 int Pool
=	TokenNameEQUAL	
new	TokenNamenew	
IntBlockPool	TokenNameIdentifier	 Int Block Pool
(	TokenNameLPAREN	
termsHash	TokenNameIdentifier	 terms Hash
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytePool	TokenNameIdentifier	 byte Pool
=	TokenNameEQUAL	
new	TokenNamenew	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
(	TokenNameLPAREN	
termsHash	TokenNameIdentifier	 terms Hash
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
byteBlockAllocator	TokenNameIdentifier	 byte Block Allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextPerThread	TokenNameIdentifier	 next Per Thread
=	TokenNameEQUAL	
nextTermsHash	TokenNameIdentifier	 next Terms Hash
.	TokenNameDOT	
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
docInverterPerThread	TokenNameIdentifier	 doc Inverter Per Thread
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
nextPerThread	TokenNameIdentifier	 next Per Thread
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
InvertedDocConsumerPerField	TokenNameIdentifier	 Inverted Doc Consumer Per Field
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
DocInverterPerField	TokenNameIdentifier	 Doc Inverter Per Field
docInverterPerField	TokenNameIdentifier	 doc Inverter Per Field
,	TokenNameCOMMA	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
(	TokenNameLPAREN	
docInverterPerField	TokenNameIdentifier	 doc Inverter Per Field
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
nextPerThread	TokenNameIdentifier	 next Per Thread
,	TokenNameCOMMA	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
synchronized	TokenNamesynchronized	
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
nextPerThread	TokenNameIdentifier	 next Per Thread
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextPerThread	TokenNameIdentifier	 next Per Thread
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
nextPerThread	TokenNameIdentifier	 next Per Thread
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextPerThread	TokenNameIdentifier	 next Per Thread
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
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
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
doc2	TokenNameIdentifier	 doc2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextPerThread	TokenNameIdentifier	 next Per Thread
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
nextPerThread	TokenNameIdentifier	 next Per Thread
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
doc2	TokenNameIdentifier	 doc2
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
doc2	TokenNameIdentifier	 doc2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Clear all state 	TokenNameCOMMENT_LINE	Clear all state 
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
boolean	TokenNameboolean	
recyclePostings	TokenNameIdentifier	 recycle Postings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intPool	TokenNameIdentifier	 int Pool
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytePool	TokenNameIdentifier	 byte Pool
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
primary	TokenNameIdentifier	 primary
)	TokenNameRPAREN	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
