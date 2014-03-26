/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Gte.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Gte.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XBoolean	TokenNameIdentifier	 X Boolean
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * The '>=' operation expression executer. */	TokenNameCOMMENT_JAVADOC	 The '>=' operation expression executer. 
public	TokenNamepublic	
class	TokenNameclass	
Gte	TokenNameIdentifier	 Gte
extends	TokenNameextends	
Operation	TokenNameIdentifier	 Operation
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
9142945909906680220L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Apply the operation to two operands, and return the result. * * * @param left non-null reference to the evaluated left operand. * @param right non-null reference to the evaluated right operand. * * @return non-null reference to the XObject that represents the result of the operation. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Apply the operation to two operands, and return the result. * @param left non-null reference to the evaluated left operand. @param right non-null reference to the evaluated right operand. * @return non-null reference to the XObject that represents the result of the operation. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
operate	TokenNameIdentifier	 operate
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
greaterThanOrEqual	TokenNameIdentifier	 greater Than Or Equal
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
?	TokenNameQUESTION	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_TRUE	TokenNameIdentifier	 S  TRUE
:	TokenNameCOLON	
XBoolean	TokenNameIdentifier	 X Boolean
.	TokenNameDOT	
S_FALSE	TokenNameIdentifier	 S  FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
