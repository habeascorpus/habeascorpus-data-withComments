/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql	TokenNameIdentifier	 cql
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Select expressions are analogous to the projection in a SQL query. They * determine which columns will appear in the result set. SelectExpression * instances encapsulate a parsed expression from a <code>SELECT</code> * statement. * * See: doc/cql/CQL.html#SpecifyingColumns */	TokenNameCOMMENT_JAVADOC	 Select expressions are analogous to the projection in a SQL query. They determine which columns will appear in the result set. SelectExpression instances encapsulate a parsed expression from a <code>SELECT</code> statement. * See: doc/cql/CQL.html#SpecifyingColumns 
public	TokenNamepublic	
class	TokenNameclass	
SelectExpression	TokenNameIdentifier	 Select Expression
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_COLUMNS_DEFAULT	TokenNameIdentifier	 MAX  COLUMNS  DEFAULT
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numColumns	TokenNameIdentifier	 num Columns
=	TokenNameEQUAL	
MAX_COLUMNS_DEFAULT	TokenNameIdentifier	 MAX  COLUMNS  DEFAULT
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
reverseColumns	TokenNameIdentifier	 reverse Columns
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasFirstSet	TokenNameIdentifier	 has First Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
wildcard	TokenNameIdentifier	 wildcard
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
finish	TokenNameIdentifier	 finish
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
;	TokenNameSEMICOLON	
/** * Create a new SelectExpression for a range (slice) of columns. * * @param start the starting column name * @param finish the finishing column name * @param count the number of columns to limit the results to * @param reverse true to reverse column order * @param wildcard determines weather this statement is wildcard * @param firstSet determines weather "FIRST" keyword was set */	TokenNameCOMMENT_JAVADOC	 Create a new SelectExpression for a range (slice) of columns. * @param start the starting column name @param finish the finishing column name @param count the number of columns to limit the results to @param reverse true to reverse column order @param wildcard determines weather this statement is wildcard @param firstSet determines weather "FIRST" keyword was set 
public	TokenNamepublic	
SelectExpression	TokenNameIdentifier	 Select Expression
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
finish	TokenNameIdentifier	 finish
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
,	TokenNameCOMMA	
boolean	TokenNameboolean	
wildcard	TokenNameIdentifier	 wildcard
,	TokenNameCOMMA	
boolean	TokenNameboolean	
firstSet	TokenNameIdentifier	 first Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
finish	TokenNameIdentifier	 finish
;	TokenNameSEMICOLON	
numColumns	TokenNameIdentifier	 num Columns
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
reverseColumns	TokenNameIdentifier	 reverse Columns
=	TokenNameEQUAL	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
wildcard	TokenNameIdentifier	 wildcard
=	TokenNameEQUAL	
wildcard	TokenNameIdentifier	 wildcard
;	TokenNameSEMICOLON	
hasFirstSet	TokenNameIdentifier	 has First Set
=	TokenNameEQUAL	
firstSet	TokenNameIdentifier	 first Set
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new SelectExpression for a list of columns. * * @param first the first (possibly only) column name to select on. * @param count the number of columns to limit the results on * @param reverse true to reverse column order * @param firstSet determines weather "FIRST" keyword was set */	TokenNameCOMMENT_JAVADOC	 Create a new SelectExpression for a list of columns. * @param first the first (possibly only) column name to select on. @param count the number of columns to limit the results on @param reverse true to reverse column order @param firstSet determines weather "FIRST" keyword was set 
public	TokenNamepublic	
SelectExpression	TokenNameIdentifier	 Select Expression
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reverse	TokenNameIdentifier	 reverse
,	TokenNameCOMMA	
boolean	TokenNameboolean	
firstSet	TokenNameIdentifier	 first Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wildcard	TokenNameIdentifier	 wildcard
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numColumns	TokenNameIdentifier	 num Columns
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
reverseColumns	TokenNameIdentifier	 reverse Columns
=	TokenNameEQUAL	
reverse	TokenNameIdentifier	 reverse
;	TokenNameSEMICOLON	
hasFirstSet	TokenNameIdentifier	 has First Set
=	TokenNameEQUAL	
firstSet	TokenNameIdentifier	 first Set
;	TokenNameSEMICOLON	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
finish	TokenNameIdentifier	 finish
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add an additional column name to a SelectExpression. * * @param addTerm */	TokenNameCOMMENT_JAVADOC	 Add an additional column name to a SelectExpression. * @param addTerm 
public	TokenNamepublic	
void	TokenNamevoid	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
addTerm	TokenNameIdentifier	 add Term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
isColumnRange	TokenNameIdentifier	 is Column Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Not possible when invoked by parser 	TokenNameCOMMENT_LINE	Not possible when invoked by parser 
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
addTerm	TokenNameIdentifier	 add Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isColumnRange	TokenNameIdentifier	 is Column Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isColumnList	TokenNameIdentifier	 is Column List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
isColumnRange	TokenNameIdentifier	 is Column Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getColumnsLimit	TokenNameIdentifier	 get Columns Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numColumns	TokenNameIdentifier	 num Columns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isColumnsReversed	TokenNameIdentifier	 is Columns Reversed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reverseColumns	TokenNameIdentifier	 reverse Columns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setColumnsReversed	TokenNameIdentifier	 set Columns Reversed
(	TokenNameLPAREN	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reverseColumns	TokenNameIdentifier	 reverse Columns
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setColumnsLimit	TokenNameIdentifier	 set Columns Limit
(	TokenNameLPAREN	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numColumns	TokenNameIdentifier	 num Columns
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return weather expression includes "FIRST" keyword */	TokenNameCOMMENT_JAVADOC	 @return weather expression includes "FIRST" keyword 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFirstSet	TokenNameIdentifier	 has First Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasFirstSet	TokenNameIdentifier	 has First Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
getFinish	TokenNameIdentifier	 get Finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
finish	TokenNameIdentifier	 finish
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
getColumns	TokenNameIdentifier	 get Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columns	TokenNameIdentifier	 columns
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isWildcard	TokenNameIdentifier	 is Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
wildcard	TokenNameIdentifier	 wildcard
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"SelectExpression [numColumns=%s, reverseColumns=%s, hasFirstSet=%s, wildcard=%s, start=%s, finish=%s, columns=%s]"	TokenNameStringLiteral	SelectExpression [numColumns=%s, reverseColumns=%s, hasFirstSet=%s, wildcard=%s, start=%s, finish=%s, columns=%s]
,	TokenNameCOMMA	
numColumns	TokenNameIdentifier	 num Columns
,	TokenNameCOMMA	
reverseColumns	TokenNameIdentifier	 reverse Columns
,	TokenNameCOMMA	
hasFirstSet	TokenNameIdentifier	 has First Set
,	TokenNameCOMMA	
wildcard	TokenNameIdentifier	 wildcard
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
finish	TokenNameIdentifier	 finish
,	TokenNameCOMMA	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
