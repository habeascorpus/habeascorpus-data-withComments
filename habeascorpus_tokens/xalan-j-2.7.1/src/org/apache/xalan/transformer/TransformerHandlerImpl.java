/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformerHandlerImpl.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformerHandlerImpl.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMManager	TokenNameIdentifier	 DTM Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
sax2dtm	TokenNameIdentifier	 sax2dtm
.	TokenNameDOT	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
DTDHandler	TokenNameIdentifier	 DTD Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
EntityResolver	TokenNameIdentifier	 Entity Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ErrorHandler	TokenNameIdentifier	 Error Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Locator	TokenNameIdentifier	 Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
DeclHandler	TokenNameIdentifier	 Decl Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
;	TokenNameSEMICOLON	
/** * A TransformerHandler * listens for SAX ContentHandler parse events and transforms * them to a Result. */	TokenNameCOMMENT_JAVADOC	 A TransformerHandler listens for SAX ContentHandler parse events and transforms them to a Result. 
public	TokenNamepublic	
class	TokenNameclass	
TransformerHandlerImpl	TokenNameIdentifier	 Transformer Handler Impl
implements	TokenNameimplements	
EntityResolver	TokenNameIdentifier	 Entity Resolver
,	TokenNameCOMMA	
DTDHandler	TokenNameIdentifier	 DTD Handler
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
,	TokenNameCOMMA	
ErrorHandler	TokenNameIdentifier	 Error Handler
,	TokenNameCOMMA	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
,	TokenNameCOMMA	
TransformerHandler	TokenNameIdentifier	 Transformer Handler
,	TokenNameCOMMA	
DeclHandler	TokenNameIdentifier	 Decl Handler
{	TokenNameLBRACE	
/** * The flag for the setting of the optimize feature; */	TokenNameCOMMENT_JAVADOC	 The flag for the setting of the optimize feature; 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
m_optimizer	TokenNameIdentifier	 m optimizer
;	TokenNameSEMICOLON	
/** * The flag for the setting of the incremental feature; */	TokenNameCOMMENT_JAVADOC	 The flag for the setting of the incremental feature; 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
m_incremental	TokenNameIdentifier	 m incremental
;	TokenNameSEMICOLON	
/** * The flag for the setting of the source_location feature; */	TokenNameCOMMENT_JAVADOC	 The flag for the setting of the source_location feature; 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
m_source_location	TokenNameIdentifier	 m source location
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_insideParse	TokenNameIdentifier	 m inside Parse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Constructors. 	TokenNameCOMMENT_LINE	Constructors. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Construct a TransformerHandlerImpl. * * @param transformer Non-null reference to the Xalan transformer impl. * @param doFragment True if the result should be a document fragement. * @param baseSystemID The system ID to use as the base for relative URLs. */	TokenNameCOMMENT_JAVADOC	 Construct a TransformerHandlerImpl. * @param transformer Non-null reference to the Xalan transformer impl. @param doFragment True if the result should be a document fragement. @param baseSystemID The system ID to use as the base for relative URLs. 
public	TokenNamepublic	
TransformerHandlerImpl	TokenNameIdentifier	 Transformer Handler Impl
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doFragment	TokenNameIdentifier	 do Fragment
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
baseSystemID	TokenNameIdentifier	 base System ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
m_baseSystemID	TokenNameIdentifier	 m base System ID
=	TokenNameEQUAL	
baseSystemID	TokenNameIdentifier	 base System ID
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
transformer	TokenNameIdentifier	 transformer
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dtm	TokenNameIdentifier	 m dtm
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
setDocumentBaseURI	TokenNameIdentifier	 set Document Base URI
(	TokenNameLPAREN	
baseSystemID	TokenNameIdentifier	 base System ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getContentHandler	TokenNameIdentifier	 get Content Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dtdHandler	TokenNameIdentifier	 m dtd Handler
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getDTDHandler	TokenNameIdentifier	 get DTD Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_entityResolver	TokenNameIdentifier	 m entity Resolver
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getEntityResolver	TokenNameIdentifier	 get Entity Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_errorHandler	TokenNameIdentifier	 m error Handler
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getErrorHandler	TokenNameIdentifier	 get Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLexicalHandler	TokenNameIdentifier	 get Lexical Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getIncremental	TokenNameIdentifier	 get Incremental
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_optimizer	TokenNameIdentifier	 m optimizer
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getOptimize	TokenNameIdentifier	 get Optimize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getSource_location	TokenNameIdentifier	 get Source location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do what needs to be done to shut down the CoRoutine management. */	TokenNameCOMMENT_JAVADOC	 Do what needs to be done to shut down the CoRoutine management. 
protected	TokenNameprotected	
void	TokenNamevoid	
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do what needs to be done to shut down the CoRoutine management. */	TokenNameCOMMENT_JAVADOC	 Do what needs to be done to shut down the CoRoutine management. 
protected	TokenNameprotected	
void	TokenNamevoid	
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
setExceptionThrown	TokenNameIdentifier	 set Exception Thrown
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_dtm	TokenNameIdentifier	 m dtm
instanceof	TokenNameinstanceof	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"In clearCoRoutine..."	TokenNameStringLiteral	In clearCoRoutine...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
sax2dtm	TokenNameIdentifier	 sax2dtm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
)	TokenNameRPAREN	
m_dtm	TokenNameIdentifier	 m dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_contentHandler	TokenNameIdentifier	 m content Handler
&&	TokenNameAND_AND	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
)	TokenNameRPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
;	TokenNameSEMICOLON	
// This should now be all that's needed. 	TokenNameCOMMENT_LINE	This should now be all that's needed. 
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
deliverMoreNodes	TokenNameIdentifier	 deliver More Nodes
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sax2dtm	TokenNameIdentifier	 sax2dtm
.	TokenNameDOT	
clearCoRoutine	TokenNameIdentifier	 clear Co Routine
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_dtdHandler	TokenNameIdentifier	 m dtd Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_entityResolver	TokenNameIdentifier	 m entity Resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_errorHandler	TokenNameIdentifier	 m error Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
throwable	TokenNameIdentifier	 throwable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throwable	TokenNameIdentifier	 throwable
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"...exiting clearCoRoutine"	TokenNameStringLiteral	...exiting clearCoRoutine
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of javax.xml.transform.sax.TransformerHandler. 	TokenNameCOMMENT_LINE	Implementation of javax.xml.transform.sax.TransformerHandler. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Enables the user of the TransformerHandler to set the * to set the Result for the transformation. * * @param result A Result instance, should not be null. * * @throws IllegalArgumentException if result is invalid for some reason. */	TokenNameCOMMENT_JAVADOC	 Enables the user of the TransformerHandler to set the to set the Result for the transformation. * @param result A Result instance, should not be null. * @throws IllegalArgumentException if result is invalid for some reason. 
public	TokenNamepublic	
void	TokenNamevoid	
setResult	TokenNameIdentifier	 set Result
(	TokenNameLPAREN	
Result	TokenNameIdentifier	 Result
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_RESULT_NULL	TokenNameIdentifier	 ER  RESULT  NULL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"result should not be null"); 	TokenNameCOMMENT_LINE	"result should not be null"); 
try	TokenNametry	
{	TokenNameLBRACE	
// ContentHandler handler = 	TokenNameCOMMENT_LINE	ContentHandler handler = 
// m_transformer.createResultContentHandler(result); 	TokenNameCOMMENT_LINE	m_transformer.createResultContentHandler(result); 
// m_transformer.setContentHandler(handler); 	TokenNameCOMMENT_LINE	m_transformer.setContentHandler(handler); 
SerializationHandler	TokenNameIdentifier	 Serialization Handler
xoh	TokenNameIdentifier	 xoh
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
createSerializationHandler	TokenNameIdentifier	 create Serialization Handler
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
setSerializationHandler	TokenNameIdentifier	 set Serialization Handler
(	TokenNameLPAREN	
xoh	TokenNameIdentifier	 xoh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_RESULT_COULD_NOT_BE_SET	TokenNameIdentifier	 ER  RESULT  COULD  NOT  BE  SET
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"result could not be set"); 	TokenNameCOMMENT_LINE	"result could not be set"); 
}	TokenNameRBRACE	
m_result	TokenNameIdentifier	 m result
=	TokenNameEQUAL	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the base ID (URI or system ID) from where relative * URLs will be resolved. * @param systemID Base URI for the source tree. */	TokenNameCOMMENT_JAVADOC	 Set the base ID (URI or system ID) from where relative URLs will be resolved. @param systemID Base URI for the source tree. 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_baseSystemID	TokenNameIdentifier	 m base System ID
=	TokenNameEQUAL	
systemID	TokenNameIdentifier	 system ID
;	TokenNameSEMICOLON	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
setDocumentBaseURI	TokenNameIdentifier	 set Document Base URI
(	TokenNameLPAREN	
systemID	TokenNameIdentifier	 system ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the base ID (URI or system ID) from where relative * URLs will be resolved. * @return The systemID that was set with {@link #setSystemId}. */	TokenNameCOMMENT_JAVADOC	 Get the base ID (URI or system ID) from where relative URLs will be resolved. @return The systemID that was set with {@link #setSystemId}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_baseSystemID	TokenNameIdentifier	 m base System ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the Transformer associated with this handler, which * is needed in order to set parameters and output properties. * * @return The Transformer associated with this handler */	TokenNameCOMMENT_JAVADOC	 Get the Transformer associated with this handler, which is needed in order to set parameters and output properties. * @return The Transformer associated with this handler 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of org.xml.sax.EntityResolver. 	TokenNameCOMMENT_LINE	Implementation of org.xml.sax.EntityResolver. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Filter an external entity resolution. * * @param publicId The entity's public identifier, or null. * @param systemId The entity's system identifier. * @return A new InputSource or null for the default. * * @throws IOException * @throws SAXException The client may throw * an exception during processing. * @throws java.io.IOException The client may throw an * I/O-related exception while obtaining the * new InputSource. * @see org.xml.sax.EntityResolver#resolveEntity */	TokenNameCOMMENT_JAVADOC	 Filter an external entity resolution. * @param publicId The entity's public identifier, or null. @param systemId The entity's system identifier. @return A new InputSource or null for the default. * @throws IOException @throws SAXException The client may throw an exception during processing. @throws java.io.IOException The client may throw an I/O-related exception while obtaining the new InputSource. @see org.xml.sax.EntityResolver#resolveEntity 
public	TokenNamepublic	
InputSource	TokenNameIdentifier	 Input Source
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_entityResolver	TokenNameIdentifier	 m entity Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_entityResolver	TokenNameIdentifier	 m entity Resolver
.	TokenNameDOT	
resolveEntity	TokenNameIdentifier	 resolve Entity
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of org.xml.sax.DTDHandler. 	TokenNameCOMMENT_LINE	Implementation of org.xml.sax.DTDHandler. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Filter a notation declaration event. * * @param name The notation name. * @param publicId The notation's public identifier, or null. * @param systemId The notation's system identifier, or null. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.DTDHandler#notationDecl */	TokenNameCOMMENT_JAVADOC	 Filter a notation declaration event. * @param name The notation name. @param publicId The notation's public identifier, or null. @param systemId The notation's system identifier, or null. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.DTDHandler#notationDecl 
public	TokenNamepublic	
void	TokenNamevoid	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_dtdHandler	TokenNameIdentifier	 m dtd Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtdHandler	TokenNameIdentifier	 m dtd Handler
.	TokenNameDOT	
notationDecl	TokenNameIdentifier	 notation Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter an unparsed entity declaration event. * * @param name The entity name. * @param publicId The entity's public identifier, or null. * @param systemId The entity's system identifier, or null. * @param notationName The name of the associated notation. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Filter an unparsed entity declaration event. * @param name The entity name. @param publicId The entity's public identifier, or null. @param systemId The entity's system identifier, or null. @param notationName The name of the associated notation. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_dtdHandler	TokenNameIdentifier	 m dtd Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtdHandler	TokenNameIdentifier	 m dtd Handler
.	TokenNameDOT	
unparsedEntityDecl	TokenNameIdentifier	 unparsed Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
,	TokenNameCOMMA	
notationName	TokenNameIdentifier	 notation Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of org.xml.sax.ContentHandler. 	TokenNameCOMMENT_LINE	Implementation of org.xml.sax.ContentHandler. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Filter a new document locator event. * * @param locator The document locator. * @see org.xml.sax.ContentHandler#setDocumentLocator */	TokenNameCOMMENT_JAVADOC	 Filter a new document locator event. * @param locator The document locator. @see org.xml.sax.ContentHandler#setDocumentLocator 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
Locator	TokenNameIdentifier	 Locator
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#setDocumentLocator: "	TokenNameStringLiteral	TransformerHandlerImpl#setDocumentLocator: 
+	TokenNamePLUS	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_locator	TokenNameIdentifier	 m locator
=	TokenNameEQUAL	
locator	TokenNameIdentifier	 locator
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_baseSystemID	TokenNameIdentifier	 m base System ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter a start document event. * * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#startDocument */	TokenNameCOMMENT_JAVADOC	 Filter a start document event. * @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#startDocument 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#startDocument"	TokenNameStringLiteral	TransformerHandlerImpl#startDocument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_insideParse	TokenNameIdentifier	 m inside Parse
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Thread listener = new Thread(m_transformer); 	TokenNameCOMMENT_LINE	Thread listener = new Thread(m_transformer); 
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//m_transformer.setTransformThread(listener); 	TokenNameCOMMENT_LINE	m_transformer.setTransformThread(listener); 
if	TokenNameif	
(	TokenNameLPAREN	
m_incremental	TokenNameIdentifier	 m incremental
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
setSourceTreeDocForThread	TokenNameIdentifier	 set Source Tree Doc For Thread
(	TokenNameLPAREN	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cpriority	TokenNameIdentifier	 cpriority
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// runTransformThread is equivalent with the 2.0.1 code, 	TokenNameCOMMENT_LINE	runTransformThread is equivalent with the 2.0.1 code, 
// except that the Thread may come from a pool. 	TokenNameCOMMENT_LINE	except that the Thread may come from a pool. 
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
runTransformThread	TokenNameIdentifier	 run Transform Thread
(	TokenNameLPAREN	
cpriority	TokenNameIdentifier	 cpriority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This is now done _last_, because IncrementalSAXSource_Filter 	TokenNameCOMMENT_LINE	This is now done _last_, because IncrementalSAXSource_Filter 
// will immediately go into a "wait until events are requested" 	TokenNameCOMMENT_LINE	will immediately go into a "wait until events are requested" 
// pause. I believe that will close our timing window. 	TokenNameCOMMENT_LINE	pause. I believe that will close our timing window. 
// %REVIEW% 	TokenNameCOMMENT_LINE	%REVIEW% 
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//listener.setDaemon(false); 	TokenNameCOMMENT_LINE	listener.setDaemon(false); 
//listener.start(); 	TokenNameCOMMENT_LINE	listener.start(); 
}	TokenNameRBRACE	
/** * Filter an end document event. * * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#endDocument */	TokenNameCOMMENT_JAVADOC	 Filter an end document event. * @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#endDocument 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#endDocument"	TokenNameStringLiteral	TransformerHandlerImpl#endDocument
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_insideParse	TokenNameIdentifier	 m inside Parse
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_incremental	TokenNameIdentifier	 m incremental
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
waitTransformThread	TokenNameIdentifier	 wait Transform Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
setSourceTreeDocForThread	TokenNameIdentifier	 set Source Tree Doc For Thread
(	TokenNameLPAREN	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Thread transformThread = m_transformer.getTransformThread(); if (null != transformThread) { try { // This should wait until the transformThread is considered not alive. transformThread.join(); if (!m_transformer.hasTransformThreadErrorCatcher()) { Exception e = m_transformer.getExceptionThrown(); if (null != e) throw new org.xml.sax.SAXException(e); } m_transformer.setTransformThread(null); } catch (InterruptedException ie){} }*/	TokenNameCOMMENT_BLOCK	 Thread transformThread = m_transformer.getTransformThread(); if (null != transformThread) { try { // This should wait until the transformThread is considered not alive. transformThread.join(); if (!m_transformer.hasTransformThreadErrorCatcher()) { Exception e = m_transformer.getExceptionThrown(); if (null != e) throw new org.xml.sax.SAXException(e); } m_transformer.setTransformThread(null); } catch (InterruptedException ie){} }
}	TokenNameRBRACE	
/** * Filter a start Namespace prefix mapping event. * * @param prefix The Namespace prefix. * @param uri The Namespace URI. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#startPrefixMapping */	TokenNameCOMMENT_JAVADOC	 Filter a start Namespace prefix mapping event. * @param prefix The Namespace prefix. @param uri The Namespace URI. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#startPrefixMapping 
public	TokenNamepublic	
void	TokenNamevoid	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#startPrefixMapping: "	TokenNameStringLiteral	TransformerHandlerImpl#startPrefixMapping: 
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter an end Namespace prefix mapping event. * * @param prefix The Namespace prefix. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#endPrefixMapping */	TokenNameCOMMENT_JAVADOC	 Filter an end Namespace prefix mapping event. * @param prefix The Namespace prefix. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#endPrefixMapping 
public	TokenNamepublic	
void	TokenNamevoid	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#endPrefixMapping: "	TokenNameStringLiteral	TransformerHandlerImpl#endPrefixMapping: 
+	TokenNamePLUS	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter a start element event. * * @param uri The element's Namespace URI, or the empty string. * @param localName The element's local name, or the empty string. * @param qName The element's qualified (prefixed) name, or the empty * string. * @param atts The element's attributes. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#startElement */	TokenNameCOMMENT_JAVADOC	 Filter a start element event. * @param uri The element's Namespace URI, or the empty string. @param localName The element's local name, or the empty string. @param qName The element's qualified (prefixed) name, or the empty string. @param atts The element's attributes. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#startElement 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#startElement: "	TokenNameStringLiteral	TransformerHandlerImpl#startElement: 
+	TokenNamePLUS	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter an end element event. * * @param uri The element's Namespace URI, or the empty string. * @param localName The element's local name, or the empty string. * @param qName The element's qualified (prefixed) name, or the empty * string. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#endElement */	TokenNameCOMMENT_JAVADOC	 Filter an end element event. * @param uri The element's Namespace URI, or the empty string. @param localName The element's local name, or the empty string. @param qName The element's qualified (prefixed) name, or the empty string. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#endElement 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#endElement: "	TokenNameStringLiteral	TransformerHandlerImpl#endElement: 
+	TokenNamePLUS	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter a character data event. * * @param ch An array of characters. * @param start The starting position in the array. * @param length The number of characters to use from the array. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#characters */	TokenNameCOMMENT_JAVADOC	 Filter a character data event. * @param ch An array of characters. @param start The starting position in the array. @param length The number of characters to use from the array. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#characters 
public	TokenNamepublic	
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#characters: "	TokenNameStringLiteral	TransformerHandlerImpl#characters: 
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter an ignorable whitespace event. * * @param ch An array of characters. * @param start The starting position in the array. * @param length The number of characters to use from the array. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#ignorableWhitespace */	TokenNameCOMMENT_JAVADOC	 Filter an ignorable whitespace event. * @param ch An array of characters. @param start The starting position in the array. @param length The number of characters to use from the array. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#ignorableWhitespace 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#ignorableWhitespace: "	TokenNameStringLiteral	TransformerHandlerImpl#ignorableWhitespace: 
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
ignorableWhitespace	TokenNameIdentifier	 ignorable Whitespace
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter a processing instruction event. * * @param target The processing instruction target. * @param data The text following the target. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#processingInstruction */	TokenNameCOMMENT_JAVADOC	 Filter a processing instruction event. * @param target The processing instruction target. @param data The text following the target. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#processingInstruction 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#processingInstruction: "	TokenNameStringLiteral	TransformerHandlerImpl#processingInstruction: 
+	TokenNamePLUS	
target	TokenNameIdentifier	 target
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter a skipped entity event. * * @param name The name of the skipped entity. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ContentHandler#skippedEntity */	TokenNameCOMMENT_JAVADOC	 Filter a skipped entity event. * @param name The name of the skipped entity. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ContentHandler#skippedEntity 
public	TokenNamepublic	
void	TokenNamevoid	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#skippedEntity: "	TokenNameStringLiteral	TransformerHandlerImpl#skippedEntity: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
skippedEntity	TokenNameIdentifier	 skipped Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of org.xml.sax.ErrorHandler. 	TokenNameCOMMENT_LINE	Implementation of org.xml.sax.ErrorHandler. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Filter a warning event. * * @param e The nwarning as an exception. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ErrorHandler#warning */	TokenNameCOMMENT_JAVADOC	 Filter a warning event. * @param e The nwarning as an exception. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ErrorHandler#warning 
public	TokenNamepublic	
void	TokenNamevoid	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// This is not great, but we really would rather have the error 	TokenNameCOMMENT_LINE	This is not great, but we really would rather have the error 
// handler be the error listener if it is a error handler. Coroutine's fatalError 	TokenNameCOMMENT_LINE	handler be the error listener if it is a error handler. Coroutine's fatalError 
// can't really be configured, so I think this is the best thing right now 	TokenNameCOMMENT_LINE	can't really be configured, so I think this is the best thing right now 
// for error reporting. Possibly another JAXP 1.1 hole. -sb 	TokenNameCOMMENT_LINE	for error reporting. Possibly another JAXP 1.1 hole. -sb 
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorListener	TokenNameIdentifier	 error Listener
instanceof	TokenNameinstanceof	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
errorListener	TokenNameIdentifier	 error Listener
)	TokenNameRPAREN	
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter an error event. * * @param e The error as an exception. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ErrorHandler#error */	TokenNameCOMMENT_JAVADOC	 Filter an error event. * @param e The error as an exception. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ErrorHandler#error 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// %REVIEW% I don't think this should be called. -sb 	TokenNameCOMMENT_LINE	%REVIEW% I don't think this should be called. -sb 
// clearCoRoutine(e); 	TokenNameCOMMENT_LINE	clearCoRoutine(e); 
// This is not great, but we really would rather have the error 	TokenNameCOMMENT_LINE	This is not great, but we really would rather have the error 
// handler be the error listener if it is a error handler. Coroutine's fatalError 	TokenNameCOMMENT_LINE	handler be the error listener if it is a error handler. Coroutine's fatalError 
// can't really be configured, so I think this is the best thing right now 	TokenNameCOMMENT_LINE	can't really be configured, so I think this is the best thing right now 
// for error reporting. Possibly another JAXP 1.1 hole. -sb 	TokenNameCOMMENT_LINE	for error reporting. Possibly another JAXP 1.1 hole. -sb 
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorListener	TokenNameIdentifier	 error Listener
instanceof	TokenNameinstanceof	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
errorListener	TokenNameIdentifier	 error Listener
)	TokenNameRPAREN	
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_errorHandler	TokenNameIdentifier	 m error Handler
)	TokenNameRPAREN	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may not be called. 	TokenNameCOMMENT_LINE	may not be called. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_errorHandler	TokenNameIdentifier	 m error Handler
)	TokenNameRPAREN	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may not be called. 	TokenNameCOMMENT_LINE	may not be called. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Filter a fatal error event. * * @param e The error as an exception. * @throws SAXException The client may throw * an exception during processing. * @see org.xml.sax.ErrorHandler#fatalError */	TokenNameCOMMENT_JAVADOC	 Filter a fatal error event. * @param e The error as an exception. @throws SAXException The client may throw an exception during processing. @see org.xml.sax.ErrorHandler#fatalError 
public	TokenNamepublic	
void	TokenNamevoid	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_errorHandler	TokenNameIdentifier	 m error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXParseException	TokenNameIdentifier	 SAX Parse Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
// clearCoRoutine(e); 	TokenNameCOMMENT_LINE	clearCoRoutine(e); 
}	TokenNameRBRACE	
// This is not great, but we really would rather have the error 	TokenNameCOMMENT_LINE	This is not great, but we really would rather have the error 
// handler be the error listener if it is a error handler. Coroutine's fatalError 	TokenNameCOMMENT_LINE	handler be the error listener if it is a error handler. Coroutine's fatalError 
// can't really be configured, so I think this is the best thing right now 	TokenNameCOMMENT_LINE	can't really be configured, so I think this is the best thing right now 
// for error reporting. Possibly another JAXP 1.1 hole. -sb 	TokenNameCOMMENT_LINE	for error reporting. Possibly another JAXP 1.1 hole. -sb 
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
errorListener	TokenNameIdentifier	 error Listener
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorListener	TokenNameIdentifier	 error Listener
instanceof	TokenNameinstanceof	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ErrorHandler	TokenNameIdentifier	 Error Handler
)	TokenNameRPAREN	
errorListener	TokenNameIdentifier	 error Listener
)	TokenNameRPAREN	
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_errorHandler	TokenNameIdentifier	 m error Handler
)	TokenNameRPAREN	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may not be called. 	TokenNameCOMMENT_LINE	may not be called. 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
errorListener	TokenNameIdentifier	 error Listener
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_errorHandler	TokenNameIdentifier	 m error Handler
)	TokenNameRPAREN	
m_errorHandler	TokenNameIdentifier	 m error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// may not be called. 	TokenNameCOMMENT_LINE	may not be called. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of org.xml.sax.ext.LexicalHandler. 	TokenNameCOMMENT_LINE	Implementation of org.xml.sax.ext.LexicalHandler. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Report the start of DTD declarations, if any. * * <p>Any declarations are assumed to be in the internal subset * unless otherwise indicated by a {@link #startEntity startEntity} * event.</p> * * <p>Note that the start/endDTD events will appear within * the start/endDocument events from ContentHandler and * before the first startElement event.</p> * * @param name The document type name. * @param publicId The declared public identifier for the * external DTD subset, or null if none was declared. * @param systemId The declared system identifier for the * external DTD subset, or null if none was declared. * @throws SAXException The application may raise an * exception. * @see #endDTD * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the start of DTD declarations, if any. * <p>Any declarations are assumed to be in the internal subset unless otherwise indicated by a {@link #startEntity startEntity} event.</p> * <p>Note that the start/endDTD events will appear within the start/endDocument events from ContentHandler and before the first startElement event.</p> * @param name The document type name. @param publicId The declared public identifier for the external DTD subset, or null if none was declared. @param systemId The declared system identifier for the external DTD subset, or null if none was declared. @throws SAXException The application may raise an exception. @see #endDTD @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#startDTD: "	TokenNameStringLiteral	TransformerHandlerImpl#startDTD: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
publicId	TokenNameIdentifier	 public Id
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
.	TokenNameDOT	
startDTD	TokenNameIdentifier	 start DTD
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the end of DTD declarations. * * @throws SAXException The application may raise an exception. * @see #startDTD */	TokenNameCOMMENT_JAVADOC	 Report the end of DTD declarations. * @throws SAXException The application may raise an exception. @see #startDTD 
public	TokenNamepublic	
void	TokenNamevoid	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#endDTD"	TokenNameStringLiteral	TransformerHandlerImpl#endDTD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
.	TokenNameDOT	
endDTD	TokenNameIdentifier	 end DTD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the beginning of an entity in content. * * <p><strong>NOTE:</entity> entity references in attribute * values -- and the start and end of the document entity -- * are never reported.</p> * * <p>The start and end of the external DTD subset are reported * using the pseudo-name "[dtd]". All other events must be * properly nested within start/end entity events.</p> * * <p>Note that skipped entities will be reported through the * {@link org.xml.sax.ContentHandler#skippedEntity skippedEntity} * event, which is part of the ContentHandler interface.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @throws SAXException The application may raise an exception. * @see #endEntity * @see org.xml.sax.ext.DeclHandler#internalEntityDecl * @see org.xml.sax.ext.DeclHandler#externalEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report the beginning of an entity in content. * <p><strong>NOTE:</entity> entity references in attribute values -- and the start and end of the document entity -- are never reported.</p> * <p>The start and end of the external DTD subset are reported using the pseudo-name "[dtd]". All other events must be properly nested within start/end entity events.</p> * <p>Note that skipped entities will be reported through the {@link org.xml.sax.ContentHandler#skippedEntity skippedEntity} event, which is part of the ContentHandler interface.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @throws SAXException The application may raise an exception. @see #endEntity @see org.xml.sax.ext.DeclHandler#internalEntityDecl @see org.xml.sax.ext.DeclHandler#externalEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#startEntity: "	TokenNameStringLiteral	TransformerHandlerImpl#startEntity: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
.	TokenNameDOT	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the end of an entity. * * @param name The name of the entity that is ending. * @throws SAXException The application may raise an exception. * @see #startEntity */	TokenNameCOMMENT_JAVADOC	 Report the end of an entity. * @param name The name of the entity that is ending. @throws SAXException The application may raise an exception. @see #startEntity 
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#endEntity: "	TokenNameStringLiteral	TransformerHandlerImpl#endEntity: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
.	TokenNameDOT	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the start of a CDATA section. * * <p>The contents of the CDATA section will be reported through * the regular {@link org.xml.sax.ContentHandler#characters * characters} event.</p> * * @throws SAXException The application may raise an exception. * @see #endCDATA */	TokenNameCOMMENT_JAVADOC	 Report the start of a CDATA section. * <p>The contents of the CDATA section will be reported through the regular {@link org.xml.sax.ContentHandler#characters characters} event.</p> * @throws SAXException The application may raise an exception. @see #endCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#startCDATA"	TokenNameStringLiteral	TransformerHandlerImpl#startCDATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report the end of a CDATA section. * * @throws SAXException The application may raise an exception. * @see #startCDATA */	TokenNameCOMMENT_JAVADOC	 Report the end of a CDATA section. * @throws SAXException The application may raise an exception. @see #startCDATA 
public	TokenNamepublic	
void	TokenNamevoid	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#endCDATA"	TokenNameStringLiteral	TransformerHandlerImpl#endCDATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
.	TokenNameDOT	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report an XML comment anywhere in the document. * * <p>This callback will be used for comments inside or outside the * document element, including comments in the external DTD * subset (if read).</p> * * @param ch An array holding the characters in the comment. * @param start The starting position in the array. * @param length The number of characters to use from the array. * @throws SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an XML comment anywhere in the document. * <p>This callback will be used for comments inside or outside the document element, including comments in the external DTD subset (if read).</p> * @param ch An array holding the characters in the comment. @param start The starting position in the array. @param length The number of characters to use from the array. @throws SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#comment: "	TokenNameStringLiteral	TransformerHandlerImpl#comment: 
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Implementation of org.xml.sax.ext.DeclHandler. 	TokenNameCOMMENT_LINE	Implementation of org.xml.sax.ext.DeclHandler. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** * Report an element type declaration. * * <p>The content model will consist of the string "EMPTY", the * string "ANY", or a parenthesised group, optionally followed * by an occurrence indicator. The model will be normalized so * that all whitespace is removed,and will include the enclosing * parentheses.</p> * * @param name The element type name. * @param model The content model as a normalized string. * @throws SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an element type declaration. * <p>The content model will consist of the string "EMPTY", the string "ANY", or a parenthesised group, optionally followed by an occurrence indicator. The model will be normalized so that all whitespace is removed,and will include the enclosing parentheses.</p> * @param name The element type name. @param model The content model as a normalized string. @throws SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#elementDecl: "	TokenNameStringLiteral	TransformerHandlerImpl#elementDecl: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_declHandler	TokenNameIdentifier	 m decl Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_declHandler	TokenNameIdentifier	 m decl Handler
.	TokenNameDOT	
elementDecl	TokenNameIdentifier	 element Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report an attribute type declaration. * * <p>Only the effective (first) declaration for an attribute will * be reported. The type will be one of the strings "CDATA", * "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", * "ENTITIES", or "NOTATION", or a parenthesized token group with * the separator "|" and all whitespace removed.</p> * * @param eName The name of the associated element. * @param aName The name of the attribute. * @param type A string representing the attribute type. * @param valueDefault A string representing the attribute default * ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if * none of these applies. * @param value A string representing the attribute's default value, * or null if there is none. * @throws SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an attribute type declaration. * <p>Only the effective (first) declaration for an attribute will be reported. The type will be one of the strings "CDATA", "ID", "IDREF", "IDREFS", "NMTOKEN", "NMTOKENS", "ENTITY", "ENTITIES", or "NOTATION", or a parenthesized token group with the separator "|" and all whitespace removed.</p> * @param eName The name of the associated element. @param aName The name of the attribute. @param type A string representing the attribute type. @param valueDefault A string representing the attribute default ("#IMPLIED", "#REQUIRED", or "#FIXED") or null if none of these applies. @param value A string representing the attribute's default value, or null if there is none. @throws SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
eName	TokenNameIdentifier	 e Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
aName	TokenNameIdentifier	 a Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
valueDefault	TokenNameIdentifier	 value Default
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#attributeDecl: "	TokenNameStringLiteral	TransformerHandlerImpl#attributeDecl: 
+	TokenNamePLUS	
eName	TokenNameIdentifier	 e Name
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
aName	TokenNameIdentifier	 a Name
+	TokenNamePLUS	
", etc..."	TokenNameStringLiteral	, etc...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_declHandler	TokenNameIdentifier	 m decl Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_declHandler	TokenNameIdentifier	 m decl Handler
.	TokenNameDOT	
attributeDecl	TokenNameIdentifier	 attribute Decl
(	TokenNameLPAREN	
eName	TokenNameIdentifier	 e Name
,	TokenNameCOMMA	
aName	TokenNameIdentifier	 a Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
valueDefault	TokenNameIdentifier	 value Default
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report an internal entity declaration. * * <p>Only the effective (first) declaration for each entity * will be reported.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @param value The replacement text of the entity. * @throws SAXException The application may raise an exception. * @see #externalEntityDecl * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report an internal entity declaration. * <p>Only the effective (first) declaration for each entity will be reported.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @param value The replacement text of the entity. @throws SAXException The application may raise an exception. @see #externalEntityDecl @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#internalEntityDecl: "	TokenNameStringLiteral	TransformerHandlerImpl#internalEntityDecl: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_declHandler	TokenNameIdentifier	 m decl Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_declHandler	TokenNameIdentifier	 m decl Handler
.	TokenNameDOT	
internalEntityDecl	TokenNameIdentifier	 internal Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Report a parsed external entity declaration. * * <p>Only the effective (first) declaration for each entity * will be reported.</p> * * @param name The name of the entity. If it is a parameter * entity, the name will begin with '%'. * @param publicId The declared public identifier of the entity, or * null if none was declared. * @param systemId The declared system identifier of the entity. * @throws SAXException The application may raise an exception. * @see #internalEntityDecl * @see org.xml.sax.DTDHandler#unparsedEntityDecl */	TokenNameCOMMENT_JAVADOC	 Report a parsed external entity declaration. * <p>Only the effective (first) declaration for each entity will be reported.</p> * @param name The name of the entity. If it is a parameter entity, the name will begin with '%'. @param publicId The declared public identifier of the entity, or null if none was declared. @param systemId The declared system identifier of the entity. @throws SAXException The application may raise an exception. @see #internalEntityDecl @see org.xml.sax.DTDHandler#unparsedEntityDecl 
public	TokenNamepublic	
void	TokenNamevoid	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TransformerHandlerImpl#externalEntityDecl: "	TokenNameStringLiteral	TransformerHandlerImpl#externalEntityDecl: 
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
publicId	TokenNameIdentifier	 public Id
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_declHandler	TokenNameIdentifier	 m decl Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_declHandler	TokenNameIdentifier	 m decl Handler
.	TokenNameDOT	
externalEntityDecl	TokenNameIdentifier	 external Entity Decl
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
publicId	TokenNameIdentifier	 public Id
,	TokenNameCOMMA	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
// Internal state. 	TokenNameCOMMENT_LINE	Internal state. 
//////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////// 
/** Set to true for diagnostics output. */	TokenNameCOMMENT_JAVADOC	 Set to true for diagnostics output. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The transformer this will use to transform a * source tree into a result tree. */	TokenNameCOMMENT_JAVADOC	 The transformer this will use to transform a source tree into a result tree. 
private	TokenNameprivate	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
/** The system ID to use as a base for relative URLs. */	TokenNameCOMMENT_JAVADOC	 The system ID to use as a base for relative URLs. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_baseSystemID	TokenNameIdentifier	 m base System ID
;	TokenNameSEMICOLON	
/** The result for the transformation. */	TokenNameCOMMENT_JAVADOC	 The result for the transformation. 
private	TokenNameprivate	
Result	TokenNameIdentifier	 Result
m_result	TokenNameIdentifier	 m result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The locator for this TransformerHandler. */	TokenNameCOMMENT_JAVADOC	 The locator for this TransformerHandler. 
private	TokenNameprivate	
Locator	TokenNameIdentifier	 Locator
m_locator	TokenNameIdentifier	 m locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The entity resolver to aggregate to. */	TokenNameCOMMENT_JAVADOC	 The entity resolver to aggregate to. 
private	TokenNameprivate	
EntityResolver	TokenNameIdentifier	 Entity Resolver
m_entityResolver	TokenNameIdentifier	 m entity Resolver
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The DTD handler to aggregate to. */	TokenNameCOMMENT_JAVADOC	 The DTD handler to aggregate to. 
private	TokenNameprivate	
DTDHandler	TokenNameIdentifier	 DTD Handler
m_dtdHandler	TokenNameIdentifier	 m dtd Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The content handler to aggregate to. */	TokenNameCOMMENT_JAVADOC	 The content handler to aggregate to. 
private	TokenNameprivate	
ContentHandler	TokenNameIdentifier	 Content Handler
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The error handler to aggregate to. */	TokenNameCOMMENT_JAVADOC	 The error handler to aggregate to. 
private	TokenNameprivate	
ErrorHandler	TokenNameIdentifier	 Error Handler
m_errorHandler	TokenNameIdentifier	 m error Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The lexical handler to aggregate to. */	TokenNameCOMMENT_JAVADOC	 The lexical handler to aggregate to. 
private	TokenNameprivate	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
m_lexicalHandler	TokenNameIdentifier	 m lexical Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The decl handler to aggregate to. */	TokenNameCOMMENT_JAVADOC	 The decl handler to aggregate to. 
private	TokenNameprivate	
DeclHandler	TokenNameIdentifier	 Decl Handler
m_declHandler	TokenNameIdentifier	 m decl Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The Document Table Instance we are transforming. */	TokenNameCOMMENT_JAVADOC	 The Document Table Instance we are transforming. 
DTM	TokenNameIdentifier	 DTM
m_dtm	TokenNameIdentifier	 m dtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
