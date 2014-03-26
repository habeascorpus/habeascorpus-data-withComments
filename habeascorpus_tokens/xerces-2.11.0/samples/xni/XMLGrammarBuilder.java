/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
xni	TokenNameIdentifier	 xni
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
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
XIncludeAwareParserConfiguration	TokenNameIdentifier	 X Include Aware Parser Configuration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
XMLGrammarPreparser	TokenNameIdentifier	 XML Grammar Preparser
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
SymbolTable	TokenNameIdentifier	 Symbol Table
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
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
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
Grammar	TokenNameIdentifier	 Grammar
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
;	TokenNameSEMICOLON	
/** * This sample program illustrates how to use Xerces2's grammar * preparsing and caching functionality. It permits either DTD or * Schema grammars to be parsed, and then allows instance documents to * be validated with them. * <p> Note that, for access to a grammar's contents (via Xerces's * Schema Component model interfaces), slightly different methods need * to be used. Nonetheless, this should go some way to indicating how * grammar preparsing and caching can be coupled in Xerces to achieve * better performance. It's also hoped this sample shows the way * towards combining this functionality in a DOM or SAX context. * * @author Neil Graham, IBM * @version $Id: XMLGrammarBuilder.java 447690 2006-09-19 02:41:53Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This sample program illustrates how to use Xerces2's grammar preparsing and caching functionality. It permits either DTD or Schema grammars to be parsed, and then allows instance documents to be validated with them. <p> Note that, for access to a grammar's contents (via Xerces's Schema Component model interfaces), slightly different methods need to be used. Nonetheless, this should go some way to indicating how grammar preparsing and caching can be coupled in Xerces to achieve better performance. It's also hoped this sample shows the way towards combining this functionality in a DOM or SAX context. * @author Neil Graham, IBM @version $Id: XMLGrammarBuilder.java 447690 2006-09-19 02:41:53Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLGrammarBuilder	TokenNameIdentifier	 XML Grammar Builder
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// property IDs: 	TokenNameCOMMENT_LINE	property IDs: 
/** Property identifier: symbol table. */	TokenNameCOMMENT_JAVADOC	 Property identifier: symbol table. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYMBOL_TABLE	TokenNameIdentifier	 SYMBOL  TABLE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier	 SYMBOL  TABLE  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: grammar pool. */	TokenNameCOMMENT_JAVADOC	 Property identifier: grammar pool. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
GRAMMAR_POOL	TokenNameIdentifier	 GRAMMAR  POOL
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XMLGRAMMAR_POOL_PROPERTY	TokenNameIdentifier	 XMLGRAMMAR  POOL  PROPERTY
;	TokenNameSEMICOLON	
// feature ids 	TokenNameCOMMENT_LINE	feature ids 
/** Namespaces feature id (http://xml.org/sax/features/namespaces). */	TokenNameCOMMENT_JAVADOC	 Namespaces feature id (http://xml.org/sax/features/namespaces). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACES_FEATURE_ID	TokenNameIdentifier	 NAMESPACES  FEATURE  ID
=	TokenNameEQUAL	
"http://xml.org/sax/features/namespaces"	TokenNameStringLiteral	http://xml.org/sax/features/namespaces
;	TokenNameSEMICOLON	
/** Validation feature id (http://xml.org/sax/features/validation). */	TokenNameCOMMENT_JAVADOC	 Validation feature id (http://xml.org/sax/features/validation). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATION_FEATURE_ID	TokenNameIdentifier	 VALIDATION  FEATURE  ID
=	TokenNameEQUAL	
"http://xml.org/sax/features/validation"	TokenNameStringLiteral	http://xml.org/sax/features/validation
;	TokenNameSEMICOLON	
/** Schema validation feature id (http://apache.org/xml/features/validation/schema). */	TokenNameCOMMENT_JAVADOC	 Schema validation feature id (http://apache.org/xml/features/validation/schema). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/validation/schema"	TokenNameStringLiteral	http://apache.org/xml/features/validation/schema
;	TokenNameSEMICOLON	
/** Schema full checking feature id (http://apache.org/xml/features/validation/schema-full-checking). */	TokenNameCOMMENT_JAVADOC	 Schema full checking feature id (http://apache.org/xml/features/validation/schema-full-checking). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/validation/schema-full-checking"	TokenNameStringLiteral	http://apache.org/xml/features/validation/schema-full-checking
;	TokenNameSEMICOLON	
/** Honour all schema locations feature id (http://apache.org/xml/features/honour-all-schemaLocations). */	TokenNameCOMMENT_JAVADOC	 Honour all schema locations feature id (http://apache.org/xml/features/honour-all-schemaLocations). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HONOUR_ALL_SCHEMA_LOCATIONS_ID	TokenNameIdentifier	 HONOUR  ALL  SCHEMA  LOCATIONS  ID
=	TokenNameEQUAL	
"http://apache.org/xml/features/honour-all-schemaLocations"	TokenNameStringLiteral	http://apache.org/xml/features/honour-all-schemaLocations
;	TokenNameSEMICOLON	
// a larg(ish) prime to use for a symbol table to be shared 	TokenNameCOMMENT_LINE	a larg(ish) prime to use for a symbol table to be shared 
// among 	TokenNameCOMMENT_LINE	among 
// potentially man parsers. Start one as close to 2K (20 	TokenNameCOMMENT_LINE	potentially man parsers. Start one as close to 2K (20 
// times larger than normal) and see what happens... 	TokenNameCOMMENT_LINE	times larger than normal) and see what happens... 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BIG_PRIME	TokenNameIdentifier	 BIG  PRIME
=	TokenNameEQUAL	
2039	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// default settings 	TokenNameCOMMENT_LINE	default settings 
/** Default Schema full checking support (false). */	TokenNameCOMMENT_JAVADOC	 Default Schema full checking support (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_SCHEMA_FULL_CHECKING	TokenNameIdentifier	 DEFAULT  SCHEMA  FULL  CHECKING
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Default honour all schema locations (false). */	TokenNameCOMMENT_JAVADOC	 Default honour all schema locations (false). 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS	TokenNameIdentifier	 DEFAULT  HONOUR  ALL  SCHEMA  LOCATIONS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// MAIN 	TokenNameCOMMENT_LINE	MAIN 
// 	TokenNameCOMMENT_LINE	 
/** Main program entry point. */	TokenNameCOMMENT_JAVADOC	 Main program entry point. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// too few parameters 	TokenNameCOMMENT_LINE	too few parameters 
if	TokenNameif	
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
parserConfiguration	TokenNameIdentifier	 parser Configuration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-p"	TokenNameStringLiteral	-p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get parser name 	TokenNameCOMMENT_LINE	get parser name 
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
parserName	TokenNameIdentifier	 parser Name
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// create parser 	TokenNameCOMMENT_LINE	create parser 
try	TokenNametry	
{	TokenNameLBRACE	
ClassLoader	TokenNameIdentifier	 Class Loader
cl	TokenNameIdentifier	 cl
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parserConfiguration	TokenNameIdentifier	 parser Configuration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLParserConfiguration	TokenNameIdentifier	 XML Parser Configuration
)	TokenNameRPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
parserName	TokenNameIdentifier	 parser Name
,	TokenNameCOMMA	
cl	TokenNameIdentifier	 cl
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parserConfiguration	TokenNameIdentifier	 parser Configuration
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error: Unable to instantiate parser configuration ("	TokenNameStringLiteral	error: Unable to instantiate parser configuration (
+	TokenNamePLUS	
parserName	TokenNameIdentifier	 parser Name
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// process -d 	TokenNameCOMMENT_LINE	process -d 
Vector	TokenNameIdentifier	 Vector
externalDTDs	TokenNameIdentifier	 external DT Ds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-d"	TokenNameStringLiteral	-d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
externalDTDs	TokenNameIdentifier	 external DT Ds
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
externalDTDs	TokenNameIdentifier	 external DT Ds
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// has to be at least one dTD or schema , and there has to be other parameters 	TokenNameCOMMENT_LINE	has to be at least one dTD or schema , and there has to be other parameters 
if	TokenNameif	
(	TokenNameLPAREN	
externalDTDs	TokenNameIdentifier	 external DT Ds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// process -f/F and -hs/HS 	TokenNameCOMMENT_LINE	process -f/F and -hs/HS 
Vector	TokenNameIdentifier	 Vector
schemas	TokenNameIdentifier	 schemas
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
=	TokenNameEQUAL	
DEFAULT_SCHEMA_FULL_CHECKING	TokenNameIdentifier	 DEFAULT  SCHEMA  FULL  CHECKING
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
honourAllSchemaLocations	TokenNameIdentifier	 honour All Schema Locations
=	TokenNameEQUAL	
DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS	TokenNameIdentifier	 DEFAULT  HONOUR  ALL  SCHEMA  LOCATIONS
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-f"	TokenNameStringLiteral	-f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-F"	TokenNameStringLiteral	-F
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-hs"	TokenNameStringLiteral	-hs
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
honourAllSchemaLocations	TokenNameIdentifier	 honour All Schema Locations
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-HS"	TokenNameStringLiteral	-HS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
honourAllSchemaLocations	TokenNameIdentifier	 honour All Schema Locations
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-a"	TokenNameStringLiteral	-a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
externalDTDs	TokenNameIdentifier	 external DT Ds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// process -a: schema files 	TokenNameCOMMENT_LINE	process -a: schema files 
schemas	TokenNameIdentifier	 schemas
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// has to be at least one dTD or schema , and there has to be other parameters 	TokenNameCOMMENT_LINE	has to be at least one dTD or schema , and there has to be other parameters 
if	TokenNameif	
(	TokenNameLPAREN	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// process -i: instance files, if any 	TokenNameCOMMENT_LINE	process -i: instance files, if any 
Vector	TokenNameIdentifier	 Vector
ifiles	TokenNameIdentifier	 ifiles
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
arg	TokenNameIdentifier	 arg
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"-i"	TokenNameStringLiteral	-i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ifiles	TokenNameIdentifier	 ifiles
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"-"	TokenNameStringLiteral	-
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ifiles	TokenNameIdentifier	 ifiles
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// has to be at least one instance file, and there has to be no more 	TokenNameCOMMENT_LINE	has to be at least one instance file, and there has to be no more 
// parameters 	TokenNameCOMMENT_LINE	parameters 
if	TokenNameif	
(	TokenNameLPAREN	
ifiles	TokenNameIdentifier	 ifiles
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now we have all our arguments. We only 	TokenNameCOMMENT_LINE	now we have all our arguments. We only 
// need to parse the DTD's/schemas, put them 	TokenNameCOMMENT_LINE	need to parse the DTD's/schemas, put them 
// in a grammar pool, possibly instantiate an 	TokenNameCOMMENT_LINE	in a grammar pool, possibly instantiate an 
// appropriate configuration, and we're on our way. 	TokenNameCOMMENT_LINE	appropriate configuration, and we're on our way. 
SymbolTable	TokenNameIdentifier	 Symbol Table
sym	TokenNameIdentifier	 sym
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolTable	TokenNameIdentifier	 Symbol Table
(	TokenNameLPAREN	
BIG_PRIME	TokenNameIdentifier	 BIG  PRIME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLGrammarPreparser	TokenNameIdentifier	 XML Grammar Preparser
preparser	TokenNameIdentifier	 preparser
=	TokenNameEQUAL	
new	TokenNamenew	
XMLGrammarPreparser	TokenNameIdentifier	 XML Grammar Preparser
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
grammarPool	TokenNameIdentifier	 grammar Pool
=	TokenNameEQUAL	
new	TokenNamenew	
XMLGrammarPoolImpl	TokenNameIdentifier	 XML Grammar Pool Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isDTD	TokenNameIdentifier	 is DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
externalDTDs	TokenNameIdentifier	 external DT Ds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
registerPreparser	TokenNameIdentifier	 register Preparser
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
.	TokenNameDOT	
XML_DTD	TokenNameIdentifier	 XML  DTD
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isDTD	TokenNameIdentifier	 is DTD
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
schemas	TokenNameIdentifier	 schemas
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
registerPreparser	TokenNameIdentifier	 register Preparser
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
.	TokenNameDOT	
XML_SCHEMA	TokenNameIdentifier	 XML  SCHEMA
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isDTD	TokenNameIdentifier	 is DTD
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"No schema or DTD specified!"	TokenNameStringLiteral	No schema or DTD specified!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
GRAMMAR_POOL	TokenNameIdentifier	 GRAMMAR  POOL
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NAMESPACES_FEATURE_ID	TokenNameIdentifier	 NAMESPACES  FEATURE  ID
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
VALIDATION_FEATURE_ID	TokenNameIdentifier	 VALIDATION  FEATURE  ID
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note we can set schema features just in case... 	TokenNameCOMMENT_LINE	note we can set schema features just in case... 
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
,	TokenNameCOMMA	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
HONOUR_ALL_SCHEMA_LOCATIONS_ID	TokenNameIdentifier	 HONOUR  ALL  SCHEMA  LOCATIONS  ID
,	TokenNameCOMMA	
honourAllSchemaLocations	TokenNameIdentifier	 honour All Schema Locations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// parse the grammar... 	TokenNameCOMMENT_LINE	parse the grammar... 
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isDTD	TokenNameIdentifier	 is DTD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
externalDTDs	TokenNameIdentifier	 external DT Ds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Grammar	TokenNameIdentifier	 Grammar
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
preparseGrammar	TokenNameIdentifier	 preparse Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
.	TokenNameDOT	
XML_DTD	TokenNameIdentifier	 XML  DTD
,	TokenNameCOMMA	
stringToXIS	TokenNameIdentifier	 string To XIS
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
externalDTDs	TokenNameIdentifier	 external DT Ds
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we don't really care about g; grammarPool will take care of everything. 	TokenNameCOMMENT_LINE	we don't really care about g; grammarPool will take care of everything. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// must be schemas! 	TokenNameCOMMENT_LINE	must be schemas! 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Grammar	TokenNameIdentifier	 Grammar
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
preparser	TokenNameIdentifier	 preparser
.	TokenNameDOT	
preparseGrammar	TokenNameIdentifier	 preparse Grammar
(	TokenNameLPAREN	
XMLGrammarDescription	TokenNameIdentifier	 XML Grammar Description
.	TokenNameDOT	
XML_SCHEMA	TokenNameIdentifier	 XML  SCHEMA
,	TokenNameCOMMA	
stringToXIS	TokenNameIdentifier	 string To XIS
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
schemas	TokenNameIdentifier	 schemas
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we don't really care about g; grammarPool will take care of everything. 	TokenNameCOMMENT_LINE	we don't really care about g; grammarPool will take care of everything. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now we have a grammar pool and a SymbolTable; just 	TokenNameCOMMENT_LINE	Now we have a grammar pool and a SymbolTable; just 
// build a configuration and we're on our way! 	TokenNameCOMMENT_LINE	build a configuration and we're on our way! 
if	TokenNameif	
(	TokenNameLPAREN	
parserConfiguration	TokenNameIdentifier	 parser Configuration
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parserConfiguration	TokenNameIdentifier	 parser Configuration
=	TokenNameEQUAL	
new	TokenNamenew	
XIncludeAwareParserConfiguration	TokenNameIdentifier	 X Include Aware Parser Configuration
(	TokenNameLPAREN	
sym	TokenNameIdentifier	 sym
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// set GrammarPool and SymbolTable... 	TokenNameCOMMENT_LINE	set GrammarPool and SymbolTable... 
parserConfiguration	TokenNameIdentifier	 parser Configuration
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
SYMBOL_TABLE	TokenNameIdentifier	 SYMBOL  TABLE
,	TokenNameCOMMA	
sym	TokenNameIdentifier	 sym
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parserConfiguration	TokenNameIdentifier	 parser Configuration
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
GRAMMAR_POOL	TokenNameIdentifier	 GRAMMAR  POOL
,	TokenNameCOMMA	
grammarPool	TokenNameIdentifier	 grammar Pool
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// now must reset features, unfortunately: 	TokenNameCOMMENT_LINE	now must reset features, unfortunately: 
try	TokenNametry	
{	TokenNameLBRACE	
parserConfiguration	TokenNameIdentifier	 parser Configuration
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
NAMESPACES_FEATURE_ID	TokenNameIdentifier	 NAMESPACES  FEATURE  ID
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parserConfiguration	TokenNameIdentifier	 parser Configuration
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
VALIDATION_FEATURE_ID	TokenNameIdentifier	 VALIDATION  FEATURE  ID
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now we can still do schema features just in case, 	TokenNameCOMMENT_LINE	now we can still do schema features just in case, 
// so long as it's our configuraiton...... 	TokenNameCOMMENT_LINE	so long as it's our configuraiton...... 
parserConfiguration	TokenNameIdentifier	 parser Configuration
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_VALIDATION_FEATURE_ID	TokenNameIdentifier	 SCHEMA  VALIDATION  FEATURE  ID
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parserConfiguration	TokenNameIdentifier	 parser Configuration
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
SCHEMA_FULL_CHECKING_FEATURE_ID	TokenNameIdentifier	 SCHEMA  FULL  CHECKING  FEATURE  ID
,	TokenNameCOMMA	
schemaFullChecking	TokenNameIdentifier	 schema Full Checking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parserConfiguration	TokenNameIdentifier	 parser Configuration
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
HONOUR_ALL_SCHEMA_LOCATIONS_ID	TokenNameIdentifier	 HONOUR  ALL  SCHEMA  LOCATIONS  ID
,	TokenNameCOMMA	
honourAllSchemaLocations	TokenNameIdentifier	 honour All Schema Locations
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// then for each instance file, try to validate it 	TokenNameCOMMENT_LINE	then for each instance file, try to validate it 
if	TokenNameif	
(	TokenNameLPAREN	
ifiles	TokenNameIdentifier	 ifiles
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ifiles	TokenNameIdentifier	 ifiles
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parserConfiguration	TokenNameIdentifier	 parser Configuration
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
stringToXIS	TokenNameIdentifier	 string To XIS
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
ifiles	TokenNameIdentifier	 ifiles
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// main(String[]) 	TokenNameCOMMENT_LINE	main(String[]) 
// 	TokenNameCOMMENT_LINE	 
// Private static methods 	TokenNameCOMMENT_LINE	Private static methods 
// 	TokenNameCOMMENT_LINE	 
/** Prints the usage. */	TokenNameCOMMENT_JAVADOC	 Prints the usage. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: java xni.XMLGrammarBuilder [-p name] -d uri ... | [-f|-F] [-hs|-HS] -a uri ... [-i uri ...]"	TokenNameStringLiteral	usage: java xni.XMLGrammarBuilder [-p name] -d uri ... | [-f|-F] [-hs|-HS] -a uri ... [-i uri ...]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"options:"	TokenNameStringLiteral	options:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -p name Select parser configuration by name to use for instance validation"	TokenNameStringLiteral	 -p name Select parser configuration by name to use for instance validation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -d Grammars to preparse are DTD external subsets"	TokenNameStringLiteral	 -d Grammars to preparse are DTD external subsets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -f | -F Turn on/off Schema full checking (default "	TokenNameStringLiteral	 -f | -F Turn on/off Schema full checking (default 
+	TokenNamePLUS	
(	TokenNameLPAREN	
DEFAULT_SCHEMA_FULL_CHECKING	TokenNameIdentifier	 DEFAULT  SCHEMA  FULL  CHECKING
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off)"	TokenNameStringLiteral	off)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -hs | -HS Turn on/off honouring of all schema locations (default "	TokenNameStringLiteral	 -hs | -HS Turn on/off honouring of all schema locations (default 
+	TokenNamePLUS	
(	TokenNameLPAREN	
DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS	TokenNameIdentifier	 DEFAULT  HONOUR  ALL  SCHEMA  LOCATIONS
?	TokenNameQUESTION	
"on"	TokenNameStringLiteral	on
:	TokenNameCOLON	
"off)"	TokenNameStringLiteral	off)
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -a uri ... Provide a list of schema documents"	TokenNameStringLiteral	 -a uri ... Provide a list of schema documents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -i uri ... Provide a list of instance documents to validate"	TokenNameStringLiteral	 -i uri ... Provide a list of instance documents to validate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"NOTE: Both -d and -a cannot be specified!"	TokenNameStringLiteral	NOTE: Both -d and -a cannot be specified!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// printUsage() 	TokenNameCOMMENT_LINE	printUsage() 
private	TokenNameprivate	
static	TokenNamestatic	
XMLInputSource	TokenNameIdentifier	 XML Input Source
stringToXIS	TokenNameIdentifier	 string To XIS
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
XMLInputSource	TokenNameIdentifier	 XML Input Source
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XMLGrammarBuilder 	TokenNameCOMMENT_LINE	class XMLGrammarBuilder 
