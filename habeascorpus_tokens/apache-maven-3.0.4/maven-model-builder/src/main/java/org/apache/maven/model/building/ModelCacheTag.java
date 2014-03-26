package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
building	TokenNameIdentifier	 building
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
DependencyManagement	TokenNameIdentifier	 Dependency Management
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
;	TokenNameSEMICOLON	
/** * Describes a tag used by the model builder to access a {@link ModelCache}. This interface basically aggregates a name * and a class to provide some type safety when working with the otherwise untyped cache. * * @author Benjamin Bentmann * @param <T> The type of data associated with the tag. */	TokenNameCOMMENT_JAVADOC	 Describes a tag used by the model builder to access a {@link ModelCache}. This interface basically aggregates a name and a class to provide some type safety when working with the otherwise untyped cache. * @author Benjamin Bentmann @param <T> The type of data associated with the tag. 
interface	TokenNameinterface	
ModelCacheTag	TokenNameIdentifier	 Model Cache Tag
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Gets the name of the tag. * * @return The name of the tag, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the name of the tag. * @return The name of the tag, must not be {@code null}. 
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the type of data associated with this tag. * * @return The type of data, must not be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Gets the type of data associated with this tag. * @return The type of data, must not be {@code null}. 
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a copy of the data suitable for storage in the cache. The original data to store can be mutated after the * cache is populated but the state of the cache must not change so we need to make a copy. * * @param data The data to store in the cache, must not be {@code null}. * @return The data being stored in the cache, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a copy of the data suitable for storage in the cache. The original data to store can be mutated after the cache is populated but the state of the cache must not change so we need to make a copy. * @param data The data to store in the cache, must not be {@code null}. @return The data being stored in the cache, never {@code null}. 
T	TokenNameIdentifier	 T
intoCache	TokenNameIdentifier	 into Cache
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a copy of the data suitable for retrieval from the cache. The retrieved data can be mutated after the * cache is queried but the state of the cache must not change so we need to make a copy. * * @param data The data to retrieve from the cache, must not be {@code null}. * @return The data being retrieved from the cache, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a copy of the data suitable for retrieval from the cache. The retrieved data can be mutated after the cache is queried but the state of the cache must not change so we need to make a copy. * @param data The data to retrieve from the cache, must not be {@code null}. @return The data being retrieved from the cache, never {@code null}. 
T	TokenNameIdentifier	 T
fromCache	TokenNameIdentifier	 from Cache
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The tag used to denote raw model data. */	TokenNameCOMMENT_JAVADOC	 The tag used to denote raw model data. 
ModelCacheTag	TokenNameIdentifier	 Model Cache Tag
<	TokenNameLESS	
ModelData	TokenNameIdentifier	 Model Data
>	TokenNameGREATER	
RAW	TokenNameIdentifier	 RAW
=	TokenNameEQUAL	
new	TokenNamenew	
ModelCacheTag	TokenNameIdentifier	 Model Cache Tag
<	TokenNameLESS	
ModelData	TokenNameIdentifier	 Model Data
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"raw"	TokenNameStringLiteral	raw
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
ModelData	TokenNameIdentifier	 Model Data
>	TokenNameGREATER	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ModelData	TokenNameIdentifier	 Model Data
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ModelData	TokenNameIdentifier	 Model Data
intoCache	TokenNameIdentifier	 into Cache
(	TokenNameLPAREN	
ModelData	TokenNameIdentifier	 Model Data
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ModelData	TokenNameIdentifier	 Model Data
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getGroupId	TokenNameIdentifier	 get Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getArtifactId	TokenNameIdentifier	 get Artifact Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ModelData	TokenNameIdentifier	 Model Data
fromCache	TokenNameIdentifier	 from Cache
(	TokenNameLPAREN	
ModelData	TokenNameIdentifier	 Model Data
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intoCache	TokenNameIdentifier	 into Cache
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The tag used to denote an effective dependency management section from an imported model. */	TokenNameCOMMENT_JAVADOC	 The tag used to denote an effective dependency management section from an imported model. 
ModelCacheTag	TokenNameIdentifier	 Model Cache Tag
<	TokenNameLESS	
DependencyManagement	TokenNameIdentifier	 Dependency Management
>	TokenNameGREATER	
IMPORT	TokenNameIdentifier	 IMPORT
=	TokenNameEQUAL	
new	TokenNamenew	
ModelCacheTag	TokenNameIdentifier	 Model Cache Tag
<	TokenNameLESS	
DependencyManagement	TokenNameIdentifier	 Dependency Management
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"import"	TokenNameStringLiteral	import
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
DependencyManagement	TokenNameIdentifier	 Dependency Management
>	TokenNameGREATER	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DependencyManagement	TokenNameIdentifier	 Dependency Management
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DependencyManagement	TokenNameIdentifier	 Dependency Management
intoCache	TokenNameIdentifier	 into Cache
(	TokenNameLPAREN	
DependencyManagement	TokenNameIdentifier	 Dependency Management
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DependencyManagement	TokenNameIdentifier	 Dependency Management
fromCache	TokenNameIdentifier	 from Cache
(	TokenNameLPAREN	
DependencyManagement	TokenNameIdentifier	 Dependency Management
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intoCache	TokenNameIdentifier	 into Cache
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
