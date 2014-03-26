package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriter	TokenNameIdentifier	 Index Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
FacetResultsHandler	TokenNameIdentifier	 Facet Results Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
FacetRequestTest	TokenNameIdentifier	 Facet Request Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalNumResults	TokenNameIdentifier	 test Illegal Num Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
new	TokenNamenew	
CountFacetRequest	TokenNameIdentifier	 Count Facet Request
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
testIllegalCategoryPath	TokenNameIdentifier	 test Illegal Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
new	TokenNamenew	
CountFacetRequest	TokenNameIdentifier	 Count Facet Request
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testHashAndEquals	TokenNameIdentifier	 test Hash And Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CountFacetRequest	TokenNameIdentifier	 Count Facet Request
fr1	TokenNameIdentifier	 fr1
=	TokenNameEQUAL	
new	TokenNamenew	
CountFacetRequest	TokenNameIdentifier	 Count Facet Request
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CountFacetRequest	TokenNameIdentifier	 Count Facet Request
fr2	TokenNameIdentifier	 fr2
=	TokenNameEQUAL	
new	TokenNamenew	
CountFacetRequest	TokenNameIdentifier	 Count Facet Request
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"hashCode() should agree on both objects"	TokenNameStringLiteral	hashCode() should agree on both objects
,	TokenNameCOMMA	
fr1	TokenNameIdentifier	 fr1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fr2	TokenNameIdentifier	 fr2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"equals() should return true"	TokenNameStringLiteral	equals() should return true
,	TokenNameCOMMA	
fr1	TokenNameIdentifier	 fr1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fr2	TokenNameIdentifier	 fr2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fr1	TokenNameIdentifier	 fr1
.	TokenNameDOT	
setDepth	TokenNameIdentifier	 set Depth
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"equals() should return false as fr1.depth != fr2.depth"	TokenNameStringLiteral	equals() should return false as fr1.depth != fr2.depth
,	TokenNameCOMMA	
fr1	TokenNameIdentifier	 fr1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fr2	TokenNameIdentifier	 fr2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testGetFacetResultHandlerDifferentTaxonomy	TokenNameIdentifier	 test Get Facet Result Handler Different Taxonomy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FacetRequest	TokenNameIdentifier	 Facet Request
fr	TokenNameIdentifier	 fr
=	TokenNameEQUAL	
new	TokenNamenew	
CountFacetRequest	TokenNameIdentifier	 Count Facet Request
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir1	TokenNameIdentifier	 dir1
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir2	TokenNameIdentifier	 dir2
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create empty indexes, so that LTR ctor won't complain about a missing index. 	TokenNameCOMMENT_LINE	create empty indexes, so that LTR ctor won't complain about a missing index. 
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir2	TokenNameIdentifier	 dir2
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
tr1	TokenNameIdentifier	 tr1
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
(	TokenNameLPAREN	
dir1	TokenNameIdentifier	 dir1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
tr2	TokenNameIdentifier	 tr2
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
(	TokenNameLPAREN	
dir2	TokenNameIdentifier	 dir2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FacetResultsHandler	TokenNameIdentifier	 Facet Results Handler
frh1	TokenNameIdentifier	 frh1
=	TokenNameEQUAL	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
createFacetResultsHandler	TokenNameIdentifier	 create Facet Results Handler
(	TokenNameLPAREN	
tr1	TokenNameIdentifier	 tr1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FacetResultsHandler	TokenNameIdentifier	 Facet Results Handler
frh2	TokenNameIdentifier	 frh2
=	TokenNameEQUAL	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
createFacetResultsHandler	TokenNameIdentifier	 create Facet Results Handler
(	TokenNameLPAREN	
tr2	TokenNameIdentifier	 tr2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should not return the same FacetResultHandler instance for different TaxonomyReader instances"	TokenNameStringLiteral	should not return the same FacetResultHandler instance for different TaxonomyReader instances
,	TokenNameCOMMA	
frh1	TokenNameIdentifier	 frh1
!=	TokenNameNOT_EQUAL	
frh2	TokenNameIdentifier	 frh2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr1	TokenNameIdentifier	 tr1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr2	TokenNameIdentifier	 tr2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir1	TokenNameIdentifier	 dir1
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir2	TokenNameIdentifier	 dir2
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testImmutability	TokenNameIdentifier	 test Immutability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Tests that after a FRH is created by FR, changes to FR are not reflected 	TokenNameCOMMENT_LINE	Tests that after a FRH is created by FR, changes to FR are not reflected 
// in the FRH. 	TokenNameCOMMENT_LINE	in the FRH. 
FacetRequest	TokenNameIdentifier	 Facet Request
fr	TokenNameIdentifier	 fr
=	TokenNameEQUAL	
new	TokenNamenew	
CountFacetRequest	TokenNameIdentifier	 Count Facet Request
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create empty indexes, so that LTR ctor won't complain about a missing index. 	TokenNameCOMMENT_LINE	create empty indexes, so that LTR ctor won't complain about a missing index. 
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
new	TokenNamenew	
DirectoryTaxonomyReader	TokenNameIdentifier	 Directory Taxonomy Reader
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FacetResultsHandler	TokenNameIdentifier	 Facet Results Handler
frh	TokenNameIdentifier	 frh
=	TokenNameEQUAL	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
createFacetResultsHandler	TokenNameIdentifier	 create Facet Results Handler
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
setDepth	TokenNameIdentifier	 set Depth
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
FacetRequest	TokenNameIdentifier	 Facet Request
.	TokenNameDOT	
DEFAULT_DEPTH	TokenNameIdentifier	 DEFAULT  DEPTH
,	TokenNameCOMMA	
frh	TokenNameIdentifier	 frh
.	TokenNameDOT	
getFacetRequest	TokenNameIdentifier	 get Facet Request
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testClone	TokenNameIdentifier	 test Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
FacetRequest	TokenNameIdentifier	 Facet Request
fr	TokenNameIdentifier	 fr
=	TokenNameEQUAL	
new	TokenNamenew	
CountFacetRequest	TokenNameIdentifier	 Count Facet Request
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FacetRequest	TokenNameIdentifier	 Facet Request
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FacetRequest	TokenNameIdentifier	 Facet Request
)	TokenNameRPAREN	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fr	TokenNameIdentifier	 fr
.	TokenNameDOT	
setDepth	TokenNameIdentifier	 set Depth
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"depth should not have been affected in the clone"	TokenNameStringLiteral	depth should not have been affected in the clone
,	TokenNameCOMMA	
FacetRequest	TokenNameIdentifier	 Facet Request
.	TokenNameDOT	
DEFAULT_DEPTH	TokenNameIdentifier	 DEFAULT  DEPTH
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
getDepth	TokenNameIdentifier	 get Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
