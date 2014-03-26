/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
examples	TokenNameIdentifier	 examples
.	TokenNameDOT	
subclass	TokenNameIdentifier	 subclass
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
examples	TokenNameIdentifier	 examples
.	TokenNameDOT	
customLevel	TokenNameIdentifier	 custom Level
.	TokenNameDOT	
XLevel	TokenNameIdentifier	 X Level
;	TokenNameSEMICOLON	
/** A simple example showing logger subclassing. <p>See <b><a href="doc-files/MyLogger.java">source code</a></b> for more details. <p>See {@link MyLoggerTest} for a usage example. */	TokenNameCOMMENT_JAVADOC	 A simple example showing logger subclassing. <p>See <b><a href="doc-files/MyLogger.java">source code</a></b> for more details. <p>See {@link MyLoggerTest} for a usage example. 
public	TokenNamepublic	
class	TokenNameclass	
MyLogger	TokenNameIdentifier	 My Logger
extends	TokenNameextends	
Logger	TokenNameIdentifier	 Logger
{	TokenNameLBRACE	
// It's usually a good idea to add a dot suffix to the fully 	TokenNameCOMMENT_LINE	It's usually a good idea to add a dot suffix to the fully 
// qualified class name. This makes caller localization to work 	TokenNameCOMMENT_LINE	qualified class name. This makes caller localization to work 
// properly even from classes that have almost the same fully 	TokenNameCOMMENT_LINE	properly even from classes that have almost the same fully 
// qualified class name as MyLogger, e.g. MyLoggerTest. 	TokenNameCOMMENT_LINE	qualified class name as MyLogger, e.g. MyLoggerTest. 
static	TokenNamestatic	
String	TokenNameIdentifier	 String
FQCN	TokenNameIdentifier	 FQCN
=	TokenNameEQUAL	
MyLogger	TokenNameIdentifier	 My Logger
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"."	TokenNameStringLiteral	.
;	TokenNameSEMICOLON	
// It's enough to instantiate a factory once and for all. 	TokenNameCOMMENT_LINE	It's enough to instantiate a factory once and for all. 
private	TokenNameprivate	
static	TokenNamestatic	
MyLoggerFactory	TokenNameIdentifier	 My Logger Factory
myFactory	TokenNameIdentifier	 my Factory
=	TokenNameEQUAL	
new	TokenNamenew	
MyLoggerFactory	TokenNameIdentifier	 My Logger Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Just calls the parent constuctor. */	TokenNameCOMMENT_JAVADOC	 Just calls the parent constuctor. 
public	TokenNamepublic	
MyLogger	TokenNameIdentifier	 My Logger
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Overrides the standard debug method by appending " world" at the end of each message. */	TokenNameCOMMENT_JAVADOC	 Overrides the standard debug method by appending " world" at the end of each message. 
public	TokenNamepublic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
+	TokenNamePLUS	
" world."	TokenNameStringLiteral	 world.
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method overrides {@link Logger#getLogger} by supplying its own factory type as a parameter. */	TokenNameCOMMENT_JAVADOC	 This method overrides {@link Logger#getLogger} by supplying its own factory type as a parameter. 
public	TokenNamepublic	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
myFactory	TokenNameIdentifier	 my Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
FQCN	TokenNameIdentifier	 FQCN
,	TokenNameCOMMA	
XLevel	TokenNameIdentifier	 X Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
