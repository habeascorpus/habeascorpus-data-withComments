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
BorderLayout	TokenNameIdentifier	 Border Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
FlowLayout	TokenNameIdentifier	 Flow Layout
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionEvent	TokenNameIdentifier	 Action Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionListener	TokenNameIdentifier	 Action Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JButton	TokenNameIdentifier	 J Button
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JFrame	TokenNameIdentifier	 J Frame
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JPanel	TokenNameIdentifier	 J Panel
;	TokenNameSEMICOLON	
/** * LogFactor5ErrorDialog * * @author Richard Hurst * @author Brad Marlborough */	TokenNameCOMMENT_JAVADOC	 LogFactor5ErrorDialog * @author Richard Hurst @author Brad Marlborough 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
LogFactor5ErrorDialog	TokenNameIdentifier	 Log Factor5 Error Dialog
extends	TokenNameextends	
LogFactor5Dialog	TokenNameIdentifier	 Log Factor5 Dialog
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
public	TokenNamepublic	
LogFactor5ErrorDialog	TokenNameIdentifier	 Log Factor5 Error Dialog
(	TokenNameLPAREN	
JFrame	TokenNameIdentifier	 J Frame
jframe	TokenNameIdentifier	 jframe
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
jframe	TokenNameIdentifier	 jframe
,	TokenNameCOMMA	
"Error"	TokenNameStringLiteral	Error
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JButton	TokenNameIdentifier	 J Button
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
"Ok"	TokenNameStringLiteral	Ok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ok	TokenNameIdentifier	 ok
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hide	TokenNameIdentifier	 hide
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
FlowLayout	TokenNameIdentifier	 Flow Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
main	TokenNameIdentifier	 main
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wrapStringOnPanel	TokenNameIdentifier	 wrap String On Panel
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
main	TokenNameIdentifier	 main
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
main	TokenNameIdentifier	 main
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
CENTER	TokenNameIdentifier	 CENTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
SOUTH	TokenNameIdentifier	 SOUTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
show	TokenNameIdentifier	 show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
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
