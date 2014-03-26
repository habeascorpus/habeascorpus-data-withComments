/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
;	TokenNameSEMICOLON	
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
.	TokenNameDOT	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
DecoratedKey	TokenNameIdentifier	 Decorated Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
gms	TokenNameIdentifier	 gms
.	TokenNameDOT	
VersionedValue	TokenNameIdentifier	 Versioned Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FBUtilities	TokenNameIdentifier	 FB Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
OrderPreservingPartitioner	TokenNameIdentifier	 Order Preserving Partitioner
extends	TokenNameextends	
AbstractPartitioner	TokenNameIdentifier	 Abstract Partitioner
<	TokenNameLESS	
StringToken	TokenNameIdentifier	 String Token
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
StringToken	TokenNameIdentifier	 String Token
MINIMUM	TokenNameIdentifier	 MINIMUM
=	TokenNameEQUAL	
new	TokenNamenew	
StringToken	TokenNameIdentifier	 String Token
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
CHAR_MASK	TokenNameIdentifier	 CHAR  MASK
=	TokenNameEQUAL	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
"65535"	TokenNameStringLiteral	65535
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DecoratedKey	TokenNameIdentifier	 Decorated Key
(	TokenNameLPAREN	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
convertFromDiskFormat	TokenNameIdentifier	 convert From Disk Format
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DecoratedKey	TokenNameIdentifier	 Decorated Key
(	TokenNameLPAREN	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StringToken	TokenNameIdentifier	 String Token
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
ltoken	TokenNameIdentifier	 ltoken
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
rtoken	TokenNameIdentifier	 rtoken
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sigchars	TokenNameIdentifier	 sigchars
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StringToken	TokenNameIdentifier	 String Token
)	TokenNameRPAREN	
ltoken	TokenNameIdentifier	 ltoken
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StringToken	TokenNameIdentifier	 String Token
)	TokenNameRPAREN	
rtoken	TokenNameIdentifier	 rtoken
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
bigForString	TokenNameIdentifier	 big For String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StringToken	TokenNameIdentifier	 String Token
)	TokenNameRPAREN	
ltoken	TokenNameIdentifier	 ltoken
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
sigchars	TokenNameIdentifier	 sigchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
bigForString	TokenNameIdentifier	 big For String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StringToken	TokenNameIdentifier	 String Token
)	TokenNameRPAREN	
rtoken	TokenNameIdentifier	 rtoken
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
sigchars	TokenNameIdentifier	 sigchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
>	TokenNameGREATER	
midpair	TokenNameIdentifier	 midpair
=	TokenNameEQUAL	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
sigchars	TokenNameIdentifier	 sigchars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StringToken	TokenNameIdentifier	 String Token
(	TokenNameLPAREN	
stringForBig	TokenNameIdentifier	 string For Big
(	TokenNameLPAREN	
midpair	TokenNameIdentifier	 midpair
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
sigchars	TokenNameIdentifier	 sigchars
,	TokenNameCOMMA	
midpair	TokenNameIdentifier	 midpair
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the characters of the given string into a BigInteger. * * TODO: Does not acknowledge any codepoints above 0xFFFF... problem? */	TokenNameCOMMENT_JAVADOC	 Copies the characters of the given string into a BigInteger. * TODO: Does not acknowledge any codepoints above 0xFFFF... problem? 
private	TokenNameprivate	
static	TokenNamestatic	
BigInteger	TokenNameIdentifier	 Big Integer
bigForString	TokenNameIdentifier	 big For String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
int	TokenNameint	
sigchars	TokenNameIdentifier	 sigchars
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
sigchars	TokenNameIdentifier	 sigchars
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
big	TokenNameIdentifier	 big
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
ZERO	TokenNameIdentifier	 ZERO
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
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
charpos	TokenNameIdentifier	 charpos
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
sigchars	TokenNameIdentifier	 sigchars
-	TokenNameMINUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
charbig	TokenNameIdentifier	 charbig
=	TokenNameEQUAL	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
big	TokenNameIdentifier	 big
=	TokenNameEQUAL	
big	TokenNameIdentifier	 big
.	TokenNameDOT	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
charbig	TokenNameIdentifier	 charbig
.	TokenNameDOT	
shiftLeft	TokenNameIdentifier	 shift Left
(	TokenNameLPAREN	
charpos	TokenNameIdentifier	 charpos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
big	TokenNameIdentifier	 big
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a (positive) BigInteger into a String. * If remainder is true, an additional char with the high order bit enabled * will be added to the end of the String. */	TokenNameCOMMENT_JAVADOC	 Convert a (positive) BigInteger into a String. If remainder is true, an additional char with the high order bit enabled will be added to the end of the String. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
stringForBig	TokenNameIdentifier	 string For Big
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
big	TokenNameIdentifier	 big
,	TokenNameCOMMA	
int	TokenNameint	
sigchars	TokenNameIdentifier	 sigchars
,	TokenNameCOMMA	
boolean	TokenNameboolean	
remainder	TokenNameIdentifier	 remainder
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
sigchars	TokenNameIdentifier	 sigchars
+	TokenNamePLUS	
(	TokenNameLPAREN	
remainder	TokenNameIdentifier	 remainder
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remainder	TokenNameIdentifier	 remainder
)	TokenNameRPAREN	
// remaining bit is the most significant in the last char 	TokenNameCOMMENT_LINE	remaining bit is the most significant in the last char 
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
sigchars	TokenNameIdentifier	 sigchars
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
0x8000	TokenNameIntegerLiteral	
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
sigchars	TokenNameIdentifier	 sigchars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
maskpos	TokenNameIdentifier	 maskpos
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
sigchars	TokenNameIdentifier	 sigchars
-	TokenNameMINUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// apply bitmask and get char value 	TokenNameCOMMENT_LINE	apply bitmask and get char value 
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
big	TokenNameIdentifier	 big
.	TokenNameDOT	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
CHAR_MASK	TokenNameIdentifier	 CHAR  MASK
.	TokenNameDOT	
shiftLeft	TokenNameIdentifier	 shift Left
(	TokenNameLPAREN	
maskpos	TokenNameIdentifier	 maskpos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
shiftRight	TokenNameIdentifier	 shift Right
(	TokenNameLPAREN	
maskpos	TokenNameIdentifier	 maskpos
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StringToken	TokenNameIdentifier	 String Token
getMinimumToken	TokenNameIdentifier	 get Minimum Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MINIMUM	TokenNameIdentifier	 MINIMUM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StringToken	TokenNameIdentifier	 String Token
getRandomToken	TokenNameIdentifier	 get Random Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"	TokenNameStringLiteral	abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
;	TokenNameSEMICOLON	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringToken	TokenNameIdentifier	 String Token
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
tokenFactory	TokenNameIdentifier	 token Factory
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stringToken	TokenNameIdentifier	 string Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
(	TokenNameLPAREN	
stringToken	TokenNameIdentifier	 string Token
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fromByteArray	TokenNameIdentifier	 from Byte Array
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringToken	TokenNameIdentifier	 String Token
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
string	TokenNameIdentifier	 string
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
stringToken	TokenNameIdentifier	 string Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stringToken	TokenNameIdentifier	 string Token
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
DELIMITER_STR	TokenNameIdentifier	 DELIMITER  STR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"Tokens may not contain the character "	TokenNameStringLiteral	Tokens may not contain the character 
+	TokenNamePLUS	
VersionedValue	TokenNameIdentifier	 Versioned Value
.	TokenNameDOT	
DELIMITER_STR	TokenNameIdentifier	 DELIMITER  STR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringToken	TokenNameIdentifier	 String Token
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenFactory	TokenNameIdentifier	 token Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
preservesOrder	TokenNameIdentifier	 preserves Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StringToken	TokenNameIdentifier	 String Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
skey	TokenNameIdentifier	 skey
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
skey	TokenNameIdentifier	 skey
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
string	TokenNameIdentifier	 string
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CharacterCodingException	TokenNameIdentifier	 Character Coding Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"The provided key was not UTF8 encoded."	TokenNameStringLiteral	The provided key was not UTF8 encoded.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringToken	TokenNameIdentifier	 String Token
(	TokenNameLPAREN	
skey	TokenNameIdentifier	 skey
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
describeOwnership	TokenNameIdentifier	 describe Ownership
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
sortedTokens	TokenNameIdentifier	 sorted Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// allTokens will contain the count and be returned, sorted_ranges is shorthand for token<->token math. 	TokenNameCOMMENT_LINE	allTokens will contain the count and be returned, sorted_ranges is shorthand for token<->token math. 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
allTokens	TokenNameIdentifier	 all Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>>	TokenNameRIGHT_SHIFT	
sortedRanges	TokenNameIdentifier	 sorted Ranges
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this initializes the counts to 0 and calcs the ranges in order. 	TokenNameCOMMENT_LINE	this initializes the counts to 0 and calcs the ranges in order. 
Token	TokenNameIdentifier	 Token
lastToken	TokenNameIdentifier	 last Token
=	TokenNameEQUAL	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
node	TokenNameIdentifier	 node
:	TokenNameCOLON	
sortedTokens	TokenNameIdentifier	 sorted Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortedRanges	TokenNameIdentifier	 sorted Ranges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
lastToken	TokenNameIdentifier	 last Token
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastToken	TokenNameIdentifier	 last Token
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ks	TokenNameIdentifier	 ks
:	TokenNameCOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getTables	TokenNameIdentifier	 get Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfmd	TokenNameIdentifier	 cfmd
:	TokenNameCOLON	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getKSMetaData	TokenNameIdentifier	 get KS Meta Data
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
)	TokenNameRPAREN	
.	TokenNameDOT	
cfMetaData	TokenNameIdentifier	 cf Meta Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
r	TokenNameIdentifier	 r
:	TokenNameCOLON	
sortedRanges	TokenNameIdentifier	 sorted Ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Looping over every KS:CF:Range, get the splits size and add it to the count 	TokenNameCOMMENT_LINE	Looping over every KS:CF:Range, get the splits size and add it to the count 
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
+	TokenNamePLUS	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSplits	TokenNameIdentifier	 get Splits
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
,	TokenNameCOMMA	
cfmd	TokenNameIdentifier	 cfmd
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getIndexInterval	TokenNameIdentifier	 get Index Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Sum every count up and divide count/total for the fractional ownership. 	TokenNameCOMMENT_LINE	Sum every count up and divide count/total for the fractional ownership. 
Float	TokenNameIdentifier	 Float
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
total	TokenNameIdentifier	 total
+=	TokenNamePLUS_EQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
row	TokenNameIdentifier	 row
:	TokenNameCOLON	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
allTokens	TokenNameIdentifier	 all Tokens
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
row	TokenNameIdentifier	 row
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
total	TokenNameIdentifier	 total
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
allTokens	TokenNameIdentifier	 all Tokens
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
