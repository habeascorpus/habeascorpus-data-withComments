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
/** * <p>Base class for Locking implementation. {@link Directory} uses * instances of this class to implement locking.</p> * * <p>Note that there are some useful tools to verify that * your LockFactory is working correctly: {@link * VerifyingLockFactory}, {@link LockStressTest}, {@link * LockVerifyServer}.</p> * * @see LockVerifyServer * @see LockStressTest * @see VerifyingLockFactory */	TokenNameCOMMENT_JAVADOC	 <p>Base class for Locking implementation. {@link Directory} uses instances of this class to implement locking.</p> * <p>Note that there are some useful tools to verify that your LockFactory is working correctly: {@link VerifyingLockFactory}, {@link LockStressTest}, {@link LockVerifyServer}.</p> * @see LockVerifyServer @see LockStressTest @see VerifyingLockFactory 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LockFactory	TokenNameIdentifier	 Lock Factory
{	TokenNameLBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
lockPrefix	TokenNameIdentifier	 lock Prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the prefix in use for all locks created in this * LockFactory. This is normally called once, when a * Directory gets this LockFactory instance. However, you * can also call this (after this instance is assigned to * a Directory) to override the prefix in use. This * is helpful if you're running Lucene on machines that * have different mount points for the same shared * directory. */	TokenNameCOMMENT_JAVADOC	 Set the prefix in use for all locks created in this LockFactory. This is normally called once, when a Directory gets this LockFactory instance. However, you can also call this (after this instance is assigned to a Directory) to override the prefix in use. This is helpful if you're running Lucene on machines that have different mount points for the same shared directory. 
public	TokenNamepublic	
void	TokenNamevoid	
setLockPrefix	TokenNameIdentifier	 set Lock Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lockPrefix	TokenNameIdentifier	 lock Prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lockPrefix	TokenNameIdentifier	 lock Prefix
=	TokenNameEQUAL	
lockPrefix	TokenNameIdentifier	 lock Prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the prefix in use for all locks created in this LockFactory. */	TokenNameCOMMENT_JAVADOC	 Get the prefix in use for all locks created in this LockFactory. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLockPrefix	TokenNameIdentifier	 get Lock Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
lockPrefix	TokenNameIdentifier	 lock Prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a new Lock instance identified by lockName. * @param lockName name of the lock to be created. */	TokenNameCOMMENT_JAVADOC	 Return a new Lock instance identified by lockName. @param lockName name of the lock to be created. 
public	TokenNamepublic	
abstract	TokenNameabstract	
Lock	TokenNameIdentifier	 Lock
makeLock	TokenNameIdentifier	 make Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Attempt to clear (forcefully unlock and remove) the * specified lock. Only call this at a time when you are * certain this lock is no longer in use. * @param lockName name of the lock to be cleared. */	TokenNameCOMMENT_JAVADOC	 Attempt to clear (forcefully unlock and remove) the specified lock. Only call this at a time when you are certain this lock is no longer in use. @param lockName name of the lock to be cleared. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
clearLock	TokenNameIdentifier	 clear Lock
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lockName	TokenNameIdentifier	 lock Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
