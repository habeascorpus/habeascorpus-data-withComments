/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
/** * This policy rewrites events where the message of the * original event implementes java.util.Map. * All other events are passed through unmodified. * If the map contains a "message" entry, the value will be * used as the message for the rewritten event. The rewritten * event will have a property set that is the combination of the * original property set and the other members of the message map. * If both the original property set and the message map * contain the same entry, the value from the message map * will overwrite the original property set. * * The combination of the RewriteAppender and this policy * performs the same actions as the MapFilter from log4j 1.3. */	TokenNameCOMMENT_JAVADOC	 This policy rewrites events where the message of the original event implementes java.util.Map. All other events are passed through unmodified. If the map contains a "message" entry, the value will be used as the message for the rewritten event. The rewritten event will have a property set that is the combination of the original property set and the other members of the message map. If both the original property set and the message map contain the same entry, the value from the message map will overwrite the original property set. * The combination of the RewriteAppender and this policy performs the same actions as the MapFilter from log4j 1.3. 
public	TokenNamepublic	
class	TokenNameclass	
MapRewritePolicy	TokenNameIdentifier	 Map Rewrite Policy
implements	TokenNameimplements	
RewritePolicy	TokenNameIdentifier	 Rewrite Policy
{	TokenNameLBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
LoggingEvent	TokenNameIdentifier	 Logging Event
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
final	TokenNamefinal	
LoggingEvent	TokenNameIdentifier	 Logging Event
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
instanceof	TokenNameinstanceof	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getProperties	TokenNameIdentifier	 get Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
eventProps	TokenNameIdentifier	 event Props
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// if the map sent in the logging request 	TokenNameCOMMENT_LINE	if the map sent in the logging request 
// has "message" entry, use that as the message body 	TokenNameCOMMENT_LINE	has "message" entry, use that as the message body 
// otherwise, use the entire map. 	TokenNameCOMMENT_LINE	otherwise, use the entire map. 
// 	TokenNameCOMMENT_LINE	 
Object	TokenNameIdentifier	 Object
newMsg	TokenNameIdentifier	 new Msg
=	TokenNameEQUAL	
eventProps	TokenNameIdentifier	 event Props
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"message"	TokenNameStringLiteral	message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newMsg	TokenNameIdentifier	 new Msg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newMsg	TokenNameIdentifier	 new Msg
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
eventProps	TokenNameIdentifier	 event Props
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
"message"	TokenNameStringLiteral	message
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getFQNOfLoggerClass	TokenNameIdentifier	 get FQN Of Logger Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getLoggerName	TokenNameIdentifier	 get Logger Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newMsg	TokenNameIdentifier	 new Msg
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getThrowableInformation	TokenNameIdentifier	 get Throwable Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getLocationInformation	TokenNameIdentifier	 get Location Information
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
