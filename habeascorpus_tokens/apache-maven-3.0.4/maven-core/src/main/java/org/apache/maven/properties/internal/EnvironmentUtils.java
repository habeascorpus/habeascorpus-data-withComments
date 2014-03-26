package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
internal	TokenNameIdentifier	 internal
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
Properties	TokenNameIdentifier	 Properties
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Os	TokenNameIdentifier	 Os
;	TokenNameSEMICOLON	
/** * Assists the project builder. <strong>Warning:</strong> This is an internal utility class that is only public for * technical reasons, it is not part of the public API. In particular, this class can be changed or deleted without * prior notice. * * @since 3.0 * @author Benjamin Bentmann */	TokenNameCOMMENT_JAVADOC	 Assists the project builder. <strong>Warning:</strong> This is an internal utility class that is only public for technical reasons, it is not part of the public API. In particular, this class can be changed or deleted without prior notice. * @since 3.0 @author Benjamin Bentmann 
public	TokenNamepublic	
class	TokenNameclass	
EnvironmentUtils	TokenNameIdentifier	 Environment Utils
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Properties	TokenNameIdentifier	 Properties
envVars	TokenNameIdentifier	 env Vars
;	TokenNameSEMICOLON	
/** * Adds the environment variables in the form of properties whose keys are prefixed with {@code env.}, e.g. {@code * env.PATH}. Unlike native environment variables, properties are always case-sensitive. For the sake of * determinism, the environment variable names will be normalized to upper case on platforms with case-insensitive * variable lookup. * * @param props The properties to add the environment variables to, may be {@code null}. */	TokenNameCOMMENT_JAVADOC	 Adds the environment variables in the form of properties whose keys are prefixed with {@code env.}, e.g. {@code env.PATH}. Unlike native environment variables, properties are always case-sensitive. For the sake of determinism, the environment variable names will be normalized to upper case on platforms with case-insensitive variable lookup. * @param props The properties to add the environment variables to, may be {@code null}. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
addEnvVars	TokenNameIdentifier	 add Env Vars
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
envVars	TokenNameIdentifier	 env Vars
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Properties	TokenNameIdentifier	 Properties
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
caseSensitive	TokenNameIdentifier	 case Sensitive
=	TokenNameEQUAL	
!	TokenNameNOT	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
isFamily	TokenNameIdentifier	 is Family
(	TokenNameLPAREN	
Os	TokenNameIdentifier	 Os
.	TokenNameDOT	
FAMILY_WINDOWS	TokenNameIdentifier	 FAMILY  WINDOWS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getenv	TokenNameIdentifier	 getenv
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
"env."	TokenNameStringLiteral	env.
+	TokenNamePLUS	
(	TokenNameLPAREN	
caseSensitive	TokenNameIdentifier	 case Sensitive
?	TokenNameQUESTION	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
envVars	TokenNameIdentifier	 env Vars
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
envVars	TokenNameIdentifier	 env Vars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
