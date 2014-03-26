package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Type safe enumeration for the artifact status field. * * @author <a href="mailto:brett@apache.org">Brett Porter</a> */	TokenNameCOMMENT_JAVADOC	 Type safe enumeration for the artifact status field. * @author <a href="mailto:brett@apache.org">Brett Porter</a> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * No trust - no information about status. */	TokenNameCOMMENT_JAVADOC	 No trust - no information about status. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
NONE	TokenNameIdentifier	 NONE
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
(	TokenNameLPAREN	
"none"	TokenNameStringLiteral	none
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * No trust - information was generated with defaults. */	TokenNameCOMMENT_JAVADOC	 No trust - information was generated with defaults. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
GENERATED	TokenNameIdentifier	 GENERATED
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
(	TokenNameLPAREN	
"generated"	TokenNameStringLiteral	generated
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Low trust - was converted from the Maven 1.x repository. */	TokenNameCOMMENT_JAVADOC	 Low trust - was converted from the Maven 1.x repository. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
CONVERTED	TokenNameIdentifier	 CONVERTED
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
(	TokenNameLPAREN	
"converted"	TokenNameStringLiteral	converted
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Moderate trust - it was deployed directly from a partner. */	TokenNameCOMMENT_JAVADOC	 Moderate trust - it was deployed directly from a partner. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
PARTNER	TokenNameIdentifier	 PARTNER
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
(	TokenNameLPAREN	
"partner"	TokenNameStringLiteral	partner
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Moderate trust - it was deployed directly by a user. */	TokenNameCOMMENT_JAVADOC	 Moderate trust - it was deployed directly by a user. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
DEPLOYED	TokenNameIdentifier	 DEPLOYED
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
(	TokenNameLPAREN	
"deployed"	TokenNameStringLiteral	deployed
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Trusted, as it has had its data verified by hand. */	TokenNameCOMMENT_JAVADOC	 Trusted, as it has had its data verified by hand. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
VERIFIED	TokenNameIdentifier	 VERIFIED
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
(	TokenNameLPAREN	
"verified"	TokenNameStringLiteral	verified
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
rank	TokenNameIdentifier	 rank
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
rank	TokenNameIdentifier	 rank
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rank	TokenNameIdentifier	 rank
=	TokenNameEQUAL	
rank	TokenNameIdentifier	 rank
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
retVal	TokenNameIdentifier	 ret Val
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retVal	TokenNameIdentifier	 ret Val
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
status	TokenNameIdentifier	 status
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retVal	TokenNameIdentifier	 ret Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
retVal	TokenNameIdentifier	 ret Val
:	TokenNameCOLON	
NONE	TokenNameIdentifier	 NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rank	TokenNameIdentifier	 rank
==	TokenNameEQUAL_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
rank	TokenNameIdentifier	 rank
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rank	TokenNameIdentifier	 rank
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
ArtifactStatus	TokenNameIdentifier	 Artifact Status
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rank	TokenNameIdentifier	 rank
-	TokenNameMINUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
rank	TokenNameIdentifier	 rank
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
