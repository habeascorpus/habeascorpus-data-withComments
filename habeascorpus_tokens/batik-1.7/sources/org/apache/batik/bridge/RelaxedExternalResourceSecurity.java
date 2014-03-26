/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ParsedURL	TokenNameIdentifier	 Parsed URL
;	TokenNameSEMICOLON	
/** * This implementation of <tt>ExternalResourceSecurity</tt> allows any * external references. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: RelaxedExternalResourceSecurity.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This implementation of <tt>ExternalResourceSecurity</tt> allows any external references. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: RelaxedExternalResourceSecurity.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
RelaxedExternalResourceSecurity	TokenNameIdentifier	 Relaxed External Resource Security
implements	TokenNameimplements	
ExternalResourceSecurity	TokenNameIdentifier	 External Resource Security
{	TokenNameLBRACE	
/** * Controls whether the externalResource should be loaded or not. * * @throws SecurityException if the externalResource should not be loaded. */	TokenNameCOMMENT_JAVADOC	 Controls whether the externalResource should be loaded or not. * @throws SecurityException if the externalResource should not be loaded. 
public	TokenNamepublic	
void	TokenNamevoid	
checkLoadExternalResource	TokenNameIdentifier	 check Load External Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @param externalResourceURL url for the externalResource, as defined in * the externalResource's xlink:href attribute. If that * attribute was empty, then this parameter should * be null * @param docURL url for the document into which the * externalResource was found. */	TokenNameCOMMENT_JAVADOC	 @param externalResourceURL url for the externalResource, as defined in the externalResource's xlink:href attribute. If that attribute was empty, then this parameter should be null @param docURL url for the document into which the externalResource was found. 
public	TokenNamepublic	
RelaxedExternalResourceSecurity	TokenNameIdentifier	 Relaxed External Resource Security
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
externalResourceURL	TokenNameIdentifier	 external Resource URL
,	TokenNameCOMMA	
ParsedURL	TokenNameIdentifier	 Parsed URL
docURL	TokenNameIdentifier	 doc URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* do nothing */	TokenNameCOMMENT_BLOCK	 do nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
