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
/** * Utility class to contain version numbers in "Dewey Decimal" * syntax. Numbers in the "Dewey Decimal" syntax consist of positive * decimal integers separated by periods ".". For example, "2.0" or * "1.2.3.4.5.6.7". This allows an extensible number to be used to * represent major, minor, micro, etc versions. The version number * must begin with a number. * * Original Implementation moved to org.apache.tools.ant.util.DeweyDecimal * @deprecated use org.apache.tools.ant.util.DeweyDecimal instead. * Deprecated since ant 1.8 */	TokenNameCOMMENT_JAVADOC	 Utility class to contain version numbers in "Dewey Decimal" syntax. Numbers in the "Dewey Decimal" syntax consist of positive decimal integers separated by periods ".". For example, "2.0" or "1.2.3.4.5.6.7". This allows an extensible number to be used to represent major, minor, micro, etc versions. The version number must begin with a number. * Original Implementation moved to org.apache.tools.ant.util.DeweyDecimal @deprecated use org.apache.tools.ant.util.DeweyDecimal instead. Deprecated since ant 1.8 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
{	TokenNameLBRACE	
/** * Construct a DeweyDecimal from an array of integer components. * * @param components an array of integer components. */	TokenNameCOMMENT_JAVADOC	 Construct a DeweyDecimal from an array of integer components. * @param components an array of integer components. 
public	TokenNamepublic	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
components	TokenNameIdentifier	 components
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
components	TokenNameIdentifier	 components
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a DeweyDecimal from string in DeweyDecimal format. * * @param string the string in dewey decimal format * @exception NumberFormatException if string is malformed */	TokenNameCOMMENT_JAVADOC	 Construct a DeweyDecimal from string in DeweyDecimal format. * @param string the string in dewey decimal format @exception NumberFormatException if string is malformed 
public	TokenNamepublic	
DeweyDecimal	TokenNameIdentifier	 Dewey Decimal
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
