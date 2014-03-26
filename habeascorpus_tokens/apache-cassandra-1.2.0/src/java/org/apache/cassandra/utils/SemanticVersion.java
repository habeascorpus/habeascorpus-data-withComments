/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Matcher	TokenNameIdentifier	 Matcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
commons	TokenNameIdentifier	 commons
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Objects	TokenNameIdentifier	 Objects
;	TokenNameSEMICOLON	
/** * Implements semantic versioning as defined at http://semver.org/. * * Note: The following code uses a slight variation from the document above in * that it doesn't allow dashes in pre-release and build identifier. */	TokenNameCOMMENT_JAVADOC	 Implements semantic versioning as defined at http://semver.org/. * Note: The following code uses a slight variation from the document above in that it doesn't allow dashes in pre-release and build identifier. 
public	TokenNamepublic	
class	TokenNameclass	
SemanticVersion	TokenNameIdentifier	 Semantic Version
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
SemanticVersion	TokenNameIdentifier	 Semantic Version
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VERSION_REGEXP	TokenNameIdentifier	 VERSION  REGEXP
=	TokenNameEQUAL	
"(\d+)\.(\d+)\.(\d+)(\-[.\w]+)?(\+[.\w]+)?"	TokenNameStringLiteral	(\d+)\.(\d+)\.(\d+)(\-[.\w]+)?(\+[.\w]+)?
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Pattern	TokenNameIdentifier	 Pattern
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
VERSION_REGEXP	TokenNameIdentifier	 VERSION  REGEXP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
major	TokenNameIdentifier	 major
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
minor	TokenNameIdentifier	 minor
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
patch	TokenNameIdentifier	 patch
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
preRelease	TokenNameIdentifier	 pre Release
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
build	TokenNameIdentifier	 build
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
int	TokenNameint	
major	TokenNameIdentifier	 major
,	TokenNameCOMMA	
int	TokenNameint	
minor	TokenNameIdentifier	 minor
,	TokenNameCOMMA	
int	TokenNameint	
patch	TokenNameIdentifier	 patch
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
preRelease	TokenNameIdentifier	 pre Release
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
build	TokenNameIdentifier	 build
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
major	TokenNameIdentifier	 major
=	TokenNameEQUAL	
major	TokenNameIdentifier	 major
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minor	TokenNameIdentifier	 minor
=	TokenNameEQUAL	
minor	TokenNameIdentifier	 minor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
patch	TokenNameIdentifier	 patch
=	TokenNameEQUAL	
patch	TokenNameIdentifier	 patch
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
preRelease	TokenNameIdentifier	 pre Release
=	TokenNameEQUAL	
preRelease	TokenNameIdentifier	 pre Release
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
build	TokenNameIdentifier	 build
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse a semantic version from a string. * * @param version the string to parse * @throws IllegalArgumentException if the provided string does not * represent a semantic version */	TokenNameCOMMENT_JAVADOC	 Parse a semantic version from a string. * @param version the string to parse @throws IllegalArgumentException if the provided string does not represent a semantic version 
public	TokenNamepublic	
SemanticVersion	TokenNameIdentifier	 Semantic Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Matcher	TokenNameIdentifier	 Matcher
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid version value: "	TokenNameStringLiteral	Invalid version value: 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
" (see http://semver.org/ for details)"	TokenNameStringLiteral	 (see http://semver.org/ for details)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
major	TokenNameIdentifier	 major
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minor	TokenNameIdentifier	 minor
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
patch	TokenNameIdentifier	 patch
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pr	TokenNameIdentifier	 pr
=	TokenNameEQUAL	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
bld	TokenNameIdentifier	 bld
=	TokenNameEQUAL	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
group	TokenNameIdentifier	 group
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
preRelease	TokenNameIdentifier	 pre Release
=	TokenNameEQUAL	
pr	TokenNameIdentifier	 pr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
pr	TokenNameIdentifier	 pr
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
parseIdentifiers	TokenNameIdentifier	 parse Identifiers
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
pr	TokenNameIdentifier	 pr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
build	TokenNameIdentifier	 build
=	TokenNameEQUAL	
bld	TokenNameIdentifier	 bld
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
bld	TokenNameIdentifier	 bld
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
parseIdentifiers	TokenNameIdentifier	 parse Identifiers
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
bld	TokenNameIdentifier	 bld
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid version value: "	TokenNameStringLiteral	Invalid version value: 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
" (see http://semver.org/ for details)"	TokenNameStringLiteral	 (see http://semver.org/ for details)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseIdentifiers	TokenNameIdentifier	 parse Identifiers
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Drop initial - or + 	TokenNameCOMMENT_LINE	Drop initial - or + 
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"\."	TokenNameStringLiteral	\.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
:	TokenNameCOLON	
parts	TokenNameIdentifier	 parts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"\w+"	TokenNameStringLiteral	\w+
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid version value: "	TokenNameStringLiteral	Invalid version value: 
+	TokenNamePLUS	
version	TokenNameIdentifier	 version
+	TokenNamePLUS	
" (see http://semver.org/ for details)"	TokenNameStringLiteral	 (see http://semver.org/ for details)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
parts	TokenNameIdentifier	 parts
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
SemanticVersion	TokenNameIdentifier	 Semantic Version
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
major	TokenNameIdentifier	 major
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
major	TokenNameIdentifier	 major
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
major	TokenNameIdentifier	 major
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
major	TokenNameIdentifier	 major
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minor	TokenNameIdentifier	 minor
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
minor	TokenNameIdentifier	 minor
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minor	TokenNameIdentifier	 minor
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
minor	TokenNameIdentifier	 minor
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
patch	TokenNameIdentifier	 patch
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
patch	TokenNameIdentifier	 patch
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
patch	TokenNameIdentifier	 patch
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
patch	TokenNameIdentifier	 patch
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
compareIdentifiers	TokenNameIdentifier	 compare Identifiers
(	TokenNameLPAREN	
preRelease	TokenNameIdentifier	 pre Release
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
preRelease	TokenNameIdentifier	 pre Release
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compareIdentifiers	TokenNameIdentifier	 compare Identifiers
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
build	TokenNameIdentifier	 build
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a version that is backward compatible with this version amongst a list * of provided version, or null if none can be found. * * For instance: * "2.0.0".findSupportingVersion("2.0.0", "3.0.0") == "2.0.0" * "2.0.0".findSupportingVersion("2.1.3", "3.0.0") == "2.1.3" * "2.0.0".findSupportingVersion("3.0.0") == null * "2.0.3".findSupportingVersion("2.0.0") == "2.0.0" * "2.1.0".findSupportingVersion("2.0.0") == null */	TokenNameCOMMENT_JAVADOC	 Returns a version that is backward compatible with this version amongst a list of provided version, or null if none can be found. * For instance: "2.0.0".findSupportingVersion("2.0.0", "3.0.0") == "2.0.0" "2.0.0".findSupportingVersion("2.1.3", "3.0.0") == "2.1.3" "2.0.0".findSupportingVersion("3.0.0") == null "2.0.3".findSupportingVersion("2.0.0") == "2.0.0" "2.1.0".findSupportingVersion("2.0.0") == null 
public	TokenNamepublic	
SemanticVersion	TokenNameIdentifier	 Semantic Version
findSupportingVersion	TokenNameIdentifier	 find Supporting Version
(	TokenNameLPAREN	
SemanticVersion	TokenNameIdentifier	 Semantic Version
...	TokenNameELLIPSIS	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
SemanticVersion	TokenNameIdentifier	 Semantic Version
version	TokenNameIdentifier	 version
:	TokenNameCOLON	
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isSupportedBy	TokenNameIdentifier	 is Supported By
(	TokenNameLPAREN	
SemanticVersion	TokenNameIdentifier	 Semantic Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
major	TokenNameIdentifier	 major
==	TokenNameEQUAL_EQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
major	TokenNameIdentifier	 major
&&	TokenNameAND_AND	
minor	TokenNameIdentifier	 minor
<=	TokenNameLESS_EQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
minor	TokenNameIdentifier	 minor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
compareIdentifiers	TokenNameIdentifier	 compare Identifiers
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ids1	TokenNameIdentifier	 ids1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ids2	TokenNameIdentifier	 ids2
,	TokenNameCOMMA	
int	TokenNameint	
defaultPred	TokenNameIdentifier	 default Pred
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ids1	TokenNameIdentifier	 ids1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ids2	TokenNameIdentifier	 ids2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
defaultPred	TokenNameIdentifier	 default Pred
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ids2	TokenNameIdentifier	 ids2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
defaultPred	TokenNameIdentifier	 default Pred
;	TokenNameSEMICOLON	
int	TokenNameint	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
ids1	TokenNameIdentifier	 ids1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
ids2	TokenNameIdentifier	 ids2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
i1	TokenNameIdentifier	 i1
=	TokenNameEQUAL	
tryParseInt	TokenNameIdentifier	 try Parse Int
(	TokenNameLPAREN	
ids1	TokenNameIdentifier	 ids1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
i2	TokenNameIdentifier	 i2
=	TokenNameEQUAL	
tryParseInt	TokenNameIdentifier	 try Parse Int
(	TokenNameLPAREN	
ids2	TokenNameIdentifier	 ids2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// integer have precedence 	TokenNameCOMMENT_LINE	integer have precedence 
if	TokenNameif	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
i1	TokenNameIdentifier	 i1
<	TokenNameLESS	
i2	TokenNameIdentifier	 i2
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
i1	TokenNameIdentifier	 i1
>	TokenNameGREATER	
i2	TokenNameIdentifier	 i2
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// integer have precedence 	TokenNameCOMMENT_LINE	integer have precedence 
if	TokenNameif	
(	TokenNameLPAREN	
i2	TokenNameIdentifier	 i2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ids1	TokenNameIdentifier	 ids1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ids2	TokenNameIdentifier	 ids2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ids1	TokenNameIdentifier	 ids1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
ids2	TokenNameIdentifier	 ids2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ids1	TokenNameIdentifier	 ids1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
ids2	TokenNameIdentifier	 ids2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Integer	TokenNameIdentifier	 Integer
tryParseInt	TokenNameIdentifier	 try Parse Int
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
SemanticVersion	TokenNameIdentifier	 Semantic Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
SemanticVersion	TokenNameIdentifier	 Semantic Version
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SemanticVersion	TokenNameIdentifier	 Semantic Version
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
major	TokenNameIdentifier	 major
==	TokenNameEQUAL_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
major	TokenNameIdentifier	 major
&&	TokenNameAND_AND	
minor	TokenNameIdentifier	 minor
==	TokenNameEQUAL_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
minor	TokenNameIdentifier	 minor
&&	TokenNameAND_AND	
patch	TokenNameIdentifier	 patch
==	TokenNameEQUAL_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
patch	TokenNameIdentifier	 patch
&&	TokenNameAND_AND	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
preRelease	TokenNameIdentifier	 pre Release
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
preRelease	TokenNameIdentifier	 pre Release
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
build	TokenNameIdentifier	 build
)	TokenNameRPAREN	
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
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
major	TokenNameIdentifier	 major
,	TokenNameCOMMA	
minor	TokenNameIdentifier	 minor
,	TokenNameCOMMA	
patch	TokenNameIdentifier	 patch
,	TokenNameCOMMA	
preRelease	TokenNameIdentifier	 pre Release
,	TokenNameCOMMA	
build	TokenNameIdentifier	 build
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
major	TokenNameIdentifier	 major
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
minor	TokenNameIdentifier	 minor
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
patch	TokenNameIdentifier	 patch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preRelease	TokenNameIdentifier	 pre Release
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
preRelease	TokenNameIdentifier	 pre Release
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
build	TokenNameIdentifier	 build
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
