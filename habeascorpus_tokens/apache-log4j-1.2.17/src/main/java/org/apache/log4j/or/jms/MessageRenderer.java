/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
or	TokenNameIdentifier	 or
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
LogLog	TokenNameIdentifier	 Log Log
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
or	TokenNameIdentifier	 or
.	TokenNameDOT	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
Message	TokenNameIdentifier	 Message
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
JMSException	TokenNameIdentifier	 JMS Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
jms	TokenNameIdentifier	 jms
.	TokenNameDOT	
DeliveryMode	TokenNameIdentifier	 Delivery Mode
;	TokenNameSEMICOLON	
/** Render <code>javax.jms.Message</code> objects. @author Ceki G&uuml;lc&uuml; @since 1.0 */	TokenNameCOMMENT_JAVADOC	 Render <code>javax.jms.Message</code> objects. @author Ceki G&uuml;lc&uuml; @since 1.0 
public	TokenNamepublic	
class	TokenNameclass	
MessageRenderer	TokenNameIdentifier	 Message Renderer
implements	TokenNameimplements	
ObjectRenderer	TokenNameIdentifier	 Object Renderer
{	TokenNameLBRACE	
public	TokenNamepublic	
MessageRenderer	TokenNameIdentifier	 Message Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Render a {@link javax.jms.Message}. */	TokenNameCOMMENT_JAVADOC	 Render a {@link javax.jms.Message}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
doRender	TokenNameIdentifier	 do Render
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Message	TokenNameIdentifier	 Message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sbuf	TokenNameIdentifier	 sbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Message	TokenNameIdentifier	 Message
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Message	TokenNameIdentifier	 Message
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"DeliveryMode="	TokenNameStringLiteral	DeliveryMode=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSDeliveryMode	TokenNameIdentifier	 get JMS Delivery Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DeliveryMode	TokenNameIdentifier	 Delivery Mode
.	TokenNameDOT	
NON_PERSISTENT	TokenNameIdentifier	 NON  PERSISTENT
:	TokenNameCOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"NON_PERSISTENT"	TokenNameStringLiteral	NON_PERSISTENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DeliveryMode	TokenNameIdentifier	 Delivery Mode
.	TokenNameDOT	
PERSISTENT	TokenNameIdentifier	 PERSISTENT
:	TokenNameCOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"PERSISTENT"	TokenNameStringLiteral	PERSISTENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"UNKNOWN"	TokenNameStringLiteral	UNKNOWN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", CorrelationID="	TokenNameStringLiteral	, CorrelationID=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSCorrelationID	TokenNameIdentifier	 get JMS Correlation ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Destination="	TokenNameStringLiteral	, Destination=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSDestination	TokenNameIdentifier	 get JMS Destination
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Expiration="	TokenNameStringLiteral	, Expiration=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSExpiration	TokenNameIdentifier	 get JMS Expiration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", MessageID="	TokenNameStringLiteral	, MessageID=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSMessageID	TokenNameIdentifier	 get JMS Message ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Priority="	TokenNameStringLiteral	, Priority=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSPriority	TokenNameIdentifier	 get JMS Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Redelivered="	TokenNameStringLiteral	, Redelivered=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSRedelivered	TokenNameIdentifier	 get JMS Redelivered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", ReplyTo="	TokenNameStringLiteral	, ReplyTo=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSReplyTo	TokenNameIdentifier	 get JMS Reply To
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Timestamp="	TokenNameStringLiteral	, Timestamp=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSTimestamp	TokenNameIdentifier	 get JMS Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", Type="	TokenNameStringLiteral	, Type=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getJMSType	TokenNameIdentifier	 get JMS Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Enumeration enum = m.getPropertyNames(); 	TokenNameCOMMENT_LINE	Enumeration enum = m.getPropertyNames(); 
//while(enum.hasMoreElements()) { 	TokenNameCOMMENT_LINE	while(enum.hasMoreElements()) { 
// String key = (String) enum.nextElement(); 	TokenNameCOMMENT_LINE	String key = (String) enum.nextElement(); 
// sbuf.append("; "+key+"="); 	TokenNameCOMMENT_LINE	sbuf.append("; "+key+"="); 
// sbuf.append(m.getStringProperty(key)); 	TokenNameCOMMENT_LINE	sbuf.append(m.getStringProperty(key)); 
//} 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
JMSException	TokenNameIdentifier	 JMS Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogLog	TokenNameIdentifier	 Log Log
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Could not parse Message."	TokenNameStringLiteral	Could not parse Message.
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sbuf	TokenNameIdentifier	 sbuf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
