/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTCSource.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTCSource.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
trax	TokenNameIdentifier	 trax
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
DOM	TokenNameIdentifier	 DOM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
StripFilter	TokenNameIdentifier	 Strip Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ErrorMsg	TokenNameIdentifier	 Error Msg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMWSFilter	TokenNameIdentifier	 DOMWS Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
SAXImpl	TokenNameIdentifier	 SAX Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
XSLTCSource	TokenNameIdentifier	 XSLTC Source
implements	TokenNameimplements	
Source	TokenNameIdentifier	 Source
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Source	TokenNameIdentifier	 Source
_source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ThreadLocal	TokenNameIdentifier	 Thread Local
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new XSLTC-specific source from a system ID */	TokenNameCOMMENT_JAVADOC	 Create a new XSLTC-specific source from a system ID 
public	TokenNamepublic	
XSLTCSource	TokenNameIdentifier	 XSLTC Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new XSLTC-specific source from a JAXP Source */	TokenNameCOMMENT_JAVADOC	 Create a new XSLTC-specific source from a JAXP Source 
public	TokenNamepublic	
XSLTCSource	TokenNameIdentifier	 XSLTC Source
(	TokenNameLPAREN	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements javax.xml.transform.Source.setSystemId() * Set the system identifier for this Source. * This Source can get its input either directly from a file (in this case * it will instanciate and use a JAXP parser) or it can receive it through * ContentHandler/LexicalHandler interfaces. * @param systemId The system Id for this Source */	TokenNameCOMMENT_JAVADOC	 Implements javax.xml.transform.Source.setSystemId() Set the system identifier for this Source. This Source can get its input either directly from a file (in this case it will instanciate and use a JAXP parser) or it can receive it through ContentHandler/LexicalHandler interfaces. @param systemId The system Id for this Source 
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_source	TokenNameIdentifier	 source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements javax.xml.transform.Source.getSystemId() * Get the system identifier that was set with setSystemId. * @return The system identifier that was set with setSystemId, * or null if setSystemId was not called. */	TokenNameCOMMENT_JAVADOC	 Implements javax.xml.transform.Source.getSystemId() Get the system identifier that was set with setSystemId. @return The system identifier that was set with setSystemId, or null if setSystemId was not called. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_source	TokenNameIdentifier	 source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Internal interface which returns a DOM for a given DTMManager and translet. */	TokenNameCOMMENT_JAVADOC	 Internal interface which returns a DOM for a given DTMManager and translet. 
protected	TokenNameprotected	
DOM	TokenNameIdentifier	 DOM
getDOM	TokenNameIdentifier	 get DOM
(	TokenNameLPAREN	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
dtmManager	TokenNameIdentifier	 dtm Manager
,	TokenNameCOMMA	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
SAXImpl	TokenNameIdentifier	 SAX Impl
idom	TokenNameIdentifier	 idom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAXImpl	TokenNameIdentifier	 SAX Impl
)	TokenNameRPAREN	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idom	TokenNameIdentifier	 idom
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dtmManager	TokenNameIdentifier	 dtm Manager
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idom	TokenNameIdentifier	 idom
.	TokenNameDOT	
migrateTo	TokenNameIdentifier	 migrate To
(	TokenNameLPAREN	
dtmManager	TokenNameIdentifier	 dtm Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
_source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
_systemId	TokenNameIdentifier	 system Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
_systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
XSLTC_SOURCE_ERR	TokenNameIdentifier	 XSLTC  SOURCE  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DOMWSFilter	TokenNameIdentifier	 DOMWS Filter
wsfilter	TokenNameIdentifier	 wsfilter
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
translet	TokenNameIdentifier	 translet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
translet	TokenNameIdentifier	 translet
instanceof	TokenNameinstanceof	
StripFilter	TokenNameIdentifier	 Strip Filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wsfilter	TokenNameIdentifier	 wsfilter
=	TokenNameEQUAL	
new	TokenNamenew	
DOMWSFilter	TokenNameIdentifier	 DOMWS Filter
(	TokenNameLPAREN	
translet	TokenNameIdentifier	 translet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
hasIdCall	TokenNameIdentifier	 has Id Call
=	TokenNameEQUAL	
(	TokenNameLPAREN	
translet	TokenNameIdentifier	 translet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
hasIdCall	TokenNameIdentifier	 has Id Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dtmManager	TokenNameIdentifier	 dtm Manager
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dtmManager	TokenNameIdentifier	 dtm Manager
=	TokenNameEQUAL	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
idom	TokenNameIdentifier	 idom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAXImpl	TokenNameIdentifier	 SAX Impl
)	TokenNameRPAREN	
dtmManager	TokenNameIdentifier	 dtm Manager
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
wsfilter	TokenNameIdentifier	 wsfilter
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
hasIdCall	TokenNameIdentifier	 has Id Call
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idom	TokenNameIdentifier	 idom
.	TokenNameDOT	
setDocumentURI	TokenNameIdentifier	 set Document URI
(	TokenNameLPAREN	
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
idom	TokenNameIdentifier	 idom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
idom	TokenNameIdentifier	 idom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
