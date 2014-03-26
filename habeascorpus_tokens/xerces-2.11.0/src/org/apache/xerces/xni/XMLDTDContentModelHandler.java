/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLDTDContentModelSource	TokenNameIdentifier	 XMLDTD Content Model Source
;	TokenNameSEMICOLON	
/** * The DTD content model handler interface defines callback methods * to report information items in DTD content models of an element * declaration. Parser components interested in DTD content model * information implement this interface and are registered as the DTD * content model handler on the DTD content model source. * * @see XMLDTDHandler * * @author Andy Clark, IBM * * @version $Id: XMLDTDContentModelHandler.java 447247 2006-09-18 05:23:52Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The DTD content model handler interface defines callback methods to report information items in DTD content models of an element declaration. Parser components interested in DTD content model information implement this interface and are registered as the DTD content model handler on the DTD content model source. * @see XMLDTDHandler * @author Andy Clark, IBM * @version $Id: XMLDTDContentModelHandler.java 447247 2006-09-18 05:23:52Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLDTDContentModelHandler	TokenNameIdentifier	 XMLDTD Content Model Handler
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// separators 	TokenNameCOMMENT_LINE	separators 
/** * A choice separator for children and mixed content models. This * separator is used to specify that the allowed child is one of a * collection. * <p> * For example: * <pre> * &lt;!ELEMENT elem (foo|bar)&gt; * &lt;!ELEMENT elem (foo|bar+)&gt; * &lt;!ELEMENT elem (foo|bar|baz)&gt; * &lt;!ELEMENT elem (#PCDATA|foo|bar)*&gt; * </pre> * * @see #SEPARATOR_SEQUENCE */	TokenNameCOMMENT_JAVADOC	 A choice separator for children and mixed content models. This separator is used to specify that the allowed child is one of a collection. <p> For example: <pre> &lt;!ELEMENT elem (foo|bar)&gt; &lt;!ELEMENT elem (foo|bar+)&gt; &lt;!ELEMENT elem (foo|bar|baz)&gt; &lt;!ELEMENT elem (#PCDATA|foo|bar)*&gt; </pre> * @see #SEPARATOR_SEQUENCE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SEPARATOR_CHOICE	TokenNameIdentifier	 SEPARATOR  CHOICE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A sequence separator for children content models. This separator * is used to specify that the allowed children must follow in the * specified sequence. * <p> * <pre> * &lt;!ELEMENT elem (foo,bar)&gt; * &lt;!ELEMENT elem (foo,bar*)&gt; * &lt;!ELEMENT elem (foo,bar,baz)&gt; * </pre> * * @see #SEPARATOR_CHOICE */	TokenNameCOMMENT_JAVADOC	 A sequence separator for children content models. This separator is used to specify that the allowed children must follow in the specified sequence. <p> <pre> &lt;!ELEMENT elem (foo,bar)&gt; &lt;!ELEMENT elem (foo,bar*)&gt; &lt;!ELEMENT elem (foo,bar,baz)&gt; </pre> * @see #SEPARATOR_CHOICE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
SEPARATOR_SEQUENCE	TokenNameIdentifier	 SEPARATOR  SEQUENCE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// occurrence counts 	TokenNameCOMMENT_LINE	occurrence counts 
/** * This occurrence count limits the element, choice, or sequence in a * children content model to zero or one. In other words, the child * is optional. * <p> * For example: * <pre> * &lt;!ELEMENT elem (foo?)&gt; * </pre> * * @see #OCCURS_ZERO_OR_MORE * @see #OCCURS_ONE_OR_MORE */	TokenNameCOMMENT_JAVADOC	 This occurrence count limits the element, choice, or sequence in a children content model to zero or one. In other words, the child is optional. <p> For example: <pre> &lt;!ELEMENT elem (foo?)&gt; </pre> * @see #OCCURS_ZERO_OR_MORE @see #OCCURS_ONE_OR_MORE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
OCCURS_ZERO_OR_ONE	TokenNameIdentifier	 OCCURS  ZERO  OR  ONE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This occurrence count limits the element, choice, or sequence in a * children content model to zero or more. In other words, the child * may appear an arbitrary number of times, or not at all. This * occurrence count is also used for mixed content models. * <p> * For example: * <pre> * &lt;!ELEMENT elem (foo*)&gt; * &lt;!ELEMENT elem (#PCDATA|foo|bar)*&gt; * </pre> * * @see #OCCURS_ZERO_OR_ONE * @see #OCCURS_ONE_OR_MORE */	TokenNameCOMMENT_JAVADOC	 This occurrence count limits the element, choice, or sequence in a children content model to zero or more. In other words, the child may appear an arbitrary number of times, or not at all. This occurrence count is also used for mixed content models. <p> For example: <pre> &lt;!ELEMENT elem (foo*)&gt; &lt;!ELEMENT elem (#PCDATA|foo|bar)*&gt; </pre> * @see #OCCURS_ZERO_OR_ONE @see #OCCURS_ONE_OR_MORE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
OCCURS_ZERO_OR_MORE	TokenNameIdentifier	 OCCURS  ZERO  OR  MORE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This occurrence count limits the element, choice, or sequence in a * children content model to one or more. In other words, the child * may appear an arbitrary number of times, but must appear at least * once. * <p> * For example: * <pre> * &lt;!ELEMENT elem (foo+)&gt; * </pre> * * @see #OCCURS_ZERO_OR_ONE * @see #OCCURS_ZERO_OR_MORE */	TokenNameCOMMENT_JAVADOC	 This occurrence count limits the element, choice, or sequence in a children content model to one or more. In other words, the child may appear an arbitrary number of times, but must appear at least once. <p> For example: <pre> &lt;!ELEMENT elem (foo+)&gt; </pre> * @see #OCCURS_ZERO_OR_ONE @see #OCCURS_ZERO_OR_MORE 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
OCCURS_ONE_OR_MORE	TokenNameIdentifier	 OCCURS  ONE  OR  MORE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// XMLDTDContentModelHandler methods 	TokenNameCOMMENT_LINE	XMLDTDContentModelHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * The start of a content model. Depending on the type of the content * model, specific methods may be called between the call to the * startContentModel method and the call to the endContentModel method. * * @param elementName The name of the element. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The start of a content model. Depending on the type of the content model, specific methods may be called between the call to the startContentModel method and the call to the endContentModel method. * @param elementName The name of the element. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startContentModel	TokenNameIdentifier	 start Content Model
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * A content model of ANY. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. * * @see #empty * @see #startGroup */	TokenNameCOMMENT_JAVADOC	 A content model of ANY. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. * @see #empty @see #startGroup 
public	TokenNamepublic	
void	TokenNamevoid	
any	TokenNameIdentifier	 any
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * A content model of EMPTY. * * @throws XNIException Thrown by handler to signal an error. * * @param augmentations Additional information that may include infoset * augmentations. * * @see #any * @see #startGroup */	TokenNameCOMMENT_JAVADOC	 A content model of EMPTY. * @throws XNIException Thrown by handler to signal an error. * @param augmentations Additional information that may include infoset augmentations. * @see #any @see #startGroup 
public	TokenNamepublic	
void	TokenNamevoid	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * A start of either a mixed or children content model. A mixed * content model will immediately be followed by a call to the * <code>pcdata()</code> method. A children content model will * contain additional groups and/or elements. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. * * @see #any * @see #empty */	TokenNameCOMMENT_JAVADOC	 A start of either a mixed or children content model. A mixed content model will immediately be followed by a call to the <code>pcdata()</code> method. A children content model will contain additional groups and/or elements. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. * @see #any @see #empty 
public	TokenNamepublic	
void	TokenNamevoid	
startGroup	TokenNameIdentifier	 start Group
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The appearance of "#PCDATA" within a group signifying a * mixed content model. This method will be the first called * following the content model's <code>startGroup()</code>. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. * * @see #startGroup */	TokenNameCOMMENT_JAVADOC	 The appearance of "#PCDATA" within a group signifying a mixed content model. This method will be the first called following the content model's <code>startGroup()</code>. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. * @see #startGroup 
public	TokenNamepublic	
void	TokenNamevoid	
pcdata	TokenNameIdentifier	 pcdata
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * A referenced element in a mixed or children content model. * * @param elementName The name of the referenced element. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 A referenced element in a mixed or children content model. * @param elementName The name of the referenced element. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
element	TokenNameIdentifier	 element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elementName	TokenNameIdentifier	 element Name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The separator between choices or sequences of a mixed or children * content model. * * @param separator The type of children separator. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. * * @see #SEPARATOR_CHOICE * @see #SEPARATOR_SEQUENCE */	TokenNameCOMMENT_JAVADOC	 The separator between choices or sequences of a mixed or children content model. * @param separator The type of children separator. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. * @see #SEPARATOR_CHOICE @see #SEPARATOR_SEQUENCE 
public	TokenNamepublic	
void	TokenNamevoid	
separator	TokenNameIdentifier	 separator
(	TokenNameLPAREN	
short	TokenNameshort	
separator	TokenNameIdentifier	 separator
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The occurrence count for a child in a children content model or * for the mixed content model group. * * @param occurrence The occurrence count for the last element * or group. * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. * * @see #OCCURS_ZERO_OR_ONE * @see #OCCURS_ZERO_OR_MORE * @see #OCCURS_ONE_OR_MORE */	TokenNameCOMMENT_JAVADOC	 The occurrence count for a child in a children content model or for the mixed content model group. * @param occurrence The occurrence count for the last element or group. @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. * @see #OCCURS_ZERO_OR_ONE @see #OCCURS_ZERO_OR_MORE @see #OCCURS_ONE_OR_MORE 
public	TokenNamepublic	
void	TokenNamevoid	
occurrence	TokenNameIdentifier	 occurrence
(	TokenNameLPAREN	
short	TokenNameshort	
occurrence	TokenNameIdentifier	 occurrence
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The end of a group for mixed or children content models. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of a group for mixed or children content models. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endGroup	TokenNameIdentifier	 end Group
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The end of a content model. * * @param augmentations Additional information that may include infoset * augmentations. * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 The end of a content model. * @param augmentations Additional information that may include infoset augmentations. * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endContentModel	TokenNameIdentifier	 end Content Model
(	TokenNameLPAREN	
Augmentations	TokenNameIdentifier	 Augmentations
augmentations	TokenNameIdentifier	 augmentations
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
// set content model source 	TokenNameCOMMENT_LINE	set content model source 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDContentModelSource	TokenNameIdentifier	 set DTD Content Model Source
(	TokenNameLPAREN	
XMLDTDContentModelSource	TokenNameIdentifier	 XMLDTD Content Model Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get content model source 	TokenNameCOMMENT_LINE	get content model source 
public	TokenNamepublic	
XMLDTDContentModelSource	TokenNameIdentifier	 XMLDTD Content Model Source
getDTDContentModelSource	TokenNameIdentifier	 get DTD Content Model Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface XMLDTDContentModelHandler 	TokenNameCOMMENT_LINE	interface XMLDTDContentModelHandler 
