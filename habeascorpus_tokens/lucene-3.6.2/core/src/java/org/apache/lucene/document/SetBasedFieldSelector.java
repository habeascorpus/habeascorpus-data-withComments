package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
/** * Copyright 2004 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2004 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Declare what fields to load normally and what fields to load lazily * **/	TokenNameCOMMENT_JAVADOC	 Declare what fields to load normally and what fields to load lazily *
public	TokenNamepublic	
class	TokenNameclass	
SetBasedFieldSelector	TokenNameIdentifier	 Set Based Field Selector
implements	TokenNameimplements	
FieldSelector	TokenNameIdentifier	 Field Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fieldsToLoad	TokenNameIdentifier	 fields To Load
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
lazyFieldsToLoad	TokenNameIdentifier	 lazy Fields To Load
;	TokenNameSEMICOLON	
/** * Pass in the Set of {@link Field} names to load and the Set of {@link Field} names to load lazily. If both are null, the * Document will not have any {@link Field} on it. * @param fieldsToLoad A Set of {@link String} field names to load. May be empty, but not null * @param lazyFieldsToLoad A Set of {@link String} field names to load lazily. May be empty, but not null */	TokenNameCOMMENT_JAVADOC	 Pass in the Set of {@link Field} names to load and the Set of {@link Field} names to load lazily. If both are null, the Document will not have any {@link Field} on it. @param fieldsToLoad A Set of {@link String} field names to load. May be empty, but not null @param lazyFieldsToLoad A Set of {@link String} field names to load lazily. May be empty, but not null 
public	TokenNamepublic	
SetBasedFieldSelector	TokenNameIdentifier	 Set Based Field Selector
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fieldsToLoad	TokenNameIdentifier	 fields To Load
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
lazyFieldsToLoad	TokenNameIdentifier	 lazy Fields To Load
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldsToLoad	TokenNameIdentifier	 fields To Load
=	TokenNameEQUAL	
fieldsToLoad	TokenNameIdentifier	 fields To Load
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lazyFieldsToLoad	TokenNameIdentifier	 lazy Fields To Load
=	TokenNameEQUAL	
lazyFieldsToLoad	TokenNameIdentifier	 lazy Fields To Load
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate whether to load the field with the given name or not. If the {@link Field#name()} is not in either of the * initializing Sets, then {@link org.apache.lucene.document.FieldSelectorResult#NO_LOAD} is returned. If a Field name * is in both <code>fieldsToLoad</code> and <code>lazyFieldsToLoad</code>, lazy has precedence. * * @param fieldName The {@link Field} name to check * @return The {@link FieldSelectorResult} */	TokenNameCOMMENT_JAVADOC	 Indicate whether to load the field with the given name or not. If the {@link Field#name()} is not in either of the initializing Sets, then {@link org.apache.lucene.document.FieldSelectorResult#NO_LOAD} is returned. If a Field name is in both <code>fieldsToLoad</code> and <code>lazyFieldsToLoad</code>, lazy has precedence. * @param fieldName The {@link Field} name to check @return The {@link FieldSelectorResult} 
public	TokenNamepublic	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
NO_LOAD	TokenNameIdentifier	 NO  LOAD
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldsToLoad	TokenNameIdentifier	 fields To Load
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
LOAD	TokenNameIdentifier	 LOAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lazyFieldsToLoad	TokenNameIdentifier	 lazy Fields To Load
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
FieldSelectorResult	TokenNameIdentifier	 Field Selector Result
.	TokenNameDOT	
LAZY_LOAD	TokenNameIdentifier	 LAZY  LOAD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
