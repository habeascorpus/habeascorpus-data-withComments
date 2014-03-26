/* * Copyright (c) 2001 World Wide Web Consortium, * (Massachusetts Institute of Technology, Institut National de * Recherche en Informatique et en Automatique, Keio University). All * Rights Reserved. This program is distributed under the W3C's Software * Intellectual Property License. This program is distributed in the * hope that it will be useful, but WITHOUT ANY WARRANTY; without even * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR * PURPOSE. * See W3C License http://www.w3.org/Consortium/Legal/ for more details. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2001 World Wide Web Consortium, (Massachusetts Institute of Technology, Institut National de Recherche en Informatique et en Automatique, Keio University). All Rights Reserved. This program is distributed under the W3C's Software Intellectual Property License. This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See W3C License http://www.w3.org/Consortium/Legal/ for more details. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom3	TokenNameIdentifier	 dom3
.	TokenNameDOT	
as	TokenNameIdentifier	 as
;	TokenNameSEMICOLON	
/** * @deprecated * The content model of a declared element. * <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. */	TokenNameCOMMENT_JAVADOC	 @deprecated The content model of a declared element. <p>See also the <a href='http://www.w3.org/TR/2001/WD-DOM-Level-3-ASLS-20011025'>Document Object Model (DOM) Level 3 Abstract Schemas and Load and Save Specification</a>. 
public	TokenNamepublic	
interface	TokenNameinterface	
ASContentModel	TokenNameIdentifier	 AS Content Model
extends	TokenNameextends	
ASObject	TokenNameIdentifier	 AS Object
{	TokenNameLBRACE	
/** * Signifies unbounded upper limit. The MAX_VALUE value is * <code>0xFFFFFFFF FFFFFFFF</code>. This needs to be better defined in * the generated bindings. */	TokenNameCOMMENT_JAVADOC	 Signifies unbounded upper limit. The MAX_VALUE value is <code>0xFFFFFFFF FFFFFFFF</code>. This needs to be better defined in the generated bindings. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
AS_UNBOUNDED	TokenNameIdentifier	 AS  UNBOUNDED
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// ASContentModelType 	TokenNameCOMMENT_LINE	ASContentModelType 
/** * This constant value signifies a sequence operator. For example, in a * DTD, this would be the '<code>,</code>' operator. */	TokenNameCOMMENT_JAVADOC	 This constant value signifies a sequence operator. For example, in a DTD, this would be the '<code>,</code>' operator. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_SEQUENCE	TokenNameIdentifier	 AS  SEQUENCE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * This constant value signifies a choice operator. For example, in a DTD, * this would be the '<code>|</code>' operator. */	TokenNameCOMMENT_JAVADOC	 This constant value signifies a choice operator. For example, in a DTD, this would be the '<code>|</code>' operator. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_CHOICE	TokenNameIdentifier	 AS  CHOICE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * All of the above. */	TokenNameCOMMENT_JAVADOC	 All of the above. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_ALL	TokenNameIdentifier	 AS  ALL
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * None of the above, i.e., neither a choice nor sequence operator. */	TokenNameCOMMENT_JAVADOC	 None of the above, i.e., neither a choice nor sequence operator. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AS_NONE	TokenNameIdentifier	 AS  NONE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * One of <code>AS_CHOICE</code>, <code>AS_SEQUENCE</code>, * <code>AS_ALL</code> or <code>AS_NONE</code>. The operator is applied * to all the components(ASObjects) in the <code>subModels</code>. For * example, if the list operator is <code>AS_CHOICE</code> and the * components in subModels are a, b and c then the abstract schema for * the element being declared is <code>(a|b|c)</code>. */	TokenNameCOMMENT_JAVADOC	 One of <code>AS_CHOICE</code>, <code>AS_SEQUENCE</code>, <code>AS_ALL</code> or <code>AS_NONE</code>. The operator is applied to all the components(ASObjects) in the <code>subModels</code>. For example, if the list operator is <code>AS_CHOICE</code> and the components in subModels are a, b and c then the abstract schema for the element being declared is <code>(a|b|c)</code>. 
public	TokenNamepublic	
short	TokenNameshort	
getListOperator	TokenNameIdentifier	 get List Operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * One of <code>AS_CHOICE</code>, <code>AS_SEQUENCE</code>, * <code>AS_ALL</code> or <code>AS_NONE</code>. The operator is applied * to all the components(ASObjects) in the <code>subModels</code>. For * example, if the list operator is <code>AS_CHOICE</code> and the * components in subModels are a, b and c then the abstract schema for * the element being declared is <code>(a|b|c)</code>. */	TokenNameCOMMENT_JAVADOC	 One of <code>AS_CHOICE</code>, <code>AS_SEQUENCE</code>, <code>AS_ALL</code> or <code>AS_NONE</code>. The operator is applied to all the components(ASObjects) in the <code>subModels</code>. For example, if the list operator is <code>AS_CHOICE</code> and the components in subModels are a, b and c then the abstract schema for the element being declared is <code>(a|b|c)</code>. 
public	TokenNamepublic	
void	TokenNamevoid	
setListOperator	TokenNameIdentifier	 set List Operator
(	TokenNameLPAREN	
short	TokenNameshort	
listOperator	TokenNameIdentifier	 list Operator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * min occurrence for this content particle. Its value may be 0 or a * positive integer. */	TokenNameCOMMENT_JAVADOC	 min occurrence for this content particle. Its value may be 0 or a positive integer. 
public	TokenNamepublic	
int	TokenNameint	
getMinOccurs	TokenNameIdentifier	 get Min Occurs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * min occurrence for this content particle. Its value may be 0 or a * positive integer. */	TokenNameCOMMENT_JAVADOC	 min occurrence for this content particle. Its value may be 0 or a positive integer. 
public	TokenNamepublic	
void	TokenNamevoid	
setMinOccurs	TokenNameIdentifier	 set Min Occurs
(	TokenNameLPAREN	
int	TokenNameint	
minOccurs	TokenNameIdentifier	 min Occurs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * maximum occurrence for this content particle. Its value may be * <code>0</code>, a positive integer, or <code>AS_UNBOUNDED</code> to * indicate that no upper limit has been set. */	TokenNameCOMMENT_JAVADOC	 maximum occurrence for this content particle. Its value may be <code>0</code>, a positive integer, or <code>AS_UNBOUNDED</code> to indicate that no upper limit has been set. 
public	TokenNamepublic	
int	TokenNameint	
getMaxOccurs	TokenNameIdentifier	 get Max Occurs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * maximum occurrence for this content particle. Its value may be * <code>0</code>, a positive integer, or <code>AS_UNBOUNDED</code> to * indicate that no upper limit has been set. */	TokenNameCOMMENT_JAVADOC	 maximum occurrence for this content particle. Its value may be <code>0</code>, a positive integer, or <code>AS_UNBOUNDED</code> to indicate that no upper limit has been set. 
public	TokenNamepublic	
void	TokenNamevoid	
setMaxOccurs	TokenNameIdentifier	 set Max Occurs
(	TokenNameLPAREN	
int	TokenNameint	
maxOccurs	TokenNameIdentifier	 max Occurs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Pointers to <code>ASObject</code>s such as * <code> ASElementDeclaration</code>s and further * <code>ASContentModel</code>s. */	TokenNameCOMMENT_JAVADOC	 Pointers to <code>ASObject</code>s such as <code> ASElementDeclaration</code>s and further <code>ASContentModel</code>s. 
public	TokenNamepublic	
ASObjectList	TokenNameIdentifier	 AS Object List
getSubModels	TokenNameIdentifier	 get Sub Models
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Pointers to <code>ASObject</code>s such as * <code> ASElementDeclaration</code>s and further * <code>ASContentModel</code>s. */	TokenNameCOMMENT_JAVADOC	 Pointers to <code>ASObject</code>s such as <code> ASElementDeclaration</code>s and further <code>ASContentModel</code>s. 
public	TokenNamepublic	
void	TokenNamevoid	
setSubModels	TokenNameIdentifier	 set Sub Models
(	TokenNameLPAREN	
ASObjectList	TokenNameIdentifier	 AS Object List
subModels	TokenNameIdentifier	 sub Models
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Removes the <code>ASObject</code> in the submodel. Nodes that already * exist in the list are moved as needed. * @param oldNode The node to be removed. */	TokenNameCOMMENT_JAVADOC	 Removes the <code>ASObject</code> in the submodel. Nodes that already exist in the list are moved as needed. @param oldNode The node to be removed. 
public	TokenNamepublic	
void	TokenNamevoid	
removesubModel	TokenNameIdentifier	 removesub Model
(	TokenNameLPAREN	
ASObject	TokenNameIdentifier	 AS Object
oldNode	TokenNameIdentifier	 old Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Inserts a new node in the submodel. Nodes that already exist in the * list are moved as needed. * @param newNode The new node to be inserted. * @exception DOMASException * <code>DUPLICATE_NAME_ERR</code>: Raised if a element declaration * already exists with the same name within an <code>AS_CHOICE</code> * operator. */	TokenNameCOMMENT_JAVADOC	 Inserts a new node in the submodel. Nodes that already exist in the list are moved as needed. @param newNode The new node to be inserted. @exception DOMASException <code>DUPLICATE_NAME_ERR</code>: Raised if a element declaration already exists with the same name within an <code>AS_CHOICE</code> operator. 
public	TokenNamepublic	
void	TokenNamevoid	
insertsubModel	TokenNameIdentifier	 insertsub Model
(	TokenNameLPAREN	
ASObject	TokenNameIdentifier	 AS Object
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMASException	TokenNameIdentifier	 DOMAS Exception
;	TokenNameSEMICOLON	
/** * Appends a new node to the end of the list representing the * <code>subModels</code>. * @param newNode The new node to be appended. * @return the length of the <code>subModels</code>. * @exception DOMASException * <code>DUPLICATE_NAME_ERR</code>: Raised if a element declaration * already exists with the same name within an <code>AS_CHOICE</code> * operator. * <br> <code>TYPE_ERR</code>: Raised if type is neither an * <code>ASContentModel</code> nor an <code>ASElementDeclaration</code> * . */	TokenNameCOMMENT_JAVADOC	 Appends a new node to the end of the list representing the <code>subModels</code>. @param newNode The new node to be appended. @return the length of the <code>subModels</code>. @exception DOMASException <code>DUPLICATE_NAME_ERR</code>: Raised if a element declaration already exists with the same name within an <code>AS_CHOICE</code> operator. <br> <code>TYPE_ERR</code>: Raised if type is neither an <code>ASContentModel</code> nor an <code>ASElementDeclaration</code> . 
public	TokenNamepublic	
int	TokenNameint	
appendsubModel	TokenNameIdentifier	 appendsub Model
(	TokenNameLPAREN	
ASObject	TokenNameIdentifier	 AS Object
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMASException	TokenNameIdentifier	 DOMAS Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
