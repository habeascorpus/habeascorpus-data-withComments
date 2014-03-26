/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMStringPool.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMStringPool.java 468653 2006-10-28 07:07:05Z minchau $ 
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
IntVector	TokenNameIdentifier	 Int Vector
;	TokenNameSEMICOLON	
/** <p>DTMStringPool is an "interning" mechanism for strings. It will * create a stable 1:1 mapping between a set of string values and a set of * integer index values, so the integers can be used to reliably and * uniquely identify (and when necessary retrieve) the strings.</p> * * <p>Design Priorities: * <ul> * <li>String-to-index lookup speed is critical.</li> * <li>Index-to-String lookup speed is slightly less so.</li> * <li>Threadsafety is not guaranteed at this level. * Enforce that in the application if needed.</li> * <li>Storage efficiency is an issue but not a huge one. * It is expected that string pools won't exceed about 2000 entries.</li> * </ul> * </p> * * <p>Implementation detail: A standard Hashtable is relatively * inefficient when looking up primitive int values, especially when * we're already maintaining an int-to-string vector. So I'm * maintaining a simple hash chain within this class.</p> * * <p>NOTE: There is nothing in the code that has a real dependency upon * String. It would work with any object type that implements reliable * .hashCode() and .equals() operations. The API enforces Strings because * it's safer that way, but this could trivially be turned into a general * ObjectPool if one was needed.</p> * * <p>Status: Passed basic test in main().</p> * */	TokenNameCOMMENT_JAVADOC	 <p>DTMStringPool is an "interning" mechanism for strings. It will create a stable 1:1 mapping between a set of string values and a set of integer index values, so the integers can be used to reliably and uniquely identify (and when necessary retrieve) the strings.</p> * <p>Design Priorities: <ul> <li>String-to-index lookup speed is critical.</li> <li>Index-to-String lookup speed is slightly less so.</li> <li>Threadsafety is not guaranteed at this level. Enforce that in the application if needed.</li> <li>Storage efficiency is an issue but not a huge one. It is expected that string pools won't exceed about 2000 entries.</li> </ul> </p> * <p>Implementation detail: A standard Hashtable is relatively inefficient when looking up primitive int values, especially when we're already maintaining an int-to-string vector. So I'm maintaining a simple hash chain within this class.</p> * <p>NOTE: There is nothing in the code that has a real dependency upon String. It would work with any object type that implements reliable .hashCode() and .equals() operations. The API enforces Strings because it's safer that way, but this could trivially be turned into a general ObjectPool if one was needed.</p> * <p>Status: Passed basic test in main().</p> 
public	TokenNamepublic	
class	TokenNameclass	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
m_intToString	TokenNameIdentifier	 m int To String
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HASHPRIME	TokenNameIdentifier	 HASHPRIME
=	TokenNameEQUAL	
101	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_hashStart	TokenNameIdentifier	 m hash Start
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
HASHPRIME	TokenNameIdentifier	 HASHPRIME
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
IntVector	TokenNameIdentifier	 Int Vector
m_hashChain	TokenNameIdentifier	 m hash Chain
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NULL	TokenNameIdentifier	 NULL
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Create a DTMStringPool using the given chain size * * @param chainSize The size of the hash chain vector */	TokenNameCOMMENT_JAVADOC	 Create a DTMStringPool using the given chain size * @param chainSize The size of the hash chain vector 
public	TokenNamepublic	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
(	TokenNameLPAREN	
int	TokenNameint	
chainSize	TokenNameIdentifier	 chain Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_intToString	TokenNameIdentifier	 m int To String
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_hashChain	TokenNameIdentifier	 m hash Chain
=	TokenNameEQUAL	
new	TokenNamenew	
IntVector	TokenNameIdentifier	 Int Vector
(	TokenNameLPAREN	
chainSize	TokenNameIdentifier	 chain Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -sb Add this to force empty strings to be index 0. 	TokenNameCOMMENT_LINE	-sb Add this to force empty strings to be index 0. 
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DTMStringPool	TokenNameIdentifier	 DTM String Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
512	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_intToString	TokenNameIdentifier	 m int To String
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
HASHPRIME	TokenNameIdentifier	 HASHPRIME
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
m_hashStart	TokenNameIdentifier	 m hash Start
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_hashChain	TokenNameIdentifier	 m hash Chain
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return string whose value is uniquely identified by this integer index. * @throws java.lang.ArrayIndexOutOfBoundsException * if index doesn't map to a string. * */	TokenNameCOMMENT_JAVADOC	 @return string whose value is uniquely identified by this integer index. @throws java.lang.ArrayIndexOutOfBoundsException if index doesn't map to a string. 
public	TokenNamepublic	
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
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_intToString	TokenNameIdentifier	 m int To String
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return integer index uniquely identifying the value of this string. */	TokenNameCOMMENT_JAVADOC	 @return integer index uniquely identifying the value of this string. 
public	TokenNamepublic	
int	TokenNameint	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
hashslot	TokenNameIdentifier	 hashslot
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
HASHPRIME	TokenNameIdentifier	 HASHPRIME
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hashslot	TokenNameIdentifier	 hashslot
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hashslot	TokenNameIdentifier	 hashslot
=	TokenNameEQUAL	
-	TokenNameMINUS	
hashslot	TokenNameIdentifier	 hashslot
;	TokenNameSEMICOLON	
// Is it one we already know? 	TokenNameCOMMENT_LINE	Is it one we already know? 
int	TokenNameint	
hashlast	TokenNameIdentifier	 hashlast
=	TokenNameEQUAL	
m_hashStart	TokenNameIdentifier	 m hash Start
[	TokenNameLBRACKET	
hashslot	TokenNameIdentifier	 hashslot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
hashcandidate	TokenNameIdentifier	 hashcandidate
=	TokenNameEQUAL	
hashlast	TokenNameIdentifier	 hashlast
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
hashcandidate	TokenNameIdentifier	 hashcandidate
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_intToString	TokenNameIdentifier	 m int To String
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
hashcandidate	TokenNameIdentifier	 hashcandidate
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
hashcandidate	TokenNameIdentifier	 hashcandidate
;	TokenNameSEMICOLON	
hashlast	TokenNameIdentifier	 hashlast
=	TokenNameEQUAL	
hashcandidate	TokenNameIdentifier	 hashcandidate
;	TokenNameSEMICOLON	
hashcandidate	TokenNameIdentifier	 hashcandidate
=	TokenNameEQUAL	
m_hashChain	TokenNameIdentifier	 m hash Chain
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
hashcandidate	TokenNameIdentifier	 hashcandidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// New value. Add to tables. 	TokenNameCOMMENT_LINE	New value. Add to tables. 
int	TokenNameint	
newIndex	TokenNameIdentifier	 new Index
=	TokenNameEQUAL	
m_intToString	TokenNameIdentifier	 m int To String
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_intToString	TokenNameIdentifier	 m int To String
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_hashChain	TokenNameIdentifier	 m hash Chain
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Initialize to no-following-same-hash 	TokenNameCOMMENT_LINE	Initialize to no-following-same-hash 
if	TokenNameif	
(	TokenNameLPAREN	
hashlast	TokenNameIdentifier	 hashlast
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
// First for this hash 	TokenNameCOMMENT_LINE	First for this hash 
m_hashStart	TokenNameIdentifier	 m hash Start
[	TokenNameLBRACKET	
hashslot	TokenNameIdentifier	 hashslot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newIndex	TokenNameIdentifier	 new Index
;	TokenNameSEMICOLON	
else	TokenNameelse	
// Link from previous with same hash 	TokenNameCOMMENT_LINE	Link from previous with same hash 
m_hashChain	TokenNameIdentifier	 m hash Chain
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
newIndex	TokenNameIdentifier	 new Index
,	TokenNameCOMMA	
hashlast	TokenNameIdentifier	 hashlast
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newIndex	TokenNameIdentifier	 new Index
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
DTMStringPool	TokenNameIdentifier	 DTM String Pool
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
