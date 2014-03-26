package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A convenient class which offers a semi-immutable object wrapper * implementation which allows one to set the value of an object exactly once, * and retrieve it many times. If {@link #set(Object)} is called more than once, * {@link AlreadySetException} is thrown and the operation * will fail. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A convenient class which offers a semi-immutable object wrapper implementation which allows one to set the value of an object exactly once, and retrieve it many times. If {@link #set(Object)} is called more than once, {@link AlreadySetException} is thrown and the operation will fail. * @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SetOnce	TokenNameIdentifier	 Set Once
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** Thrown when {@link SetOnce#set(Object)} is called more than once. */	TokenNameCOMMENT_JAVADOC	 Thrown when {@link SetOnce#set(Object)} is called more than once. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
AlreadySetException	TokenNameIdentifier	 Already Set Exception
extends	TokenNameextends	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
AlreadySetException	TokenNameIdentifier	 Already Set Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"The object cannot be set twice!"	TokenNameStringLiteral	The object cannot be set twice!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
volatile	TokenNamevolatile	
T	TokenNameIdentifier	 T
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
set	TokenNameIdentifier	 set
;	TokenNameSEMICOLON	
/** * A default constructor which does not set the internal object, and allows * setting it by calling {@link #set(Object)}. */	TokenNameCOMMENT_JAVADOC	 A default constructor which does not set the internal object, and allows setting it by calling {@link #set(Object)}. 
public	TokenNamepublic	
SetOnce	TokenNameIdentifier	 Set Once
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new instance with the internal object set to the given object. * Note that any calls to {@link #set(Object)} afterwards will result in * {@link AlreadySetException} * * @throws AlreadySetException if called more than once * @see #set(Object) */	TokenNameCOMMENT_JAVADOC	 Creates a new instance with the internal object set to the given object. Note that any calls to {@link #set(Object)} afterwards will result in {@link AlreadySetException} * @throws AlreadySetException if called more than once @see #set(Object) 
public	TokenNamepublic	
SetOnce	TokenNameIdentifier	 Set Once
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicBoolean	TokenNameIdentifier	 Atomic Boolean
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the given object. If the object has already been set, an exception is thrown. */	TokenNameCOMMENT_JAVADOC	 Sets the given object. If the object has already been set, an exception is thrown. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
compareAndSet	TokenNameIdentifier	 compare And Set
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
AlreadySetException	TokenNameIdentifier	 Already Set Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the object set by {@link #set(Object)}. */	TokenNameCOMMENT_JAVADOC	 Returns the object set by {@link #set(Object)}. 
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
