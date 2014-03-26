package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Defines basic operations needed by {@link RegexQuery} for a regular * expression implementation. */	TokenNameCOMMENT_JAVADOC	 Defines basic operations needed by {@link RegexQuery} for a regular expression implementation. 
public	TokenNamepublic	
interface	TokenNameinterface	
RegexCapabilities	TokenNameIdentifier	 Regex Capabilities
{	TokenNameLBRACE	
/** * Called by the constructor of {@link RegexTermEnum} allowing * implementations to cache a compiled version of the regular * expression pattern. * * @param pattern regular expression pattern */	TokenNameCOMMENT_JAVADOC	 Called by the constructor of {@link RegexTermEnum} allowing implementations to cache a compiled version of the regular expression pattern. * @param pattern regular expression pattern 
void	TokenNamevoid	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * * @param string * @return true if string matches the pattern last passed to {@link #compile}. */	TokenNameCOMMENT_JAVADOC	 * @param string @return true if string matches the pattern last passed to {@link #compile}. 
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A wise prefix implementation can reduce the term enumeration (and thus increase performance) * of RegexQuery dramatically! * * @return static non-regex prefix of the pattern last passed to {@link #compile}. May return null. */	TokenNameCOMMENT_JAVADOC	 A wise prefix implementation can reduce the term enumeration (and thus increase performance) of RegexQuery dramatically! * @return static non-regex prefix of the pattern last passed to {@link #compile}. May return null. 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
