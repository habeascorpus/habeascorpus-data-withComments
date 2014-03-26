/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
/** * An instance of this class has ranges captured in matching. * * @xerces.internal * * @see RegularExpression#matches(char[], int, int, Match) * @see RegularExpression#matches(char[], Match) * @see RegularExpression#matches(java.text.CharacterIterator, Match) * @see RegularExpression#matches(java.lang.String, int, int, Match) * @see RegularExpression#matches(java.lang.String, Match) * @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt; * @version $Id: Match.java 446721 2006-09-15 20:35:34Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 An instance of this class has ranges captured in matching. * @xerces.internal * @see RegularExpression#matches(char[], int, int, Match) @see RegularExpression#matches(char[], Match) @see RegularExpression#matches(java.text.CharacterIterator, Match) @see RegularExpression#matches(java.lang.String, int, int, Match) @see RegularExpression#matches(java.lang.String, Match) @author TAMURA Kent &lt;kent@trl.ibm.co.jp&gt; @version $Id: Match.java 446721 2006-09-15 20:35:34Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
Match	TokenNameIdentifier	 Match
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
beginpos	TokenNameIdentifier	 beginpos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
endpos	TokenNameIdentifier	 endpos
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
nofgroups	TokenNameIdentifier	 nofgroups
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
CharacterIterator	TokenNameIdentifier	 Character Iterator
ciSource	TokenNameIdentifier	 ci Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
strSource	TokenNameIdentifier	 str Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charSource	TokenNameIdentifier	 char Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Creates an instance. */	TokenNameCOMMENT_JAVADOC	 Creates an instance. 
public	TokenNamepublic	
Match	TokenNameIdentifier	 Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Match	TokenNameIdentifier	 Match
ma	TokenNameIdentifier	 ma
=	TokenNameEQUAL	
new	TokenNamenew	
Match	TokenNameIdentifier	 Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ma	TokenNameIdentifier	 ma
.	TokenNameDOT	
setNumberOfGroups	TokenNameIdentifier	 set Number Of Groups
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ciSource	TokenNameIdentifier	 ci Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ma	TokenNameIdentifier	 ma
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ciSource	TokenNameIdentifier	 ci Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
strSource	TokenNameIdentifier	 str Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ma	TokenNameIdentifier	 ma
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
strSource	TokenNameIdentifier	 str Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ma	TokenNameIdentifier	 ma
.	TokenNameDOT	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getBeginning	TokenNameIdentifier	 get Beginning
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ma	TokenNameIdentifier	 ma
.	TokenNameDOT	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ma	TokenNameIdentifier	 ma
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
protected	TokenNameprotected	
void	TokenNamevoid	
setNumberOfGroups	TokenNameIdentifier	 set Number Of Groups
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oldn	TokenNameIdentifier	 oldn
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldn	TokenNameIdentifier	 oldn
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
oldn	TokenNameIdentifier	 oldn
<	TokenNameLESS	
n	TokenNameIdentifier	 n
||	TokenNameOR_OR	
n	TokenNameIdentifier	 n
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
<	TokenNameLESS	
oldn	TokenNameIdentifier	 oldn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
beginpos	TokenNameIdentifier	 beginpos
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endpos	TokenNameIdentifier	 endpos
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
beginpos	TokenNameIdentifier	 beginpos
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endpos	TokenNameIdentifier	 endpos
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
protected	TokenNameprotected	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
ci	TokenNameIdentifier	 ci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ciSource	TokenNameIdentifier	 ci Source
=	TokenNameEQUAL	
ci	TokenNameIdentifier	 ci
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strSource	TokenNameIdentifier	 str Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charSource	TokenNameIdentifier	 char Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
protected	TokenNameprotected	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ciSource	TokenNameIdentifier	 ci Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strSource	TokenNameIdentifier	 str Source
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charSource	TokenNameIdentifier	 char Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
protected	TokenNameprotected	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ciSource	TokenNameIdentifier	 ci Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strSource	TokenNameIdentifier	 str Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charSource	TokenNameIdentifier	 char Source
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
protected	TokenNameprotected	
void	TokenNamevoid	
setBeginning	TokenNameIdentifier	 set Beginning
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
int	TokenNameint	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
beginpos	TokenNameIdentifier	 beginpos
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
protected	TokenNameprotected	
void	TokenNamevoid	
setEnd	TokenNameIdentifier	 set End
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
int	TokenNameint	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
endpos	TokenNameIdentifier	 endpos
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the number of regular expression groups. * This method returns 1 when the regular expression has no capturing-parenthesis. */	TokenNameCOMMENT_JAVADOC	 Return the number of regular expression groups. This method returns 1 when the regular expression has no capturing-parenthesis. 
public	TokenNamepublic	
int	TokenNameint	
getNumberOfGroups	TokenNameIdentifier	 get Number Of Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"A result is not set."	TokenNameStringLiteral	A result is not set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a start position in the target text matched to specified regular expression group. * * @param index Less than <code>getNumberOfGroups()</code>. */	TokenNameCOMMENT_JAVADOC	 Return a start position in the target text matched to specified regular expression group. * @param index Less than <code>getNumberOfGroups()</code>. 
public	TokenNamepublic	
int	TokenNameint	
getBeginning	TokenNameIdentifier	 get Beginning
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
beginpos	TokenNameIdentifier	 beginpos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"A result is not set."	TokenNameStringLiteral	A result is not set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
<=	TokenNameLESS_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The parameter must be less than "	TokenNameStringLiteral	The parameter must be less than 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
beginpos	TokenNameIdentifier	 beginpos
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an end position in the target text matched to specified regular expression group. * * @param index Less than <code>getNumberOfGroups()</code>. */	TokenNameCOMMENT_JAVADOC	 Return an end position in the target text matched to specified regular expression group. * @param index Less than <code>getNumberOfGroups()</code>. 
public	TokenNamepublic	
int	TokenNameint	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
endpos	TokenNameIdentifier	 endpos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"A result is not set."	TokenNameStringLiteral	A result is not set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
<=	TokenNameLESS_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The parameter must be less than "	TokenNameStringLiteral	The parameter must be less than 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
endpos	TokenNameIdentifier	 endpos
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return an substring of the target text matched to specified regular expression group. * * @param index Less than <code>getNumberOfGroups()</code>. */	TokenNameCOMMENT_JAVADOC	 Return an substring of the target text matched to specified regular expression group. * @param index Less than <code>getNumberOfGroups()</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCapturedText	TokenNameIdentifier	 get Captured Text
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
beginpos	TokenNameIdentifier	 beginpos
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"match() has never been called."	TokenNameStringLiteral	match() has never been called.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
<=	TokenNameLESS_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The parameter must be less than "	TokenNameStringLiteral	The parameter must be less than 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
nofgroups	TokenNameIdentifier	 nofgroups
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
beginpos	TokenNameIdentifier	 beginpos
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
endpos	TokenNameIdentifier	 endpos
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
end	TokenNameIdentifier	 end
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ciSource	TokenNameIdentifier	 ci Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
REUtil	TokenNameIdentifier	 RE Util
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ciSource	TokenNameIdentifier	 ci Source
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
strSource	TokenNameIdentifier	 str Source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
strSource	TokenNameIdentifier	 str Source
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
charSource	TokenNameIdentifier	 char Source
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
