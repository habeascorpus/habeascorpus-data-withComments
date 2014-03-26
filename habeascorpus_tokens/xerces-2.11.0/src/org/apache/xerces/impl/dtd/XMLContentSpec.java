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
;	TokenNameSEMICOLON	
/** * ContentSpec really exists to aid the parser classes in implementing * access to the grammar. * <p> * This class is used by the DTD scanner and the validator classes, * allowing them to be used separately or together. This "struct" * class is used to build content models for validation, where it * is more efficient to fetch all of the information for each of * these content model "fragments" than to fetch each field one at * a time. Since configurations are allowed to have validators * without a DTD scanner (i.e. a schema validator) and a DTD scanner * without a validator (non-validating processor), this class can be * used by each without requiring the presence of the other. * <p> * When processing element declarations, the DTD scanner will build * up a representation of the content model using the node types that * are defined here. Since a non-validating processor only needs to * remember the type of content model declared (i.e. ANY, EMPTY, MIXED, * or CHILDREN), it is free to discard the specific details of the * MIXED and CHILDREN content models described using this class. * <p> * In the typical case of a validating processor reading the grammar * of the document from a DTD, the information about the content model * declared will be preserved and later "compiled" into an efficient * form for use during element validation. Each content spec node * that is saved is assigned a unique index that is used as a handle * for the "value" or "otherValue" fields of other content spec nodes. * A leaf node has a "value" that is either an index in the string * pool of the element type of that leaf, or a value of -1 to indicate * the special "#PCDATA" leaf type used in a mixed content model. * <p> * For a mixed content model, the content spec will be made up of * leaf and choice content spec nodes, with an optional "zero or more" * node. For example, the mixed content declaration "(#PCDATA)" would * contain a single leaf node with a node value of -1. A mixed content * declaration of "(#PCDATA|foo)*" would have a content spec consisting * of two leaf nodes, for the "#PCDATA" and "foo" choices, a choice node * with the "value" set to the index of the "#PCDATA" leaf node and the * "otherValue" set to the index of the "foo" leaf node, and a "zero or * more" node with the "value" set to the index of the choice node. If * the content model has more choices, for example "(#PCDATA|a|b)*", then * there will be more corresponding choice and leaf nodes, the choice * nodes will be chained together through the "value" field with each * leaf node referenced by the "otherValue" field. * <p> * For element content models, there are sequence nodes and also "zero or * one" and "one or more" nodes. The leaf nodes would always have a valid * string pool index, as the "#PCDATA" leaf is not used in the declarations * for element content models. * * @xerces.internal * * @version $Id: XMLContentSpec.java 446755 2006-09-15 21:56:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 ContentSpec really exists to aid the parser classes in implementing access to the grammar. <p> This class is used by the DTD scanner and the validator classes, allowing them to be used separately or together. This "struct" class is used to build content models for validation, where it is more efficient to fetch all of the information for each of these content model "fragments" than to fetch each field one at a time. Since configurations are allowed to have validators without a DTD scanner (i.e. a schema validator) and a DTD scanner without a validator (non-validating processor), this class can be used by each without requiring the presence of the other. <p> When processing element declarations, the DTD scanner will build up a representation of the content model using the node types that are defined here. Since a non-validating processor only needs to remember the type of content model declared (i.e. ANY, EMPTY, MIXED, or CHILDREN), it is free to discard the specific details of the MIXED and CHILDREN content models described using this class. <p> In the typical case of a validating processor reading the grammar of the document from a DTD, the information about the content model declared will be preserved and later "compiled" into an efficient form for use during element validation. Each content spec node that is saved is assigned a unique index that is used as a handle for the "value" or "otherValue" fields of other content spec nodes. A leaf node has a "value" that is either an index in the string pool of the element type of that leaf, or a value of -1 to indicate the special "#PCDATA" leaf type used in a mixed content model. <p> For a mixed content model, the content spec will be made up of leaf and choice content spec nodes, with an optional "zero or more" node. For example, the mixed content declaration "(#PCDATA)" would contain a single leaf node with a node value of -1. A mixed content declaration of "(#PCDATA|foo)*" would have a content spec consisting of two leaf nodes, for the "#PCDATA" and "foo" choices, a choice node with the "value" set to the index of the "#PCDATA" leaf node and the "otherValue" set to the index of the "foo" leaf node, and a "zero or more" node with the "value" set to the index of the choice node. If the content model has more choices, for example "(#PCDATA|a|b)*", then there will be more corresponding choice and leaf nodes, the choice nodes will be chained together through the "value" field with each leaf node referenced by the "otherValue" field. <p> For element content models, there are sequence nodes and also "zero or one" and "one or more" nodes. The leaf nodes would always have a valid string pool index, as the "#PCDATA" leaf is not used in the declarations for element content models. * @xerces.internal * @version $Id: XMLContentSpec.java 446755 2006-09-15 21:56:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** * Name or #PCDATA. Leaf nodes that represent parsed character * data (#PCDATA) have values of -1. */	TokenNameCOMMENT_JAVADOC	 Name or #PCDATA. Leaf nodes that represent parsed character data (#PCDATA) have values of -1. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_LEAF	TokenNameIdentifier	 CONTENTSPECNODE  LEAF
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Represents a zero or one occurence count, '?'. */	TokenNameCOMMENT_JAVADOC	 Represents a zero or one occurence count, '?'. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ZERO_OR_ONE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  ONE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Represents a zero or more occurence count, '*'. */	TokenNameCOMMENT_JAVADOC	 Represents a zero or more occurence count, '*'. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ZERO_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ZERO  OR  MORE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Represents a one or more occurence count, '+'. */	TokenNameCOMMENT_JAVADOC	 Represents a one or more occurence count, '+'. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ONE_OR_MORE	TokenNameIdentifier	 CONTENTSPECNODE  ONE  OR  MORE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Represents choice, '|'. */	TokenNameCOMMENT_JAVADOC	 Represents choice, '|'. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_CHOICE	TokenNameIdentifier	 CONTENTSPECNODE  CHOICE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Represents sequence, ','. */	TokenNameCOMMENT_JAVADOC	 Represents sequence, ','. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_SEQ	TokenNameIdentifier	 CONTENTSPECNODE  SEQ
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents any namespace specified namespace. When the element * found in the document must belong to a specific namespace, * <code>otherValue</code> will contain the name of the namespace. * If <code>otherValue</code> is <code>-1</code> then the element * can be from any namespace. * <p> * Lists of valid namespaces are created from choice content spec * nodes that have any content spec nodes as children. */	TokenNameCOMMENT_JAVADOC	 Represents any namespace specified namespace. When the element found in the document must belong to a specific namespace, <code>otherValue</code> will contain the name of the namespace. If <code>otherValue</code> is <code>-1</code> then the element can be from any namespace. <p> Lists of valid namespaces are created from choice content spec nodes that have any content spec nodes as children. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ANY	TokenNameIdentifier	 CONTENTSPECNODE  ANY
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Represents any other namespace (XML Schema: ##other). * <p> * When the content spec node type is set to CONTENTSPECNODE_ANY_OTHER, * <code>value</code> will contain the namespace that <em>cannot</em> * occur. */	TokenNameCOMMENT_JAVADOC	 Represents any other namespace (XML Schema: ##other). <p> When the content spec node type is set to CONTENTSPECNODE_ANY_OTHER, <code>value</code> will contain the namespace that <em>cannot</em> occur. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ANY_OTHER	TokenNameIdentifier	 CONTENTSPECNODE  ANY  OTHER
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Represents any local element (XML Schema: ##local). */	TokenNameCOMMENT_JAVADOC	 Represents any local element (XML Schema: ##local). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ANY_LOCAL	TokenNameIdentifier	 CONTENTSPECNODE  ANY  LOCAL
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** prcessContent is 'lax' **/	TokenNameCOMMENT_JAVADOC	 prcessContent is 'lax' *
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ANY_LAX	TokenNameIdentifier	 CONTENTSPECNODE  ANY  LAX
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ANY_OTHER_LAX	TokenNameIdentifier	 CONTENTSPECNODE  ANY  OTHER  LAX
=	TokenNameEQUAL	
23	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ANY_LOCAL_LAX	TokenNameIdentifier	 CONTENTSPECNODE  ANY  LOCAL  LAX
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** processContent is 'skip' **/	TokenNameCOMMENT_JAVADOC	 processContent is 'skip' *
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ANY_SKIP	TokenNameIdentifier	 CONTENTSPECNODE  ANY  SKIP
=	TokenNameEQUAL	
38	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ANY_OTHER_SKIP	TokenNameIdentifier	 CONTENTSPECNODE  ANY  OTHER  SKIP
=	TokenNameEQUAL	
39	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
CONTENTSPECNODE_ANY_LOCAL_SKIP	TokenNameIdentifier	 CONTENTSPECNODE  ANY  LOCAL  SKIP
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** * The content spec node type. * * @see #CONTENTSPECNODE_LEAF * @see #CONTENTSPECNODE_ZERO_OR_ONE * @see #CONTENTSPECNODE_ZERO_OR_MORE * @see #CONTENTSPECNODE_ONE_OR_MORE * @see #CONTENTSPECNODE_CHOICE * @see #CONTENTSPECNODE_SEQ */	TokenNameCOMMENT_JAVADOC	 The content spec node type. * @see #CONTENTSPECNODE_LEAF @see #CONTENTSPECNODE_ZERO_OR_ONE @see #CONTENTSPECNODE_ZERO_OR_MORE @see #CONTENTSPECNODE_ONE_OR_MORE @see #CONTENTSPECNODE_CHOICE @see #CONTENTSPECNODE_SEQ 
public	TokenNamepublic	
short	TokenNameshort	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * The "left hand" value object of the content spec node. * leaf name.localpart, single child for unary ops, left child for binary ops. */	TokenNameCOMMENT_JAVADOC	 The "left hand" value object of the content spec node. leaf name.localpart, single child for unary ops, left child for binary ops. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * The "right hand" value of the content spec node. * leaf name.uri, right child for binary ops */	TokenNameCOMMENT_JAVADOC	 The "right hand" value of the content spec node. leaf name.uri, right child for binary ops 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
otherValue	TokenNameIdentifier	 other Value
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Constructs a content spec with the specified values. */	TokenNameCOMMENT_JAVADOC	 Constructs a content spec with the specified values. 
public	TokenNamepublic	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
otherValue	TokenNameIdentifier	 other Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
otherValue	TokenNameIdentifier	 other Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a content spec from the values in the specified content spec. */	TokenNameCOMMENT_JAVADOC	 Constructs a content spec from the values in the specified content spec. 
public	TokenNamepublic	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
contentSpec	TokenNameIdentifier	 content Spec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
contentSpec	TokenNameIdentifier	 content Spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a content spec from the values specified by the given * content spec provider and identifier. */	TokenNameCOMMENT_JAVADOC	 Constructs a content spec from the values specified by the given content spec provider and identifier. 
public	TokenNamepublic	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
Provider	TokenNameIdentifier	 Provider
provider	TokenNameIdentifier	 provider
,	TokenNameCOMMA	
int	TokenNameint	
contentSpecIndex	TokenNameIdentifier	 content Spec Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
provider	TokenNameIdentifier	 provider
,	TokenNameCOMMA	
contentSpecIndex	TokenNameIdentifier	 content Spec Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** Clears the values. */	TokenNameCOMMENT_JAVADOC	 Clears the values. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
otherValue	TokenNameIdentifier	 other Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the values. */	TokenNameCOMMENT_JAVADOC	 Sets the values. 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
otherValue	TokenNameIdentifier	 other Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
otherValue	TokenNameIdentifier	 other Value
=	TokenNameEQUAL	
otherValue	TokenNameIdentifier	 other Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the values of the specified content spec. */	TokenNameCOMMENT_JAVADOC	 Sets the values of the specified content spec. 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
contentSpec	TokenNameIdentifier	 content Spec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
contentSpec	TokenNameIdentifier	 content Spec
.	TokenNameDOT	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
contentSpec	TokenNameIdentifier	 content Spec
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
otherValue	TokenNameIdentifier	 other Value
=	TokenNameEQUAL	
contentSpec	TokenNameIdentifier	 content Spec
.	TokenNameDOT	
otherValue	TokenNameIdentifier	 other Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the values from the values specified by the given content spec * provider and identifier. If the specified content spec cannot be * provided, the values of this content spec are cleared. */	TokenNameCOMMENT_JAVADOC	 Sets the values from the values specified by the given content spec provider and identifier. If the specified content spec cannot be provided, the values of this content spec are cleared. 
public	TokenNamepublic	
void	TokenNamevoid	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
.	TokenNameDOT	
Provider	TokenNameIdentifier	 Provider
provider	TokenNameIdentifier	 provider
,	TokenNameCOMMA	
int	TokenNameint	
contentSpecIndex	TokenNameIdentifier	 content Spec Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
provider	TokenNameIdentifier	 provider
.	TokenNameDOT	
getContentSpec	TokenNameIdentifier	 get Content Spec
(	TokenNameLPAREN	
contentSpecIndex	TokenNameIdentifier	 content Spec Index
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Object methods 	TokenNameCOMMENT_LINE	Object methods 
// 	TokenNameCOMMENT_LINE	 
/** Returns a hash code for this node. */	TokenNameCOMMENT_JAVADOC	 Returns a hash code for this node. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
|	TokenNameOR	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
otherValue	TokenNameIdentifier	 other Value
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true if the two objects are equal. */	TokenNameCOMMENT_JAVADOC	 Returns true if the two objects are equal. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
object	TokenNameIdentifier	 object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
object	TokenNameIdentifier	 object
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
object	TokenNameIdentifier	 object
instanceof	TokenNameinstanceof	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
contentSpec	TokenNameIdentifier	 content Spec
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
)	TokenNameRPAREN	
object	TokenNameIdentifier	 object
;	TokenNameSEMICOLON	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
contentSpec	TokenNameIdentifier	 content Spec
.	TokenNameDOT	
type	TokenNameIdentifier	 type
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
contentSpec	TokenNameIdentifier	 content Spec
.	TokenNameDOT	
value	TokenNameIdentifier	 value
&&	TokenNameAND_AND	
otherValue	TokenNameIdentifier	 other Value
==	TokenNameEQUAL_EQUAL	
contentSpec	TokenNameIdentifier	 content Spec
.	TokenNameDOT	
otherValue	TokenNameIdentifier	 other Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Interfaces 	TokenNameCOMMENT_LINE	Interfaces 
// 	TokenNameCOMMENT_LINE	 
/** * Provides a means for walking the structure built out of * content spec "nodes". The user of this provider interface is * responsible for knowing what the content spec node values * "mean". If those values refer to content spec identifiers, * then the user can call back into the provider to get the * next content spec node in the structure. * * @xerces.internal */	TokenNameCOMMENT_JAVADOC	 Provides a means for walking the structure built out of content spec "nodes". The user of this provider interface is responsible for knowing what the content spec node values "mean". If those values refer to content spec identifiers, then the user can call back into the provider to get the next content spec node in the structure. * @xerces.internal 
public	TokenNamepublic	
interface	TokenNameinterface	
Provider	TokenNameIdentifier	 Provider
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLContentSpec.Provider methods 	TokenNameCOMMENT_LINE	XMLContentSpec.Provider methods 
// 	TokenNameCOMMENT_LINE	 
/** * Fills in the provided content spec structure with content spec * information for a unique identifier. * * @param contentSpecIndex The content spec identifier. All content * spec "nodes" have a unique identifier. * @param contentSpec The content spec struct to fill in with * the information. * * @return Returns true if the contentSpecIndex was found. */	TokenNameCOMMENT_JAVADOC	 Fills in the provided content spec structure with content spec information for a unique identifier. * @param contentSpecIndex The content spec identifier. All content spec "nodes" have a unique identifier. @param contentSpec The content spec struct to fill in with the information. * @return Returns true if the contentSpecIndex was found. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getContentSpec	TokenNameIdentifier	 get Content Spec
(	TokenNameLPAREN	
int	TokenNameint	
contentSpecIndex	TokenNameIdentifier	 content Spec Index
,	TokenNameCOMMA	
XMLContentSpec	TokenNameIdentifier	 XML Content Spec
contentSpec	TokenNameIdentifier	 content Spec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// interface Provider 	TokenNameCOMMENT_LINE	interface Provider 
}	TokenNameRBRACE	
// class XMLContentSpec 	TokenNameCOMMENT_LINE	class XMLContentSpec 
