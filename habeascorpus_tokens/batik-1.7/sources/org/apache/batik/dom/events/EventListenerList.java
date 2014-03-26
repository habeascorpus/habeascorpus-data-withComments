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
events	TokenNameIdentifier	 events
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IntTable	TokenNameIdentifier	 Int Table
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashTable	TokenNameIdentifier	 Hash Table
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
EventListener	TokenNameIdentifier	 Event Listener
;	TokenNameSEMICOLON	
/** * Class to manager event listeners for one event type. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: EventListenerList.java 579851 2007-09-26 23:49:35Z cam $ */	TokenNameCOMMENT_JAVADOC	 Class to manager event listeners for one event type. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: EventListenerList.java 579851 2007-09-26 23:49:35Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
EventListenerList	TokenNameIdentifier	 Event Listener List
{	TokenNameLBRACE	
/** * Total number of event listners. */	TokenNameCOMMENT_JAVADOC	 Total number of event listners. 
protected	TokenNameprotected	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
/** * Linked list of entries. */	TokenNameCOMMENT_JAVADOC	 Linked list of entries. 
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
/** * Counts of listener entries with a given namespace URI. */	TokenNameCOMMENT_JAVADOC	 Counts of listener entries with a given namespace URI. 
protected	TokenNameprotected	
IntTable	TokenNameIdentifier	 Int Table
counts	TokenNameIdentifier	 counts
=	TokenNameEQUAL	
new	TokenNamenew	
IntTable	TokenNameIdentifier	 Int Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Cache of listeners with any namespace URI. */	TokenNameCOMMENT_JAVADOC	 Cache of listeners with any namespace URI. 
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
;	TokenNameSEMICOLON	
/** * Caches of listeners with a given namespace URI. */	TokenNameCOMMENT_JAVADOC	 Caches of listeners with a given namespace URI. 
protected	TokenNameprotected	
HashTable	TokenNameIdentifier	 Hash Table
listenersNS	TokenNameIdentifier	 listeners NS
=	TokenNameEQUAL	
new	TokenNamenew	
HashTable	TokenNameIdentifier	 Hash Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Adds a listener. */	TokenNameCOMMENT_JAVADOC	 Adds a listener. 
public	TokenNamepublic	
void	TokenNamevoid	
addListener	TokenNameIdentifier	 add Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
||	TokenNameOR_OR	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
listener	TokenNameIdentifier	 listener
==	TokenNameEQUAL_EQUAL	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Listener is already in the list, so do nothing. 	TokenNameCOMMENT_LINE	Listener is already in the list, so do nothing. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
counts	TokenNameIdentifier	 counts
.	TokenNameDOT	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
listenersNS	TokenNameIdentifier	 listeners NS
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes a listener. */	TokenNameCOMMENT_JAVADOC	 Removes a listener. 
public	TokenNamepublic	
void	TokenNamevoid	
removeListener	TokenNameIdentifier	 remove Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
||	TokenNameOR_OR	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
listener	TokenNameIdentifier	 listener
==	TokenNameEQUAL_EQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
||	TokenNameOR_OR	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
listener	TokenNameIdentifier	 listener
==	TokenNameEQUAL_EQUAL	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Listener not present. 	TokenNameCOMMENT_LINE	Listener not present. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
counts	TokenNameIdentifier	 counts
.	TokenNameDOT	
dec	TokenNameIdentifier	 dec
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
listenersNS	TokenNameIdentifier	 listeners NS
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array containing all event listener entries. */	TokenNameCOMMENT_JAVADOC	 Returns an array containing all event listener entries. 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEventListeners	TokenNameIdentifier	 get Event Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
listeners	TokenNameIdentifier	 listeners
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
listeners	TokenNameIdentifier	 listeners
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array of EventListeners that match the given namespace URI. */	TokenNameCOMMENT_JAVADOC	 Returns an array of EventListeners that match the given namespace URI. 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEventListeners	TokenNameIdentifier	 get Event Listeners
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getEventListeners	TokenNameIdentifier	 get Event Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ls	TokenNameIdentifier	 ls
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
listenersNS	TokenNameIdentifier	 listeners NS
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ls	TokenNameIdentifier	 ls
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ls	TokenNameIdentifier	 ls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
counts	TokenNameIdentifier	 counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ls	TokenNameIdentifier	 ls
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
listenersNS	TokenNameIdentifier	 listeners NS
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
ls	TokenNameIdentifier	 ls
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ls	TokenNameIdentifier	 ls
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
ls	TokenNameIdentifier	 ls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether there is an event listener for the given namespace URI. */	TokenNameCOMMENT_JAVADOC	 Returns whether there is an event listener for the given namespace URI. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasEventListener	TokenNameIdentifier	 has Event Listener
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
counts	TokenNameIdentifier	 counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of event listeners stored in this object. */	TokenNameCOMMENT_JAVADOC	 Returns the number of event listeners stored in this object. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * EventListenerTable entry class. */	TokenNameCOMMENT_JAVADOC	 EventListenerTable entry class. 
public	TokenNamepublic	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
/** * The event listener. */	TokenNameCOMMENT_JAVADOC	 The event listener. 
protected	TokenNameprotected	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
/** * The namespace URI of the event the listener is listening for. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of the event the listener is listening for. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * The event group. */	TokenNameCOMMENT_JAVADOC	 The event group. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
/** * Flag used by getListeners. */	TokenNameCOMMENT_JAVADOC	 Flag used by getListeners. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
mark	TokenNameIdentifier	 mark
;	TokenNameSEMICOLON	
/** * The next Entry in the list. */	TokenNameCOMMENT_JAVADOC	 The next Entry in the list. 
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
/** * Creates a new Entry object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Entry object. 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the event listener. */	TokenNameCOMMENT_JAVADOC	 Returns the event listener. 
public	TokenNamepublic	
EventListener	TokenNameIdentifier	 Event Listener
getListener	TokenNameIdentifier	 get Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the event group. */	TokenNameCOMMENT_JAVADOC	 Returns the event group. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getGroup	TokenNameIdentifier	 get Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the event namespace URI. */	TokenNameCOMMENT_JAVADOC	 Returns the event namespace URI. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
