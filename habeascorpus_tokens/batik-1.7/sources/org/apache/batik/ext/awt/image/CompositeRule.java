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
;	TokenNameSEMICOLON	
/** * This is a typesafe enumeration of the standard Composite rules for * the CompositeRable operation. (over, in, out, atop, xor, arith) * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: CompositeRule.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is a typesafe enumeration of the standard Composite rules for the CompositeRable operation. (over, in, out, atop, xor, arith) * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: CompositeRule.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CompositeRule	TokenNameIdentifier	 Composite Rule
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** Porter-Duff src over rule, also used for feBlend <tt>normal</tt>. */	TokenNameCOMMENT_JAVADOC	 Porter-Duff src over rule, also used for feBlend <tt>normal</tt>. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_OVER	TokenNameIdentifier	 RULE  OVER
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Porter-Duff src in rule. */	TokenNameCOMMENT_JAVADOC	 Porter-Duff src in rule. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_IN	TokenNameIdentifier	 RULE  IN
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Porter-Duff src out rule. */	TokenNameCOMMENT_JAVADOC	 Porter-Duff src out rule. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_OUT	TokenNameIdentifier	 RULE  OUT
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Porter-Duff src atop rule. */	TokenNameCOMMENT_JAVADOC	 Porter-Duff src atop rule. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_ATOP	TokenNameIdentifier	 RULE  ATOP
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Porter-Duff src xor rule. */	TokenNameCOMMENT_JAVADOC	 Porter-Duff src xor rule. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_XOR	TokenNameIdentifier	 RULE  XOR
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Arithmatic rule 'out = k1*i1*i2 + k2*i1 + k3*i2 + k4'. */	TokenNameCOMMENT_JAVADOC	 Arithmatic rule 'out = k1*i1*i2 + k2*i1 + k3*i2 + k4'. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_ARITHMETIC	TokenNameIdentifier	 RULE  ARITHMETIC
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** SVG feBlend Multiply rule */	TokenNameCOMMENT_JAVADOC	 SVG feBlend Multiply rule 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_MULTIPLY	TokenNameIdentifier	 RULE  MULTIPLY
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** SVG feBlend Screen rule */	TokenNameCOMMENT_JAVADOC	 SVG feBlend Screen rule 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_SCREEN	TokenNameIdentifier	 RULE  SCREEN
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** SVG feBlend Darken rule */	TokenNameCOMMENT_JAVADOC	 SVG feBlend Darken rule 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_DARKEN	TokenNameIdentifier	 RULE  DARKEN
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** SVG feBlend Lighten rule */	TokenNameCOMMENT_JAVADOC	 SVG feBlend Lighten rule 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RULE_LIGHTEN	TokenNameIdentifier	 RULE  LIGHTEN
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Porter-Duff Source Over Destination rule. The source is * composited over the destination.<pre> * * Fs = 1 and Fd = (1-As), thus: * * Cd = Cs + Cd*(1-As) * Ad = As + Ad*(1-As)</pre> * </pre> */	TokenNameCOMMENT_JAVADOC	 Porter-Duff Source Over Destination rule. The source is composited over the destination.<pre> * Fs = 1 and Fd = (1-As), thus: * Cd = Cs + Cd*(1-As) Ad = As + Ad*(1-As)</pre> </pre> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CompositeRule	TokenNameIdentifier	 Composite Rule
OVER	TokenNameIdentifier	 OVER
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
RULE_OVER	TokenNameIdentifier	 RULE  OVER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Porter-Duff Source In Destination rule. The part of the * source lying inside of the destination replaces the destination.<pre> * * Fs = Ad and Fd = 0, thus: * * Cd = Cs*Ad * Ad = As*Ad * </pre> */	TokenNameCOMMENT_JAVADOC	 Porter-Duff Source In Destination rule. The part of the source lying inside of the destination replaces the destination.<pre> * Fs = Ad and Fd = 0, thus: * Cd = Cs*Ad Ad = As*Ad </pre> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CompositeRule	TokenNameIdentifier	 Composite Rule
IN	TokenNameIdentifier	 IN
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
RULE_IN	TokenNameIdentifier	 RULE  IN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Porter-Duff Source Out Destination rule. The part of the * source lying outside of the destination replaces the destination.<pre> * * Fs = (1-Ad) and Fd = 0, thus: * * Cd = Cs*(1-Ad) * Ad = As*(1-Ad) * </pre> */	TokenNameCOMMENT_JAVADOC	 Porter-Duff Source Out Destination rule. The part of the source lying outside of the destination replaces the destination.<pre> * Fs = (1-Ad) and Fd = 0, thus: * Cd = Cs*(1-Ad) Ad = As*(1-Ad) </pre> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CompositeRule	TokenNameIdentifier	 Composite Rule
OUT	TokenNameIdentifier	 OUT
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
RULE_OUT	TokenNameIdentifier	 RULE  OUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Porter-Duff Source Atop Destination rule. The part of the * source lying inside of the destination replaces the destination, * destination remains outside of source.<pre> * * Fs = Ad and Fd = (1-As), thus: * * Cd = Cs*Ad + Cd*(1-As) * Ad = As*Ad + Ad*(1-As) * </pre> */	TokenNameCOMMENT_JAVADOC	 Porter-Duff Source Atop Destination rule. The part of the source lying inside of the destination replaces the destination, destination remains outside of source.<pre> * Fs = Ad and Fd = (1-As), thus: * Cd = Cs*Ad + Cd*(1-As) Ad = As*Ad + Ad*(1-As) </pre> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CompositeRule	TokenNameIdentifier	 Composite Rule
ATOP	TokenNameIdentifier	 ATOP
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
RULE_ATOP	TokenNameIdentifier	 RULE  ATOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Xor rule. The source and destination are Xor'ed togeather.<pre> * * Fs = (1-Ad) and Fd = (1-As), thus: * * Cd = Cs*(1-Ad) + Cd*(1-As) * Ad = As*(1-Ad) + Ad*(1-As) * </pre> */	TokenNameCOMMENT_JAVADOC	 Xor rule. The source and destination are Xor'ed togeather.<pre> * Fs = (1-Ad) and Fd = (1-As), thus: * Cd = Cs*(1-Ad) + Cd*(1-As) Ad = As*(1-Ad) + Ad*(1-As) </pre> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CompositeRule	TokenNameIdentifier	 Composite Rule
XOR	TokenNameIdentifier	 XOR
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
RULE_XOR	TokenNameIdentifier	 RULE  XOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Factory to create artithmatic CompositeRules. * 'out = k1*i1*i2 + k2*i1 + k3*i2 + k4' * Note that arithmatic CompositeRules are not singletons. */	TokenNameCOMMENT_JAVADOC	 Factory to create artithmatic CompositeRules. 'out = k1*i1*i2 + k2*i1 + k3*i2 + k4' Note that arithmatic CompositeRules are not singletons. 
public	TokenNamepublic	
static	TokenNamestatic	
CompositeRule	TokenNameIdentifier	 Composite Rule
ARITHMETIC	TokenNameIdentifier	 ARITHMETIC
(	TokenNameLPAREN	
float	TokenNamefloat	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
float	TokenNamefloat	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
float	TokenNamefloat	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
float	TokenNamefloat	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * FeBlend Multiply rule. <pre> * * Cd = Cs*(1-Ad) + Cd*(1-As) + Cs*Cd * Ad = 1 - (1-Ad)*(1-As) * </pre> */	TokenNameCOMMENT_JAVADOC	 FeBlend Multiply rule. <pre> * Cd = Cs*(1-Ad) + Cd*(1-As) + Cs*Cd Ad = 1 - (1-Ad)*(1-As) </pre> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CompositeRule	TokenNameIdentifier	 Composite Rule
MULTIPLY	TokenNameIdentifier	 MULTIPLY
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
RULE_MULTIPLY	TokenNameIdentifier	 RULE  MULTIPLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * FeBlend Screen rule. <pre> * * Cd = Cs + Cd - Cs*Cd * Ad = 1 - (1-Ad)*(1-As) * </pre> */	TokenNameCOMMENT_JAVADOC	 FeBlend Screen rule. <pre> * Cd = Cs + Cd - Cs*Cd Ad = 1 - (1-Ad)*(1-As) </pre> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CompositeRule	TokenNameIdentifier	 Composite Rule
SCREEN	TokenNameIdentifier	 SCREEN
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
RULE_SCREEN	TokenNameIdentifier	 RULE  SCREEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * FeBlend Darken rule. <pre> * * Cd = Min(Cs*(1-Ad) + Cd, * Cd*(1-As) + Cs) * Ad = 1 - (1-Ad)*(1-As) * </pre> */	TokenNameCOMMENT_JAVADOC	 FeBlend Darken rule. <pre> * Cd = Min(Cs*(1-Ad) + Cd, Cd*(1-As) + Cs) Ad = 1 - (1-Ad)*(1-As) </pre> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CompositeRule	TokenNameIdentifier	 Composite Rule
DARKEN	TokenNameIdentifier	 DARKEN
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
RULE_DARKEN	TokenNameIdentifier	 RULE  DARKEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * FeBlend Lighten rule. <pre> * * Cd = Max(Cs*(1-Ad) + Cd, * Cd*(1-As) + Cs) * Ad = 1 - (1-Ad)*(1-As) * </pre> */	TokenNameCOMMENT_JAVADOC	 FeBlend Lighten rule. <pre> * Cd = Max(Cs*(1-Ad) + Cd, Cd*(1-As) + Cs) Ad = 1 - (1-Ad)*(1-As) </pre> 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
CompositeRule	TokenNameIdentifier	 Composite Rule
LIGHTEN	TokenNameIdentifier	 LIGHTEN
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
RULE_LIGHTEN	TokenNameIdentifier	 RULE  LIGHTEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the type of this composite rule */	TokenNameCOMMENT_JAVADOC	 Returns the type of this composite rule 
public	TokenNamepublic	
int	TokenNameint	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rule	TokenNameIdentifier	 rule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The composite rule for this object. */	TokenNameCOMMENT_JAVADOC	 The composite rule for this object. 
private	TokenNameprivate	
int	TokenNameint	
rule	TokenNameIdentifier	 rule
;	TokenNameSEMICOLON	
/* Arithmatic constants, only used for RULE_ARITHMETIC */	TokenNameCOMMENT_BLOCK	 Arithmatic constants, only used for RULE_ARITHMETIC 
private	TokenNameprivate	
float	TokenNamefloat	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
k4	TokenNameIdentifier	 k4
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
int	TokenNameint	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rule	TokenNameIdentifier	 rule
=	TokenNameEQUAL	
rule	TokenNameIdentifier	 rule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CompositeRule	TokenNameIdentifier	 Composite Rule
(	TokenNameLPAREN	
float	TokenNamefloat	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
float	TokenNamefloat	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
float	TokenNamefloat	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
float	TokenNamefloat	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rule	TokenNameIdentifier	 rule
=	TokenNameEQUAL	
RULE_ARITHMETIC	TokenNameIdentifier	 RULE  ARITHMETIC
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
k1	TokenNameIdentifier	 k1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k3	TokenNameIdentifier	 k3
=	TokenNameEQUAL	
k3	TokenNameIdentifier	 k3
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k4	TokenNameIdentifier	 k4
=	TokenNameEQUAL	
k4	TokenNameIdentifier	 k4
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCoefficients	TokenNameIdentifier	 get Coefficients
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
!=	TokenNameNOT_EQUAL	
RULE_ARITHMETIC	TokenNameIdentifier	 RULE  ARITHMETIC
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
k4	TokenNameIdentifier	 k4
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is called by the serialization code before it returns * an unserialized object. To provide for unicity of * instances, the instance that was read is replaced by its * static equivalent. See the serialiazation specification for * further details on this method's logic. */	TokenNameCOMMENT_JAVADOC	 This is called by the serialization code before it returns an unserialized object. To provide for unicity of instances, the instance that was read is replaced by its static equivalent. See the serialiazation specification for further details on this method's logic. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
readResolve	TokenNameIdentifier	 read Resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectStreamException	TokenNameIdentifier	 Object Stream Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
RULE_OVER	TokenNameIdentifier	 RULE  OVER
:	TokenNameCOLON	
return	TokenNamereturn	
OVER	TokenNameIdentifier	 OVER
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_IN	TokenNameIdentifier	 RULE  IN
:	TokenNameCOLON	
return	TokenNamereturn	
IN	TokenNameIdentifier	 IN
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_OUT	TokenNameIdentifier	 RULE  OUT
:	TokenNameCOLON	
return	TokenNamereturn	
OUT	TokenNameIdentifier	 OUT
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_ATOP	TokenNameIdentifier	 RULE  ATOP
:	TokenNameCOLON	
return	TokenNamereturn	
ATOP	TokenNameIdentifier	 ATOP
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_XOR	TokenNameIdentifier	 RULE  XOR
:	TokenNameCOLON	
return	TokenNamereturn	
XOR	TokenNameIdentifier	 XOR
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_ARITHMETIC	TokenNameIdentifier	 RULE  ARITHMETIC
:	TokenNameCOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_MULTIPLY	TokenNameIdentifier	 RULE  MULTIPLY
:	TokenNameCOLON	
return	TokenNamereturn	
MULTIPLY	TokenNameIdentifier	 MULTIPLY
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_SCREEN	TokenNameIdentifier	 RULE  SCREEN
:	TokenNameCOLON	
return	TokenNamereturn	
SCREEN	TokenNameIdentifier	 SCREEN
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_DARKEN	TokenNameIdentifier	 RULE  DARKEN
:	TokenNameCOLON	
return	TokenNamereturn	
DARKEN	TokenNameIdentifier	 DARKEN
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_LIGHTEN	TokenNameIdentifier	 RULE  LIGHTEN
:	TokenNameCOLON	
return	TokenNamereturn	
LIGHTEN	TokenNameIdentifier	 LIGHTEN
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Unknown Composite Rule type"	TokenNameStringLiteral	Unknown Composite Rule type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This is called by the serialization code before it returns * an unserialized object. To provide for unicity of * instances, the instance that was read is replaced by its * static equivalent. See the serialiazation specification for * further details on this method's logic. */	TokenNameCOMMENT_JAVADOC	 This is called by the serialization code before it returns an unserialized object. To provide for unicity of instances, the instance that was read is replaced by its static equivalent. See the serialiazation specification for further details on this method's logic. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
RULE_OVER	TokenNameIdentifier	 RULE  OVER
:	TokenNameCOLON	
return	TokenNamereturn	
"[CompositeRule: OVER]"	TokenNameStringLiteral	[CompositeRule: OVER]
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_IN	TokenNameIdentifier	 RULE  IN
:	TokenNameCOLON	
return	TokenNamereturn	
"[CompositeRule: IN]"	TokenNameStringLiteral	[CompositeRule: IN]
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_OUT	TokenNameIdentifier	 RULE  OUT
:	TokenNameCOLON	
return	TokenNamereturn	
"[CompositeRule: OUT]"	TokenNameStringLiteral	[CompositeRule: OUT]
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_ATOP	TokenNameIdentifier	 RULE  ATOP
:	TokenNameCOLON	
return	TokenNamereturn	
"[CompositeRule: ATOP]"	TokenNameStringLiteral	[CompositeRule: ATOP]
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_XOR	TokenNameIdentifier	 RULE  XOR
:	TokenNameCOLON	
return	TokenNamereturn	
"[CompositeRule: XOR]"	TokenNameStringLiteral	[CompositeRule: XOR]
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_ARITHMETIC	TokenNameIdentifier	 RULE  ARITHMETIC
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
"[CompositeRule: ARITHMATIC k1:"	TokenNameStringLiteral	[CompositeRule: ARITHMATIC k1:
+	TokenNamePLUS	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
" k2: "	TokenNameStringLiteral	 k2: 
+	TokenNamePLUS	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
" k3: "	TokenNameStringLiteral	 k3: 
+	TokenNamePLUS	
k3	TokenNameIdentifier	 k3
+	TokenNamePLUS	
" k4: "	TokenNameStringLiteral	 k4: 
+	TokenNamePLUS	
k4	TokenNameIdentifier	 k4
+	TokenNamePLUS	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_MULTIPLY	TokenNameIdentifier	 RULE  MULTIPLY
:	TokenNameCOLON	
return	TokenNamereturn	
"[CompositeRule: MULTIPLY]"	TokenNameStringLiteral	[CompositeRule: MULTIPLY]
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_SCREEN	TokenNameIdentifier	 RULE  SCREEN
:	TokenNameCOLON	
return	TokenNamereturn	
"[CompositeRule: SCREEN]"	TokenNameStringLiteral	[CompositeRule: SCREEN]
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_DARKEN	TokenNameIdentifier	 RULE  DARKEN
:	TokenNameCOLON	
return	TokenNamereturn	
"[CompositeRule: DARKEN]"	TokenNameStringLiteral	[CompositeRule: DARKEN]
;	TokenNameSEMICOLON	
case	TokenNamecase	
RULE_LIGHTEN	TokenNameIdentifier	 RULE  LIGHTEN
:	TokenNameCOLON	
return	TokenNamereturn	
"[CompositeRule: LIGHTEN]"	TokenNameStringLiteral	[CompositeRule: LIGHTEN]
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"Unknown Composite Rule type"	TokenNameStringLiteral	Unknown Composite Rule type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
