/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TemplateList.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TemplateList.java 468643 2006-10-28 06:56:03Z minchau $ 
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
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
StepPattern	TokenNameIdentifier	 Step Pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
UnionPattern	TokenNameIdentifier	 Union Pattern
;	TokenNameSEMICOLON	
/** * Encapsulates a template list, and helps locate individual templates. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Encapsulates a template list, and helps locate individual templates. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
TemplateList	TokenNameIdentifier	 Template List
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
5803675288911728791L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct a TemplateList object. Needs to be public so it can * be invoked from the CompilingStylesheetHandler. */	TokenNameCOMMENT_JAVADOC	 Construct a TemplateList object. Needs to be public so it can be invoked from the CompilingStylesheetHandler. 
public	TokenNamepublic	
TemplateList	TokenNameIdentifier	 Template List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a template to the table of named templates and/or the table of templates * with match patterns. This routine should * be called in decreasing order of precedence but it checks nonetheless. * * @param template */	TokenNameCOMMENT_JAVADOC	 Add a template to the table of named templates and/or the table of templates with match patterns. This routine should be called in decreasing order of precedence but it checks nonetheless. * @param template 
public	TokenNamepublic	
void	TokenNamevoid	
setTemplate	TokenNameIdentifier	 set Template
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPath	TokenNameIdentifier	 X Path
matchXPath	TokenNameIdentifier	 match X Path
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
matchXPath	TokenNameIdentifier	 match X Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NEED_NAME_OR_MATCH_ATTRIB	TokenNameIdentifier	 ER  NEED  NAME  OR  MATCH  ATTRIB
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"xsl:template"	TokenNameStringLiteral	xsl:template
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplate	TokenNameIdentifier	 Elem Template
existingTemplate	TokenNameIdentifier	 existing Template
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
m_namedTemplates	TokenNameIdentifier	 m named Templates
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
existingTemplate	TokenNameIdentifier	 existing Template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namedTemplates	TokenNameIdentifier	 m named Templates
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
existingPrecedence	TokenNameIdentifier	 existing Precedence
=	TokenNameEQUAL	
existingTemplate	TokenNameIdentifier	 existing Template
.	TokenNameDOT	
getStylesheetComposed	TokenNameIdentifier	 get Stylesheet Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getImportCountComposed	TokenNameIdentifier	 get Import Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newPrecedence	TokenNameIdentifier	 new Precedence
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getStylesheetComposed	TokenNameIdentifier	 get Stylesheet Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getImportCountComposed	TokenNameIdentifier	 get Import Count Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newPrecedence	TokenNameIdentifier	 new Precedence
>	TokenNameGREATER	
existingPrecedence	TokenNameIdentifier	 existing Precedence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This should never happen 	TokenNameCOMMENT_LINE	This should never happen 
m_namedTemplates	TokenNameIdentifier	 m named Templates
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
newPrecedence	TokenNameIdentifier	 new Precedence
==	TokenNameEQUAL_EQUAL	
existingPrecedence	TokenNameIdentifier	 existing Precedence
)	TokenNameRPAREN	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_DUPLICATE_NAMED_TEMPLATE	TokenNameIdentifier	 ER  DUPLICATE  NAMED  TEMPLATE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
matchXPath	TokenNameIdentifier	 match X Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
matchExpr	TokenNameIdentifier	 match Expr
=	TokenNameEQUAL	
matchXPath	TokenNameIdentifier	 match X Path
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchExpr	TokenNameIdentifier	 match Expr
instanceof	TokenNameinstanceof	
StepPattern	TokenNameIdentifier	 Step Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertPatternInTable	TokenNameIdentifier	 insert Pattern In Table
(	TokenNameLPAREN	
(	TokenNameLPAREN	
StepPattern	TokenNameIdentifier	 Step Pattern
)	TokenNameRPAREN	
matchExpr	TokenNameIdentifier	 match Expr
,	TokenNameCOMMA	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
matchExpr	TokenNameIdentifier	 match Expr
instanceof	TokenNameinstanceof	
UnionPattern	TokenNameIdentifier	 Union Pattern
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UnionPattern	TokenNameIdentifier	 Union Pattern
upat	TokenNameIdentifier	 upat
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UnionPattern	TokenNameIdentifier	 Union Pattern
)	TokenNameRPAREN	
matchExpr	TokenNameIdentifier	 match Expr
;	TokenNameSEMICOLON	
StepPattern	TokenNameIdentifier	 Step Pattern
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pats	TokenNameIdentifier	 pats
=	TokenNameEQUAL	
upat	TokenNameIdentifier	 upat
.	TokenNameDOT	
getPatterns	TokenNameIdentifier	 get Patterns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
pats	TokenNameIdentifier	 pats
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
insertPatternInTable	TokenNameIdentifier	 insert Pattern In Table
(	TokenNameLPAREN	
pats	TokenNameIdentifier	 pats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// TODO: assert error 	TokenNameCOMMENT_LINE	TODO: assert error 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Flag to indicate whether in DEBUG mode */	TokenNameCOMMENT_JAVADOC	 Flag to indicate whether in DEBUG mode 
final	TokenNamefinal	
static	TokenNamestatic	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Dump all patterns and elements that match those patterns * */	TokenNameCOMMENT_JAVADOC	 Dump all patterns and elements that match those patterns 
void	TokenNamevoid	
dumpAssociationTables	TokenNameIdentifier	 dump Association Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
associations	TokenNameIdentifier	 associations
=	TokenNameEQUAL	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
associations	TokenNameIdentifier	 associations
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
associations	TokenNameIdentifier	 associations
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getTargetString	TokenNameIdentifier	 get Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" ....."	TokenNameStringLiteral	 .....
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
m_wildCardPatterns	TokenNameIdentifier	 m wild Card Patterns
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"wild card list: "	TokenNameStringLiteral	wild card list: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getTargetString	TokenNameIdentifier	 get Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getPattern	TokenNameIdentifier	 get Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" ....."	TokenNameStringLiteral	 .....
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * After all templates have been added, this function * should be called. */	TokenNameCOMMENT_JAVADOC	 After all templates have been added, this function should be called. 
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Before wildcard insert..."	TokenNameStringLiteral	Before wildcard insert...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dumpAssociationTables	TokenNameIdentifier	 dump Association Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_wildCardPatterns	TokenNameIdentifier	 m wild Card Patterns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
associations	TokenNameIdentifier	 associations
=	TokenNameEQUAL	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
associations	TokenNameIdentifier	 associations
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
associations	TokenNameIdentifier	 associations
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
wild	TokenNameIdentifier	 wild
=	TokenNameEQUAL	
m_wildCardPatterns	TokenNameIdentifier	 m wild Card Patterns
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
wild	TokenNameIdentifier	 wild
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
insertAssociationIntoList	TokenNameIdentifier	 insert Association Into List
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
wild	TokenNameIdentifier	 wild
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
wild	TokenNameIdentifier	 wild
=	TokenNameEQUAL	
wild	TokenNameIdentifier	 wild
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"After wildcard insert..."	TokenNameStringLiteral	After wildcard insert...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dumpAssociationTables	TokenNameIdentifier	 dump Association Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Insert the given TemplateSubPatternAssociation into the the linked * list. Sort by import precedence, then priority, then by document order. * * @param head The first TemplateSubPatternAssociation in the linked list. * @param item The item that we want to insert into the proper place. * @param isWildCardInsert <code>true</code> if we are inserting a wild card * template onto this list. * @return the new head of the list. */	TokenNameCOMMENT_JAVADOC	 Insert the given TemplateSubPatternAssociation into the the linked list. Sort by import precedence, then priority, then by document order. * @param head The first TemplateSubPatternAssociation in the linked list. @param item The item that we want to insert into the proper place. @param isWildCardInsert <code>true</code> if we are inserting a wild card template onto this list. @return the new head of the list. 
private	TokenNameprivate	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
insertAssociationIntoList	TokenNameIdentifier	 insert Association Into List
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
item	TokenNameIdentifier	 item
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isWildCardInsert	TokenNameIdentifier	 is Wild Card Insert
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Sort first by import level (higher level is at front), 	TokenNameCOMMENT_LINE	Sort first by import level (higher level is at front), 
// then by priority (highest priority is at front), 	TokenNameCOMMENT_LINE	then by priority (highest priority is at front), 
// then by document order (later in document is at front). 	TokenNameCOMMENT_LINE	then by document order (later in document is at front). 
double	TokenNamedouble	
priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
getPriorityOrScore	TokenNameIdentifier	 get Priority Or Score
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
workPriority	TokenNameIdentifier	 work Priority
;	TokenNameSEMICOLON	
int	TokenNameint	
importLevel	TokenNameIdentifier	 import Level
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
docOrder	TokenNameIdentifier	 doc Order
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getDocOrderPos	TokenNameIdentifier	 get Doc Order Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
insertPoint	TokenNameIdentifier	 insert Point
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
insertBefore	TokenNameIdentifier	 insert Before
;	TokenNameSEMICOLON	
// true means insert before insertPoint; otherwise after 	TokenNameCOMMENT_LINE	true means insert before insertPoint; otherwise after 
// This can only be true if insertPoint is pointing to 	TokenNameCOMMENT_LINE	This can only be true if insertPoint is pointing to 
// the first or last template. 	TokenNameCOMMENT_LINE	the first or last template. 
// Spin down so that insertPoint points to: 	TokenNameCOMMENT_LINE	Spin down so that insertPoint points to: 
// (a) the template immediately _before_ the first template on the chain with 	TokenNameCOMMENT_LINE	(a) the template immediately _before_ the first template on the chain with 
// a precedence that is either (i) less than ours or (ii) the same as ours but 	TokenNameCOMMENT_LINE	a precedence that is either (i) less than ours or (ii) the same as ours but 
// the template document position is less than ours 	TokenNameCOMMENT_LINE	the template document position is less than ours 
// -or- 	TokenNameCOMMENT_LINE	-or- 
// (b) the last template on the chain if no such template described in (a) exists. 	TokenNameCOMMENT_LINE	(b) the last template on the chain if no such template described in (a) exists. 
// If we are pointing to the first template or the last template (that is, case b), 	TokenNameCOMMENT_LINE	If we are pointing to the first template or the last template (that is, case b), 
// we need to determine whether to insert before or after the template. Otherwise, 	TokenNameCOMMENT_LINE	we need to determine whether to insert before or after the template. Otherwise, 
// we always insert after the insertPoint. 	TokenNameCOMMENT_LINE	we always insert after the insertPoint. 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
insertPoint	TokenNameIdentifier	 insert Point
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
workPriority	TokenNameIdentifier	 work Priority
=	TokenNameEQUAL	
getPriorityOrScore	TokenNameIdentifier	 get Priority Or Score
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
importLevel	TokenNameIdentifier	 import Level
>	TokenNameGREATER	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
importLevel	TokenNameIdentifier	 import Level
<	TokenNameLESS	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
insertPoint	TokenNameIdentifier	 insert Point
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
>	TokenNameGREATER	
workPriority	TokenNameIdentifier	 work Priority
)	TokenNameRPAREN	
// import precedence is equal 	TokenNameCOMMENT_LINE	import precedence is equal 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
<	TokenNameLESS	
workPriority	TokenNameIdentifier	 work Priority
)	TokenNameRPAREN	
insertPoint	TokenNameIdentifier	 insert Point
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
docOrder	TokenNameIdentifier	 doc Order
>=	TokenNameGREATER_EQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
getDocOrderPos	TokenNameIdentifier	 get Doc Order Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// priorities, import are equal 	TokenNameCOMMENT_LINE	priorities, import are equal 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
insertPoint	TokenNameIdentifier	 insert Point
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
insertPoint	TokenNameIdentifier	 insert Point
==	TokenNameEQUAL_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// insert point is first or last 	TokenNameCOMMENT_LINE	insert point is first or last 
{	TokenNameLBRACE	
workPriority	TokenNameIdentifier	 work Priority
=	TokenNameEQUAL	
getPriorityOrScore	TokenNameIdentifier	 get Priority Or Score
(	TokenNameLPAREN	
insertPoint	TokenNameIdentifier	 insert Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
importLevel	TokenNameIdentifier	 import Level
>	TokenNameGREATER	
insertPoint	TokenNameIdentifier	 insert Point
.	TokenNameDOT	
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
insertBefore	TokenNameIdentifier	 insert Before
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
importLevel	TokenNameIdentifier	 import Level
<	TokenNameLESS	
insertPoint	TokenNameIdentifier	 insert Point
.	TokenNameDOT	
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
insertBefore	TokenNameIdentifier	 insert Before
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
>	TokenNameGREATER	
workPriority	TokenNameIdentifier	 work Priority
)	TokenNameRPAREN	
insertBefore	TokenNameIdentifier	 insert Before
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
<	TokenNameLESS	
workPriority	TokenNameIdentifier	 work Priority
)	TokenNameRPAREN	
insertBefore	TokenNameIdentifier	 insert Before
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
docOrder	TokenNameIdentifier	 doc Order
>=	TokenNameGREATER_EQUAL	
insertPoint	TokenNameIdentifier	 insert Point
.	TokenNameDOT	
getDocOrderPos	TokenNameIdentifier	 get Doc Order Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
insertBefore	TokenNameIdentifier	 insert Before
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
else	TokenNameelse	
insertBefore	TokenNameIdentifier	 insert Before
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
insertBefore	TokenNameIdentifier	 insert Before
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// System.out.println("appending: "+target+" to "+matchPat.getPattern()); 	TokenNameCOMMENT_LINE	System.out.println("appending: "+target+" to "+matchPat.getPattern()); 
if	TokenNameif	
(	TokenNameLPAREN	
isWildCardInsert	TokenNameIdentifier	 is Wild Card Insert
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
insertBefore	TokenNameIdentifier	 insert Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
insertPoint	TokenNameIdentifier	 insert Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
insertPoint	TokenNameIdentifier	 insert Point
.	TokenNameDOT	
getTargetString	TokenNameIdentifier	 get Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setTargetString	TokenNameIdentifier	 set Target String
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
putHead	TokenNameIdentifier	 put Head
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertPoint	TokenNameIdentifier	 insert Point
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
insertBefore	TokenNameIdentifier	 insert Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
insertPoint	TokenNameIdentifier	 insert Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
insertPoint	TokenNameIdentifier	 insert Point
.	TokenNameDOT	
isWild	TokenNameIdentifier	 is Wild
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
isWild	TokenNameIdentifier	 is Wild
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_wildCardPatterns	TokenNameIdentifier	 m wild Card Patterns
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
else	TokenNameelse	
putHead	TokenNameIdentifier	 put Head
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getTargetString	TokenNameIdentifier	 get Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertPoint	TokenNameIdentifier	 insert Point
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add a template to the template list. * * @param pattern * @param template */	TokenNameCOMMENT_JAVADOC	 Add a template to the template list. * @param pattern @param template 
private	TokenNameprivate	
void	TokenNamevoid	
insertPatternInTable	TokenNameIdentifier	 insert Pattern In Table
(	TokenNameLPAREN	
StepPattern	TokenNameIdentifier	 Step Pattern
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
pattern	TokenNameIdentifier	 pattern
.	TokenNameDOT	
getTargetString	TokenNameIdentifier	 get Target String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pstring	TokenNameIdentifier	 pstring
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
association	TokenNameIdentifier	 association
=	TokenNameEQUAL	
new	TokenNamenew	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
,	TokenNameCOMMA	
pattern	TokenNameIdentifier	 pattern
,	TokenNameCOMMA	
pstring	TokenNameIdentifier	 pstring
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// See if there's already one there 	TokenNameCOMMENT_LINE	See if there's already one there 
boolean	TokenNameboolean	
isWildCard	TokenNameIdentifier	 is Wild Card
=	TokenNameEQUAL	
association	TokenNameIdentifier	 association
.	TokenNameDOT	
isWild	TokenNameIdentifier	 is Wild
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
isWildCard	TokenNameIdentifier	 is Wild Card
?	TokenNameQUESTION	
m_wildCardPatterns	TokenNameIdentifier	 m wild Card Patterns
:	TokenNameCOLON	
getHead	TokenNameIdentifier	 get Head
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isWildCard	TokenNameIdentifier	 is Wild Card
)	TokenNameRPAREN	
m_wildCardPatterns	TokenNameIdentifier	 m wild Card Patterns
=	TokenNameEQUAL	
association	TokenNameIdentifier	 association
;	TokenNameSEMICOLON	
else	TokenNameelse	
putHead	TokenNameIdentifier	 put Head
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
association	TokenNameIdentifier	 association
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
insertAssociationIntoList	TokenNameIdentifier	 insert Association Into List
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
association	TokenNameIdentifier	 association
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a match pattern and template association, return the * score of that match. This score or priority can always be * statically calculated. * * @param matchPat The match pattern to template association. * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}, or * the value defined by the priority attribute of the template. * */	TokenNameCOMMENT_JAVADOC	 Given a match pattern and template association, return the score of that match. This score or priority can always be statically calculated. * @param matchPat The match pattern to template association. * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}, or the value defined by the priority attribute of the template. 
private	TokenNameprivate	
double	TokenNamedouble	
getPriorityOrScore	TokenNameIdentifier	 get Priority Or Score
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
matchPat	TokenNameIdentifier	 match Pat
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
matchPat	TokenNameIdentifier	 match Pat
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
==	TokenNameEQUAL_EQUAL	
XPath	TokenNameIdentifier	 X Path
.	TokenNameDOT	
MATCH_SCORE_NONE	TokenNameIdentifier	 MATCH  SCORE  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
matchPat	TokenNameIdentifier	 match Pat
.	TokenNameDOT	
getStepPattern	TokenNameIdentifier	 get Step Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
instanceof	TokenNameinstanceof	
NodeTest	TokenNameIdentifier	 Node Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
)	TokenNameRPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
.	TokenNameDOT	
getDefaultScore	TokenNameIdentifier	 get Default Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Locate a named template. * * @param qname Qualified name of the template. * * @return Template argument with the requested name, or null if not found. */	TokenNameCOMMENT_JAVADOC	 Locate a named template. * @param qname Qualified name of the template. * @return Template argument with the requested name, or null if not found. 
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
m_namedTemplates	TokenNameIdentifier	 m named Templates
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the head of the most likely list of associations to check, based on * the name and type of the targetNode argument. * * @param xctxt The XPath runtime context. * @param targetNode The target node that will be checked for a match. * @param dtm The dtm owner for the target node. * * @return The head of a linked list that contains all possible match pattern to * template associations. */	TokenNameCOMMENT_JAVADOC	 Get the head of the most likely list of associations to check, based on the name and type of the targetNode argument. * @param xctxt The XPath runtime context. @param targetNode The target node that will be checked for a match. @param dtm The dtm owner for the target node. * @return The head of a linked list that contains all possible match pattern to template associations. 
public	TokenNamepublic	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
getHead	TokenNameIdentifier	 get Head
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
targetNodeType	TokenNameIdentifier	 target Node Type
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
targetNodeType	TokenNameIdentifier	 target Node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
m_textPatterns	TokenNameIdentifier	 m text Patterns
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %REVIEW% I think this is right 	TokenNameCOMMENT_LINE	%REVIEW% I think this is right 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
m_commentPatterns	TokenNameIdentifier	 m comment Patterns
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
m_docPatterns	TokenNameIdentifier	 m doc Patterns
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %REVIEW% I think this is right 	TokenNameCOMMENT_LINE	%REVIEW% I think this is right 
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_wildCardPatterns	TokenNameIdentifier	 m wild Card Patterns
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a target element, find the template that best * matches in the given XSL document, according * to the rules specified in the xsl draft. This variation of getTemplate * assumes the current node and current expression node have already been * pushed. * * @param xctxt * @param targetNode * @param mode A string indicating the display mode. * @param maxImportLevel The maximum importCountComposed that we should consider or -1 * if we should consider all import levels. This is used by apply-imports to * access templates that have been overridden. * @param quietConflictWarnings * @return Rule that best matches targetElem. * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Given a target element, find the template that best matches in the given XSL document, according to the rules specified in the xsl draft. This variation of getTemplate assumes the current node and current expression node have already been pushed. * @param xctxt @param targetNode @param mode A string indicating the display mode. @param maxImportLevel The maximum importCountComposed that we should consider or -1 if we should consider all import levels. This is used by apply-imports to access templates that have been overridden. @param quietConflictWarnings @return Rule that best matches targetElem. @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException 
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
getTemplateFast	TokenNameIdentifier	 get Template Fast
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
int	TokenNameint	
expTypeID	TokenNameIdentifier	 exp Type ID
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
int	TokenNameint	
maxImportLevel	TokenNameIdentifier	 max Import Level
,	TokenNameCOMMA	
boolean	TokenNameboolean	
quietConflictWarnings	TokenNameIdentifier	 quiet Conflict Warnings
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalNameFromExpandedNameID	TokenNameIdentifier	 get Local Name From Expanded Name ID
(	TokenNameLPAREN	
expTypeID	TokenNameIdentifier	 exp Type ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
m_textPatterns	TokenNameIdentifier	 m text Patterns
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %REVIEW% I think this is right 	TokenNameCOMMENT_LINE	%REVIEW% I think this is right 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
m_commentPatterns	TokenNameIdentifier	 m comment Patterns
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
m_docPatterns	TokenNameIdentifier	 m doc Patterns
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
:	TokenNameCOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %REVIEW% I think this is right 	TokenNameCOMMENT_LINE	%REVIEW% I think this is right 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
m_wildCardPatterns	TokenNameIdentifier	 m wild Card Patterns
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XSLT functions, such as xsl:key, need to be able to get to 	TokenNameCOMMENT_LINE	XSLT functions, such as xsl:key, need to be able to get to 
// current ElemTemplateElement via a cast to the prefix resolver. 	TokenNameCOMMENT_LINE	current ElemTemplateElement via a cast to the prefix resolver. 
// Setting this fixes bug idkey03. 	TokenNameCOMMENT_LINE	Setting this fixes bug idkey03. 
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushNamespaceContextNull	TokenNameIdentifier	 push Namespace Context Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxImportLevel	TokenNameIdentifier	 max Import Level
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxImportLevel	TokenNameIdentifier	 max Import Level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
m_stepPattern	TokenNameIdentifier	 m step Pattern
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
expTypeID	TokenNameIdentifier	 exp Type ID
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
matchMode	TokenNameIdentifier	 match Mode
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quietConflictWarnings	TokenNameIdentifier	 quiet Conflict Warnings
)	TokenNameRPAREN	
checkConflicts	TokenNameIdentifier	 check Conflicts
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
template	TokenNameIdentifier	 template
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popNamespaceContext	TokenNameIdentifier	 pop Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end findTemplate 	TokenNameCOMMENT_LINE	end findTemplate 
/** * Given a target element, find the template that best * matches in the given XSL document, according * to the rules specified in the xsl draft. * * @param xctxt * @param targetNode * @param mode A string indicating the display mode. * @param quietConflictWarnings * @return Rule that best matches targetElem. * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Given a target element, find the template that best matches in the given XSL document, according to the rules specified in the xsl draft. * @param xctxt @param targetNode @param mode A string indicating the display mode. @param quietConflictWarnings @return Rule that best matches targetElem. @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException 
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
boolean	TokenNameboolean	
quietConflictWarnings	TokenNameIdentifier	 quiet Conflict Warnings
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
getHead	TokenNameIdentifier	 get Head
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XSLT functions, such as xsl:key, need to be able to get to 	TokenNameCOMMENT_LINE	XSLT functions, such as xsl:key, need to be able to get to 
// current ElemTemplateElement via a cast to the prefix resolver. 	TokenNameCOMMENT_LINE	current ElemTemplateElement via a cast to the prefix resolver. 
// Setting this fixes bug idkey03. 	TokenNameCOMMENT_LINE	Setting this fixes bug idkey03. 
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushNamespaceContextNull	TokenNameIdentifier	 push Namespace Context Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNodeAndExpression	TokenNameIdentifier	 push Current Node And Expression
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
m_stepPattern	TokenNameIdentifier	 m step Pattern
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
matchMode	TokenNameIdentifier	 match Mode
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quietConflictWarnings	TokenNameIdentifier	 quiet Conflict Warnings
)	TokenNameRPAREN	
checkConflicts	TokenNameIdentifier	 check Conflicts
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
template	TokenNameIdentifier	 template
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNodeAndExpression	TokenNameIdentifier	 pop Current Node And Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popNamespaceContext	TokenNameIdentifier	 pop Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end findTemplate 	TokenNameCOMMENT_LINE	end findTemplate 
/** * Given a target element, find the template that best * matches in the given XSL document, according * to the rules specified in the xsl draft. * * @param xctxt * @param targetNode * @param mode A string indicating the display mode. * @param maxImportLevel The maximum importCountComposed that we should consider or -1 * if we should consider all import levels. This is used by apply-imports to * access templates that have been overridden. * @param endImportLevel The count of composed imports * @param quietConflictWarnings * @return Rule that best matches targetElem. * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Given a target element, find the template that best matches in the given XSL document, according to the rules specified in the xsl draft. * @param xctxt @param targetNode @param mode A string indicating the display mode. @param maxImportLevel The maximum importCountComposed that we should consider or -1 if we should consider all import levels. This is used by apply-imports to access templates that have been overridden. @param endImportLevel The count of composed imports @param quietConflictWarnings @return Rule that best matches targetElem. @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException 
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
int	TokenNameint	
maxImportLevel	TokenNameIdentifier	 max Import Level
,	TokenNameCOMMA	
int	TokenNameint	
endImportLevel	TokenNameIdentifier	 end Import Level
,	TokenNameCOMMA	
boolean	TokenNameboolean	
quietConflictWarnings	TokenNameIdentifier	 quiet Conflict Warnings
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
getHead	TokenNameIdentifier	 get Head
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// XSLT functions, such as xsl:key, need to be able to get to 	TokenNameCOMMENT_LINE	XSLT functions, such as xsl:key, need to be able to get to 
// current ElemTemplateElement via a cast to the prefix resolver. 	TokenNameCOMMENT_LINE	current ElemTemplateElement via a cast to the prefix resolver. 
// Setting this fixes bug idkey03. 	TokenNameCOMMENT_LINE	Setting this fixes bug idkey03. 
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushNamespaceContextNull	TokenNameIdentifier	 push Namespace Context Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNodeAndExpression	TokenNameIdentifier	 push Current Node And Expression
(	TokenNameLPAREN	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
maxImportLevel	TokenNameIdentifier	 max Import Level
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxImportLevel	TokenNameIdentifier	 max Import Level
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getImportLevel	TokenNameIdentifier	 get Import Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
maxImportLevel	TokenNameIdentifier	 max Import Level
-	TokenNameMINUS	
endImportLevel	TokenNameIdentifier	 end Import Level
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
m_stepPattern	TokenNameIdentifier	 m step Pattern
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
matchMode	TokenNameIdentifier	 match Mode
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quietConflictWarnings	TokenNameIdentifier	 quiet Conflict Warnings
)	TokenNameRPAREN	
checkConflicts	TokenNameIdentifier	 check Conflicts
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
template	TokenNameIdentifier	 template
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNodeAndExpression	TokenNameIdentifier	 pop Current Node And Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popNamespaceContext	TokenNameIdentifier	 pop Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end findTemplate 	TokenNameCOMMENT_LINE	end findTemplate 
/** * Get a TemplateWalker for use by a compiler. See the documentation for * the TreeWalker inner class for further details. */	TokenNameCOMMENT_JAVADOC	 Get a TemplateWalker for use by a compiler. See the documentation for the TreeWalker inner class for further details. 
public	TokenNamepublic	
TemplateWalker	TokenNameIdentifier	 Template Walker
getWalker	TokenNameIdentifier	 get Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TemplateWalker	TokenNameIdentifier	 Template Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check for match conflicts, and warn the stylesheet author. * * @param head Template pattern * @param xctxt Current XPath context * @param targetNode Node matching the pattern * @param mode reference, which may be null, to the <a href="http://www.w3.org/TR/xslt#modes">current mode</a>. */	TokenNameCOMMENT_JAVADOC	 Check for match conflicts, and warn the stylesheet author. * @param head Template pattern @param xctxt Current XPath context @param targetNode Node matching the pattern @param mode reference, which may be null, to the <a href="http://www.w3.org/TR/xslt#modes">current mode</a>. 
private	TokenNameprivate	
void	TokenNamevoid	
checkConflicts	TokenNameIdentifier	 check Conflicts
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
targetNode	TokenNameIdentifier	 target Node
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Check for conflicts. 	TokenNameCOMMENT_LINE	TODO: Check for conflicts. 
}	TokenNameRBRACE	
/** * Add object to vector if not already there. * * @param obj * @param v */	TokenNameCOMMENT_JAVADOC	 Add object to vector if not already there. * @param obj @param v 
private	TokenNameprivate	
void	TokenNamevoid	
addObjectIfNotFound	TokenNameIdentifier	 add Object If Not Found
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
addIt	TokenNameIdentifier	 add It
=	TokenNameEQUAL	
true	TokenNametrue	
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
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addIt	TokenNameIdentifier	 add It
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
addIt	TokenNameIdentifier	 add It
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Keyed on string macro names, and holding values * that are macro elements in the XSL DOM tree. * Initialized in initMacroLookupTable, and used in * findNamedTemplate. * @serial */	TokenNameCOMMENT_JAVADOC	 Keyed on string macro names, and holding values that are macro elements in the XSL DOM tree. Initialized in initMacroLookupTable, and used in findNamedTemplate. @serial 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_namedTemplates	TokenNameIdentifier	 m named Templates
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This table is keyed on the target elements * of patterns, and contains linked lists of * the actual patterns that match the target element * to some degree of specifity. * @serial */	TokenNameCOMMENT_JAVADOC	 This table is keyed on the target elements of patterns, and contains linked lists of the actual patterns that match the target element to some degree of specifity. @serial 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_patternTable	TokenNameIdentifier	 m pattern Table
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
89	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Wildcard patterns. * @serial */	TokenNameCOMMENT_JAVADOC	 Wildcard patterns. @serial 
private	TokenNameprivate	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
m_wildCardPatterns	TokenNameIdentifier	 m wild Card Patterns
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Text Patterns. * @serial */	TokenNameCOMMENT_JAVADOC	 Text Patterns. @serial 
private	TokenNameprivate	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
m_textPatterns	TokenNameIdentifier	 m text Patterns
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Root document Patterns. * @serial */	TokenNameCOMMENT_JAVADOC	 Root document Patterns. @serial 
private	TokenNameprivate	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
m_docPatterns	TokenNameIdentifier	 m doc Patterns
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Comment Patterns. * @serial */	TokenNameCOMMENT_JAVADOC	 Comment Patterns. @serial 
private	TokenNameprivate	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
m_commentPatterns	TokenNameIdentifier	 m comment Patterns
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get table of named Templates. * These are keyed on template names, and holding values * that are template elements. * * @return A Hashtable dictionary that contains {@link java.lang.String}s * as the keys, and {@link org.apache.xalan.templates.ElemTemplate}s as the * values. */	TokenNameCOMMENT_JAVADOC	 Get table of named Templates. These are keyed on template names, and holding values that are template elements. * @return A Hashtable dictionary that contains {@link java.lang.String}s as the keys, and {@link org.apache.xalan.templates.ElemTemplate}s as the values. 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
getNamedTemplates	TokenNameIdentifier	 get Named Templates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_namedTemplates	TokenNameIdentifier	 m named Templates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set table of named Templates. * These are keyed on string macro names, and holding values * that are template elements in the XSL DOM tree. * * @param v Hashtable dictionary that contains {@link java.lang.String}s * as the keys, and {@link org.apache.xalan.templates.ElemTemplate}s as the * values. */	TokenNameCOMMENT_JAVADOC	 Set table of named Templates. These are keyed on string macro names, and holding values that are template elements in the XSL DOM tree. * @param v Hashtable dictionary that contains {@link java.lang.String}s as the keys, and {@link org.apache.xalan.templates.ElemTemplate}s as the values. 
private	TokenNameprivate	
void	TokenNamevoid	
setNamedTemplates	TokenNameIdentifier	 set Named Templates
(	TokenNameLPAREN	
Hashtable	TokenNameIdentifier	 Hashtable
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_namedTemplates	TokenNameIdentifier	 m named Templates
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the head of the assocation list that is keyed by target. * * @param key The name of a node. * * @return The head of a linked list that contains all possible match pattern to * template associations for the given key. */	TokenNameCOMMENT_JAVADOC	 Get the head of the assocation list that is keyed by target. * @param key The name of a node. * @return The head of a linked list that contains all possible match pattern to template associations for the given key. 
private	TokenNameprivate	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
getHead	TokenNameIdentifier	 get Head
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the head of the assocation list that is keyed by target. * * @param key * @param assoc */	TokenNameCOMMENT_JAVADOC	 Get the head of the assocation list that is keyed by target. * @param key @param assoc 
private	TokenNameprivate	
void	TokenNamevoid	
putHead	TokenNameIdentifier	 put Head
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
assoc	TokenNameIdentifier	 assoc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_TEXT	TokenNameIdentifier	 PSEUDONAME  TEXT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_textPatterns	TokenNameIdentifier	 m text Patterns
=	TokenNameEQUAL	
assoc	TokenNameIdentifier	 assoc
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_ROOT	TokenNameIdentifier	 PSEUDONAME  ROOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_docPatterns	TokenNameIdentifier	 m doc Patterns
=	TokenNameEQUAL	
assoc	TokenNameIdentifier	 assoc
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
PsuedoNames	TokenNameIdentifier	 Psuedo Names
.	TokenNameDOT	
PSEUDONAME_COMMENT	TokenNameIdentifier	 PSEUDONAME  COMMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_commentPatterns	TokenNameIdentifier	 m comment Patterns
=	TokenNameEQUAL	
assoc	TokenNameIdentifier	 assoc
;	TokenNameSEMICOLON	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
assoc	TokenNameIdentifier	 assoc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An inner class used by a compiler to iterate over all of the ElemTemplates * stored in this TemplateList. The compiler can replace returned templates * with their compiled equivalent. */	TokenNameCOMMENT_JAVADOC	 An inner class used by a compiler to iterate over all of the ElemTemplates stored in this TemplateList. The compiler can replace returned templates with their compiled equivalent. 
public	TokenNamepublic	
class	TokenNameclass	
TemplateWalker	TokenNameIdentifier	 Template Walker
{	TokenNameLBRACE	
private	TokenNameprivate	
Enumeration	TokenNameIdentifier	 Enumeration
hashIterator	TokenNameIdentifier	 hash Iterator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
inPatterns	TokenNameIdentifier	 in Patterns
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
curPattern	TokenNameIdentifier	 cur Pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
m_compilerCache	TokenNameIdentifier	 m compiler Cache
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TemplateWalker	TokenNameIdentifier	 Template Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashIterator	TokenNameIdentifier	 hash Iterator
=	TokenNameEQUAL	
m_patternTable	TokenNameIdentifier	 m pattern Table
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inPatterns	TokenNameIdentifier	 in Patterns
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
curPattern	TokenNameIdentifier	 cur Pattern
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplate	TokenNameIdentifier	 Elem Template
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ElemTemplate	TokenNameIdentifier	 Elem Template
ct	TokenNameIdentifier	 ct
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inPatterns	TokenNameIdentifier	 in Patterns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
curPattern	TokenNameIdentifier	 cur Pattern
)	TokenNameRPAREN	
curPattern	TokenNameIdentifier	 cur Pattern
=	TokenNameEQUAL	
curPattern	TokenNameIdentifier	 cur Pattern
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
curPattern	TokenNameIdentifier	 cur Pattern
)	TokenNameRPAREN	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
curPattern	TokenNameIdentifier	 cur Pattern
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hashIterator	TokenNameIdentifier	 hash Iterator
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curPattern	TokenNameIdentifier	 cur Pattern
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TemplateSubPatternAssociation	TokenNameIdentifier	 Template Sub Pattern Association
)	TokenNameRPAREN	
hashIterator	TokenNameIdentifier	 hash Iterator
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
curPattern	TokenNameIdentifier	 cur Pattern
.	TokenNameDOT	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
inPatterns	TokenNameIdentifier	 in Patterns
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
hashIterator	TokenNameIdentifier	 hash Iterator
=	TokenNameEQUAL	
m_namedTemplates	TokenNameIdentifier	 m named Templates
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inPatterns	TokenNameIdentifier	 in Patterns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hashIterator	TokenNameIdentifier	 hash Iterator
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
retValue	TokenNameIdentifier	 ret Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
hashIterator	TokenNameIdentifier	 hash Iterator
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ct	TokenNameIdentifier	 ct
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
m_compilerCache	TokenNameIdentifier	 m compiler Cache
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
getUid	TokenNameIdentifier	 get Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ct	TokenNameIdentifier	 ct
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_compilerCache	TokenNameIdentifier	 m compiler Cache
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
retValue	TokenNameIdentifier	 ret Value
.	TokenNameDOT	
getUid	TokenNameIdentifier	 get Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
retValue	TokenNameIdentifier	 ret Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
retValue	TokenNameIdentifier	 ret Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
