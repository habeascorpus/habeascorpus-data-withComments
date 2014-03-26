/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XResourceBundleBase.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XResourceBundleBase.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
;	TokenNameSEMICOLON	
/** * This is an interface for error messages. This class is misnamed, * and should be called XalanResourceBundle, or some such. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This is an interface for error messages. This class is misnamed, and should be called XalanResourceBundle, or some such. @xsl.usage internal 
abstract	TokenNameabstract	
public	TokenNamepublic	
class	TokenNameclass	
XResourceBundleBase	TokenNameIdentifier	 X Resource Bundle Base
extends	TokenNameextends	
ListResourceBundle	TokenNameIdentifier	 List Resource Bundle
{	TokenNameLBRACE	
/** * Get the error string associated with the error code * * @param errorCode Error code * * @return error string associated with the given error code */	TokenNameCOMMENT_JAVADOC	 Get the error string associated with the error code * @param errorCode Error code * @return error string associated with the given error code 
abstract	TokenNameabstract	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMessageKey	TokenNameIdentifier	 get Message Key
(	TokenNameLPAREN	
int	TokenNameint	
errorCode	TokenNameIdentifier	 error Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the warning string associated with the error code * * @param errorCode Error code * * @return warning string associated with the given error code */	TokenNameCOMMENT_JAVADOC	 Get the warning string associated with the error code * @param errorCode Error code * @return warning string associated with the given error code 
abstract	TokenNameabstract	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getWarningKey	TokenNameIdentifier	 get Warning Key
(	TokenNameLPAREN	
int	TokenNameint	
errorCode	TokenNameIdentifier	 error Code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
