/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SymbolTable.java 476471 2006-11-18 08:36:27Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SymbolTable.java 476471 2006-11-18 08:36:27Z minchau $ 
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
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
MethodType	TokenNameIdentifier	 Method Type
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
final	TokenNamefinal	
class	TokenNameclass	
SymbolTable	TokenNameIdentifier	 Symbol Table
{	TokenNameLBRACE	
// These hashtables are used for all stylesheets 	TokenNameCOMMENT_LINE	These hashtables are used for all stylesheets 
private	TokenNameprivate	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
_stylesheets	TokenNameIdentifier	 stylesheets
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Hashtable	TokenNameIdentifier	 Hashtable
_primops	TokenNameIdentifier	 primops
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These hashtables are used for some stylesheets 	TokenNameCOMMENT_LINE	These hashtables are used for some stylesheets 
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_variables	TokenNameIdentifier	 variables
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_attributeSets	TokenNameIdentifier	 attribute Sets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_aliases	TokenNameIdentifier	 aliases
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_excludedURI	TokenNameIdentifier	 excluded URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_decimalFormats	TokenNameIdentifier	 decimal Formats
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DecimalFormatting	TokenNameIdentifier	 Decimal Formatting
getDecimalFormatting	TokenNameIdentifier	 get Decimal Formatting
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_decimalFormats	TokenNameIdentifier	 decimal Formats
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DecimalFormatting	TokenNameIdentifier	 Decimal Formatting
)	TokenNameRPAREN	
_decimalFormats	TokenNameIdentifier	 decimal Formats
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addDecimalFormatting	TokenNameIdentifier	 add Decimal Formatting
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
DecimalFormatting	TokenNameIdentifier	 Decimal Formatting
symbols	TokenNameIdentifier	 symbols
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_decimalFormats	TokenNameIdentifier	 decimal Formats
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_decimalFormats	TokenNameIdentifier	 decimal Formats
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_decimalFormats	TokenNameIdentifier	 decimal Formats
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
symbols	TokenNameIdentifier	 symbols
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Key	TokenNameIdentifier	 Key
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_keys	TokenNameIdentifier	 keys
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Key	TokenNameIdentifier	 Key
)	TokenNameRPAREN	
_keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addKey	TokenNameIdentifier	 add Key
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Key	TokenNameIdentifier	 Key
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_keys	TokenNameIdentifier	 keys
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Stylesheet	TokenNameIdentifier	 Stylesheet
addStylesheet	TokenNameIdentifier	 add Stylesheet
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Stylesheet	TokenNameIdentifier	 Stylesheet
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
_stylesheets	TokenNameIdentifier	 stylesheets
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Stylesheet	TokenNameIdentifier	 Stylesheet
lookupStylesheet	TokenNameIdentifier	 lookup Stylesheet
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Stylesheet	TokenNameIdentifier	 Stylesheet
)	TokenNameRPAREN	
_stylesheets	TokenNameIdentifier	 stylesheets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Template	TokenNameIdentifier	 Template
addTemplate	TokenNameIdentifier	 add Template
(	TokenNameLPAREN	
Template	TokenNameIdentifier	 Template
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_templates	TokenNameIdentifier	 templates
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Template	TokenNameIdentifier	 Template
)	TokenNameRPAREN	
_templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Template	TokenNameIdentifier	 Template
lookupTemplate	TokenNameIdentifier	 lookup Template
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_templates	TokenNameIdentifier	 templates
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Template	TokenNameIdentifier	 Template
)	TokenNameRPAREN	
_templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Variable	TokenNameIdentifier	 Variable
addVariable	TokenNameIdentifier	 add Variable
(	TokenNameLPAREN	
Variable	TokenNameIdentifier	 Variable
variable	TokenNameIdentifier	 variable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_variables	TokenNameIdentifier	 variables
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_variables	TokenNameIdentifier	 variables
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStringRep	TokenNameIdentifier	 get String Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
variable	TokenNameIdentifier	 variable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Param	TokenNameIdentifier	 Param
addParam	TokenNameIdentifier	 add Param
(	TokenNameLPAREN	
Param	TokenNameIdentifier	 Param
parameter	TokenNameIdentifier	 parameter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_variables	TokenNameIdentifier	 variables
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_variables	TokenNameIdentifier	 variables
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
parameter	TokenNameIdentifier	 parameter
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStringRep	TokenNameIdentifier	 get String Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Param	TokenNameIdentifier	 Param
)	TokenNameRPAREN	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
parameter	TokenNameIdentifier	 parameter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Variable	TokenNameIdentifier	 Variable
lookupVariable	TokenNameIdentifier	 lookup Variable
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_variables	TokenNameIdentifier	 variables
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getStringRep	TokenNameIdentifier	 get String Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
Variable	TokenNameIdentifier	 Variable
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Param	TokenNameIdentifier	 Param
lookupParam	TokenNameIdentifier	 lookup Param
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_variables	TokenNameIdentifier	 variables
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getStringRep	TokenNameIdentifier	 get String Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
Param	TokenNameIdentifier	 Param
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Param	TokenNameIdentifier	 Param
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
lookupName	TokenNameIdentifier	 lookup Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_variables	TokenNameIdentifier	 variables
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
getStringRep	TokenNameIdentifier	 get String Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
)	TokenNameRPAREN	
_variables	TokenNameIdentifier	 variables
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AttributeSet	TokenNameIdentifier	 Attribute Set
addAttributeSet	TokenNameIdentifier	 add Attribute Set
(	TokenNameLPAREN	
AttributeSet	TokenNameIdentifier	 Attribute Set
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_attributeSets	TokenNameIdentifier	 attribute Sets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_attributeSets	TokenNameIdentifier	 attribute Sets
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
AttributeSet	TokenNameIdentifier	 Attribute Set
)	TokenNameRPAREN	
_attributeSets	TokenNameIdentifier	 attribute Sets
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
atts	TokenNameIdentifier	 atts
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
atts	TokenNameIdentifier	 atts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AttributeSet	TokenNameIdentifier	 Attribute Set
lookupAttributeSet	TokenNameIdentifier	 lookup Attribute Set
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_attributeSets	TokenNameIdentifier	 attribute Sets
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
AttributeSet	TokenNameIdentifier	 Attribute Set
)	TokenNameRPAREN	
_attributeSets	TokenNameIdentifier	 attribute Sets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a primitive operator or function to the symbol table. To avoid * name clashes with user-defined names, the prefix <tt>PrimopPrefix</tt> * is prepended. */	TokenNameCOMMENT_JAVADOC	 Add a primitive operator or function to the symbol table. To avoid name clashes with user-defined names, the prefix <tt>PrimopPrefix</tt> is prepended. 
public	TokenNamepublic	
void	TokenNamevoid	
addPrimop	TokenNameIdentifier	 add Primop
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
MethodType	TokenNameIdentifier	 Method Type
mtype	TokenNameIdentifier	 mtype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
_primops	TokenNameIdentifier	 primops
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
methods	TokenNameIdentifier	 methods
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_primops	TokenNameIdentifier	 primops
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
methods	TokenNameIdentifier	 methods
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
methods	TokenNameIdentifier	 methods
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
mtype	TokenNameIdentifier	 mtype
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Lookup a primitive operator or function in the symbol table by * prepending the prefix <tt>PrimopPrefix</tt>. */	TokenNameCOMMENT_JAVADOC	 Lookup a primitive operator or function in the symbol table by prepending the prefix <tt>PrimopPrefix</tt>. 
public	TokenNamepublic	
Vector	TokenNameIdentifier	 Vector
lookupPrimop	TokenNameIdentifier	 lookup Primop
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
)	TokenNameRPAREN	
_primops	TokenNameIdentifier	 primops
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is used for xsl:attribute elements that have a "namespace" * attribute that is currently not defined using xmlns: */	TokenNameCOMMENT_JAVADOC	 This is used for xsl:attribute elements that have a "namespace" attribute that is currently not defined using xmlns: 
private	TokenNameprivate	
int	TokenNameint	
_nsCounter	TokenNameIdentifier	 ns Counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
generateNamespacePrefix	TokenNameIdentifier	 generate Namespace Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
"ns"	TokenNameStringLiteral	ns
+	TokenNamePLUS	
(	TokenNameLPAREN	
_nsCounter	TokenNameIdentifier	 ns Counter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use a namespace prefix to lookup a namespace URI */	TokenNameCOMMENT_JAVADOC	 Use a namespace prefix to lookup a namespace URI 
private	TokenNameprivate	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentNode	TokenNameIdentifier	 set Current Node
(	TokenNameLPAREN	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
_current	TokenNameIdentifier	 current
.	TokenNameDOT	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds an alias for a namespace prefix */	TokenNameCOMMENT_JAVADOC	 Adds an alias for a namespace prefix 
public	TokenNamepublic	
void	TokenNamevoid	
addPrefixAlias	TokenNameIdentifier	 add Prefix Alias
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
alias	TokenNameIdentifier	 alias
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_aliases	TokenNameIdentifier	 aliases
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_aliases	TokenNameIdentifier	 aliases
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
alias	TokenNameIdentifier	 alias
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves any alias for a given namespace prefix */	TokenNameCOMMENT_JAVADOC	 Retrieves any alias for a given namespace prefix 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lookupPrefixAlias	TokenNameIdentifier	 lookup Prefix Alias
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_aliases	TokenNameIdentifier	 aliases
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
_aliases	TokenNameIdentifier	 aliases
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Register a namespace URI so that it will not be declared in the output * unless it is actually referenced in the output. */	TokenNameCOMMENT_JAVADOC	 Register a namespace URI so that it will not be declared in the output unless it is actually referenced in the output. 
public	TokenNamepublic	
void	TokenNamevoid	
excludeURI	TokenNameIdentifier	 exclude URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The null-namespace cannot be excluded 	TokenNameCOMMENT_LINE	The null-namespace cannot be excluded 
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Create new hashtable of exlcuded URIs if none exists 	TokenNameCOMMENT_LINE	Create new hashtable of exlcuded URIs if none exists 
if	TokenNameif	
(	TokenNameLPAREN	
_excludedURI	TokenNameIdentifier	 excluded URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_excludedURI	TokenNameIdentifier	 excluded URI
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Register the namespace URI 	TokenNameCOMMENT_LINE	Register the namespace URI 
Integer	TokenNameIdentifier	 Integer
refcnt	TokenNameIdentifier	 refcnt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
_excludedURI	TokenNameIdentifier	 excluded URI
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
refcnt	TokenNameIdentifier	 refcnt
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
refcnt	TokenNameIdentifier	 refcnt
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
refcnt	TokenNameIdentifier	 refcnt
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
refcnt	TokenNameIdentifier	 refcnt
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_excludedURI	TokenNameIdentifier	 excluded URI
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
refcnt	TokenNameIdentifier	 refcnt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Exclude a series of namespaces given by a list of whitespace * separated namespace prefixes. */	TokenNameCOMMENT_JAVADOC	 Exclude a series of namespaces given by a list of whitespace separated namespace prefixes. 
public	TokenNamepublic	
void	TokenNamevoid	
excludeNamespaces	TokenNameIdentifier	 exclude Namespaces
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefixes	TokenNameIdentifier	 prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"#default"	TokenNameStringLiteral	#default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
excludeURI	TokenNameIdentifier	 exclude URI
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Check if a namespace should not be declared in the output (unless used) */	TokenNameCOMMENT_JAVADOC	 Check if a namespace should not be declared in the output (unless used) 
public	TokenNamepublic	
boolean	TokenNameboolean	
isExcludedNamespace	TokenNameIdentifier	 is Excluded Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_excludedURI	TokenNameIdentifier	 excluded URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
refcnt	TokenNameIdentifier	 refcnt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
_excludedURI	TokenNameIdentifier	 excluded URI
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
refcnt	TokenNameIdentifier	 refcnt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
refcnt	TokenNameIdentifier	 refcnt
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Turn of namespace declaration exclusion */	TokenNameCOMMENT_JAVADOC	 Turn of namespace declaration exclusion 
public	TokenNamepublic	
void	TokenNamevoid	
unExcludeNamespaces	TokenNameIdentifier	 un Exclude Namespaces
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefixes	TokenNameIdentifier	 prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_excludedURI	TokenNameIdentifier	 excluded URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
prefixes	TokenNameIdentifier	 prefixes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"#default"	TokenNameStringLiteral	#default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
lookupNamespace	TokenNameIdentifier	 lookup Namespace
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Integer	TokenNameIdentifier	 Integer
refcnt	TokenNameIdentifier	 refcnt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
_excludedURI	TokenNameIdentifier	 excluded URI
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
refcnt	TokenNameIdentifier	 refcnt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_excludedURI	TokenNameIdentifier	 excluded URI
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
refcnt	TokenNameIdentifier	 refcnt
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
