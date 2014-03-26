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
selectors	TokenNameIdentifier	 selectors
.	TokenNameDOT	
modifiedselector	TokenNameIdentifier	 modifiedselector
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * A Cache let the user store key-value-pairs in a permanent manner and access * them. * It is possible that a client uses get() before load() therefore the * implementation must ensure that no error occurred because of the wrong * <i>order</i>. * The implementing class should implement a useful toString() method. * * @version 2003-09-13 * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 A Cache let the user store key-value-pairs in a permanent manner and access them. It is possible that a client uses get() before load() therefore the implementation must ensure that no error occurred because of the wrong <i>order</i>. The implementing class should implement a useful toString() method. * @version 2003-09-13 @since Ant 1.6 
public	TokenNamepublic	
interface	TokenNameinterface	
Cache	TokenNameIdentifier	 Cache
{	TokenNameLBRACE	
/** * Checks its prerequisites. * @return <i>true</i> if all is ok, otherwise <i>false</i>. */	TokenNameCOMMENT_JAVADOC	 Checks its prerequisites. @return <i>true</i> if all is ok, otherwise <i>false</i>. 
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Deletes the cache. If file based the file has to be deleted also. */	TokenNameCOMMENT_JAVADOC	 Deletes the cache. If file based the file has to be deleted also. 
void	TokenNamevoid	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Loads the cache, must handle not existing cache. */	TokenNameCOMMENT_JAVADOC	 Loads the cache, must handle not existing cache. 
void	TokenNamevoid	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Saves modification of the cache. */	TokenNameCOMMENT_JAVADOC	 Saves modification of the cache. 
void	TokenNamevoid	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a value for a given key from the cache. * @param key the key * @return the stored value */	TokenNameCOMMENT_JAVADOC	 Returns a value for a given key from the cache. @param key the key @return the stored value 
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Saves a key-value-pair in the cache. * @param key the key * @param value the value */	TokenNameCOMMENT_JAVADOC	 Saves a key-value-pair in the cache. @param key the key @param value the value 
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an iterator over the keys in the cache. * @return An iterator over the keys. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the keys in the cache. @return An iterator over the keys. 
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
