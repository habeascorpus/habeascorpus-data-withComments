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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
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
Reference	TokenNameIdentifier	 Reference
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
Resource	TokenNameIdentifier	 Resource
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
FileNameMapper	TokenNameIdentifier	 File Name Mapper
;	TokenNameSEMICOLON	
/** * A decorator around a different resource that uses a mapper to * dynamically remap the resource's name. * * <p>Strips the FileProvider interface from decorated resources since * it may be used to circumvent name mapping.</p> * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 A decorator around a different resource that uses a mapper to dynamically remap the resource's name. * <p>Strips the FileProvider interface from decorated resources since it may be used to circumvent name mapping.</p> * @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
MappedResource	TokenNameIdentifier	 Mapped Resource
extends	TokenNameextends	
ResourceDecorator	TokenNameIdentifier	 Resource Decorator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
mapper	TokenNameIdentifier	 mapper
;	TokenNameSEMICOLON	
/** * Wraps an existing resource. * @param r Resource to wrap * @param m FileNameMapper that handles mapping */	TokenNameCOMMENT_JAVADOC	 Wraps an existing resource. @param r Resource to wrap @param m FileNameMapper that handles mapping 
public	TokenNamepublic	
MappedResource	TokenNameIdentifier	 Mapped Resource
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
FileNameMapper	TokenNameIdentifier	 File Name Mapper
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mapper	TokenNameIdentifier	 mapper
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Maps the name. */	TokenNameCOMMENT_JAVADOC	 Maps the name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mapped	TokenNameIdentifier	 mapped
=	TokenNameEQUAL	
mapper	TokenNameIdentifier	 mapper
.	TokenNameDOT	
mapFileName	TokenNameIdentifier	 map File Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mapped	TokenNameIdentifier	 mapped
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
mapped	TokenNameIdentifier	 mapped
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
mapped	TokenNameIdentifier	 mapped
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Not really supported since mapper is never null. * @param r reference to set */	TokenNameCOMMENT_JAVADOC	 Not really supported since mapper is never null. @param r reference to set 
public	TokenNamepublic	
void	TokenNamevoid	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
Reference	TokenNameIdentifier	 Reference
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mapper	TokenNameIdentifier	 mapper
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRefid	TokenNameIdentifier	 set Refid
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Suppress FileProvider * @param clazz the type to implement */	TokenNameCOMMENT_JAVADOC	 Suppress FileProvider @param clazz the type to implement 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FileProvider	TokenNameIdentifier	 File Provider
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
as	TokenNameIdentifier	 as
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the hash code for this Resource. * @since Ant 1.8.1 */	TokenNameCOMMENT_JAVADOC	 Get the hash code for this Resource. @since Ant 1.8.1 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
super	TokenNamesuper	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equality check based on the resource's name in addition to the * resource itself. * @since Ant 1.8.1 */	TokenNameCOMMENT_JAVADOC	 Equality check based on the resource's name in addition to the resource itself. @since Ant 1.8.1 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MappedResource	TokenNameIdentifier	 Mapped Resource
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MappedResource	TokenNameIdentifier	 Mapped Resource
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
myName	TokenNameIdentifier	 my Name
=	TokenNameEQUAL	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
otherName	TokenNameIdentifier	 other Name
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
myName	TokenNameIdentifier	 my Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
otherName	TokenNameIdentifier	 other Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
myName	TokenNameIdentifier	 my Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherName	TokenNameIdentifier	 other Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
