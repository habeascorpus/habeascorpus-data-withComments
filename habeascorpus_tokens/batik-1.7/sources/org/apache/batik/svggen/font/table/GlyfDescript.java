/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
/** * @version $Id: GlyfDescript.java 475477 2006-11-15 22:44:28Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 @version $Id: GlyfDescript.java 475477 2006-11-15 22:44:28Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
GlyfDescript	TokenNameIdentifier	 Glyf Descript
extends	TokenNameextends	
Program	TokenNameIdentifier	 Program
implements	TokenNameimplements	
GlyphDescription	TokenNameIdentifier	 Glyph Description
{	TokenNameLBRACE	
// flags 	TokenNameCOMMENT_LINE	flags 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
onCurve	TokenNameIdentifier	 on Curve
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
xShortVector	TokenNameIdentifier	 x Short Vector
=	TokenNameEQUAL	
0x02	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
yShortVector	TokenNameIdentifier	 y Short Vector
=	TokenNameEQUAL	
0x04	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
repeat	TokenNameIdentifier	 repeat
=	TokenNameEQUAL	
0x08	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
xDual	TokenNameIdentifier	 x Dual
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
yDual	TokenNameIdentifier	 y Dual
=	TokenNameEQUAL	
0x20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
GlyfTable	TokenNameIdentifier	 Glyf Table
parentTable	TokenNameIdentifier	 parent Table
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numberOfContours	TokenNameIdentifier	 number Of Contours
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
xMin	TokenNameIdentifier	 x Min
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
yMin	TokenNameIdentifier	 y Min
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
xMax	TokenNameIdentifier	 x Max
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
yMax	TokenNameIdentifier	 y Max
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
GlyfDescript	TokenNameIdentifier	 Glyf Descript
(	TokenNameLPAREN	
GlyfTable	TokenNameIdentifier	 Glyf Table
parentTable	TokenNameIdentifier	 parent Table
,	TokenNameCOMMA	
short	TokenNameshort	
numberOfContours	TokenNameIdentifier	 number Of Contours
,	TokenNameCOMMA	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parentTable	TokenNameIdentifier	 parent Table
=	TokenNameEQUAL	
parentTable	TokenNameIdentifier	 parent Table
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numberOfContours	TokenNameIdentifier	 number Of Contours
=	TokenNameEQUAL	
numberOfContours	TokenNameIdentifier	 number Of Contours
;	TokenNameSEMICOLON	
xMin	TokenNameIdentifier	 x Min
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yMin	TokenNameIdentifier	 y Min
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xMax	TokenNameIdentifier	 x Max
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yMax	TokenNameIdentifier	 y Max
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumberOfContours	TokenNameIdentifier	 get Number Of Contours
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numberOfContours	TokenNameIdentifier	 number Of Contours
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getXMaximum	TokenNameIdentifier	 get X Maximum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xMax	TokenNameIdentifier	 x Max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getXMinimum	TokenNameIdentifier	 get X Minimum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xMin	TokenNameIdentifier	 x Min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getYMaximum	TokenNameIdentifier	 get Y Maximum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
yMax	TokenNameIdentifier	 y Max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getYMinimum	TokenNameIdentifier	 get Y Minimum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
yMin	TokenNameIdentifier	 y Min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
