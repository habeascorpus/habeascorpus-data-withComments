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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
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
ParametricRangeQueryNodeProcessor	TokenNameIdentifier	 Parametric Range Query Node Processor
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
/** * This attribute is used by {@link ParametricRangeQueryNodeProcessor} processor * and must be defined in the {@link QueryConfigHandler}. This attribute tells * the processor which {@link Resolution} to use when parsing the date. <br/> * * @see org.apache.lucene.queryParser.standard.config.DateResolutionAttribute * * @deprecated * */	TokenNameCOMMENT_JAVADOC	 This attribute is used by {@link ParametricRangeQueryNodeProcessor} processor and must be defined in the {@link QueryConfigHandler}. This attribute tells the processor which {@link Resolution} to use when parsing the date. <br/> * @see org.apache.lucene.queryParser.standard.config.DateResolutionAttribute * @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
DateResolutionAttributeImpl	TokenNameIdentifier	 Date Resolution Attribute Impl
extends	TokenNameextends	
AttributeImpl	TokenNameIdentifier	 Attribute Impl
implements	TokenNameimplements	
DateResolutionAttribute	TokenNameIdentifier	 Date Resolution Attribute
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
6804360312723049526L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
enableBackwards	TokenNameIdentifier	 enable Backwards
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
AbstractQueryConfig	TokenNameIdentifier	 Abstract Query Config
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DateResolutionAttributeImpl	TokenNameIdentifier	 Date Resolution Attribute Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDateResolution	TokenNameIdentifier	 set Date Resolution
(	TokenNameLPAREN	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
dateResolution	TokenNameIdentifier	 date Resolution
)	TokenNameRPAREN	
{	TokenNameLBRACE	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ConfigurationKeys	TokenNameIdentifier	 Configuration Keys
.	TokenNameDOT	
DATE_RESOLUTION	TokenNameIdentifier	 DATE  RESOLUTION
,	TokenNameCOMMA	
dateResolution	TokenNameIdentifier	 date Resolution
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
getDateResolution	TokenNameIdentifier	 get Date Resolution
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
DATE_RESOLUTION	TokenNameIdentifier	 DATE  RESOLUTION
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
DateResolutionAttributeImpl	TokenNameIdentifier	 Date Resolution Attribute Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DateResolutionAttributeImpl	TokenNameIdentifier	 Date Resolution Attribute Impl
dateResAttr	TokenNameIdentifier	 date Res Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DateResolutionAttributeImpl	TokenNameIdentifier	 Date Resolution Attribute Impl
)	TokenNameRPAREN	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dateResAttr	TokenNameIdentifier	 date Res Attr
.	TokenNameDOT	
getDateResolution	TokenNameIdentifier	 get Date Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
getDateResolution	TokenNameIdentifier	 get Date Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
dateResAttr	TokenNameIdentifier	 date Res Attr
.	TokenNameDOT	
getDateResolution	TokenNameIdentifier	 get Date Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDateResolution	TokenNameIdentifier	 get Date Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
Resolution	TokenNameIdentifier	 Resolution
resolution	TokenNameIdentifier	 resolution
=	TokenNameEQUAL	
getDateResolution	TokenNameIdentifier	 get Date Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
resolution	TokenNameIdentifier	 resolution
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
resolution	TokenNameIdentifier	 resolution
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
"<dateResolutionAttribute dateResolution='"	TokenNameStringLiteral	<dateResolutionAttribute dateResolution='
+	TokenNamePLUS	
getDateResolution	TokenNameIdentifier	 get Date Resolution
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'/>"	TokenNameStringLiteral	'/>
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
