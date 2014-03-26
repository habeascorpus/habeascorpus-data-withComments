package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeReflector	TokenNameIdentifier	 Attribute Reflector
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UScript	TokenNameIdentifier	 U Script
;	TokenNameSEMICOLON	
/** * Implementation of {@link ScriptAttribute} that stores the script * as an integer. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Implementation of {@link ScriptAttribute} that stores the script as an integer. @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
ScriptAttributeImpl	TokenNameIdentifier	 Script Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
ScriptAttribute	TokenNameIdentifier	 Script Attribute
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
COMMON	TokenNameIdentifier	 COMMON
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getCode	TokenNameIdentifier	 get Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCode	TokenNameIdentifier	 set Code
(	TokenNameLPAREN	
int	TokenNameint	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getShortName	TokenNameIdentifier	 get Short Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
getShortName	TokenNameIdentifier	 get Short Name
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
COMMON	TokenNameIdentifier	 COMMON
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ScriptAttribute	TokenNameIdentifier	 Script Attribute
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ScriptAttribute	TokenNameIdentifier	 Script Attribute
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setCode	TokenNameIdentifier	 set Code
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
ScriptAttributeImpl	TokenNameIdentifier	 Script Attribute Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ScriptAttributeImpl	TokenNameIdentifier	 Script Attribute Impl
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
code	TokenNameIdentifier	 code
==	TokenNameEQUAL_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reflectWith	TokenNameIdentifier	 reflect With
(	TokenNameLPAREN	
AttributeReflector	TokenNameIdentifier	 Attribute Reflector
reflector	TokenNameIdentifier	 reflector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reflector	TokenNameIdentifier	 reflector
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
(	TokenNameLPAREN	
ScriptAttribute	TokenNameIdentifier	 Script Attribute
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
"script"	TokenNameStringLiteral	script
,	TokenNameCOMMA	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
