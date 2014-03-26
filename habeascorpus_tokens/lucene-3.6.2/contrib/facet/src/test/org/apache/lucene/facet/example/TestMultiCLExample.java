package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
example	TokenNameIdentifier	 example
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
example	TokenNameIdentifier	 example
.	TokenNameDOT	
ExampleResult	TokenNameIdentifier	 Example Result
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
example	TokenNameIdentifier	 example
.	TokenNameDOT	
multiCL	TokenNameIdentifier	 multi CL
.	TokenNameDOT	
MultiCLMain	TokenNameIdentifier	 Multi CL Main
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
FacetResult	TokenNameIdentifier	 Facet Result
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Test that the multi-category list example works as expected. This test helps * to verify that examples code is alive! */	TokenNameCOMMENT_JAVADOC	 Test that the multi-category list example works as expected. This test helps to verify that examples code is alive! 
public	TokenNamepublic	
class	TokenNameclass	
TestMultiCLExample	TokenNameIdentifier	 Test Multi CL Example
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMulti	TokenNameIdentifier	 test Multi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
ExampleResult	TokenNameIdentifier	 Example Result
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
MultiCLMain	TokenNameIdentifier	 Multi CL Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
runSample	TokenNameIdentifier	 run Sample
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertCorrectMultiResults	TokenNameIdentifier	 assert Correct Multi Results
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
assertCorrectMultiResults	TokenNameIdentifier	 assert Correct Multi Results
(	TokenNameLPAREN	
ExampleResult	TokenNameIdentifier	 Example Result
exampleResults	TokenNameIdentifier	 example Results
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FacetResult	TokenNameIdentifier	 Facet Result
>	TokenNameGREATER	
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
exampleResults	TokenNameIdentifier	 example Results
.	TokenNameDOT	
getFacetResults	TokenNameIdentifier	 get Facet Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FacetResult	TokenNameIdentifier	 Facet Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Result should not be null"	TokenNameStringLiteral	Result should not be null
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid label"	TokenNameStringLiteral	Invalid label
,	TokenNameCOMMA	
"5"	TokenNameStringLiteral	5
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid value"	TokenNameStringLiteral	Invalid value
,	TokenNameCOMMA	
2.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid # of subresults"	TokenNameStringLiteral	Invalid # of subresults
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumSubResults	TokenNameIdentifier	 get Num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
>	TokenNameGREATER	
subResults	TokenNameIdentifier	 sub Results
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSubResults	TokenNameIdentifier	 get Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FacetResultNode	TokenNameIdentifier	 Facet Result Node
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid subresult value"	TokenNameStringLiteral	Invalid subresult value
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid subresult label"	TokenNameStringLiteral	Invalid subresult label
,	TokenNameCOMMA	
"5/2"	TokenNameStringLiteral	5/2
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid subresult value"	TokenNameStringLiteral	Invalid subresult value
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid subresult label"	TokenNameStringLiteral	Invalid subresult label
,	TokenNameCOMMA	
"5/7"	TokenNameStringLiteral	5/7
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sub	TokenNameIdentifier	 sub
=	TokenNameEQUAL	
subResults	TokenNameIdentifier	 sub Results
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid subresult value"	TokenNameStringLiteral	Invalid subresult value
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid subresult label"	TokenNameStringLiteral	Invalid subresult label
,	TokenNameCOMMA	
"5/5"	TokenNameStringLiteral	5/5
,	TokenNameCOMMA	
sub	TokenNameIdentifier	 sub
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Result should not be null"	TokenNameStringLiteral	Result should not be null
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid label"	TokenNameStringLiteral	Invalid label
,	TokenNameCOMMA	
"5/5"	TokenNameStringLiteral	5/5
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid value"	TokenNameStringLiteral	Invalid value
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid number of subresults"	TokenNameStringLiteral	Invalid number of subresults
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumSubResults	TokenNameIdentifier	 get Num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Result should not be null"	TokenNameStringLiteral	Result should not be null
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid label"	TokenNameStringLiteral	Invalid label
,	TokenNameCOMMA	
"6/2"	TokenNameStringLiteral	6/2
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid value"	TokenNameStringLiteral	Invalid value
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Invalid number of subresults"	TokenNameStringLiteral	Invalid number of subresults
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
getFacetResultNode	TokenNameIdentifier	 get Facet Result Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getNumSubResults	TokenNameIdentifier	 get Num Sub Results
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
