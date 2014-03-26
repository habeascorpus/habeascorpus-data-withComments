package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
versioning	TokenNameIdentifier	 versioning
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
math	TokenNameIdentifier	 math
.	TokenNameDOT	
BigInteger	TokenNameIdentifier	 Big Integer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListIterator	TokenNameIdentifier	 List Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
/** * Generic implementation of version comparison. * * <p>Features: * <ul> * <li>mixing of '<code>-</code>' (dash) and '<code>.</code>' (dot) separators,</li> * <li>transition between characters and digits also constitutes a separator: * <code>1.0alpha1 =&gt; [1, 0, alpha, 1]</code></li> * <li>unlimited number of version components,</li> * <li>version components in the text can be digits or strings,</li> * <li>strings are checked for well-known qualifiers and the qualifier ordering is used for version ordering. * Well-known qualifiers (case insensitive) are:<ul> * <li><code>snapshot</code></li> * <li><code>alpha</code> or <code>a</code></li> * <li><code>beta</code> or <code>b</code></li> * <li><code>milestone</code> or <code>m</code></li> * <li><code>rc</code> or <code>cr</code></li> * <li><code>(the empty string)</code> or <code>ga</code> or <code>final</code></li> * <li><code>sp</code></li> * </ul> * Unknown qualifiers are considered after known qualifiers, with lexical order (always case insensitive), * </li> * <li>a dash usually precedes a qualifier, and is always less important than something preceded with a dot.</li> * </ul></p> * * @see <a href="https://cwiki.apache.org/confluence/display/MAVENOLD/Versioning">"Versioning" on Maven Wiki</a> * @author <a href="mailto:kenney@apache.org">Kenney Westerhof</a> * @author <a href="mailto:hboutemy@apache.org">Hervé Boutemy</a> */	TokenNameCOMMENT_JAVADOC	 Generic implementation of version comparison. * <p>Features: <ul> <li>mixing of '<code>-</code>' (dash) and '<code>.</code>' (dot) separators,</li> <li>transition between characters and digits also constitutes a separator: <code>1.0alpha1 =&gt; [1, 0, alpha, 1]</code></li> <li>unlimited number of version components,</li> <li>version components in the text can be digits or strings,</li> <li>strings are checked for well-known qualifiers and the qualifier ordering is used for version ordering. Well-known qualifiers (case insensitive) are:<ul> <li><code>snapshot</code></li> <li><code>alpha</code> or <code>a</code></li> <li><code>beta</code> or <code>b</code></li> <li><code>milestone</code> or <code>m</code></li> <li><code>rc</code> or <code>cr</code></li> <li><code>(the empty string)</code> or <code>ga</code> or <code>final</code></li> <li><code>sp</code></li> </ul> Unknown qualifiers are considered after known qualifiers, with lexical order (always case insensitive), </li> <li>a dash usually precedes a qualifier, and is always less important than something preceded with a dot.</li> </ul></p> * @see <a href="https://cwiki.apache.org/confluence/display/MAVENOLD/Versioning">"Versioning" on Maven Wiki</a> @author <a href="mailto:kenney@apache.org">Kenney Westerhof</a> @author <a href="mailto:hboutemy@apache.org">Hervé Boutemy</a> 
public	TokenNamepublic	
class	TokenNameclass	
ComparableVersion	TokenNameIdentifier	 Comparable Version
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
ComparableVersion	TokenNameIdentifier	 Comparable Version
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
canonical	TokenNameIdentifier	 canonical
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ListItem	TokenNameIdentifier	 List Item
items	TokenNameIdentifier	 items
;	TokenNameSEMICOLON	
private	TokenNameprivate	
interface	TokenNameinterface	
Item	TokenNameIdentifier	 Item
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
INTEGER_ITEM	TokenNameIdentifier	 INTEGER  ITEM
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
STRING_ITEM	TokenNameIdentifier	 STRING  ITEM
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
LIST_ITEM	TokenNameIdentifier	 LIST  ITEM
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Item	TokenNameIdentifier	 Item
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isNull	TokenNameIdentifier	 is Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Represents a numeric item in the version item list. */	TokenNameCOMMENT_JAVADOC	 Represents a numeric item in the version item list. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
IntegerItem	TokenNameIdentifier	 Integer Item
implements	TokenNameimplements	
Item	TokenNameIdentifier	 Item
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
BigInteger_ZERO	TokenNameIdentifier	 Big Integer  ZERO
=	TokenNameEQUAL	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IntegerItem	TokenNameIdentifier	 Integer Item
ZERO	TokenNameIdentifier	 ZERO
=	TokenNameEQUAL	
new	TokenNamenew	
IntegerItem	TokenNameIdentifier	 Integer Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IntegerItem	TokenNameIdentifier	 Integer Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
BigInteger_ZERO	TokenNameIdentifier	 Big Integer  ZERO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IntegerItem	TokenNameIdentifier	 Integer Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INTEGER_ITEM	TokenNameIdentifier	 INTEGER  ITEM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isNull	TokenNameIdentifier	 is Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BigInteger_ZERO	TokenNameIdentifier	 Big Integer  ZERO
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Item	TokenNameIdentifier	 Item
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BigInteger_ZERO	TokenNameIdentifier	 Big Integer  ZERO
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1.0 == 1, 1.1 > 1 	TokenNameCOMMENT_LINE	1.0 == 1, 1.1 > 1 
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
INTEGER_ITEM	TokenNameIdentifier	 INTEGER  ITEM
:	TokenNameCOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IntegerItem	TokenNameIdentifier	 Integer Item
)	TokenNameRPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
STRING_ITEM	TokenNameIdentifier	 STRING  ITEM
:	TokenNameCOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1.1 > 1-sp 	TokenNameCOMMENT_LINE	1.1 > 1-sp 
case	TokenNamecase	
LIST_ITEM	TokenNameIdentifier	 LIST  ITEM
:	TokenNameCOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1.1 > 1-1 	TokenNameCOMMENT_LINE	1.1 > 1-1 
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"invalid item: "	TokenNameStringLiteral	invalid item: 
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Represents a string in the version item list, usually a qualifier. */	TokenNameCOMMENT_JAVADOC	 Represents a string in the version item list, usually a qualifier. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
StringItem	TokenNameIdentifier	 String Item
implements	TokenNameimplements	
Item	TokenNameIdentifier	 Item
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
QUALIFIERS	TokenNameIdentifier	 QUALIFIERS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"alpha"	TokenNameStringLiteral	alpha
,	TokenNameCOMMA	
"beta"	TokenNameStringLiteral	beta
,	TokenNameCOMMA	
"milestone"	TokenNameStringLiteral	milestone
,	TokenNameCOMMA	
"rc"	TokenNameStringLiteral	rc
,	TokenNameCOMMA	
"snapshot"	TokenNameStringLiteral	snapshot
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"sp"	TokenNameStringLiteral	sp
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
_QUALIFIERS	TokenNameIdentifier	 QUALIFIERS
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
QUALIFIERS	TokenNameIdentifier	 QUALIFIERS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Properties	TokenNameIdentifier	 Properties
ALIASES	TokenNameIdentifier	 ALIASES
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
ALIASES	TokenNameIdentifier	 ALIASES
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"ga"	TokenNameStringLiteral	ga
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ALIASES	TokenNameIdentifier	 ALIASES
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"final"	TokenNameStringLiteral	final
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ALIASES	TokenNameIdentifier	 ALIASES
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"cr"	TokenNameStringLiteral	cr
,	TokenNameCOMMA	
"rc"	TokenNameStringLiteral	rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A comparable value for the empty-string qualifier. This one is used to determine if a given qualifier makes * the version older than one without a qualifier, or more recent. */	TokenNameCOMMENT_JAVADOC	 A comparable value for the empty-string qualifier. This one is used to determine if a given qualifier makes the version older than one without a qualifier, or more recent. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RELEASE_VERSION_INDEX	TokenNameIdentifier	 RELEASE  VERSION  INDEX
=	TokenNameEQUAL	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
_QUALIFIERS	TokenNameIdentifier	 QUALIFIERS
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StringItem	TokenNameIdentifier	 String Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
followedByDigit	TokenNameIdentifier	 followed By Digit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
followedByDigit	TokenNameIdentifier	 followed By Digit
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// a1 = alpha-1, b1 = beta-1, m1 = milestone-1 	TokenNameCOMMENT_LINE	a1 = alpha-1, b1 = beta-1, m1 = milestone-1 
switch	TokenNameswitch	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"alpha"	TokenNameStringLiteral	alpha
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'b'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"beta"	TokenNameStringLiteral	beta
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"milestone"	TokenNameStringLiteral	milestone
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
ALIASES	TokenNameIdentifier	 ALIASES
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
STRING_ITEM	TokenNameIdentifier	 STRING  ITEM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isNull	TokenNameIdentifier	 is Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
comparableQualifier	TokenNameIdentifier	 comparable Qualifier
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
RELEASE_VERSION_INDEX	TokenNameIdentifier	 RELEASE  VERSION  INDEX
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a comparable value for a qualifier. * * This method takes into account the ordering of known qualifiers then unknown qualifiers with lexical ordering. * * just returning an Integer with the index here is faster, but requires a lot of if/then/else to check for -1 * or QUALIFIERS.size and then resort to lexical ordering. Most comparisons are decided by the first character, * so this is still fast. If more characters are needed then it requires a lexical sort anyway. * * @param qualifier * @return an equivalent value that can be used with lexical comparison */	TokenNameCOMMENT_JAVADOC	 Returns a comparable value for a qualifier. * This method takes into account the ordering of known qualifiers then unknown qualifiers with lexical ordering. * just returning an Integer with the index here is faster, but requires a lot of if/then/else to check for -1 or QUALIFIERS.size and then resort to lexical ordering. Most comparisons are decided by the first character, so this is still fast. If more characters are needed then it requires a lexical sort anyway. * @param qualifier @return an equivalent value that can be used with lexical comparison 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
comparableQualifier	TokenNameIdentifier	 comparable Qualifier
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qualifier	TokenNameIdentifier	 qualifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
_QUALIFIERS	TokenNameIdentifier	 QUALIFIERS
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
qualifier	TokenNameIdentifier	 qualifier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
_QUALIFIERS	TokenNameIdentifier	 QUALIFIERS
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"-"	TokenNameStringLiteral	-
+	TokenNamePLUS	
qualifier	TokenNameIdentifier	 qualifier
)	TokenNameRPAREN	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Item	TokenNameIdentifier	 Item
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 1-rc < 1, 1-ga > 1 	TokenNameCOMMENT_LINE	1-rc < 1, 1-ga > 1 
return	TokenNamereturn	
comparableQualifier	TokenNameIdentifier	 comparable Qualifier
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
RELEASE_VERSION_INDEX	TokenNameIdentifier	 RELEASE  VERSION  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
INTEGER_ITEM	TokenNameIdentifier	 INTEGER  ITEM
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1.any < 1.1 ? 	TokenNameCOMMENT_LINE	1.any < 1.1 ? 
case	TokenNamecase	
STRING_ITEM	TokenNameIdentifier	 STRING  ITEM
:	TokenNameCOLON	
return	TokenNamereturn	
comparableQualifier	TokenNameIdentifier	 comparable Qualifier
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
comparableQualifier	TokenNameIdentifier	 comparable Qualifier
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StringItem	TokenNameIdentifier	 String Item
)	TokenNameRPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LIST_ITEM	TokenNameIdentifier	 LIST  ITEM
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1.any < 1-1 	TokenNameCOMMENT_LINE	1.any < 1-1 
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"invalid item: "	TokenNameStringLiteral	invalid item: 
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Represents a version list item. This class is used both for the global item list and for sub-lists (which start * with '-(number)' in the version specification). */	TokenNameCOMMENT_JAVADOC	 Represents a version list item. This class is used both for the global item list and for sub-lists (which start with '-(number)' in the version specification). 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ListItem	TokenNameIdentifier	 List Item
extends	TokenNameextends	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Item	TokenNameIdentifier	 Item
>	TokenNameGREATER	
implements	TokenNameimplements	
Item	TokenNameIdentifier	 Item
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LIST_ITEM	TokenNameIdentifier	 LIST  ITEM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isNull	TokenNameIdentifier	 is Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ListIterator	TokenNameIdentifier	 List Iterator
<	TokenNameLESS	
Item	TokenNameIdentifier	 Item
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasPrevious	TokenNameIdentifier	 has Previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Item	TokenNameIdentifier	 Item
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
isNull	TokenNameIdentifier	 is Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove null trailing items: 0, "", empty list 	TokenNameCOMMENT_LINE	remove null trailing items: 0, "", empty list 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Item	TokenNameIdentifier	 Item
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1-0 = 1- (normalize) = 1 	TokenNameCOMMENT_LINE	1-0 = 1- (normalize) = 1 
}	TokenNameRBRACE	
Item	TokenNameIdentifier	 Item
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
INTEGER_ITEM	TokenNameIdentifier	 INTEGER  ITEM
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1-1 < 1.0.x 	TokenNameCOMMENT_LINE	1-1 < 1.0.x 
case	TokenNamecase	
STRING_ITEM	TokenNameIdentifier	 STRING  ITEM
:	TokenNameCOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1-1 > 1-sp 	TokenNameCOMMENT_LINE	1-1 > 1-sp 
case	TokenNamecase	
LIST_ITEM	TokenNameIdentifier	 LIST  ITEM
:	TokenNameCOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Item	TokenNameIdentifier	 Item
>	TokenNameGREATER	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Item	TokenNameIdentifier	 Item
>	TokenNameGREATER	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ListItem	TokenNameIdentifier	 List Item
)	TokenNameRPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Item	TokenNameIdentifier	 Item
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Item	TokenNameIdentifier	 Item
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// if this is shorter, then invert the compare and mul with -1 	TokenNameCOMMENT_LINE	if this is shorter, then invert the compare and mul with -1 
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
:	TokenNameCOLON	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"invalid item: "	TokenNameStringLiteral	invalid item: 
+	TokenNamePLUS	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Item	TokenNameIdentifier	 Item
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ComparableVersion	TokenNameIdentifier	 Comparable Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseVersion	TokenNameIdentifier	 parse Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
parseVersion	TokenNameIdentifier	 parse Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
new	TokenNamenew	
ListItem	TokenNameIdentifier	 List Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ListItem	TokenNameIdentifier	 List Item
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
items	TokenNameIdentifier	 items
;	TokenNameSEMICOLON	
Stack	TokenNameIdentifier	 Stack
<	TokenNameLESS	
Item	TokenNameIdentifier	 Item
>	TokenNameGREATER	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
<	TokenNameLESS	
Item	TokenNameIdentifier	 Item
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isDigit	TokenNameIdentifier	 is Digit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
version	TokenNameIdentifier	 version
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IntegerItem	TokenNameIdentifier	 Integer Item
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parseItem	TokenNameIdentifier	 parse Item
(	TokenNameLPAREN	
isDigit	TokenNameIdentifier	 is Digit
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IntegerItem	TokenNameIdentifier	 Integer Item
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parseItem	TokenNameIdentifier	 parse Item
(	TokenNameLPAREN	
isDigit	TokenNameIdentifier	 is Digit
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isDigit	TokenNameIdentifier	 is Digit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1.0-* = 1-* 	TokenNameCOMMENT_LINE	1.0-* = 1-* 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// new ListItem only if previous were digits and new char is a digit, 	TokenNameCOMMENT_LINE	new ListItem only if previous were digits and new char is a digit, 
// ie need to differentiate only 1.1 from 1-1 	TokenNameCOMMENT_LINE	ie need to differentiate only 1.1 from 1-1 
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
new	TokenNamenew	
ListItem	TokenNameIdentifier	 List Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isDigit	TokenNameIdentifier	 is Digit
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
StringItem	TokenNameIdentifier	 String Item
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isDigit	TokenNameIdentifier	 is Digit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isDigit	TokenNameIdentifier	 is Digit
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parseItem	TokenNameIdentifier	 parse Item
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startIndex	TokenNameIdentifier	 start Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isDigit	TokenNameIdentifier	 is Digit
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parseItem	TokenNameIdentifier	 parse Item
(	TokenNameLPAREN	
isDigit	TokenNameIdentifier	 is Digit
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ListItem	TokenNameIdentifier	 List Item
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
canonical	TokenNameIdentifier	 canonical
=	TokenNameEQUAL	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Item	TokenNameIdentifier	 Item
parseItem	TokenNameIdentifier	 parse Item
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isDigit	TokenNameIdentifier	 is Digit
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isDigit	TokenNameIdentifier	 is Digit
?	TokenNameQUESTION	
new	TokenNamenew	
IntegerItem	TokenNameIdentifier	 Integer Item
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
StringItem	TokenNameIdentifier	 String Item
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ComparableVersion	TokenNameIdentifier	 Comparable Version
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
items	TokenNameIdentifier	 items
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
items	TokenNameIdentifier	 items
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
ComparableVersion	TokenNameIdentifier	 Comparable Version
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
canonical	TokenNameIdentifier	 canonical
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ComparableVersion	TokenNameIdentifier	 Comparable Version
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
canonical	TokenNameIdentifier	 canonical
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
canonical	TokenNameIdentifier	 canonical
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
