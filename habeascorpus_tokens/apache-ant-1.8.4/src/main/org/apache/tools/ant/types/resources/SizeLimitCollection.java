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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * ResourceCollection that imposes a size limit on another ResourceCollection. * @since Ant 1.7.1 */	TokenNameCOMMENT_JAVADOC	 ResourceCollection that imposes a size limit on another ResourceCollection. @since Ant 1.7.1 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SizeLimitCollection	TokenNameIdentifier	 Size Limit Collection
extends	TokenNameextends	
BaseResourceCollectionWrapper	TokenNameIdentifier	 Base Resource Collection Wrapper
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BAD_COUNT	TokenNameIdentifier	 BAD  COUNT
=	TokenNameEQUAL	
"size-limited collection count should be set to an int >= 0"	TokenNameStringLiteral	size-limited collection count should be set to an int >= 0
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Set the number of resources to be included. * @param i the count as <code>int</count>. */	TokenNameCOMMENT_JAVADOC	 Set the number of resources to be included. @param i the count as <code>int</count>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setCount	TokenNameIdentifier	 set Count
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkAttributesAllowed	TokenNameIdentifier	 check Attributes Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of resources to be included. Default is 1. * @return the count as <code>int</count>. */	TokenNameCOMMENT_JAVADOC	 Get the number of resources to be included. Default is 1. @return the count as <code>int</count>. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Efficient size implementation. * @return int size */	TokenNameCOMMENT_JAVADOC	 Efficient size implementation. @return int size 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
getResourceCollection	TokenNameIdentifier	 get Resource Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ct	TokenNameIdentifier	 ct
=	TokenNameEQUAL	
getValidCount	TokenNameIdentifier	 get Valid Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sz	TokenNameIdentifier	 sz
<	TokenNameLESS	
ct	TokenNameIdentifier	 ct
?	TokenNameQUESTION	
sz	TokenNameIdentifier	 sz
:	TokenNameCOLON	
ct	TokenNameIdentifier	 ct
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the count, verifying it is >= 0. * @return int count */	TokenNameCOMMENT_JAVADOC	 Get the count, verifying it is >= 0. @return int count 
protected	TokenNameprotected	
int	TokenNameint	
getValidCount	TokenNameIdentifier	 get Valid Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ct	TokenNameIdentifier	 ct
=	TokenNameEQUAL	
getCount	TokenNameIdentifier	 get Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ct	TokenNameIdentifier	 ct
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
BAD_COUNT	TokenNameIdentifier	 BAD  COUNT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ct	TokenNameIdentifier	 ct
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
