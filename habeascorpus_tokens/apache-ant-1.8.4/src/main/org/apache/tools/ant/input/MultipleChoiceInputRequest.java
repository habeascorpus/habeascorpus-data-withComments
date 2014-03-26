/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
/** * Encapsulates an input request. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Encapsulates an input request. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
MultipleChoiceInputRequest	TokenNameIdentifier	 Multiple Choice Input Request
extends	TokenNameextends	
InputRequest	TokenNameIdentifier	 Input Request
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
choices	TokenNameIdentifier	 choices
;	TokenNameSEMICOLON	
/** * @param prompt The prompt to show to the user. Must not be null. * @param choices holds all input values that are allowed. * Must not be null. */	TokenNameCOMMENT_JAVADOC	 @param prompt The prompt to show to the user. Must not be null. @param choices holds all input values that are allowed. Must not be null. 
public	TokenNamepublic	
MultipleChoiceInputRequest	TokenNameIdentifier	 Multiple Choice Input Request
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prompt	TokenNameIdentifier	 prompt
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
choices	TokenNameIdentifier	 choices
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
prompt	TokenNameIdentifier	 prompt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
choices	TokenNameIdentifier	 choices
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"choices must not be null"	TokenNameStringLiteral	choices must not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
choices	TokenNameIdentifier	 choices
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
(	TokenNameLPAREN	
choices	TokenNameIdentifier	 choices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The possible values. */	TokenNameCOMMENT_JAVADOC	 @return The possible values. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
getChoices	TokenNameIdentifier	 get Choices
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
choices	TokenNameIdentifier	 choices
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the input is one of the allowed values. */	TokenNameCOMMENT_JAVADOC	 @return true if the input is one of the allowed values. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInputValid	TokenNameIdentifier	 is Input Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
choices	TokenNameIdentifier	 choices
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
