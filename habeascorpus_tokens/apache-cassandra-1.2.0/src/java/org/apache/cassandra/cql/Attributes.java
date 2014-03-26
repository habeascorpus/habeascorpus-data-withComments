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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
;	TokenNameSEMICOLON	
/** * Class to contain attributes for statements */	TokenNameCOMMENT_JAVADOC	 Class to contain attributes for statements 
public	TokenNamepublic	
class	TokenNameclass	
Attributes	TokenNameIdentifier	 Attributes
{	TokenNameLBRACE	
private	TokenNameprivate	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cLevel	TokenNameIdentifier	 c Level
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Long	TokenNameIdentifier	 Long
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
timeToLive	TokenNameIdentifier	 time To Live
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Attributes	TokenNameIdentifier	 Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Attributes	TokenNameIdentifier	 Attributes
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cLevel	TokenNameIdentifier	 c Level
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
int	TokenNameint	
timeToLive	TokenNameIdentifier	 time To Live
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cLevel	TokenNameIdentifier	 c Level
=	TokenNameEQUAL	
cLevel	TokenNameIdentifier	 c Level
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
timeToLive	TokenNameIdentifier	 time To Live
=	TokenNameEQUAL	
timeToLive	TokenNameIdentifier	 time To Live
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
getConsistencyLevel	TokenNameIdentifier	 get Consistency Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cLevel	TokenNameIdentifier	 c Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setConsistencyLevel	TokenNameIdentifier	 set Consistency Level
(	TokenNameLPAREN	
ConsistencyLevel	TokenNameIdentifier	 Consistency Level
cLevel	TokenNameIdentifier	 c Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cLevel	TokenNameIdentifier	 c Level
=	TokenNameEQUAL	
cLevel	TokenNameIdentifier	 c Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
getTimestamp	TokenNameIdentifier	 get Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTimestamp	TokenNameIdentifier	 set Timestamp
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
timestamp	TokenNameIdentifier	 timestamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getTimeToLive	TokenNameIdentifier	 get Time To Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
timeToLive	TokenNameIdentifier	 time To Live
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTimeToLive	TokenNameIdentifier	 set Time To Live
(	TokenNameLPAREN	
int	TokenNameint	
timeToLive	TokenNameIdentifier	 time To Live
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
timeToLive	TokenNameIdentifier	 time To Live
=	TokenNameEQUAL	
timeToLive	TokenNameIdentifier	 time To Live
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
"Attributes(consistency=%s, timestamp=%s, timeToLive=%s)"	TokenNameStringLiteral	Attributes(consistency=%s, timestamp=%s, timeToLive=%s)
,	TokenNameCOMMA	
cLevel	TokenNameIdentifier	 c Level
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
,	TokenNameCOMMA	
timeToLive	TokenNameIdentifier	 time To Live
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
