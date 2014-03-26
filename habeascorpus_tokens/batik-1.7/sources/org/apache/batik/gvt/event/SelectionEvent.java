/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
/** * An event which indicates that a selection is being made or has been made. * * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> * @version $Id: SelectionEvent.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An event which indicates that a selection is being made or has been made. * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> @version $Id: SelectionEvent.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SelectionEvent	TokenNameIdentifier	 Selection Event
{	TokenNameLBRACE	
/** * The id for the "selection changing" event. * (Selection process is under way) */	TokenNameCOMMENT_JAVADOC	 The id for the "selection changing" event. (Selection process is under way) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELECTION_CHANGED	TokenNameIdentifier	 SELECTION  CHANGED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "selection cleared" event. */	TokenNameCOMMENT_JAVADOC	 The id for the "selection cleared" event. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELECTION_CLEARED	TokenNameIdentifier	 SELECTION  CLEARED
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "selection started" event. */	TokenNameCOMMENT_JAVADOC	 The id for the "selection started" event. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELECTION_STARTED	TokenNameIdentifier	 SELECTION  STARTED
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The id for the "selection completed" event. * (Selection process is complete). */	TokenNameCOMMENT_JAVADOC	 The id for the "selection completed" event. (Selection process is complete). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SELECTION_DONE	TokenNameIdentifier	 SELECTION  DONE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The shape enclosing the selection */	TokenNameCOMMENT_JAVADOC	 The shape enclosing the selection 
protected	TokenNameprotected	
Shape	TokenNameIdentifier	 Shape
highlightShape	TokenNameIdentifier	 highlight Shape
;	TokenNameSEMICOLON	
/** The object which composes the selection */	TokenNameCOMMENT_JAVADOC	 The object which composes the selection 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
selection	TokenNameIdentifier	 selection
;	TokenNameSEMICOLON	
/** The event type of the current selection event */	TokenNameCOMMENT_JAVADOC	 The event type of the current selection event 
protected	TokenNameprotected	
int	TokenNameint	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
/** * Constructs a new graphics node paint event. * @param selection the selection * @param id the id of this event * @param highlightShape a user-space shape enclosing the selection. */	TokenNameCOMMENT_JAVADOC	 Constructs a new graphics node paint event. @param selection the selection @param id the id of this event @param highlightShape a user-space shape enclosing the selection. 
public	TokenNamepublic	
SelectionEvent	TokenNameIdentifier	 Selection Event
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
selection	TokenNameIdentifier	 selection
,	TokenNameCOMMA	
int	TokenNameint	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Shape	TokenNameIdentifier	 Shape
highlightShape	TokenNameIdentifier	 highlight Shape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
selection	TokenNameIdentifier	 selection
=	TokenNameEQUAL	
selection	TokenNameIdentifier	 selection
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
highlightShape	TokenNameIdentifier	 highlight Shape
=	TokenNameEQUAL	
highlightShape	TokenNameIdentifier	 highlight Shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a shape in user space that encloses the current selection. */	TokenNameCOMMENT_JAVADOC	 Returns a shape in user space that encloses the current selection. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getHighlightShape	TokenNameIdentifier	 get Highlight Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
highlightShape	TokenNameIdentifier	 highlight Shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the selection associated with this event. * Only guaranteed current for events of type SELECTION_DONE. */	TokenNameCOMMENT_JAVADOC	 Returns the selection associated with this event. Only guaranteed current for events of type SELECTION_DONE. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getSelection	TokenNameIdentifier	 get Selection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
selection	TokenNameIdentifier	 selection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the event's selection event type. * @see org.apache.batik.gvt.event.SelectionEvent#SELECTION_CHANGED * @see org.apache.batik.gvt.event.SelectionEvent#SELECTION_CLEARED * @see org.apache.batik.gvt.event.SelectionEvent#SELECTION_DONE */	TokenNameCOMMENT_JAVADOC	 Returns the event's selection event type. @see org.apache.batik.gvt.event.SelectionEvent#SELECTION_CHANGED @see org.apache.batik.gvt.event.SelectionEvent#SELECTION_CLEARED @see org.apache.batik.gvt.event.SelectionEvent#SELECTION_DONE 
public	TokenNamepublic	
int	TokenNameint	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
