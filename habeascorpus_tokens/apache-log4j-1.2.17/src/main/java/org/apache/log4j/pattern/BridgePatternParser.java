/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
pattern	TokenNameIdentifier	 pattern
;	TokenNameSEMICOLON	
/** * The class implements the pre log4j 1.3 org.apache.log4j.helpers.PatternConverter * contract by delegating to the log4j 1.3 pattern implementation. * * * @author Curt Arnold * */	TokenNameCOMMENT_JAVADOC	 The class implements the pre log4j 1.3 org.apache.log4j.helpers.PatternConverter contract by delegating to the log4j 1.3 pattern implementation. * @author Curt Arnold 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BridgePatternParser	TokenNameIdentifier	 Bridge Pattern Parser
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
PatternParser	TokenNameIdentifier	 Pattern Parser
{	TokenNameLBRACE	
/** * Create a new instance. * @param conversionPattern pattern, may not be null. */	TokenNameCOMMENT_JAVADOC	 Create a new instance. @param conversionPattern pattern, may not be null. 
public	TokenNamepublic	
BridgePatternParser	TokenNameIdentifier	 Bridge Pattern Parser
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
conversionPattern	TokenNameIdentifier	 conversion Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
conversionPattern	TokenNameIdentifier	 conversion Pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create new pattern converter. * @return pattern converter. */	TokenNameCOMMENT_JAVADOC	 Create new pattern converter. @return pattern converter. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
PatternConverter	TokenNameIdentifier	 Pattern Converter
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BridgePatternConverter	TokenNameIdentifier	 Bridge Pattern Converter
(	TokenNameLPAREN	
pattern	TokenNameIdentifier	 pattern
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
