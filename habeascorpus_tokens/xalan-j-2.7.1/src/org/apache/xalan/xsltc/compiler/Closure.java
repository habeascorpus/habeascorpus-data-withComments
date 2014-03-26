/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Closure.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Closure.java 468650 2006-10-28 07:03:30Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
/** * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
interface	TokenNameinterface	
Closure	TokenNameIdentifier	 Closure
{	TokenNameLBRACE	
/** * Returns true if this closure is compiled in an inner class (i.e. * if this is a real closure). */	TokenNameCOMMENT_JAVADOC	 Returns true if this closure is compiled in an inner class (i.e. if this is a real closure). 
public	TokenNamepublic	
boolean	TokenNameboolean	
inInnerClass	TokenNameIdentifier	 in Inner Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a reference to its parent closure or null if outermost. */	TokenNameCOMMENT_JAVADOC	 Returns a reference to its parent closure or null if outermost. 
public	TokenNamepublic	
Closure	TokenNameIdentifier	 Closure
getParentClosure	TokenNameIdentifier	 get Parent Closure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the name of the auxiliary class or null if this predicate * is compiled inside the Translet. */	TokenNameCOMMENT_JAVADOC	 Returns the name of the auxiliary class or null if this predicate is compiled inside the Translet. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInnerClassName	TokenNameIdentifier	 get Inner Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Add new variable to the closure. */	TokenNameCOMMENT_JAVADOC	 Add new variable to the closure. 
public	TokenNamepublic	
void	TokenNamevoid	
addVariable	TokenNameIdentifier	 add Variable
(	TokenNameLPAREN	
VariableRefBase	TokenNameIdentifier	 Variable Ref Base
variableRef	TokenNameIdentifier	 variable Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
