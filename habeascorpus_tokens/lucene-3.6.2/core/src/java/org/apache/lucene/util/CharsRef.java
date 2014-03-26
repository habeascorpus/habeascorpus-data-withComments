package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Represents char[], as a slice (offset + length) into an existing char[]. * The {@link #chars} member should never be null; use * {@link #EMPTY_CHARS} if necessary. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Represents char[], as a slice (offset + length) into an existing char[]. The {@link #chars} member should never be null; use {@link #EMPTY_CHARS} if necessary. @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CharsRef	TokenNameIdentifier	 Chars Ref
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
CharsRef	TokenNameIdentifier	 Chars Ref
>	TokenNameGREATER	
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_CHARS	TokenNameIdentifier	 EMPTY  CHARS
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/** * Creates a new {@link CharsRef} initialized an empty array zero-length */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharsRef} initialized an empty array zero-length 
public	TokenNamepublic	
CharsRef	TokenNameIdentifier	 Chars Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
EMPTY_CHARS	TokenNameIdentifier	 EMPTY  CHARS
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link CharsRef} initialized with an array of the given * capacity */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharsRef} initialized with an array of the given capacity 
public	TokenNamepublic	
CharsRef	TokenNameIdentifier	 Chars Ref
(	TokenNameLPAREN	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
capacity	TokenNameIdentifier	 capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new {@link CharsRef} initialized with the given array, offset and * length */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharsRef} initialized with the given array, offset and length 
public	TokenNamepublic	
CharsRef	TokenNameIdentifier	 Chars Ref
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
chars	TokenNameIdentifier	 chars
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
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
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
/** * Creates a new {@link CharsRef} initialized with the given Strings character * array */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link CharsRef} initialized with the given Strings character array 
public	TokenNamepublic	
CharsRef	TokenNameIdentifier	 Chars Ref
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
string	TokenNameIdentifier	 string
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
CharsRef	TokenNameIdentifier	 Chars Ref
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CharsRef	TokenNameIdentifier	 Chars Ref
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
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
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
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
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
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
CharsRef	TokenNameIdentifier	 Chars Ref
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
charsEquals	TokenNameIdentifier	 chars Equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CharsRef	TokenNameIdentifier	 Chars Ref
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
charsEquals	TokenNameIdentifier	 chars Equals
(	TokenNameLPAREN	
CharsRef	TokenNameIdentifier	 Chars Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherChars	TokenNameIdentifier	 other Chars
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
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
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
otherChars	TokenNameIdentifier	 other Chars
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
/** Signed int order comparison */	TokenNameCOMMENT_JAVADOC	 Signed int order comparison 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
CharsRef	TokenNameIdentifier	 Chars Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aChars	TokenNameIdentifier	 a Chars
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
;	TokenNameSEMICOLON	
int	TokenNameint	
aUpto	TokenNameIdentifier	 a Upto
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bChars	TokenNameIdentifier	 b Chars
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
;	TokenNameSEMICOLON	
int	TokenNameint	
bUpto	TokenNameIdentifier	 b Upto
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
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
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
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
aInt	TokenNameIdentifier	 a Int
=	TokenNameEQUAL	
aChars	TokenNameIdentifier	 a Chars
[	TokenNameLBRACKET	
aUpto	TokenNameIdentifier	 a Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
bInt	TokenNameIdentifier	 b Int
=	TokenNameEQUAL	
bChars	TokenNameIdentifier	 b Chars
[	TokenNameLBRACKET	
bUpto	TokenNameIdentifier	 b Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aInt	TokenNameIdentifier	 a Int
>	TokenNameGREATER	
bInt	TokenNameIdentifier	 b Int
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
aInt	TokenNameIdentifier	 a Int
<	TokenNameLESS	
bInt	TokenNameIdentifier	 b Int
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// One is a prefix of the other, or, they are equal: 	TokenNameCOMMENT_LINE	One is a prefix of the other, or, they are equal: 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the given {@link CharsRef} referenced content into this instance. * * @param other * the {@link CharsRef} to copy */	TokenNameCOMMENT_JAVADOC	 Copies the given {@link CharsRef} referenced content into this instance. * @param other the {@link CharsRef} to copy 
public	TokenNamepublic	
void	TokenNamevoid	
copyChars	TokenNameIdentifier	 copy Chars
(	TokenNameLPAREN	
CharsRef	TokenNameIdentifier	 Chars Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copyChars	TokenNameIdentifier	 copy Chars
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
newLength	TokenNameIdentifier	 new Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copies the given array into this CharsRef. */	TokenNameCOMMENT_JAVADOC	 Copies the given array into this CharsRef. 
public	TokenNamepublic	
void	TokenNamevoid	
copyChars	TokenNameIdentifier	 copy Chars
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherChars	TokenNameIdentifier	 other Chars
,	TokenNameCOMMA	
int	TokenNameint	
otherOffset	TokenNameIdentifier	 other Offset
,	TokenNameCOMMA	
int	TokenNameint	
otherLength	TokenNameIdentifier	 other Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
otherLength	TokenNameIdentifier	 other Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
otherLength	TokenNameIdentifier	 other Length
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
otherChars	TokenNameIdentifier	 other Chars
,	TokenNameCOMMA	
otherOffset	TokenNameIdentifier	 other Offset
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
otherLength	TokenNameIdentifier	 other Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
otherLength	TokenNameIdentifier	 other Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends the given array to this CharsRef */	TokenNameCOMMENT_JAVADOC	 Appends the given array to this CharsRef 
public	TokenNamepublic	
void	TokenNamevoid	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherChars	TokenNameIdentifier	 other Chars
,	TokenNameCOMMA	
int	TokenNameint	
otherOffset	TokenNameIdentifier	 other Offset
,	TokenNameCOMMA	
int	TokenNameint	
otherLength	TokenNameIdentifier	 other Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newLen	TokenNameIdentifier	 new Len
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
otherLength	TokenNameIdentifier	 other Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
newLen	TokenNameIdentifier	 new Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newChars	TokenNameIdentifier	 new Chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newLen	TokenNameIdentifier	 new Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
newChars	TokenNameIdentifier	 new Chars
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
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
newChars	TokenNameIdentifier	 new Chars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
otherChars	TokenNameIdentifier	 other Chars
,	TokenNameCOMMA	
otherOffset	TokenNameIdentifier	 other Offset
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
otherLength	TokenNameIdentifier	 other Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
newLen	TokenNameIdentifier	 new Len
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
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
char	TokenNamechar	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: must do a real check here to meet the specs of CharSequence 	TokenNameCOMMENT_LINE	NOTE: must do a real check here to meet the specs of CharSequence 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
subSequence	TokenNameIdentifier	 sub Sequence
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// NOTE: must do a real check here to meet the specs of CharSequence 	TokenNameCOMMENT_LINE	NOTE: must do a real check here to meet the specs of CharSequence 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
start	TokenNameIdentifier	 start
>	TokenNameGREATER	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CharsRef	TokenNameIdentifier	 Chars Ref
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
CharsRef	TokenNameIdentifier	 Chars Ref
>	TokenNameGREATER	
utf16SortedAsUTF8SortOrder	TokenNameIdentifier	 utf16 Sorted As UT F8 Sort Order
=	TokenNameEQUAL	
new	TokenNamenew	
UTF16SortedAsUTF8Comparator	TokenNameIdentifier	 UT F16 Sorted As UT F8 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
CharsRef	TokenNameIdentifier	 Chars Ref
>	TokenNameGREATER	
getUTF16SortedAsUTF8Comparator	TokenNameIdentifier	 get UT F16 Sorted As UT F8 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
utf16SortedAsUTF8SortOrder	TokenNameIdentifier	 utf16 Sorted As UT F8 Sort Order
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
UTF16SortedAsUTF8Comparator	TokenNameIdentifier	 UT F16 Sorted As UT F8 Comparator
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
CharsRef	TokenNameIdentifier	 Chars Ref
>	TokenNameGREATER	
{	TokenNameLBRACE	
// Only singleton 	TokenNameCOMMENT_LINE	Only singleton 
private	TokenNameprivate	
UTF16SortedAsUTF8Comparator	TokenNameIdentifier	 UT F16 Sorted As UT F8 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
CharsRef	TokenNameIdentifier	 Chars Ref
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
CharsRef	TokenNameIdentifier	 Chars Ref
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
aChars	TokenNameIdentifier	 a Chars
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
;	TokenNameSEMICOLON	
int	TokenNameint	
aUpto	TokenNameIdentifier	 a Upto
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bChars	TokenNameIdentifier	 b Chars
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
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
char	TokenNamechar	
aChar	TokenNameIdentifier	 a Char
=	TokenNameEQUAL	
aChars	TokenNameIdentifier	 a Chars
[	TokenNameLBRACKET	
aUpto	TokenNameIdentifier	 a Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
bChar	TokenNameIdentifier	 b Char
=	TokenNameEQUAL	
bChars	TokenNameIdentifier	 b Chars
[	TokenNameLBRACKET	
bUpto	TokenNameIdentifier	 b Upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aChar	TokenNameIdentifier	 a Char
!=	TokenNameNOT_EQUAL	
bChar	TokenNameIdentifier	 b Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// http://icu-project.org/docs/papers/utf16_code_point_order.html 	TokenNameCOMMENT_LINE	http://icu-project.org/docs/papers/utf16_code_point_order.html 
/* aChar != bChar, fix up each one if they're both in or above the surrogate range, then compare them */	TokenNameCOMMENT_BLOCK	 aChar != bChar, fix up each one if they're both in or above the surrogate range, then compare them 
if	TokenNameif	
(	TokenNameLPAREN	
aChar	TokenNameIdentifier	 a Char
>=	TokenNameGREATER_EQUAL	
0xd800	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bChar	TokenNameIdentifier	 b Char
>=	TokenNameGREATER_EQUAL	
0xd800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aChar	TokenNameIdentifier	 a Char
>=	TokenNameGREATER_EQUAL	
0xe000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aChar	TokenNameIdentifier	 a Char
-=	TokenNameMINUS_EQUAL	
0x800	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
aChar	TokenNameIdentifier	 a Char
+=	TokenNamePLUS_EQUAL	
0x2000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bChar	TokenNameIdentifier	 b Char
>=	TokenNameGREATER_EQUAL	
0xe000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bChar	TokenNameIdentifier	 b Char
-=	TokenNameMINUS_EQUAL	
0x800	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
bChar	TokenNameIdentifier	 b Char
+=	TokenNamePLUS_EQUAL	
0x2000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* now aChar and bChar are in code point order */	TokenNameCOMMENT_BLOCK	 now aChar and bChar are in code point order 
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
aChar	TokenNameIdentifier	 a Char
-	TokenNameMINUS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bChar	TokenNameIdentifier	 b Char
;	TokenNameSEMICOLON	
/* int must be 32 bits wide */	TokenNameCOMMENT_BLOCK	 int must be 32 bits wide 
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
/** * Creates a new CharsRef that points to a copy of the chars from * <code>other</code> * <p> * The returned CharsRef will have a length of other.length * and an offset of zero. */	TokenNameCOMMENT_JAVADOC	 Creates a new CharsRef that points to a copy of the chars from <code>other</code> <p> The returned CharsRef will have a length of other.length and an offset of zero. 
public	TokenNamepublic	
static	TokenNamestatic	
CharsRef	TokenNameIdentifier	 Chars Ref
deepCopyOf	TokenNameIdentifier	 deep Copy Of
(	TokenNameLPAREN	
CharsRef	TokenNameIdentifier	 Chars Ref
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CharsRef	TokenNameIdentifier	 Chars Ref
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
new	TokenNamenew	
CharsRef	TokenNameIdentifier	 Chars Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
copyChars	TokenNameIdentifier	 copy Chars
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
