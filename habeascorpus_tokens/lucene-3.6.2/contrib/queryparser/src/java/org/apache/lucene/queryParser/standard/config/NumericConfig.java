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
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
NumericRangeQuery	TokenNameIdentifier	 Numeric Range Query
;	TokenNameSEMICOLON	
/** * This class holds the configuration used to parse numeric queries and create * {@link NumericRangeQuery}s. * * @see NumericRangeQuery * @see NumberFormat */	TokenNameCOMMENT_JAVADOC	 This class holds the configuration used to parse numeric queries and create {@link NumericRangeQuery}s. * @see NumericRangeQuery @see NumberFormat 
public	TokenNamepublic	
class	TokenNameclass	
NumericConfig	TokenNameIdentifier	 Numeric Config
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NumberFormat	TokenNameIdentifier	 Number Format
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * Constructs a {@link NumericConfig} object. * * @param precisionStep * the precision used to index the numeric values * @param format * the {@link NumberFormat} used to parse a {@link String} to * {@link Number} * @param type * the numeric type used to index the numeric values * * @see NumericConfig#setPrecisionStep(int) * @see NumericConfig#setNumberFormat(NumberFormat) * @see #setType(org.apache.lucene.document.NumericField.DataType) */	TokenNameCOMMENT_JAVADOC	 Constructs a {@link NumericConfig} object. * @param precisionStep the precision used to index the numeric values @param format the {@link NumberFormat} used to parse a {@link String} to {@link Number} @param type the numeric type used to index the numeric values * @see NumericConfig#setPrecisionStep(int) @see NumericConfig#setNumberFormat(NumberFormat) @see #setType(org.apache.lucene.document.NumericField.DataType) 
public	TokenNamepublic	
NumericConfig	TokenNameIdentifier	 Numeric Config
(	TokenNameLPAREN	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
,	TokenNameCOMMA	
NumberFormat	TokenNameIdentifier	 Number Format
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPrecisionStep	TokenNameIdentifier	 set Precision Step
(	TokenNameLPAREN	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNumberFormat	TokenNameIdentifier	 set Number Format
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the precision used to index the numeric values * * @return the precision used to index the numeric values * * @see NumericRangeQuery#getPrecisionStep() */	TokenNameCOMMENT_JAVADOC	 Returns the precision used to index the numeric values * @return the precision used to index the numeric values * @see NumericRangeQuery#getPrecisionStep() 
public	TokenNamepublic	
int	TokenNameint	
getPrecisionStep	TokenNameIdentifier	 get Precision Step
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the precision used to index the numeric values * * @param precisionStep * the precision used to index the numeric values * * @see NumericRangeQuery#getPrecisionStep() */	TokenNameCOMMENT_JAVADOC	 Sets the precision used to index the numeric values * @param precisionStep the precision used to index the numeric values * @see NumericRangeQuery#getPrecisionStep() 
public	TokenNamepublic	
void	TokenNamevoid	
setPrecisionStep	TokenNameIdentifier	 set Precision Step
(	TokenNameLPAREN	
int	TokenNameint	
precisionStep	TokenNameIdentifier	 precision Step
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
precisionStep	TokenNameIdentifier	 precision Step
=	TokenNameEQUAL	
precisionStep	TokenNameIdentifier	 precision Step
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the {@link NumberFormat} used to parse a {@link String} to * {@link Number} * * @return the {@link NumberFormat} used to parse a {@link String} to * {@link Number} */	TokenNameCOMMENT_JAVADOC	 Returns the {@link NumberFormat} used to parse a {@link String} to {@link Number} * @return the {@link NumberFormat} used to parse a {@link String} to {@link Number} 
public	TokenNamepublic	
NumberFormat	TokenNameIdentifier	 Number Format
getNumberFormat	TokenNameIdentifier	 get Number Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the numeric type used to index the numeric values * * @return the numeric type used to index the numeric values */	TokenNameCOMMENT_JAVADOC	 Returns the numeric type used to index the numeric values * @return the numeric type used to index the numeric values 
public	TokenNamepublic	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the numeric type used to index the numeric values * * @param type the numeric type used to index the numeric values */	TokenNameCOMMENT_JAVADOC	 Sets the numeric type used to index the numeric values * @param type the numeric type used to index the numeric values 
public	TokenNamepublic	
void	TokenNamevoid	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
NumericField	TokenNameIdentifier	 Numeric Field
.	TokenNameDOT	
DataType	TokenNameIdentifier	 Data Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"type cannot be null!"	TokenNameStringLiteral	type cannot be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the {@link NumberFormat} used to parse a {@link String} to * {@link Number} * * @param format * the {@link NumberFormat} used to parse a {@link String} to * {@link Number}, cannot be <code>null</code> */	TokenNameCOMMENT_JAVADOC	 Sets the {@link NumberFormat} used to parse a {@link String} to {@link Number} * @param format the {@link NumberFormat} used to parse a {@link String} to {@link Number}, cannot be <code>null</code> 
public	TokenNamepublic	
void	TokenNamevoid	
setNumberFormat	TokenNameIdentifier	 set Number Format
(	TokenNameLPAREN	
NumberFormat	TokenNameIdentifier	 Number Format
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"format cannot be null!"	TokenNameStringLiteral	format cannot be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
NumericConfig	TokenNameIdentifier	 Numeric Config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NumericConfig	TokenNameIdentifier	 Numeric Config
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NumericConfig	TokenNameIdentifier	 Numeric Config
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
precisionStep	TokenNameIdentifier	 precision Step
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
precisionStep	TokenNameIdentifier	 precision Step
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
type	TokenNameIdentifier	 type
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
format	TokenNameIdentifier	 format
||	TokenNameOR_OR	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
format	TokenNameIdentifier	 format
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
