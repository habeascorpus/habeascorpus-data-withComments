/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * EnumeratedAttribute for generic comparisons. Accepts values * "equal", "greater", "more", "less", "ne" (not equal), * "ge" (greater or equal), "le" (less or equal), "eq" (equal), * "gt" (greater), "lt" (less). * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 EnumeratedAttribute for generic comparisons. Accepts values "equal", "greater", "more", "less", "ne" (not equal), "ge" (greater or equal), "le" (less or equal), "eq" (equal), "gt" (greater), "lt" (less). @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Comparison	TokenNameIdentifier	 Comparison
extends	TokenNameextends	
EnumeratedAttribute	TokenNameIdentifier	 Enumerated Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
VALUES	TokenNameIdentifier	 VALUES
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"equal"	TokenNameStringLiteral	equal
,	TokenNameCOMMA	
"greater"	TokenNameStringLiteral	greater
,	TokenNameCOMMA	
"less"	TokenNameStringLiteral	less
,	TokenNameCOMMA	
"ne"	TokenNameStringLiteral	ne
,	TokenNameCOMMA	
"ge"	TokenNameStringLiteral	ge
,	TokenNameCOMMA	
"le"	TokenNameStringLiteral	le
,	TokenNameCOMMA	
"eq"	TokenNameStringLiteral	eq
,	TokenNameCOMMA	
"gt"	TokenNameStringLiteral	gt
,	TokenNameCOMMA	
"lt"	TokenNameStringLiteral	lt
,	TokenNameCOMMA	
"more"	TokenNameStringLiteral	more
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Equal Comparison. */	TokenNameCOMMENT_JAVADOC	 Equal Comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparison	TokenNameIdentifier	 Comparison
EQUAL	TokenNameIdentifier	 EQUAL
=	TokenNameEQUAL	
new	TokenNamenew	
Comparison	TokenNameIdentifier	 Comparison
(	TokenNameLPAREN	
"equal"	TokenNameStringLiteral	equal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Not-Equal Comparison. */	TokenNameCOMMENT_JAVADOC	 Not-Equal Comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparison	TokenNameIdentifier	 Comparison
NOT_EQUAL	TokenNameIdentifier	 NOT  EQUAL
=	TokenNameEQUAL	
new	TokenNamenew	
Comparison	TokenNameIdentifier	 Comparison
(	TokenNameLPAREN	
"ne"	TokenNameStringLiteral	ne
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Greater Comparison. */	TokenNameCOMMENT_JAVADOC	 Greater Comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparison	TokenNameIdentifier	 Comparison
GREATER	TokenNameIdentifier	 GREATER
=	TokenNameEQUAL	
new	TokenNamenew	
Comparison	TokenNameIdentifier	 Comparison
(	TokenNameLPAREN	
"greater"	TokenNameStringLiteral	greater
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Less Comparison. */	TokenNameCOMMENT_JAVADOC	 Less Comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparison	TokenNameIdentifier	 Comparison
LESS	TokenNameIdentifier	 LESS
=	TokenNameEQUAL	
new	TokenNamenew	
Comparison	TokenNameIdentifier	 Comparison
(	TokenNameLPAREN	
"less"	TokenNameStringLiteral	less
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Greater-or-Equal Comparison. */	TokenNameCOMMENT_JAVADOC	 Greater-or-Equal Comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparison	TokenNameIdentifier	 Comparison
GREATER_EQUAL	TokenNameIdentifier	 GREATER  EQUAL
=	TokenNameEQUAL	
new	TokenNamenew	
Comparison	TokenNameIdentifier	 Comparison
(	TokenNameLPAREN	
"ge"	TokenNameStringLiteral	ge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Less-or-Equal Comparison. */	TokenNameCOMMENT_JAVADOC	 Less-or-Equal Comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparison	TokenNameIdentifier	 Comparison
LESS_EQUAL	TokenNameIdentifier	 LESS  EQUAL
=	TokenNameEQUAL	
new	TokenNamenew	
Comparison	TokenNameIdentifier	 Comparison
(	TokenNameLPAREN	
"le"	TokenNameStringLiteral	le
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EQUAL_INDEX	TokenNameIdentifier	 EQUAL  INDEX
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
LESS_INDEX	TokenNameIdentifier	 LESS  INDEX
=	TokenNameEQUAL	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
GREATER_INDEX	TokenNameIdentifier	 GREATER  INDEX
=	TokenNameEQUAL	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
Comparison	TokenNameIdentifier	 Comparison
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a new Comparison with the specified value. * @param value the EnumeratedAttribute value. */	TokenNameCOMMENT_JAVADOC	 Construct a new Comparison with the specified value. @param value the EnumeratedAttribute value. 
public	TokenNamepublic	
Comparison	TokenNameIdentifier	 Comparison
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the possible values. * @return String[] of EnumeratedAttribute values. */	TokenNameCOMMENT_JAVADOC	 Return the possible values. @return String[] of EnumeratedAttribute values. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
VALUES	TokenNameIdentifier	 VALUES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate a comparison result as from Comparator.compare() or Comparable.compareTo(). * @param comparisonResult the result to evaluate. * @return true if the comparison result fell within the parameters of this Comparison. */	TokenNameCOMMENT_JAVADOC	 Evaluate a comparison result as from Comparator.compare() or Comparable.compareTo(). @param comparisonResult the result to evaluate. @return true if the comparison result fell within the parameters of this Comparison. 
public	TokenNamepublic	
boolean	TokenNameboolean	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
int	TokenNameint	
comparisonResult	TokenNameIdentifier	 comparison Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Comparison value not set."	TokenNameStringLiteral	Comparison value not set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
comparisonResult	TokenNameIdentifier	 comparison Result
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
LESS_INDEX	TokenNameIdentifier	 LESS  INDEX
:	TokenNameCOLON	
comparisonResult	TokenNameIdentifier	 comparison Result
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
GREATER_INDEX	TokenNameIdentifier	 GREATER  INDEX
:	TokenNameCOLON	
EQUAL_INDEX	TokenNameIdentifier	 EQUAL  INDEX
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
