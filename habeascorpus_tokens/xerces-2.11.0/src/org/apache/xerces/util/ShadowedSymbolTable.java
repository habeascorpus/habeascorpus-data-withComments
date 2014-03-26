/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Shadowed symbol table. * * The table has a reference to the main symbol table and is * not allowed to add new symbols to the main symbol table. * New symbols are added to the shadow symbol table and are local * to the component using this table. * * @author Andy Clark IBM * @version $Id: ShadowedSymbolTable.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Shadowed symbol table. * The table has a reference to the main symbol table and is not allowed to add new symbols to the main symbol table. New symbols are added to the shadow symbol table and are local to the component using this table. * @author Andy Clark IBM @version $Id: ShadowedSymbolTable.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ShadowedSymbolTable	TokenNameIdentifier	 Shadowed Symbol Table
extends	TokenNameextends	
SymbolTable	TokenNameIdentifier	 Symbol Table
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Main symbol table. */	TokenNameCOMMENT_JAVADOC	 Main symbol table. 
protected	TokenNameprotected	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a shadow of the specified symbol table. */	TokenNameCOMMENT_JAVADOC	 Constructs a shadow of the specified symbol table. 
public	TokenNamepublic	
ShadowedSymbolTable	TokenNameIdentifier	 Shadowed Symbol Table
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>(SymbolTable) 	TokenNameCOMMENT_LINE	<init>(SymbolTable) 
// 	TokenNameCOMMENT_LINE	 
// SymbolTable methods 	TokenNameCOMMENT_LINE	SymbolTable methods 
// 	TokenNameCOMMENT_LINE	 
/** * Adds the specified symbol to the symbol table and returns a * reference to the unique symbol. If the symbol already exists, * the previous symbol reference is returned instead, in order * guarantee that symbol references remain unique. * * @param symbol The new symbol. */	TokenNameCOMMENT_JAVADOC	 Adds the specified symbol to the symbol table and returns a reference to the unique symbol. If the symbol already exists, the previous symbol reference is returned instead, in order guarantee that symbol references remain unique. * @param symbol The new symbol. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
containsSymbol	TokenNameIdentifier	 contains Symbol
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addSymbol(String) 	TokenNameCOMMENT_LINE	addSymbol(String) 
/** * Adds the specified symbol to the symbol table and returns a * reference to the unique symbol. If the symbol already exists, * the previous symbol reference is returned instead, in order * guarantee that symbol references remain unique. * * @param buffer The buffer containing the new symbol. * @param offset The offset into the buffer of the new symbol. * @param length The length of the new symbol in the buffer. */	TokenNameCOMMENT_JAVADOC	 Adds the specified symbol to the symbol table and returns a reference to the unique symbol. If the symbol already exists, the previous symbol reference is returned instead, in order guarantee that symbol references remain unique. * @param buffer The buffer containing the new symbol. @param offset The offset into the buffer of the new symbol. @param length The length of the new symbol in the buffer. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
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
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
containsSymbol	TokenNameIdentifier	 contains Symbol
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addSymbol(char[],int,int):String 	TokenNameCOMMENT_LINE	addSymbol(char[],int,int):String 
/** * Returns a hashcode value for the specified symbol. The value * returned by this method must be identical to the value returned * by the <code>hash(char[],int,int)</code> method when called * with the character array that comprises the symbol string. * * @param symbol The symbol to hash. */	TokenNameCOMMENT_JAVADOC	 Returns a hashcode value for the specified symbol. The value returned by this method must be identical to the value returned by the <code>hash(char[],int,int)</code> method when called with the character array that comprises the symbol string. * @param symbol The symbol to hash. 
public	TokenNamepublic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hash(String):int 	TokenNameCOMMENT_LINE	hash(String):int 
/** * Returns a hashcode value for the specified symbol information. * The value returned by this method must be identical to the value * returned by the <code>hash(String)</code> method when called * with the string object created from the symbol information. * * @param buffer The character buffer containing the symbol. * @param offset The offset into the character buffer of the start * of the symbol. * @param length The length of the symbol. */	TokenNameCOMMENT_JAVADOC	 Returns a hashcode value for the specified symbol information. The value returned by this method must be identical to the value returned by the <code>hash(String)</code> method when called with the string object created from the symbol information. * @param buffer The character buffer containing the symbol. @param offset The offset into the character buffer of the start of the symbol. @param length The length of the symbol. 
public	TokenNamepublic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hash(char[],int,int):int 	TokenNameCOMMENT_LINE	hash(char[],int,int):int 
}	TokenNameRBRACE	
// class ShadowedSymbolTable 	TokenNameCOMMENT_LINE	class ShadowedSymbolTable 
