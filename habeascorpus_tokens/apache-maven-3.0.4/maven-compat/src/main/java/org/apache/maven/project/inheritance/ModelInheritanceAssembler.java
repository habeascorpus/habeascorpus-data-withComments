package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
inheritance	TokenNameIdentifier	 inheritance
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
Build	TokenNameIdentifier	 Build
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
/** * @author Jason van Zyl * @deprecated */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
ModelInheritanceAssembler	TokenNameIdentifier	 Model Inheritance Assembler
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ModelInheritanceAssembler	TokenNameIdentifier	 Model Inheritance Assembler
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
assembleModelInheritance	TokenNameIdentifier	 assemble Model Inheritance
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
childPathAdjustment	TokenNameIdentifier	 child Path Adjustment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
assembleModelInheritance	TokenNameIdentifier	 assemble Model Inheritance
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
assembleBuildInheritance	TokenNameIdentifier	 assemble Build Inheritance
(	TokenNameLPAREN	
Build	TokenNameIdentifier	 Build
childBuild	TokenNameIdentifier	 child Build
,	TokenNameCOMMA	
Build	TokenNameIdentifier	 Build
parentBuild	TokenNameIdentifier	 parent Build
,	TokenNameCOMMA	
boolean	TokenNameboolean	
handleAsInheriance	TokenNameIdentifier	 handle As Inheriance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
copyModel	TokenNameIdentifier	 copy Model
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
