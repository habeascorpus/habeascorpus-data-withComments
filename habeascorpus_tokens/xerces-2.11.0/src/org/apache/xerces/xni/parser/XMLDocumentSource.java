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
parser	TokenNameIdentifier	 parser
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
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
;	TokenNameSEMICOLON	
/** * Defines a document source. In other words, any object that implements * this interface is able to emit document "events" to the registered * document handler. These events could be produced by parsing an XML * document, could be generated from some other source, or could be * created programmatically. This interface does not say <em>how</em> * the events are created, only that the implementor is able to emit * them. * * @author Andy Clark, IBM * * @version $Id: XMLDocumentSource.java 447244 2006-09-18 05:20:40Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Defines a document source. In other words, any object that implements this interface is able to emit document "events" to the registered document handler. These events could be produced by parsing an XML document, could be generated from some other source, or could be created programmatically. This interface does not say <em>how</em> the events are created, only that the implementor is able to emit them. * @author Andy Clark, IBM * @version $Id: XMLDocumentSource.java 447244 2006-09-18 05:20:40Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLDocumentSource methods 	TokenNameCOMMENT_LINE	XMLDocumentSource methods 
// 	TokenNameCOMMENT_LINE	 
/** Sets the document handler. */	TokenNameCOMMENT_JAVADOC	 Sets the document handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the document handler */	TokenNameCOMMENT_JAVADOC	 Returns the document handler 
public	TokenNamepublic	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
getDocumentHandler	TokenNameIdentifier	 get Document Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLDocumentSource 	TokenNameCOMMENT_LINE	interface XMLDocumentSource 
