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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * {@link CharacterUtils} provides a unified interface to Character-related * operations to implement backwards compatible character operations based on a * {@link Version} instance. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 {@link CharacterUtils} provides a unified interface to Character-related operations to implement backwards compatible character operations based on a {@link Version} instance. * @lucene.internal 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CharacterUtils	TokenNameIdentifier	 Character Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Java4CharacterUtils	TokenNameIdentifier	 Java4 Character Utils
JAVA_4	TokenNameIdentifier	 JAVA 4
=	TokenNameEQUAL	
new	TokenNamenew	
Java4CharacterUtils	TokenNameIdentifier	 Java4 Character Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Java5CharacterUtils	TokenNameIdentifier	 Java5 Character Utils
JAVA_5	TokenNameIdentifier	 JAVA 5
=	TokenNameEQUAL	
new	TokenNamenew	
Java5CharacterUtils	TokenNameIdentifier	 Java5 Character Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a {@link CharacterUtils} implementation according to the given * {@link Version} instance. * * @param matchVersion * a version instance * @return a {@link CharacterUtils} implementation according to the given * {@link Version} instance. */	TokenNameCOMMENT_JAVADOC	 Returns a {@link CharacterUtils} implementation according to the given {@link Version} instance. * @param matchVersion a version instance @return a {@link CharacterUtils} implementation according to the given {@link Version} instance. 
public	TokenNamepublic	
static	TokenNamestatic	
CharacterUtils	TokenNameIdentifier	 Character Utils
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
matchVersion	TokenNameIdentifier	 match Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
matchVersion	TokenNameIdentifier	 match Version
.	TokenNameDOT	
onOrAfter	TokenNameIdentifier	 on Or After
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
)	TokenNameRPAREN	
?	TokenNameQUESTION	
JAVA_5	TokenNameIdentifier	 JAVA 5
:	TokenNameCOLON	
JAVA_4	TokenNameIdentifier	 JAVA 4
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the code point at the given index of the char array. * Depending on the {@link Version} passed to * {@link CharacterUtils#getInstance(Version)} this method mimics the behavior * of {@link Character#codePointAt(char[], int)} as it would have been * available on a Java 1.4 JVM or on a later virtual machine version. * * @param chars * a character array * @param offset * the offset to the char values in the chars array to be converted * * @return the Unicode code point at the given index * @throws NullPointerException * - if the array is null. * @throws IndexOutOfBoundsException * - if the value offset is negative or not less than the length of * the char array. */	TokenNameCOMMENT_JAVADOC	 Returns the code point at the given index of the char array. Depending on the {@link Version} passed to {@link CharacterUtils#getInstance(Version)} this method mimics the behavior of {@link Character#codePointAt(char[], int)} as it would have been available on a Java 1.4 JVM or on a later virtual machine version. * @param chars a character array @param offset the offset to the char values in the chars array to be converted * @return the Unicode code point at the given index @throws NullPointerException - if the array is null. @throws IndexOutOfBoundsException - if the value offset is negative or not less than the length of the char array. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the code point at the given index of the {@link CharSequence}. * Depending on the {@link Version} passed to * {@link CharacterUtils#getInstance(Version)} this method mimics the behavior * of {@link Character#codePointAt(char[], int)} as it would have been * available on a Java 1.4 JVM or on a later virtual machine version. * * @param seq * a character sequence * @param offset * the offset to the char values in the chars array to be converted * * @return the Unicode code point at the given index * @throws NullPointerException * - if the sequence is null. * @throws IndexOutOfBoundsException * - if the value offset is negative or not less than the length of * the character sequence. */	TokenNameCOMMENT_JAVADOC	 Returns the code point at the given index of the {@link CharSequence}. Depending on the {@link Version} passed to {@link CharacterUtils#getInstance(Version)} this method mimics the behavior of {@link Character#codePointAt(char[], int)} as it would have been available on a Java 1.4 JVM or on a later virtual machine version. * @param seq a character sequence @param offset the offset to the char values in the chars array to be converted * @return the Unicode code point at the given index @throws NullPointerException - if the sequence is null. @throws IndexOutOfBoundsException - if the value offset is negative or not less than the length of the character sequence. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
seq	TokenNameIdentifier	 seq
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the code point at the given index of the char array where only elements * with index less than the limit are used. * Depending on the {@link Version} passed to * {@link CharacterUtils#getInstance(Version)} this method mimics the behavior * of {@link Character#codePointAt(char[], int)} as it would have been * available on a Java 1.4 JVM or on a later virtual machine version. * * @param chars * a character array * @param offset * the offset to the char values in the chars array to be converted * @param limit the index afer the last element that should be used to calculate * codepoint. * * @return the Unicode code point at the given index * @throws NullPointerException * - if the array is null. * @throws IndexOutOfBoundsException * - if the value offset is negative or not less than the length of * the char array. */	TokenNameCOMMENT_JAVADOC	 Returns the code point at the given index of the char array where only elements with index less than the limit are used. Depending on the {@link Version} passed to {@link CharacterUtils#getInstance(Version)} this method mimics the behavior of {@link Character#codePointAt(char[], int)} as it would have been available on a Java 1.4 JVM or on a later virtual machine version. * @param chars a character array @param offset the offset to the char values in the chars array to be converted @param limit the index afer the last element that should be used to calculate codepoint. * @return the Unicode code point at the given index @throws NullPointerException - if the array is null. @throws IndexOutOfBoundsException - if the value offset is negative or not less than the length of the char array. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new {@link CharacterBuffer} and allocates a <code>char[]</code> * of the given bufferSize. * * @param bufferSize * the internal char buffer size, must be <code>&gt;= 2</code> * @return a new {@link CharacterBuffer} instance. */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharacterBuffer} and allocates a <code>char[]</code> of the given bufferSize. * @param bufferSize the internal char buffer size, must be <code>&gt;= 2</code> @return a new {@link CharacterBuffer} instance. 
public	TokenNamepublic	
static	TokenNamestatic	
CharacterBuffer	TokenNameIdentifier	 Character Buffer
newCharacterBuffer	TokenNameIdentifier	 new Character Buffer
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"buffersize must be >= 2"	TokenNameStringLiteral	buffersize must be >= 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CharacterBuffer	TokenNameIdentifier	 Character Buffer
(	TokenNameLPAREN	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
bufferSize	TokenNameIdentifier	 buffer Size
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fills the {@link CharacterBuffer} with characters read from the given * reader {@link Reader}. This method tries to read as many characters into * the {@link CharacterBuffer} as possible, each call to fill will start * filling the buffer from offset <code>0</code> up to the length of the size * of the internal character array. * <p> * Depending on the {@link Version} passed to * {@link CharacterUtils#getInstance(Version)} this method implements * supplementary character awareness when filling the given buffer. For all * {@link Version} &gt; 3.0 {@link #fill(CharacterBuffer, Reader)} guarantees * that the given {@link CharacterBuffer} will never contain a high surrogate * character as the last element in the buffer unless it is the last available * character in the reader. In other words, high and low surrogate pairs will * always be preserved across buffer boarders. * </p> * * @param buffer * the buffer to fill. * @param reader * the reader to read characters from. * @return <code>true</code> if and only if no more characters are available * in the reader, otherwise <code>false</code>. * @throws IOException * if the reader throws an {@link IOException}. */	TokenNameCOMMENT_JAVADOC	 Fills the {@link CharacterBuffer} with characters read from the given reader {@link Reader}. This method tries to read as many characters into the {@link CharacterBuffer} as possible, each call to fill will start filling the buffer from offset <code>0</code> up to the length of the size of the internal character array. <p> Depending on the {@link Version} passed to {@link CharacterUtils#getInstance(Version)} this method implements supplementary character awareness when filling the given buffer. For all {@link Version} &gt; 3.0 {@link #fill(CharacterBuffer, Reader)} guarantees that the given {@link CharacterBuffer} will never contain a high surrogate character as the last element in the buffer unless it is the last available character in the reader. In other words, high and low surrogate pairs will always be preserved across buffer boarders. </p> * @param buffer the buffer to fill. @param reader the reader to read characters from. @return <code>true</code> if and only if no more characters are available in the reader, otherwise <code>false</code>. @throws IOException if the reader throws an {@link IOException}. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
CharacterBuffer	TokenNameIdentifier	 Character Buffer
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Java5CharacterUtils	TokenNameIdentifier	 Java5 Character Utils
extends	TokenNameextends	
CharacterUtils	TokenNameIdentifier	 Character Utils
{	TokenNameLBRACE	
Java5CharacterUtils	TokenNameIdentifier	 Java5 Character Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
seq	TokenNameIdentifier	 seq
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
seq	TokenNameIdentifier	 seq
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
final	TokenNamefinal	
CharacterBuffer	TokenNameIdentifier	 Character Buffer
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
charBuffer	TokenNameIdentifier	 char Buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
// Install the previously saved ending high surrogate: 	TokenNameCOMMENT_LINE	Install the previously saved ending high surrogate: 
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
lastTrailingHighSurrogate	TokenNameIdentifier	 last Trailing High Surrogate
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
charBuffer	TokenNameIdentifier	 char Buffer
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
lastTrailingHighSurrogate	TokenNameIdentifier	 last Trailing High Surrogate
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
charBuffer	TokenNameIdentifier	 char Buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
charBuffer	TokenNameIdentifier	 char Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
lastTrailingHighSurrogate	TokenNameIdentifier	 last Trailing High Surrogate
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
read	TokenNameIdentifier	 read
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
// If we read only a single char, and that char was a 	TokenNameCOMMENT_LINE	If we read only a single char, and that char was a 
// high surrogate, read again: 	TokenNameCOMMENT_LINE	high surrogate, read again: 
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
charBuffer	TokenNameIdentifier	 char Buffer
[	TokenNameLBRACKET	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
read2	TokenNameIdentifier	 read2
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
charBuffer	TokenNameIdentifier	 char Buffer
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
charBuffer	TokenNameIdentifier	 char Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
read2	TokenNameIdentifier	 read2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: mal-formed input (ended on a high 	TokenNameCOMMENT_LINE	NOTE: mal-formed input (ended on a high 
// surrogate)! Consumer must deal with it... 	TokenNameCOMMENT_LINE	surrogate)! Consumer must deal with it... 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
read2	TokenNameIdentifier	 read2
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
read2	TokenNameIdentifier	 read2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
charBuffer	TokenNameIdentifier	 char Buffer
[	TokenNameLBRACKET	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
lastTrailingHighSurrogate	TokenNameIdentifier	 last Trailing High Surrogate
=	TokenNameEQUAL	
charBuffer	TokenNameIdentifier	 char Buffer
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
lastTrailingHighSurrogate	TokenNameIdentifier	 last Trailing High Surrogate
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Java4CharacterUtils	TokenNameIdentifier	 Java4 Character Utils
extends	TokenNameextends	
CharacterUtils	TokenNameIdentifier	 Character Utils
{	TokenNameLBRACE	
Java4CharacterUtils	TokenNameIdentifier	 Java4 Character Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
final	TokenNamefinal	
CharSequence	TokenNameIdentifier	 Char Sequence
seq	TokenNameIdentifier	 seq
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seq	TokenNameIdentifier	 seq
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
codePointAt	TokenNameIdentifier	 code Point At
(	TokenNameLPAREN	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>=	TokenNameGREATER_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"offset must be less than limit"	TokenNameStringLiteral	offset must be less than limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
final	TokenNamefinal	
CharacterBuffer	TokenNameIdentifier	 Character Buffer
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
final	TokenNamefinal	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
read	TokenNameIdentifier	 read
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
read	TokenNameIdentifier	 read
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
read	TokenNameIdentifier	 read
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A simple IO buffer to use with * {@link CharacterUtils#fill(CharacterBuffer, Reader)}. */	TokenNameCOMMENT_JAVADOC	 A simple IO buffer to use with {@link CharacterUtils#fill(CharacterBuffer, Reader)}. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CharacterBuffer	TokenNameIdentifier	 Character Buffer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// NOTE: not private so outer class can access without 	TokenNameCOMMENT_LINE	NOTE: not private so outer class can access without 
// $access methods: 	TokenNameCOMMENT_LINE	$access methods: 
char	TokenNamechar	
lastTrailingHighSurrogate	TokenNameIdentifier	 last Trailing High Surrogate
;	TokenNameSEMICOLON	
CharacterBuffer	TokenNameIdentifier	 Character Buffer
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
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
/** * Returns the internal buffer * * @return the buffer */	TokenNameCOMMENT_JAVADOC	 Returns the internal buffer * @return the buffer 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBuffer	TokenNameIdentifier	 get Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the data offset in the internal buffer. * * @return the offset */	TokenNameCOMMENT_JAVADOC	 Returns the data offset in the internal buffer. * @return the offset 
public	TokenNamepublic	
int	TokenNameint	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the length of the data in the internal buffer starting at * {@link #getOffset()} * * @return the length */	TokenNameCOMMENT_JAVADOC	 Return the length of the data in the internal buffer starting at {@link #getOffset()} * @return the length 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the CharacterBuffer. All internals are reset to its default * values. */	TokenNameCOMMENT_JAVADOC	 Resets the CharacterBuffer. All internals are reset to its default values. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lastTrailingHighSurrogate	TokenNameIdentifier	 last Trailing High Surrogate
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
