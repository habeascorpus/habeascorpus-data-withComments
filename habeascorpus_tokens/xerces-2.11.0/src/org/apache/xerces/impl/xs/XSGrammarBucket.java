/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * A class used to hold the internal schema grammar set for the current instance * * @xerces.internal * * @author Sandy Gao, IBM * @version $Id: XSGrammarBucket.java 779298 2009-05-27 20:26:13Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 A class used to hold the internal schema grammar set for the current instance * @xerces.internal * @author Sandy Gao, IBM @version $Id: XSGrammarBucket.java 779298 2009-05-27 20:26:13Z knoaman $ 
public	TokenNamepublic	
class	TokenNameclass	
XSGrammarBucket	TokenNameIdentifier	 XS Grammar Bucket
{	TokenNameLBRACE	
// Data 	TokenNameCOMMENT_LINE	Data 
/** * Hashtable that maps between Namespace and a Grammar */	TokenNameCOMMENT_JAVADOC	 Hashtable that maps between Namespace and a Grammar 
Hashtable	TokenNameIdentifier	 Hashtable
fGrammarRegistry	TokenNameIdentifier	 f Grammar Registry
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
fNoNSGrammar	TokenNameIdentifier	 f No NS Grammar
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get the schema grammar for the specified namespace * * @param namespace * @return SchemaGrammar associated with the namespace */	TokenNameCOMMENT_JAVADOC	 Get the schema grammar for the specified namespace * @param namespace @return SchemaGrammar associated with the namespace 
public	TokenNamepublic	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
fNoNSGrammar	TokenNameIdentifier	 f No NS Grammar
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
)	TokenNameRPAREN	
fGrammarRegistry	TokenNameIdentifier	 f Grammar Registry
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Put a schema grammar into the registry * This method is for internal use only: it assumes that a grammar with * the same target namespace is not already in the bucket. * * @param grammar the grammar to put in the registry */	TokenNameCOMMENT_JAVADOC	 Put a schema grammar into the registry This method is for internal use only: it assumes that a grammar with the same target namespace is not already in the bucket. * @param grammar the grammar to put in the registry 
public	TokenNamepublic	
void	TokenNamevoid	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fNoNSGrammar	TokenNameIdentifier	 f No NS Grammar
=	TokenNameEQUAL	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
else	TokenNameelse	
fGrammarRegistry	TokenNameIdentifier	 f Grammar Registry
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * put a schema grammar and any grammars imported by it (directly or * inderectly) into the registry. when a grammar with the same target * namespace is already in the bucket, and different from the one being * added, it's an error, and no grammar will be added into the bucket. * * @param grammar the grammar to put in the registry * @param deep whether to add imported grammars * @return whether the process succeeded */	TokenNameCOMMENT_JAVADOC	 put a schema grammar and any grammars imported by it (directly or inderectly) into the registry. when a grammar with the same target namespace is already in the bucket, and different from the one being added, it's an error, and no grammar will be added into the bucket. * @param grammar the grammar to put in the registry @param deep whether to add imported grammars @return whether the process succeeded 
public	TokenNamepublic	
boolean	TokenNameboolean	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// whether there is one with the same tns 	TokenNameCOMMENT_LINE	whether there is one with the same tns 
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
sg	TokenNameIdentifier	 sg
=	TokenNameEQUAL	
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sg	TokenNameIdentifier	 sg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the one we have is different from the one passed, it's an error 	TokenNameCOMMENT_LINE	if the one we have is different from the one passed, it's an error 
return	TokenNamereturn	
sg	TokenNameIdentifier	 sg
==	TokenNameEQUAL_EQUAL	
grammar	TokenNameIdentifier	 grammar
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not deep import, then just add this one grammar 	TokenNameCOMMENT_LINE	not deep import, then just add this one grammar 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get all imported grammars, and make a copy of the Vector, so that 	TokenNameCOMMENT_LINE	get all imported grammars, and make a copy of the Vector, so that 
// we can recursively process the grammars, and add distinct ones 	TokenNameCOMMENT_LINE	we can recursively process the grammars, and add distinct ones 
// to the same vector 	TokenNameCOMMENT_LINE	to the same vector 
Vector	TokenNameIdentifier	 Vector
currGrammars	TokenNameIdentifier	 curr Grammars
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getImportedGrammars	TokenNameIdentifier	 get Imported Grammars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currGrammars	TokenNameIdentifier	 curr Grammars
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Vector	TokenNameIdentifier	 Vector
grammars	TokenNameIdentifier	 grammars
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
currGrammars	TokenNameIdentifier	 curr Grammars
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
sg1	TokenNameIdentifier	 sg1
,	TokenNameCOMMA	
sg2	TokenNameIdentifier	 sg2
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
gs	TokenNameIdentifier	 gs
;	TokenNameSEMICOLON	
// for all (recursively) imported grammars 	TokenNameCOMMENT_LINE	for all (recursively) imported grammars 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the grammar 	TokenNameCOMMENT_LINE	get the grammar 
sg1	TokenNameIdentifier	 sg1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
)	TokenNameRPAREN	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check whether the bucket has one with the same tns 	TokenNameCOMMENT_LINE	check whether the bucket has one with the same tns 
sg2	TokenNameIdentifier	 sg2
=	TokenNameEQUAL	
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
sg1	TokenNameIdentifier	 sg1
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sg2	TokenNameIdentifier	 sg2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we need to add grammars imported by sg1 too 	TokenNameCOMMENT_LINE	we need to add grammars imported by sg1 too 
gs	TokenNameIdentifier	 gs
=	TokenNameEQUAL	
sg1	TokenNameIdentifier	 sg1
.	TokenNameDOT	
getImportedGrammars	TokenNameIdentifier	 get Imported Grammars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for all grammars imported by sg2, but not in the vector 	TokenNameCOMMENT_LINE	for all grammars imported by sg2, but not in the vector 
// we add them to the vector 	TokenNameCOMMENT_LINE	we add them to the vector 
if	TokenNameif	
(	TokenNameLPAREN	
gs	TokenNameIdentifier	 gs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
gs	TokenNameIdentifier	 gs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sg2	TokenNameIdentifier	 sg2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
)	TokenNameRPAREN	
gs	TokenNameIdentifier	 gs
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
sg2	TokenNameIdentifier	 sg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
sg2	TokenNameIdentifier	 sg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// we found one with the same target namespace 	TokenNameCOMMENT_LINE	we found one with the same target namespace 
// if the two grammars are not the same object, then it's an error 	TokenNameCOMMENT_LINE	if the two grammars are not the same object, then it's an error 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sg2	TokenNameIdentifier	 sg2
!=	TokenNameNOT_EQUAL	
sg1	TokenNameIdentifier	 sg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now we have all imported grammars stored in the vector. add them 	TokenNameCOMMENT_LINE	now we have all imported grammars stored in the vector. add them 
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
)	TokenNameRPAREN	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * put a schema grammar and any grammars imported by it (directly or * inderectly) into the registry. when a grammar with the same target * namespace is already in the bucket, and different from the one being * added, no grammar will be added into the bucket. * * @param grammar the grammar to put in the registry * @param deep whether to add imported grammars * @param ignoreConflict whether to ignore grammars that already exist in the grammar * bucket or not - including 'grammar' parameter. * @return whether the process succeeded */	TokenNameCOMMENT_JAVADOC	 put a schema grammar and any grammars imported by it (directly or inderectly) into the registry. when a grammar with the same target namespace is already in the bucket, and different from the one being added, no grammar will be added into the bucket. * @param grammar the grammar to put in the registry @param deep whether to add imported grammars @param ignoreConflict whether to ignore grammars that already exist in the grammar bucket or not - including 'grammar' parameter. @return whether the process succeeded 
public	TokenNamepublic	
boolean	TokenNameboolean	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ignoreConflict	TokenNameIdentifier	 ignore Conflict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ignoreConflict	TokenNameIdentifier	 ignore Conflict
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if grammar already exist in the bucket, we ignore the request 	TokenNameCOMMENT_LINE	if grammar already exist in the bucket, we ignore the request 
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
sg	TokenNameIdentifier	 sg
=	TokenNameEQUAL	
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sg	TokenNameIdentifier	 sg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
grammar	TokenNameIdentifier	 grammar
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not adding the imported grammars 	TokenNameCOMMENT_LINE	not adding the imported grammars 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// get all imported grammars, and make a copy of the Vector, so that 	TokenNameCOMMENT_LINE	get all imported grammars, and make a copy of the Vector, so that 
// we can recursively process the grammars, and add distinct ones 	TokenNameCOMMENT_LINE	we can recursively process the grammars, and add distinct ones 
// to the same vector 	TokenNameCOMMENT_LINE	to the same vector 
Vector	TokenNameIdentifier	 Vector
currGrammars	TokenNameIdentifier	 curr Grammars
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
grammar	TokenNameIdentifier	 grammar
.	TokenNameDOT	
getImportedGrammars	TokenNameIdentifier	 get Imported Grammars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currGrammars	TokenNameIdentifier	 curr Grammars
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Vector	TokenNameIdentifier	 Vector
grammars	TokenNameIdentifier	 grammars
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
currGrammars	TokenNameIdentifier	 curr Grammars
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
sg1	TokenNameIdentifier	 sg1
,	TokenNameCOMMA	
sg2	TokenNameIdentifier	 sg2
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
gs	TokenNameIdentifier	 gs
;	TokenNameSEMICOLON	
// for all (recursively) imported grammars 	TokenNameCOMMENT_LINE	for all (recursively) imported grammars 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the grammar 	TokenNameCOMMENT_LINE	get the grammar 
sg1	TokenNameIdentifier	 sg1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
)	TokenNameRPAREN	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check whether the bucket has one with the same tns 	TokenNameCOMMENT_LINE	check whether the bucket has one with the same tns 
sg2	TokenNameIdentifier	 sg2
=	TokenNameEQUAL	
getGrammar	TokenNameIdentifier	 get Grammar
(	TokenNameLPAREN	
sg1	TokenNameIdentifier	 sg1
.	TokenNameDOT	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sg2	TokenNameIdentifier	 sg2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we need to add grammars imported by sg1 too 	TokenNameCOMMENT_LINE	we need to add grammars imported by sg1 too 
gs	TokenNameIdentifier	 gs
=	TokenNameEQUAL	
sg1	TokenNameIdentifier	 sg1
.	TokenNameDOT	
getImportedGrammars	TokenNameIdentifier	 get Imported Grammars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for all grammars imported by sg2, but not in the vector 	TokenNameCOMMENT_LINE	for all grammars imported by sg2, but not in the vector 
// we add them to the vector 	TokenNameCOMMENT_LINE	we add them to the vector 
if	TokenNameif	
(	TokenNameLPAREN	
gs	TokenNameIdentifier	 gs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
gs	TokenNameIdentifier	 gs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sg2	TokenNameIdentifier	 sg2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
)	TokenNameRPAREN	
gs	TokenNameIdentifier	 gs
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
sg2	TokenNameIdentifier	 sg2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
sg2	TokenNameIdentifier	 sg2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// we found one with the same target namespace, ignore it 	TokenNameCOMMENT_LINE	we found one with the same target namespace, ignore it 
else	TokenNameelse	
{	TokenNameLBRACE	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
sg1	TokenNameIdentifier	 sg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now we have all imported grammars stored in the vector. add them 	TokenNameCOMMENT_LINE	now we have all imported grammars stored in the vector. add them 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
putGrammar	TokenNameIdentifier	 put Grammar
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
)	TokenNameRPAREN	
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * get all grammars in the registry * * @return an array of SchemaGrammars. */	TokenNameCOMMENT_JAVADOC	 get all grammars in the registry * @return an array of SchemaGrammars. 
public	TokenNamepublic	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getGrammars	TokenNameIdentifier	 get Grammars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the number of grammars 	TokenNameCOMMENT_LINE	get the number of grammars 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
fGrammarRegistry	TokenNameIdentifier	 f Grammar Registry
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
fNoNSGrammar	TokenNameIdentifier	 f No NS Grammar
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grammars	TokenNameIdentifier	 grammars
=	TokenNameEQUAL	
new	TokenNamenew	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// get grammars with target namespace 	TokenNameCOMMENT_LINE	get grammars with target namespace 
Enumeration	TokenNameIdentifier	 Enumeration
schemas	TokenNameIdentifier	 schemas
=	TokenNameEQUAL	
fGrammarRegistry	TokenNameIdentifier	 f Grammar Registry
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
grammars	TokenNameIdentifier	 grammars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SchemaGrammar	TokenNameIdentifier	 Schema Grammar
)	TokenNameRPAREN	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add the grammar without target namespace, if any 	TokenNameCOMMENT_LINE	add the grammar without target namespace, if any 
if	TokenNameif	
(	TokenNameLPAREN	
fNoNSGrammar	TokenNameIdentifier	 f No NS Grammar
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
grammars	TokenNameIdentifier	 grammars
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fNoNSGrammar	TokenNameIdentifier	 f No NS Grammar
;	TokenNameSEMICOLON	
return	TokenNamereturn	
grammars	TokenNameIdentifier	 grammars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clear the registry. * REVISIT: update to use another XSGrammarBucket */	TokenNameCOMMENT_JAVADOC	 Clear the registry. REVISIT: update to use another XSGrammarBucket 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNoNSGrammar	TokenNameIdentifier	 f No NS Grammar
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fGrammarRegistry	TokenNameIdentifier	 f Grammar Registry
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSGrammarBucket 	TokenNameCOMMENT_LINE	class XSGrammarBucket 
