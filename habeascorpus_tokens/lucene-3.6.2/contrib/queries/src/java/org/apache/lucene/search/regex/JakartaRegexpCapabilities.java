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
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
RE	TokenNameIdentifier	 RE
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
REProgram	TokenNameIdentifier	 RE Program
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
/** * Implementation tying <a href="http://jakarta.apache.org/regexp">Jakarta * Regexp</a> to RegexQuery. Jakarta Regepx internally supports a * {@link #prefix} implementation which can offer performance gains under * certain circumstances. Yet, the implementation appears to be rather shaky as * it doesn't always provide a prefix even if one would exist. */	TokenNameCOMMENT_JAVADOC	 Implementation tying <a href="http://jakarta.apache.org/regexp">Jakarta Regexp</a> to RegexQuery. Jakarta Regepx internally supports a {@link #prefix} implementation which can offer performance gains under certain circumstances. Yet, the implementation appears to be rather shaky as it doesn't always provide a prefix even if one would exist. 
public	TokenNamepublic	
class	TokenNameclass	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
implements	TokenNameimplements	
RegexCapabilities	TokenNameIdentifier	 Regex Capabilities
{	TokenNameLBRACE	
private	TokenNameprivate	
RE	TokenNameIdentifier	 RE
regexp	TokenNameIdentifier	 regexp
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Field	TokenNameIdentifier	 Field
prefixField	TokenNameIdentifier	 prefix Field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Method	TokenNameIdentifier	 Method
getPrefixMethod	TokenNameIdentifier	 get Prefix Method
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
getPrefixMethod	TokenNameIdentifier	 get Prefix Method
=	TokenNameEQUAL	
REProgram	TokenNameIdentifier	 RE Program
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getPrefix"	TokenNameStringLiteral	getPrefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getPrefixMethod	TokenNameIdentifier	 get Prefix Method
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
prefixField	TokenNameIdentifier	 prefix Field
=	TokenNameEQUAL	
REProgram	TokenNameIdentifier	 RE Program
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getDeclaredField	TokenNameIdentifier	 get Declared Field
(	TokenNameLPAREN	
"prefix"	TokenNameStringLiteral	prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefixField	TokenNameIdentifier	 prefix Field
.	TokenNameDOT	
setAccessible	TokenNameIdentifier	 set Accessible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixField	TokenNameIdentifier	 prefix Field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Define the flags that are possible. Redefine them here 	TokenNameCOMMENT_LINE	Define the flags that are possible. Redefine them here 
// to avoid exposing the RE class to the caller. 	TokenNameCOMMENT_LINE	to avoid exposing the RE class to the caller. 
private	TokenNameprivate	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
RE	TokenNameIdentifier	 RE
.	TokenNameDOT	
MATCH_NORMAL	TokenNameIdentifier	 MATCH  NORMAL
;	TokenNameSEMICOLON	
/** * Flag to specify normal, case-sensitive matching behaviour. This is the default. */	TokenNameCOMMENT_JAVADOC	 Flag to specify normal, case-sensitive matching behaviour. This is the default. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_MATCH_NORMAL	TokenNameIdentifier	 FLAG  MATCH  NORMAL
=	TokenNameEQUAL	
RE	TokenNameIdentifier	 RE
.	TokenNameDOT	
MATCH_NORMAL	TokenNameIdentifier	 MATCH  NORMAL
;	TokenNameSEMICOLON	
/** * Flag to specify that matching should be case-independent (folded) */	TokenNameCOMMENT_JAVADOC	 Flag to specify that matching should be case-independent (folded) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FLAG_MATCH_CASEINDEPENDENT	TokenNameIdentifier	 FLAG  MATCH  CASEINDEPENDENT
=	TokenNameEQUAL	
RE	TokenNameIdentifier	 RE
.	TokenNameDOT	
MATCH_CASEINDEPENDENT	TokenNameIdentifier	 MATCH  CASEINDEPENDENT
;	TokenNameSEMICOLON	
/** * Constructs a RegexCapabilities with the default MATCH_NORMAL match style. */	TokenNameCOMMENT_JAVADOC	 Constructs a RegexCapabilities with the default MATCH_NORMAL match style. 
public	TokenNamepublic	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructs a RegexCapabilities with the provided match flags. * Multiple flags should be ORed together. * * @param flags The matching style */	TokenNameCOMMENT_JAVADOC	 Constructs a RegexCapabilities with the provided match flags. Multiple flags should be ORed together. * @param flags The matching style 
public	TokenNamepublic	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
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
regexp	TokenNameIdentifier	 regexp
=	TokenNameEQUAL	
new	TokenNamenew	
RE	TokenNameIdentifier	 RE
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
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getPrefixMethod	TokenNameIdentifier	 get Prefix Method
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
getPrefixMethod	TokenNameIdentifier	 get Prefix Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
getProgram	TokenNameIdentifier	 get Program
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
prefixField	TokenNameIdentifier	 prefix Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
prefixField	TokenNameIdentifier	 prefix Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
getProgram	TokenNameIdentifier	 get Program
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we cannot get the prefix, return none 	TokenNameCOMMENT_LINE	if we cannot get the prefix, return none 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
regexp	TokenNameIdentifier	 regexp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
!	TokenNameNOT	
regexp	TokenNameIdentifier	 regexp
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
)	TokenNameRPAREN	
:	TokenNameCOLON	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
regexp	TokenNameIdentifier	 regexp
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
regexp	TokenNameIdentifier	 regexp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
regexp	TokenNameIdentifier	 regexp
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
