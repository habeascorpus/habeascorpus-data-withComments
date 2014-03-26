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
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
/** * Helper class which can be used for Ant task attribute setter methods to allow * the build file to specify an integer in either decimal, octal, or hexadecimal * format. * * @see java.lang.Integer#decode(String) */	TokenNameCOMMENT_JAVADOC	 Helper class which can be used for Ant task attribute setter methods to allow the build file to specify an integer in either decimal, octal, or hexadecimal format. * @see java.lang.Integer#decode(String) 
public	TokenNamepublic	
class	TokenNameclass	
FlexInteger	TokenNameIdentifier	 Flex Integer
{	TokenNameLBRACE	
private	TokenNameprivate	
Integer	TokenNameIdentifier	 Integer
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Constructor used by Ant's introspection mechanism for attribute population * @param value the value to decode */	TokenNameCOMMENT_JAVADOC	 Constructor used by Ant's introspection mechanism for attribute population @param value the value to decode 
public	TokenNamepublic	
FlexInteger	TokenNameIdentifier	 Flex Integer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the decimal integer value * @return the integer value */	TokenNameCOMMENT_JAVADOC	 Returns the decimal integer value @return the integer value 
public	TokenNamepublic	
int	TokenNameint	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overridden method to return the decimal value for display * @return a string version of the integer */	TokenNameCOMMENT_JAVADOC	 Overridden method to return the decimal value for display @return a string version of the integer 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
