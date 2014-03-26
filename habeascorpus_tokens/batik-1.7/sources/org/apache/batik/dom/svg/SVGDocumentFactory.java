/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DocumentFactory	TokenNameIdentifier	 Document Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGDocument	TokenNameIdentifier	 SVG Document
;	TokenNameSEMICOLON	
/** * This interface represents an object which can build a SVGDocument. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGDocumentFactory.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This interface represents an object which can build a SVGDocument. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGDocumentFactory.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
interface	TokenNameinterface	
SVGDocumentFactory	TokenNameIdentifier	 SVG Document Factory
extends	TokenNameextends	
DocumentFactory	TokenNameIdentifier	 Document Factory
{	TokenNameLBRACE	
/** * Creates a SVG Document instance. * @param uri The document URI. * @exception IOException if an error occured while reading the document. */	TokenNameCOMMENT_JAVADOC	 Creates a SVG Document instance. @param uri The document URI. @exception IOException if an error occured while reading the document. 
SVGDocument	TokenNameIdentifier	 SVG Document
createSVGDocument	TokenNameIdentifier	 create SVG Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Creates a SVG Document instance. * @param uri The document URI. * @param is The document input stream. * @exception IOException if an error occured while reading the document. */	TokenNameCOMMENT_JAVADOC	 Creates a SVG Document instance. @param uri The document URI. @param is The document input stream. @exception IOException if an error occured while reading the document. 
SVGDocument	TokenNameIdentifier	 SVG Document
createSVGDocument	TokenNameIdentifier	 create SVG Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Creates a SVG Document instance. * @param uri The document URI. * @param r The document reader. * @exception IOException if an error occured while reading the document. */	TokenNameCOMMENT_JAVADOC	 Creates a SVG Document instance. @param uri The document URI. @param r The document reader. @exception IOException if an error occured while reading the document. 
SVGDocument	TokenNameIdentifier	 SVG Document
createSVGDocument	TokenNameIdentifier	 create SVG Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
