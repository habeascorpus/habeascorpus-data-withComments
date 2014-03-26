package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
/** Represents byte[], as a slice (offset + length) into an * existing byte[]. * * <p><b>Important note:</b> Unless otherwise noted, Lucene uses this class to * represent terms that are encoded as <b>UTF8</b> bytes in the index. To * convert them to a Java {@link String} (which is UTF16), use {@link #utf8ToString}. * Using code like {@code new String(bytes, offset, length)} to do this * is <b>wrong</b>, as it does not respect the correct character set * and may return wrong results (depending on the platform's defaults)! * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Represents byte[], as a slice (offset + length) into an existing byte[]. * <p><b>Important note:</b> Unless otherwise noted, Lucene uses this class to represent terms that are encoded as <b>UTF8</b> bytes in the index. To convert them to a Java {@link String} (which is UTF16), use {@link #utf8ToString}. Using code like {@code new String(bytes, offset, length)} to do this is <b>wrong</b>, as it does not respect the correct character set and may return wrong results (depending on the platform's defaults)! * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BytesRef	TokenNameIdentifier	 Bytes Ref
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** An empty byte array for convenience */	TokenNameCOMMENT_JAVADOC	 An empty byte array for convenience 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_BYTES	TokenNameIdentifier	 EMPTY  BYTES
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** The contents of the BytesRef. Should never be {@code null}. */	TokenNameCOMMENT_JAVADOC	 The contents of the BytesRef. Should never be {@code null}. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
/** Offset of first valid byte. */	TokenNameCOMMENT_JAVADOC	 Offset of first valid byte. 
public	TokenNamepublic	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
/** Length of used bytes. */	TokenNameCOMMENT_JAVADOC	 Length of used bytes. 
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/** Create a BytesRef with {@link #EMPTY_BYTES} */	TokenNameCOMMENT_JAVADOC	 Create a BytesRef with {@link #EMPTY_BYTES} 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
EMPTY_BYTES	TokenNameIdentifier	 EMPTY  BYTES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This instance will directly reference bytes w/o making a copy. * bytes should not be null. */	TokenNameCOMMENT_JAVADOC	 This instance will directly reference bytes w/o making a copy. bytes should not be null. 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This instance will directly reference bytes w/o making a copy. * bytes should not be null */	TokenNameCOMMENT_JAVADOC	 This instance will directly reference bytes w/o making a copy. bytes should not be null 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a BytesRef pointing to a new array of size <code>capacity</code>. * Offset and length will both be zero. */	TokenNameCOMMENT_JAVADOC	 Create a BytesRef pointing to a new array of size <code>capacity</code>. Offset and length will both be zero. 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
capacity	TokenNameIdentifier	 capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the byte[] from the UTF8 bytes * for the provided String. * * @param text This must be well-formed * unicode text, with no unpaired surrogates. */	TokenNameCOMMENT_JAVADOC	 Initialize the byte[] from the UTF8 bytes for the provided String. * @param text This must be well-formed unicode text, with no unpaired surrogates. 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyChars	TokenNameIdentifier	 copy Chars
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the UTF8 bytes for this string. * * @param text Must be well-formed unicode text, with no * unpaired surrogates. */	TokenNameCOMMENT_JAVADOC	 Copies the UTF8 bytes for this string. * @param text Must be well-formed unicode text, with no unpaired surrogates. 
public	TokenNamepublic	
void	TokenNamevoid	
copyChars	TokenNameIdentifier	 copy Chars
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// TODO broken if offset != 0 	TokenNameCOMMENT_LINE	TODO broken if offset != 0 
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the UTF8 bytes for this string. * * @param text Must be well-formed unicode text, with no * unpaired surrogates. */	TokenNameCOMMENT_JAVADOC	 Copies the UTF8 bytes for this string. * @param text Must be well-formed unicode text, with no unpaired surrogates. 
public	TokenNamepublic	
void	TokenNamevoid	
copyChars	TokenNameIdentifier	 copy Chars
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: compares the bytes against another BytesRef, * returning true if the bytes are equal. * * @param other Another BytesRef, should not be null. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Expert: compares the bytes against another BytesRef, returning true if the bytes are equal. * @param other Another BytesRef, should not be null. @lucene.internal 
public	TokenNamepublic	
boolean	TokenNameboolean	
bytesEquals	TokenNameIdentifier	 bytes Equals
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
other	TokenNameIdentifier	 other
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
otherUpto	TokenNameIdentifier	 other Upto
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherBytes	TokenNameIdentifier	 other Bytes
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
otherUpto	TokenNameIdentifier	 other Upto
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
otherBytes	TokenNameIdentifier	 other Bytes
[	TokenNameLBRACKET	
otherUpto	TokenNameIdentifier	 other Upto
]	TokenNameRBRACKET	
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
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
sliceEquals	TokenNameIdentifier	 slice Equals
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
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
public	TokenNamepublic	
boolean	TokenNameboolean	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sliceEquals	TokenNameIdentifier	 slice Equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sliceEquals	TokenNameIdentifier	 slice Equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Calculates the hash code as required by TermsHash during indexing. * <p>It is defined as: * <pre> * int hash = 0; * for (int i = offset; i &lt; offset + length; i++) { * hash = 31*hash + bytes[i]; * } * </pre> */	TokenNameCOMMENT_JAVADOC	 Calculates the hash code as required by TermsHash during indexing. <p>It is defined as: <pre> int hash = 0; for (int i = offset; i &lt; offset + length; i++) { hash = 31*hash + bytes[i]; } </pre> 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
hash	TokenNameIdentifier	 hash
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
BytesRef	TokenNameIdentifier	 Bytes Ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
bytesEquals	TokenNameIdentifier	 bytes Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Interprets stored bytes as UTF8 bytes, returning the * resulting string */	TokenNameCOMMENT_JAVADOC	 Interprets stored bytes as UTF8 bytes, returning the resulting string 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
utf8ToString	TokenNameIdentifier	 utf8 To String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
uee	TokenNameIdentifier	 uee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// should not happen -- UTF8 is presumably supported 	TokenNameCOMMENT_LINE	should not happen -- UTF8 is presumably supported 
// by all JREs 	TokenNameCOMMENT_LINE	by all JREs 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
uee	TokenNameIdentifier	 uee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns hex encoded bytes, eg [0x6c 0x75 0x63 0x65 0x6e 0x65] */	TokenNameCOMMENT_JAVADOC	 Returns hex encoded bytes, eg [0x6c 0x75 0x63 0x65 0x6e 0x65] 
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
'['	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
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
/** * Copies the bytes from the given {@link BytesRef} * <p> * NOTE: if this would exceed the array size, this method creates a * new reference array. */	TokenNameCOMMENT_JAVADOC	 Copies the bytes from the given {@link BytesRef} <p> NOTE: if this would exceed the array size, this method creates a new reference array. 
public	TokenNamepublic	
void	TokenNamevoid	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends the bytes from the given {@link BytesRef} * <p> * NOTE: if this would exceed the array size, this method creates a * new reference array. */	TokenNameCOMMENT_JAVADOC	 Appends the bytes from the given {@link BytesRef} <p> NOTE: if this would exceed the array size, this method creates a new reference array. 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newLen	TokenNameIdentifier	 new Len
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
newLen	TokenNameIdentifier	 new Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newBytes	TokenNameIdentifier	 new Bytes
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newLen	TokenNameIdentifier	 new Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
newBytes	TokenNameIdentifier	 new Bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
newBytes	TokenNameIdentifier	 new Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
newLen	TokenNameIdentifier	 new Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used to grow the reference array. * * In general this should not be used as it does not take the offset into account. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Used to grow the reference array. * In general this should not be used as it does not take the offset into account. @lucene.internal 
public	TokenNamepublic	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
int	TokenNameint	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
offset	TokenNameIdentifier	 offset
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// NOTE: senseless if offset != 0 	TokenNameCOMMENT_LINE	NOTE: senseless if offset != 0 
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Unsigned byte order comparison */	TokenNameCOMMENT_JAVADOC	 Unsigned byte order comparison 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
utf8SortedAsUnicodeSortOrder	TokenNameIdentifier	 utf8 Sorted As Unicode Sort Order
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
utf8SortedAsUnicodeSortOrder	TokenNameIdentifier	 utf8 Sorted As Unicode Sort Order
=	TokenNameEQUAL	
new	TokenNamenew	
UTF8SortedAsUnicodeComparator	TokenNameIdentifier	 UT F8 Sorted As Unicode Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
getUTF8SortedAsUnicodeComparator	TokenNameIdentifier	 get UT F8 Sorted As Unicode Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
utf8SortedAsUnicodeSortOrder	TokenNameIdentifier	 utf8 Sorted As Unicode Sort Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
UTF8SortedAsUnicodeComparator	TokenNameIdentifier	 UT F8 Sorted As Unicode Comparator
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
{	TokenNameLBRACE	
// Only singleton 	TokenNameCOMMENT_LINE	Only singleton 
private	TokenNameprivate	
UTF8SortedAsUnicodeComparator	TokenNameIdentifier	 UT F8 Sorted As Unicode Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aBytes	TokenNameIdentifier	 a Bytes
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
int	TokenNameint	
aUpto	TokenNameIdentifier	 a Upto
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bBytes	TokenNameIdentifier	 b Bytes
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
int	TokenNameint	
bUpto	TokenNameIdentifier	 b Upto
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
aStop	TokenNameIdentifier	 a Stop
=	TokenNameEQUAL	
aUpto	TokenNameIdentifier	 a Upto
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
aUpto	TokenNameIdentifier	 a Upto
<	TokenNameLESS	
aStop	TokenNameIdentifier	 a Stop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
aByte	TokenNameIdentifier	 a Byte
=	TokenNameEQUAL	
aBytes	TokenNameIdentifier	 a Bytes
[	TokenNameLBRACKET	
aUpto	TokenNameIdentifier	 a Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bByte	TokenNameIdentifier	 b Byte
=	TokenNameEQUAL	
bBytes	TokenNameIdentifier	 b Bytes
[	TokenNameLBRACKET	
bUpto	TokenNameIdentifier	 b Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
aByte	TokenNameIdentifier	 a Byte
-	TokenNameMINUS	
bByte	TokenNameIdentifier	 b Byte
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// One is a prefix of the other, or, they are equal: 	TokenNameCOMMENT_LINE	One is a prefix of the other, or, they are equal: 
return	TokenNamereturn	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
utf8SortedAsUTF16SortOrder	TokenNameIdentifier	 utf8 Sorted As UT F16 Sort Order
=	TokenNameEQUAL	
new	TokenNamenew	
UTF8SortedAsUTF16Comparator	TokenNameIdentifier	 UT F8 Sorted As UT F16 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
getUTF8SortedAsUTF16Comparator	TokenNameIdentifier	 get UT F8 Sorted As UT F16 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
utf8SortedAsUTF16SortOrder	TokenNameIdentifier	 utf8 Sorted As UT F16 Sort Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
UTF8SortedAsUTF16Comparator	TokenNameIdentifier	 UT F8 Sorted As UT F16 Comparator
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
{	TokenNameLBRACE	
// Only singleton 	TokenNameCOMMENT_LINE	Only singleton 
private	TokenNameprivate	
UTF8SortedAsUTF16Comparator	TokenNameIdentifier	 UT F8 Sorted As UT F16 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
BytesRef	TokenNameIdentifier	 Bytes Ref
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aBytes	TokenNameIdentifier	 a Bytes
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
int	TokenNameint	
aUpto	TokenNameIdentifier	 a Upto
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bBytes	TokenNameIdentifier	 b Bytes
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
int	TokenNameint	
bUpto	TokenNameIdentifier	 b Upto
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
aStop	TokenNameIdentifier	 a Stop
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aStop	TokenNameIdentifier	 a Stop
=	TokenNameEQUAL	
aUpto	TokenNameIdentifier	 a Upto
+	TokenNamePLUS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
aStop	TokenNameIdentifier	 a Stop
=	TokenNameEQUAL	
aUpto	TokenNameIdentifier	 a Upto
+	TokenNamePLUS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
aUpto	TokenNameIdentifier	 a Upto
<	TokenNameLESS	
aStop	TokenNameIdentifier	 a Stop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
aByte	TokenNameIdentifier	 a Byte
=	TokenNameEQUAL	
aBytes	TokenNameIdentifier	 a Bytes
[	TokenNameLBRACKET	
aUpto	TokenNameIdentifier	 a Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
bByte	TokenNameIdentifier	 b Byte
=	TokenNameEQUAL	
bBytes	TokenNameIdentifier	 b Bytes
[	TokenNameLBRACKET	
bUpto	TokenNameIdentifier	 b Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aByte	TokenNameIdentifier	 a Byte
!=	TokenNameNOT_EQUAL	
bByte	TokenNameIdentifier	 b Byte
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// See http://icu-project.org/docs/papers/utf16_code_point_order.html#utf-8-in-utf-16-order 	TokenNameCOMMENT_LINE	See http://icu-project.org/docs/papers/utf16_code_point_order.html#utf-8-in-utf-16-order 
// We know the terms are not equal, but, we may 	TokenNameCOMMENT_LINE	We know the terms are not equal, but, we may 
// have to carefully fixup the bytes at the 	TokenNameCOMMENT_LINE	have to carefully fixup the bytes at the 
// difference to match UTF16's sort order: 	TokenNameCOMMENT_LINE	difference to match UTF16's sort order: 
// NOTE: instead of moving supplementary code points (0xee and 0xef) to the unused 0xfe and 0xff, 	TokenNameCOMMENT_LINE	NOTE: instead of moving supplementary code points (0xee and 0xef) to the unused 0xfe and 0xff, 
// we move them to the unused 0xfc and 0xfd [reserved for future 6-byte character sequences] 	TokenNameCOMMENT_LINE	we move them to the unused 0xfc and 0xfd [reserved for future 6-byte character sequences] 
// this reserves 0xff for preflex's term reordering (surrogate dance), and if unicode grows such 	TokenNameCOMMENT_LINE	this reserves 0xff for preflex's term reordering (surrogate dance), and if unicode grows such 
// that 6-byte sequences are needed we have much bigger problems anyway. 	TokenNameCOMMENT_LINE	that 6-byte sequences are needed we have much bigger problems anyway. 
if	TokenNameif	
(	TokenNameLPAREN	
aByte	TokenNameIdentifier	 a Byte
>=	TokenNameGREATER_EQUAL	
0xee	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bByte	TokenNameIdentifier	 b Byte
>=	TokenNameGREATER_EQUAL	
0xee	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
aByte	TokenNameIdentifier	 a Byte
&	TokenNameAND	
0xfe	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xee	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aByte	TokenNameIdentifier	 a Byte
+=	TokenNamePLUS_EQUAL	
0xe	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bByte	TokenNameIdentifier	 b Byte
&	TokenNameAND	
0xfe	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0xee	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bByte	TokenNameIdentifier	 b Byte
+=	TokenNamePLUS_EQUAL	
0xe	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
aByte	TokenNameIdentifier	 a Byte
-	TokenNameMINUS	
bByte	TokenNameIdentifier	 b Byte
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// One is a prefix of the other, or, they are equal: 	TokenNameCOMMENT_LINE	One is a prefix of the other, or, they are equal: 
return	TokenNamereturn	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new BytesRef that points to a copy of the bytes from * <code>other</code> * <p> * The returned BytesRef will have a length of other.length * and an offset of zero. */	TokenNameCOMMENT_JAVADOC	 Creates a new BytesRef that points to a copy of the bytes from <code>other</code> <p> The returned BytesRef will have a length of other.length and an offset of zero. 
public	TokenNamepublic	
static	TokenNamestatic	
BytesRef	TokenNameIdentifier	 Bytes Ref
deepCopyOf	TokenNameIdentifier	 deep Copy Of
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BytesRef	TokenNameIdentifier	 Bytes Ref
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
copyBytes	TokenNameIdentifier	 copy Bytes
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
copy	TokenNameIdentifier	 copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
