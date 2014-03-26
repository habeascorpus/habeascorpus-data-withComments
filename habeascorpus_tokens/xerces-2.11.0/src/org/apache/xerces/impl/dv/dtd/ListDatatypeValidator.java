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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
/** * For list types: ENTITIES, IDREFS, NMTOKENS. * * @xerces.internal * * @author Jeffrey Rodriguez, IBM * @author Sandy Gao, IBM * * @version $Id: ListDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 For list types: ENTITIES, IDREFS, NMTOKENS. * @xerces.internal * @author Jeffrey Rodriguez, IBM @author Sandy Gao, IBM * @version $Id: ListDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ListDatatypeValidator	TokenNameIdentifier	 List Datatype Validator
implements	TokenNameimplements	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
{	TokenNameLBRACE	
// the type of items in the list 	TokenNameCOMMENT_LINE	the type of items in the list 
final	TokenNamefinal	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
fItemValidator	TokenNameIdentifier	 f Item Validator
;	TokenNameSEMICOLON	
// construct a list datatype validator 	TokenNameCOMMENT_LINE	construct a list datatype validator 
public	TokenNamepublic	
ListDatatypeValidator	TokenNameIdentifier	 List Datatype Validator
(	TokenNameLPAREN	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
itemDV	TokenNameIdentifier	 item DV
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fItemValidator	TokenNameIdentifier	 f Item Validator
=	TokenNameEQUAL	
itemDV	TokenNameIdentifier	 item DV
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks that "content" string is valid. * If invalid a Datatype validation exception is thrown. * * @param content the string value that needs to be validated * @param context the validation context * @throws InvalidDatatypeException if the content is * invalid according to the rules for the validators * @see InvalidDatatypeValueException */	TokenNameCOMMENT_JAVADOC	 Checks that "content" string is valid. If invalid a Datatype validation exception is thrown. * @param content the string value that needs to be validated @param context the validation context @throws InvalidDatatypeException if the content is invalid according to the rules for the validators @see InvalidDatatypeValueException 
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
StringTokenizer	TokenNameIdentifier	 String Tokenizer
parsedList	TokenNameIdentifier	 parsed List
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numberOfTokens	TokenNameIdentifier	 number Of Tokens
=	TokenNameEQUAL	
parsedList	TokenNameIdentifier	 parsed List
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numberOfTokens	TokenNameIdentifier	 number Of Tokens
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"EmptyList"	TokenNameStringLiteral	EmptyList
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Check each token in list against base type 	TokenNameCOMMENT_LINE	Check each token in list against base type 
while	TokenNamewhile	
(	TokenNameLPAREN	
parsedList	TokenNameIdentifier	 parsed List
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fItemValidator	TokenNameIdentifier	 f Item Validator
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
parsedList	TokenNameIdentifier	 parsed List
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
