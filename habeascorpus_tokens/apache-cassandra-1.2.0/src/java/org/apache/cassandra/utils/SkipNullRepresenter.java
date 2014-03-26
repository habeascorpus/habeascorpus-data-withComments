/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
yaml	TokenNameIdentifier	 yaml
.	TokenNameDOT	
snakeyaml	TokenNameIdentifier	 snakeyaml
.	TokenNameDOT	
introspector	TokenNameIdentifier	 introspector
.	TokenNameDOT	
Property	TokenNameIdentifier	 Property
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
yaml	TokenNameIdentifier	 yaml
.	TokenNameDOT	
snakeyaml	TokenNameIdentifier	 snakeyaml
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
NodeTuple	TokenNameIdentifier	 Node Tuple
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
yaml	TokenNameIdentifier	 yaml
.	TokenNameDOT	
snakeyaml	TokenNameIdentifier	 snakeyaml
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
Tag	TokenNameIdentifier	 Tag
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
yaml	TokenNameIdentifier	 yaml
.	TokenNameDOT	
snakeyaml	TokenNameIdentifier	 snakeyaml
.	TokenNameDOT	
representer	TokenNameIdentifier	 representer
.	TokenNameDOT	
Representer	TokenNameIdentifier	 Representer
;	TokenNameSEMICOLON	
/* used to prevent null values from being included in generated YAML */	TokenNameCOMMENT_BLOCK	 used to prevent null values from being included in generated YAML 
public	TokenNamepublic	
class	TokenNameclass	
SkipNullRepresenter	TokenNameIdentifier	 Skip Null Representer
extends	TokenNameextends	
Representer	TokenNameIdentifier	 Representer
{	TokenNameLBRACE	
protected	TokenNameprotected	
NodeTuple	TokenNameIdentifier	 Node Tuple
representJavaBeanProperty	TokenNameIdentifier	 represent Java Bean Property
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
javaBean	TokenNameIdentifier	 java Bean
,	TokenNameCOMMA	
Property	TokenNameIdentifier	 Property
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
propertyValue	TokenNameIdentifier	 property Value
,	TokenNameCOMMA	
Tag	TokenNameIdentifier	 Tag
customTag	TokenNameIdentifier	 custom Tag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
propertyValue	TokenNameIdentifier	 property Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
representJavaBeanProperty	TokenNameIdentifier	 represent Java Bean Property
(	TokenNameLPAREN	
javaBean	TokenNameIdentifier	 java Bean
,	TokenNameCOMMA	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
propertyValue	TokenNameIdentifier	 property Value
,	TokenNameCOMMA	
customTag	TokenNameIdentifier	 custom Tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
