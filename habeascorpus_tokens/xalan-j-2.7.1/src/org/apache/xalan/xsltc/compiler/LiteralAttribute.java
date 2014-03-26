/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: LiteralAttribute.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: LiteralAttribute.java 468650 2006-10-28 07:03:30Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
InstructionList	TokenNameIdentifier	 Instruction List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
PUSH	TokenNameIdentifier	 PUSH
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ClassGenerator	TokenNameIdentifier	 Class Generator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MethodGenerator	TokenNameIdentifier	 Method Generator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TypeCheckError	TokenNameIdentifier	 Type Check Error
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Util	TokenNameIdentifier	 Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
ElemDesc	TokenNameIdentifier	 Elem Desc
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
final	TokenNamefinal	
class	TokenNameclass	
LiteralAttribute	TokenNameIdentifier	 Literal Attribute
extends	TokenNameextends	
Instruction	TokenNameIdentifier	 Instruction
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
_name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
// Attribute name (incl. prefix) 	TokenNameCOMMENT_LINE	Attribute name (incl. prefix) 
private	TokenNameprivate	
final	TokenNamefinal	
AttributeValue	TokenNameIdentifier	 Attribute Value
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// Attribute value 	TokenNameCOMMENT_LINE	Attribute value 
/** * Creates a new literal attribute (but does not insert it into the AST). * @param name the attribute name (incl. prefix) as a String. * @param value the attribute value. * @param parser the XSLT parser (wraps XPath parser). */	TokenNameCOMMENT_JAVADOC	 Creates a new literal attribute (but does not insert it into the AST). @param name the attribute name (incl. prefix) as a String. @param value the attribute value. @param parser the XSLT parser (wraps XPath parser). 
public	TokenNamepublic	
LiteralAttribute	TokenNameIdentifier	 Literal Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
AttributeValue	TokenNameIdentifier	 Attribute Value
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
display	TokenNameIdentifier	 display
(	TokenNameLPAREN	
int	TokenNameint	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"LiteralAttribute name="	TokenNameStringLiteral	LiteralAttribute name=
+	TokenNamePLUS	
_name	TokenNameIdentifier	 name
+	TokenNamePLUS	
" value="	TokenNameStringLiteral	 value=
+	TokenNamePLUS	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
throws	TokenNamethrows	
TypeCheckError	TokenNameIdentifier	 Type Check Error
{	TokenNameLBRACE	
_value	TokenNameIdentifier	 value
.	TokenNameDOT	
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeCheckContents	TokenNameIdentifier	 type Check Contents
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Void	TokenNameIdentifier	 Void
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
contextDependent	TokenNameIdentifier	 context Dependent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_value	TokenNameIdentifier	 value
.	TokenNameDOT	
contextDependent	TokenNameIdentifier	 context Dependent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
cpg	TokenNameIdentifier	 cpg
=	TokenNameEQUAL	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getConstantPool	TokenNameIdentifier	 get Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// push handler 	TokenNameCOMMENT_LINE	push handler 
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadHandler	TokenNameIdentifier	 load Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// push attribute name - namespace prefix set by parent node 	TokenNameCOMMENT_LINE	push attribute name - namespace prefix set by parent node 
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUSH	TokenNameIdentifier	 PUSH
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
,	TokenNameCOMMA	
_name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// push attribute value 	TokenNameCOMMENT_LINE	push attribute value 
_value	TokenNameIdentifier	 value
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Generate code that calls SerializationHandler.addUniqueAttribute() 	TokenNameCOMMENT_LINE	Generate code that calls SerializationHandler.addUniqueAttribute() 
// if all attributes are unique. 	TokenNameCOMMENT_LINE	if all attributes are unique. 
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
LiteralElement	TokenNameIdentifier	 Literal Element
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LiteralElement	TokenNameIdentifier	 Literal Element
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
.	TokenNameDOT	
allAttributesUnique	TokenNameIdentifier	 all Attributes Unique
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isHTMLAttrEmpty	TokenNameIdentifier	 is HTML Attr Empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ElemDesc	TokenNameIdentifier	 Elem Desc
elemDesc	TokenNameIdentifier	 elem Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LiteralElement	TokenNameIdentifier	 Literal Element
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
.	TokenNameDOT	
getElemDesc	TokenNameIdentifier	 get Elem Desc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the HTML flags 	TokenNameCOMMENT_LINE	Set the HTML flags 
if	TokenNameif	
(	TokenNameLPAREN	
elemDesc	TokenNameIdentifier	 elem Desc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
isAttrFlagSet	TokenNameIdentifier	 is Attr Flag Set
(	TokenNameLPAREN	
_name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTREMPTY	TokenNameIdentifier	 ATTREMPTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
.	TokenNameDOT	
HTML_ATTREMPTY	TokenNameIdentifier	 HTML  ATTREMPTY
;	TokenNameSEMICOLON	
isHTMLAttrEmpty	TokenNameIdentifier	 is HTML Attr Empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
elemDesc	TokenNameIdentifier	 elem Desc
.	TokenNameDOT	
isAttrFlagSet	TokenNameIdentifier	 is Attr Flag Set
(	TokenNameLPAREN	
_name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
ElemDesc	TokenNameIdentifier	 Elem Desc
.	TokenNameDOT	
ATTRURL	TokenNameIdentifier	 ATTRURL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
.	TokenNameDOT	
HTML_ATTRURL	TokenNameIdentifier	 HTML  ATTRURL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
SimpleAttributeValue	TokenNameIdentifier	 Simple Attribute Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
attrValue	TokenNameIdentifier	 attr Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SimpleAttributeValue	TokenNameIdentifier	 Simple Attribute Value
)	TokenNameRPAREN	
_value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasBadChars	TokenNameIdentifier	 has Bad Chars
(	TokenNameLPAREN	
attrValue	TokenNameIdentifier	 attr Value
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
isHTMLAttrEmpty	TokenNameIdentifier	 is HTML Attr Empty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
flags	TokenNameIdentifier	 flags
=	TokenNameEQUAL	
flags	TokenNameIdentifier	 flags
|	TokenNameOR	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
.	TokenNameDOT	
NO_BAD_CHARS	TokenNameIdentifier	 NO  BAD  CHARS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUSH	TokenNameIdentifier	 PUSH
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
,	TokenNameCOMMA	
flags	TokenNameIdentifier	 flags
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
uniqueAttribute	TokenNameIdentifier	 unique Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// call attribute 	TokenNameCOMMENT_LINE	call attribute 
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return true if at least one character in the String is considered to * be a "bad" character. A bad character is one whose code is: * less than 32 (a space), * or greater than 126, * or it is one of '<', '>', '&' or '\"'. * This helps the serializer to decide whether the String needs to be escaped. */	TokenNameCOMMENT_JAVADOC	 Return true if at least one character in the String is considered to be a "bad" character. A bad character is one whose code is: less than 32 (a space), or greater than 126, or it is one of '<', '>', '&' or '\"'. This helps the serializer to decide whether the String needs to be escaped. 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasBadChars	TokenNameIdentifier	 has Bad Chars
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
32	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
126	TokenNameIntegerLiteral	
<	TokenNameLESS	
ch	TokenNameIdentifier	 ch
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the name of the attribute */	TokenNameCOMMENT_JAVADOC	 Return the name of the attribute 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the value of the attribute */	TokenNameCOMMENT_JAVADOC	 Return the value of the attribute 
public	TokenNamepublic	
AttributeValue	TokenNameIdentifier	 Attribute Value
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
