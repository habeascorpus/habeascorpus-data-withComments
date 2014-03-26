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
SVGAElement	TokenNameIdentifier	 SVGA Element
;	TokenNameSEMICOLON	
/** * This class represents an event which indicate an event originated * from a GVTTreeBuilder instance. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: LinkActivationEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an event which indicate an event originated from a GVTTreeBuilder instance. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: LinkActivationEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
LinkActivationEvent	TokenNameIdentifier	 Link Activation Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
/** * The URI the link references. */	TokenNameCOMMENT_JAVADOC	 The URI the link references. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
referencedURI	TokenNameIdentifier	 referenced URI
;	TokenNameSEMICOLON	
/** * Creates a new LinkActivationEvent. * @param source the object that originated the event, ie. the * GVTTreeBuilder. * @param link the link element. * @param uri the URI of the document loaded. */	TokenNameCOMMENT_JAVADOC	 Creates a new LinkActivationEvent. @param source the object that originated the event, ie. the GVTTreeBuilder. @param link the link element. @param uri the URI of the document loaded. 
public	TokenNamepublic	
LinkActivationEvent	TokenNameIdentifier	 Link Activation Event
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
SVGAElement	TokenNameIdentifier	 SVGA Element
link	TokenNameIdentifier	 link
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
referencedURI	TokenNameIdentifier	 referenced URI
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the referenced URI. */	TokenNameCOMMENT_JAVADOC	 Returns the referenced URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReferencedURI	TokenNameIdentifier	 get Referenced URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
referencedURI	TokenNameIdentifier	 referenced URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
