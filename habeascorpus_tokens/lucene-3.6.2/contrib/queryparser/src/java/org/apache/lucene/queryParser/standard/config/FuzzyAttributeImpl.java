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
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
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
PhraseSlopQueryNodeProcessor	TokenNameIdentifier	 Phrase Slop Query Node Processor
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
/** * This attribute is used by {@link PhraseSlopQueryNodeProcessor} processor and * must be defined in the {@link QueryConfigHandler}. This attribute tells the * processor what is the default phrase slop when no slop is defined in a * phrase. <br/> * * @see org.apache.lucene.queryParser.standard.config.FuzzyAttribute * * @deprecated * */	TokenNameCOMMENT_JAVADOC	 This attribute is used by {@link PhraseSlopQueryNodeProcessor} processor and must be defined in the {@link QueryConfigHandler}. This attribute tells the processor what is the default phrase slop when no slop is defined in a phrase. <br/> * @see org.apache.lucene.queryParser.standard.config.FuzzyAttribute * @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
FuzzyAttributeImpl	TokenNameIdentifier	 Fuzzy Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
FuzzyAttribute	TokenNameIdentifier	 Fuzzy Attribute
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
2104763012527049527L	TokenNameLongLiteral	
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
FuzzyAttributeImpl	TokenNameIdentifier	 Fuzzy Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty constructor 	TokenNameCOMMENT_LINE	empty constructor 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPrefixLength	TokenNameIdentifier	 set Prefix Length
(	TokenNameLPAREN	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getFuzzyConfig	TokenNameIdentifier	 get Fuzzy Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setPrefixLength	TokenNameIdentifier	 set Prefix Length
(	TokenNameLPAREN	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPrefixLength	TokenNameIdentifier	 get Prefix Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFuzzyConfig	TokenNameIdentifier	 get Fuzzy Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPrefixLength	TokenNameIdentifier	 get Prefix Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFuzzyMinSimilarity	TokenNameIdentifier	 set Fuzzy Min Similarity
(	TokenNameLPAREN	
float	TokenNamefloat	
minSimilarity	TokenNameIdentifier	 min Similarity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getFuzzyConfig	TokenNameIdentifier	 get Fuzzy Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMinSimilarity	TokenNameIdentifier	 set Min Similarity
(	TokenNameLPAREN	
minSimilarity	TokenNameIdentifier	 min Similarity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
FuzzyConfig	TokenNameIdentifier	 Fuzzy Config
getFuzzyConfig	TokenNameIdentifier	 get Fuzzy Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FuzzyConfig	TokenNameIdentifier	 Fuzzy Config
fuzzyConfig	TokenNameIdentifier	 fuzzy Config
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
FUZZY_CONFIG	TokenNameIdentifier	 FUZZY  CONFIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fuzzyConfig	TokenNameIdentifier	 fuzzy Config
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fuzzyConfig	TokenNameIdentifier	 fuzzy Config
=	TokenNameEQUAL	
new	TokenNamenew	
FuzzyConfig	TokenNameIdentifier	 Fuzzy Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
FUZZY_CONFIG	TokenNameIdentifier	 FUZZY  CONFIG
,	TokenNameCOMMA	
fuzzyConfig	TokenNameIdentifier	 fuzzy Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fuzzyConfig	TokenNameIdentifier	 fuzzy Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getFuzzyMinSimilarity	TokenNameIdentifier	 get Fuzzy Min Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFuzzyConfig	TokenNameIdentifier	 get Fuzzy Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMinSimilarity	TokenNameIdentifier	 get Min Similarity
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
FuzzyAttributeImpl	TokenNameIdentifier	 Fuzzy Attribute Impl
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FuzzyAttributeImpl	TokenNameIdentifier	 Fuzzy Attribute Impl
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
.	TokenNameDOT	
getPrefixLength	TokenNameIdentifier	 get Prefix Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
getPrefixLength	TokenNameIdentifier	 get Prefix Length
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
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
getPrefixLength	TokenNameIdentifier	 get Prefix Length
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
FuzzyConfig	TokenNameIdentifier	 Fuzzy Config
fuzzyConfig	TokenNameIdentifier	 fuzzy Config
=	TokenNameEQUAL	
getFuzzyConfig	TokenNameIdentifier	 get Fuzzy Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
"<fuzzyAttribute prefixLength="	TokenNameStringLiteral	<fuzzyAttribute prefixLength=
+	TokenNamePLUS	
fuzzyConfig	TokenNameIdentifier	 fuzzy Config
.	TokenNameDOT	
getPrefixLength	TokenNameIdentifier	 get Prefix Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
",minSimilarity="	TokenNameStringLiteral	,minSimilarity=
+	TokenNamePLUS	
fuzzyConfig	TokenNameIdentifier	 fuzzy Config
.	TokenNameDOT	
getMinSimilarity	TokenNameIdentifier	 get Min Similarity
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
FUZZY_CONFIG	TokenNameIdentifier	 FUZZY  CONFIG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
FUZZY_CONFIG	TokenNameIdentifier	 FUZZY  CONFIG
,	TokenNameCOMMA	
new	TokenNamenew	
FuzzyConfig	TokenNameIdentifier	 Fuzzy Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
