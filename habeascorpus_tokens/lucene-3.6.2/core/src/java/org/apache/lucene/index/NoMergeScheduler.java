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
/** * A {@link MergeScheduler} which never executes any merges. It is also a * singleton and can be accessed through {@link NoMergeScheduler#INSTANCE}. Use * it if you want to prevent an {@link IndexWriter} from ever executing merges, * irregardless of the {@link MergePolicy} used. Note that you can achieve the * same thing by using {@link NoMergePolicy}, however with * {@link NoMergeScheduler} you also ensure that no unnecessary code of any * {@link MergeScheduler} implementation is ever executed. Hence it is * recommended to use both if you want to disable merges from ever happening. */	TokenNameCOMMENT_JAVADOC	 A {@link MergeScheduler} which never executes any merges. It is also a singleton and can be accessed through {@link NoMergeScheduler#INSTANCE}. Use it if you want to prevent an {@link IndexWriter} from ever executing merges, irregardless of the {@link MergePolicy} used. Note that you can achieve the same thing by using {@link NoMergePolicy}, however with {@link NoMergeScheduler} you also ensure that no unnecessary code of any {@link MergeScheduler} implementation is ever executed. Hence it is recommended to use both if you want to disable merges from ever happening. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NoMergeScheduler	TokenNameIdentifier	 No Merge Scheduler
extends	TokenNameextends	
MergeScheduler	TokenNameIdentifier	 Merge Scheduler
{	TokenNameLBRACE	
/** The single instance of {@link NoMergeScheduler} */	TokenNameCOMMENT_JAVADOC	 The single instance of {@link NoMergeScheduler} 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
MergeScheduler	TokenNameIdentifier	 Merge Scheduler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
NoMergeScheduler	TokenNameIdentifier	 No Merge Scheduler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NoMergeScheduler	TokenNameIdentifier	 No Merge Scheduler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// prevent instantiation 	TokenNameCOMMENT_LINE	prevent instantiation 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
