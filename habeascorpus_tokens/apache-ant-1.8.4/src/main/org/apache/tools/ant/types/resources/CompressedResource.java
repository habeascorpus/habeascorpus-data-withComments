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
ResourceCollection	TokenNameIdentifier	 Resource Collection
;	TokenNameSEMICOLON	
/** * A compressed resource. * * <p>Wraps around another resource, delegates all queries (except * getSize) to that other resource but uncompresses/compresses streams * on the fly.</p> * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 A compressed resource. * <p>Wraps around another resource, delegates all queries (except getSize) to that other resource but uncompresses/compresses streams on the fly.</p> * @since Ant 1.7 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CompressedResource	TokenNameIdentifier	 Compressed Resource
extends	TokenNameextends	
ContentTransformingResource	TokenNameIdentifier	 Content Transforming Resource
{	TokenNameLBRACE	
/** no arg constructor */	TokenNameCOMMENT_JAVADOC	 no arg constructor 
protected	TokenNameprotected	
CompressedResource	TokenNameIdentifier	 Compressed Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructor with another resource to wrap. * @param other the resource to wrap. */	TokenNameCOMMENT_JAVADOC	 Constructor with another resource to wrap. @param other the resource to wrap. 
protected	TokenNameprotected	
CompressedResource	TokenNameIdentifier	 Compressed Resource
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addConfigured	TokenNameIdentifier	 add Configured
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the string representation of this Resource. * @return this Resource formatted as a String. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Get the string representation of this Resource. @return this Resource formatted as a String. @since Ant 1.7 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCompressionName	TokenNameIdentifier	 get Compression Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" compressed "	TokenNameStringLiteral	 compressed 
+	TokenNamePLUS	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the name of the compression method used. * @return the name of the compression method. */	TokenNameCOMMENT_JAVADOC	 Get the name of the compression method used. @return the name of the compression method. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getCompressionName	TokenNameIdentifier	 get Compression Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
