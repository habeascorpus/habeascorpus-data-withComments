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
/** * <P>StringValidator validates that XML content is a W3C string type.</P> * <P>The string datatype represents character strings in XML. The * value space of string is the set of finite-length sequences * of characters (as defined in [XML 1.0 Recommendation * (Second Edition)]) that match the Char production * from [XML 1.0 Recommendation (Second Edition)]. * A character is an atomic unit of communication; it * is not further specified except to note that every * character has a corresponding Universal Code Set * code point ([ISO 10646],[Unicode] and [Unicode3]), * which is an integer.</P> * * @xerces.internal * * @version $Id: StringDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <P>StringValidator validates that XML content is a W3C string type.</P> <P>The string datatype represents character strings in XML. The value space of string is the set of finite-length sequences of characters (as defined in [XML 1.0 Recommendation (Second Edition)]) that match the Char production from [XML 1.0 Recommendation (Second Edition)]. A character is an atomic unit of communication; it is not further specified except to note that every character has a corresponding Universal Code Set code point ([ISO 10646],[Unicode] and [Unicode3]), which is an integer.</P> * @xerces.internal * @version $Id: StringDatatypeValidator.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
StringDatatypeValidator	TokenNameIdentifier	 String Datatype Validator
implements	TokenNameimplements	
DatatypeValidator	TokenNameIdentifier	 Datatype Validator
{	TokenNameLBRACE	
// construct a string datatype validator 	TokenNameCOMMENT_LINE	construct a string datatype validator 
public	TokenNamepublic	
StringDatatypeValidator	TokenNameIdentifier	 String Datatype Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Checks that "content" string is valid string value. * If invalid a Datatype validation exception is thrown. * * @param content the string value that needs to be validated * @param context the validation context * @throws InvalidDatatypeException if the content is * invalid according to the rules for the validators * @see InvalidDatatypeValueException */	TokenNameCOMMENT_JAVADOC	 Checks that "content" string is valid string value. If invalid a Datatype validation exception is thrown. * @param content the string value that needs to be validated @param context the validation context @throws InvalidDatatypeException if the content is invalid according to the rules for the validators @see InvalidDatatypeValueException 
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
