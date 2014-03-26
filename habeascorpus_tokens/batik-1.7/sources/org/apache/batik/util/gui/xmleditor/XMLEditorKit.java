/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
xmleditor	TokenNameIdentifier	 xmleditor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JEditorPane	TokenNameIdentifier	 J Editor Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DefaultEditorKit	TokenNameIdentifier	 Default Editor Kit
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
View	TokenNameIdentifier	 View
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ViewFactory	TokenNameIdentifier	 View Factory
;	TokenNameSEMICOLON	
/** * This is the set of things needed by a text component to be a reasonably * functioning editor for xml type document. * * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 This is the set of things needed by a text component to be a reasonably functioning editor for xml type document. * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> @version $Id$ 
public	TokenNamepublic	
class	TokenNameclass	
XMLEditorKit	TokenNameIdentifier	 XML Editor Kit
extends	TokenNameextends	
DefaultEditorKit	TokenNameIdentifier	 Default Editor Kit
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_MIME_TYPE	TokenNameIdentifier	 XML  MIME  TYPE
=	TokenNameEQUAL	
"text/xml"	TokenNameStringLiteral	text/xml
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XMLContext	TokenNameIdentifier	 XML Context
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ViewFactory	TokenNameIdentifier	 View Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Creates a new instance of XMLEditorKit */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of XMLEditorKit 
public	TokenNamepublic	
XMLEditorKit	TokenNameIdentifier	 XML Editor Kit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a new instance of XMLEditorKit * @param context XMLContext */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of XMLEditorKit @param context XMLContext 
public	TokenNamepublic	
XMLEditorKit	TokenNameIdentifier	 XML Editor Kit
(	TokenNameLPAREN	
XMLContext	TokenNameIdentifier	 XML Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
new	TokenNamenew	
XMLViewFactory	TokenNameIdentifier	 XML View Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
new	TokenNamenew	
XMLContext	TokenNameIdentifier	 XML Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return XMLContext */	TokenNameCOMMENT_JAVADOC	 @return XMLContext 
public	TokenNamepublic	
XMLContext	TokenNameIdentifier	 XML Context
getStylePreferences	TokenNameIdentifier	 get Style Preferences
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Overriden to set the JEditorPane font to match with the XMLContext * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 Overriden to set the JEditorPane font to match with the XMLContext {@inheritDoc} 
public	TokenNamepublic	
void	TokenNamevoid	
install	TokenNameIdentifier	 install
(	TokenNameLPAREN	
JEditorPane	TokenNameIdentifier	 J Editor Pane
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
install	TokenNameIdentifier	 install
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
getSyntaxFont	TokenNameIdentifier	 get Syntax Font
(	TokenNameLPAREN	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
DEFAULT_STYLE	TokenNameIdentifier	 DEFAULT  STYLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the MIME type of the data that this * kit represents support for. This kit supports * the type <code>text/xml</code>. */	TokenNameCOMMENT_JAVADOC	 Get the MIME type of the data that this kit represents support for. This kit supports the type <code>text/xml</code>. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XML_MIME_TYPE	TokenNameIdentifier	 XML  MIME  TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLEditorKit	TokenNameIdentifier	 XML Editor Kit
kit	TokenNameIdentifier	 kit
=	TokenNameEQUAL	
new	TokenNamenew	
XMLEditorKit	TokenNameIdentifier	 XML Editor Kit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kit	TokenNameIdentifier	 kit
.	TokenNameDOT	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
return	TokenNamereturn	
kit	TokenNameIdentifier	 kit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
createDefaultDocument	TokenNameIdentifier	 create Default Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLDocument	TokenNameIdentifier	 XML Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
XMLDocument	TokenNameIdentifier	 XML Document
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
ViewFactory	TokenNameIdentifier	 View Factory
getViewFactory	TokenNameIdentifier	 get View Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A simple view factory implementation. */	TokenNameCOMMENT_JAVADOC	 A simple view factory implementation. 
protected	TokenNameprotected	
class	TokenNameclass	
XMLViewFactory	TokenNameIdentifier	 XML View Factory
implements	TokenNameimplements	
ViewFactory	TokenNameIdentifier	 View Factory
{	TokenNameLBRACE	
// Creates the XML View. 	TokenNameCOMMENT_LINE	Creates the XML View. 
public	TokenNamepublic	
View	TokenNameIdentifier	 View
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLView	TokenNameIdentifier	 XML View
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
