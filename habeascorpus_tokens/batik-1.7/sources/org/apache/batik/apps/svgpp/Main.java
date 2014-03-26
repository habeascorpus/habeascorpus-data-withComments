/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgpp	TokenNameIdentifier	 svgpp
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
i18n	TokenNameIdentifier	 i18n
.	TokenNameDOT	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
Transcoder	TokenNameIdentifier	 Transcoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
svg2svg	TokenNameIdentifier	 svg2svg
.	TokenNameDOT	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
;	TokenNameSEMICOLON	
/** * This class is the main class of the svgpp application. * <p> * svgpp is a pretty-printer for SVG source files. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: Main.java 478160 2006-11-22 13:35:06Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class is the main class of the svgpp application. <p> svgpp is a pretty-printer for SVG source files. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: Main.java 478160 2006-11-22 13:35:06Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Main	TokenNameIdentifier	 Main
{	TokenNameLBRACE	
/** * The application main method. * @param args The command-line arguments. */	TokenNameCOMMENT_JAVADOC	 The application main method. @param args The command-line arguments. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
Main	TokenNameIdentifier	 Main
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
.	TokenNameDOT	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The default resource bundle base name. */	TokenNameCOMMENT_JAVADOC	 The default resource bundle base name. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BUNDLE_CLASSNAME	TokenNameIdentifier	 BUNDLE  CLASSNAME
=	TokenNameEQUAL	
"org.apache.batik.apps.svgpp.resources.Messages"	TokenNameStringLiteral	org.apache.batik.apps.svgpp.resources.Messages
;	TokenNameSEMICOLON	
/** * The localizable support. */	TokenNameCOMMENT_JAVADOC	 The localizable support. 
protected	TokenNameprotected	
static	TokenNamestatic	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
localizableSupport	TokenNameIdentifier	 localizable Support
=	TokenNameEQUAL	
new	TokenNamenew	
LocalizableSupport	TokenNameIdentifier	 Localizable Support
(	TokenNameLPAREN	
BUNDLE_CLASSNAME	TokenNameIdentifier	 BUNDLE  CLASSNAME
,	TokenNameCOMMA	
Main	TokenNameIdentifier	 Main
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getClassLoader	TokenNameIdentifier	 get Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The arguments. */	TokenNameCOMMENT_JAVADOC	 The arguments. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
;	TokenNameSEMICOLON	
/** * The current index. */	TokenNameCOMMENT_JAVADOC	 The current index. 
protected	TokenNameprotected	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * The option handlers. */	TokenNameCOMMENT_JAVADOC	 The option handlers. 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
handlers	TokenNameIdentifier	 handlers
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"-doctype"	TokenNameStringLiteral	-doctype
,	TokenNameCOMMA	
new	TokenNamenew	
DoctypeHandler	TokenNameIdentifier	 Doctype Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"-doc-width"	TokenNameStringLiteral	-doc-width
,	TokenNameCOMMA	
new	TokenNamenew	
DocWidthHandler	TokenNameIdentifier	 Doc Width Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"-newline"	TokenNameStringLiteral	-newline
,	TokenNameCOMMA	
new	TokenNamenew	
NewlineHandler	TokenNameIdentifier	 Newline Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"-public-id"	TokenNameStringLiteral	-public-id
,	TokenNameCOMMA	
new	TokenNamenew	
PublicIdHandler	TokenNameIdentifier	 Public Id Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"-no-format"	TokenNameStringLiteral	-no-format
,	TokenNameCOMMA	
new	TokenNamenew	
NoFormatHandler	TokenNameIdentifier	 No Format Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"-system-id"	TokenNameStringLiteral	-system-id
,	TokenNameCOMMA	
new	TokenNamenew	
SystemIdHandler	TokenNameIdentifier	 System Id Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"-tab-width"	TokenNameStringLiteral	-tab-width
,	TokenNameCOMMA	
new	TokenNamenew	
TabWidthHandler	TokenNameIdentifier	 Tab Width Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"-xml-decl"	TokenNameStringLiteral	-xml-decl
,	TokenNameCOMMA	
new	TokenNamenew	
XMLDeclHandler	TokenNameIdentifier	 XML Decl Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The transcoder. */	TokenNameCOMMENT_JAVADOC	 The transcoder. 
protected	TokenNameprotected	
Transcoder	TokenNameIdentifier	 Transcoder
transcoder	TokenNameIdentifier	 transcoder
=	TokenNameEQUAL	
new	TokenNamenew	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Initializes the application. * @param args The command-line arguments. */	TokenNameCOMMENT_JAVADOC	 Initializes the application. @param args The command-line arguments. 
public	TokenNamepublic	
Main	TokenNameIdentifier	 Main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arguments	TokenNameIdentifier	 arguments
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Runs the pretty printer. */	TokenNameCOMMENT_JAVADOC	 Runs the pretty printer. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OptionHandler	TokenNameIdentifier	 Option Handler
oh	TokenNameIdentifier	 oh
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OptionHandler	TokenNameIdentifier	 Option Handler
)	TokenNameRPAREN	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oh	TokenNameIdentifier	 oh
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
oh	TokenNameIdentifier	 oh
.	TokenNameDOT	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
TranscoderInput	TokenNameIdentifier	 Transcoder Input
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileReader	TokenNameIdentifier	 File Reader
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
out	TokenNameIdentifier	 out
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
TranscoderOutput	TokenNameIdentifier	 Transcoder Output
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
transcode	TokenNameIdentifier	 transcode
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
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
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints the command usage. */	TokenNameCOMMENT_JAVADOC	 Prints the command usage. 
protected	TokenNameprotected	
void	TokenNamevoid	
printUsage	TokenNameIdentifier	 print Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
printHeader	TokenNameIdentifier	 print Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"syntax"	TokenNameStringLiteral	syntax
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"options"	TokenNameStringLiteral	options
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OptionHandler	TokenNameIdentifier	 Option Handler
)	TokenNameRPAREN	
handlers	TokenNameIdentifier	 handlers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Prints the command header. */	TokenNameCOMMENT_JAVADOC	 Prints the command header. 
protected	TokenNameprotected	
void	TokenNamevoid	
printHeader	TokenNameIdentifier	 print Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"header"	TokenNameStringLiteral	header
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This interface represents an option handler. */	TokenNameCOMMENT_JAVADOC	 This interface represents an option handler. 
protected	TokenNameprotected	
interface	TokenNameinterface	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
/** * Handles the current option. */	TokenNameCOMMENT_JAVADOC	 Handles the current option. 
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the option description. */	TokenNameCOMMENT_JAVADOC	 Returns the option description. 
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To handle the '-doctype' option. */	TokenNameCOMMENT_JAVADOC	 To handle the '-doctype' option. 
protected	TokenNameprotected	
class	TokenNameclass	
DoctypeHandler	TokenNameIdentifier	 Doctype Handler
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"remove"	TokenNameStringLiteral	remove
,	TokenNameCOMMA	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
VALUE_DOCTYPE_REMOVE	TokenNameIdentifier	 VALUE  DOCTYPE  REMOVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"change"	TokenNameStringLiteral	change
,	TokenNameCOMMA	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
VALUE_DOCTYPE_CHANGE	TokenNameIdentifier	 VALUE  DOCTYPE  CHANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
addTranscodingHint	TokenNameIdentifier	 add Transcoding Hint
(	TokenNameLPAREN	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
KEY_DOCTYPE	TokenNameIdentifier	 KEY  DOCTYPE
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"doctype.description"	TokenNameStringLiteral	doctype.description
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To handle the '-newline' option. */	TokenNameCOMMENT_JAVADOC	 To handle the '-newline' option. 
protected	TokenNameprotected	
class	TokenNameclass	
NewlineHandler	TokenNameIdentifier	 Newline Handler
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"cr"	TokenNameStringLiteral	cr
,	TokenNameCOMMA	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
VALUE_NEWLINE_CR	TokenNameIdentifier	 VALUE  NEWLINE  CR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"cr-lf"	TokenNameStringLiteral	cr-lf
,	TokenNameCOMMA	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
VALUE_NEWLINE_CR_LF	TokenNameIdentifier	 VALUE  NEWLINE  CR  LF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"lf"	TokenNameStringLiteral	lf
,	TokenNameCOMMA	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
VALUE_NEWLINE_LF	TokenNameIdentifier	 VALUE  NEWLINE  LF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
addTranscodingHint	TokenNameIdentifier	 add Transcoding Hint
(	TokenNameLPAREN	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
KEY_NEWLINE	TokenNameIdentifier	 KEY  NEWLINE
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"newline.description"	TokenNameStringLiteral	newline.description
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To handle the '-no-format' option. */	TokenNameCOMMENT_JAVADOC	 To handle the '-no-format' option. 
protected	TokenNameprotected	
class	TokenNameclass	
NoFormatHandler	TokenNameIdentifier	 No Format Handler
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
addTranscodingHint	TokenNameIdentifier	 add Transcoding Hint
(	TokenNameLPAREN	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
KEY_FORMAT	TokenNameIdentifier	 KEY  FORMAT
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"no-format.description"	TokenNameStringLiteral	no-format.description
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To handle the '-public-id' option. */	TokenNameCOMMENT_JAVADOC	 To handle the '-public-id' option. 
protected	TokenNameprotected	
class	TokenNameclass	
PublicIdHandler	TokenNameIdentifier	 Public Id Handler
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
addTranscodingHint	TokenNameIdentifier	 add Transcoding Hint
(	TokenNameLPAREN	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
KEY_PUBLIC_ID	TokenNameIdentifier	 KEY  PUBLIC  ID
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"public-id.description"	TokenNameStringLiteral	public-id.description
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To handle the '-system-id' option. */	TokenNameCOMMENT_JAVADOC	 To handle the '-system-id' option. 
protected	TokenNameprotected	
class	TokenNameclass	
SystemIdHandler	TokenNameIdentifier	 System Id Handler
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
addTranscodingHint	TokenNameIdentifier	 add Transcoding Hint
(	TokenNameLPAREN	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
KEY_SYSTEM_ID	TokenNameIdentifier	 KEY  SYSTEM  ID
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"system-id.description"	TokenNameStringLiteral	system-id.description
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To handle the '-xml-decl' option. */	TokenNameCOMMENT_JAVADOC	 To handle the '-xml-decl' option. 
protected	TokenNameprotected	
class	TokenNameclass	
XMLDeclHandler	TokenNameIdentifier	 XML Decl Handler
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
addTranscodingHint	TokenNameIdentifier	 add Transcoding Hint
(	TokenNameLPAREN	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
KEY_XML_DECLARATION	TokenNameIdentifier	 KEY  XML  DECLARATION
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"xml-decl.description"	TokenNameStringLiteral	xml-decl.description
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To handle the '-tab-width' option. */	TokenNameCOMMENT_JAVADOC	 To handle the '-tab-width' option. 
protected	TokenNameprotected	
class	TokenNameclass	
TabWidthHandler	TokenNameIdentifier	 Tab Width Handler
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
addTranscodingHint	TokenNameIdentifier	 add Transcoding Hint
(	TokenNameLPAREN	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
KEY_TABULATION_WIDTH	TokenNameIdentifier	 KEY  TABULATION  WIDTH
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"tab-width.description"	TokenNameStringLiteral	tab-width.description
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To handle the '-doc-width' option. */	TokenNameCOMMENT_JAVADOC	 To handle the '-doc-width' option. 
protected	TokenNameprotected	
class	TokenNameclass	
DocWidthHandler	TokenNameIdentifier	 Doc Width Handler
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
arguments	TokenNameIdentifier	 arguments
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transcoder	TokenNameIdentifier	 transcoder
.	TokenNameDOT	
addTranscodingHint	TokenNameIdentifier	 add Transcoding Hint
(	TokenNameLPAREN	
SVGTranscoder	TokenNameIdentifier	 SVG Transcoder
.	TokenNameDOT	
KEY_DOCUMENT_WIDTH	TokenNameIdentifier	 KEY  DOCUMENT  WIDTH
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
arguments	TokenNameIdentifier	 arguments
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localizableSupport	TokenNameIdentifier	 localizable Support
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"doc-width.description"	TokenNameStringLiteral	doc-width.description
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
