/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Adjustable	TokenNameIdentifier	 Adjustable
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JComponent	TokenNameIdentifier	 J Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTable	TokenNameIdentifier	 J Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
SwingUtilities	TokenNameIdentifier	 Swing Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
TableModel	TokenNameIdentifier	 Table Model
;	TokenNameSEMICOLON	
/** * Provides methods to accomplish common yet non-trivial tasks * with Swing. Obvious implementations of these methods have been * tried and failed. * * @author Richard Wan */	TokenNameCOMMENT_JAVADOC	 Provides methods to accomplish common yet non-trivial tasks with Swing. Obvious implementations of these methods have been tried and failed. * @author Richard Wan 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
LF5SwingUtils	TokenNameIdentifier	 L F5 Swing Utils
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Selects a the specified row in the specified JTable and scrolls * the specified JScrollpane to the newly selected row. More importantly, * the call to repaint() delayed long enough to have the table * properly paint the newly selected row which may be offscre * @param table should belong to the specified JScrollPane */	TokenNameCOMMENT_JAVADOC	 Selects a the specified row in the specified JTable and scrolls the specified JScrollpane to the newly selected row. More importantly, the call to repaint() delayed long enough to have the table properly paint the newly selected row which may be offscre @param table should belong to the specified JScrollPane 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
selectRow	TokenNameIdentifier	 select Row
(	TokenNameLPAREN	
int	TokenNameint	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
JTable	TokenNameIdentifier	 J Table
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
pane	TokenNameIdentifier	 pane
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
pane	TokenNameIdentifier	 pane
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
moveAdjustable	TokenNameIdentifier	 move Adjustable
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
*	TokenNameMULTIPLY	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
getRowHeight	TokenNameIdentifier	 get Row Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pane	TokenNameIdentifier	 pane
.	TokenNameDOT	
getVerticalScrollBar	TokenNameIdentifier	 get Vertical Scroll Bar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectRow	TokenNameIdentifier	 select Row
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
getSelectionModel	TokenNameIdentifier	 get Selection Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// repaint must be done later because moveAdjustable 	TokenNameCOMMENT_LINE	repaint must be done later because moveAdjustable 
// posts requests to the swing thread which must execute before 	TokenNameCOMMENT_LINE	posts requests to the swing thread which must execute before 
// the repaint logic gets executed. 	TokenNameCOMMENT_LINE	the repaint logic gets executed. 
repaintLater	TokenNameIdentifier	 repaint Later
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Makes the specified Adjustable track if the view area expands and * the specified Adjustable is located near the of the view. */	TokenNameCOMMENT_JAVADOC	 Makes the specified Adjustable track if the view area expands and the specified Adjustable is located near the of the view. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
makeScrollBarTrack	TokenNameIdentifier	 make Scroll Bar Track
(	TokenNameLPAREN	
Adjustable	TokenNameIdentifier	 Adjustable
scrollBar	TokenNameIdentifier	 scroll Bar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scrollBar	TokenNameIdentifier	 scroll Bar
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scrollBar	TokenNameIdentifier	 scroll Bar
.	TokenNameDOT	
addAdjustmentListener	TokenNameIdentifier	 add Adjustment Listener
(	TokenNameLPAREN	
new	TokenNamenew	
TrackingAdjustmentListener	TokenNameIdentifier	 Tracking Adjustment Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Makes the vertical scroll bar of the specified JScrollPane * track if the view expands (e.g. if rows are added to an underlying * table). */	TokenNameCOMMENT_JAVADOC	 Makes the vertical scroll bar of the specified JScrollPane track if the view expands (e.g. if rows are added to an underlying table). 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
makeVerticalScrollBarTrack	TokenNameIdentifier	 make Vertical Scroll Bar Track
(	TokenNameLPAREN	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
pane	TokenNameIdentifier	 pane
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pane	TokenNameIdentifier	 pane
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
makeScrollBarTrack	TokenNameIdentifier	 make Scroll Bar Track
(	TokenNameLPAREN	
pane	TokenNameIdentifier	 pane
.	TokenNameDOT	
getVerticalScrollBar	TokenNameIdentifier	 get Vertical Scroll Bar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
TableModel	TokenNameIdentifier	 Table Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
>=	TokenNameGREATER_EQUAL	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
getRowCount	TokenNameIdentifier	 get Row Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
selectRow	TokenNameIdentifier	 select Row
(	TokenNameLPAREN	
int	TokenNameint	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
setSelectionInterval	TokenNameIdentifier	 set Selection Interval
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
moveAdjustable	TokenNameIdentifier	 move Adjustable
(	TokenNameLPAREN	
int	TokenNameint	
location	TokenNameIdentifier	 location
,	TokenNameCOMMA	
Adjustable	TokenNameIdentifier	 Adjustable
scrollBar	TokenNameIdentifier	 scroll Bar
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scrollBar	TokenNameIdentifier	 scroll Bar
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scrollBar	TokenNameIdentifier	 scroll Bar
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Work around for JTable/viewport bug. * @link http://developer.java.sun.com/developer/bugParade/bugs/4205145.html */	TokenNameCOMMENT_JAVADOC	 Work around for JTable/viewport bug. @link http://developer.java.sun.com/developer/bugParade/bugs/4205145.html 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
repaintLater	TokenNameIdentifier	 repaint Later
(	TokenNameLPAREN	
final	TokenNamefinal	
JComponent	TokenNameIdentifier	 J Component
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SwingUtilities	TokenNameIdentifier	 Swing Utilities
.	TokenNameDOT	
invokeLater	TokenNameIdentifier	 invoke Later
(	TokenNameLPAREN	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
repaint	TokenNameIdentifier	 repaint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
