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
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/*** * Interface which represents a regular expression, and the operations * that can be performed on it. * */	TokenNameCOMMENT_JAVADOC	* Interface which represents a regular expression, and the operations that can be performed on it. 
public	TokenNamepublic	
interface	TokenNameinterface	
Regexp	TokenNameIdentifier	 Regexp
extends	TokenNameextends	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
{	TokenNameLBRACE	
/** * Replace only the first occurrence of the regular expression */	TokenNameCOMMENT_JAVADOC	 Replace only the first occurrence of the regular expression 
int	TokenNameint	
REPLACE_FIRST	TokenNameIdentifier	 REPLACE  FIRST
=	TokenNameEQUAL	
0x00000001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Replace all occurrences of the regular expression */	TokenNameCOMMENT_JAVADOC	 Replace all occurrences of the regular expression 
int	TokenNameint	
REPLACE_ALL	TokenNameIdentifier	 REPLACE  ALL
=	TokenNameEQUAL	
0x00000010	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Perform a substitution on the regular expression. * @param input The string to substitute on * @param argument The string which defines the substitution * @param options The list of options for the match and replace. See the * MATCH_ and REPLACE_ constants above. * @return the result of the operation * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Perform a substitution on the regular expression. @param input The string to substitute on @param argument The string which defines the substitution @param options The list of options for the match and replace. See the MATCH_ and REPLACE_ constants above. @return the result of the operation @throws BuildException on error 
String	TokenNameIdentifier	 String
substitute	TokenNameIdentifier	 substitute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
