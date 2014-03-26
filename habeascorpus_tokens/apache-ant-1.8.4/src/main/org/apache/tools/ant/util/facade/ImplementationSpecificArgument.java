/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
facade	TokenNameIdentifier	 facade
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Commandline	TokenNameIdentifier	 Commandline
;	TokenNameSEMICOLON	
/** * Extension of Commandline.Argument with a new attribute that choses * a specific implementation of the facade. * * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 Extension of Commandline.Argument with a new attribute that choses a specific implementation of the facade. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
extends	TokenNameextends	
Commandline	TokenNameIdentifier	 Commandline
.	TokenNameDOT	
Argument	TokenNameIdentifier	 Argument
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
/** Constructor for ImplementationSpecificArgument. */	TokenNameCOMMENT_JAVADOC	 Constructor for ImplementationSpecificArgument. 
public	TokenNamepublic	
ImplementationSpecificArgument	TokenNameIdentifier	 Implementation Specific Argument
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the implementation this argument is for. * @param impl the implementation this command line argument is for. */	TokenNameCOMMENT_JAVADOC	 Set the implementation this argument is for. @param impl the implementation this command line argument is for. 
public	TokenNamepublic	
void	TokenNamevoid	
setImplementation	TokenNameIdentifier	 set Implementation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the parts this Argument consists of, if the * implementation matches the chosen implementation. * @see org.apache.tools.ant.types.Commandline.Argument#getParts() * @param chosenImpl the implementation to check against. * @return the parts if the implemention matches or an zero length * array if not. */	TokenNameCOMMENT_JAVADOC	 Return the parts this Argument consists of, if the implementation matches the chosen implementation. @see org.apache.tools.ant.types.Commandline.Argument#getParts() @param chosenImpl the implementation to check against. @return the parts if the implemention matches or an zero length array if not. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
chosenImpl	TokenNameIdentifier	 chosen Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
chosenImpl	TokenNameIdentifier	 chosen Impl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getParts	TokenNameIdentifier	 get Parts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
