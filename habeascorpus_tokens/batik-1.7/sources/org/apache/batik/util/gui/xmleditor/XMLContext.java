/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
xmleditor	TokenNameIdentifier	 xmleditor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
StyleContext	TokenNameIdentifier	 Style Context
;	TokenNameSEMICOLON	
/** * A pool of styles and their associated resources * * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 A pool of styles and their associated resources * @author <a href="mailto:tonny@kiyut.com">Tonny Kohar</a> @version $Id$ 
public	TokenNamepublic	
class	TokenNameclass	
XMLContext	TokenNameIdentifier	 XML Context
extends	TokenNameextends	
StyleContext	TokenNameIdentifier	 Style Context
{	TokenNameLBRACE	
//public static String DEFAULT_SYNTAX = "DEFAULT_SYNTAX"; 	TokenNameCOMMENT_LINE	public static String DEFAULT_SYNTAX = "DEFAULT_SYNTAX"; 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
XML_DECLARATION_STYLE	TokenNameIdentifier	 XML  DECLARATION  STYLE
=	TokenNameEQUAL	
"xml_declaration"	TokenNameStringLiteral	xml_declaration
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOCTYPE_STYLE	TokenNameIdentifier	 DOCTYPE  STYLE
=	TokenNameEQUAL	
"doctype"	TokenNameStringLiteral	doctype
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMMENT_STYLE	TokenNameIdentifier	 COMMENT  STYLE
=	TokenNameEQUAL	
"comment"	TokenNameStringLiteral	comment
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ELEMENT_STYLE	TokenNameIdentifier	 ELEMENT  STYLE
=	TokenNameEQUAL	
"element"	TokenNameStringLiteral	element
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHARACTER_DATA_STYLE	TokenNameIdentifier	 CHARACTER  DATA  STYLE
=	TokenNameEQUAL	
"character_data"	TokenNameStringLiteral	character_data
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_NAME_STYLE	TokenNameIdentifier	 ATTRIBUTE  NAME  STYLE
=	TokenNameEQUAL	
"attribute_name"	TokenNameStringLiteral	attribute_name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_VALUE_STYLE	TokenNameIdentifier	 ATTRIBUTE  VALUE  STYLE
=	TokenNameEQUAL	
"attribute_value"	TokenNameStringLiteral	attribute_value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CDATA_STYLE	TokenNameIdentifier	 CDATA  STYLE
=	TokenNameEQUAL	
"cdata"	TokenNameStringLiteral	cdata
;	TokenNameSEMICOLON	
/** Map<String, Color> */	TokenNameCOMMENT_JAVADOC	 Map<String, Color> 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Map<String, Font> */	TokenNameCOMMENT_JAVADOC	 Map<String, Font> 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XMLContext	TokenNameIdentifier	 XML Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// initialize the default syntax highlight 	TokenNameCOMMENT_LINE	initialize the default syntax highlight 
// could be integrated with Application Preferences 	TokenNameCOMMENT_LINE	could be integrated with Application Preferences 
String	TokenNameIdentifier	 String
syntaxName	TokenNameIdentifier	 syntax Name
;	TokenNameSEMICOLON	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
Color	TokenNameIdentifier	 Color
fontForeground	TokenNameIdentifier	 font Foreground
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Font	TokenNameIdentifier	 Font
defaultFont	TokenNameIdentifier	 default Font
=	TokenNameEQUAL	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
"Monospaced"	TokenNameStringLiteral	Monospaced
,	TokenNameCOMMA	
Font	TokenNameIdentifier	 Font
.	TokenNameDOT	
PLAIN	TokenNameIdentifier	 PLAIN
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxName	TokenNameIdentifier	 syntax Name
=	TokenNameEQUAL	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
DEFAULT_STYLE	TokenNameIdentifier	 DEFAULT  STYLE
;	TokenNameSEMICOLON	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
defaultFont	TokenNameIdentifier	 default Font
;	TokenNameSEMICOLON	
fontForeground	TokenNameIdentifier	 font Foreground
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
fontForeground	TokenNameIdentifier	 font Foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxName	TokenNameIdentifier	 syntax Name
=	TokenNameEQUAL	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
XML_DECLARATION_STYLE	TokenNameIdentifier	 XML  DECLARATION  STYLE
;	TokenNameSEMICOLON	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
defaultFont	TokenNameIdentifier	 default Font
.	TokenNameDOT	
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
.	TokenNameDOT	
BOLD	TokenNameIdentifier	 BOLD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontForeground	TokenNameIdentifier	 font Foreground
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
124	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
fontForeground	TokenNameIdentifier	 font Foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxName	TokenNameIdentifier	 syntax Name
=	TokenNameEQUAL	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
DOCTYPE_STYLE	TokenNameIdentifier	 DOCTYPE  STYLE
;	TokenNameSEMICOLON	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
defaultFont	TokenNameIdentifier	 default Font
.	TokenNameDOT	
deriveFont	TokenNameIdentifier	 derive Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
.	TokenNameDOT	
BOLD	TokenNameIdentifier	 BOLD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fontForeground	TokenNameIdentifier	 font Foreground
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
124	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
fontForeground	TokenNameIdentifier	 font Foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxName	TokenNameIdentifier	 syntax Name
=	TokenNameEQUAL	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
COMMENT_STYLE	TokenNameIdentifier	 COMMENT  STYLE
;	TokenNameSEMICOLON	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
defaultFont	TokenNameIdentifier	 default Font
;	TokenNameSEMICOLON	
fontForeground	TokenNameIdentifier	 font Foreground
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
128	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
128	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
128	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
fontForeground	TokenNameIdentifier	 font Foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxName	TokenNameIdentifier	 syntax Name
=	TokenNameEQUAL	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
ELEMENT_STYLE	TokenNameIdentifier	 ELEMENT  STYLE
;	TokenNameSEMICOLON	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
defaultFont	TokenNameIdentifier	 default Font
;	TokenNameSEMICOLON	
fontForeground	TokenNameIdentifier	 font Foreground
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
fontForeground	TokenNameIdentifier	 font Foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxName	TokenNameIdentifier	 syntax Name
=	TokenNameEQUAL	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
CHARACTER_DATA_STYLE	TokenNameIdentifier	 CHARACTER  DATA  STYLE
;	TokenNameSEMICOLON	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
defaultFont	TokenNameIdentifier	 default Font
;	TokenNameSEMICOLON	
fontForeground	TokenNameIdentifier	 font Foreground
=	TokenNameEQUAL	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
black	TokenNameIdentifier	 black
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
fontForeground	TokenNameIdentifier	 font Foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxName	TokenNameIdentifier	 syntax Name
=	TokenNameEQUAL	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
ATTRIBUTE_NAME_STYLE	TokenNameIdentifier	 ATTRIBUTE  NAME  STYLE
;	TokenNameSEMICOLON	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
defaultFont	TokenNameIdentifier	 default Font
;	TokenNameSEMICOLON	
fontForeground	TokenNameIdentifier	 font Foreground
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
124	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
fontForeground	TokenNameIdentifier	 font Foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxName	TokenNameIdentifier	 syntax Name
=	TokenNameEQUAL	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
ATTRIBUTE_VALUE_STYLE	TokenNameIdentifier	 ATTRIBUTE  VALUE  STYLE
;	TokenNameSEMICOLON	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
defaultFont	TokenNameIdentifier	 default Font
;	TokenNameSEMICOLON	
fontForeground	TokenNameIdentifier	 font Foreground
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
153	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
107	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
fontForeground	TokenNameIdentifier	 font Foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxName	TokenNameIdentifier	 syntax Name
=	TokenNameEQUAL	
XMLContext	TokenNameIdentifier	 XML Context
.	TokenNameDOT	
CDATA_STYLE	TokenNameIdentifier	 CDATA  STYLE
;	TokenNameSEMICOLON	
font	TokenNameIdentifier	 font
=	TokenNameEQUAL	
defaultFont	TokenNameIdentifier	 default Font
;	TokenNameSEMICOLON	
fontForeground	TokenNameIdentifier	 font Foreground
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
124	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
syntaxName	TokenNameIdentifier	 syntax Name
,	TokenNameCOMMA	
fontForeground	TokenNameIdentifier	 font Foreground
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XMLContext	TokenNameIdentifier	 XML Context
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSyntaxFont	TokenNameIdentifier	 set Syntax Font
(	TokenNameLPAREN	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSyntaxForeground	TokenNameIdentifier	 set Syntax Foreground
(	TokenNameLPAREN	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSyntaxForeground	TokenNameIdentifier	 set Syntax Foreground
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"syntaxForegroundMap can not be null"	TokenNameStringLiteral	syntaxForegroundMap can not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
=	TokenNameEQUAL	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSyntaxFont	TokenNameIdentifier	 set Syntax Font
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"syntaxFontMap can not be null"	TokenNameStringLiteral	syntaxFontMap can not be null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
=	TokenNameEQUAL	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Color	TokenNameIdentifier	 Color
getSyntaxForeground	TokenNameIdentifier	 get Syntax Foreground
(	TokenNameLPAREN	
int	TokenNameint	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getSyntaxName	TokenNameIdentifier	 get Syntax Name
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getSyntaxForeground	TokenNameIdentifier	 get Syntax Foreground
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Color	TokenNameIdentifier	 Color
getSyntaxForeground	TokenNameIdentifier	 get Syntax Foreground
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
)	TokenNameRPAREN	
syntaxForegroundMap	TokenNameIdentifier	 syntax Foreground Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Font	TokenNameIdentifier	 Font
getSyntaxFont	TokenNameIdentifier	 get Syntax Font
(	TokenNameLPAREN	
int	TokenNameint	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getSyntaxName	TokenNameIdentifier	 get Syntax Name
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getSyntaxFont	TokenNameIdentifier	 get Syntax Font
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Font	TokenNameIdentifier	 Font
getSyntaxFont	TokenNameIdentifier	 get Syntax Font
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
)	TokenNameRPAREN	
syntaxFontMap	TokenNameIdentifier	 syntax Font Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSyntaxName	TokenNameIdentifier	 get Syntax Name
(	TokenNameLPAREN	
int	TokenNameint	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
CHARACTER_DATA_STYLE	TokenNameIdentifier	 CHARACTER  DATA  STYLE
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
XMLScanner	TokenNameIdentifier	 XML Scanner
.	TokenNameDOT	
XML_DECLARATION_CONTEXT	TokenNameIdentifier	 XML  DECLARATION  CONTEXT
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
XML_DECLARATION_STYLE	TokenNameIdentifier	 XML  DECLARATION  STYLE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLScanner	TokenNameIdentifier	 XML Scanner
.	TokenNameDOT	
DOCTYPE_CONTEXT	TokenNameIdentifier	 DOCTYPE  CONTEXT
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
DOCTYPE_STYLE	TokenNameIdentifier	 DOCTYPE  STYLE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLScanner	TokenNameIdentifier	 XML Scanner
.	TokenNameDOT	
COMMENT_CONTEXT	TokenNameIdentifier	 COMMENT  CONTEXT
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
COMMENT_STYLE	TokenNameIdentifier	 COMMENT  STYLE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLScanner	TokenNameIdentifier	 XML Scanner
.	TokenNameDOT	
ELEMENT_CONTEXT	TokenNameIdentifier	 ELEMENT  CONTEXT
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ELEMENT_STYLE	TokenNameIdentifier	 ELEMENT  STYLE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLScanner	TokenNameIdentifier	 XML Scanner
.	TokenNameDOT	
ATTRIBUTE_NAME_CONTEXT	TokenNameIdentifier	 ATTRIBUTE  NAME  CONTEXT
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ATTRIBUTE_NAME_STYLE	TokenNameIdentifier	 ATTRIBUTE  NAME  STYLE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLScanner	TokenNameIdentifier	 XML Scanner
.	TokenNameDOT	
ATTRIBUTE_VALUE_CONTEXT	TokenNameIdentifier	 ATTRIBUTE  VALUE  CONTEXT
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ATTRIBUTE_VALUE_STYLE	TokenNameIdentifier	 ATTRIBUTE  VALUE  STYLE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XMLScanner	TokenNameIdentifier	 XML Scanner
.	TokenNameDOT	
CDATA_CONTEXT	TokenNameIdentifier	 CDATA  CONTEXT
:	TokenNameCOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
CDATA_STYLE	TokenNameIdentifier	 CDATA  STYLE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
// should not go here, just incase 	TokenNameCOMMENT_LINE	should not go here, just incase 
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
DEFAULT_STYLE	TokenNameIdentifier	 DEFAULT  STYLE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
