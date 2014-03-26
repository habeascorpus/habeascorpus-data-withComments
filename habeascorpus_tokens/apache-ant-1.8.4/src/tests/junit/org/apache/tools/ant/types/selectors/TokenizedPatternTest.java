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
.	TokenNameDOT	
selectors	TokenNameIdentifier	 selectors
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TokenizedPatternTest	TokenNameIdentifier	 Tokenized Pattern Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOT_SVN_PATTERN	TokenNameIdentifier	 DOT  SVN  PATTERN
=	TokenNameEQUAL	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
".svn"	TokenNameStringLiteral	.svn
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testTokenization	TokenNameIdentifier	 test Tokenization
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
pat	TokenNameIdentifier	 pat
=	TokenNameEQUAL	
new	TokenNamenew	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
DOT_SVN_PATTERN	TokenNameIdentifier	 DOT  SVN  PATTERN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
DOT_SVN_PATTERN	TokenNameIdentifier	 DOT  SVN  PATTERN
,	TokenNameCOMMA	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
containsPattern	TokenNameIdentifier	 contains Pattern
(	TokenNameLPAREN	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
.	TokenNameDOT	
containsPattern	TokenNameIdentifier	 contains Pattern
(	TokenNameLPAREN	
".svn"	TokenNameStringLiteral	.svn
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEndsWith	TokenNameIdentifier	 test Ends With
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
new	TokenNamenew	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
DOT_SVN_PATTERN	TokenNameIdentifier	 DOT  SVN  PATTERN
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWithoutLastToken	TokenNameIdentifier	 test Without Last Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
SelectorUtils	TokenNameIdentifier	 Selector Utils
.	TokenNameDOT	
DEEP_TREE_MATCH	TokenNameIdentifier	 DEEP  TREE  MATCH
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
+	TokenNamePLUS	
".svn"	TokenNameStringLiteral	.svn
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
new	TokenNamenew	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
DOT_SVN_PATTERN	TokenNameIdentifier	 DOT  SVN  PATTERN
)	TokenNameRPAREN	
.	TokenNameDOT	
withoutLastToken	TokenNameIdentifier	 without Last Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMatchPath	TokenNameIdentifier	 test Match Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
".svn"	TokenNameStringLiteral	.svn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
TokenizedPath	TokenNameIdentifier	 Tokenized Path
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
new	TokenNamenew	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
DOT_SVN_PATTERN	TokenNameIdentifier	 DOT  SVN  PATTERN
)	TokenNameRPAREN	
.	TokenNameDOT	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
new	TokenNamenew	
TokenizedPattern	TokenNameIdentifier	 Tokenized Pattern
(	TokenNameLPAREN	
DOT_SVN_PATTERN	TokenNameIdentifier	 DOT  SVN  PATTERN
)	TokenNameRPAREN	
.	TokenNameDOT	
withoutLastToken	TokenNameIdentifier	 without Last Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
matchPath	TokenNameIdentifier	 match Path
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
