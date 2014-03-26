/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DocumentCache.java 468651 2006-10-28 07:04:25Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DocumentCache.java 468651 2006-10-28 07:04:25Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLConnection	TokenNameIdentifier	 URL Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLDecoder	TokenNameIdentifier	 URL Decoder
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParser	TokenNameIdentifier	 SAX Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
parsers	TokenNameIdentifier	 parsers
.	TokenNameDOT	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXSource	TokenNameIdentifier	 SAX Source
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
DOMCache	TokenNameIdentifier	 DOM Cache
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
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
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
Translet	TokenNameIdentifier	 Translet
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
.	TokenNameDOT	
BasisLibrary	TokenNameIdentifier	 Basis Library
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
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
InputSource	TokenNameIdentifier	 Input Source
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
DocumentCache	TokenNameIdentifier	 Document Cache
implements	TokenNameimplements	
DOMCache	TokenNameIdentifier	 DOM Cache
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
_size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashtable	TokenNameIdentifier	 Hashtable
_references	TokenNameIdentifier	 references
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_URIs	TokenNameIdentifier	 UR Is
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SAXParser	TokenNameIdentifier	 SAX Parser
_parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
XMLReader	TokenNameIdentifier	 XML Reader
_reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
_dtmManager	TokenNameIdentifier	 dtm Manager
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REFRESH_INTERVAL	TokenNameIdentifier	 REFRESH  INTERVAL
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* * Inner class containing a DOMImpl object and DTD handler */	TokenNameCOMMENT_BLOCK	 Inner class containing a DOMImpl object and DTD handler 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CachedDocument	TokenNameIdentifier	 Cached Document
{	TokenNameLBRACE	
// Statistics data 	TokenNameCOMMENT_LINE	Statistics data 
private	TokenNameprivate	
long	TokenNamelong	
_firstReferenced	TokenNameIdentifier	 first Referenced
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
_lastReferenced	TokenNameIdentifier	 last Referenced
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
_accessCount	TokenNameIdentifier	 access Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
_lastModified	TokenNameIdentifier	 last Modified
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
_lastChecked	TokenNameIdentifier	 last Checked
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
_buildTime	TokenNameIdentifier	 build Time
;	TokenNameSEMICOLON	
// DOM and DTD handler references 	TokenNameCOMMENT_LINE	DOM and DTD handler references 
private	TokenNameprivate	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Constructor - load document and initialise statistics */	TokenNameCOMMENT_JAVADOC	 Constructor - load document and initialise statistics 
public	TokenNamepublic	
CachedDocument	TokenNameIdentifier	 Cached Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Initialise statistics variables 	TokenNameCOMMENT_LINE	Initialise statistics variables 
final	TokenNamefinal	
long	TokenNamelong	
stamp	TokenNameIdentifier	 stamp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_firstReferenced	TokenNameIdentifier	 first Referenced
=	TokenNameEQUAL	
stamp	TokenNameIdentifier	 stamp
;	TokenNameSEMICOLON	
_lastReferenced	TokenNameIdentifier	 last Referenced
=	TokenNameEQUAL	
stamp	TokenNameIdentifier	 stamp
;	TokenNameSEMICOLON	
_accessCount	TokenNameIdentifier	 access Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_buildTime	TokenNameIdentifier	 build Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
stamp	TokenNameIdentifier	 stamp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Loads the document and updates build-time (latency) statistics */	TokenNameCOMMENT_JAVADOC	 Loads the document and updates build-time (latency) statistics 
public	TokenNamepublic	
void	TokenNamevoid	
loadDocument	TokenNameIdentifier	 load Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
stamp	TokenNameIdentifier	 stamp
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMEnhancedForDTM	TokenNameIdentifier	 DOM Enhanced For DTM
)	TokenNameRPAREN	
_dtmManager	TokenNameIdentifier	 dtm Manager
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
new	TokenNamenew	
SAXSource	TokenNameIdentifier	 SAX Source
(	TokenNameLPAREN	
_reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
new	TokenNamenew	
InputSource	TokenNameIdentifier	 Input Source
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
setDocumentURI	TokenNameIdentifier	 set Document URI
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The build time can be used for statistics for a better 	TokenNameCOMMENT_LINE	The build time can be used for statistics for a better 
// priority algorithm (currently round robin). 	TokenNameCOMMENT_LINE	priority algorithm (currently round robin). 
final	TokenNamefinal	
long	TokenNamelong	
thisTime	TokenNameIdentifier	 this Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
stamp	TokenNameIdentifier	 stamp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_buildTime	TokenNameIdentifier	 build Time
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
_buildTime	TokenNameIdentifier	 build Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_buildTime	TokenNameIdentifier	 build Time
+	TokenNamePLUS	
thisTime	TokenNameIdentifier	 this Time
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_buildTime	TokenNameIdentifier	 build Time
=	TokenNameEQUAL	
thisTime	TokenNameIdentifier	 this Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
DOM	TokenNameIdentifier	 DOM
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getFirstReferenced	TokenNameIdentifier	 get First Referenced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_firstReferenced	TokenNameIdentifier	 first Referenced
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getLastReferenced	TokenNameIdentifier	 get Last Referenced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_lastReferenced	TokenNameIdentifier	 last Referenced
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getAccessCount	TokenNameIdentifier	 get Access Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_accessCount	TokenNameIdentifier	 access Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
incAccessCount	TokenNameIdentifier	 inc Access Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_accessCount	TokenNameIdentifier	 access Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_lastModified	TokenNameIdentifier	 last Modified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
long	TokenNamelong	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_lastModified	TokenNameIdentifier	 last Modified
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getLatency	TokenNameIdentifier	 get Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_buildTime	TokenNameIdentifier	 build Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getLastChecked	TokenNameIdentifier	 get Last Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_lastChecked	TokenNameIdentifier	 last Checked
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLastChecked	TokenNameIdentifier	 set Last Checked
(	TokenNameLPAREN	
long	TokenNamelong	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_lastChecked	TokenNameIdentifier	 last Checked
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getEstimatedSize	TokenNameIdentifier	 get Estimated Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_dom	TokenNameIdentifier	 dom
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
_dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ??? 	TokenNameCOMMENT_LINE	??? 
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * DocumentCache constructor */	TokenNameCOMMENT_JAVADOC	 DocumentCache constructor 
public	TokenNamepublic	
DocumentCache	TokenNameIdentifier	 Document Cache
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
_dtmManager	TokenNameIdentifier	 dtm Manager
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
)	TokenNameRPAREN	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
.	TokenNameDOT	
getDTMManagerClass	TokenNameIdentifier	 get DTM Manager Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * DocumentCache constructor */	TokenNameCOMMENT_JAVADOC	 DocumentCache constructor 
public	TokenNamepublic	
DocumentCache	TokenNameIdentifier	 Document Cache
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
XSLTCDTMManager	TokenNameIdentifier	 XSLTCDTM Manager
dtmManager	TokenNameIdentifier	 dtm Manager
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
_dtmManager	TokenNameIdentifier	 dtm Manager
=	TokenNameEQUAL	
dtmManager	TokenNameIdentifier	 dtm Manager
;	TokenNameSEMICOLON	
_count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
_references	TokenNameIdentifier	 references
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
_size	TokenNameIdentifier	 size
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_URIs	TokenNameIdentifier	 UR Is
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
_size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Create a SAX parser and get the XMLReader object it uses 	TokenNameCOMMENT_LINE	Create a SAX parser and get the XMLReader object it uses 
final	TokenNamefinal	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
factory	TokenNameIdentifier	 factory
=	TokenNameEQUAL	
SAXParserFactory	TokenNameIdentifier	 SAX Parser Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NAMESPACE_FEATURE	TokenNameIdentifier	 NAMESPACE  FEATURE
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
setNamespaceAware	TokenNameIdentifier	 set Namespace Aware
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
newSAXParser	TokenNameIdentifier	 new SAX Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
_parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getXMLReader	TokenNameIdentifier	 get XML Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParserConfigurationException	TokenNameIdentifier	 Parser Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
runTimeError	TokenNameIdentifier	 run Time Error
(	TokenNameLPAREN	
BasisLibrary	TokenNameIdentifier	 Basis Library
.	TokenNameDOT	
NAMESPACES_SUPPORT_ERR	TokenNameIdentifier	 NAMESPACES  SUPPORT  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the time-stamp for a document's last update */	TokenNameCOMMENT_JAVADOC	 Returns the time-stamp for a document's last update 
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URLConnection	TokenNameIdentifier	 URL Connection
connection	TokenNameIdentifier	 connection
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
connection	TokenNameIdentifier	 connection
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check for a "file:" URI (courtesy of Brian Ewins) 	TokenNameCOMMENT_LINE	Check for a "file:" URI (courtesy of Brian Ewins) 
if	TokenNameif	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get 0 for local URI 	TokenNameCOMMENT_LINE	get 0 for local URI 
if	TokenNameif	
(	TokenNameLPAREN	
"file"	TokenNameStringLiteral	file
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
localfile	TokenNameIdentifier	 localfile
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
URLDecoder	TokenNameIdentifier	 URL Decoder
.	TokenNameDOT	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
timestamp	TokenNameIdentifier	 timestamp
=	TokenNameEQUAL	
localfile	TokenNameIdentifier	 localfile
.	TokenNameDOT	
lastModified	TokenNameIdentifier	 last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Brutal handling of all exceptions 	TokenNameCOMMENT_LINE	Brutal handling of all exceptions 
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
CachedDocument	TokenNameIdentifier	 Cached Document
lookupDocument	TokenNameIdentifier	 lookup Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CachedDocument	TokenNameIdentifier	 Cached Document
)	TokenNameRPAREN	
_references	TokenNameIdentifier	 references
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
insertDocument	TokenNameIdentifier	 insert Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
CachedDocument	TokenNameIdentifier	 Cached Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_count	TokenNameIdentifier	 count
<	TokenNameLESS	
_size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Insert out URI in circular buffer 	TokenNameCOMMENT_LINE	Insert out URI in circular buffer 
_URIs	TokenNameIdentifier	 UR Is
[	TokenNameLBRACKET	
_count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Remove oldest URI from reference Hashtable 	TokenNameCOMMENT_LINE	Remove oldest URI from reference Hashtable 
_references	TokenNameIdentifier	 references
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
_URIs	TokenNameIdentifier	 UR Is
[	TokenNameLBRACKET	
_current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Insert our URI in circular buffer 	TokenNameCOMMENT_LINE	Insert our URI in circular buffer 
_URIs	TokenNameIdentifier	 UR Is
[	TokenNameLBRACKET	
_current	TokenNameIdentifier	 current
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
_current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
_size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
_current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_references	TokenNameIdentifier	 references
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * */	TokenNameCOMMENT_JAVADOC	 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
replaceDocument	TokenNameIdentifier	 replace Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
CachedDocument	TokenNameIdentifier	 Cached Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CachedDocument	TokenNameIdentifier	 Cached Document
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CachedDocument	TokenNameIdentifier	 Cached Document
)	TokenNameRPAREN	
_references	TokenNameIdentifier	 references
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
insertDocument	TokenNameIdentifier	 insert Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_references	TokenNameIdentifier	 references
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a document either by finding it in the cache or * downloading it and putting it in the cache. */	TokenNameCOMMENT_JAVADOC	 Returns a document either by finding it in the cache or downloading it and putting it in the cache. 
public	TokenNamepublic	
DOM	TokenNameIdentifier	 DOM
retrieveDocument	TokenNameIdentifier	 retrieve Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
baseURI	TokenNameIdentifier	 base URI
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
href	TokenNameIdentifier	 href
,	TokenNameCOMMA	
Translet	TokenNameIdentifier	 Translet
trs	TokenNameIdentifier	 trs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CachedDocument	TokenNameIdentifier	 Cached Document
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
href	TokenNameIdentifier	 href
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseURI	TokenNameIdentifier	 base URI
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
baseURI	TokenNameIdentifier	 base URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
SystemIDResolver	TokenNameIdentifier	 System ID Resolver
.	TokenNameDOT	
getAbsoluteURI	TokenNameIdentifier	 get Absolute URI
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
baseURI	TokenNameIdentifier	 base URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Try to get the document from the cache first 	TokenNameCOMMENT_LINE	Try to get the document from the cache first 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
lookupDocument	TokenNameIdentifier	 lookup Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDocument	TokenNameIdentifier	 Cached Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// better error handling needed!!! 	TokenNameCOMMENT_LINE	better error handling needed!!! 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertDocument	TokenNameIdentifier	 insert Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If the document is in the cache we must check if it is still valid 	TokenNameCOMMENT_LINE	If the document is in the cache we must check if it is still valid 
else	TokenNameelse	
{	TokenNameLBRACE	
long	TokenNamelong	
now	TokenNameIdentifier	 now
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
chk	TokenNameIdentifier	 chk
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getLastChecked	TokenNameIdentifier	 get Last Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
setLastChecked	TokenNameIdentifier	 set Last Checked
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Has the modification time for this file been checked lately? 	TokenNameCOMMENT_LINE	Has the modification time for this file been checked lately? 
if	TokenNameif	
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
>	TokenNameGREATER	
(	TokenNameLPAREN	
chk	TokenNameIdentifier	 chk
+	TokenNamePLUS	
REFRESH_INTERVAL	TokenNameIdentifier	 REFRESH  INTERVAL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
setLastChecked	TokenNameIdentifier	 set Last Checked
(	TokenNameLPAREN	
now	TokenNameIdentifier	 now
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reload document if it has been modified since last download 	TokenNameCOMMENT_LINE	Reload document if it has been modified since last download 
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
>	TokenNameGREATER	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
CachedDocument	TokenNameIdentifier	 Cached Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
setLastModified	TokenNameIdentifier	 set Last Modified
(	TokenNameLPAREN	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
replaceDocument	TokenNameIdentifier	 replace Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Get the references to the actual DOM and DTD handler 	TokenNameCOMMENT_LINE	Get the references to the actual DOM and DTD handler 
final	TokenNamefinal	
DOM	TokenNameIdentifier	 DOM
dom	TokenNameIdentifier	 dom
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The dom reference may be null if the URL pointed to a 	TokenNameCOMMENT_LINE	The dom reference may be null if the URL pointed to a 
// non-existing document 	TokenNameCOMMENT_LINE	non-existing document 
if	TokenNameif	
(	TokenNameLPAREN	
dom	TokenNameIdentifier	 dom
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
incAccessCount	TokenNameIdentifier	 inc Access Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For statistics 	TokenNameCOMMENT_LINE	For statistics 
final	TokenNamefinal	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
translet	TokenNameIdentifier	 translet
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AbstractTranslet	TokenNameIdentifier	 Abstract Translet
)	TokenNameRPAREN	
trs	TokenNameIdentifier	 trs
;	TokenNameSEMICOLON	
// Give the translet an early opportunity to extract any 	TokenNameCOMMENT_LINE	Give the translet an early opportunity to extract any 
// information from the DOM object that it would like. 	TokenNameCOMMENT_LINE	information from the DOM object that it would like. 
translet	TokenNameIdentifier	 translet
.	TokenNameDOT	
prepassDocument	TokenNameIdentifier	 prepass Document
(	TokenNameLPAREN	
dom	TokenNameIdentifier	 dom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Outputs the cache statistics */	TokenNameCOMMENT_JAVADOC	 Outputs the cache statistics 
public	TokenNamepublic	
void	TokenNamevoid	
getStatistics	TokenNameIdentifier	 get Statistics
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<h2>DOM cache statistics</h2><center><table border="2">"	TokenNameStringLiteral	<h2>DOM cache statistics</h2><center><table border="2">
+	TokenNamePLUS	
"<tr><td><b>Document URI</b></td>"	TokenNameStringLiteral	<tr><td><b>Document URI</b></td>
+	TokenNamePLUS	
"<td><center><b>Build time</b></center></td>"	TokenNameStringLiteral	<td><center><b>Build time</b></center></td>
+	TokenNamePLUS	
"<td><center><b>Access count</b></center></td>"	TokenNameStringLiteral	<td><center><b>Access count</b></center></td>
+	TokenNamePLUS	
"<td><center><b>Last accessed</b></center></td>"	TokenNameStringLiteral	<td><center><b>Last accessed</b></center></td>
+	TokenNamePLUS	
"<td><center><b>Last modified</b></center></td></tr>"	TokenNameStringLiteral	<td><center><b>Last modified</b></center></td></tr>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CachedDocument	TokenNameIdentifier	 Cached Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CachedDocument	TokenNameIdentifier	 Cached Document
)	TokenNameRPAREN	
_references	TokenNameIdentifier	 references
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
_URIs	TokenNameIdentifier	 UR Is
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<tr><td><a href=""	TokenNameStringLiteral	<tr><td><a href="
+	TokenNamePLUS	
_URIs	TokenNameIdentifier	 UR Is
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"">"	TokenNameStringLiteral	">
+	TokenNamePLUS	
"<font size=-1>"	TokenNameStringLiteral	<font size=-1>
+	TokenNamePLUS	
_URIs	TokenNameIdentifier	 UR Is
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"</font></a></td>"	TokenNameStringLiteral	</font></a></td>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<td><center>"	TokenNameStringLiteral	<td><center>
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getLatency	TokenNameIdentifier	 get Latency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"ms</center></td>"	TokenNameStringLiteral	ms</center></td>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<td><center>"	TokenNameStringLiteral	<td><center>
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getAccessCount	TokenNameIdentifier	 get Access Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"</center></td>"	TokenNameStringLiteral	</center></td>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<td><center>"	TokenNameStringLiteral	<td><center>
+	TokenNamePLUS	
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getLastReferenced	TokenNameIdentifier	 get Last Referenced
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"</center></td>"	TokenNameStringLiteral	</center></td>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<td><center>"	TokenNameStringLiteral	<td><center>
+	TokenNamePLUS	
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getLastModified	TokenNameIdentifier	 get Last Modified
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"</center></td>"	TokenNameStringLiteral	</center></td>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"</tr>"	TokenNameStringLiteral	</tr>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"</table></center>"	TokenNameStringLiteral	</table></center>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
