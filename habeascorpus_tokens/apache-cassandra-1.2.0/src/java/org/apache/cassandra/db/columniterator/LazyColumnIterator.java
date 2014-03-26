/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
columniterator	TokenNameIdentifier	 columniterator
;	TokenNameSEMICOLON	
/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
ColumnFamily	TokenNameIdentifier	 Column Family
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
DecoratedKey	TokenNameIdentifier	 Decorated Key
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/* * The goal of this encapsulating OnDiskAtomIterator is to delay the use of * the filter until columns are actually queried. * The reason for that is get_paged_slice because it change the start of * the filter after having seen the first row, and so we must not use the * filter before the row data is actually queried. However, mergeIterator * needs to "fetch" a row in advance. But all it needs is the key and so * this IColumnIterator make sure getKey() can be called without triggering * the use of the filter itself. */	TokenNameCOMMENT_BLOCK	 The goal of this encapsulating OnDiskAtomIterator is to delay the use of the filter until columns are actually queried. The reason for that is get_paged_slice because it change the start of the filter after having seen the first row, and so we must not use the filter before the row data is actually queried. However, mergeIterator needs to "fetch" a row in advance. But all it needs is the key and so this IColumnIterator make sure getKey() can be called without triggering the use of the filter itself. 
public	TokenNamepublic	
class	TokenNameclass	
LazyColumnIterator	TokenNameIdentifier	 Lazy Column Iterator
extends	TokenNameextends	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
<	TokenNameLESS	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
>	TokenNameGREATER	
implements	TokenNameimplements	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IColumnIteratorFactory	TokenNameIdentifier	 I Column Iterator Factory
subIteratorFactory	TokenNameIdentifier	 sub Iterator Factory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
subIterator	TokenNameIdentifier	 sub Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LazyColumnIterator	TokenNameIdentifier	 Lazy Column Iterator
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
IColumnIteratorFactory	TokenNameIdentifier	 I Column Iterator Factory
subIteratorFactory	TokenNameIdentifier	 sub Iterator Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subIteratorFactory	TokenNameIdentifier	 sub Iterator Factory
=	TokenNameEQUAL	
subIteratorFactory	TokenNameIdentifier	 sub Iterator Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
getSubIterator	TokenNameIdentifier	 get Sub Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subIterator	TokenNameIdentifier	 sub Iterator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
subIterator	TokenNameIdentifier	 sub Iterator
=	TokenNameEQUAL	
subIteratorFactory	TokenNameIdentifier	 sub Iterator Factory
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
subIterator	TokenNameIdentifier	 sub Iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
computeNext	TokenNameIdentifier	 compute Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getSubIterator	TokenNameIdentifier	 get Sub Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
subIterator	TokenNameIdentifier	 sub Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
subIterator	TokenNameIdentifier	 sub Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
endOfData	TokenNameIdentifier	 end Of Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSubIterator	TokenNameIdentifier	 get Sub Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getColumnFamily	TokenNameIdentifier	 get Column Family
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subIterator	TokenNameIdentifier	 sub Iterator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
subIterator	TokenNameIdentifier	 sub Iterator
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
