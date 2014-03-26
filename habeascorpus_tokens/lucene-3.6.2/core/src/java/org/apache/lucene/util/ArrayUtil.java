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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
/** * Methods for manipulating arrays. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Methods for manipulating arrays. * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ArrayUtil	TokenNameIdentifier	 Array Util
{	TokenNameLBRACE	
/** * @deprecated This constructor was not intended to be public and should not be used. * This class contains solely a static utility methods. * It will be made private in Lucene 4.0 */	TokenNameCOMMENT_JAVADOC	 @deprecated This constructor was not intended to be public and should not be used. This class contains solely a static utility methods. It will be made private in Lucene 4.0 
// make private in 4.0! 	TokenNameCOMMENT_LINE	make private in 4.0! 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
ArrayUtil	TokenNameIdentifier	 Array Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// no instance 	TokenNameCOMMENT_LINE	no instance 
/* Begin Apache Harmony code Revision taken on Friday, June 12. https://svn.apache.org/repos/asf/harmony/enhanced/classlib/archive/java6/modules/luni/src/main/java/java/lang/Integer.java */	TokenNameCOMMENT_BLOCK	 Begin Apache Harmony code Revision taken on Friday, June 12. https://svn.apache.org/repos/asf/harmony/enhanced/classlib/archive/java6/modules/luni/src/main/java/java/lang/Integer.java 
/** * Parses the string argument as if it was an int value and returns the * result. Throws NumberFormatException if the string does not represent an * int quantity. * * @param chars a string representation of an int quantity. * @return int the value represented by the argument * @throws NumberFormatException if the argument could not be parsed as an int quantity. */	TokenNameCOMMENT_JAVADOC	 Parses the string argument as if it was an int value and returns the result. Throws NumberFormatException if the string does not represent an int quantity. * @param chars a string representation of an int quantity. @return int the value represented by the argument @throws NumberFormatException if the argument could not be parsed as an int quantity. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses a char array into an int. * @param chars the character array * @param offset The offset into the array * @param len The length * @return the int * @throws NumberFormatException if it can't parse */	TokenNameCOMMENT_JAVADOC	 Parses a char array into an int. @param chars the character array @param offset The offset into the array @param len The length @return the int @throws NumberFormatException if it can't parse 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
parseInt	TokenNameIdentifier	 parse Int
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
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the string argument as if it was an int value and returns the * result. Throws NumberFormatException if the string does not represent an * int quantity. The second argument specifies the radix to use when parsing * the value. * * @param chars a string representation of an int quantity. * @param radix the base to use for conversion. * @return int the value represented by the argument * @throws NumberFormatException if the argument could not be parsed as an int quantity. */	TokenNameCOMMENT_JAVADOC	 Parses the string argument as if it was an int value and returns the result. Throws NumberFormatException if the string does not represent an int quantity. The second argument specifies the radix to use when parsing the value. * @param chars a string representation of an int quantity. @param radix the base to use for conversion. @return int the value represented by the argument @throws NumberFormatException if the argument could not be parsed as an int quantity. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
parseInt	TokenNameIdentifier	 parse Int
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
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
radix	TokenNameIdentifier	 radix
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
radix	TokenNameIdentifier	 radix
<	TokenNameLESS	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MIN_RADIX	TokenNameIdentifier	 MIN  RADIX
||	TokenNameOR_OR	
radix	TokenNameIdentifier	 radix
>	TokenNameGREATER	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
MAX_RADIX	TokenNameIdentifier	 MAX  RADIX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"chars length is 0"	TokenNameStringLiteral	chars length is 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
negative	TokenNameIdentifier	 negative
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
negative	TokenNameIdentifier	 negative
&&	TokenNameAND_AND	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"can't convert to an int"	TokenNameStringLiteral	can't convert to an int
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
negative	TokenNameIdentifier	 negative
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
radix	TokenNameIdentifier	 radix
,	TokenNameCOMMA	
negative	TokenNameIdentifier	 negative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
parse	TokenNameIdentifier	 parse
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
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
radix	TokenNameIdentifier	 radix
,	TokenNameCOMMA	
boolean	TokenNameboolean	
negative	TokenNameIdentifier	 negative
)	TokenNameRPAREN	
throws	TokenNamethrows	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
/	TokenNameDIVIDE	
radix	TokenNameIdentifier	 radix
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
digit	TokenNameIdentifier	 digit
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
radix	TokenNameIdentifier	 radix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digit	TokenNameIdentifier	 digit
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"Unable to parse"	TokenNameStringLiteral	Unable to parse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"Unable to parse"	TokenNameStringLiteral	Unable to parse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
*	TokenNameMULTIPLY	
radix	TokenNameIdentifier	 radix
-	TokenNameMINUS	
digit	TokenNameIdentifier	 digit
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"Unable to parse"	TokenNameStringLiteral	Unable to parse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*while (offset < len) { }*/	TokenNameCOMMENT_BLOCK	while (offset < len) { }
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
negative	TokenNameIdentifier	 negative
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
-	TokenNameMINUS	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
(	TokenNameLPAREN	
"Unable to parse"	TokenNameStringLiteral	Unable to parse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* END APACHE HARMONY CODE */	TokenNameCOMMENT_BLOCK	 END APACHE HARMONY CODE 
/** Returns an array size >= minTargetSize, generally * over-allocating exponentially to achieve amortized * linear-time cost as the array grows. * * NOTE: this was originally borrowed from Python 2.4.2 * listobject.c sources (attribution in LICENSE.txt), but * has now been substantially changed based on * discussions from java-dev thread with subject "Dynamic * array reallocation algorithms", started on Jan 12 * 2010. * * @param minTargetSize Minimum required value to be returned. * @param bytesPerElement Bytes used by each element of * the array. See constants in {@link RamUsageEstimator}. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Returns an array size >= minTargetSize, generally over-allocating exponentially to achieve amortized linear-time cost as the array grows. * NOTE: this was originally borrowed from Python 2.4.2 listobject.c sources (attribution in LICENSE.txt), but has now been substantially changed based on discussions from java-dev thread with subject "Dynamic array reallocation algorithms", started on Jan 12 2010. * @param minTargetSize Minimum required value to be returned. @param bytesPerElement Bytes used by each element of the array. See constants in {@link RamUsageEstimator}. * @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
int	TokenNameint	
minTargetSize	TokenNameIdentifier	 min Target Size
,	TokenNameCOMMA	
int	TokenNameint	
bytesPerElement	TokenNameIdentifier	 bytes Per Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minTargetSize	TokenNameIdentifier	 min Target Size
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// catch usage that accidentally overflows int 	TokenNameCOMMENT_LINE	catch usage that accidentally overflows int 
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"invalid array size "	TokenNameStringLiteral	invalid array size 
+	TokenNamePLUS	
minTargetSize	TokenNameIdentifier	 min Target Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minTargetSize	TokenNameIdentifier	 min Target Size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// wait until at least one element is requested 	TokenNameCOMMENT_LINE	wait until at least one element is requested 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// asymptotic exponential growth by 1/8th, favors 	TokenNameCOMMENT_LINE	asymptotic exponential growth by 1/8th, favors 
// spending a bit more CPU to not tie up too much wasted 	TokenNameCOMMENT_LINE	spending a bit more CPU to not tie up too much wasted 
// RAM: 	TokenNameCOMMENT_LINE	RAM: 
int	TokenNameint	
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
minTargetSize	TokenNameIdentifier	 min Target Size
>>	TokenNameRIGHT_SHIFT	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extra	TokenNameIdentifier	 extra
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for very small arrays, where constant overhead of 	TokenNameCOMMENT_LINE	for very small arrays, where constant overhead of 
// realloc is presumably relatively high, we grow 	TokenNameCOMMENT_LINE	realloc is presumably relatively high, we grow 
// faster 	TokenNameCOMMENT_LINE	faster 
extra	TokenNameIdentifier	 extra
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
minTargetSize	TokenNameIdentifier	 min Target Size
+	TokenNamePLUS	
extra	TokenNameIdentifier	 extra
;	TokenNameSEMICOLON	
// add 7 to allow for worst case byte alignment addition below: 	TokenNameCOMMENT_LINE	add 7 to allow for worst case byte alignment addition below: 
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// int overflowed -- return max allowed array size 	TokenNameCOMMENT_LINE	int overflowed -- return max allowed array size 
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
JRE_IS_64BIT	TokenNameIdentifier	 JRE  IS 64 BIT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// round up to 8 byte alignment in 64bit env 	TokenNameCOMMENT_LINE	round up to 8 byte alignment in 64bit env 
switch	TokenNameswitch	
(	TokenNameLPAREN	
bytesPerElement	TokenNameIdentifier	 bytes Per Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// round up to multiple of 2 	TokenNameCOMMENT_LINE	round up to multiple of 2 
return	TokenNamereturn	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7ffffffe	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// round up to multiple of 4 	TokenNameCOMMENT_LINE	round up to multiple of 4 
return	TokenNamereturn	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7ffffffc	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// round up to multiple of 8 	TokenNameCOMMENT_LINE	round up to multiple of 8 
return	TokenNamereturn	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
+	TokenNamePLUS	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7ffffff8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// no rounding 	TokenNameCOMMENT_LINE	no rounding 
default	TokenNamedefault	
:	TokenNameCOLON	
// odd (invalid?) size 	TokenNameCOMMENT_LINE	odd (invalid?) size 
return	TokenNamereturn	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// round up to 4 byte alignment in 64bit env 	TokenNameCOMMENT_LINE	round up to 4 byte alignment in 64bit env 
switch	TokenNameswitch	
(	TokenNameLPAREN	
bytesPerElement	TokenNameIdentifier	 bytes Per Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// round up to multiple of 2 	TokenNameCOMMENT_LINE	round up to multiple of 2 
return	TokenNamereturn	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7ffffffe	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// round up to multiple of 4 	TokenNameCOMMENT_LINE	round up to multiple of 4 
return	TokenNamereturn	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7ffffffc	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
// no rounding 	TokenNameCOMMENT_LINE	no rounding 
default	TokenNamedefault	
:	TokenNameCOLON	
// odd (invalid?) size 	TokenNameCOMMENT_LINE	odd (invalid?) size 
return	TokenNamereturn	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
getShrinkSize	TokenNameIdentifier	 get Shrink Size
(	TokenNameLPAREN	
int	TokenNameint	
currentSize	TokenNameIdentifier	 current Size
,	TokenNameCOMMA	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
int	TokenNameint	
bytesPerElement	TokenNameIdentifier	 bytes Per Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
bytesPerElement	TokenNameIdentifier	 bytes Per Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Only reallocate if we are "substantially" smaller. 	TokenNameCOMMENT_LINE	Only reallocate if we are "substantially" smaller. 
// This saves us from "running hot" (constantly making a 	TokenNameCOMMENT_LINE	This saves us from "running hot" (constantly making a 
// bit bigger then a bit smaller, over and over): 	TokenNameCOMMENT_LINE	bit bigger then a bit smaller, over and over): 
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
<	TokenNameLESS	
currentSize	TokenNameIdentifier	 current Size
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
currentSize	TokenNameIdentifier	 current Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_SHORT	TokenNameIdentifier	 NUM  BYTES  SHORT
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_FLOAT	TokenNameIdentifier	 NUM  BYTES  FLOAT
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_DOUBLE	TokenNameIdentifier	 NUM  BYTES  DOUBLE
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
targetSize	TokenNameIdentifier	 target Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
targetSize	TokenNameIdentifier	 target Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
getShrinkSize	TokenNameIdentifier	 get Shrink Size
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_SHORT	TokenNameIdentifier	 NUM  BYTES  SHORT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
targetSize	TokenNameIdentifier	 target Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
targetSize	TokenNameIdentifier	 target Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
getShrinkSize	TokenNameIdentifier	 get Shrink Size
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_LONG	TokenNameIdentifier	 NUM  BYTES  LONG
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
targetSize	TokenNameIdentifier	 target Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
targetSize	TokenNameIdentifier	 target Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
getShrinkSize	TokenNameIdentifier	 get Shrink Size
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_LONG	TokenNameIdentifier	 NUM  BYTES  LONG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
targetSize	TokenNameIdentifier	 target Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
targetSize	TokenNameIdentifier	 target Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
getShrinkSize	TokenNameIdentifier	 get Shrink Size
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
targetSize	TokenNameIdentifier	 target Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
targetSize	TokenNameIdentifier	 target Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
getShrinkSize	TokenNameIdentifier	 get Shrink Size
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
targetSize	TokenNameIdentifier	 target Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
targetSize	TokenNameIdentifier	 target Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
getShrinkSize	TokenNameIdentifier	 get Shrink Size
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
targetSize	TokenNameIdentifier	 target Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
targetSize	TokenNameIdentifier	 target Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
getShrinkSize	TokenNameIdentifier	 get Shrink Size
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
minSize	TokenNameIdentifier	 min Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
minSize	TokenNameIdentifier	 min Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
minSize	TokenNameIdentifier	 min Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
minSize	TokenNameIdentifier	 min Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
shrink	TokenNameIdentifier	 shrink
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
targetSize	TokenNameIdentifier	 target Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
targetSize	TokenNameIdentifier	 target Size
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"size must be positive (got "	TokenNameStringLiteral	size must be positive (got 
+	TokenNamePLUS	
targetSize	TokenNameIdentifier	 target Size
+	TokenNamePLUS	
"): likely integer overflow?"	TokenNameStringLiteral	): likely integer overflow?
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
getShrinkSize	TokenNameIdentifier	 get Shrink Size
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
targetSize	TokenNameIdentifier	 target Size
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newSize	TokenNameIdentifier	 new Size
!=	TokenNameNOT_EQUAL	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns hash of chars in range start (inclusive) to * end (inclusive) */	TokenNameCOMMENT_JAVADOC	 Returns hash of chars in range start (inclusive) to end (inclusive) 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns hash of bytes in range start (inclusive) to * end (inclusive) */	TokenNameCOMMENT_JAVADOC	 Returns hash of bytes in range start (inclusive) to end (inclusive) 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Since Arrays.equals doesn't implement offsets for equals 	TokenNameCOMMENT_LINE	Since Arrays.equals doesn't implement offsets for equals 
/** * See if two array slices are the same. * * @param left The left array to compare * @param offsetLeft The offset into the array. Must be positive * @param right The right array to compare * @param offsetRight the offset into the right array. Must be positive * @param length The length of the section of the array to compare * @return true if the two arrays, starting at their respective offsets, are equal * * @see java.util.Arrays#equals(char[], char[]) */	TokenNameCOMMENT_JAVADOC	 See if two array slices are the same. * @param left The left array to compare @param offsetLeft The offset into the array. Must be positive @param right The right array to compare @param offsetRight the offset into the right array. Must be positive @param length The length of the section of the array to compare @return true if the two arrays, starting at their respective offsets, are equal * @see java.util.Arrays#equals(char[], char[]) 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
int	TokenNameint	
offsetLeft	TokenNameIdentifier	 offset Left
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
int	TokenNameint	
offsetRight	TokenNameIdentifier	 offset Right
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
offsetLeft	TokenNameIdentifier	 offset Left
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
offsetRight	TokenNameIdentifier	 offset Right
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
[	TokenNameLBRACKET	
offsetLeft	TokenNameIdentifier	 offset Left
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
right	TokenNameIdentifier	 right
[	TokenNameLBRACKET	
offsetRight	TokenNameIdentifier	 offset Right
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
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
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Since Arrays.equals doesn't implement offsets for equals 	TokenNameCOMMENT_LINE	Since Arrays.equals doesn't implement offsets for equals 
/** * See if two array slices are the same. * * @param left The left array to compare * @param offsetLeft The offset into the array. Must be positive * @param right The right array to compare * @param offsetRight the offset into the right array. Must be positive * @param length The length of the section of the array to compare * @return true if the two arrays, starting at their respective offsets, are equal * * @see java.util.Arrays#equals(char[], char[]) */	TokenNameCOMMENT_JAVADOC	 See if two array slices are the same. * @param left The left array to compare @param offsetLeft The offset into the array. Must be positive @param right The right array to compare @param offsetRight the offset into the right array. Must be positive @param length The length of the section of the array to compare @return true if the two arrays, starting at their respective offsets, are equal * @see java.util.Arrays#equals(char[], char[]) 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
int	TokenNameint	
offsetLeft	TokenNameIdentifier	 offset Left
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
int	TokenNameint	
offsetRight	TokenNameIdentifier	 offset Right
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
offsetLeft	TokenNameIdentifier	 offset Left
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
offsetRight	TokenNameIdentifier	 offset Right
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
[	TokenNameLBRACKET	
offsetLeft	TokenNameIdentifier	 offset Left
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
right	TokenNameIdentifier	 right
[	TokenNameLBRACKET	
offsetRight	TokenNameIdentifier	 offset Right
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
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
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toIntArray	TokenNameIdentifier	 to Int Array
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
ints	TokenNameIdentifier	 ints
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
v	TokenNameIdentifier	 v
:	TokenNameCOLON	
ints	TokenNameIdentifier	 ints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// paranoia: 	TokenNameCOMMENT_LINE	paranoia: 
assert	TokenNameassert	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** SorterTemplate with custom {@link Comparator} */	TokenNameCOMMENT_JAVADOC	 SorterTemplate with custom {@link Comparator} 
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
SorterTemplate	TokenNameIdentifier	 Sorter Template
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SorterTemplate	TokenNameIdentifier	 Sorter Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setPivot	TokenNameIdentifier	 set Pivot
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pivot	TokenNameIdentifier	 pivot
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
T	TokenNameIdentifier	 T
pivot	TokenNameIdentifier	 pivot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Natural SorterTemplate */	TokenNameCOMMENT_JAVADOC	 Natural SorterTemplate 
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
SorterTemplate	TokenNameIdentifier	 Sorter Template
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SorterTemplate	TokenNameIdentifier	 Sorter Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setPivot	TokenNameIdentifier	 set Pivot
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pivot	TokenNameIdentifier	 pivot
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pivot	TokenNameIdentifier	 pivot
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
T	TokenNameIdentifier	 T
pivot	TokenNameIdentifier	 pivot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// quickSorts (endindex is exclusive!): 	TokenNameCOMMENT_LINE	quickSorts (endindex is exclusive!): 
/** * Sorts the given array slice using the {@link Comparator}. This method uses the quick sort * algorithm, but falls back to insertion sort for small arrays. * @param fromIndex start index (inclusive) * @param toIndex end index (exclusive) */	TokenNameCOMMENT_JAVADOC	 Sorts the given array slice using the {@link Comparator}. This method uses the quick sort algorithm, but falls back to insertion sort for small arrays. @param fromIndex start index (inclusive) @param toIndex end index (exclusive) 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
int	TokenNameint	
toIndex	TokenNameIdentifier	 to Index
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
fromIndex	TokenNameIdentifier	 from Index
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
.	TokenNameDOT	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given array using the {@link Comparator}. This method uses the quick sort * algorithm, but falls back to insertion sort for small arrays. */	TokenNameCOMMENT_JAVADOC	 Sorts the given array using the {@link Comparator}. This method uses the quick sort algorithm, but falls back to insertion sort for small arrays. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given array slice in natural order. This method uses the quick sort * algorithm, but falls back to insertion sort for small arrays. * @param fromIndex start index (inclusive) * @param toIndex end index (exclusive) */	TokenNameCOMMENT_JAVADOC	 Sorts the given array slice in natural order. This method uses the quick sort algorithm, but falls back to insertion sort for small arrays. @param fromIndex start index (inclusive) @param toIndex end index (exclusive) 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
void	TokenNamevoid	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
int	TokenNameint	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
fromIndex	TokenNameIdentifier	 from Index
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
.	TokenNameDOT	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given array in natural order. This method uses the quick sort * algorithm, but falls back to insertion sort for small arrays. */	TokenNameCOMMENT_JAVADOC	 Sorts the given array in natural order. This method uses the quick sort algorithm, but falls back to insertion sort for small arrays. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
void	TokenNamevoid	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// mergeSorts: 	TokenNameCOMMENT_LINE	mergeSorts: 
/** * Sorts the given array slice using the {@link Comparator}. This method uses the merge sort * algorithm, but falls back to insertion sort for small arrays. * @param fromIndex start index (inclusive) * @param toIndex end index (exclusive) */	TokenNameCOMMENT_JAVADOC	 Sorts the given array slice using the {@link Comparator}. This method uses the merge sort algorithm, but falls back to insertion sort for small arrays. @param fromIndex start index (inclusive) @param toIndex end index (exclusive) 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
int	TokenNameint	
toIndex	TokenNameIdentifier	 to Index
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
fromIndex	TokenNameIdentifier	 from Index
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
//System.out.println("SORT: " + (toIndex-fromIndex)); 	TokenNameCOMMENT_LINE	System.out.println("SORT: " + (toIndex-fromIndex)); 
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given array using the {@link Comparator}. This method uses the merge sort * algorithm, but falls back to insertion sort for small arrays. */	TokenNameCOMMENT_JAVADOC	 Sorts the given array using the {@link Comparator}. This method uses the merge sort algorithm, but falls back to insertion sort for small arrays. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given array slice in natural order. This method uses the merge sort * algorithm, but falls back to insertion sort for small arrays. * @param fromIndex start index (inclusive) * @param toIndex end index (exclusive) */	TokenNameCOMMENT_JAVADOC	 Sorts the given array slice in natural order. This method uses the merge sort algorithm, but falls back to insertion sort for small arrays. @param fromIndex start index (inclusive) @param toIndex end index (exclusive) 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
void	TokenNamevoid	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
int	TokenNameint	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
fromIndex	TokenNameIdentifier	 from Index
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given array in natural order. This method uses the merge sort * algorithm, but falls back to insertion sort for small arrays. */	TokenNameCOMMENT_JAVADOC	 Sorts the given array in natural order. This method uses the merge sort algorithm, but falls back to insertion sort for small arrays. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
void	TokenNamevoid	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insertionSorts: 	TokenNameCOMMENT_LINE	insertionSorts: 
/** * Sorts the given array slice using the {@link Comparator}. This method uses the insertion sort * algorithm. It is only recommended to use this algorithm for partially sorted small arrays! * @param fromIndex start index (inclusive) * @param toIndex end index (exclusive) */	TokenNameCOMMENT_JAVADOC	 Sorts the given array slice using the {@link Comparator}. This method uses the insertion sort algorithm. It is only recommended to use this algorithm for partially sorted small arrays! @param fromIndex start index (inclusive) @param toIndex end index (exclusive) 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
int	TokenNameint	
toIndex	TokenNameIdentifier	 to Index
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
fromIndex	TokenNameIdentifier	 from Index
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
.	TokenNameDOT	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given array using the {@link Comparator}. This method uses the insertion sort * algorithm. It is only recommended to use this algorithm for partially sorted small arrays! */	TokenNameCOMMENT_JAVADOC	 Sorts the given array using the {@link Comparator}. This method uses the insertion sort algorithm. It is only recommended to use this algorithm for partially sorted small arrays! 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given array slice in natural order. This method uses the insertion sort * algorithm. It is only recommended to use this algorithm for partially sorted small arrays! * @param fromIndex start index (inclusive) * @param toIndex end index (exclusive) */	TokenNameCOMMENT_JAVADOC	 Sorts the given array slice in natural order. This method uses the insertion sort algorithm. It is only recommended to use this algorithm for partially sorted small arrays! @param fromIndex start index (inclusive) @param toIndex end index (exclusive) 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
void	TokenNamevoid	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
int	TokenNameint	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
fromIndex	TokenNameIdentifier	 from Index
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
.	TokenNameDOT	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given array in natural order. This method uses the insertion sort * algorithm. It is only recommended to use this algorithm for partially sorted small arrays! */	TokenNameCOMMENT_JAVADOC	 Sorts the given array in natural order. This method uses the insertion sort algorithm. It is only recommended to use this algorithm for partially sorted small arrays! 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
void	TokenNamevoid	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
