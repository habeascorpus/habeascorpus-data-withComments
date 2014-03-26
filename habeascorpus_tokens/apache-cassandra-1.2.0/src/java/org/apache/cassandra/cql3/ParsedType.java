/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
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
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
SyntaxException	TokenNameIdentifier	 Syntax Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
ParsedType	TokenNameIdentifier	 Parsed Type
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCollection	TokenNameIdentifier	 is Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCounter	TokenNameIdentifier	 is Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
enum	TokenNameenum	
Native	TokenNameIdentifier	 Native
implements	TokenNameimplements	
ParsedType	TokenNameIdentifier	 Parsed Type
{	TokenNameLBRACE	
ASCII	TokenNameIdentifier	 ASCII
(	TokenNameLPAREN	
AsciiType	TokenNameIdentifier	 Ascii Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BIGINT	TokenNameIdentifier	 BIGINT
(	TokenNameLPAREN	
LongType	TokenNameIdentifier	 Long Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BLOB	TokenNameIdentifier	 BLOB
(	TokenNameLPAREN	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BOOLEAN	TokenNameIdentifier	 BOOLEAN
(	TokenNameLPAREN	
BooleanType	TokenNameIdentifier	 Boolean Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
COUNTER	TokenNameIdentifier	 COUNTER
(	TokenNameLPAREN	
CounterColumnType	TokenNameIdentifier	 Counter Column Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DECIMAL	TokenNameIdentifier	 DECIMAL
(	TokenNameLPAREN	
DecimalType	TokenNameIdentifier	 Decimal Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
DOUBLE	TokenNameIdentifier	 DOUBLE
(	TokenNameLPAREN	
DoubleType	TokenNameIdentifier	 Double Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
FLOAT	TokenNameIdentifier	 FLOAT
(	TokenNameLPAREN	
FloatType	TokenNameIdentifier	 Float Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
INET	TokenNameIdentifier	 INET
(	TokenNameLPAREN	
InetAddressType	TokenNameIdentifier	 Inet Address Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
INT	TokenNameIdentifier	 INT
(	TokenNameLPAREN	
Int32Type	TokenNameIdentifier	 Int32 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TEXT	TokenNameIdentifier	 TEXT
(	TokenNameLPAREN	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TIMESTAMP	TokenNameIdentifier	 TIMESTAMP
(	TokenNameLPAREN	
DateType	TokenNameIdentifier	 Date Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
UUID	TokenNameIdentifier	 UUID
(	TokenNameLPAREN	
UUIDType	TokenNameIdentifier	 UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
VARCHAR	TokenNameIdentifier	 VARCHAR
(	TokenNameLPAREN	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
VARINT	TokenNameIdentifier	 VARINT
(	TokenNameLPAREN	
IntegerType	TokenNameIdentifier	 Integer Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
,	TokenNameCOMMA	
TIMEUUID	TokenNameIdentifier	 TIMEUUID
(	TokenNameLPAREN	
TimeUUIDType	TokenNameIdentifier	 Time UUID Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Native	TokenNameIdentifier	 Native
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCollection	TokenNameIdentifier	 is Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCounter	TokenNameIdentifier	 is Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
COUNTER	TokenNameIdentifier	 COUNTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Custom	TokenNameIdentifier	 Custom
implements	TokenNameimplements	
ParsedType	TokenNameIdentifier	 Parsed Type
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Custom	TokenNameIdentifier	 Custom
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SyntaxException	TokenNameIdentifier	 Syntax Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCollection	TokenNameIdentifier	 is Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCounter	TokenNameIdentifier	 is Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Collection	TokenNameIdentifier	 Collection
implements	TokenNameimplements	
ParsedType	TokenNameIdentifier	 Parsed Type
{	TokenNameLBRACE	
CollectionType	TokenNameIdentifier	 Collection Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Collection	TokenNameIdentifier	 Collection
(	TokenNameLPAREN	
CollectionType	TokenNameIdentifier	 Collection Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Collection	TokenNameIdentifier	 Collection
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
ParsedType	TokenNameIdentifier	 Parsed Type
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
ParsedType	TokenNameIdentifier	 Parsed Type
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
isCollection	TokenNameIdentifier	 is Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
isCollection	TokenNameIdentifier	 is Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"map type cannot contain another collection"	TokenNameStringLiteral	map type cannot contain another collection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
isCounter	TokenNameIdentifier	 is Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
isCounter	TokenNameIdentifier	 is Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"counters are not allowed inside a collection"	TokenNameStringLiteral	counters are not allowed inside a collection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Collection	TokenNameIdentifier	 Collection
(	TokenNameLPAREN	
MapType	TokenNameIdentifier	 Map Type
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Collection	TokenNameIdentifier	 Collection
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
ParsedType	TokenNameIdentifier	 Parsed Type
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isCollection	TokenNameIdentifier	 is Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"list type cannot contain another collection"	TokenNameStringLiteral	list type cannot contain another collection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isCounter	TokenNameIdentifier	 is Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"counters are not allowed inside a collection"	TokenNameStringLiteral	counters are not allowed inside a collection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Collection	TokenNameIdentifier	 Collection
(	TokenNameLPAREN	
ListType	TokenNameIdentifier	 List Type
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Collection	TokenNameIdentifier	 Collection
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ParsedType	TokenNameIdentifier	 Parsed Type
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isCollection	TokenNameIdentifier	 is Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"set type cannot contain another collection"	TokenNameStringLiteral	set type cannot contain another collection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
isCounter	TokenNameIdentifier	 is Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"counters are not allowed inside a collection"	TokenNameStringLiteral	counters are not allowed inside a collection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Collection	TokenNameIdentifier	 Collection
(	TokenNameLPAREN	
SetType	TokenNameIdentifier	 Set Type
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCollection	TokenNameIdentifier	 is Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCounter	TokenNameIdentifier	 is Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
