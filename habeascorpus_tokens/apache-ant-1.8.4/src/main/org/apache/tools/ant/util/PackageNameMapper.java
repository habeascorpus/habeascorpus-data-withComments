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
/** * Maps directory name matches into a dotted package name. This is * useful for matching JUnit test cases againt their XML formatter * results. * <pre> * &lt;mapper classname="org.apache.tools.ant.util.PackageNameMapper" * from="*Test.java" to="${test.data.dir}/TEST-*Test.xml"/&gt; * </pre> * */	TokenNameCOMMENT_JAVADOC	 Maps directory name matches into a dotted package name. This is useful for matching JUnit test cases againt their XML formatter results. <pre> &lt;mapper classname="org.apache.tools.ant.util.PackageNameMapper" from="*Test.java" to="${test.data.dir}/TEST-*Test.xml"/&gt; </pre> 
public	TokenNamepublic	
class	TokenNameclass	
PackageNameMapper	TokenNameIdentifier	 Package Name Mapper
extends	TokenNameextends	
GlobPatternMapper	TokenNameIdentifier	 Glob Pattern Mapper
{	TokenNameLBRACE	
/** * Returns the part of the given string that matches the * in the * &quot;from&quot; pattern replacing file separators with dots * *@param name Source filename *@return Replaced variable part */	TokenNameCOMMENT_JAVADOC	 Returns the part of the given string that matches the in the &quot;from&quot; pattern replacing file separators with dots *@param name Source filename *@return Replaced variable part 
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
if	TokenNameif	
(	TokenNameLPAREN	
getHandleDirSep	TokenNameIdentifier	 get Handle Dir Sep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
