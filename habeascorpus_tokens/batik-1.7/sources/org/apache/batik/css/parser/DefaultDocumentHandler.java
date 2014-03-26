/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
CSSException	TokenNameIdentifier	 CSS Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
DocumentHandler	TokenNameIdentifier	 Document Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
SACMediaList	TokenNameIdentifier	 SAC Media List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
SelectorList	TokenNameIdentifier	 Selector List
;	TokenNameSEMICOLON	
/** * This class provides a default implementation of the SAC DocumentHandler. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultDocumentHandler.java 478283 2006-11-22 18:53:40Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides a default implementation of the SAC DocumentHandler. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultDocumentHandler.java 478283 2006-11-22 18:53:40Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultDocumentHandler	TokenNameIdentifier	 Default Document Handler
implements	TokenNameimplements	
DocumentHandler	TokenNameIdentifier	 Document Handler
{	TokenNameLBRACE	
/** * The instance of this class. */	TokenNameCOMMENT_JAVADOC	 The instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DocumentHandler	TokenNameIdentifier	 Document Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultDocumentHandler	TokenNameIdentifier	 Default Document Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new DefaultDocumentHandler. */	TokenNameCOMMENT_JAVADOC	 Creates a new DefaultDocumentHandler. 
protected	TokenNameprotected	
DefaultDocumentHandler	TokenNameIdentifier	 Default Document Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#startDocument(InputSource)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#startDocument(InputSource)}. 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#endDocument(InputSource)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#endDocument(InputSource)}. 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#comment(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#comment(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#ignorableAtRule(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#ignorableAtRule(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
ignorableAtRule	TokenNameIdentifier	 ignorable At Rule
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
atRule	TokenNameIdentifier	 at Rule
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#namespaceDeclaration(String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#namespaceDeclaration(String,String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
namespaceDeclaration	TokenNameIdentifier	 namespace Declaration
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * DocumentHandler#importStyle(String,SACMediaList,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link DocumentHandler#importStyle(String,SACMediaList,String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
importStyle	TokenNameIdentifier	 import Style
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
SACMediaList	TokenNameIdentifier	 SAC Media List
media	TokenNameIdentifier	 media
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultNamespaceURI	TokenNameIdentifier	 default Namespace URI
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#startMedia(SACMediaList)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#startMedia(SACMediaList)}. 
public	TokenNamepublic	
void	TokenNamevoid	
startMedia	TokenNameIdentifier	 start Media
(	TokenNameLPAREN	
SACMediaList	TokenNameIdentifier	 SAC Media List
media	TokenNameIdentifier	 media
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#endMedia(SACMediaList)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#endMedia(SACMediaList)}. 
public	TokenNamepublic	
void	TokenNamevoid	
endMedia	TokenNameIdentifier	 end Media
(	TokenNameLPAREN	
SACMediaList	TokenNameIdentifier	 SAC Media List
media	TokenNameIdentifier	 media
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#startPage(String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#startPage(String,String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
startPage	TokenNameIdentifier	 start Page
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pseudo_page	TokenNameIdentifier	 pseudo page
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#endPage(String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#endPage(String,String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
endPage	TokenNameIdentifier	 end Page
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pseudo_page	TokenNameIdentifier	 pseudo page
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#startFontFace()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#startFontFace()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startFontFace	TokenNameIdentifier	 start Font Face
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#endFontFace()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#endFontFace()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endFontFace	TokenNameIdentifier	 end Font Face
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#startSelector(SelectorList)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#startSelector(SelectorList)}. 
public	TokenNamepublic	
void	TokenNamevoid	
startSelector	TokenNameIdentifier	 start Selector
(	TokenNameLPAREN	
SelectorList	TokenNameIdentifier	 Selector List
selectors	TokenNameIdentifier	 selectors
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#endSelector(SelectorList)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#endSelector(SelectorList)}. 
public	TokenNamepublic	
void	TokenNamevoid	
endSelector	TokenNameIdentifier	 end Selector
(	TokenNameLPAREN	
SelectorList	TokenNameIdentifier	 Selector List
selectors	TokenNameIdentifier	 selectors
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link * org.w3c.css.sac.DocumentHandler#property(String,LexicalUnit,boolean)}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link org.w3c.css.sac.DocumentHandler#property(String,LexicalUnit,boolean)}. 
public	TokenNamepublic	
void	TokenNamevoid	
property	TokenNameIdentifier	 property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
important	TokenNameIdentifier	 important
)	TokenNameRPAREN	
throws	TokenNamethrows	
CSSException	TokenNameIdentifier	 CSS Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
