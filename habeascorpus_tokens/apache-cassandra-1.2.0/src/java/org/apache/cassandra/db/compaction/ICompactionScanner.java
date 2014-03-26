/** * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
compaction	TokenNameIdentifier	 compaction
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
columniterator	TokenNameIdentifier	 columniterator
.	TokenNameDOT	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
;	TokenNameSEMICOLON	
/** * An ICompactionScanner is an abstraction allowing multiple SSTableScanners to be * chained together under the hood. See LeveledCompactionStrategy.getScanners. */	TokenNameCOMMENT_JAVADOC	 An ICompactionScanner is an abstraction allowing multiple SSTableScanners to be chained together under the hood. See LeveledCompactionStrategy.getScanners. 
public	TokenNamepublic	
interface	TokenNameinterface	
ICompactionScanner	TokenNameIdentifier	 I Compaction Scanner
extends	TokenNameextends	
CloseableIterator	TokenNameIdentifier	 Closeable Iterator
<	TokenNameLESS	
OnDiskAtomIterator	TokenNameIdentifier	 On Disk Atom Iterator
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getLengthInBytes	TokenNameIdentifier	 get Length In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
getCurrentPosition	TokenNameIdentifier	 get Current Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBackingFiles	TokenNameIdentifier	 get Backing Files
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
