/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMSafeStringPool.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMSafeStringPool.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
/** <p>Like DTMStringPool, but threadsafe. It's been proposed that DTMs * share their string pool(s); that raises threadsafety issues which * this addresses. Of course performance is inferior to that of the * bare-bones version.</p> * * <p>Status: Passed basic test in main().</p> * */	TokenNameCOMMENT_JAVADOC	 <p>Like DTMStringPool, but threadsafe. It's been proposed that DTMs share their string pool(s); that raises threadsafety issues which this addresses. Of course performance is inferior to that of the bare-bones version.</p> * <p>Status: Passed basic test in main().</p> 
public	TokenNamepublic	
class	TokenNameclass	
DTMSafeStringPool	TokenNameIdentifier	 DTM Safe String Pool
extends	TokenNameextends	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
{	TokenNameLBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return string whose value is uniquely identified by this integer index. * @throws java.lang.ArrayIndexOutOfBoundsException * if index doesn't map to a string. * */	TokenNameCOMMENT_JAVADOC	 @return string whose value is uniquely identified by this integer index. @throws java.lang.ArrayIndexOutOfBoundsException if index doesn't map to a string. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
String	TokenNameIdentifier	 String
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return integer index uniquely identifying the value of this string. */	TokenNameCOMMENT_JAVADOC	 @return integer index uniquely identifying the value of this string. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Command-line unit test driver. This test relies on the fact that * this version of the pool assigns indices consecutively, starting * from zero, as new unique strings are encountered. */	TokenNameCOMMENT_JAVADOC	 Command-line unit test driver. This test relies on the fact that this version of the pool assigns indices consecutively, starting from zero, as new unique strings are encountered. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Zero"	TokenNameStringLiteral	Zero
,	TokenNameCOMMA	
"One"	TokenNameStringLiteral	One
,	TokenNameCOMMA	
"Two"	TokenNameStringLiteral	Two
,	TokenNameCOMMA	
"Three"	TokenNameStringLiteral	Three
,	TokenNameCOMMA	
"Four"	TokenNameStringLiteral	Four
,	TokenNameCOMMA	
"Five"	TokenNameStringLiteral	Five
,	TokenNameCOMMA	
"Six"	TokenNameStringLiteral	Six
,	TokenNameCOMMA	
"Seven"	TokenNameStringLiteral	Seven
,	TokenNameCOMMA	
"Eight"	TokenNameStringLiteral	Eight
,	TokenNameCOMMA	
"Nine"	TokenNameStringLiteral	Nine
,	TokenNameCOMMA	
"Ten"	TokenNameStringLiteral	Ten
,	TokenNameCOMMA	
"Eleven"	TokenNameStringLiteral	Eleven
,	TokenNameCOMMA	
"Twelve"	TokenNameStringLiteral	Twelve
,	TokenNameCOMMA	
"Thirteen"	TokenNameStringLiteral	Thirteen
,	TokenNameCOMMA	
"Fourteen"	TokenNameStringLiteral	Fourteen
,	TokenNameCOMMA	
"Fifteen"	TokenNameStringLiteral	Fifteen
,	TokenNameCOMMA	
"Sixteen"	TokenNameStringLiteral	Sixteen
,	TokenNameCOMMA	
"Seventeen"	TokenNameStringLiteral	Seventeen
,	TokenNameCOMMA	
"Eighteen"	TokenNameStringLiteral	Eighteen
,	TokenNameCOMMA	
"Nineteen"	TokenNameStringLiteral	Nineteen
,	TokenNameCOMMA	
"Twenty"	TokenNameStringLiteral	Twenty
,	TokenNameCOMMA	
"Twenty-One"	TokenNameStringLiteral	Twenty-One
,	TokenNameCOMMA	
"Twenty-Two"	TokenNameStringLiteral	Twenty-Two
,	TokenNameCOMMA	
"Twenty-Three"	TokenNameStringLiteral	Twenty-Three
,	TokenNameCOMMA	
"Twenty-Four"	TokenNameStringLiteral	Twenty-Four
,	TokenNameCOMMA	
"Twenty-Five"	TokenNameStringLiteral	Twenty-Five
,	TokenNameCOMMA	
"Twenty-Six"	TokenNameStringLiteral	Twenty-Six
,	TokenNameCOMMA	
"Twenty-Seven"	TokenNameStringLiteral	Twenty-Seven
,	TokenNameCOMMA	
"Twenty-Eight"	TokenNameStringLiteral	Twenty-Eight
,	TokenNameCOMMA	
"Twenty-Nine"	TokenNameStringLiteral	Twenty-Nine
,	TokenNameCOMMA	
"Thirty"	TokenNameStringLiteral	Thirty
,	TokenNameCOMMA	
"Thirty-One"	TokenNameStringLiteral	Thirty-One
,	TokenNameCOMMA	
"Thirty-Two"	TokenNameStringLiteral	Thirty-Two
,	TokenNameCOMMA	
"Thirty-Three"	TokenNameStringLiteral	Thirty-Three
,	TokenNameCOMMA	
"Thirty-Four"	TokenNameStringLiteral	Thirty-Four
,	TokenNameCOMMA	
"Thirty-Five"	TokenNameStringLiteral	Thirty-Five
,	TokenNameCOMMA	
"Thirty-Six"	TokenNameStringLiteral	Thirty-Six
,	TokenNameCOMMA	
"Thirty-Seven"	TokenNameStringLiteral	Thirty-Seven
,	TokenNameCOMMA	
"Thirty-Eight"	TokenNameStringLiteral	Thirty-Eight
,	TokenNameCOMMA	
"Thirty-Nine"	TokenNameStringLiteral	Thirty-Nine
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
pool	TokenNameIdentifier	 pool
=	TokenNameEQUAL	
new	TokenNamenew	
DTMSafeStringPool	TokenNameIdentifier	 DTM Safe String Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"If no complaints are printed below, we passed initial test."	TokenNameStringLiteral	If no complaints are printed below, we passed initial test.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pass	TokenNameIdentifier	 pass
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pass	TokenNameIdentifier	 pass
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
pass	TokenNameIdentifier	 pass
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
!=	TokenNameNOT_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Mismatch populating pool: assigned "	TokenNameStringLiteral	 Mismatch populating pool: assigned 
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
" for create "	TokenNameStringLiteral	 for create 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
!=	TokenNameNOT_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Mismatch in stringToIndex: returned "	TokenNameStringLiteral	 Mismatch in stringToIndex: returned 
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
" for lookup "	TokenNameStringLiteral	 for lookup 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
word	TokenNameIdentifier	 word
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Mismatch in indexToString: returned"	TokenNameStringLiteral	 Mismatch in indexToString: returned
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
" for lookup "	TokenNameStringLiteral	 for lookup 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Pass "	TokenNameStringLiteral	 Pass 
+	TokenNamePLUS	
pass	TokenNameIdentifier	 pass
+	TokenNamePLUS	
" complete "	TokenNameStringLiteral	 complete 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end pass loop 	TokenNameCOMMENT_LINE	end pass loop 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// DTMSafeStringPool 	TokenNameCOMMENT_LINE	DTMSafeStringPool 
