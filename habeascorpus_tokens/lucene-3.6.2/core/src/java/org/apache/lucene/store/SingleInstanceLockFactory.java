package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
/** * Implements {@link LockFactory} for a single in-process instance, * meaning all locking will take place through this one instance. * Only use this {@link LockFactory} when you are certain all * IndexReaders and IndexWriters for a given index are running * against a single shared in-process Directory instance. This is * currently the default locking for RAMDirectory. * * @see LockFactory */	TokenNameCOMMENT_JAVADOC	 Implements {@link LockFactory} for a single in-process instance, meaning all locking will take place through this one instance. Only use this {@link LockFactory} when you are certain all IndexReaders and IndexWriters for a given index are running against a single shared in-process Directory instance. This is currently the default locking for RAMDirectory. * @see LockFactory 
public	TokenNamepublic	
class	TokenNameclass	
SingleInstanceLockFactory	TokenNameIdentifier	 Single Instance Lock Factory
extends	TokenNameextends	
LockFactory	TokenNameIdentifier	 Lock Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
locks	TokenNameIdentifier	 locks
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Lock	TokenNameIdentifier	 Lock
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We do not use the LockPrefix at all, because the private 	TokenNameCOMMENT_LINE	We do not use the LockPrefix at all, because the private 
// HashSet instance effectively scopes the locking to this 	TokenNameCOMMENT_LINE	HashSet instance effectively scopes the locking to this 
// single Directory instance. 	TokenNameCOMMENT_LINE	single Directory instance. 
return	TokenNamereturn	
new	TokenNamenew	
SingleInstanceLock	TokenNameIdentifier	 Single Instance Lock
(	TokenNameLPAREN	
locks	TokenNameIdentifier	 locks
,	TokenNameCOMMA	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
clearLock	TokenNameIdentifier	 clear Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
locks	TokenNameIdentifier	 locks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locks	TokenNameIdentifier	 locks
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locks	TokenNameIdentifier	 locks
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
SingleInstanceLock	TokenNameIdentifier	 Single Instance Lock
extends	TokenNameextends	
Lock	TokenNameIdentifier	 Lock
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lockName	TokenNameIdentifier	 lock Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
locks	TokenNameIdentifier	 locks
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SingleInstanceLock	TokenNameIdentifier	 Single Instance Lock
(	TokenNameLPAREN	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
locks	TokenNameIdentifier	 locks
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
locks	TokenNameIdentifier	 locks
=	TokenNameEQUAL	
locks	TokenNameIdentifier	 locks
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lockName	TokenNameIdentifier	 lock Name
=	TokenNameEQUAL	
lockName	TokenNameIdentifier	 lock Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
obtain	TokenNameIdentifier	 obtain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
locks	TokenNameIdentifier	 locks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locks	TokenNameIdentifier	 locks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
locks	TokenNameIdentifier	 locks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
locks	TokenNameIdentifier	 locks
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isLocked	TokenNameIdentifier	 is Locked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
locks	TokenNameIdentifier	 locks
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
locks	TokenNameIdentifier	 locks
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
lockName	TokenNameIdentifier	 lock Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
