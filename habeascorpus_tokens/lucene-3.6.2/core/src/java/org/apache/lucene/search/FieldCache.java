package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Bits	TokenNameIdentifier	 Bits
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NumericUtils	TokenNameIdentifier	 Numeric Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
NumericField	TokenNameIdentifier	 Numeric Field
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
NumericTokenStream	TokenNameIdentifier	 Numeric Token Stream
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
;	TokenNameSEMICOLON	
/** * Expert: Maintains caches of term values. * * <p>Created: May 19, 2004 11:13:14 AM * * @since lucene 1.4 * @see org.apache.lucene.util.FieldCacheSanityChecker */	TokenNameCOMMENT_JAVADOC	 Expert: Maintains caches of term values. * <p>Created: May 19, 2004 11:13:14 AM * @since lucene 1.4 @see org.apache.lucene.util.FieldCacheSanityChecker 
public	TokenNamepublic	
interface	TokenNameinterface	
FieldCache	TokenNameIdentifier	 Field Cache
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CreationPlaceholder	TokenNameIdentifier	 Creation Placeholder
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Indicator for StringIndex values in the cache. */	TokenNameCOMMENT_JAVADOC	 Indicator for StringIndex values in the cache. 
// NOTE: the value assigned to this constant must not be 	TokenNameCOMMENT_LINE	NOTE: the value assigned to this constant must not be 
// the same as any of those in SortField!! 	TokenNameCOMMENT_LINE	the same as any of those in SortField!! 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STRING_INDEX	TokenNameIdentifier	 STRING  INDEX
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Expert: Stores term text values and document ordering data. */	TokenNameCOMMENT_JAVADOC	 Expert: Stores term text values and document ordering data. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
StringIndex	TokenNameIdentifier	 String Index
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this special case is the reason that Arrays.binarySearch() isn't useful. 	TokenNameCOMMENT_LINE	this special case is the reason that Arrays.binarySearch() isn't useful. 
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
<=	TokenNameLESS_EQUAL	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
// key found 	TokenNameCOMMENT_LINE	key found 
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// key not found. 	TokenNameCOMMENT_LINE	key not found. 
}	TokenNameRBRACE	
/** All the term values, in natural order. */	TokenNameCOMMENT_JAVADOC	 All the term values, in natural order. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookup	TokenNameIdentifier	 lookup
;	TokenNameSEMICOLON	
/** For each document, an index into the lookup array. */	TokenNameCOMMENT_JAVADOC	 For each document, an index into the lookup array. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
order	TokenNameIdentifier	 order
;	TokenNameSEMICOLON	
/** Creates one of these objects */	TokenNameCOMMENT_JAVADOC	 Creates one of these objects 
public	TokenNamepublic	
StringIndex	TokenNameIdentifier	 String Index
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookup	TokenNameIdentifier	 lookup
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Marker interface as super-interface to all parsers. It * is used to specify a custom parser to {@link * SortField#SortField(String, FieldCache.Parser)}. */	TokenNameCOMMENT_JAVADOC	 Marker interface as super-interface to all parsers. It is used to specify a custom parser to {@link SortField#SortField(String, FieldCache.Parser)}. 
public	TokenNamepublic	
interface	TokenNameinterface	
Parser	TokenNameIdentifier	 Parser
extends	TokenNameextends	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Interface to parse bytes from document fields. * @see FieldCache#getBytes(IndexReader, String, FieldCache.ByteParser) */	TokenNameCOMMENT_JAVADOC	 Interface to parse bytes from document fields. @see FieldCache#getBytes(IndexReader, String, FieldCache.ByteParser) 
public	TokenNamepublic	
interface	TokenNameinterface	
ByteParser	TokenNameIdentifier	 Byte Parser
extends	TokenNameextends	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
/** Return a single Byte representation of this field's value. */	TokenNameCOMMENT_JAVADOC	 Return a single Byte representation of this field's value. 
public	TokenNamepublic	
byte	TokenNamebyte	
parseByte	TokenNameIdentifier	 parse Byte
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Interface to parse shorts from document fields. * @see FieldCache#getShorts(IndexReader, String, FieldCache.ShortParser) */	TokenNameCOMMENT_JAVADOC	 Interface to parse shorts from document fields. @see FieldCache#getShorts(IndexReader, String, FieldCache.ShortParser) 
public	TokenNamepublic	
interface	TokenNameinterface	
ShortParser	TokenNameIdentifier	 Short Parser
extends	TokenNameextends	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
/** Return a short representation of this field's value. */	TokenNameCOMMENT_JAVADOC	 Return a short representation of this field's value. 
public	TokenNamepublic	
short	TokenNameshort	
parseShort	TokenNameIdentifier	 parse Short
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Interface to parse ints from document fields. * @see FieldCache#getInts(IndexReader, String, FieldCache.IntParser) */	TokenNameCOMMENT_JAVADOC	 Interface to parse ints from document fields. @see FieldCache#getInts(IndexReader, String, FieldCache.IntParser) 
public	TokenNamepublic	
interface	TokenNameinterface	
IntParser	TokenNameIdentifier	 Int Parser
extends	TokenNameextends	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
/** Return an integer representation of this field's value. */	TokenNameCOMMENT_JAVADOC	 Return an integer representation of this field's value. 
public	TokenNamepublic	
int	TokenNameint	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Interface to parse floats from document fields. * @see FieldCache#getFloats(IndexReader, String, FieldCache.FloatParser) */	TokenNameCOMMENT_JAVADOC	 Interface to parse floats from document fields. @see FieldCache#getFloats(IndexReader, String, FieldCache.FloatParser) 
public	TokenNamepublic	
interface	TokenNameinterface	
FloatParser	TokenNameIdentifier	 Float Parser
extends	TokenNameextends	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
/** Return an float representation of this field's value. */	TokenNameCOMMENT_JAVADOC	 Return an float representation of this field's value. 
public	TokenNamepublic	
float	TokenNamefloat	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Interface to parse long from document fields. * @see FieldCache#getLongs(IndexReader, String, FieldCache.LongParser) */	TokenNameCOMMENT_JAVADOC	 Interface to parse long from document fields. @see FieldCache#getLongs(IndexReader, String, FieldCache.LongParser) 
public	TokenNamepublic	
interface	TokenNameinterface	
LongParser	TokenNameIdentifier	 Long Parser
extends	TokenNameextends	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
/** Return an long representation of this field's value. */	TokenNameCOMMENT_JAVADOC	 Return an long representation of this field's value. 
public	TokenNamepublic	
long	TokenNamelong	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Interface to parse doubles from document fields. * @see FieldCache#getDoubles(IndexReader, String, FieldCache.DoubleParser) */	TokenNameCOMMENT_JAVADOC	 Interface to parse doubles from document fields. @see FieldCache#getDoubles(IndexReader, String, FieldCache.DoubleParser) 
public	TokenNamepublic	
interface	TokenNameinterface	
DoubleParser	TokenNameIdentifier	 Double Parser
extends	TokenNameextends	
Parser	TokenNameIdentifier	 Parser
{	TokenNameLBRACE	
/** Return an long representation of this field's value. */	TokenNameCOMMENT_JAVADOC	 Return an long representation of this field's value. 
public	TokenNamepublic	
double	TokenNamedouble	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Expert: The cache used internally by sorting and range query classes. */	TokenNameCOMMENT_JAVADOC	 Expert: The cache used internally by sorting and range query classes. 
public	TokenNamepublic	
static	TokenNamestatic	
FieldCache	TokenNameIdentifier	 Field Cache
DEFAULT	TokenNameIdentifier	 DEFAULT
=	TokenNameEQUAL	
new	TokenNamenew	
FieldCacheImpl	TokenNameIdentifier	 Field Cache Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The default parser for byte values, which are encoded by {@link Byte#toString(byte)} */	TokenNameCOMMENT_JAVADOC	 The default parser for byte values, which are encoded by {@link Byte#toString(byte)} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ByteParser	TokenNameIdentifier	 Byte Parser
DEFAULT_BYTE_PARSER	TokenNameIdentifier	 DEFAULT  BYTE  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
ByteParser	TokenNameIdentifier	 Byte Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
parseByte	TokenNameIdentifier	 parse Byte
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
parseByte	TokenNameIdentifier	 parse Byte
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT_BYTE_PARSER	TokenNameIdentifier	 DEFAULT  BYTE  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".DEFAULT_BYTE_PARSER"	TokenNameStringLiteral	.DEFAULT_BYTE_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** The default parser for short values, which are encoded by {@link Short#toString(short)} */	TokenNameCOMMENT_JAVADOC	 The default parser for short values, which are encoded by {@link Short#toString(short)} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ShortParser	TokenNameIdentifier	 Short Parser
DEFAULT_SHORT_PARSER	TokenNameIdentifier	 DEFAULT  SHORT  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
ShortParser	TokenNameIdentifier	 Short Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
short	TokenNameshort	
parseShort	TokenNameIdentifier	 parse Short
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
parseShort	TokenNameIdentifier	 parse Short
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT_SHORT_PARSER	TokenNameIdentifier	 DEFAULT  SHORT  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".DEFAULT_SHORT_PARSER"	TokenNameStringLiteral	.DEFAULT_SHORT_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** The default parser for int values, which are encoded by {@link Integer#toString(int)} */	TokenNameCOMMENT_JAVADOC	 The default parser for int values, which are encoded by {@link Integer#toString(int)} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IntParser	TokenNameIdentifier	 Int Parser
DEFAULT_INT_PARSER	TokenNameIdentifier	 DEFAULT  INT  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
IntParser	TokenNameIdentifier	 Int Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT_INT_PARSER	TokenNameIdentifier	 DEFAULT  INT  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".DEFAULT_INT_PARSER"	TokenNameStringLiteral	.DEFAULT_INT_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** The default parser for float values, which are encoded by {@link Float#toString(float)} */	TokenNameCOMMENT_JAVADOC	 The default parser for float values, which are encoded by {@link Float#toString(float)} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
FloatParser	TokenNameIdentifier	 Float Parser
DEFAULT_FLOAT_PARSER	TokenNameIdentifier	 DEFAULT  FLOAT  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
FloatParser	TokenNameIdentifier	 Float Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT_FLOAT_PARSER	TokenNameIdentifier	 DEFAULT  FLOAT  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".DEFAULT_FLOAT_PARSER"	TokenNameStringLiteral	.DEFAULT_FLOAT_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** The default parser for long values, which are encoded by {@link Long#toString(long)} */	TokenNameCOMMENT_JAVADOC	 The default parser for long values, which are encoded by {@link Long#toString(long)} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LongParser	TokenNameIdentifier	 Long Parser
DEFAULT_LONG_PARSER	TokenNameIdentifier	 DEFAULT  LONG  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
LongParser	TokenNameIdentifier	 Long Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
long	TokenNamelong	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT_LONG_PARSER	TokenNameIdentifier	 DEFAULT  LONG  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".DEFAULT_LONG_PARSER"	TokenNameStringLiteral	.DEFAULT_LONG_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** The default parser for double values, which are encoded by {@link Double#toString(double)} */	TokenNameCOMMENT_JAVADOC	 The default parser for double values, which are encoded by {@link Double#toString(double)} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DoubleParser	TokenNameIdentifier	 Double Parser
DEFAULT_DOUBLE_PARSER	TokenNameIdentifier	 DEFAULT  DOUBLE  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
DoubleParser	TokenNameIdentifier	 Double Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DEFAULT_DOUBLE_PARSER	TokenNameIdentifier	 DEFAULT  DOUBLE  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".DEFAULT_DOUBLE_PARSER"	TokenNameStringLiteral	.DEFAULT_DOUBLE_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * A parser instance for int values encoded by {@link NumericUtils#intToPrefixCoded(int)}, e.g. when indexed * via {@link NumericField}/{@link NumericTokenStream}. */	TokenNameCOMMENT_JAVADOC	 A parser instance for int values encoded by {@link NumericUtils#intToPrefixCoded(int)}, e.g. when indexed via {@link NumericField}/{@link NumericTokenStream}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IntParser	TokenNameIdentifier	 Int Parser
NUMERIC_UTILS_INT_PARSER	TokenNameIdentifier	 NUMERIC  UTILS  INT  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
IntParser	TokenNameIdentifier	 Int Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
SHIFT_START_INT	TokenNameIdentifier	 SHIFT  START  INT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
shift	TokenNameIdentifier	 shift
<=	TokenNameLESS_EQUAL	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
FieldCacheImpl	TokenNameIdentifier	 Field Cache Impl
.	TokenNameDOT	
StopFillCacheException	TokenNameIdentifier	 Stop Fill Cache Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToInt	TokenNameIdentifier	 prefix Coded To Int
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NUMERIC_UTILS_INT_PARSER	TokenNameIdentifier	 NUMERIC  UTILS  INT  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".NUMERIC_UTILS_INT_PARSER"	TokenNameStringLiteral	.NUMERIC_UTILS_INT_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * A parser instance for float values encoded with {@link NumericUtils}, e.g. when indexed * via {@link NumericField}/{@link NumericTokenStream}. */	TokenNameCOMMENT_JAVADOC	 A parser instance for float values encoded with {@link NumericUtils}, e.g. when indexed via {@link NumericField}/{@link NumericTokenStream}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
FloatParser	TokenNameIdentifier	 Float Parser
NUMERIC_UTILS_FLOAT_PARSER	TokenNameIdentifier	 NUMERIC  UTILS  FLOAT  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
FloatParser	TokenNameIdentifier	 Float Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
SHIFT_START_INT	TokenNameIdentifier	 SHIFT  START  INT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
shift	TokenNameIdentifier	 shift
<=	TokenNameLESS_EQUAL	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
FieldCacheImpl	TokenNameIdentifier	 Field Cache Impl
.	TokenNameDOT	
StopFillCacheException	TokenNameIdentifier	 Stop Fill Cache Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
sortableIntToFloat	TokenNameIdentifier	 sortable Int To Float
(	TokenNameLPAREN	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToInt	TokenNameIdentifier	 prefix Coded To Int
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NUMERIC_UTILS_FLOAT_PARSER	TokenNameIdentifier	 NUMERIC  UTILS  FLOAT  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".NUMERIC_UTILS_FLOAT_PARSER"	TokenNameStringLiteral	.NUMERIC_UTILS_FLOAT_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * A parser instance for long values encoded by {@link NumericUtils#longToPrefixCoded(long)}, e.g. when indexed * via {@link NumericField}/{@link NumericTokenStream}. */	TokenNameCOMMENT_JAVADOC	 A parser instance for long values encoded by {@link NumericUtils#longToPrefixCoded(long)}, e.g. when indexed via {@link NumericField}/{@link NumericTokenStream}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
LongParser	TokenNameIdentifier	 Long Parser
NUMERIC_UTILS_LONG_PARSER	TokenNameIdentifier	 NUMERIC  UTILS  LONG  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
LongParser	TokenNameIdentifier	 Long Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
long	TokenNamelong	
parseLong	TokenNameIdentifier	 parse Long
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
SHIFT_START_LONG	TokenNameIdentifier	 SHIFT  START  LONG
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
shift	TokenNameIdentifier	 shift
<=	TokenNameLESS_EQUAL	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
FieldCacheImpl	TokenNameIdentifier	 Field Cache Impl
.	TokenNameDOT	
StopFillCacheException	TokenNameIdentifier	 Stop Fill Cache Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToLong	TokenNameIdentifier	 prefix Coded To Long
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NUMERIC_UTILS_LONG_PARSER	TokenNameIdentifier	 NUMERIC  UTILS  LONG  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".NUMERIC_UTILS_LONG_PARSER"	TokenNameStringLiteral	.NUMERIC_UTILS_LONG_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * A parser instance for double values encoded with {@link NumericUtils}, e.g. when indexed * via {@link NumericField}/{@link NumericTokenStream}. */	TokenNameCOMMENT_JAVADOC	 A parser instance for double values encoded with {@link NumericUtils}, e.g. when indexed via {@link NumericField}/{@link NumericTokenStream}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DoubleParser	TokenNameIdentifier	 Double Parser
NUMERIC_UTILS_DOUBLE_PARSER	TokenNameIdentifier	 NUMERIC  UTILS  DOUBLE  PARSER
=	TokenNameEQUAL	
new	TokenNamenew	
DoubleParser	TokenNameIdentifier	 Double Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
SHIFT_START_LONG	TokenNameIdentifier	 SHIFT  START  LONG
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
shift	TokenNameIdentifier	 shift
<=	TokenNameLESS_EQUAL	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
FieldCacheImpl	TokenNameIdentifier	 Field Cache Impl
.	TokenNameDOT	
StopFillCacheException	TokenNameIdentifier	 Stop Fill Cache Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
sortableLongToDouble	TokenNameIdentifier	 sortable Long To Double
(	TokenNameLPAREN	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToLong	TokenNameIdentifier	 prefix Coded To Long
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NUMERIC_UTILS_DOUBLE_PARSER	TokenNameIdentifier	 NUMERIC  UTILS  DOUBLE  PARSER
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
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
".NUMERIC_UTILS_DOUBLE_PARSER"	TokenNameStringLiteral	.NUMERIC_UTILS_DOUBLE_PARSER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> and returns a bit set at the size of * <code>reader.maxDoc()</code>, with turned on bits for each docid that * does have a value for this field. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> and returns a bit set at the size of <code>reader.maxDoc()</code>, with turned on bits for each docid that does have a value for this field. 
public	TokenNamepublic	
Bits	TokenNameIdentifier	 Bits
getDocsWithField	TokenNameIdentifier	 get Docs With Field
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is * found, reads the terms in <code>field</code> as a single byte and returns an array * of size <code>reader.maxDoc()</code> of the value each document * has in the given field. * @param reader Used to get field values. * @param field Which field contains the single byte values. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as a single byte and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the single byte values. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as bytes and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * @param reader Used to get field values. * @param field Which field contains the bytes. * @param parser Computes byte for string values. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as bytes and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the bytes. @param parser Computes byte for string values. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
ByteParser	TokenNameIdentifier	 Byte Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as bytes and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * @param reader Used to get field values. * @param field Which field contains the bytes. * @param parser Computes byte for string values. * @param setDocsWithField If true then {@link #getDocsWithField} will * also be computed and stored in the FieldCache. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as bytes and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the bytes. @param parser Computes byte for string values. @param setDocsWithField If true then {@link #getDocsWithField} will also be computed and stored in the FieldCache. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
ByteParser	TokenNameIdentifier	 Byte Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setDocsWithField	TokenNameIdentifier	 set Docs With Field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is * found, reads the terms in <code>field</code> as shorts and returns an array * of size <code>reader.maxDoc()</code> of the value each document * has in the given field. * @param reader Used to get field values. * @param field Which field contains the shorts. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as shorts and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the shorts. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getShorts	TokenNameIdentifier	 get Shorts
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as shorts and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * @param reader Used to get field values. * @param field Which field contains the shorts. * @param parser Computes short for string values. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as shorts and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the shorts. @param parser Computes short for string values. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getShorts	TokenNameIdentifier	 get Shorts
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
ShortParser	TokenNameIdentifier	 Short Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as shorts and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * @param reader Used to get field values. * @param field Which field contains the shorts. * @param parser Computes short for string values. * @param setDocsWithField If true then {@link #getDocsWithField} will * also be computed and stored in the FieldCache. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as shorts and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the shorts. @param parser Computes short for string values. @param setDocsWithField If true then {@link #getDocsWithField} will also be computed and stored in the FieldCache. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getShorts	TokenNameIdentifier	 get Shorts
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
ShortParser	TokenNameIdentifier	 Short Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setDocsWithField	TokenNameIdentifier	 set Docs With Field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is * found, reads the terms in <code>field</code> as integers and returns an array * of size <code>reader.maxDoc()</code> of the value each document * has in the given field. * @param reader Used to get field values. * @param field Which field contains the integers. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as integers and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the integers. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getInts	TokenNameIdentifier	 get Ints
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as integers and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * @param reader Used to get field values. * @param field Which field contains the integers. * @param parser Computes integer for string values. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as integers and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the integers. @param parser Computes integer for string values. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getInts	TokenNameIdentifier	 get Ints
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
IntParser	TokenNameIdentifier	 Int Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as integers and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * @param reader Used to get field values. * @param field Which field contains the integers. * @param parser Computes integer for string values. * @param setDocsWithField If true then {@link #getDocsWithField} will * also be computed and stored in the FieldCache. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as integers and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the integers. @param parser Computes integer for string values. @param setDocsWithField If true then {@link #getDocsWithField} will also be computed and stored in the FieldCache. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getInts	TokenNameIdentifier	 get Ints
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
IntParser	TokenNameIdentifier	 Int Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setDocsWithField	TokenNameIdentifier	 set Docs With Field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if * none is found, reads the terms in <code>field</code> as floats and returns an array * of size <code>reader.maxDoc()</code> of the value each document * has in the given field. * @param reader Used to get field values. * @param field Which field contains the floats. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as floats and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the floats. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFloats	TokenNameIdentifier	 get Floats
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if * none is found, reads the terms in <code>field</code> as floats and returns an array * of size <code>reader.maxDoc()</code> of the value each document * has in the given field. * @param reader Used to get field values. * @param field Which field contains the floats. * @param parser Computes float for string values. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as floats and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the floats. @param parser Computes float for string values. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFloats	TokenNameIdentifier	 get Floats
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FloatParser	TokenNameIdentifier	 Float Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if * none is found, reads the terms in <code>field</code> as floats and returns an array * of size <code>reader.maxDoc()</code> of the value each document * has in the given field. * @param reader Used to get field values. * @param field Which field contains the floats. * @param parser Computes float for string values. * @param setDocsWithField If true then {@link #getDocsWithField} will * also be computed and stored in the FieldCache. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as floats and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the floats. @param parser Computes float for string values. @param setDocsWithField If true then {@link #getDocsWithField} will also be computed and stored in the FieldCache. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFloats	TokenNameIdentifier	 get Floats
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FloatParser	TokenNameIdentifier	 Float Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setDocsWithField	TokenNameIdentifier	 set Docs With Field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Checks the internal cache for an appropriate entry, and if none is * found, reads the terms in <code>field</code> as longs and returns an array * of size <code>reader.maxDoc()</code> of the value each document * has in the given field. * * @param reader Used to get field values. * @param field Which field contains the longs. * @return The values in the given field for each document. * @throws java.io.IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as longs and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. * @param reader Used to get field values. @param field Which field contains the longs. @return The values in the given field for each document. @throws java.io.IOException If any error occurs. 
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLongs	TokenNameIdentifier	 get Longs
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as longs and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * * @param reader Used to get field values. * @param field Which field contains the longs. * @param parser Computes integer for string values. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as longs and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. * @param reader Used to get field values. @param field Which field contains the longs. @param parser Computes integer for string values. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLongs	TokenNameIdentifier	 get Longs
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
LongParser	TokenNameIdentifier	 Long Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as longs and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * * @param reader Used to get field values. * @param field Which field contains the longs. * @param parser Computes integer for string values. * @param setDocsWithField If true then {@link #getDocsWithField} will * also be computed and stored in the FieldCache. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as longs and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. * @param reader Used to get field values. @param field Which field contains the longs. @param parser Computes integer for string values. @param setDocsWithField If true then {@link #getDocsWithField} will also be computed and stored in the FieldCache. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLongs	TokenNameIdentifier	 get Longs
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
LongParser	TokenNameIdentifier	 Long Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setDocsWithField	TokenNameIdentifier	 set Docs With Field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Checks the internal cache for an appropriate entry, and if none is * found, reads the terms in <code>field</code> as integers and returns an array * of size <code>reader.maxDoc()</code> of the value each document * has in the given field. * * @param reader Used to get field values. * @param field Which field contains the doubles. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as integers and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. * @param reader Used to get field values. @param field Which field contains the doubles. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as doubles and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * * @param reader Used to get field values. * @param field Which field contains the doubles. * @param parser Computes integer for string values. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as doubles and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. * @param reader Used to get field values. @param field Which field contains the doubles. @param parser Computes integer for string values. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
DoubleParser	TokenNameIdentifier	 Double Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Checks the internal cache for an appropriate entry, and if none is found, * reads the terms in <code>field</code> as doubles and returns an array of * size <code>reader.maxDoc()</code> of the value each document has in the * given field. * * @param reader Used to get field values. * @param field Which field contains the doubles. * @param parser Computes integer for string values. * @param setDocsWithField If true then {@link #getDocsWithField} will * also be computed and stored in the FieldCache. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the terms in <code>field</code> as doubles and returns an array of size <code>reader.maxDoc()</code> of the value each document has in the given field. * @param reader Used to get field values. @param field Which field contains the doubles. @param parser Computes integer for string values. @param setDocsWithField If true then {@link #getDocsWithField} will also be computed and stored in the FieldCache. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
DoubleParser	TokenNameIdentifier	 Double Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
boolean	TokenNameboolean	
setDocsWithField	TokenNameIdentifier	 set Docs With Field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none * is found, reads the term values in <code>field</code> and returns an array * of size <code>reader.maxDoc()</code> containing the value each document * has in the given field. * @param reader Used to get field values. * @param field Which field contains the strings. * @return The values in the given field for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found, reads the term values in <code>field</code> and returns an array of size <code>reader.maxDoc()</code> containing the value each document has in the given field. @param reader Used to get field values. @param field Which field contains the strings. @return The values in the given field for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getStrings	TokenNameIdentifier	 get Strings
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Checks the internal cache for an appropriate entry, and if none * is found reads the term values in <code>field</code> and returns * an array of them in natural order, along with an array telling * which element in the term array each document uses. * @param reader Used to get field values. * @param field Which field contains the strings. * @return Array of terms and index into the array for each document. * @throws IOException If any error occurs. */	TokenNameCOMMENT_JAVADOC	 Checks the internal cache for an appropriate entry, and if none is found reads the term values in <code>field</code> and returns an array of them in natural order, along with an array telling which element in the term array each document uses. @param reader Used to get field values. @param field Which field contains the strings. @return Array of terms and index into the array for each document. @throws IOException If any error occurs. 
public	TokenNamepublic	
StringIndex	TokenNameIdentifier	 String Index
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * EXPERT: A unique Identifier/Description for each item in the FieldCache. * Can be useful for logging/debugging. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 EXPERT: A unique Identifier/Description for each item in the FieldCache. Can be useful for logging/debugging. @lucene.experimental 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
CacheEntry	TokenNameIdentifier	 Cache Entry
{	TokenNameLBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
Object	TokenNameIdentifier	 Object
getReaderKey	TokenNameIdentifier	 get Reader Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getCacheType	TokenNameIdentifier	 get Cache Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
Object	TokenNameIdentifier	 Object
getCustom	TokenNameIdentifier	 get Custom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
Object	TokenNameIdentifier	 Object
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
setEstimatedSize	TokenNameIdentifier	 set Estimated Size
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Computes (and stores) the estimated size of the cache Value * @see #getEstimatedSize */	TokenNameCOMMENT_JAVADOC	 Computes (and stores) the estimated size of the cache Value @see #getEstimatedSize 
public	TokenNamepublic	
void	TokenNamevoid	
estimateSize	TokenNameIdentifier	 estimate Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
sizeOf	TokenNameIdentifier	 size Of
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEstimatedSize	TokenNameIdentifier	 set Estimated Size
(	TokenNameLPAREN	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
humanReadableUnits	TokenNameIdentifier	 human Readable Units
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The most recently estimated size of the value, null unless * estimateSize has been called. */	TokenNameCOMMENT_JAVADOC	 The most recently estimated size of the value, null unless estimateSize has been called. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getEstimatedSize	TokenNameIdentifier	 get Estimated Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
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
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getReaderKey	TokenNameIdentifier	 get Reader Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'=>"	TokenNameStringLiteral	'=>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"',"	TokenNameStringLiteral	',
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getCacheType	TokenNameIdentifier	 get Cache Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getCustom	TokenNameIdentifier	 get Custom
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"=>"	TokenNameStringLiteral	=>
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
identityHashCode	TokenNameIdentifier	 identity Hash Code
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getEstimatedSize	TokenNameIdentifier	 get Estimated Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" (size =~ "	TokenNameStringLiteral	 (size =~ 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * EXPERT: Generates an array of CacheEntry objects representing all items * currently in the FieldCache. * <p> * NOTE: These CacheEntry objects maintain a strong reference to the * Cached Values. Maintaining references to a CacheEntry the IndexReader * associated with it has garbage collected will prevent the Value itself * from being garbage collected when the Cache drops the WeakReference. * </p> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 EXPERT: Generates an array of CacheEntry objects representing all items currently in the FieldCache. <p> NOTE: These CacheEntry objects maintain a strong reference to the Cached Values. Maintaining references to a CacheEntry the IndexReader associated with it has garbage collected will prevent the Value itself from being garbage collected when the Cache drops the WeakReference. </p> @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
CacheEntry	TokenNameIdentifier	 Cache Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCacheEntries	TokenNameIdentifier	 get Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <p> * EXPERT: Instructs the FieldCache to forcibly expunge all entries * from the underlying caches. This is intended only to be used for * test methods as a way to ensure a known base state of the Cache * (with out needing to rely on GC to free WeakReferences). * It should not be relied on for "Cache maintenance" in general * application code. * </p> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 <p> EXPERT: Instructs the FieldCache to forcibly expunge all entries from the underlying caches. This is intended only to be used for test methods as a way to ensure a known base state of the Cache (with out needing to rely on GC to free WeakReferences). It should not be relied on for "Cache maintenance" in general application code. </p> @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
purgeAllCaches	TokenNameIdentifier	 purge All Caches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Expert: drops all cache entries associated with this * reader. NOTE: this reader must precisely match the * reader that the cache entry is keyed on. If you pass a * top-level reader, it usually will have no effect as * Lucene now caches at the segment reader level. */	TokenNameCOMMENT_JAVADOC	 Expert: drops all cache entries associated with this reader. NOTE: this reader must precisely match the reader that the cache entry is keyed on. If you pass a top-level reader, it usually will have no effect as Lucene now caches at the segment reader level. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
purge	TokenNameIdentifier	 purge
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * If non-null, FieldCacheImpl will warn whenever * entries are created that are not sane according to * {@link org.apache.lucene.util.FieldCacheSanityChecker}. */	TokenNameCOMMENT_JAVADOC	 If non-null, FieldCacheImpl will warn whenever entries are created that are not sane according to {@link org.apache.lucene.util.FieldCacheSanityChecker}. 
public	TokenNamepublic	
void	TokenNamevoid	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** counterpart of {@link #setInfoStream(PrintStream)} */	TokenNameCOMMENT_JAVADOC	 counterpart of {@link #setInfoStream(PrintStream)} 
public	TokenNamepublic	
PrintStream	TokenNameIdentifier	 Print Stream
getInfoStream	TokenNameIdentifier	 get Info Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
