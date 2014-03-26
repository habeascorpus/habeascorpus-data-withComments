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
// CheckStyle:HideUtilityClassConstructorCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF - bc 
/*** * Regular expression utilities class which handles flag operations. * */	TokenNameCOMMENT_JAVADOC	* Regular expression utilities class which handles flag operations. 
public	TokenNamepublic	
class	TokenNameclass	
RegexpUtil	TokenNameIdentifier	 Regexp Util
{	TokenNameLBRACE	
/** * Check the options has a particular flag set. * * @param options an <code>int</code> value * @param flag an <code>int</code> value * @return true if the flag is set */	TokenNameCOMMENT_JAVADOC	 Check the options has a particular flag set. * @param options an <code>int</code> value @param flag an <code>int</code> value @return true if the flag is set 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
hasFlag	TokenNameIdentifier	 has Flag
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
&	TokenNameAND	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove a particular flag from an int value contains the option flags. * * @param options an <code>int</code> value * @param flag an <code>int</code> value * @return the options with the flag unset */	TokenNameCOMMENT_JAVADOC	 Remove a particular flag from an int value contains the option flags. * @param options an <code>int</code> value @param flag an <code>int</code> value @return the options with the flag unset 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
removeFlag	TokenNameIdentifier	 remove Flag
(	TokenNameLPAREN	
int	TokenNameint	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
int	TokenNameint	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
options	TokenNameIdentifier	 options
&	TokenNameAND	
(	TokenNameLPAREN	
0xFFFFFFFF	TokenNameIntegerLiteral	
-	TokenNameMINUS	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * convert regex option flag characters to regex options * <dl> * <li>g - Regexp.REPLACE_ALL</li> * <li>i - RegexpMatcher.MATCH_CASE_INSENSITIVE</li> * <li>m - RegexpMatcher.MATCH_MULTILINE</li> * <li>s - RegexpMatcher.MATCH_SINGLELINE</li> * </dl> * @param flags the string containing the flags * @return the Regexp option bits * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 convert regex option flag characters to regex options <dl> <li>g - Regexp.REPLACE_ALL</li> <li>i - RegexpMatcher.MATCH_CASE_INSENSITIVE</li> <li>m - RegexpMatcher.MATCH_MULTILINE</li> <li>s - RegexpMatcher.MATCH_SINGLELINE</li> </dl> @param flags the string containing the flags @return the Regexp option bits @since Ant 1.8.2 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
asOptions	TokenNameIdentifier	 as Options
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_DEFAULT	TokenNameIdentifier	 MATCH  DEFAULT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
asOptions	TokenNameIdentifier	 as Options
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'i'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'm'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
flags	TokenNameIdentifier	 flags
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'g'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
options	TokenNameIdentifier	 options
|=	TokenNameOR_EQUAL	
Regexp	TokenNameIdentifier	 Regexp
.	TokenNameDOT	
REPLACE_ALL	TokenNameIdentifier	 REPLACE  ALL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert flag to regex options. * * @param caseSensitive opposite of RegexpMatcher.MATCH_CASE_INSENSITIVE * @return the Regexp option bits * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Convert flag to regex options. * @param caseSensitive opposite of RegexpMatcher.MATCH_CASE_INSENSITIVE @return the Regexp option bits @since Ant 1.8.2 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
asOptions	TokenNameIdentifier	 as Options
(	TokenNameLPAREN	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
asOptions	TokenNameIdentifier	 as Options
(	TokenNameLPAREN	
caseSensitive	TokenNameIdentifier	 case Sensitive
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert flags to regex options. * * @param caseSensitive opposite of RegexpMatcher.MATCH_CASE_INSENSITIVE * @param multiLine RegexpMatcher.MATCH_MULTILINE * @param singleLine RegexpMatcher.MATCH_SINGLELINE * @return the Regexp option bits * @since Ant 1.8.2 */	TokenNameCOMMENT_JAVADOC	 Convert flags to regex options. * @param caseSensitive opposite of RegexpMatcher.MATCH_CASE_INSENSITIVE @param multiLine RegexpMatcher.MATCH_MULTILINE @param singleLine RegexpMatcher.MATCH_SINGLELINE @return the Regexp option bits @since Ant 1.8.2 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
asOptions	TokenNameIdentifier	 as Options
(	TokenNameLPAREN	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
,	TokenNameCOMMA	
boolean	TokenNameboolean	
multiLine	TokenNameIdentifier	 multi Line
,	TokenNameCOMMA	
boolean	TokenNameboolean	
singleLine	TokenNameIdentifier	 single Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_DEFAULT	TokenNameIdentifier	 MATCH  DEFAULT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
caseSensitive	TokenNameIdentifier	 case Sensitive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
|	TokenNameOR	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_CASE_INSENSITIVE	TokenNameIdentifier	 MATCH  CASE  INSENSITIVE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
multiLine	TokenNameIdentifier	 multi Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
|	TokenNameOR	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_MULTILINE	TokenNameIdentifier	 MATCH  MULTILINE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
singleLine	TokenNameIdentifier	 single Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
options	TokenNameIdentifier	 options
=	TokenNameEQUAL	
options	TokenNameIdentifier	 options
|	TokenNameOR	
RegexpMatcher	TokenNameIdentifier	 Regexp Matcher
.	TokenNameDOT	
MATCH_SINGLELINE	TokenNameIdentifier	 MATCH  SINGLELINE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
options	TokenNameIdentifier	 options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
