/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
Augmentations	TokenNameIdentifier	 Augmentations
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLDocumentFilter	TokenNameIdentifier	 XML Document Filter
;	TokenNameSEMICOLON	
/** * DOM Revalidation handler adds additional functionality to XMLDocumentHandler * * @xerces.internal * @author Elena Litani, IBM * @version $Id: RevalidationHandler.java 446761 2006-09-15 21:59:29Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 DOM Revalidation handler adds additional functionality to XMLDocumentHandler * @xerces.internal @author Elena Litani, IBM @version $Id: RevalidationHandler.java 446761 2006-09-15 21:59:29Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
RevalidationHandler	TokenNameIdentifier	 Revalidation Handler
extends	TokenNameextends	
XMLDocumentFilter	TokenNameIdentifier	 XML Document Filter
{	TokenNameLBRACE	
/** * Character content. * * @param data The character data. * @param augs Augmentations * @return True if data is whitespace only */	TokenNameCOMMENT_JAVADOC	 Character content. * @param data The character data. @param augs Augmentations @return True if data is whitespace only 
public	TokenNamepublic	
boolean	TokenNameboolean	
characterData	TokenNameIdentifier	 character Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface DOMRevalidationHandler 	TokenNameCOMMENT_LINE	interface DOMRevalidationHandler 
