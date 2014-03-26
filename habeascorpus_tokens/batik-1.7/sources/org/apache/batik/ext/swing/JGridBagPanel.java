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
swing	TokenNameIdentifier	 swing
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Insets	TokenNameIdentifier	 Insets
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
LayoutManager	TokenNameIdentifier	 Layout Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JPanel	TokenNameIdentifier	 J Panel
;	TokenNameSEMICOLON	
/** * An implementation of JPanel that uses the GridBagLayout. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: JGridBagPanel.java 479559 2006-11-27 09:46:16Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An implementation of JPanel that uses the GridBagLayout. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: JGridBagPanel.java 479559 2006-11-27 09:46:16Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
JGridBagPanel	TokenNameIdentifier	 J Grid Bag Panel
extends	TokenNameextends	
JPanel	TokenNameIdentifier	 J Panel
implements	TokenNameimplements	
GridBagConstants	TokenNameIdentifier	 Grid Bag Constants
{	TokenNameLBRACE	
/** * Provides insets desired for a given grid cell */	TokenNameCOMMENT_JAVADOC	 Provides insets desired for a given grid cell 
public	TokenNamepublic	
static	TokenNamestatic	
interface	TokenNameinterface	
InsetsManager	TokenNameIdentifier	 Insets Manager
{	TokenNameLBRACE	
/** * Returns the insets for cell (gridx, gridy); */	TokenNameCOMMENT_JAVADOC	 Returns the insets for cell (gridx, gridy); 
Insets	TokenNameIdentifier	 Insets
getInsets	TokenNameIdentifier	 get Insets
(	TokenNameLPAREN	
int	TokenNameint	
gridx	TokenNameIdentifier	 gridx
,	TokenNameCOMMA	
int	TokenNameint	
gridy	TokenNameIdentifier	 gridy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Always use 0 insets */	TokenNameCOMMENT_JAVADOC	 Always use 0 insets 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ZeroInsetsManager	TokenNameIdentifier	 Zero Insets Manager
implements	TokenNameimplements	
InsetsManager	TokenNameIdentifier	 Insets Manager
{	TokenNameLBRACE	
private	TokenNameprivate	
Insets	TokenNameIdentifier	 Insets
insets	TokenNameIdentifier	 insets
=	TokenNameEQUAL	
new	TokenNamenew	
Insets	TokenNameIdentifier	 Insets
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Insets	TokenNameIdentifier	 Insets
getInsets	TokenNameIdentifier	 get Insets
(	TokenNameLPAREN	
int	TokenNameint	
gridx	TokenNameIdentifier	 gridx
,	TokenNameCOMMA	
int	TokenNameint	
gridy	TokenNameIdentifier	 gridy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
insets	TokenNameIdentifier	 insets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Default implemenation */	TokenNameCOMMENT_JAVADOC	 Default implemenation 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
DefaultInsetsManager	TokenNameIdentifier	 Default Insets Manager
implements	TokenNameimplements	
InsetsManager	TokenNameIdentifier	 Insets Manager
{	TokenNameLBRACE	
/** * leftInset is the space used by default as a padding to the * left of each grid cell. */	TokenNameCOMMENT_JAVADOC	 leftInset is the space used by default as a padding to the left of each grid cell. 
int	TokenNameint	
leftInset	TokenNameIdentifier	 left Inset
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * topInset is the space used by default as a padding to the * top of each grid cell. */	TokenNameCOMMENT_JAVADOC	 topInset is the space used by default as a padding to the top of each grid cell. 
int	TokenNameint	
topInset	TokenNameIdentifier	 top Inset
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Insets	TokenNameIdentifier	 Insets
positiveInsets	TokenNameIdentifier	 positive Insets
=	TokenNameEQUAL	
new	TokenNamenew	
Insets	TokenNameIdentifier	 Insets
(	TokenNameLPAREN	
topInset	TokenNameIdentifier	 top Inset
,	TokenNameCOMMA	
leftInset	TokenNameIdentifier	 left Inset
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Insets	TokenNameIdentifier	 Insets
leftInsets	TokenNameIdentifier	 left Insets
=	TokenNameEQUAL	
new	TokenNamenew	
Insets	TokenNameIdentifier	 Insets
(	TokenNameLPAREN	
topInset	TokenNameIdentifier	 top Inset
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Insets	TokenNameIdentifier	 Insets
topInsets	TokenNameIdentifier	 top Insets
=	TokenNameEQUAL	
new	TokenNamenew	
Insets	TokenNameIdentifier	 Insets
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
leftInset	TokenNameIdentifier	 left Inset
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Insets	TokenNameIdentifier	 Insets
topLeftInsets	TokenNameIdentifier	 top Left Insets
=	TokenNameEQUAL	
new	TokenNamenew	
Insets	TokenNameIdentifier	 Insets
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Insets	TokenNameIdentifier	 Insets
getInsets	TokenNameIdentifier	 get Insets
(	TokenNameLPAREN	
int	TokenNameint	
gridx	TokenNameIdentifier	 gridx
,	TokenNameCOMMA	
int	TokenNameint	
gridy	TokenNameIdentifier	 gridy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gridx	TokenNameIdentifier	 gridx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gridy	TokenNameIdentifier	 gridy
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
positiveInsets	TokenNameIdentifier	 positive Insets
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
topInsets	TokenNameIdentifier	 top Insets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gridy	TokenNameIdentifier	 gridy
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
leftInsets	TokenNameIdentifier	 left Insets
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
topLeftInsets	TokenNameIdentifier	 top Left Insets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An InsetsManager that uses zero insets */	TokenNameCOMMENT_JAVADOC	 An InsetsManager that uses zero insets 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
InsetsManager	TokenNameIdentifier	 Insets Manager
ZERO_INSETS	TokenNameIdentifier	 ZERO  INSETS
=	TokenNameEQUAL	
new	TokenNamenew	
ZeroInsetsManager	TokenNameIdentifier	 Zero Insets Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * An InsetsManager that uses padding for inside cells */	TokenNameCOMMENT_JAVADOC	 An InsetsManager that uses padding for inside cells 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
InsetsManager	TokenNameIdentifier	 Insets Manager
DEFAULT_INSETS	TokenNameIdentifier	 DEFAULT  INSETS
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultInsetsManager	TokenNameIdentifier	 Default Insets Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to get insets at any given cell location */	TokenNameCOMMENT_JAVADOC	 Used to get insets at any given cell location 
public	TokenNamepublic	
InsetsManager	TokenNameIdentifier	 Insets Manager
insetsManager	TokenNameIdentifier	 insets Manager
;	TokenNameSEMICOLON	
/** * Sets the layout manager to GridBagLayout */	TokenNameCOMMENT_JAVADOC	 Sets the layout manager to GridBagLayout 
public	TokenNamepublic	
JGridBagPanel	TokenNameIdentifier	 J Grid Bag Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
DefaultInsetsManager	TokenNameIdentifier	 Default Insets Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes panel with a given insets manager */	TokenNameCOMMENT_JAVADOC	 Initializes panel with a given insets manager 
public	TokenNamepublic	
JGridBagPanel	TokenNameIdentifier	 J Grid Bag Panel
(	TokenNameLPAREN	
InsetsManager	TokenNameIdentifier	 Insets Manager
insetsManager	TokenNameIdentifier	 insets Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
insetsManager	TokenNameIdentifier	 insets Manager
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
insetsManager	TokenNameIdentifier	 insets Manager
=	TokenNameEQUAL	
insetsManager	TokenNameIdentifier	 insets Manager
;	TokenNameSEMICOLON	
else	TokenNameelse	
this	TokenNamethis	
.	TokenNameDOT	
insetsManager	TokenNameIdentifier	 insets Manager
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultInsetsManager	TokenNameIdentifier	 Default Insets Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method only takes effect if the LayoutManager is a GridBagLayout */	TokenNameCOMMENT_JAVADOC	 This method only takes effect if the LayoutManager is a GridBagLayout 
public	TokenNamepublic	
void	TokenNamevoid	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
LayoutManager	TokenNameIdentifier	 Layout Manager
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
instanceof	TokenNameinstanceof	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This version uses default insets and assumes that components are added in * positive cell coordinates. Top inset for components added to the top * is 0. Left inset for components added to the left is 0. For compoents at * index gridx more than zero and index gridy more than zero, the insets * are set to a default value. * * @param cmp Component to add to the panel * @param gridx x position of the cell into which component should be added * @param gridy y position of the cell into which component should be added * @param gridwidth width, in cells, of the space occupied by the component in the grid * @param gridheight height, in cells, of the space occupied by the component in the grid * @param anchor placement of the component in its allocated space: WEST, NORTH, SOUTH, NORTHWEST, ... * @param fill out should the component be resized within its space? NONE, BOTH, HORIZONTAL, VERTICAL. * @param weightx what amount of extra horizontal space, if any, should be given to this component? * @param weighty what amount of extra vertical space, if any, should be given to this component? */	TokenNameCOMMENT_JAVADOC	 This version uses default insets and assumes that components are added in positive cell coordinates. Top inset for components added to the top is 0. Left inset for components added to the left is 0. For compoents at index gridx more than zero and index gridy more than zero, the insets are set to a default value. * @param cmp Component to add to the panel @param gridx x position of the cell into which component should be added @param gridy y position of the cell into which component should be added @param gridwidth width, in cells, of the space occupied by the component in the grid @param gridheight height, in cells, of the space occupied by the component in the grid @param anchor placement of the component in its allocated space: WEST, NORTH, SOUTH, NORTHWEST, ... @param fill out should the component be resized within its space? NONE, BOTH, HORIZONTAL, VERTICAL. @param weightx what amount of extra horizontal space, if any, should be given to this component? @param weighty what amount of extra vertical space, if any, should be given to this component? 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
int	TokenNameint	
gridx	TokenNameIdentifier	 gridx
,	TokenNameCOMMA	
int	TokenNameint	
gridy	TokenNameIdentifier	 gridy
,	TokenNameCOMMA	
int	TokenNameint	
gridwidth	TokenNameIdentifier	 gridwidth
,	TokenNameCOMMA	
int	TokenNameint	
gridheight	TokenNameIdentifier	 gridheight
,	TokenNameCOMMA	
int	TokenNameint	
anchor	TokenNameIdentifier	 anchor
,	TokenNameCOMMA	
int	TokenNameint	
fill	TokenNameIdentifier	 fill
,	TokenNameCOMMA	
double	TokenNamedouble	
weightx	TokenNameIdentifier	 weightx
,	TokenNameCOMMA	
double	TokenNamedouble	
weighty	TokenNameIdentifier	 weighty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Insets	TokenNameIdentifier	 Insets
insets	TokenNameIdentifier	 insets
=	TokenNameEQUAL	
insetsManager	TokenNameIdentifier	 insets Manager
.	TokenNameDOT	
getInsets	TokenNameIdentifier	 get Insets
(	TokenNameLPAREN	
gridx	TokenNameIdentifier	 gridx
,	TokenNameCOMMA	
gridy	TokenNameIdentifier	 gridy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
constraints	TokenNameIdentifier	 constraints
=	TokenNameEQUAL	
new	TokenNamenew	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
gridx	TokenNameIdentifier	 gridx
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
gridy	TokenNameIdentifier	 gridy
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
gridwidth	TokenNameIdentifier	 gridwidth
=	TokenNameEQUAL	
gridwidth	TokenNameIdentifier	 gridwidth
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
gridheight	TokenNameIdentifier	 gridheight
=	TokenNameEQUAL	
gridheight	TokenNameIdentifier	 gridheight
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
anchor	TokenNameIdentifier	 anchor
=	TokenNameEQUAL	
anchor	TokenNameIdentifier	 anchor
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
fill	TokenNameIdentifier	 fill
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
weightx	TokenNameIdentifier	 weightx
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
weighty	TokenNameIdentifier	 weighty
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
insets	TokenNameIdentifier	 insets
=	TokenNameEQUAL	
insets	TokenNameIdentifier	 insets
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
constraints	TokenNameIdentifier	 constraints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
