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
selectors	TokenNameIdentifier	 selectors
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
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Comparison	TokenNameIdentifier	 Comparison
;	TokenNameSEMICOLON	
/** * Size ResourceSelector. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Size ResourceSelector. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Size	TokenNameIdentifier	 Size
implements	TokenNameimplements	
ResourceSelector	TokenNameIdentifier	 Resource Selector
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Comparison	TokenNameIdentifier	 Comparison
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
Comparison	TokenNameIdentifier	 Comparison
.	TokenNameDOT	
EQUAL	TokenNameIdentifier	 EQUAL
;	TokenNameSEMICOLON	
/** * Set the size to compare against. * @param l the long resource size. */	TokenNameCOMMENT_JAVADOC	 Set the size to compare against. @param l the long resource size. 
public	TokenNamepublic	
void	TokenNamevoid	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
long	TokenNamelong	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the size compared to by this Size ResourceSelector. * @return the long resource size. */	TokenNameCOMMENT_JAVADOC	 Get the size compared to by this Size ResourceSelector. @return the long resource size. 
public	TokenNamepublic	
long	TokenNamelong	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the comparison mode. * @param c a Comparison object. */	TokenNameCOMMENT_JAVADOC	 Set the comparison mode. @param c a Comparison object. 
public	TokenNamepublic	
void	TokenNamevoid	
setWhen	TokenNameIdentifier	 set When
(	TokenNameLPAREN	
Comparison	TokenNameIdentifier	 Comparison
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
when	TokenNameIdentifier	 when
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the comparison mode. * @return a Comparison object. */	TokenNameCOMMENT_JAVADOC	 Get the comparison mode. @return a Comparison object. 
public	TokenNamepublic	
Comparison	TokenNameIdentifier	 Comparison
getWhen	TokenNameIdentifier	 get When
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
when	TokenNameIdentifier	 when
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return true if this Resource is selected. * @param r the Resource to check. * @return whether the Resource was selected. */	TokenNameCOMMENT_JAVADOC	 Return true if this Resource is selected. @param r the Resource to check. @return whether the Resource was selected. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
return	TokenNamereturn	
when	TokenNameIdentifier	 when
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
