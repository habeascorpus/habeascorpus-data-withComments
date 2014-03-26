/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
codec	TokenNameIdentifier	 codec
.	TokenNameDOT	
imageio	TokenNameIdentifier	 imageio
;	TokenNameSEMICOLON	
/** * RegistryEntry implementation for loading JPEG images through Image I/O. * * @version $Id: ImageIOJPEGRegistryEntry.java 502538 2007-02-02 08:52:56Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 RegistryEntry implementation for loading JPEG images through Image I/O. * @version $Id: ImageIOJPEGRegistryEntry.java 502538 2007-02-02 08:52:56Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ImageIOJPEGRegistryEntry	TokenNameIdentifier	 Image IOJPEG Registry Entry
extends	TokenNameextends	
AbstractImageIORegistryEntry	TokenNameIdentifier	 Abstract Image IO Registry Entry
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sigJPEG	TokenNameIdentifier	 sig JPEG
=	TokenNameEQUAL	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xd8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0xFF	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
exts	TokenNameIdentifier	 exts
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"jpeg"	TokenNameStringLiteral	jpeg
,	TokenNameCOMMA	
"jpg"	TokenNameStringLiteral	jpg
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mimeTypes	TokenNameIdentifier	 mime Types
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"image/jpeg"	TokenNameStringLiteral	image/jpeg
,	TokenNameCOMMA	
"image/jpg"	TokenNameStringLiteral	image/jpg
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumbers	TokenNameIdentifier	 magic Numbers
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
MagicNumber	TokenNameIdentifier	 Magic Number
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sigJPEG	TokenNameIdentifier	 sig JPEG
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ImageIOJPEGRegistryEntry	TokenNameIdentifier	 Image IOJPEG Registry Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"JPEG"	TokenNameStringLiteral	JPEG
,	TokenNameCOMMA	
exts	TokenNameIdentifier	 exts
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
magicNumbers	TokenNameIdentifier	 magic Numbers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
