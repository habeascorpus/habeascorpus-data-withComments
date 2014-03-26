/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMImplementationImpl	TokenNameIdentifier	 DOM Implementation Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLDOMImplementation	TokenNameIdentifier	 HTMLDOM Implementation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
html	TokenNameIdentifier	 html
.	TokenNameDOT	
HTMLDocument	TokenNameIdentifier	 HTML Document
;	TokenNameSEMICOLON	
/** * Provides number of methods for performing operations that are independent * of any particular instance of the document object model. This class is * unconstructable, the only way to obtain an instance of a DOM implementation * is by calling the static method {@link #getDOMImplementation}. * * @xerces.internal * * @version $Revision: 645327 $ $Date: 2008-04-06 19:17:54 -0400 (Sun, 06 Apr 2008) $ * @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> * @see org.w3c.dom.DOMImplementation */	TokenNameCOMMENT_JAVADOC	 Provides number of methods for performing operations that are independent of any particular instance of the document object model. This class is unconstructable, the only way to obtain an instance of a DOM implementation is by calling the static method {@link #getDOMImplementation}. * @xerces.internal * @version $Revision: 645327 $ $Date: 2008-04-06 19:17:54 -0400 (Sun, 06 Apr 2008) $ @author <a href="mailto:arkin@exoffice.com">Assaf Arkin</a> @see org.w3c.dom.DOMImplementation 
public	TokenNamepublic	
class	TokenNameclass	
HTMLDOMImplementationImpl	TokenNameIdentifier	 HTMLDOM Implementation Impl
extends	TokenNameextends	
DOMImplementationImpl	TokenNameIdentifier	 DOM Implementation Impl
implements	TokenNameimplements	
HTMLDOMImplementation	TokenNameIdentifier	 HTMLDOM Implementation
{	TokenNameLBRACE	
/** * Holds a reference to the single instance of the DOM implementation. * Only one instance is required since this class is multiple entry. */	TokenNameCOMMENT_JAVADOC	 Holds a reference to the single instance of the DOM implementation. Only one instance is required since this class is multiple entry. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
HTMLDOMImplementation	TokenNameIdentifier	 HTMLDOM Implementation
_instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLDOMImplementationImpl	TokenNameIdentifier	 HTMLDOM Implementation Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Private constructor assures that an object of this class cannot * be created. The only way to obtain an object is by calling {@link * #getDOMImplementation}. */	TokenNameCOMMENT_JAVADOC	 Private constructor assures that an object of this class cannot be created. The only way to obtain an object is by calling {@link #getDOMImplementation}. 
private	TokenNameprivate	
HTMLDOMImplementationImpl	TokenNameIdentifier	 HTMLDOM Implementation Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create a new HTML document of the specified <TT>TITLE</TT> text. * * @param title The document title text * @return New HTML document */	TokenNameCOMMENT_JAVADOC	 Create a new HTML document of the specified <TT>TITLE</TT> text. * @param title The document title text @return New HTML document 
public	TokenNamepublic	
final	TokenNamefinal	
HTMLDocument	TokenNameIdentifier	 HTML Document
createHTMLDocument	TokenNameIdentifier	 create HTML Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
HTMLDocument	TokenNameIdentifier	 HTML Document
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"HTM014 Argument 'title' is null."	TokenNameStringLiteral	HTM014 Argument 'title' is null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLDocumentImpl	TokenNameIdentifier	 HTML Document Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an instance of a {@link HTMLDOMImplementation} that can be * used to perform operations that are not specific to a particular * document instance, e.g. to create a new document. * * @return Reference to a valid DOM implementation */	TokenNameCOMMENT_JAVADOC	 Returns an instance of a {@link HTMLDOMImplementation} that can be used to perform operations that are not specific to a particular document instance, e.g. to create a new document. * @return Reference to a valid DOM implementation 
public	TokenNamepublic	
static	TokenNamestatic	
HTMLDOMImplementation	TokenNameIdentifier	 HTMLDOM Implementation
getHTMLDOMImplementation	TokenNameIdentifier	 get HTMLDOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
