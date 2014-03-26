package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
configurator	TokenNameIdentifier	 configurator
.	TokenNameDOT	
ComponentConfigurationException	TokenNameIdentifier	 Component Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
configurator	TokenNameIdentifier	 configurator
.	TokenNameDOT	
expression	TokenNameIdentifier	 expression
.	TokenNameDOT	
ExpressionEvaluationException	TokenNameIdentifier	 Expression Evaluation Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
;	TokenNameSEMICOLON	
/** * @author Jason van Zyl */	TokenNameCOMMENT_JAVADOC	 @author Jason van Zyl 
public	TokenNamepublic	
class	TokenNameclass	
PluginConfigurationException	TokenNameIdentifier	 Plugin Configuration Exception
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
originalMessage	TokenNameIdentifier	 original Message
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PluginConfigurationException	TokenNameIdentifier	 Plugin Configuration Exception
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
originalMessage	TokenNameIdentifier	 original Message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
originalMessage	TokenNameIdentifier	 original Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
=	TokenNameEQUAL	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalMessage	TokenNameIdentifier	 original Message
=	TokenNameEQUAL	
originalMessage	TokenNameIdentifier	 original Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginConfigurationException	TokenNameIdentifier	 Plugin Configuration Exception
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
originalMessage	TokenNameIdentifier	 original Message
,	TokenNameCOMMA	
Throwable	TokenNameIdentifier	 Throwable
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
originalMessage	TokenNameIdentifier	 original Message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
=	TokenNameEQUAL	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalMessage	TokenNameIdentifier	 original Message
=	TokenNameEQUAL	
originalMessage	TokenNameIdentifier	 original Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginConfigurationException	TokenNameIdentifier	 Plugin Configuration Exception
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
originalMessage	TokenNameIdentifier	 original Message
,	TokenNameCOMMA	
ExpressionEvaluationException	TokenNameIdentifier	 Expression Evaluation Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
originalMessage	TokenNameIdentifier	 original Message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
=	TokenNameEQUAL	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalMessage	TokenNameIdentifier	 original Message
=	TokenNameEQUAL	
originalMessage	TokenNameIdentifier	 original Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginConfigurationException	TokenNameIdentifier	 Plugin Configuration Exception
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
originalMessage	TokenNameIdentifier	 original Message
,	TokenNameCOMMA	
ComponentConfigurationException	TokenNameIdentifier	 Component Configuration Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
originalMessage	TokenNameIdentifier	 original Message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
=	TokenNameEQUAL	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalMessage	TokenNameIdentifier	 original Message
=	TokenNameEQUAL	
originalMessage	TokenNameIdentifier	 original Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PluginConfigurationException	TokenNameIdentifier	 Plugin Configuration Exception
(	TokenNameLPAREN	
PluginDescriptor	TokenNameIdentifier	 Plugin Descriptor
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
originalMessage	TokenNameIdentifier	 original Message
,	TokenNameCOMMA	
ComponentLookupException	TokenNameIdentifier	 Component Lookup Exception
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
originalMessage	TokenNameIdentifier	 original Message
,	TokenNameCOMMA	
cause	TokenNameIdentifier	 cause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
=	TokenNameEQUAL	
pluginDescriptor	TokenNameIdentifier	 plugin Descriptor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
originalMessage	TokenNameIdentifier	 original Message
=	TokenNameEQUAL	
originalMessage	TokenNameIdentifier	 original Message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
