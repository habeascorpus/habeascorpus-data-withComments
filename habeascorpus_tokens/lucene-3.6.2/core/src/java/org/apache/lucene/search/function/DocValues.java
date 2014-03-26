package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Explanation	TokenNameIdentifier	 Explanation
;	TokenNameSEMICOLON	
/** * Expert: represents field values as different types. * Normally created via a * {@link org.apache.lucene.search.function.ValueSource ValueSuorce} * for a particular field and reader. * * @lucene.experimental * * */	TokenNameCOMMENT_JAVADOC	 Expert: represents field values as different types. Normally created via a {@link org.apache.lucene.search.function.ValueSource ValueSuorce} for a particular field and reader. * @lucene.experimental * 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DocValues	TokenNameIdentifier	 Doc Values
{	TokenNameLBRACE	
/* * DocValues is distinct from ValueSource because * there needs to be an object created at query evaluation time that * is not referenced by the query itself because: * - Query objects should be MT safe * - For caching, Query objects are often used as keys... you don't * want the Query carrying around big objects */	TokenNameCOMMENT_BLOCK	 DocValues is distinct from ValueSource because there needs to be an object created at query evaluation time that is not referenced by the query itself because: - Query objects should be MT safe - For caching, Query objects are often used as keys... you don't want the Query carrying around big objects 
/** * Return doc value as a float. * <P>Mandatory: every DocValues implementation must implement at least this method. * @param doc document whose float value is requested. */	TokenNameCOMMENT_JAVADOC	 Return doc value as a float. <P>Mandatory: every DocValues implementation must implement at least this method. @param doc document whose float value is requested. 
public	TokenNamepublic	
abstract	TokenNameabstract	
float	TokenNamefloat	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return doc value as an int. * <P>Optional: DocValues implementation can (but don't have to) override this method. * @param doc document whose int value is requested. */	TokenNameCOMMENT_JAVADOC	 Return doc value as an int. <P>Optional: DocValues implementation can (but don't have to) override this method. @param doc document whose int value is requested. 
public	TokenNamepublic	
int	TokenNameint	
intVal	TokenNameIdentifier	 int Val
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return doc value as a long. * <P>Optional: DocValues implementation can (but don't have to) override this method. * @param doc document whose long value is requested. */	TokenNameCOMMENT_JAVADOC	 Return doc value as a long. <P>Optional: DocValues implementation can (but don't have to) override this method. @param doc document whose long value is requested. 
public	TokenNamepublic	
long	TokenNamelong	
longVal	TokenNameIdentifier	 long Val
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return doc value as a double. * <P>Optional: DocValues implementation can (but don't have to) override this method. * @param doc document whose double value is requested. */	TokenNameCOMMENT_JAVADOC	 Return doc value as a double. <P>Optional: DocValues implementation can (but don't have to) override this method. @param doc document whose double value is requested. 
public	TokenNamepublic	
double	TokenNamedouble	
doubleVal	TokenNameIdentifier	 double Val
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return doc value as a string. * <P>Optional: DocValues implementation can (but don't have to) override this method. * @param doc document whose string value is requested. */	TokenNameCOMMENT_JAVADOC	 Return doc value as a string. <P>Optional: DocValues implementation can (but don't have to) override this method. @param doc document whose string value is requested. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
strVal	TokenNameIdentifier	 str Val
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a string representation of a doc value, as required for Explanations. */	TokenNameCOMMENT_JAVADOC	 Return a string representation of a doc value, as required for Explanations. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Explain the scoring value for the input doc. */	TokenNameCOMMENT_JAVADOC	 Explain the scoring value for the input doc. 
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Expert: for test purposes only, return the inner array of values, or null if not applicable. * <p> * Allows tests to verify that loaded values are: * <ol> * <li>indeed cached/reused.</li> * <li>stored in the expected size/type (byte/short/int/float).</li> * </ol> * Note: implementations of DocValues must override this method for * these test elements to be tested, Otherwise the test would not fail, just * print a warning. */	TokenNameCOMMENT_JAVADOC	 Expert: for test purposes only, return the inner array of values, or null if not applicable. <p> Allows tests to verify that loaded values are: <ol> <li>indeed cached/reused.</li> <li>stored in the expected size/type (byte/short/int/float).</li> </ol> Note: implementations of DocValues must override this method for these test elements to be tested, Otherwise the test would not fail, just print a warning. 
Object	TokenNameIdentifier	 Object
getInnerArray	TokenNameIdentifier	 get Inner Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"this optional method is for test purposes only"	TokenNameStringLiteral	this optional method is for test purposes only
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// --- some simple statistics on values 	TokenNameCOMMENT_LINE	--- some simple statistics on values 
private	TokenNameprivate	
float	TokenNamefloat	
minVal	TokenNameIdentifier	 min Val
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
maxVal	TokenNameIdentifier	 max Val
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
avgVal	TokenNameIdentifier	 avg Val
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
computed	TokenNameIdentifier	 computed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// compute optional values 	TokenNameCOMMENT_LINE	compute optional values 
private	TokenNameprivate	
void	TokenNamevoid	
compute	TokenNameIdentifier	 compute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
computed	TokenNameIdentifier	 computed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
floatVal	TokenNameIdentifier	 float Val
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
minVal	TokenNameIdentifier	 min Val
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
minVal	TokenNameIdentifier	 min Val
)	TokenNameRPAREN	
?	TokenNameQUESTION	
val	TokenNameIdentifier	 val
:	TokenNameCOLON	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
minVal	TokenNameIdentifier	 min Val
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maxVal	TokenNameIdentifier	 max Val
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
maxVal	TokenNameIdentifier	 max Val
)	TokenNameRPAREN	
?	TokenNameQUESTION	
val	TokenNameIdentifier	 val
:	TokenNameCOLON	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxVal	TokenNameIdentifier	 max Val
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
avgVal	TokenNameIdentifier	 avg Val
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
:	TokenNameCOLON	
sum	TokenNameIdentifier	 sum
/	TokenNameDIVIDE	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
computed	TokenNameIdentifier	 computed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the minimum of all values or <code>Float.NaN</code> if this * DocValues instance does not contain any value. * <p> * This operation is optional * </p> * * @return the minimum of all values or <code>Float.NaN</code> if this * DocValues instance does not contain any value. */	TokenNameCOMMENT_JAVADOC	 Returns the minimum of all values or <code>Float.NaN</code> if this DocValues instance does not contain any value. <p> This operation is optional </p> * @return the minimum of all values or <code>Float.NaN</code> if this DocValues instance does not contain any value. 
public	TokenNamepublic	
float	TokenNamefloat	
getMinValue	TokenNameIdentifier	 get Min Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compute	TokenNameIdentifier	 compute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
minVal	TokenNameIdentifier	 min Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the maximum of all values or <code>Float.NaN</code> if this * DocValues instance does not contain any value. * <p> * This operation is optional * </p> * * @return the maximum of all values or <code>Float.NaN</code> if this * DocValues instance does not contain any value. */	TokenNameCOMMENT_JAVADOC	 Returns the maximum of all values or <code>Float.NaN</code> if this DocValues instance does not contain any value. <p> This operation is optional </p> * @return the maximum of all values or <code>Float.NaN</code> if this DocValues instance does not contain any value. 
public	TokenNamepublic	
float	TokenNamefloat	
getMaxValue	TokenNameIdentifier	 get Max Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compute	TokenNameIdentifier	 compute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
maxVal	TokenNameIdentifier	 max Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the average of all values or <code>Float.NaN</code> if this * DocValues instance does not contain any value. * * <p> * This operation is optional * </p> * * @return the average of all values or <code>Float.NaN</code> if this * DocValues instance does not contain any value */	TokenNameCOMMENT_JAVADOC	 Returns the average of all values or <code>Float.NaN</code> if this DocValues instance does not contain any value. * <p> This operation is optional </p> * @return the average of all values or <code>Float.NaN</code> if this DocValues instance does not contain any value 
public	TokenNamepublic	
float	TokenNamefloat	
getAverageValue	TokenNameIdentifier	 get Average Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compute	TokenNameIdentifier	 compute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
avgVal	TokenNameIdentifier	 avg Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
