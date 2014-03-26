package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
sstable	TokenNameIdentifier	 sstable
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
FilterFactory	TokenNameIdentifier	 Filter Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DescriptorTest	TokenNameIdentifier	 Descriptor Test
{	TokenNameLBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testLegacy	TokenNameIdentifier	 test Legacy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Descriptor	TokenNameIdentifier	 Descriptor
descriptor	TokenNameIdentifier	 descriptor
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
"Keyspace1-userActionUtilsKey-9-Data.db"	TokenNameStringLiteral	Keyspace1-userActionUtilsKey-9-Data.db
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LEGACY	TokenNameIdentifier	 LEGACY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
filterType	TokenNameIdentifier	 filter Type
==	TokenNameEQUAL_EQUAL	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHA	TokenNameIdentifier	 SHA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testVersion	TokenNameIdentifier	 test Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// letter only 	TokenNameCOMMENT_LINE	letter only 
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
"Keyspace1-Standard1-h-1-Data.db"	TokenNameStringLiteral	Keyspace1-Standard1-h-1-Data.db
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
"h"	TokenNameStringLiteral	h
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// multiple letters 	TokenNameCOMMENT_LINE	multiple letters 
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
"Keyspace1-Standard1-ha-1-Data.db"	TokenNameStringLiteral	Keyspace1-Standard1-ha-1-Data.db
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
"ha"	TokenNameStringLiteral	ha
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hypothetical two-letter g version 	TokenNameCOMMENT_LINE	hypothetical two-letter g version 
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
"Keyspace1-Standard1-gz-1-Data.db"	TokenNameStringLiteral	Keyspace1-Standard1-gz-1-Data.db
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
"gz"	TokenNameStringLiteral	gz
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
tracksMaxTimestamp	TokenNameIdentifier	 tracks Max Timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testMurmurBloomFilter	TokenNameIdentifier	 test Murmur Bloom Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
"Keyspace1-Standard1-hz-1-Data.db"	TokenNameStringLiteral	Keyspace1-Standard1-hz-1-Data.db
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"hz"	TokenNameStringLiteral	hz
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
filterType	TokenNameIdentifier	 filter Type
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR2	TokenNameIdentifier	 MURMU R2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
"Keyspace1-Standard1-ia-1-Data.db"	TokenNameStringLiteral	Keyspace1-Standard1-ia-1-Data.db
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"ia"	TokenNameStringLiteral	ia
,	TokenNameCOMMA	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
filterType	TokenNameIdentifier	 filter Type
,	TokenNameCOMMA	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
