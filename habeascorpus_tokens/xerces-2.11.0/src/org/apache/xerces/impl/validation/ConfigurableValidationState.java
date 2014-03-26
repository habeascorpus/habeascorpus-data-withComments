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
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
/** * <p>An extension of ValidationState which can be configured to turn * off checking for ID/IDREF errors and unparsed entity errors.</p> * * @xerces.internal * * @author Peter McCracken, IBM * @version $Id: ConfigurableValidationState.java 449320 2006-09-23 22:37:56Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>An extension of ValidationState which can be configured to turn off checking for ID/IDREF errors and unparsed entity errors.</p> * @xerces.internal * @author Peter McCracken, IBM @version $Id: ConfigurableValidationState.java 449320 2006-09-23 22:37:56Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ConfigurableValidationState	TokenNameIdentifier	 Configurable Validation State
extends	TokenNameextends	
ValidationState	TokenNameIdentifier	 Validation State
{	TokenNameLBRACE	
/** * Whether to check for ID/IDREF errors */	TokenNameCOMMENT_JAVADOC	 Whether to check for ID/IDREF errors 
private	TokenNameprivate	
boolean	TokenNameboolean	
fIdIdrefChecking	TokenNameIdentifier	 f Id Idref Checking
;	TokenNameSEMICOLON	
/** * Whether to check for unparsed entity errors */	TokenNameCOMMENT_JAVADOC	 Whether to check for unparsed entity errors 
private	TokenNameprivate	
boolean	TokenNameboolean	
fUnparsedEntityChecking	TokenNameIdentifier	 f Unparsed Entity Checking
;	TokenNameSEMICOLON	
/** * Creates a new ConfigurableValidationState. * By default, error checking for both ID/IDREFs * and unparsed entities are turned on. */	TokenNameCOMMENT_JAVADOC	 Creates a new ConfigurableValidationState. By default, error checking for both ID/IDREFs and unparsed entities are turned on. 
public	TokenNamepublic	
ConfigurableValidationState	TokenNameIdentifier	 Configurable Validation State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fIdIdrefChecking	TokenNameIdentifier	 f Id Idref Checking
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fUnparsedEntityChecking	TokenNameIdentifier	 f Unparsed Entity Checking
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turns checking for ID/IDREF errors on and off. * @param setting true to turn on error checking, * false to turn off error checking */	TokenNameCOMMENT_JAVADOC	 Turns checking for ID/IDREF errors on and off. @param setting true to turn on error checking, false to turn off error checking 
public	TokenNamepublic	
void	TokenNamevoid	
setIdIdrefChecking	TokenNameIdentifier	 set Id Idref Checking
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setting	TokenNameIdentifier	 setting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fIdIdrefChecking	TokenNameIdentifier	 f Id Idref Checking
=	TokenNameEQUAL	
setting	TokenNameIdentifier	 setting
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turns checking for unparsed entity errors on and off. * @param setting true to turn on error checking, * false to turn off error checking */	TokenNameCOMMENT_JAVADOC	 Turns checking for unparsed entity errors on and off. @param setting true to turn on error checking, false to turn off error checking 
public	TokenNamepublic	
void	TokenNamevoid	
setUnparsedEntityChecking	TokenNameIdentifier	 set Unparsed Entity Checking
(	TokenNameLPAREN	
boolean	TokenNameboolean	
setting	TokenNameIdentifier	 setting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fUnparsedEntityChecking	TokenNameIdentifier	 f Unparsed Entity Checking
=	TokenNameEQUAL	
setting	TokenNameIdentifier	 setting
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if all IDREFs have a corresponding ID. * @return null, if ID/IDREF checking is turned off * otherwise, returns the value of the super implementation */	TokenNameCOMMENT_JAVADOC	 Checks if all IDREFs have a corresponding ID. @return null, if ID/IDREF checking is turned off otherwise, returns the value of the super implementation 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
checkIDRefID	TokenNameIdentifier	 check ID Ref ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fIdIdrefChecking	TokenNameIdentifier	 f Id Idref Checking
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
checkIDRefID	TokenNameIdentifier	 check ID Ref ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if an ID has already been declared. * @return false, if ID/IDREF checking is turned off * otherwise, returns the value of the super implementation */	TokenNameCOMMENT_JAVADOC	 Checks if an ID has already been declared. @return false, if ID/IDREF checking is turned off otherwise, returns the value of the super implementation 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIdDeclared	TokenNameIdentifier	 is Id Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fIdIdrefChecking	TokenNameIdentifier	 f Id Idref Checking
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
isIdDeclared	TokenNameIdentifier	 is Id Declared
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if an entity is declared. * @return true, if unparsed entity checking is turned off * otherwise, returns the value of the super implementation */	TokenNameCOMMENT_JAVADOC	 Checks if an entity is declared. @return true, if unparsed entity checking is turned off otherwise, returns the value of the super implementation 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEntityDeclared	TokenNameIdentifier	 is Entity Declared
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fUnparsedEntityChecking	TokenNameIdentifier	 f Unparsed Entity Checking
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
isEntityDeclared	TokenNameIdentifier	 is Entity Declared
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if an entity is unparsed. * @return true, if unparsed entity checking is turned off * otherwise, returns the value of the super implementation */	TokenNameCOMMENT_JAVADOC	 Checks if an entity is unparsed. @return true, if unparsed entity checking is turned off otherwise, returns the value of the super implementation 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEntityUnparsed	TokenNameIdentifier	 is Entity Unparsed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fUnparsedEntityChecking	TokenNameIdentifier	 f Unparsed Entity Checking
)	TokenNameRPAREN	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
isEntityUnparsed	TokenNameIdentifier	 is Entity Unparsed
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
:	TokenNameCOLON	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the ID, if ID/IDREF checking is enabled. * @param name the ID to add */	TokenNameCOMMENT_JAVADOC	 Adds the ID, if ID/IDREF checking is enabled. @param name the ID to add 
public	TokenNamepublic	
void	TokenNamevoid	
addId	TokenNameIdentifier	 add Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fIdIdrefChecking	TokenNameIdentifier	 f Id Idref Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
addId	TokenNameIdentifier	 add Id
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the IDREF, if ID/IDREF checking is enabled. * @param name the IDREF to add */	TokenNameCOMMENT_JAVADOC	 Adds the IDREF, if ID/IDREF checking is enabled. @param name the IDREF to add 
public	TokenNamepublic	
void	TokenNamevoid	
addIdRef	TokenNameIdentifier	 add Id Ref
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fIdIdrefChecking	TokenNameIdentifier	 f Id Idref Checking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
addIdRef	TokenNameIdentifier	 add Id Ref
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
