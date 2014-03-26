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
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
WeakReference	TokenNameIdentifier	 Weak Reference
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
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
TermAttribute	TokenNameIdentifier	 Term Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
;	TokenNameSEMICOLON	
/** * An AttributeSource contains a list of different {@link AttributeImpl}s, * and methods to add and get them. There can only be a single instance * of an attribute in the same AttributeSource instance. This is ensured * by passing in the actual type of the Attribute (Class&lt;Attribute&gt;) to * the {@link #addAttribute(Class)}, which then checks if an instance of * that type is already present. If yes, it returns the instance, otherwise * it creates a new instance and returns it. */	TokenNameCOMMENT_JAVADOC	 An AttributeSource contains a list of different {@link AttributeImpl}s, and methods to add and get them. There can only be a single instance of an attribute in the same AttributeSource instance. This is ensured by passing in the actual type of the Attribute (Class&lt;Attribute&gt;) to the {@link #addAttribute(Class)}, which then checks if an instance of that type is already present. If yes, it returns the instance, otherwise it creates a new instance and returns it. 
public	TokenNamepublic	
class	TokenNameclass	
AttributeSource	TokenNameIdentifier	 Attribute Source
{	TokenNameLBRACE	
/** * An AttributeFactory creates instances of {@link AttributeImpl}s. */	TokenNameCOMMENT_JAVADOC	 An AttributeFactory creates instances of {@link AttributeImpl}s. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
{	TokenNameLBRACE	
/** * returns an {@link AttributeImpl} for the supplied {@link Attribute} interface class. */	TokenNameCOMMENT_JAVADOC	 returns an {@link AttributeImpl} for the supplied {@link Attribute} interface class. 
public	TokenNamepublic	
abstract	TokenNameabstract	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
createAttributeInstance	TokenNameIdentifier	 create Attribute Instance
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This is the default factory that creates {@link AttributeImpl}s using the * class name of the supplied {@link Attribute} interface class by appending <code>Impl</code> to it. */	TokenNameCOMMENT_JAVADOC	 This is the default factory that creates {@link AttributeImpl}s using the class name of the supplied {@link Attribute} interface class by appending <code>Impl</code> to it. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
DEFAULT_ATTRIBUTE_FACTORY	TokenNameIdentifier	 DEFAULT  ATTRIBUTE  FACTORY
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultAttributeFactory	TokenNameIdentifier	 Default Attribute Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DefaultAttributeFactory	TokenNameIdentifier	 Default Attribute Factory
extends	TokenNameextends	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
WeakIdentityMap	TokenNameIdentifier	 Weak Identity Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
,	TokenNameCOMMA	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
attClassImplMap	TokenNameIdentifier	 att Class Impl Map
=	TokenNameEQUAL	
WeakIdentityMap	TokenNameIdentifier	 Weak Identity Map
.	TokenNameDOT	
newConcurrentHashMap	TokenNameIdentifier	 new Concurrent Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DefaultAttributeFactory	TokenNameIdentifier	 Default Attribute Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
createAttributeInstance	TokenNameIdentifier	 create Attribute Instance
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
getClassForInterface	TokenNameIdentifier	 get Class For Interface
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Could not instantiate implementing class for "	TokenNameStringLiteral	Could not instantiate implementing class for 
+	TokenNamePLUS	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Could not instantiate implementing class for "	TokenNameStringLiteral	Could not instantiate implementing class for 
+	TokenNamePLUS	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
getClassForInterface	TokenNameIdentifier	 get Class For Interface
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>>	TokenNameRIGHT_SHIFT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
attClassImplMap	TokenNameIdentifier	 att Class Impl Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have the slight chance that another thread may do the same, but who cares? 	TokenNameCOMMENT_LINE	we have the slight chance that another thread may do the same, but who cares? 
try	TokenNametry	
{	TokenNameLBRACE	
// TODO: Remove when TermAttribute is removed! 	TokenNameCOMMENT_LINE	TODO: Remove when TermAttribute is removed! 
// This is a "sophisticated backwards compatibility hack" 	TokenNameCOMMENT_LINE	This is a "sophisticated backwards compatibility hack" 
// (enforce new impl for this deprecated att): 	TokenNameCOMMENT_LINE	(enforce new impl for this deprecated att): 
if	TokenNameif	
(	TokenNameLPAREN	
TermAttribute	TokenNameIdentifier	 Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
CharTermAttributeImpl	TokenNameIdentifier	 Char Term Attribute Impl
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"Impl"	TokenNameStringLiteral	Impl
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
asSubclass	TokenNameIdentifier	 as Subclass
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attClassImplMap	TokenNameIdentifier	 att Class Impl Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
,	TokenNameCOMMA	
new	TokenNamenew	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Could not find implementing class for "	TokenNameStringLiteral	Could not find implementing class for 
+	TokenNamePLUS	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This class holds the state of an AttributeSource. * @see #captureState * @see #restoreState */	TokenNameCOMMENT_JAVADOC	 This class holds the state of an AttributeSource. @see #captureState @see #restoreState 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
State	TokenNameIdentifier	 State
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
attribute	TokenNameIdentifier	 attribute
;	TokenNameSEMICOLON	
State	TokenNameIdentifier	 State
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
State	TokenNameIdentifier	 State
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
new	TokenNamenew	
State	TokenNameIdentifier	 State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
)	TokenNameRPAREN	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
(	TokenNameLPAREN	
State	TokenNameIdentifier	 State
)	TokenNameRPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// These two maps must always be in sync!!! 	TokenNameCOMMENT_LINE	These two maps must always be in sync!!! 
// So they are private, final and read-only from the outside (read-only iterators) 	TokenNameCOMMENT_LINE	So they are private, final and read-only from the outside (read-only iterators) 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
,	TokenNameCOMMA	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
,	TokenNameCOMMA	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
attributeImpls	TokenNameIdentifier	 attribute Impls
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
State	TokenNameIdentifier	 State
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentState	TokenNameIdentifier	 current State
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
/** * An AttributeSource using the default attribute factory {@link AttributeSource.AttributeFactory#DEFAULT_ATTRIBUTE_FACTORY}. */	TokenNameCOMMENT_JAVADOC	 An AttributeSource using the default attribute factory {@link AttributeSource.AttributeFactory#DEFAULT_ATTRIBUTE_FACTORY}. 
public	TokenNamepublic	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
.	TokenNameDOT	
DEFAULT_ATTRIBUTE_FACTORY	TokenNameIdentifier	 DEFAULT  ATTRIBUTE  FACTORY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An AttributeSource that uses the same attributes as the supplied one. */	TokenNameCOMMENT_JAVADOC	 An AttributeSource that uses the same attributes as the supplied one. 
public	TokenNamepublic	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"input AttributeSource must not be null"	TokenNameStringLiteral	input AttributeSource must not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attributeImpls	TokenNameIdentifier	 attribute Impls
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
attributeImpls	TokenNameIdentifier	 attribute Impls
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An AttributeSource using the supplied {@link AttributeFactory} for creating new {@link Attribute} instances. */	TokenNameCOMMENT_JAVADOC	 An AttributeSource using the supplied {@link AttributeFactory} for creating new {@link Attribute} instances. 
public	TokenNamepublic	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
,	TokenNameCOMMA	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attributeImpls	TokenNameIdentifier	 attribute Impls
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
,	TokenNameCOMMA	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
=	TokenNameEQUAL	
new	TokenNamenew	
State	TokenNameIdentifier	 State
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns the used AttributeFactory. */	TokenNameCOMMENT_JAVADOC	 returns the used AttributeFactory. 
public	TokenNamepublic	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
getAttributeFactory	TokenNameIdentifier	 get Attribute Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a new iterator that iterates the attribute classes * in the same order they were added in. */	TokenNameCOMMENT_JAVADOC	 Returns a new iterator that iterates the attribute classes in the same order they were added in. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>>	TokenNameRIGHT_SHIFT	
getAttributeClassesIterator	TokenNameIdentifier	 get Attribute Classes Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableSet	TokenNameIdentifier	 unmodifiable Set
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a new iterator that iterates all unique Attribute implementations. * This iterator may contain less entries that {@link #getAttributeClassesIterator}, * if one instance implements more than one Attribute interface. */	TokenNameCOMMENT_JAVADOC	 Returns a new iterator that iterates all unique Attribute implementations. This iterator may contain less entries that {@link #getAttributeClassesIterator}, if one instance implements more than one Attribute interface. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
getAttributeImplsIterator	TokenNameIdentifier	 get Attribute Impls Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
State	TokenNameIdentifier	 State
initState	TokenNameIdentifier	 init State
=	TokenNameEQUAL	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
initState	TokenNameIdentifier	 init State
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
initState	TokenNameIdentifier	 init State
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
att	TokenNameIdentifier	 att
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
return	TokenNamereturn	
att	TokenNameIdentifier	 att
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** a cache that stores all interfaces for known implementation classes for performance (slow reflection) */	TokenNameCOMMENT_JAVADOC	 a cache that stores all interfaces for known implementation classes for performance (slow reflection) 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
WeakIdentityMap	TokenNameIdentifier	 Weak Identity Map
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
,	TokenNameCOMMA	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
>	TokenNameGREATER	
knownImplClasses	TokenNameIdentifier	 known Impl Classes
=	TokenNameEQUAL	
WeakIdentityMap	TokenNameIdentifier	 Weak Identity Map
.	TokenNameDOT	
newConcurrentHashMap	TokenNameIdentifier	 new Concurrent Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
getAttributeInterfaces	TokenNameIdentifier	 get Attribute Interfaces
(	TokenNameLPAREN	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
foundInterfaces	TokenNameIdentifier	 found Interfaces
=	TokenNameEQUAL	
knownImplClasses	TokenNameIdentifier	 known Impl Classes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
foundInterfaces	TokenNameIdentifier	 found Interfaces
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have the slight chance that another thread may do the same, but who cares? 	TokenNameCOMMENT_LINE	we have the slight chance that another thread may do the same, but who cares? 
foundInterfaces	TokenNameIdentifier	 found Interfaces
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find all interfaces that this attribute instance implements 	TokenNameCOMMENT_LINE	find all interfaces that this attribute instance implements 
// and that extend the Attribute interface 	TokenNameCOMMENT_LINE	and that extend the Attribute interface 
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
actClazz	TokenNameIdentifier	 act Clazz
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
curInterface	TokenNameIdentifier	 cur Interface
:	TokenNameCOLON	
actClazz	TokenNameIdentifier	 act Clazz
.	TokenNameDOT	
getInterfaces	TokenNameIdentifier	 get Interfaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curInterface	TokenNameIdentifier	 cur Interface
!=	TokenNameNOT_EQUAL	
Attribute	TokenNameIdentifier	 Attribute
.	TokenNameDOT	
class	TokenNameclass	
&&	TokenNameAND_AND	
Attribute	TokenNameIdentifier	 Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
curInterface	TokenNameIdentifier	 cur Interface
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundInterfaces	TokenNameIdentifier	 found Interfaces
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
curInterface	TokenNameIdentifier	 cur Interface
.	TokenNameDOT	
asSubclass	TokenNameIdentifier	 as Subclass
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
actClazz	TokenNameIdentifier	 act Clazz
=	TokenNameEQUAL	
actClazz	TokenNameIdentifier	 act Clazz
.	TokenNameDOT	
getSuperclass	TokenNameIdentifier	 get Superclass
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
actClazz	TokenNameIdentifier	 act Clazz
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
knownImplClasses	TokenNameIdentifier	 known Impl Classes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
foundInterfaces	TokenNameIdentifier	 found Interfaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
foundInterfaces	TokenNameIdentifier	 found Interfaces
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <b>Expert:</b> Adds a custom AttributeImpl instance with one or more Attribute interfaces. * <p><font color="red"><b>Please note:</b> It is not guaranteed, that <code>att</code> is added to * the <code>AttributeSource</code>, because the provided attributes may already exist. * You should always retrieve the wanted attributes using {@link #getAttribute} after adding * with this method and cast to your class. * The recommended way to use custom implementations is using an {@link AttributeFactory}. * </font></p> */	TokenNameCOMMENT_JAVADOC	 <b>Expert:</b> Adds a custom AttributeImpl instance with one or more Attribute interfaces. <p><font color="red"><b>Please note:</b> It is not guaranteed, that <code>att</code> is added to the <code>AttributeSource</code>, because the provided attributes may already exist. You should always retrieve the wanted attributes using {@link #getAttribute} after adding with this method and cast to your class. The recommended way to use custom implementations is using an {@link AttributeFactory}. </font></p> 
public	TokenNamepublic	
void	TokenNamevoid	
addAttributeImpl	TokenNameIdentifier	 add Attribute Impl
(	TokenNameLPAREN	
final	TokenNamefinal	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
att	TokenNameIdentifier	 att
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributeImpls	TokenNameIdentifier	 attribute Impls
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
foundInterfaces	TokenNameIdentifier	 found Interfaces
=	TokenNameEQUAL	
getAttributeInterfaces	TokenNameIdentifier	 get Attribute Interfaces
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add all interfaces of this AttributeImpl to the maps 	TokenNameCOMMENT_LINE	add all interfaces of this AttributeImpl to the maps 
for	TokenNamefor	
(	TokenNameLPAREN	
WeakReference	TokenNameIdentifier	 Weak Reference
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>>	TokenNameRIGHT_SHIFT	
curInterfaceRef	TokenNameIdentifier	 cur Interface Ref
:	TokenNameCOLON	
foundInterfaces	TokenNameIdentifier	 found Interfaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
curInterface	TokenNameIdentifier	 cur Interface
=	TokenNameEQUAL	
curInterfaceRef	TokenNameIdentifier	 cur Interface Ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
(	TokenNameLPAREN	
curInterface	TokenNameIdentifier	 cur Interface
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"We have a strong reference on the class holding the interfaces, so they should never get evicted"	TokenNameStringLiteral	We have a strong reference on the class holding the interfaces, so they should never get evicted
;	TokenNameSEMICOLON	
// Attribute is a superclass of this interface 	TokenNameCOMMENT_LINE	Attribute is a superclass of this interface 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
curInterface	TokenNameIdentifier	 cur Interface
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// invalidate state to force recomputation in captureState() 	TokenNameCOMMENT_LINE	invalidate state to force recomputation in captureState() 
this	TokenNamethis	
.	TokenNameDOT	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
curInterface	TokenNameIdentifier	 cur Interface
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeImpls	TokenNameIdentifier	 attribute Impls
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
,	TokenNameCOMMA	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The caller must pass in a Class&lt;? extends Attribute&gt; value. * This method first checks if an instance of that class is * already in this AttributeSource and returns it. Otherwise a * new instance is created, added to this AttributeSource and returned. */	TokenNameCOMMENT_JAVADOC	 The caller must pass in a Class&lt;? extends Attribute&gt; value. This method first checks if an instance of that class is already in this AttributeSource and returns it. Otherwise a new instance is created, added to this AttributeSource and returned. 
public	TokenNamepublic	
<	TokenNameLESS	
A	TokenNameIdentifier	 A
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
A	TokenNameIdentifier	 A
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
A	TokenNameIdentifier	 A
>	TokenNameGREATER	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
attImpl	TokenNameIdentifier	 att Impl
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attImpl	TokenNameIdentifier	 att Impl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
isInterface	TokenNameIdentifier	 is Interface
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Attribute	TokenNameIdentifier	 Attribute
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"addAttribute() only accepts an interface that extends Attribute, but "	TokenNameStringLiteral	addAttribute() only accepts an interface that extends Attribute, but 
+	TokenNamePLUS	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" does not fulfil this contract."	TokenNameStringLiteral	 does not fulfil this contract.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addAttributeImpl	TokenNameIdentifier	 add Attribute Impl
(	TokenNameLPAREN	
attImpl	TokenNameIdentifier	 att Impl
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createAttributeInstance	TokenNameIdentifier	 create Attribute Instance
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
cast	TokenNameIdentifier	 cast
(	TokenNameLPAREN	
attImpl	TokenNameIdentifier	 att Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true, iff this AttributeSource has any attributes */	TokenNameCOMMENT_JAVADOC	 Returns true, iff this AttributeSource has any attributes 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
this	TokenNamethis	
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The caller must pass in a Class&lt;? extends Attribute&gt; value. * Returns true, iff this AttributeSource contains the passed-in Attribute. */	TokenNameCOMMENT_JAVADOC	 The caller must pass in a Class&lt;? extends Attribute&gt; value. Returns true, iff this AttributeSource contains the passed-in Attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The caller must pass in a Class&lt;? extends Attribute&gt; value. * Returns the instance of the passed in Attribute contained in this AttributeSource * * @throws IllegalArgumentException if this AttributeSource does not contain the * Attribute. It is recommended to always use {@link #addAttribute} even in consumers * of TokenStreams, because you cannot know if a specific TokenStream really uses * a specific Attribute. {@link #addAttribute} will automatically make the attribute * available. If you want to only use the attribute, if it is available (to optimize * consuming), use {@link #hasAttribute}. */	TokenNameCOMMENT_JAVADOC	 The caller must pass in a Class&lt;? extends Attribute&gt; value. Returns the instance of the passed in Attribute contained in this AttributeSource * @throws IllegalArgumentException if this AttributeSource does not contain the Attribute. It is recommended to always use {@link #addAttribute} even in consumers of TokenStreams, because you cannot know if a specific TokenStream really uses a specific Attribute. {@link #addAttribute} will automatically make the attribute available. If you want to only use the attribute, if it is available (to optimize consuming), use {@link #hasAttribute}. 
public	TokenNamepublic	
<	TokenNameLESS	
A	TokenNameIdentifier	 A
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
A	TokenNameIdentifier	 A
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
A	TokenNameIdentifier	 A
>	TokenNameGREATER	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
attImpl	TokenNameIdentifier	 att Impl
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attImpl	TokenNameIdentifier	 att Impl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"This AttributeSource does not have the attribute '"	TokenNameStringLiteral	This AttributeSource does not have the attribute '
+	TokenNamePLUS	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'."	TokenNameStringLiteral	'.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
cast	TokenNameIdentifier	 cast
(	TokenNameLPAREN	
attImpl	TokenNameIdentifier	 att Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
State	TokenNameIdentifier	 State
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
State	TokenNameIdentifier	 State
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
State	TokenNameIdentifier	 State
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
currentState	TokenNameIdentifier	 current State
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
State	TokenNameIdentifier	 State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
attributeImpls	TokenNameIdentifier	 attribute Impls
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
State	TokenNameIdentifier	 State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets all Attributes in this AttributeSource by calling * {@link AttributeImpl#clear()} on each Attribute implementation. */	TokenNameCOMMENT_JAVADOC	 Resets all Attributes in this AttributeSource by calling {@link AttributeImpl#clear()} on each Attribute implementation. 
public	TokenNamepublic	
void	TokenNamevoid	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Captures the state of all Attributes. The return value can be passed to * {@link #restoreState} to restore the state of this or another AttributeSource. */	TokenNameCOMMENT_JAVADOC	 Captures the state of all Attributes. The return value can be passed to {@link #restoreState} to restore the state of this or another AttributeSource. 
public	TokenNamepublic	
State	TokenNameIdentifier	 State
captureState	TokenNameIdentifier	 capture State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
(	TokenNameLPAREN	
State	TokenNameIdentifier	 State
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Restores this state by copying the values of all attribute implementations * that this state contains into the attributes implementations of the targetStream. * The targetStream must contain a corresponding instance for each argument * contained in this state (e.g. it is not possible to restore the state of * an AttributeSource containing a TermAttribute into a AttributeSource using * a Token instance as implementation). * <p> * Note that this method does not affect attributes of the targetStream * that are not contained in this state. In other words, if for example * the targetStream contains an OffsetAttribute, but this state doesn't, then * the value of the OffsetAttribute remains unchanged. It might be desirable to * reset its value to the default, in which case the caller should first * call {@link TokenStream#clearAttributes()} on the targetStream. */	TokenNameCOMMENT_JAVADOC	 Restores this state by copying the values of all attribute implementations that this state contains into the attributes implementations of the targetStream. The targetStream must contain a corresponding instance for each argument contained in this state (e.g. it is not possible to restore the state of an AttributeSource containing a TermAttribute into a AttributeSource using a Token instance as implementation). <p> Note that this method does not affect attributes of the targetStream that are not contained in this state. In other words, if for example the targetStream contains an OffsetAttribute, but this state doesn't, then the value of the OffsetAttribute remains unchanged. It might be desirable to reset its value to the default, in which case the caller should first call {@link TokenStream#clearAttributes()} on the targetStream. 
public	TokenNamepublic	
void	TokenNamevoid	
restoreState	TokenNameIdentifier	 restore State
(	TokenNameLPAREN	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
targetImpl	TokenNameIdentifier	 target Impl
=	TokenNameEQUAL	
attributeImpls	TokenNameIdentifier	 attribute Impls
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetImpl	TokenNameIdentifier	 target Impl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"State contains AttributeImpl of type "	TokenNameStringLiteral	State contains AttributeImpl of type 
+	TokenNamePLUS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" that is not in in this AttributeSource"	TokenNameStringLiteral	 that is not in in this AttributeSource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
targetImpl	TokenNameIdentifier	 target Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
AttributeSource	TokenNameIdentifier	 Attribute Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributeSource	TokenNameIdentifier	 Attribute Source
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
attributeImpls	TokenNameIdentifier	 attribute Impls
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
attributeImpls	TokenNameIdentifier	 attribute Impls
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// it is only equal if all attribute impls are the same in the same order 	TokenNameCOMMENT_LINE	it is only equal if all attribute impls are the same in the same order 
State	TokenNameIdentifier	 State
thisState	TokenNameIdentifier	 this State
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
State	TokenNameIdentifier	 State
otherState	TokenNameIdentifier	 other State
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
thisState	TokenNameIdentifier	 this State
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
otherState	TokenNameIdentifier	 other State
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherState	TokenNameIdentifier	 other State
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
thisState	TokenNameIdentifier	 this State
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
otherState	TokenNameIdentifier	 other State
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
thisState	TokenNameIdentifier	 this State
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
thisState	TokenNameIdentifier	 this State
=	TokenNameEQUAL	
thisState	TokenNameIdentifier	 this State
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
otherState	TokenNameIdentifier	 other State
=	TokenNameEQUAL	
otherState	TokenNameIdentifier	 other State
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of the object. In general, the {@code toString} method * returns a string that &quot;textually represents&quot; this object. * * <p><b>WARNING:</b> For backwards compatibility this method is implemented as * in Lucene 2.9/3.0. In Lucene 4.0 this default implementation * will be removed. * * <p>It is recommeneded to use {@link #reflectAsString} or {@link #reflectWith} * to get a well-defined output of AttributeSource's internals. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of the object. In general, the {@code toString} method returns a string that &quot;textually represents&quot; this object. * <p><b>WARNING:</b> For backwards compatibility this method is implemented as in Lucene 2.9/3.0. In Lucene 4.0 this default implementation will be removed. * <p>It is recommeneded to use {@link #reflectAsString} or {@link #reflectWith} to get a well-defined output of AttributeSource's internals. 
// TODO: @deprecated remove this method in 4.0 	TokenNameCOMMENT_LINE	TODO: @deprecated remove this method in 4.0 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method returns the current attribute values as a string in the following format * by calling the {@link #reflectWith(AttributeReflector)} method: * * <ul> * <li><em>iff {@code prependAttClass=true}:</em> {@code "AttributeClass#key=value,AttributeClass#key=value"} * <li><em>iff {@code prependAttClass=false}:</em> {@code "key=value,key=value"} * </ul> * * @see #reflectWith(AttributeReflector) */	TokenNameCOMMENT_JAVADOC	 This method returns the current attribute values as a string in the following format by calling the {@link #reflectWith(AttributeReflector)} method: * <ul> <li><em>iff {@code prependAttClass=true}:</em> {@code "AttributeClass#key=value,AttributeClass#key=value"} <li><em>iff {@code prependAttClass=false}:</em> {@code "key=value,key=value"} </ul> * @see #reflectWith(AttributeReflector) 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
reflectAsString	TokenNameIdentifier	 reflect As String
(	TokenNameLPAREN	
final	TokenNamefinal	
boolean	TokenNameboolean	
prependAttClass	TokenNameIdentifier	 prepend Att Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reflectWith	TokenNameIdentifier	 reflect With
(	TokenNameLPAREN	
new	TokenNamenew	
AttributeReflector	TokenNameIdentifier	 Attribute Reflector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reflect	TokenNameIdentifier	 reflect
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
attClass	TokenNameIdentifier	 att Class
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prependAttClass	TokenNameIdentifier	 prepend Att Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
attClass	TokenNameIdentifier	 att Class
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is for introspection of attributes, it should simply * add the key/values this AttributeSource holds to the given {@link AttributeReflector}. * * <p>This method iterates over all Attribute implementations and calls the * corresponding {@link AttributeImpl#reflectWith} method.</p> * * @see AttributeImpl#reflectWith */	TokenNameCOMMENT_JAVADOC	 This method is for introspection of attributes, it should simply add the key/values this AttributeSource holds to the given {@link AttributeReflector}. * <p>This method iterates over all Attribute implementations and calls the corresponding {@link AttributeImpl#reflectWith} method.</p> * @see AttributeImpl#reflectWith 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
reflectWith	TokenNameIdentifier	 reflect With
(	TokenNameLPAREN	
AttributeReflector	TokenNameIdentifier	 Attribute Reflector
reflector	TokenNameIdentifier	 reflector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
reflectWith	TokenNameIdentifier	 reflect With
(	TokenNameLPAREN	
reflector	TokenNameIdentifier	 reflector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Performs a clone of all {@link AttributeImpl} instances returned in a new * {@code AttributeSource} instance. This method can be used to e.g. create another TokenStream * with exactly the same attributes (using {@link #AttributeSource(AttributeSource)}). * You can also use it as a (non-performant) replacement for {@link #captureState}, if you need to look * into / modify the captured state. */	TokenNameCOMMENT_JAVADOC	 Performs a clone of all {@link AttributeImpl} instances returned in a new {@code AttributeSource} instance. This method can be used to e.g. create another TokenStream with exactly the same attributes (using {@link #AttributeSource(AttributeSource)}). You can also use it as a (non-performant) replacement for {@link #captureState}, if you need to look into / modify the captured state. 
public	TokenNamepublic	
AttributeSource	TokenNameIdentifier	 Attribute Source
cloneAttributes	TokenNameIdentifier	 clone Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
AttributeSource	TokenNameIdentifier	 Attribute Source
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeSource	TokenNameIdentifier	 Attribute Source
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
factory	TokenNameIdentifier	 factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first clone the impls 	TokenNameCOMMENT_LINE	first clone the impls 
for	TokenNamefor	
(	TokenNameLPAREN	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
attributeImpls	TokenNameIdentifier	 attribute Impls
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// now the interfaces 	TokenNameCOMMENT_LINE	now the interfaces 
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
,	TokenNameCOMMA	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
attributeImpls	TokenNameIdentifier	 attribute Impls
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the contents of this {@code AttributeSource} to the given target {@code AttributeSource}. * The given instance has to provide all {@link Attribute}s this instance contains. * The actual attribute implementations must be identical in both {@code AttributeSource} instances; * ideally both AttributeSource instances should use the same {@link AttributeFactory}. * You can use this method as a replacement for {@link #restoreState}, if you use * {@link #cloneAttributes} instead of {@link #captureState}. */	TokenNameCOMMENT_JAVADOC	 Copies the contents of this {@code AttributeSource} to the given target {@code AttributeSource}. The given instance has to provide all {@link Attribute}s this instance contains. The actual attribute implementations must be identical in both {@code AttributeSource} instances; ideally both AttributeSource instances should use the same {@link AttributeFactory}. You can use this method as a replacement for {@link #restoreState}, if you use {@link #cloneAttributes} instead of {@link #captureState}. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
State	TokenNameIdentifier	 State
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
getCurrentState	TokenNameIdentifier	 get Current State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
targetImpl	TokenNameIdentifier	 target Impl
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
attributeImpls	TokenNameIdentifier	 attribute Impls
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
targetImpl	TokenNameIdentifier	 target Impl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"This AttributeSource contains AttributeImpl of type "	TokenNameStringLiteral	This AttributeSource contains AttributeImpl of type 
+	TokenNamePLUS	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" that is not in the target"	TokenNameStringLiteral	 that is not in the target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
targetImpl	TokenNameIdentifier	 target Impl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
