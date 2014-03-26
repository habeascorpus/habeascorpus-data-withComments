package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
/** * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
PathTranslator	TokenNameIdentifier	 Path Translator
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
PathTranslator	TokenNameIdentifier	 Path Translator
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
alignToBaseDirectory	TokenNameIdentifier	 align To Base Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
unalignFromBaseDirectory	TokenNameIdentifier	 unalign From Base Directory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
basedir	TokenNameIdentifier	 basedir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
