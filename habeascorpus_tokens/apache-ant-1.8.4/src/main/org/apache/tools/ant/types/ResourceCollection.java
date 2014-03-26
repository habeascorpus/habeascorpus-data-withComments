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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * Interface describing a collection of Resources. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Interface describing a collection of Resources. @since Ant 1.7 
public	TokenNamepublic	
interface	TokenNameinterface	
ResourceCollection	TokenNameIdentifier	 Resource Collection
{	TokenNameLBRACE	
/** * Get an Iterator over the contents of this ResourceCollection, whose elements * are <code>org.apache.tools.ant.types.Resource</code> instances. * @return an Iterator of Resources. */	TokenNameCOMMENT_JAVADOC	 Get an Iterator over the contents of this ResourceCollection, whose elements are <code>org.apache.tools.ant.types.Resource</code> instances. @return an Iterator of Resources. 
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Learn the number of contained Resources. * @return number of elements as int. */	TokenNameCOMMENT_JAVADOC	 Learn the number of contained Resources. @return number of elements as int. 
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicate whether this ResourceCollection is composed entirely of * Resources accessible via local filesystem conventions. If true, * all Resources returned from this ResourceCollection should be * instances of FileResource. * @return whether this is a filesystem-only resource collection. */	TokenNameCOMMENT_JAVADOC	 Indicate whether this ResourceCollection is composed entirely of Resources accessible via local filesystem conventions. If true, all Resources returned from this ResourceCollection should be instances of FileResource. @return whether this is a filesystem-only resource collection. 
boolean	TokenNameboolean	
isFilesystemOnly	TokenNameIdentifier	 is Filesystem Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
