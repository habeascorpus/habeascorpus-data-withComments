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
/** * This class implements the interface expected from a component * transfer function. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ConcreteComponentTransferFunction.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements the interface expected from a component transfer function. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ConcreteComponentTransferFunction.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
implements	TokenNameimplements	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
slope	TokenNameIdentifier	 slope
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tableValues	TokenNameIdentifier	 table Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
intercept	TokenNameIdentifier	 intercept
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
amplitude	TokenNameIdentifier	 amplitude
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
exponent	TokenNameIdentifier	 exponent
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
/** * Instances should be created through the various * factory methods. */	TokenNameCOMMENT_JAVADOC	 Instances should be created through the various factory methods. 
private	TokenNameprivate	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns an instance initialized as an identity * transfer function */	TokenNameCOMMENT_JAVADOC	 Returns an instance initialized as an identity transfer function 
public	TokenNamepublic	
static	TokenNamestatic	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
getIdentityTransfer	TokenNameIdentifier	 get Identity Transfer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
IDENTITY	TokenNameIdentifier	 IDENTITY
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a table transfer function */	TokenNameCOMMENT_JAVADOC	 Returns a table transfer function 
public	TokenNamepublic	
static	TokenNamestatic	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
getTableTransfer	TokenNameIdentifier	 get Table Transfer
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tableValues	TokenNameIdentifier	 table Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
TABLE	TokenNameIdentifier	 TABLE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tableValues	TokenNameIdentifier	 table Values
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
if	TokenNameif	
(	TokenNameLPAREN	
tableValues	TokenNameIdentifier	 table Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
tableValues	TokenNameIdentifier	 table Values
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
tableValues	TokenNameIdentifier	 table Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tableValues	TokenNameIdentifier	 table Values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
tableValues	TokenNameIdentifier	 table Values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tableValues	TokenNameIdentifier	 table Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a discrete transfer function */	TokenNameCOMMENT_JAVADOC	 Returns a discrete transfer function 
public	TokenNamepublic	
static	TokenNamestatic	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
getDiscreteTransfer	TokenNameIdentifier	 get Discrete Transfer
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tableValues	TokenNameIdentifier	 table Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
DISCRETE	TokenNameIdentifier	 DISCRETE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tableValues	TokenNameIdentifier	 table Values
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
if	TokenNameif	
(	TokenNameLPAREN	
tableValues	TokenNameIdentifier	 table Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
tableValues	TokenNameIdentifier	 table Values
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
tableValues	TokenNameIdentifier	 table Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tableValues	TokenNameIdentifier	 table Values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
tableValues	TokenNameIdentifier	 table Values
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tableValues	TokenNameIdentifier	 table Values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a linear transfer function */	TokenNameCOMMENT_JAVADOC	 Returns a linear transfer function 
public	TokenNamepublic	
static	TokenNamestatic	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
getLinearTransfer	TokenNameIdentifier	 get Linear Transfer
(	TokenNameLPAREN	
float	TokenNamefloat	
slope	TokenNameIdentifier	 slope
,	TokenNameCOMMA	
float	TokenNamefloat	
intercept	TokenNameIdentifier	 intercept
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
LINEAR	TokenNameIdentifier	 LINEAR
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
slope	TokenNameIdentifier	 slope
=	TokenNameEQUAL	
slope	TokenNameIdentifier	 slope
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
intercept	TokenNameIdentifier	 intercept
=	TokenNameEQUAL	
intercept	TokenNameIdentifier	 intercept
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a gamma function */	TokenNameCOMMENT_JAVADOC	 Returns a gamma function 
public	TokenNamepublic	
static	TokenNamestatic	
ComponentTransferFunction	TokenNameIdentifier	 Component Transfer Function
getGammaTransfer	TokenNameIdentifier	 get Gamma Transfer
(	TokenNameLPAREN	
float	TokenNamefloat	
amplitude	TokenNameIdentifier	 amplitude
,	TokenNameCOMMA	
float	TokenNamefloat	
exponent	TokenNameIdentifier	 exponent
,	TokenNameCOMMA	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
ConcreteComponentTransferFunction	TokenNameIdentifier	 Concrete Component Transfer Function
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
GAMMA	TokenNameIdentifier	 GAMMA
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
amplitude	TokenNameIdentifier	 amplitude
=	TokenNameEQUAL	
amplitude	TokenNameIdentifier	 amplitude
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
exponent	TokenNameIdentifier	 exponent
=	TokenNameEQUAL	
exponent	TokenNameIdentifier	 exponent
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the type of this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the type of this transfer function 
public	TokenNamepublic	
int	TokenNameint	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the slope value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the slope value for this transfer function 
public	TokenNamepublic	
float	TokenNamefloat	
getSlope	TokenNameIdentifier	 get Slope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
slope	TokenNameIdentifier	 slope
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the table values for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the table values for this transfer function 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTableValues	TokenNameIdentifier	 get Table Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tableValues	TokenNameIdentifier	 table Values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the intercept value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the intercept value for this transfer function 
public	TokenNamepublic	
float	TokenNamefloat	
getIntercept	TokenNameIdentifier	 get Intercept
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intercept	TokenNameIdentifier	 intercept
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the amplitude value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the amplitude value for this transfer function 
public	TokenNamepublic	
float	TokenNamefloat	
getAmplitude	TokenNameIdentifier	 get Amplitude
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
amplitude	TokenNameIdentifier	 amplitude
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the exponent value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the exponent value for this transfer function 
public	TokenNamepublic	
float	TokenNamefloat	
getExponent	TokenNameIdentifier	 get Exponent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exponent	TokenNameIdentifier	 exponent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the offset value for this transfer function */	TokenNameCOMMENT_JAVADOC	 Returns the offset value for this transfer function 
public	TokenNamepublic	
float	TokenNamefloat	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
