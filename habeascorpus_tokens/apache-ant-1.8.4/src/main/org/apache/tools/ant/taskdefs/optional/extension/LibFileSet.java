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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
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
FileSet	TokenNameIdentifier	 File Set
;	TokenNameSEMICOLON	
/** * LibFileSet represents a fileset containing libraries. * Asociated with the libraries is data pertaining to * how they are to be handled when building manifests. * */	TokenNameCOMMENT_JAVADOC	 LibFileSet represents a fileset containing libraries. Asociated with the libraries is data pertaining to how they are to be handled when building manifests. 
public	TokenNamepublic	
class	TokenNameclass	
LibFileSet	TokenNameIdentifier	 Lib File Set
extends	TokenNameextends	
FileSet	TokenNameIdentifier	 File Set
{	TokenNameLBRACE	
/** * Flag indicating whether should include the * "Implementation-URL" attribute in manifest. * Defaults to false. */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether should include the "Implementation-URL" attribute in manifest. Defaults to false. 
private	TokenNameprivate	
boolean	TokenNameboolean	
includeURL	TokenNameIdentifier	 include URL
;	TokenNameSEMICOLON	
/** * Flag indicating whether should include the * "Implementation-*" attributes in manifest. * Defaults to false. */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether should include the "Implementation-*" attributes in manifest. Defaults to false. 
private	TokenNameprivate	
boolean	TokenNameboolean	
includeImpl	TokenNameIdentifier	 include Impl
;	TokenNameSEMICOLON	
/** * String that is the base URL for the librarys * when constructing the "Implementation-URL" * attribute. For instance setting the base to * "http://jakarta.apache.org/avalon/libs/" and then * including the library "excalibur-cli-1.0.jar" in the * fileset will result in the "Implementation-URL" attribute * being set to "http://jakarta.apache.org/avalon/libs/excalibur-cli-1.0.jar" * * Note this is only used if the library does not define * "Implementation-URL" itself. * * Note that this also implies includeURL=true */	TokenNameCOMMENT_JAVADOC	 String that is the base URL for the librarys when constructing the "Implementation-URL" attribute. For instance setting the base to "http://jakarta.apache.org/avalon/libs/" and then including the library "excalibur-cli-1.0.jar" in the fileset will result in the "Implementation-URL" attribute being set to "http://jakarta.apache.org/avalon/libs/excalibur-cli-1.0.jar" * Note this is only used if the library does not define "Implementation-URL" itself. * Note that this also implies includeURL=true 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
urlBase	TokenNameIdentifier	 url Base
;	TokenNameSEMICOLON	
/** * Flag indicating whether should include the * "Implementation-URL" attribute in manifest. * Defaults to false. * * @param includeURL the flag */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether should include the "Implementation-URL" attribute in manifest. Defaults to false. * @param includeURL the flag 
public	TokenNamepublic	
void	TokenNamevoid	
setIncludeUrl	TokenNameIdentifier	 set Include Url
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includeURL	TokenNameIdentifier	 include URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
includeURL	TokenNameIdentifier	 include URL
=	TokenNameEQUAL	
includeURL	TokenNameIdentifier	 include URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flag indicating whether should include the * "Implementation-*" attributes in manifest. * Defaults to false. * * @param includeImpl the flag */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether should include the "Implementation-*" attributes in manifest. Defaults to false. * @param includeImpl the flag 
public	TokenNamepublic	
void	TokenNamevoid	
setIncludeImpl	TokenNameIdentifier	 set Include Impl
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includeImpl	TokenNameIdentifier	 include Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
includeImpl	TokenNameIdentifier	 include Impl
=	TokenNameEQUAL	
includeImpl	TokenNameIdentifier	 include Impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the url base for fileset. * * @param urlBase the base url */	TokenNameCOMMENT_JAVADOC	 Set the url base for fileset. * @param urlBase the base url 
public	TokenNamepublic	
void	TokenNamevoid	
setUrlBase	TokenNameIdentifier	 set Url Base
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlBase	TokenNameIdentifier	 url Base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
urlBase	TokenNameIdentifier	 url Base
=	TokenNameEQUAL	
urlBase	TokenNameIdentifier	 url Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the includeURL flag. * * @return the includeURL flag. */	TokenNameCOMMENT_JAVADOC	 Get the includeURL flag. * @return the includeURL flag. 
boolean	TokenNameboolean	
isIncludeURL	TokenNameIdentifier	 is Include URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
includeURL	TokenNameIdentifier	 include URL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the includeImpl flag. * * @return the includeImpl flag. */	TokenNameCOMMENT_JAVADOC	 Get the includeImpl flag. * @return the includeImpl flag. 
boolean	TokenNameboolean	
isIncludeImpl	TokenNameIdentifier	 is Include Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
includeImpl	TokenNameIdentifier	 include Impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the urlbase. * * @return the urlbase. */	TokenNameCOMMENT_JAVADOC	 Get the urlbase. * @return the urlbase. 
String	TokenNameIdentifier	 String
getUrlBase	TokenNameIdentifier	 get Url Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
urlBase	TokenNameIdentifier	 url Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
