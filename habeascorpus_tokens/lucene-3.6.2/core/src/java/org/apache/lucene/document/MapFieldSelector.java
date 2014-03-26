package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * A {@link FieldSelector} based on a Map of field names to {@link FieldSelectorResult}s * */	TokenNameCOMMENT_JAVADOC	 A {@link FieldSelector} based on a Map of field names to {@link FieldSelectorResult}s 
public	TokenNamepublic	
class	TokenNameclass	
MapFieldSelector	TokenNameIdentifier	 Map Field Selector
implements	TokenNameimplements	
FieldSelector	TokenNameIdentifier	 Field Selector
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
>	TokenNameGREATER	
fieldSelections	TokenNameIdentifier	 field Selections
;	TokenNameSEMICOLON	
/** Create a a MapFieldSelector * @param fieldSelections maps from field names (String) to {@link FieldSelectorResult}s */	TokenNameCOMMENT_JAVADOC	 Create a a MapFieldSelector @param fieldSelections maps from field names (String) to {@link FieldSelectorResult}s 
public	TokenNamepublic	
MapFieldSelector	TokenNameIdentifier	 Map Field Selector
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
>	TokenNameGREATER	
fieldSelections	TokenNameIdentifier	 field Selections
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldSelections	TokenNameIdentifier	 field Selections
=	TokenNameEQUAL	
fieldSelections	TokenNameIdentifier	 field Selections
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a a MapFieldSelector * @param fields fields to LOAD. List of Strings. All other fields are NO_LOAD. */	TokenNameCOMMENT_JAVADOC	 Create a a MapFieldSelector @param fields fields to LOAD. List of Strings. All other fields are NO_LOAD. 
public	TokenNamepublic	
MapFieldSelector	TokenNameIdentifier	 Map Field Selector
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldSelections	TokenNameIdentifier	 field Selections
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
>	TokenNameGREATER	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
5	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
fieldSelections	TokenNameIdentifier	 field Selections
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a a MapFieldSelector * @param fields fields to LOAD. All other fields are NO_LOAD. */	TokenNameCOMMENT_JAVADOC	 Create a a MapFieldSelector @param fields fields to LOAD. All other fields are NO_LOAD. 
public	TokenNamepublic	
MapFieldSelector	TokenNameIdentifier	 Map Field Selector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Load field according to its associated value in fieldSelections * @param field a field name * @return the fieldSelections value that field maps to or NO_LOAD if none. */	TokenNameCOMMENT_JAVADOC	 Load field according to its associated value in fieldSelections @param field a field name @return the fieldSelections value that field maps to or NO_LOAD if none. 
public	TokenNamepublic	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
selection	TokenNameIdentifier	 selection
=	TokenNameEQUAL	
fieldSelections	TokenNameIdentifier	 field Selections
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
selection	TokenNameIdentifier	 selection
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
selection	TokenNameIdentifier	 selection
:	TokenNameCOLON	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
NO_LOAD	TokenNameIdentifier	 NO  LOAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
