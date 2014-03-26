package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
writercache	TokenNameIdentifier	 writercache
.	TokenNameDOT	
cl2o	TokenNameIdentifier	 cl2o
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Abstract class for storing Label->Ordinal mappings in a taxonomy. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Abstract class for storing Label->Ordinal mappings in a taxonomy. * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
{	TokenNameLBRACE	
protected	TokenNameprotected	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
InvalidOrdinal	TokenNameIdentifier	 Invalid Ordinal
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * return the maximal Ordinal assigned so far */	TokenNameCOMMENT_JAVADOC	 return the maximal Ordinal assigned so far 
public	TokenNamepublic	
int	TokenNameint	
getMaxOrdinal	TokenNameIdentifier	 get Max Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the next unassigned ordinal. The default behavior of this method * is to simply increment a counter. */	TokenNameCOMMENT_JAVADOC	 Returns the next unassigned ordinal. The default behavior of this method is to simply increment a counter. 
public	TokenNamepublic	
int	TokenNameint	
getNextOrdinal	TokenNameIdentifier	 get Next Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a new label if its not yet in the table. * Throws an {@link IllegalArgumentException} if the same label with * a different ordinal was previoulsy added to this table. */	TokenNameCOMMENT_JAVADOC	 Adds a new label if its not yet in the table. Throws an {@link IllegalArgumentException} if the same label with a different ordinal was previoulsy added to this table. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds a new label if its not yet in the table. * Throws an {@link IllegalArgumentException} if the same label with * a different ordinal was previoulsy added to this table. */	TokenNameCOMMENT_JAVADOC	 Adds a new label if its not yet in the table. Throws an {@link IllegalArgumentException} if the same label with a different ordinal was previoulsy added to this table. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the ordinal assigned to the given label, * or {@link #InvalidOrdinal} if the label cannot be found in this table. */	TokenNameCOMMENT_JAVADOC	 @return the ordinal assigned to the given label, or {@link #InvalidOrdinal} if the label cannot be found in this table. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the ordinal assigned to the given label, * or {@link #InvalidOrdinal} if the label cannot be found in this table. */	TokenNameCOMMENT_JAVADOC	 @return the ordinal assigned to the given label, or {@link #InvalidOrdinal} if the label cannot be found in this table. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
