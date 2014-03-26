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
/** * Encapsulates an input request. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Encapsulates an input request. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
InputRequest	TokenNameIdentifier	 Input Request
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prompt	TokenNameIdentifier	 prompt
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
/** * Construct an InputRequest. * @param prompt The prompt to show to the user. Must not be null. */	TokenNameCOMMENT_JAVADOC	 Construct an InputRequest. @param prompt The prompt to show to the user. Must not be null. 
public	TokenNamepublic	
InputRequest	TokenNameIdentifier	 Input Request
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prompt	TokenNameIdentifier	 prompt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prompt	TokenNameIdentifier	 prompt
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"prompt must not be null"	TokenNameStringLiteral	prompt must not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prompt	TokenNameIdentifier	 prompt
=	TokenNameEQUAL	
prompt	TokenNameIdentifier	 prompt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the prompt text. * @return the prompt. */	TokenNameCOMMENT_JAVADOC	 Retrieves the prompt text. @return the prompt. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrompt	TokenNameIdentifier	 get Prompt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prompt	TokenNameIdentifier	 prompt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the user provided input. * @param input the string to be used for input. */	TokenNameCOMMENT_JAVADOC	 Sets the user provided input. @param input the string to be used for input. 
public	TokenNamepublic	
void	TokenNamevoid	
setInput	TokenNameIdentifier	 set Input
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Is the user input valid? * @return true if it is. */	TokenNameCOMMENT_JAVADOC	 Is the user input valid? @return true if it is. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInputValid	TokenNameIdentifier	 is Input Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves the user input. * @return the user input. */	TokenNameCOMMENT_JAVADOC	 Retrieves the user input. @return the user input. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInput	TokenNameIdentifier	 get Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a configured default value. * @return the default value. * @since Ant 1.7.0 */	TokenNameCOMMENT_JAVADOC	 Gets a configured default value. @return the default value. @since Ant 1.7.0 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDefaultValue	TokenNameIdentifier	 get Default Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
defaultValue	TokenNameIdentifier	 default Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Configures a default value. * @param d the value to set. * @since Ant 1.7.0 */	TokenNameCOMMENT_JAVADOC	 Configures a default value. @param d the value to set. @since Ant 1.7.0 
public	TokenNamepublic	
void	TokenNamevoid	
setDefaultValue	TokenNameIdentifier	 set Default Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defaultValue	TokenNameIdentifier	 default Value
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
