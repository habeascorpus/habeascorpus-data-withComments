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
/** * Interface representing a position on the ring. * Both Token and DecoratedKey represent a position in the ring, a token being * less precise than a DecoratedKey (a token is really a range of keys). */	TokenNameCOMMENT_JAVADOC	 Interface representing a position on the ring. Both Token and DecoratedKey represent a position in the ring, a token being less precise than a DecoratedKey (a token is really a range of keys). 
public	TokenNamepublic	
interface	TokenNameinterface	
RingPosition	TokenNameIdentifier	 Ring Position
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isMinimum	TokenNameIdentifier	 is Minimum
(	TokenNameLPAREN	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
