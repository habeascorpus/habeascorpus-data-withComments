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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Maps dotted package name matches to a directory name. * This is the inverse of the package mapper. * This is useful for matching XML formatter results against their JUnit test * cases. * <pre> * &lt;mapper classname="org.apache.tools.ant.util.UnPackageNameMapper" * from="${test.data.dir}/TEST-*Test.xml" to="*Test.java"&gt; * </pre> * * */	TokenNameCOMMENT_JAVADOC	 Maps dotted package name matches to a directory name. This is the inverse of the package mapper. This is useful for matching XML formatter results against their JUnit test cases. <pre> &lt;mapper classname="org.apache.tools.ant.util.UnPackageNameMapper" from="${test.data.dir}/TEST-*Test.xml" to="*Test.java"&gt; </pre> * 
public	TokenNamepublic	
class	TokenNameclass	
UnPackageNameMapper	TokenNameIdentifier	 Un Package Name Mapper
extends	TokenNameextends	
GlobPatternMapper	TokenNameIdentifier	 Glob Pattern Mapper
{	TokenNameLBRACE	
/** * Returns the part of the given string that matches the * in the * &quot;from&quot; pattern replacing dots with file separators * *@param name Source filename *@return Replaced variable part */	TokenNameCOMMENT_JAVADOC	 Returns the part of the given string that matches the in the &quot;from&quot; pattern replacing dots with file separators *@param name Source filename *@return Replaced variable part 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
extractVariablePart	TokenNameIdentifier	 extract Variable Part
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prefixLength	TokenNameIdentifier	 prefix Length
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
postfixLength	TokenNameIdentifier	 postfix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
