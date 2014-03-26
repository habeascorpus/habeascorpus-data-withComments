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
/** * Compares Resources by is-directory status. As a container * of files, a directory is deemed "greater" than a file. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Compares Resources by is-directory status. As a container of files, a directory is deemed "greater" than a file. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Type	TokenNameIdentifier	 Type
extends	TokenNameextends	
ResourceComparator	TokenNameIdentifier	 Resource Comparator
{	TokenNameLBRACE	
/** * Compare two Resources. * @param foo the first Resource. * @param bar the second Resource. * @return a negative integer, zero, or a positive integer as the first * argument is less than, equal to, or greater than the second. */	TokenNameCOMMENT_JAVADOC	 Compare two Resources. @param foo the first Resource. @param bar the second Resource. @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second. 
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
boolean	TokenNameboolean	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
foo	TokenNameIdentifier	 foo
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
