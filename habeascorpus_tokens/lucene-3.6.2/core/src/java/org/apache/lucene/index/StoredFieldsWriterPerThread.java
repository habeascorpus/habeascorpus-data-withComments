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
IndexOutput	TokenNameIdentifier	 Index Output
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
final	TokenNamefinal	
class	TokenNameclass	
StoredFieldsWriterPerThread	TokenNameIdentifier	 Stored Fields Writer Per Thread
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldsWriter	TokenNameIdentifier	 Fields Writer
localFieldsWriter	TokenNameIdentifier	 local Fields Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StoredFieldsWriter	TokenNameIdentifier	 Stored Fields Writer
storedFieldsWriter	TokenNameIdentifier	 stored Fields Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
StoredFieldsWriter	TokenNameIdentifier	 Stored Fields Writer
.	TokenNameDOT	
PerDoc	TokenNameIdentifier	 Per Doc
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StoredFieldsWriterPerThread	TokenNameIdentifier	 Stored Fields Writer Per Thread
(	TokenNameLPAREN	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
,	TokenNameCOMMA	
StoredFieldsWriter	TokenNameIdentifier	 Stored Fields Writer
storedFieldsWriter	TokenNameIdentifier	 stored Fields Writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
storedFieldsWriter	TokenNameIdentifier	 stored Fields Writer
=	TokenNameEQUAL	
storedFieldsWriter	TokenNameIdentifier	 stored Fields Writer
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
localFieldsWriter	TokenNameIdentifier	 local Fields Writer
=	TokenNameEQUAL	
new	TokenNamenew	
FieldsWriter	TokenNameIdentifier	 Fields Writer
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
IndexOutput	TokenNameIdentifier	 Index Output
)	TokenNameRPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
storedFieldsWriter	TokenNameIdentifier	 stored Fields Writer
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
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
// Only happens if previous document hit non-aborting 	TokenNameCOMMENT_LINE	Only happens if previous document hit non-aborting 
// exception while writing stored fields into 	TokenNameCOMMENT_LINE	exception while writing stored fields into 
// localFieldsWriter: 	TokenNameCOMMENT_LINE	localFieldsWriter: 
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
public	TokenNamepublic	
void	TokenNamevoid	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
storedFieldsWriter	TokenNameIdentifier	 stored Fields Writer
.	TokenNameDOT	
getPerDoc	TokenNameIdentifier	 get Per Doc
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
localFieldsWriter	TokenNameIdentifier	 local Fields Writer
.	TokenNameDOT	
setFieldsStream	TokenNameIdentifier	 set Fields Stream
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fdt	TokenNameIdentifier	 fdt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
numStoredFields	TokenNameIdentifier	 num Stored Fields
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"doc.numStoredFields="	TokenNameStringLiteral	doc.numStoredFields=
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
numStoredFields	TokenNameIdentifier	 num Stored Fields
;	TokenNameSEMICOLON	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fdt	TokenNameIdentifier	 fdt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
fdt	TokenNameIdentifier	 fdt
.	TokenNameDOT	
getFilePointer	TokenNameIdentifier	 get File Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
localFieldsWriter	TokenNameIdentifier	 local Fields Writer
.	TokenNameDOT	
writeField	TokenNameIdentifier	 write Field
(	TokenNameLPAREN	
fieldInfo	TokenNameIdentifier	 field Info
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
testPoint	TokenNameIdentifier	 test Point
(	TokenNameLPAREN	
"StoredFieldsWriterPerThread.processFields.writeField"	TokenNameStringLiteral	StoredFieldsWriterPerThread.processFields.writeField
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
numStoredFields	TokenNameIdentifier	 num Stored Fields
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If there were any stored fields in this doc, doc will 	TokenNameCOMMENT_LINE	If there were any stored fields in this doc, doc will 
// be non-null; else it's null. 	TokenNameCOMMENT_LINE	be non-null; else it's null. 
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
}	TokenNameRBRACE	
