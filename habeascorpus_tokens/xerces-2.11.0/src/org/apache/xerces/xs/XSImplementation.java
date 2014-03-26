/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
ls	TokenNameIdentifier	 ls
.	TokenNameDOT	
LSInput	TokenNameIdentifier	 LS Input
;	TokenNameSEMICOLON	
/** * This interface allows one to retrieve an instance of <code>XSLoader</code>. * This interface should be implemented on the same object that implements * DOMImplementation. */	TokenNameCOMMENT_JAVADOC	 This interface allows one to retrieve an instance of <code>XSLoader</code>. This interface should be implemented on the same object that implements DOMImplementation. 
public	TokenNamepublic	
interface	TokenNameinterface	
XSImplementation	TokenNameIdentifier	 XS Implementation
{	TokenNameLBRACE	
/** * A list containing the versions of XML Schema documents recognized by * this <code>XSImplemenation</code>. */	TokenNameCOMMENT_JAVADOC	 A list containing the versions of XML Schema documents recognized by this <code>XSImplemenation</code>. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
getRecognizedVersions	TokenNameIdentifier	 get Recognized Versions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new XSLoader. The newly constructed loader may then be * configured and used to load XML Schemas. * @param versions A list containing the versions of XML Schema * documents which can be loaded by the <code>XSLoader</code> or * <code>null</code> to permit XML Schema documents of any recognized * version to be loaded by the XSLoader. * @return An XML Schema loader. * @exception XSException * NOT_SUPPORTED_ERR: Raised if the implementation does not support one * of the specified versions. */	TokenNameCOMMENT_JAVADOC	 Creates a new XSLoader. The newly constructed loader may then be configured and used to load XML Schemas. @param versions A list containing the versions of XML Schema documents which can be loaded by the <code>XSLoader</code> or <code>null</code> to permit XML Schema documents of any recognized version to be loaded by the XSLoader. @return An XML Schema loader. @exception XSException NOT_SUPPORTED_ERR: Raised if the implementation does not support one of the specified versions. 
public	TokenNamepublic	
XSLoader	TokenNameIdentifier	 XS Loader
createXSLoader	TokenNameIdentifier	 create XS Loader
(	TokenNameLPAREN	
StringList	TokenNameIdentifier	 String List
versions	TokenNameIdentifier	 versions
)	TokenNameRPAREN	
throws	TokenNamethrows	
XSException	TokenNameIdentifier	 XS Exception
;	TokenNameSEMICOLON	
/** * Creates an immutable <code>StringList</code> from the given array of <code>String</code>s. * @param values the array containing the <code>String</code> values that will be placed in the list. * @return an immutable <code>StringList</code> from the given array of <code>String</code>s. */	TokenNameCOMMENT_JAVADOC	 Creates an immutable <code>StringList</code> from the given array of <code>String</code>s. @param values the array containing the <code>String</code> values that will be placed in the list. @return an immutable <code>StringList</code> from the given array of <code>String</code>s. 
public	TokenNamepublic	
StringList	TokenNameIdentifier	 String List
createStringList	TokenNameIdentifier	 create String List
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates an immutable <code>LSInputList</code> from the given array of <code>LSInput</code>s. * @param values the array containing the <code>LSInput</code> values that will be placed in the list. * @return an immutable <code>LSInputList</code> from the given array of <code>LSInput</code>s. */	TokenNameCOMMENT_JAVADOC	 Creates an immutable <code>LSInputList</code> from the given array of <code>LSInput</code>s. @param values the array containing the <code>LSInput</code> values that will be placed in the list. @return an immutable <code>LSInputList</code> from the given array of <code>LSInput</code>s. 
public	TokenNamepublic	
LSInputList	TokenNameIdentifier	 LS Input List
createLSInputList	TokenNameIdentifier	 create LS Input List
(	TokenNameLPAREN	
LSInput	TokenNameIdentifier	 LS Input
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
