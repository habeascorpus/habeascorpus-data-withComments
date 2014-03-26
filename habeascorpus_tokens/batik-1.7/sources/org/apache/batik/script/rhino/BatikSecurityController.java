/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
script	TokenNameIdentifier	 script
.	TokenNameDOT	
rhino	TokenNameIdentifier	 rhino
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
AccessControlContext	TokenNameIdentifier	 Access Control Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
AccessController	TokenNameIdentifier	 Access Controller
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
security	TokenNameIdentifier	 security
.	TokenNameDOT	
PrivilegedExceptionAction	TokenNameIdentifier	 Privileged Exception Action
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
Callable	TokenNameIdentifier	 Callable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
Context	TokenNameIdentifier	 Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
GeneratedClassLoader	TokenNameIdentifier	 Generated Class Loader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
Scriptable	TokenNameIdentifier	 Scriptable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
SecurityController	TokenNameIdentifier	 Security Controller
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
mozilla	TokenNameIdentifier	 mozilla
.	TokenNameDOT	
javascript	TokenNameIdentifier	 javascript
.	TokenNameDOT	
WrappedException	TokenNameIdentifier	 Wrapped Exception
;	TokenNameSEMICOLON	
/** * This implementation of the Rhino <tt>SecurityController</tt> interface is * meant for use within the context of Batik only. It is a partial * implementation of the interface that does what is needed by Batik and * no more. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: BatikSecurityController.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This implementation of the Rhino <tt>SecurityController</tt> interface is meant for use within the context of Batik only. It is a partial implementation of the interface that does what is needed by Batik and no more. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: BatikSecurityController.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
BatikSecurityController	TokenNameIdentifier	 Batik Security Controller
extends	TokenNameextends	
SecurityController	TokenNameIdentifier	 Security Controller
{	TokenNameLBRACE	
/** * Default constructor */	TokenNameCOMMENT_JAVADOC	 Default constructor 
public	TokenNamepublic	
GeneratedClassLoader	TokenNameIdentifier	 Generated Class Loader
createClassLoader	TokenNameIdentifier	 create Class Loader
(	TokenNameLPAREN	
final	TokenNamefinal	
ClassLoader	TokenNameIdentifier	 Class Loader
parentLoader	TokenNameIdentifier	 parent Loader
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
securityDomain	TokenNameIdentifier	 security Domain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
securityDomain	TokenNameIdentifier	 security Domain
instanceof	TokenNameinstanceof	
RhinoClassLoader	TokenNameIdentifier	 Rhino Class Loader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
RhinoClassLoader	TokenNameIdentifier	 Rhino Class Loader
)	TokenNameRPAREN	
securityDomain	TokenNameIdentifier	 security Domain
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// FIXX: This should be supported by intersecting perms. 	TokenNameCOMMENT_LINE	FIXX: This should be supported by intersecting perms. 
// Calling var script = Script(source); script(); is not supported 	TokenNameCOMMENT_LINE	Calling var script = Script(source); script(); is not supported 
throw	TokenNamethrow	
new	TokenNamenew	
SecurityException	TokenNameIdentifier	 Security Exception
(	TokenNameLPAREN	
"Script() objects are not supported"	TokenNameStringLiteral	Script() objects are not supported
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get dynamic security domain that allows an action only if it is allowed * by the current Java stack and <i>securityDomain</i>. If * <i>securityDomain</i> is null, return domain representing permissions * allowed by the current stack. */	TokenNameCOMMENT_JAVADOC	 Get dynamic security domain that allows an action only if it is allowed by the current Java stack and <i>securityDomain</i>. If <i>securityDomain</i> is null, return domain representing permissions allowed by the current stack. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getDynamicSecurityDomain	TokenNameIdentifier	 get Dynamic Security Domain
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
securityDomain	TokenNameIdentifier	 security Domain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RhinoClassLoader	TokenNameIdentifier	 Rhino Class Loader
)	TokenNameRPAREN	
securityDomain	TokenNameIdentifier	 security Domain
;	TokenNameSEMICOLON	
// Already have a rhino loader in place no need to 	TokenNameCOMMENT_LINE	Already have a rhino loader in place no need to 
// do anything (normally you would want to union the 	TokenNameCOMMENT_LINE	do anything (normally you would want to union the 
// the current stack with the loader's context but 	TokenNameCOMMENT_LINE	the current stack with the loader's context but 
// in our case no one has lower privledges than a 	TokenNameCOMMENT_LINE	in our case no one has lower privledges than a 
// rhino class loader). 	TokenNameCOMMENT_LINE	rhino class loader). 
if	TokenNameif	
(	TokenNameLPAREN	
loader	TokenNameIdentifier	 loader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
loader	TokenNameIdentifier	 loader
;	TokenNameSEMICOLON	
return	TokenNamereturn	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calls {@link Callable#call(Context, Scriptable, Scriptable, Object[])} of * <code>callable</code> under restricted security domain where an action is * allowed only if it is allowed according to the Java stack on the * moment of the <code>callWithDomain</code> call and * <code>securityDomain</code>. Any call to * {@link #getDynamicSecurityDomain(Object)} during execution of * {@link Callable#call(Context, Scriptable, Scriptable, Object[])} * should return a domain incorporate restrictions imposed by * <code>securityDomain</code>. */	TokenNameCOMMENT_JAVADOC	 Calls {@link Callable#call(Context, Scriptable, Scriptable, Object[])} of <code>callable</code> under restricted security domain where an action is allowed only if it is allowed according to the Java stack on the moment of the <code>callWithDomain</code> call and <code>securityDomain</code>. Any call to {@link #getDynamicSecurityDomain(Object)} during execution of {@link Callable#call(Context, Scriptable, Scriptable, Object[])} should return a domain incorporate restrictions imposed by <code>securityDomain</code>. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
callWithDomain	TokenNameIdentifier	 call With Domain
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
securityDomain	TokenNameIdentifier	 security Domain
,	TokenNameCOMMA	
final	TokenNamefinal	
Context	TokenNameIdentifier	 Context
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
final	TokenNamefinal	
Callable	TokenNameIdentifier	 Callable
callable	TokenNameIdentifier	 callable
,	TokenNameCOMMA	
final	TokenNamefinal	
Scriptable	TokenNameIdentifier	 Scriptable
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
final	TokenNamefinal	
Scriptable	TokenNameIdentifier	 Scriptable
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AccessControlContext	TokenNameIdentifier	 Access Control Context
acc	TokenNameIdentifier	 acc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
securityDomain	TokenNameIdentifier	 security Domain
instanceof	TokenNameinstanceof	
AccessControlContext	TokenNameIdentifier	 Access Control Context
)	TokenNameRPAREN	
acc	TokenNameIdentifier	 acc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AccessControlContext	TokenNameIdentifier	 Access Control Context
)	TokenNameRPAREN	
securityDomain	TokenNameIdentifier	 security Domain
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
RhinoClassLoader	TokenNameIdentifier	 Rhino Class Loader
loader	TokenNameIdentifier	 loader
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RhinoClassLoader	TokenNameIdentifier	 Rhino Class Loader
)	TokenNameRPAREN	
securityDomain	TokenNameIdentifier	 security Domain
;	TokenNameSEMICOLON	
acc	TokenNameIdentifier	 acc
=	TokenNameEQUAL	
loader	TokenNameIdentifier	 loader
.	TokenNameDOT	
rhinoAccessControlContext	TokenNameIdentifier	 rhino Access Control Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PrivilegedExceptionAction	TokenNameIdentifier	 Privileged Exception Action
execAction	TokenNameIdentifier	 exec Action
=	TokenNameEQUAL	
new	TokenNamenew	
PrivilegedExceptionAction	TokenNameIdentifier	 Privileged Exception Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
callable	TokenNameIdentifier	 callable
.	TokenNameDOT	
call	TokenNameIdentifier	 call
(	TokenNameLPAREN	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
scope	TokenNameIdentifier	 scope
,	TokenNameCOMMA	
thisObj	TokenNameIdentifier	 this Obj
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
AccessController	TokenNameIdentifier	 Access Controller
.	TokenNameDOT	
doPrivileged	TokenNameIdentifier	 do Privileged
(	TokenNameLPAREN	
execAction	TokenNameIdentifier	 exec Action
,	TokenNameCOMMA	
acc	TokenNameIdentifier	 acc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
WrappedException	TokenNameIdentifier	 Wrapped Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
