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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
/** * Interface describing a regular expression matcher. * */	TokenNameCOMMENT_JAVADOC	 Interface describing a regular expression matcher. 
public	TokenNamepublic	
interface	TokenNameinterface	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
{	TokenNameLBRACE	
/*** * Default Mask (case insensitive, neither multiline nor * singleline specified). */	TokenNameCOMMENT_JAVADOC	* Default Mask (case insensitive, neither multiline nor singleline specified). 
int	TokenNameint	
MATCH_DEFAULT	TokenNameIdentifier	 MATCH  DEFAULT
=	TokenNameEQUAL	
0x00000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/*** * Perform a case insenstive match */	TokenNameCOMMENT_JAVADOC	* Perform a case insenstive match 
int	TokenNameint	
MATCH_CASE_INSENSITIVE	TokenNameIdentifier	 MATCH  CASE  INSENSITIVE
=	TokenNameEQUAL	
0x00000100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/*** * Treat the input as a multiline input */	TokenNameCOMMENT_JAVADOC	* Treat the input as a multiline input 
int	TokenNameint	
MATCH_MULTILINE	TokenNameIdentifier	 MATCH  MULTILINE
=	TokenNameEQUAL	
0x00001000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/*** * Treat the input as singleline input ('.' matches newline) */	TokenNameCOMMENT_JAVADOC	* Treat the input as singleline input ('.' matches newline) 
int	TokenNameint	
MATCH_SINGLELINE	TokenNameIdentifier	 MATCH  SINGLELINE
=	TokenNameEQUAL	
0x00010000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Set the regexp pattern from the String description. * @param pattern the pattern to match * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Set the regexp pattern from the String description. @param pattern the pattern to match @throws BuildException on error 
void	TokenNamevoid	
setPattern	TokenNameIdentifier	 set Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Get a String representation of the regexp pattern * @return the pattern * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Get a String representation of the regexp pattern @return the pattern @throws BuildException on error 
String	TokenNameIdentifier	 String
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Does the given argument match the pattern? * @param argument the string to match against * @return true if the pattern matches * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Does the given argument match the pattern? @param argument the string to match against @return true if the pattern matches @throws BuildException on error 
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Returns a Vector of matched groups found in the argument * using default options. * * <p>Group 0 will be the full match, the rest are the * parenthesized subexpressions</p>. * * @param argument the string to match against * @return the vector of groups * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	 Returns a Vector of matched groups found in the argument using default options. * <p>Group 0 will be the full match, the rest are the parenthesized subexpressions</p>. * @param argument the string to match against @return the vector of groups @throws BuildException on error 
Vector	TokenNameIdentifier	 Vector
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argument	TokenNameIdentifier	 argument
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/*** * Does this regular expression match the input, given * certain options * @param input The string to check for a match * @param options The list of options for the match. See the * MATCH_ constants above. * @return true if the pattern matches * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	* Does this regular expression match the input, given certain options @param input The string to check for a match @param options The list of options for the match. See the MATCH_ constants above. @return true if the pattern matches @throws BuildException on error 
boolean	TokenNameboolean	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/*** * Get the match groups from this regular expression. The return * type of the elements is always String. * @param input The string to check for a match * @param options The list of options for the match. See the * MATCH_ constants above. * @return the vector of groups * @throws BuildException on error */	TokenNameCOMMENT_JAVADOC	* Get the match groups from this regular expression. The return type of the elements is always String. @param input The string to check for a match @param options The list of options for the match. See the MATCH_ constants above. @return the vector of groups @throws BuildException on error 
Vector	TokenNameIdentifier	 Vector
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
int	TokenNameint	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
