package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
execution	TokenNameIdentifier	 execution
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Provides a skeleton implementation for execution listeners. The methods of this class are empty. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Provides a skeleton implementation for execution listeners. The methods of this class are empty. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
AbstractExecutionListener	TokenNameIdentifier	 Abstract Execution Listener
implements	TokenNameimplements	
ExecutionListener	TokenNameIdentifier	 Execution Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
projectDiscoveryStarted	TokenNameIdentifier	 project Discovery Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
sessionStarted	TokenNameIdentifier	 session Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
sessionEnded	TokenNameIdentifier	 session Ended
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
projectSkipped	TokenNameIdentifier	 project Skipped
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
projectStarted	TokenNameIdentifier	 project Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
projectSucceeded	TokenNameIdentifier	 project Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
projectFailed	TokenNameIdentifier	 project Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
forkStarted	TokenNameIdentifier	 fork Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
forkSucceeded	TokenNameIdentifier	 fork Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
forkFailed	TokenNameIdentifier	 fork Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mojoSkipped	TokenNameIdentifier	 mojo Skipped
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mojoStarted	TokenNameIdentifier	 mojo Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mojoSucceeded	TokenNameIdentifier	 mojo Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mojoFailed	TokenNameIdentifier	 mojo Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
forkedProjectStarted	TokenNameIdentifier	 forked Project Started
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
forkedProjectSucceeded	TokenNameIdentifier	 forked Project Succeeded
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
forkedProjectFailed	TokenNameIdentifier	 forked Project Failed
(	TokenNameLPAREN	
ExecutionEvent	TokenNameIdentifier	 Execution Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// default does nothing 	TokenNameCOMMENT_LINE	default does nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
