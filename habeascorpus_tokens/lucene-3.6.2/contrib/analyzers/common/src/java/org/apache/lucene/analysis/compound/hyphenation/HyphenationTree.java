/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
compound	TokenNameIdentifier	 compound
.	TokenNameDOT	
hyphenation	TokenNameIdentifier	 hyphenation
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
/** * This tree structure stores the hyphenation patterns in an efficient way for * fast lookup. It provides the provides the method to hyphenate a word. * * This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. */	TokenNameCOMMENT_JAVADOC	 This tree structure stores the hyphenation patterns in an efficient way for fast lookup. It provides the provides the method to hyphenate a word. * This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. 
public	TokenNamepublic	
class	TokenNameclass	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
extends	TokenNameextends	
TernaryTree	TokenNameIdentifier	 Ternary Tree
implements	TokenNameimplements	
PatternConsumer	TokenNameIdentifier	 Pattern Consumer
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
7842107987915665573L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * value space: stores the interletter values */	TokenNameCOMMENT_JAVADOC	 value space: stores the interletter values 
protected	TokenNameprotected	
ByteVector	TokenNameIdentifier	 Byte Vector
vspace	TokenNameIdentifier	 vspace
;	TokenNameSEMICOLON	
/** * This map stores hyphenation exceptions */	TokenNameCOMMENT_JAVADOC	 This map stores hyphenation exceptions 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>>	TokenNameRIGHT_SHIFT	
stoplist	TokenNameIdentifier	 stoplist
;	TokenNameSEMICOLON	
/** * This map stores the character classes */	TokenNameCOMMENT_JAVADOC	 This map stores the character classes 
protected	TokenNameprotected	
TernaryTree	TokenNameIdentifier	 Ternary Tree
classmap	TokenNameIdentifier	 classmap
;	TokenNameSEMICOLON	
/** * Temporary map to store interletter values on pattern loading. */	TokenNameCOMMENT_JAVADOC	 Temporary map to store interletter values on pattern loading. 
private	TokenNameprivate	
transient	TokenNametransient	
TernaryTree	TokenNameIdentifier	 Ternary Tree
ivalues	TokenNameIdentifier	 ivalues
;	TokenNameSEMICOLON	
public	TokenNamepublic	
HyphenationTree	TokenNameIdentifier	 Hyphenation Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stoplist	TokenNameIdentifier	 stoplist
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// usually a small table 	TokenNameCOMMENT_LINE	usually a small table 
classmap	TokenNameIdentifier	 classmap
=	TokenNameEQUAL	
new	TokenNamenew	
TernaryTree	TokenNameIdentifier	 Ternary Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vspace	TokenNameIdentifier	 vspace
=	TokenNameEQUAL	
new	TokenNamenew	
ByteVector	TokenNameIdentifier	 Byte Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vspace	TokenNameIdentifier	 vspace
.	TokenNameDOT	
alloc	TokenNameIdentifier	 alloc
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this reserves index 0, which we don't use 	TokenNameCOMMENT_LINE	this reserves index 0, which we don't use 
}	TokenNameRBRACE	
/** * Packs the values by storing them in 4 bits, two values into a byte Values * range is from 0 to 9. We use zero as terminator, so we'll add 1 to the * value. * * @param values a string of digits from '0' to '9' representing the * interletter values. * @return the index into the vspace array where the packed values are stored. */	TokenNameCOMMENT_JAVADOC	 Packs the values by storing them in 4 bits, two values into a byte Values range is from 0 to 9. We use zero as terminator, so we'll add 1 to the value. * @param values a string of digits from '0' to '9' representing the interletter values. @return the index into the vspace array where the packed values are stored. 
protected	TokenNameprotected	
int	TokenNameint	
packValues	TokenNameIdentifier	 pack Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
vspace	TokenNameIdentifier	 vspace
.	TokenNameDOT	
alloc	TokenNameIdentifier	 alloc
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
va	TokenNameIdentifier	 va
=	TokenNameEQUAL	
vspace	TokenNameIdentifier	 vspace
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
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
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
va	TokenNameIdentifier	 va
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
va	TokenNameIdentifier	 va
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
|	TokenNameOR	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
va	TokenNameIdentifier	 va
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// big endian 	TokenNameCOMMENT_LINE	big endian 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
va	TokenNameIdentifier	 va
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// terminator 	TokenNameCOMMENT_LINE	terminator 
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
unpackValues	TokenNameIdentifier	 unpack Values
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
vspace	TokenNameIdentifier	 vspace
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
vspace	TokenNameIdentifier	 vspace
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read hyphenation patterns from an XML file. * * @param f the filename * @throws HyphenationException In case the parsing fails */	TokenNameCOMMENT_JAVADOC	 Read hyphenation patterns from an XML file. * @param f the filename @throws HyphenationException In case the parsing fails 
public	TokenNamepublic	
void	TokenNamevoid	
loadPatterns	TokenNameIdentifier	 load Patterns
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
HyphenationException	TokenNameIdentifier	 Hyphenation Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
toURL	TokenNameIdentifier	 to URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toExternalForm	TokenNameIdentifier	 to External Form
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loadPatterns	TokenNameIdentifier	 load Patterns
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
HyphenationException	TokenNameIdentifier	 Hyphenation Exception
(	TokenNameLPAREN	
"Error converting the File '"	TokenNameStringLiteral	Error converting the File '
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
"' to a URL: "	TokenNameStringLiteral	' to a URL: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Read hyphenation patterns from an XML file. * * @param source the InputSource for the file * @throws HyphenationException In case the parsing fails */	TokenNameCOMMENT_JAVADOC	 Read hyphenation patterns from an XML file. * @param source the InputSource for the file @throws HyphenationException In case the parsing fails 
public	TokenNamepublic	
void	TokenNamevoid	
loadPatterns	TokenNameIdentifier	 load Patterns
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
HyphenationException	TokenNameIdentifier	 Hyphenation Exception
{	TokenNameLBRACE	
PatternParser	TokenNameIdentifier	 Pattern Parser
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
new	TokenNamenew	
PatternParser	TokenNameIdentifier	 Pattern Parser
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ivalues	TokenNameIdentifier	 ivalues
=	TokenNameEQUAL	
new	TokenNamenew	
TernaryTree	TokenNameIdentifier	 Ternary Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// patterns/values should be now in the tree 	TokenNameCOMMENT_LINE	patterns/values should be now in the tree 
// let's optimize a bit 	TokenNameCOMMENT_LINE	let's optimize a bit 
trimToSize	TokenNameIdentifier	 trim To Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vspace	TokenNameIdentifier	 vspace
.	TokenNameDOT	
trimToSize	TokenNameIdentifier	 trim To Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classmap	TokenNameIdentifier	 classmap
.	TokenNameDOT	
trimToSize	TokenNameIdentifier	 trim To Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get rid of the auxiliary map 	TokenNameCOMMENT_LINE	get rid of the auxiliary map 
ivalues	TokenNameIdentifier	 ivalues
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
findPattern	TokenNameIdentifier	 find Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pat	TokenNameIdentifier	 pat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
pat	TokenNameIdentifier	 pat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unpackValues	TokenNameIdentifier	 unpack Values
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * String compare, returns 0 if equal or t is a substring of s */	TokenNameCOMMENT_JAVADOC	 String compare, returns 0 if equal or t is a substring of s 
protected	TokenNameprotected	
int	TokenNameint	
hstrcmp	TokenNameIdentifier	 hstrcmp
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
si	TokenNameIdentifier	 si
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
si	TokenNameIdentifier	 si
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
ti	TokenNameIdentifier	 ti
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
ti	TokenNameIdentifier	 ti
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
si	TokenNameIdentifier	 si
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
ti	TokenNameIdentifier	 ti
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
si	TokenNameIdentifier	 si
]	TokenNameRBRACKET	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
ti	TokenNameIdentifier	 ti
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
vspace	TokenNameIdentifier	 vspace
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
vspace	TokenNameIdentifier	 vspace
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
res	TokenNameIdentifier	 res
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p> * Search for all possible partial matches of word starting at index an update * interletter values. In other words, it does something like: * </p> * <code> * for(i=0; i<patterns.length; i++) { * if ( word.substring(index).startsWidth(patterns[i]) ) * update_interletter_values(patterns[i]); * } * </code> * <p> * But it is done in an efficient way since the patterns are stored in a * ternary tree. In fact, this is the whole purpose of having the tree: doing * this search without having to test every single pattern. The number of * patterns for languages such as English range from 4000 to 10000. Thus, * doing thousands of string comparisons for each word to hyphenate would be * really slow without the tree. The tradeoff is memory, but using a ternary * tree instead of a trie, almost halves the the memory used by Lout or TeX. * It's also faster than using a hash table * </p> * * @param word null terminated word to match * @param index start index from word * @param il interletter values array to update */	TokenNameCOMMENT_JAVADOC	 <p> Search for all possible partial matches of word starting at index an update interletter values. In other words, it does something like: </p> <code> for(i=0; i<patterns.length; i++) { if ( word.substring(index).startsWidth(patterns[i]) ) update_interletter_values(patterns[i]); } </code> <p> But it is done in an efficient way since the patterns are stored in a ternary tree. In fact, this is the whole purpose of having the tree: doing this search without having to test every single pattern. The number of patterns for languages such as English range from 4000 to 10000. Thus, doing thousands of string comparisons for each word to hyphenate would be really slow without the tree. The tradeoff is memory, but using a ternary tree instead of a trie, almost halves the the memory used by Lout or TeX. It's also faster than using a hash table </p> * @param word null terminated word to match @param index start index from word @param il interletter values array to update 
protected	TokenNameprotected	
void	TokenNamevoid	
searchPatterns	TokenNameIdentifier	 search Patterns
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
il	TokenNameIdentifier	 il
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
char	TokenNamechar	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
char	TokenNamechar	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
p	TokenNameIdentifier	 p
<	TokenNameLESS	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hstrcmp	TokenNameIdentifier	 hstrcmp
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// data pointer is in eq[] 	TokenNameCOMMENT_LINE	data pointer is in eq[] 
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
>	TokenNameGREATER	
il	TokenNameIdentifier	 il
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
sp	TokenNameIdentifier	 sp
-	TokenNameMINUS	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
// look for a pattern ending at this position by searching for 	TokenNameCOMMENT_LINE	look for a pattern ending at this position by searching for 
// the null char ( splitchar == 0 ) 	TokenNameCOMMENT_LINE	the null char ( splitchar == 0 ) 
while	TokenNamewhile	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
q	TokenNameIdentifier	 q
<	TokenNameLESS	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
q	TokenNameIdentifier	 q
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// stop at compressed branch 	TokenNameCOMMENT_LINE	stop at compressed branch 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
q	TokenNameIdentifier	 q
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
q	TokenNameIdentifier	 q
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
>	TokenNameGREATER	
il	TokenNameIdentifier	 il
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
q	TokenNameIdentifier	 q
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * actually the code should be: q = sc[q] < 0 ? hi[q] : lo[q]; but * java chars are unsigned */	TokenNameCOMMENT_JAVADOC	 actually the code should be: q = sc[q] < 0 ? hi[q] : lo[q]; but java chars are unsigned 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
:	TokenNameCOLON	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Hyphenate word and return a Hyphenation object. * * @param word the word to be hyphenated * @param remainCharCount Minimum number of characters allowed before the * hyphenation point. * @param pushCharCount Minimum number of characters allowed after the * hyphenation point. * @return a {@link Hyphenation Hyphenation} object representing the * hyphenated word or null if word is not hyphenated. */	TokenNameCOMMENT_JAVADOC	 Hyphenate word and return a Hyphenation object. * @param word the word to be hyphenated @param remainCharCount Minimum number of characters allowed before the hyphenation point. @param pushCharCount Minimum number of characters allowed after the hyphenation point. @return a {@link Hyphenation Hyphenation} object representing the hyphenated word or null if word is not hyphenated. 
public	TokenNamepublic	
Hyphenation	TokenNameIdentifier	 Hyphenation
hyphenate	TokenNameIdentifier	 hyphenate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
int	TokenNameint	
remainCharCount	TokenNameIdentifier	 remain Char Count
,	TokenNameCOMMA	
int	TokenNameint	
pushCharCount	TokenNameIdentifier	 push Char Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hyphenate	TokenNameIdentifier	 hyphenate
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
remainCharCount	TokenNameIdentifier	 remain Char Count
,	TokenNameCOMMA	
pushCharCount	TokenNameIdentifier	 push Char Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * w = "****nnllllllnnn*****", where n is a non-letter, l is a letter, all n * may be absent, the first n is at offset, the first l is at offset + * iIgnoreAtBeginning; word = ".llllll.'\0'***", where all l in w are copied * into word. In the first part of the routine len = w.length, in the second * part of the routine len = word.length. Three indices are used: index(w), * the index in w, index(word), the index in word, letterindex(word), the * index in the letter part of word. The following relations exist: index(w) = * offset + i - 1 index(word) = i - iIgnoreAtBeginning letterindex(word) = * index(word) - 1 (see first loop). It follows that: index(w) - index(word) = * offset - 1 + iIgnoreAtBeginning index(w) = letterindex(word) + offset + * iIgnoreAtBeginning */	TokenNameCOMMENT_JAVADOC	 w = "****nnllllllnnn*****", where n is a non-letter, l is a letter, all n may be absent, the first n is at offset, the first l is at offset + iIgnoreAtBeginning; word = ".llllll.'\0'***", where all l in w are copied into word. In the first part of the routine len = w.length, in the second part of the routine len = word.length. Three indices are used: index(w), the index in w, index(word), the index in word, letterindex(word), the index in the letter part of word. The following relations exist: index(w) = offset + i - 1 index(word) = i - iIgnoreAtBeginning letterindex(word) = index(word) - 1 (see first loop). It follows that: index(w) - index(word) = offset - 1 + iIgnoreAtBeginning index(w) = letterindex(word) + offset + iIgnoreAtBeginning 
/** * Hyphenate word and return an array of hyphenation points. * * @param w char array that contains the word * @param offset Offset to first character in word * @param len Length of word * @param remainCharCount Minimum number of characters allowed before the * hyphenation point. * @param pushCharCount Minimum number of characters allowed after the * hyphenation point. * @return a {@link Hyphenation Hyphenation} object representing the * hyphenated word or null if word is not hyphenated. */	TokenNameCOMMENT_JAVADOC	 Hyphenate word and return an array of hyphenation points. * @param w char array that contains the word @param offset Offset to first character in word @param len Length of word @param remainCharCount Minimum number of characters allowed before the hyphenation point. @param pushCharCount Minimum number of characters allowed after the hyphenation point. @return a {@link Hyphenation Hyphenation} object representing the hyphenated word or null if word is not hyphenated. 
public	TokenNamepublic	
Hyphenation	TokenNameIdentifier	 Hyphenation
hyphenate	TokenNameIdentifier	 hyphenate
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
remainCharCount	TokenNameIdentifier	 remain Char Count
,	TokenNameCOMMA	
int	TokenNameint	
pushCharCount	TokenNameIdentifier	 push Char Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// normalize word 	TokenNameCOMMENT_LINE	normalize word 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
iIgnoreAtBeginning	TokenNameIdentifier	 i Ignore At Beginning
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
iLength	TokenNameIdentifier	 i Length
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
bEndOfLetters	TokenNameIdentifier	 b End Of Letters
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
nc	TokenNameIdentifier	 nc
=	TokenNameEQUAL	
classmap	TokenNameIdentifier	 classmap
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nc	TokenNameIdentifier	 nc
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found a non-letter character ... 	TokenNameCOMMENT_LINE	found a non-letter character ... 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
iIgnoreAtBeginning	TokenNameIdentifier	 i Ignore At Beginning
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ... before any letter character 	TokenNameCOMMENT_LINE	... before any letter character 
iIgnoreAtBeginning	TokenNameIdentifier	 i Ignore At Beginning
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// ... after a letter character 	TokenNameCOMMENT_LINE	... after a letter character 
bEndOfLetters	TokenNameIdentifier	 b End Of Letters
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iLength	TokenNameIdentifier	 i Length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
bEndOfLetters	TokenNameIdentifier	 b End Of Letters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
iIgnoreAtBeginning	TokenNameIdentifier	 i Ignore At Beginning
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nc	TokenNameIdentifier	 nc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
iLength	TokenNameIdentifier	 i Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
(	TokenNameLPAREN	
remainCharCount	TokenNameIdentifier	 remain Char Count
+	TokenNamePLUS	
pushCharCount	TokenNameIdentifier	 push Char Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// word is too short to be hyphenated 	TokenNameCOMMENT_LINE	word is too short to be hyphenated 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// check exception list first 	TokenNameCOMMENT_LINE	check exception list first 
String	TokenNameIdentifier	 String
sw	TokenNameIdentifier	 sw
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stoplist	TokenNameIdentifier	 stoplist
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// assume only simple hyphens (Hyphen.pre="-", Hyphen.post = Hyphen.no = 	TokenNameCOMMENT_LINE	assume only simple hyphens (Hyphen.pre="-", Hyphen.post = Hyphen.no = 
// null) 	TokenNameCOMMENT_LINE	null) 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
hw	TokenNameIdentifier	 hw
=	TokenNameEQUAL	
stoplist	TokenNameIdentifier	 stoplist
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
sw	TokenNameIdentifier	 sw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
hw	TokenNameIdentifier	 hw
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
hw	TokenNameIdentifier	 hw
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// j = index(sw) = letterindex(word)? 	TokenNameCOMMENT_LINE	j = index(sw) = letterindex(word)? 
// result[k] = corresponding index(w) 	TokenNameCOMMENT_LINE	result[k] = corresponding index(w) 
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
remainCharCount	TokenNameIdentifier	 remain Char Count
&&	TokenNameAND_AND	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
pushCharCount	TokenNameIdentifier	 push Char Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
iIgnoreAtBeginning	TokenNameIdentifier	 i Ignore At Beginning
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// use algorithm to get hyphenation points 	TokenNameCOMMENT_LINE	use algorithm to get hyphenation points 
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// word start marker 	TokenNameCOMMENT_LINE	word start marker 
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'.'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
// word end marker 	TokenNameCOMMENT_LINE	word end marker 
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// null terminated 	TokenNameCOMMENT_LINE	null terminated 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// initialized to zero 	TokenNameCOMMENT_LINE	initialized to zero 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
searchPatterns	TokenNameIdentifier	 search Patterns
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
il	TokenNameIdentifier	 il
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hyphenation points are located where interletter value is odd 	TokenNameCOMMENT_LINE	hyphenation points are located where interletter value is odd 
// i is letterindex(word), 	TokenNameCOMMENT_LINE	i is letterindex(word), 
// i + 1 is index(word), 	TokenNameCOMMENT_LINE	i + 1 is index(word), 
// result[k] = corresponding index(w) 	TokenNameCOMMENT_LINE	result[k] = corresponding index(w) 
for	TokenNamefor	
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
il	TokenNameIdentifier	 il
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
remainCharCount	TokenNameIdentifier	 remain Char Count
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
pushCharCount	TokenNameIdentifier	 push Char Count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
iIgnoreAtBeginning	TokenNameIdentifier	 i Ignore At Beginning
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// trim result array 	TokenNameCOMMENT_LINE	trim result array 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
res	TokenNameIdentifier	 res
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We add the synthetical hyphenation points 	TokenNameCOMMENT_LINE	We add the synthetical hyphenation points 
// at the beginning and end of the word 	TokenNameCOMMENT_LINE	at the beginning and end of the word 
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Hyphenation	TokenNameIdentifier	 Hyphenation
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a character class to the tree. It is used by * {@link PatternParser PatternParser} as callback to add character classes. * Character classes define the valid word characters for hyphenation. If a * word contains a character not defined in any of the classes, it is not * hyphenated. It also defines a way to normalize the characters in order to * compare them with the stored patterns. Usually pattern files use only lower * case characters, in this case a class for letter 'a', for example, should * be defined as "aA", the first character being the normalization char. */	TokenNameCOMMENT_JAVADOC	 Add a character class to the tree. It is used by {@link PatternParser PatternParser} as callback to add character classes. Character classes define the valid word characters for hyphenation. If a word contains a character not defined in any of the classes, it is not hyphenated. It also defines a way to normalize the characters in order to compare them with the stored patterns. Usually pattern files use only lower case characters, in this case a class for letter 'a', for example, should be defined as "aA", the first character being the normalization char. 
public	TokenNamepublic	
void	TokenNamevoid	
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
chargroup	TokenNameIdentifier	 chargroup
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chargroup	TokenNameIdentifier	 chargroup
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
equivChar	TokenNameIdentifier	 equiv Char
=	TokenNameEQUAL	
chargroup	TokenNameIdentifier	 chargroup
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
chargroup	TokenNameIdentifier	 chargroup
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
chargroup	TokenNameIdentifier	 chargroup
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classmap	TokenNameIdentifier	 classmap
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
equivChar	TokenNameIdentifier	 equiv Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add an exception to the tree. It is used by * {@link PatternParser PatternParser} class as callback to store the * hyphenation exceptions. * * @param word normalized word * @param hyphenatedword a vector of alternating strings and * {@link Hyphen hyphen} objects. */	TokenNameCOMMENT_JAVADOC	 Add an exception to the tree. It is used by {@link PatternParser PatternParser} class as callback to store the hyphenation exceptions. * @param word normalized word @param hyphenatedword a vector of alternating strings and {@link Hyphen hyphen} objects. 
public	TokenNamepublic	
void	TokenNamevoid	
addException	TokenNameIdentifier	 add Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
hyphenatedword	TokenNameIdentifier	 hyphenatedword
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stoplist	TokenNameIdentifier	 stoplist
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
hyphenatedword	TokenNameIdentifier	 hyphenatedword
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a pattern to the tree. Mainly, to be used by * {@link PatternParser PatternParser} class as callback to add a pattern to * the tree. * * @param pattern the hyphenation pattern * @param ivalue interletter weight values indicating the desirability and * priority of hyphenating at a given point within the pattern. It * should contain only digit characters. (i.e. '0' to '9'). */	TokenNameCOMMENT_JAVADOC	 Add a pattern to the tree. Mainly, to be used by {@link PatternParser PatternParser} class as callback to add a pattern to the tree. * @param pattern the hyphenation pattern @param ivalue interletter weight values indicating the desirability and priority of hyphenating at a given point within the pattern. It should contain only digit characters. (i.e. '0' to '9'). 
public	TokenNamepublic	
void	TokenNamevoid	
addPattern	TokenNameIdentifier	 add Pattern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
ivalues	TokenNameIdentifier	 ivalues
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
packValues	TokenNameIdentifier	 pack Values
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ivalues	TokenNameIdentifier	 ivalues
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
ivalue	TokenNameIdentifier	 ivalue
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
printStats	TokenNameIdentifier	 print Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Value space size = "	TokenNameStringLiteral	Value space size = 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
vspace	TokenNameIdentifier	 vspace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
printStats	TokenNameIdentifier	 print Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
