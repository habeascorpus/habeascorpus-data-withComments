/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
XMLEventReader	TokenNameIdentifier	 XML Event Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
/** * <p>An <code>XMLInputSource</code> analogue to <code>javax.xml.transform.stax.StAXSource</code>.</p> * * @version $Id: StAXInputSource.java 696457 2008-09-17 21:26:53Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p>An <code>XMLInputSource</code> analogue to <code>javax.xml.transform.stax.StAXSource</code>.</p> * @version $Id: StAXInputSource.java 696457 2008-09-17 21:26:53Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
StAXInputSource	TokenNameIdentifier	 St AX Input Source
extends	TokenNameextends	
XMLInputSource	TokenNameIdentifier	 XML Input Source
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
fStreamReader	TokenNameIdentifier	 f Stream Reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
XMLEventReader	TokenNameIdentifier	 XML Event Reader
fEventReader	TokenNameIdentifier	 f Event Reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
fConsumeRemainingContent	TokenNameIdentifier	 f Consume Remaining Content
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StAXInputSource	TokenNameIdentifier	 St AX Input Source
(	TokenNameLPAREN	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StAXInputSource	TokenNameIdentifier	 St AX Input Source
(	TokenNameLPAREN	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
consumeRemainingContent	TokenNameIdentifier	 consume Remaining Content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"XMLStreamReader parameter cannot be null."	TokenNameStringLiteral	XMLStreamReader parameter cannot be null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStreamReader	TokenNameIdentifier	 f Stream Reader
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
fEventReader	TokenNameIdentifier	 f Event Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fConsumeRemainingContent	TokenNameIdentifier	 f Consume Remaining Content
=	TokenNameEQUAL	
consumeRemainingContent	TokenNameIdentifier	 consume Remaining Content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StAXInputSource	TokenNameIdentifier	 St AX Input Source
(	TokenNameLPAREN	
XMLEventReader	TokenNameIdentifier	 XML Event Reader
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
StAXInputSource	TokenNameIdentifier	 St AX Input Source
(	TokenNameLPAREN	
XMLEventReader	TokenNameIdentifier	 XML Event Reader
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
consumeRemainingContent	TokenNameIdentifier	 consume Remaining Content
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
getEventReaderSystemId	TokenNameIdentifier	 get Event Reader System Id
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"XMLEventReader parameter cannot be null."	TokenNameStringLiteral	XMLEventReader parameter cannot be null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStreamReader	TokenNameIdentifier	 f Stream Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fEventReader	TokenNameIdentifier	 f Event Reader
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
fConsumeRemainingContent	TokenNameIdentifier	 f Consume Remaining Content
=	TokenNameEQUAL	
consumeRemainingContent	TokenNameIdentifier	 consume Remaining Content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XMLStreamReader	TokenNameIdentifier	 XML Stream Reader
getXMLStreamReader	TokenNameIdentifier	 get XML Stream Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fStreamReader	TokenNameIdentifier	 f Stream Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
XMLEventReader	TokenNameIdentifier	 XML Event Reader
getXMLEventReader	TokenNameIdentifier	 get XML Event Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fEventReader	TokenNameIdentifier	 f Event Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldConsumeRemainingContent	TokenNameIdentifier	 should Consume Remaining Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fConsumeRemainingContent	TokenNameIdentifier	 f Consume Remaining Content
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSystemId	TokenNameIdentifier	 set System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Cannot set the system ID on a StAXInputSource"	TokenNameStringLiteral	Cannot set the system ID on a StAXInputSource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getEventReaderSystemId	TokenNameIdentifier	 get Event Reader System Id
(	TokenNameLPAREN	
XMLEventReader	TokenNameIdentifier	 XML Event Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// StAXInputSource 	TokenNameCOMMENT_LINE	StAXInputSource 
