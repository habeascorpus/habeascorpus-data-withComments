/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
DecoratedKey	TokenNameIdentifier	 Decorated Key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
IPartitioner	TokenNameIdentifier	 I Partitioner
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * @deprecated Used by SSTables before version 'e'. * * Convert the on disk representation to a DecoratedKey object * @param key On disk representation * @return DecoratedKey object */	TokenNameCOMMENT_JAVADOC	 @deprecated Used by SSTables before version 'e'. * Convert the on disk representation to a DecoratedKey object @param key On disk representation @return DecoratedKey object 
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
convertFromDiskFormat	TokenNameIdentifier	 convert From Disk Format
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Transform key to object representation of the on-disk format. * * @param key the raw, client-facing key * @return decorated version of key */	TokenNameCOMMENT_JAVADOC	 Transform key to object representation of the on-disk format. * @param key the raw, client-facing key @return decorated version of key 
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
decorateKey	TokenNameIdentifier	 decorate Key
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Calculate a Token representing the approximate "middle" of the given * range. * * @return The approximate midpoint between left and right. */	TokenNameCOMMENT_JAVADOC	 Calculate a Token representing the approximate "middle" of the given range. * @return The approximate midpoint between left and right. 
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return The minimum possible Token in the range that is being partitioned. */	TokenNameCOMMENT_JAVADOC	 @return The minimum possible Token in the range that is being partitioned. 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getMinimumToken	TokenNameIdentifier	 get Minimum Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return a Token that can be used to route a given key * (This is NOT a method to create a Token from its string representation; * for that, use TokenFactory.fromString.) */	TokenNameCOMMENT_JAVADOC	 @return a Token that can be used to route a given key (This is NOT a method to create a Token from its string representation; for that, use TokenFactory.fromString.) 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return a randomly generated token */	TokenNameCOMMENT_JAVADOC	 @return a randomly generated token 
public	TokenNamepublic	
T	TokenNameIdentifier	 T
getRandomToken	TokenNameIdentifier	 get Random Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
TokenFactory	TokenNameIdentifier	 Token Factory
getTokenFactory	TokenNameIdentifier	 get Token Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return True if the implementing class preserves key order in the Tokens * it generates. */	TokenNameCOMMENT_JAVADOC	 @return True if the implementing class preserves key order in the Tokens it generates. 
public	TokenNamepublic	
boolean	TokenNameboolean	
preservesOrder	TokenNameIdentifier	 preserves Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Calculate the deltas between tokens in the ring in order to compare * relative sizes. * * @param sortedTokens a sorted List of Tokens * @return the mapping from 'token' to 'percentage of the ring owned by that token'. */	TokenNameCOMMENT_JAVADOC	 Calculate the deltas between tokens in the ring in order to compare relative sizes. * @param sortedTokens a sorted List of Tokens @return the mapping from 'token' to 'percentage of the ring owned by that token'. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
describeOwnership	TokenNameIdentifier	 describe Ownership
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
sortedTokens	TokenNameIdentifier	 sorted Tokens
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
<	TokenNameLESS	
R	TokenNameIdentifier	 R
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
R	TokenNameIdentifier	 R
minValue	TokenNameIdentifier	 min Value
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
R	TokenNameIdentifier	 R
>	TokenNameGREATER	
klass	TokenNameIdentifier	 klass
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
