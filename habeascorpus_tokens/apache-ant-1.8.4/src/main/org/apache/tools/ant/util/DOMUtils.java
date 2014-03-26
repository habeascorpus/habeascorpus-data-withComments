/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
CDATASection	TokenNameIdentifier	 CDATA Section
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
// CheckStyle:HideUtilityClassConstructorCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF - bc 
/** * Some utility methods for common tasks when building DOM trees in memory. * * <p>In this documentation <code>&lt;a&gt;</code> means an {@link * org.w3c.dom.Element Element} instance with name <code>a</code>.</p> * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Some utility methods for common tasks when building DOM trees in memory. * <p>In this documentation <code>&lt;a&gt;</code> means an {@link org.w3c.dom.Element Element} instance with name <code>a</code>.</p> * @since Ant 1.6.3 
public	TokenNamepublic	
class	TokenNameclass	
DOMUtils	TokenNameIdentifier	 DOM Utils
{	TokenNameLBRACE	
/** * Get a new Document instance, * @return the document. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Get a new Document instance, @return the document. @since Ant 1.6.3 
public	TokenNamepublic	
static	TokenNamestatic	
Document	TokenNameIdentifier	 Document
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
JAXPUtils	TokenNameIdentifier	 JAXP Utils
.	TokenNameDOT	
getDocumentBuilder	TokenNameIdentifier	 get Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newDocument	TokenNameIdentifier	 new Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a named Element and appends it to the given element, * returns it. * * <p>This means * <pre>createChildElement(&lt;a&gt;, "b")</pre> * creates * <pre> * &lt;a&gt; * &lt;b/&gt; * &lt;/a&gt; * </pre> * and returns <code>&lt;b&gt;</code>.</p> * * @param parent element that will receive the new element as child. * @param name name of the new element. * @return the new element. * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Creates a named Element and appends it to the given element, returns it. * <p>This means <pre>createChildElement(&lt;a&gt;, "b")</pre> creates <pre> &lt;a&gt; &lt;b/&gt; &lt;/a&gt; </pre> and returns <code>&lt;b&gt;</code>.</p> * @param parent element that will receive the new element as child. @param name name of the new element. @return the new element. * @since Ant 1.6.3 
public	TokenNamepublic	
static	TokenNamestatic	
Element	TokenNameIdentifier	 Element
createChildElement	TokenNameIdentifier	 create Child Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds nested text. * * <p>This means * <pre>appendText(&lt;a&gt;, "b")</pre> * creates * <pre> * &lt;a&gt;b&lt;/a&gt; * </pre> * </p> * * @param parent element that will receive the new element as child. * @param content text content. * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Adds nested text. * <p>This means <pre>appendText(&lt;a&gt;, "b")</pre> creates <pre> &lt;a&gt;b&lt;/a&gt; </pre> </p> * @param parent element that will receive the new element as child. @param content text content. * @since Ant 1.6.3 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
appendText	TokenNameIdentifier	 append Text
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Text	TokenNameIdentifier	 Text
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a nested CDATA section. * * <p>This means * <pre>appendCDATA(&lt;a&gt;, "b")</pre> * creates * <pre> * &lt;a&gt;&lt;[!CDATA[b]]&gt;&lt;/a&gt; * </pre> * </p> * * @param parent element that will receive the new element as child. * @param content text content. * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Adds a nested CDATA section. * <p>This means <pre>appendCDATA(&lt;a&gt;, "b")</pre> creates <pre> &lt;a&gt;&lt;[!CDATA[b]]&gt;&lt;/a&gt; </pre> </p> * @param parent element that will receive the new element as child. @param content text content. * @since Ant 1.6.3 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
appendCDATA	TokenNameIdentifier	 append CDATA
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CDATASection	TokenNameIdentifier	 CDATA Section
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createCDATASection	TokenNameIdentifier	 create CDATA Section
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds nested text in a new child element. * * <p>This means * <pre>appendTextElement(&lt;a&gt;, "b", "c")</pre> * creates * <pre> * &lt;a&gt; * &lt;b&gt;c&lt;/b&gt; * &lt;/a&gt; * </pre> * </p> * * @param parent element that will receive the new element as child. * @param name of the child element. * @param content text content. * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Adds nested text in a new child element. * <p>This means <pre>appendTextElement(&lt;a&gt;, "b", "c")</pre> creates <pre> &lt;a&gt; &lt;b&gt;c&lt;/b&gt; &lt;/a&gt; </pre> </p> * @param parent element that will receive the new element as child. @param name of the child element. @param content text content. * @since Ant 1.6.3 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
appendTextElement	TokenNameIdentifier	 append Text Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
createChildElement	TokenNameIdentifier	 create Child Element
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendText	TokenNameIdentifier	 append Text
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a nested CDATA section in a new child element. * * <p>This means * <pre>appendCDATAElement(&lt;a&gt;, "b", "c")</pre> * creates * <pre> * &lt;a&gt; * &lt;b&gt;&lt;![CDATA[c]]>&lt;/b&gt; * &lt;/a&gt; * </pre> * </pre> * </p> * * @param parent element that will receive the new element as child. * @param name of the child element. * @param content text content. * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Adds a nested CDATA section in a new child element. * <p>This means <pre>appendCDATAElement(&lt;a&gt;, "b", "c")</pre> creates <pre> &lt;a&gt; &lt;b&gt;&lt;![CDATA[c]]>&lt;/b&gt; &lt;/a&gt; </pre> </pre> </p> * @param parent element that will receive the new element as child. @param name of the child element. @param content text content. * @since Ant 1.6.3 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
appendCDATAElement	TokenNameIdentifier	 append CDATA Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
createChildElement	TokenNameIdentifier	 create Child Element
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appendCDATA	TokenNameIdentifier	 append CDATA
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
