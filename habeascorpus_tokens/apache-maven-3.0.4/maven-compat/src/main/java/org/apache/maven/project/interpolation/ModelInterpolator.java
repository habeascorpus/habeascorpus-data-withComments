package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
interpolation	TokenNameIdentifier	 interpolation
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
Model	TokenNameIdentifier	 Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
.	TokenNameDOT	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * @author jdcasey * <p/> * Created on Feb 2, 2005 */	TokenNameCOMMENT_JAVADOC	 @author jdcasey <p/> Created on Feb 2, 2005 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
ModelInterpolator	TokenNameIdentifier	 Model Interpolator
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
DEFAULT_BUILD_TIMESTAMP_FORMAT	TokenNameIdentifier	 DEFAULT  BUILD  TIMESTAMP  FORMAT
=	TokenNameEQUAL	
"yyyyMMdd-HHmm"	TokenNameStringLiteral	yyyyMMdd-HHmm
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
BUILD_TIMESTAMP_FORMAT_PROPERTY	TokenNameIdentifier	 BUILD  TIMESTAMP  FORMAT  PROPERTY
=	TokenNameEQUAL	
"maven.build.timestamp.format"	TokenNameStringLiteral	maven.build.timestamp.format
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
ROLE	TokenNameIdentifier	 ROLE
=	TokenNameEQUAL	
ModelInterpolator	TokenNameIdentifier	 Model Interpolator
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead. 
Model	TokenNameIdentifier	 Model
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
ModelInterpolationException	TokenNameIdentifier	 Model Interpolation Exception
;	TokenNameSEMICOLON	
/** * @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead. */	TokenNameCOMMENT_JAVADOC	 @deprecated Use {@link ModelInterpolator#interpolate(Model, File, ProjectBuilderConfiguration, boolean)} instead. 
Model	TokenNameIdentifier	 Model
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
?	TokenNameQUESTION	
>	TokenNameGREATER	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
boolean	TokenNameboolean	
strict	TokenNameIdentifier	 strict
)	TokenNameRPAREN	
throws	TokenNamethrows	
ModelInterpolationException	TokenNameIdentifier	 Model Interpolation Exception
;	TokenNameSEMICOLON	
Model	TokenNameIdentifier	 Model
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
projectDir	TokenNameIdentifier	 project Dir
,	TokenNameCOMMA	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
config	TokenNameIdentifier	 config
,	TokenNameCOMMA	
boolean	TokenNameboolean	
debugEnabled	TokenNameIdentifier	 debug Enabled
)	TokenNameRPAREN	
throws	TokenNamethrows	
ModelInterpolationException	TokenNameIdentifier	 Model Interpolation Exception
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
interpolate	TokenNameIdentifier	 interpolate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Model	TokenNameIdentifier	 Model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
projectDir	TokenNameIdentifier	 project Dir
,	TokenNameCOMMA	
ProjectBuilderConfiguration	TokenNameIdentifier	 Project Builder Configuration
config	TokenNameIdentifier	 config
,	TokenNameCOMMA	
boolean	TokenNameboolean	
debugEnabled	TokenNameIdentifier	 debug Enabled
)	TokenNameRPAREN	
throws	TokenNamethrows	
ModelInterpolationException	TokenNameIdentifier	 Model Interpolation Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
