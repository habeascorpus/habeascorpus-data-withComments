/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SerializationHandler.java 471981 2006-11-07 04:28:00Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SerializationHandler.java 471981 2006-11-07 04:28:00Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
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
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
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
ErrorHandler	TokenNameIdentifier	 Error Handler
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
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
DeclHandler	TokenNameIdentifier	 Decl Handler
;	TokenNameSEMICOLON	
/** * This interface is the one that a serializer implements. It is a group of * other interfaces, such as ExtendedContentHandler, ExtendedLexicalHandler etc. * In addition there are other methods, such as reset(). * * This class is public only because it is used in another package, * it is not a public API. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This interface is the one that a serializer implements. It is a group of other interfaces, such as ExtendedContentHandler, ExtendedLexicalHandler etc. In addition there are other methods, such as reset(). * This class is public only because it is used in another package, it is not a public API. * @xsl.usage internal 
public	TokenNamepublic	
interface	TokenNameinterface	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
extends	TokenNameextends	
ExtendedContentHandler	TokenNameIdentifier	 Extended Content Handler
,	TokenNameCOMMA	
ExtendedLexicalHandler	TokenNameIdentifier	 Extended Lexical Handler
,	TokenNameCOMMA	
XSLOutputAttributes	TokenNameIdentifier	 XSL Output Attributes
,	TokenNameCOMMA	
DeclHandler	TokenNameIdentifier	 Decl Handler
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
DTDHandler	TokenNameIdentifier	 DTD Handler
,	TokenNameCOMMA	
ErrorHandler	TokenNameIdentifier	 Error Handler
,	TokenNameCOMMA	
DOMSerializer	TokenNameIdentifier	 DOM Serializer
,	TokenNameCOMMA	
Serializer	TokenNameIdentifier	 Serializer
{	TokenNameLBRACE	
/** * Set the SAX Content handler that the serializer sends its output to. This * method only applies to a ToSAXHandler, not to a ToStream serializer. * * @see Serializer#asContentHandler() * @see ToSAXHandler */	TokenNameCOMMENT_JAVADOC	 Set the SAX Content handler that the serializer sends its output to. This method only applies to a ToSAXHandler, not to a ToStream serializer. * @see Serializer#asContentHandler() @see ToSAXHandler 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Notify that the serializer should take this DOM node as input to be * serialized. * * @param node the DOM node to be serialized. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Notify that the serializer should take this DOM node as input to be serialized. * @param node the DOM node to be serialized. @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Turns special character escaping on/off. * * Note that characters will * never, even if this option is set to 'true', be escaped within * CDATA sections in output XML documents. * * @param escape true if escaping is to be set on. */	TokenNameCOMMENT_JAVADOC	 Turns special character escaping on/off. * Note that characters will never, even if this option is set to 'true', be escaped within CDATA sections in output XML documents. * @param escape true if escaping is to be set on. 
public	TokenNamepublic	
boolean	TokenNameboolean	
setEscaping	TokenNameIdentifier	 set Escaping
(	TokenNameLPAREN	
boolean	TokenNameboolean	
escape	TokenNameIdentifier	 escape
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Set the number of spaces to indent for each indentation level. * @param spaces the number of spaces to indent for each indentation level. */	TokenNameCOMMENT_JAVADOC	 Set the number of spaces to indent for each indentation level. @param spaces the number of spaces to indent for each indentation level. 
public	TokenNamepublic	
void	TokenNamevoid	
setIndentAmount	TokenNameIdentifier	 set Indent Amount
(	TokenNameLPAREN	
int	TokenNameint	
spaces	TokenNameIdentifier	 spaces
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the transformer associated with the serializer. * @param transformer the transformer associated with the serializer. */	TokenNameCOMMENT_JAVADOC	 Set the transformer associated with the serializer. @param transformer the transformer associated with the serializer. 
public	TokenNamepublic	
void	TokenNamevoid	
setTransformer	TokenNameIdentifier	 set Transformer
(	TokenNameLPAREN	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the transformer associated with the serializer. * @return Transformer the transformer associated with the serializer. */	TokenNameCOMMENT_JAVADOC	 Get the transformer associated with the serializer. @return Transformer the transformer associated with the serializer. 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used only by TransformerSnapshotImpl to restore the serialization * to a previous state. * * @param mappings NamespaceMappings */	TokenNameCOMMENT_JAVADOC	 Used only by TransformerSnapshotImpl to restore the serialization to a previous state. * @param mappings NamespaceMappings 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespaceMappings	TokenNameIdentifier	 set Namespace Mappings
(	TokenNameLPAREN	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
mappings	TokenNameIdentifier	 mappings
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * A SerializationHandler accepts SAX-like events, so * it can accumulate attributes or namespace nodes after * a startElement(). * <p> * If the SerializationHandler has a Writer or OutputStream, * a call to this method will flush such accumulated * events as a closed start tag for an element. * <p> * If the SerializationHandler wraps a ContentHandler, * a call to this method will flush such accumulated * events as a SAX (not SAX-like) calls to * startPrefixMapping() and startElement(). * <p> * If one calls endDocument() then one need not call * this method since a call to endDocument() will * do what this method does. However, in some * circumstances, such as with document fragments, * endDocument() is not called and it may be * necessary to call this method to flush * any pending events. * <p> * For performance reasons this method should not be called * very often. */	TokenNameCOMMENT_JAVADOC	 A SerializationHandler accepts SAX-like events, so it can accumulate attributes or namespace nodes after a startElement(). <p> If the SerializationHandler has a Writer or OutputStream, a call to this method will flush such accumulated events as a closed start tag for an element. <p> If the SerializationHandler wraps a ContentHandler, a call to this method will flush such accumulated events as a SAX (not SAX-like) calls to startPrefixMapping() and startElement(). <p> If one calls endDocument() then one need not call this method since a call to endDocument() will do what this method does. However, in some circumstances, such as with document fragments, endDocument() is not called and it may be necessary to call this method to flush any pending events. <p> For performance reasons this method should not be called very often. 
public	TokenNamepublic	
void	TokenNamevoid	
flushPending	TokenNameIdentifier	 flush Pending
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * Default behavior is to expand DTD entities, * that is the initall default value is true. * @param expand true if DTD entities are to be expanded, * false if they are to be left as DTD entity references. */	TokenNameCOMMENT_JAVADOC	 Default behavior is to expand DTD entities, that is the initall default value is true. @param expand true if DTD entities are to be expanded, false if they are to be left as DTD entity references. 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDEntityExpansion	TokenNameIdentifier	 set DTD Entity Expansion
(	TokenNameLPAREN	
boolean	TokenNameboolean	
expand	TokenNameIdentifier	 expand
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
