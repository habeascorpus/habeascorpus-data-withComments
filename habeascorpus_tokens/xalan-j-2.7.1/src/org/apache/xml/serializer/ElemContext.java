/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemContext.java 468654 2006-10-28 07:09:23Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemContext.java 468654 2006-10-28 07:09:23Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
;	TokenNameSEMICOLON	
/** * This class is a stack frame that consists of * information about the element currently being processed * by a serializer. Consider this example: * <pre> * <A> * <B1> * </B1> * <B2> * </B2> * <A> * </pre> * * A stack frame will be pushed for "A" at depth 1, * then another one for "B1" at depth 2. * Then "B1" stackframe is popped. When the stack frame for "B2" is * pushed, this implementation re-uses the old stack fram object used * by "B1" to be efficient at not creating too many of these object. * * This is by no means a public class, and neither are its fields or methods, * they are all helper fields for a serializer. * * The purpose of this class is to be more consistent with pushing information * when a new element is being serialized and more quickly restoring the old * information about the parent element with a simple pop() when the * child element is done. Previously there was some redundant and error-prone * calculations going on to retore information. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class is a stack frame that consists of information about the element currently being processed by a serializer. Consider this example: <pre> <A> <B1> </B1> <B2> </B2> <A> </pre> * A stack frame will be pushed for "A" at depth 1, then another one for "B1" at depth 2. Then "B1" stackframe is popped. When the stack frame for "B2" is pushed, this implementation re-uses the old stack fram object used by "B1" to be efficient at not creating too many of these object. * This is by no means a public class, and neither are its fields or methods, they are all helper fields for a serializer. * The purpose of this class is to be more consistent with pushing information when a new element is being serialized and more quickly restoring the old information about the parent element with a simple pop() when the child element is done. Previously there was some redundant and error-prone calculations going on to retore information. * @xsl.usage internal 
final	TokenNamefinal	
class	TokenNameclass	
ElemContext	TokenNameIdentifier	 Elem Context
{	TokenNameLBRACE	
// Fields that form the context of the element 	TokenNameCOMMENT_LINE	Fields that form the context of the element 
/** * The nesting depth of the element inside other elements. */	TokenNameCOMMENT_JAVADOC	 The nesting depth of the element inside other elements. 
final	TokenNamefinal	
int	TokenNameint	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
;	TokenNameSEMICOLON	
/** HTML field, the element description of the HTML element */	TokenNameCOMMENT_JAVADOC	 HTML field, the element description of the HTML element 
ElemDesc	TokenNameIdentifier	 Elem Desc
m_elementDesc	TokenNameIdentifier	 m element Desc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The local name of the element. */	TokenNameCOMMENT_JAVADOC	 The local name of the element. 
String	TokenNameIdentifier	 String
m_elementLocalName	TokenNameIdentifier	 m element Local Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The fully qualified name of the element (with prefix, if any). */	TokenNameCOMMENT_JAVADOC	 The fully qualified name of the element (with prefix, if any). 
String	TokenNameIdentifier	 String
m_elementName	TokenNameIdentifier	 m element Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The URI of the element. * If this value is null it means that the URI is not yet determined * for the element. Valid values are the empty string "", meaning * that it is in no namespace, or a string of non-zero length. */	TokenNameCOMMENT_JAVADOC	 The URI of the element. If this value is null it means that the URI is not yet determined for the element. Valid values are the empty string "", meaning that it is in no namespace, or a string of non-zero length. 
String	TokenNameIdentifier	 String
m_elementURI	TokenNameIdentifier	 m element URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** If the element is in the cdata-section-names list * then the value is true. If it is true the text children of the element * should be output in CDATA section blocks. */	TokenNameCOMMENT_JAVADOC	 If the element is in the cdata-section-names list then the value is true. If it is true the text children of the element should be output in CDATA section blocks. 
boolean	TokenNameboolean	
m_isCdataSection	TokenNameIdentifier	 m is Cdata Section
;	TokenNameSEMICOLON	
/** True if the current element has output escaping disabled. * This is true for SCRIPT and STYLE elements. */	TokenNameCOMMENT_JAVADOC	 True if the current element has output escaping disabled. This is true for SCRIPT and STYLE elements. 
boolean	TokenNameboolean	
m_isRaw	TokenNameIdentifier	 m is Raw
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The next element "stack frame". This value will only be * set once as deeper stack frames are not deleted when popped off, * but are rather re-used when a push is required. * * This makes for very fast pushing and popping of stack frames * because very few stack frame objects are ever created, they are * mostly re-used. This re-use saves object creation but it also means * that connections between the frames via m_next and m_prev * never changes either. Just the contents of the frames change * as they are re-used. Only the reference to the current stack frame, which * is held by the serializer is changed via a quick pop() or push(). */	TokenNameCOMMENT_JAVADOC	 The next element "stack frame". This value will only be set once as deeper stack frames are not deleted when popped off, but are rather re-used when a push is required. * This makes for very fast pushing and popping of stack frames because very few stack frame objects are ever created, they are mostly re-used. This re-use saves object creation but it also means that connections between the frames via m_next and m_prev never changes either. Just the contents of the frames change as they are re-used. Only the reference to the current stack frame, which is held by the serializer is changed via a quick pop() or push(). 
private	TokenNameprivate	
ElemContext	TokenNameIdentifier	 Elem Context
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
/** The previous element "stack frame". */	TokenNameCOMMENT_JAVADOC	 The previous element "stack frame". 
final	TokenNamefinal	
ElemContext	TokenNameIdentifier	 Elem Context
m_prev	TokenNameIdentifier	 m prev
;	TokenNameSEMICOLON	
/** * Set to true when a start tag is started, or open, but not all the * attributes or namespace information is yet collected. */	TokenNameCOMMENT_JAVADOC	 Set to true when a start tag is started, or open, but not all the attributes or namespace information is yet collected. 
boolean	TokenNameboolean	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructor to create the root of the element contexts. * */	TokenNameCOMMENT_JAVADOC	 Constructor to create the root of the element contexts. 
ElemContext	TokenNameIdentifier	 Elem Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this assignment means can never pop this context off 	TokenNameCOMMENT_LINE	this assignment means can never pop this context off 
m_prev	TokenNameIdentifier	 m prev
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// depth 0 because it doesn't correspond to any element 	TokenNameCOMMENT_LINE	depth 0 because it doesn't correspond to any element 
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor to create the "stack frame" for a given element depth. * * This implementation will re-use the context at each depth. If * a documents deepest element depth is N then there will be (N+1) * such objects created, no more than that. * * @param previous The "stack frame" corresponding to the new * elements parent element. */	TokenNameCOMMENT_JAVADOC	 Constructor to create the "stack frame" for a given element depth. * This implementation will re-use the context at each depth. If a documents deepest element depth is N then there will be (N+1) such objects created, no more than that. * @param previous The "stack frame" corresponding to the new elements parent element. 
private	TokenNameprivate	
ElemContext	TokenNameIdentifier	 Elem Context
(	TokenNameLPAREN	
final	TokenNamefinal	
ElemContext	TokenNameIdentifier	 Elem Context
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prev	TokenNameIdentifier	 m prev
=	TokenNameEQUAL	
previous	TokenNameIdentifier	 previous
;	TokenNameSEMICOLON	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
=	TokenNameEQUAL	
previous	TokenNameIdentifier	 previous
.	TokenNameDOT	
m_currentElemDepth	TokenNameIdentifier	 m current Elem Depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current "stack frame". * @return Returns the parent "stack frame" of the one popped. */	TokenNameCOMMENT_JAVADOC	 Pop the current "stack frame". @return Returns the parent "stack frame" of the one popped. 
final	TokenNamefinal	
ElemContext	TokenNameIdentifier	 Elem Context
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* a very simple pop. No clean up is done of the deeper * stack frame. All deeper stack frames are still attached * but dormant, just waiting to be re-used. */	TokenNameCOMMENT_BLOCK	 a very simple pop. No clean up is done of the deeper stack frame. All deeper stack frames are still attached but dormant, just waiting to be re-used. 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
m_prev	TokenNameIdentifier	 m prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method pushes an element "stack frame" * but with no initialization of values in that frame. * This method is used for optimization purposes, like when pushing * a stack frame for an HTML "IMG" tag which has no children and * the stack frame will almost immediately be popped. */	TokenNameCOMMENT_JAVADOC	 This method pushes an element "stack frame" but with no initialization of values in that frame. This method is used for optimization purposes, like when pushing a stack frame for an HTML "IMG" tag which has no children and the stack frame will almost immediately be popped. 
final	TokenNamefinal	
ElemContext	TokenNameIdentifier	 Elem Context
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemContext	TokenNameIdentifier	 Elem Context
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* We have never been at this depth yet, and there is no * stack frame to re-use, so we now make a new one. */	TokenNameCOMMENT_BLOCK	 We have never been at this depth yet, and there is no stack frame to re-use, so we now make a new one. 
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
new	TokenNamenew	
ElemContext	TokenNameIdentifier	 Elem Context
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * We shouldn't need to set this true because we should just * be pushing a dummy stack frame that will be instantly popped. * Yet we need to be ready in case this element does have * unexpected children. */	TokenNameCOMMENT_BLOCK	 We shouldn't need to set this true because we should just be pushing a dummy stack frame that will be instantly popped. Yet we need to be ready in case this element does have unexpected children. 
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push an element context on the stack. This context keeps track of * information gathered about the element. * @param uri The URI for the namespace for the element name, * can be null if it is not yet known. * @param localName The local name of the element (no prefix), * can be null. * @param qName The qualified name (with prefix, if any) * of the element, this parameter is required. */	TokenNameCOMMENT_JAVADOC	 Push an element context on the stack. This context keeps track of information gathered about the element. @param uri The URI for the namespace for the element name, can be null if it is not yet known. @param localName The local name of the element (no prefix), can be null. @param qName The qualified name (with prefix, if any) of the element, this parameter is required. 
final	TokenNamefinal	
ElemContext	TokenNameIdentifier	 Elem Context
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemContext	TokenNameIdentifier	 Elem Context
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frame	TokenNameIdentifier	 frame
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* We have never been at this depth yet, and there is no * stack frame to re-use, so we now make a new one. */	TokenNameCOMMENT_BLOCK	 We have never been at this depth yet, and there is no stack frame to re-use, so we now make a new one. 
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
new	TokenNamenew	
ElemContext	TokenNameIdentifier	 Elem Context
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Initialize, or reset values in the new or re-used stack frame. 	TokenNameCOMMENT_LINE	Initialize, or reset values in the new or re-used stack frame. 
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
m_elementName	TokenNameIdentifier	 m element Name
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
m_elementLocalName	TokenNameIdentifier	 m element Local Name
=	TokenNameEQUAL	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
m_elementURI	TokenNameIdentifier	 m element URI
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
m_isCdataSection	TokenNameIdentifier	 m is Cdata Section
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
m_startTagOpen	TokenNameIdentifier	 m start Tag Open
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// is_Raw is already set in the HTML startElement() method 	TokenNameCOMMENT_LINE	is_Raw is already set in the HTML startElement() method 
// frame.m_isRaw = false; 	TokenNameCOMMENT_LINE	frame.m_isRaw = false; 
return	TokenNamereturn	
frame	TokenNameIdentifier	 frame
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
