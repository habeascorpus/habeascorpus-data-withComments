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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationTarget	TokenNameIdentifier	 Animation Target
;	TokenNameSEMICOLON	
/** * Stores information about a specific XML attribute or CSS property. * * @version $Id: TraitInformation.java 582434 2007-10-06 02:11:51Z cam $ */	TokenNameCOMMENT_JAVADOC	 Stores information about a specific XML attribute or CSS property. * @version $Id: TraitInformation.java 582434 2007-10-06 02:11:51Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TraitInformation	TokenNameIdentifier	 Trait Information
{	TokenNameLBRACE	
// Constants for percentage interpretation. 	TokenNameCOMMENT_LINE	Constants for percentage interpretation. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PERCENTAGE_FONT_SIZE	TokenNameIdentifier	 PERCENTAGE  FONT  SIZE
=	TokenNameEQUAL	
AnimationTarget	TokenNameIdentifier	 Animation Target
.	TokenNameDOT	
PERCENTAGE_FONT_SIZE	TokenNameIdentifier	 PERCENTAGE  FONT  SIZE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  WIDTH
=	TokenNameEQUAL	
AnimationTarget	TokenNameIdentifier	 Animation Target
.	TokenNameDOT	
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  WIDTH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  HEIGHT
=	TokenNameEQUAL	
AnimationTarget	TokenNameIdentifier	 Animation Target
.	TokenNameDOT	
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  HEIGHT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PERCENTAGE_VIEWPORT_SIZE	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  SIZE
=	TokenNameEQUAL	
AnimationTarget	TokenNameIdentifier	 Animation Target
.	TokenNameDOT	
PERCENTAGE_VIEWPORT_SIZE	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  SIZE
;	TokenNameSEMICOLON	
/** * Whether this trait can be animated. */	TokenNameCOMMENT_JAVADOC	 Whether this trait can be animated. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isAnimatable	TokenNameIdentifier	 is Animatable
;	TokenNameSEMICOLON	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Whether animations of this trait can be additive. 	TokenNameCOMMENT_LINE	* Whether animations of this trait can be additive. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected boolean isAdditive; 	TokenNameCOMMENT_LINE	protected boolean isAdditive; 
/** * The SVG type of this trait. */	TokenNameCOMMENT_JAVADOC	 The SVG type of this trait. 
protected	TokenNameprotected	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
/** * What percentages in this trait are relative to. */	TokenNameCOMMENT_JAVADOC	 What percentages in this trait are relative to. 
protected	TokenNameprotected	
short	TokenNameshort	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
;	TokenNameSEMICOLON	
/** * Creates a new TraitInformation object. */	TokenNameCOMMENT_JAVADOC	 Creates a new TraitInformation object. 
public	TokenNamepublic	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isAnimatable	TokenNameIdentifier	 is Animatable
,	TokenNameCOMMA	
// boolean isAdditive, 	TokenNameCOMMENT_LINE	boolean isAdditive, 
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
short	TokenNameshort	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isAnimatable	TokenNameIdentifier	 is Animatable
=	TokenNameEQUAL	
isAnimatable	TokenNameIdentifier	 is Animatable
;	TokenNameSEMICOLON	
// this.isAdditive = isAdditive; 	TokenNameCOMMENT_LINE	this.isAdditive = isAdditive; 
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
=	TokenNameEQUAL	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new TraitInformation object. */	TokenNameCOMMENT_JAVADOC	 Creates a new TraitInformation object. 
public	TokenNamepublic	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isAnimatable	TokenNameIdentifier	 is Animatable
,	TokenNameCOMMA	
// boolean isAdditive, 	TokenNameCOMMENT_LINE	boolean isAdditive, 
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isAnimatable	TokenNameIdentifier	 is Animatable
=	TokenNameEQUAL	
isAnimatable	TokenNameIdentifier	 is Animatable
;	TokenNameSEMICOLON	
// this.isAdditive = isAdditive; 	TokenNameCOMMENT_LINE	this.isAdditive = isAdditive; 
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether this trait is animatable. */	TokenNameCOMMENT_JAVADOC	 Returns whether this trait is animatable. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAnimatable	TokenNameIdentifier	 is Animatable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isAnimatable	TokenNameIdentifier	 is Animatable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns whether animations of this trait can be additive. 	TokenNameCOMMENT_LINE	* Returns whether animations of this trait can be additive. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public boolean isAdditive() { 	TokenNameCOMMENT_LINE	public boolean isAdditive() { 
// return isAdditive; 	TokenNameCOMMENT_LINE	return isAdditive; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Returns the SVG type of this trait. */	TokenNameCOMMENT_JAVADOC	 Returns the SVG type of this trait. 
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
/** * Returns how percentage values in this trait are resolved. */	TokenNameCOMMENT_JAVADOC	 Returns how percentage values in this trait are resolved. 
public	TokenNamepublic	
short	TokenNameshort	
getPercentageInterpretation	TokenNameIdentifier	 get Percentage Interpretation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
percentageInterpretation	TokenNameIdentifier	 percentage Interpretation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
