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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
;	TokenNameSEMICOLON	
/** * <P>IDREFDatatypeValidator - represents the IDREFS * attribute type from XML 1.1 recommendation. The * Value Space of IDREF is the set of all strings * that match the NCName production and have been * used in an XML Document as the value of an element * or attribute of Type ID. The Lexical space of * IDREF is the set of strings that match the NCName * production.</P> * <P>The Value space of IDREF is scoped to a specific * instance document</P> * * @xerces.internal * * @author Jeffrey Rodriguez, IBM * @author Sandy Gao, IBM * @author Neil Graham, IBM * * @version $Id: XML11IDREFDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <P>IDREFDatatypeValidator - represents the IDREFS attribute type from XML 1.1 recommendation. The Value Space of IDREF is the set of all strings that match the NCName production and have been used in an XML Document as the value of an element or attribute of Type ID. The Lexical space of IDREF is the set of strings that match the NCName production.</P> <P>The Value space of IDREF is scoped to a specific instance document</P> * @xerces.internal * @author Jeffrey Rodriguez, IBM @author Sandy Gao, IBM @author Neil Graham, IBM * @version $Id: XML11IDREFDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11IDREFDatatypeValidator	TokenNameIdentifier	 XM L11 IDREF Datatype Validator
extends	TokenNameextends	
IDREFDatatypeValidator	TokenNameIdentifier	 IDREF Datatype Validator
{	TokenNameLBRACE	
// construct an IDREF datatype validator 	TokenNameCOMMENT_LINE	construct an IDREF datatype validator 
public	TokenNamepublic	
XML11IDREFDatatypeValidator	TokenNameIdentifier	 XM L11 IDREF Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks that "content" string is valid IDREF value. * If invalid a Datatype validation exception is thrown. * * @param content the string value that needs to be validated * @param context the validation context * @throws InvalidDatatypeException if the content is * invalid according to the rules for the validators * @see InvalidDatatypeValueException */	TokenNameCOMMENT_JAVADOC	 Checks that "content" string is valid IDREF value. If invalid a Datatype validation exception is thrown. * @param content the string value that needs to be validated @param context the validation context @throws InvalidDatatypeException if the content is invalid according to the rules for the validators @see InvalidDatatypeValueException 
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
//Check if is valid key-[81] EncName ::= [A-Za-z] ([A-Za-z0-9._] | '-')* 	TokenNameCOMMENT_LINE	Check if is valid key-[81] EncName ::= [A-Za-z] ([A-Za-z0-9._] | '-')* 
if	TokenNameif	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
useNamespaces	TokenNameIdentifier	 use Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNCName	TokenNameIdentifier	 is XM L11 Valid NC Name
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"IDREFInvalidWithNamespaces"	TokenNameStringLiteral	IDREFInvalidWithNamespaces
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
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidName	TokenNameIdentifier	 is XM L11 Valid Name
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"IDREFInvalid"	TokenNameStringLiteral	IDREFInvalid
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
context	TokenNameIdentifier	 context
.	TokenNameDOT	
addIdRef	TokenNameIdentifier	 add Id Ref
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
