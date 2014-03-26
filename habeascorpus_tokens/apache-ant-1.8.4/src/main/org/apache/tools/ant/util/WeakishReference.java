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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
WeakReference	TokenNameIdentifier	 Weak Reference
;	TokenNameSEMICOLON	
/** * These classes are part of some code to reduce memory leaks by only * retaining weak references to things * on Java1.2+, and yet still work (with leaky hard references) on Java1.1. * Now that Ant is 1.2+ only, * life is simpler and none of the classes are needed any more. * * They are only retained in case a third-party task uses them * @since ant1.6 * @see org.apache.tools.ant.util.optional.WeakishReference12 * @deprecated deprecated 1.7; will be removed in Ant1.8 * Just use {@link java.lang.ref.WeakReference} directly. */	TokenNameCOMMENT_JAVADOC	 These classes are part of some code to reduce memory leaks by only retaining weak references to things on Java1.2+, and yet still work (with leaky hard references) on Java1.1. Now that Ant is 1.2+ only, life is simpler and none of the classes are needed any more. * They are only retained in case a third-party task uses them @since ant1.6 @see org.apache.tools.ant.util.optional.WeakishReference12 @deprecated deprecated 1.7; will be removed in Ant1.8 Just use {@link java.lang.ref.WeakReference} directly. 
public	TokenNamepublic	
class	TokenNameclass	
WeakishReference	TokenNameIdentifier	 Weakish Reference
{	TokenNameLBRACE	
private	TokenNameprivate	
WeakReference	TokenNameIdentifier	 Weak Reference
weakref	TokenNameIdentifier	 weakref
;	TokenNameSEMICOLON	
/** * create a new soft reference, which is bound to a * Weak reference inside * * @param reference * @see java.lang.ref.WeakReference */	TokenNameCOMMENT_JAVADOC	 create a new soft reference, which is bound to a Weak reference inside * @param reference @see java.lang.ref.WeakReference 
WeakishReference	TokenNameIdentifier	 Weakish Reference
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
weakref	TokenNameIdentifier	 weakref
=	TokenNameEQUAL	
new	TokenNamenew	
WeakReference	TokenNameIdentifier	 Weak Reference
(	TokenNameLPAREN	
reference	TokenNameIdentifier	 reference
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns this reference object's referent. If this reference object has * been cleared, then this method returns <code>null</code>. * * @return The object to which this reference refers, or * <code>null</code> if this reference object has been cleared. */	TokenNameCOMMENT_JAVADOC	 Returns this reference object's referent. If this reference object has been cleared, then this method returns <code>null</code>. * @return The object to which this reference refers, or <code>null</code> if this reference object has been cleared. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
weakref	TokenNameIdentifier	 weakref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * create the appropriate type of reference for the java version * @param object the object that the reference will refer to. * @return reference to the Object. */	TokenNameCOMMENT_JAVADOC	 create the appropriate type of reference for the java version @param object the object that the reference will refer to. @return reference to the Object. 
public	TokenNamepublic	
static	TokenNamestatic	
WeakishReference	TokenNameIdentifier	 Weakish Reference
createReference	TokenNameIdentifier	 create Reference
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
WeakishReference	TokenNameIdentifier	 Weakish Reference
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This was a hard reference for Java 1.1. Since Ant1.7, * @deprecated since 1.7. * Hopefully nobody is using this. */	TokenNameCOMMENT_JAVADOC	 This was a hard reference for Java 1.1. Since Ant1.7, @deprecated since 1.7. Hopefully nobody is using this. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
HardReference	TokenNameIdentifier	 Hard Reference
extends	TokenNameextends	
WeakishReference	TokenNameIdentifier	 Weakish Reference
{	TokenNameLBRACE	
/** * constructor. * @param object the object that the reference will refer to. */	TokenNameCOMMENT_JAVADOC	 constructor. @param object the object that the reference will refer to. 
public	TokenNamepublic	
HardReference	TokenNameIdentifier	 Hard Reference
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
