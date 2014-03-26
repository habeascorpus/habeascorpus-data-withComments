package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Sneaky: rethrowing checked exceptions as unchecked * ones. Eh, it is sometimes useful... * * <p>Pulled from http://www.javapuzzlers.com (I * think?).</p> */	TokenNameCOMMENT_JAVADOC	 Sneaky: rethrowing checked exceptions as unchecked ones. Eh, it is sometimes useful... * <p>Pulled from http://www.javapuzzlers.com (I think?).</p> 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Rethrow	TokenNameIdentifier	 Rethrow
{	TokenNameLBRACE	
/** * Classy puzzler to rethrow any checked exception as an unchecked one. */	TokenNameCOMMENT_JAVADOC	 Classy puzzler to rethrow any checked exception as an unchecked one. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Rethrower	TokenNameIdentifier	 Rethrower
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Throwable	TokenNameIdentifier	 Throwable
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
rethrow	TokenNameIdentifier	 rethrow
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
T	TokenNameIdentifier	 T
{	TokenNameLBRACE	
throw	TokenNamethrow	
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Rethrows <code>t</code> (identical object). */	TokenNameCOMMENT_JAVADOC	 Rethrows <code>t</code> (identical object). 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
rethrow	TokenNameIdentifier	 rethrow
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
Rethrower	TokenNameIdentifier	 Rethrower
<	TokenNameLESS	
Error	TokenNameIdentifier	 Error
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
rethrow	TokenNameIdentifier	 rethrow
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
