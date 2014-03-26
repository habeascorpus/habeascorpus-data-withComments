/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
FieldSelector	TokenNameIdentifier	 Field Selector
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
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
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
IndexSearcher	TokenNameIdentifier	 Index Searcher
;	TokenNameSEMICOLON	
/** * Utility: extract doc names from an index */	TokenNameCOMMENT_JAVADOC	 Utility: extract doc names from an index 
public	TokenNamepublic	
class	TokenNameclass	
DocNameExtractor	TokenNameIdentifier	 Doc Name Extractor
{	TokenNameLBRACE	
private	TokenNameprivate	
FieldSelector	TokenNameIdentifier	 Field Selector
fldSel	TokenNameIdentifier	 fld Sel
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
docNameField	TokenNameIdentifier	 doc Name Field
;	TokenNameSEMICOLON	
/** * Constructor for DocNameExtractor. * @param docNameField name of the stored field containing the doc name. */	TokenNameCOMMENT_JAVADOC	 Constructor for DocNameExtractor. @param docNameField name of the stored field containing the doc name. 
public	TokenNamepublic	
DocNameExtractor	TokenNameIdentifier	 Doc Name Extractor
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
docNameField	TokenNameIdentifier	 doc Name Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docNameField	TokenNameIdentifier	 doc Name Field
=	TokenNameEQUAL	
docNameField	TokenNameIdentifier	 doc Name Field
;	TokenNameSEMICOLON	
fldSel	TokenNameIdentifier	 fld Sel
=	TokenNameEQUAL	
new	TokenNamenew	
FieldSelector	TokenNameIdentifier	 Field Selector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldName	TokenNameIdentifier	 field Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
docNameField	TokenNameIdentifier	 doc Name Field
)	TokenNameRPAREN	
?	TokenNameQUESTION	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
LOAD_AND_BREAK	TokenNameIdentifier	 LOAD  AND  BREAK
:	TokenNameCOLON	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
NO_LOAD	TokenNameIdentifier	 NO  LOAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extract the name of the input doc from the index. * @param searcher access to the index. * @param docid ID of doc whose name is needed. * @return the name of the input doc as extracted from the index. * @throws IOException if cannot extract the doc name from the index. */	TokenNameCOMMENT_JAVADOC	 Extract the name of the input doc from the index. @param searcher access to the index. @param docid ID of doc whose name is needed. @return the name of the input doc as extracted from the index. @throws IOException if cannot extract the doc name from the index. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
docName	TokenNameIdentifier	 doc Name
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
int	TokenNameint	
docid	TokenNameIdentifier	 docid
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
docid	TokenNameIdentifier	 docid
,	TokenNameCOMMA	
fldSel	TokenNameIdentifier	 fld Sel
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
docNameField	TokenNameIdentifier	 doc Name Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
