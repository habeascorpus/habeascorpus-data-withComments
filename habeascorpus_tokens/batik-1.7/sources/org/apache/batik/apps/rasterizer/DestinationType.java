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
rasterizer	TokenNameIdentifier	 rasterizer
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
JPEGTranscoder	TokenNameIdentifier	 JPEG Transcoder
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
TIFFTranscoder	TokenNameIdentifier	 TIFF Transcoder
;	TokenNameSEMICOLON	
/** * Describes the type of destination for an <tt>SVGConverter</tt> * operation. * * @author Henri Ruini * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: DestinationType.java 504084 2007-02-06 11:24:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Describes the type of destination for an <tt>SVGConverter</tt> operation. * @author Henri Ruini @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: DestinationType.java 504084 2007-02-06 11:24:46Z dvholten $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DestinationType	TokenNameIdentifier	 Destination Type
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PNG_STR	TokenNameIdentifier	 PNG  STR
=	TokenNameEQUAL	
"image/png"	TokenNameStringLiteral	image/png
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JPEG_STR	TokenNameIdentifier	 JPEG  STR
=	TokenNameEQUAL	
"image/jpeg"	TokenNameStringLiteral	image/jpeg
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TIFF_STR	TokenNameIdentifier	 TIFF  STR
=	TokenNameEQUAL	
"image/tiff"	TokenNameStringLiteral	image/tiff
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PDF_STR	TokenNameIdentifier	 PDF  STR
=	TokenNameEQUAL	
"application/pdf"	TokenNameStringLiteral	application/pdf
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PNG_CODE	TokenNameIdentifier	 PNG  CODE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
JPEG_CODE	TokenNameIdentifier	 JPEG  CODE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIFF_CODE	TokenNameIdentifier	 TIFF  CODE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PDF_CODE	TokenNameIdentifier	 PDF  CODE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PNG_EXTENSION	TokenNameIdentifier	 PNG  EXTENSION
=	TokenNameEQUAL	
".png"	TokenNameStringLiteral	.png
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
JPEG_EXTENSION	TokenNameIdentifier	 JPEG  EXTENSION
=	TokenNameEQUAL	
".jpg"	TokenNameStringLiteral	.jpg
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TIFF_EXTENSION	TokenNameIdentifier	 TIFF  EXTENSION
=	TokenNameEQUAL	
".tif"	TokenNameStringLiteral	.tif
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PDF_EXTENSION	TokenNameIdentifier	 PDF  EXTENSION
=	TokenNameEQUAL	
".pdf"	TokenNameStringLiteral	.pdf
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DestinationType	TokenNameIdentifier	 Destination Type
PNG	TokenNameIdentifier	 PNG
=	TokenNameEQUAL	
new	TokenNamenew	
DestinationType	TokenNameIdentifier	 Destination Type
(	TokenNameLPAREN	
PNG_STR	TokenNameIdentifier	 PNG  STR
,	TokenNameCOMMA	
PNG_CODE	TokenNameIdentifier	 PNG  CODE
,	TokenNameCOMMA	
PNG_EXTENSION	TokenNameIdentifier	 PNG  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DestinationType	TokenNameIdentifier	 Destination Type
JPEG	TokenNameIdentifier	 JPEG
=	TokenNameEQUAL	
new	TokenNamenew	
DestinationType	TokenNameIdentifier	 Destination Type
(	TokenNameLPAREN	
JPEG_STR	TokenNameIdentifier	 JPEG  STR
,	TokenNameCOMMA	
JPEG_CODE	TokenNameIdentifier	 JPEG  CODE
,	TokenNameCOMMA	
JPEG_EXTENSION	TokenNameIdentifier	 JPEG  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DestinationType	TokenNameIdentifier	 Destination Type
TIFF	TokenNameIdentifier	 TIFF
=	TokenNameEQUAL	
new	TokenNamenew	
DestinationType	TokenNameIdentifier	 Destination Type
(	TokenNameLPAREN	
TIFF_STR	TokenNameIdentifier	 TIFF  STR
,	TokenNameCOMMA	
TIFF_CODE	TokenNameIdentifier	 TIFF  CODE
,	TokenNameCOMMA	
TIFF_EXTENSION	TokenNameIdentifier	 TIFF  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
DestinationType	TokenNameIdentifier	 Destination Type
PDF	TokenNameIdentifier	 PDF
=	TokenNameEQUAL	
new	TokenNamenew	
DestinationType	TokenNameIdentifier	 Destination Type
(	TokenNameLPAREN	
PDF_STR	TokenNameIdentifier	 PDF  STR
,	TokenNameCOMMA	
PDF_CODE	TokenNameIdentifier	 PDF  CODE
,	TokenNameCOMMA	
PDF_EXTENSION	TokenNameIdentifier	 PDF  EXTENSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DestinationType	TokenNameIdentifier	 Destination Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
code	TokenNameIdentifier	 code
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
=	TokenNameEQUAL	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a transcoder object of the result image type. * * @return Transcoder object or <tt>null</tt> if there isn't a proper transcoder. */	TokenNameCOMMENT_JAVADOC	 Returns a transcoder object of the result image type. * @return Transcoder object or <tt>null</tt> if there isn't a proper transcoder. 
protected	TokenNameprotected	
Transcoder	TokenNameIdentifier	 Transcoder
getTranscoder	TokenNameIdentifier	 get Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PNG_CODE	TokenNameIdentifier	 PNG  CODE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
PNGTranscoder	TokenNameIdentifier	 PNG Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
JPEG_CODE	TokenNameIdentifier	 JPEG  CODE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
JPEGTranscoder	TokenNameIdentifier	 JPEG Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_CODE	TokenNameIdentifier	 TIFF  CODE
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
TIFFTranscoder	TokenNameIdentifier	 TIFF Transcoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PDF_CODE	TokenNameIdentifier	 PDF  CODE
:	TokenNameCOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
pdfClass	TokenNameIdentifier	 pdf Class
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
"org.apache.fop.svg.PDFTranscoder"	TokenNameStringLiteral	org.apache.fop.svg.PDFTranscoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Transcoder	TokenNameIdentifier	 Transcoder
)	TokenNameRPAREN	
pdfClass	TokenNameIdentifier	 pdf Class
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Defines valid image types. * * @return Array of valid values as strings. */	TokenNameCOMMENT_JAVADOC	 Defines valid image types. * @return Array of valid values as strings. 
public	TokenNamepublic	
DestinationType	TokenNameIdentifier	 Destination Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DestinationType	TokenNameIdentifier	 Destination Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
PNG	TokenNameIdentifier	 PNG
,	TokenNameCOMMA	
JPEG	TokenNameIdentifier	 JPEG
,	TokenNameCOMMA	
TIFF	TokenNameIdentifier	 TIFF
,	TokenNameCOMMA	
PDF	TokenNameIdentifier	 PDF
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PNG_CODE	TokenNameIdentifier	 PNG  CODE
:	TokenNameCOLON	
return	TokenNamereturn	
PNG	TokenNameIdentifier	 PNG
;	TokenNameSEMICOLON	
case	TokenNamecase	
JPEG_CODE	TokenNameIdentifier	 JPEG  CODE
:	TokenNameCOLON	
return	TokenNamereturn	
JPEG	TokenNameIdentifier	 JPEG
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIFF_CODE	TokenNameIdentifier	 TIFF  CODE
:	TokenNameCOLON	
return	TokenNamereturn	
TIFF	TokenNameIdentifier	 TIFF
;	TokenNameSEMICOLON	
case	TokenNamecase	
PDF_CODE	TokenNameIdentifier	 PDF  CODE
:	TokenNameCOLON	
return	TokenNamereturn	
PDF	TokenNameIdentifier	 PDF
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"unknown code:"	TokenNameStringLiteral	unknown code:
+	TokenNamePLUS	
code	TokenNameIdentifier	 code
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
