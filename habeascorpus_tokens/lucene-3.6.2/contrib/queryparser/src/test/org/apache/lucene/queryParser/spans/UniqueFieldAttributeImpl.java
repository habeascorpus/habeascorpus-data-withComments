package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
FieldableNode	TokenNameIdentifier	 Fieldable Node
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
AttributeImpl	TokenNameIdentifier	 Attribute Impl
;	TokenNameSEMICOLON	
/** * This attribute is used by the {@link UniqueFieldQueryNodeProcessor} * processor. It holds a value that defines which is the unique field name that * should be set in every {@link FieldableNode}.<br/> * <br/> * * @see UniqueFieldQueryNodeProcessor */	TokenNameCOMMENT_JAVADOC	 This attribute is used by the {@link UniqueFieldQueryNodeProcessor} processor. It holds a value that defines which is the unique field name that should be set in every {@link FieldableNode}.<br/> <br/> * @see UniqueFieldQueryNodeProcessor 
public	TokenNamepublic	
class	TokenNameclass	
UniqueFieldAttributeImpl	TokenNameIdentifier	 Unique Field Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
UniqueFieldAttribute	TokenNameIdentifier	 Unique Field Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8553318595851064232L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
enableBackwards	TokenNameIdentifier	 enable Backwards
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CharSequence	TokenNameIdentifier	 Char Sequence
uniqueField	TokenNameIdentifier	 unique Field
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UniqueFieldAttributeImpl	TokenNameIdentifier	 Unique Field Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
uniqueField	TokenNameIdentifier	 unique Field
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUniqueField	TokenNameIdentifier	 set Unique Field
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
uniqueField	TokenNameIdentifier	 unique Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
uniqueField	TokenNameIdentifier	 unique Field
=	TokenNameEQUAL	
uniqueField	TokenNameIdentifier	 unique Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CharSequence	TokenNameIdentifier	 Char Sequence
getUniqueField	TokenNameIdentifier	 get Unique Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
uniqueField	TokenNameIdentifier	 unique Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
instanceof	TokenNameinstanceof	
UniqueFieldAttributeImpl	TokenNameIdentifier	 Unique Field Attribute Impl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"cannot copy the values from attribute UniqueFieldAttribute to an instance of "	TokenNameStringLiteral	cannot copy the values from attribute UniqueFieldAttribute to an instance of 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UniqueFieldAttributeImpl	TokenNameIdentifier	 Unique Field Attribute Impl
uniqueFieldAttr	TokenNameIdentifier	 unique Field Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UniqueFieldAttributeImpl	TokenNameIdentifier	 Unique Field Attribute Impl
)	TokenNameRPAREN	
target	TokenNameIdentifier	 target
;	TokenNameSEMICOLON	
uniqueFieldAttr	TokenNameIdentifier	 unique Field Attr
.	TokenNameDOT	
uniqueField	TokenNameIdentifier	 unique Field
=	TokenNameEQUAL	
uniqueField	TokenNameIdentifier	 unique Field
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
UniqueFieldAttributeImpl	TokenNameIdentifier	 Unique Field Attribute Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
UniqueFieldAttributeImpl	TokenNameIdentifier	 Unique Field Attribute Impl
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
uniqueField	TokenNameIdentifier	 unique Field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
uniqueField	TokenNameIdentifier	 unique Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
uniqueField	TokenNameIdentifier	 unique Field
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"<uniqueField uniqueField='"	TokenNameStringLiteral	<uniqueField uniqueField='
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
uniqueField	TokenNameIdentifier	 unique Field
+	TokenNamePLUS	
"'/>"	TokenNameStringLiteral	'/>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
