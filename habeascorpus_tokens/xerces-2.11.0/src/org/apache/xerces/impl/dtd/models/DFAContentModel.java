/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
models	TokenNameIdentifier	 models
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
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
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
/** * DFAContentModel is the derivative of ContentModel that does * all of the non-trivial element content validation. This class does * the conversion from the regular expression to the DFA that * it then uses in its validation algorithm. * <p> * <b>Note:</b> Upstream work insures that this class will never see * a content model with PCDATA in it. Any model with PCDATA is 'mixed' * and is handled via the MixedContentModel class since mixed models * are very constrained in form and easily handled via a special case. * This also makes implementation of this class much easier. * * @xerces.internal * * @version $Id: DFAContentModel.java 572057 2007-09-02 18:03:20Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 DFAContentModel is the derivative of ContentModel that does all of the non-trivial element content validation. This class does the conversion from the regular expression to the DFA that it then uses in its validation algorithm. <p> <b>Note:</b> Upstream work insures that this class will never see a content model with PCDATA in it. Any model with PCDATA is 'mixed' and is handled via the MixedContentModel class since mixed models are very constrained in form and easily handled via a special case. This also makes implementation of this class much easier. * @xerces.internal * @version $Id: DFAContentModel.java 572057 2007-09-02 18:03:20Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
DFAContentModel	TokenNameIdentifier	 DFA Content Model
implements	TokenNameimplements	
ContentModelValidator	TokenNameIdentifier	 Content Model Validator
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// special strings 	TokenNameCOMMENT_LINE	special strings 
/** Epsilon string. */	TokenNameCOMMENT_JAVADOC	 Epsilon string. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fEpsilonString	TokenNameIdentifier	 f Epsilon String
=	TokenNameEQUAL	
"<<CMNODE_EPSILON>>"	TokenNameStringLiteral	<<CMNODE_EPSILON>>
;	TokenNameSEMICOLON	
/** End-of-content string. */	TokenNameCOMMENT_JAVADOC	 End-of-content string. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fEOCString	TokenNameIdentifier	 f EOC String
=	TokenNameEQUAL	
"<<CMNODE_EOC>>"	TokenNameStringLiteral	<<CMNODE_EOC>>
;	TokenNameSEMICOLON	
/** initializing static members **/	TokenNameCOMMENT_JAVADOC	 initializing static members *
static	TokenNamestatic	
{	TokenNameLBRACE	
fEpsilonString	TokenNameIdentifier	 f Epsilon String
=	TokenNameEQUAL	
fEpsilonString	TokenNameIdentifier	 f Epsilon String
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEOCString	TokenNameIdentifier	 f EOC String
=	TokenNameEQUAL	
fEOCString	TokenNameIdentifier	 f EOC String
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// debugging 	TokenNameCOMMENT_LINE	debugging 
/** Set to true to debug content model validation. */	TokenNameCOMMENT_JAVADOC	 Set to true to debug content model validation. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_VALIDATE_CONTENT	TokenNameIdentifier	 DEBUG  VALIDATE  CONTENT
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/* this is the EquivClassComparator object */	TokenNameCOMMENT_BLOCK	 this is the EquivClassComparator object 
//private EquivClassComparator comparator = null; 	TokenNameCOMMENT_LINE	private EquivClassComparator comparator = null; 
/** * This is the map of unique input symbol elements to indices into * each state's per-input symbol transition table entry. This is part * of the built DFA information that must be kept around to do the * actual validation. */	TokenNameCOMMENT_JAVADOC	 This is the map of unique input symbol elements to indices into each state's per-input symbol transition table entry. This is part of the built DFA information that must be kept around to do the actual validation. 
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * This is a map of whether the element map contains information * related to ANY models. */	TokenNameCOMMENT_JAVADOC	 This is a map of whether the element map contains information related to ANY models. 
private	TokenNameprivate	
int	TokenNameint	
fElemMapType	TokenNameIdentifier	 f Elem Map Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** The element map size. */	TokenNameCOMMENT_JAVADOC	 The element map size. 
private	TokenNameprivate	
int	TokenNameint	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Boolean to distinguish Schema Mixed Content */	TokenNameCOMMENT_JAVADOC	 Boolean to distinguish Schema Mixed Content 
private	TokenNameprivate	
boolean	TokenNameboolean	
fMixed	TokenNameIdentifier	 f Mixed
;	TokenNameSEMICOLON	
/** * The NFA position of the special EOC (end of content) node. This * is saved away since it's used during the DFA build. */	TokenNameCOMMENT_JAVADOC	 The NFA position of the special EOC (end of content) node. This is saved away since it's used during the DFA build. 
private	TokenNameprivate	
int	TokenNameint	
fEOCPos	TokenNameIdentifier	 f EOC Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This is an array of booleans, one per state (there are * fTransTableSize states in the DFA) that indicates whether that * state is a final state. */	TokenNameCOMMENT_JAVADOC	 This is an array of booleans, one per state (there are fTransTableSize states in the DFA) that indicates whether that state is a final state. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fFinalStateFlags	TokenNameIdentifier	 f Final State Flags
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The list of follow positions for each NFA position (i.e. for each * non-epsilon leaf node.) This is only used during the building of * the DFA, and is let go afterwards. */	TokenNameCOMMENT_JAVADOC	 The list of follow positions for each NFA position (i.e. for each non-epsilon leaf node.) This is only used during the building of the DFA, and is let go afterwards. 
private	TokenNameprivate	
CMStateSet	TokenNameIdentifier	 CM State Set
fFollowList	TokenNameIdentifier	 f Follow List
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * This is the head node of our intermediate representation. It is * only non-null during the building of the DFA (just so that it * does not have to be passed all around.) Once the DFA is built, * this is no longer required so its nulled out. */	TokenNameCOMMENT_JAVADOC	 This is the head node of our intermediate representation. It is only non-null during the building of the DFA (just so that it does not have to be passed all around.) Once the DFA is built, this is no longer required so its nulled out. 
private	TokenNameprivate	
CMNode	TokenNameIdentifier	 CM Node
fHeadNode	TokenNameIdentifier	 f Head Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The count of leaf nodes. This is an important number that set some * limits on the sizes of data structures in the DFA process. */	TokenNameCOMMENT_JAVADOC	 The count of leaf nodes. This is an important number that set some limits on the sizes of data structures in the DFA process. 
private	TokenNameprivate	
int	TokenNameint	
fLeafCount	TokenNameIdentifier	 f Leaf Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * An array of non-epsilon leaf nodes, which is used during the DFA * build operation, then dropped. */	TokenNameCOMMENT_JAVADOC	 An array of non-epsilon leaf nodes, which is used during the DFA build operation, then dropped. 
private	TokenNameprivate	
CMLeaf	TokenNameIdentifier	 CM Leaf
fLeafList	TokenNameIdentifier	 f Leaf List
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Array mapping ANY types to the leaf list. */	TokenNameCOMMENT_JAVADOC	 Array mapping ANY types to the leaf list. 
private	TokenNameprivate	
int	TokenNameint	
fLeafListType	TokenNameIdentifier	 f Leaf List Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//private ContentLeafNameTypeVector fLeafNameTypeVector = null; 	TokenNameCOMMENT_LINE	private ContentLeafNameTypeVector fLeafNameTypeVector = null; 
/** * The string pool of our parser session. This is set during construction * and kept around. */	TokenNameCOMMENT_JAVADOC	 The string pool of our parser session. This is set during construction and kept around. 
//private StringPool fStringPool = null; 	TokenNameCOMMENT_LINE	private StringPool fStringPool = null; 
/** * This is the transition table that is the main by product of all * of the effort here. It is an array of arrays of ints. The first * dimension is the number of states we end up with in the DFA. The * second dimensions is the number of unique elements in the content * model (fElemMapSize). Each entry in the second dimension indicates * the new state given that input for the first dimension's start * state. * <p> * The fElemMap array handles mapping from element indexes to * positions in the second dimension of the transition table. */	TokenNameCOMMENT_JAVADOC	 This is the transition table that is the main by product of all of the effort here. It is an array of arrays of ints. The first dimension is the number of states we end up with in the DFA. The second dimensions is the number of unique elements in the content model (fElemMapSize). Each entry in the second dimension indicates the new state given that input for the first dimension's start state. <p> The fElemMap array handles mapping from element indexes to positions in the second dimension of the transition table. 
private	TokenNameprivate	
int	TokenNameint	
fTransTable	TokenNameIdentifier	 f Trans Table
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The number of valid entries in the transition table, and in the other * related tables such as fFinalStateFlags. */	TokenNameCOMMENT_JAVADOC	 The number of valid entries in the transition table, and in the other related tables such as fFinalStateFlags. 
private	TokenNameprivate	
int	TokenNameint	
fTransTableSize	TokenNameIdentifier	 f Trans Table Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Flag that indicates that even though we have a "complicated" * content model, it is valid to have no content. In other words, * all parts of the content model are optional. For example: * <pre> * &lt;!ELEMENT AllOptional (Optional*,NotRequired?)&gt; * </pre> */	TokenNameCOMMENT_JAVADOC	 Flag that indicates that even though we have a "complicated" content model, it is valid to have no content. In other words, all parts of the content model are optional. For example: <pre> &lt;!ELEMENT AllOptional (Optional*,NotRequired?)&gt; </pre> 
private	TokenNameprivate	
boolean	TokenNameboolean	
fEmptyContentIsValid	TokenNameIdentifier	 f Empty Content Is Valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// temp variables 	TokenNameCOMMENT_LINE	temp variables 
/** Temporary qualified name. */	TokenNameCOMMENT_JAVADOC	 Temporary qualified name. 
private	TokenNameprivate	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
fQName	TokenNameIdentifier	 f Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a DFA content model. * * @param syntaxTree The syntax tree of the content model. * @param leafCount The number of leaves. * @param mixed * */	TokenNameCOMMENT_JAVADOC	 Constructs a DFA content model. * @param syntaxTree The syntax tree of the content model. @param leafCount The number of leaves. @param mixed 
public	TokenNamepublic	
DFAContentModel	TokenNameIdentifier	 DFA Content Model
(	TokenNameLPAREN	
CMNode	TokenNameIdentifier	 CM Node
syntaxTree	TokenNameIdentifier	 syntax Tree
,	TokenNameCOMMA	
int	TokenNameint	
leafCount	TokenNameIdentifier	 leaf Count
,	TokenNameCOMMA	
boolean	TokenNameboolean	
mixed	TokenNameIdentifier	 mixed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Store away our index and pools in members 	TokenNameCOMMENT_LINE	Store away our index and pools in members 
//fStringPool = stringPool; 	TokenNameCOMMENT_LINE	fStringPool = stringPool; 
fLeafCount	TokenNameIdentifier	 f Leaf Count
=	TokenNameEQUAL	
leafCount	TokenNameIdentifier	 leaf Count
;	TokenNameSEMICOLON	
// this is for Schema Mixed Content 	TokenNameCOMMENT_LINE	this is for Schema Mixed Content 
fMixed	TokenNameIdentifier	 f Mixed
=	TokenNameEQUAL	
mixed	TokenNameIdentifier	 mixed
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Ok, so lets grind through the building of the DFA. This method 	TokenNameCOMMENT_LINE	Ok, so lets grind through the building of the DFA. This method 
// handles the high level logic of the algorithm, but it uses a 	TokenNameCOMMENT_LINE	handles the high level logic of the algorithm, but it uses a 
// number of helper classes to do its thing. 	TokenNameCOMMENT_LINE	number of helper classes to do its thing. 
// 	TokenNameCOMMENT_LINE	 
// In order to avoid having hundreds of references to the error and 	TokenNameCOMMENT_LINE	In order to avoid having hundreds of references to the error and 
// string handlers around, this guy and all of his helper classes 	TokenNameCOMMENT_LINE	string handlers around, this guy and all of his helper classes 
// just throw a simple exception and we then pass it along. 	TokenNameCOMMENT_LINE	just throw a simple exception and we then pass it along. 
// 	TokenNameCOMMENT_LINE	 
buildDFA	TokenNameIdentifier	 build DFA
(	TokenNameLPAREN	
syntaxTree	TokenNameIdentifier	 syntax Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// ContentModelValidator methods 	TokenNameCOMMENT_LINE	ContentModelValidator methods 
// 	TokenNameCOMMENT_LINE	 
/** * Check that the specified content is valid according to this * content model. This method can also be called to do 'what if' * testing of content models just to see if they would be valid. * <p> * A value of -1 in the children array indicates a PCDATA node. All other * indexes will be positive and represent child elements. The count can be * zero, since some elements have the EMPTY content model and that must be * confirmed. * * @param children The children of this element. Each integer is an index within * the <code>StringPool</code> of the child element name. An index * of -1 is used to indicate an occurrence of non-whitespace character * data. * @param offset Offset into the array where the children starts. * @param length The number of entries in the <code>children</code> array. * * @return The value -1 if fully valid, else the 0 based index of the child * that first failed. If the value returned is equal to the number * of children, then the specified children are valid but additional * content is required to reach a valid ending state. * */	TokenNameCOMMENT_JAVADOC	 Check that the specified content is valid according to this content model. This method can also be called to do 'what if' testing of content models just to see if they would be valid. <p> A value of -1 in the children array indicates a PCDATA node. All other indexes will be positive and represent child elements. The count can be zero, since some elements have the EMPTY content model and that must be confirmed. * @param children The children of this element. Each integer is an index within the <code>StringPool</code> of the child element name. An index of -1 is used to indicate an occurrence of non-whitespace character data. @param offset Offset into the array where the children starts. @param length The number of entries in the <code>children</code> array. * @return The value -1 if fully valid, else the 0 based index of the child that first failed. If the value returned is equal to the number of children, then the specified children are valid but additional content is required to reach a valid ending state. 
public	TokenNamepublic	
int	TokenNameint	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_VALIDATE_CONTENT	TokenNameIdentifier	 DEBUG  VALIDATE  CONTENT
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"DFAContentModel#validateContent"	TokenNameStringLiteral	DFAContentModel#validateContent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// A DFA content model must *always* have at least 1 child 	TokenNameCOMMENT_LINE	A DFA content model must *always* have at least 1 child 
// so a failure is given if no children present. 	TokenNameCOMMENT_LINE	so a failure is given if no children present. 
// 	TokenNameCOMMENT_LINE	 
// Defect 782: This is an incorrect statement because a DFA 	TokenNameCOMMENT_LINE	Defect 782: This is an incorrect statement because a DFA 
// content model is also used for constructions such as: 	TokenNameCOMMENT_LINE	content model is also used for constructions such as: 
// 	TokenNameCOMMENT_LINE	 
// (Optional*,NotRequired?) 	TokenNameCOMMENT_LINE	(Optional*,NotRequired?) 
// 	TokenNameCOMMENT_LINE	 
// where a perfectly valid content would be NO CHILDREN. 	TokenNameCOMMENT_LINE	where a perfectly valid content would be NO CHILDREN. 
// Therefore, if there are no children, we must check to 	TokenNameCOMMENT_LINE	Therefore, if there are no children, we must check to 
// see if the CMNODE_EOC marker is a valid start state! -Ac 	TokenNameCOMMENT_LINE	see if the CMNODE_EOC marker is a valid start state! -Ac 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_VALIDATE_CONTENT	TokenNameIdentifier	 DEBUG  VALIDATE  CONTENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"!!! no children"	TokenNameStringLiteral	!!! no children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"elemMap="	TokenNameStringLiteral	elemMap=
+	TokenNamePLUS	
fElemMap	TokenNameIdentifier	 f Elem Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fElemMap	TokenNameIdentifier	 f Elem Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"fElemMap["	TokenNameStringLiteral	fElemMap[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"]="	TokenNameStringLiteral	]=
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
localpart	TokenNameIdentifier	 localpart
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
localpart	TokenNameIdentifier	 localpart
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"EOCIndex="	TokenNameStringLiteral	EOCIndex=
+	TokenNamePLUS	
fEOCString	TokenNameIdentifier	 f EOC String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fEmptyContentIsValid	TokenNameIdentifier	 f Empty Content Is Valid
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if child count == 0 	TokenNameCOMMENT_LINE	if child count == 0 
// 	TokenNameCOMMENT_LINE	 
// Lets loop through the children in the array and move our way 	TokenNameCOMMENT_LINE	Lets loop through the children in the array and move our way 
// through the states. Note that we use the fElemMap array to map 	TokenNameCOMMENT_LINE	through the states. Note that we use the fElemMap array to map 
// an element index to a state index. 	TokenNameCOMMENT_LINE	an element index to a state index. 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
curState	TokenNameIdentifier	 cur State
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
childIndex	TokenNameIdentifier	 child Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
childIndex	TokenNameIdentifier	 child Index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
childIndex	TokenNameIdentifier	 child Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the current element index out 	TokenNameCOMMENT_LINE	Get the current element index out 
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
curElem	TokenNameIdentifier	 cur Elem
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
childIndex	TokenNameIdentifier	 child Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// ignore mixed text 	TokenNameCOMMENT_LINE	ignore mixed text 
if	TokenNameif	
(	TokenNameLPAREN	
fMixed	TokenNameIdentifier	 f Mixed
&&	TokenNameAND_AND	
curElem	TokenNameIdentifier	 cur Elem
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Look up this child in our element map 	TokenNameCOMMENT_LINE	Look up this child in our element map 
int	TokenNameint	
elemIndex	TokenNameIdentifier	 elem Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
elemIndex	TokenNameIdentifier	 elem Index
<	TokenNameLESS	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
;	TokenNameSEMICOLON	
elemIndex	TokenNameIdentifier	 elem Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
fElemMapType	TokenNameIdentifier	 f Elem Map Type
[	TokenNameLBRACKET	
elemIndex	TokenNameIdentifier	 elem Index
]	TokenNameRBRACKET	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("fElemMap["+elemIndex+"]: "+fElemMap[elemIndex]); 	TokenNameCOMMENT_LINE	System.out.println("fElemMap["+elemIndex+"]: "+fElemMap[elemIndex]); 
if	TokenNameif	
(	TokenNameLPAREN	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
elemIndex	TokenNameIdentifier	 elem Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
==	TokenNameEQUAL_EQUAL	
curElem	TokenNameIdentifier	 cur Elem
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY	TokenNameIdentifier	 CONTENTSPECNODE  ANY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
elemIndex	TokenNameIdentifier	 elem Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
curElem	TokenNameIdentifier	 cur Elem
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY_LOCAL	TokenNameIdentifier	 CONTENTSPECNODE  ANY  LOCAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curElem	TokenNameIdentifier	 cur Elem
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY_OTHER	TokenNameIdentifier	 CONTENTSPECNODE  ANY  OTHER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
elemIndex	TokenNameIdentifier	 elem Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
curElem	TokenNameIdentifier	 cur Elem
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we didn't find it, then obviously not valid 	TokenNameCOMMENT_LINE	If we didn't find it, then obviously not valid 
if	TokenNameif	
(	TokenNameLPAREN	
elemIndex	TokenNameIdentifier	 elem Index
==	TokenNameEQUAL_EQUAL	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_VALIDATE_CONTENT	TokenNameIdentifier	 DEBUG  VALIDATE  CONTENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"!!! didn't find it"	TokenNameStringLiteral	!!! didn't find it
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"curElem : "	TokenNameStringLiteral	curElem : 
+	TokenNamePLUS	
curElem	TokenNameIdentifier	 cur Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"fElemMap["	TokenNameStringLiteral	fElemMap[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"] = "	TokenNameStringLiteral	] = 
+	TokenNamePLUS	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"fElemMapType["	TokenNameStringLiteral	fElemMapType[
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
"] = "	TokenNameStringLiteral	] = 
+	TokenNamePLUS	
fElemMapType	TokenNameIdentifier	 f Elem Map Type
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
childIndex	TokenNameIdentifier	 child Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Look up the next state for this input symbol when in the 	TokenNameCOMMENT_LINE	Look up the next state for this input symbol when in the 
// current state. 	TokenNameCOMMENT_LINE	current state. 
// 	TokenNameCOMMENT_LINE	 
curState	TokenNameIdentifier	 cur State
=	TokenNameEQUAL	
fTransTable	TokenNameIdentifier	 f Trans Table
[	TokenNameLBRACKET	
curState	TokenNameIdentifier	 cur State
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
elemIndex	TokenNameIdentifier	 elem Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// If its not a legal transition, then invalid 	TokenNameCOMMENT_LINE	If its not a legal transition, then invalid 
if	TokenNameif	
(	TokenNameLPAREN	
curState	TokenNameIdentifier	 cur State
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_VALIDATE_CONTENT	TokenNameIdentifier	 DEBUG  VALIDATE  CONTENT
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"!!! not a legal transition"	TokenNameStringLiteral	!!! not a legal transition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
childIndex	TokenNameIdentifier	 child Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// We transitioned all the way through the input list. However, that 	TokenNameCOMMENT_LINE	We transitioned all the way through the input list. However, that 
// does not mean that we ended in a final state. So check whether 	TokenNameCOMMENT_LINE	does not mean that we ended in a final state. So check whether 
// our ending state is a final state. 	TokenNameCOMMENT_LINE	our ending state is a final state. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_VALIDATE_CONTENT	TokenNameIdentifier	 DEBUG  VALIDATE  CONTENT
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"curState="	TokenNameStringLiteral	curState=
+	TokenNamePLUS	
curState	TokenNameIdentifier	 cur State
+	TokenNamePLUS	
", childCount="	TokenNameStringLiteral	, childCount=
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fFinalStateFlags	TokenNameIdentifier	 f Final State Flags
[	TokenNameLBRACKET	
curState	TokenNameIdentifier	 cur State
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// success! 	TokenNameCOMMENT_LINE	success! 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// validate 	TokenNameCOMMENT_LINE	validate 
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** * Builds the internal DFA transition table from the given syntax tree. * * @param syntaxTree The syntax tree. * * @exception CMException Thrown if DFA cannot be built. */	TokenNameCOMMENT_JAVADOC	 Builds the internal DFA transition table from the given syntax tree. * @param syntaxTree The syntax tree. * @exception CMException Thrown if DFA cannot be built. 
private	TokenNameprivate	
void	TokenNamevoid	
buildDFA	TokenNameIdentifier	 build DFA
(	TokenNameLPAREN	
CMNode	TokenNameIdentifier	 CM Node
syntaxTree	TokenNameIdentifier	 syntax Tree
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// The first step we need to take is to rewrite the content model 	TokenNameCOMMENT_LINE	The first step we need to take is to rewrite the content model 
// using our CMNode objects, and in the process get rid of any 	TokenNameCOMMENT_LINE	using our CMNode objects, and in the process get rid of any 
// repetition short cuts, converting them into '*' style repetitions 	TokenNameCOMMENT_LINE	repetition short cuts, converting them into '*' style repetitions 
// or getting rid of repetitions altogether. 	TokenNameCOMMENT_LINE	or getting rid of repetitions altogether. 
// 	TokenNameCOMMENT_LINE	 
// The conversions done are: 	TokenNameCOMMENT_LINE	The conversions done are: 
// 	TokenNameCOMMENT_LINE	 
// x+ -> (x|x*) 	TokenNameCOMMENT_LINE	x+ -> (x|x*) 
// x? -> (x|epsilon) 	TokenNameCOMMENT_LINE	x? -> (x|epsilon) 
// 	TokenNameCOMMENT_LINE	 
// This is a relatively complex scenario. What is happening is that 	TokenNameCOMMENT_LINE	This is a relatively complex scenario. What is happening is that 
// we create a top level binary node of which the special EOC value 	TokenNameCOMMENT_LINE	we create a top level binary node of which the special EOC value 
// is set as the right side node. The the left side is set to the 	TokenNameCOMMENT_LINE	is set as the right side node. The the left side is set to the 
// rewritten syntax tree. The source is the original content model 	TokenNameCOMMENT_LINE	rewritten syntax tree. The source is the original content model 
// info from the decl pool. The rewrite is done by buildSyntaxTree() 	TokenNameCOMMENT_LINE	info from the decl pool. The rewrite is done by buildSyntaxTree() 
// which recurses the decl pool's content of the element and builds 	TokenNameCOMMENT_LINE	which recurses the decl pool's content of the element and builds 
// a new tree in the process. 	TokenNameCOMMENT_LINE	a new tree in the process. 
// 	TokenNameCOMMENT_LINE	 
// Note that, during this operation, we set each non-epsilon leaf 	TokenNameCOMMENT_LINE	Note that, during this operation, we set each non-epsilon leaf 
// node's DFA state position and count the number of such leafs, which 	TokenNameCOMMENT_LINE	node's DFA state position and count the number of such leafs, which 
// is left in the fLeafCount member. 	TokenNameCOMMENT_LINE	is left in the fLeafCount member. 
// 	TokenNameCOMMENT_LINE	 
// The nodeTmp object is passed in just as a temp node to use during 	TokenNameCOMMENT_LINE	The nodeTmp object is passed in just as a temp node to use during 
// the recursion. Otherwise, we'd have to create a new node on every 	TokenNameCOMMENT_LINE	the recursion. Otherwise, we'd have to create a new node on every 
// level of recursion, which would be piggy in Java (as is everything 	TokenNameCOMMENT_LINE	level of recursion, which would be piggy in Java (as is everything 
// for that matter.) 	TokenNameCOMMENT_LINE	for that matter.) 
// 	TokenNameCOMMENT_LINE	 
/* MODIFIED (Jan, 2001) * * Use following rules. * nullable(x+) := nullable(x), first(x+) := first(x), last(x+) := last(x) * nullable(x?) := true, first(x?) := first(x), last(x?) := last(x) * * The same computation of follow as x* is applied to x+ * * The modification drastically reduces computation time of * "(a, (b, a+, (c, (b, a+)+, a+, (d, (c, (b, a+)+, a+)+, (b, a+)+, a+)+)+)+)+" */	TokenNameCOMMENT_BLOCK	 MODIFIED (Jan, 2001) * Use following rules. nullable(x+) := nullable(x), first(x+) := first(x), last(x+) := last(x) nullable(x?) := true, first(x?) := first(x), last(x?) := last(x) * The same computation of follow as x* is applied to x+ * The modification drastically reduces computation time of "(a, (b, a+, (c, (b, a+)+, a+, (d, (c, (b, a+)+, a+)+, (b, a+)+, a+)+)+)+)+" 
fQName	TokenNameIdentifier	 f Q Name
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
fEOCString	TokenNameIdentifier	 f EOC String
,	TokenNameCOMMA	
fEOCString	TokenNameIdentifier	 f EOC String
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CMLeaf	TokenNameIdentifier	 CM Leaf
nodeEOC	TokenNameIdentifier	 node EOC
=	TokenNameEQUAL	
new	TokenNamenew	
CMLeaf	TokenNameIdentifier	 CM Leaf
(	TokenNameLPAREN	
fQName	TokenNameIdentifier	 f Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fHeadNode	TokenNameIdentifier	 f Head Node
=	TokenNameEQUAL	
new	TokenNamenew	
CMBinOp	TokenNameIdentifier	 CM Bin Op
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
,	TokenNameCOMMA	
syntaxTree	TokenNameIdentifier	 syntax Tree
,	TokenNameCOMMA	
nodeEOC	TokenNameIdentifier	 node EOC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// And handle specially the EOC node, which also must be numbered 	TokenNameCOMMENT_LINE	And handle specially the EOC node, which also must be numbered 
// and counted as a non-epsilon leaf node. It could not be handled 	TokenNameCOMMENT_LINE	and counted as a non-epsilon leaf node. It could not be handled 
// in the above tree build because it was created before all that 	TokenNameCOMMENT_LINE	in the above tree build because it was created before all that 
// started. We save the EOC position since its used during the DFA 	TokenNameCOMMENT_LINE	started. We save the EOC position since its used during the DFA 
// building loop. 	TokenNameCOMMENT_LINE	building loop. 
// 	TokenNameCOMMENT_LINE	 
fEOCPos	TokenNameIdentifier	 f EOC Pos
=	TokenNameEQUAL	
fLeafCount	TokenNameIdentifier	 f Leaf Count
;	TokenNameSEMICOLON	
nodeEOC	TokenNameIdentifier	 node EOC
.	TokenNameDOT	
setPosition	TokenNameIdentifier	 set Position
(	TokenNameLPAREN	
fLeafCount	TokenNameIdentifier	 f Leaf Count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Ok, so now we have to iterate the new tree and do a little more 	TokenNameCOMMENT_LINE	Ok, so now we have to iterate the new tree and do a little more 
// work now that we know the leaf count. One thing we need to do is 	TokenNameCOMMENT_LINE	work now that we know the leaf count. One thing we need to do is 
// to calculate the first and last position sets of each node. This 	TokenNameCOMMENT_LINE	to calculate the first and last position sets of each node. This 
// is cached away in each of the nodes. 	TokenNameCOMMENT_LINE	is cached away in each of the nodes. 
// 	TokenNameCOMMENT_LINE	 
// Along the way we also set the leaf count in each node as the 	TokenNameCOMMENT_LINE	Along the way we also set the leaf count in each node as the 
// maximum state count. They must know this in order to create their 	TokenNameCOMMENT_LINE	maximum state count. They must know this in order to create their 
// first/last pos sets. 	TokenNameCOMMENT_LINE	first/last pos sets. 
// 	TokenNameCOMMENT_LINE	 
// We also need to build an array of references to the non-epsilon 	TokenNameCOMMENT_LINE	We also need to build an array of references to the non-epsilon 
// leaf nodes. Since we iterate it in the same way as before, this 	TokenNameCOMMENT_LINE	leaf nodes. Since we iterate it in the same way as before, this 
// will put them in the array according to their position values. 	TokenNameCOMMENT_LINE	will put them in the array according to their position values. 
// 	TokenNameCOMMENT_LINE	 
fLeafList	TokenNameIdentifier	 f Leaf List
=	TokenNameEQUAL	
new	TokenNamenew	
CMLeaf	TokenNameIdentifier	 CM Leaf
[	TokenNameLBRACKET	
fLeafCount	TokenNameIdentifier	 f Leaf Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fLeafListType	TokenNameIdentifier	 f Leaf List Type
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fLeafCount	TokenNameIdentifier	 f Leaf Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
postTreeBuildInit	TokenNameIdentifier	 post Tree Build Init
(	TokenNameLPAREN	
fHeadNode	TokenNameIdentifier	 f Head Node
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// And, moving onward... We now need to build the follow position 	TokenNameCOMMENT_LINE	And, moving onward... We now need to build the follow position 
// sets for all the nodes. So we allocate an array of state sets, 	TokenNameCOMMENT_LINE	sets for all the nodes. So we allocate an array of state sets, 
// one for each leaf node (i.e. each DFA position.) 	TokenNameCOMMENT_LINE	one for each leaf node (i.e. each DFA position.) 
// 	TokenNameCOMMENT_LINE	 
fFollowList	TokenNameIdentifier	 f Follow List
=	TokenNameEQUAL	
new	TokenNamenew	
CMStateSet	TokenNameIdentifier	 CM State Set
[	TokenNameLBRACKET	
fLeafCount	TokenNameIdentifier	 f Leaf Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fLeafCount	TokenNameIdentifier	 f Leaf Count
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
fFollowList	TokenNameIdentifier	 f Follow List
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
CMStateSet	TokenNameIdentifier	 CM State Set
(	TokenNameLPAREN	
fLeafCount	TokenNameIdentifier	 f Leaf Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calcFollowList	TokenNameIdentifier	 calc Follow List
(	TokenNameLPAREN	
fHeadNode	TokenNameIdentifier	 f Head Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// And finally the big push... Now we build the DFA using all the 	TokenNameCOMMENT_LINE	And finally the big push... Now we build the DFA using all the 
// states and the tree we've built up. First we set up the various 	TokenNameCOMMENT_LINE	states and the tree we've built up. First we set up the various 
// data structures we are going to use while we do this. 	TokenNameCOMMENT_LINE	data structures we are going to use while we do this. 
// 	TokenNameCOMMENT_LINE	 
// First of all we need an array of unique element names in our 	TokenNameCOMMENT_LINE	First of all we need an array of unique element names in our 
// content model. For each transition table entry, we need a set of 	TokenNameCOMMENT_LINE	content model. For each transition table entry, we need a set of 
// contiguous indices to represent the transitions for a particular 	TokenNameCOMMENT_LINE	contiguous indices to represent the transitions for a particular 
// input element. So we need to a zero based range of indexes that 	TokenNameCOMMENT_LINE	input element. So we need to a zero based range of indexes that 
// map to element types. This element map provides that mapping. 	TokenNameCOMMENT_LINE	map to element types. This element map provides that mapping. 
// 	TokenNameCOMMENT_LINE	 
fElemMap	TokenNameIdentifier	 f Elem Map
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
[	TokenNameLBRACKET	
fLeafCount	TokenNameIdentifier	 f Leaf Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fElemMapType	TokenNameIdentifier	 f Elem Map Type
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fLeafCount	TokenNameIdentifier	 f Leaf Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
outIndex	TokenNameIdentifier	 out Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
outIndex	TokenNameIdentifier	 out Index
<	TokenNameLESS	
fLeafCount	TokenNameIdentifier	 f Leaf Count
;	TokenNameSEMICOLON	
outIndex	TokenNameIdentifier	 out Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/**** if ( (fLeafListType[outIndex] & 0x0f) != 0 ) { if (fLeafNameTypeVector == null) { fLeafNameTypeVector = new ContentLeafNameTypeVector(); } } /****/	TokenNameCOMMENT_JAVADOC	** if ( (fLeafListType[outIndex] & 0x0f) != 0 ) { if (fLeafNameTypeVector == null) { fLeafNameTypeVector = new ContentLeafNameTypeVector(); } } /***
// Get the current leaf's element index 	TokenNameCOMMENT_LINE	Get the current leaf's element index 
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
fLeafList	TokenNameIdentifier	 f Leaf List
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// See if the current leaf node's element index is in the list 	TokenNameCOMMENT_LINE	See if the current leaf node's element index is in the list 
int	TokenNameint	
inIndex	TokenNameIdentifier	 in Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
inIndex	TokenNameIdentifier	 in Index
<	TokenNameLESS	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
;	TokenNameSEMICOLON	
inIndex	TokenNameIdentifier	 in Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
inIndex	TokenNameIdentifier	 in Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
==	TokenNameEQUAL_EQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If it was not in the list, then add it, if not the EOC node 	TokenNameCOMMENT_LINE	If it was not in the list, then add it, if not the EOC node 
if	TokenNameif	
(	TokenNameLPAREN	
inIndex	TokenNameIdentifier	 in Index
==	TokenNameEQUAL_EQUAL	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
]	TokenNameRBRACKET	
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fElemMapType	TokenNameIdentifier	 f Elem Map Type
[	TokenNameLBRACKET	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fLeafListType	TokenNameIdentifier	 f Leaf List Type
[	TokenNameLBRACKET	
outIndex	TokenNameIdentifier	 out Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// set up the fLeafNameTypeVector object if there is one. 	TokenNameCOMMENT_LINE	set up the fLeafNameTypeVector object if there is one. 
/***** if (fLeafNameTypeVector != null) { fLeafNameTypeVector.setValues(fElemMap, fElemMapType, fElemMapSize); } /*** * Optimization(Jan, 2001); We sort fLeafList according to * elemIndex which is *uniquely* associated to each leaf. * We are *assuming* that each element appears in at least one leaf. **/	TokenNameCOMMENT_JAVADOC	*** if (fLeafNameTypeVector != null) { fLeafNameTypeVector.setValues(fElemMap, fElemMapType, fElemMapSize); } /*** Optimization(Jan, 2001); We sort fLeafList according to elemIndex which is *uniquely* associated to each leaf. We are *assuming* that each element appears in at least one leaf. *
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fLeafSorter	TokenNameIdentifier	 f Leaf Sorter
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fLeafCount	TokenNameIdentifier	 f Leaf Count
+	TokenNamePLUS	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
fSortCount	TokenNameIdentifier	 f Sort Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
elemIndex	TokenNameIdentifier	 elem Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
elemIndex	TokenNameIdentifier	 elem Index
<	TokenNameLESS	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
;	TokenNameSEMICOLON	
elemIndex	TokenNameIdentifier	 elem Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
leafIndex	TokenNameIdentifier	 leaf Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
leafIndex	TokenNameIdentifier	 leaf Index
<	TokenNameLESS	
fLeafCount	TokenNameIdentifier	 f Leaf Count
;	TokenNameSEMICOLON	
leafIndex	TokenNameIdentifier	 leaf Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
leaf	TokenNameIdentifier	 leaf
=	TokenNameEQUAL	
fLeafList	TokenNameIdentifier	 f Leaf List
[	TokenNameLBRACKET	
leafIndex	TokenNameIdentifier	 leaf Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
fElemMap	TokenNameIdentifier	 f Elem Map
[	TokenNameLBRACKET	
elemIndex	TokenNameIdentifier	 elem Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
==	TokenNameEQUAL_EQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLeafSorter	TokenNameIdentifier	 f Leaf Sorter
[	TokenNameLBRACKET	
fSortCount	TokenNameIdentifier	 f Sort Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
leafIndex	TokenNameIdentifier	 leaf Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fLeafSorter	TokenNameIdentifier	 f Leaf Sorter
[	TokenNameLBRACKET	
fSortCount	TokenNameIdentifier	 f Sort Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
// 	TokenNameCOMMENT_LINE	 
// Next lets create some arrays, some that that hold transient 	TokenNameCOMMENT_LINE	Next lets create some arrays, some that that hold transient 
// information during the DFA build and some that are permament. 	TokenNameCOMMENT_LINE	information during the DFA build and some that are permament. 
// These are kind of sticky since we cannot know how big they will 	TokenNameCOMMENT_LINE	These are kind of sticky since we cannot know how big they will 
// get, but we don't want to use any Java collections because of 	TokenNameCOMMENT_LINE	get, but we don't want to use any Java collections because of 
// performance. 	TokenNameCOMMENT_LINE	performance. 
// 	TokenNameCOMMENT_LINE	 
// Basically they will probably be about fLeafCount*2 on average, 	TokenNameCOMMENT_LINE	Basically they will probably be about fLeafCount*2 on average, 
// but can be as large as 2^(fLeafCount*2), worst case. So we start 	TokenNameCOMMENT_LINE	but can be as large as 2^(fLeafCount*2), worst case. So we start 
// with fLeafCount*4 as a middle ground. This will be very unlikely 	TokenNameCOMMENT_LINE	with fLeafCount*4 as a middle ground. This will be very unlikely 
// to ever have to expand, though it if does, the overhead will be 	TokenNameCOMMENT_LINE	to ever have to expand, though it if does, the overhead will be 
// somewhat ugly. 	TokenNameCOMMENT_LINE	somewhat ugly. 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
curArraySize	TokenNameIdentifier	 cur Array Size
=	TokenNameEQUAL	
fLeafCount	TokenNameIdentifier	 f Leaf Count
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
CMStateSet	TokenNameIdentifier	 CM State Set
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
statesToDo	TokenNameIdentifier	 states To Do
=	TokenNameEQUAL	
new	TokenNamenew	
CMStateSet	TokenNameIdentifier	 CM State Set
[	TokenNameLBRACKET	
curArraySize	TokenNameIdentifier	 cur Array Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fFinalStateFlags	TokenNameIdentifier	 f Final State Flags
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
curArraySize	TokenNameIdentifier	 cur Array Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fTransTable	TokenNameIdentifier	 f Trans Table
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
curArraySize	TokenNameIdentifier	 cur Array Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Ok we start with the initial set as the first pos set of the 	TokenNameCOMMENT_LINE	Ok we start with the initial set as the first pos set of the 
// head node (which is the seq node that holds the content model 	TokenNameCOMMENT_LINE	head node (which is the seq node that holds the content model 
// and the EOC node.) 	TokenNameCOMMENT_LINE	and the EOC node.) 
// 	TokenNameCOMMENT_LINE	 
CMStateSet	TokenNameIdentifier	 CM State Set
setT	TokenNameIdentifier	 set T
=	TokenNameEQUAL	
fHeadNode	TokenNameIdentifier	 f Head Node
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Init our two state flags. Basically the unmarked state counter 	TokenNameCOMMENT_LINE	Init our two state flags. Basically the unmarked state counter 
// is always chasing the current state counter. When it catches up, 	TokenNameCOMMENT_LINE	is always chasing the current state counter. When it catches up, 
// that means we made a pass through that did not add any new states 	TokenNameCOMMENT_LINE	that means we made a pass through that did not add any new states 
// to the lists, at which time we are done. We could have used a 	TokenNameCOMMENT_LINE	to the lists, at which time we are done. We could have used a 
// expanding array of flags which we used to mark off states as we 	TokenNameCOMMENT_LINE	expanding array of flags which we used to mark off states as we 
// complete them, but this is easier though less readable maybe. 	TokenNameCOMMENT_LINE	complete them, but this is easier though less readable maybe. 
// 	TokenNameCOMMENT_LINE	 
int	TokenNameint	
unmarkedState	TokenNameIdentifier	 unmarked State
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
curState	TokenNameIdentifier	 cur State
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Init the first transition table entry, and put the initial state 	TokenNameCOMMENT_LINE	Init the first transition table entry, and put the initial state 
// into the states to do list, then bump the current state. 	TokenNameCOMMENT_LINE	into the states to do list, then bump the current state. 
// 	TokenNameCOMMENT_LINE	 
fTransTable	TokenNameIdentifier	 f Trans Table
[	TokenNameLBRACKET	
curState	TokenNameIdentifier	 cur State
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
makeDefStateList	TokenNameIdentifier	 make Def State List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
statesToDo	TokenNameIdentifier	 states To Do
[	TokenNameLBRACKET	
curState	TokenNameIdentifier	 cur State
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
setT	TokenNameIdentifier	 set T
;	TokenNameSEMICOLON	
curState	TokenNameIdentifier	 cur State
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
/* Optimization(Jan, 2001); This is faster for * a large content model such as, "(t001+|t002+|.... |t500+)". */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001); This is faster for a large content model such as, "(t001+|t002+|.... |t500+)". 
HashMap	TokenNameIdentifier	 Hash Map
stateTable	TokenNameIdentifier	 state Table
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
// 	TokenNameCOMMENT_LINE	 
// Ok, almost done with the algorithm... We now enter the 	TokenNameCOMMENT_LINE	Ok, almost done with the algorithm... We now enter the 
// loop where we go until the states done counter catches up with 	TokenNameCOMMENT_LINE	loop where we go until the states done counter catches up with 
// the states to do counter. 	TokenNameCOMMENT_LINE	the states to do counter. 
// 	TokenNameCOMMENT_LINE	 
while	TokenNamewhile	
(	TokenNameLPAREN	
unmarkedState	TokenNameIdentifier	 unmarked State
<	TokenNameLESS	
curState	TokenNameIdentifier	 cur State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Get the first unmarked state out of the list of states to do. 	TokenNameCOMMENT_LINE	Get the first unmarked state out of the list of states to do. 
// And get the associated transition table entry. 	TokenNameCOMMENT_LINE	And get the associated transition table entry. 
// 	TokenNameCOMMENT_LINE	 
setT	TokenNameIdentifier	 set T
=	TokenNameEQUAL	
statesToDo	TokenNameIdentifier	 states To Do
[	TokenNameLBRACKET	
unmarkedState	TokenNameIdentifier	 unmarked State
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transEntry	TokenNameIdentifier	 trans Entry
=	TokenNameEQUAL	
fTransTable	TokenNameIdentifier	 f Trans Table
[	TokenNameLBRACKET	
unmarkedState	TokenNameIdentifier	 unmarked State
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Mark this one final if it contains the EOC state 	TokenNameCOMMENT_LINE	Mark this one final if it contains the EOC state 
fFinalStateFlags	TokenNameIdentifier	 f Final State Flags
[	TokenNameLBRACKET	
unmarkedState	TokenNameIdentifier	 unmarked State
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
setT	TokenNameIdentifier	 set T
.	TokenNameDOT	
getBit	TokenNameIdentifier	 get Bit
(	TokenNameLPAREN	
fEOCPos	TokenNameIdentifier	 f EOC Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Bump up the unmarked state count, marking this state done 	TokenNameCOMMENT_LINE	Bump up the unmarked state count, marking this state done 
unmarkedState	TokenNameIdentifier	 unmarked State
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Loop through each possible input symbol in the element map 	TokenNameCOMMENT_LINE	Loop through each possible input symbol in the element map 
CMStateSet	TokenNameIdentifier	 CM State Set
newSet	TokenNameIdentifier	 new Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
int	TokenNameint	
sorterIndex	TokenNameIdentifier	 sorter Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
elemIndex	TokenNameIdentifier	 elem Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
elemIndex	TokenNameIdentifier	 elem Index
<	TokenNameLESS	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
;	TokenNameSEMICOLON	
elemIndex	TokenNameIdentifier	 elem Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Build up a set of states which is the union of all of 	TokenNameCOMMENT_LINE	Build up a set of states which is the union of all of 
// the follow sets of DFA positions that are in the current 	TokenNameCOMMENT_LINE	the follow sets of DFA positions that are in the current 
// state. If we gave away the new set last time through then 	TokenNameCOMMENT_LINE	state. If we gave away the new set last time through then 
// create a new one. Otherwise, zero out the existing one. 	TokenNameCOMMENT_LINE	create a new one. Otherwise, zero out the existing one. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
newSet	TokenNameIdentifier	 new Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
newSet	TokenNameIdentifier	 new Set
=	TokenNameEQUAL	
new	TokenNamenew	
CMStateSet	TokenNameIdentifier	 CM State Set
(	TokenNameLPAREN	
fLeafCount	TokenNameIdentifier	 f Leaf Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
newSet	TokenNameIdentifier	 new Set
.	TokenNameDOT	
zeroBits	TokenNameIdentifier	 zero Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
int	TokenNameint	
leafIndex	TokenNameIdentifier	 leaf Index
=	TokenNameEQUAL	
fLeafSorter	TokenNameIdentifier	 f Leaf Sorter
[	TokenNameLBRACKET	
sorterIndex	TokenNameIdentifier	 sorter Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
leafIndex	TokenNameIdentifier	 leaf Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If this leaf index (DFA position) is in the current set... 	TokenNameCOMMENT_LINE	If this leaf index (DFA position) is in the current set... 
if	TokenNameif	
(	TokenNameLPAREN	
setT	TokenNameIdentifier	 set T
.	TokenNameDOT	
getBit	TokenNameIdentifier	 get Bit
(	TokenNameLPAREN	
leafIndex	TokenNameIdentifier	 leaf Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// If this leaf is the current input symbol, then we 	TokenNameCOMMENT_LINE	If this leaf is the current input symbol, then we 
// want to add its follow list to the set of states to 	TokenNameCOMMENT_LINE	want to add its follow list to the set of states to 
// transition to from the current state. 	TokenNameCOMMENT_LINE	transition to from the current state. 
// 	TokenNameCOMMENT_LINE	 
newSet	TokenNameIdentifier	 new Set
.	TokenNameDOT	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
fFollowList	TokenNameIdentifier	 f Follow List
[	TokenNameLBRACKET	
leafIndex	TokenNameIdentifier	 leaf Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
leafIndex	TokenNameIdentifier	 leaf Index
=	TokenNameEQUAL	
fLeafSorter	TokenNameIdentifier	 f Leaf Sorter
[	TokenNameLBRACKET	
sorterIndex	TokenNameIdentifier	 sorter Index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
// 	TokenNameCOMMENT_LINE	 
// If this new set is not empty, then see if its in the list 	TokenNameCOMMENT_LINE	If this new set is not empty, then see if its in the list 
// of states to do. If not, then add it. 	TokenNameCOMMENT_LINE	of states to do. If not, then add it. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
newSet	TokenNameIdentifier	 new Set
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Search the 'states to do' list to see if this new 	TokenNameCOMMENT_LINE	Search the 'states to do' list to see if this new 
// state set is already in there. 	TokenNameCOMMENT_LINE	state set is already in there. 
// 	TokenNameCOMMENT_LINE	 
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
Integer	TokenNameIdentifier	 Integer
stateObj	TokenNameIdentifier	 state Obj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
stateTable	TokenNameIdentifier	 state Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
newSet	TokenNameIdentifier	 new Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
stateIndex	TokenNameIdentifier	 state Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
stateObj	TokenNameIdentifier	 state Obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
curState	TokenNameIdentifier	 cur State
:	TokenNameCOLON	
stateObj	TokenNameIdentifier	 state Obj
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
// If we did not find it, then add it 	TokenNameCOMMENT_LINE	If we did not find it, then add it 
if	TokenNameif	
(	TokenNameLPAREN	
stateIndex	TokenNameIdentifier	 state Index
==	TokenNameEQUAL_EQUAL	
curState	TokenNameIdentifier	 cur State
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Put this new state into the states to do and init 	TokenNameCOMMENT_LINE	Put this new state into the states to do and init 
// a new entry at the same index in the transition 	TokenNameCOMMENT_LINE	a new entry at the same index in the transition 
// table. 	TokenNameCOMMENT_LINE	table. 
// 	TokenNameCOMMENT_LINE	 
statesToDo	TokenNameIdentifier	 states To Do
[	TokenNameLBRACKET	
curState	TokenNameIdentifier	 cur State
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newSet	TokenNameIdentifier	 new Set
;	TokenNameSEMICOLON	
fTransTable	TokenNameIdentifier	 f Trans Table
[	TokenNameLBRACKET	
curState	TokenNameIdentifier	 cur State
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
makeDefStateList	TokenNameIdentifier	 make Def State List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
stateTable	TokenNameIdentifier	 state Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
newSet	TokenNameIdentifier	 new Set
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
curState	TokenNameIdentifier	 cur State
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Optimization(Jan, 2001) */	TokenNameCOMMENT_BLOCK	 Optimization(Jan, 2001) 
// We now have a new state to do so bump the count 	TokenNameCOMMENT_LINE	We now have a new state to do so bump the count 
curState	TokenNameIdentifier	 cur State
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Null out the new set to indicate we adopted it. 	TokenNameCOMMENT_LINE	Null out the new set to indicate we adopted it. 
// This will cause the creation of a new set on the 	TokenNameCOMMENT_LINE	This will cause the creation of a new set on the 
// next time around the loop. 	TokenNameCOMMENT_LINE	next time around the loop. 
// 	TokenNameCOMMENT_LINE	 
newSet	TokenNameIdentifier	 new Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Now set this state in the transition table's entry 	TokenNameCOMMENT_LINE	Now set this state in the transition table's entry 
// for this element (using its index), with the DFA 	TokenNameCOMMENT_LINE	for this element (using its index), with the DFA 
// state we will move to from the current state when we 	TokenNameCOMMENT_LINE	state we will move to from the current state when we 
// see this input element. 	TokenNameCOMMENT_LINE	see this input element. 
// 	TokenNameCOMMENT_LINE	 
transEntry	TokenNameIdentifier	 trans Entry
[	TokenNameLBRACKET	
elemIndex	TokenNameIdentifier	 elem Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
stateIndex	TokenNameIdentifier	 state Index
;	TokenNameSEMICOLON	
// Expand the arrays if we're full 	TokenNameCOMMENT_LINE	Expand the arrays if we're full 
if	TokenNameif	
(	TokenNameLPAREN	
curState	TokenNameIdentifier	 cur State
==	TokenNameEQUAL_EQUAL	
curArraySize	TokenNameIdentifier	 cur Array Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Yikes, we overflowed the initial array size, so 	TokenNameCOMMENT_LINE	Yikes, we overflowed the initial array size, so 
// we've got to expand all of these arrays. So adjust 	TokenNameCOMMENT_LINE	we've got to expand all of these arrays. So adjust 
// up the size by 50% and allocate new arrays. 	TokenNameCOMMENT_LINE	up the size by 50% and allocate new arrays. 
// 	TokenNameCOMMENT_LINE	 
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
curArraySize	TokenNameIdentifier	 cur Array Size
*	TokenNameMULTIPLY	
1.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CMStateSet	TokenNameIdentifier	 CM State Set
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newToDo	TokenNameIdentifier	 new To Do
=	TokenNameEQUAL	
new	TokenNamenew	
CMStateSet	TokenNameIdentifier	 CM State Set
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newFinalFlags	TokenNameIdentifier	 new Final Flags
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTransTable	TokenNameIdentifier	 new Trans Table
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Copy over all of the existing content 	TokenNameCOMMENT_LINE	Copy over all of the existing content 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
statesToDo	TokenNameIdentifier	 states To Do
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newToDo	TokenNameIdentifier	 new To Do
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
curArraySize	TokenNameIdentifier	 cur Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fFinalStateFlags	TokenNameIdentifier	 f Final State Flags
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newFinalFlags	TokenNameIdentifier	 new Final Flags
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
curArraySize	TokenNameIdentifier	 cur Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fTransTable	TokenNameIdentifier	 f Trans Table
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newTransTable	TokenNameIdentifier	 new Trans Table
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
curArraySize	TokenNameIdentifier	 cur Array Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Store the new array size 	TokenNameCOMMENT_LINE	Store the new array size 
curArraySize	TokenNameIdentifier	 cur Array Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
statesToDo	TokenNameIdentifier	 states To Do
=	TokenNameEQUAL	
newToDo	TokenNameIdentifier	 new To Do
;	TokenNameSEMICOLON	
fFinalStateFlags	TokenNameIdentifier	 f Final State Flags
=	TokenNameEQUAL	
newFinalFlags	TokenNameIdentifier	 new Final Flags
;	TokenNameSEMICOLON	
fTransTable	TokenNameIdentifier	 f Trans Table
=	TokenNameEQUAL	
newTransTable	TokenNameIdentifier	 new Trans Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Check to see if we can set the fEmptyContentIsValid flag. 	TokenNameCOMMENT_LINE	Check to see if we can set the fEmptyContentIsValid flag. 
fEmptyContentIsValid	TokenNameIdentifier	 f Empty Content Is Valid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
fHeadNode	TokenNameIdentifier	 f Head Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// And now we can say bye bye to the temp representation since we've 	TokenNameCOMMENT_LINE	And now we can say bye bye to the temp representation since we've 
// built the DFA. 	TokenNameCOMMENT_LINE	built the DFA. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_VALIDATE_CONTENT	TokenNameIdentifier	 DEBUG  VALIDATE  CONTENT
)	TokenNameRPAREN	
dumpTree	TokenNameIdentifier	 dump Tree
(	TokenNameLPAREN	
fHeadNode	TokenNameIdentifier	 f Head Node
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fHeadNode	TokenNameIdentifier	 f Head Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fLeafList	TokenNameIdentifier	 f Leaf List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fFollowList	TokenNameIdentifier	 f Follow List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates the follow list of the current node. * * @param nodeCur The curent node. * * @exception CMException Thrown if follow list cannot be calculated. */	TokenNameCOMMENT_JAVADOC	 Calculates the follow list of the current node. * @param nodeCur The curent node. * @exception CMException Thrown if follow list cannot be calculated. 
private	TokenNameprivate	
void	TokenNamevoid	
calcFollowList	TokenNameIdentifier	 calc Follow List
(	TokenNameLPAREN	
CMNode	TokenNameIdentifier	 CM Node
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Recurse as required 	TokenNameCOMMENT_LINE	Recurse as required 
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Recurse only 	TokenNameCOMMENT_LINE	Recurse only 
calcFollowList	TokenNameIdentifier	 calc Follow List
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calcFollowList	TokenNameIdentifier	 calc Follow List
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Recurse first 	TokenNameCOMMENT_LINE	Recurse first 
calcFollowList	TokenNameIdentifier	 calc Follow List
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calcFollowList	TokenNameIdentifier	 calc Follow List
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Now handle our level. We use our left child's last pos 	TokenNameCOMMENT_LINE	Now handle our level. We use our left child's last pos 
// set and our right child's first pos set, so go ahead and 	TokenNameCOMMENT_LINE	set and our right child's first pos set, so go ahead and 
// get them ahead of time. 	TokenNameCOMMENT_LINE	get them ahead of time. 
// 	TokenNameCOMMENT_LINE	 
final	TokenNamefinal	
CMStateSet	TokenNameIdentifier	 CM State Set
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CMStateSet	TokenNameIdentifier	 CM State Set
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Now, for every position which is in our left child's last set 	TokenNameCOMMENT_LINE	Now, for every position which is in our left child's last set 
// add all of the states in our right child's first set to the 	TokenNameCOMMENT_LINE	add all of the states in our right child's first set to the 
// follow set for that position. 	TokenNameCOMMENT_LINE	follow set for that position. 
// 	TokenNameCOMMENT_LINE	 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fLeafCount	TokenNameIdentifier	 f Leaf Count
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
getBit	TokenNameIdentifier	 get Bit
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
fFollowList	TokenNameIdentifier	 f Follow List
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*** else if (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_MORE) { // Recurse first calcFollowList(((CMUniOp)nodeCur).getChild()); // // Now handle our level. We use our own first and last position // sets, so get them up front. // final CMStateSet first = nodeCur.firstPos(); final CMStateSet last = nodeCur.lastPos(); // // For every position which is in our last position set, add all // of our first position states to the follow set for that // position. // for (int index = 0; index < fLeafCount; index++) { if (last.getBit(index)) fFollowList[index].union(first); } } else if ((nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ONE_OR_MORE) || (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_ONE)) { throw new RuntimeException("ImplementationMessages.VAL_NIICM"); } /***/	TokenNameCOMMENT_JAVADOC	* else if (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_MORE) { // Recurse first calcFollowList(((CMUniOp)nodeCur).getChild()); // // Now handle our level. We use our own first and last position // sets, so get them up front. // final CMStateSet first = nodeCur.firstPos(); final CMStateSet last = nodeCur.lastPos(); // // For every position which is in our last position set, add all // of our first position states to the follow set for that // position. // for (int index = 0; index < fLeafCount; index++) { if (last.getBit(index)) fFollowList[index].union(first); } } else if ((nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ONE_OR_MORE) || (nodeCur.type() == XMLContentSpec.CONTENTSPECNODE_ZERO_OR_ONE)) { throw new RuntimeException("ImplementationMessages.VAL_NIICM"); } /**
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  MORE
||	TokenNameOR_OR	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ONE_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ONE  OR  MORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Recurse first 	TokenNameCOMMENT_LINE	Recurse first 
calcFollowList	TokenNameIdentifier	 calc Follow List
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMUniOp	TokenNameIdentifier	 CM Uni Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Now handle our level. We use our own first and last position 	TokenNameCOMMENT_LINE	Now handle our level. We use our own first and last position 
// sets, so get them up front. 	TokenNameCOMMENT_LINE	sets, so get them up front. 
// 	TokenNameCOMMENT_LINE	 
final	TokenNamefinal	
CMStateSet	TokenNameIdentifier	 CM State Set
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CMStateSet	TokenNameIdentifier	 CM State Set
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// For every position which is in our last position set, add all 	TokenNameCOMMENT_LINE	For every position which is in our last position set, add all 
// of our first position states to the follow set for that 	TokenNameCOMMENT_LINE	of our first position states to the follow set for that 
// position. 	TokenNameCOMMENT_LINE	position. 
// 	TokenNameCOMMENT_LINE	 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fLeafCount	TokenNameIdentifier	 f Leaf Count
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
.	TokenNameDOT	
getBit	TokenNameIdentifier	 get Bit
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
fFollowList	TokenNameIdentifier	 f Follow List
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_ONE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  ONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Recurse only 	TokenNameCOMMENT_LINE	Recurse only 
calcFollowList	TokenNameIdentifier	 calc Follow List
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMUniOp	TokenNameIdentifier	 CM Uni Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/***/	TokenNameCOMMENT_JAVADOC	 
}	TokenNameRBRACE	
/** * Dumps the tree of the current node to standard output. * * @param nodeCur The current node. * @param level The maximum levels to output. * * @exception CMException Thrown on error. */	TokenNameCOMMENT_JAVADOC	 Dumps the tree of the current node to standard output. * @param nodeCur The current node. @param level The maximum levels to output. * @exception CMException Thrown on error. 
private	TokenNameprivate	
void	TokenNamevoid	
dumpTree	TokenNameIdentifier	 dump Tree
(	TokenNameLPAREN	
CMNode	TokenNameIdentifier	 CM Node
nodeCur	TokenNameIdentifier	 node Cur
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Choice Node "	TokenNameStringLiteral	Choice Node 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Seq Node "	TokenNameStringLiteral	Seq Node 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Nullable "	TokenNameStringLiteral	Nullable 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"firstPos="	TokenNameStringLiteral	firstPos=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" lastPos="	TokenNameStringLiteral	 lastPos=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dumpTree	TokenNameIdentifier	 dump Tree
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dumpTree	TokenNameIdentifier	 dump Tree
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  MORE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Rep Node "	TokenNameStringLiteral	Rep Node 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Nullable "	TokenNameStringLiteral	Nullable 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"firstPos="	TokenNameStringLiteral	firstPos=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" lastPos="	TokenNameStringLiteral	 lastPos=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dumpTree	TokenNameIdentifier	 dump Tree
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMUniOp	TokenNameIdentifier	 CM Uni Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Leaf: (pos="	TokenNameStringLiteral	Leaf: (pos=
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMLeaf	TokenNameIdentifier	 CM Leaf
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"), "	TokenNameStringLiteral	), 
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMLeaf	TokenNameIdentifier	 CM Leaf
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"(elemIndex="	TokenNameStringLiteral	(elemIndex=
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMLeaf	TokenNameIdentifier	 CM Leaf
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
isNullable	TokenNameIdentifier	 is Nullable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" Nullable "	TokenNameStringLiteral	 Nullable 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"firstPos="	TokenNameStringLiteral	firstPos=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
firstPos	TokenNameIdentifier	 first Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" lastPos="	TokenNameStringLiteral	 lastPos=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
lastPos	TokenNameIdentifier	 last Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_NIICM"	TokenNameStringLiteral	ImplementationMessages.VAL_NIICM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * -1 is used to represent bad transitions in the transition table * entry for each state. So each entry is initialized to an all -1 * array. This method creates a new entry and initializes it. */	TokenNameCOMMENT_JAVADOC	 -1 is used to represent bad transitions in the transition table entry for each state. So each entry is initialized to an all -1 array. This method creates a new entry and initializes it. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
makeDefStateList	TokenNameIdentifier	 make Def State List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
retArray	TokenNameIdentifier	 ret Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
fElemMapSize	TokenNameIdentifier	 f Elem Map Size
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
retArray	TokenNameIdentifier	 ret Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
retArray	TokenNameIdentifier	 ret Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Post tree build initialization. */	TokenNameCOMMENT_JAVADOC	 Post tree build initialization. 
private	TokenNameprivate	
int	TokenNameint	
postTreeBuildInit	TokenNameIdentifier	 post Tree Build Init
(	TokenNameLPAREN	
CMNode	TokenNameIdentifier	 CM Node
nodeCur	TokenNameIdentifier	 node Cur
,	TokenNameCOMMA	
int	TokenNameint	
curIndex	TokenNameIdentifier	 cur Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Set the maximum states on this node 	TokenNameCOMMENT_LINE	Set the maximum states on this node 
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
setMaxStates	TokenNameIdentifier	 set Max States
(	TokenNameLPAREN	
fLeafCount	TokenNameIdentifier	 f Leaf Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Recurse as required 	TokenNameCOMMENT_LINE	Recurse as required 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY	TokenNameIdentifier	 CONTENTSPECNODE  ANY
||	TokenNameOR_OR	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY_LOCAL	TokenNameIdentifier	 CONTENTSPECNODE  ANY  LOCAL
||	TokenNameOR_OR	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ANY_OTHER	TokenNameIdentifier	 CONTENTSPECNODE  ANY  OTHER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: Don't waste these structures. 	TokenNameCOMMENT_LINE	REVISIT: Don't waste these structures. 
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMAny	TokenNameIdentifier	 CM Any
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fLeafList	TokenNameIdentifier	 f Leaf List
[	TokenNameLBRACKET	
curIndex	TokenNameIdentifier	 cur Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
CMLeaf	TokenNameIdentifier	 CM Leaf
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMAny	TokenNameIdentifier	 CM Any
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fLeafListType	TokenNameIdentifier	 f Leaf List Type
[	TokenNameLBRACKET	
curIndex	TokenNameIdentifier	 cur Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curIndex	TokenNameIdentifier	 cur Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curIndex	TokenNameIdentifier	 cur Index
=	TokenNameEQUAL	
postTreeBuildInit	TokenNameIdentifier	 post Tree Build Init
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
curIndex	TokenNameIdentifier	 cur Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curIndex	TokenNameIdentifier	 cur Index
=	TokenNameEQUAL	
postTreeBuildInit	TokenNameIdentifier	 post Tree Build Init
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMBinOp	TokenNameIdentifier	 CM Bin Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
curIndex	TokenNameIdentifier	 cur Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  MORE
||	TokenNameOR_OR	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ONE_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ONE  OR  MORE
||	TokenNameOR_OR	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_ZERO_OR_ONE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  ONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curIndex	TokenNameIdentifier	 cur Index
=	TokenNameEQUAL	
postTreeBuildInit	TokenNameIdentifier	 post Tree Build Init
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMUniOp	TokenNameIdentifier	 CM Uni Op
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getChild	TokenNameIdentifier	 get Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
curIndex	TokenNameIdentifier	 cur Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Put this node in the leaf list at the current index if its 	TokenNameCOMMENT_LINE	Put this node in the leaf list at the current index if its 
// a non-epsilon leaf. 	TokenNameCOMMENT_LINE	a non-epsilon leaf. 
// 	TokenNameCOMMENT_LINE	 
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CMLeaf	TokenNameIdentifier	 CM Leaf
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
)	TokenNameRPAREN	
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
!=	TokenNameNOT_EQUAL	
fEpsilonString	TokenNameIdentifier	 f Epsilon String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fLeafList	TokenNameIdentifier	 f Leaf List
[	TokenNameLBRACKET	
curIndex	TokenNameIdentifier	 cur Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CMLeaf	TokenNameIdentifier	 CM Leaf
)	TokenNameRPAREN	
nodeCur	TokenNameIdentifier	 node Cur
;	TokenNameSEMICOLON	
fLeafListType	TokenNameIdentifier	 f Leaf List Type
[	TokenNameLBRACKET	
curIndex	TokenNameIdentifier	 cur Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
;	TokenNameSEMICOLON	
curIndex	TokenNameIdentifier	 cur Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"ImplementationMessages.VAL_NIICM: type="	TokenNameStringLiteral	ImplementationMessages.VAL_NIICM: type=
+	TokenNamePLUS	
nodeCur	TokenNameIdentifier	 node Cur
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
curIndex	TokenNameIdentifier	 cur Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class DFAContentModel 	TokenNameCOMMENT_LINE	class DFAContentModel 
