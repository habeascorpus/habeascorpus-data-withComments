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
color	TokenNameIdentifier	 color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ColorSpace	TokenNameIdentifier	 Color Space
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ICC_ColorSpace	TokenNameIdentifier	 ICC  Color Space
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ICC_Profile	TokenNameIdentifier	 ICC  Profile
;	TokenNameSEMICOLON	
/** * This class extends the ICCColorSpace class by providing * convenience methods to convert to sRGB using various * methods, forcing a givent intent, such as perceptual or * relative colorimetric. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ICCColorSpaceExt.java 504084 2007-02-06 11:24:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class extends the ICCColorSpace class by providing convenience methods to convert to sRGB using various methods, forcing a givent intent, such as perceptual or relative colorimetric. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ICCColorSpaceExt.java 504084 2007-02-06 11:24:46Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
extends	TokenNameextends	
ICC_ColorSpace	TokenNameIdentifier	 ICC  Color Space
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PERCEPTUAL	TokenNameIdentifier	 PERCEPTUAL
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RELATIVE_COLORIMETRIC	TokenNameIdentifier	 RELATIVE  COLORIMETRIC
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ABSOLUTE_COLORIMETRIC	TokenNameIdentifier	 ABSOLUTE  COLORIMETRIC
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SATURATION	TokenNameIdentifier	 SATURATION
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
AUTO	TokenNameIdentifier	 AUTO
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
ColorSpace	TokenNameIdentifier	 Color Space
sRGB	TokenNameIdentifier	 s RGB
=	TokenNameEQUAL	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
CS_sRGB	TokenNameIdentifier	 CS s RGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
intent	TokenNameIdentifier	 intent
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ICCColorSpaceExt	TokenNameIdentifier	 ICC Color Space Ext
(	TokenNameLPAREN	
ICC_Profile	TokenNameIdentifier	 ICC  Profile
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
int	TokenNameint	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
intent	TokenNameIdentifier	 intent
=	TokenNameEQUAL	
intent	TokenNameIdentifier	 intent
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
AUTO	TokenNameIdentifier	 AUTO
:	TokenNameCOLON	
case	TokenNamecase	
RELATIVE_COLORIMETRIC	TokenNameIdentifier	 RELATIVE  COLORIMETRIC
:	TokenNameCOLON	
case	TokenNamecase	
ABSOLUTE_COLORIMETRIC	TokenNameIdentifier	 ABSOLUTE  COLORIMETRIC
:	TokenNameCOLON	
case	TokenNamecase	
SATURATION	TokenNameIdentifier	 SATURATION
:	TokenNameCOLON	
case	TokenNamecase	
PERCEPTUAL	TokenNameIdentifier	 PERCEPTUAL
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Apply the requested intent into the profile */	TokenNameCOMMENT_JAVADOC	 Apply the requested intent into the profile 
if	TokenNameif	
(	TokenNameLPAREN	
intent	TokenNameIdentifier	 intent
!=	TokenNameNOT_EQUAL	
AUTO	TokenNameIdentifier	 AUTO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hdr	TokenNameIdentifier	 hdr
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getData	TokenNameIdentifier	 get Data
(	TokenNameLPAREN	
ICC_Profile	TokenNameIdentifier	 ICC  Profile
.	TokenNameDOT	
icSigHead	TokenNameIdentifier	 ic Sig Head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hdr	TokenNameIdentifier	 hdr
[	TokenNameLBRACKET	
ICC_Profile	TokenNameIdentifier	 ICC  Profile
.	TokenNameDOT	
icHdrRenderingIntent	TokenNameIdentifier	 ic Hdr Rendering Intent
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
intent	TokenNameIdentifier	 intent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the sRGB value obtained by forcing the * conversion method to the intent passed to the * constructor */	TokenNameCOMMENT_JAVADOC	 Returns the sRGB value obtained by forcing the conversion method to the intent passed to the constructor 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
intendedToRGB	TokenNameIdentifier	 intended To RGB
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ABSOLUTE_COLORIMETRIC	TokenNameIdentifier	 ABSOLUTE  COLORIMETRIC
:	TokenNameCOLON	
return	TokenNamereturn	
absoluteColorimetricToRGB	TokenNameIdentifier	 absolute Colorimetric To RGB
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PERCEPTUAL	TokenNameIdentifier	 PERCEPTUAL
:	TokenNameCOLON	
case	TokenNamecase	
AUTO	TokenNameIdentifier	 AUTO
:	TokenNameCOLON	
return	TokenNamereturn	
perceptualToRGB	TokenNameIdentifier	 perceptual To RGB
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RELATIVE_COLORIMETRIC	TokenNameIdentifier	 RELATIVE  COLORIMETRIC
:	TokenNameCOLON	
return	TokenNamereturn	
relativeColorimetricToRGB	TokenNameIdentifier	 relative Colorimetric To RGB
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SATURATION	TokenNameIdentifier	 SATURATION
:	TokenNameCOLON	
return	TokenNamereturn	
saturationToRGB	TokenNameIdentifier	 saturation To RGB
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"invalid intent:"	TokenNameStringLiteral	invalid intent:
+	TokenNamePLUS	
intent	TokenNameIdentifier	 intent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Perceptual conversion is the method implemented by the * base class's toRGB method */	TokenNameCOMMENT_JAVADOC	 Perceptual conversion is the method implemented by the base class's toRGB method 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
perceptualToRGB	TokenNameIdentifier	 perceptual To RGB
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toRGB	TokenNameIdentifier	 to RGB
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Relative colorimetric needs to happen through CIEXYZ * conversion */	TokenNameCOMMENT_JAVADOC	 Relative colorimetric needs to happen through CIEXYZ conversion 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
relativeColorimetricToRGB	TokenNameIdentifier	 relative Colorimetric To RGB
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ciexyz	TokenNameIdentifier	 ciexyz
=	TokenNameEQUAL	
toCIEXYZ	TokenNameIdentifier	 to CIEXYZ
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sRGB	TokenNameIdentifier	 s RGB
.	TokenNameDOT	
fromCIEXYZ	TokenNameIdentifier	 from CIEXYZ
(	TokenNameLPAREN	
ciexyz	TokenNameIdentifier	 ciexyz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Absolute colorimetric. NOT IMPLEMENTED. * Temporarily returns same as perceptual */	TokenNameCOMMENT_JAVADOC	 Absolute colorimetric. NOT IMPLEMENTED. Temporarily returns same as perceptual 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
absoluteColorimetricToRGB	TokenNameIdentifier	 absolute Colorimetric To RGB
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
perceptualToRGB	TokenNameIdentifier	 perceptual To RGB
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Saturation. NOT IMPLEMENTED. Temporarily returns same * as perceptual. */	TokenNameCOMMENT_JAVADOC	 Saturation. NOT IMPLEMENTED. Temporarily returns same as perceptual. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
saturationToRGB	TokenNameIdentifier	 saturation To RGB
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
perceptualToRGB	TokenNameIdentifier	 perceptual To RGB
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
