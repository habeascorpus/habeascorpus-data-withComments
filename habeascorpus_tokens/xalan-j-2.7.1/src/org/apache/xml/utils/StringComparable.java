/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StringComparable.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StringComparable.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
RuleBasedCollator	TokenNameIdentifier	 Rule Based Collator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CollationElementIterator	TokenNameIdentifier	 Collation Element Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CollationKey	TokenNameIdentifier	 Collation Key
;	TokenNameSEMICOLON	
/** * International friendly string comparison with case-order * @author Igor Hersht, igorh@ca.ibm.com */	TokenNameCOMMENT_JAVADOC	 International friendly string comparison with case-order @author Igor Hersht, igorh@ca.ibm.com 
public	TokenNamepublic	
class	TokenNameclass	
StringComparable	TokenNameIdentifier	 String Comparable
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
UNKNOWN_CASE	TokenNameIdentifier	 UNKNOWN  CASE
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
UPPER_CASE	TokenNameIdentifier	 UPPER  CASE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
LOWER_CASE	TokenNameIdentifier	 LOWER  CASE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_text	TokenNameIdentifier	 m text
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Locale	TokenNameIdentifier	 Locale
m_locale	TokenNameIdentifier	 m locale
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RuleBasedCollator	TokenNameIdentifier	 Rule Based Collator
m_collator	TokenNameIdentifier	 m collator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_caseOrder	TokenNameIdentifier	 m case Order
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
m_mask	TokenNameIdentifier	 m mask
=	TokenNameEQUAL	
0xFFFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StringComparable	TokenNameIdentifier	 String Comparable
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
final	TokenNamefinal	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
final	TokenNamefinal	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
caseOrder	TokenNameIdentifier	 case Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_text	TokenNameIdentifier	 m text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
m_locale	TokenNameIdentifier	 m locale
=	TokenNameEQUAL	
locale	TokenNameIdentifier	 locale
;	TokenNameSEMICOLON	
m_collator	TokenNameIdentifier	 m collator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RuleBasedCollator	TokenNameIdentifier	 Rule Based Collator
)	TokenNameRPAREN	
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
m_caseOrder	TokenNameIdentifier	 m case Order
=	TokenNameEQUAL	
caseOrder	TokenNameIdentifier	 case Order
;	TokenNameSEMICOLON	
m_mask	TokenNameIdentifier	 m mask
=	TokenNameEQUAL	
getMask	TokenNameIdentifier	 get Mask
(	TokenNameLPAREN	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
getStrength	TokenNameIdentifier	 get Strength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Comparable	TokenNameIdentifier	 Comparable
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
final	TokenNamefinal	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
final	TokenNamefinal	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
caseOrder	TokenNameIdentifier	 case Order
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
caseOrder	TokenNameIdentifier	 case Order
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
caseOrder	TokenNameIdentifier	 case Order
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no case-order specified 	TokenNameCOMMENT_LINE	no case-order specified 
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RuleBasedCollator	TokenNameIdentifier	 Rule Based Collator
)	TokenNameRPAREN	
collator	TokenNameIdentifier	 collator
)	TokenNameRPAREN	
.	TokenNameDOT	
getCollationKey	TokenNameIdentifier	 get Collation Key
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringComparable	TokenNameIdentifier	 String Comparable
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
collator	TokenNameIdentifier	 collator
,	TokenNameCOMMA	
caseOrder	TokenNameIdentifier	 case Order
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_text	TokenNameIdentifier	 m text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StringComparable	TokenNameIdentifier	 String Comparable
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_text	TokenNameIdentifier	 m text
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Code-point equals 	TokenNameCOMMENT_LINE	Code-point equals 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
savedStrength	TokenNameIdentifier	 saved Strength
=	TokenNameEQUAL	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
getStrength	TokenNameIdentifier	 get Strength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Is there difference more significant than case-order? 	TokenNameCOMMENT_LINE	Is there difference more significant than case-order? 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
savedStrength	TokenNameIdentifier	 saved Strength
==	TokenNameEQUAL_EQUAL	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
PRIMARY	TokenNameIdentifier	 PRIMARY
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
savedStrength	TokenNameIdentifier	 saved Strength
==	TokenNameEQUAL_EQUAL	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
SECONDARY	TokenNameIdentifier	 SECONDARY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
m_text	TokenNameIdentifier	 m text
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// more than SECONDARY 	TokenNameCOMMENT_LINE	more than SECONDARY 
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
setStrength	TokenNameIdentifier	 set Strength
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
SECONDARY	TokenNameIdentifier	 SECONDARY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
m_text	TokenNameIdentifier	 m text
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
setStrength	TokenNameIdentifier	 set Strength
(	TokenNameLPAREN	
savedStrength	TokenNameIdentifier	 saved Strength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Difference more significant than case-order 	TokenNameCOMMENT_LINE	Difference more significant than case-order 
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// No difference more significant than case-order. 	TokenNameCOMMENT_LINE	No difference more significant than case-order. 
// Find case difference 	TokenNameCOMMENT_LINE	Find case difference 
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
getCaseDiff	TokenNameIdentifier	 get Case Diff
(	TokenNameLPAREN	
m_text	TokenNameIdentifier	 m text
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// No case differences. Less significant difference could exist 	TokenNameCOMMENT_LINE	No case differences. Less significant difference could exist 
return	TokenNamereturn	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
m_text	TokenNameIdentifier	 m text
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
getCaseDiff	TokenNameIdentifier	 get Case Diff
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
savedStrength	TokenNameIdentifier	 saved Strength
=	TokenNameEQUAL	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
getStrength	TokenNameIdentifier	 get Strength
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
savedDecomposition	TokenNameIdentifier	 saved Decomposition
=	TokenNameEQUAL	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
getDecomposition	TokenNameIdentifier	 get Decomposition
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
setStrength	TokenNameIdentifier	 set Strength
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
TERTIARY	TokenNameIdentifier	 TERTIARY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// not to ignore case 	TokenNameCOMMENT_LINE	not to ignore case 
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
setDecomposition	TokenNameIdentifier	 set Decomposition
(	TokenNameLPAREN	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
CANONICAL_DECOMPOSITION	TokenNameIdentifier	 CANONICAL  DECOMPOSITION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// corresponds NDF 	TokenNameCOMMENT_LINE	corresponds NDF 
final	TokenNamefinal	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getFirstCaseDiff	TokenNameIdentifier	 get First Case Diff
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
m_locale	TokenNameIdentifier	 m locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
setStrength	TokenNameIdentifier	 set Strength
(	TokenNameLPAREN	
savedStrength	TokenNameIdentifier	 saved Strength
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// restore 	TokenNameCOMMENT_LINE	restore 
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
setDecomposition	TokenNameIdentifier	 set Decomposition
(	TokenNameLPAREN	
savedDecomposition	TokenNameIdentifier	 saved Decomposition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//restore 	TokenNameCOMMENT_LINE	restore 
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_caseOrder	TokenNameIdentifier	 m case Order
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"upper-first"	TokenNameStringLiteral	upper-first
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
UPPER_CASE	TokenNameIdentifier	 UPPER  CASE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// lower-first 	TokenNameCOMMENT_LINE	lower-first 
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
LOWER_CASE	TokenNameIdentifier	 LOWER  CASE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// No case differences 	TokenNameCOMMENT_LINE	No case differences 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFirstCaseDiff	TokenNameIdentifier	 get First Case Diff
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
final	TokenNamefinal	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
CollationElementIterator	TokenNameIdentifier	 Collation Element Iterator
targIter	TokenNameIdentifier	 targ Iter
=	TokenNameEQUAL	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
getCollationElementIterator	TokenNameIdentifier	 get Collation Element Iterator
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CollationElementIterator	TokenNameIdentifier	 Collation Element Iterator
patIter	TokenNameIdentifier	 pat Iter
=	TokenNameEQUAL	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
getCollationElementIterator	TokenNameIdentifier	 get Collation Element Iterator
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startTarg	TokenNameIdentifier	 start Targ
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
endTarg	TokenNameIdentifier	 end Targ
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startPatt	TokenNameIdentifier	 start Patt
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
endPatt	TokenNameIdentifier	 end Patt
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
CollationElementIterator	TokenNameIdentifier	 Collation Element Iterator
.	TokenNameDOT	
NULLORDER	TokenNameIdentifier	 NULLORDER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
patternElement	TokenNameIdentifier	 pattern Element
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
targetElement	TokenNameIdentifier	 target Element
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
getPattern	TokenNameIdentifier	 get Pattern
=	TokenNameEQUAL	
true	TokenNametrue	
,	TokenNameCOMMA	
getTarget	TokenNameIdentifier	 get Target
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPattern	TokenNameIdentifier	 get Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startPatt	TokenNameIdentifier	 start Patt
=	TokenNameEQUAL	
patIter	TokenNameIdentifier	 pat Iter
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
patternElement	TokenNameIdentifier	 pattern Element
=	TokenNameEQUAL	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
patIter	TokenNameIdentifier	 pat Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endPatt	TokenNameIdentifier	 end Patt
=	TokenNameEQUAL	
patIter	TokenNameIdentifier	 pat Iter
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
getTarget	TokenNameIdentifier	 get Target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startTarg	TokenNameIdentifier	 start Targ
=	TokenNameEQUAL	
targIter	TokenNameIdentifier	 targ Iter
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
targetElement	TokenNameIdentifier	 target Element
=	TokenNameEQUAL	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
targIter	TokenNameIdentifier	 targ Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endTarg	TokenNameIdentifier	 end Targ
=	TokenNameEQUAL	
targIter	TokenNameIdentifier	 targ Iter
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getTarget	TokenNameIdentifier	 get Target
=	TokenNameEQUAL	
getPattern	TokenNameIdentifier	 get Pattern
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
patternElement	TokenNameIdentifier	 pattern Element
==	TokenNameEQUAL_EQUAL	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
targetElement	TokenNameIdentifier	 target Element
==	TokenNameEQUAL_EQUAL	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
targetElement	TokenNameIdentifier	 target Element
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getPattern	TokenNameIdentifier	 get Pattern
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
patternElement	TokenNameIdentifier	 pattern Element
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getTarget	TokenNameIdentifier	 get Target
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
targetElement	TokenNameIdentifier	 target Element
!=	TokenNameNOT_EQUAL	
patternElement	TokenNameIdentifier	 pattern Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// mismatch 	TokenNameCOMMENT_LINE	mismatch 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
startPatt	TokenNameIdentifier	 start Patt
<	TokenNameLESS	
endPatt	TokenNameIdentifier	 end Patt
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
startTarg	TokenNameIdentifier	 start Targ
<	TokenNameLESS	
endTarg	TokenNameIdentifier	 end Targ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
subText	TokenNameIdentifier	 sub Text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startTarg	TokenNameIdentifier	 start Targ
,	TokenNameCOMMA	
endTarg	TokenNameIdentifier	 end Targ
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
subPatt	TokenNameIdentifier	 sub Patt
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
startPatt	TokenNameIdentifier	 start Patt
,	TokenNameCOMMA	
endPatt	TokenNameIdentifier	 end Patt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
subTextUp	TokenNameIdentifier	 sub Text Up
=	TokenNameEQUAL	
subText	TokenNameIdentifier	 sub Text
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
subPattUp	TokenNameIdentifier	 sub Patt Up
=	TokenNameEQUAL	
subPatt	TokenNameIdentifier	 sub Patt
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
subTextUp	TokenNameIdentifier	 sub Text Up
,	TokenNameCOMMA	
subPattUp	TokenNameIdentifier	 sub Patt Up
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not case diffference 	TokenNameCOMMENT_LINE	not case diffference 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
UNKNOWN_CASE	TokenNameIdentifier	 UNKNOWN  CASE
,	TokenNameCOMMA	
UNKNOWN_CASE	TokenNameIdentifier	 UNKNOWN  CASE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
subText	TokenNameIdentifier	 sub Text
,	TokenNameCOMMA	
subTextUp	TokenNameIdentifier	 sub Text Up
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
UPPER_CASE	TokenNameIdentifier	 UPPER  CASE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
subText	TokenNameIdentifier	 sub Text
,	TokenNameCOMMA	
subText	TokenNameIdentifier	 sub Text
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
LOWER_CASE	TokenNameIdentifier	 LOWER  CASE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
subPatt	TokenNameIdentifier	 sub Patt
,	TokenNameCOMMA	
subPattUp	TokenNameIdentifier	 sub Patt Up
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
UPPER_CASE	TokenNameIdentifier	 UPPER  CASE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_collator	TokenNameIdentifier	 m collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
subPatt	TokenNameIdentifier	 sub Patt
,	TokenNameCOMMA	
subPatt	TokenNameIdentifier	 sub Patt
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
LOWER_CASE	TokenNameIdentifier	 LOWER  CASE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
UPPER_CASE	TokenNameIdentifier	 UPPER  CASE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
LOWER_CASE	TokenNameIdentifier	 LOWER  CASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
LOWER_CASE	TokenNameIdentifier	 LOWER  CASE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
UPPER_CASE	TokenNameIdentifier	 UPPER  CASE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// not case diff 	TokenNameCOMMENT_LINE	not case diff 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Return a mask for the part of the order we're interested in 	TokenNameCOMMENT_LINE	Return a mask for the part of the order we're interested in 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
getMask	TokenNameIdentifier	 get Mask
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
strength	TokenNameIdentifier	 strength
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
strength	TokenNameIdentifier	 strength
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
PRIMARY	TokenNameIdentifier	 PRIMARY
:	TokenNameCOLON	
return	TokenNamereturn	
0xFFFF0000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
SECONDARY	TokenNameIdentifier	 SECONDARY
:	TokenNameCOLON	
return	TokenNamereturn	
0xFFFFFF00	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
0xFFFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//get collation element with given strength 	TokenNameCOMMENT_LINE	get collation element with given strength 
// from the element with max strength 	TokenNameCOMMENT_LINE	from the element with max strength 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
int	TokenNameint	
maxStrengthElement	TokenNameIdentifier	 max Strength Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
maxStrengthElement	TokenNameIdentifier	 max Strength Element
&	TokenNameAND	
m_mask	TokenNameIdentifier	 m mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//StringComparable 	TokenNameCOMMENT_LINE	StringComparable 
