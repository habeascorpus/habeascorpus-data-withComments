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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
/** * Enum used in (@link Extension) to indicate the compatability * of one extension to another. See (@link Extension) for instances * of object. * * WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING * This file is from excalibur.extension package. Dont edit this file * directly as there is no unit tests to make sure it is operational * in ant. Edit file in excalibur and run tests there before changing * ants file. * WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING * * @see Extension */	TokenNameCOMMENT_JAVADOC	 Enum used in (@link Extension) to indicate the compatability of one extension to another. See (@link Extension) for instances of object. * WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING This file is from excalibur.extension package. Dont edit this file directly as there is no unit tests to make sure it is operational in ant. Edit file in excalibur and run tests there before changing ants file. WARNING WARNING WARNING WARNING WARNING WARNING WARNING WARNING * @see Extension 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Compatability	TokenNameIdentifier	 Compatability
{	TokenNameLBRACE	
/** * A string representaiton of compatability level. */	TokenNameCOMMENT_JAVADOC	 A string representaiton of compatability level. 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * Create a compatability enum with specified name. * * @param name the name of compatability level */	TokenNameCOMMENT_JAVADOC	 Create a compatability enum with specified name. * @param name the name of compatability level 
Compatability	TokenNameIdentifier	 Compatability
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return name of compatability level. * * @return the name of compatability level */	TokenNameCOMMENT_JAVADOC	 Return name of compatability level. * @return the name of compatability level 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
