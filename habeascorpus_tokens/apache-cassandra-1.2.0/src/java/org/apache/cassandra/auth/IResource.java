/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
auth	TokenNameIdentifier	 auth
;	TokenNameSEMICOLON	
/** * The interface at the core of Cassandra authorization. * * Represents a resource in the hierarchy. * Currently just one resource type is supported by Cassandra * @see DataResource */	TokenNameCOMMENT_JAVADOC	 The interface at the core of Cassandra authorization. * Represents a resource in the hierarchy. Currently just one resource type is supported by Cassandra @see DataResource 
public	TokenNamepublic	
interface	TokenNameinterface	
IResource	TokenNameIdentifier	 I Resource
{	TokenNameLBRACE	
/** * @return printable name of the resource. */	TokenNameCOMMENT_JAVADOC	 @return printable name of the resource. 
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets next resource in the hierarchy. Call hasParent first to make sure there is one. * * @return Resource parent (or IllegalStateException if there is none). Never a null. */	TokenNameCOMMENT_JAVADOC	 Gets next resource in the hierarchy. Call hasParent first to make sure there is one. * @return Resource parent (or IllegalStateException if there is none). Never a null. 
IResource	TokenNameIdentifier	 I Resource
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicates whether or not this resource has a parent in the hierarchy. * * Please perform this check before calling getParent() method. * @return Whether or not the resource has a parent. */	TokenNameCOMMENT_JAVADOC	 Indicates whether or not this resource has a parent in the hierarchy. * Please perform this check before calling getParent() method. @return Whether or not the resource has a parent. 
boolean	TokenNameboolean	
hasParent	TokenNameIdentifier	 has Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return Whether or not this resource exists in Cassandra. */	TokenNameCOMMENT_JAVADOC	 @return Whether or not this resource exists in Cassandra. 
boolean	TokenNameboolean	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
