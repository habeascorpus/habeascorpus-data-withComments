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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
;	TokenNameSEMICOLON	
/** * An implementation tying Java's built-in java.util.regex to RegexQuery. * * Note that because this implementation currently only returns null from * {@link #prefix} that queries using this implementation will enumerate and * attempt to {@link #match} each term for the specified field in the index. */	TokenNameCOMMENT_JAVADOC	 An implementation tying Java's built-in java.util.regex to RegexQuery. * Note that because this implementation currently only returns null from {@link #prefix} that queries using this implementation will enumerate and attempt to {@link #match} each term for the specified field in the index. 
public	TokenNamepublic	
class	TokenNameclass	
JavaUtilRegexCapabilities	TokenNameIdentifier	 Java Util Regex Capabilities
implements	TokenNameimplements	
RegexCapabilities	TokenNameIdentifier	 Regex Capabilities
{	TokenNameLBRACE	
private	TokenNameprivate	
Pattern	TokenNameIdentifier	 Pattern
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Define the optional flags from Pattern that can be used. 	TokenNameCOMMENT_LINE	Define the optional flags from Pattern that can be used. 
// Do this here to keep Pattern contained within this class. 	TokenNameCOMMENT_LINE	Do this here to keep Pattern contained within this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_CANON_EQ	TokenNameIdentifier	 FLAG  CANON  EQ
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
CANON_EQ	TokenNameIdentifier	 CANON  EQ
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_CASE_INSENSITIVE	TokenNameIdentifier	 FLAG  CASE  INSENSITIVE
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
CASE_INSENSITIVE	TokenNameIdentifier	 CASE  INSENSITIVE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_COMMENTS	TokenNameIdentifier	 FLAG  COMMENTS
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
COMMENTS	TokenNameIdentifier	 COMMENTS
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_DOTALL	TokenNameIdentifier	 FLAG  DOTALL
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
DOTALL	TokenNameIdentifier	 DOTALL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_LITERAL	TokenNameIdentifier	 FLAG  LITERAL
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
LITERAL	TokenNameIdentifier	 LITERAL
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_MULTILINE	TokenNameIdentifier	 FLAG  MULTILINE
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
MULTILINE	TokenNameIdentifier	 MULTILINE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_UNICODE_CASE	TokenNameIdentifier	 FLAG  UNICODE  CASE
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
UNICODE_CASE	TokenNameIdentifier	 UNICODE  CASE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_UNIX_LINES	TokenNameIdentifier	 FLAG  UNIX  LINES
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
UNIX_LINES	TokenNameIdentifier	 UNIX  LINES
;	TokenNameSEMICOLON	
/** * Default constructor that uses java.util.regex.Pattern * with its default flags. */	TokenNameCOMMENT_JAVADOC	 Default constructor that uses java.util.regex.Pattern with its default flags. 
public	TokenNamepublic	
JavaUtilRegexCapabilities	TokenNameIdentifier	 Java Util Regex Capabilities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor that allows for the modification of the flags that * the java.util.regex.Pattern will use to compile the regular expression. * This gives the user the ability to fine-tune how the regular expression * to match the functionality that they need. * The {@link java.util.regex.Pattern Pattern} class supports specifying * these fields via the regular expression text itself, but this gives the caller * another option to modify the behavior. Useful in cases where the regular expression text * cannot be modified, or if doing so is undesired. * * @param flags The flags that are ORed together. */	TokenNameCOMMENT_JAVADOC	 Constructor that allows for the modification of the flags that the java.util.regex.Pattern will use to compile the regular expression. This gives the user the ability to fine-tune how the regular expression to match the functionality that they need. The {@link java.util.regex.Pattern Pattern} class supports specifying these fields via the regular expression text itself, but this gives the caller another option to modify the behavior. Useful in cases where the regular expression text cannot be modified, or if doing so is undesired. * @param flags The flags that are ORed together. 
public	TokenNamepublic	
JavaUtilRegexCapabilities	TokenNameIdentifier	 Java Util Regex Capabilities
(	TokenNameLPAREN	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
flags	TokenNameIdentifier	 flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JavaUtilRegexCapabilities	TokenNameIdentifier	 Java Util Regex Capabilities
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JavaUtilRegexCapabilities	TokenNameIdentifier	 Java Util Regex Capabilities
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
!	TokenNameNOT	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
:	TokenNameCOLON	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
