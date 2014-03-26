/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
grammars	TokenNameIdentifier	 grammars
;	TokenNameSEMICOLON	
/** * All information specific to DTD grammars. * * @author Sandy Gao, IBM * @version $Id: XMLDTDDescription.java 447245 2006-09-18 05:22:10Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 All information specific to DTD grammars. * @author Sandy Gao, IBM @version $Id: XMLDTDDescription.java 447245 2006-09-18 05:22:10Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLDTDDescription	TokenNameIdentifier	 XMLDTD Description
extends	TokenNameextends	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
{	TokenNameLBRACE	
/** * Return the root name of this DTD. * * @return the root name. null if the name is unknown. */	TokenNameCOMMENT_JAVADOC	 Return the root name of this DTD. * @return the root name. null if the name is unknown. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRootName	TokenNameIdentifier	 get Root Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLDTDDescription 	TokenNameCOMMENT_LINE	interface XMLDTDDescription 
