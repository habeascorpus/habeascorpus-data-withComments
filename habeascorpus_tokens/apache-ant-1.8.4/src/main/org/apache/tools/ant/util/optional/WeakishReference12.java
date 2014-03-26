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
optional	TokenNameIdentifier	 optional
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
WeakishReference	TokenNameIdentifier	 Weakish Reference
;	TokenNameSEMICOLON	
/** * This is a reference that really is is Weak, as it uses the * appropriate java.lang.ref class. * @deprecated since 1.7. * Just use {@link java.lang.ref.WeakReference} directly. * Note that in ant1.7 is parent was changed to extend HardReference. * This is because the latter has access to the (package scoped) * WeakishReference(Object) constructor, and both that and this are thin * facades on the underlying no-longer-abstract base class. */	TokenNameCOMMENT_JAVADOC	 This is a reference that really is is Weak, as it uses the appropriate java.lang.ref class. @deprecated since 1.7. Just use {@link java.lang.ref.WeakReference} directly. Note that in ant1.7 is parent was changed to extend HardReference. This is because the latter has access to the (package scoped) WeakishReference(Object) constructor, and both that and this are thin facades on the underlying no-longer-abstract base class. 
public	TokenNamepublic	
class	TokenNameclass	
WeakishReference12	TokenNameIdentifier	 Weakish Reference12
extends	TokenNameextends	
WeakishReference	TokenNameIdentifier	 Weakish Reference
.	TokenNameDOT	
HardReference	TokenNameIdentifier	 Hard Reference
{	TokenNameLBRACE	
/** * create a new soft reference, which is bound to a * Weak reference inside * @param reference the object to reference. * @see java.lang.ref.WeakReference */	TokenNameCOMMENT_JAVADOC	 create a new soft reference, which is bound to a Weak reference inside @param reference the object to reference. @see java.lang.ref.WeakReference 
public	TokenNamepublic	
WeakishReference12	TokenNameIdentifier	 Weakish Reference12
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
