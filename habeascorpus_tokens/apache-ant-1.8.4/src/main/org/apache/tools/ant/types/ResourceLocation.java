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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
/** * <p>Helper class to handle the <code>&lt;dtd&gt;</code> and * <code>&lt;entity&gt;</code> nested elements. These correspond to * the <code>PUBLIC</code> and <code>URI</code> catalog entry types, * respectively, as defined in the <a * href="http://oasis-open.org/committees/entity/spec-2001-08-06.html"> * OASIS "Open Catalog" standard</a>.</p> * * <p>Possible Future Enhancements: * <ul> * <li>Bring the Ant element names into conformance with the OASIS standard</li> * <li>Add support for additional OASIS catalog entry types</li> * </ul> * </p> * * @see org.apache.xml.resolver.Catalog * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 <p>Helper class to handle the <code>&lt;dtd&gt;</code> and <code>&lt;entity&gt;</code> nested elements. These correspond to the <code>PUBLIC</code> and <code>URI</code> catalog entry types, respectively, as defined in the <a href="http://oasis-open.org/committees/entity/spec-2001-08-06.html"> OASIS "Open Catalog" standard</a>.</p> * <p>Possible Future Enhancements: <ul> <li>Bring the Ant element names into conformance with the OASIS standard</li> <li>Add support for additional OASIS catalog entry types</li> </ul> </p> * @see org.apache.xml.resolver.Catalog @since Ant 1.6 
public	TokenNamepublic	
class	TokenNameclass	
ResourceLocation	TokenNameIdentifier	 Resource Location
{	TokenNameLBRACE	
//-- Fields ---------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-- Fields ---------------------------------------------------------------- 
/** publicId of the dtd/entity. */	TokenNameCOMMENT_JAVADOC	 publicId of the dtd/entity. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** location of the dtd/entity - a file/resource/URL. */	TokenNameCOMMENT_JAVADOC	 location of the dtd/entity - a file/resource/URL. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * base URL of the dtd/entity, or null. If null, the Ant project * basedir is assumed. If the location specifies a relative * URL/pathname, it is resolved using the base. The default base * for an external catalog file is the directory in which it is * located. */	TokenNameCOMMENT_JAVADOC	 base URL of the dtd/entity, or null. If null, the Ant project basedir is assumed. If the location specifies a relative URL/pathname, it is resolved using the base. The default base for an external catalog file is the directory in which it is located. 
private	TokenNameprivate	
URL	TokenNameIdentifier	 URL
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//-- Methods --------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-- Methods --------------------------------------------------------------- 
/** * @param publicId uniquely identifies the resource. */	TokenNameCOMMENT_JAVADOC	 @param publicId uniquely identifies the resource. 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param location the location of the resource associated with the * publicId. */	TokenNameCOMMENT_JAVADOC	 @param location the location of the resource associated with the publicId. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
location	TokenNameIdentifier	 location
=	TokenNameEQUAL	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param base the base URL of the resource associated with the * publicId. If the location specifies a relative URL/pathname, * it is resolved using the base. The default base for an * external catalog file is the directory in which it is located. */	TokenNameCOMMENT_JAVADOC	 @param base the base URL of the resource associated with the publicId. If the location specifies a relative URL/pathname, it is resolved using the base. The default base for an external catalog file is the directory in which it is located. 
public	TokenNamepublic	
void	TokenNamevoid	
setBase	TokenNameIdentifier	 set Base
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the publicId of the resource. */	TokenNameCOMMENT_JAVADOC	 @return the publicId of the resource. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the location of the resource identified by the publicId. */	TokenNameCOMMENT_JAVADOC	 @return the location of the resource identified by the publicId. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
location	TokenNameIdentifier	 location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the base of the resource identified by the publicId. */	TokenNameCOMMENT_JAVADOC	 @return the base of the resource identified by the publicId. 
public	TokenNamepublic	
URL	TokenNameIdentifier	 URL
getBase	TokenNameIdentifier	 get Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//-- ResourceLocation 	TokenNameCOMMENT_LINE	-- ResourceLocation 
