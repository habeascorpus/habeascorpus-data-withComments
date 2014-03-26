package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
grouping	TokenNameIdentifier	 grouping
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Collector	TokenNameIdentifier	 Collector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Scorer	TokenNameIdentifier	 Scorer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BytesRef	TokenNameIdentifier	 Bytes Ref
;	TokenNameSEMICOLON	
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
/** * A collector that collects all groups that match the * query. Only the group value is collected, and the order * is undefined. This collector does not determine * the most relevant document of a group. * * <p/> * This is an abstract version. Concrete implementations define * what a group actually is and how it is internally collected. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A collector that collects all groups that match the query. Only the group value is collected, and the order is undefined. This collector does not determine the most relevant document of a group. * <p/> This is an abstract version. Concrete implementations define what a group actually is and how it is internally collected. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractAllGroupsCollector	TokenNameIdentifier	 Abstract All Groups Collector
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
/** * Returns the total number of groups for the executed search. * This is a convenience method. The following code snippet has the same effect: <pre>getGroups().size()</pre> * * @return The total number of groups for the executed search */	TokenNameCOMMENT_JAVADOC	 Returns the total number of groups for the executed search. This is a convenience method. The following code snippet has the same effect: <pre>getGroups().size()</pre> * @return The total number of groups for the executed search 
public	TokenNamepublic	
int	TokenNameint	
getGroupCount	TokenNameIdentifier	 get Group Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the group values * <p/> * This is an unordered collections of group values. For each group that matched the query there is a {@link BytesRef} * representing a group value. * * @return the group values */	TokenNameCOMMENT_JAVADOC	 Returns the group values <p/> This is an unordered collections of group values. For each group that matched the query there is a {@link BytesRef} representing a group value. * @return the group values 
public	TokenNamepublic	
abstract	TokenNameabstract	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Empty not necessary 	TokenNameCOMMENT_LINE	Empty not necessary 
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
