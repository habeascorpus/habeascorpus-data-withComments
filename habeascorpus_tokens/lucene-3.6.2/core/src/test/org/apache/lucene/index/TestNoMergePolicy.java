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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Modifier	TokenNameIdentifier	 Modifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestNoMergePolicy	TokenNameIdentifier	 Test No Merge Policy
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testNoMergePolicy	TokenNameIdentifier	 test No Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
MergePolicy	TokenNameIdentifier	 Merge Policy
mp	TokenNameIdentifier	 mp
=	TokenNameEQUAL	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
.	TokenNameDOT	
NO_COMPOUND_FILES	TokenNameIdentifier	 NO  COMPOUND  FILES
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
findMerges	TokenNameIdentifier	 find Merges
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
findForcedMerges	TokenNameIdentifier	 find Forced Merges
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
findForcedDeletesMerges	TokenNameIdentifier	 find Forced Deletes Merges
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
mp	TokenNameIdentifier	 mp
.	TokenNameDOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mp	TokenNameIdentifier	 mp
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
testCompoundFiles	TokenNameIdentifier	 test Compound Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
.	TokenNameDOT	
NO_COMPOUND_FILES	TokenNameIdentifier	 NO  COMPOUND  FILES
.	TokenNameDOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
.	TokenNameDOT	
COMPOUND_FILES	TokenNameIdentifier	 COMPOUND  FILES
.	TokenNameDOT	
useCompoundFile	TokenNameIdentifier	 use Compound File
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testFinalSingleton	TokenNameIdentifier	 test Final Singleton
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ctors	TokenNameIdentifier	 ctors
=	TokenNameEQUAL	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getDeclaredConstructors	TokenNameIdentifier	 get Declared Constructors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"expected 1 private ctor only: "	TokenNameStringLiteral	expected 1 private ctor only: 
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ctors	TokenNameIdentifier	 ctors
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctors	TokenNameIdentifier	 ctors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"that 1 should be private: "	TokenNameStringLiteral	that 1 should be private: 
+	TokenNamePLUS	
ctors	TokenNameIdentifier	 ctors
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Modifier	TokenNameIdentifier	 Modifier
.	TokenNameDOT	
isPrivate	TokenNameIdentifier	 is Private
(	TokenNameLPAREN	
ctors	TokenNameIdentifier	 ctors
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMethodsOverridden	TokenNameIdentifier	 test Methods Overridden
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Ensures that all methods of MergePolicy are overridden. That's important 	TokenNameCOMMENT_LINE	Ensures that all methods of MergePolicy are overridden. That's important 
// to ensure that NoMergePolicy overrides everything, so that no unexpected 	TokenNameCOMMENT_LINE	to ensure that NoMergePolicy overrides everything, so that no unexpected 
// behavior/error occurs 	TokenNameCOMMENT_LINE	behavior/error occurs 
for	TokenNamefor	
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
m	TokenNameIdentifier	 m
:	TokenNameCOLON	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethods	TokenNameIdentifier	 get Methods
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// getDeclaredMethods() returns just those methods that are declared on 	TokenNameCOMMENT_LINE	getDeclaredMethods() returns just those methods that are declared on 
// NoMergePolicy. getMethods() returns those that are visible in that 	TokenNameCOMMENT_LINE	NoMergePolicy. getMethods() returns those that are visible in that 
// context, including ones from Object. So just filter out Object. If in 	TokenNameCOMMENT_LINE	context, including ones from Object. So just filter out Object. If in 
// the future MergePolicy will extend a different class than Object, this 	TokenNameCOMMENT_LINE	the future MergePolicy will extend a different class than Object, this 
// will need to change. 	TokenNameCOMMENT_LINE	will need to change. 
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getDeclaringClass	TokenNameIdentifier	 get Declaring Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
" is not overridden !"	TokenNameStringLiteral	 is not overridden !
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getDeclaringClass	TokenNameIdentifier	 get Declaring Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NoMergePolicy	TokenNameIdentifier	 No Merge Policy
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
