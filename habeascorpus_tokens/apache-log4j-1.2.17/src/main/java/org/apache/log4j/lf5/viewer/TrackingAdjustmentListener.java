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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
AdjustmentEvent	TokenNameIdentifier	 Adjustment Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
AdjustmentListener	TokenNameIdentifier	 Adjustment Listener
;	TokenNameSEMICOLON	
/** * An AdjustmentListener which ensures that an Adjustable (e.g. a Scrollbar) * will "track" when the Adjustable expands. * For example, when a vertical scroll bar is at its bottom anchor, * the scrollbar will remain at the bottom. When the vertical scroll bar * is at any other location, then no tracking will happen. * An instance of this class should only listen to one Adjustable as * it retains state information about the Adjustable it listens to. * * @author Richard Wan */	TokenNameCOMMENT_JAVADOC	 An AdjustmentListener which ensures that an Adjustable (e.g. a Scrollbar) will "track" when the Adjustable expands. For example, when a vertical scroll bar is at its bottom anchor, the scrollbar will remain at the bottom. When the vertical scroll bar is at any other location, then no tracking will happen. An instance of this class should only listen to one Adjustable as it retains state information about the Adjustable it listens to. * @author Richard Wan 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
TrackingAdjustmentListener	TokenNameIdentifier	 Tracking Adjustment Listener
implements	TokenNameimplements	
AdjustmentListener	TokenNameIdentifier	 Adjustment Listener
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
int	TokenNameint	
_lastMaximum	TokenNameIdentifier	 last Maximum
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
void	TokenNamevoid	
adjustmentValueChanged	TokenNameIdentifier	 adjustment Value Changed
(	TokenNameLPAREN	
AdjustmentEvent	TokenNameIdentifier	 Adjustment Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Adjustable	TokenNameIdentifier	 Adjustable
bar	TokenNameIdentifier	 bar
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getAdjustable	TokenNameIdentifier	 get Adjustable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currentMaximum	TokenNameIdentifier	 current Maximum
=	TokenNameEQUAL	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
getMaximum	TokenNameIdentifier	 get Maximum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
getMaximum	TokenNameIdentifier	 get Maximum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_lastMaximum	TokenNameIdentifier	 last Maximum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// nothing to do, the adjustable has not expanded 	TokenNameCOMMENT_LINE	nothing to do, the adjustable has not expanded 
}	TokenNameRBRACE	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
getVisibleAmount	TokenNameIdentifier	 get Visible Amount
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
+	TokenNamePLUS	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
getUnitIncrement	TokenNameIdentifier	 get Unit Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
_lastMaximum	TokenNameIdentifier	 last Maximum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
bar	TokenNameIdentifier	 bar
.	TokenNameDOT	
getMaximum	TokenNameIdentifier	 get Maximum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use the most recent maximum 	TokenNameCOMMENT_LINE	use the most recent maximum 
}	TokenNameRBRACE	
_lastMaximum	TokenNameIdentifier	 last Maximum
=	TokenNameEQUAL	
currentMaximum	TokenNameIdentifier	 current Maximum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
