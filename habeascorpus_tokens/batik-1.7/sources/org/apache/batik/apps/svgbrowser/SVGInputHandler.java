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
svgbrowser	TokenNameIdentifier	 svgbrowser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ParsedURL	TokenNameIdentifier	 Parsed URL
;	TokenNameSEMICOLON	
/** * This implementation of the <tt>SquiggleInputHandler</tt> class * simply displays an SVG file into the JSVGCanvas. * * @author <a mailto="vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: SVGInputHandler.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This implementation of the <tt>SquiggleInputHandler</tt> class simply displays an SVG file into the JSVGCanvas. * @author <a mailto="vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: SVGInputHandler.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGInputHandler	TokenNameIdentifier	 SVG Input Handler
implements	TokenNameimplements	
SquiggleInputHandler	TokenNameIdentifier	 Squiggle Input Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SVG_MIME_TYPES	TokenNameIdentifier	 SVG  MIME  TYPES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"image/svg+xml"	TokenNameStringLiteral	image/svg+xml
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
SVG_FILE_EXTENSIONS	TokenNameIdentifier	 SVG  FILE  EXTENSIONS
=	TokenNameEQUAL	
{	TokenNameLBRACE	
".svg"	TokenNameStringLiteral	.svg
,	TokenNameCOMMA	
".svgz"	TokenNameStringLiteral	.svgz
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Returns the list of mime types handled by this handler. */	TokenNameCOMMENT_JAVADOC	 Returns the list of mime types handled by this handler. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHandledMimeTypes	TokenNameIdentifier	 get Handled Mime Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_MIME_TYPES	TokenNameIdentifier	 SVG  MIME  TYPES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the list of file extensions handled by this handler */	TokenNameCOMMENT_JAVADOC	 Returns the list of file extensions handled by this handler 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHandledExtensions	TokenNameIdentifier	 get Handled Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FILE_EXTENSIONS	TokenNameIdentifier	 SVG  FILE  EXTENSIONS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a description for this handler. */	TokenNameCOMMENT_JAVADOC	 Returns a description for this handler. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handles the given input for the given JSVGViewerFrame */	TokenNameCOMMENT_JAVADOC	 Handles the given input for the given JSVGViewerFrame 
public	TokenNamepublic	
void	TokenNamevoid	
handle	TokenNameIdentifier	 handle
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
,	TokenNameCOMMA	
JSVGViewerFrame	TokenNameIdentifier	 JSVG Viewer Frame
svgViewerFrame	TokenNameIdentifier	 svg Viewer Frame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
svgViewerFrame	TokenNameIdentifier	 svg Viewer Frame
.	TokenNameDOT	
getJSVGCanvas	TokenNameIdentifier	 get JSVG Canvas
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
loadSVGDocument	TokenNameIdentifier	 load SVG Document
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the input file can be handled. */	TokenNameCOMMENT_JAVADOC	 Returns true if the input file can be handled. 
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isFile	TokenNameIdentifier	 is File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the input URI can be handled by the handler */	TokenNameCOMMENT_JAVADOC	 Returns true if the input URI can be handled by the handler 
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
purl	TokenNameIdentifier	 purl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// <!> Note: this should be improved to rely on Mime Type 	TokenNameCOMMENT_LINE	<!> Note: this should be improved to rely on Mime Type 
// when the http protocol is used. This will use the 	TokenNameCOMMENT_LINE	when the http protocol is used. This will use the 
// ParsedURL.getContentType method. 	TokenNameCOMMENT_LINE	ParsedURL.getContentType method. 
if	TokenNameif	
(	TokenNameLPAREN	
purl	TokenNameIdentifier	 purl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
purl	TokenNameIdentifier	 purl
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the resource at the given path can be handled */	TokenNameCOMMENT_JAVADOC	 Returns true if the resource at the given path can be handled 
public	TokenNamepublic	
boolean	TokenNameboolean	
accept	TokenNameIdentifier	 accept
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
SVG_FILE_EXTENSIONS	TokenNameIdentifier	 SVG  FILE  EXTENSIONS
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
SVG_FILE_EXTENSIONS	TokenNameIdentifier	 SVG  FILE  EXTENSIONS
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
