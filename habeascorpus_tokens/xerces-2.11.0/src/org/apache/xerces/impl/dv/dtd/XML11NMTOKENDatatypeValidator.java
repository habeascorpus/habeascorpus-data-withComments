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
/** * NMTOKEN datatype validator for NMTokens from XML 1.1. * * @xerces.internal * * @author Jeffrey Rodriguez, IBM * @author Sandy Gao, IBM * @author Neil Graham, IBM * * @version $Id: XML11NMTOKENDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 NMTOKEN datatype validator for NMTokens from XML 1.1. * @xerces.internal * @author Jeffrey Rodriguez, IBM @author Sandy Gao, IBM @author Neil Graham, IBM * @version $Id: XML11NMTOKENDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11NMTOKENDatatypeValidator	TokenNameIdentifier	 XM L11 NMTOKEN Datatype Validator
extends	TokenNameextends	
NMTOKENDatatypeValidator	TokenNameIdentifier	 NMTOKEN Datatype Validator
{	TokenNameLBRACE	
// construct a NMTOKEN datatype validator 	TokenNameCOMMENT_LINE	construct a NMTOKEN datatype validator 
public	TokenNamepublic	
XML11NMTOKENDatatypeValidator	TokenNameIdentifier	 XM L11 NMTOKEN Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks that "content" string is valid NMTOKEN value. * If invalid a Datatype validation exception is thrown. * * @param content the string value that needs to be validated * @param context the validation context * @throws InvalidDatatypeException if the content is * invalid according to the rules for the validators * @see InvalidDatatypeValueException */	TokenNameCOMMENT_JAVADOC	 Checks that "content" string is valid NMTOKEN value. If invalid a Datatype validation exception is thrown. * @param content the string value that needs to be validated @param context the validation context @throws InvalidDatatypeException if the content is invalid according to the rules for the validators @see InvalidDatatypeValueException 
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidNmtoken	TokenNameIdentifier	 is XM L11 Valid Nmtoken
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
"NMTOKENInvalid"	TokenNameStringLiteral	NMTOKENInvalid
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
}	TokenNameRBRACE	
// class XML11NMTOKENDatatypeValidator 	TokenNameCOMMENT_LINE	class XML11NMTOKENDatatypeValidator 
