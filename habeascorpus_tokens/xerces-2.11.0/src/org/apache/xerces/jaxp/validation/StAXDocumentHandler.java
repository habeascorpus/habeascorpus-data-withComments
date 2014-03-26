/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
jaxp	TokenNameIdentifier	 jaxp
.	TokenNameDOT	
validation	TokenNameIdentifier	 validation
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Characters	TokenNameIdentifier	 Characters
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Comment	TokenNameIdentifier	 Comment
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
DTD	TokenNameIdentifier	 DTD
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
EndDocument	TokenNameIdentifier	 End Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
EntityReference	TokenNameIdentifier	 Entity Reference
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
StartDocument	TokenNameIdentifier	 Start Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
.	TokenNameDOT	
StAXResult	TokenNameIdentifier	 St AX Result
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
/** * <p>An extension to XMLDocumentHandler for building StAX structures.</p> * * @author Michael Glavassevich, IBM * @version $Id: StAXDocumentHandler.java 683688 2008-08-07 19:37:02Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>An extension to XMLDocumentHandler for building StAX structures.</p> * @author Michael Glavassevich, IBM @version $Id: StAXDocumentHandler.java 683688 2008-08-07 19:37:02Z mrglavas $ 
interface	TokenNameinterface	
StAXDocumentHandler	TokenNameIdentifier	 St AX Document Handler
extends	TokenNameextends	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
{	TokenNameLBRACE	
/** * <p>Sets the <code>StAXResult</code> object which will be receiving the output.</p> */	TokenNameCOMMENT_JAVADOC	 <p>Sets the <code>StAXResult</code> object which will be receiving the output.</p> 
public	TokenNamepublic	
void	TokenNamevoid	
setStAXResult	TokenNameIdentifier	 set St AX Result
(	TokenNameLPAREN	
StAXResult	TokenNameIdentifier	 St AX Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
StartDocument	TokenNameIdentifier	 Start Document
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
EndDocument	TokenNameIdentifier	 End Document
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
doctypeDecl	TokenNameIdentifier	 doctype Decl
(	TokenNameLPAREN	
DTD	TokenNameIdentifier	 DTD
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
Characters	TokenNameIdentifier	 Characters
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
cdata	TokenNameIdentifier	 cdata
(	TokenNameLPAREN	
Characters	TokenNameIdentifier	 Characters
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
Comment	TokenNameIdentifier	 Comment
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
ProcessingInstruction	TokenNameIdentifier	 Processing Instruction
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
entityReference	TokenNameIdentifier	 entity Reference
(	TokenNameLPAREN	
EntityReference	TokenNameIdentifier	 Entity Reference
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setIgnoringCharacters	TokenNameIdentifier	 set Ignoring Characters
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// StAXDocumentHandler 	TokenNameCOMMENT_LINE	StAXDocumentHandler 
