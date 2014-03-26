/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
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
ColumnFamily	TokenNameIdentifier	 Column Family
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
IColumn	TokenNameIdentifier	 I Column
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
AbstractType	TokenNameIdentifier	 Abstract Type
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
CollectionType	TokenNameIdentifier	 Collection Type
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
ListType	TokenNameIdentifier	 List Type
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
MapType	TokenNameIdentifier	 Map Type
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
SetType	TokenNameIdentifier	 Set Type
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
PreparedOperation	TokenNameIdentifier	 Prepared Operation
implements	TokenNameimplements	
Operation	TokenNameIdentifier	 Operation
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Kind	TokenNameIdentifier	 Kind
{	TokenNameLBRACE	
SET	TokenNameIdentifier	 SET
,	TokenNameCOMMA	
PREPARED_PLUS	TokenNameIdentifier	 PREPARED  PLUS
,	TokenNameCOMMA	
PLUS_PREPARED	TokenNameIdentifier	 PLUS  PREPARED
,	TokenNameCOMMA	
MINUS_PREPARED	TokenNameIdentifier	 MINUS  PREPARED
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
preparedValue	TokenNameIdentifier	 prepared Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PreparedOperation	TokenNameIdentifier	 Prepared Operation
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
isBindMarker	TokenNameIdentifier	 is Bind Marker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
preparedValue	TokenNameIdentifier	 prepared Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
kind	TokenNameIdentifier	 kind
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
UpdateParameters	TokenNameIdentifier	 Update Parameters
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>>	TokenNameRIGHT_SHIFT	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
validator	TokenNameIdentifier	 validator
instanceof	TokenNameinstanceof	
CollectionType	TokenNameIdentifier	 Collection Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CollectionType	TokenNameIdentifier	 Collection Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
)	TokenNameRPAREN	
.	TokenNameDOT	
kind	TokenNameIdentifier	 kind
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LIST	TokenNameIdentifier	 LIST
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SET	TokenNameIdentifier	 SET
:	TokenNameCOLON	
ListOperation	TokenNameIdentifier	 List Operation
.	TokenNameDOT	
doSetFromPrepared	TokenNameIdentifier	 do Set From Prepared
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ListType	TokenNameIdentifier	 List Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
preparedValue	TokenNameIdentifier	 prepared Value
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PREPARED_PLUS	TokenNameIdentifier	 PREPARED  PLUS
:	TokenNameCOLON	
ListOperation	TokenNameIdentifier	 List Operation
.	TokenNameDOT	
doPrependFromPrepared	TokenNameIdentifier	 do Prepend From Prepared
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ListType	TokenNameIdentifier	 List Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
preparedValue	TokenNameIdentifier	 prepared Value
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PLUS_PREPARED	TokenNameIdentifier	 PLUS  PREPARED
:	TokenNameCOLON	
ListOperation	TokenNameIdentifier	 List Operation
.	TokenNameDOT	
doAppendFromPrepared	TokenNameIdentifier	 do Append From Prepared
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ListType	TokenNameIdentifier	 List Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
preparedValue	TokenNameIdentifier	 prepared Value
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MINUS_PREPARED	TokenNameIdentifier	 MINUS  PREPARED
:	TokenNameCOLON	
ListOperation	TokenNameIdentifier	 List Operation
.	TokenNameDOT	
doDiscardFromPrepared	TokenNameIdentifier	 do Discard From Prepared
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ListType	TokenNameIdentifier	 List Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
preparedValue	TokenNameIdentifier	 prepared Value
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SET	TokenNameIdentifier	 SET
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SET	TokenNameIdentifier	 SET
:	TokenNameCOLON	
SetOperation	TokenNameIdentifier	 Set Operation
.	TokenNameDOT	
doSetFromPrepared	TokenNameIdentifier	 do Set From Prepared
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
(	TokenNameLPAREN	
SetType	TokenNameIdentifier	 Set Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
preparedValue	TokenNameIdentifier	 prepared Value
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PREPARED_PLUS	TokenNameIdentifier	 PREPARED  PLUS
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Unsupported syntax, cannot add to a prepared set"	TokenNameStringLiteral	Unsupported syntax, cannot add to a prepared set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PLUS_PREPARED	TokenNameIdentifier	 PLUS  PREPARED
:	TokenNameCOLON	
SetOperation	TokenNameIdentifier	 Set Operation
.	TokenNameDOT	
doAddFromPrepared	TokenNameIdentifier	 do Add From Prepared
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
(	TokenNameLPAREN	
SetType	TokenNameIdentifier	 Set Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
preparedValue	TokenNameIdentifier	 prepared Value
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MINUS_PREPARED	TokenNameIdentifier	 MINUS  PREPARED
:	TokenNameCOLON	
SetOperation	TokenNameIdentifier	 Set Operation
.	TokenNameDOT	
doDiscardFromPrepared	TokenNameIdentifier	 do Discard From Prepared
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
(	TokenNameLPAREN	
SetType	TokenNameIdentifier	 Set Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
preparedValue	TokenNameIdentifier	 prepared Value
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MAP	TokenNameIdentifier	 MAP
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SET	TokenNameIdentifier	 SET
:	TokenNameCOLON	
MapOperation	TokenNameIdentifier	 Map Operation
.	TokenNameDOT	
doSetFromPrepared	TokenNameIdentifier	 do Set From Prepared
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
(	TokenNameLPAREN	
MapType	TokenNameIdentifier	 Map Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
preparedValue	TokenNameIdentifier	 prepared Value
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PREPARED_PLUS	TokenNameIdentifier	 PREPARED  PLUS
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Unsupported syntax, cannot put to a prepared map"	TokenNameStringLiteral	Unsupported syntax, cannot put to a prepared map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PLUS_PREPARED	TokenNameIdentifier	 PLUS  PREPARED
:	TokenNameCOLON	
MapOperation	TokenNameIdentifier	 Map Operation
.	TokenNameDOT	
doPutFromPrepared	TokenNameIdentifier	 do Put From Prepared
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
(	TokenNameLPAREN	
MapType	TokenNameIdentifier	 Map Type
)	TokenNameRPAREN	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
preparedValue	TokenNameIdentifier	 prepared Value
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MINUS_PREPARED	TokenNameIdentifier	 MINUS  PREPARED
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Unsuppoted syntax, discard syntax for map not supported"	TokenNameStringLiteral	Unsuppoted syntax, discard syntax for map not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SET	TokenNameIdentifier	 SET
:	TokenNameCOLON	
ColumnOperation	TokenNameIdentifier	 Column Operation
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
(	TokenNameLPAREN	
preparedValue	TokenNameIdentifier	 prepared Value
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PREPARED_PLUS	TokenNameIdentifier	 PREPARED  PLUS
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
(	TokenNameLPAREN	
"Unsupported syntax for increment, must be of the form X = X + <value>"	TokenNameStringLiteral	Unsupported syntax for increment, must be of the form X = X + <value>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PLUS_PREPARED	TokenNameIdentifier	 PLUS  PREPARED
:	TokenNameCOLON	
ColumnOperation	TokenNameIdentifier	 Column Operation
.	TokenNameDOT	
CounterInc	TokenNameIdentifier	 Counter Inc
(	TokenNameLPAREN	
preparedValue	TokenNameIdentifier	 prepared Value
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MINUS_PREPARED	TokenNameIdentifier	 MINUS  PREPARED
:	TokenNameCOLON	
ColumnOperation	TokenNameIdentifier	 Column Operation
.	TokenNameDOT	
CounterDec	TokenNameIdentifier	 Counter Dec
(	TokenNameLPAREN	
preparedValue	TokenNameIdentifier	 prepared Value
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
,	TokenNameCOMMA	
validator	TokenNameIdentifier	 validator
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addBoundNames	TokenNameIdentifier	 add Bound Names
(	TokenNameLPAREN	
ColumnSpecification	TokenNameIdentifier	 Column Specification
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
ColumnSpecification	TokenNameIdentifier	 Column Specification
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
boundNames	TokenNameIdentifier	 bound Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
preparedValue	TokenNameIdentifier	 prepared Value
.	TokenNameDOT	
isBindMarker	TokenNameIdentifier	 is Bind Marker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
boundNames	TokenNameIdentifier	 bound Names
[	TokenNameLBRACKET	
preparedValue	TokenNameIdentifier	 prepared Value
.	TokenNameDOT	
bindIndex	TokenNameIdentifier	 bind Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
preparedValue	TokenNameIdentifier	 prepared Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresRead	TokenNameIdentifier	 requires Read
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
validator	TokenNameIdentifier	 validator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only prepared operation requiring a read is list discard 	TokenNameCOMMENT_LINE	Only prepared operation requiring a read is list discard 
return	TokenNamereturn	
(	TokenNameLPAREN	
validator	TokenNameIdentifier	 validator
instanceof	TokenNameinstanceof	
ListType	TokenNameIdentifier	 List Type
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
kind	TokenNameIdentifier	 kind
==	TokenNameEQUAL_EQUAL	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
MINUS_PREPARED	TokenNameIdentifier	 MINUS  PREPARED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isPotentialCounterOperation	TokenNameIdentifier	 is Potential Counter Operation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
kind	TokenNameIdentifier	 kind
==	TokenNameEQUAL_EQUAL	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
PLUS_PREPARED	TokenNameIdentifier	 PLUS  PREPARED
||	TokenNameOR_OR	
kind	TokenNameIdentifier	 kind
==	TokenNameEQUAL_EQUAL	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
MINUS_PREPARED	TokenNameIdentifier	 MINUS  PREPARED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
PREPARED	TokenNameIdentifier	 PREPARED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
