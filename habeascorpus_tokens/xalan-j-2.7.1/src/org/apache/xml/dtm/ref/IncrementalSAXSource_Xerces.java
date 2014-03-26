/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: IncrementalSAXSource_Xerces.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: IncrementalSAXSource_Xerces.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
SAXParser	TokenNameIdentifier	 SAX Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
/** <p>IncrementalSAXSource_Xerces takes advantage of the fact that Xerces1 * incremental mode is already a coroutine of sorts, and just wraps our * IncrementalSAXSource API around it.</p> * * <p>Usage example: See main().</p> * * <p>Status: Passes simple main() unit-test. NEEDS JAVADOC.</p> * */	TokenNameCOMMENT_JAVADOC	 <p>IncrementalSAXSource_Xerces takes advantage of the fact that Xerces1 incremental mode is already a coroutine of sorts, and just wraps our IncrementalSAXSource API around it.</p> * <p>Usage example: See main().</p> * <p>Status: Passes simple main() unit-test. NEEDS JAVADOC.</p> 
public	TokenNamepublic	
class	TokenNameclass	
IncrementalSAXSource_Xerces	TokenNameIdentifier	 Incremental SAX Source  Xerces
implements	TokenNameimplements	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Reflection. To allow this to compile with both Xerces1 and Xerces2, which 	TokenNameCOMMENT_LINE	Reflection. To allow this to compile with both Xerces1 and Xerces2, which 
// require very different methods and objects, we need to avoid static 	TokenNameCOMMENT_LINE	require very different methods and objects, we need to avoid static 
// references to those APIs. So until Xerces2 is pervasive and we're willing 	TokenNameCOMMENT_LINE	references to those APIs. So until Xerces2 is pervasive and we're willing 
// to make it a prerequisite, we will rely upon relection. 	TokenNameCOMMENT_LINE	to make it a prerequisite, we will rely upon relection. 
// 	TokenNameCOMMENT_LINE	 
Method	TokenNameIdentifier	 Method
fParseSomeSetup	TokenNameIdentifier	 f Parse Some Setup
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces1 method 	TokenNameCOMMENT_LINE	Xerces1 method 
Method	TokenNameIdentifier	 Method
fParseSome	TokenNameIdentifier	 f Parse Some
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces1 method 	TokenNameCOMMENT_LINE	Xerces1 method 
Object	TokenNameIdentifier	 Object
fPullParserConfig	TokenNameIdentifier	 f Pull Parser Config
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces2 pull control object 	TokenNameCOMMENT_LINE	Xerces2 pull control object 
Method	TokenNameIdentifier	 Method
fConfigSetInput	TokenNameIdentifier	 f Config Set Input
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces2 method 	TokenNameCOMMENT_LINE	Xerces2 method 
Method	TokenNameIdentifier	 Method
fConfigParse	TokenNameIdentifier	 f Config Parse
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces2 method 	TokenNameCOMMENT_LINE	Xerces2 method 
Method	TokenNameIdentifier	 Method
fSetInputSource	TokenNameIdentifier	 f Set Input Source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces2 pull control method 	TokenNameCOMMENT_LINE	Xerces2 pull control method 
Constructor	TokenNameIdentifier	 Constructor
fConfigInputSourceCtor	TokenNameIdentifier	 f Config Input Source Ctor
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces2 initialization method 	TokenNameCOMMENT_LINE	Xerces2 initialization method 
Method	TokenNameIdentifier	 Method
fConfigSetByteStream	TokenNameIdentifier	 f Config Set Byte Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces2 initialization method 	TokenNameCOMMENT_LINE	Xerces2 initialization method 
Method	TokenNameIdentifier	 Method
fConfigSetCharStream	TokenNameIdentifier	 f Config Set Char Stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces2 initialization method 	TokenNameCOMMENT_LINE	Xerces2 initialization method 
Method	TokenNameIdentifier	 Method
fConfigSetEncoding	TokenNameIdentifier	 f Config Set Encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Xerces2 initialization method 	TokenNameCOMMENT_LINE	Xerces2 initialization method 
Method	TokenNameIdentifier	 Method
fReset	TokenNameIdentifier	 f Reset
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Both Xerces1 and Xerces2, but diff. signatures 	TokenNameCOMMENT_LINE	Both Xerces1 and Xerces2, but diff. signatures 
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
SAXParser	TokenNameIdentifier	 SAX Parser
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
fParseInProgress	TokenNameIdentifier	 f Parse In Progress
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Create a IncrementalSAXSource_Xerces, and create a SAXParser * to go with it. Xerces2 incremental parsing is only supported if * this constructor is used, due to limitations in the Xerces2 API (as of * Beta 3). If you don't like that restriction, tell the Xerces folks that * there should be a simpler way to request incremental SAX parsing. * */	TokenNameCOMMENT_JAVADOC	 Create a IncrementalSAXSource_Xerces, and create a SAXParser to go with it. Xerces2 incremental parsing is only supported if this constructor is used, due to limitations in the Xerces2 API (as of Beta 3). If you don't like that restriction, tell the Xerces folks that there should be a simpler way to request incremental SAX parsing. 
public	TokenNamepublic	
IncrementalSAXSource_Xerces	TokenNameIdentifier	 Incremental SAX Source  Xerces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Xerces-2 incremental parsing support (as of Beta 3) 	TokenNameCOMMENT_LINE	Xerces-2 incremental parsing support (as of Beta 3) 
// ContentHandlers still get set on fIncrementalParser (to get 	TokenNameCOMMENT_LINE	ContentHandlers still get set on fIncrementalParser (to get 
// conversion from XNI events to SAX events), but 	TokenNameCOMMENT_LINE	conversion from XNI events to SAX events), but 
// _control_ for incremental parsing must be exercised via the config. 	TokenNameCOMMENT_LINE	_control_ for incremental parsing must be exercised via the config. 
// 	TokenNameCOMMENT_LINE	 
// At this time there's no way to read the existing config, only 	TokenNameCOMMENT_LINE	At this time there's no way to read the existing config, only 
// to assert a new one... and only when creating a brand-new parser. 	TokenNameCOMMENT_LINE	to assert a new one... and only when creating a brand-new parser. 
// 	TokenNameCOMMENT_LINE	 
// Reflection is used to allow us to continue to compile against 	TokenNameCOMMENT_LINE	Reflection is used to allow us to continue to compile against 
// Xerces1. If/when we can abandon the older versions of the parser, 	TokenNameCOMMENT_LINE	Xerces1. If/when we can abandon the older versions of the parser, 
// this will simplify significantly. 	TokenNameCOMMENT_LINE	this will simplify significantly. 
// If we can't get the magic constructor, no need to look further. 	TokenNameCOMMENT_LINE	If we can't get the magic constructor, no need to look further. 
Class	TokenNameIdentifier	 Class
xniConfigClass	TokenNameIdentifier	 xni Config Class
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
"org.apache.xerces.xni.parser.XMLParserConfiguration"	TokenNameStringLiteral	org.apache.xerces.xni.parser.XMLParserConfiguration
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args1	TokenNameIdentifier	 args1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
xniConfigClass	TokenNameIdentifier	 xni Config Class
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
ctor	TokenNameIdentifier	 ctor
=	TokenNameEQUAL	
SAXParser	TokenNameIdentifier	 SAX Parser
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
args1	TokenNameIdentifier	 args1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Build the parser configuration object. StandardParserConfiguration 	TokenNameCOMMENT_LINE	Build the parser configuration object. StandardParserConfiguration 
// happens to implement XMLPullParserConfiguration, which is the API 	TokenNameCOMMENT_LINE	happens to implement XMLPullParserConfiguration, which is the API 
// we're going to want to use. 	TokenNameCOMMENT_LINE	we're going to want to use. 
Class	TokenNameIdentifier	 Class
xniStdConfigClass	TokenNameIdentifier	 xni Std Config Class
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
"org.apache.xerces.parsers.StandardParserConfiguration"	TokenNameStringLiteral	org.apache.xerces.parsers.StandardParserConfiguration
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fPullParserConfig	TokenNameIdentifier	 f Pull Parser Config
=	TokenNameEQUAL	
xniStdConfigClass	TokenNameIdentifier	 xni Std Config Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args2	TokenNameIdentifier	 args2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
fPullParserConfig	TokenNameIdentifier	 f Pull Parser Config
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAXParser	TokenNameIdentifier	 SAX Parser
)	TokenNameRPAREN	
ctor	TokenNameIdentifier	 ctor
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
args2	TokenNameIdentifier	 args2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Preload all the needed the configuration methods... I want to know they're 	TokenNameCOMMENT_LINE	Preload all the needed the configuration methods... I want to know they're 
// all here before we commit to trying to use them, just in case the 	TokenNameCOMMENT_LINE	all here before we commit to trying to use them, just in case the 
// API changes again. 	TokenNameCOMMENT_LINE	API changes again. 
Class	TokenNameIdentifier	 Class
fXniInputSourceClass	TokenNameIdentifier	 f Xni Input Source Class
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
"org.apache.xerces.xni.parser.XMLInputSource"	TokenNameStringLiteral	org.apache.xerces.xni.parser.XMLInputSource
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args3	TokenNameIdentifier	 args3
=	TokenNameEQUAL	
{	TokenNameLBRACE	
fXniInputSourceClass	TokenNameIdentifier	 f Xni Input Source Class
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fConfigSetInput	TokenNameIdentifier	 f Config Set Input
=	TokenNameEQUAL	
xniStdConfigClass	TokenNameIdentifier	 xni Std Config Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setInputSource"	TokenNameStringLiteral	setInputSource
,	TokenNameCOMMA	
args3	TokenNameIdentifier	 args3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args4	TokenNameIdentifier	 args4
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fConfigInputSourceCtor	TokenNameIdentifier	 f Config Input Source Ctor
=	TokenNameEQUAL	
fXniInputSourceClass	TokenNameIdentifier	 f Xni Input Source Class
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
args4	TokenNameIdentifier	 args4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args5	TokenNameIdentifier	 args5
=	TokenNameEQUAL	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fConfigSetByteStream	TokenNameIdentifier	 f Config Set Byte Stream
=	TokenNameEQUAL	
fXniInputSourceClass	TokenNameIdentifier	 f Xni Input Source Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setByteStream"	TokenNameStringLiteral	setByteStream
,	TokenNameCOMMA	
args5	TokenNameIdentifier	 args5
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args6	TokenNameIdentifier	 args6
=	TokenNameEQUAL	
{	TokenNameLBRACE	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fConfigSetCharStream	TokenNameIdentifier	 f Config Set Char Stream
=	TokenNameEQUAL	
fXniInputSourceClass	TokenNameIdentifier	 f Xni Input Source Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setCharacterStream"	TokenNameStringLiteral	setCharacterStream
,	TokenNameCOMMA	
args6	TokenNameIdentifier	 args6
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args7	TokenNameIdentifier	 args7
=	TokenNameEQUAL	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fConfigSetEncoding	TokenNameIdentifier	 f Config Set Encoding
=	TokenNameEQUAL	
fXniInputSourceClass	TokenNameIdentifier	 f Xni Input Source Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"setEncoding"	TokenNameStringLiteral	setEncoding
,	TokenNameCOMMA	
args7	TokenNameIdentifier	 args7
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argsb	TokenNameIdentifier	 argsb
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TYPE	TokenNameIdentifier	 TYPE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fConfigParse	TokenNameIdentifier	 f Config Parse
=	TokenNameEQUAL	
xniStdConfigClass	TokenNameIdentifier	 xni Std Config Class
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"parse"	TokenNameStringLiteral	parse
,	TokenNameCOMMA	
argsb	TokenNameIdentifier	 argsb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noargs	TokenNameIdentifier	 noargs
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fReset	TokenNameIdentifier	 f Reset
=	TokenNameEQUAL	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"reset"	TokenNameStringLiteral	reset
,	TokenNameCOMMA	
noargs	TokenNameIdentifier	 noargs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Fallback if this fails (implemented in createIncrementalSAXSource) is 	TokenNameCOMMENT_LINE	Fallback if this fails (implemented in createIncrementalSAXSource) is 
// to attempt Xerces-1 incremental setup. Can't do tail-call in 	TokenNameCOMMENT_LINE	to attempt Xerces-1 incremental setup. Can't do tail-call in 
// constructor, so create new, copy Xerces-1 initialization, 	TokenNameCOMMENT_LINE	constructor, so create new, copy Xerces-1 initialization, 
// then throw it away... Ugh. 	TokenNameCOMMENT_LINE	then throw it away... Ugh. 
IncrementalSAXSource_Xerces	TokenNameIdentifier	 Incremental SAX Source  Xerces
dummy	TokenNameIdentifier	 dummy
=	TokenNameEQUAL	
new	TokenNamenew	
IncrementalSAXSource_Xerces	TokenNameIdentifier	 Incremental SAX Source  Xerces
(	TokenNameLPAREN	
new	TokenNamenew	
SAXParser	TokenNameIdentifier	 SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fParseSomeSetup	TokenNameIdentifier	 f Parse Some Setup
=	TokenNameEQUAL	
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
fParseSomeSetup	TokenNameIdentifier	 f Parse Some Setup
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fParseSome	TokenNameIdentifier	 f Parse Some
=	TokenNameEQUAL	
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
fParseSome	TokenNameIdentifier	 f Parse Some
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
=	TokenNameEQUAL	
dummy	TokenNameIdentifier	 dummy
.	TokenNameDOT	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Create a IncrementalSAXSource_Xerces wrapped around * an existing SAXParser. Currently this works only for recent * releases of Xerces-1. Xerces-2 incremental is currently possible * only if we are allowed to create the parser instance, due to * limitations in the API exposed by Xerces-2 Beta 3; see the * no-args constructor for that code. * * @exception if the SAXParser class doesn't support the Xerces * incremental parse operations. In that case, caller should * fall back upon the IncrementalSAXSource_Filter approach. * */	TokenNameCOMMENT_JAVADOC	 Create a IncrementalSAXSource_Xerces wrapped around an existing SAXParser. Currently this works only for recent releases of Xerces-1. Xerces-2 incremental is currently possible only if we are allowed to create the parser instance, due to limitations in the API exposed by Xerces-2 Beta 3; see the no-args constructor for that code. * @exception if the SAXParser class doesn't support the Xerces incremental parse operations. In that case, caller should fall back upon the IncrementalSAXSource_Filter approach. 
public	TokenNamepublic	
IncrementalSAXSource_Xerces	TokenNameIdentifier	 Incremental SAX Source  Xerces
(	TokenNameLPAREN	
SAXParser	TokenNameIdentifier	 SAX Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
{	TokenNameLBRACE	
// Reflection is used to allow us to compile against 	TokenNameCOMMENT_LINE	Reflection is used to allow us to compile against 
// Xerces2. If/when we can abandon the older versions of the parser, 	TokenNameCOMMENT_LINE	Xerces2. If/when we can abandon the older versions of the parser, 
// this constructor will simply have to fail until/unless the 	TokenNameCOMMENT_LINE	this constructor will simply have to fail until/unless the 
// Xerces2 incremental support is made available on previously 	TokenNameCOMMENT_LINE	Xerces2 incremental support is made available on previously 
// constructed SAXParser instances. 	TokenNameCOMMENT_LINE	constructed SAXParser instances. 
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
me	TokenNameIdentifier	 me
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parms	TokenNameIdentifier	 parms
=	TokenNameEQUAL	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
.	TokenNameDOT	
class	TokenNameclass	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fParseSomeSetup	TokenNameIdentifier	 f Parse Some Setup
=	TokenNameEQUAL	
me	TokenNameIdentifier	 me
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"parseSomeSetup"	TokenNameStringLiteral	parseSomeSetup
,	TokenNameCOMMA	
parms	TokenNameIdentifier	 parms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parms	TokenNameIdentifier	 parms
=	TokenNameEQUAL	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fParseSome	TokenNameIdentifier	 f Parse Some
=	TokenNameEQUAL	
me	TokenNameIdentifier	 me
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"parseSome"	TokenNameStringLiteral	parseSome
,	TokenNameCOMMA	
parms	TokenNameIdentifier	 parms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fallback if this fails (implemented in createIncrementalSAXSource) is 	TokenNameCOMMENT_LINE	Fallback if this fails (implemented in createIncrementalSAXSource) is 
// to use IncrementalSAXSource_Filter rather than Xerces-specific code. 	TokenNameCOMMENT_LINE	to use IncrementalSAXSource_Filter rather than Xerces-specific code. 
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Factories 	TokenNameCOMMENT_LINE	Factories 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
public	TokenNamepublic	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
createIncrementalSAXSource	TokenNameIdentifier	 create Incremental SAX Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
IncrementalSAXSource_Xerces	TokenNameIdentifier	 Incremental SAX Source  Xerces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Xerces version mismatch; neither Xerces1 nor Xerces2 succeeded. 	TokenNameCOMMENT_LINE	Xerces version mismatch; neither Xerces1 nor Xerces2 succeeded. 
// Fall back on filtering solution. 	TokenNameCOMMENT_LINE	Fall back on filtering solution. 
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
iss	TokenNameIdentifier	 iss
=	TokenNameEQUAL	
new	TokenNamenew	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iss	TokenNameIdentifier	 iss
.	TokenNameDOT	
setXMLReader	TokenNameIdentifier	 set XML Reader
(	TokenNameLPAREN	
new	TokenNamenew	
SAXParser	TokenNameIdentifier	 SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
iss	TokenNameIdentifier	 iss
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
createIncrementalSAXSource	TokenNameIdentifier	 create Incremental SAX Source
(	TokenNameLPAREN	
SAXParser	TokenNameIdentifier	 SAX Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
IncrementalSAXSource_Xerces	TokenNameIdentifier	 Incremental SAX Source  Xerces
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Xerces version mismatch; neither Xerces1 nor Xerces2 succeeded. 	TokenNameCOMMENT_LINE	Xerces version mismatch; neither Xerces1 nor Xerces2 succeeded. 
// Fall back on filtering solution. 	TokenNameCOMMENT_LINE	Fall back on filtering solution. 
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
iss	TokenNameIdentifier	 iss
=	TokenNameEQUAL	
new	TokenNamenew	
IncrementalSAXSource_Filter	TokenNameIdentifier	 Incremental SAX Source  Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iss	TokenNameIdentifier	 iss
.	TokenNameDOT	
setXMLReader	TokenNameIdentifier	 set XML Reader
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
iss	TokenNameIdentifier	 iss
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
// Register handler directly with the incremental parser 	TokenNameCOMMENT_LINE	Register handler directly with the incremental parser 
public	TokenNamepublic	
void	TokenNamevoid	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Typecast required in Xerces2; SAXParser doesn't inheret XMLReader 	TokenNameCOMMENT_LINE	Typecast required in Xerces2; SAXParser doesn't inheret XMLReader 
// %OPT% Cast at asignment? 	TokenNameCOMMENT_LINE	%OPT% Cast at asignment? 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
)	TokenNameRPAREN	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
)	TokenNameRPAREN	
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Register handler directly with the incremental parser 	TokenNameCOMMENT_LINE	Register handler directly with the incremental parser 
public	TokenNamepublic	
void	TokenNamevoid	
setLexicalHandler	TokenNameIdentifier	 set Lexical Handler
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not supported by all SAX2 parsers but should work in Xerces: 	TokenNameCOMMENT_LINE	Not supported by all SAX2 parsers but should work in Xerces: 
try	TokenNametry	
{	TokenNameLBRACE	
// Typecast required in Xerces2; SAXParser doesn't inheret XMLReader 	TokenNameCOMMENT_LINE	Typecast required in Xerces2; SAXParser doesn't inheret XMLReader 
// %OPT% Cast at asignment? 	TokenNameCOMMENT_LINE	%OPT% Cast at asignment? 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
)	TokenNameRPAREN	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
)	TokenNameRPAREN	
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"http://xml.org/sax/properties/lexical-handler"	TokenNameStringLiteral	http://xml.org/sax/properties/lexical-handler
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotRecognizedException	TokenNameIdentifier	 SAX Not Recognized Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nothing we can do about it 	TokenNameCOMMENT_LINE	Nothing we can do about it 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXNotSupportedException	TokenNameIdentifier	 SAX Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nothing we can do about it 	TokenNameCOMMENT_LINE	Nothing we can do about it 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Register handler directly with the incremental parser 	TokenNameCOMMENT_LINE	Register handler directly with the incremental parser 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
DTDHandler	TokenNameIdentifier	 DTD Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Typecast required in Xerces2; SAXParser doesn't inheret XMLReader 	TokenNameCOMMENT_LINE	Typecast required in Xerces2; SAXParser doesn't inheret XMLReader 
// %OPT% Cast at asignment? 	TokenNameCOMMENT_LINE	%OPT% Cast at asignment? 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
)	TokenNameRPAREN	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
)	TokenNameRPAREN	
.	TokenNameDOT	
setDTDHandler	TokenNameIdentifier	 set DTD Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
/** startParse() is a simple API which tells the IncrementalSAXSource * to begin reading a document. * * @throws SAXException is parse thread is already in progress * or parsing can not be started. * */	TokenNameCOMMENT_JAVADOC	 startParse() is a simple API which tells the IncrementalSAXSource to begin reading a document. * @throws SAXException is parse thread is already in progress or parsing can not be started. 
public	TokenNamepublic	
void	TokenNamevoid	
startParse	TokenNameIdentifier	 start Parse
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_STARTPARSE_NEEDS_SAXPARSER	TokenNameIdentifier	 ER  STARTPARSE  NEEDS  SAXPARSER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"startParse needs a non-null SAXParser."); 	TokenNameCOMMENT_LINE	"startParse needs a non-null SAXParser."); 
if	TokenNameif	
(	TokenNameLPAREN	
fParseInProgress	TokenNameIdentifier	 f Parse In Progress
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_STARTPARSE_WHILE_PARSING	TokenNameIdentifier	 ER  STARTPARSE  WHILE  PARSING
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"startParse may not be called while parsing."); 	TokenNameCOMMENT_LINE	"startParse may not be called while parsing."); 
boolean	TokenNameboolean	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
parseSomeSetup	TokenNameIdentifier	 parse Some Setup
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_COULD_NOT_INIT_PARSER	TokenNameIdentifier	 ER  COULD  NOT  INIT  PARSER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"could not initialize parser with"); 	TokenNameCOMMENT_LINE	"could not initialize parser with"); 
}	TokenNameRBRACE	
/** deliverMoreNodes() is a simple API which tells the coroutine * parser that we need more nodes. This is intended to be called * from one of our partner routines, and serves to encapsulate the * details of how incremental parsing has been achieved. * * @param parsemore If true, tells the incremental parser to generate * another chunk of output. If false, tells the parser that we're * satisfied and it can terminate parsing of this document. * @return Boolean.TRUE if the CoroutineParser believes more data may be available * for further parsing. Boolean.FALSE if parsing ran to completion. * Exception if the parser objected for some reason. * */	TokenNameCOMMENT_JAVADOC	 deliverMoreNodes() is a simple API which tells the coroutine parser that we need more nodes. This is intended to be called from one of our partner routines, and serves to encapsulate the details of how incremental parsing has been achieved. * @param parsemore If true, tells the incremental parser to generate another chunk of output. If false, tells the parser that we're satisfied and it can terminate parsing of this document. @return Boolean.TRUE if the CoroutineParser believes more data may be available for further parsing. Boolean.FALSE if parsing ran to completion. Exception if the parser objected for some reason. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
deliverMoreNodes	TokenNameIdentifier	 deliver More Nodes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
parsemore	TokenNameIdentifier	 parsemore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
parsemore	TokenNameIdentifier	 parsemore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fParseInProgress	TokenNameIdentifier	 f Parse In Progress
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
keepgoing	TokenNameIdentifier	 keepgoing
=	TokenNameEQUAL	
parseSome	TokenNameIdentifier	 parse Some
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
keepgoing	TokenNameIdentifier	 keepgoing
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Private methods -- conveniences to hide the reflection details 	TokenNameCOMMENT_LINE	Private methods -- conveniences to hide the reflection details 
private	TokenNameprivate	
boolean	TokenNameboolean	
parseSomeSetup	TokenNameIdentifier	 parse Some Setup
(	TokenNameLPAREN	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
InstantiationException	TokenNameIdentifier	 Instantiation Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fConfigSetInput	TokenNameIdentifier	 f Config Set Input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Obtain input from SAX inputSource object, construct XNI version of 	TokenNameCOMMENT_LINE	Obtain input from SAX inputSource object, construct XNI version of 
// that object. Logic adapted from Xerces2. 	TokenNameCOMMENT_LINE	that object. Logic adapted from Xerces2. 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parms1	TokenNameIdentifier	 parms1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
xmlsource	TokenNameIdentifier	 xmlsource
=	TokenNameEQUAL	
fConfigInputSourceCtor	TokenNameIdentifier	 f Config Input Source Ctor
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
parms1	TokenNameIdentifier	 parms1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parmsa	TokenNameIdentifier	 parmsa
=	TokenNameEQUAL	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getByteStream	TokenNameIdentifier	 get Byte Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fConfigSetByteStream	TokenNameIdentifier	 f Config Set Byte Stream
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
xmlsource	TokenNameIdentifier	 xmlsource
,	TokenNameCOMMA	
parmsa	TokenNameIdentifier	 parmsa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parmsa	TokenNameIdentifier	 parmsa
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getCharacterStream	TokenNameIdentifier	 get Character Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fConfigSetCharStream	TokenNameIdentifier	 f Config Set Char Stream
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
xmlsource	TokenNameIdentifier	 xmlsource
,	TokenNameCOMMA	
parmsa	TokenNameIdentifier	 parmsa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parmsa	TokenNameIdentifier	 parmsa
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fConfigSetEncoding	TokenNameIdentifier	 f Config Set Encoding
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
xmlsource	TokenNameIdentifier	 xmlsource
,	TokenNameCOMMA	
parmsa	TokenNameIdentifier	 parmsa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Bugzilla5272 patch suggested by Sandy Gao. 	TokenNameCOMMENT_LINE	Bugzilla5272 patch suggested by Sandy Gao. 
// Has to be reflection to run with Xerces2 	TokenNameCOMMENT_LINE	Has to be reflection to run with Xerces2 
// after compilation against Xerces1. or vice 	TokenNameCOMMENT_LINE	after compilation against Xerces1. or vice 
// versa, due to return type mismatches. 	TokenNameCOMMENT_LINE	versa, due to return type mismatches. 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noparms	TokenNameIdentifier	 noparms
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fReset	TokenNameIdentifier	 f Reset
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
,	TokenNameCOMMA	
noparms	TokenNameIdentifier	 noparms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parmsa	TokenNameIdentifier	 parmsa
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
xmlsource	TokenNameIdentifier	 xmlsource
;	TokenNameSEMICOLON	
fConfigSetInput	TokenNameIdentifier	 f Config Set Input
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
fPullParserConfig	TokenNameIdentifier	 f Pull Parser Config
,	TokenNameCOMMA	
parmsa	TokenNameIdentifier	 parmsa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %REVIEW% Do first pull. Should we instead just return true? 	TokenNameCOMMENT_LINE	%REVIEW% Do first pull. Should we instead just return true? 
return	TokenNamereturn	
parseSome	TokenNameIdentifier	 parse Some
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parm	TokenNameIdentifier	 parm
=	TokenNameEQUAL	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
fParseSomeSetup	TokenNameIdentifier	 f Parse Some Setup
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
,	TokenNameCOMMA	
parm	TokenNameIdentifier	 parm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Would null work??? 	TokenNameCOMMENT_LINE	Would null work??? 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
noparms	TokenNameIdentifier	 noparms
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parmsfalse	TokenNameIdentifier	 parmsfalse
=	TokenNameEQUAL	
{	TokenNameLBRACE	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
parseSome	TokenNameIdentifier	 parse Some
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
IllegalAccessException	TokenNameIdentifier	 Illegal Access Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
InvocationTargetException	TokenNameIdentifier	 Invocation Target Exception
{	TokenNameLBRACE	
// Take next parsing step, return false iff parsing complete: 	TokenNameCOMMENT_LINE	Take next parsing step, return false iff parsing complete: 
if	TokenNameif	
(	TokenNameLPAREN	
fConfigSetInput	TokenNameIdentifier	 f Config Set Input
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fConfigParse	TokenNameIdentifier	 f Config Parse
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
fPullParserConfig	TokenNameIdentifier	 f Pull Parser Config
,	TokenNameCOMMA	
parmsfalse	TokenNameIdentifier	 parmsfalse
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
fParseSome	TokenNameIdentifier	 f Parse Some
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
fIncrementalParser	TokenNameIdentifier	 f Incremental Parser
,	TokenNameCOMMA	
noparms	TokenNameIdentifier	 noparms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
/** Simple unit test. Attempt coroutine parsing of document indicated * by first argument (as a URI), report progress. */	TokenNameCOMMENT_JAVADOC	 Simple unit test. Attempt coroutine parsing of document indicated by first argument (as a URI), report progress. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Starting..."	TokenNameStringLiteral	Starting...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
co	TokenNameIdentifier	 co
=	TokenNameEQUAL	
new	TokenNamenew	
CoroutineManager	TokenNameIdentifier	 Coroutine Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
appCoroutineID	TokenNameIdentifier	 app Coroutine ID
=	TokenNameEQUAL	
co	TokenNameIdentifier	 co
.	TokenNameDOT	
co_joinCoroutineSet	TokenNameIdentifier	 co join Coroutine Set
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
appCoroutineID	TokenNameIdentifier	 app Coroutine ID
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ERROR: Couldn't allocate coroutine number. "	TokenNameStringLiteral	ERROR: Couldn't allocate coroutine number. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IncrementalSAXSource	TokenNameIdentifier	 Incremental SAX Source
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
createIncrementalSAXSource	TokenNameIdentifier	 create Incremental SAX Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Use a serializer as our sample output 	TokenNameCOMMENT_LINE	Use a serializer as our sample output 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
.	TokenNameDOT	
XMLSerializer	TokenNameIdentifier	 XML Serializer
trace	TokenNameIdentifier	 trace
;	TokenNameSEMICOLON	
trace	TokenNameIdentifier	 trace
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
.	TokenNameDOT	
XMLSerializer	TokenNameIdentifier	 XML Serializer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setContentHandler	TokenNameIdentifier	 set Content Handler
(	TokenNameLPAREN	
trace	TokenNameIdentifier	 trace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
setLexicalHandler	TokenNameIdentifier	 set Lexical Handler
(	TokenNameLPAREN	
trace	TokenNameIdentifier	 trace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Tell coroutine to begin parsing, run while parsing is in progress 	TokenNameCOMMENT_LINE	Tell coroutine to begin parsing, run while parsing is in progress 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
arg	TokenNameIdentifier	 arg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
arg	TokenNameIdentifier	 arg
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
arg	TokenNameIdentifier	 arg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InputSource	TokenNameIdentifier	 Input Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
arg	TokenNameIdentifier	 arg
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
startParse	TokenNameIdentifier	 start Parse
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
deliverMoreNodes	TokenNameIdentifier	 deliver More Nodes
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
deliverMoreNodes	TokenNameIdentifier	 deliver More Nodes
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Some parsing successful, trying more. "	TokenNameStringLiteral	 Some parsing successful, trying more. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Special test: Terminate parsing early. 	TokenNameCOMMENT_LINE	Special test: Terminate parsing early. 
if	TokenNameif	
(	TokenNameLPAREN	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
"!"	TokenNameStringLiteral	!
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
arg	TokenNameIdentifier	 arg
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
arg	TokenNameIdentifier	 arg
;	TokenNameSEMICOLON	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" Parser ended (EOF or on request). "	TokenNameStringLiteral	 Parser ended (EOF or on request). 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" UNEXPECTED: Parser says shut down prematurely. "	TokenNameStringLiteral	 UNEXPECTED: Parser says shut down prematurely. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
Exception	TokenNameIdentifier	 Exception
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("\nParser threw exception:"); 	TokenNameCOMMENT_LINE	System.out.println("\nParser threw exception:"); 
// ((Exception)result).printStackTrace(); 	TokenNameCOMMENT_LINE	((Exception)result).printStackTrace(); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SAXException	TokenNameIdentifier	 SAX Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class IncrementalSAXSource_Xerces 	TokenNameCOMMENT_LINE	class IncrementalSAXSource_Xerces 
