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
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
ValidationContext	TokenNameIdentifier	 Validation Context
;	TokenNameSEMICOLON	
/** * <P>ENTITYDatatypeValidator implements the * DatattypeValidator interface. * This validator embodies the ENTITY attribute type * from XML1.0 recommendation. * The Value space of ENTITY is the set of all strings * that match the NCName production and have been * declared as an unparsed entity in a document * type definition. * The Lexical space of Entity is the set of all * strings that match the NCName production. * The value space of ENTITY is scoped to a specific * instance document.</P> * * @xerces.internal * * @author Jeffrey Rodriguez, IBM * @author Sandy Gao, IBM * * @version $Id: ENTITYDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <P>ENTITYDatatypeValidator implements the DatattypeValidator interface. This validator embodies the ENTITY attribute type from XML1.0 recommendation. The Value space of ENTITY is the set of all strings that match the NCName production and have been declared as an unparsed entity in a document type definition. The Lexical space of Entity is the set of all strings that match the NCName production. The value space of ENTITY is scoped to a specific instance document.</P> * @xerces.internal * @author Jeffrey Rodriguez, IBM @author Sandy Gao, IBM * @version $Id: ENTITYDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ENTITYDatatypeValidator	TokenNameIdentifier	 ENTITY Datatype Validator
implements	TokenNameimplements	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
{	TokenNameLBRACE	
// construct an ENTITY datatype validator 	TokenNameCOMMENT_LINE	construct an ENTITY datatype validator 
public	TokenNamepublic	
ENTITYDatatypeValidator	TokenNameIdentifier	 ENTITY Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Checks that "content" string is valid ID value. * If invalid a Datatype validation exception is thrown. * * @param content the string value that needs to be validated * @param context the validation context * @throws InvalidDatatypeException if the content is * invalid according to the rules for the validators * @see InvalidDatatypeValueException */	TokenNameCOMMENT_JAVADOC	 Checks that "content" string is valid ID value. If invalid a Datatype validation exception is thrown. * @param content the string value that needs to be validated @param context the validation context @throws InvalidDatatypeException if the content is invalid according to the rules for the validators @see InvalidDatatypeValueException 
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
isEntityUnparsed	TokenNameIdentifier	 is Entity Unparsed
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"ENTITYNotUnparsed"	TokenNameStringLiteral	ENTITYNotUnparsed
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
