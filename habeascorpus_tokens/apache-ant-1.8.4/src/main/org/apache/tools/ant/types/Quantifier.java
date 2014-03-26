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
/** * EnumeratedAttribute for quantifier comparisons. Evaluates a * <code>boolean[]</code> or raw <code>true</code> and <code>false</code> * counts. Accepts the following values:<ul> * <li>"all"</li> - none <code>false</code> * <li>"each"</li> - none <code>false</code> * <li>"every"</li> - none <code>false</code> * <li>"any"</li> - at least one <code>true</code> * <li>"some"</li> - at least one <code>true</code> * <li>"one"</li> - exactly one <code>true</code> * <li>"majority"</li> - more <code>true</code> than <code>false</code> * <li>"most"</li> - more <code>true</code> than <code>false</code> * <li>"none"</li> - none <code>true</code> * </ul> * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 EnumeratedAttribute for quantifier comparisons. Evaluates a <code>boolean[]</code> or raw <code>true</code> and <code>false</code> counts. Accepts the following values:<ul> <li>"all"</li> - none <code>false</code> <li>"each"</li> - none <code>false</code> <li>"every"</li> - none <code>false</code> <li>"any"</li> - at least one <code>true</code> <li>"some"</li> - at least one <code>true</code> <li>"one"</li> - exactly one <code>true</code> <li>"majority"</li> - more <code>true</code> than <code>false</code> <li>"most"</li> - more <code>true</code> than <code>false</code> <li>"none"</li> - none <code>true</code> </ul> @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Quantifier	TokenNameIdentifier	 Quantifier
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
"all"	TokenNameStringLiteral	all
,	TokenNameCOMMA	
"each"	TokenNameStringLiteral	each
,	TokenNameCOMMA	
"every"	TokenNameStringLiteral	every
,	TokenNameCOMMA	
"any"	TokenNameStringLiteral	any
,	TokenNameCOMMA	
"some"	TokenNameStringLiteral	some
,	TokenNameCOMMA	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"majority"	TokenNameStringLiteral	majority
,	TokenNameCOMMA	
"most"	TokenNameStringLiteral	most
,	TokenNameCOMMA	
"none"	TokenNameStringLiteral	none
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** ALL instance */	TokenNameCOMMENT_JAVADOC	 ALL instance 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Quantifier	TokenNameIdentifier	 Quantifier
ALL	TokenNameIdentifier	 ALL
=	TokenNameEQUAL	
new	TokenNamenew	
Quantifier	TokenNameIdentifier	 Quantifier
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** ANY instance */	TokenNameCOMMENT_JAVADOC	 ANY instance 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Quantifier	TokenNameIdentifier	 Quantifier
ANY	TokenNameIdentifier	 ANY
=	TokenNameEQUAL	
new	TokenNamenew	
Quantifier	TokenNameIdentifier	 Quantifier
(	TokenNameLPAREN	
"any"	TokenNameStringLiteral	any
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** ONE instance */	TokenNameCOMMENT_JAVADOC	 ONE instance 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Quantifier	TokenNameIdentifier	 Quantifier
ONE	TokenNameIdentifier	 ONE
=	TokenNameEQUAL	
new	TokenNamenew	
Quantifier	TokenNameIdentifier	 Quantifier
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** MAJORITY instance */	TokenNameCOMMENT_JAVADOC	 MAJORITY instance 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Quantifier	TokenNameIdentifier	 Quantifier
MAJORITY	TokenNameIdentifier	 MAJORITY
=	TokenNameEQUAL	
new	TokenNamenew	
Quantifier	TokenNameIdentifier	 Quantifier
(	TokenNameLPAREN	
"majority"	TokenNameStringLiteral	majority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** NONE instance */	TokenNameCOMMENT_JAVADOC	 NONE instance 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Quantifier	TokenNameIdentifier	 Quantifier
NONE	TokenNameIdentifier	 NONE
=	TokenNameEQUAL	
new	TokenNamenew	
Quantifier	TokenNameIdentifier	 Quantifier
(	TokenNameLPAREN	
"none"	TokenNameStringLiteral	none
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
Predicate	TokenNameIdentifier	 Predicate
{	TokenNameLBRACE	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Predicate	TokenNameIdentifier	 Predicate
ALL_PRED	TokenNameIdentifier	 ALL  PRED
=	TokenNameEQUAL	
new	TokenNamenew	
Predicate	TokenNameIdentifier	 Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Predicate	TokenNameIdentifier	 Predicate
ANY_PRED	TokenNameIdentifier	 ANY  PRED
=	TokenNameEQUAL	
new	TokenNamenew	
Predicate	TokenNameIdentifier	 Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Predicate	TokenNameIdentifier	 Predicate
ONE_PRED	TokenNameIdentifier	 ONE  PRED
=	TokenNameEQUAL	
new	TokenNamenew	
Predicate	TokenNameIdentifier	 Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Predicate	TokenNameIdentifier	 Predicate
MAJORITY_PRED	TokenNameIdentifier	 MAJORITY  PRED
=	TokenNameEQUAL	
new	TokenNamenew	
Predicate	TokenNameIdentifier	 Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
>	TokenNameGREATER	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Predicate	TokenNameIdentifier	 Predicate
NONE_PRED	TokenNameIdentifier	 NONE  PRED
=	TokenNameEQUAL	
new	TokenNamenew	
Predicate	TokenNameIdentifier	 Predicate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Predicate	TokenNameIdentifier	 Predicate
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
PREDS	TokenNameIdentifier	 PREDS
=	TokenNameEQUAL	
new	TokenNamenew	
Predicate	TokenNameIdentifier	 Predicate
[	TokenNameLBRACKET	
VALUES	TokenNameIdentifier	 VALUES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// CheckStyle:MagicNumber OFF 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber OFF 
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALL_PRED	TokenNameIdentifier	 ALL  PRED
;	TokenNameSEMICOLON	
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALL_PRED	TokenNameIdentifier	 ALL  PRED
;	TokenNameSEMICOLON	
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ALL_PRED	TokenNameIdentifier	 ALL  PRED
;	TokenNameSEMICOLON	
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ANY_PRED	TokenNameIdentifier	 ANY  PRED
;	TokenNameSEMICOLON	
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ANY_PRED	TokenNameIdentifier	 ANY  PRED
;	TokenNameSEMICOLON	
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ONE_PRED	TokenNameIdentifier	 ONE  PRED
;	TokenNameSEMICOLON	
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
MAJORITY_PRED	TokenNameIdentifier	 MAJORITY  PRED
;	TokenNameSEMICOLON	
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
7	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
MAJORITY_PRED	TokenNameIdentifier	 MAJORITY  PRED
;	TokenNameSEMICOLON	
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
8	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
NONE_PRED	TokenNameIdentifier	 NONE  PRED
;	TokenNameSEMICOLON	
// CheckStyle:MagicNumber ON 	TokenNameCOMMENT_LINE	CheckStyle:MagicNumber ON 
}	TokenNameRBRACE	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
Quantifier	TokenNameIdentifier	 Quantifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a new Quantifier with the specified value. * @param value the EnumeratedAttribute value. */	TokenNameCOMMENT_JAVADOC	 Construct a new Quantifier with the specified value. @param value the EnumeratedAttribute value. 
public	TokenNamepublic	
Quantifier	TokenNameIdentifier	 Quantifier
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
/** * Evaluate a <code>boolean<code> array. * @param b the <code>boolean[]</code> to evaluate. * @return true if the argument fell within the parameters of this Quantifier. */	TokenNameCOMMENT_JAVADOC	 Evaluate a <code>boolean<code> array. @param b the <code>boolean[]</code> to evaluate. @return true if the argument fell within the parameters of this Quantifier. 
public	TokenNamepublic	
boolean	TokenNameboolean	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
t	TokenNameIdentifier	 t
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
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate integer <code>true</code> vs. <code>false</code> counts. * @param t the number of <code>true</code> values. * @param f the number of <code>false</code> values. * @return true if the arguments fell within the parameters of this Quantifier. */	TokenNameCOMMENT_JAVADOC	 Evaluate integer <code>true</code> vs. <code>false</code> counts. @param t the number of <code>true</code> values. @param f the number of <code>false</code> values. @return true if the arguments fell within the parameters of this Quantifier. 
public	TokenNamepublic	
boolean	TokenNameboolean	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
int	TokenNameint	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
int	TokenNameint	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
"Quantifier value not set."	TokenNameStringLiteral	Quantifier value not set.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
PREDS	TokenNameIdentifier	 PREDS
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
