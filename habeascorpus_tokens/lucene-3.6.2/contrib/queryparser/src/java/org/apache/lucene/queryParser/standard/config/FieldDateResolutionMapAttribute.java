package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
DateTools	TokenNameIdentifier	 Date Tools
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
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
/** * This attribute enables the user to define a default DateResolution per field. * it's used by {@link FieldDateResolutionFCListener#buildFieldConfig(org.apache.lucene.queryParser.core.config.FieldConfig)} * * @deprecated * */	TokenNameCOMMENT_JAVADOC	 This attribute enables the user to define a default DateResolution per field. it's used by {@link FieldDateResolutionFCListener#buildFieldConfig(org.apache.lucene.queryParser.core.config.FieldConfig)} * @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
interface	TokenNameinterface	
FieldDateResolutionMapAttribute	TokenNameIdentifier	 Field Date Resolution Map Attribute
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
{	TokenNameLBRACE	
/** * @param dateRes a mapping from field name to its default boost */	TokenNameCOMMENT_JAVADOC	 @param dateRes a mapping from field name to its default boost 
public	TokenNamepublic	
void	TokenNamevoid	
setFieldDateResolutionMap	TokenNameIdentifier	 set Field Date Resolution Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
>	TokenNameGREATER	
dateRes	TokenNameIdentifier	 date Res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
CharSequence	TokenNameIdentifier	 Char Sequence
,	TokenNameCOMMA	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
>	TokenNameGREATER	
getFieldDateResolutionMap	TokenNameIdentifier	 get Field Date Resolution Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
