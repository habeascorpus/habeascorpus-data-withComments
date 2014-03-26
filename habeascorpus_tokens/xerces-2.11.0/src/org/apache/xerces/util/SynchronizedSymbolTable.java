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
/** * Synchronized symbol table. * * This class moved into the util package since it's needed by multiple * other classes (CachingParserPool, XMLGrammarCachingConfiguration). * * @author Andy Clark, IBM * @version $Id: SynchronizedSymbolTable.java 447241 2006-09-18 05:12:57Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Synchronized symbol table. * This class moved into the util package since it's needed by multiple other classes (CachingParserPool, XMLGrammarCachingConfiguration). * @author Andy Clark, IBM @version $Id: SynchronizedSymbolTable.java 447241 2006-09-18 05:12:57Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
SynchronizedSymbolTable	TokenNameIdentifier	 Synchronized Symbol Table
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
/** Constructs a synchronized symbol table. */	TokenNameCOMMENT_JAVADOC	 Constructs a synchronized symbol table. 
public	TokenNamepublic	
SynchronizedSymbolTable	TokenNameIdentifier	 Synchronized Symbol Table
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
// construct synchronized symbol table of default size 	TokenNameCOMMENT_LINE	construct synchronized symbol table of default size 
public	TokenNamepublic	
SynchronizedSymbolTable	TokenNameIdentifier	 Synchronized Symbol Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolTable	TokenNameIdentifier	 Symbol Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init() 	TokenNameCOMMENT_LINE	init() 
// construct synchronized symbol table of given size 	TokenNameCOMMENT_LINE	construct synchronized symbol table of given size 
public	TokenNamepublic	
SynchronizedSymbolTable	TokenNameIdentifier	 Synchronized Symbol Table
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolTable	TokenNameIdentifier	 Symbol Table
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init(int) 	TokenNameCOMMENT_LINE	init(int) 
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
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
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
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
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
}	TokenNameRBRACE	
// addSymbol(char[],int,int):String 	TokenNameCOMMENT_LINE	addSymbol(char[],int,int):String 
/** * Returns true if the symbol table already contains the specified * symbol. * * @param symbol The symbol to look for. */	TokenNameCOMMENT_JAVADOC	 Returns true if the symbol table already contains the specified symbol. * @param symbol The symbol to look for. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsSymbol	TokenNameIdentifier	 contains Symbol
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
containsSymbol	TokenNameIdentifier	 contains Symbol
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// containsSymbol(String):boolean 	TokenNameCOMMENT_LINE	containsSymbol(String):boolean 
/** * Returns true if the symbol table already contains the specified * symbol. * * @param buffer The buffer containing the symbol to look for. * @param offset The offset into the buffer. * @param length The length of the symbol in the buffer. */	TokenNameCOMMENT_JAVADOC	 Returns true if the symbol table already contains the specified symbol. * @param buffer The buffer containing the symbol to look for. @param offset The offset into the buffer. @param length The length of the symbol in the buffer. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsSymbol	TokenNameIdentifier	 contains Symbol
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
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// containsSymbol(char[],int,int):boolean 	TokenNameCOMMENT_LINE	containsSymbol(char[],int,int):boolean 
}	TokenNameRBRACE	
// class SynchronizedSymbolTable 	TokenNameCOMMENT_LINE	class SynchronizedSymbolTable 
