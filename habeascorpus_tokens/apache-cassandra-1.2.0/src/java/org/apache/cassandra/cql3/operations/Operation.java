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
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
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
ColumnSpecification	TokenNameIdentifier	 Column Specification
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
Term	TokenNameIdentifier	 Term
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
UpdateParameters	TokenNameIdentifier	 Update Parameters
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
interface	TokenNameinterface	
Operation	TokenNameIdentifier	 Operation
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
COLUMN	TokenNameIdentifier	 COLUMN
,	TokenNameCOMMA	
COUNTER	TokenNameIdentifier	 COUNTER
,	TokenNameCOMMA	
LIST	TokenNameIdentifier	 LIST
,	TokenNameCOMMA	
SET	TokenNameIdentifier	 SET
,	TokenNameCOMMA	
MAP	TokenNameIdentifier	 MAP
,	TokenNameCOMMA	
PREPARED	TokenNameIdentifier	 PREPARED
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
;	TokenNameSEMICOLON	
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
;	TokenNameSEMICOLON	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
