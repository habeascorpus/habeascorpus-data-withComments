/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StylesheetComposed.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StylesheetComposed.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
/** * Represents a stylesheet that has methods that resolve includes and * imports. It has methods on it that * return "composed" properties, which mean that: * <ol> * <li>Properties that are aggregates, like OutputProperties, will * be composed of properties declared in this stylsheet and all * included stylesheets.</li> * <li>Properties that aren't found, will be searched for first in * the includes, and, if none are located, will be searched for in * the imports.</li> * <li>Properties in that are not atomic on a stylesheet will * have the form getXXXComposed. Some properties, like version and id, * are not inherited, and so won't have getXXXComposed methods.</li> * </ol> * <p>In some cases getXXXComposed methods may calculate the composed * values dynamically, while in other cases they may store the composed * values.</p> */	TokenNameCOMMENT_JAVADOC	 Represents a stylesheet that has methods that resolve includes and imports. It has methods on it that return "composed" properties, which mean that: <ol> <li>Properties that are aggregates, like OutputProperties, will be composed of properties declared in this stylsheet and all included stylesheets.</li> <li>Properties that aren't found, will be searched for first in the includes, and, if none are located, will be searched for in the imports.</li> <li>Properties in that are not atomic on a stylesheet will have the form getXXXComposed. Some properties, like version and id, are not inherited, and so won't have getXXXComposed methods.</li> </ol> <p>In some cases getXXXComposed methods may calculate the composed values dynamically, while in other cases they may store the composed values.</p> 
public	TokenNamepublic	
class	TokenNameclass	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
extends	TokenNameextends	
Stylesheet	TokenNameIdentifier	 Stylesheet
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3444072247410233923L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Uses an XSL stylesheet document. * @param parent The including or importing stylesheet. */	TokenNameCOMMENT_JAVADOC	 Uses an XSL stylesheet document. @param parent The including or importing stylesheet. 
public	TokenNamepublic	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this can be cast to a StylesheetComposed, meaning, you * can ask questions from getXXXComposed functions. * * @return True since this is a StylesheetComposed */	TokenNameCOMMENT_JAVADOC	 Tell if this can be cast to a StylesheetComposed, meaning, you can ask questions from getXXXComposed functions. * @return True since this is a StylesheetComposed 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAggregatedType	TokenNameIdentifier	 is Aggregated Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds all recomposable values for this precedence level into the recomposableElements Vector * that was passed in as the first parameter. All elements added to the * recomposableElements vector should extend ElemTemplateElement. * @param recomposableElements a Vector of ElemTemplateElement objects that we will add all of * our recomposable objects to. */	TokenNameCOMMENT_JAVADOC	 Adds all recomposable values for this precedence level into the recomposableElements Vector that was passed in as the first parameter. All elements added to the recomposableElements vector should extend ElemTemplateElement. @param recomposableElements a Vector of ElemTemplateElement objects that we will add all of our recomposable objects to. 
public	TokenNamepublic	
void	TokenNamevoid	
recompose	TokenNameIdentifier	 recompose
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
recomposableElements	TokenNameIdentifier	 recomposable Elements
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
//recomposeImports(); // Calculate the number of this import. 	TokenNameCOMMENT_LINE	recomposeImports(); // Calculate the number of this import. 
//recomposeIncludes(this); // Build the global include list for this stylesheet. 	TokenNameCOMMENT_LINE	recomposeIncludes(this); // Build the global include list for this stylesheet. 
// Now add in all of the recomposable elements at this precedence level 	TokenNameCOMMENT_LINE	Now add in all of the recomposable elements at this precedence level 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getIncludeCountComposed	TokenNameIdentifier	 get Include Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stylesheet	TokenNameIdentifier	 Stylesheet
included	TokenNameIdentifier	 included
=	TokenNameEQUAL	
getIncludeComposed	TokenNameIdentifier	 get Include Composed
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add in the output elements 	TokenNameCOMMENT_LINE	Add in the output elements 
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getOutputCount	TokenNameIdentifier	 get Output Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recomposableElements	TokenNameIdentifier	 recomposable Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getOutput	TokenNameIdentifier	 get Output
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Next, add in the attribute-set elements 	TokenNameCOMMENT_LINE	Next, add in the attribute-set elements 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getAttributeSetCount	TokenNameIdentifier	 get Attribute Set Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recomposableElements	TokenNameIdentifier	 recomposable Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getAttributeSet	TokenNameIdentifier	 get Attribute Set
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now the decimal-formats 	TokenNameCOMMENT_LINE	Now the decimal-formats 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getDecimalFormatCount	TokenNameIdentifier	 get Decimal Format Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recomposableElements	TokenNameIdentifier	 recomposable Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getDecimalFormat	TokenNameIdentifier	 get Decimal Format
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now the keys 	TokenNameCOMMENT_LINE	Now the keys 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getKeyCount	TokenNameIdentifier	 get Key Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recomposableElements	TokenNameIdentifier	 recomposable Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// And the namespace aliases 	TokenNameCOMMENT_LINE	And the namespace aliases 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getNamespaceAliasCount	TokenNameIdentifier	 get Namespace Alias Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recomposableElements	TokenNameIdentifier	 recomposable Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getNamespaceAlias	TokenNameIdentifier	 get Namespace Alias
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Next comes the templates 	TokenNameCOMMENT_LINE	Next comes the templates 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getTemplateCount	TokenNameIdentifier	 get Template Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recomposableElements	TokenNameIdentifier	 recomposable Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Then, the variables 	TokenNameCOMMENT_LINE	Then, the variables 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getVariableOrParamCount	TokenNameIdentifier	 get Variable Or Param Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recomposableElements	TokenNameIdentifier	 recomposable Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// And lastly the whitespace preserving and stripping elements 	TokenNameCOMMENT_LINE	And lastly the whitespace preserving and stripping elements 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getStripSpaceCount	TokenNameIdentifier	 get Strip Space Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recomposableElements	TokenNameIdentifier	 recomposable Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getStripSpace	TokenNameIdentifier	 get Strip Space
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getPreserveSpaceCount	TokenNameIdentifier	 get Preserve Space Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recomposableElements	TokenNameIdentifier	 recomposable Elements
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
.	TokenNameDOT	
getPreserveSpace	TokenNameIdentifier	 get Preserve Space
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Order in import chain. * @serial */	TokenNameCOMMENT_JAVADOC	 Order in import chain. @serial 
private	TokenNameprivate	
int	TokenNameint	
m_importNumber	TokenNameIdentifier	 m import Number
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The precedence of this stylesheet in the global import list. * The lowest precedence stylesheet is 0. A higher * number has a higher precedence. * @serial */	TokenNameCOMMENT_JAVADOC	 The precedence of this stylesheet in the global import list. The lowest precedence stylesheet is 0. A higher number has a higher precedence. @serial 
private	TokenNameprivate	
int	TokenNameint	
m_importCountComposed	TokenNameIdentifier	 m import Count Composed
;	TokenNameSEMICOLON	
/* The count of imports composed for this stylesheet */	TokenNameCOMMENT_BLOCK	 The count of imports composed for this stylesheet 
private	TokenNameprivate	
int	TokenNameint	
m_endImportCountComposed	TokenNameIdentifier	 m end Import Count Composed
;	TokenNameSEMICOLON	
/** * Recalculate the precedence of this stylesheet in the global * import list. The lowest precedence stylesheet is 0. A higher * number has a higher precedence. */	TokenNameCOMMENT_JAVADOC	 Recalculate the precedence of this stylesheet in the global import list. The lowest precedence stylesheet is 0. A higher number has a higher precedence. 
void	TokenNamevoid	
recomposeImports	TokenNameIdentifier	 recompose Imports
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_importNumber	TokenNameIdentifier	 m import Number
=	TokenNameEQUAL	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getImportNumber	TokenNameIdentifier	 get Import Number
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
globalImportCount	TokenNameIdentifier	 global Import Count
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getGlobalImportCount	TokenNameIdentifier	 get Global Import Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_importCountComposed	TokenNameIdentifier	 m import Count Composed
=	TokenNameEQUAL	
(	TokenNameLPAREN	
globalImportCount	TokenNameIdentifier	 global Import Count
-	TokenNameMINUS	
m_importNumber	TokenNameIdentifier	 m import Number
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Now get the count of composed imports from this stylesheet's imports 	TokenNameCOMMENT_LINE	Now get the count of composed imports from this stylesheet's imports 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
getImportCount	TokenNameIdentifier	 get Import Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_endImportCountComposed	TokenNameIdentifier	 m end Import Count Composed
+=	TokenNamePLUS_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_endImportCountComposed	TokenNameIdentifier	 m end Import Count Composed
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getImport	TokenNameIdentifier	 get Import
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndImportCountComposed	TokenNameIdentifier	 get End Import Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now get the count of composed imports from this stylesheet's 	TokenNameCOMMENT_LINE	Now get the count of composed imports from this stylesheet's 
// composed includes. 	TokenNameCOMMENT_LINE	composed includes. 
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
getIncludeCountComposed	TokenNameIdentifier	 get Include Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
imports	TokenNameIdentifier	 imports
=	TokenNameEQUAL	
getIncludeComposed	TokenNameIdentifier	 get Include Composed
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
.	TokenNameDOT	
getImportCount	TokenNameIdentifier	 get Import Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_endImportCountComposed	TokenNameIdentifier	 m end Import Count Composed
+=	TokenNamePLUS_EQUAL	
imports	TokenNameIdentifier	 imports
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
imports	TokenNameIdentifier	 imports
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_endImportCountComposed	TokenNameIdentifier	 m end Import Count Composed
+=	TokenNamePLUS_EQUAL	
getIncludeComposed	TokenNameIdentifier	 get Include Composed
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
.	TokenNameDOT	
getImport	TokenNameIdentifier	 get Import
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
imports	TokenNameIdentifier	 imports
)	TokenNameRPAREN	
.	TokenNameDOT	
getEndImportCountComposed	TokenNameIdentifier	 get End Import Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a stylesheet from the "import" list. * @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * * @param i Index of stylesheet in import list * * @return The stylesheet at the given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get a stylesheet from the "import" list. @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * @param i Index of stylesheet in import list * @return The stylesheet at the given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
getImportComposed	TokenNameIdentifier	 get Import Composed
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the stylesheet that is offset past this stylesheet. 	TokenNameCOMMENT_LINE	Get the stylesheet that is offset past this stylesheet. 
// Thus, if the index of this stylesheet is 3, an argument 	TokenNameCOMMENT_LINE	Thus, if the index of this stylesheet is 3, an argument 
// to getImportComposed of 0 will return the 4th stylesheet 	TokenNameCOMMENT_LINE	to getImportComposed of 0 will return the 4th stylesheet 
// in the global import list. 	TokenNameCOMMENT_LINE	in the global import list. 
return	TokenNamereturn	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getGlobalImport	TokenNameIdentifier	 get Global Import
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
m_importNumber	TokenNameIdentifier	 m import Number
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the precedence of this stylesheet in the global import list. * The lowest precedence is 0. A higher number has a higher precedence. * @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * * @return the precedence of this stylesheet in the global import list. */	TokenNameCOMMENT_JAVADOC	 Get the precedence of this stylesheet in the global import list. The lowest precedence is 0. A higher number has a higher precedence. @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * @return the precedence of this stylesheet in the global import list. 
public	TokenNamepublic	
int	TokenNameint	
getImportCountComposed	TokenNameIdentifier	 get Import Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_importCountComposed	TokenNameIdentifier	 m import Count Composed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of import in this stylesheet's composed list. * * @return the number of imports in this stylesheet's composed list. */	TokenNameCOMMENT_JAVADOC	 Get the number of import in this stylesheet's composed list. * @return the number of imports in this stylesheet's composed list. 
public	TokenNamepublic	
int	TokenNameint	
getEndImportCountComposed	TokenNameIdentifier	 get End Import Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_endImportCountComposed	TokenNameIdentifier	 m end Import Count Composed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The combined list of includes. * @serial */	TokenNameCOMMENT_JAVADOC	 The combined list of includes. @serial 
private	TokenNameprivate	
transient	TokenNametransient	
Vector	TokenNameIdentifier	 Vector
m_includesComposed	TokenNameIdentifier	 m includes Composed
;	TokenNameSEMICOLON	
/** * Recompose the value of the composed include list. Builds a composite * list of all stylesheets included by this stylesheet to any depth. * * @param including Stylesheet to recompose */	TokenNameCOMMENT_JAVADOC	 Recompose the value of the composed include list. Builds a composite list of all stylesheets included by this stylesheet to any depth. * @param including Stylesheet to recompose 
void	TokenNamevoid	
recomposeIncludes	TokenNameIdentifier	 recompose Includes
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
including	TokenNameIdentifier	 including
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
including	TokenNameIdentifier	 including
.	TokenNameDOT	
getIncludeCount	TokenNameIdentifier	 get Include Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_includesComposed	TokenNameIdentifier	 m includes Composed
)	TokenNameRPAREN	
m_includesComposed	TokenNameIdentifier	 m includes Composed
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Stylesheet	TokenNameIdentifier	 Stylesheet
included	TokenNameIdentifier	 included
=	TokenNameEQUAL	
including	TokenNameIdentifier	 including
.	TokenNameDOT	
getInclude	TokenNameIdentifier	 get Include
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_includesComposed	TokenNameIdentifier	 m includes Composed
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recomposeIncludes	TokenNameIdentifier	 recompose Includes
(	TokenNameLPAREN	
included	TokenNameIdentifier	 included
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get an "xsl:include" property. * @see <a href="http://www.w3.org/TR/xslt#include">include in XSLT Specification</a> * * @param i Index of stylesheet in "include" list * * @return The stylesheet at the given index in the "include" list * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get an "xsl:include" property. @see <a href="http://www.w3.org/TR/xslt#include">include in XSLT Specification</a> * @param i Index of stylesheet in "include" list * @return The stylesheet at the given index in the "include" list * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
Stylesheet	TokenNameIdentifier	 Stylesheet
getIncludeComposed	TokenNameIdentifier	 get Include Composed
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_includesComposed	TokenNameIdentifier	 m includes Composed
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
m_includesComposed	TokenNameIdentifier	 m includes Composed
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of included stylesheets. * @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * * @return the number of included stylesheets. */	TokenNameCOMMENT_JAVADOC	 Get the number of included stylesheets. @see <a href="http://www.w3.org/TR/xslt#import">import in XSLT Specification</a> * @return the number of included stylesheets. 
public	TokenNamepublic	
int	TokenNameint	
getIncludeCountComposed	TokenNameIdentifier	 get Include Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_includesComposed	TokenNameIdentifier	 m includes Composed
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_includesComposed	TokenNameIdentifier	 m includes Composed
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For compilation support, we need the option of overwriting * (rather than appending to) previous composition. * We could phase out the old API in favor of this one, but I'm * holding off until we've made up our minds about compilation. * ADDED 9/5/2000 to support compilation experiment. * NOTE: GLP 29-Nov-00 I've left this method in so that CompilingStylesheetHandler will compile. However, * I'm not sure why it's needed or what it does and I've commented out the body. * * @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> * @param flushFirst Flag indicating the option of overwriting * (rather than appending to) previous composition. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 For compilation support, we need the option of overwriting (rather than appending to) previous composition. We could phase out the old API in favor of this one, but I'm holding off until we've made up our minds about compilation. ADDED 9/5/2000 to support compilation experiment. NOTE: GLP 29-Nov-00 I've left this method in so that CompilingStylesheetHandler will compile. However, I'm not sure why it's needed or what it does and I've commented out the body. * @see <a href="http://www.w3.org/TR/xslt#section-Defining-Template-Rules">section-Defining-Template-Rules in XSLT Specification</a> @param flushFirst Flag indicating the option of overwriting (rather than appending to) previous composition. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
recomposeTemplates	TokenNameIdentifier	 recompose Templates
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flushFirst	TokenNameIdentifier	 flush First
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
/*************************************** KEEP METHOD IN FOR COMPILATION if (flushFirst) m_templateList = new TemplateList(this); recomposeTemplates(); *****************************************/	TokenNameCOMMENT_JAVADOC	************************************* KEEP METHOD IN FOR COMPILATION if (flushFirst) m_templateList = new TemplateList(this); recomposeTemplates(); ****************************************
}	TokenNameRBRACE	
}	TokenNameRBRACE	
