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
BigDecimal	TokenNameIdentifier	 Big Decimal
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
GuidGenerator	TokenNameIdentifier	 Guid Generator
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
/** * This class generates a BigIntegerToken using MD5 hash. */	TokenNameCOMMENT_JAVADOC	 This class generates a BigIntegerToken using MD5 hash. 
public	TokenNamepublic	
class	TokenNameclass	
RandomPartitioner	TokenNameIdentifier	 Random Partitioner
extends	TokenNameextends	
AbstractPartitioner	TokenNameIdentifier	 Abstract Partitioner
<	TokenNameLESS	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
ZERO	TokenNameIdentifier	 ZERO
=	TokenNameEQUAL	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
"0"	TokenNameStringLiteral	0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
MINIMUM	TokenNameIdentifier	 MINIMUM
=	TokenNameEQUAL	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
"-1"	TokenNameStringLiteral	-1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
MAXIMUM	TokenNameIdentifier	 MAXIMUM
=	TokenNameEQUAL	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
)	TokenNameRPAREN	
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
127	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
DELIMITER_BYTE	TokenNameIdentifier	 DELIMITER  BYTE
=	TokenNameEQUAL	
":"	TokenNameStringLiteral	:
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
fromdisk	TokenNameIdentifier	 fromdisk
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find the delimiter position 	TokenNameCOMMENT_LINE	find the delimiter position 
int	TokenNameint	
splitPoint	TokenNameIdentifier	 split Point
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
fromdisk	TokenNameIdentifier	 fromdisk
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fromdisk	TokenNameIdentifier	 fromdisk
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fromdisk	TokenNameIdentifier	 fromdisk
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DELIMITER_BYTE	TokenNameIdentifier	 DELIMITER  BYTE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitPoint	TokenNameIdentifier	 split Point
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
splitPoint	TokenNameIdentifier	 split Point
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// and decode the token and key 	TokenNameCOMMENT_LINE	and decode the token and key 
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
string	TokenNameIdentifier	 string
(	TokenNameLPAREN	
fromdisk	TokenNameIdentifier	 fromdisk
,	TokenNameCOMMA	
fromdisk	TokenNameIdentifier	 fromdisk
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
splitPoint	TokenNameIdentifier	 split Point
-	TokenNameMINUS	
fromdisk	TokenNameIdentifier	 fromdisk
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
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
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
fromdisk	TokenNameIdentifier	 fromdisk
.	TokenNameDOT	
duplicate	TokenNameIdentifier	 duplicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
position	TokenNameIdentifier	 position
(	TokenNameLPAREN	
splitPoint	TokenNameIdentifier	 split Point
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DecoratedKey	TokenNameIdentifier	 Decorated Key
(	TokenNameLPAREN	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
ltoken	TokenNameIdentifier	 ltoken
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
rtoken	TokenNameIdentifier	 rtoken
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the symbolic MINIMUM token should act as ZERO: the empty bit array 	TokenNameCOMMENT_LINE	the symbolic MINIMUM token should act as ZERO: the empty bit array 
BigInteger	TokenNameIdentifier	 Big Integer
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
ltoken	TokenNameIdentifier	 ltoken
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MINIMUM	TokenNameIdentifier	 MINIMUM
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ZERO	TokenNameIdentifier	 ZERO
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
)	TokenNameRPAREN	
ltoken	TokenNameIdentifier	 ltoken
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
rtoken	TokenNameIdentifier	 rtoken
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
MINIMUM	TokenNameIdentifier	 MINIMUM
)	TokenNameRPAREN	
?	TokenNameQUESTION	
ZERO	TokenNameIdentifier	 ZERO
:	TokenNameCOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
)	TokenNameRPAREN	
rtoken	TokenNameIdentifier	 rtoken
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
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
127	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// discard the remainder 	TokenNameCOMMENT_LINE	discard the remainder 
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
midpair	TokenNameIdentifier	 midpair
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
getMinimumToken	TokenNameIdentifier	 get Minimum Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
MINIMUM	TokenNameIdentifier	 MINIMUM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
getRandomToken	TokenNameIdentifier	 get Random Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
hashToBigInteger	TokenNameIdentifier	 hash To Big Integer
(	TokenNameLPAREN	
GuidGenerator	TokenNameIdentifier	 Guid Generator
.	TokenNameDOT	
guidAsBytes	TokenNameIdentifier	 guid As Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
BigInteger	TokenNameIdentifier	 Big Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
tokenFactory	TokenNameIdentifier	 token Factory
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
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
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
bigIntegerToken	TokenNameIdentifier	 big Integer Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
bigIntegerToken	TokenNameIdentifier	 big Integer Token
.	TokenNameDOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
toByteArray	TokenNameIdentifier	 to Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
fromByteArray	TokenNameIdentifier	 from Byte Array
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
bigIntegerToken	TokenNameIdentifier	 big Integer Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bigIntegerToken	TokenNameIdentifier	 big Integer Token
.	TokenNameDOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
try	TokenNametry	
{	TokenNameLBRACE	
BigInteger	TokenNameIdentifier	 Big Integer
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ZERO	TokenNameIdentifier	 ZERO
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"Token must be >= 0"	TokenNameStringLiteral	Token must be >= 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
MAXIMUM	TokenNameIdentifier	 MAXIMUM
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"Token must be <= 2**127"	TokenNameStringLiteral	Token must be <= 2**127
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
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
<	TokenNameLESS	
BigInteger	TokenNameIdentifier	 Big Integer
>	TokenNameGREATER	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
new	TokenNamenew	
BigInteger	TokenNameIdentifier	 Big Integer
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
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
BigInteger	TokenNameIdentifier	 Big Integer
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
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
MINIMUM	TokenNameIdentifier	 MINIMUM
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
(	TokenNameLPAREN	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
hashToBigInteger	TokenNameIdentifier	 hash To Big Integer
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
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
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
ownerships	TokenNameIdentifier	 ownerships
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
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 0-case 	TokenNameCOMMENT_LINE	0-case 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"No nodes present in the cluster. How did you call this?"	TokenNameStringLiteral	No nodes present in the cluster. How did you call this?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 1-case 	TokenNameCOMMENT_LINE	1-case 
if	TokenNameif	
(	TokenNameLPAREN	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerships	TokenNameIdentifier	 ownerships
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// n-case 	TokenNameCOMMENT_LINE	n-case 
else	TokenNameelse	
{	TokenNameLBRACE	
// NOTE: All divisions must take place in BigDecimals, and all modulo operators must take place in BigIntegers. 	TokenNameCOMMENT_LINE	NOTE: All divisions must take place in BigDecimals, and all modulo operators must take place in BigIntegers. 
final	TokenNamefinal	
BigInteger	TokenNameIdentifier	 Big Integer
ri	TokenNameIdentifier	 ri
=	TokenNameEQUAL	
MAXIMUM	TokenNameIdentifier	 MAXIMUM
;	TokenNameSEMICOLON	
// (used for addition later) 	TokenNameCOMMENT_LINE	(used for addition later) 
final	TokenNamefinal	
BigDecimal	TokenNameIdentifier	 Big Decimal
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The entire range, 2**127 	TokenNameCOMMENT_LINE	The entire range, 2**127 
Token	TokenNameIdentifier	 Token
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
)	TokenNameRPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
// The first token and its value 	TokenNameCOMMENT_LINE	The first token and its value 
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
BigInteger	TokenNameIdentifier	 Big Integer
tim1	TokenNameIdentifier	 tim1
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
;	TokenNameSEMICOLON	
// The last token and its value (after loop) 	TokenNameCOMMENT_LINE	The last token and its value (after loop) 
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
// The next token and its value 	TokenNameCOMMENT_LINE	The next token and its value 
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
tim1	TokenNameIdentifier	 tim1
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %age = ((T(i) - T(i-1) + R) % R) / R 	TokenNameCOMMENT_LINE	%age = ((T(i) - T(i-1) + R) % R) / R 
ownerships	TokenNameIdentifier	 ownerships
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// save (T(i) -> %age) 	TokenNameCOMMENT_LINE	save (T(i) -> %age) 
tim1	TokenNameIdentifier	 tim1
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
;	TokenNameSEMICOLON	
// -> advance loop 	TokenNameCOMMENT_LINE	-> advance loop 
}	TokenNameRBRACE	
// The start token's range extends backward to the last token, which is why both were saved above. 	TokenNameCOMMENT_LINE	The start token's range extends backward to the last token, which is why both were saved above. 
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
new	TokenNamenew	
BigDecimal	TokenNameIdentifier	 Big Decimal
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BigIntegerToken	TokenNameIdentifier	 Big Integer Token
)	TokenNameRPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
.	TokenNameDOT	
mod	TokenNameIdentifier	 mod
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
divide	TokenNameIdentifier	 divide
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ownerships	TokenNameIdentifier	 ownerships
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ownerships	TokenNameIdentifier	 ownerships
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
