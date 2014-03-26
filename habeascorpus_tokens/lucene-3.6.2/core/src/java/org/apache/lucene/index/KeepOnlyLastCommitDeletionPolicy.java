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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * This {@link IndexDeletionPolicy} implementation that * keeps only the most recent commit and immediately removes * all prior commits after a new commit is done. This is * the default deletion policy. */	TokenNameCOMMENT_JAVADOC	 This {@link IndexDeletionPolicy} implementation that keeps only the most recent commit and immediately removes all prior commits after a new commit is done. This is the default deletion policy. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
KeepOnlyLastCommitDeletionPolicy	TokenNameIdentifier	 Keep Only Last Commit Deletion Policy
implements	TokenNameimplements	
IndexDeletionPolicy	TokenNameIdentifier	 Index Deletion Policy
{	TokenNameLBRACE	
/** * Deletes all commits except the most recent one. */	TokenNameCOMMENT_JAVADOC	 Deletes all commits except the most recent one. 
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
{	TokenNameLBRACE	
// Note that commits.size() should normally be 1: 	TokenNameCOMMENT_LINE	Note that commits.size() should normally be 1: 
onCommit	TokenNameIdentifier	 on Commit
(	TokenNameLPAREN	
commits	TokenNameIdentifier	 commits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Deletes all commits except the most recent one. */	TokenNameCOMMENT_JAVADOC	 Deletes all commits except the most recent one. 
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
{	TokenNameLBRACE	
// Note that commits.size() should normally be 2 (if not 	TokenNameCOMMENT_LINE	Note that commits.size() should normally be 2 (if not 
// called by onInit above): 	TokenNameCOMMENT_LINE	called by onInit above): 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commits	TokenNameIdentifier	 commits
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
