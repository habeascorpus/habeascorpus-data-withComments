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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
AbstractQueryConfig	TokenNameIdentifier	 Abstract Query Config
;	TokenNameSEMICOLON	
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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
ConfigAttribute	TokenNameIdentifier	 Config Attribute
;	TokenNameSEMICOLON	
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
config	TokenNameIdentifier	 config
.	TokenNameDOT	
FieldConfig	TokenNameIdentifier	 Field Config
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
StandardQueryConfigHandler	TokenNameIdentifier	 Standard Query Config Handler
.	TokenNameDOT	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
MultiFieldQueryNodeProcessor	TokenNameIdentifier	 Multi Field Query Node Processor
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
/** * This attribute is used by {@link MultiFieldQueryNodeProcessor} processor and * it should be defined in a {@link FieldConfig}. This processor uses this * attribute to define which boost a specific field should have when none is * defined to it. <br/> * <br/> * * @see org.apache.lucene.queryParser.standard.config.BoostAttribute * * @deprecated * */	TokenNameCOMMENT_JAVADOC	 This attribute is used by {@link MultiFieldQueryNodeProcessor} processor and it should be defined in a {@link FieldConfig}. This processor uses this attribute to define which boost a specific field should have when none is defined to it. <br/> <br/> * @see org.apache.lucene.queryParser.standard.config.BoostAttribute * @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
BoostAttributeImpl	TokenNameIdentifier	 Boost Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
BoostAttribute	TokenNameIdentifier	 Boost Attribute
,	TokenNameCOMMA	
ConfigAttribute	TokenNameIdentifier	 Config Attribute
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
2104763012523049527L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
AbstractQueryConfig	TokenNameIdentifier	 Abstract Query Config
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
enableBackwards	TokenNameIdentifier	 enable Backwards
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BoostAttributeImpl	TokenNameIdentifier	 Boost Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty constructor 	TokenNameCOMMENT_LINE	empty constructor 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
BOOST	TokenNameIdentifier	 BOOST
,	TokenNameCOMMA	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
BOOST	TokenNameIdentifier	 BOOST
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
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
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
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
BoostAttributeImpl	TokenNameIdentifier	 Boost Attribute Impl
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BoostAttributeImpl	TokenNameIdentifier	 Boost Attribute Impl
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
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
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
"<boostAttribute boost="	TokenNameStringLiteral	<boostAttribute boost=
+	TokenNamePLUS	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"/>"	TokenNameStringLiteral	/>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
AbstractQueryConfig	TokenNameIdentifier	 Abstract Query Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
has	TokenNameIdentifier	 has
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
BOOST	TokenNameIdentifier	 BOOST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
BOOST	TokenNameIdentifier	 BOOST
,	TokenNameCOMMA	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
