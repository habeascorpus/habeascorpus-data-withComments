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
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLAttributes	TokenNameIdentifier	 XML Attributes
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
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
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
grammars	TokenNameIdentifier	 grammars
.	TokenNameDOT	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
;	TokenNameSEMICOLON	
/** * All information specific to XML Schema grammars. * * @xerces.internal * * @author Neil Graham, IBM * @author Neeraj Bajaj, SUN Microsystems. * * @version $Id: XSDDescription.java 446734 2006-09-15 20:51:23Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 All information specific to XML Schema grammars. * @xerces.internal * @author Neil Graham, IBM @author Neeraj Bajaj, SUN Microsystems. * @version $Id: XSDDescription.java 446734 2006-09-15 20:51:23Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSDDescription	TokenNameIdentifier	 XSD Description
extends	TokenNameextends	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
implements	TokenNameimplements	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
{	TokenNameLBRACE	
// used to indicate what triggered the call 	TokenNameCOMMENT_LINE	used to indicate what triggered the call 
/** * Indicate that this description was just initialized. */	TokenNameCOMMENT_JAVADOC	 Indicate that this description was just initialized. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_INITIALIZE	TokenNameIdentifier	 CONTEXT  INITIALIZE
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the current schema document is <include>d by another * schema document. */	TokenNameCOMMENT_JAVADOC	 Indicate that the current schema document is <include>d by another schema document. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_INCLUDE	TokenNameIdentifier	 CONTEXT  INCLUDE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the current schema document is <redefine>d by another * schema document. */	TokenNameCOMMENT_JAVADOC	 Indicate that the current schema document is <redefine>d by another schema document. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_REDEFINE	TokenNameIdentifier	 CONTEXT  REDEFINE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the current schema document is <import>ed by another * schema document. */	TokenNameCOMMENT_JAVADOC	 Indicate that the current schema document is <import>ed by another schema document. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_IMPORT	TokenNameIdentifier	 CONTEXT  IMPORT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the current schema document is being preparsed. */	TokenNameCOMMENT_JAVADOC	 Indicate that the current schema document is being preparsed. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_PREPARSE	TokenNameIdentifier	 CONTEXT  PREPARSE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the parse of the current schema document is triggered * by xsi:schemaLocation/noNamespaceSchemaLocation attribute(s) in the * instance document. This value is only used if we don't defer the loading * of schema documents. */	TokenNameCOMMENT_JAVADOC	 Indicate that the parse of the current schema document is triggered by xsi:schemaLocation/noNamespaceSchemaLocation attribute(s) in the instance document. This value is only used if we don't defer the loading of schema documents. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_INSTANCE	TokenNameIdentifier	 CONTEXT  INSTANCE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the parse of the current schema document is triggered by * the occurrence of an element whose namespace is the target namespace * of this schema document. This value is only used if we do defer the * loading of schema documents until a component from that namespace is * referenced from the instance. */	TokenNameCOMMENT_JAVADOC	 Indicate that the parse of the current schema document is triggered by the occurrence of an element whose namespace is the target namespace of this schema document. This value is only used if we do defer the loading of schema documents until a component from that namespace is referenced from the instance. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_ELEMENT	TokenNameIdentifier	 CONTEXT  ELEMENT
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the parse of the current schema document is triggered by * the occurrence of an attribute whose namespace is the target namespace * of this schema document. This value is only used if we do defer the * loading of schema documents until a component from that namespace is * referenced from the instance. */	TokenNameCOMMENT_JAVADOC	 Indicate that the parse of the current schema document is triggered by the occurrence of an attribute whose namespace is the target namespace of this schema document. This value is only used if we do defer the loading of schema documents until a component from that namespace is referenced from the instance. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_ATTRIBUTE	TokenNameIdentifier	 CONTEXT  ATTRIBUTE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicate that the parse of the current schema document is triggered by * the occurrence of an "xsi:type" attribute, whose value (a QName) has * the target namespace of this schema document as its namespace. * This value is only used if we do defer the loading of schema documents * until a component from that namespace is referenced from the instance. */	TokenNameCOMMENT_JAVADOC	 Indicate that the parse of the current schema document is triggered by the occurrence of an "xsi:type" attribute, whose value (a QName) has the target namespace of this schema document as its namespace. This value is only used if we do defer the loading of schema documents until a component from that namespace is referenced from the instance. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
short	TokenNameshort	
CONTEXT_XSITYPE	TokenNameIdentifier	 CONTEXT  XSITYPE
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// REVISIT: write description of these fields 	TokenNameCOMMENT_LINE	REVISIT: write description of these fields 
protected	TokenNameprotected	
short	TokenNameshort	
fContextType	TokenNameIdentifier	 f Context Type
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fLocationHints	TokenNameIdentifier	 f Location Hints
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
QName	TokenNameIdentifier	 Q Name
fTriggeringComponent	TokenNameIdentifier	 f Triggering Component
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
QName	TokenNameIdentifier	 Q Name
fEnclosedElementName	TokenNameIdentifier	 f Enclosed Element Name
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XMLAttributes	TokenNameIdentifier	 XML Attributes
fAttributes	TokenNameIdentifier	 f Attributes
;	TokenNameSEMICOLON	
/** * the type of the grammar (e.g., DTD or XSD); * * @see org.apache.xerces.xni.grammars.Grammar */	TokenNameCOMMENT_JAVADOC	 the type of the grammar (e.g., DTD or XSD); * @see org.apache.xerces.xni.grammars.Grammar 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGrammarType	TokenNameIdentifier	 get Grammar Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
.	TokenNameDOT	
XML_SCHEMA	TokenNameIdentifier	 XML  SCHEMA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the context. The returned value is one of the pre-defined * CONTEXT_xxx constants. * * @return the value indicating the context */	TokenNameCOMMENT_JAVADOC	 Get the context. The returned value is one of the pre-defined CONTEXT_xxx constants. * @return the value indicating the context 
public	TokenNamepublic	
short	TokenNameshort	
getContextType	TokenNameIdentifier	 get Context Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fContextType	TokenNameIdentifier	 f Context Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the context is "include" or "redefine", then return the target * namespace of the enclosing schema document; otherwise, the expected * target namespace of this document. * * @return the expected/enclosing target namespace */	TokenNameCOMMENT_JAVADOC	 If the context is "include" or "redefine", then return the target namespace of the enclosing schema document; otherwise, the expected target namespace of this document. * @return the expected/enclosing target namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespace	TokenNameIdentifier	 f Namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For import and references from the instance document, it's possible to * have multiple hints for one namespace. So this method returns an array, * which contains all location hints. * * @return an array of all location hints associated to the expected * target namespace */	TokenNameCOMMENT_JAVADOC	 For import and references from the instance document, it's possible to have multiple hints for one namespace. So this method returns an array, which contains all location hints. * @return an array of all location hints associated to the expected target namespace 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLocationHints	TokenNameIdentifier	 get Location Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fLocationHints	TokenNameIdentifier	 f Location Hints
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If a call is triggered by an element/attribute/xsi:type in the instance, * this call returns the name of such triggering component: the name of * the element/attribute, or the value of the xsi:type. * * @return the name of the triggering component */	TokenNameCOMMENT_JAVADOC	 If a call is triggered by an element/attribute/xsi:type in the instance, this call returns the name of such triggering component: the name of the element/attribute, or the value of the xsi:type. * @return the name of the triggering component 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getTriggeringComponent	TokenNameIdentifier	 get Triggering Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fTriggeringComponent	TokenNameIdentifier	 f Triggering Component
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If a call is triggered by an attribute or xsi:type, then this mehtod * returns the enclosing element of such element. * * @return the name of the enclosing element */	TokenNameCOMMENT_JAVADOC	 If a call is triggered by an attribute or xsi:type, then this mehtod returns the enclosing element of such element. * @return the name of the enclosing element 
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getEnclosingElementName	TokenNameIdentifier	 get Enclosing Element Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEnclosedElementName	TokenNameIdentifier	 f Enclosed Element Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If a call is triggered by an element/attribute/xsi:type in the instance, * this call returns all attribute of such element (or enclosing element). * * @return all attributes of the tiggering/enclosing element */	TokenNameCOMMENT_JAVADOC	 If a call is triggered by an element/attribute/xsi:type in the instance, this call returns all attribute of such element (or enclosing element). * @return all attributes of the tiggering/enclosing element 
public	TokenNamepublic	
XMLAttributes	TokenNameIdentifier	 XML Attributes
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fAttributes	TokenNameIdentifier	 f Attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
fromInstance	TokenNameIdentifier	 from Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fContextType	TokenNameIdentifier	 f Context Type
==	TokenNameEQUAL_EQUAL	
CONTEXT_ATTRIBUTE	TokenNameIdentifier	 CONTEXT  ATTRIBUTE
||	TokenNameOR_OR	
fContextType	TokenNameIdentifier	 f Context Type
==	TokenNameEQUAL_EQUAL	
CONTEXT_ELEMENT	TokenNameIdentifier	 CONTEXT  ELEMENT
||	TokenNameOR_OR	
fContextType	TokenNameIdentifier	 f Context Type
==	TokenNameEQUAL_EQUAL	
CONTEXT_INSTANCE	TokenNameIdentifier	 CONTEXT  INSTANCE
||	TokenNameOR_OR	
fContextType	TokenNameIdentifier	 f Context Type
==	TokenNameEQUAL_EQUAL	
CONTEXT_XSITYPE	TokenNameIdentifier	 CONTEXT  XSITYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this grammar with the given grammar. Currently, we compare * the target namespaces. * * @param descObj The description of the grammar to be compared with * @return True if they are equal, else false */	TokenNameCOMMENT_JAVADOC	 Compares this grammar with the given grammar. Currently, we compare the target namespaces. * @param descObj The description of the grammar to be compared with @return True if they are equal, else false 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
descObj	TokenNameIdentifier	 desc Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
descObj	TokenNameIdentifier	 desc Obj
instanceof	TokenNameinstanceof	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLSchemaDescription	TokenNameIdentifier	 XML Schema Description
)	TokenNameRPAREN	
descObj	TokenNameIdentifier	 desc Obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
fNamespace	TokenNameIdentifier	 f Namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
// fNamespace == null 	TokenNameCOMMENT_LINE	fNamespace == null 
return	TokenNamereturn	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getTargetNamespace	TokenNameIdentifier	 get Target Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the hash code of this grammar * * @return The hash code */	TokenNameCOMMENT_JAVADOC	 Returns the hash code of this grammar * @return The hash code 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
fNamespace	TokenNameIdentifier	 f Namespace
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setContextType	TokenNameIdentifier	 set Context Type
(	TokenNameLPAREN	
short	TokenNameshort	
contextType	TokenNameIdentifier	 context Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fContextType	TokenNameIdentifier	 f Context Type
=	TokenNameEQUAL	
contextType	TokenNameIdentifier	 context Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTargetNamespace	TokenNameIdentifier	 set Target Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
targetNamespace	TokenNameIdentifier	 target Namespace
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
targetNamespace	TokenNameIdentifier	 target Namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLocationHints	TokenNameIdentifier	 set Location Hints
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
locationHints	TokenNameIdentifier	 location Hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
locationHints	TokenNameIdentifier	 location Hints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
fLocationHints	TokenNameIdentifier	 f Location Hints
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
locationHints	TokenNameIdentifier	 location Hints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fLocationHints	TokenNameIdentifier	 f Location Hints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//fLocationHints = locationHints ; 	TokenNameCOMMENT_LINE	fLocationHints = locationHints ; 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTriggeringComponent	TokenNameIdentifier	 set Triggering Component
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
triggeringComponent	TokenNameIdentifier	 triggering Component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fTriggeringComponent	TokenNameIdentifier	 f Triggering Component
=	TokenNameEQUAL	
triggeringComponent	TokenNameIdentifier	 triggering Component
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEnclosingElementName	TokenNameIdentifier	 set Enclosing Element Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
enclosedElementName	TokenNameIdentifier	 enclosed Element Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEnclosedElementName	TokenNameIdentifier	 f Enclosed Element Name
=	TokenNameEQUAL	
enclosedElementName	TokenNameIdentifier	 enclosed Element Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAttributes	TokenNameIdentifier	 set Attributes
(	TokenNameLPAREN	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * resets all the fields */	TokenNameCOMMENT_JAVADOC	 resets all the fields 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fContextType	TokenNameIdentifier	 f Context Type
=	TokenNameEQUAL	
CONTEXT_INITIALIZE	TokenNameIdentifier	 CONTEXT  INITIALIZE
;	TokenNameSEMICOLON	
fLocationHints	TokenNameIdentifier	 f Location Hints
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fTriggeringComponent	TokenNameIdentifier	 f Triggering Component
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fEnclosedElementName	TokenNameIdentifier	 f Enclosed Element Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XSDDescription	TokenNameIdentifier	 XSD Description
makeClone	TokenNameIdentifier	 make Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSDDescription	TokenNameIdentifier	 XSD Description
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
new	TokenNamenew	
XSDDescription	TokenNameIdentifier	 XSD Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fAttributes	TokenNameIdentifier	 f Attributes
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fBaseSystemId	TokenNameIdentifier	 f Base System Id
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fContextType	TokenNameIdentifier	 f Context Type
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fContextType	TokenNameIdentifier	 f Context Type
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fEnclosedElementName	TokenNameIdentifier	 f Enclosed Element Name
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fEnclosedElementName	TokenNameIdentifier	 f Enclosed Element Name
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fExpandedSystemId	TokenNameIdentifier	 f Expanded System Id
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fLiteralSystemId	TokenNameIdentifier	 f Literal System Id
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fLocationHints	TokenNameIdentifier	 f Location Hints
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fLocationHints	TokenNameIdentifier	 f Location Hints
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fPublicId	TokenNameIdentifier	 f Public Id
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fPublicId	TokenNameIdentifier	 f Public Id
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fNamespace	TokenNameIdentifier	 f Namespace
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
fTriggeringComponent	TokenNameIdentifier	 f Triggering Component
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
fTriggeringComponent	TokenNameIdentifier	 f Triggering Component
;	TokenNameSEMICOLON	
return	TokenNamereturn	
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// XSDDescription 	TokenNameCOMMENT_LINE	XSDDescription 
