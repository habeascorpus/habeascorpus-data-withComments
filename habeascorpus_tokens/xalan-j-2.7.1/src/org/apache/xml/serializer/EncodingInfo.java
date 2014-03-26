/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: EncodingInfo.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: EncodingInfo.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
/** * Holds information about a given encoding, which is the Java name for the * encoding, the equivalent ISO name. * <p> * An object of this type has two useful methods * <pre> * isInEncoding(char ch); * </pre> * which can be called if the character is not the high one in * a surrogate pair and: * <pre> * isInEncoding(char high, char low); * </pre> * which can be called if the two characters from a high/low surrogate pair. * <p> * An EncodingInfo object is a node in a binary search tree. Such a node * will answer if a character is in the encoding, and do so for a given * range of unicode values (<code>m_first</code> to * <code>m_last</code>). It will handle a certain range of values * explicitly (<code>m_explFirst</code> to <code>m_explLast</code>). * If the unicode point is before that explicit range, that is it * is in the range <code>m_first <= value < m_explFirst</code>, then it will delegate to another EncodingInfo object for The root * of such a tree, m_before. Likewise for values in the range * <code>m_explLast < value <= m_last</code>, but delgating to <code>m_after</code> * <p> * Actually figuring out if a code point is in the encoding is expensive. So the * purpose of this tree is to cache such determinations, and not to build the * entire tree of information at the start, but only build up as much of the * tree as is used during the transformation. * <p> * This Class is not a public API, and should only be used internally within * the serializer. * <p> * This class is not a public API. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Holds information about a given encoding, which is the Java name for the encoding, the equivalent ISO name. <p> An object of this type has two useful methods <pre> isInEncoding(char ch); </pre> which can be called if the character is not the high one in a surrogate pair and: <pre> isInEncoding(char high, char low); </pre> which can be called if the two characters from a high/low surrogate pair. <p> An EncodingInfo object is a node in a binary search tree. Such a node will answer if a character is in the encoding, and do so for a given range of unicode values (<code>m_first</code> to <code>m_last</code>). It will handle a certain range of values explicitly (<code>m_explFirst</code> to <code>m_explLast</code>). If the unicode point is before that explicit range, that is it is in the range <code>m_first <= value < m_explFirst</code>, then it will delegate to another EncodingInfo object for The root of such a tree, m_before. Likewise for values in the range <code>m_explLast < value <= m_last</code>, but delgating to <code>m_after</code> <p> Actually figuring out if a code point is in the encoding is expensive. So the purpose of this tree is to cache such determinations, and not to build the entire tree of information at the start, but only build up as much of the tree as is used during the transformation. <p> This Class is not a public API, and should only be used internally within the serializer. <p> This class is not a public API. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
EncodingInfo	TokenNameIdentifier	 Encoding Info
extends	TokenNameextends	
Object	TokenNameIdentifier	 Object
{	TokenNameLBRACE	
/** * Not all characters in an encoding are in on contiguous group, * however there is a lowest contiguous group starting at '	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
m_highCharInContiguousGroup	TokenNameIdentifier	 m high Char In Contiguous Group
;	TokenNameSEMICOLON	
/** * The ISO encoding name. */	TokenNameCOMMENT_JAVADOC	 The ISO encoding name. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * The name used by the Java convertor. */	TokenNameCOMMENT_JAVADOC	 The name used by the Java convertor. 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
javaName	TokenNameIdentifier	 java Name
;	TokenNameSEMICOLON	
/** * A helper object that we can ask if a * single char, or a surrogate UTF-16 pair * of chars that form a single character, * is in this encoding. */	TokenNameCOMMENT_JAVADOC	 A helper object that we can ask if a single char, or a surrogate UTF-16 pair of chars that form a single character, is in this encoding. 
private	TokenNameprivate	
InEncoding	TokenNameIdentifier	 In Encoding
m_encoding	TokenNameIdentifier	 m encoding
;	TokenNameSEMICOLON	
/** * This is not a public API. It returns true if the * char in question is in the encoding. * @param ch the char in question. * <p> * This method is not a public API. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This is not a public API. It returns true if the char in question is in the encoding. @param ch the char in question. <p> This method is not a public API. @xsl.usage internal 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_encoding	TokenNameIdentifier	 m encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_encoding	TokenNameIdentifier	 m encoding
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingImpl	TokenNameIdentifier	 Encoding Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// One could put alternate logic in here to 	TokenNameCOMMENT_LINE	One could put alternate logic in here to 
// instantiate another object that implements the 	TokenNameCOMMENT_LINE	instantiate another object that implements the 
// InEncoding interface. For example if the JRE is 1.4 or up 	TokenNameCOMMENT_LINE	InEncoding interface. For example if the JRE is 1.4 or up 
// we could have an object that uses JRE 1.4 methods 	TokenNameCOMMENT_LINE	we could have an object that uses JRE 1.4 methods 
}	TokenNameRBRACE	
return	TokenNamereturn	
m_encoding	TokenNameIdentifier	 m encoding
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is not a public API. It returns true if the * character formed by the high/low pair is in the encoding. * @param high a char that the a high char of a high/low surrogate pair. * @param low a char that is the low char of a high/low surrogate pair. * <p> * This method is not a public API. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This is not a public API. It returns true if the character formed by the high/low pair is in the encoding. @param high a char that the a high char of a high/low surrogate pair. @param low a char that is the low char of a high/low surrogate pair. <p> This method is not a public API. @xsl.usage internal 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
char	TokenNamechar	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_encoding	TokenNameIdentifier	 m encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_encoding	TokenNameIdentifier	 m encoding
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingImpl	TokenNameIdentifier	 Encoding Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// One could put alternate logic in here to 	TokenNameCOMMENT_LINE	One could put alternate logic in here to 
// instantiate another object that implements the 	TokenNameCOMMENT_LINE	instantiate another object that implements the 
// InEncoding interface. For example if the JRE is 1.4 or up 	TokenNameCOMMENT_LINE	InEncoding interface. For example if the JRE is 1.4 or up 
// we could have an object that uses JRE 1.4 methods 	TokenNameCOMMENT_LINE	we could have an object that uses JRE 1.4 methods 
}	TokenNameRBRACE	
return	TokenNamereturn	
m_encoding	TokenNameIdentifier	 m encoding
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an EncodingInfo object based on the ISO name and Java name. * If both parameters are null any character will be considered to * be in the encoding. This is useful for when the serializer is in * temporary output state, and has no assciated encoding. * * @param name reference to the ISO name. * @param javaName reference to the Java encoding name. * @param highChar The char for which characters at or below this value are * definately in the * encoding, although for characters above this point they might be in the encoding. */	TokenNameCOMMENT_JAVADOC	 Create an EncodingInfo object based on the ISO name and Java name. If both parameters are null any character will be considered to be in the encoding. This is useful for when the serializer is in temporary output state, and has no assciated encoding. * @param name reference to the ISO name. @param javaName reference to the Java encoding name. @param highChar The char for which characters at or below this value are definately in the encoding, although for characters above this point they might be in the encoding. 
public	TokenNamepublic	
EncodingInfo	TokenNameIdentifier	 Encoding Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
javaName	TokenNameIdentifier	 java Name
,	TokenNameCOMMA	
char	TokenNamechar	
highChar	TokenNameIdentifier	 high Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
javaName	TokenNameIdentifier	 java Name
=	TokenNameEQUAL	
javaName	TokenNameIdentifier	 java Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_highCharInContiguousGroup	TokenNameIdentifier	 m high Char In Contiguous Group
=	TokenNameEQUAL	
highChar	TokenNameIdentifier	 high Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A simple interface to isolate the implementation. * We could also use some new JRE 1.4 methods in another implementation * provided we use reflection with them. * <p> * This interface is not a public API, * and should only be used internally within the serializer. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A simple interface to isolate the implementation. We could also use some new JRE 1.4 methods in another implementation provided we use reflection with them. <p> This interface is not a public API, and should only be used internally within the serializer. @xsl.usage internal 
private	TokenNameprivate	
interface	TokenNameinterface	
InEncoding	TokenNameIdentifier	 In Encoding
{	TokenNameLBRACE	
/** * Returns true if the char is in the encoding */	TokenNameCOMMENT_JAVADOC	 Returns true if the char is in the encoding 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the high/low surrogate pair forms * a character that is in the encoding. */	TokenNameCOMMENT_JAVADOC	 Returns true if the high/low surrogate pair forms a character that is in the encoding. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
char	TokenNamechar	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class implements the */	TokenNameCOMMENT_JAVADOC	 This class implements the 
private	TokenNameprivate	
class	TokenNameclass	
EncodingImpl	TokenNameIdentifier	 Encoding Impl
implements	TokenNameimplements	
InEncoding	TokenNameIdentifier	 In Encoding
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
toCodePoint	TokenNameIdentifier	 to Code Point
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
<	TokenNameLESS	
m_explFirst	TokenNameIdentifier	 m expl First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The unicode value is before the range 	TokenNameCOMMENT_LINE	The unicode value is before the range 
// that we explictly manage, so we delegate the answer. 	TokenNameCOMMENT_LINE	that we explictly manage, so we delegate the answer. 
// If we don't have an m_before object to delegate to, make one. 	TokenNameCOMMENT_LINE	If we don't have an m_before object to delegate to, make one. 
if	TokenNameif	
(	TokenNameLPAREN	
m_before	TokenNameIdentifier	 m before
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_before	TokenNameIdentifier	 m before
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingImpl	TokenNameIdentifier	 Encoding Impl
(	TokenNameLPAREN	
m_encoding	TokenNameIdentifier	 m encoding
,	TokenNameCOMMA	
m_first	TokenNameIdentifier	 m first
,	TokenNameCOMMA	
m_explFirst	TokenNameIdentifier	 m expl First
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
m_before	TokenNameIdentifier	 m before
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_explLast	TokenNameIdentifier	 m expl Last
<	TokenNameLESS	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The unicode value is after the range 	TokenNameCOMMENT_LINE	The unicode value is after the range 
// that we explictly manage, so we delegate the answer. 	TokenNameCOMMENT_LINE	that we explictly manage, so we delegate the answer. 
// If we don't have an m_after object to delegate to, make one. 	TokenNameCOMMENT_LINE	If we don't have an m_after object to delegate to, make one. 
if	TokenNameif	
(	TokenNameLPAREN	
m_after	TokenNameIdentifier	 m after
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_after	TokenNameIdentifier	 m after
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingImpl	TokenNameIdentifier	 Encoding Impl
(	TokenNameLPAREN	
m_encoding	TokenNameIdentifier	 m encoding
,	TokenNameCOMMA	
m_explLast	TokenNameIdentifier	 m expl Last
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_last	TokenNameIdentifier	 m last
,	TokenNameCOMMA	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
m_after	TokenNameIdentifier	 m after
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The unicode value is in the range we explitly handle 	TokenNameCOMMENT_LINE	The unicode value is in the range we explitly handle 
final	TokenNamefinal	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
codePoint	TokenNameIdentifier	 code Point
-	TokenNameMINUS	
m_explFirst	TokenNameIdentifier	 m expl First
;	TokenNameSEMICOLON	
// If we already know the answer, just return it. 	TokenNameCOMMENT_LINE	If we already know the answer, just return it. 
if	TokenNameif	
(	TokenNameLPAREN	
m_alreadyKnown	TokenNameIdentifier	 m already Known
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
m_isInEncoding	TokenNameIdentifier	 m is In Encoding
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// We don't know the answer, so find out, 	TokenNameCOMMENT_LINE	We don't know the answer, so find out, 
// which may be expensive, then cache the answer 	TokenNameCOMMENT_LINE	which may be expensive, then cache the answer 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
inEncoding	TokenNameIdentifier	 in Encoding
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
,	TokenNameCOMMA	
m_encoding	TokenNameIdentifier	 m encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_alreadyKnown	TokenNameIdentifier	 m already Known
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_isInEncoding	TokenNameIdentifier	 m is In Encoding
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
char	TokenNamechar	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
=	TokenNameEQUAL	
Encodings	TokenNameIdentifier	 Encodings
.	TokenNameDOT	
toCodePoint	TokenNameIdentifier	 to Code Point
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
<	TokenNameLESS	
m_explFirst	TokenNameIdentifier	 m expl First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The unicode value is before the range 	TokenNameCOMMENT_LINE	The unicode value is before the range 
// that we explictly manage, so we delegate the answer. 	TokenNameCOMMENT_LINE	that we explictly manage, so we delegate the answer. 
// If we don't have an m_before object to delegate to, make one. 	TokenNameCOMMENT_LINE	If we don't have an m_before object to delegate to, make one. 
if	TokenNameif	
(	TokenNameLPAREN	
m_before	TokenNameIdentifier	 m before
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_before	TokenNameIdentifier	 m before
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingImpl	TokenNameIdentifier	 Encoding Impl
(	TokenNameLPAREN	
m_encoding	TokenNameIdentifier	 m encoding
,	TokenNameCOMMA	
m_first	TokenNameIdentifier	 m first
,	TokenNameCOMMA	
m_explFirst	TokenNameIdentifier	 m expl First
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
m_before	TokenNameIdentifier	 m before
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_explLast	TokenNameIdentifier	 m expl Last
<	TokenNameLESS	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The unicode value is after the range 	TokenNameCOMMENT_LINE	The unicode value is after the range 
// that we explictly manage, so we delegate the answer. 	TokenNameCOMMENT_LINE	that we explictly manage, so we delegate the answer. 
// If we don't have an m_after object to delegate to, make one. 	TokenNameCOMMENT_LINE	If we don't have an m_after object to delegate to, make one. 
if	TokenNameif	
(	TokenNameLPAREN	
m_after	TokenNameIdentifier	 m after
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_after	TokenNameIdentifier	 m after
=	TokenNameEQUAL	
new	TokenNamenew	
EncodingImpl	TokenNameIdentifier	 Encoding Impl
(	TokenNameLPAREN	
m_encoding	TokenNameIdentifier	 m encoding
,	TokenNameCOMMA	
m_explLast	TokenNameIdentifier	 m expl Last
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_last	TokenNameIdentifier	 m last
,	TokenNameCOMMA	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
m_after	TokenNameIdentifier	 m after
.	TokenNameDOT	
isInEncoding	TokenNameIdentifier	 is In Encoding
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The unicode value is in the range we explitly handle 	TokenNameCOMMENT_LINE	The unicode value is in the range we explitly handle 
final	TokenNamefinal	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
codePoint	TokenNameIdentifier	 code Point
-	TokenNameMINUS	
m_explFirst	TokenNameIdentifier	 m expl First
;	TokenNameSEMICOLON	
// If we already know the answer, just return it. 	TokenNameCOMMENT_LINE	If we already know the answer, just return it. 
if	TokenNameif	
(	TokenNameLPAREN	
m_alreadyKnown	TokenNameIdentifier	 m already Known
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
m_isInEncoding	TokenNameIdentifier	 m is In Encoding
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// We don't know the answer, so find out, 	TokenNameCOMMENT_LINE	We don't know the answer, so find out, 
// which may be expensive, then cache the answer 	TokenNameCOMMENT_LINE	which may be expensive, then cache the answer 
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
inEncoding	TokenNameIdentifier	 in Encoding
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
low	TokenNameIdentifier	 low
,	TokenNameCOMMA	
m_encoding	TokenNameIdentifier	 m encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_alreadyKnown	TokenNameIdentifier	 m already Known
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_isInEncoding	TokenNameIdentifier	 m is In Encoding
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The encoding. */	TokenNameCOMMENT_JAVADOC	 The encoding. 
final	TokenNamefinal	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_encoding	TokenNameIdentifier	 m encoding
;	TokenNameSEMICOLON	
/** * m_first through m_last is the range of unicode * values that this object will return an answer on. * It may delegate to a similar object with a different * range */	TokenNameCOMMENT_JAVADOC	 m_first through m_last is the range of unicode values that this object will return an answer on. It may delegate to a similar object with a different range 
final	TokenNamefinal	
private	TokenNameprivate	
int	TokenNameint	
m_first	TokenNameIdentifier	 m first
;	TokenNameSEMICOLON	
/** * m_explFirst through m_explLast is the range of unicode * value that this object handles explicitly and does not * delegate to a similar object. */	TokenNameCOMMENT_JAVADOC	 m_explFirst through m_explLast is the range of unicode value that this object handles explicitly and does not delegate to a similar object. 
final	TokenNamefinal	
private	TokenNameprivate	
int	TokenNameint	
m_explFirst	TokenNameIdentifier	 m expl First
;	TokenNameSEMICOLON	
final	TokenNamefinal	
private	TokenNameprivate	
int	TokenNameint	
m_explLast	TokenNameIdentifier	 m expl Last
;	TokenNameSEMICOLON	
final	TokenNamefinal	
private	TokenNameprivate	
int	TokenNameint	
m_last	TokenNameIdentifier	 m last
;	TokenNameSEMICOLON	
/** * The object, of the same type as this one, * that handles unicode values in a range before * the range explictly handled by this object, and * to which this object may delegate. */	TokenNameCOMMENT_JAVADOC	 The object, of the same type as this one, that handles unicode values in a range before the range explictly handled by this object, and to which this object may delegate. 
private	TokenNameprivate	
InEncoding	TokenNameIdentifier	 In Encoding
m_before	TokenNameIdentifier	 m before
;	TokenNameSEMICOLON	
/** * The object, of the same type as this one, * that handles unicode values in a range after * the range explictly handled by this object, and * to which this object may delegate. */	TokenNameCOMMENT_JAVADOC	 The object, of the same type as this one, that handles unicode values in a range after the range explictly handled by this object, and to which this object may delegate. 
private	TokenNameprivate	
InEncoding	TokenNameIdentifier	 In Encoding
m_after	TokenNameIdentifier	 m after
;	TokenNameSEMICOLON	
/** * The number of unicode values explicitly handled * by a single EncodingInfo object. This value is * tuneable, but is set to 128 because that covers the * entire low range of ASCII type chars within a single * object. */	TokenNameCOMMENT_JAVADOC	 The number of unicode values explicitly handled by a single EncodingInfo object. This value is tuneable, but is set to 128 because that covers the entire low range of ASCII type chars within a single object. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RANGE	TokenNameIdentifier	 RANGE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A flag to record if we already know the answer * for the given unicode value. */	TokenNameCOMMENT_JAVADOC	 A flag to record if we already know the answer for the given unicode value. 
final	TokenNamefinal	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_alreadyKnown	TokenNameIdentifier	 m already Known
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
RANGE	TokenNameIdentifier	 RANGE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * A table holding the answer on whether the given unicode * value is in the encoding. */	TokenNameCOMMENT_JAVADOC	 A table holding the answer on whether the given unicode value is in the encoding. 
final	TokenNamefinal	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isInEncoding	TokenNameIdentifier	 m is In Encoding
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
RANGE	TokenNameIdentifier	 RANGE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
EncodingImpl	TokenNameIdentifier	 Encoding Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This object will answer whether any unicode value 	TokenNameCOMMENT_LINE	This object will answer whether any unicode value 
// is in the encoding, it handles values 0 through Integer.MAX_VALUE 	TokenNameCOMMENT_LINE	is in the encoding, it handles values 0 through Integer.MAX_VALUE 
this	TokenNamethis	
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
EncodingImpl	TokenNameIdentifier	 Encoding Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
int	TokenNameint	
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
int	TokenNameint	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Set the range of unicode values that this object manages 	TokenNameCOMMENT_LINE	Set the range of unicode values that this object manages 
// either explicitly or implicitly. 	TokenNameCOMMENT_LINE	either explicitly or implicitly. 
m_first	TokenNameIdentifier	 m first
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
// Set the range of unicode values that this object 	TokenNameCOMMENT_LINE	Set the range of unicode values that this object 
// explicitly manages 	TokenNameCOMMENT_LINE	explicitly manages 
m_explFirst	TokenNameIdentifier	 m expl First
=	TokenNameEQUAL	
codePoint	TokenNameIdentifier	 code Point
;	TokenNameSEMICOLON	
m_explLast	TokenNameIdentifier	 m expl Last
=	TokenNameEQUAL	
codePoint	TokenNameIdentifier	 code Point
+	TokenNamePLUS	
(	TokenNameLPAREN	
RANGE	TokenNameIdentifier	 RANGE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_encoding	TokenNameIdentifier	 m encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Some optimization. 	TokenNameCOMMENT_LINE	Some optimization. 
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
m_explFirst	TokenNameIdentifier	 m expl First
&&	TokenNameAND_AND	
m_explFirst	TokenNameIdentifier	 m expl First
<=	TokenNameLESS_EQUAL	
127	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This particular EncodingImpl explicitly handles 	TokenNameCOMMENT_LINE	This particular EncodingImpl explicitly handles 
// characters in the low range. 	TokenNameCOMMENT_LINE	characters in the low range. 
if	TokenNameif	
(	TokenNameLPAREN	
"UTF8"	TokenNameStringLiteral	UTF8
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"UTF-16"	TokenNameStringLiteral	UTF-16
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"ASCII"	TokenNameStringLiteral	ASCII
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"US-ASCII"	TokenNameStringLiteral	US-ASCII
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"Unicode"	TokenNameStringLiteral	Unicode
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
"UNICODE"	TokenNameStringLiteral	UNICODE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
javaName	TokenNameIdentifier	 java Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"ISO8859"	TokenNameStringLiteral	ISO8859
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not only does this EncodingImpl object explicitly 	TokenNameCOMMENT_LINE	Not only does this EncodingImpl object explicitly 
// handle chracters in the low range, it is 	TokenNameCOMMENT_LINE	handle chracters in the low range, it is 
// also one that we know something about, without 	TokenNameCOMMENT_LINE	also one that we know something about, without 
// needing to call inEncoding(char ch, String encoding) 	TokenNameCOMMENT_LINE	needing to call inEncoding(char ch, String encoding) 
// for this low range 	TokenNameCOMMENT_LINE	for this low range 
// 	TokenNameCOMMENT_LINE	 
// By initializing the table ahead of time 	TokenNameCOMMENT_LINE	By initializing the table ahead of time 
// for these low values, we prevent the expensive 	TokenNameCOMMENT_LINE	for these low values, we prevent the expensive 
// inEncoding(char ch, String encoding) 	TokenNameCOMMENT_LINE	inEncoding(char ch, String encoding) 
// from being called, at least for these common 	TokenNameCOMMENT_LINE	from being called, at least for these common 
// encodings. 	TokenNameCOMMENT_LINE	encodings. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
unicode	TokenNameIdentifier	 unicode
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
unicode	TokenNameIdentifier	 unicode
<	TokenNameLESS	
127	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
unicode	TokenNameIdentifier	 unicode
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
unicode	TokenNameIdentifier	 unicode
-	TokenNameMINUS	
m_explFirst	TokenNameIdentifier	 m expl First
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
idx	TokenNameIdentifier	 idx
&&	TokenNameAND_AND	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
RANGE	TokenNameIdentifier	 RANGE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_alreadyKnown	TokenNameIdentifier	 m already Known
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_isInEncoding	TokenNameIdentifier	 m is In Encoding
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* A little bit more than optimization. * * We will say that any character is in the encoding if * we don't have an encoding. * This is meaningful when the serializer is being used * in temporary output state, where we are not writing to * the final output tree. It is when writing to the * final output tree that we need to worry about the output * encoding */	TokenNameCOMMENT_BLOCK	 A little bit more than optimization. * We will say that any character is in the encoding if we don't have an encoding. This is meaningful when the serializer is being used in temporary output state, where we are not writing to the final output tree. It is when writing to the final output tree that we need to worry about the output encoding 
if	TokenNameif	
(	TokenNameLPAREN	
javaName	TokenNameIdentifier	 java Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
m_alreadyKnown	TokenNameIdentifier	 m already Known
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_alreadyKnown	TokenNameIdentifier	 m already Known
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_isInEncoding	TokenNameIdentifier	 m is In Encoding
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is heart of the code that determines if a given character * is in the given encoding. This method is probably expensive, * and the answer should be cached. * <p> * This method is not a public API, * and should only be used internally within the serializer. * @param ch the char in question, that is not a high char of * a high/low surrogate pair. * @param encoding the Java name of the enocding. * * @xsl.usage internal * */	TokenNameCOMMENT_JAVADOC	 This is heart of the code that determines if a given character is in the given encoding. This method is probably expensive, and the answer should be cached. <p> This method is not a public API, and should only be used internally within the serializer. @param ch the char in question, that is not a high char of a high/low surrogate pair. @param encoding the Java name of the enocding. * @xsl.usage internal 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
inEncoding	TokenNameIdentifier	 in Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isInEncoding	TokenNameIdentifier	 is In Encoding
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
char	TokenNamechar	
cArray	TokenNameIdentifier	 c Array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cArray	TokenNameIdentifier	 c Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
// Construct a String from the char 	TokenNameCOMMENT_LINE	Construct a String from the char 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
cArray	TokenNameIdentifier	 c Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Encode the String into a sequence of bytes 	TokenNameCOMMENT_LINE	Encode the String into a sequence of bytes 
// using the given, named charset. 	TokenNameCOMMENT_LINE	using the given, named charset. 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bArray	TokenNameIdentifier	 b Array
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isInEncoding	TokenNameIdentifier	 is In Encoding
=	TokenNameEQUAL	
inEncoding	TokenNameIdentifier	 in Encoding
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
bArray	TokenNameIdentifier	 b Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isInEncoding	TokenNameIdentifier	 is In Encoding
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// If for some reason the encoding is null, e.g. 	TokenNameCOMMENT_LINE	If for some reason the encoding is null, e.g. 
// for a temporary result tree, we should just 	TokenNameCOMMENT_LINE	for a temporary result tree, we should just 
// say that every character is in the encoding. 	TokenNameCOMMENT_LINE	say that every character is in the encoding. 
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
isInEncoding	TokenNameIdentifier	 is In Encoding
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isInEncoding	TokenNameIdentifier	 is In Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is heart of the code that determines if a given high/low * surrogate pair forms a character that is in the given encoding. * This method is probably expensive, and the answer should be cached. * <p> * This method is not a public API, * and should only be used internally within the serializer. * @param high the high char of * a high/low surrogate pair. * @param low the low char of a high/low surrogate pair. * @param encoding the Java name of the encoding. * * @xsl.usage internal * */	TokenNameCOMMENT_JAVADOC	 This is heart of the code that determines if a given high/low surrogate pair forms a character that is in the given encoding. This method is probably expensive, and the answer should be cached. <p> This method is not a public API, and should only be used internally within the serializer. @param high the high char of a high/low surrogate pair. @param low the low char of a high/low surrogate pair. @param encoding the Java name of the encoding. * @xsl.usage internal 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
inEncoding	TokenNameIdentifier	 in Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
char	TokenNamechar	
low	TokenNameIdentifier	 low
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isInEncoding	TokenNameIdentifier	 is In Encoding
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
char	TokenNamechar	
cArray	TokenNameIdentifier	 c Array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cArray	TokenNameIdentifier	 c Array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
high	TokenNameIdentifier	 high
;	TokenNameSEMICOLON	
cArray	TokenNameIdentifier	 c Array
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
low	TokenNameIdentifier	 low
;	TokenNameSEMICOLON	
// Construct a String from the char 	TokenNameCOMMENT_LINE	Construct a String from the char 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
cArray	TokenNameIdentifier	 c Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Encode the String into a sequence of bytes 	TokenNameCOMMENT_LINE	Encode the String into a sequence of bytes 
// using the given, named charset. 	TokenNameCOMMENT_LINE	using the given, named charset. 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bArray	TokenNameIdentifier	 b Array
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isInEncoding	TokenNameIdentifier	 is In Encoding
=	TokenNameEQUAL	
inEncoding	TokenNameIdentifier	 in Encoding
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
bArray	TokenNameIdentifier	 b Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isInEncoding	TokenNameIdentifier	 is In Encoding
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isInEncoding	TokenNameIdentifier	 is In Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is the core of determining if character * is in the encoding. The method is not foolproof, because * s.getBytes(encoding) has specified behavior only if the * characters are in the specified encoding. However this * method tries it's best. * @param ch the char that was converted using getBytes, or * the first char of a high/low pair that was converted. * @param data the bytes written out by the call to s.getBytes(encoding); * @return true if the character is in the encoding. */	TokenNameCOMMENT_JAVADOC	 This method is the core of determining if character is in the encoding. The method is not foolproof, because s.getBytes(encoding) has specified behavior only if the characters are in the specified encoding. However this method tries it's best. @param ch the char that was converted using getBytes, or the first char of a high/low pair that was converted. @param data the bytes written out by the call to s.getBytes(encoding); @return true if the character is in the encoding. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
inEncoding	TokenNameIdentifier	 in Encoding
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
isInEncoding	TokenNameIdentifier	 is In Encoding
;	TokenNameSEMICOLON	
// If the string written out as data is not in the encoding, 	TokenNameCOMMENT_LINE	If the string written out as data is not in the encoding, 
// the output is not specified according to the documentation 	TokenNameCOMMENT_LINE	the output is not specified according to the documentation 
// on the String.getBytes(encoding) method, 	TokenNameCOMMENT_LINE	on the String.getBytes(encoding) method, 
// but we do our best here. 	TokenNameCOMMENT_LINE	but we do our best here. 
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isInEncoding	TokenNameIdentifier	 is In Encoding
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
isInEncoding	TokenNameIdentifier	 is In Encoding
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'?'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
isInEncoding	TokenNameIdentifier	 is In Encoding
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/* * else if (isJapanese) { * // isJapanese is really * // ( "EUC-JP".equals(javaName) * // || "EUC_JP".equals(javaName) * // || "SJIS".equals(javaName) ) * * // Work around some bugs in JRE for Japanese * if(data[0] == 0x21) * isInEncoding = false; * else if (ch == 0xA5) * isInEncoding = false; * else * isInEncoding = true; * } */	TokenNameCOMMENT_BLOCK	 else if (isJapanese) { // isJapanese is really // ( "EUC-JP".equals(javaName) // || "EUC_JP".equals(javaName) // || "SJIS".equals(javaName) ) * // Work around some bugs in JRE for Japanese if(data[0] == 0x21) isInEncoding = false; else if (ch == 0xA5) isInEncoding = false; else isInEncoding = true; } 
else	TokenNameelse	
{	TokenNameLBRACE	
// We don't know for sure, but it looks like it is in the encoding 	TokenNameCOMMENT_LINE	We don't know for sure, but it looks like it is in the encoding 
isInEncoding	TokenNameIdentifier	 is In Encoding
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
isInEncoding	TokenNameIdentifier	 is In Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method exists for performance reasons. * <p> * Except for '  	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
final	TokenNamefinal	
char	TokenNamechar	
getHighChar	TokenNameIdentifier	 get High Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_highCharInContiguousGroup	TokenNameIdentifier	 m high Char In Contiguous Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
