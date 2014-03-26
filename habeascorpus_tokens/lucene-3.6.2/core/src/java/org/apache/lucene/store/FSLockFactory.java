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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
/** * Base class for file system based locking implementation. */	TokenNameCOMMENT_JAVADOC	 Base class for file system based locking implementation. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FSLockFactory	TokenNameIdentifier	 FS Lock Factory
extends	TokenNameextends	
LockFactory	TokenNameIdentifier	 Lock Factory
{	TokenNameLBRACE	
/** * Directory for the lock files. */	TokenNameCOMMENT_JAVADOC	 Directory for the lock files. 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
lockDir	TokenNameIdentifier	 lock Dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the lock directory. This method can be only called * once to initialize the lock directory. It is used by {@link FSDirectory} * to set the lock directory to itself. * Subclasses can also use this method to set the directory * in the constructor. */	TokenNameCOMMENT_JAVADOC	 Set the lock directory. This method can be only called once to initialize the lock directory. It is used by {@link FSDirectory} to set the lock directory to itself. Subclasses can also use this method to set the directory in the constructor. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
setLockDir	TokenNameIdentifier	 set Lock Dir
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
lockDir	TokenNameIdentifier	 lock Dir
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lockDir	TokenNameIdentifier	 lock Dir
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"You can set the lock directory for this factory only once."	TokenNameStringLiteral	You can set the lock directory for this factory only once.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lockDir	TokenNameIdentifier	 lock Dir
=	TokenNameEQUAL	
lockDir	TokenNameIdentifier	 lock Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the lock directory. */	TokenNameCOMMENT_JAVADOC	 Retrieve the lock directory. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getLockDir	TokenNameIdentifier	 get Lock Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lockDir	TokenNameIdentifier	 lock Dir
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
