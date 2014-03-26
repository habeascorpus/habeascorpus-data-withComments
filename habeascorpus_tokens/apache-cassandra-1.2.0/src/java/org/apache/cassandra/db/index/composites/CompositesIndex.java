/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
composites	TokenNameIdentifier	 composites
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
ColumnDefinition	TokenNameIdentifier	 Column Definition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
AbstractSimplePerColumnSecondaryIndex	TokenNameIdentifier	 Abstract Simple Per Column Secondary Index
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
SecondaryIndex	TokenNameIdentifier	 Secondary Index
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
SecondaryIndexSearcher	TokenNameIdentifier	 Secondary Index Searcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
/** * Implements a secondary index for a column family using a second column family * in which the row keys are indexed values, and column names are base row keys. */	TokenNameCOMMENT_JAVADOC	 Implements a secondary index for a column family using a second column family in which the row keys are indexed values, and column names are base row keys. 
public	TokenNamepublic	
class	TokenNameclass	
CompositesIndex	TokenNameIdentifier	 Composites Index
extends	TokenNameextends	
AbstractSimplePerColumnSecondaryIndex	TokenNameIdentifier	 Abstract Simple Per Column Secondary Index
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PREFIX_SIZE_OPTION	TokenNameIdentifier	 PREFIX  SIZE  OPTION
=	TokenNameEQUAL	
"prefix_size"	TokenNameStringLiteral	prefix_size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CompositeType	TokenNameIdentifier	 Composite Type
indexComparator	TokenNameIdentifier	 index Comparator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
prefixSize	TokenNameIdentifier	 prefix Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
ColumnDefinition	TokenNameIdentifier	 Column Definition
columnDef	TokenNameIdentifier	 column Def
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
CompositeType	TokenNameIdentifier	 Composite Type
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
prefixSize	TokenNameIdentifier	 prefix Size
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
columnDef	TokenNameIdentifier	 column Def
.	TokenNameDOT	
getIndexOptions	TokenNameIdentifier	 get Index Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
PREFIX_SIZE_OPTION	TokenNameIdentifier	 PREFIX  SIZE  OPTION
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Shouldn't happen since validateOptions must have been called 	TokenNameCOMMENT_LINE	Shouldn't happen since validateOptions must have been called 
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
indexComparator	TokenNameIdentifier	 index Comparator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
SecondaryIndex	TokenNameIdentifier	 Secondary Index
.	TokenNameDOT	
getIndexComparator	TokenNameIdentifier	 get Index Comparator
(	TokenNameLPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
columnDef	TokenNameIdentifier	 column Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
makeIndexColumnName	TokenNameIdentifier	 make Index Column Name
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
rowKey	TokenNameIdentifier	 row Key
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeType	TokenNameIdentifier	 Composite Type
baseComparator	TokenNameIdentifier	 base Comparator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
components	TokenNameIdentifier	 components
=	TokenNameEQUAL	
baseComparator	TokenNameIdentifier	 base Comparator
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompositeType	TokenNameIdentifier	 Composite Type
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeType	TokenNameIdentifier	 Composite Type
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
indexComparator	TokenNameIdentifier	 index Comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rowKey	TokenNameIdentifier	 row Key
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
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
prefixSize	TokenNameIdentifier	 prefix Size
,	TokenNameCOMMA	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
AbstractType	TokenNameIdentifier	 Abstract Type
getExpressionComparator	TokenNameIdentifier	 get Expression Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeType	TokenNameIdentifier	 Composite Type
baseComparator	TokenNameIdentifier	 base Comparator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
baseComparator	TokenNameIdentifier	 base Comparator
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
prefixSize	TokenNameIdentifier	 prefix Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
indexes	TokenNameIdentifier	 indexes
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnDefinition	TokenNameIdentifier	 Column Definition
columnDef	TokenNameIdentifier	 column Def
=	TokenNameEQUAL	
columnDefs	TokenNameIdentifier	 column Defs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompositeType	TokenNameIdentifier	 Composite Type
baseComparator	TokenNameIdentifier	 base Comparator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
components	TokenNameIdentifier	 components
=	TokenNameEQUAL	
baseComparator	TokenNameIdentifier	 base Comparator
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
getColumnDefinitionComparator	TokenNameIdentifier	 get Column Definition Comparator
(	TokenNameLPAREN	
columnDef	TokenNameIdentifier	 column Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
columnDef	TokenNameIdentifier	 column Def
.	TokenNameDOT	
componentIndex	TokenNameIdentifier	 component Index
&&	TokenNameAND_AND	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
columnDef	TokenNameIdentifier	 column Def
.	TokenNameDOT	
componentIndex	TokenNameIdentifier	 component Index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
columnDef	TokenNameIdentifier	 column Def
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SecondaryIndexSearcher	TokenNameIdentifier	 Secondary Index Searcher
createSecondaryIndexSearcher	TokenNameIdentifier	 create Secondary Index Searcher
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompositesSearcher	TokenNameIdentifier	 Composites Searcher
(	TokenNameLPAREN	
baseCfs	TokenNameIdentifier	 base Cfs
.	TokenNameDOT	
indexManager	TokenNameIdentifier	 index Manager
,	TokenNameCOMMA	
columns	TokenNameIdentifier	 columns
,	TokenNameCOMMA	
prefixSize	TokenNameIdentifier	 prefix Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateOptions	TokenNameIdentifier	 validate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
ColumnDefinition	TokenNameIdentifier	 Column Definition
columnDef	TokenNameIdentifier	 column Def
=	TokenNameEQUAL	
columnDefs	TokenNameIdentifier	 column Defs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
option	TokenNameIdentifier	 option
=	TokenNameEQUAL	
columnDef	TokenNameIdentifier	 column Def
.	TokenNameDOT	
getIndexOptions	TokenNameIdentifier	 get Index Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
PREFIX_SIZE_OPTION	TokenNameIdentifier	 PREFIX  SIZE  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"Missing option "	TokenNameStringLiteral	Missing option 
+	TokenNamePLUS	
PREFIX_SIZE_OPTION	TokenNameIdentifier	 PREFIX  SIZE  OPTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
option	TokenNameIdentifier	 option
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Invalid non integer value for option %s (got '%s')"	TokenNameStringLiteral	Invalid non integer value for option %s (got '%s')
,	TokenNameCOMMA	
PREFIX_SIZE_OPTION	TokenNameIdentifier	 PREFIX  SIZE  OPTION
,	TokenNameCOMMA	
option	TokenNameIdentifier	 option
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
