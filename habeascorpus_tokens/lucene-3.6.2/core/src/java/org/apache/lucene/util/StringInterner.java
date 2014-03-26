package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Subclasses of StringInterner are required to * return the same single String object for all equal strings. * Depending on the implementation, this may not be * the same object returned as String.intern(). * * This StringInterner base class simply delegates to String.intern(). */	TokenNameCOMMENT_JAVADOC	 Subclasses of StringInterner are required to return the same single String object for all equal strings. Depending on the implementation, this may not be the same object returned as String.intern(). * This StringInterner base class simply delegates to String.intern(). 
public	TokenNamepublic	
class	TokenNameclass	
StringInterner	TokenNameIdentifier	 String Interner
{	TokenNameLBRACE	
/** Returns a single object instance for each equal string. */	TokenNameCOMMENT_JAVADOC	 Returns a single object instance for each equal string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a single object instance for each equal string. */	TokenNameCOMMENT_JAVADOC	 Returns a single object instance for each equal string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
arr	TokenNameIdentifier	 arr
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
