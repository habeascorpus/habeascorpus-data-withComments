package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
association	TokenNameIdentifier	 association
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
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
FacetException	TokenNameIdentifier	 Facet Exception
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
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
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
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationIntProperty	TokenNameIdentifier	 Association Int Property
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
enhancements	TokenNameIdentifier	 enhancements
.	TokenNameDOT	
association	TokenNameIdentifier	 association
.	TokenNameDOT	
AssociationProperty	TokenNameIdentifier	 Association Property
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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** Test {@link AssociationProperty}-ies. */	TokenNameCOMMENT_JAVADOC	 Test {@link AssociationProperty}-ies. 
public	TokenNamepublic	
class	TokenNameclass	
AssociationPropertyTest	TokenNameIdentifier	 Association Property Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAssociationCountProperty	TokenNameIdentifier	 test Association Count Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
FacetException	TokenNameIdentifier	 Facet Exception
{	TokenNameLBRACE	
AssociationProperty	TokenNameIdentifier	 Association Property
aa1	TokenNameIdentifier	 aa1
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationIntProperty	TokenNameIdentifier	 Association Int Property
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssociationProperty	TokenNameIdentifier	 Association Property
aa2	TokenNameIdentifier	 aa2
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationIntProperty	TokenNameIdentifier	 Association Int Property
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong association for property"	TokenNameStringLiteral	Wrong association for property
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
aa1	TokenNameIdentifier	 aa1
.	TokenNameDOT	
getAssociation	TokenNameIdentifier	 get Association
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong association for property"	TokenNameStringLiteral	Wrong association for property
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
aa2	TokenNameIdentifier	 aa2
.	TokenNameDOT	
getAssociation	TokenNameIdentifier	 get Association
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aa1	TokenNameIdentifier	 aa1
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
aa2	TokenNameIdentifier	 aa2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong association for property"	TokenNameStringLiteral	Wrong association for property
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
aa1	TokenNameIdentifier	 aa1
.	TokenNameDOT	
getAssociation	TokenNameIdentifier	 get Association
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testAssociationFloatProperty	TokenNameIdentifier	 test Association Float Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
FacetException	TokenNameIdentifier	 Facet Exception
{	TokenNameLBRACE	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
aa1	TokenNameIdentifier	 aa1
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
aa2	TokenNameIdentifier	 aa2
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong association for property"	TokenNameStringLiteral	Wrong association for property
,	TokenNameCOMMA	
5.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
aa1	TokenNameIdentifier	 aa1
.	TokenNameDOT	
getFloatAssociation	TokenNameIdentifier	 get Float Association
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.00001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong association for property"	TokenNameStringLiteral	Wrong association for property
,	TokenNameCOMMA	
3.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
aa2	TokenNameIdentifier	 aa2
.	TokenNameDOT	
getFloatAssociation	TokenNameIdentifier	 get Float Association
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.00001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aa1	TokenNameIdentifier	 aa1
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
aa2	TokenNameIdentifier	 aa2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong association for property"	TokenNameStringLiteral	Wrong association for property
,	TokenNameCOMMA	
8.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
aa1	TokenNameIdentifier	 aa1
.	TokenNameDOT	
getFloatAssociation	TokenNameIdentifier	 get Float Association
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0.00001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testEquals	TokenNameIdentifier	 test Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AssociationProperty	TokenNameIdentifier	 Association Property
aa1	TokenNameIdentifier	 aa1
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationIntProperty	TokenNameIdentifier	 Association Int Property
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssociationProperty	TokenNameIdentifier	 Association Property
aa2	TokenNameIdentifier	 aa2
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationIntProperty	TokenNameIdentifier	 Association Int Property
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssociationProperty	TokenNameIdentifier	 Association Property
aa3	TokenNameIdentifier	 aa3
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AssociationProperty	TokenNameIdentifier	 Association Property
aa4	TokenNameIdentifier	 aa4
=	TokenNameEQUAL	
new	TokenNamenew	
AssociationFloatProperty	TokenNameIdentifier	 Association Float Property
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Should be equal"	TokenNameStringLiteral	Should be equal
,	TokenNameCOMMA	
aa1	TokenNameIdentifier	 aa1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aa1	TokenNameIdentifier	 aa1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Should be equal"	TokenNameStringLiteral	Should be equal
,	TokenNameCOMMA	
aa1	TokenNameIdentifier	 aa1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aa2	TokenNameIdentifier	 aa2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Should not be equal"	TokenNameStringLiteral	Should not be equal
,	TokenNameCOMMA	
aa1	TokenNameIdentifier	 aa1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aa3	TokenNameIdentifier	 aa3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Should be equal"	TokenNameStringLiteral	Should be equal
,	TokenNameCOMMA	
aa3	TokenNameIdentifier	 aa3
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aa3	TokenNameIdentifier	 aa3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Should be equal"	TokenNameStringLiteral	Should be equal
,	TokenNameCOMMA	
aa3	TokenNameIdentifier	 aa3
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
aa4	TokenNameIdentifier	 aa4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
