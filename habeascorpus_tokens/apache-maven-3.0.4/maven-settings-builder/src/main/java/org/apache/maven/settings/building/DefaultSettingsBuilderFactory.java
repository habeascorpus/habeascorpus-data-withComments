package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
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
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DefaultSettingsReader	TokenNameIdentifier	 Default Settings Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DefaultSettingsWriter	TokenNameIdentifier	 Default Settings Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
SettingsReader	TokenNameIdentifier	 Settings Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
SettingsWriter	TokenNameIdentifier	 Settings Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
DefaultSettingsValidator	TokenNameIdentifier	 Default Settings Validator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
settings	TokenNameIdentifier	 settings
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
.	TokenNameDOT	
SettingsValidator	TokenNameIdentifier	 Settings Validator
;	TokenNameSEMICOLON	
/** * A factory to create settings builder instances when no dependency injection is available. <em>Note:</em> This class * is only meant as a utility for developers that want to employ the settings builder outside of the Maven build system, * Maven plugins should always acquire settings builder instances via dependency injection. Developers might want to * subclass this factory to provide custom implementations for some of the components used by the settings builder. * * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 A factory to create settings builder instances when no dependency injection is available. <em>Note:</em> This class is only meant as a utility for developers that want to employ the settings builder outside of the Maven build system, Maven plugins should always acquire settings builder instances via dependency injection. Developers might want to subclass this factory to provide custom implementations for some of the components used by the settings builder. * @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
DefaultSettingsBuilderFactory	TokenNameIdentifier	 Default Settings Builder Factory
{	TokenNameLBRACE	
protected	TokenNameprotected	
SettingsReader	TokenNameIdentifier	 Settings Reader
newSettingsReader	TokenNameIdentifier	 new Settings Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultSettingsReader	TokenNameIdentifier	 Default Settings Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
SettingsWriter	TokenNameIdentifier	 Settings Writer
newSettingsWriter	TokenNameIdentifier	 new Settings Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultSettingsWriter	TokenNameIdentifier	 Default Settings Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
SettingsValidator	TokenNameIdentifier	 Settings Validator
newSettingsValidator	TokenNameIdentifier	 new Settings Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultSettingsValidator	TokenNameIdentifier	 Default Settings Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new settings builder instance. * * @return The new settings builder instance, never {@code null}. */	TokenNameCOMMENT_JAVADOC	 Creates a new settings builder instance. * @return The new settings builder instance, never {@code null}. 
public	TokenNamepublic	
DefaultSettingsBuilder	TokenNameIdentifier	 Default Settings Builder
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DefaultSettingsBuilder	TokenNameIdentifier	 Default Settings Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultSettingsBuilder	TokenNameIdentifier	 Default Settings Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
setSettingsReader	TokenNameIdentifier	 set Settings Reader
(	TokenNameLPAREN	
newSettingsReader	TokenNameIdentifier	 new Settings Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
setSettingsWriter	TokenNameIdentifier	 set Settings Writer
(	TokenNameLPAREN	
newSettingsWriter	TokenNameIdentifier	 new Settings Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
setSettingsValidator	TokenNameIdentifier	 set Settings Validator
(	TokenNameLPAREN	
newSettingsValidator	TokenNameIdentifier	 new Settings Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
