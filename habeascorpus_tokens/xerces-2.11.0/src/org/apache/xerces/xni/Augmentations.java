/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
/** * The Augmentations interface defines a table of additional data that may * be passed along the document pipeline. The information can contain extra * arguments or infoset augmentations, for example PSVI. This additional * information is identified by a String key. * <p> * <strong>Note:</strong> * Methods that receive Augmentations are required to copy the information * if it is to be saved for use beyond the scope of the method. * The Augmentations content is volatile, and maybe modified by any method in * any component in the pipeline. Therefore, methods passed this structure * should not save any reference to the structure. * * @author Elena Litani, IBM * @version $Id: Augmentations.java 447247 2006-09-18 05:23:52Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The Augmentations interface defines a table of additional data that may be passed along the document pipeline. The information can contain extra arguments or infoset augmentations, for example PSVI. This additional information is identified by a String key. <p> <strong>Note:</strong> Methods that receive Augmentations are required to copy the information if it is to be saved for use beyond the scope of the method. The Augmentations content is volatile, and maybe modified by any method in any component in the pipeline. Therefore, methods passed this structure should not save any reference to the structure. * @author Elena Litani, IBM @version $Id: Augmentations.java 447247 2006-09-18 05:23:52Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
Augmentations	TokenNameIdentifier	 Augmentations
{	TokenNameLBRACE	
/** * Add additional information identified by a key to the Augmentations structure. * * @param key Identifier, can't be <code>null</code> * @param item Additional information * * @return the previous value of the specified key in the Augmentations structure, * or <code>null</code> if it did not have one. */	TokenNameCOMMENT_JAVADOC	 Add additional information identified by a key to the Augmentations structure. * @param key Identifier, can't be <code>null</code> @param item Additional information * @return the previous value of the specified key in the Augmentations structure, or <code>null</code> if it did not have one. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
putItem	TokenNameIdentifier	 put Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get information identified by a key from the Augmentations structure * * @param key Identifier, can't be <code>null</code> * * @return the value to which the key is mapped in the Augmentations structure; * <code>null</code> if the key is not mapped to any value. */	TokenNameCOMMENT_JAVADOC	 Get information identified by a key from the Augmentations structure * @param key Identifier, can't be <code>null</code> * @return the value to which the key is mapped in the Augmentations structure; <code>null</code> if the key is not mapped to any value. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Remove additional info from the Augmentations structure * * @param key Identifier, can't be <code>null</code> * @return the previous value of the specified key in the Augmentations structure, * or <code>null</code> if it did not have one. */	TokenNameCOMMENT_JAVADOC	 Remove additional info from the Augmentations structure * @param key Identifier, can't be <code>null</code> @return the previous value of the specified key in the Augmentations structure, or <code>null</code> if it did not have one. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
removeItem	TokenNameIdentifier	 remove Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an enumeration of the keys in the Augmentations structure * */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of the keys in the Augmentations structure 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Remove all objects from the Augmentations structure. */	TokenNameCOMMENT_JAVADOC	 Remove all objects from the Augmentations structure. 
public	TokenNamepublic	
void	TokenNamevoid	
removeAllItems	TokenNameIdentifier	 remove All Items
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
