package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
FieldConfig	TokenNameIdentifier	 Field Config
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
/** * This attribute enables the user to define a default boost per field. * it's used by {@link FieldBoostMapFCListener#buildFieldConfig(FieldConfig)} * * @deprecated * */	TokenNameCOMMENT_JAVADOC	 This attribute enables the user to define a default boost per field. it's used by {@link FieldBoostMapFCListener#buildFieldConfig(FieldConfig)} * @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
FieldBoostMapAttribute	TokenNameIdentifier	 Field Boost Map Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** * @param boosts a mapping from field name to its default boost */	TokenNameCOMMENT_JAVADOC	 @param boosts a mapping from field name to its default boost 
public	TokenNamepublic	
void	TokenNamevoid	
setFieldBoostMap	TokenNameIdentifier	 set Field Boost Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
boosts	TokenNameIdentifier	 boosts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
getFieldBoostMap	TokenNameIdentifier	 get Field Boost Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
