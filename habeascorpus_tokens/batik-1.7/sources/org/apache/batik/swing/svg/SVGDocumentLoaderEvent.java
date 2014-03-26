/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventObject	TokenNameIdentifier	 Event Object
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
/** * This class represents an event which indicate an event originated * from a SVGDocumentLoader instance. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGDocumentLoaderEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an event which indicate an event originated from a SVGDocumentLoader instance. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGDocumentLoaderEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
/** * The associated SVG document. */	TokenNameCOMMENT_JAVADOC	 The associated SVG document. 
protected	TokenNameprotected	
SVGDocument	TokenNameIdentifier	 SVG Document
svgDocument	TokenNameIdentifier	 svg Document
;	TokenNameSEMICOLON	
/** * Creates a new SVGDocumentLoaderEvent. * @param source the object that originated the event, ie. the * SVGDocumentLoader. * @param doc The associated document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGDocumentLoaderEvent. @param source the object that originated the event, ie. the SVGDocumentLoader. @param doc The associated document. 
public	TokenNamepublic	
SVGDocumentLoaderEvent	TokenNameIdentifier	 SVG Document Loader Event
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
SVGDocument	TokenNameIdentifier	 SVG Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgDocument	TokenNameIdentifier	 svg Document
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the associated SVG document, or null if the loading * was just started or an error occured. */	TokenNameCOMMENT_JAVADOC	 Returns the associated SVG document, or null if the loading was just started or an error occured. 
public	TokenNamepublic	
SVGDocument	TokenNameIdentifier	 SVG Document
getSVGDocument	TokenNameIdentifier	 get SVG Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgDocument	TokenNameIdentifier	 svg Document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
