package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
providers	TokenNameIdentifier	 providers
.	TokenNameDOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
FileWagon	TokenNameIdentifier	 File Wagon
;	TokenNameSEMICOLON	
/** * Mock of a Wagon for testing * * @author <a href="mailto:carlos@apache.org">Carlos Sanchez</a> */	TokenNameCOMMENT_JAVADOC	 Mock of a Wagon for testing * @author <a href="mailto:carlos@apache.org">Carlos Sanchez</a> 
public	TokenNamepublic	
class	TokenNameclass	
WagonMock	TokenNameIdentifier	 Wagon Mock
extends	TokenNameextends	
FileWagon	TokenNameIdentifier	 File Wagon
{	TokenNameLBRACE	
/** * A field that can be configured in the Wagon * * @component.configuration default="configurableField" */	TokenNameCOMMENT_JAVADOC	 A field that can be configured in the Wagon * @component.configuration default="configurableField" 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
configurableField	TokenNameIdentifier	 configurable Field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setConfigurableField	TokenNameIdentifier	 set Configurable Field
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
configurableField	TokenNameIdentifier	 configurable Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
configurableField	TokenNameIdentifier	 configurable Field
=	TokenNameEQUAL	
configurableField	TokenNameIdentifier	 configurable Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getConfigurableField	TokenNameIdentifier	 get Configurable Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
configurableField	TokenNameIdentifier	 configurable Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
