/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
sac	TokenNameIdentifier	 sac
.	TokenNameDOT	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
;	TokenNameSEMICOLON	
/** * This class implements the {@link LexicalUnit} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSLexicalUnit.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link LexicalUnit} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSLexicalUnit.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
implements	TokenNameimplements	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_CENTIMETER	TokenNameIdentifier	 UNIT  TEXT  CENTIMETER
=	TokenNameEQUAL	
"cm"	TokenNameStringLiteral	cm
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_DEGREE	TokenNameIdentifier	 UNIT  TEXT  DEGREE
=	TokenNameEQUAL	
"deg"	TokenNameStringLiteral	deg
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_EM	TokenNameIdentifier	 UNIT  TEXT  EM
=	TokenNameEQUAL	
"em"	TokenNameStringLiteral	em
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_EX	TokenNameIdentifier	 UNIT  TEXT  EX
=	TokenNameEQUAL	
"ex"	TokenNameStringLiteral	ex
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_GRADIAN	TokenNameIdentifier	 UNIT  TEXT  GRADIAN
=	TokenNameEQUAL	
"grad"	TokenNameStringLiteral	grad
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_HERTZ	TokenNameIdentifier	 UNIT  TEXT  HERTZ
=	TokenNameEQUAL	
"Hz"	TokenNameStringLiteral	Hz
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_INCH	TokenNameIdentifier	 UNIT  TEXT  INCH
=	TokenNameEQUAL	
"in"	TokenNameStringLiteral	in
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_KILOHERTZ	TokenNameIdentifier	 UNIT  TEXT  KILOHERTZ
=	TokenNameEQUAL	
"kHz"	TokenNameStringLiteral	kHz
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_MILLIMETER	TokenNameIdentifier	 UNIT  TEXT  MILLIMETER
=	TokenNameEQUAL	
"mm"	TokenNameStringLiteral	mm
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_MILLISECOND	TokenNameIdentifier	 UNIT  TEXT  MILLISECOND
=	TokenNameEQUAL	
"ms"	TokenNameStringLiteral	ms
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_PERCENTAGE	TokenNameIdentifier	 UNIT  TEXT  PERCENTAGE
=	TokenNameEQUAL	
"%"	TokenNameStringLiteral	%
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_PICA	TokenNameIdentifier	 UNIT  TEXT  PICA
=	TokenNameEQUAL	
"pc"	TokenNameStringLiteral	pc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_PIXEL	TokenNameIdentifier	 UNIT  TEXT  PIXEL
=	TokenNameEQUAL	
"px"	TokenNameStringLiteral	px
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_POINT	TokenNameIdentifier	 UNIT  TEXT  POINT
=	TokenNameEQUAL	
"pt"	TokenNameStringLiteral	pt
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_RADIAN	TokenNameIdentifier	 UNIT  TEXT  RADIAN
=	TokenNameEQUAL	
"rad"	TokenNameStringLiteral	rad
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_REAL	TokenNameIdentifier	 UNIT  TEXT  REAL
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
UNIT_TEXT_SECOND	TokenNameIdentifier	 UNIT  TEXT  SECOND
=	TokenNameEQUAL	
"s"	TokenNameStringLiteral	s
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT_RGBCOLOR	TokenNameIdentifier	 TEXT  RGBCOLOR
=	TokenNameEQUAL	
"rgb"	TokenNameStringLiteral	rgb
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT_RECT_FUNCTION	TokenNameIdentifier	 TEXT  RECT  FUNCTION
=	TokenNameEQUAL	
"rect"	TokenNameStringLiteral	rect
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT_COUNTER_FUNCTION	TokenNameIdentifier	 TEXT  COUNTER  FUNCTION
=	TokenNameEQUAL	
"counter"	TokenNameStringLiteral	counter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT_COUNTERS_FUNCTION	TokenNameIdentifier	 TEXT  COUNTERS  FUNCTION
=	TokenNameEQUAL	
"counters"	TokenNameStringLiteral	counters
;	TokenNameSEMICOLON	
/** * The lexical unit type. */	TokenNameCOMMENT_JAVADOC	 The lexical unit type. 
protected	TokenNameprotected	
short	TokenNameshort	
lexicalUnitType	TokenNameIdentifier	 lexical Unit Type
;	TokenNameSEMICOLON	
/** * The next lexical unit. */	TokenNameCOMMENT_JAVADOC	 The next lexical unit. 
protected	TokenNameprotected	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
nextLexicalUnit	TokenNameIdentifier	 next Lexical Unit
;	TokenNameSEMICOLON	
/** * The previous lexical unit. */	TokenNameCOMMENT_JAVADOC	 The previous lexical unit. 
protected	TokenNameprotected	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
previousLexicalUnit	TokenNameIdentifier	 previous Lexical Unit
;	TokenNameSEMICOLON	
/** * Creates a new LexicalUnit. */	TokenNameCOMMENT_JAVADOC	 Creates a new LexicalUnit. 
protected	TokenNameprotected	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
(	TokenNameLPAREN	
short	TokenNameshort	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lexicalUnitType	TokenNameIdentifier	 lexical Unit Type
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
previousLexicalUnit	TokenNameIdentifier	 previous Lexical Unit
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
)	TokenNameRPAREN	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
.	TokenNameDOT	
nextLexicalUnit	TokenNameIdentifier	 next Lexical Unit
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getLexicalUnitType()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getLexicalUnitType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getLexicalUnitType	TokenNameIdentifier	 get Lexical Unit Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lexicalUnitType	TokenNameIdentifier	 lexical Unit Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getNextLexicalUnit()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getNextLexicalUnit()}. 
public	TokenNamepublic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
getNextLexicalUnit	TokenNameIdentifier	 get Next Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextLexicalUnit	TokenNameIdentifier	 next Lexical Unit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the next lexical unit. */	TokenNameCOMMENT_JAVADOC	 Sets the next lexical unit. 
public	TokenNamepublic	
void	TokenNamevoid	
setNextLexicalUnit	TokenNameIdentifier	 set Next Lexical Unit
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextLexicalUnit	TokenNameIdentifier	 next Lexical Unit
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getPreviousLexicalUnit()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getPreviousLexicalUnit()}. 
public	TokenNamepublic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
getPreviousLexicalUnit	TokenNameIdentifier	 get Previous Lexical Unit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
previousLexicalUnit	TokenNameIdentifier	 previous Lexical Unit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the previous lexical unit. */	TokenNameCOMMENT_JAVADOC	 Sets the previous lexical unit. 
public	TokenNamepublic	
void	TokenNamevoid	
setPreviousLexicalUnit	TokenNameIdentifier	 set Previous Lexical Unit
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
lu	TokenNameIdentifier	 lu
)	TokenNameRPAREN	
{	TokenNameLBRACE	
previousLexicalUnit	TokenNameIdentifier	 previous Lexical Unit
=	TokenNameEQUAL	
lu	TokenNameIdentifier	 lu
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getIntegerValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getIntegerValue()}. 
public	TokenNamepublic	
int	TokenNameint	
getIntegerValue	TokenNameIdentifier	 get Integer Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getFloatValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getFloatValue()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getDimensionUnitText()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getDimensionUnitText()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDimensionUnitText	TokenNameIdentifier	 get Dimension Unit Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
lexicalUnitType	TokenNameIdentifier	 lexical Unit Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_CENTIMETER	TokenNameIdentifier	 SAC  CENTIMETER
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_CENTIMETER	TokenNameIdentifier	 UNIT  TEXT  CENTIMETER
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_DEGREE	TokenNameIdentifier	 SAC  DEGREE
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_DEGREE	TokenNameIdentifier	 UNIT  TEXT  DEGREE
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_EM	TokenNameIdentifier	 SAC  EM
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_EM	TokenNameIdentifier	 UNIT  TEXT  EM
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_EX	TokenNameIdentifier	 SAC  EX
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_EX	TokenNameIdentifier	 UNIT  TEXT  EX
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_GRADIAN	TokenNameIdentifier	 SAC  GRADIAN
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_GRADIAN	TokenNameIdentifier	 UNIT  TEXT  GRADIAN
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_HERTZ	TokenNameIdentifier	 SAC  HERTZ
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_HERTZ	TokenNameIdentifier	 UNIT  TEXT  HERTZ
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INCH	TokenNameIdentifier	 SAC  INCH
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_INCH	TokenNameIdentifier	 UNIT  TEXT  INCH
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_KILOHERTZ	TokenNameIdentifier	 SAC  KILOHERTZ
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_KILOHERTZ	TokenNameIdentifier	 UNIT  TEXT  KILOHERTZ
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_MILLIMETER	TokenNameIdentifier	 SAC  MILLIMETER
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_MILLIMETER	TokenNameIdentifier	 UNIT  TEXT  MILLIMETER
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_MILLISECOND	TokenNameIdentifier	 SAC  MILLISECOND
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_MILLISECOND	TokenNameIdentifier	 UNIT  TEXT  MILLISECOND
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PERCENTAGE	TokenNameIdentifier	 SAC  PERCENTAGE
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_PERCENTAGE	TokenNameIdentifier	 UNIT  TEXT  PERCENTAGE
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PICA	TokenNameIdentifier	 SAC  PICA
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_PICA	TokenNameIdentifier	 UNIT  TEXT  PICA
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_PIXEL	TokenNameIdentifier	 SAC  PIXEL
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_PIXEL	TokenNameIdentifier	 UNIT  TEXT  PIXEL
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_POINT	TokenNameIdentifier	 SAC  POINT
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_POINT	TokenNameIdentifier	 UNIT  TEXT  POINT
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_RADIAN	TokenNameIdentifier	 SAC  RADIAN
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_RADIAN	TokenNameIdentifier	 UNIT  TEXT  RADIAN
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_REAL	TokenNameIdentifier	 SAC  REAL
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_REAL	TokenNameIdentifier	 UNIT  TEXT  REAL
;	TokenNameSEMICOLON	
case	TokenNamecase	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_SECOND	TokenNameIdentifier	 SAC  SECOND
:	TokenNameCOLON	
return	TokenNamereturn	
UNIT_TEXT_SECOND	TokenNameIdentifier	 UNIT  TEXT  SECOND
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"No Unit Text for type: "	TokenNameStringLiteral	No Unit Text for type: 
+	TokenNamePLUS	
lexicalUnitType	TokenNameIdentifier	 lexical Unit Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getFunctionName()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getFunctionName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getParameters()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getParameters()}. 
public	TokenNamepublic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getStringValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getStringValue()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getSubValues()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getSubValues()}. 
public	TokenNamepublic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
getSubValues	TokenNameIdentifier	 get Sub Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new integer lexical unit. */	TokenNameCOMMENT_JAVADOC	 Creates a new integer lexical unit. 
public	TokenNamepublic	
static	TokenNamestatic	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
createSimple	TokenNameIdentifier	 create Simple
(	TokenNameLPAREN	
short	TokenNameshort	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SimpleLexicalUnit	TokenNameIdentifier	 Simple Lexical Unit
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents a simple unit. */	TokenNameCOMMENT_JAVADOC	 This class represents a simple unit. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
SimpleLexicalUnit	TokenNameIdentifier	 Simple Lexical Unit
extends	TokenNameextends	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
{	TokenNameLBRACE	
/** * Creates a new LexicalUnit. */	TokenNameCOMMENT_JAVADOC	 Creates a new LexicalUnit. 
public	TokenNamepublic	
SimpleLexicalUnit	TokenNameIdentifier	 Simple Lexical Unit
(	TokenNameLPAREN	
short	TokenNameshort	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new integer lexical unit. */	TokenNameCOMMENT_JAVADOC	 Creates a new integer lexical unit. 
public	TokenNamepublic	
static	TokenNamestatic	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
createInteger	TokenNameIdentifier	 create Integer
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
IntegerLexicalUnit	TokenNameIdentifier	 Integer Lexical Unit
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents an integer unit. */	TokenNameCOMMENT_JAVADOC	 This class represents an integer unit. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
IntegerLexicalUnit	TokenNameIdentifier	 Integer Lexical Unit
extends	TokenNameextends	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
{	TokenNameLBRACE	
/** * The integer value. */	TokenNameCOMMENT_JAVADOC	 The integer value. 
protected	TokenNameprotected	
int	TokenNameint	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Creates a new LexicalUnit. */	TokenNameCOMMENT_JAVADOC	 Creates a new LexicalUnit. 
public	TokenNamepublic	
IntegerLexicalUnit	TokenNameIdentifier	 Integer Lexical Unit
(	TokenNameLPAREN	
int	TokenNameint	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
.	TokenNameDOT	
SAC_INTEGER	TokenNameIdentifier	 SAC  INTEGER
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getIntegerValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getIntegerValue()}. 
public	TokenNamepublic	
int	TokenNameint	
getIntegerValue	TokenNameIdentifier	 get Integer Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new float lexical unit. */	TokenNameCOMMENT_JAVADOC	 Creates a new float lexical unit. 
public	TokenNamepublic	
static	TokenNamestatic	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
createFloat	TokenNameIdentifier	 create Float
(	TokenNameLPAREN	
short	TokenNameshort	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FloatLexicalUnit	TokenNameIdentifier	 Float Lexical Unit
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents a float unit. */	TokenNameCOMMENT_JAVADOC	 This class represents a float unit. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FloatLexicalUnit	TokenNameIdentifier	 Float Lexical Unit
extends	TokenNameextends	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
{	TokenNameLBRACE	
/** * The float value. */	TokenNameCOMMENT_JAVADOC	 The float value. 
protected	TokenNameprotected	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Creates a new LexicalUnit. */	TokenNameCOMMENT_JAVADOC	 Creates a new LexicalUnit. 
public	TokenNamepublic	
FloatLexicalUnit	TokenNameIdentifier	 Float Lexical Unit
(	TokenNameLPAREN	
short	TokenNameshort	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getFloatValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getFloatValue()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new float lexical unit. */	TokenNameCOMMENT_JAVADOC	 Creates a new float lexical unit. 
public	TokenNamepublic	
static	TokenNamestatic	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
createDimension	TokenNameIdentifier	 create Dimension
(	TokenNameLPAREN	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dim	TokenNameIdentifier	 dim
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DimensionLexicalUnit	TokenNameIdentifier	 Dimension Lexical Unit
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
dim	TokenNameIdentifier	 dim
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents a dimension unit. */	TokenNameCOMMENT_JAVADOC	 This class represents a dimension unit. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
DimensionLexicalUnit	TokenNameIdentifier	 Dimension Lexical Unit
extends	TokenNameextends	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
{	TokenNameLBRACE	
/** * The float value. */	TokenNameCOMMENT_JAVADOC	 The float value. 
protected	TokenNameprotected	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * The dimension. */	TokenNameCOMMENT_JAVADOC	 The dimension. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
dimension	TokenNameIdentifier	 dimension
;	TokenNameSEMICOLON	
/** * Creates a new LexicalUnit. */	TokenNameCOMMENT_JAVADOC	 Creates a new LexicalUnit. 
public	TokenNamepublic	
DimensionLexicalUnit	TokenNameIdentifier	 Dimension Lexical Unit
(	TokenNameLPAREN	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
dim	TokenNameIdentifier	 dim
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
SAC_DIMENSION	TokenNameIdentifier	 SAC  DIMENSION
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
dimension	TokenNameIdentifier	 dimension
=	TokenNameEQUAL	
dim	TokenNameIdentifier	 dim
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getFloatValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getFloatValue()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getDimensionUnitText()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getDimensionUnitText()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDimensionUnitText	TokenNameIdentifier	 get Dimension Unit Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dimension	TokenNameIdentifier	 dimension
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new function lexical unit. */	TokenNameCOMMENT_JAVADOC	 Creates a new function lexical unit. 
public	TokenNamepublic	
static	TokenNamestatic	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
createFunction	TokenNameIdentifier	 create Function
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FunctionLexicalUnit	TokenNameIdentifier	 Function Lexical Unit
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents a function unit. */	TokenNameCOMMENT_JAVADOC	 This class represents a function unit. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FunctionLexicalUnit	TokenNameIdentifier	 Function Lexical Unit
extends	TokenNameextends	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
{	TokenNameLBRACE	
/** * The function name. */	TokenNameCOMMENT_JAVADOC	 The function name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * The function parameters. */	TokenNameCOMMENT_JAVADOC	 The function parameters. 
protected	TokenNameprotected	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
/** * Creates a new LexicalUnit. */	TokenNameCOMMENT_JAVADOC	 Creates a new LexicalUnit. 
public	TokenNamepublic	
FunctionLexicalUnit	TokenNameIdentifier	 Function Lexical Unit
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
SAC_FUNCTION	TokenNameIdentifier	 SAC  FUNCTION
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getFunctionName()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getFunctionName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getParameters()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getParameters()}. 
public	TokenNamepublic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new function lexical unit. */	TokenNameCOMMENT_JAVADOC	 Creates a new function lexical unit. 
public	TokenNamepublic	
static	TokenNamestatic	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
createPredefinedFunction	TokenNameIdentifier	 create Predefined Function
(	TokenNameLPAREN	
short	TokenNameshort	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PredefinedFunctionLexicalUnit	TokenNameIdentifier	 Predefined Function Lexical Unit
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents a function unit. */	TokenNameCOMMENT_JAVADOC	 This class represents a function unit. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
PredefinedFunctionLexicalUnit	TokenNameIdentifier	 Predefined Function Lexical Unit
extends	TokenNameextends	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
{	TokenNameLBRACE	
/** * The function parameters. */	TokenNameCOMMENT_JAVADOC	 The function parameters. 
protected	TokenNameprotected	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
/** * Creates a new LexicalUnit. */	TokenNameCOMMENT_JAVADOC	 Creates a new LexicalUnit. 
public	TokenNamepublic	
PredefinedFunctionLexicalUnit	TokenNameIdentifier	 Predefined Function Lexical Unit
(	TokenNameLPAREN	
short	TokenNameshort	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
params	TokenNameIdentifier	 params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getFunctionName()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getFunctionName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
lexicalUnitType	TokenNameIdentifier	 lexical Unit Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SAC_RGBCOLOR	TokenNameIdentifier	 SAC  RGBCOLOR
:	TokenNameCOLON	
return	TokenNamereturn	
TEXT_RGBCOLOR	TokenNameIdentifier	 TEXT  RGBCOLOR
;	TokenNameSEMICOLON	
case	TokenNamecase	
SAC_RECT_FUNCTION	TokenNameIdentifier	 SAC  RECT  FUNCTION
:	TokenNameCOLON	
return	TokenNamereturn	
TEXT_RECT_FUNCTION	TokenNameIdentifier	 TEXT  RECT  FUNCTION
;	TokenNameSEMICOLON	
case	TokenNamecase	
SAC_COUNTER_FUNCTION	TokenNameIdentifier	 SAC  COUNTER  FUNCTION
:	TokenNameCOLON	
return	TokenNamereturn	
TEXT_COUNTER_FUNCTION	TokenNameIdentifier	 TEXT  COUNTER  FUNCTION
;	TokenNameSEMICOLON	
case	TokenNamecase	
SAC_COUNTERS_FUNCTION	TokenNameIdentifier	 SAC  COUNTERS  FUNCTION
:	TokenNameCOLON	
return	TokenNamereturn	
TEXT_COUNTERS_FUNCTION	TokenNameIdentifier	 TEXT  COUNTERS  FUNCTION
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getFunctionName	TokenNameIdentifier	 get Function Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getParameters()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getParameters()}. 
public	TokenNamepublic	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
getParameters	TokenNameIdentifier	 get Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates a new string lexical unit. */	TokenNameCOMMENT_JAVADOC	 Creates a new string lexical unit. 
public	TokenNamepublic	
static	TokenNamestatic	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
createString	TokenNameIdentifier	 create String
(	TokenNameLPAREN	
short	TokenNameshort	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StringLexicalUnit	TokenNameIdentifier	 String Lexical Unit
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class represents a string unit. */	TokenNameCOMMENT_JAVADOC	 This class represents a string unit. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
StringLexicalUnit	TokenNameIdentifier	 String Lexical Unit
extends	TokenNameextends	
CSSLexicalUnit	TokenNameIdentifier	 CSS Lexical Unit
{	TokenNameLBRACE	
/** * The string value. */	TokenNameCOMMENT_JAVADOC	 The string value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * Creates a new LexicalUnit. */	TokenNameCOMMENT_JAVADOC	 Creates a new LexicalUnit. 
public	TokenNamepublic	
StringLexicalUnit	TokenNameIdentifier	 String Lexical Unit
(	TokenNameLPAREN	
short	TokenNameshort	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
LexicalUnit	TokenNameIdentifier	 Lexical Unit
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>SAC</b>: Implements {@link LexicalUnit#getStringValue()}. */	TokenNameCOMMENT_JAVADOC	 <b>SAC</b>: Implements {@link LexicalUnit#getStringValue()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
