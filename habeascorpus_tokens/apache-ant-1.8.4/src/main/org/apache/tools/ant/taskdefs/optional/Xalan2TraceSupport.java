/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TooManyListenersException	TokenNameIdentifier	 Too Many Listeners Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
XSLTProcess	TokenNameIdentifier	 XSLT Process
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
.	TokenNameDOT	
PrintTraceListener	TokenNameIdentifier	 Print Trace Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
;	TokenNameSEMICOLON	
/** * Sets up trace support for a given transformer. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Sets up trace support for a given transformer. * @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
Xalan2TraceSupport	TokenNameIdentifier	 Xalan2 Trace Support
implements	TokenNameimplements	
XSLTTraceSupport	TokenNameIdentifier	 XSLT Trace Support
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
configureTrace	TokenNameIdentifier	 configure Trace
(	TokenNameLPAREN	
Transformer	TokenNameIdentifier	 Transformer
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
XSLTProcess	TokenNameIdentifier	 XSLT Process
.	TokenNameDOT	
TraceConfiguration	TokenNameIdentifier	 Trace Configuration
conf	TokenNameIdentifier	 conf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
instanceof	TokenNameinstanceof	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
&&	TokenNameAND_AND	
conf	TokenNameIdentifier	 conf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PrintWriter	TokenNameIdentifier	 Print Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
getOutputStream	TokenNameIdentifier	 get Output Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintTraceListener	TokenNameIdentifier	 Print Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
new	TokenNamenew	
PrintTraceListener	TokenNameIdentifier	 Print Trace Listener
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
m_traceElements	TokenNameIdentifier	 m trace Elements
=	TokenNameEQUAL	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
getElements	TokenNameIdentifier	 get Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
m_traceExtension	TokenNameIdentifier	 m trace Extension
=	TokenNameEQUAL	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
getExtension	TokenNameIdentifier	 get Extension
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
m_traceGeneration	TokenNameIdentifier	 m trace Generation
=	TokenNameEQUAL	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
getGeneration	TokenNameIdentifier	 get Generation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
m_traceSelection	TokenNameIdentifier	 m trace Selection
=	TokenNameEQUAL	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
getSelection	TokenNameIdentifier	 get Selection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
m_traceTemplates	TokenNameIdentifier	 m trace Templates
=	TokenNameEQUAL	
conf	TokenNameIdentifier	 conf
.	TokenNameDOT	
getTemplates	TokenNameIdentifier	 get Templates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addTraceListener	TokenNameIdentifier	 add Trace Listener
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TooManyListenersException	TokenNameIdentifier	 Too Many Listeners Exception
tml	TokenNameIdentifier	 tml
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
tml	TokenNameIdentifier	 tml
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
