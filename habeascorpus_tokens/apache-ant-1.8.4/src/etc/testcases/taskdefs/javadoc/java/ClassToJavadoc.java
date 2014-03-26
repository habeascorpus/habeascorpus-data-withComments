/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
etc	TokenNameIdentifier	 etc
.	TokenNameDOT	
testcases	TokenNameIdentifier	 testcases
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
javadoc	TokenNameIdentifier	 javadoc
.	TokenNameDOT	
java	TokenNameIdentifier	 java
;	TokenNameSEMICOLON	
/** * This is a simple class to provide grist for the javadoc mill * while testing it. */	TokenNameCOMMENT_JAVADOC	 This is a simple class to provide grist for the javadoc mill while testing it. 
public	TokenNamepublic	
class	TokenNameclass	
ClassToJavadoc	TokenNameIdentifier	 Class To Javadoc
{	TokenNameLBRACE	
/** * @param anArgument A String that is ignored */	TokenNameCOMMENT_JAVADOC	 @param anArgument A String that is ignored 
public	TokenNamepublic	
void	TokenNamevoid	
methodToJavadoc	TokenNameIdentifier	 method To Javadoc
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
anArgument	TokenNameIdentifier	 an Argument
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @see java.lang.Object#toString() */	TokenNameCOMMENT_JAVADOC	 @see java.lang.Object#toString() 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return An arbitrary string. */	TokenNameCOMMENT_JAVADOC	 @return An arbitrary string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
anotherString	TokenNameIdentifier	 another String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"An arbitrary string."	TokenNameStringLiteral	An arbitrary string.
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
