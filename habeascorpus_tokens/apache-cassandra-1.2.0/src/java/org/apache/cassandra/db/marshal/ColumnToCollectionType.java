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
marshal	TokenNameIdentifier	 marshal
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
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
ImmutableMap	TokenNameIdentifier	 Immutable Map
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
extends	TokenNameextends	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
{	TokenNameLBRACE	
// interning instances 	TokenNameCOMMENT_LINE	interning instances 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
CollectionType	TokenNameIdentifier	 Collection Type
>	TokenNameGREATER	
,	TokenNameCOMMA	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
>	TokenNameGREATER	
instances	TokenNameIdentifier	 instances
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
CollectionType	TokenNameIdentifier	 Collection Type
>	TokenNameGREATER	
,	TokenNameCOMMA	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
CollectionType	TokenNameIdentifier	 Collection Type
>	TokenNameGREATER	
defined	TokenNameIdentifier	 defined
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
TypeParser	TokenNameIdentifier	 Type Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
SyntaxException	TokenNameIdentifier	 Syntax Exception
,	TokenNameCOMMA	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getCollectionsParameters	TokenNameIdentifier	 get Collections Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
synchronized	TokenNamesynchronized	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
CollectionType	TokenNameIdentifier	 Collection Type
>	TokenNameGREATER	
defined	TokenNameIdentifier	 defined
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
defined	TokenNameIdentifier	 defined
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
defined	TokenNameIdentifier	 defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
(	TokenNameLPAREN	
defined	TokenNameIdentifier	 defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instances	TokenNameIdentifier	 instances
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
defined	TokenNameIdentifier	 defined
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
CollectionType	TokenNameIdentifier	 Collection Type
>	TokenNameGREATER	
defined	TokenNameIdentifier	 defined
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
defined	TokenNameIdentifier	 defined
=	TokenNameEQUAL	
ImmutableMap	TokenNameIdentifier	 Immutable Map
.	TokenNameDOT	
copyOf	TokenNameIdentifier	 copy Of
(	TokenNameLPAREN	
defined	TokenNameIdentifier	 defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"ColumnToCollectionType should only be used in composite types, never alone"	TokenNameStringLiteral	ColumnToCollectionType should only be used in composite types, never alone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareCollectionMembers	TokenNameIdentifier	 compare Collection Members
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
collectionName	TokenNameIdentifier	 collection Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CollectionType	TokenNameIdentifier	 Collection Type
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
defined	TokenNameIdentifier	 defined
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
collectionName	TokenNameIdentifier	 collection Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
collectionName	TokenNameIdentifier	 collection Name
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not defined as a collection"	TokenNameStringLiteral	 is not defined as a collection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
nameComparator	TokenNameIdentifier	 name Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
decompose	TokenNameIdentifier	 decompose
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BytesType	TokenNameIdentifier	 Bytes Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
hexToBytes	TokenNameIdentifier	 hex To Bytes
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
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
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"cannot parse '%s' as hex bytes"	TokenNameStringLiteral	cannot parse '%s' as hex bytes
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"ColumnToCollectionType should only be used in composite types, never alone"	TokenNameStringLiteral	ColumnToCollectionType should only be used in composite types, never alone
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
validateCollectionMember	TokenNameIdentifier	 validate Collection Member
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
collectionName	TokenNameIdentifier	 collection Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
{	TokenNameLBRACE	
CollectionType	TokenNameIdentifier	 Collection Type
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
defined	TokenNameIdentifier	 defined
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
collectionName	TokenNameIdentifier	 collection Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
MarshalException	TokenNameIdentifier	 Marshal Exception
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
collectionName	TokenNameIdentifier	 collection Name
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not defined as a collection"	TokenNameStringLiteral	 is not defined as a collection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
nameComparator	TokenNameIdentifier	 name Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatibleWith	TokenNameIdentifier	 is Compatible With
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
instanceof	TokenNameinstanceof	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
)	TokenNameRPAREN	
previous	TokenNameIdentifier	 previous
;	TokenNameSEMICOLON	
// We are compatible if we have all the definitions previous have (but we can have more). 	TokenNameCOMMENT_LINE	We are compatible if we have all the definitions previous have (but we can have more). 
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
CollectionType	TokenNameIdentifier	 Collection Type
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
defined	TokenNameIdentifier	 defined
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isCompatibleWith	TokenNameIdentifier	 is Compatible With
(	TokenNameLPAREN	
defined	TokenNameIdentifier	 defined
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
return	TokenNamereturn	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeParser	TokenNameIdentifier	 Type Parser
.	TokenNameDOT	
stringifyCollectionsParameters	TokenNameIdentifier	 stringify Collections Parameters
(	TokenNameLPAREN	
defined	TokenNameIdentifier	 defined
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
