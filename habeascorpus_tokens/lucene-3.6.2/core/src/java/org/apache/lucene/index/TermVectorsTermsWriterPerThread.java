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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
TermVectorsTermsWriterPerThread	TokenNameIdentifier	 Term Vectors Terms Writer Per Thread
extends	TokenNameextends	
TermsHashConsumerPerThread	TokenNameIdentifier	 Terms Hash Consumer Per Thread
{	TokenNameLBRACE	
final	TokenNamefinal	
TermVectorsTermsWriter	TokenNameIdentifier	 Term Vectors Terms Writer
termsWriter	TokenNameIdentifier	 terms Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
TermVectorsTermsWriter	TokenNameIdentifier	 Term Vectors Terms Writer
.	TokenNameDOT	
PerDoc	TokenNameIdentifier	 Per Doc
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TermVectorsTermsWriterPerThread	TokenNameIdentifier	 Term Vectors Terms Writer Per Thread
(	TokenNameLPAREN	
TermsHashPerThread	TokenNameIdentifier	 Terms Hash Per Thread
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
,	TokenNameCOMMA	
TermVectorsTermsWriter	TokenNameIdentifier	 Term Vectors Terms Writer
termsWriter	TokenNameIdentifier	 terms Writer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
termsWriter	TokenNameIdentifier	 terms Writer
=	TokenNameEQUAL	
termsWriter	TokenNameIdentifier	 terms Writer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
=	TokenNameEQUAL	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Used by perField when serializing the term vectors 	TokenNameCOMMENT_LINE	Used by perField when serializing the term vectors 
final	TokenNamefinal	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
vectorSliceReader	TokenNameIdentifier	 vector Slice Reader
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
utf8Results	TokenNameIdentifier	 utf8 Results
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
clearLastVectorFieldName	TokenNameIdentifier	 clear Last Vector Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
,	TokenNameCOMMA	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermVectorsTermsWriterPerField	TokenNameIdentifier	 Term Vectors Terms Writer Per Field
(	TokenNameLPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Called only by assert 	TokenNameCOMMENT_LINE	Called only by assert 
final	TokenNamefinal	
boolean	TokenNameboolean	
clearLastVectorFieldName	TokenNameIdentifier	 clear Last Vector Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastVectorFieldName	TokenNameIdentifier	 last Vector Field Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Called only by assert 	TokenNameCOMMENT_LINE	Called only by assert 
String	TokenNameIdentifier	 String
lastVectorFieldName	TokenNameIdentifier	 last Vector Field Name
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
vectorFieldsInOrder	TokenNameIdentifier	 vector Fields In Order
(	TokenNameLPAREN	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastVectorFieldName	TokenNameIdentifier	 last Vector Field Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
lastVectorFieldName	TokenNameIdentifier	 last Vector Field Name
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
lastVectorFieldName	TokenNameIdentifier	 last Vector Field Name
=	TokenNameEQUAL	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
