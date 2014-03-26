/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
categoryexplorer	TokenNameIdentifier	 categoryexplorer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
LogRecord	TokenNameIdentifier	 Log Record
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
LogRecordFilter	TokenNameIdentifier	 Log Record Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
/** * An implementation of LogRecordFilter based on a CategoryExplorerModel * * @author Richard Wan */	TokenNameCOMMENT_JAVADOC	 An implementation of LogRecordFilter based on a CategoryExplorerModel * @author Richard Wan 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryExplorerLogRecordFilter	TokenNameIdentifier	 Category Explorer Log Record Filter
implements	TokenNameimplements	
LogRecordFilter	TokenNameIdentifier	 Log Record Filter
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
_model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
CategoryExplorerLogRecordFilter	TokenNameIdentifier	 Category Explorer Log Record Filter
(	TokenNameLPAREN	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * @return true if the CategoryExplorer model specified at construction * is accepting the category of the specified LogRecord. Has a side-effect * of adding the CategoryPath of the LogRecord to the explorer model * if the CategoryPath is new. */	TokenNameCOMMENT_JAVADOC	 @return true if the CategoryExplorer model specified at construction is accepting the category of the specified LogRecord. Has a side-effect of adding the CategoryPath of the LogRecord to the explorer model if the CategoryPath is new. 
public	TokenNamepublic	
boolean	TokenNameboolean	
passes	TokenNameIdentifier	 passes
(	TokenNameLPAREN	
LogRecord	TokenNameIdentifier	 Log Record
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
.	TokenNameDOT	
getCategory	TokenNameIdentifier	 get Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_model	TokenNameIdentifier	 model
.	TokenNameDOT	
isCategoryPathActive	TokenNameIdentifier	 is Category Path Active
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the counters for the contained CategoryNodes to zero. */	TokenNameCOMMENT_JAVADOC	 Resets the counters for the contained CategoryNodes to zero. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resetAllNodes	TokenNameIdentifier	 reset All Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
void	TokenNamevoid	
resetAllNodes	TokenNameIdentifier	 reset All Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
_model	TokenNameIdentifier	 model
.	TokenNameDOT	
getRootCategoryNode	TokenNameIdentifier	 get Root Category Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
depthFirstEnumeration	TokenNameIdentifier	 depth First Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
resetNumberOfContainedRecords	TokenNameIdentifier	 reset Number Of Contained Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_model	TokenNameIdentifier	 model
.	TokenNameDOT	
nodeChanged	TokenNameIdentifier	 node Changed
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
