package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
instantiated	TokenNameIdentifier	 instantiated
;	TokenNameSEMICOLON	
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Essentially a Map<FieldName, {@link org.apache.lucene.store.instantiated.FieldSetting}> */	TokenNameCOMMENT_JAVADOC	 Essentially a Map<FieldName, {@link org.apache.lucene.store.instantiated.FieldSetting}> 
class	TokenNameclass	
FieldSettings	TokenNameIdentifier	 Field Settings
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
FieldSettings	TokenNameIdentifier	 Field Settings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
/** field name */	TokenNameCOMMENT_JAVADOC	 field name 
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
FieldSetting	TokenNameIdentifier	 Field Setting
>	TokenNameGREATER	
fieldSettings	TokenNameIdentifier	 field Settings
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
FieldSetting	TokenNameIdentifier	 Field Setting
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
FieldSetting	TokenNameIdentifier	 Field Setting
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
FieldSetting	TokenNameIdentifier	 Field Setting
fieldSetting	TokenNameIdentifier	 field Setting
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldSetting	TokenNameIdentifier	 Field Setting
setting	TokenNameIdentifier	 setting
=	TokenNameEQUAL	
fieldSettings	TokenNameIdentifier	 field Settings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
setting	TokenNameIdentifier	 setting
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setting	TokenNameIdentifier	 setting
=	TokenNameEQUAL	
new	TokenNamenew	
FieldSetting	TokenNameIdentifier	 Field Setting
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldSettings	TokenNameIdentifier	 field Settings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
setting	TokenNameIdentifier	 setting
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
stored	TokenNameIdentifier	 stored
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setting	TokenNameIdentifier	 setting
.	TokenNameDOT	
stored	TokenNameIdentifier	 stored
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
"b3"	TokenNameStringLiteral	b3
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
indexed	TokenNameIdentifier	 indexed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setting	TokenNameIdentifier	 setting
.	TokenNameDOT	
indexed	TokenNameIdentifier	 indexed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
tokenized	TokenNameIdentifier	 tokenized
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setting	TokenNameIdentifier	 setting
.	TokenNameDOT	
tokenized	TokenNameIdentifier	 tokenized
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setting	TokenNameIdentifier	 setting
.	TokenNameDOT	
storeTermVector	TokenNameIdentifier	 store Term Vector
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
storeOffsetWithTermVector	TokenNameIdentifier	 store Offset With Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setting	TokenNameIdentifier	 setting
.	TokenNameDOT	
storeOffsetWithTermVector	TokenNameIdentifier	 store Offset With Term Vector
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
storePositionWithTermVector	TokenNameIdentifier	 store Position With Term Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setting	TokenNameIdentifier	 setting
.	TokenNameDOT	
storePositionWithTermVector	TokenNameIdentifier	 store Position With Term Vector
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldSetting	TokenNameIdentifier	 field Setting
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setting	TokenNameIdentifier	 setting
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
setting	TokenNameIdentifier	 setting
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FieldSetting	TokenNameIdentifier	 Field Setting
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldSettings	TokenNameIdentifier	 field Settings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
FieldSetting	TokenNameIdentifier	 Field Setting
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
create	TokenNameIdentifier	 create
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldSetting	TokenNameIdentifier	 Field Setting
fieldSetting	TokenNameIdentifier	 field Setting
=	TokenNameEQUAL	
fieldSettings	TokenNameIdentifier	 field Settings
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
create	TokenNameIdentifier	 create
&&	TokenNameAND_AND	
fieldSetting	TokenNameIdentifier	 field Setting
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldSetting	TokenNameIdentifier	 field Setting
=	TokenNameEQUAL	
new	TokenNamenew	
FieldSetting	TokenNameIdentifier	 Field Setting
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldSettings	TokenNameIdentifier	 field Settings
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
fieldSetting	TokenNameIdentifier	 field Setting
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fieldSetting	TokenNameIdentifier	 field Setting
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
FieldSetting	TokenNameIdentifier	 Field Setting
>	TokenNameGREATER	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldSettings	TokenNameIdentifier	 field Settings
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
