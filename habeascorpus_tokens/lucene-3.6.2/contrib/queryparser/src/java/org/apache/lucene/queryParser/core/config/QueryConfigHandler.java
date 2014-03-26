package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringUtils	TokenNameIdentifier	 String Utils
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
Attribute	TokenNameIdentifier	 Attribute
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
AttributeSource	TokenNameIdentifier	 Attribute Source
;	TokenNameSEMICOLON	
/** * This class can be used to hold any query configuration and no field * configuration. For field configuration, it creates a empty * {@link FieldConfig} object and delegate it to field config listeners, * these are responsible for setting up all the field configuration. * * {@link QueryConfigHandler} should be extended by classes that intends to * provide configuration to {@link QueryNodeProcessor} objects. * * This class extends {@link AttributeSource}, so {@link Attribute}s can be * attached to it. * * The class that extends {@link QueryConfigHandler} should also provide * {@link FieldConfig} objects for each collection field. * * @see Attribute * @see FieldConfig * @see FieldConfigListener * @see QueryConfigHandler * */	TokenNameCOMMENT_JAVADOC	 This class can be used to hold any query configuration and no field configuration. For field configuration, it creates a empty {@link FieldConfig} object and delegate it to field config listeners, these are responsible for setting up all the field configuration. * {@link QueryConfigHandler} should be extended by classes that intends to provide configuration to {@link QueryNodeProcessor} objects. * This class extends {@link AttributeSource}, so {@link Attribute}s can be attached to it. * The class that extends {@link QueryConfigHandler} should also provide {@link FieldConfig} objects for each collection field. * @see Attribute @see FieldConfig @see FieldConfigListener @see QueryConfigHandler 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
extends	TokenNameextends	
AbstractQueryConfig	TokenNameIdentifier	 Abstract Query Config
{	TokenNameLBRACE	
private	TokenNameprivate	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
FieldConfigListener	TokenNameIdentifier	 Field Config Listener
>	TokenNameGREATER	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
FieldConfigListener	TokenNameIdentifier	 Field Config Listener
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an implementation of * {@link FieldConfig} for a specific field name. If the implemented * {@link QueryConfigHandler} does not know a specific field name, it may * return <code>null</code>, indicating there is no configuration for that * field. * * @param fieldName * the field name * @return a {@link FieldConfig} object containing the field name * configuration or <code>null</code>, if the implemented * {@link QueryConfigHandler} has no configuration for that field * * @deprecated use {@link #getFieldConfig(String)} instead * */	TokenNameCOMMENT_JAVADOC	 Returns an implementation of {@link FieldConfig} for a specific field name. If the implemented {@link QueryConfigHandler} does not know a specific field name, it may return <code>null</code>, indicating there is no configuration for that field. * @param fieldName the field name @return a {@link FieldConfig} object containing the field name configuration or <code>null</code>, if the implemented {@link QueryConfigHandler} has no configuration for that field * @deprecated use {@link #getFieldConfig(String)} instead 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
FieldConfig	TokenNameIdentifier	 Field Config
getFieldConfig	TokenNameIdentifier	 get Field Config
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFieldConfig	TokenNameIdentifier	 get Field Config
(	TokenNameLPAREN	
StringUtils	TokenNameIdentifier	 String Utils
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an implementation of * {@link FieldConfig} for a specific field name. If the implemented * {@link QueryConfigHandler} does not know a specific field name, it may * return <code>null</code>, indicating there is no configuration for that * field. * * @param fieldName * the field name * @return a {@link FieldConfig} object containing the field name * configuration or <code>null</code>, if the implemented * {@link QueryConfigHandler} has no configuration for that field */	TokenNameCOMMENT_JAVADOC	 Returns an implementation of {@link FieldConfig} for a specific field name. If the implemented {@link QueryConfigHandler} does not know a specific field name, it may return <code>null</code>, indicating there is no configuration for that field. * @param fieldName the field name @return a {@link FieldConfig} object containing the field name configuration or <code>null</code>, if the implemented {@link QueryConfigHandler} has no configuration for that field 
public	TokenNamepublic	
FieldConfig	TokenNameIdentifier	 Field Config
getFieldConfig	TokenNameIdentifier	 get Field Config
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldConfig	TokenNameIdentifier	 Field Config
fieldConfig	TokenNameIdentifier	 field Config
=	TokenNameEQUAL	
new	TokenNamenew	
FieldConfig	TokenNameIdentifier	 Field Config
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldConfigListener	TokenNameIdentifier	 Field Config Listener
listener	TokenNameIdentifier	 listener
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
listeners	TokenNameIdentifier	 listeners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
buildFieldConfig	TokenNameIdentifier	 build Field Config
(	TokenNameLPAREN	
fieldConfig	TokenNameIdentifier	 field Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fieldConfig	TokenNameIdentifier	 field Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a listener. The added listeners are called in the order they are * added. * * @param listener * the listener to be added */	TokenNameCOMMENT_JAVADOC	 Adds a listener. The added listeners are called in the order they are added. * @param listener the listener to be added 
public	TokenNamepublic	
void	TokenNamevoid	
addFieldConfigListener	TokenNameIdentifier	 add Field Config Listener
(	TokenNameLPAREN	
FieldConfigListener	TokenNameIdentifier	 Field Config Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
