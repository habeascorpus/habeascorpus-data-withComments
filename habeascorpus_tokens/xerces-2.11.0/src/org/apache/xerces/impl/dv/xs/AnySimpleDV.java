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
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dv	TokenNameIdentifier	 dv
.	TokenNameDOT	
ValidationContext	TokenNameIdentifier	 Validation Context
;	TokenNameSEMICOLON	
/** * Represent the schema type "anySimpleType" * * @xerces.internal * * @author Neeraj Bajaj, Sun Microsystems, inc. * @author Sandy Gao, IBM * * @version $Id: AnySimpleDV.java 446745 2006-09-15 21:43:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Represent the schema type "anySimpleType" * @xerces.internal * @author Neeraj Bajaj, Sun Microsystems, inc. @author Sandy Gao, IBM * @version $Id: AnySimpleDV.java 446745 2006-09-15 21:43:58Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
AnySimpleDV	TokenNameIdentifier	 Any Simple DV
extends	TokenNameextends	
TypeValidator	TokenNameIdentifier	 Type Validator
{	TokenNameLBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getAllowedFacets	TokenNameIdentifier	 get Allowed Facets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// anySimpleType doesn't allow any facet, not even whiteSpace 	TokenNameCOMMENT_LINE	anySimpleType doesn't allow any facet, not even whiteSpace 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getActualValue	TokenNameIdentifier	 get Actual Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
ValidationContext	TokenNameIdentifier	 Validation Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
content	TokenNameIdentifier	 content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class AnySimpleDV 	TokenNameCOMMENT_LINE	class AnySimpleDV 