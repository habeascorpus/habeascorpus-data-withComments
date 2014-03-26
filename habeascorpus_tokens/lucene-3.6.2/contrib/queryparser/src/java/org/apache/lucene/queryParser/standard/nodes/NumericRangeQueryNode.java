package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
NumericField	TokenNameIdentifier	 Numeric Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
MessageImpl	TokenNameIdentifier	 Message Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
messages	TokenNameIdentifier	 messages
.	TokenNameDOT	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
NumericConfig	TokenNameIdentifier	 Numeric Config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with this * work for additional information regarding copyright ownership. The ASF * licenses this file to You under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the * License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * This query node represents a range query composed by {@link NumericQueryNode} * bounds, which means the bound values are {@link Number}s. * * @see NumericQueryNode * @see AbstractRangeQueryNode */	TokenNameCOMMENT_JAVADOC	 This query node represents a range query composed by {@link NumericQueryNode} bounds, which means the bound values are {@link Number}s. * @see NumericQueryNode @see AbstractRangeQueryNode 
public	TokenNamepublic	
class	TokenNameclass	
NumericRangeQueryNode	TokenNameIdentifier	 Numeric Range Query Node
extends	TokenNameextends	
AbstractRangeQueryNode	TokenNameIdentifier	 Abstract Range Query Node
<	TokenNameLESS	
NumericQueryNode	TokenNameIdentifier	 Numeric Query Node
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
NumericConfig	TokenNameIdentifier	 Numeric Config
numericConfig	TokenNameIdentifier	 numeric Config
;	TokenNameSEMICOLON	
/** * Constructs a {@link NumericRangeQueryNode} object using the given * {@link NumericQueryNode} as its bounds and {@link NumericConfig}. * * @param lower the lower bound * @param upper the upper bound * @param lowerInclusive <code>true</code> if the lower bound is inclusive, otherwise, <code>false</code> * @param upperInclusive <code>true</code> if the upper bound is inclusive, otherwise, <code>false</code> * @param numericConfig the {@link NumericConfig} that represents associated with the upper and lower bounds * * @see #setBounds(NumericQueryNode, NumericQueryNode, boolean, boolean, NumericConfig) */	TokenNameCOMMENT_JAVADOC	 Constructs a {@link NumericRangeQueryNode} object using the given {@link NumericQueryNode} as its bounds and {@link NumericConfig}. * @param lower the lower bound @param upper the upper bound @param lowerInclusive <code>true</code> if the lower bound is inclusive, otherwise, <code>false</code> @param upperInclusive <code>true</code> if the upper bound is inclusive, otherwise, <code>false</code> @param numericConfig the {@link NumericConfig} that represents associated with the upper and lower bounds * @see #setBounds(NumericQueryNode, NumericQueryNode, boolean, boolean, NumericConfig) 
public	TokenNamepublic	
NumericRangeQueryNode	TokenNameIdentifier	 Numeric Range Query Node
(	TokenNameLPAREN	
NumericQueryNode	TokenNameIdentifier	 Numeric Query Node
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
NumericQueryNode	TokenNameIdentifier	 Numeric Query Node
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
boolean	TokenNameboolean	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
boolean	TokenNameboolean	
upperInclusive	TokenNameIdentifier	 upper Inclusive
,	TokenNameCOMMA	
NumericConfig	TokenNameIdentifier	 Numeric Config
numericConfig	TokenNameIdentifier	 numeric Config
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
setBounds	TokenNameIdentifier	 set Bounds
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
,	TokenNameCOMMA	
numericConfig	TokenNameIdentifier	 numeric Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
getNumericDataType	TokenNameIdentifier	 get Numeric Data Type
(	TokenNameLPAREN	
Number	TokenNameIdentifier	 Number
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
instanceof	TokenNameinstanceof	
Long	TokenNameIdentifier	 Long
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
LONG	TokenNameIdentifier	 LONG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
instanceof	TokenNameinstanceof	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
INT	TokenNameIdentifier	 INT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
instanceof	TokenNameinstanceof	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
DOUBLE	TokenNameIdentifier	 DOUBLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
number	TokenNameIdentifier	 number
instanceof	TokenNameinstanceof	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
FLOAT	TokenNameIdentifier	 FLOAT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
(	TokenNameLPAREN	
new	TokenNamenew	
MessageImpl	TokenNameIdentifier	 Message Impl
(	TokenNameLPAREN	
QueryParserMessages	TokenNameIdentifier	 Query Parser Messages
.	TokenNameDOT	
NUMBER_CLASS_NOT_SUPPORTED_BY_NUMERIC_RANGE_QUERY	TokenNameIdentifier	 NUMBER  CLASS  NOT  SUPPORTED  BY  NUMERIC  RANGE  QUERY
,	TokenNameCOMMA	
number	TokenNameIdentifier	 number
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the upper and lower bounds of this range query node and the * {@link NumericConfig} associated with these bounds. * * @param lower the lower bound * @param upper the upper bound * @param lowerInclusive <code>true</code> if the lower bound is inclusive, otherwise, <code>false</code> * @param upperInclusive <code>true</code> if the upper bound is inclusive, otherwise, <code>false</code> * @param numericConfig the {@link NumericConfig} that represents associated with the upper and lower bounds * */	TokenNameCOMMENT_JAVADOC	 Sets the upper and lower bounds of this range query node and the {@link NumericConfig} associated with these bounds. * @param lower the lower bound @param upper the upper bound @param lowerInclusive <code>true</code> if the lower bound is inclusive, otherwise, <code>false</code> @param upperInclusive <code>true</code> if the upper bound is inclusive, otherwise, <code>false</code> @param numericConfig the {@link NumericConfig} that represents associated with the upper and lower bounds 
public	TokenNamepublic	
void	TokenNamevoid	
setBounds	TokenNameIdentifier	 set Bounds
(	TokenNameLPAREN	
NumericQueryNode	TokenNameIdentifier	 Numeric Query Node
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
NumericQueryNode	TokenNameIdentifier	 Numeric Query Node
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
boolean	TokenNameboolean	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
boolean	TokenNameboolean	
upperInclusive	TokenNameIdentifier	 upper Inclusive
,	TokenNameCOMMA	
NumericConfig	TokenNameIdentifier	 Numeric Config
numericConfig	TokenNameIdentifier	 numeric Config
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numericConfig	TokenNameIdentifier	 numeric Config
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"numericConfig cannot be null!"	TokenNameStringLiteral	numericConfig cannot be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
lowerNumberType	TokenNameIdentifier	 lower Number Type
,	TokenNameCOMMA	
upperNumberType	TokenNameIdentifier	 upper Number Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lowerNumberType	TokenNameIdentifier	 lower Number Type
=	TokenNameEQUAL	
getNumericDataType	TokenNameIdentifier	 get Numeric Data Type
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lowerNumberType	TokenNameIdentifier	 lower Number Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upperNumberType	TokenNameIdentifier	 upper Number Type
=	TokenNameEQUAL	
getNumericDataType	TokenNameIdentifier	 get Numeric Data Type
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
upperNumberType	TokenNameIdentifier	 upper Number Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lowerNumberType	TokenNameIdentifier	 lower Number Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
lowerNumberType	TokenNameIdentifier	 lower Number Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
numericConfig	TokenNameIdentifier	 numeric Config
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"lower value's type should be the same as numericConfig type: "	TokenNameStringLiteral	lower value's type should be the same as numericConfig type: 
+	TokenNamePLUS	
lowerNumberType	TokenNameIdentifier	 lower Number Type
+	TokenNamePLUS	
" != "	TokenNameStringLiteral	 != 
+	TokenNamePLUS	
numericConfig	TokenNameIdentifier	 numeric Config
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperNumberType	TokenNameIdentifier	 upper Number Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
upperNumberType	TokenNameIdentifier	 upper Number Type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
numericConfig	TokenNameIdentifier	 numeric Config
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"upper value's type should be the same as numericConfig type: "	TokenNameStringLiteral	upper value's type should be the same as numericConfig type: 
+	TokenNamePLUS	
upperNumberType	TokenNameIdentifier	 upper Number Type
+	TokenNamePLUS	
" != "	TokenNameStringLiteral	 != 
+	TokenNamePLUS	
numericConfig	TokenNameIdentifier	 numeric Config
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setBounds	TokenNameIdentifier	 set Bounds
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
,	TokenNameCOMMA	
lowerInclusive	TokenNameIdentifier	 lower Inclusive
,	TokenNameCOMMA	
upperInclusive	TokenNameIdentifier	 upper Inclusive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numericConfig	TokenNameIdentifier	 numeric Config
=	TokenNameEQUAL	
numericConfig	TokenNameIdentifier	 numeric Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link NumericConfig} associated with the lower and upper bounds. * * @return the {@link NumericConfig} associated with the lower and upper bounds */	TokenNameCOMMENT_JAVADOC	 Returns the {@link NumericConfig} associated with the lower and upper bounds. * @return the {@link NumericConfig} associated with the lower and upper bounds 
public	TokenNamepublic	
NumericConfig	TokenNameIdentifier	 Numeric Config
getNumericConfig	TokenNameIdentifier	 get Numeric Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
numericConfig	TokenNameIdentifier	 numeric Config
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
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"<numericRange lowerInclusive='"	TokenNameStringLiteral	<numericRange lowerInclusive='
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
isLowerInclusive	TokenNameIdentifier	 is Lower Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"' upperInclusive='"	TokenNameStringLiteral	' upperInclusive='
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
isUpperInclusive	TokenNameIdentifier	 is Upper Inclusive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"' precisionStep='"	TokenNameStringLiteral	' precisionStep='
+	TokenNamePLUS	
numericConfig	TokenNameIdentifier	 numeric Config
.	TokenNameDOT	
getPrecisionStep	TokenNameIdentifier	 get Precision Step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"' type='"	TokenNameStringLiteral	' type='
+	TokenNamePLUS	
numericConfig	TokenNameIdentifier	 numeric Config
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"'> "	TokenNameStringLiteral	'> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getLowerBound	TokenNameIdentifier	 get Lower Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getUpperBound	TokenNameIdentifier	 get Upper Bound
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</numericRange>"	TokenNameStringLiteral	</numericRange>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
