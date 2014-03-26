package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
mapreduce	TokenNameIdentifier	 mapreduce
.	TokenNameDOT	
TaskAttemptContext	TokenNameIdentifier	 Task Attempt Context
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
Progressable	TokenNameIdentifier	 Progressable
{	TokenNameLBRACE	
private	TokenNameprivate	
TaskAttemptContext	TokenNameIdentifier	 Task Attempt Context
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
private	TokenNameprivate	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Progressable	TokenNameIdentifier	 Progressable
progressable	TokenNameIdentifier	 progressable
;	TokenNameSEMICOLON	
Progressable	TokenNameIdentifier	 Progressable
(	TokenNameLPAREN	
TaskAttemptContext	TokenNameIdentifier	 Task Attempt Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Progressable	TokenNameIdentifier	 Progressable
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
hadoop	TokenNameIdentifier	 hadoop
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Progressable	TokenNameIdentifier	 Progressable
progressable	TokenNameIdentifier	 progressable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
progressable	TokenNameIdentifier	 progressable
=	TokenNameEQUAL	
progressable	TokenNameIdentifier	 progressable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
progressable	TokenNameIdentifier	 progressable
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
