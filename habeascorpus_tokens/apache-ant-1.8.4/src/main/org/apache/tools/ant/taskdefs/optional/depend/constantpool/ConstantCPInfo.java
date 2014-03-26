/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
depend	TokenNameIdentifier	 depend
.	TokenNameDOT	
constantpool	TokenNameIdentifier	 constantpool
;	TokenNameSEMICOLON	
/** * A Constant Pool entry which represents a constant value. * */	TokenNameCOMMENT_JAVADOC	 A Constant Pool entry which represents a constant value. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ConstantCPInfo	TokenNameIdentifier	 Constant CP Info
extends	TokenNameextends	
ConstantPoolEntry	TokenNameIdentifier	 Constant Pool Entry
{	TokenNameLBRACE	
/** * The entry's untyped value. Each subclass interprets the constant * value based on the subclass's type. The value here must be * compatible. */	TokenNameCOMMENT_JAVADOC	 The entry's untyped value. Each subclass interprets the constant value based on the subclass's type. The value here must be compatible. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Initialise the constant entry. * * @param tagValue the constant pool entry type to be used. * @param entries the number of constant pool entry slots occupied by * this entry. */	TokenNameCOMMENT_JAVADOC	 Initialise the constant entry. * @param tagValue the constant pool entry type to be used. @param entries the number of constant pool entry slots occupied by this entry. 
protected	TokenNameprotected	
ConstantCPInfo	TokenNameIdentifier	 Constant CP Info
(	TokenNameLPAREN	
int	TokenNameint	
tagValue	TokenNameIdentifier	 tag Value
,	TokenNameCOMMA	
int	TokenNameint	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
tagValue	TokenNameIdentifier	 tag Value
,	TokenNameCOMMA	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of the constant. * * @return the value of the constant (untyped). */	TokenNameCOMMENT_JAVADOC	 Get the value of the constant. * @return the value of the constant (untyped). 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the constant value. * * @param newValue the new untyped value of this constant. */	TokenNameCOMMENT_JAVADOC	 Set the constant value. * @param newValue the new untyped value of this constant. 
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
