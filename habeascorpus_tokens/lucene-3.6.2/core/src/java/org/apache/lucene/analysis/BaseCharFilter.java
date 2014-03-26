/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
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
ArrayUtil	TokenNameIdentifier	 Array Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * <p> * Base utility class for implementing a {@link CharFilter}. * You subclass this, and then record mappings by calling * {@link #addOffCorrectMap}, and then invoke the correct * method to correct an offset. * </p> + <p> + CharFilters modify an input stream via a series of substring + replacements (including deletions and insertions) to produce an output + stream. There are three possible replacement cases: the replacement + string has the same length as the original substring; the replacement + is shorter; and the replacement is longer. In the latter two cases + (when the replacement has a different length than the original), + one or more offset correction mappings are required. + </p> + <p> + When the replacement is shorter than the original (e.g. when the + replacement is the empty string), a single offset correction mapping + should be added at the replacement's end offset in the output stream. + The <code>cumulativeDiff</code> parameter to the + <code>addOffCorrectMapping()</code> method will be the sum of all + previous replacement offset adjustments, with the addition of the + difference between the lengths of the original substring and the + replacement string (a positive value). + </p> + <p> + When the replacement is longer than the original (e.g. when the + original is the empty string), you should add as many offset + correction mappings as the difference between the lengths of the + replacement string and the original substring, starting at the + end offset the original substring would have had in the output stream. + The <code>cumulativeDiff</code> parameter to the + <code>addOffCorrectMapping()</code> method will be the sum of all + previous replacement offset adjustments, with the addition of the + difference between the lengths of the original substring and the + replacement string so far (a negative value). + </p> */	TokenNameCOMMENT_JAVADOC	 <p> Base utility class for implementing a {@link CharFilter}. You subclass this, and then record mappings by calling {@link #addOffCorrectMap}, and then invoke the correct method to correct an offset. </p> + <p> + CharFilters modify an input stream via a series of substring + replacements (including deletions and insertions) to produce an output + stream. There are three possible replacement cases: the replacement + string has the same length as the original substring; the replacement + is shorter; and the replacement is longer. In the latter two cases + (when the replacement has a different length than the original), + one or more offset correction mappings are required. + </p> + <p> + When the replacement is shorter than the original (e.g. when the + replacement is the empty string), a single offset correction mapping + should be added at the replacement's end offset in the output stream. + The <code>cumulativeDiff</code> parameter to the + <code>addOffCorrectMapping()</code> method will be the sum of all + previous replacement offset adjustments, with the addition of the + difference between the lengths of the original substring and the + replacement string (a positive value). + </p> + <p> + When the replacement is longer than the original (e.g. when the + original is the empty string), you should add as many offset + correction mappings as the difference between the lengths of the + replacement string and the original substring, starting at the + end offset the original substring would have had in the output stream. + The <code>cumulativeDiff</code> parameter to the + <code>addOffCorrectMapping()</code> method will be the sum of all + previous replacement offset adjustments, with the addition of the + difference between the lengths of the original substring and the + replacement string so far (a negative value). + </p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BaseCharFilter	TokenNameIdentifier	 Base Char Filter
extends	TokenNameextends	
CharFilter	TokenNameIdentifier	 Char Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
diffs	TokenNameIdentifier	 diffs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BaseCharFilter	TokenNameIdentifier	 Base Char Filter
(	TokenNameLPAREN	
CharStream	TokenNameIdentifier	 Char Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieve the corrected offset. */	TokenNameCOMMENT_JAVADOC	 Retrieve the corrected offset. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
correct	TokenNameIdentifier	 correct
(	TokenNameLPAREN	
int	TokenNameint	
currentOff	TokenNameIdentifier	 current Off
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
currentOff	TokenNameIdentifier	 current Off
<	TokenNameLESS	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentOff	TokenNameIdentifier	 current Off
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentOff	TokenNameIdentifier	 current Off
>=	TokenNameGREATER_EQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
currentOff	TokenNameIdentifier	 current Off
+	TokenNamePLUS	
diffs	TokenNameIdentifier	 diffs
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
>=	TokenNameGREATER_EQUAL	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentOff	TokenNameIdentifier	 current Off
<	TokenNameLESS	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currentOff	TokenNameIdentifier	 current Off
>	TokenNameGREATER	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
currentOff	TokenNameIdentifier	 current Off
+	TokenNamePLUS	
diffs	TokenNameIdentifier	 diffs
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentOff	TokenNameIdentifier	 current Off
<	TokenNameLESS	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
currentOff	TokenNameIdentifier	 current Off
:	TokenNameCOLON	
currentOff	TokenNameIdentifier	 current Off
+	TokenNamePLUS	
diffs	TokenNameIdentifier	 diffs
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
currentOff	TokenNameIdentifier	 current Off
+	TokenNamePLUS	
diffs	TokenNameIdentifier	 diffs
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
int	TokenNameint	
getLastCumulativeDiff	TokenNameIdentifier	 get Last Cumulative Diff
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offsets	TokenNameIdentifier	 offsets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
diffs	TokenNameIdentifier	 diffs
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p> * Adds an offset correction mapping at the given output stream offset. * </p> * <p> * Assumption: the offset given with each successive call to this method * will not be smaller than the offset given at the previous invocation. * </p> * * @param off The output stream offset at which to apply the correction * @param cumulativeDiff The input offset is given by adding this * to the output offset */	TokenNameCOMMENT_JAVADOC	 <p> Adds an offset correction mapping at the given output stream offset. </p> <p> Assumption: the offset given with each successive call to this method will not be smaller than the offset given at the previous invocation. </p> * @param off The output stream offset at which to apply the correction @param cumulativeDiff The input offset is given by adding this to the output offset 
protected	TokenNameprotected	
void	TokenNamevoid	
addOffCorrectMap	TokenNameIdentifier	 add Off Correct Map
(	TokenNameLPAREN	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
cumulativeDiff	TokenNameIdentifier	 cumulative Diff
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
64	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
diffs	TokenNameIdentifier	 diffs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
64	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
diffs	TokenNameIdentifier	 diffs
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
diffs	TokenNameIdentifier	 diffs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
off	TokenNameIdentifier	 off
>=	TokenNameGREATER_EQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"Offset #"	TokenNameStringLiteral	Offset #
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
") is less than the last recorded offset "	TokenNameStringLiteral	) is less than the last recorded offset 
+	TokenNamePLUS	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
diffs	TokenNameIdentifier	 diffs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
off	TokenNameIdentifier	 off
!=	TokenNameNOT_EQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
diffs	TokenNameIdentifier	 diffs
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cumulativeDiff	TokenNameIdentifier	 cumulative Diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Overwrite the diff at the last recorded offset 	TokenNameCOMMENT_LINE	Overwrite the diff at the last recorded offset 
diffs	TokenNameIdentifier	 diffs
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cumulativeDiff	TokenNameIdentifier	 cumulative Diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
