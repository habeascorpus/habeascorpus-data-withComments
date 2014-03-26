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
;	TokenNameSEMICOLON	
/** * Datatype exception for invalid values. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: InvalidDatatypeValueException.java 446751 2006-09-15 21:54:06Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Datatype exception for invalid values. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: InvalidDatatypeValueException.java 446751 2006-09-15 21:54:06Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
extends	TokenNameextends	
DatatypeException	TokenNameIdentifier	 Datatype Exception
{	TokenNameLBRACE	
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5523739426958236125L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create a new datatype exception by providing an error code and a list * of error message substitution arguments. * * @param key error code * @param args error arguments */	TokenNameCOMMENT_JAVADOC	 Create a new datatype exception by providing an error code and a list of error message substitution arguments. * @param key error code @param args error arguments 
public	TokenNamepublic	
InvalidDatatypeValueException	TokenNameIdentifier	 Invalid Datatype Value Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
