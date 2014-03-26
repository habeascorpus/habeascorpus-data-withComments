/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * The base interface for all image tag registry entries. To be useful you * probably need to implement on of the flavors of registry entries (such as * StreamRegistryEntry or URLRegistryEntry). * * @version $Id: RegistryEntry.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The base interface for all image tag registry entries. To be useful you probably need to implement on of the flavors of registry entries (such as StreamRegistryEntry or URLRegistryEntry). * @version $Id: RegistryEntry.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
RegistryEntry	TokenNameIdentifier	 Registry Entry
{	TokenNameLBRACE	
/** * Return a List of the common extensions for this file format. The first * entry in the list may be used as the default extension for writing files * in this format (when we add support for writing that is). This may also * be used to build a selection expression for finding files of this type. */	TokenNameCOMMENT_JAVADOC	 Return a List of the common extensions for this file format. The first entry in the list may be used as the default extension for writing files in this format (when we add support for writing that is). This may also be used to build a selection expression for finding files of this type. 
List	TokenNameIdentifier	 List
getStandardExtensions	TokenNameIdentifier	 get Standard Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return a List of mime types for this file format. The first entry in the * list may be used as the default mime type. */	TokenNameCOMMENT_JAVADOC	 Return a List of mime types for this file format. The first entry in the list may be used as the default mime type. 
List	TokenNameIdentifier	 List
getMimeTypes	TokenNameIdentifier	 get Mime Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the name of the format. For example "JPEG", "PNG", ... */	TokenNameCOMMENT_JAVADOC	 Returns the name of the format. For example "JPEG", "PNG", ... 
String	TokenNameIdentifier	 String
getFormatName	TokenNameIdentifier	 get Format Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a search priority for this entry. For most formats this is not * important, but in some cases it is important that some entries occure * before or after others. */	TokenNameCOMMENT_JAVADOC	 Returns a search priority for this entry. For most formats this is not important, but in some cases it is important that some entries occure before or after others. 
float	TokenNamefloat	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
