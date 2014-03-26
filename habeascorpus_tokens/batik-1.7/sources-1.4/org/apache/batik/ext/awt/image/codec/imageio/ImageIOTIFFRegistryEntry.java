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
import	TokenNameimport	
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
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
;	TokenNameSEMICOLON	
/** * RegistryEntry implementation for loading TIFF images through Image I/O. * * @version $Id: ImageIOTIFFRegistryEntry.java 502538 2007-02-02 08:52:56Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 RegistryEntry implementation for loading TIFF images through Image I/O. * @version $Id: ImageIOTIFFRegistryEntry.java 502538 2007-02-02 08:52:56Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ImageIOTIFFRegistryEntry	TokenNameIdentifier	 Image IOTIFF Registry Entry
extends	TokenNameextends	
AbstractImageIORegistryEntry	TokenNameIdentifier	 Abstract Image IO Registry Entry
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sig1	TokenNameIdentifier	 sig1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x49	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sig2	TokenNameIdentifier	 sig2
=	TokenNameEQUAL	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
.	TokenNameDOT	
MagicNumber	TokenNameIdentifier	 Magic Number
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
magicNumbers	TokenNameIdentifier	 magic Numbers
=	TokenNameEQUAL	
{	TokenNameLBRACE	
new	TokenNamenew	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
.	TokenNameDOT	
MagicNumber	TokenNameIdentifier	 Magic Number
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sig1	TokenNameIdentifier	 sig1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MagicNumberRegistryEntry	TokenNameIdentifier	 Magic Number Registry Entry
.	TokenNameDOT	
MagicNumber	TokenNameIdentifier	 Magic Number
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sig2	TokenNameIdentifier	 sig2
)	TokenNameRPAREN	
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
"tiff"	TokenNameStringLiteral	tiff
,	TokenNameCOMMA	
"tif"	TokenNameStringLiteral	tif
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
"image/tiff"	TokenNameStringLiteral	image/tiff
,	TokenNameCOMMA	
"image/tif"	TokenNameStringLiteral	image/tif
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ImageIOTIFFRegistryEntry	TokenNameIdentifier	 Image IOTIFF Registry Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"TIFF"	TokenNameStringLiteral	TIFF
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
