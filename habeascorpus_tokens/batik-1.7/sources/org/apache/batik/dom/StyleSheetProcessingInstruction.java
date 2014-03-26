/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashTable	TokenNameIdentifier	 Hash Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
stylesheets	TokenNameIdentifier	 stylesheets
.	TokenNameDOT	
LinkStyle	TokenNameIdentifier	 Link Style
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
stylesheets	TokenNameIdentifier	 stylesheets
.	TokenNameDOT	
StyleSheet	TokenNameIdentifier	 Style Sheet
;	TokenNameSEMICOLON	
/** * This class provides an implementation of the 'xml-stylesheet' processing * instructions. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: StyleSheetProcessingInstruction.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the 'xml-stylesheet' processing instructions. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: StyleSheetProcessingInstruction.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
StyleSheetProcessingInstruction	TokenNameIdentifier	 Style Sheet Processing Instruction
extends	TokenNameextends	
AbstractProcessingInstruction	TokenNameIdentifier	 Abstract Processing Instruction
implements	TokenNameimplements	
LinkStyle	TokenNameIdentifier	 Link Style
{	TokenNameLBRACE	
/** * Is this node immutable? */	TokenNameCOMMENT_JAVADOC	 Is this node immutable? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
/** * The style sheet. */	TokenNameCOMMENT_JAVADOC	 The style sheet. 
protected	TokenNameprotected	
transient	TokenNametransient	
StyleSheet	TokenNameIdentifier	 Style Sheet
sheet	TokenNameIdentifier	 sheet
;	TokenNameSEMICOLON	
/** * The stylesheet factory. */	TokenNameCOMMENT_JAVADOC	 The stylesheet factory. 
protected	TokenNameprotected	
StyleSheetFactory	TokenNameIdentifier	 Style Sheet Factory
factory	TokenNameIdentifier	 factory
;	TokenNameSEMICOLON	
/** * The pseudo attributes. */	TokenNameCOMMENT_JAVADOC	 The pseudo attributes. 
protected	TokenNameprotected	
transient	TokenNametransient	
HashTable	TokenNameIdentifier	 Hash Table
pseudoAttributes	TokenNameIdentifier	 pseudo Attributes
;	TokenNameSEMICOLON	
/** * Creates a new ProcessingInstruction object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ProcessingInstruction object. 
protected	TokenNameprotected	
StyleSheetProcessingInstruction	TokenNameIdentifier	 Style Sheet Processing Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new ProcessingInstruction object. */	TokenNameCOMMENT_JAVADOC	 Creates a new ProcessingInstruction object. 
public	TokenNamepublic	
StyleSheetProcessingInstruction	TokenNameIdentifier	 Style Sheet Processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
StyleSheetFactory	TokenNameIdentifier	 Style Sheet Factory
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Tests whether this node is readonly. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets this node readonly attribute. */	TokenNameCOMMENT_JAVADOC	 Sets this node readonly attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setReadonly	TokenNameIdentifier	 set Readonly
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readonly	TokenNameIdentifier	 readonly
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the node name. */	TokenNameCOMMENT_JAVADOC	 Sets the node name. 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeName	TokenNameIdentifier	 set Node Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.ProcessingInstruction#getTarget()}. * @return "xml-stylesheet". */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.ProcessingInstruction#getTarget()}. @return "xml-stylesheet". 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTarget	TokenNameIdentifier	 get Target
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"xml-stylesheet"	TokenNameStringLiteral	xml-stylesheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The style sheet. */	TokenNameCOMMENT_JAVADOC	 The style sheet. 
public	TokenNamepublic	
StyleSheet	TokenNameIdentifier	 Style Sheet
getSheet	TokenNameIdentifier	 get Sheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sheet	TokenNameIdentifier	 sheet
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sheet	TokenNameIdentifier	 sheet
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
createStyleSheet	TokenNameIdentifier	 create Style Sheet
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
getPseudoAttributes	TokenNameIdentifier	 get Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sheet	TokenNameIdentifier	 sheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the pseudo attributes in a table. */	TokenNameCOMMENT_JAVADOC	 Returns the pseudo attributes in a table. 
public	TokenNamepublic	
HashTable	TokenNameIdentifier	 Hash Table
getPseudoAttributes	TokenNameIdentifier	 get Pseudo Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pseudoAttributes	TokenNameIdentifier	 pseudo Attributes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pseudoAttributes	TokenNameIdentifier	 pseudo Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
HashTable	TokenNameIdentifier	 Hash Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pseudoAttributes	TokenNameIdentifier	 pseudo Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"alternate"	TokenNameStringLiteral	alternate
,	TokenNameCOMMA	
"no"	TokenNameStringLiteral	no
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pseudoAttributes	TokenNameIdentifier	 pseudo Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"media"	TokenNameStringLiteral	media
,	TokenNameCOMMA	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
parseStyleSheetPIData	TokenNameIdentifier	 parse Style Sheet PI Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
pseudoAttributes	TokenNameIdentifier	 pseudo Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pseudoAttributes	TokenNameIdentifier	 pseudo Attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.ProcessingInstruction#setData(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.ProcessingInstruction#setData(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sheet	TokenNameIdentifier	 sheet
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
pseudoAttributes	TokenNameIdentifier	 pseudo Attributes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StyleSheetProcessingInstruction	TokenNameIdentifier	 Style Sheet Processing Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
