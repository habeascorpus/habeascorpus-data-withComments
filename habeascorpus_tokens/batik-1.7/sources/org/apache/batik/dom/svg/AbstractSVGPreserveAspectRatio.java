/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
DefaultPreserveAspectRatioHandler	TokenNameIdentifier	 Default Preserve Aspect Ratio Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
PreserveAspectRatioParser	TokenNameIdentifier	 Preserve Aspect Ratio Parser
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
SVGConstants	TokenNameIdentifier	 SVG Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
;	TokenNameSEMICOLON	
/** * Abstract implementation for SVGPreservAspectRatio * * This is the base implementation for SVGPreservAspectRatio * * @author Tonny Kohar * @version $Id: AbstractSVGPreserveAspectRatio.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Abstract implementation for SVGPreservAspectRatio * This is the base implementation for SVGPreservAspectRatio * @author Tonny Kohar @version $Id: AbstractSVGPreserveAspectRatio.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGPreserveAspectRatio	TokenNameIdentifier	 Abstract SVG Preserve Aspect Ratio
implements	TokenNameimplements	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
/** * Strings for the 'align' values. */	TokenNameCOMMENT_JAVADOC	 Strings for the 'align' values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ALIGN_VALUES	TokenNameIdentifier	 ALIGN  VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
,	TokenNameCOMMA	
SVG_XMINYMIN_VALUE	TokenNameIdentifier	 SVG  XMINYMIN  VALUE
,	TokenNameCOMMA	
SVG_XMIDYMIN_VALUE	TokenNameIdentifier	 SVG  XMIDYMIN  VALUE
,	TokenNameCOMMA	
SVG_XMAXYMIN_VALUE	TokenNameIdentifier	 SVG  XMAXYMIN  VALUE
,	TokenNameCOMMA	
SVG_XMINYMID_VALUE	TokenNameIdentifier	 SVG  XMINYMID  VALUE
,	TokenNameCOMMA	
SVG_XMIDYMID_VALUE	TokenNameIdentifier	 SVG  XMIDYMID  VALUE
,	TokenNameCOMMA	
SVG_XMAXYMID_VALUE	TokenNameIdentifier	 SVG  XMAXYMID  VALUE
,	TokenNameCOMMA	
SVG_XMINYMAX_VALUE	TokenNameIdentifier	 SVG  XMINYMAX  VALUE
,	TokenNameCOMMA	
SVG_XMIDYMAX_VALUE	TokenNameIdentifier	 SVG  XMIDYMAX  VALUE
,	TokenNameCOMMA	
SVG_XMAXYMAX_VALUE	TokenNameIdentifier	 SVG  XMAXYMAX  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Strings for the 'meet-or-slice' values. */	TokenNameCOMMENT_JAVADOC	 Strings for the 'meet-or-slice' values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
MEET_OR_SLICE_VALUES	TokenNameIdentifier	 MEET  OR  SLICE  VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_MEET_VALUE	TokenNameIdentifier	 SVG  MEET  VALUE
,	TokenNameCOMMA	
SVG_SLICE_VALUE	TokenNameIdentifier	 SVG  SLICE  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Returns a string representation of a preserve aspect ratio value * specified numerically. * @param align the align value, one of the * SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_* constants * @param meetOrSlice the meet-or-slice value, one of the * SVGPreserveAspectRatio.SVG_MEETORSLICE_* constants */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of a preserve aspect ratio value specified numerically. @param align the align value, one of the SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_* constants @param meetOrSlice the meet-or-slice value, one of the SVGPreserveAspectRatio.SVG_MEETORSLICE_* constants 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
short	TokenNameshort	
align	TokenNameIdentifier	 align
,	TokenNameCOMMA	
short	TokenNameshort	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
align	TokenNameIdentifier	 align
>	TokenNameGREATER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
ALIGN_VALUES	TokenNameIdentifier	 ALIGN  VALUES
[	TokenNameLBRACKET	
align	TokenNameIdentifier	 align
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
==	TokenNameEQUAL_EQUAL	
SVG_PRESERVEASPECTRATIO_NONE	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
MEET_OR_SLICE_VALUES	TokenNameIdentifier	 MEET  OR  SLICE  VALUES
[	TokenNameLBRACKET	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * align property by default the value is * SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMIDYMID */	TokenNameCOMMENT_JAVADOC	 align property by default the value is SVGPreserveAspectRatio.SVG_PRESERVEASPECTRATIO_XMIDYMID 
protected	TokenNameprotected	
short	TokenNameshort	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMIDYMID	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMIDYMID
;	TokenNameSEMICOLON	
/** * meetOrSlice property * by default the value is SVGPreserveAspectRatio.SVG_MEETORSLICE_MEET; */	TokenNameCOMMENT_JAVADOC	 meetOrSlice property by default the value is SVGPreserveAspectRatio.SVG_MEETORSLICE_MEET; 
protected	TokenNameprotected	
short	TokenNameshort	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_MEETORSLICE_MEET	TokenNameIdentifier	 SVG  MEETORSLICE  MEET
;	TokenNameSEMICOLON	
/** Creates a new instance of AbstractSVGPreserveAspectRatio */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of AbstractSVGPreserveAspectRatio 
public	TokenNamepublic	
AbstractSVGPreserveAspectRatio	TokenNameIdentifier	 Abstract SVG Preserve Aspect Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getMeetOrSlice	TokenNameIdentifier	 get Meet Or Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAlign	TokenNameIdentifier	 set Align
(	TokenNameLPAREN	
short	TokenNameshort	
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
setAttributeValue	TokenNameIdentifier	 set Attribute Value
(	TokenNameLPAREN	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMeetOrSlice	TokenNameIdentifier	 set Meet Or Slice
(	TokenNameLPAREN	
short	TokenNameshort	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
;	TokenNameSEMICOLON	
setAttributeValue	TokenNameIdentifier	 set Attribute Value
(	TokenNameLPAREN	
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMIDYMID	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMIDYMID
;	TokenNameSEMICOLON	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_MEETORSLICE_MEET	TokenNameIdentifier	 SVG  MEETORSLICE  MEET
;	TokenNameSEMICOLON	
//setAttributeValue(getValueAsString()); 	TokenNameCOMMENT_LINE	setAttributeValue(getValueAsString()); 
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
setAttributeValue	TokenNameIdentifier	 set Attribute Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
DOMException	TokenNameIdentifier	 DOM Exception
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
setValueAsString	TokenNameIdentifier	 set Value As String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
PreserveAspectRatioParserHandler	TokenNameIdentifier	 Preserve Aspect Ratio Parser Handler
ph	TokenNameIdentifier	 ph
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
new	TokenNamenew	
PreserveAspectRatioParserHandler	TokenNameIdentifier	 Preserve Aspect Ratio Parser Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
PreserveAspectRatioParser	TokenNameIdentifier	 Preserve Aspect Ratio Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
PreserveAspectRatioParser	TokenNameIdentifier	 Preserve Aspect Ratio Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setPreserveAspectRatioHandler	TokenNameIdentifier	 set Preserve Aspect Ratio Handler
(	TokenNameLPAREN	
ph	TokenNameIdentifier	 ph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
getMeetOrSlice	TokenNameIdentifier	 get Meet Or Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_MODIFICATION_ERR	TokenNameIdentifier	 INVALID  MODIFICATION  ERR
,	TokenNameCOMMA	
"preserve.aspect.ratio"	TokenNameStringLiteral	preserve.aspect.ratio
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the string representation of the preserve aspect ratio value. */	TokenNameCOMMENT_JAVADOC	 Returns the string representation of the preserve aspect ratio value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getValueAsString	TokenNameIdentifier	 get Value As String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
align	TokenNameIdentifier	 align
>	TokenNameGREATER	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_MODIFICATION_ERR	TokenNameIdentifier	 INVALID  MODIFICATION  ERR
,	TokenNameCOMMA	
"preserve.aspect.ratio.align"	TokenNameStringLiteral	preserve.aspect.ratio.align
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
ALIGN_VALUES	TokenNameIdentifier	 ALIGN  VALUES
[	TokenNameLBRACKET	
align	TokenNameIdentifier	 align
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
align	TokenNameIdentifier	 align
==	TokenNameEQUAL_EQUAL	
SVG_PRESERVEASPECTRATIO_NONE	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_MODIFICATION_ERR	TokenNameIdentifier	 INVALID  MODIFICATION  ERR
,	TokenNameCOMMA	
"preserve.aspect.ratio.meet.or.slice"	TokenNameStringLiteral	preserve.aspect.ratio.meet.or.slice
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
MEET_OR_SLICE_VALUES	TokenNameIdentifier	 MEET  OR  SLICE  VALUES
[	TokenNameLBRACKET	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
class	TokenNameclass	
PreserveAspectRatioParserHandler	TokenNameIdentifier	 Preserve Aspect Ratio Parser Handler
extends	TokenNameextends	
DefaultPreserveAspectRatioHandler	TokenNameIdentifier	 Default Preserve Aspect Ratio Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
short	TokenNameshort	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMIDYMID	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMIDYMID
;	TokenNameSEMICOLON	
public	TokenNamepublic	
short	TokenNameshort	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_MEETORSLICE_MEET	TokenNameIdentifier	 SVG  MEETORSLICE  MEET
;	TokenNameSEMICOLON	
public	TokenNamepublic	
short	TokenNameshort	
getAlign	TokenNameIdentifier	 get Align
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
align	TokenNameIdentifier	 align
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getMeetOrSlice	TokenNameIdentifier	 get Meet Or Slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'none' been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'none' been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
none	TokenNameIdentifier	 none
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_NONE	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'xMaxYMax' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMaxYMax' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
xMaxYMax	TokenNameIdentifier	 x Max Y Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMAXYMAX	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMAXYMAX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'xMaxYMid' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMaxYMid' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
xMaxYMid	TokenNameIdentifier	 x Max Y Mid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMAXYMID	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMAXYMID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'xMaxYMin' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMaxYMin' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
xMaxYMin	TokenNameIdentifier	 x Max Y Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMAXYMIN	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMAXYMIN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'xMidYMax' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMidYMax' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
xMidYMax	TokenNameIdentifier	 x Mid Y Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMIDYMAX	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMIDYMAX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'xMidYMid' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMidYMid' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
xMidYMid	TokenNameIdentifier	 x Mid Y Mid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMIDYMID	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMIDYMID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'xMidYMin' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMidYMin' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
xMidYMin	TokenNameIdentifier	 x Mid Y Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMIDYMIN	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMIDYMIN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'xMinYMax' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMinYMax' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
xMinYMax	TokenNameIdentifier	 x Min Y Max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMINYMAX	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMINYMAX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'xMinYMid' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMinYMid' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
xMinYMid	TokenNameIdentifier	 x Min Y Mid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMINYMID	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMINYMID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'xMinYMin' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'xMinYMin' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
xMinYMin	TokenNameIdentifier	 x Min Y Min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
align	TokenNameIdentifier	 align
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_PRESERVEASPECTRATIO_XMINYMIN	TokenNameIdentifier	 SVG  PRESERVEASPECTRATIO  XMINYMIN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'meet' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'meet' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
meet	TokenNameIdentifier	 meet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_MEETORSLICE_MEET	TokenNameIdentifier	 SVG  MEETORSLICE  MEET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoked when 'slice' has been parsed. * @exception ParseException if an error occured while processing * the transform */	TokenNameCOMMENT_JAVADOC	 Invoked when 'slice' has been parsed. @exception ParseException if an error occured while processing the transform 
public	TokenNamepublic	
void	TokenNamevoid	
slice	TokenNameIdentifier	 slice
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
meetOrSlice	TokenNameIdentifier	 meet Or Slice
=	TokenNameEQUAL	
SVGPreserveAspectRatio	TokenNameIdentifier	 SVG Preserve Aspect Ratio
.	TokenNameDOT	
SVG_MEETORSLICE_SLICE	TokenNameIdentifier	 SVG  MEETORSLICE  SLICE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
