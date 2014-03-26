/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** <code>ThreadLocalMap</code> extends {@link InheritableThreadLocal} to bequeath a copy of the hashtable of the MDC of the parent thread. @author Ceki G&uuml;lc&uuml; @since 1.2 */	TokenNameCOMMENT_JAVADOC	 <code>ThreadLocalMap</code> extends {@link InheritableThreadLocal} to bequeath a copy of the hashtable of the MDC of the parent thread. @author Ceki G&uuml;lc&uuml; @since 1.2 
final	TokenNamefinal	
public	TokenNamepublic	
class	TokenNameclass	
ThreadLocalMap	TokenNameIdentifier	 Thread Local Map
extends	TokenNameextends	
InheritableThreadLocal	TokenNameIdentifier	 Inheritable Thread Local
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
childValue	TokenNameIdentifier	 child Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
parentValue	TokenNameIdentifier	 parent Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hashtable	TokenNameIdentifier	 Hashtable
ht	TokenNameIdentifier	 ht
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
)	TokenNameRPAREN	
parentValue	TokenNameIdentifier	 parent Value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ht	TokenNameIdentifier	 ht
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ht	TokenNameIdentifier	 ht
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
