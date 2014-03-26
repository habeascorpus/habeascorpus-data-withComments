/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Util.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Util.java 468649 2006-10-28 07:00:55Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Util	TokenNameIdentifier	 Util
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
char	TokenNamechar	
filesep	TokenNameIdentifier	 filesep
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"file.separator"	TokenNameStringLiteral	file.separator
,	TokenNameCOMMA	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filesep	TokenNameIdentifier	 filesep
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
noExtName	TokenNameIdentifier	 no Ext Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
index	TokenNameIdentifier	 index
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Search for both slashes in order to support URLs and * files. */	TokenNameCOMMENT_JAVADOC	 Search for both slashes in order to support URLs and files. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
baseName	TokenNameIdentifier	 base Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
lastColonIndex	TokenNameIdentifier	 last Colon Index
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastColonIndex	TokenNameIdentifier	 last Colon Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lastColonIndex	TokenNameIdentifier	 last Colon Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Search for both slashes in order to support URLs and * files. */	TokenNameCOMMENT_JAVADOC	 Search for both slashes in order to support URLs and files. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
pathName	TokenNameIdentifier	 path Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replace all illegal Java chars by '_'. */	TokenNameCOMMENT_JAVADOC	 Replace all illegal Java chars by '_'. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toJavaName	TokenNameIdentifier	 to Java Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isJavaIdentifierStart	TokenNameIdentifier	 is Java Identifier Start
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ch	TokenNameIdentifier	 ch
:	TokenNameCOLON	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isJavaIdentifierPart	TokenNameIdentifier	 is Java Identifier Part
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ch	TokenNameIdentifier	 ch
:	TokenNameCOLON	
'_'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Type	TokenNameIdentifier	 Type
getJCRefType	TokenNameIdentifier	 get JC Ref Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
signature	TokenNameIdentifier	 signature
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
signature	TokenNameIdentifier	 signature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
internalName	TokenNameIdentifier	 internal Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cname	TokenNameIdentifier	 cname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cname	TokenNameIdentifier	 cname
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
filesep	TokenNameIdentifier	 filesep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
TRACE1	TokenNameIdentifier	 TRAC E1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TRACE1"	TokenNameStringLiteral	TRACE1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
TRACE2	TokenNameIdentifier	 TRAC E2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TRACE2"	TokenNameStringLiteral	TRACE2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
TRACE3	TokenNameIdentifier	 TRAC E3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TRACE3"	TokenNameStringLiteral	TRACE3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replace a certain character in a string with a new substring. */	TokenNameCOMMENT_JAVADOC	 Replace a certain character in a string with a new substring. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
base	TokenNameIdentifier	 base
:	TokenNameCOLON	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
str	TokenNameIdentifier	 str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
delim	TokenNameIdentifier	 delim
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
delim	TokenNameIdentifier	 delim
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replace occurances of '.', '-', '/' and ':' */	TokenNameCOMMENT_JAVADOC	 Replace occurances of '.', '-', '/' and ':' 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
escape	TokenNameIdentifier	 escape
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
".-/:"	TokenNameStringLiteral	.-/:
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"$dot$"	TokenNameStringLiteral	$dot$
,	TokenNameCOMMA	
"$dash$"	TokenNameStringLiteral	$dash$
,	TokenNameCOMMA	
"$slash$"	TokenNameStringLiteral	$slash$
,	TokenNameCOMMA	
"$colon$"	TokenNameStringLiteral	$colon$
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
qname	TokenNameIdentifier	 qname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
:	TokenNameCOLON	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the string is a literal (i.e. not an AVT) or not. */	TokenNameCOMMENT_JAVADOC	 Checks if the string is a literal (i.e. not an AVT) or not. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isLiteral	TokenNameIdentifier	 is Literal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
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
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'{'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the string is valid list of qnames */	TokenNameCOMMENT_JAVADOC	 Checks if the string is valid list of qnames 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isValidQNames	TokenNameIdentifier	 is Valid Q Names
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidQName	TokenNameIdentifier	 is XM L11 Valid Q Name
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
