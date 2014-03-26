/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// Contibutors: "Luke Blanshard" <Luke@quiq.com> 	TokenNameCOMMENT_LINE	Contibutors: "Luke Blanshard" <Luke@quiq.com> 
// "Mark DONSZELMANN" <Mark.Donszelmann@cern.ch> 	TokenNameCOMMENT_LINE	"Mark DONSZELMANN" <Mark.Donszelmann@cern.ch> 
// "Muly Oved" <mulyoved@hotmail.com> 	TokenNameCOMMENT_LINE	"Muly Oved" <mulyoved@hotmail.com> 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
;	TokenNameSEMICOLON	
/** Use this class to quickly configure the package. <p>For file based configuration see {@link PropertyConfigurator}. For XML based configuration see {@link org.apache.log4j.xml.DOMConfigurator DOMConfigurator}. @since 0.8.1 @author Ceki G&uuml;lc&uuml; */	TokenNameCOMMENT_JAVADOC	 Use this class to quickly configure the package. <p>For file based configuration see {@link PropertyConfigurator}. For XML based configuration see {@link org.apache.log4j.xml.DOMConfigurator DOMConfigurator}. @since 0.8.1 @author Ceki G&uuml;lc&uuml; 
public	TokenNamepublic	
class	TokenNameclass	
BasicConfigurator	TokenNameIdentifier	 Basic Configurator
{	TokenNameLBRACE	
protected	TokenNameprotected	
BasicConfigurator	TokenNameIdentifier	 Basic Configurator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Add a {@link ConsoleAppender} that uses {@link PatternLayout} using the {@link PatternLayout#TTCC_CONVERSION_PATTERN} and prints to <code>System.out</code> to the root category. */	TokenNameCOMMENT_JAVADOC	 Add a {@link ConsoleAppender} that uses {@link PatternLayout} using the {@link PatternLayout#TTCC_CONVERSION_PATTERN} and prints to <code>System.out</code> to the root category. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
new	TokenNamenew	
ConsoleAppender	TokenNameIdentifier	 Console Appender
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
PatternLayout	TokenNameIdentifier	 Pattern Layout
.	TokenNameDOT	
TTCC_CONVERSION_PATTERN	TokenNameIdentifier	 TTCC  CONVERSION  PATTERN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Add <code>appender</code> to the root category. @param appender The appender to add to the root category. */	TokenNameCOMMENT_JAVADOC	 Add <code>appender</code> to the root category. @param appender The appender to add to the root category. 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
configure	TokenNameIdentifier	 configure
(	TokenNameLPAREN	
Appender	TokenNameIdentifier	 Appender
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Logger	TokenNameIdentifier	 Logger
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getRootLogger	TokenNameIdentifier	 get Root Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
appender	TokenNameIdentifier	 appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Reset the default hierarchy to its defaut. It is equivalent to calling <code>Category.getDefaultHierarchy().resetConfiguration()</code>. See {@link Hierarchy#resetConfiguration()} for more details. */	TokenNameCOMMENT_JAVADOC	 Reset the default hierarchy to its defaut. It is equivalent to calling <code>Category.getDefaultHierarchy().resetConfiguration()</code>. See {@link Hierarchy#resetConfiguration()} for more details. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogManager	TokenNameIdentifier	 Log Manager
.	TokenNameDOT	
resetConfiguration	TokenNameIdentifier	 reset Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
