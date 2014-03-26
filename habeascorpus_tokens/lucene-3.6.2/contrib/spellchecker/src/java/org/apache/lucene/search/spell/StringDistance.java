package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spell	TokenNameIdentifier	 spell
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Interface for string distances. */	TokenNameCOMMENT_JAVADOC	 Interface for string distances. 
public	TokenNamepublic	
interface	TokenNameinterface	
StringDistance	TokenNameIdentifier	 String Distance
{	TokenNameLBRACE	
/** * Returns a float between 0 and 1 based on how similar the specified strings are to one another. * Returning a value of 1 means the specified strings are identical and 0 means the * string are maximally different. * @param s1 The first string. * @param s2 The second string. * @return a float between 0 and 1 based on how similar the specified strings are to one another. */	TokenNameCOMMENT_JAVADOC	 Returns a float between 0 and 1 based on how similar the specified strings are to one another. Returning a value of 1 means the specified strings are identical and 0 means the string are maximally different. @param s1 The first string. @param s2 The second string. @return a float between 0 and 1 based on how similar the specified strings are to one another. 
public	TokenNamepublic	
float	TokenNamefloat	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
