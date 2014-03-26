/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: CollatorFactory.java 468648 2006-10-28 07:00:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: CollatorFactory.java 468648 2006-10-28 07:00:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * @author W. Eliot Kimber (eliot@isogen.com) * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author W. Eliot Kimber (eliot@isogen.com) @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
interface	TokenNameinterface	
CollatorFactory	TokenNameIdentifier	 Collator Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
Collator	TokenNameIdentifier	 Collator
getCollator	TokenNameIdentifier	 get Collator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
country	TokenNameIdentifier	 country
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Collator	TokenNameIdentifier	 Collator
getCollator	TokenNameIdentifier	 get Collator
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
