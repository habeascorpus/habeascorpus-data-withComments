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
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
;	TokenNameSEMICOLON	
/** * Defines a DTD source. In other words, any object that implements * this interface is able to emit DTD "events" to the registered * DTD handler. These events could be produced by parsing an XML * document's internal or external subset, could be generated from * some other source, or could be created programmatically. This * interface does not say <em>how</em> the events are created, only * that the implementor is able to emit them. * * @author Andy Clark, IBM * * @version $Id: XMLDTDSource.java 447244 2006-09-18 05:20:40Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Defines a DTD source. In other words, any object that implements this interface is able to emit DTD "events" to the registered DTD handler. These events could be produced by parsing an XML document's internal or external subset, could be generated from some other source, or could be created programmatically. This interface does not say <em>how</em> the events are created, only that the implementor is able to emit them. * @author Andy Clark, IBM * @version $Id: XMLDTDSource.java 447244 2006-09-18 05:20:40Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLDTDSource	TokenNameIdentifier	 XMLDTD Source
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLDTDSource methods 	TokenNameCOMMENT_LINE	XMLDTDSource methods 
// 	TokenNameCOMMENT_LINE	 
/** Sets the DTD handler. */	TokenNameCOMMENT_JAVADOC	 Sets the DTD handler. 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the DTD handler. */	TokenNameCOMMENT_JAVADOC	 Returns the DTD handler. 
public	TokenNamepublic	
XMLDTDHandler	TokenNameIdentifier	 XMLDTD Handler
getDTDHandler	TokenNameIdentifier	 get DTD Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLDTDSource 	TokenNameCOMMENT_LINE	interface XMLDTDSource 
