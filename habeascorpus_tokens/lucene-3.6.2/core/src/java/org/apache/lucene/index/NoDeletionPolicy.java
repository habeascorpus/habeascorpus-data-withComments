package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * An {@link IndexDeletionPolicy} which keeps all index commits around, never * deleting them. This class is a singleton and can be accessed by referencing * {@link #INSTANCE}. */	TokenNameCOMMENT_JAVADOC	 An {@link IndexDeletionPolicy} which keeps all index commits around, never deleting them. This class is a singleton and can be accessed by referencing {@link #INSTANCE}. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NoDeletionPolicy	TokenNameIdentifier	 No Deletion Policy
implements	TokenNameimplements	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
{	TokenNameLBRACE	
/** The single instance of this class. */	TokenNameCOMMENT_JAVADOC	 The single instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
NoDeletionPolicy	TokenNameIdentifier	 No Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NoDeletionPolicy	TokenNameIdentifier	 No Deletion Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// keep private to avoid instantiation 	TokenNameCOMMENT_LINE	keep private to avoid instantiation 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onCommit	TokenNameIdentifier	 on Commit
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onInit	TokenNameIdentifier	 on Init
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
IndexCommit	TokenNameIdentifier	 Index Commit
>	TokenNameGREATER	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
