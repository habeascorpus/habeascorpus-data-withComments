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
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
import	TokenNameimport	
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
Resource	TokenNameIdentifier	 Resource
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceUtils	TokenNameIdentifier	 Resource Utils
;	TokenNameSEMICOLON	
/** * Compares Resources by content. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Compares Resources by content. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Content	TokenNameIdentifier	 Content
extends	TokenNameextends	
ResourceComparator	TokenNameIdentifier	 Resource Comparator
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Set binary mode for this Content ResourceComparator. If this * attribute is set to false, Resource content will be compared * ignoring platform line-ending conventions. * Default is <code>true</code>. * @param b whether to compare content in binary mode. */	TokenNameCOMMENT_JAVADOC	 Set binary mode for this Content ResourceComparator. If this attribute is set to false, Resource content will be compared ignoring platform line-ending conventions. Default is <code>true</code>. @param b whether to compare content in binary mode. 
public	TokenNamepublic	
void	TokenNamevoid	
setBinary	TokenNameIdentifier	 set Binary
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
binary	TokenNameIdentifier	 binary
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Learn whether this Content ResourceComparator is operating in binary mode. * @return boolean binary flag. */	TokenNameCOMMENT_JAVADOC	 Learn whether this Content ResourceComparator is operating in binary mode. @return boolean binary flag. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBinary	TokenNameIdentifier	 is Binary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
binary	TokenNameIdentifier	 binary
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare two Resources by content. * @param foo the first Resource. * @param bar the second Resource. * @return a negative integer, zero, or a positive integer as the first * argument is less than, equal to, or greater than the second. * @throws BuildException if I/O errors occur. * @see org.apache.tools.ant.util.ResourceUtils#compareContent(Resource, Resource, boolean). */	TokenNameCOMMENT_JAVADOC	 Compare two Resources by content. @param foo the first Resource. @param bar the second Resource. @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second. @throws BuildException if I/O errors occur. @see org.apache.tools.ant.util.ResourceUtils#compareContent(Resource, Resource, boolean). 
protected	TokenNameprotected	
int	TokenNameint	
resourceCompare	TokenNameIdentifier	 resource Compare
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
foo	TokenNameIdentifier	 foo
,	TokenNameCOMMA	
Resource	TokenNameIdentifier	 Resource
bar	TokenNameIdentifier	 bar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
ResourceUtils	TokenNameIdentifier	 Resource Utils
.	TokenNameDOT	
compareContent	TokenNameIdentifier	 compare Content
(	TokenNameLPAREN	
foo	TokenNameIdentifier	 foo
,	TokenNameCOMMA	
bar	TokenNameIdentifier	 bar
,	TokenNameCOMMA	
!	TokenNameNOT	
binary	TokenNameIdentifier	 binary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
