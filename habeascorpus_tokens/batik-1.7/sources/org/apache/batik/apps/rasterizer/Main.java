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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ClockHandler	TokenNameIdentifier	 Clock Handler
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
ClockParser	TokenNameIdentifier	 Clock Parser
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ApplicationSecurityEnforcer	TokenNameIdentifier	 Application Security Enforcer
;	TokenNameSEMICOLON	
/** * Handles command line parameters to configure the <tt>SVGConverter</tt> * and rasterizer images. <br /> * * Each command line option is handled by an <tt>OptionHandler</tt> which * is responsible for converting the option into a configuration of the * <tt>SVGConverter</tt> which is used to perform the conversion. * * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> * @version $Id: Main.java 504084 2007-02-06 11:24:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Handles command line parameters to configure the <tt>SVGConverter</tt> and rasterizer images. <br /> * Each command line option is handled by an <tt>OptionHandler</tt> which is responsible for converting the option into a configuration of the <tt>SVGConverter</tt> which is used to perform the conversion. * @author <a href="mailto:vhardy@apache.org">Vincent Hardy</a> @version $Id: Main.java 504084 2007-02-06 11:24:46Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Main	TokenNameIdentifier	 Main
implements	TokenNameimplements	
SVGConverterController	TokenNameIdentifier	 SVG Converter Controller
{	TokenNameLBRACE	
/** * URL for Squiggle's security policy file */	TokenNameCOMMENT_JAVADOC	 URL for Squiggle's security policy file 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RASTERIZER_SECURITY_POLICY	TokenNameIdentifier	 RASTERIZER  SECURITY  POLICY
=	TokenNameEQUAL	
"org/apache/batik/apps/rasterizer/resources/rasterizer.policy"	TokenNameStringLiteral	org/apache/batik/apps/rasterizer/resources/rasterizer.policy
;	TokenNameSEMICOLON	
/** * Interface for handling one command line option */	TokenNameCOMMENT_JAVADOC	 Interface for handling one command line option 
public	TokenNamepublic	
static	TokenNamestatic	
interface	TokenNameinterface	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
/** * The <tt>OptionHandler</tt> should configure the <tt>SVGConverter</tt> * according to the value of the option. * * Should throw an IllegalArgumentException if optionValue * is not an acceptable option. */	TokenNameCOMMENT_JAVADOC	 The <tt>OptionHandler</tt> should configure the <tt>SVGConverter</tt> according to the value of the option. * Should throw an IllegalArgumentException if optionValue is not an acceptable option. 
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
optionValues	TokenNameIdentifier	 option Values
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the number of values which the option handler requires. * This defines the length of the optionValues array passed to * the handler in the handleOption method */	TokenNameCOMMENT_JAVADOC	 Returns the number of values which the option handler requires. This defines the length of the optionValues array passed to the handler in the handleOption method 
int	TokenNameint	
getOptionValuesLength	TokenNameIdentifier	 get Option Values Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the description for this option */	TokenNameCOMMENT_JAVADOC	 Returns the description for this option 
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This abstract implementation of the <tt>OptionHandler</tt> interface * throws an exception if the number of arguments passed to the * <tt>handleOption</tt> method does not match the number of expected * optionValues. If the size matches, the <tt>safeHandleOption</tt> * method is invoked. * Subclasses can implement the <tt>safeHandleOption</tt> method * assuming that the input array size is correct. */	TokenNameCOMMENT_JAVADOC	 This abstract implementation of the <tt>OptionHandler</tt> interface throws an exception if the number of arguments passed to the <tt>handleOption</tt> method does not match the number of expected optionValues. If the size matches, the <tt>safeHandleOption</tt> method is invoked. Subclasses can implement the <tt>safeHandleOption</tt> method assuming that the input array size is correct. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
AbstractOptionHandler	TokenNameIdentifier	 Abstract Option Handler
implements	TokenNameimplements	
OptionHandler	TokenNameIdentifier	 Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
optionValues	TokenNameIdentifier	 option Values
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nOptions	TokenNameIdentifier	 n Options
=	TokenNameEQUAL	
optionValues	TokenNameIdentifier	 option Values
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
optionValues	TokenNameIdentifier	 option Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nOptions	TokenNameIdentifier	 n Options
!=	TokenNameNOT_EQUAL	
getOptionValuesLength	TokenNameIdentifier	 get Option Values Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
safeHandleOption	TokenNameIdentifier	 safe Handle Option
(	TokenNameLPAREN	
optionValues	TokenNameIdentifier	 option Values
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
safeHandleOption	TokenNameIdentifier	 safe Handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
optionValues	TokenNameIdentifier	 option Values
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Base class for options with no option value (i.e., the presence * of the option means something in itself. Subclasses should implement * the <tt>handleOption</tt> method which takes only an <tt>SVGConverter</tt> * as a parameter. */	TokenNameCOMMENT_JAVADOC	 Base class for options with no option value (i.e., the presence of the option means something in itself. Subclasses should implement the <tt>handleOption</tt> method which takes only an <tt>SVGConverter</tt> as a parameter. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
NoValueOptionHandler	TokenNameIdentifier	 No Value Option Handler
extends	TokenNameextends	
AbstractOptionHandler	TokenNameIdentifier	 Abstract Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
safeHandleOption	TokenNameIdentifier	 safe Handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
optionValues	TokenNameIdentifier	 option Values
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getOptionValuesLength	TokenNameIdentifier	 get Option Values Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Base class for options with a single option value. Subclasses should * provide an implementation for the <tt>handleOption</tt> method which * takes a <tt>String</tt> and an <tt>SVGConverter</tt> as parameters. */	TokenNameCOMMENT_JAVADOC	 Base class for options with a single option value. Subclasses should provide an implementation for the <tt>handleOption</tt> method which takes a <tt>String</tt> and an <tt>SVGConverter</tt> as parameters. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
extends	TokenNameextends	
AbstractOptionHandler	TokenNameIdentifier	 Abstract Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
safeHandleOption	TokenNameIdentifier	 safe Handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
optionValues	TokenNameIdentifier	 option Values
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
optionValues	TokenNameIdentifier	 option Values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getOptionValuesLength	TokenNameIdentifier	 get Option Values Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Base class for options which expect the single optionValue to * be a float. Subclasses should implement the <tt>handleOption</tt> * method which takes a float and an <tt>SVGConverter</tt> as * parameters. */	TokenNameCOMMENT_JAVADOC	 Base class for options which expect the single optionValue to be a float. Subclasses should implement the <tt>handleOption</tt> method which takes a float and an <tt>SVGConverter</tt> as parameters. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
FloatOptionHandler	TokenNameIdentifier	 Float Option Handler
extends	TokenNameextends	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Base class for options which expect the single optionValue to * be a time value. Subclasses should implement the <tt>handleOption</tt> * method which takes a float and an <tt>SVGConverter</tt> as * parameters. */	TokenNameCOMMENT_JAVADOC	 Base class for options which expect the single optionValue to be a time value. Subclasses should implement the <tt>handleOption</tt> method which takes a float and an <tt>SVGConverter</tt> as parameters. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
TimeOptionHandler	TokenNameIdentifier	 Time Option Handler
extends	TokenNameextends	
FloatOptionHandler	TokenNameIdentifier	 Float Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
final	TokenNamefinal	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ClockParser	TokenNameIdentifier	 Clock Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
ClockParser	TokenNameIdentifier	 Clock Parser
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setClockHandler	TokenNameIdentifier	 set Clock Handler
(	TokenNameLPAREN	
new	TokenNamenew	
ClockHandler	TokenNameIdentifier	 Clock Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clockValue	TokenNameIdentifier	 clock Value
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Base class for options which expect a <tt>Rectangle</tt> optionValue. * Subclasses should implement the <tt>handleOption</tt> method which * takes a <tt>Rectangle</tt> and an <tt>SVGConverter</tt> as parameters. */	TokenNameCOMMENT_JAVADOC	 Base class for options which expect a <tt>Rectangle</tt> optionValue. Subclasses should implement the <tt>handleOption</tt> method which takes a <tt>Rectangle</tt> and an <tt>SVGConverter</tt> as parameters. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
RectangleOptionHandler	TokenNameIdentifier	 Rectangle Option Handler
extends	TokenNameextends	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
parseRect	TokenNameIdentifier	 parse Rect
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
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
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
parseRect	TokenNameIdentifier	 parse Rect
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rectValue	TokenNameIdentifier	 rect Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
rect	TokenNameIdentifier	 rect
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rectValue	TokenNameIdentifier	 rect Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
rectValue	TokenNameIdentifier	 rect Value
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rectValue	TokenNameIdentifier	 rect Value
+=	TokenNamePLUS_EQUAL	
"f"	TokenNameStringLiteral	f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
rectValue	TokenNameIdentifier	 rect Value
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
xStr	TokenNameIdentifier	 x Str
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
yStr	TokenNameIdentifier	 y Str
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
wStr	TokenNameIdentifier	 w Str
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
hStr	TokenNameIdentifier	 h Str
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
xStr	TokenNameIdentifier	 x Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
yStr	TokenNameIdentifier	 y Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
wStr	TokenNameIdentifier	 w Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
hStr	TokenNameIdentifier	 h Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If an error occured, the x, y, w, h 	TokenNameCOMMENT_LINE	If an error occured, the x, y, w, h 
// values will not be valid 	TokenNameCOMMENT_LINE	values will not be valid 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
w	TokenNameIdentifier	 w
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
h	TokenNameIdentifier	 h
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rect	TokenNameIdentifier	 rect
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
rect	TokenNameIdentifier	 rect
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Base class for options which expect a <tt>Color</tt> optionValue. * Subclasses should implement the <tt>handleOption</tt> method which * takes a <tt>Color</tt> and an <tt>SVGConverter</tt> as parameters. */	TokenNameCOMMENT_JAVADOC	 Base class for options which expect a <tt>Color</tt> optionValue. Subclasses should implement the <tt>handleOption</tt> method which takes a <tt>Color</tt> and an <tt>SVGConverter</tt> as parameters. 
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
ColorOptionHandler	TokenNameIdentifier	 Color Option Handler
extends	TokenNameextends	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
=	TokenNameEQUAL	
parseARGB	TokenNameIdentifier	 parse ARGB
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
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
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
color	TokenNameIdentifier	 color
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Parse the input value, which should be in the following * format: a.r.g.b where a, r, g and b are integer values, * in decimal notation, between 0 and 255. * @return the parsed color if successful. null otherwise. */	TokenNameCOMMENT_JAVADOC	 Parse the input value, which should be in the following format: a.r.g.b where a, r, g and b are integer values, in decimal notation, between 0 and 255. @return the parsed color if successful. null otherwise. 
public	TokenNamepublic	
Color	TokenNameIdentifier	 Color
parseARGB	TokenNameIdentifier	 parse ARGB
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
argbVal	TokenNameIdentifier	 argb Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Color	TokenNameIdentifier	 Color
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
argbVal	TokenNameIdentifier	 argb Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
argbVal	TokenNameIdentifier	 argb Val
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
countTokens	TokenNameIdentifier	 count Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
aStr	TokenNameIdentifier	 a Str
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rStr	TokenNameIdentifier	 r Str
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
gStr	TokenNameIdentifier	 g Str
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
bStr	TokenNameIdentifier	 b Str
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
aStr	TokenNameIdentifier	 a Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
rStr	TokenNameIdentifier	 r Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
gStr	TokenNameIdentifier	 g Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
bStr	TokenNameIdentifier	 b Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If an error occured, the a, r, g, b 	TokenNameCOMMENT_LINE	If an error occured, the a, r, g, b 
// values will not be in the 0-255 range 	TokenNameCOMMENT_LINE	values will not be in the 0-255 range 
// and the next if test will fail 	TokenNameCOMMENT_LINE	and the next if test will fail 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
a	TokenNameIdentifier	 a
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
r	TokenNameIdentifier	 r
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
r	TokenNameIdentifier	 r
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
g	TokenNameIdentifier	 g
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
g	TokenNameIdentifier	 g
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
b	TokenNameIdentifier	 b
<=	TokenNameLESS_EQUAL	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Describes the command line options for the rasterizer */	TokenNameCOMMENT_JAVADOC	 Describes the command line options for the rasterizer 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
USAGE	TokenNameIdentifier	 USAGE
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
"Main.usage"	TokenNameStringLiteral	Main.usage
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// The command line options are found in the properties 	TokenNameCOMMENT_LINE	The command line options are found in the properties 
// file. 	TokenNameCOMMENT_LINE	file. 
// 	TokenNameCOMMENT_LINE	 
/** * Option to specify the output directory or file */	TokenNameCOMMENT_JAVADOC	 Option to specify the output directory or file 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_OUTPUT	TokenNameIdentifier	 CL  OPTION  OUTPUT
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.output"	TokenNameStringLiteral	Main.cl.option.output
,	TokenNameCOMMA	
"-d"	TokenNameStringLiteral	-d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_OUTPUT_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  OUTPUT  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.output.description"	TokenNameStringLiteral	Main.cl.option.output.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the output image's mime type */	TokenNameCOMMENT_JAVADOC	 Option to specify the output image's mime type 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_MIME_TYPE	TokenNameIdentifier	 CL  OPTION  MIME  TYPE
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.mime.type"	TokenNameStringLiteral	Main.cl.option.mime.type
,	TokenNameCOMMA	
"-m"	TokenNameStringLiteral	-m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_MIME_TYPE_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  MIME  TYPE  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.mime.type.description"	TokenNameStringLiteral	Main.cl.option.mime.type.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the output image's width */	TokenNameCOMMENT_JAVADOC	 Option to specify the output image's width 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_WIDTH	TokenNameIdentifier	 CL  OPTION  WIDTH
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.width"	TokenNameStringLiteral	Main.cl.option.width
,	TokenNameCOMMA	
"-w"	TokenNameStringLiteral	-w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_WIDTH_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  WIDTH  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.width.description"	TokenNameStringLiteral	Main.cl.option.width.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the output image's height */	TokenNameCOMMENT_JAVADOC	 Option to specify the output image's height 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_HEIGHT	TokenNameIdentifier	 CL  OPTION  HEIGHT
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.height"	TokenNameStringLiteral	Main.cl.option.height
,	TokenNameCOMMA	
"-h"	TokenNameStringLiteral	-h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_HEIGHT_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  HEIGHT  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.height.description"	TokenNameStringLiteral	Main.cl.option.height.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the output image's maximum width. */	TokenNameCOMMENT_JAVADOC	 Option to specify the output image's maximum width. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_MAX_WIDTH	TokenNameIdentifier	 CL  OPTION  MAX  WIDTH
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.max.width"	TokenNameStringLiteral	Main.cl.option.max.width
,	TokenNameCOMMA	
"-maxw"	TokenNameStringLiteral	-maxw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_MAX_WIDTH_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  MAX  WIDTH  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.max.width.description"	TokenNameStringLiteral	Main.cl.option.max.width.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the output image's maximum height. */	TokenNameCOMMENT_JAVADOC	 Option to specify the output image's maximum height. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_MAX_HEIGHT	TokenNameIdentifier	 CL  OPTION  MAX  HEIGHT
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.max.height"	TokenNameStringLiteral	Main.cl.option.max.height
,	TokenNameCOMMA	
"-maxh"	TokenNameStringLiteral	-maxh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_MAX_HEIGHT_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  MAX  HEIGHT  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.max.height.description"	TokenNameStringLiteral	Main.cl.option.max.height.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the area of interest in the output * image. */	TokenNameCOMMENT_JAVADOC	 Option to specify the area of interest in the output image. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_AOI	TokenNameIdentifier	 CL  OPTION  AOI
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.aoi"	TokenNameStringLiteral	Main.cl.option.aoi
,	TokenNameCOMMA	
"-a"	TokenNameStringLiteral	-a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_AOI_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  AOI  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.aoi.description"	TokenNameStringLiteral	Main.cl.option.aoi.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the output image's background color */	TokenNameCOMMENT_JAVADOC	 Option to specify the output image's background color 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_BACKGROUND_COLOR	TokenNameIdentifier	 CL  OPTION  BACKGROUND  COLOR
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.background.color"	TokenNameStringLiteral	Main.cl.option.background.color
,	TokenNameCOMMA	
"-bg"	TokenNameStringLiteral	-bg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_BACKGROUND_COLOR_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  BACKGROUND  COLOR  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.background.color.description"	TokenNameStringLiteral	Main.cl.option.background.color.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the CSS media type when converting * the SVG image */	TokenNameCOMMENT_JAVADOC	 Option to specify the CSS media type when converting the SVG image 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_MEDIA_TYPE	TokenNameIdentifier	 CL  OPTION  MEDIA  TYPE
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.media.type"	TokenNameStringLiteral	Main.cl.option.media.type
,	TokenNameCOMMA	
"-cssMedia"	TokenNameStringLiteral	-cssMedia
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_MEDIA_TYPE_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  MEDIA  TYPE  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.media.type.description"	TokenNameStringLiteral	Main.cl.option.media.type.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the default value for the font-family * CSS property when converting the SVG image */	TokenNameCOMMENT_JAVADOC	 Option to specify the default value for the font-family CSS property when converting the SVG image 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_DEFAULT_FONT_FAMILY	TokenNameIdentifier	 CL  OPTION  DEFAULT  FONT  FAMILY
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.default.font.family"	TokenNameStringLiteral	Main.cl.option.default.font.family
,	TokenNameCOMMA	
"-font-family"	TokenNameStringLiteral	-font-family
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_DEFAULT_FONT_FAMILY_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  DEFAULT  FONT  FAMILY  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.default.font.family.description"	TokenNameStringLiteral	Main.cl.option.default.font.family.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the CSS alternate stylesheet when * converting the SVG images */	TokenNameCOMMENT_JAVADOC	 Option to specify the CSS alternate stylesheet when converting the SVG images 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_ALTERNATE_STYLESHEET	TokenNameIdentifier	 CL  OPTION  ALTERNATE  STYLESHEET
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.alternate.stylesheet"	TokenNameStringLiteral	Main.cl.option.alternate.stylesheet
,	TokenNameCOMMA	
"-cssAlternate"	TokenNameStringLiteral	-cssAlternate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_ALTERNATE_STYLESHEET_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  ALTERNATE  STYLESHEET  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.alternate.stylesheet.description"	TokenNameStringLiteral	Main.cl.option.alternate.stylesheet.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify that the converted SVG files should * be validated during the conversion process. */	TokenNameCOMMENT_JAVADOC	 Option to specify that the converted SVG files should be validated during the conversion process. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_VALIDATE	TokenNameIdentifier	 CL  OPTION  VALIDATE
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.validate"	TokenNameStringLiteral	Main.cl.option.validate
,	TokenNameCOMMA	
"-validate"	TokenNameStringLiteral	-validate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_VALIDATE_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  VALIDATE  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.validate.description"	TokenNameStringLiteral	Main.cl.option.validate.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify that the converted SVG files should * be after the dispatch of the 'onload' event. */	TokenNameCOMMENT_JAVADOC	 Option to specify that the converted SVG files should be after the dispatch of the 'onload' event. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_ONLOAD	TokenNameIdentifier	 CL  OPTION  ONLOAD
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.onload"	TokenNameStringLiteral	Main.cl.option.onload
,	TokenNameCOMMA	
"-onload"	TokenNameStringLiteral	-onload
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_ONLOAD_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  ONLOAD  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.onload.description"	TokenNameStringLiteral	Main.cl.option.onload.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify that the document should be rasterized after * seeking to the specified document time. */	TokenNameCOMMENT_JAVADOC	 Option to specify that the document should be rasterized after seeking to the specified document time. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_SNAPSHOT_TIME	TokenNameIdentifier	 CL  OPTION  SNAPSHOT  TIME
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.snapshot.time"	TokenNameStringLiteral	Main.cl.option.snapshot.time
,	TokenNameCOMMA	
"-snapshotTime"	TokenNameStringLiteral	-snapshotTime
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_SNAPSHOT_TIME_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  SNAPSHOT  TIME  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.snapshot.time.description"	TokenNameStringLiteral	Main.cl.option.snapshot.time.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the user language with which SVG * documents should be processed */	TokenNameCOMMENT_JAVADOC	 Option to specify the user language with which SVG documents should be processed 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_LANGUAGE	TokenNameIdentifier	 CL  OPTION  LANGUAGE
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.language"	TokenNameStringLiteral	Main.cl.option.language
,	TokenNameCOMMA	
"-lang"	TokenNameStringLiteral	-lang
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_LANGUAGE_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  LANGUAGE  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.language.description"	TokenNameStringLiteral	Main.cl.option.language.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify an addition user stylesheet */	TokenNameCOMMENT_JAVADOC	 Option to specify an addition user stylesheet 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_USER_STYLESHEET	TokenNameIdentifier	 CL  OPTION  USER  STYLESHEET
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.user.stylesheet"	TokenNameStringLiteral	Main.cl.option.user.stylesheet
,	TokenNameCOMMA	
"-cssUser"	TokenNameStringLiteral	-cssUser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_USER_STYLESHEET_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  USER  STYLESHEET  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.user.stylesheet.description"	TokenNameStringLiteral	Main.cl.option.user.stylesheet.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the resolution for the output image */	TokenNameCOMMENT_JAVADOC	 Option to specify the resolution for the output image 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_DPI	TokenNameIdentifier	 CL  OPTION  DPI
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.dpi"	TokenNameStringLiteral	Main.cl.option.dpi
,	TokenNameCOMMA	
"-dpi"	TokenNameStringLiteral	-dpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_DPI_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  DPI  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.dpi.description"	TokenNameStringLiteral	Main.cl.option.dpi.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the output JPEG quality */	TokenNameCOMMENT_JAVADOC	 Option to specify the output JPEG quality 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_QUALITY	TokenNameIdentifier	 CL  OPTION  QUALITY
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.quality"	TokenNameStringLiteral	Main.cl.option.quality
,	TokenNameCOMMA	
"-q"	TokenNameStringLiteral	-q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_QUALITY_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  QUALITY  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.quality.description"	TokenNameStringLiteral	Main.cl.option.quality.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify if the PNG should be indexed. */	TokenNameCOMMENT_JAVADOC	 Option to specify if the PNG should be indexed. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_INDEXED	TokenNameIdentifier	 CL  OPTION  INDEXED
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.indexed"	TokenNameStringLiteral	Main.cl.option.indexed
,	TokenNameCOMMA	
"-indexed"	TokenNameStringLiteral	-indexed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_INDEXED_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  INDEXED  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.indexed.description"	TokenNameStringLiteral	Main.cl.option.indexed.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to specify the set of allowed scripts */	TokenNameCOMMENT_JAVADOC	 Option to specify the set of allowed scripts 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_ALLOWED_SCRIPTS	TokenNameIdentifier	 CL  OPTION  ALLOWED  SCRIPTS
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.allowed.scripts"	TokenNameStringLiteral	Main.cl.option.allowed.scripts
,	TokenNameCOMMA	
"-scripts"	TokenNameStringLiteral	-scripts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_ALLOWED_SCRIPTS_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  ALLOWED  SCRIPTS  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.allowed.scripts.description"	TokenNameStringLiteral	Main.cl.option.allowed.scripts.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to determine whether scripts a constrained to the * same origin as the document referencing them. */	TokenNameCOMMENT_JAVADOC	 Option to determine whether scripts a constrained to the same origin as the document referencing them. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_CONSTRAIN_SCRIPT_ORIGIN	TokenNameIdentifier	 CL  OPTION  CONSTRAIN  SCRIPT  ORIGIN
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.constrain.script.origin"	TokenNameStringLiteral	Main.cl.option.constrain.script.origin
,	TokenNameCOMMA	
"-anyScriptOrigin"	TokenNameStringLiteral	-anyScriptOrigin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_CONSTRAIN_SCRIPT_ORIGIN_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  CONSTRAIN  SCRIPT  ORIGIN  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.constrain.script.origin.description"	TokenNameStringLiteral	Main.cl.option.constrain.script.origin.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Option to turn off secure execution of scripts */	TokenNameCOMMENT_JAVADOC	 Option to turn off secure execution of scripts 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_SECURITY_OFF	TokenNameIdentifier	 CL  OPTION  SECURITY  OFF
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.security.off"	TokenNameStringLiteral	Main.cl.option.security.off
,	TokenNameCOMMA	
"-scriptSecurityOff"	TokenNameStringLiteral	-scriptSecurityOff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
CL_OPTION_SECURITY_OFF_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  SECURITY  OFF  DESCRIPTION
=	TokenNameEQUAL	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"Main.cl.option.security.off.description"	TokenNameStringLiteral	Main.cl.option.security.off.description
,	TokenNameCOMMA	
"No description"	TokenNameStringLiteral	No description
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Static map containing all the option handlers able to analyze the * various options. */	TokenNameCOMMENT_JAVADOC	 Static map containing all the option handlers able to analyze the various options. 
protected	TokenNameprotected	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
optionMap	TokenNameIdentifier	 option Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Static map containing all the mime types understood by the * rasterizer */	TokenNameCOMMENT_JAVADOC	 Static map containing all the mime types understood by the rasterizer 
protected	TokenNameprotected	
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
mimeTypeMap	TokenNameIdentifier	 mime Type Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Static initializer: adds all the option handlers to the * map of option handlers. */	TokenNameCOMMENT_JAVADOC	 Static initializer: adds all the option handlers to the map of option handlers. 
static	TokenNamestatic	
{	TokenNameLBRACE	
mimeTypeMap	TokenNameIdentifier	 mime Type Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"image/jpg"	TokenNameStringLiteral	image/jpg
,	TokenNameCOMMA	
DestinationType	TokenNameIdentifier	 Destination Type
.	TokenNameDOT	
JPEG	TokenNameIdentifier	 JPEG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mimeTypeMap	TokenNameIdentifier	 mime Type Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"image/jpeg"	TokenNameStringLiteral	image/jpeg
,	TokenNameCOMMA	
DestinationType	TokenNameIdentifier	 Destination Type
.	TokenNameDOT	
JPEG	TokenNameIdentifier	 JPEG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mimeTypeMap	TokenNameIdentifier	 mime Type Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"image/jpe"	TokenNameStringLiteral	image/jpe
,	TokenNameCOMMA	
DestinationType	TokenNameIdentifier	 Destination Type
.	TokenNameDOT	
JPEG	TokenNameIdentifier	 JPEG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mimeTypeMap	TokenNameIdentifier	 mime Type Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"image/png"	TokenNameStringLiteral	image/png
,	TokenNameCOMMA	
DestinationType	TokenNameIdentifier	 Destination Type
.	TokenNameDOT	
PNG	TokenNameIdentifier	 PNG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mimeTypeMap	TokenNameIdentifier	 mime Type Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"application/pdf"	TokenNameStringLiteral	application/pdf
,	TokenNameCOMMA	
DestinationType	TokenNameIdentifier	 Destination Type
.	TokenNameDOT	
PDF	TokenNameIdentifier	 PDF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mimeTypeMap	TokenNameIdentifier	 mime Type Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"image/tiff"	TokenNameStringLiteral	image/tiff
,	TokenNameCOMMA	
DestinationType	TokenNameIdentifier	 Destination Type
.	TokenNameDOT	
TIFF	TokenNameIdentifier	 TIFF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_OUTPUT	TokenNameIdentifier	 CL  OPTION  OUTPUT
,	TokenNameCOMMA	
new	TokenNamenew	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setDst	TokenNameIdentifier	 set Dst
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_OUTPUT_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  OUTPUT  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_MIME_TYPE	TokenNameIdentifier	 CL  OPTION  MIME  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DestinationType	TokenNameIdentifier	 Destination Type
dstType	TokenNameIdentifier	 dst Type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DestinationType	TokenNameIdentifier	 Destination Type
)	TokenNameRPAREN	
mimeTypeMap	TokenNameIdentifier	 mime Type Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstType	TokenNameIdentifier	 dst Type
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
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setDestinationType	TokenNameIdentifier	 set Destination Type
(	TokenNameLPAREN	
dstType	TokenNameIdentifier	 dst Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_MIME_TYPE_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  MIME  TYPE  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_WIDTH	TokenNameIdentifier	 CL  OPTION  WIDTH
,	TokenNameCOMMA	
new	TokenNamenew	
FloatOptionHandler	TokenNameIdentifier	 Float Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_WIDTH_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  WIDTH  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_HEIGHT	TokenNameIdentifier	 CL  OPTION  HEIGHT
,	TokenNameCOMMA	
new	TokenNamenew	
FloatOptionHandler	TokenNameIdentifier	 Float Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setHeight	TokenNameIdentifier	 set Height
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_HEIGHT_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  HEIGHT  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_MAX_WIDTH	TokenNameIdentifier	 CL  OPTION  MAX  WIDTH
,	TokenNameCOMMA	
new	TokenNamenew	
FloatOptionHandler	TokenNameIdentifier	 Float Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setMaxWidth	TokenNameIdentifier	 set Max Width
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_MAX_WIDTH_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  MAX  WIDTH  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_MAX_HEIGHT	TokenNameIdentifier	 CL  OPTION  MAX  HEIGHT
,	TokenNameCOMMA	
new	TokenNamenew	
FloatOptionHandler	TokenNameIdentifier	 Float Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setMaxHeight	TokenNameIdentifier	 set Max Height
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_MAX_HEIGHT_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  MAX  HEIGHT  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_AOI	TokenNameIdentifier	 CL  OPTION  AOI
,	TokenNameCOMMA	
new	TokenNamenew	
RectangleOptionHandler	TokenNameIdentifier	 Rectangle Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setArea	TokenNameIdentifier	 set Area
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_AOI_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  AOI  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_BACKGROUND_COLOR	TokenNameIdentifier	 CL  OPTION  BACKGROUND  COLOR
,	TokenNameCOMMA	
new	TokenNamenew	
ColorOptionHandler	TokenNameIdentifier	 Color Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setBackgroundColor	TokenNameIdentifier	 set Background Color
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_BACKGROUND_COLOR_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  BACKGROUND  COLOR  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_MEDIA_TYPE	TokenNameIdentifier	 CL  OPTION  MEDIA  TYPE
,	TokenNameCOMMA	
new	TokenNamenew	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setMediaType	TokenNameIdentifier	 set Media Type
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_MEDIA_TYPE_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  MEDIA  TYPE  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_DEFAULT_FONT_FAMILY	TokenNameIdentifier	 CL  OPTION  DEFAULT  FONT  FAMILY
,	TokenNameCOMMA	
new	TokenNamenew	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setDefaultFontFamily	TokenNameIdentifier	 set Default Font Family
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_DEFAULT_FONT_FAMILY_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  DEFAULT  FONT  FAMILY  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_ALTERNATE_STYLESHEET	TokenNameIdentifier	 CL  OPTION  ALTERNATE  STYLESHEET
,	TokenNameCOMMA	
new	TokenNamenew	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setAlternateStylesheet	TokenNameIdentifier	 set Alternate Stylesheet
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_ALTERNATE_STYLESHEET_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  ALTERNATE  STYLESHEET  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_USER_STYLESHEET	TokenNameIdentifier	 CL  OPTION  USER  STYLESHEET
,	TokenNameCOMMA	
new	TokenNamenew	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setUserStylesheet	TokenNameIdentifier	 set User Stylesheet
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_USER_STYLESHEET_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  USER  STYLESHEET  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_LANGUAGE	TokenNameIdentifier	 CL  OPTION  LANGUAGE
,	TokenNameCOMMA	
new	TokenNamenew	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setLanguage	TokenNameIdentifier	 set Language
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_LANGUAGE_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  LANGUAGE  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_DPI	TokenNameIdentifier	 CL  OPTION  DPI
,	TokenNameCOMMA	
new	TokenNamenew	
FloatOptionHandler	TokenNameIdentifier	 Float Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setPixelUnitToMillimeter	TokenNameIdentifier	 set Pixel Unit To Millimeter
(	TokenNameLPAREN	
(	TokenNameLPAREN	
2.54f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_DPI_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  DPI  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_QUALITY	TokenNameIdentifier	 CL  OPTION  QUALITY
,	TokenNameCOMMA	
new	TokenNamenew	
FloatOptionHandler	TokenNameIdentifier	 Float Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
optionValue	TokenNameIdentifier	 option Value
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setQuality	TokenNameIdentifier	 set Quality
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_QUALITY_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  QUALITY  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_INDEXED	TokenNameIdentifier	 CL  OPTION  INDEXED
,	TokenNameCOMMA	
new	TokenNamenew	
FloatOptionHandler	TokenNameIdentifier	 Float Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
!=	TokenNameNOT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
!=	TokenNameNOT_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setIndexed	TokenNameIdentifier	 set Indexed
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_INDEXED_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  INDEXED  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_VALIDATE	TokenNameIdentifier	 CL  OPTION  VALIDATE
,	TokenNameCOMMA	
new	TokenNamenew	
NoValueOptionHandler	TokenNameIdentifier	 No Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setValidate	TokenNameIdentifier	 set Validate
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_VALIDATE_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  VALIDATE  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_ONLOAD	TokenNameIdentifier	 CL  OPTION  ONLOAD
,	TokenNameCOMMA	
new	TokenNamenew	
NoValueOptionHandler	TokenNameIdentifier	 No Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setExecuteOnload	TokenNameIdentifier	 set Execute Onload
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_ONLOAD_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  ONLOAD  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_SNAPSHOT_TIME	TokenNameIdentifier	 CL  OPTION  SNAPSHOT  TIME
,	TokenNameCOMMA	
new	TokenNamenew	
TimeOptionHandler	TokenNameIdentifier	 Time Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
float	TokenNamefloat	
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setExecuteOnload	TokenNameIdentifier	 set Execute Onload
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setSnapshotTime	TokenNameIdentifier	 set Snapshot Time
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_SNAPSHOT_TIME_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  SNAPSHOT  TIME  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_ALLOWED_SCRIPTS	TokenNameIdentifier	 CL  OPTION  ALLOWED  SCRIPTS
,	TokenNameCOMMA	
new	TokenNamenew	
SingleValueOptionHandler	TokenNameIdentifier	 Single Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
optionValue	TokenNameIdentifier	 option Value
,	TokenNameCOMMA	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setAllowedScriptTypes	TokenNameIdentifier	 set Allowed Script Types
(	TokenNameLPAREN	
optionValue	TokenNameIdentifier	 option Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_ALLOWED_SCRIPTS_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  ALLOWED  SCRIPTS  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_CONSTRAIN_SCRIPT_ORIGIN	TokenNameIdentifier	 CL  OPTION  CONSTRAIN  SCRIPT  ORIGIN
,	TokenNameCOMMA	
new	TokenNamenew	
NoValueOptionHandler	TokenNameIdentifier	 No Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setConstrainScriptOrigin	TokenNameIdentifier	 set Constrain Script Origin
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_CONSTRAIN_SCRIPT_ORIGIN_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  CONSTRAIN  SCRIPT  ORIGIN  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
CL_OPTION_SECURITY_OFF	TokenNameIdentifier	 CL  OPTION  SECURITY  OFF
,	TokenNameCOMMA	
new	TokenNamenew	
NoValueOptionHandler	TokenNameIdentifier	 No Value Option Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setSecurityOff	TokenNameIdentifier	 set Security Off
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CL_OPTION_SECURITY_OFF_DESCRIPTION	TokenNameIdentifier	 CL  OPTION  SECURITY  OFF  DESCRIPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * List of arguments describing the conversion task to be * performed. */	TokenNameCOMMENT_JAVADOC	 List of arguments describing the conversion task to be performed. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
args	TokenNameIdentifier	 args
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Main	TokenNameIdentifier	 Main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
errorArgs	TokenNameIdentifier	 error Args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
errorCode	TokenNameIdentifier	 error Code
,	TokenNameCOMMA	
errorArgs	TokenNameIdentifier	 error Args
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Error codes generated by the rasterizer 	TokenNameCOMMENT_LINE	Error codes generated by the rasterizer 
// 	TokenNameCOMMENT_LINE	 
/** * Error when there are missing option values: * {0} Option * {1} Option description */	TokenNameCOMMENT_JAVADOC	 Error when there are missing option values: {0} Option {1} Option description 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_NOT_ENOUGH_OPTION_VALUES	TokenNameIdentifier	 ERROR  NOT  ENOUGH  OPTION  VALUES
=	TokenNameEQUAL	
"Main.error.not.enough.option.values"	TokenNameStringLiteral	Main.error.not.enough.option.values
;	TokenNameSEMICOLON	
/** * Error when an illegal option value was passed to the app * {0} Option * {1} Option description */	TokenNameCOMMENT_JAVADOC	 Error when an illegal option value was passed to the app {0} Option {1} Option description 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_ILLEGAL_ARGUMENT	TokenNameIdentifier	 ERROR  ILLEGAL  ARGUMENT
=	TokenNameEQUAL	
"Main.error.illegal.argument"	TokenNameStringLiteral	Main.error.illegal.argument
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_WHILE_CONVERTING_FILES	TokenNameIdentifier	 ERROR  WHILE  CONVERTING  FILES
=	TokenNameEQUAL	
"Main.error.while.converting.files"	TokenNameStringLiteral	Main.error.while.converting.files
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
SVGConverter	TokenNameIdentifier	 SVG Converter
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
sources	TokenNameIdentifier	 sources
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nArgs	TokenNameIdentifier	 n Args
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
nArgs	TokenNameIdentifier	 n Args
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OptionHandler	TokenNameIdentifier	 Option Handler
optionHandler	TokenNameIdentifier	 option Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OptionHandler	TokenNameIdentifier	 Option Handler
)	TokenNameRPAREN	
optionMap	TokenNameIdentifier	 option Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
optionHandler	TokenNameIdentifier	 option Handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume v is a source. 	TokenNameCOMMENT_LINE	Assume v is a source. 
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// v is an option. Extract the optionValues required 	TokenNameCOMMENT_LINE	v is an option. Extract the optionValues required 
// by the handler. 	TokenNameCOMMENT_LINE	by the handler. 
int	TokenNameint	
nOptionArgs	TokenNameIdentifier	 n Option Args
=	TokenNameEQUAL	
optionHandler	TokenNameIdentifier	 option Handler
.	TokenNameDOT	
getOptionValuesLength	TokenNameIdentifier	 get Option Values Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
nOptionArgs	TokenNameIdentifier	 n Option Args
>=	TokenNameGREATER_EQUAL	
nArgs	TokenNameIdentifier	 n Args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
ERROR_NOT_ENOUGH_OPTION_VALUES	TokenNameIdentifier	 ERROR  NOT  ENOUGH  OPTION  VALUES
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
optionHandler	TokenNameIdentifier	 option Handler
.	TokenNameDOT	
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
optionValues	TokenNameIdentifier	 option Values
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
nOptionArgs	TokenNameIdentifier	 n Option Args
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
nOptionArgs	TokenNameIdentifier	 n Option Args
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
optionValues	TokenNameIdentifier	 option Values
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
nOptionArgs	TokenNameIdentifier	 n Option Args
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
optionHandler	TokenNameIdentifier	 option Handler
.	TokenNameDOT	
handleOption	TokenNameIdentifier	 handle Option
(	TokenNameLPAREN	
optionValues	TokenNameIdentifier	 option Values
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
ERROR_ILLEGAL_ARGUMENT	TokenNameIdentifier	 ERROR  ILLEGAL  ARGUMENT
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
optionHandler	TokenNameIdentifier	 option Handler
.	TokenNameDOT	
getOptionDescription	TokenNameIdentifier	 get Option Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
optionValues	TokenNameIdentifier	 option Values
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Apply script security option 	TokenNameCOMMENT_LINE	Apply script security option 
ApplicationSecurityEnforcer	TokenNameIdentifier	 Application Security Enforcer
securityEnforcer	TokenNameIdentifier	 security Enforcer
=	TokenNameEQUAL	
new	TokenNamenew	
ApplicationSecurityEnforcer	TokenNameIdentifier	 Application Security Enforcer
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
RASTERIZER_SECURITY_POLICY	TokenNameIdentifier	 RASTERIZER  SECURITY  POLICY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
securityEnforcer	TokenNameIdentifier	 security Enforcer
.	TokenNameDOT	
enforceSecurity	TokenNameIdentifier	 enforce Security
(	TokenNameLPAREN	
!	TokenNameNOT	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getSecurityOff	TokenNameIdentifier	 get Security Off
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expandedSources	TokenNameIdentifier	 expanded Sources
=	TokenNameEQUAL	
expandSources	TokenNameIdentifier	 expand Sources
(	TokenNameLPAREN	
sources	TokenNameIdentifier	 sources
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setSources	TokenNameIdentifier	 set Sources
(	TokenNameLPAREN	
expandedSources	TokenNameIdentifier	 expanded Sources
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validateConverterConfig	TokenNameIdentifier	 validate Converter Config
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expandedSources	TokenNameIdentifier	 expanded Sources
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
expandedSources	TokenNameIdentifier	 expanded Sources
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
USAGE	TokenNameIdentifier	 USAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
securityEnforcer	TokenNameIdentifier	 security Enforcer
.	TokenNameDOT	
enforceSecurity	TokenNameIdentifier	 enforce Security
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SVGConverterException	TokenNameIdentifier	 SVG Converter Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
ERROR_WHILE_CONVERTING_FILES	TokenNameIdentifier	 ERROR  WHILE  CONVERTING  FILES
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
securityEnforcer	TokenNameIdentifier	 security Enforcer
.	TokenNameDOT	
enforceSecurity	TokenNameIdentifier	 enforce Security
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Template methods which subclasses may implement to do whatever is * needed. For example, this can be used for test purposes. */	TokenNameCOMMENT_JAVADOC	 Template methods which subclasses may implement to do whatever is needed. For example, this can be used for test purposes. 
public	TokenNamepublic	
void	TokenNamevoid	
validateConverterConfig	TokenNameIdentifier	 validate Converter Config
(	TokenNameLPAREN	
SVGConverter	TokenNameIdentifier	 SVG Converter
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Scans the input vector and replaces directories with the list * of SVG files they contain */	TokenNameCOMMENT_JAVADOC	 Scans the input vector and replaces directories with the list of SVG files they contain 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expandSources	TokenNameIdentifier	 expand Sources
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
sources	TokenNameIdentifier	 sources
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
expandedSources	TokenNameIdentifier	 expanded Sources
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
isDirectory	TokenNameIdentifier	 is Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fl	TokenNameIdentifier	 fl
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
listFiles	TokenNameIdentifier	 list Files
(	TokenNameLPAREN	
new	TokenNamenew	
SVGConverter	TokenNameIdentifier	 SVG Converter
.	TokenNameDOT	
SVGFileFilter	TokenNameIdentifier	 SVG File Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
fl	TokenNameIdentifier	 fl
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expandedSources	TokenNameIdentifier	 expanded Sources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fl	TokenNameIdentifier	 fl
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
expandedSources	TokenNameIdentifier	 expanded Sources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
expandedSources	TokenNameIdentifier	 expanded Sources
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
expandedSources	TokenNameIdentifier	 expanded Sources
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
(	TokenNameLPAREN	
new	TokenNamenew	
Main	TokenNameIdentifier	 Main
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// SVGConverterController implementation 	TokenNameCOMMENT_LINE	SVGConverterController implementation 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MESSAGE_ABOUT_TO_TRANSCODE	TokenNameIdentifier	 MESSAGE  ABOUT  TO  TRANSCODE
=	TokenNameEQUAL	
"Main.message.about.to.transcode"	TokenNameStringLiteral	Main.message.about.to.transcode
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MESSAGE_ABOUT_TO_TRANSCODE_SOURCE	TokenNameIdentifier	 MESSAGE  ABOUT  TO  TRANSCODE  SOURCE
=	TokenNameEQUAL	
"Main.message.about.to.transcode.source"	TokenNameStringLiteral	Main.message.about.to.transcode.source
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MESSAGE_CONVERSION_FAILED	TokenNameIdentifier	 MESSAGE  CONVERSION  FAILED
=	TokenNameEQUAL	
"Main.message.conversion.failed"	TokenNameStringLiteral	Main.message.conversion.failed
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MESSAGE_CONVERSION_SUCCESS	TokenNameIdentifier	 MESSAGE  CONVERSION  SUCCESS
=	TokenNameEQUAL	
"Main.message.conversion.success"	TokenNameStringLiteral	Main.message.conversion.success
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
proceedWithComputedTask	TokenNameIdentifier	 proceed With Computed Task
(	TokenNameLPAREN	
Transcoder	TokenNameIdentifier	 Transcoder
transcoder	TokenNameIdentifier	 transcoder
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
hints	TokenNameIdentifier	 hints
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
sources	TokenNameIdentifier	 sources
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
MESSAGE_ABOUT_TO_TRANSCODE	TokenNameIdentifier	 MESSAGE  ABOUT  TO  TRANSCODE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
proceedWithSourceTranscoding	TokenNameIdentifier	 proceed With Source Transcoding
(	TokenNameLPAREN	
SVGConverterSource	TokenNameIdentifier	 SVG Converter Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
MESSAGE_ABOUT_TO_TRANSCODE_SOURCE	TokenNameIdentifier	 MESSAGE  ABOUT  TO  TRANSCODE  SOURCE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dest	TokenNameIdentifier	 dest
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
proceedOnSourceTranscodingFailure	TokenNameIdentifier	 proceed On Source Transcoding Failure
(	TokenNameLPAREN	
SVGConverterSource	TokenNameIdentifier	 SVG Converter Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
errorCode	TokenNameIdentifier	 error Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
MESSAGE_CONVERSION_FAILED	TokenNameIdentifier	 MESSAGE  CONVERSION  FAILED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
errorCode	TokenNameIdentifier	 error Code
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
onSourceTranscodingSuccess	TokenNameIdentifier	 on Source Transcoding Success
(	TokenNameLPAREN	
SVGConverterSource	TokenNameIdentifier	 SVG Converter Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
dest	TokenNameIdentifier	 dest
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
Messages	TokenNameIdentifier	 Messages
.	TokenNameDOT	
formatMessage	TokenNameIdentifier	 format Message
(	TokenNameLPAREN	
MESSAGE_CONVERSION_SUCCESS	TokenNameIdentifier	 MESSAGE  CONVERSION  SUCCESS
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
