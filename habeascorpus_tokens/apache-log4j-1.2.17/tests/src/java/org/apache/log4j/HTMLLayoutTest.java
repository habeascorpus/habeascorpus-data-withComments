/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilder	TokenNameIdentifier	 Document Builder
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
/** * Test for HTMLLayout. * * @author Curt Arnold */	TokenNameCOMMENT_JAVADOC	 Test for HTMLLayout. * @author Curt Arnold 
public	TokenNamepublic	
class	TokenNameclass	
HTMLLayoutTest	TokenNameIdentifier	 HTML Layout Test
extends	TokenNameextends	
LayoutTest	TokenNameIdentifier	 Layout Test
{	TokenNameLBRACE	
/** * Construct new instance of XMLLayoutTest. * * @param testName test name. */	TokenNameCOMMENT_JAVADOC	 Construct new instance of XMLLayoutTest. * @param testName test name. 
public	TokenNamepublic	
HTMLLayoutTest	TokenNameIdentifier	 HTML Layout Test
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
testName	TokenNameIdentifier	 test Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
testName	TokenNameIdentifier	 test Name
,	TokenNameCOMMA	
"text/html"	TokenNameStringLiteral	text/html
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @{inheritDoc} */	TokenNameCOMMENT_JAVADOC	 @{inheritDoc} 
protected	TokenNameprotected	
Layout	TokenNameIdentifier	 Layout
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
HTMLLayout	TokenNameIdentifier	 HTML Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the string as the body of an XML document and returns the document element. * @param source source string. * @return document element. * @throws Exception if parser can not be constructed or source is not a valid XML document. */	TokenNameCOMMENT_JAVADOC	 Parses the string as the body of an XML document and returns the document element. @param source source string. @return document element. @throws Exception if parser can not be constructed or source is not a valid XML document. 
private	TokenNameprivate	
Document	TokenNameIdentifier	 Document
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
DocumentBuilderFactory	TokenNameIdentifier	 Document Builder Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setCoalescing	TokenNameIdentifier	 set Coalescing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocumentBuilder	TokenNameIdentifier	 Document Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newDocumentBuilder	TokenNameIdentifier	 new Document Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests formatted results. * @throws Exception if unable to create parser or output is not valid XML. */	TokenNameCOMMENT_JAVADOC	 Tests formatted results. @throws Exception if unable to create parser or output is not valid XML. 
public	TokenNamepublic	
void	TokenNamevoid	
testFormat	TokenNameIdentifier	 test Format
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.apache.log4j.xml.HTMLLayoutTest"	TokenNameStringLiteral	org.apache.log4j.xml.HTMLLayoutTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"NDC goes here"	TokenNameStringLiteral	NDC goes here
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
"org.apache.log4j.Logger"	TokenNameStringLiteral	org.apache.log4j.Logger
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HTMLLayout	TokenNameIdentifier	 HTML Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HTMLLayout	TokenNameIdentifier	 HTML Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
"<!DOCTYPE body [ <!ENTITY nbsp ' '>]><body>"	TokenNameStringLiteral	<!DOCTYPE body [ <!ENTITY nbsp ' '>]><body>
+	TokenNamePLUS	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
"</body>"	TokenNameStringLiteral	</body>
;	TokenNameSEMICOLON	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getHeader. */	TokenNameCOMMENT_JAVADOC	 Tests getHeader. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetHeader	TokenNameIdentifier	 test Get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<!DOCTYPE"	TokenNameStringLiteral	<!DOCTYPE
,	TokenNameCOMMA	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getHeader with locationInfo = true. */	TokenNameCOMMENT_JAVADOC	 Tests getHeader with locationInfo = true. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetHeaderWithLocation	TokenNameIdentifier	 test Get Header With Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLLayout	TokenNameIdentifier	 HTML Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HTMLLayout	TokenNameIdentifier	 HTML Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"<!DOCTYPE"	TokenNameStringLiteral	<!DOCTYPE
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getHeader	TokenNameIdentifier	 get Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getFooter. */	TokenNameCOMMENT_JAVADOC	 Tests getFooter. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetFooter	TokenNameIdentifier	 test Get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"</table>"	TokenNameStringLiteral	</table>
,	TokenNameCOMMA	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFooter	TokenNameIdentifier	 get Footer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getLocationInfo and setLocationInfo. */	TokenNameCOMMENT_JAVADOC	 Tests getLocationInfo and setLocationInfo. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetSetLocationInfo	TokenNameIdentifier	 test Get Set Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLLayout	TokenNameIdentifier	 HTML Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLLayout	TokenNameIdentifier	 HTML Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getLocationInfo	TokenNameIdentifier	 get Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getLocationInfo	TokenNameIdentifier	 get Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getLocationInfo	TokenNameIdentifier	 get Location Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests activateOptions(). */	TokenNameCOMMENT_JAVADOC	 Tests activateOptions(). 
public	TokenNamepublic	
void	TokenNamevoid	
testActivateOptions	TokenNameIdentifier	 test Activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLLayout	TokenNameIdentifier	 HTML Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLLayout	TokenNameIdentifier	 HTML Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
activateOptions	TokenNameIdentifier	 activate Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests getTitle and setTitle. */	TokenNameCOMMENT_JAVADOC	 Tests getTitle and setTitle. 
public	TokenNamepublic	
void	TokenNamevoid	
testGetSetTitle	TokenNameIdentifier	 test Get Set Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HTMLLayout	TokenNameIdentifier	 HTML Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLLayout	TokenNameIdentifier	 HTML Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Log4J Log Messages"	TokenNameStringLiteral	Log4J Log Messages
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newTitle	TokenNameIdentifier	 new Title
=	TokenNameEQUAL	
"A treatise on messages of log persuasion"	TokenNameStringLiteral	A treatise on messages of log persuasion
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
newTitle	TokenNameIdentifier	 new Title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
newTitle	TokenNameIdentifier	 new Title
,	TokenNameCOMMA	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests buffer downsizing and DEBUG and WARN colorization code paths. */	TokenNameCOMMENT_JAVADOC	 Tests buffer downsizing and DEBUG and WARN colorization code paths. 
public	TokenNamepublic	
void	TokenNamevoid	
testFormatResize	TokenNameIdentifier	 test Format Resize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"org.apache.log4j.xml.HTMLLayoutTest"	TokenNameStringLiteral	org.apache.log4j.xml.HTMLLayoutTest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2000	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'A'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
event1	TokenNameIdentifier	 event1
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
"org.apache.log4j.Logger"	TokenNameStringLiteral	org.apache.log4j.Logger
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HTMLLayout	TokenNameIdentifier	 HTML Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HTMLLayout	TokenNameIdentifier	 HTML Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
setLocationInfo	TokenNameIdentifier	 set Location Info
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event1	TokenNameIdentifier	 event1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"'foo' is not a valid value."	TokenNameStringLiteral	'foo' is not a valid value.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event2	TokenNameIdentifier	 event2
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
"org.apache.log4j.Logger"	TokenNameStringLiteral	org.apache.log4j.Logger
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
"Hello, World"	TokenNameStringLiteral	Hello, World
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event2	TokenNameIdentifier	 event2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
+	TokenNamePLUS	
"<tr>"	TokenNameStringLiteral	<tr>
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
Layout	TokenNameIdentifier	 Layout
.	TokenNameDOT	
LINE_SEP	TokenNameIdentifier	 LINE  SEP
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Level with arbitrary toString value. */	TokenNameCOMMENT_JAVADOC	 Level with arbitrary toString value. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ProblemLevel	TokenNameIdentifier	 Problem Level
extends	TokenNameextends	
Level	TokenNameIdentifier	 Level
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct new instance. * @param levelName level name, may not be null. */	TokenNameCOMMENT_JAVADOC	 Construct new instance. @param levelName level name, may not be null. 
public	TokenNamepublic	
ProblemLevel	TokenNameIdentifier	 Problem Level
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
levelName	TokenNameIdentifier	 level Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
6000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
levelName	TokenNameIdentifier	 level Name
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests problematic characters in multiple fields. * @throws Exception if parser can not be constructed * or source is not a valid XML document. */	TokenNameCOMMENT_JAVADOC	 Tests problematic characters in multiple fields. @throws Exception if parser can not be constructed or source is not a valid XML document. 
public	TokenNamepublic	
void	TokenNamevoid	
testProblemCharacters	TokenNameIdentifier	 test Problem Characters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
problemName	TokenNameIdentifier	 problem Name
=	TokenNameEQUAL	
"com.example.bar<>&"'"	TokenNameStringLiteral	com.example.bar<>&"'
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
problemName	TokenNameIdentifier	 problem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Level	TokenNameIdentifier	 Level
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
new	TokenNamenew	
ProblemLevel	TokenNameIdentifier	 Problem Level
(	TokenNameLPAREN	
problemName	TokenNameIdentifier	 problem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
problemName	TokenNameIdentifier	 problem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
threadName	TokenNameIdentifier	 thread Name
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
problemName	TokenNameIdentifier	 problem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
problemName	TokenNameIdentifier	 problem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
mdcMap	TokenNameIdentifier	 mdc Map
=	TokenNameEQUAL	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mdcMap	TokenNameIdentifier	 mdc Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdcMap	TokenNameIdentifier	 mdc Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
problemName	TokenNameIdentifier	 problem Name
,	TokenNameCOMMA	
problemName	TokenNameIdentifier	 problem Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
problemName	TokenNameIdentifier	 problem Name
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
,	TokenNameCOMMA	
problemName	TokenNameIdentifier	 problem Name
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HTMLLayout	TokenNameIdentifier	 HTML Layout
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
HTMLLayout	TokenNameIdentifier	 HTML Layout
)	TokenNameRPAREN	
createLayout	TokenNameIdentifier	 create Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mdcMap	TokenNameIdentifier	 mdc Map
=	TokenNameEQUAL	
MDC	TokenNameIdentifier	 MDC
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mdcMap	TokenNameIdentifier	 mdc Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mdcMap	TokenNameIdentifier	 mdc Map
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
threadName	TokenNameIdentifier	 thread Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// do a little fixup to make output XHTML 	TokenNameCOMMENT_LINE	do a little fixup to make output XHTML 
// 	TokenNameCOMMENT_LINE	 
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"<!DOCTYPE table [<!ENTITY nbsp ' '>]><table>"	TokenNameStringLiteral	<!DOCTYPE table [<!ENTITY nbsp ' '>]><table>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</table>"	TokenNameStringLiteral	</table>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"<br>"	TokenNameStringLiteral	<br>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
"<br>"	TokenNameStringLiteral	<br>
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
"<br/>"	TokenNameStringLiteral	<br/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
