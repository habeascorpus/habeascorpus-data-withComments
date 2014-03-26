/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TraceListenerEx3.java 468644 2006-10-28 06:56:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TraceListenerEx3.java 468644 2006-10-28 06:56:42Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
;	TokenNameSEMICOLON	
/** * Extends TraceListenerEx2 but adds extensions trace events. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Extends TraceListenerEx2 but adds extensions trace events. @xsl.usage advanced 
public	TokenNamepublic	
interface	TokenNameinterface	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
extends	TokenNameextends	
TraceListenerEx2	TokenNameIdentifier	 Trace Listener Ex2
{	TokenNameLBRACE	
/** * Method that is called when an extension event occurs. * The method is blocking. It must return before processing continues. * * @param ee the extension event. */	TokenNameCOMMENT_JAVADOC	 Method that is called when an extension event occurs. The method is blocking. It must return before processing continues. * @param ee the extension event. 
public	TokenNamepublic	
void	TokenNamevoid	
extension	TokenNameIdentifier	 extension
(	TokenNameLPAREN	
ExtensionEvent	TokenNameIdentifier	 Extension Event
ee	TokenNameIdentifier	 ee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Method that is called when the end of an extension event occurs. * The method is blocking. It must return before processing continues. * * @param ee the extension event. */	TokenNameCOMMENT_JAVADOC	 Method that is called when the end of an extension event occurs. The method is blocking. It must return before processing continues. * @param ee the extension event. 
public	TokenNamepublic	
void	TokenNamevoid	
extensionEnd	TokenNameIdentifier	 extension End
(	TokenNameLPAREN	
ExtensionEvent	TokenNameIdentifier	 Extension Event
ee	TokenNameIdentifier	 ee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	