/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
ShortList	TokenNameIdentifier	 Short List
;	TokenNameSEMICOLON	
/** * Interface for storing values associated to an identity constraint. * Each value stored corresponds to a field declared for the identity * constraint. One instance of an object implementing this interface * is created for each identity constraint per element declaration in * the instance document to store the information for this identity * constraint. * <p> * <strong>Note:</strong> The component performing identity constraint * collection and validation is responsible for providing an * implementation of this interface. The component is also responsible * for performing the necessary checks required by each type of identity * constraint. * * @xerces.internal * * @author Andy Clark, IBM * * @version $Id: ValueStore.java 520039 2007-03-19 18:34:38Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Interface for storing values associated to an identity constraint. Each value stored corresponds to a field declared for the identity constraint. One instance of an object implementing this interface is created for each identity constraint per element declaration in the instance document to store the information for this identity constraint. <p> <strong>Note:</strong> The component performing identity constraint collection and validation is responsible for providing an implementation of this interface. The component is also responsible for performing the necessary checks required by each type of identity constraint. * @xerces.internal * @author Andy Clark, IBM * @version $Id: ValueStore.java 520039 2007-03-19 18:34:38Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ValueStore	TokenNameIdentifier	 Value Store
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// ValueStore methods 	TokenNameCOMMENT_LINE	ValueStore methods 
// 	TokenNameCOMMENT_LINE	 
/** * Adds the specified value to the value store. * * @param field The field associated to the value. This reference * is used to ensure that each field only adds a value * once within a selection scope. * @param mayMatch a flag indiciating whether the field may be matched. * @param actualValue The value to add. * @param valueType Type of the value to add. * @param itemValueType If the value is a list, a list of types for each of the values in the list. */	TokenNameCOMMENT_JAVADOC	 Adds the specified value to the value store. * @param field The field associated to the value. This reference is used to ensure that each field only adds a value once within a selection scope. @param mayMatch a flag indiciating whether the field may be matched. @param actualValue The value to add. @param valueType Type of the value to add. @param itemValueType If the value is a list, a list of types for each of the values in the list. 
public	TokenNamepublic	
void	TokenNamevoid	
addValue	TokenNameIdentifier	 add Value
(	TokenNameLPAREN	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mayMatch	TokenNameIdentifier	 may Match
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
actualValue	TokenNameIdentifier	 actual Value
,	TokenNameCOMMA	
short	TokenNameshort	
valueType	TokenNameIdentifier	 value Type
,	TokenNameCOMMA	
ShortList	TokenNameIdentifier	 Short List
itemValueType	TokenNameIdentifier	 item Value Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Since the valueStore will have access to an error reporter, this * allows it to be called appropriately. * @param key the key of the localized error message * @param args the list of arguments for substitution. */	TokenNameCOMMENT_JAVADOC	 Since the valueStore will have access to an error reporter, this allows it to be called appropriately. @param key the key of the localized error message @param args the list of arguments for substitution. 
public	TokenNamepublic	
void	TokenNamevoid	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface ValueStore 	TokenNameCOMMENT_LINE	interface ValueStore 
