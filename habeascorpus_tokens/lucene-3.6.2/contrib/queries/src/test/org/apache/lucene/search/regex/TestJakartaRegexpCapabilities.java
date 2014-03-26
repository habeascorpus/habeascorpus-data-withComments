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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
/** * Testcase for {@link JakartaRegexpCapabilities} */	TokenNameCOMMENT_JAVADOC	 Testcase for {@link JakartaRegexpCapabilities} 
public	TokenNamepublic	
class	TokenNameclass	
TestJakartaRegexpCapabilities	TokenNameIdentifier	 Test Jakarta Regexp Capabilities
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testGetPrefix	TokenNameIdentifier	 test Get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
cap	TokenNameIdentifier	 cap
=	TokenNameEQUAL	
new	TokenNamenew	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"luc[e]?"	TokenNameStringLiteral	luc[e]?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"luce"	TokenNameStringLiteral	luce
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"luc"	TokenNameStringLiteral	luc
,	TokenNameCOMMA	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"lucene"	TokenNameStringLiteral	lucene
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"lucene"	TokenNameStringLiteral	lucene
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"lucene"	TokenNameStringLiteral	lucene
,	TokenNameCOMMA	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShakyPrefix	TokenNameIdentifier	 test Shaky Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
cap	TokenNameIdentifier	 cap
=	TokenNameEQUAL	
new	TokenNamenew	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"(ab|ac)"	TokenNameStringLiteral	(ab|ac)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"ab"	TokenNameStringLiteral	ab
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
"ac"	TokenNameStringLiteral	ac
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// why is it not a??? 	TokenNameCOMMENT_LINE	why is it not a??? 
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
cap	TokenNameIdentifier	 cap
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
