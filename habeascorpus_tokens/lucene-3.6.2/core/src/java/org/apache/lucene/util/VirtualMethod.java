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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * A utility for keeping backwards compatibility on previously abstract methods * (or similar replacements). * <p>Before the replacement method can be made abstract, the old method must kept deprecated. * If somebody still overrides the deprecated method in a non-final class, * you must keep track, of this and maybe delegate to the old method in the subclass. * The cost of reflection is minimized by the following usage of this class:</p> * <p>Define <strong>static final</strong> fields in the base class ({@code BaseClass}), * where the old and new method are declared:</p> * <pre> * static final VirtualMethod&lt;BaseClass&gt; newMethod = * new VirtualMethod&lt;BaseClass&gt;(BaseClass.class, "newName", parameters...); * static final VirtualMethod&lt;BaseClass&gt; oldMethod = * new VirtualMethod&lt;BaseClass&gt;(BaseClass.class, "oldName", parameters...); * </pre> * <p>This enforces the singleton status of these objects, as the maintenance of the cache would be too costly else. * If you try to create a second instance of for the same method/{@code baseClass} combination, an exception is thrown. * <p>To detect if e.g. the old method was overridden by a more far subclass on the inheritance path to the current * instance's class, use a <strong>non-static</strong> field:</p> * <pre> * final boolean isDeprecatedMethodOverridden = * oldMethod.getImplementationDistance(this.getClass()) > newMethod.getImplementationDistance(this.getClass()); * * <em>// alternatively (more readable):</em> * final boolean isDeprecatedMethodOverridden = * VirtualMethod.compareImplementationDistance(this.getClass(), oldMethod, newMethod) > 0 * </pre> * <p>{@link #getImplementationDistance} returns the distance of the subclass that overrides this method. * The one with the larger distance should be used preferable. * This way also more complicated method rename scenarios can be handled * (think of 2.9 {@code TokenStream} deprecations).</p> * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 A utility for keeping backwards compatibility on previously abstract methods (or similar replacements). <p>Before the replacement method can be made abstract, the old method must kept deprecated. If somebody still overrides the deprecated method in a non-final class, you must keep track, of this and maybe delegate to the old method in the subclass. The cost of reflection is minimized by the following usage of this class:</p> <p>Define <strong>static final</strong> fields in the base class ({@code BaseClass}), where the old and new method are declared:</p> <pre> static final VirtualMethod&lt;BaseClass&gt; newMethod = new VirtualMethod&lt;BaseClass&gt;(BaseClass.class, "newName", parameters...); static final VirtualMethod&lt;BaseClass&gt; oldMethod = new VirtualMethod&lt;BaseClass&gt;(BaseClass.class, "oldName", parameters...); </pre> <p>This enforces the singleton status of these objects, as the maintenance of the cache would be too costly else. If you try to create a second instance of for the same method/{@code baseClass} combination, an exception is thrown. <p>To detect if e.g. the old method was overridden by a more far subclass on the inheritance path to the current instance's class, use a <strong>non-static</strong> field:</p> <pre> final boolean isDeprecatedMethodOverridden = oldMethod.getImplementationDistance(this.getClass()) > newMethod.getImplementationDistance(this.getClass()); * <em>// alternatively (more readable):</em> final boolean isDeprecatedMethodOverridden = VirtualMethod.compareImplementationDistance(this.getClass(), oldMethod, newMethod) > 0 </pre> <p>{@link #getImplementationDistance} returns the distance of the subclass that overrides this method. The one with the larger distance should be used preferable. This way also more complicated method rename scenarios can be handled (think of 2.9 {@code TokenStream} deprecations).</p> * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Method	TokenNameIdentifier	 Method
>	TokenNameGREATER	
singletonSet	TokenNameIdentifier	 singleton Set
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedSet	TokenNameIdentifier	 synchronized Set
(	TokenNameLPAREN	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Method	TokenNameIdentifier	 Method
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
baseClass	TokenNameIdentifier	 base Class
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
WeakIdentityMap	TokenNameIdentifier	 Weak Identity Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
WeakIdentityMap	TokenNameIdentifier	 Weak Identity Map
.	TokenNameDOT	
newConcurrentHashMap	TokenNameIdentifier	 new Concurrent Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new instance for the given {@code baseClass} and method declaration. * @throws UnsupportedOperationException if you create a second instance of the same * {@code baseClass} and method declaration combination. This enforces the singleton status. * @throws IllegalArgumentException if {@code baseClass} does not declare the given method. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance for the given {@code baseClass} and method declaration. @throws UnsupportedOperationException if you create a second instance of the same {@code baseClass} and method declaration combination. This enforces the singleton status. @throws IllegalArgumentException if {@code baseClass} does not declare the given method. 
public	TokenNamepublic	
VirtualMethod	TokenNameIdentifier	 Virtual Method
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
baseClass	TokenNameIdentifier	 base Class
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
...	TokenNameELLIPSIS	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
baseClass	TokenNameIdentifier	 base Class
=	TokenNameEQUAL	
baseClass	TokenNameIdentifier	 base Class
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
method	TokenNameIdentifier	 method
=	TokenNameEQUAL	
method	TokenNameIdentifier	 method
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
singletonSet	TokenNameIdentifier	 singleton Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
baseClass	TokenNameIdentifier	 base Class
.	TokenNameDOT	
getDeclaredMethod	TokenNameIdentifier	 get Declared Method
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"VirtualMethod instances must be singletons and therefore "	TokenNameStringLiteral	VirtualMethod instances must be singletons and therefore 
+	TokenNamePLUS	
"assigned to static final members in the same class, they use as baseClass ctor param."	TokenNameStringLiteral	assigned to static final members in the same class, they use as baseClass ctor param.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
baseClass	TokenNameIdentifier	 base Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" has no such method: "	TokenNameStringLiteral	 has no such method: 
+	TokenNamePLUS	
nsme	TokenNameIdentifier	 nsme
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the distance from the {@code baseClass} in which this method is overridden/implemented * in the inheritance path between {@code baseClass} and the given subclass {@code subclazz}. * @return 0 iff not overridden, else the distance to the base class */	TokenNameCOMMENT_JAVADOC	 Returns the distance from the {@code baseClass} in which this method is overridden/implemented in the inheritance path between {@code baseClass} and the given subclass {@code subclazz}. @return 0 iff not overridden, else the distance to the base class 
public	TokenNamepublic	
int	TokenNameint	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
subclazz	TokenNameIdentifier	 subclazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subclazz	TokenNameIdentifier	 subclazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
distance	TokenNameIdentifier	 distance
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have the slight chance that another thread may do the same, but who cares? 	TokenNameCOMMENT_LINE	we have the slight chance that another thread may do the same, but who cares? 
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
subclazz	TokenNameIdentifier	 subclazz
,	TokenNameCOMMA	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
reflectImplementationDistance	TokenNameIdentifier	 reflect Implementation Distance
(	TokenNameLPAREN	
subclazz	TokenNameIdentifier	 subclazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
distance	TokenNameIdentifier	 distance
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns, if this method is overridden/implemented in the inheritance path between * {@code baseClass} and the given subclass {@code subclazz}. * <p>You can use this method to detect if a method that should normally be final was overridden * by the given instance's class. * @return {@code false} iff not overridden */	TokenNameCOMMENT_JAVADOC	 Returns, if this method is overridden/implemented in the inheritance path between {@code baseClass} and the given subclass {@code subclazz}. <p>You can use this method to detect if a method that should normally be final was overridden by the given instance's class. @return {@code false} iff not overridden 
public	TokenNamepublic	
boolean	TokenNameboolean	
isOverriddenAsOf	TokenNameIdentifier	 is Overridden As Of
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
subclazz	TokenNameIdentifier	 subclazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
subclazz	TokenNameIdentifier	 subclazz
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
reflectImplementationDistance	TokenNameIdentifier	 reflect Implementation Distance
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
subclazz	TokenNameIdentifier	 subclazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
baseClass	TokenNameIdentifier	 base Class
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
subclazz	TokenNameIdentifier	 subclazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
subclazz	TokenNameIdentifier	 subclazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" is not a subclass of "	TokenNameStringLiteral	 is not a subclass of 
+	TokenNamePLUS	
baseClass	TokenNameIdentifier	 base Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
overridden	TokenNameIdentifier	 overridden
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
distance	TokenNameIdentifier	 distance
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
subclazz	TokenNameIdentifier	 subclazz
;	TokenNameSEMICOLON	
clazz	TokenNameIdentifier	 clazz
!=	TokenNameNOT_EQUAL	
baseClass	TokenNameIdentifier	 base Class
&&	TokenNameAND_AND	
clazz	TokenNameIdentifier	 clazz
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getSuperclass	TokenNameIdentifier	 get Superclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// lookup method, if success mark as overridden 	TokenNameCOMMENT_LINE	lookup method, if success mark as overridden 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
overridden	TokenNameIdentifier	 overridden
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getDeclaredMethod	TokenNameIdentifier	 get Declared Method
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
overridden	TokenNameIdentifier	 overridden
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// increment distance if overridden 	TokenNameCOMMENT_LINE	increment distance if overridden 
if	TokenNameif	
(	TokenNameLPAREN	
overridden	TokenNameIdentifier	 overridden
)	TokenNameRPAREN	
distance	TokenNameIdentifier	 distance
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
distance	TokenNameIdentifier	 distance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Utility method that compares the implementation/override distance of two methods. * @return <ul> * <li>&gt; 1, iff {@code m1} is overridden/implemented in a subclass of the class overriding/declaring {@code m2} * <li>&lt; 1, iff {@code m2} is overridden in a subclass of the class overriding/declaring {@code m1} * <li>0, iff both methods are overridden in the same class (or are not overridden at all) * </ul> */	TokenNameCOMMENT_JAVADOC	 Utility method that compares the implementation/override distance of two methods. @return <ul> <li>&gt; 1, iff {@code m1} is overridden/implemented in a subclass of the class overriding/declaring {@code m2} <li>&lt; 1, iff {@code m2} is overridden in a subclass of the class overriding/declaring {@code m1} <li>0, iff both methods are overridden in the same class (or are not overridden at all) </ul> 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
int	TokenNameint	
compareImplementationDistance	TokenNameIdentifier	 compare Implementation Distance
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
m1	TokenNameIdentifier	 m1
,	TokenNameCOMMA	
final	TokenNamefinal	
VirtualMethod	TokenNameIdentifier	 Virtual Method
<	TokenNameLESS	
C	TokenNameIdentifier	 C
>	TokenNameGREATER	
m2	TokenNameIdentifier	 m2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
getImplementationDistance	TokenNameIdentifier	 get Implementation Distance
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
