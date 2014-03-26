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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
rules	TokenNameIdentifier	 rules
.	TokenNameDOT	
TestRule	TokenNameIdentifier	 Test Rule
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runner	TokenNameIdentifier	 runner
.	TokenNameDOT	
Description	TokenNameIdentifier	 Description
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
runners	TokenNameIdentifier	 runners
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Statement	TokenNameIdentifier	 Statement
;	TokenNameSEMICOLON	
/** * Restore system properties from before the nested {@link Statement}. */	TokenNameCOMMENT_JAVADOC	 Restore system properties from before the nested {@link Statement}. 
public	TokenNamepublic	
class	TokenNameclass	
SystemPropertiesRestoreRule	TokenNameIdentifier	 System Properties Restore Rule
implements	TokenNameimplements	
TestRule	TokenNameIdentifier	 Test Rule
{	TokenNameLBRACE	
/** * Ignored property keys. */	TokenNameCOMMENT_JAVADOC	 Ignored property keys. 
private	TokenNameprivate	
final	TokenNamefinal	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ignoredProperties	TokenNameIdentifier	 ignored Properties
;	TokenNameSEMICOLON	
/** * Restores all properties. */	TokenNameCOMMENT_JAVADOC	 Restores all properties. 
public	TokenNamepublic	
SystemPropertiesRestoreRule	TokenNameIdentifier	 System Properties Restore Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param ignoredProperties Properties that will be ignored (and will not be restored). */	TokenNameCOMMENT_JAVADOC	 @param ignoredProperties Properties that will be ignored (and will not be restored). 
public	TokenNamepublic	
SystemPropertiesRestoreRule	TokenNameIdentifier	 System Properties Restore Rule
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ignoredProperties	TokenNameIdentifier	 ignored Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignoredProperties	TokenNameIdentifier	 ignored Properties
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
ignoredProperties	TokenNameIdentifier	 ignored Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param ignoredProperties Properties that will be ignored (and will not be restored). */	TokenNameCOMMENT_JAVADOC	 @param ignoredProperties Properties that will be ignored (and will not be restored). 
public	TokenNamepublic	
SystemPropertiesRestoreRule	TokenNameIdentifier	 System Properties Restore Rule
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
ignoredProperties	TokenNameIdentifier	 ignored Properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignoredProperties	TokenNameIdentifier	 ignored Properties
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
ignoredProperties	TokenNameIdentifier	 ignored Properties
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Statement	TokenNameIdentifier	 Statement
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
final	TokenNamefinal	
Statement	TokenNameIdentifier	 Statement
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Description	TokenNameIdentifier	 Description
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Statement	TokenNameIdentifier	 Statement
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
cloneAsMap	TokenNameIdentifier	 clone As Map
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
cloneAsMap	TokenNameIdentifier	 clone As Map
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Restore original properties. 	TokenNameCOMMENT_LINE	Restore original properties. 
restore	TokenNameIdentifier	 restore
(	TokenNameLPAREN	
before	TokenNameIdentifier	 before
,	TokenNameCOMMA	
after	TokenNameIdentifier	 after
,	TokenNameCOMMA	
ignoredProperties	TokenNameIdentifier	 ignored Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
cloneAsMap	TokenNameIdentifier	 clone As Map
(	TokenNameLPAREN	
Properties	TokenNameIdentifier	 Properties
properties	TokenNameIdentifier	 properties
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
propertyNames	TokenNameIdentifier	 property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skip non-string properties or values, they're abuse of Properties object. 	TokenNameCOMMENT_LINE	Skip non-string properties or values, they're abuse of Properties object. 
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
ovalue	TokenNameIdentifier	 ovalue
=	TokenNameEQUAL	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ovalue	TokenNameIdentifier	 ovalue
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ovalue has to be a non-string object. Skip the property because 	TokenNameCOMMENT_LINE	ovalue has to be a non-string object. Skip the property because 
// System.clearProperty won't be able to cast back the existing value. 	TokenNameCOMMENT_LINE	System.clearProperty won't be able to cast back the existing value. 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
restore	TokenNameIdentifier	 restore
(	TokenNameLPAREN	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
before	TokenNameIdentifier	 before
,	TokenNameCOMMA	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
after	TokenNameIdentifier	 after
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
ignoredKeys	TokenNameIdentifier	 ignored Keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Clear anything that is present after but wasn't before. 	TokenNameCOMMENT_LINE	Clear anything that is present after but wasn't before. 
after	TokenNameIdentifier	 after
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
before	TokenNameIdentifier	 before
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
:	TokenNameCOLON	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ignoredKeys	TokenNameIdentifier	 ignored Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
clearProperty	TokenNameIdentifier	 clear Property
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Restore original property values unless they are ignored (then leave). 	TokenNameCOMMENT_LINE	Restore original property values unless they are ignored (then leave). 
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
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
before	TokenNameIdentifier	 before
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ignoredKeys	TokenNameIdentifier	 ignored Keys
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
clearProperty	TokenNameIdentifier	 clear Property
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Can this happen? 	TokenNameCOMMENT_LINE	Can this happen? 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
