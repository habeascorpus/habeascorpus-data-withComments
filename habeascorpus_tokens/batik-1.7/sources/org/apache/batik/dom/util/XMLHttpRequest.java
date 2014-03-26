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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
/** * An interface for objects that can fetch HTTP resources. * <b>This interface will likely move to a different package at some point * (perhaps org.w3c.dom.webapi).</b> * * @see <a href="http://www.w3.org/TR/XMLHttpRequest/">The XMLHttpRequest Object</a> * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 An interface for objects that can fetch HTTP resources. <b>This interface will likely move to a different package at some point (perhaps org.w3c.dom.webapi).</b> * @see <a href="http://www.w3.org/TR/XMLHttpRequest/">The XMLHttpRequest Object</a> @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id$ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLHttpRequest	TokenNameIdentifier	 XML Http Request
{	TokenNameLBRACE	
short	TokenNameshort	
UNSENT	TokenNameIdentifier	 UNSENT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
OPENED	TokenNameIdentifier	 OPENED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
HEADERS_RECEIVED	TokenNameIdentifier	 HEADERS  RECEIVED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
LOADING	TokenNameIdentifier	 LOADING
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
short	TokenNameshort	
DONE	TokenNameIdentifier	 DONE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
EventListener	TokenNameIdentifier	 Event Listener
getOnreadystatechange	TokenNameIdentifier	 get Onreadystatechange
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setOnreadystatechange	TokenNameIdentifier	 set Onreadystatechange
(	TokenNameLPAREN	
EventListener	TokenNameIdentifier	 Event Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
getReadyState	TokenNameIdentifier	 get Ready State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
boolean	TokenNameboolean	
async	TokenNameIdentifier	 async
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
boolean	TokenNameboolean	
async	TokenNameIdentifier	 async
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
url	TokenNameIdentifier	 url
,	TokenNameCOMMA	
boolean	TokenNameboolean	
async	TokenNameIdentifier	 async
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
user	TokenNameIdentifier	 user
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
password	TokenNameIdentifier	 password
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setRequestHeader	TokenNameIdentifier	 set Request Header
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
send	TokenNameIdentifier	 send
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getAllResponseHeaders	TokenNameIdentifier	 get All Response Headers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getResponseHeader	TokenNameIdentifier	 get Response Header
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getResponseText	TokenNameIdentifier	 get Response Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getResponseXML	TokenNameIdentifier	 get Response XML
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
getStatus	TokenNameIdentifier	 get Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
getStatusText	TokenNameIdentifier	 get Status Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
