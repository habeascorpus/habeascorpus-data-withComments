package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
hunspell	TokenNameIdentifier	 hunspell
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
;	TokenNameSEMICOLON	
/** * Wrapper class representing a hunspell affix */	TokenNameCOMMENT_JAVADOC	 Wrapper class representing a hunspell affix 
public	TokenNamepublic	
class	TokenNameclass	
HunspellAffix	TokenNameIdentifier	 Hunspell Affix
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
append	TokenNameIdentifier	 append
;	TokenNameSEMICOLON	
// the affix itself, what is appended 	TokenNameCOMMENT_LINE	the affix itself, what is appended 
private	TokenNameprivate	
char	TokenNamechar	
appendFlags	TokenNameIdentifier	 append Flags
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// continuation class flags 	TokenNameCOMMENT_LINE	continuation class flags 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
strip	TokenNameIdentifier	 strip
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Pattern	TokenNameIdentifier	 Pattern
conditionPattern	TokenNameIdentifier	 condition Pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
crossProduct	TokenNameIdentifier	 cross Product
;	TokenNameSEMICOLON	
/** * Checks whether the given text matches the conditional pattern on this affix * * @param text Text to check if it matches the affix's conditional pattern * @return {@code true} if the text meets the condition, {@code false} otherwise */	TokenNameCOMMENT_JAVADOC	 Checks whether the given text matches the conditional pattern on this affix * @param text Text to check if it matches the affix's conditional pattern @return {@code true} if the text meets the condition, {@code false} otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
checkCondition	TokenNameIdentifier	 check Condition
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
conditionPattern	TokenNameIdentifier	 condition Pattern
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the append defined for the affix * * @return Defined append */	TokenNameCOMMENT_JAVADOC	 Returns the append defined for the affix * @return Defined append 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAppend	TokenNameIdentifier	 get Append
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
append	TokenNameIdentifier	 append
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the append defined for the affix * * @param append Defined append for the affix */	TokenNameCOMMENT_JAVADOC	 Sets the append defined for the affix * @param append Defined append for the affix 
public	TokenNamepublic	
void	TokenNamevoid	
setAppend	TokenNameIdentifier	 set Append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
append	TokenNameIdentifier	 append
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
=	TokenNameEQUAL	
append	TokenNameIdentifier	 append
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the flags defined for the affix append * * @return Flags defined for the affix append */	TokenNameCOMMENT_JAVADOC	 Returns the flags defined for the affix append * @return Flags defined for the affix append 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAppendFlags	TokenNameIdentifier	 get Append Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
appendFlags	TokenNameIdentifier	 append Flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the flags defined for the affix append * * @param appendFlags Flags defined for the affix append */	TokenNameCOMMENT_JAVADOC	 Sets the flags defined for the affix append * @param appendFlags Flags defined for the affix append 
public	TokenNamepublic	
void	TokenNamevoid	
setAppendFlags	TokenNameIdentifier	 set Append Flags
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
appendFlags	TokenNameIdentifier	 append Flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
appendFlags	TokenNameIdentifier	 append Flags
=	TokenNameEQUAL	
appendFlags	TokenNameIdentifier	 append Flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the stripping characters defined for the affix * * @return Stripping characters defined for the affix */	TokenNameCOMMENT_JAVADOC	 Returns the stripping characters defined for the affix * @return Stripping characters defined for the affix 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStrip	TokenNameIdentifier	 get Strip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strip	TokenNameIdentifier	 strip
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the stripping characters defined for the affix * * @param strip Stripping characters defined for the affix */	TokenNameCOMMENT_JAVADOC	 Sets the stripping characters defined for the affix * @param strip Stripping characters defined for the affix 
public	TokenNamepublic	
void	TokenNamevoid	
setStrip	TokenNameIdentifier	 set Strip
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
strip	TokenNameIdentifier	 strip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
strip	TokenNameIdentifier	 strip
=	TokenNameEQUAL	
strip	TokenNameIdentifier	 strip
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the condition that must be met before the affix can be applied * * @return Condition that must be met before the affix can be applied */	TokenNameCOMMENT_JAVADOC	 Returns the condition that must be met before the affix can be applied * @return Condition that must be met before the affix can be applied 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCondition	TokenNameIdentifier	 get Condition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the condition that must be met before the affix can be applied * * @param condition Condition to be met before affix application * @param pattern Condition as a regular expression pattern */	TokenNameCOMMENT_JAVADOC	 Sets the condition that must be met before the affix can be applied * @param condition Condition to be met before affix application @param pattern Condition as a regular expression pattern 
public	TokenNamepublic	
void	TokenNamevoid	
setCondition	TokenNameIdentifier	 set Condition
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
condition	TokenNameIdentifier	 condition
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
condition	TokenNameIdentifier	 condition
=	TokenNameEQUAL	
condition	TokenNameIdentifier	 condition
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
conditionPattern	TokenNameIdentifier	 condition Pattern
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the affix flag * * @return Affix flag */	TokenNameCOMMENT_JAVADOC	 Returns the affix flag * @return Affix flag 
public	TokenNamepublic	
char	TokenNamechar	
getFlag	TokenNameIdentifier	 get Flag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the affix flag * * @param flag Affix flag */	TokenNameCOMMENT_JAVADOC	 Sets the affix flag * @param flag Affix flag 
public	TokenNamepublic	
void	TokenNamevoid	
setFlag	TokenNameIdentifier	 set Flag
(	TokenNameLPAREN	
char	TokenNamechar	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
flag	TokenNameIdentifier	 flag
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the affix is defined as cross product * * @return {@code true} if the affix is cross product, {@code false} otherwise */	TokenNameCOMMENT_JAVADOC	 Returns whether the affix is defined as cross product * @return {@code true} if the affix is cross product, {@code false} otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCrossProduct	TokenNameIdentifier	 is Cross Product
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
crossProduct	TokenNameIdentifier	 cross Product
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets whether the affix is defined as cross product * * @param crossProduct Whether the affix is defined as cross product */	TokenNameCOMMENT_JAVADOC	 Sets whether the affix is defined as cross product * @param crossProduct Whether the affix is defined as cross product 
public	TokenNamepublic	
void	TokenNamevoid	
setCrossProduct	TokenNameIdentifier	 set Cross Product
(	TokenNameLPAREN	
boolean	TokenNameboolean	
crossProduct	TokenNameIdentifier	 cross Product
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
crossProduct	TokenNameIdentifier	 cross Product
=	TokenNameEQUAL	
crossProduct	TokenNameIdentifier	 cross Product
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
