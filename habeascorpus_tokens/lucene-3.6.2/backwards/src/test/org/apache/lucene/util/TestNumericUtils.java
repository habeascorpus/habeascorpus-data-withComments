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
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestNumericUtils	TokenNameIdentifier	 Test Numeric Utils
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLongConversionAndOrdering	TokenNameIdentifier	 test Long Conversion And Ordering
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// generate a series of encoded longs, each numerical one bigger than the one before 	TokenNameCOMMENT_LINE	generate a series of encoded longs, each numerical one bigger than the one before 
String	TokenNameIdentifier	 String
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
-	TokenNameMINUS	
100000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
<	TokenNameLESS	
100000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
act	TokenNameIdentifier	 act
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// test if smaller 	TokenNameCOMMENT_LINE	test if smaller 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"actual bigger than last"	TokenNameStringLiteral	actual bigger than last
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
act	TokenNameIdentifier	 act
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// test is back and forward conversion works 	TokenNameCOMMENT_LINE	test is back and forward conversion works 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"forward and back conversion should generate same long"	TokenNameStringLiteral	forward and back conversion should generate same long
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToLong	TokenNameIdentifier	 prefix Coded To Long
(	TokenNameLPAREN	
act	TokenNameIdentifier	 act
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// next step 	TokenNameCOMMENT_LINE	next step 
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
act	TokenNameIdentifier	 act
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIntConversionAndOrdering	TokenNameIdentifier	 test Int Conversion And Ordering
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// generate a series of encoded ints, each numerical one bigger than the one before 	TokenNameCOMMENT_LINE	generate a series of encoded ints, each numerical one bigger than the one before 
String	TokenNameIdentifier	 String
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
act	TokenNameIdentifier	 act
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// test if smaller 	TokenNameCOMMENT_LINE	test if smaller 
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"actual bigger than last"	TokenNameStringLiteral	actual bigger than last
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
act	TokenNameIdentifier	 act
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// test is back and forward conversion works 	TokenNameCOMMENT_LINE	test is back and forward conversion works 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"forward and back conversion should generate same int"	TokenNameStringLiteral	forward and back conversion should generate same int
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToInt	TokenNameIdentifier	 prefix Coded To Int
(	TokenNameLPAREN	
act	TokenNameIdentifier	 act
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// next step 	TokenNameCOMMENT_LINE	next step 
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
act	TokenNameIdentifier	 act
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLongSpecialValues	TokenNameIdentifier	 test Long Special Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
5003400000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
4000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
3000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1L	TokenNameLongLiteral	
,	TokenNameCOMMA	
10L	TokenNameLongLiteral	
,	TokenNameCOMMA	
300L	TokenNameLongLiteral	
,	TokenNameCOMMA	
50006789999999999L	TokenNameLongLiteral	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefixVals	TokenNameIdentifier	 prefix Vals
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check forward and back conversion 	TokenNameCOMMENT_LINE	check forward and back conversion 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"forward and back conversion should generate same long"	TokenNameStringLiteral	forward and back conversion should generate same long
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToLong	TokenNameIdentifier	 prefix Coded To Long
(	TokenNameLPAREN	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test if decoding values as int fails correctly 	TokenNameCOMMENT_LINE	test if decoding values as int fails correctly 
try	TokenNametry	
{	TokenNameLBRACE	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToInt	TokenNameIdentifier	 prefix Coded To Int
(	TokenNameLPAREN	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"decoding a prefix coded long value as int should fail"	TokenNameStringLiteral	decoding a prefix coded long value as int should fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// worked 	TokenNameCOMMENT_LINE	worked 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// check sort order (prefixVals should be ascending) 	TokenNameCOMMENT_LINE	check sort order (prefixVals should be ascending) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
prefixVals	TokenNameIdentifier	 prefix Vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"check sort order"	TokenNameStringLiteral	check sort order
,	TokenNameCOMMA	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check the prefix encoding, lower precision should have the difference to original value equal to the lower removed bits 	TokenNameCOMMENT_LINE	check the prefix encoding, lower precision should have the difference to original value equal to the lower removed bits 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
prefixVal	TokenNameIdentifier	 prefix Val
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToLong	TokenNameIdentifier	 prefix Coded To Long
(	TokenNameLPAREN	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
longToPrefixCoded	TokenNameIdentifier	 long To Prefix Coded
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"difference between prefix val and original value for "	TokenNameStringLiteral	difference between prefix val and original value for 
+	TokenNamePLUS	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" with shift="	TokenNameStringLiteral	 with shift=
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
prefixVal	TokenNameIdentifier	 prefix Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testIntSpecialValues	TokenNameIdentifier	 test Int Special Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
64765767	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
4000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
3000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
300	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
765878989	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefixVals	TokenNameIdentifier	 prefix Vals
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// check forward and back conversion 	TokenNameCOMMENT_LINE	check forward and back conversion 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"forward and back conversion should generate same int"	TokenNameStringLiteral	forward and back conversion should generate same int
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToInt	TokenNameIdentifier	 prefix Coded To Int
(	TokenNameLPAREN	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// test if decoding values as long fails correctly 	TokenNameCOMMENT_LINE	test if decoding values as long fails correctly 
try	TokenNametry	
{	TokenNameLBRACE	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToLong	TokenNameIdentifier	 prefix Coded To Long
(	TokenNameLPAREN	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"decoding a prefix coded int value as long should fail"	TokenNameStringLiteral	decoding a prefix coded int value as long should fail
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// worked 	TokenNameCOMMENT_LINE	worked 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// check sort order (prefixVals should be ascending) 	TokenNameCOMMENT_LINE	check sort order (prefixVals should be ascending) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
prefixVals	TokenNameIdentifier	 prefix Vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"check sort order"	TokenNameStringLiteral	check sort order
,	TokenNameCOMMA	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
prefixVals	TokenNameIdentifier	 prefix Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check the prefix encoding, lower precision should have the difference to original value equal to the lower removed bits 	TokenNameCOMMENT_LINE	check the prefix encoding, lower precision should have the difference to original value equal to the lower removed bits 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prefixVal	TokenNameIdentifier	 prefix Val
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
prefixCodedToInt	TokenNameIdentifier	 prefix Coded To Int
(	TokenNameLPAREN	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
intToPrefixCoded	TokenNameIdentifier	 int To Prefix Coded
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
mask	TokenNameIdentifier	 mask
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"difference between prefix val and original value for "	TokenNameStringLiteral	difference between prefix val and original value for 
+	TokenNamePLUS	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" with shift="	TokenNameStringLiteral	 with shift=
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
mask	TokenNameIdentifier	 mask
,	TokenNameCOMMA	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
prefixVal	TokenNameIdentifier	 prefix Val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDoubles	TokenNameIdentifier	 test Doubles
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
,	TokenNameCOMMA	
-	TokenNameMINUS	
2.3E25	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0E15	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0E-1	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0E-2	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
+	TokenNamePLUS	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0E-2	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0E-1	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0E15	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
2.3E25	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
longVals	TokenNameIdentifier	 long Vals
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// check forward and back conversion 	TokenNameCOMMENT_LINE	check forward and back conversion 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
longVals	TokenNameIdentifier	 long Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"forward and back conversion should generate same double"	TokenNameStringLiteral	forward and back conversion should generate same double
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
sortableLongToDouble	TokenNameIdentifier	 sortable Long To Double
(	TokenNameLPAREN	
longVals	TokenNameIdentifier	 long Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check sort order (prefixVals should be ascending) 	TokenNameCOMMENT_LINE	check sort order (prefixVals should be ascending) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
longVals	TokenNameIdentifier	 long Vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"check sort order"	TokenNameStringLiteral	check sort order
,	TokenNameCOMMA	
longVals	TokenNameIdentifier	 long Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
longVals	TokenNameIdentifier	 long Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DOUBLE_NANs	TokenNameIdentifier	 DOUBLE  NA Ns
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
longBitsToDouble	TokenNameIdentifier	 long Bits To Double
(	TokenNameLPAREN	
0x7ff0000000000001L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
longBitsToDouble	TokenNameIdentifier	 long Bits To Double
(	TokenNameLPAREN	
0x7fffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
longBitsToDouble	TokenNameIdentifier	 long Bits To Double
(	TokenNameLPAREN	
0xfff0000000000001L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
longBitsToDouble	TokenNameIdentifier	 long Bits To Double
(	TokenNameLPAREN	
0xffffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testSortableDoubleNaN	TokenNameIdentifier	 test Sortable Double Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
plusInf	TokenNameIdentifier	 plus Inf
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
double	TokenNamedouble	
nan	TokenNameIdentifier	 nan
:	TokenNameCOLON	
DOUBLE_NANs	TokenNameIdentifier	 DOUBLE  NA Ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
nan	TokenNameIdentifier	 nan
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
sortable	TokenNameIdentifier	 sortable
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToSortableLong	TokenNameIdentifier	 double To Sortable Long
(	TokenNameLPAREN	
nan	TokenNameIdentifier	 nan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Double not sorted correctly: "	TokenNameStringLiteral	Double not sorted correctly: 
+	TokenNamePLUS	
nan	TokenNameIdentifier	 nan
+	TokenNamePLUS	
", long repr: "	TokenNameStringLiteral	, long repr: 
+	TokenNamePLUS	
sortable	TokenNameIdentifier	 sortable
+	TokenNamePLUS	
", positive inf.: "	TokenNameStringLiteral	, positive inf.: 
+	TokenNamePLUS	
plusInf	TokenNameIdentifier	 plus Inf
,	TokenNameCOMMA	
sortable	TokenNameIdentifier	 sortable
>	TokenNameGREATER	
plusInf	TokenNameIdentifier	 plus Inf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFloats	TokenNameIdentifier	 test Floats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vals	TokenNameIdentifier	 vals
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
,	TokenNameCOMMA	
-	TokenNameMINUS	
2.3E25f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0E15f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0E-1f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0E-2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
+	TokenNamePLUS	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.0E-2f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.0E-1f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1.0E15f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
2.3E25f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intVals	TokenNameIdentifier	 int Vals
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// check forward and back conversion 	TokenNameCOMMENT_LINE	check forward and back conversion 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
vals	TokenNameIdentifier	 vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
intVals	TokenNameIdentifier	 int Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"forward and back conversion should generate same double"	TokenNameStringLiteral	forward and back conversion should generate same double
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
vals	TokenNameIdentifier	 vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
sortableIntToFloat	TokenNameIdentifier	 sortable Int To Float
(	TokenNameLPAREN	
intVals	TokenNameIdentifier	 int Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check sort order (prefixVals should be ascending) 	TokenNameCOMMENT_LINE	check sort order (prefixVals should be ascending) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
intVals	TokenNameIdentifier	 int Vals
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"check sort order"	TokenNameStringLiteral	check sort order
,	TokenNameCOMMA	
intVals	TokenNameIdentifier	 int Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
intVals	TokenNameIdentifier	 int Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
FLOAT_NANs	TokenNameIdentifier	 FLOAT  NA Ns
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
0x7f800001	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
0x7fffffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
0xff800001	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
intBitsToFloat	TokenNameIdentifier	 int Bits To Float
(	TokenNameLPAREN	
0xffffffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testSortableFloatNaN	TokenNameIdentifier	 test Sortable Float Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
plusInf	TokenNameIdentifier	 plus Inf
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
POSITIVE_INFINITY	TokenNameIdentifier	 POSITIVE  INFINITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
float	TokenNamefloat	
nan	TokenNameIdentifier	 nan
:	TokenNameCOLON	
FLOAT_NANs	TokenNameIdentifier	 FLOAT  NA Ns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
nan	TokenNameIdentifier	 nan
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
sortable	TokenNameIdentifier	 sortable
=	TokenNameEQUAL	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
floatToSortableInt	TokenNameIdentifier	 float To Sortable Int
(	TokenNameLPAREN	
nan	TokenNameIdentifier	 nan
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Float not sorted correctly: "	TokenNameStringLiteral	Float not sorted correctly: 
+	TokenNamePLUS	
nan	TokenNameIdentifier	 nan
+	TokenNamePLUS	
", int repr: "	TokenNameStringLiteral	, int repr: 
+	TokenNamePLUS	
sortable	TokenNameIdentifier	 sortable
+	TokenNamePLUS	
", positive inf.: "	TokenNameStringLiteral	, positive inf.: 
+	TokenNamePLUS	
plusInf	TokenNameIdentifier	 plus Inf
,	TokenNameCOMMA	
sortable	TokenNameIdentifier	 sortable
>	TokenNameGREATER	
plusInf	TokenNameIdentifier	 plus Inf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// INFO: Tests for trieCodeLong()/trieCodeInt() not needed because implicitely tested by range filter tests 	TokenNameCOMMENT_LINE	INFO: Tests for trieCodeLong()/trieCodeInt() not needed because implicitely tested by range filter tests 
/** Note: The neededBounds Iterable must be unsigned (easier understanding what's happening) */	TokenNameCOMMENT_JAVADOC	 Note: The neededBounds Iterable must be unsigned (easier understanding what's happening) 
private	TokenNameprivate	
void	TokenNamevoid	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
final	TokenNamefinal	
long	TokenNamelong	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
final	TokenNamefinal	
long	TokenNamelong	
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
useBitSet	TokenNameIdentifier	 use Bit Set
,	TokenNameCOMMA	
final	TokenNamefinal	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
expectedBounds	TokenNameIdentifier	 expected Bounds
,	TokenNameCOMMA	
final	TokenNamefinal	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
expectedShifts	TokenNameIdentifier	 expected Shifts
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// Cannot use FixedBitSet since the range could be long: 	TokenNameCOMMENT_LINE	Cannot use FixedBitSet since the range could be long: 
final	TokenNamefinal	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
useBitSet	TokenNameIdentifier	 use Bit Set
?	TokenNameQUESTION	
new	TokenNamenew	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
neededBounds	TokenNameIdentifier	 needed Bounds
=	TokenNameEQUAL	
(	TokenNameLPAREN	
expectedBounds	TokenNameIdentifier	 expected Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
expectedBounds	TokenNameIdentifier	 expected Bounds
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
neededShifts	TokenNameIdentifier	 needed Shifts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
expectedShifts	TokenNameIdentifier	 expected Shifts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
expectedShifts	TokenNameIdentifier	 expected Shifts
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
splitLongRange	TokenNameIdentifier	 split Long Range
(	TokenNameLPAREN	
new	TokenNamenew	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
LongRangeBuilder	TokenNameIdentifier	 Long Range Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
long	TokenNamelong	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
long	TokenNamelong	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"min, max should be inside bounds"	TokenNameStringLiteral	min, max should be inside bounds
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
>=	TokenNameGREATER_EQUAL	
lower	TokenNameIdentifier	 lower
&&	TokenNameAND_AND	
min	TokenNameIdentifier	 min
<=	TokenNameLESS_EQUAL	
upper	TokenNameIdentifier	 upper
&&	TokenNameAND_AND	
max	TokenNameIdentifier	 max
>=	TokenNameGREATER_EQUAL	
lower	TokenNameIdentifier	 lower
&&	TokenNameAND_AND	
max	TokenNameIdentifier	 max
<=	TokenNameLESS_EQUAL	
upper	TokenNameIdentifier	 upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useBitSet	TokenNameIdentifier	 use Bit Set
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
<=	TokenNameLESS_EQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"ranges should not overlap"	TokenNameStringLiteral	ranges should not overlap
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
getAndSet	TokenNameIdentifier	 get And Set
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// extra exit condition to prevent overflow on MAX_VALUE 	TokenNameCOMMENT_LINE	extra exit condition to prevent overflow on MAX_VALUE 
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
neededBounds	TokenNameIdentifier	 needed Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
neededShifts	TokenNameIdentifier	 needed Shifts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// make unsigned longs for easier display and understanding 	TokenNameCOMMENT_LINE	make unsigned longs for easier display and understanding 
min	TokenNameIdentifier	 min
^=	TokenNameXOR_EQUAL	
0x8000000000000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
^=	TokenNameXOR_EQUAL	
0x8000000000000000L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
//System.out.println("0x"+Long.toHexString(min>>>shift)+"L,0x"+Long.toHexString(max>>>shift)+"L)/*shift="+shift+"*/,"); 	TokenNameCOMMENT_LINE	System.out.println("0x"+Long.toHexString(min>>>shift)+"L,0x"+Long.toHexString(max>>>shift)+"L)/*shift="+shift+"*/,"); 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"shift"	TokenNameStringLiteral	shift
,	TokenNameCOMMA	
neededShifts	TokenNameIdentifier	 needed Shifts
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"inner min bound"	TokenNameStringLiteral	inner min bound
,	TokenNameCOMMA	
neededBounds	TokenNameIdentifier	 needed Bounds
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"inner max bound"	TokenNameStringLiteral	inner max bound
,	TokenNameCOMMA	
neededBounds	TokenNameIdentifier	 needed Bounds
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useBitSet	TokenNameIdentifier	 use Bit Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// after flipping all bits in the range, the cardinality should be zero 	TokenNameCOMMENT_LINE	after flipping all bits in the range, the cardinality should be zero 
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The sub-range concenated should match the whole range"	TokenNameStringLiteral	The sub-range concenated should match the whole range
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** LUCENE-2541: NumericRangeQuery errors with endpoints near long min and max values */	TokenNameCOMMENT_JAVADOC	 LUCENE-2541: NumericRangeQuery errors with endpoints near long min and max values 
public	TokenNamepublic	
void	TokenNamevoid	
testLongExtremeValues	TokenNameIdentifier	 test Long Extreme Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// upper end extremes 	TokenNameCOMMENT_LINE	upper end extremes 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0xffffffffffffffffL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xffffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0xffffffffffffffffL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xffffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0xffffffffffffffffL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xffffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0xffffffffffffffffL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xffffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0xffffffffffffffffL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xffffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0xffffffffffffffffL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xffffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
0xfL	TokenNameLongLiteral	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0xfffffffffffffffL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xfffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
0x10L	TokenNameLongLiteral	
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0xffffffffffffffefL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xffffffffffffffefL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xfffffffffffffffL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xfffffffffffffffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// lower end extremes 	TokenNameCOMMENT_LINE	lower end extremes 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
0xfL	TokenNameLongLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x000000000000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
0x10L	TokenNameLongLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0000000000000010L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x0000000000000010L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x000000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x000000000000000L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRandomSplit	TokenNameIdentifier	 test Random Split
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
long	TokenNamelong	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
executeOneRandomSplit	TokenNameIdentifier	 execute One Random Split
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
executeOneRandomSplit	TokenNameIdentifier	 execute One Random Split
(	TokenNameLPAREN	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
long	TokenNamelong	
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
randomLong	TokenNameIdentifier	 random Long
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
16384	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// not too large bitsets, else OOME! 	TokenNameCOMMENT_LINE	not too large bitsets, else OOME! 
while	TokenNamewhile	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
<	TokenNameLESS	
lower	TokenNameIdentifier	 lower
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// overflow 	TokenNameCOMMENT_LINE	overflow 
lower	TokenNameIdentifier	 lower
>>=	TokenNameRIGHT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
lower	TokenNameIdentifier	 lower
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
64	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
randomLong	TokenNameIdentifier	 random Long
(	TokenNameLPAREN	
final	TokenNamefinal	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// patterns like 0x000000100000 (-1 yields patterns like 0x0000fff) 	TokenNameCOMMENT_LINE	patterns like 0x000000100000 (-1 yields patterns like 0x0000fff) 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
-	TokenNameMINUS	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// patterns like 0xfffff00000 	TokenNameCOMMENT_LINE	patterns like 0xfffff00000 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
val	TokenNameIdentifier	 val
+=	TokenNamePLUS_EQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
+=	TokenNamePLUS_EQUAL	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSplitLongRange	TokenNameIdentifier	 test Split Long Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// a hard-coded "standard" range 	TokenNameCOMMENT_LINE	a hard-coded "standard" range 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
-	TokenNameMINUS	
5000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
9500L	TokenNameLongLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x7fffffffffffec78L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x7fffffffffffec7fL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x8000000000002510L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x800000000000251cL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x7fffffffffffec8L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x7fffffffffffecfL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x800000000000250L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x800000000000250L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x7fffffffffffedL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x7fffffffffffefL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x80000000000020L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x80000000000024L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x7ffffffffffffL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x8000000000001L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the same with no range splitting 	TokenNameCOMMENT_LINE	the same with no range splitting 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
-	TokenNameMINUS	
5000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
9500L	TokenNameLongLiteral	
,	TokenNameCOMMA	
64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x7fffffffffffec78L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x800000000000251cL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this tests optimized range splitting, if one of the inner bounds 	TokenNameCOMMENT_LINE	this tests optimized range splitting, if one of the inner bounds 
// is also the bound of the next lower precision, it should be used completely 	TokenNameCOMMENT_LINE	is also the bound of the next lower precision, it should be used completely 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
1024L	TokenNameLongLiteral	
+	TokenNamePLUS	
63L	TokenNameLongLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x800000000000040L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x800000000000043L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x80000000000000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x80000000000003L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the full long range should only consist of a lowest precision range; no bitset testing here, as too much memory needed :-) 	TokenNameCOMMENT_LINE	the full long range should only consist of a lowest precision range; no bitset testing here, as too much memory needed :-) 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x00L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xffL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
56	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the same with precisionStep=4 	TokenNameCOMMENT_LINE	the same with precisionStep=4 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0xfL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the same with precisionStep=2 	TokenNameCOMMENT_LINE	the same with precisionStep=2 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x3L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
62	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the same with precisionStep=1 	TokenNameCOMMENT_LINE	the same with precisionStep=1 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0L	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x1L	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
63	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a inverse range should produce no sub-ranges 	TokenNameCOMMENT_LINE	a inverse range should produce no sub-ranges 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
9500L	TokenNameLongLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
5000L	TokenNameLongLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a 0-length range should reproduce the range itsself 	TokenNameCOMMENT_LINE	a 0-length range should reproduce the range itsself 
assertLongRangeSplit	TokenNameIdentifier	 assert Long Range Split
(	TokenNameLPAREN	
9500L	TokenNameLongLiteral	
,	TokenNameCOMMA	
9500L	TokenNameLongLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x800000000000251cL	TokenNameLongLiteral	
,	TokenNameCOMMA	
0x800000000000251cL	TokenNameLongLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Note: The neededBounds Iterable must be unsigned (easier understanding what's happening) */	TokenNameCOMMENT_JAVADOC	 Note: The neededBounds Iterable must be unsigned (easier understanding what's happening) 
private	TokenNameprivate	
void	TokenNamevoid	
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
useBitSet	TokenNameIdentifier	 use Bit Set
,	TokenNameCOMMA	
final	TokenNamefinal	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
expectedBounds	TokenNameIdentifier	 expected Bounds
,	TokenNameCOMMA	
final	TokenNamefinal	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
expectedShifts	TokenNameIdentifier	 expected Shifts
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
useBitSet	TokenNameIdentifier	 use Bit Set
?	TokenNameQUESTION	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
neededBounds	TokenNameIdentifier	 needed Bounds
=	TokenNameEQUAL	
(	TokenNameLPAREN	
expectedBounds	TokenNameIdentifier	 expected Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
expectedBounds	TokenNameIdentifier	 expected Bounds
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
neededShifts	TokenNameIdentifier	 needed Shifts
=	TokenNameEQUAL	
(	TokenNameLPAREN	
expectedShifts	TokenNameIdentifier	 expected Shifts
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
expectedShifts	TokenNameIdentifier	 expected Shifts
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
splitIntRange	TokenNameIdentifier	 split Int Range
(	TokenNameLPAREN	
new	TokenNamenew	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
IntRangeBuilder	TokenNameIdentifier	 Int Range Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addRange	TokenNameIdentifier	 add Range
(	TokenNameLPAREN	
int	TokenNameint	
min	TokenNameIdentifier	 min
,	TokenNameCOMMA	
int	TokenNameint	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
int	TokenNameint	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"min, max should be inside bounds"	TokenNameStringLiteral	min, max should be inside bounds
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
>=	TokenNameGREATER_EQUAL	
lower	TokenNameIdentifier	 lower
&&	TokenNameAND_AND	
min	TokenNameIdentifier	 min
<=	TokenNameLESS_EQUAL	
upper	TokenNameIdentifier	 upper
&&	TokenNameAND_AND	
max	TokenNameIdentifier	 max
>=	TokenNameGREATER_EQUAL	
lower	TokenNameIdentifier	 lower
&&	TokenNameAND_AND	
max	TokenNameIdentifier	 max
<=	TokenNameLESS_EQUAL	
upper	TokenNameIdentifier	 upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useBitSet	TokenNameIdentifier	 use Bit Set
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"ranges should not overlap"	TokenNameStringLiteral	ranges should not overlap
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
getAndSet	TokenNameIdentifier	 get And Set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// extra exit condition to prevent overflow on MAX_VALUE 	TokenNameCOMMENT_LINE	extra exit condition to prevent overflow on MAX_VALUE 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
neededBounds	TokenNameIdentifier	 needed Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// make unsigned ints for easier display and understanding 	TokenNameCOMMENT_LINE	make unsigned ints for easier display and understanding 
min	TokenNameIdentifier	 min
^=	TokenNameXOR_EQUAL	
0x80000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
^=	TokenNameXOR_EQUAL	
0x80000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("0x"+Integer.toHexString(min>>>shift)+",0x"+Integer.toHexString(max>>>shift)+")/*shift="+shift+"*/,"); 	TokenNameCOMMENT_LINE	System.out.println("0x"+Integer.toHexString(min>>>shift)+",0x"+Integer.toHexString(max>>>shift)+")/*shift="+shift+"*/,"); 
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"shift"	TokenNameStringLiteral	shift
,	TokenNameCOMMA	
neededShifts	TokenNameIdentifier	 needed Shifts
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"inner min bound"	TokenNameStringLiteral	inner min bound
,	TokenNameCOMMA	
neededBounds	TokenNameIdentifier	 needed Bounds
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"inner max bound"	TokenNameStringLiteral	inner max bound
,	TokenNameCOMMA	
neededBounds	TokenNameIdentifier	 needed Bounds
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
useBitSet	TokenNameIdentifier	 use Bit Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// after flipping all bits in the range, the cardinality should be zero 	TokenNameCOMMENT_LINE	after flipping all bits in the range, the cardinality should be zero 
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The sub-range concenated should match the whole range"	TokenNameStringLiteral	The sub-range concenated should match the whole range
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
cardinality	TokenNameIdentifier	 cardinality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSplitIntRange	TokenNameIdentifier	 test Split Int Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// a hard-coded "standard" range 	TokenNameCOMMENT_LINE	a hard-coded "standard" range 
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
-	TokenNameMINUS	
5000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x7fffec78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7fffec7f	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x80002510	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8000251c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7fffec8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7fffecf	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8000250	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8000250	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7fffed	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7fffef	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x800020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x800024	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7ffff	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x80001	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the same with no range splitting 	TokenNameCOMMENT_LINE	the same with no range splitting 
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
-	TokenNameMINUS	
5000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x7fffec78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8000251c	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this tests optimized range splitting, if one of the inner bounds 	TokenNameCOMMENT_LINE	this tests optimized range splitting, if one of the inner bounds 
// is also the bound of the next lower precision, it should be used completely 	TokenNameCOMMENT_LINE	is also the bound of the next lower precision, it should be used completely 
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1024	TokenNameIntegerLiteral	
+	TokenNamePLUS	
63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x8000040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8000043	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x800000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x800003	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the full int range should only consist of a lowest precision range; no bitset testing here, as too much memory needed :-) 	TokenNameCOMMENT_LINE	the full int range should only consist of a lowest precision range; no bitset testing here, as too much memory needed :-) 
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the same with precisionStep=4 	TokenNameCOMMENT_LINE	the same with precisionStep=4 
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xf	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
28	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the same with precisionStep=2 	TokenNameCOMMENT_LINE	the same with precisionStep=2 
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
30	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// the same with precisionStep=1 	TokenNameCOMMENT_LINE	the same with precisionStep=1 
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a inverse range should produce no sub-ranges 	TokenNameCOMMENT_LINE	a inverse range should produce no sub-ranges 
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
9500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
5000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// a 0-length range should reproduce the range itsself 	TokenNameCOMMENT_LINE	a 0-length range should reproduce the range itsself 
assertIntRangeSplit	TokenNameIdentifier	 assert Int Range Split
(	TokenNameLPAREN	
9500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0x8000251c	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8000251c	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
