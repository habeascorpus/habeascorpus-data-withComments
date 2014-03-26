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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FileUtils	TokenNameIdentifier	 File Utils
;	TokenNameSEMICOLON	
/** * EnumeratedAttribute for time comparisons. Accepts values * "before", "after", "equal". * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 EnumeratedAttribute for time comparisons. Accepts values "before", "after", "equal". @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
TimeComparison	TokenNameIdentifier	 Time Comparison
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
"before"	TokenNameStringLiteral	before
,	TokenNameCOMMA	
"after"	TokenNameStringLiteral	after
,	TokenNameCOMMA	
"equal"	TokenNameStringLiteral	equal
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
FileUtils	TokenNameIdentifier	 File Utils
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
=	TokenNameEQUAL	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
getFileUtils	TokenNameIdentifier	 get File Utils
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Before Comparison. */	TokenNameCOMMENT_JAVADOC	 Before Comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TimeComparison	TokenNameIdentifier	 Time Comparison
BEFORE	TokenNameIdentifier	 BEFORE
=	TokenNameEQUAL	
new	TokenNamenew	
TimeComparison	TokenNameIdentifier	 Time Comparison
(	TokenNameLPAREN	
"before"	TokenNameStringLiteral	before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** After Comparison. */	TokenNameCOMMENT_JAVADOC	 After Comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TimeComparison	TokenNameIdentifier	 Time Comparison
AFTER	TokenNameIdentifier	 AFTER
=	TokenNameEQUAL	
new	TokenNamenew	
TimeComparison	TokenNameIdentifier	 Time Comparison
(	TokenNameLPAREN	
"after"	TokenNameStringLiteral	after
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Equal Comparison. */	TokenNameCOMMENT_JAVADOC	 Equal Comparison. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
TimeComparison	TokenNameIdentifier	 Time Comparison
EQUAL	TokenNameIdentifier	 EQUAL
=	TokenNameEQUAL	
new	TokenNamenew	
TimeComparison	TokenNameIdentifier	 Time Comparison
(	TokenNameLPAREN	
"equal"	TokenNameStringLiteral	equal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
TimeComparison	TokenNameIdentifier	 Time Comparison
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a new TimeComparison with the specified value. * @param value the EnumeratedAttribute value. */	TokenNameCOMMENT_JAVADOC	 Construct a new TimeComparison with the specified value. @param value the EnumeratedAttribute value. 
public	TokenNamepublic	
TimeComparison	TokenNameIdentifier	 Time Comparison
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
/** * Evaluate two times against this TimeComparison. * @param t1 the first time to compare. * @param t2 the second time to compare. * @return true if the comparison result fell within the parameters of this TimeComparison. */	TokenNameCOMMENT_JAVADOC	 Evaluate two times against this TimeComparison. @param t1 the first time to compare. @param t2 the second time to compare. @return true if the comparison result fell within the parameters of this TimeComparison. 
public	TokenNamepublic	
boolean	TokenNameboolean	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
long	TokenNamelong	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
long	TokenNamelong	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate two times against this TimeComparison. * @param t1 the first time to compare. * @param t2 the second time to compare. * @param g the timestamp granularity. * @return true if the comparison result fell within the parameters of this TimeComparison. */	TokenNameCOMMENT_JAVADOC	 Evaluate two times against this TimeComparison. @param t1 the first time to compare. @param t2 the second time to compare. @param g the timestamp granularity. @return true if the comparison result fell within the parameters of this TimeComparison. 
public	TokenNamepublic	
boolean	TokenNameboolean	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
long	TokenNamelong	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
long	TokenNamelong	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
long	TokenNamelong	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"TimeComparison value not set."	TokenNameStringLiteral	TimeComparison value not set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t1	TokenNameIdentifier	 t1
-	TokenNameMINUS	
g	TokenNameIdentifier	 g
<	TokenNameLESS	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t1	TokenNameIdentifier	 t1
+	TokenNamePLUS	
g	TokenNameIdentifier	 g
>	TokenNameGREATER	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
-	TokenNameMINUS	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare two times. * @param t1 the first time to compare. * @param t2 the second time to compare. * @return a negative integer, a positive integer, or zero as t1 is * before, after, or equal to t2 accounting for the default granularity. */	TokenNameCOMMENT_JAVADOC	 Compare two times. @param t1 the first time to compare. @param t2 the second time to compare. @return a negative integer, a positive integer, or zero as t1 is before, after, or equal to t2 accounting for the default granularity. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
long	TokenNamelong	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
long	TokenNamelong	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
FILE_UTILS	TokenNameIdentifier	 FILE  UTILS
.	TokenNameDOT	
getFileTimestampGranularity	TokenNameIdentifier	 get File Timestamp Granularity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare two times. * @param t1 the first time to compare. * @param t2 the second time to compare. * @param g the timestamp granularity. * @return a negative integer, a positive integer, or zero as t1 is * before, after, or equal to t2 accounting for the specified granularity. */	TokenNameCOMMENT_JAVADOC	 Compare two times. @param t1 the first time to compare. @param t2 the second time to compare. @param g the timestamp granularity. @return a negative integer, a positive integer, or zero as t1 is before, after, or equal to t2 accounting for the specified granularity. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
long	TokenNamelong	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
long	TokenNamelong	
t2	TokenNameIdentifier	 t2
,	TokenNameCOMMA	
long	TokenNamelong	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
-	TokenNameMINUS	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
long	TokenNamelong	
abs	TokenNameIdentifier	 abs
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
abs	TokenNameIdentifier	 abs
>	TokenNameGREATER	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
/	TokenNameDIVIDE	
abs	TokenNameIdentifier	 abs
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
