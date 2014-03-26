package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
lifecycle	TokenNameIdentifier	 lifecycle
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Knows the phase the current thread is executing. * <p/> * This class is used in weave-mode only , there may be better ways of doing this once the dust settles. * * @since 3.0 * @author Kristian Rosenvold */	TokenNameCOMMENT_JAVADOC	 Knows the phase the current thread is executing. <p/> This class is used in weave-mode only , there may be better ways of doing this once the dust settles. * @since 3.0 @author Kristian Rosenvold 
class	TokenNameclass	
CurrentPhaseForThread	TokenNameIdentifier	 Current Phase For Thread
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
InheritableThreadLocal	TokenNameIdentifier	 Inheritable Thread Local
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
threadPhase	TokenNameIdentifier	 thread Phase
=	TokenNameEQUAL	
new	TokenNamenew	
InheritableThreadLocal	TokenNameIdentifier	 Inheritable Thread Local
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setPhase	TokenNameIdentifier	 set Phase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
threadPhase	TokenNameIdentifier	 thread Phase
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
isPhase	TokenNameIdentifier	 is Phase
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
phase	TokenNameIdentifier	 phase
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
phase	TokenNameIdentifier	 phase
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
threadPhase	TokenNameIdentifier	 thread Phase
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
