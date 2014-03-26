/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
timing	TokenNameIdentifier	 timing
;	TokenNameSEMICOLON	
/** * An adapter class for {@link TimegraphListener}s. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: TimegraphAdapter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 An adapter class for {@link TimegraphListener}s. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: TimegraphAdapter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TimegraphAdapter	TokenNameIdentifier	 Timegraph Adapter
implements	TokenNameimplements	
TimegraphListener	TokenNameIdentifier	 Timegraph Listener
{	TokenNameLBRACE	
/** * Invoked to indicate that a timed element has been added to the * document. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that a timed element has been added to the document. 
public	TokenNamepublic	
void	TokenNamevoid	
elementAdded	TokenNameIdentifier	 element Added
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indicate that a timed element has been removed from the * document. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that a timed element has been removed from the document. 
public	TokenNamepublic	
void	TokenNamevoid	
elementRemoved	TokenNameIdentifier	 element Removed
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indicate that a timed element has become active. * @param e the TimedElement that became active * @param t the time (in parent simple time) that the element became active */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that a timed element has become active. @param e the TimedElement that became active @param t the time (in parent simple time) that the element became active 
public	TokenNamepublic	
void	TokenNamevoid	
elementActivated	TokenNameIdentifier	 element Activated
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indicate that a timed element has become inactive * and is filling. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that a timed element has become inactive and is filling. 
public	TokenNamepublic	
void	TokenNamevoid	
elementFilled	TokenNameIdentifier	 element Filled
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indicate that a timed element has become inactive * and is not filling. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that a timed element has become inactive and is not filling. 
public	TokenNamepublic	
void	TokenNamevoid	
elementDeactivated	TokenNameIdentifier	 element Deactivated
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indivate that an interval was created for the given * timed element. */	TokenNameCOMMENT_JAVADOC	 Invoked to indivate that an interval was created for the given timed element. 
public	TokenNamepublic	
void	TokenNamevoid	
intervalCreated	TokenNameIdentifier	 interval Created
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indivate that an interval was removed for the given * timed element. */	TokenNameCOMMENT_JAVADOC	 Invoked to indivate that an interval was removed for the given timed element. 
public	TokenNamepublic	
void	TokenNamevoid	
intervalRemoved	TokenNameIdentifier	 interval Removed
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indivate that an interval's endpoints were changed. */	TokenNameCOMMENT_JAVADOC	 Invoked to indivate that an interval's endpoints were changed. 
public	TokenNamepublic	
void	TokenNamevoid	
intervalChanged	TokenNameIdentifier	 interval Changed
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indivate that the given interval began. * @param i the Interval that began, or null if no interval is * active for the given timed element. */	TokenNameCOMMENT_JAVADOC	 Invoked to indivate that the given interval began. @param i the Interval that began, or null if no interval is active for the given timed element. 
public	TokenNamepublic	
void	TokenNamevoid	
intervalBegan	TokenNameIdentifier	 interval Began
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
Interval	TokenNameIdentifier	 Interval
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indicate that the given timed element began a repeat * iteration at the specified time. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that the given timed element began a repeat iteration at the specified time. 
public	TokenNamepublic	
void	TokenNamevoid	
elementRepeated	TokenNameIdentifier	 element Repeated
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
float	TokenNamefloat	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Invoked to indicate that the list of instance times for the given * timed element has been updated. */	TokenNameCOMMENT_JAVADOC	 Invoked to indicate that the list of instance times for the given timed element has been updated. 
public	TokenNamepublic	
void	TokenNamevoid	
elementInstanceTimesChanged	TokenNameIdentifier	 element Instance Times Changed
(	TokenNameLPAREN	
TimedElement	TokenNameIdentifier	 Timed Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
float	TokenNamefloat	
isBegin	TokenNameIdentifier	 is Begin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
