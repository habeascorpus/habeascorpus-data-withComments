/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
examples	TokenNameIdentifier	 examples
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
BasicConfigurator	TokenNameIdentifier	 Basic Configurator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
NDC	TokenNameIdentifier	 NDC
;	TokenNameSEMICOLON	
/** View the <a href="doc-files/Trivial.java">source code</a> of this a trivial usage example. Running <code>java examples.Trivial</code> should output something similar to: <pre> 0 INFO [main] examples.Trivial (Client #45890) - Awake awake. Put on thy strength. 15 DEBUG [main] examples.Trivial (Client #45890 DB) - Now king David was old. 278 INFO [main] examples.Trivial$InnerTrivial (Client #45890) - Entered foo. 293 INFO [main] examples.Trivial (Client #45890) - Exiting Trivial. </pre> <p> The increasing numbers at the beginning of each line are the times elapsed since the start of the program. The string between the parentheses is the nested diagnostic context. <p>See {@link Sort} and {@link SortAlgo} for sligtly more elaborate examples. <p>Note thent class files for the example code is not included in any of the distributed log4j jar files. You will have to add the directory <code>/dir-where-you-unpacked-log4j/classes</code> to your classpath before trying out the examples. */	TokenNameCOMMENT_JAVADOC	 View the <a href="doc-files/Trivial.java">source code</a> of this a trivial usage example. Running <code>java examples.Trivial</code> should output something similar to: <pre> 0 INFO [main] examples.Trivial (Client #45890) - Awake awake. Put on thy strength. 15 DEBUG [main] examples.Trivial (Client #45890 DB) - Now king David was old. 278 INFO [main] examples.Trivial$InnerTrivial (Client #45890) - Entered foo. 293 INFO [main] examples.Trivial (Client #45890) - Exiting Trivial. </pre> <p> The increasing numbers at the beginning of each line are the times elapsed since the start of the program. The string between the parentheses is the nested diagnostic context. <p>See {@link Sort} and {@link SortAlgo} for sligtly more elaborate examples. <p>Note thent class files for the example code is not included in any of the distributed log4j jar files. You will have to add the directory <code>/dir-where-you-unpacked-log4j/classes</code> to your classpath before trying out the examples. 
public	TokenNamepublic	
class	TokenNameclass	
Trivial	TokenNameIdentifier	 Trivial
{	TokenNameLBRACE	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
Trivial	TokenNameIdentifier	 Trivial
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BasicConfigurator	TokenNameIdentifier	 Basic Configurator
.	TokenNameDOT	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"Client #45890"	TokenNameStringLiteral	Client #45890
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Awake awake. Put on thy strength."	TokenNameStringLiteral	Awake awake. Put on thy strength.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Trivial	TokenNameIdentifier	 Trivial
.	TokenNameDOT	
foo	TokenNameIdentifier	 foo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InnerTrivial	TokenNameIdentifier	 Inner Trivial
.	TokenNameDOT	
foo	TokenNameIdentifier	 foo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Exiting Trivial."	TokenNameStringLiteral	Exiting Trivial.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
void	TokenNamevoid	
foo	TokenNameIdentifier	 foo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
"DB"	TokenNameStringLiteral	DB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Now king David was old."	TokenNameStringLiteral	Now king David was old.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NDC	TokenNameIdentifier	 NDC
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
InnerTrivial	TokenNameIdentifier	 Inner Trivial
{	TokenNameLBRACE	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
InnerTrivial	TokenNameIdentifier	 Inner Trivial
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
void	TokenNamevoid	
foo	TokenNameIdentifier	 foo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Entered foo."	TokenNameStringLiteral	Entered foo.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
